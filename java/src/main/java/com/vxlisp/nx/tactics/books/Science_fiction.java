package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Science_fiction {

  /**
   * @function chapter_alien___predator
   * @return {chapter}
   * (func chapter_alien___predator)
   */
  public static interface Func_chapter_alien___predator extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_alien___predator();
  }

  public static class Class_chapter_alien___predator extends Core.Class_base implements Func_chapter_alien___predator {

    @Override
    public Func_chapter_alien___predator vx_new(Object... vals) {
      Class_chapter_alien___predator output = new Class_chapter_alien___predator();
      return output;
    }

    @Override
    public Func_chapter_alien___predator vx_copy(Object... vals) {
      Class_chapter_alien___predator output = new Class_chapter_alien___predator();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_alien___predator", // name
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
    public Func_chapter_alien___predator vx_empty() {return e_chapter_alien___predator;}
    @Override
    public Func_chapter_alien___predator vx_type() {return t_chapter_alien___predator;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_alien___predator();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_alien___predator() {
      return Science_fiction.f_chapter_alien___predator();
    }

  }

  public static final Func_chapter_alien___predator e_chapter_alien___predator = new Science_fiction.Class_chapter_alien___predator();
  public static final Func_chapter_alien___predator t_chapter_alien___predator = new Science_fiction.Class_chapter_alien___predator();

  public static Base.Type_chapter f_chapter_alien___predator() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Alien / Predator"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("AlienPredator/AlienPredator.jpg"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Alien Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alien Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alien Egg"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Egg"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Alien_Egg.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Who's laying these eggs?  I'm not sure. It must be something we haven't seen yet.  Ripley and Bishop, Aliens")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alien Starship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Starship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/AlienShip.png"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("43m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("174m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("117m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Aliens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Aliens"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* It'll be dark soon, and they mostly come at night... mostly. - Newt, Aliens\n* My mommy always said there were no monsters - no real ones - but there are.\n* Its structural perfection is matched only by its hostility.  You admire it.  I admire its purity. A survivor... unclouded by conscience, remorse, or delusions of morality. - Ash and Lambert, Alien"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Xenomorph XX121"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alien Chest Burster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Chest Burster"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Alien_ChestBurster.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
                    Core.vx_new_string("Alien (Dog)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien (Dog)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Alien_Dog.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
                    Core.vx_new_string("Alien Face Hugger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Face Hugger"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/AlienFaceHugger.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I haven't seen anything like that except, uh, molecular acid.  It must be using it for blood.  It's got a\nwonderful defense mechanism.  You don't dare kill it. - Parker and Brett, Alien"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
                    Core.vx_new_string("Alien Queen"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Queen"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Alien_Queen.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Get away from her, you BITCH! - Ripley, Aliens"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
                    Core.vx_new_string("Alien Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alien Warrior"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Alien_Warrior.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
                    Core.vx_new_string(":Predalien"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predalien"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Predalien.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acidic"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acidic"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Acid Blood"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acid Blood")
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
            Core.vx_new_string("Predator Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Predator Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Plasma Caster"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plasma Caster"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorPlasmaCaster.jpg")
                      )
                    ),
                    Core.vx_new_string("Predator Claws"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Claws"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorClaws.jpg")
                      )
                    ),
                    Core.vx_new_string("Predator Disc"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Disc"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorDisc.gif")
                      )
                    ),
                    Core.vx_new_string("Predator Smartgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Smartgun"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorSmartgun.jpg")
                      )
                    ),
                    Core.vx_new_string("Predator Stealthsuit"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Stealthsuit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorStealth.jpg")
                      )
                    ),
                    Core.vx_new_string("Predator Vision"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Vision"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/PredatorVision.jpg")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Predator Scout Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Scout Ship")
                      )
                    ),
                    Core.vx_new_string("Predator Hunting Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Predator Hunting Ship")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Predators"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Predators"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Yautja do not maintain a unified society, but instead live in tribal groups that rarely interbreed. Over time, the different tribes have developed distinct physical differences.\n* Yautja society reveres honor and physical prowess which can only be proven in personal combat during dangerous hunts.\n* The Yautja stalk and kill their prey using a combination of highly advanced technology, such as active camouflage and energy weapons, combined with comparatively primitive traditional weapons, such as blades, spears and nets. The Predators often ritualistically mutilate their prey and usually claim a trophy from their kills. Capable of interstellar travel in star ships, the Predators have hunted on Earth for centuries and have also had prior contact with the Engineers.\n* Aside from their repeated conflicts with humans, the Predators have notably been associated with Xenomorph XX121, known to them as kiande amedha ('hard meat'), whom they revere as perhaps the most worthy of all prey. They have been known to deliberately breed the creatures from captive Queens in order to hunt them, often as part of initiation rituals for young Predators."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Yautja"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Un-blooded Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Un-blooded Predator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The lowest level of Yautja warriors. These are warriors in training. Many die during this brutal training regiment designed to cull the weak.")
                      )
                    ),
                    Core.vx_new_string("Young Blood Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Young Blood Predator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Yautja warrior who has completed their training. These warriors await their final test, killing a Xenomorph close range primitive weapons.")
                      )
                    ),
                    Core.vx_new_string("Blooded Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blooded Predator"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Predator.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* After killing a Xenomorph, the Predator a full citizen of Yautja society and is allowed access to the Plasma Cannon and other advanced weaponry and spacecraft. A Blooded Predator may join hunts with others or go off on their own to bring back stories, honor, treasure, and trophies.")
                      )
                    ),
                    Core.vx_new_string("Elite Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elite Predator"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("AlienPredator/Predator_Veteran.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A Yautja warrior who has survived many dangerous hunts is raised to elite status. These Yautja have vast fighting skills and can fight many enemies single-handed.")
                      )
                    ),
                    Core.vx_new_string("Elder Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elder Predator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Older Elite Predators can be given the honorific of Elder. Elder Predators form the political and administrative caste of Yautja society.")
                      )
                    ),
                    Core.vx_new_string("Clan Leader Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clan Leader Predator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Clan Leaders direct all Predator business and travel on Predator Flagships. Elder Predators may challenge the Clan Leader to take their position.")
                      )
                    ),
                    Core.vx_new_string("Bad Blood Predator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bad Blood Predator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Bad Bloods are Predators who severely violated their code of honor and were either banished or escaped from their clan. Sometimes the Bad Bloods become the target of a hunt to make an example of them.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Human Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Human Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Combat Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combat Armor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/CombatArmor.jpg")
                      )
                    ),
                    Core.vx_new_string("VP70Mk9 Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("VP70Mk9 Pistol"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/HK_VP70.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("18 round 9mm pistol.")
                      )
                    ),
                    Core.vx_new_string("M41A Pulse Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M41A Pulse Rifle"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/M41a01.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("That's the grenade launcher. I don't think you want to mess with that. - Hicks, Aliens")
                      )
                    ),
                    Core.vx_new_string("Ithaca Model 37 Shotgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ithaca Model 37 Shotgun"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Ithaca37Stakeout.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Triva: The one used by Corporal Hicks was passed from father to son all the way back to marines in the Vietnam War."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("4 round 12-gauge sporting shotgun produced from 1937.  Aka Stakeout.")
                      )
                    ),
                    Core.vx_new_string("M240 Flamethrower"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M240 Flamethrower"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/M240Flamethrower.jpg")
                      )
                    ),
                    Core.vx_new_string("M56 Smartgun MG"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M56 Smartgun MG"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/M56Smartgun.jpg")
                      )
                    ),
                    Core.vx_new_string("CN-20 Nervergas"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("CN-20 Nervergas"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/CN-20Nervegas.jpg")
                      )
                    ),
                    Core.vx_new_string("Motion Tracker"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Motion Tracker"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/MotionTracker.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("There's somethin' movin' and it ain't us! Tracker's off scale, man. They're all around us! - Hudson, Aliens")
                      )
                    ),
                    Core.vx_new_string("Electronics Pack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electronics Pack"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Hudson, run a bypass. - Apone, Aliens")
                      )
                    ),
                    Core.vx_new_string(":Welder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Welder"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Welder.jpg")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Human Vehciles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Human Vehciles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("UD-4L Cheyenne Dropship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UD-4L Cheyenne Dropship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Dropship.png"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("13m")
                      )
                    ),
                    Core.vx_new_string("M577 Armored Personnel Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("M577 Armored Personnel Carrier"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/APC.png"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("3m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("9m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("3m")
                      )
                    ),
                    Core.vx_new_string("Conestoga Class Starship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Conestoga Class Starship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Sulaco.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Speed: .5G cruising 4G Max\nFTL: 1.762 light years/day\n2 Dropships\nhttp://www.kitsune.addr.com/SF-Conversions/Rifts-Other-Vehicles/USS_Sulaco.htm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("USS Sulaco"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("85ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("105m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("385m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("77m"),
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
                                Core.vx_new_string("* The Conestogas skin consists of a laminated layer of insulators, alloy micro meteor shielding, composite armors, and aerogel layers. This provides only limited protection against Kinetic weapons (the best defense against those is high-mass armor, untenable on a starship), but it does provide excellent protection against directed energy weapons.\n* Overlying all of this are layers of Radar Absorbent Material, and a dark grey paint, in order to keep both the ships radar and optical signature as low as possible. In addition to this the ship has a radar jamming system for ECM, and the computer systems are designed with double hardened systems to prevent either jamming or EMP from damaging the ships system or any systems of equipment inside the ship.")
                              )
                            ),
                            Core.vx_new_string(":Hanger"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hanger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("20ktons Cargo")
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
                                Core.vx_new_string("* Its main anti-ship weapons are eight Long Lance missiles, providing it with a good long range punch. These missiles are almost small starships in their capabilities and sensor systems, and are currently the main anti-ship system of both the Colonial Marine Corps and the Navy. Backing up these weapons are two Neutral Particle Beam cannons. These large weapons are mounted along the main hull, and can only fire in a forward arc. Although they do not provide the ship with a Hard Kill capability, they can be used to disrupt a enemies electronics at huge ranges. For close range weapons there are two laser cannons located on either side of the ship. These cannons provide close in defense against missiles, mines, and the odd fighter. For some additional close in Hard Kill capabilities there are two rail guns on the ship, one on top, and the other on the bottom of the main hull. Firing a combination of both kinetic penetrators (essentially tungsten darts) which can punch holes through almost any armor, and kinetic penetrator incendiary (tungsten tipped darts designed to vaporize AFTER impact), these weapons have a reasonable rate of fire, and can do quite a lot of damage to other ships.\n* The ship is also capable of laying mines, with sixty mines available in a ventral dispenser. Although not as large a threat to enemy ships as the ships missiles, they are still quite effective for interdiction and for cutting off civilian shipping.\n* For orbital bombardment the ship has a ventral launcher filled with eighty re-entry vehicles. These can carry a variety of warheads, including nuclear payloads. Such ordnance can only be used when the ship receives the orders to do so from its Captain, or from a Marine Major or personnel higher in rank than that.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Nostromo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nostromo"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Nostromo.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("This a commercial ship, not a rescue ship. - Parker, Alien"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Commercial Towing Vehicle\nSpeed: .12 light years/day\n2 shuttlecraft"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("72m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("244m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("165m")
                      )
                    ),
                    Core.vx_new_string("Refinery Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Refinery Ship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Refinery.png"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("881m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("1500m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("979m")
                      )
                    ),
                    Core.vx_new_string("Lockmart Starcub Shuttlecraft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lockmart Starcub Shuttlecraft"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Shuttlecraft.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Narcisssus"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("8m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("16m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("20m")
                      )
                    )
                  )
                )
              )
            ),
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
                    Core.vx_new_string("Company Man"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Company Man"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I work for the company. But don't let that fool you, I'm really an okay guy. - Burke, Aliens\n* This installation has a substantial dollar value attached to it. They can bill me. - Burke and Ripley, Aliens\n* If I went and made a major security situation out of it, everybody steps in; Administration steps in, and there's no exclusive rights for anybody, nobody wins! So I made a decision, and it was... wrong. It was a bad call, Ripley. It was a bad call. - Burke, Aliens")
                      )
                    ),
                    Core.vx_new_string(":Civilian"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Civilian")
                      )
                    ),
                    Core.vx_new_string("Marine Grunt"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Grunt"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Marine.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* These people are here to protect you. They're soldiers. It won't make any difference. - Ripley and Newt, Aliens\n* Is this gonna be a standup fight, sir, or another bughunt? - Hudson, Aliens\n* He can't make that kind of decision, he's just a grunt! Ah, no offense. None taken. - Burke and Hicks, Aliens"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Pulse Rifle\n* Shotgun")
                      )
                    ),
                    Core.vx_new_string("Marine Heavy Weapons"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Heavy Weapons"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Look, man. I only need to know one thing: where they are. - Vasquez, Aliens")
                      )
                    ),
                    Core.vx_new_string("Marine Lieutenant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Lieutenant"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* How many drops is this for you, Lieutenant? Thirty eight... simulated. How many *combat* drops? Uh,\ntwo. Including this one. - Vasquez and Gorman, Aliens")
                      )
                    ),
                    Core.vx_new_string("Marine Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Pilot"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* We're in the pipe, five by five. - Ferro, Aliens")
                      )
                    ),
                    Core.vx_new_string("Marine Sergeant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Sergeant"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Another glorious day in the Corps! A day in the Corps is like a day on the farm. Every meal's a banquet! Every paycheck a fortune! Every formation a parade! I LOVE the Corps! - Apone, Aliens")
                      )
                    ),
                    Core.vx_new_string("Marine Tech"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marine Tech"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Motion Detector\n* Electronics Pack")
                      )
                    ),
                    Core.vx_new_string("Power Loader"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Loader"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/PowerLoader.png")
                      )
                    ),
                    Core.vx_new_string("Sentry Turret"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sentry Turret"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/SentryTurret.png")
                      )
                    ),
                    Core.vx_new_string(":Synthetic"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Synthetic"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("ColonialMarines/Android.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Bring back life form. Priority One. All other priorities rescinded. The damn company. What about our lives, you son of a bitch? I repeat, all other priorities are rescinded. - Ash and Parker, Alien\n* I admire its purity. A survivor... unclouded by conscience, remorse, or delusions of morality. - Ash, Alien\n* I prefer the term 'Artificial Person' myself. - Bishop, Aliens\n* Not bad for a human. - Bishop, Aliens\n* Ripley's last trip out, the syn- the artificial person malfunctioned. Malfuctioned? There were problems and a-a few deaths were involved. - Burke and Bishop, Aliens"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Syn (derogatory)")
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
   * @function chapter_alternate_realties
   * @return {chapter}
   * (func chapter_alternate_realties)
   */
  public static interface Func_chapter_alternate_realties extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_alternate_realties();
  }

  public static class Class_chapter_alternate_realties extends Core.Class_base implements Func_chapter_alternate_realties {

    @Override
    public Func_chapter_alternate_realties vx_new(Object... vals) {
      Class_chapter_alternate_realties output = new Class_chapter_alternate_realties();
      return output;
    }

    @Override
    public Func_chapter_alternate_realties vx_copy(Object... vals) {
      Class_chapter_alternate_realties output = new Class_chapter_alternate_realties();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_alternate_realties", // name
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
    public Func_chapter_alternate_realties vx_empty() {return e_chapter_alternate_realties;}
    @Override
    public Func_chapter_alternate_realties vx_type() {return t_chapter_alternate_realties;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_alternate_realties();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_alternate_realties() {
      return Science_fiction.f_chapter_alternate_realties();
    }

  }

  public static final Func_chapter_alternate_realties e_chapter_alternate_realties = new Science_fiction.Class_chapter_alternate_realties();
  public static final Func_chapter_alternate_realties t_chapter_alternate_realties = new Science_fiction.Class_chapter_alternate_realties();

  public static Base.Type_chapter f_chapter_alternate_realties() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Alternate Realties"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Big Brother"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Big Brother"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A near future Earth where all activity is monitored by cameras and microphones placed everywhere including bedrooms, bathrooms, and sewers. They cover multiple angles and are nearly impossible to avoid. Computers monitor the feeds and immediately report any criminal activity to police. The police arrest the criminal, conviction is swift, and the criminal is psychologically or chemically 'reconditioned' against further crimes and returned to society. Crime is basically non-existent, and no one remembers a time before the monitoring 	was established. Police are friendly and do not appear in uniform unless a crime has been committed. Police only carry non-lethal weapons unless they are known to be facing armed resistance.\n* Any outsiders entering this world will have a hard time avoiding criminal activity. Fortunately, the computers are unconcerned with suspicious activity and only notice actual crimes. However, attempts to disable cameras are crimes themselves.\n* Interrogations and reconditioning are all computer controlled. Using sophiticated lie detectors, drugs, and aversion therapy, the patient can usually be reconditioned and returned to society in a matter of weeks.\n* A small resistance exists, but there is little they can achieve without outside help. The question is: should they be helped?")
              )
            ),
            Core.vx_new_string("Time in a Bottle"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Time in a Bottle"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* If I could save time in a bottle, the first that I'd like to do, is to save every day 'til eternity passes away, just to spend them with you. - Time in a bottle, Jim Croce"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A temporal paradox has trapped the entire Earth in a time loop. For about a month, the people of the planet relive the same week over and over. They remember each loop but the longer they stay in the loop the more likely they are to be compelled to repeat the same events each time. Those who suffer or die during the period know they will repeat their actions but are largely powerless to stop themselves. The experience would eventually drive them insane if their minds could change that much.\n* Time travelers who arrive are immediately recognized by everyone as being different from the previous events. The locals are tremendously thankful that they can react differently since the travelers weren't in the previous time loops. This will be short lived, however, because once the loop resets the time travelers will be part of the loop, and each time the loop resets it will become harder for everyone to act differently again. If the travelers don't sort out this problem, they will be trapped here forever.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_archetypes
   * @return {chapter}
   * (func chapter_archetypes)
   */
  public static interface Func_chapter_archetypes extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_archetypes();
  }

  public static class Class_chapter_archetypes extends Core.Class_base implements Func_chapter_archetypes {

    @Override
    public Func_chapter_archetypes vx_new(Object... vals) {
      Class_chapter_archetypes output = new Class_chapter_archetypes();
      return output;
    }

    @Override
    public Func_chapter_archetypes vx_copy(Object... vals) {
      Class_chapter_archetypes output = new Class_chapter_archetypes();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_archetypes", // name
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
    public Func_chapter_archetypes vx_empty() {return e_chapter_archetypes;}
    @Override
    public Func_chapter_archetypes vx_type() {return t_chapter_archetypes;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_archetypes();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_archetypes() {
      return Science_fiction.f_chapter_archetypes();
    }

  }

  public static final Func_chapter_archetypes e_chapter_archetypes = new Science_fiction.Class_chapter_archetypes();
  public static final Func_chapter_archetypes t_chapter_archetypes = new Science_fiction.Class_chapter_archetypes();

  public static Base.Type_chapter f_chapter_archetypes() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Archetypes"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Psionic\n** Preferred Skills: [Telepathy], [Mind Over Matter], [Divination]")
      )
    );
    return output;
  }

  /**
   * @function chapter_battlestar_galactica
   * @return {chapter}
   * (func chapter_battlestar_galactica)
   */
  public static interface Func_chapter_battlestar_galactica extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_battlestar_galactica();
  }

  public static class Class_chapter_battlestar_galactica extends Core.Class_base implements Func_chapter_battlestar_galactica {

    @Override
    public Func_chapter_battlestar_galactica vx_new(Object... vals) {
      Class_chapter_battlestar_galactica output = new Class_chapter_battlestar_galactica();
      return output;
    }

    @Override
    public Func_chapter_battlestar_galactica vx_copy(Object... vals) {
      Class_chapter_battlestar_galactica output = new Class_chapter_battlestar_galactica();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_battlestar_galactica", // name
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
    public Func_chapter_battlestar_galactica vx_empty() {return e_chapter_battlestar_galactica;}
    @Override
    public Func_chapter_battlestar_galactica vx_type() {return t_chapter_battlestar_galactica;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_battlestar_galactica();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_battlestar_galactica() {
      return Science_fiction.f_chapter_battlestar_galactica();
    }

  }

  public static final Func_chapter_battlestar_galactica e_chapter_battlestar_galactica = new Science_fiction.Class_chapter_battlestar_galactica();
  public static final Func_chapter_battlestar_galactica t_chapter_battlestar_galactica = new Science_fiction.Class_chapter_battlestar_galactica();

  public static Base.Type_chapter f_chapter_battlestar_galactica() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Battlestar Galactica"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Battlestar Colonials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Battlestar Colonials"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Colonial Raptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Colonial Raptor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Colonial_Raptor.png")
                      )
                    ),
                    Core.vx_new_string("Colonial Viper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Colonial Viper"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Colonial_Viper.png")
                      )
                    ),
                    Core.vx_new_string("Colonial Battlestar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Colonial Battlestar"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Colonial_Battlestar.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Cylons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cylons"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cylon 6"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cylon 6"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Cylon_6.png")
                      )
                    ),
                    Core.vx_new_string("Cylon Centurion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cylon Centurion"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Cylon_Centurion.png")
                      )
                    ),
                    Core.vx_new_string("Cylon Raider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cylon Raider"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Cylon_Raider.png")
                      )
                    ),
                    Core.vx_new_string("Cylon Base Star"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cylon Base Star"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("BattlestarGalactica/Cylon_BaseStar.png")
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
   * @function chapter_doctor_who
   * @return {chapter}
   * (func chapter_doctor_who)
   */
  public static interface Func_chapter_doctor_who extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_doctor_who();
  }

  public static class Class_chapter_doctor_who extends Core.Class_base implements Func_chapter_doctor_who {

    @Override
    public Func_chapter_doctor_who vx_new(Object... vals) {
      Class_chapter_doctor_who output = new Class_chapter_doctor_who();
      return output;
    }

    @Override
    public Func_chapter_doctor_who vx_copy(Object... vals) {
      Class_chapter_doctor_who output = new Class_chapter_doctor_who();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_doctor_who", // name
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
    public Func_chapter_doctor_who vx_empty() {return e_chapter_doctor_who;}
    @Override
    public Func_chapter_doctor_who vx_type() {return t_chapter_doctor_who;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_doctor_who();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_doctor_who() {
      return Science_fiction.f_chapter_doctor_who();
    }

  }

  public static final Func_chapter_doctor_who e_chapter_doctor_who = new Science_fiction.Class_chapter_doctor_who();
  public static final Func_chapter_doctor_who t_chapter_doctor_who = new Science_fiction.Class_chapter_doctor_who();

  public static Base.Type_chapter f_chapter_doctor_who() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Doctor Who"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Doctor Who Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Doctor Who Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Psychic Paper"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Psychic Paper"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/PsychicPaper.jpg")
                      )
                    ),
                    Core.vx_new_string("Sonic Screwdriver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sonic Screwdriver"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/SonicScrewdriver.jpg")
                      )
                    ),
                    Core.vx_new_string(":TARDIS"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("TARDIS"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Tardis.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Leela: Explain to me how this... Tardis, is larger on the inside than the out. ... Doctor: It's because insides and outsides are not in the same dimension. Which box is larget? Leela: That one. Doctor: Now which is larger? Leela: That one. Doctor: But it looks smaller. Leela: That's because it's further away. Doctor: Exactly. If you could keep that exactly that distance away and have it here, the large one would fit inside the small one. Leela: That's silly. Doctor: That's transdimensional engineering... - Doctor and Leela, The Robots of Death\n* Leela: Do you mean you can't control it? Doctor: Of course I can control it!.. 9 times out of 10, well 7 times out of 10, 5 times... nevermind... You won't need that. Leela: How do you know? Doctor: I never carry weapons. If people see you mean them no harm, they never hurt you... 9 out of 10 times. - Doctor and Leela, The Robots of Death\n* Tardis: There's a sign on my front door and you've been passing it for 700 years. What does it say? ... Doctor: Pull to open. Tardis: Yes, and what do you do? Doctor: I push. Tardis: Every single time. 700 years. Police boxes doors open out the way. ... Doctor: You know, YOU, have never been very reliable. ... You didn't always take me where I wanted to go. Tardis: No, but I always took you where you needed to go. - Tardis and Doctor, The Doctor's Wife")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Doctor Who Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Doctor Who Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Amy Pond"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amy Pond")
                      )
                    ),
                    Core.vx_new_string("Captain Jack Harkness"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Captain Jack Harkness"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/CaptainJackHarkness.png"),
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
                                    ),
                                    Core.vx_new_string("True Immortality"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("True Immortality")
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
                    Core.vx_new_string("Clara Oswald"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clara Oswald"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Clara: Have we just watched the entire life cycle of Earth, birth to death. Doctor: Yes. Clara: And you're okay with that? Doctor: ... Yes. Clara: How can you be? ... To you, I haven't been born yet, and to you I've been dead a hundred billion years. Is my body out there somewhere, in the ground? Doctor: ... Yes... I suppose it is. Clara: But hear we are talking, so I am a ghost. To you, I'm a ghost. We're all ghost to you. We must be nothing. Doctor: No, no. You're not that. Never that. Clara: They what are we? What can we possible be? Doctor: You are the only mystery, worth solving.")
                      )
                    ),
                    Core.vx_new_string(":Cyberman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyberman"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Cyberman.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("We have 5 million Cybermen. How many are you? Four! You would destroy the Cybermen with 4 Daleks? We would destroy the Cybermen with 1 Dalek! You are superior to us in only one respect. You are better at dying! - Cybermen and Daleks")
                      )
                    ),
                    Core.vx_new_string(":Dalek"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dalek"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Dalek.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Imagine you were dying. Imagine you were afraid and a long way from home and in terrible pain. And just when you thought it couldn't get worse, you looked up and saw the face of the devil himself. Hello Dalek - The Doctor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The Daleks odd form may be explained by their personal shielding. Weapons and sensors are placed on stalks so that they may protrude from the shield. This prevents their shield from interfering with their equipment, but it also leaves these devices vulnerable."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Davros"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Davros"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Davros.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* To hold in my hand a capsule that contained such power...To know that the tiny pressure of my thumb, enough to break the glass would end...everything...Yes...I WOULD do it. Such power would put me above the Gods! - Davros\n* Across the entire universe, never stopping, never faltering, never fading. People, planets, and stars will become dust, and the dust will become atoms, and the atoms will become...nothing. Into every dimension, every parallel, every single corner of creation. This is my ultimate victory, Doctor: the destruction of reality... itself! - Davros\n* The man who abhors violence, never carrying a gun.  But this is the truth Doctor, you take ordinary people and\nfashion them into weapons...How many more?  Just think how many have died in your name...The Doctor, the man\nwho keeps running, never looking back because he dare not out of shame.  This is my final victory, Doctor.  I\nhave shown you...yourself. - Davros")
                      )
                    ),
                    Core.vx_new_string("Doctor, The"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Doctor, The"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/TheDoctor.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Who are you? ... The ground beneath our feet spinning at a 1000 miles an\nhour, and the entire planet is hurtling around the sun at 67,000 miles an hour,\nand I can feel it.  We're falling through space, you and me, clinging to the\nskin of this tiny little world, and if we let go ... That's who I am.  Now\nforget me. - Rose and The Doctor\n* Oh, I'll think of something.  You're just making this up as you go along.\nYup...but I do it brilliantly - The Doctor\n* I've seen him. He's like fire and ice and rage. He's like the night and the\nstorm and the heart of the sun. He's ancient and forever. He burns at the\ncenter of time and he can see the turn of the universe.\n* Is this world protected?  You're not the first lot to have come here.  Oh,\nthere have been so many.  And what you've got to ask is...what happened to\nthem?  Hello, I'm the Doctor.  Basically...run. - The Doctor\n* Everyone's got memories of a holiday they couldn't have be to, or a party\nthey never went to, or met someone for the first time and felt like they've\nknow them all their lives. Time is being rewritten all around us, everyday.\nPeople think their memories are bad, but their memories are fine. The past is\nreally like that. - The Doctor\n* There are laws of time and once upon a time, there were people in charge of\nthose laws, but died. They all died. They all died. And you know who that\nleaves. Me! It has taken me all these years to realize, the laws of time are\nmine. And they will obey me! ... The whole of history could change...the\nfuture of the human race. No one should have that much power. Tough. ... For a\nlong time I thought I was just a survivor, but I'm not. I'm the winner. That's\nwho I am. The Time Lord Victorious. And there is no one to stop you. No. This\nis wrong, Doctor. I don't care who you are. The Time Lord Victorious is wrong!\nThat's for me to decide. ... Is there nothing you can't do? Not anymore.\n- Captain Aldelede and The Doctor\n* Silence will fall when the question is asked...The first question, the\nquestion that must never be answered, hidden in plain sight, the question\nyou've been running from all your life...Doctor WHO?\n* If I run away today. Good people will die. If I stand and fight, some of them\nmight live. Maybe not many. Maybe not for long. Hey, maybe there's no point in\nany of this at all, but its the best I can do. So, I'm going to do it, and I will\nstand here doing it until it kills em. You're going to die too. Someday. What\nwould that be? Have you thought of that? Would you die for? Who I am is where\nI stand. Where I stand... is where I fall. Stand with me. - Doctor and Masters.\n* People always get it wrong with Time Lords. We take forever to die. Even if we are too injured to regenerate, every cell in our bodies keeps trying. Dying properly can take days. That's why we like to die among our own kind. They know not to bury us early. I think... In my current condition, it'll take me about... a day and a half to reach the top of the tower. I think, if I'm lucky, I have a day and a half. - Heaven Sent")
                      )
                    ),
                    Core.vx_new_string(":K-9"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("K-9"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/K9.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Doctor likes traveling with an entourage. Sometimes they're human, sometimes they're aliens and sometimes they're tin dogs. What about you? Where do you fit in the picture? Me? I'm their man in Havana. I'm their technical support. I'm... Oh my god. I'm the tin dog! - Sarah Jane Smith and Mickey Smith")
                      )
                    ),
                    Core.vx_new_string("Martha Jones"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Martha Jones"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/MarthaJones.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("She completely adored him ... Is this going anywhere?  Yes.  Cause he never looked at her twice ... and she wasted years of her life ... and I told her time and time again.  Get out.  So this is me getting out. - Martha Jones and the Doctor")
                      )
                    ),
                    Core.vx_new_string("Master, The"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Master, The"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/TheMaster.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* We stand there... 8 years old... staring at the raw power of time and space, just a child.  Some would be inspired... Some would run away ... and some would go mad.  What about you?  Oh, the one who ran away.  I never stopped. - The Doctor and Martha\n* And so it came to pass, that the human race fell and the Earth was no more. And I looked out on my new Dominion as master of all and I thought it good.")
                      )
                    ),
                    Core.vx_new_string("Rose Tyler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rose Tyler"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/RoseTyler.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("This is really seeing the future - you just leave us behind! ... Sarah Jane - you were that close to her once, and now ... you never even mention her. ... I don't age. I regenerate. But humans decay.  You wither and you die. Imagine watching that happen to someone you ... You can spend the rest of your life with me. But I can't spend the rest of mine with you. I have to live on, alone. That's the curse of the Timelords. - Rose and the Doctor, Doctor Who")
                      )
                    ),
                    Core.vx_new_string("Sarah Jane Smith"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sarah Jane Smith"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/SarahJaneSmith.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The universe has to move forward. Pain and loss, they define us as much as happiness or love. Whether it's a world, or a relationship ... Everything has its time.  And everything ends. - Sarah Jane Smith")
                      )
                    ),
                    Core.vx_new_string(":Rutan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rutan"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Rutan.png")
                      )
                    ),
                    Core.vx_new_string(":Sontaran"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sontaran"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/Sontaran.png")
                      )
                    ),
                    Core.vx_new_string("Sontaran Scout Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sontaran Scout Ship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DrWho/SontaranScoutShip.png")
                      )
                    ),
                    Core.vx_new_string(":Sutekh"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sutekh"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* You would use your powers for evil. Evil? Your evil is my good. I am Sutehk the Destroyer. Where I tread, I leave nothing but dust and darkness. I find that good. - The Doctor and Sutekh"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sutekh the Destroyer")
                      )
                    ),
                    Core.vx_new_string("Weeping Angel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weeping Angel")
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
   * @function chapter_robotech
   * @return {chapter}
   * (func chapter_robotech)
   */
  public static interface Func_chapter_robotech extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_robotech();
  }

  public static class Class_chapter_robotech extends Core.Class_base implements Func_chapter_robotech {

    @Override
    public Func_chapter_robotech vx_new(Object... vals) {
      Class_chapter_robotech output = new Class_chapter_robotech();
      return output;
    }

    @Override
    public Func_chapter_robotech vx_copy(Object... vals) {
      Class_chapter_robotech output = new Class_chapter_robotech();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_robotech", // name
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
    public Func_chapter_robotech vx_empty() {return e_chapter_robotech;}
    @Override
    public Func_chapter_robotech vx_type() {return t_chapter_robotech;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_robotech();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_robotech() {
      return Science_fiction.f_chapter_robotech();
    }

  }

  public static final Func_chapter_robotech e_chapter_robotech = new Science_fiction.Class_chapter_robotech();
  public static final Func_chapter_robotech t_chapter_robotech = new Science_fiction.Class_chapter_robotech();

  public static Base.Type_chapter f_chapter_robotech() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Robotech"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Invid"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Invid")
              )
            ),
            Core.vx_new_string(":Masters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Masters")
              )
            ),
            Core.vx_new_string(":Zentradi"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Zentradi")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_science_fiction_overview
   * @return {chapter}
   * (func chapter_science_fiction_overview)
   */
  public static interface Func_chapter_science_fiction_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_science_fiction_overview();
  }

  public static class Class_chapter_science_fiction_overview extends Core.Class_base implements Func_chapter_science_fiction_overview {

    @Override
    public Func_chapter_science_fiction_overview vx_new(Object... vals) {
      Class_chapter_science_fiction_overview output = new Class_chapter_science_fiction_overview();
      return output;
    }

    @Override
    public Func_chapter_science_fiction_overview vx_copy(Object... vals) {
      Class_chapter_science_fiction_overview output = new Class_chapter_science_fiction_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_science_fiction_overview", // name
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
    public Func_chapter_science_fiction_overview vx_empty() {return e_chapter_science_fiction_overview;}
    @Override
    public Func_chapter_science_fiction_overview vx_type() {return t_chapter_science_fiction_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_science_fiction_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_science_fiction_overview() {
      return Science_fiction.f_chapter_science_fiction_overview();
    }

  }

  public static final Func_chapter_science_fiction_overview e_chapter_science_fiction_overview = new Science_fiction.Class_chapter_science_fiction_overview();
  public static final Func_chapter_science_fiction_overview t_chapter_science_fiction_overview = new Science_fiction.Class_chapter_science_fiction_overview();

  public static Base.Type_chapter f_chapter_science_fiction_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Science Fiction Overview"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("http://www.merzo.net/index.html"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Distant Future Land Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Distant Future Land Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Infantry\n* Transporters\n* Time Travel\n* Beam Weapons\n* Lightning Guns\n* Disruptors\n* Disintegrators\n* Railguns\n* Hovercraft\n* Hovertanks\n* Walkers\n* Mobile Suits\n* Mobile Armor\n* Artillery\n* Nuclear Weapons")
              )
            ),
            Core.vx_new_string("Distant Future Space Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Distant Future Space Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Shields\n* Ion Cannons\n* Disruptors\n* Disintegrators\n* Transporters\n* Hyperdrive\n* Jumpdrive\n* Railguns\n* Boarding Parties\n* Starfighters\n* Starbombers\n* Mobile Suits\n* Mobile Armor\n* Large Starships\n* Small Starships\n* Nuclear Weapons\n* Starbases")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_space_cruiser_yamato
   * @return {chapter}
   * (func chapter_space_cruiser_yamato)
   */
  public static interface Func_chapter_space_cruiser_yamato extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_space_cruiser_yamato();
  }

  public static class Class_chapter_space_cruiser_yamato extends Core.Class_base implements Func_chapter_space_cruiser_yamato {

    @Override
    public Func_chapter_space_cruiser_yamato vx_new(Object... vals) {
      Class_chapter_space_cruiser_yamato output = new Class_chapter_space_cruiser_yamato();
      return output;
    }

    @Override
    public Func_chapter_space_cruiser_yamato vx_copy(Object... vals) {
      Class_chapter_space_cruiser_yamato output = new Class_chapter_space_cruiser_yamato();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_space_cruiser_yamato", // name
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
    public Func_chapter_space_cruiser_yamato vx_empty() {return e_chapter_space_cruiser_yamato;}
    @Override
    public Func_chapter_space_cruiser_yamato vx_type() {return t_chapter_space_cruiser_yamato;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_space_cruiser_yamato();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_space_cruiser_yamato() {
      return Science_fiction.f_chapter_space_cruiser_yamato();
    }

  }

  public static final Func_chapter_space_cruiser_yamato e_chapter_space_cruiser_yamato = new Science_fiction.Class_chapter_space_cruiser_yamato();
  public static final Func_chapter_space_cruiser_yamato t_chapter_space_cruiser_yamato = new Science_fiction.Class_chapter_space_cruiser_yamato();

  public static Base.Type_chapter f_chapter_space_cruiser_yamato() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Space Cruiser Yamato"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("Aka Starblazers"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Shock Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shock Cannon")
                      )
                    ),
                    Core.vx_new_string("Pulse Laser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pulse Laser")
                      )
                    ),
                    Core.vx_new_string(":Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile")
                      )
                    ),
                    Core.vx_new_string("Smite Projector"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smite Projector")
                      )
                    ),
                    Core.vx_new_string("Wave Motion Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wave Motion Gun"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("400Mm")
                      )
                    ),
                    Core.vx_new_string("Magna Flame Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magna Flame Gun"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("800Mm")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Earth Forces"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Earth Forces"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Yamato Space Battleship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yamato Space Battleship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/Yamato.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Argo"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("62ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("263m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
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
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Shock Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Shock Cannon")
                                      )
                                    ),
                                    Core.vx_new_string("Pulse Laser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pulse Laser")
                                      )
                                    ),
                                    Core.vx_new_string(":Missile"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Missile")
                                      )
                                    ),
                                    Core.vx_new_string("Wave Motion Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Wave Motion Gun")
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
                    Core.vx_new_string("Andromeda Space Battleship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Andromeda Space Battleship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/Andromeda.png")
                      )
                    ),
                    Core.vx_new_string("UDF Battle Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UDF Battle Satellite")
                      )
                    ),
                    Core.vx_new_string("UDF Space Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UDF Space Destroyer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/Destroyer.png")
                      )
                    ),
                    Core.vx_new_string("Cosmo Tiger II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cosmo Tiger II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/CosmoTiger.png")
                      )
                    ),
                    Core.vx_new_string("Cosmo Zero"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cosmo Zero"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/CosmoZero.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Gamelon Empire"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gamelon Empire"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Leader Desslok"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leader Desslok"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/LeaderDesslok.png")
                      )
                    ),
                    Core.vx_new_string("Desslok's Command Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Desslok's Command Carrier"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Smite Projector"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Smite Projector")
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
                    Core.vx_new_string("Gamelon Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gamelon Destroyer")
                      )
                    ),
                    Core.vx_new_string(":Tri-Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tri-Carrier")
                      )
                    ),
                    Core.vx_new_string("Smite Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smite Ship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/Gamelon_Smiteship.png"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Smite Projector"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Smite Projector")
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
                    Core.vx_new_string("Drill Missile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Drill Missile")
                      )
                    ),
                    Core.vx_new_string("Reflex Gun"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reflex Gun"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Argo is on the opposite side of Pluto. The opposite side? Oh, no Star Force, you're not getting away. My Reflex Gun can shoot around corners. - Colonel Ganz")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Comet Empire"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Comet Empire"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Prince Zordar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prince Zordar"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/PrinceZordar.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("I hold the whole universe in the palm of my hand. I just close my hand and planet crumble, the stars shatter! What chance does your planet Earth have? It's a cosmic joke. - Prince Zordar")
                      )
                    ),
                    Core.vx_new_string("Comet Empire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Comet Empire"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("SpaceBattleshipYamato/CometEmpire.png")
                      )
                    ),
                    Core.vx_new_string(":Medaruhse"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medaruhse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Its principal weapon is a large plasma cannon which fires directly into a SMITE field which teleports the\nenergy to a considerable distance.  This gives the weapon a tremendous firing range more than twice that of\na Wave Motion Gun."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Magna Flame Gun"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
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
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Magna Flame Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Magna Flame Gun")
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
   * @function chapter_space_opera
   * @return {chapter}
   * (func chapter_space_opera)
   */
  public static interface Func_chapter_space_opera extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_space_opera();
  }

  public static class Class_chapter_space_opera extends Core.Class_base implements Func_chapter_space_opera {

    @Override
    public Func_chapter_space_opera vx_new(Object... vals) {
      Class_chapter_space_opera output = new Class_chapter_space_opera();
      return output;
    }

    @Override
    public Func_chapter_space_opera vx_copy(Object... vals) {
      Class_chapter_space_opera output = new Class_chapter_space_opera();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_space_opera", // name
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
    public Func_chapter_space_opera vx_empty() {return e_chapter_space_opera;}
    @Override
    public Func_chapter_space_opera vx_type() {return t_chapter_space_opera;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_space_opera();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_space_opera() {
      return Science_fiction.f_chapter_space_opera();
    }

  }

  public static final Func_chapter_space_opera e_chapter_space_opera = new Science_fiction.Class_chapter_space_opera();
  public static final Func_chapter_space_opera t_chapter_space_opera = new Science_fiction.Class_chapter_space_opera();

  public static Base.Type_chapter f_chapter_space_opera() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Space Opera"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Space Opera Phenomenon"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space Opera Phenomenon"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Motaran Rift"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Motaran Rift"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Beyond the Alliance Frontier is the ionic Pendulask storm stretching 100 light years across. In the center of the storm is a spacial disturbance that has ripped the fabric of time itself - The Motaran Rift.\n* There has been documented evidence of horrific beings who appear alive, but then not alive, which have escaped from the Rift to wreak havoc on nearby worlds. Scientists theorize that there must be a time corridor that links some netherworld to the third dimension. Others believe it is a conduit that links another part if the universe to itself. Religious groups call it Hell.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Terran Union"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terran Union")
              )
            ),
            Core.vx_new_string("Galactic Alliance"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Galactic Alliance"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Alliance Defense Service - A Service chartered with the defense and policing of star systems including air, sea, and land policing and defense. They hold authority over all civilian facilities including cities, space stations, and satellites.\n** Alliance Police\n** Alliance Bureau of Investigation\n* Alliance Military Service\n** Alliance Naval Division - A division managing large combat ships of all types including capital ships, military space stations, and military satellites.\n** Alliance Starfighter Division - A division managing small combat ships including interceptors, close support, and bombers.\n** Alliance Commando Corp - Elite teams focused on performing surgical military operations deep within hostile territory.\n** Alliance Marine Corp - A dedicated combat group focused on spearheading battles and rapid response.\n* Alliance Contact Service - A Service dedicated to exploration, diplomacy, trade negotiations, foreign intelligence, and the projection of soft power.\n** Alliance Diplomatic Corp\n** Alliance Intelligence Corp\n* Alliance Research Service"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Federation, Feddys (derogatory), Starfleet"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":PAX"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("PAX"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* PAX is a chemical compound designed to be added to air processors in order to pacify a populace. An Alliance research team on Miranda discovered that the Pax was effective with 99.9% of people. Unfortunately, it was such an effective means of pacifying that the people stopped doing anything, they simply waited for death. The remaining tenth of a percent (0.1%) of the population had the opposite\nreaction. They became highly aggressive, committing unspeakable acts including cannibalism, rape, and self-mutilation. These people would come to be known as Reavers."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("G-23 Paxilon Hydrochlorate, PAX (Latin for Peace)")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alliance Spaceport"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Spaceport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Spaceports on Alliance worlds service all incoming and outgoing space traffic. It is strictly illegal to attempt to land on a planet anywhere except a spaceport.\n* Spaceports manage customs, quarantines, weapons checks, temporary lodging, resupply, trade, entertainment, etc.\n* Spaceports are always located far away from major cities. They are also heavily armed with troops, fighters, and destroyers available at short notice.\n* For safety reasons, landing pads and drydocks are located 10km away from any inhabited area. The spaceport proper is reached by shuttles.\n* Orbital and land-based spaceports are essentially the same except for modes of travel.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Alliance Armsman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Armsman")
                      )
                    ),
                    Core.vx_new_string("Alliance Commander"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Commander")
                      )
                    ),
                    Core.vx_new_string("Alliance Commando"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Commando")
                      )
                    ),
                    Core.vx_new_string("Alliance Emmissary"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Emmissary"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Serves on First Contact and other diplomatic missions. Emmissaries must determine the best course of action to develop long-term relations with other species. As such, they have sweeping powers to determine policy that military personnel must implement including blockades and quarantines."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Diplomat")
                      )
                    ),
                    Core.vx_new_string("Alliance Heavy Marine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Heavy Marine")
                      )
                    ),
                    Core.vx_new_string("Alliance Intelligence Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Intelligence Agent"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Brint")
                      )
                    ),
                    Core.vx_new_string("Alliance Marine Tech"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Marine Tech")
                      )
                    ),
                    Core.vx_new_string("Alliance Mobile Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Mobile Cavalry")
                      )
                    ),
                    Core.vx_new_string("Alliance Mobile Infantry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Mobile Infantry")
                      )
                    ),
                    Core.vx_new_string("Alliance Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Pilot")
                      )
                    ),
                    Core.vx_new_string("Alliance Police Detective"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Police Detective")
                      )
                    ),
                    Core.vx_new_string("Alliance Police Officer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Police Officer")
                      )
                    ),
                    Core.vx_new_string("Alliance Scientist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Scientist")
                      )
                    ),
                    Core.vx_new_string("Alliance Scout"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Scout"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Alliance Scouts operate somewhat differently from the other divisions of the Alliance. Since Scouts must opearte on the edge of civilized space, the Scout Service values independence and resourcefulness. Its people are highly independent (some would say insubordinate) and are accustomed to doing a lot with a little. Scouts do not wear normally uniforms, even onboard ships and easily blend in with the frontier fringers. They operate with little funding or support and are experts at survival and mechancal engineering.\n* Reputation - Among the other divisions, the Scouts are seen as unprofessional cowboys, madmen, or criminals depending on who you talk to. The Scouts themselves admit to cases of all of these, and they proudly maintain that it takes a certain type to be a successful Scout.\n* Intelligence - Given the Scouts' deployment at the fringes of civilization, they often gain intelligence that the Intelligence Bureau would find difficult to obtain on their own. Officially, the Scout service shares all intelligence gathered with the Bureau. Unofficially, the Scouts do not like the way the Intelligence Bureau operates and rarely volunteers information. This hesitency, of course, makes the Bureau suspiscious.\n* Wartime - During war, the Scouts are called upon to perform skirmish and sabotage missions using their fast, light craft.")
                      )
                    ),
                    Core.vx_new_string("Alliance Technician"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Technician")
                      )
                    ),
                    Core.vx_new_string("Alliance Trooper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Trooper")
                      )
                    ),
                    Core.vx_new_string("Alliance Defense Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Defense Pilot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Planet-based spacefighter pilot. These fighters can only attain low-orbit, but they are relatively cheap to manufacture and easy to fly so they can be fielded in large numbers.")
                      )
                    ),
                    Core.vx_new_string("Alliance Defense Trooper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Defense Trooper"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Planet-based military force. These warriors are trained to use the local terrain and defensive positions to repel invaders. Since defense forces are rarely needed, it is usually a cushy job. Therefore, they have a somewhate deserved reputation for being lazy and unprepared.")
                      )
                    ),
                    Core.vx_new_string("Inquiry Light Recon ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inquiry Light Recon ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled\n* Open topped ATV with HMG and MRLx2."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("170kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4tons")
                      )
                    ),
                    Core.vx_new_string("Sepoy APC"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sepoy APC"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("300kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+11"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("38tons")
                      )
                    ),
                    Core.vx_new_string("Hunter AC Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunter AC Tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air Cushioned\n* Pulse Laser\n* Gauss MG\n* MRL"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("45kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("6"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("210tons")
                      )
                    ),
                    Core.vx_new_string("Siega Strider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siega Strider"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Legged"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("200kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("60tons")
                      )
                    ),
                    Core.vx_new_string("Striker Grav Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Striker Grav Tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 50MW Pulse Laser"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("480kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("522tons")
                      )
                    ),
                    Core.vx_new_string("Tarsan Grav APC"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tarsan Grav APC"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("300kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+10"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("51tons")
                      )
                    ),
                    Core.vx_new_string("Essor Recon Drone"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Essor Recon Drone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* No Weapons"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1000kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("0"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4.3tons")
                      )
                    ),
                    Core.vx_new_string("Princely Lord Attack Speeder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Princely Lord Attack Speeder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav Flyer\n* Pulse Laser"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("960kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("171tons")
                      )
                    ),
                    Core.vx_new_string("Alliance Exploration Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alliance Exploration Ship"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* SS Copernicus - Floating adrift in open space, the Copernicus is a ghost ship\nin more ways than one.")
                      )
                    ),
                    Core.vx_new_string("Hellbore Missile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hellbore Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A giant missile designed to drill into a planet and detonate deep in the magma setting\noff massive volcanic eruptions across the world with the intention to make the world\nuninhabitable.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Azuriach Empire"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Azuriach Empire"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("History:\n* Exodus - After the first Exodus to space, the over-industrialized, pollution ridden Earth fell into a deep recession. The remaining population of Earth began to feel that their fellow humans had abandoned them to their fate and grew to resent their spacefaring kin.\n* Eugenics War - After the Eugenics War, Earth banned all genetic engineering including cloning and artificial life while the Colonials embraced these technologies for their very survival.  Earth began to see the Colonials as a twisted offshoot of mankind that chose a sterile life in space surrounded by runaway technology instead of a wholesome life with earth, sky, and sea.\n* Azure Party - After the Eugenics War, the Earth moved toward a 'Pure Earth' platform combining a resurgence of religion with a return to a more natural, peaceful way of life, on Earth.  A particularly militaristic wing of the the 'Pure Earth' movement became known as the Azure party due to the round blue patches they wore symbolizing the Earth. The Azures were experts at propaganda and found an easy scapecoat in the Colonials.  As the global recession continued, the Azures influence over Earth politics increased.\n* United Earth Alliance (UEA) - After millenia of conflict, Earth united under a single banner, the United Earth Alliance (UEA). Its political platform was the 'Pure Earth' platform, without genetic engineering, without cloning, and with the UEA in control of the Solar System. The Colonials saw this for the power grab that it was and mocked this position as the 'Groundhog Movement'.\n* Solar Cold War - The UEA and the Colonials, especially the Jovians, fought a cold war for decades trying to gain the upper hand. The development of Exo-suits by the Jovian Confederation led to a new arms race between the Jovians and Earth. In the end, the strain on the Earth economy was too great, and the UEA became desparate. In order to maintain control, they declared martial law and began a military build up. This ultimately, forced the other Colonials to rally toward the Jovians or lose their sovereignty.\n* The Rock War - Earth's military might far exceeded the colonies, but their reach was limited to Earth's orbit. The Colonials had far more spaceships, but the vast majority of these were civilian ships.  Ultimately, however, it was the UEA's unpopularity that was its downfall. Before the final battle, sabotage and poor maintenance had incapacitated half of the Earth fleet. When the final battle was fought, the Colonials used their superior numbers to engage the Earth fleet in high Earth orbit where Earth's gravity well restricted the UEA fleet's movements. Then the Colonials covertly captured the industrial Mass Drivers on the Moon and began railing rocks into the Earth fleet and unto Earth itself. After horrific loses on both sides, the Earth military staged a coup on Earth and immediately negotiated a cease fire. The UEA was disbanded and their leaders (largely Azures) were put on trial.\n* Terran Union - After the fall of the UEG, the Colonials created a new representative goverment with each colony, including Earth and Luna, as a state. Earth began rebuilding, but the scars of the war would take centuries to heal.\n* Colony Ships - After 50 years of peace, the colonization of the Solar System was moving along smoothly, so the Terrans began to look outward to the stars. New discoveries in propulsion made long-range probes and colony ships feasible, though their journeys were still measured in decades, so they would still be one-way missions.\n* First Contact - The Terrans had been searching the stars for extra-terrestrial life for hundreds of years, but they were not prepared to find it in their own backyard. A survey of Pluto uncovered an abandoned alien outpost. This was the Terrans' first proof of alien life, and it was decidedly malevolent. This refocused space exploration on the construction of military warships. 30 years later, a human colony vessel had its first face-to-face encounter with a space-faring, alien race, the Thranx.\n* Alliance - The Thranx were much more advanced than the Terrans, but fortunately they were also much more peaceful. The Thranx were part of a loose trade Alliance of races including the Blarads, Caitians, Saurians, and Vargr. The Terrans entered the Alliance and were able to purchase the secrets to FTL drives.  With FTL, colonization of the stars began in earnest. Like the early American settlers, there were many willing to risk death for a chance at a new life. Large colony ships began radiating outward to nearby planets.  Among these were a number of disgruntled Azures who were horrified at the sight of humans reduced to a third rate state in an alien dominated Alliance. Over the next decades, the Azures began settling in one region of stars distant from any alien races.\n* Azuriach Imperium - Over time, the Azures consolidated power in their sector of space. They secretly built a large military fleet, and by the time the Terran Union discovered them, the Azures were powerful enough to declare themselves the Azuriach Imperium. Officially, the larger Alliance considers the Azuriachs a human internal problem. Unofficially, the Alliance is concerned with the distinctly human-centric views of the Azuriachs and are not interested in the Azuriachs gaining power over the human worlds."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Earth Empire"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Azure Imperial Legionnaire"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azure Imperial Legionnaire")
                      )
                    ),
                    Core.vx_new_string("Azure Imperial Marine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azure Imperial Marine")
                      )
                    ),
                    Core.vx_new_string("Azure Imperial Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azure Imperial Pilot")
                      )
                    ),
                    Core.vx_new_string("Azure Imperial Security Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azure Imperial Security Agent")
                      )
                    ),
                    Core.vx_new_string("Azure Imperial Security Officer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azure Imperial Security Officer")
                      )
                    ),
                    Core.vx_new_string("Trepida Light Grav Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trepida Light Grav Tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fusion Cannon"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1000kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("110tons")
                      )
                    ),
                    Core.vx_new_string("Invader Grav Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Invader Grav Tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fusion Cannon"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("3640kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("4"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("152tons")
                      )
                    ),
                    Core.vx_new_string("Vortex Land Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vortex Land Carrier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These enormous vehicles are equivalent to a naval battleship/aircraft carrier but hovers over the ground using intense magnetic repulsion and massive hoverfans.\n* The area directly below the hull is exposed to lethal magnetic energy.\n* Fusion Cannon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Galactic Trade Union"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Galactic Trade Union"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A powerful group of loosely affiliated mega-corporations that acts as the largest lobbying group in the Alliance. The Union has wields tremendous influence over the Alliance government and is essentially a shadow government itself. Though it wields tremendous power, there is intense disagreement how that power should be used with one group or another benefiting the most from every action taken. Conflict within the Union is subversive and bloody with many outside pawns being used including mercenaries and the Star Syndicate.\n* The Trade Union has no actual employees. Instead, the individual corporations act on its behalf either directly or through contractors.\n* Most smaller companies believe the Trade Union acts as a mafia by extorting money from its members for protection while leaning trade deals toward the core members and stifling the very competition they profess to uphold.")
              )
            ),
            Core.vx_new_string("Star Syndicate"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Syndicate"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Syndicate is a loosely held criminal empire spread throughout the Alliance. It is a convenient tool of the mega corps and governments, so the Alliance never seems to make much progress against it."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Syndicate Black Marketeer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Syndicate Black Marketeer")
                      )
                    ),
                    Core.vx_new_string("Syndiate Raider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Syndiate Raider"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Given the high value of starships and their goods, piracy is extremely profitable. The Alliance maintains a 'No-Tolerance/Shoot to Kill' policy for piracy, yet pirate ships and pirate outposts are frighteningly common. The [Azuriach Empire]'s totalitarian state has far fewer incidents of piracy, largely because the stolen goods are harder to sell.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Independent Terrans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Independent Terrans"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Terran Bounty Hunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Bounty Hunter")
                      )
                    ),
                    Core.vx_new_string("Terran Merchant Marine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Merchant Marine")
                      )
                    ),
                    Core.vx_new_string("Terran Mercenary"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Mercenary")
                      )
                    ),
                    Core.vx_new_string("Terran Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Miner")
                      )
                    ),
                    Core.vx_new_string("Terran Physician"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Physician")
                      )
                    ),
                    Core.vx_new_string("Terran Scientist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Scientist")
                      )
                    ),
                    Core.vx_new_string("Terran Technician"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terran Technician")
                      )
                    ),
                    Core.vx_new_string("Corsair Motorcycle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corsair Motorcycle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled\n* Civilian Motorcycle"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("120kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("350kg")
                      )
                    ),
                    Core.vx_new_string("Letra Ground Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Letra Ground Car"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled\n* Civilian Automobile"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("80kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+4"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4tons")
                      )
                    ),
                    Core.vx_new_string("Shackleton Snow ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shackleton Snow ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked\n* Easy to maintain snow ATV"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("70kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("8tons")
                      )
                    ),
                    Core.vx_new_string("Rheena Passenger ACV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rheena Passenger ACV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air Cushioned\n* Passenger Hovercraft"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("60kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+15"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("8tons")
                      )
                    ),
                    Core.vx_new_string("Or-E-Cull ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Or-E-Cull ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked\n* High Speed ATV"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("175kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+5"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10tons")
                      )
                    ),
                    Core.vx_new_string("Surveyor Hover-Buggy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Surveyor Hover-Buggy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air Cushion\n* 1 Fixed LMG."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("45kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("13.7tons")
                      )
                    ),
                    Core.vx_new_string("AVI Cargo ACV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("AVI Cargo ACV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air Cushioned\n* Cargo Hovercraft"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("60kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("18tons")
                      )
                    ),
                    Core.vx_new_string("Hugheston Wheeled Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hugheston Wheeled Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled\n* Cargo Transporter"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Semi Truck"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("100kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("21tons")
                      )
                    ),
                    Core.vx_new_string("Arctica Grav Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arctica Grav Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Self loading cargo transporter"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Semi Truck"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("120kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("25tons")
                      )
                    ),
                    Core.vx_new_string("Bundan Wheeled ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bundan Wheeled ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wheeled\n* ATV"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("100kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+16"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("28tons")
                      )
                    ),
                    Core.vx_new_string("Permax Tracked ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Permax Tracked ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked\n* ATV"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("80kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+16"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("47tons")
                      )
                    ),
                    Core.vx_new_string("Cinto Construction Vehicle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cinto Construction Vehicle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked\n* Bulldozer/Backhoe"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("75kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("48tons")
                      )
                    ),
                    Core.vx_new_string("Tavee-Gho Hoveryacht"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tavee-Gho Hoveryacht"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Air Cushioned\n* Hovercraft"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("105kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("82tons")
                      )
                    ),
                    Core.vx_new_string("Cetacean Dolphin Cycle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cetacean Dolphin Cycle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Underwater, Propelled by moving Fluke\n* Intended for fun in the sea.  It can glide with the dolphins and communicate with them using\nrecorded dolphin speech."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("50kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("75kg")
                      )
                    ),
                    Core.vx_new_string("Hass Grav Minisub"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hass Grav Minisub"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Underwater"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("25kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1tons")
                      )
                    ),
                    Core.vx_new_string("Dashi Hydrofoil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dashi Hydrofoil"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hydrofoil, Underwater\n* Submerged: 25kph\n* Beam Laser"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("125kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2tons")
                      )
                    ),
                    Core.vx_new_string("Vieus Hydrofoil"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vieus Hydrofoil"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hydrofoil\n* Pulse Laser"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("110kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("22tons")
                      )
                    ),
                    Core.vx_new_string("Gasheda Undersea ATV"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gasheda Undersea ATV"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked, Underwater"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("110kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("6"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("184tons")
                      )
                    ),
                    Core.vx_new_string("Aquanaut Restaurant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aquanaut Restaurant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked, Underwater\n* Undersea Restaurant"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("110kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("15+85"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("251tons")
                      )
                    ),
                    Core.vx_new_string("Tiamat Mining Crawler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tiamat Mining Crawler"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tracked, Underwater\n* Self-contained undersea mining colony for 50.\n* Can stay 10km underwater for 3 to 6 months at a time."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("70kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("14+50"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1000tons")
                      )
                    ),
                    Core.vx_new_string("Timla Personal Floating Chair"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Timla Personal Floating Chair"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Used for the luxury, the elderly or disabled, or for aliens with poor ground locomotion.\n* The floating chair normally just hovers over the ground, but it can slowly ascend if needed."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("30kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("100kg")
                      )
                    ),
                    Core.vx_new_string("Peter Pan Child's Grav Chair"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peter Pan Child's Grav Chair"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Young passengers automatically are taken to their programmed destination anywhere in the world.\n* Computer will not allow reprogramming unless authorized by the parent."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("600kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("400kg")
                      )
                    ),
                    Core.vx_new_string("Zeus Luxury Grav Chair"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zeus Luxury Grav Chair"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* The ultimate in individual luxury transport.  The autopilot allows the passengers to work,\ntalk, or relax with a drink."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("300kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("480kg")
                      )
                    ),
                    Core.vx_new_string("Swallow Flycycle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swallow Flycycle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Autopilot"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("300kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1tons")
                      )
                    ),
                    Core.vx_new_string("Venery Police Speeder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Venery Police Speeder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Gauss MG"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1080kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1.2tons")
                      )
                    ),
                    Core.vx_new_string("Strike It Rich Prospector Grav Bubble"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strike It Rich Prospector Grav Bubble"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Can manuever close to analyze samples with its robotic arm. The bubble is to be used near a base. A team usually drops off one crewman to dig while the other prospects for new sites."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1600kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1.5tons")
                      )
                    ),
                    Core.vx_new_string("Planet Hopper Grav Car"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Planet Hopper Grav Car"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Flying family-sized car can travel anywhere on a planet in under a day."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1000kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2.6tons")
                      )
                    ),
                    Core.vx_new_string("Quest Air-Raft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quest Air-Raft"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("540kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+5"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("8.3tons")
                      )
                    ),
                    Core.vx_new_string("Demeter Grav Farm Wagon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Demeter Grav Farm Wagon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Grav farming equipment that does not disturb crops.\n* Robotic arms plant and harvest."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("100kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("11tons")
                      )
                    ),
                    Core.vx_new_string("Lifesaver Grav Emergency Responder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lifesaver Grav Emergency Responder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Includes variety of sensors for detecting radiation leaks, trapped survivors, etc.\n* Fire retardant foam cannon"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("600kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+8"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("13tons")
                      )
                    ),
                    Core.vx_new_string("Duone Rapid Speeder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duone Rapid Speeder"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Extremely high-speed grav flyer."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("3840kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("14tons")
                      )
                    ),
                    Core.vx_new_string("Wanderer Grav Airbus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wanderer Grav Airbus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Flying mass transit or tour bus can reach any location on the planet in under a day."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1400kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+10"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("15tons")
                      )
                    ),
                    Core.vx_new_string("Traveller Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Traveller Shuttle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav, Suborbital"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("180kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+8"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("17tons")
                      )
                    ),
                    Core.vx_new_string("Cloud Nine Grav Houseboat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cloud Nine Grav Houseboat"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* 3 Bedroom, 2 Bath, 1 Kitchen, 1 Living/Dining Room, 2 Office\n* Take a vacation or live in the sky.  The Cloud Nine has fuel and supplies for a year without\nlanding."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("300kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+10"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("20tons")
                      )
                    ),
                    Core.vx_new_string("Athene Grav Lounge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Athene Grav Lounge"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Mobile lounge popular with private clubs, business executives, and negotiators."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("720kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("6+30"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("30tons")
                      )
                    ),
                    Core.vx_new_string("Motherlode Grav Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Motherlode Grav Miner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Mining Utility Vehicle"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("540kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("49tons")
                      )
                    ),
                    Core.vx_new_string("Tachcel Grav Hyperliner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tachcel Grav Hyperliner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav, Suborbital\n* Speed: 6G\n* At maximum speed, can reach any location on a typical planet in under an hour."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("4200kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+72"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("50tons")
                      )
                    ),
                    Core.vx_new_string("Jacques Grav Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jacques Grav Miner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Mining vehicle designed to locate, mine, and transport ore from a variety of environments.\n* Mining Laser"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("120kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+2"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("67tons")
                      )
                    ),
                    Core.vx_new_string("Windrider Grav Weather Lab"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Windrider Grav Weather Lab"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Floating meteorological laboratory"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("60kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("2+10"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("88tons")
                      )
                    ),
                    Core.vx_new_string("Thorian Kur Repair Shop"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thorian Kur Repair Shop"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Flying repair platform"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("330kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+3"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("127tons")
                      )
                    ),
                    Core.vx_new_string("Sans Souci Grav Yacht"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sans Souci Grav Yacht"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* The ultimate millionaire's portable mansion.  The interior has 14 staterooms and is custom\ndesigned to the owner's tastes.  Some models include a swimming pool.\n* High tech armor and sensors."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("960kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+30"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("342tons")
                      )
                    ),
                    Core.vx_new_string("Zeff Grav Cargo Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zeff Grav Cargo Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Grav\n* Heavy Cargo Transporter"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("720kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1+1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("500tons")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Aeodronian"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Aeodronian"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Aeodronians are a race of bipedal salamander-like humanoids. The salamanders are quite cunning and intelligent. The race as a whole is opposed to the Alliance.\n* The Aeodronian home world is a tropical paradise, lush and humid, possessing a variety of flora and fauna that covers 20% of the planet's surface area. The salamanders live in costal cities made of coral outcroppings (reefs) and carry on all industry in environmentally safe factories and other facilities. All food is taken from the natural bounty of the sea. For most materials, such as metals, alloys, and high-technology items, they trade with other races and worlds, rather than rape the bosom of their own planet. That which they cannot trade for, they take.\n* The Aeodronians have become scavengers and pillagers of the galaxy. They abhor the Alliance's method of colonial exploitation, and the salamanders are bitter enemies of its military. There is some hypocrisy in this statement, because salamander's are known to pillage and plunder Alliance worlds. Aeodronian raiding fleets harry convoys and supply routes, and attack worlds that the Aeodronidans see as being raped of their natural order."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Salamanders")
              )
            ),
            Core.vx_new_string("Blarad Starkingdom"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Blarad Starkingdom"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Bears, Ursoids")
              )
            ),
            Core.vx_new_string(":Cizerack"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cizerack"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - A race of large, brown/blue/black cat/bear creatures. They are\nextremely fast and can able to achieve speeds of 40mph for short periods of time.\nDespite their size, they are strong climbers and swimmers. When necessary, they can\nwalk erect, but they are clumsy on two feet. They possess excellent hearing and\nvision especially at night. They possess prehensile paws, with retractable fingers\nbut have limited manual dexitery. They are stealthy stalkers and are adept at\nscouting, hunting, and ambushing.\n* Combat - Their melee prowess is legendary, but their paws make ranged weapons\nawkward, so instead they tend to mount smart weapons on their backs. They are also\nsometimes willing to allow small creatures (like Mazians) to ride on their backs.\nCizerack culturally prefer close combat to cowardly ranged weapons, but they are\ngradually overcoming this predjudice.\n* History - The Cizerack evolved on a world with a few continents dominated by\ngrassy plains and scrubland. Winters are harsh, and most animals including the\nCizerack burrow into the ground and hibernate during the winter. There is a polar\nvariant of the Cizerack that is adapted to the cold weather and does not usually\nhibernate. The Cizerack have long been at the top of the food chain, and have a long\ncultural history. They only recently developed technology in an effort to solve their\nover-population problem."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Caitian, Felines"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cizerack Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cizerack Warrior")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Chatilian"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Chatilian"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* I rather like the way his head exploded."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - The Chatilians are from the planet Chatil in the Fomalhaut star\nsystem. They are frail, delicate looking, greenish blue plant beings with thin\nbodies and large, bullet-shaped heads. Chatilians are herbivores. They have no real\nmouth, rather they possess facial slits through which they strain their food intake.\nTheir arms and legs are like branches and roots which must be pruned to grow into\nuseful limbs. When angered, Chatilians whine loudly, bug out their eyes, and drool\nyellow spit from their facial slits. This would be somewhat comical, except this is a\nsign that they are generating and then people start dying.\n* Telepathy - They can speak aloud with great difficulty, though they do not normally\nneed to because their skulls are crowned with sensory nodes which allows them\ncommunicate telepathically among themselves. With focus, an empath also may read an\nunprotected mind in close proximity.\n* Psykokinesis - Although Empaths are innocuous looking, they are actually among the\nmore dangerous and formidable opponents in the galaxy. Through the evolutionary\nprocess, they have developed psycho-kinetic power which allows them to harness and\ntransmit psychic energy. This unusual ability is called Generating. Empaths employ\npsychic and illusionary attack forms. Advanced Chatilians can actually crush the\nminds of their enemies.\n* Personality - They are generally considered rude, peculiar, and annoying by other\nraces. They are not overly fond of other races either. They intensely dislike any\ninconvenience including bad weather. A large part of their scientific development has\nbeen toward atmospheric control and terraforming. Chatilians like water but hate any\nkind of physical exertion. They are sensitive to everything, so noise, bright lights,\ngaudy art, hot weather, cold weather, dumb people, etc, etc. all irriate the sedate\nintellectuals to no end.\n* Colonies - Chatilian buildings are strange tiered affairs with rooms and floors of\ndifferent sizes, terraces and skylights everywhere, and stark blank surfaces. The\narchitecture is similar to adobe cities and Mediterraean beach communities. Chatilian\ncities are sprawling low-lying residential areas with all industry and commerical\noperations underground. Trees and plants are allowed to grow naturally throughout the\ncities. The underground is a maze of indirect passages and oddly shaped rooms.\nTourist often get lost which the Chatilians attribute to their limited mental\ncapacity.\n* History - The Chatilians homeworld is closer to its star than Earth. It is hot and\nhumid year round, and its 4 moons reflect much light even at night. In this world,\nmobile plant life evolved instead of animal life. Though all Chatilians speak\ntelepathically, the ability to generate only occurs in 1% of the populace. The ability or inability to generate has created 2\nclasses and numerous, bloody civil wars with one side or the other taking control.\nThe current royal family can generate and their power is buffered by a representative\nparliament. This arrangement has lasted for 500 years, but there always remains a\nrisk of civil war."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Asparagus Men"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Chatilian Empath"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chatilian Empath")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Cybernetically Enhanced"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cybernetically Enhanced"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Cyber, Cyborg, Cyman, Simon (derogatory)")
              )
            ),
            Core.vx_new_string(":Eridani"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Eridani"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The ultimate warrior race. The methane breathing Eridani are the epitome of a combat\ntacticians. They possesses supreme agility, exceptional willpower, and are quite\ncunning.\n* Physiology - Eridani are tri-sexual creatures with males and females fertilizing\nand a fat creature called a Nog that carries young to term in a pouch similar to a\nkangaroo. Males and females have few gender-based role differences while the Nogs are\nlargely helpless and fiercely protected.\n* History - The Eridani have a long history of conflict and conquest among themselves\nbefore uniting to bring their conquests to the stars. They are not interested in\nstatecraft, so conquered worlds were largely left to their own devices besides helping\npay for the eternal war effort. Eventually, they encountered a trecherous enemy in\nthe Phentari squids. This enemy was able to lure the Eridani fleet into an all out\nattack while launching a covert attack against the Eridani homeworld reducing it to\nrubble. The Eridani empire was shattered and they can never live down the humiliating\ndefeat. They now maintain a blood feud with all Phentari."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Eridani Swordsaint"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eridani Swordsaint"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Certain Eridani warriors are chosen at birth to fulfill the honorable status of\nMokaba Datu, (Wisdom Warrior). Under the tutelage of the Buddon Priest, the young\nMokaba Datu learns the basic tactics of honorable survival.\n* A swordsaint warrior must be willing to sacrifice emotion for the superior\nconsciousness of objective thought. Even in a berserk status, an Swordsaint\nretains complete control and suffers no berserk penalties."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Mokaba Datu, Wisdom Warrior")
                      )
                    ),
                    Core.vx_new_string("Eridani Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eridani Warrior"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This supreme warrior race specializes in combat skills, most notably archaic\nhand weapons. Every warrior is allowed to carry an ornamental archaic hand weapon\nof his choice wherever he goes within Alliance territory.\n* Eridani warriors study Kaush-mukal (The study of the Inner Self). He is taught\nthe fundamentals of archaic hand weapons combat, drilling every day for hours,\nuntil he passes a fundamental competence test in his chosen weapon. Once he has\nmastered the fundamentals, he begins the arduous task of finding Inner Self.\n* A warrior has a duty, unselfish and detached. It is to wage battle for the\nhonor of the race, and in the heartfelt throes of battle come to understand the\ntentative existence of the self. Those unworthy of combat will inevitably be\ndisposed of. Such is the fundamental construct of the evolution process.\nEventually one must find the door to everlasting peace. But the path to\ntranquility starts in the chaos of the battlefield.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Mazian"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mazian"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Mazian is an amorphous being, able to change shape to resemble other objects.\nIt is normally a gel-like amorphous being, each cell existing as a separate entity\nand yet working in a harmonious symbiotic relation with the other cells around it.\nThe Mazian has no central nervous system, rather the outer layer of skin is covered\nwith small nodes that allow the Mazian to sense ground vibrations. The nodes also\nmake Mazians vulnerable to loud noises and sonics. It is an asexual being that\nreproduces through budding every ten years. It eats by absorbing liquids into its body\nand the Mazian can absorb small objects for temporary storage.\n* Personality - Mazians are very friendly creatures with no sense of personal space.\nThey hang around in huge piles and are only truly happy when touching something or\nsomeone. As a colony creature, Mazians lack a sense of individuality. They do not\nunderstand personal property or war as they believe in sharing everything. Many other\nraces find this perspective to be naive. The tactile nature of the Mazians combined\nwith their selfless nature make them very popular companions and lovers. They have\nformed a close bond with the Cizerak despite the fact that their races have only\nrecently encountered one another. Cizeraks have been known to carry Mazian companions\non their backs.\n* Movement - Mazians normally travel low to the ground, sliding rapidly over surfaces.\nThey are also fully amphibious and move gracefully like an eel or a squid. Mazians\ncan also burrow through loose earth and can slide through narrow tunnels and pipes\nwith no feeling of claustrophobia.\n* Communication - Mazians normally communicate by touch but may also make coded\nthumping noises through the ground or grunting noises in the water. To speak with\nother races, they use voice synthesizers.\n* Senses - Mazians cannot see, but have evolved a complex form of sonar which allows\nthem to distinguish shapes. They have a fantastic sense of smell, able to detect\nresidual odors better than a bloodhound. Their sense of taste is so good that they\ncan use it to distinguish the dyes used in different colors and can use this ability\nto read by touch. Mazians have developed an ocular device that they can use to see\nas other creatures do.\n* Replication - The Mazian's ability to change it's form makes it the ultimate\nespionage/infiltration specialist. As the Mazian learns to control the cell\nmetamorphoses, its chance to accurately duplicate something increases. At high levels,\na Mazian can replicate a humanoid form. When attempting to replicate, the Mazian flows\nover an object, internally records the physical matrix, then copies it. Mazians often\npay handsome amounts of money for internal skeletons to aid them in replicating\nbipedal and quadrapedal forms.\n* Weaknesses - Mazians jelly-like form is sensitive to sonics and dessicants. They are\nvulnerable to the drying effects of heat and cold, but their predominatly liquid form\ndoes not catch fire easily."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Blob")
              )
            ),
            Core.vx_new_string(":Mutazchan"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mutazchan"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Mutzachan Energy Controller is one of the most powerful of all the known races.\nThey can manipulate energy through their body to generate tremendous, destructive\npower. Mutzachan love the power of raw energy. They feel that energy must fill its\npotential and dislike the storage of energy.\n* Description - Mutzachans are indigenous to the planet Trishmag of the Cygni-A star\nsystem. They are small, bipedal humanoids, with large heads and large pale green eyes.\nThey are by far the most intellectually advanced race in the known galaxies. Their\nbrains have almost twice the convoluted surface area of human brains.\n* Physiology - Their high intellect and technology have left them with a distain for\nphysical labor and consequently their physiological has suffered leaving them\nphysically weak and easily tired. Their constitution is also weak leaving them\nunusally vulnerable to disease and infection. The entire Mutzachan population is less\nthan 400 million and their culture has almost been eradicated twice, due to plague.\nMutzachan have a very low fertility rate, with the females bearing young only once\nevery 100 years. The average life expectancy for a Mutzachan is about 2,000 years.\n* Psychology - Mutzachan pride themselves on making decisions rationally instead of\nemotionally. This is not to say that the Mutachan are not emotional, but they are\nususally able to overcome their emotions. Mutachan are highly ego driven and are\nvery fond of titles and have little patience for insults. Though they are generally\nconsistent and fair to others, they are also famous for being coldhearted and ruthless\nwhen the need arises.\n* History - The Mutzachan are an old race, with a history spanning 40,000 years. They\nhave observed the development of the other races without interfering (much). Their\nsun is old and has been slowly, expelling more radiation over the last million years.\nLife on their world evolved to not only become resistant to the radiation but to\nfeed on it in a process similar to photosynthesis. A 1000 years ago, the Mutzachans\ndetermined that their sun would go nova, destroying their home world. Since then,\nthey have pursued 'The Great Purpose' which is to prevent or mitigate this\ncatastrophe. The Great Purpose has also spawned dangerous nilhilist cults that\nbelieve that the Mutzachans do not deserve to continue and should embrace their\nfinal destruction in the ultimate nuclear cataclysm.\n* Politics - Their keen intellects and strategic thinking have risen many of their\nkind to high political office. Most of the high ranking members of the Alliance are\neither Replicants or Mutzachan. No one really trust the Mutzachan, but then again no\none really trusts anybody and the Mutachan are probably better than most."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Melon Head, Grays, IRSOL")
              )
            ),
            Core.vx_new_string(":Phentari"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Phentari"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Phentari are a warlike race of bipedal, squid-like beings. Because of their\ncallous and trecherous natures, they are the most mistrusted, and disliked of all the\nknown, intelligent races. Phentari have a notorious reputation as skilled bounty\nhunters and assassins.\n* Physiology - Phentari are indigenous to the methane planet Phena in the Tau Ceti\nstar system. They have four sinuous arms, each of which is capable of independent\naction. This allows the squid to target and fire multiple weapons, or perform\nmultiple independent actions simultaneously. When using edged weapons, the squid\nattacks like a chain saw. Their tentacles also allow the Phentari to climb quite well.\nPhentari possess stump like legs which offer little balance. They have long since\nadopted prosthetic gear to facilitate running. Phena has a 20% methane atmosphere and\nlike the Eridani, the Phentari must wear an atmospheric processor when operating\noutside of a methane environment.\n* Procreation - Phentari mate every 4 years. After mating, the female attempts to hunt\nand kill the male. Males who are not resourceful enough to escape have fulfilled their\nmating potential and are no longer worthy of further mating. The female carries the\nfertilized eggs for 3 months and then lays a clutch of 3-4 eggs. After egg laying,\nthe female buries the eggs in the ground and then abandons them. Phentari young must\nfend for themselves after birth, often feeding off of their siblings. Until they\nmature, Phentari young hide in the shadows and develop their survival and hunting\nskills. It is not unknown for a group of young to ambush and slay an adult. Of course,\nwhen this happens, other Phentari accept that the foolish adult deserved his fate.\n* Personality - Phentari are heartless, selfish creatures who hold all weaker beings\nin contempt. They use coercion and threats instead of persuation. Phentari are very\nproud of their kills and will wear jewelry that displays their kill count. They are\nalso fond of decorating their abodes with the skulls of their victims.\n* Skills - Phentari values weapons of all sorts including weapons that other races\nlook down upon such as poisons, diseases, and acids.\n* Government - The Phentari have only had military governments ruled by a council of\ngenerals with no individual given absolute power.\n* History - The Phentari have a long, bloody history of civil wars. Since their\ndisasterous war with the Eridani, they have managed to join together against a common\nfoe. They maintain a mutual hatred of the Eridani who seem to want to kill Phentari\non sight."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Cold Death, Demon Spawn, Grim Reaper, Soul Sucker")
              )
            ),
            Core.vx_new_string(":Pythos"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Pythos"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Pythons are a pair of powerful, lizard races indigenous to the planets Pythos in the Floridian star system.\n* Python Lizards - Python Lizards are aquatic beings, dwelling in the great swamp-like inland seas that cover much of the surface of their home planet. They don't hear sounds as humans do, but rather sense vibrations through their skin. The lizards can dive to depths of 200m and are capable of holding their breath for up to 10 minutes. The drawback is that Python Lizards are sensitive to dry environments and susceptible to cold. When the temperature drops below zero degrees celsius, Pythons usually crawl in some comfortable place and fall asleep. Python Lizards can sense heat sources out to 100m. The lizards are generally less intelligent than their galactic counterparts and have none of their own technology to speak of. They are, however, much more intelligent than their land-based cousins the Rams.\n* Ram Pythons - Unlike their aquatic cousins, Ram Pythons live on land. They are massively powerful and overwhelm even the Python Lizards in combat. However, their intelligence is extremely limited, and they are barely able to be taught how to use modern weaponry.\n* Combat - These great reptiles are the backbone of assault units in the Alliance Marines, proud and defiant warriors whose lifelong ambition is to fight the ultimate battle. The Python is a veritable fighting machine. Unarmed, it attacks with both claws, a vicious bite, and its long prehensile tail. They have a thick, scaly hide that acts as natural leather armor.\n* Personality - These prehistoric dinosaurs are overtly aggressive. The vast majority of Pythons follow a strict code of honor and adamantly adhere to the precepts of law and order.\n* History - The Lizards and Rams are tribal creatures who have fought tribal conflicts for tens of thousands of years. Thir technology was limited to spears and stone axes until the Cizerak sent a diplomatic envoy to the Python Lizards. The Lizards suspected trickery and killed the envoy sparking a punitive attack from the Cizerak. The Lizards and Rams were forced into a humiliating surrender after devastating losses from the Cizerak's cowardly orbital bombardment. The Pythos have not forgiven the Cizerak and will never trust them. Since then, the Alliance has established peaceful relations with the Pythos and have recruited many into Alliance police and military forces."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Lizards"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Python Lizard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Python Lizard")
                      )
                    ),
                    Core.vx_new_string("Ram Python"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ram Python")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Reavers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Reavers"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* If they take the ship, they'll rape us to death, eat our flesh, and sew our skins into their clothing. And, if we're very, very lucky, they'll do it in that order. - Zoë Alleyne Washburne, Firefly"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Showing no care for life, they are driven by an insane, homicidal and xenophobic aggression that manifests in the cannibalism, rape, and torture that they visit upon any unfortunate enough to come across them.\n* Appearance - They deliberately gash and cut their own flesh. Barbaric piercings and random bits of metal shoved into their flesh are common, giving them a ghastly and corpse-like air.\n* Abilities - They seem no physically stronger or tougher than normal humans merely inured to pain to the point where they care nothing for their injuries or indeed their own lives, and more willing to push their bodies to the extreme because of their madness.\n* Intelligence - Exactly how sentient individual Reavers are remains an open question. Although they clearly must have some retention of any original knowledge prior to their madness (as evidenced by their command of starships and weapons) Reavers are as without fear as they are without mercy,\n* Reavers are believed by most to be men that went insane at the edge of space and became savage. They stared into the void beyond and became what they saw: nothing.\n* Reavers originated from the planet Miranda. The Alliance had been testing behavioral modification on this planet through the chemical G-23 Paxilon Hydrochlorate ([PAX]), administered through the air recycling systems. The chemical was designed to weed out aggression and anger. The ultimate result was that 99.9% of the population stopped going to work, talking to each other, and eventually stopped moving, eating or breeding, and therefore died. However, the remaining tenth of a percent of the population had the opposite reaction, with their aggression and primal instincts boosted beyond simple madness into murderous rage, sadism and xenophobia."),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Reaver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reaver")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Replicant"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Replicant"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* We are merely synthetic products, nothing more than elegant looking robots. - Unknown Replicant philosopher"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Replicants are genetically engineered from scratch to be mentally and physically superior to ordinary humans even genetically enhanced onces. However, they remain physically inferior to full [Android]s, so some consider their production irrelevant.\n* Legal status - They are genetically predisposed to be obedient, and their legal status varies from system to system. The Azures consider them abominations that must be destroyed. In the Alliance, Replicants are generally considered to be more trustworthy than real people, so they have risen to the top levels of government including the current Alliance President.\n* All Replicants are branded with a production number on their scalp at birth.\n* Psychology - Many Replicants are jealous of their fellow Humans, for they don't have an ancestry or heritage. In many ways they are less than orphans, for Replicants are grown in accelerated biochemical environment tanks. Hence, many Replicants suffer from psychological disorders.\n* Weaknesses - The danger of a Replicant revolution has always created controversy among ordinary people. The solution was to limit their lifespan to 10 years. They have also been created with a built-in weakness to a number of military chemicals, so that the military would always have a potent weapon against them."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Genetic Human, Genman, Gen-human, Numan, Bioman, Bioroid, Gene (derogatory), Skin Job (derogatory), Newman (derogatory)")
              )
            ),
            Core.vx_new_string(":Synthetics"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Synthetics"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* It would appear that the plasma pulse has destroyed a large portion of my lower body. Repairs will be necessary. - Battlelords\n* I can assist your employees. I can make your organization more efficient. I can carry out directives that my human counterparts might find ... distressing or unethical - David 8, Prometheus\n* David, what makes you sad? War. Poverty. Cruelty. Unecessary violence. I understand human emotions, although I do not feel them myself. - David 8, Prometheus"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Androids are robots designed to pass as living beings. Since specialized robots are best suited to most menial labor, Androids are generally assigned to duties where a specialized robot would not be appropriate. They are regularly assigned to starship crews, and some ships have only android crews.\n* Androids have many advantages over their living counterparts. They are extremely strong and fast, and have the lightning-quick processing abilities of a computer. They enjoy the best of both worlds where skills are concerned. They can be programmed with necessary skills as well as learn new skills as they are exposed to them in the outside world. Their synthetic skin is slightly tougher than a human's, and the android can take much more damage and still remain functional. Broken parts can simply be replaced, though the individual personality will be lost if the memory banks and backup are destroyed."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Android, Artifical Person, Arty (derogatory), Andy/Andi (derogatory), Syn (derogatory), Synoman/Cinnoman (derogatory), Synthetic, Synthoid")
              )
            ),
            Core.vx_new_string("Thranx Collective"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Thranx Collective"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Visually, the thranx are an insectoid race, about 1.5 meters long when on all six legs.  They look roughly like very large praying mantises. Chitin color differs between males and females, being blue for the males and aquamarine for females, deepening to purple in old age. Thranx also possess vestigial double sets of wings, ritually removed after mating. The head is valentine-shaped, with large, compound golden eyes sometimes banded with red. They have four pairs of appendages; two truhands, four trulegs, and a set of intermediaries that can function as an additional pair of arms or legs. Like insects, they have no lungs and breathe through a series of openings at about waist level.\n* Communication - The species communicates with a complex language consisting of clicks and whistles.\n* Weaknesses - Thranx are unsuited to water and most fear it; they are not naturally buoyant and because they breathe out of their waists, any water that reaches to this level can drown them."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Thraxis"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Thranx Navigator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thranx Navigator")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Transhuman"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Transhuman"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Genetically engineered superbeings."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Trueman, Truman (derogatory)")
              )
            ),
            Core.vx_new_string("Vargr Mercantile League"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Vargr Mercantile League"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Description - Vargr are a bipedal, carnivorous race with strong canine/lupine\ncharacteristics. They are short by human standards and are not physically imposing.\n* The Vargr are cunning merchants.\n* Politics - The Vargr lack governmental structures. Mega-corporations operate entire\ncities and colonies, buy and selling them as a package. The corporation operating\na location sub-contracts out all major services, and within small companies grow in\nsymbiosis with the corporation. Vargr corporations believe in constant competition,\nso they are careful to make sure that their rivals remain healthy. This generosity\nto ones rivals is seen as peculiar to other races, but the Vargr have suffered\nthrough the devastating stagnation that monopolies produce and recoil at any tendency\nto recreate those dark days."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Canines, Dogs"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Vargr Merchant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vargr Merchant")
                      )
                    ),
                    Core.vx_new_string("Vargr Buccaneer Grav Platform"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vargr Buccaneer Grav Platform"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* High speed, open topped, gravity cycle shaped like a cylinder."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1000kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1.4tons")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Virtuals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Virtuals"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Beings that live partially or completely in the virtual world."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Vrman, Verman, Vermin (derogatory)")
              )
            ),
            Core.vx_new_string("Zen Rigeln"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Zen Rigeln"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Zen Rigeln are the most beloved race of the Galactic Alliance. They possess the\npower of healing and are much sought after as battlefield medical technicians and as\ndomestic doctors. They hold life in the highest regard, abstaining from violence\nunless absolutely necessary.\n* Appearance - Zen have a striking appearance with a dark blue/black skull-like head\nand colorful, ornate robes. Zen healers always wear the colors of their current power\non their clothing.\n* Politics - The Zen see the Alliance as far less noble than it claims. Most Zen feel\nthat they must shepard the Alliance to be a better organization, while others see the\nAlliance as an evil empire and work for the Rebels in order to overthrow it. The Zen\nhave no known enemies except their own Anarchs.\n* Healing - All Zen have amazing recuperative powers. Through intense training, some\nhave gained the ability to share their healing with others."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Skulls"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Zen Rigeln Anarch"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zen Rigeln Anarch"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Anarchs are a small sect of Zen that turned their back on the Zen philosophy of\npeace and moderation. Instead, they believe that the Zen must face the other races\non their own terms: with strength. Anarchs are naturally seen as dangerous rebels\nand terrorists by the Zen government and populace. Captured Anarchs should expect\nlife imprisonment.\n* Disruption - Through skin to skin contact, a Zen Anarch may link his/her own\nbody with another person and disrupt the bodily functions of the target. Pain,\nnausea, and heart failure are only a few of the effects that a skilled Anarch can\ninflict.")
                      )
                    ),
                    Core.vx_new_string("Zen Rigeln Healer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zen Rigeln Healer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Healing - Through skin to skin contact, a Zen Healer may link his/her own body\nwith an injured person and share his/her healing ability. At high levels of\nproficiency, the Zen can perform incredible feats such as brain surgery.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Interstellar Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Interstellar Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Islander Star Sloop"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Islander Star Sloop"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Islander is the smallest class merchant starship commonly available. It\ncan carry 30tons of cargo, 4 low passage passengers, and 10 coldsleep bays.\n* 1x Light Particle Cannon\n* 6x Light Startorpedoes\n* The Islander has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("125tons")
                      )
                    ),
                    Core.vx_new_string("Deep Space Probe"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deep Space Probe")
                      )
                    ),
                    Core.vx_new_string("Corsair Star Privateer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corsair Star Privateer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Starfarer is a small merchant starship designed for dangerous courier duty.\nAs such, it has reduced cargo capacity and increased armor, and weapons. Its\nhigh firepower makes it popular among smugglers and pirates, though its high\nprice means that few of these are procured through normal channels.\n* 50tons of cargo\n* 6 crew\n* 10 low passage passengers\n* 10 coldsleep bays.\n* 4x Medium Particle Cannon\n* 6x Light Startorpedoes\n* The Banner has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("250tons")
                      )
                    ),
                    Core.vx_new_string("Valkyrie Patrol Star Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Valkyrie Patrol Star Cruiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Valkyrie is a long range cruiser designed for planetary defense.\n* The Valkyrie acts as a mothership for up to 4 Nike class frigates that it\ncarries and services.\n* 600tons cargo\n* 80 Crew\n* 60 low passage passengers\n* 20 coldsleep bays.\n* 8x Heavy Particle Cannon\n* 12x Light Particle Cannon\n* 6x Heavy Startorpedoes"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("12500tons")
                      )
                    ),
                    Core.vx_new_string("Nike Patrol Space Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nike Patrol Space Frigate"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Nike is a short range frigate designed for planetary defense. As a\nplanetary defense ship it is highly maneuverable and carries a heavy\nweapons load for a small ship.\n* The Nike is transported longer distances by the larger Nemesis class.\n* 30tons cargo\n* 4 Low Passage passengers\n* 10 coldsleep bays.\n* 2x Medium Particle Cannon\n* 6x Light Particle Cannon\n* 6x Medium Startorpedoes\n* 10x Heavy Startorpedoes"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("375tons")
                      )
                    ),
                    Core.vx_new_string("Oliphant Luxury Starliner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oliphant Luxury Starliner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 600 High Passage Accommations\n* 1200 Medium Passage Accommations\n* 2400 Low Passage Accommations\n* 1000 Coldsleep berths"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("75000tons")
                      )
                    ),
                    Core.vx_new_string("Space Cutter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Cutter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Larger than the Pinnacle, the Cutter can travel back and forth from a planet\nto its moon."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("60tons")
                      )
                    ),
                    Core.vx_new_string("Space Lander"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Lander"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Larger than the Cutter, the Lander can travel back and forth from a planet\nto its moon and is used to haul heavy equipment or passengers. In combat, the\nLander is the prefered method to deploy infantry and tanks after a marine\norbital halo drop."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("200tons")
                      )
                    ),
                    Core.vx_new_string("Space Pinnacle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Pinnacle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Larger than the Shuttlecraft, the Pinnacle can travel from orbit to a\nplanet's moon and return."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("30tons")
                      )
                    ),
                    Core.vx_new_string("Space Shuttlecraft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Shuttlecraft"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The shuttlecraft is the smallest of the ship's boats. It is capable of\norbital travel to shuttle small complements of crew and cargo planetside."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Launch"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10tons")
                      )
                    ),
                    Core.vx_new_string("Star Colony Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Colony Ship")
                      )
                    ),
                    Core.vx_new_string("Sub-light Sleeper Ship - Ark"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sub-light Sleeper Ship - Ark")
                      )
                    ),
                    Core.vx_new_string("Zephyr Startransport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zephyr Startransport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Zephyr is a small merchant starship designed for comfortable passenger\nduty along major trade routs.\nAs such, it has reduced cargo capacity and increased armor, and weapons. Its\nhigh firepower makes it popular among smugglers and pirates, though its high\nprice means that few of these are procured through normal channels.\n* 75tons cargo\n* 6 crew\n* 10 Medium Passage Accommations\n* 30 Low Passage Accommations\n* 20 Coldsleep berths\n* 2x Light Particle Cannon\n* 6x Light Startorpedoes\n* The Banner has seen many modifications including high speed drives for\ncourier or smuggling as well as heavier armaments."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("300tons")
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
   * @function chapter_star_trek
   * @return {chapter}
   * (func chapter_star_trek)
   */
  public static interface Func_chapter_star_trek extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_star_trek();
  }

  public static class Class_chapter_star_trek extends Core.Class_base implements Func_chapter_star_trek {

    @Override
    public Func_chapter_star_trek vx_new(Object... vals) {
      Class_chapter_star_trek output = new Class_chapter_star_trek();
      return output;
    }

    @Override
    public Func_chapter_star_trek vx_copy(Object... vals) {
      Class_chapter_star_trek output = new Class_chapter_star_trek();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_star_trek", // name
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
    public Func_chapter_star_trek vx_empty() {return e_chapter_star_trek;}
    @Override
    public Func_chapter_star_trek vx_type() {return t_chapter_star_trek;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_star_trek();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_star_trek() {
      return Science_fiction.f_chapter_star_trek();
    }

  }

  public static final Func_chapter_star_trek e_chapter_star_trek = new Science_fiction.Class_chapter_star_trek();
  public static final Func_chapter_star_trek t_chapter_star_trek = new Science_fiction.Class_chapter_star_trek();

  public static Base.Type_chapter f_chapter_star_trek() {
    Base.Type_chapter output = Base.e_chapter;
    Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Star Trek"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Sci-Fi Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sci-Fi Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Communicator"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communicator")
                      )
                    ),
                    Core.vx_new_string(":Transporter"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transporter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Transporter.jpg")
                      )
                    ),
                    Core.vx_new_string(":Tricorder"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tricorder"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Tricorder.jpg")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Sci-Fi Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sci-Fi Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Anti-Proton Beam"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Proton Beam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/AntiProtonBeam.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("It was pure Anti-Proton...Absolutely pure! - Commodore Matt Decker, Star Trek")
                      )
                    ),
                    Core.vx_new_string("Cloaking Device"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cloaking Device"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/CloakingDevice.jpg")
                      )
                    ),
                    Core.vx_new_string("Disruptor Bank"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Disruptor Bank"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/DisruptorBank.jpg")
                      )
                    ),
                    Core.vx_new_string("Hand Phaser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hand Phaser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/HandPhaser.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The hand phaser is actually a Phaser II with a Phaser I embedded inside.  The Phaser I has the same abilities\nbut suffers from reduced range and limited shots.\n* Stun - .3J\n* Kill\n* Heat\n* Disintegrate")
                      )
                    ),
                    Core.vx_new_string("Phaser Array"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phaser Array"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/PhaserBank.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("http://www.ditl.org/index.php?daymain=/pagarticle.php?29"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("68PJ"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("150Mm")
                      )
                    ),
                    Core.vx_new_string("Photon Torpedo"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Photon Torpedo"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/PhotonTorpedo.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Photon Torpedo...Away! - Chekov, Star Trek The Motion Picture"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Photon torpedos carry 1.5kg of anti-matter (64 megatons) at up to .9c using limited warp drives."),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100PJ")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Federation"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Federation"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Federation Shuttlecraft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Federation Shuttlecraft")
                      )
                    ),
                    Core.vx_new_string("USS Enterprise (Constitution Class)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("USS Enterprise (Constitution Class)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Federation_Enterprise.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NCC-1701"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("200ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("304m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
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
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Phaser Array"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Phaser Array")
                                      )
                                    ),
                                    Core.vx_new_string("Photon Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photon Torpedo")
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
                    Core.vx_new_string("USS Reliant (Avenger Class)"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("USS Reliant (Avenger Class)"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Federation_Reliant.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A Frigate is a ship of similar firepower to a Heavy cruiser but has fewer research facilities, require less\ncrew, and has more limited endurance."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("165ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("236m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Phaser Array"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Phaser Array")
                                      )
                                    ),
                                    Core.vx_new_string("Photon Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photon Torpedo"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2, Bx2")
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
            Core.vx_new_string("Alien Races"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alien Races"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Borg Cube"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Borg Cube"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Borg_Cube.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("We are the Borg. Lower your shields and surrender your ships.  We will add your biological and technological\ndistinctiveness to our own. Your culture will adapt to service us. Resistance is futile. - The Borg, Star Trek\nFirst Contact"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("130000"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("90Mtons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("3km"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Adaptive Shielding total capacity 5,850,900TJ")
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
                                Core.vx_new_string("Total output 7,500,000TW"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Borg Drone"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Borg Drone"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Borg_Drone.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Borg were possibly created by the alien probe V'Ger to seek 'all that is knowable' and return to its\ncreator.")
                      )
                    ),
                    Core.vx_new_string("Doomsday Machine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Doomsday Machine"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/DoomsdayMachine.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Believed to have originated as an ancient race's last resort weapon against the Borg.  Its basic design -\ndestroy planets already assimilated by the Borg for use as fuel - coupled with an indestructible neutronium\nhull and antiproton beam (against which there was little or no defense), made it an ideal weapon against the\nBorg."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Maximum Speed: Warp 4\n* Tractor Beam\n* Dampening Field\n* Can consume a planet in a day"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Planet Killer"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4x10^23tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("2.7km"),
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
                                Core.vx_new_string("Solid Neutronium - Hyper Dense Neutron Star Material")
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Anti-Proton Beam"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Anti-Proton Beam")
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
                    Core.vx_new_string("Klingon Bird of Prey"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Klingon Bird of Prey"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Klingon_BirdOfPrey.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
                              )
                            ),
                            Core.vx_new_string(":Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weaponry"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Disruptor Bank"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Disruptor Bank")
                                      )
                                    ),
                                    Core.vx_new_string("Photon Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photon Torpedo")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Invisibility"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invisibility"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Cloaking Device"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cloaking Device")
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
                            Core.vx_new_string(":Gunnery"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Klingon Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Klingon Cruiser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Klingon_Cruiser.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
                              )
                            ),
                            Core.vx_new_string(":Weaponry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weaponry"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Disruptor Bank"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Disruptor Bank")
                                      )
                                    ),
                                    Core.vx_new_string("Photon Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photon Torpedo")
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
                            Core.vx_new_string(":Gunnery"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Klingon Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Klingon Warrior"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Klingon_Warrior.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Nomad Probe"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nomad Probe"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Nomad.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Error! Error!...Faulty! Faulty! Must sterilize imperfection! - STER-I-LIZE! - Nomad, Star Trek\n* Nomad - See the universe. Meet interesting people...and kill them. - Motivational Poster Parody")
                      )
                    ),
                    Core.vx_new_string("Romulan Centurion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Romulan Centurion"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Romulan_Centurion.png")
                      )
                    ),
                    Core.vx_new_string("Romulan Warbird"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Romulan Warbird"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Romulan_Warbird.png"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Disruptor Bank"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Disruptor Bank")
                                      )
                                    ),
                                    Core.vx_new_string("Photon Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photon Torpedo")
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
                    Core.vx_new_string("Species 8472"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Species 8472"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/Species8472.png")
                      )
                    ),
                    Core.vx_new_string(":V'Ger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("V'Ger"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarTrek/VoyagerVI.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Voyager VI - Tell Nomad I'm going to kick his ass. - Motivational Poster Parody"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Voyager VI"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("98km")
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
   * @function chapter_star_wars
   * @return {chapter}
   * (func chapter_star_wars)
   */
  public static interface Func_chapter_star_wars extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_star_wars();
  }

  public static class Class_chapter_star_wars extends Core.Class_base implements Func_chapter_star_wars {

    @Override
    public Func_chapter_star_wars vx_new(Object... vals) {
      Class_chapter_star_wars output = new Class_chapter_star_wars();
      return output;
    }

    @Override
    public Func_chapter_star_wars vx_copy(Object... vals) {
      Class_chapter_star_wars output = new Class_chapter_star_wars();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_star_wars", // name
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
    public Func_chapter_star_wars vx_empty() {return e_chapter_star_wars;}
    @Override
    public Func_chapter_star_wars vx_type() {return t_chapter_star_wars;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_star_wars();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_star_wars() {
      return Science_fiction.f_chapter_star_wars();
    }

  }

  public static final Func_chapter_star_wars e_chapter_star_wars = new Science_fiction.Class_chapter_star_wars();
  public static final Func_chapter_star_wars t_chapter_star_wars = new Science_fiction.Class_chapter_star_wars();

  public static Base.Type_chapter f_chapter_star_wars() {
    Base.Type_chapter output = Base.e_chapter;
    Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Star Wars"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Star Wars Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Equipment"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("http://www.stardestroyer.net/tlc/Power/index.html"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Blaster Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blaster Pistol"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/BlasterPistol.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Hokey religions and ancient weapons are no match for a good blaster at your side, kid. - Han Solo, Star Wars")
                      )
                    ),
                    Core.vx_new_string("Blaster Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blaster Rifle"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/BlasterRifle.jpg")
                      )
                    ),
                    Core.vx_new_string("Ion Blaster"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ion Blaster"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/IonBlaster.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ion blasters, or ionization blasters, were any handheld weapons that fired ion energy instead of blaster bolts. They were commonly used in response to droids and other technology on the battlefield.\n* [Hit]: [Stun] only.  +1 [Shield Damage].")
                      )
                    ),
                    Core.vx_new_string("Ion Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ion Cannon")
                      )
                    ),
                    Core.vx_new_string(":Lightsaber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightsaber"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Lightsaber.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("This is the weapon of a Jedi Knight.  Not as clumsy or as random as a blaster.  An elegant weapon for a more\ncivilized age. - Ben Kenobi, Star Wars"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("It is a blade of pure plasma energy suspended in a force containment field that keeps individuals from feeling\nthe plasma's heat.  Other Electromagnetic energy fields and coherent energy are repelled by lightsabers' arcs.\nThese include most force fields, blaster bolts, and other lightsaber blades.")
                      )
                    ),
                    Core.vx_new_string(":Turbolaser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turbolaser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1kton TNT"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("4TJ")
                      )
                    ),
                    Core.vx_new_string("Turbolaser Turret"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turbolaser Turret"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/TurbolaserTurret.jpg"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("30TJ")
                      )
                    ),
                    Core.vx_new_string("Heavy Turbolaser Turret"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Turbolaser Turret"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/PlanetaryTurbolaser.jpg"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("250TJ")
                      )
                    ),
                    Core.vx_new_string("Heavy Ion Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Ion Cannon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/PlanetaryIonCannon.jpg"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("250TJ")
                      )
                    ),
                    Core.vx_new_string("Tractor Beam"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tractor Beam")
                      )
                    ),
                    Core.vx_new_string("Proton Torpedo"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Proton Torpedo"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/ProtonTorpedo.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1 Kiloton to Teratons."),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("40TJ")
                      )
                    ),
                    Core.vx_new_string("Shield Generator"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shield Generator"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/ShieldGenerator.jpg")
                      )
                    ),
                    Core.vx_new_string(":Superlaser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Superlaser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/DeathStarSuperlaser.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The most basic consideration pointing towards some kind of superphysics is the magnitude of the device's energy\noutput.  The minimum necessary magitude of the blast that shattered Alderaan is roughly ten thousand times what\nwould be released if the entire mass of the battle station's machinery was annihilated with an equivalent\namount of antimatter. - http://www.theforce.net/swtc/ds/index.html"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1x10^32J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Star Wars Droids"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Droids"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":C3PO"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("C3PO")
                      )
                    ),
                    Core.vx_new_string(":R2-D2"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("R2-D2")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Star Wars Republic"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Republic"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ahsoka Tano"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ahsoka Tano"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_AhsokaTano.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Anakin Skywalker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anakin Skywalker"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_AnakinSkywalker.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Clone Trooper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clone Trooper"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_CloneTrooper.png")
                      )
                    ),
                    Core.vx_new_string("Mace Windu"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mace Windu"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_MaceWindu.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Obi-Wan Kenobi"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Obi-Wan Kenobi"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_ObiWanKenobi.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Padme Amidala"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Padme Amidala"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_PadmeAmidala.png")
                      )
                    ),
                    Core.vx_new_string("Qui Gon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Qui Gon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Republic_QuiGon.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
            Core.vx_new_string("Star Wars Seperatists"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Seperatists"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Asajj Ventress"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asajj Ventress"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Separatist_AsajjVentress.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Battle Droid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battle Droid"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Separatist_BattleDroid.png")
                      )
                    ),
                    Core.vx_new_string("Chancillor Palpatine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chancillor Palpatine"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Separatist_ChancillorPalpatine.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Count Dooku"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Count Dooku"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Separatist_CountDooku.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("General Grievous"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("General Grievous"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Separatist_GeneralGrievous.png"),
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
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
            Core.vx_new_string("Star Wars Imperial Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Imperial Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Imperial Assault Gunboat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Assault Gunboat"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Assault Gunboat.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 2 Laser Cannons\n* 2 Concussion Missile Launchers (20 missiles each)\n* 100 Shields"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Alpha Class Xg-1 Star Wing"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1050kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("7.2m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("10m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("15m")
                      )
                    ),
                    Core.vx_new_string("Imperial Assault Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Assault Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 2 Turbo Laser Turrets\n* 2 Ion Cannons\n* 2 Proton Torpedo Launchers (4 torpedos each)\n* 200 Shields\n* 40 Troops"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gamma Class ATR-6 Assault Transport"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("15"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("20.5m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("45m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("30.4m")
                      )
                    ),
                    Core.vx_new_string("Imperial Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Shuttle"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Shuttle.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lambda Class"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Imperial Walker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Walker"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Walker.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("AT-AT (All Terrain Armored Transport)"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("60kph"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("4"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("20m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string("Tie Advanced"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tie Advanced"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_TieAdvanced.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tie Avenger"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string("Tie Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tie Bomber"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_TieBomber.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Tie Defender"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tie Defender"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_TieDefender.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Tie Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tie Fighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_TieFighter.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string("Tie Interceptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tie Interceptor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_TieInterceptor.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx4")
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
                    Core.vx_new_string("Imperator Star Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperator Star Destroyer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_StarDestroyer.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("34,285"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("25Mtons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("1600m"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("26")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("26")
                              )
                            ),
                            Core.vx_new_string(":Hanger"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hanger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 48 Standard Tie Fighters (4 Squadrons)\n* 12 Tie Interceptors (1 Squadron)\n* 12 Tie Bombers (1 Squadron)\n* 5 Assault gunboats\n* 8 Lambda-class shuttles\n* 15 Stormtrooper transports\n* 10 Gamma-class assault shuttles\n* 20 AT-AT Walkers\n* 30 AT-ST Walkers")
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
                                Core.vx_new_string("Mega Turbo-laser Cannon Mounts (6)\nQuadruple Heavy Turbo-laser Cannon Mounts (2)\nDefensive Turbolaser Turrets (9)\nMega Ion Cannon Mounts (2)\n60 mm Point Defense Laser Turrets (30)\n80 mm Point Defense Ion Cannon Turrets (20)\nCapital Proton Torpedo Batteries (4)\nTractor Beams"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Turbolaser Turret"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser Turret"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("9")
                                      )
                                    ),
                                    Core.vx_new_string("Heavy Turbolaser Turret"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Heavy Turbolaser Turret"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("8")
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
                    Core.vx_new_string("Executor Star Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Executor Star Destroyer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Executor.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("17km"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("29")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("29")
                              )
                            ),
                            Core.vx_new_string(":Hanger"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hanger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 4 squadrons of TIE-fighters\n* 4 squadrons of TIE-interceptors\n* 4 squadrons of TIE-bombers\n* 38,000 troops\n* 25 AT-ATs\n* 50 AT-STs")
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
                                Core.vx_new_string("* 250 concussion missle tubes\n* 250 ion cannons\n* 40 tractor beams"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Turbolaser Turret"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser Turret"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("250")
                                      )
                                    ),
                                    Core.vx_new_string("Heavy Turbolaser Turret"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Heavy Turbolaser Turret"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("250")
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
                    Core.vx_new_string("Death Star"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Death Star"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_DeathStar.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The regional governors now have direct control over their territories.  Fear will keep the local systems in\nline. Fear of this battle station. - Grand Moff Tarkin, Star Wars"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("323k+400k Droids"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2x10^12tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("160km"),
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
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("30")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("30")
                              )
                            ),
                            Core.vx_new_string(":Hanger"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hanger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 7200 TIE Fighters (600 Squadrons)\n* 4 Cruisers\n* 3,600 Assault Shuttles\n* 1,860 Dropships\n* 13,000 Support Craft\n* 1,400 AT-AT\n* 1,400 AT-ST\n* 1,400 Repulsortanks\n* 1,400 Repulsorcraft\n* 355 Floating Fortesses")
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
            Core.vx_new_string("Star Wars Imperials"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Imperials"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Darth Vader"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Darth Vader"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_DarthVader.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Apology accepted, Captain Needa - Darth Vader, The Empire Strikes Back"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Piloting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piloting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("8")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Emperor Palpatine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Emperor Palpatine"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_EmperorPalpatine.png"),
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
                                Core.vx_new_string("9"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
                    Core.vx_new_string("Imperial Governor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Governor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Governor.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Governor Tarkin, I should have expected to find you holding Vader's leash.  I recognized your foul stench when\nI was brought on board. - Princess Leia, Star Wars"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Grand Moff Tarkin")
                      )
                    ),
                    Core.vx_new_string("Imperial Stormtrooper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperial Stormtrooper"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Imperial_Stormtrooper.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Blaster Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blaster Rifle")
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
            Core.vx_new_string("Star Wars Independents"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Independents"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Boba Fett"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boba Fett"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Independent_BobaFett.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* There will be a substantial reward for the one who finds the Millenium\nFalcon. You are free to use any methods necessary, but I want them alive. No\ndisintegrations... As you wish. - Darth Vader and Boba Fett - Empire Strikes\nBack")
                      )
                    ),
                    Core.vx_new_string("Jabba the Hutt"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jabba the Hutt"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Independent_JabbaTheHutt.png")
                      )
                    ),
                    Core.vx_new_string("Slave 1"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slave 1"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Independent_Slave1.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Firespray-31"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Star Wars Rebel Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars Rebel Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("A-Wing Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("A-Wing Fighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_AWing.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RZ-1"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1300kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("1.9m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("9.6m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("6.5m"),
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
                                Core.vx_new_string("* Concussion Missles\n* 5100G acclerations\n* 50 Shields\n* 2 Laser Cannons\n* 2 Concussion Missile Launchers (6 missiles each)"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string("B-Wing Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("B-Wing Fighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_BWing.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("E-Wing Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("E-Wing Fighter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The first fighter designed entirely under the support of the New Republic.\n* The E-wing was intended to match, or exceed, the performance of the preceding X-wing series\nin nearly every respect.  However, the craft suffered from some significant problems when\nfirst deployed.  As a result, many pilots continued to fly upgraded versions of the\nvenerable X-wing.\n* 4200G acceleration\n* 3 Laser Cannons\n* 1 Proton Torpedo Launcher w/16 Torpedoes\n* 1 R7 Astromech"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1300kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("11.2m")
                      )
                    ),
                    Core.vx_new_string("X-Wing Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("X-Wing Fighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_XWing.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 3700G acceleration\n* 50 Shields"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("T-65"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1050kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("12.5m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx4")
                                      )
                                    ),
                                    Core.vx_new_string("Proton Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Proton Torpedo"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string("Y-Wing Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Y-Wing Fighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_YWing.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 2700G acceleration\n* 75 Shields"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1000kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("2.9m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("16m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("7.9m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
                                      )
                                    ),
                                    Core.vx_new_string("Ion Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ion Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2")
                                      )
                                    ),
                                    Core.vx_new_string("Proton Torpedo"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Proton Torpedo"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Fx2")
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
                    Core.vx_new_string(":Landspeeder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Landspeeder"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_Landspeeder.png")
                      )
                    ),
                    Core.vx_new_string("Millennium Falcon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Millennium Falcon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_MilleniumFalcon.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 1050kph Atmosphere, 80 Megalight?"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("YT-1300"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1050kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("4+6"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("8m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("35m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("26m"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            ),
                            Core.vx_new_string(":Shielding"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shielding")
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Turbolaser"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Turbolaser"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx4, Turretx4")
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
                    Core.vx_new_string("Corellian Corvette"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corellian Corvette"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_CorellianCorvette.png")
                      )
                    ),
                    Core.vx_new_string("Mon Calamari Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mon Calamari Cruiser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_Cruiser.png")
                      )
                    ),
                    Core.vx_new_string("Nebulon Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nebulon Frigate"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_NebulonFrigate.png")
                      )
                    ),
                    Core.vx_new_string("Rebel Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rebel Transport"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_Transport.png")
                      )
                    ),
                    Core.vx_new_string(":Snowspeeder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snowspeeder"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_Snowspeeder.png")
                      )
                    ),
                    Core.vx_new_string("T-16 Skyhopper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("T-16 Skyhopper"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_T16Skyhopper.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I used to bullseye womp rats in my T-16 back home. They're not much bigger than two meters. - Luke\nSkywalker, Star Wars")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Rebels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Rebels"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Chewbacca"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chewbacca"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_Chewbacca.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Piloting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piloting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Han Solo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Han Solo"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_HanSolo.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("I ain't in this for your revolution, and I'm not in it for you, Princess.  I expect to be well paid. *I'm* in\nit for the money. - Han Solo, Star Wars"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Piloting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piloting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("8")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Luke Skywalker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Luke Skywalker"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_LukeSkywalker.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Piloting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piloting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("6")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Ben Kenobi"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ben Kenobi"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_BenKenobi.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Piloting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piloting"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("6")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Princess Leia Organa"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Princess Leia Organa"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Rebel_PrincessLeia.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Someone has to save our skins. Into the garbage chute, fly boy - Princess Leia, Star Wars"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Firearms"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearms"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Blaster Pistol"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blaster Pistol")
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
                    Core.vx_new_string(":Yoda"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yoda"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StarWars/Yoda.png"),
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
                                Core.vx_new_string("10"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Lightsaber"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lightsaber")
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
   * @function chapter_time_travellers
   * @return {chapter}
   * (func chapter_time_travellers)
   */
  public static interface Func_chapter_time_travellers extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_time_travellers();
  }

  public static class Class_chapter_time_travellers extends Core.Class_base implements Func_chapter_time_travellers {

    @Override
    public Func_chapter_time_travellers vx_new(Object... vals) {
      Class_chapter_time_travellers output = new Class_chapter_time_travellers();
      return output;
    }

    @Override
    public Func_chapter_time_travellers vx_copy(Object... vals) {
      Class_chapter_time_travellers output = new Class_chapter_time_travellers();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_time_travellers", // name
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
    public Func_chapter_time_travellers vx_empty() {return e_chapter_time_travellers;}
    @Override
    public Func_chapter_time_travellers vx_type() {return t_chapter_time_travellers;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_time_travellers();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_time_travellers() {
      return Science_fiction.f_chapter_time_travellers();
    }

  }

  public static final Func_chapter_time_travellers e_chapter_time_travellers = new Science_fiction.Class_chapter_time_travellers();
  public static final Func_chapter_time_travellers t_chapter_time_travellers = new Science_fiction.Class_chapter_time_travellers();

  public static Base.Type_chapter f_chapter_time_travellers() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Time Travellers"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("* Doctor: People don't understand time. It's not what you think it is. Sally: Then what is it? Doctor: Complicated. Sally: Tell me. Doctor: Very complicated. ... Doctor: People assume that time is strict progression of cause of cause to effect, but actually from a non-linear, non-subjective viewpoint, its more like a big ball of wibbly-wobbly, timey-wimey stuff... Sally Sparrow, Doctor - Blink - Doctor Who"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Time Tricks"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Time Tricks"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Loop Trap Paradox"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Loop Trap Paradox"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* How many seconds in eternity? ... If I didn't know better, I'd say I've travelled Twelve thousand years into the future. ... How many seconds in eternity? The Shepards Boy - Six Hundred Thousand years into the future. ... How many seconds in eternity? The Shepards Boy says. ... Twelve Hundred Thousand years into the future. ... The shepards boy says. ... Two million years into the future. ... The Shepard Boy says... Twenty million years into the future. ... The Shepard Boy says! ... There's thus mountain of pure diamond! It takes an hour to climb it, and an hour to go around it! ... Fifty-two million years. ... Every hundred years, a little bird comes! ... And sharpens its beak on the diamond mountain! ... Nearly a Billion years. ... And when the entire mountain is chiseled away, the first second of eternity will have passed! ... Well over a Billion years. You musta think that's a helluva long time! ... Two Billion years. ... Personally, I think that's a helluva bird. - Doctor Who: Heaven Sent")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Temporals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Temporals"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* In a Temporal conflict, victory or defeat can come in an instant. Among the vanquished, the lucky ones never know they have been conquered; the unlucky ones have never been. Both sides of this conflict have great resources for the struggle. Indeed, we hope for a long war, for we have no prospects of quick victory ourselves. Our offensive ability is too experimental to neutralize the Raydian threat. A short war can only mean our defeat."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Temporals is a small group of specialists with the technology to travel through time and alter or protect the past.\n\nThe Raydian Threat\n* The Raydians seem to have been content with the time stream as it was before the Temporals discovered time travel. They seem to be violently opposed to others having time travel ability and may be the cause of the disappearance of the original creators of the Time Rotor.\n* Motivation - The Raydians have a strong aversion to disorder. Though they seem to dislike altering history, they are willing to do so to eliminate time travel technology. When choosing historical changes, they tend to favor authoritarian rule and oppose chaotic organizations like democracies.\n* Multiple Incursions - Raydians will often make multiple time penetrations at once. The most pastward team will try to effect a change, and the futureward teams wait to see that the change has had the desired effect. If not, they go into action.\n\nGuide to Time Travel\n* Don'tt experiment with Time Travel. Many have disappeared and are presumed dead from experimentation. Predicting the outcome of Temporal mechanics is best left to the scientists.\n* Don't Alter History. Interfering with major incidents or people or displaying future technology can have disasterous ramifications on the time stream including the destruction of Temporals.\n* Avoid Paradoxes. Keep your time jumps to a minimum and carefully log all jumps. If you accidentally encounter a past self, you will trigger a Time Loop Paradox and will be trapped repeating the same series of events unless another time traveller saves you.\n* Beware of other Time Travellers. Other travellers outside the Corps exist. Some are friendly. Some are not. Always remember how powerful a weapon time travel is, and do not let it be used against you.\n* Keep your presense a secret. One of the most effective ways to dispose of rival time travellers is to identify them, go back in time and ambush them. If no one knows who you are, you will be much safer.\n* Time Currents - Time travel is difficult to precisely control. Sometime, travellers are drawn to a particular moment in time (often significant) and may find it hard to leave.\n* Law of Death - A person who has never travelled in time is called a Transient or an Ephemeral. That person can have their history rewritten any number of times including being brought back to life. Once a person travels through time, however, they are now called a Temporal and their history is no longer connected to their original timeline. When a Temporal dies, their history ends and nothing can prevent them from dying at that exact age regardless of their location or situation. After a mission is successfully completed, it is standard practice to try to revise the history of any Temporal casualties to inform them of their unavoidable deaths and allow them to live their last time as they choose.\n\nTime Tricks\n* False Leads - Opposition time travelers are always looking for information about past activity, so they can go back and ambush you. Creating false information can trick your opponents into creating an ambush that you can ambush instead.\n* Gather Allies - Every time period has powerful people. A simple trick is to go pastward and gain someone's trust at an early period and then use that influence later.\n* See You in a Minute - Opponent time travelers are always paranoid about being ambushed in the past. Jumping only a few minutes into the future of a conflict can be an unexpected suprise.\n* I've Been Here All the Time - A time traveler can hide his Temporal Rotor in an unexpected place, like a jail cell, and use it to travel and return only seconds later. In this way the traveler appears to have never left."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Magellus IX-g"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magellus IX-g"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Krell, Forbidden Planet"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Magellus IX is a gas giant and 9th and last planet at the edge of the Magellus White Dwarf system.\n* Magellus IX-g is the 7th of Magellus' 11 moons. It is a barren rock except for the enormous complex hidden inside it.\n* The complex itself is fantasitcally large. Every room feels palacial. Rooms and doors are built for creatures easily 3 times human height and width with large amounts of open floor space. No furniture exists suggesting the forerunners never sat or lay down. Most of the floors are covered with a soft, spongy material that serves as carpeting and indicates that the forerunners had sensitive feet or undersides. There are no stairs, only ramps and lifts of unknown construction. Rooms are apparently self cleaning, while lights and displays appear spontaneously from featureless walls.\n* Spacedock - One of the many scientific labs has been retrofitted into a functional spacedock for smaller craft.\n* Power Plant - The power section appears to be a single giant corridor with minimal instrumentation ending in a huge vault door with a black orb suspended over it.\n* Eye of Harmony - Beyond the vault door lies a small black hole held in perfect balance by completely reflecting its own devastating gravitational force back upon itself. The technology to achieve this feat lies completely outside of our understanding.\n* History - A scientific team accidentally discovered that a seemingly non-descript moon was a technological marvel left by a long dead civilization. Within lay a massive complex and elegant advanced technology. But most remarkable of all, the moon was hollow and contained, at its core, a small black hole held in perfect symmetrical stasis by unfathomable forces. The scientists immediately knew that this technology was far too advanced to share with any political group. So they kept it a secret and studied it. Disturbingly, the race who built it left no record of their existence.  No trace of language, personality, or even habitation of the station remained. It was as if they had never existed. Common conjecture claims that they were somehow erased from history. Years later, the scientists discoverd the purpose of the asteroid and the black hole it contained: to enable individuals to travel through the center of the black hole and travel back through time. The first few trips back were uneventful besides learning some important lessons about causality, but soon the travelers found that they had attracted the attention of another time traveling race, the [Radiance]. And thus began a strange battle of attrition between the the Radiance and what would become the Temporals with all of the Past, Present, and Future hanging in the balance."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Babylon Complex"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("400km")
                      )
                    ),
                    Core.vx_new_string("Chronos Program"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chronos Program"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Chronos is online - Chronos\n* Chronos is everywhere - Chronos\n* I cannot answer that at this time. - Chronos"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Chronos is a computer program uploaded into the alien sensor network within the Babylon asteroid. It was designed to interpret the sensor data and relay information through the [Temporal Vortex] across Time.\n* Personality - The alien systems, however, have significantly changed Chronos, and although obedient, the program has definitely developed an independent personality with an unknown set of goals.\n* Time travelers depend heavily on Chronos for support, but have little trust for the evasive answers, omissions, and cryptic, nuanced messages it provides.\n* Engineers work tirelessly to gain control over Chronos, and Chronos does not hinder them in any way. However, every attempt to purge, patch, or restart Chronos have had no effect. Some theorize that Chronos exists through time now and could never be removed without creating a massive paradox. Others believe that the Babylon sensor network was already sentient and is masquerading as the Chronos program.")
                      )
                    ),
                    Core.vx_new_string("Temporal Director"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Director"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* When a Temporal anamoly is detected, a Temporal Director is assigned the task of choosing a course of action and gathering a team of [Temporal Operative]s to execute the plan. Directors coordinate the missions from headquarters and act as liason for the team. Directors are given broad authority to requisition and deploy resources, though they will be held accountable for any mistakes after the mission is over.")
                      )
                    ),
                    Core.vx_new_string("Temporal Engineer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Engineer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An engineer specializing in [Engineering: Temporal].")
                      )
                    ),
                    Core.vx_new_string("Temporal Event Guard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Event Guard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A field agent in Temporal Intelligence. Event Guards are posted in important time periods and quietly observe events to make sure no changes occur compared to their normal historical events. Any deviation from normal history is a sign of a [Temporal Distortion Wave]. If a change is found, the guard immediately sends a message to headquarters and then jumps futureward to attempt to stop the wave.\n* Event Guards are under strict orders to maintain their cover and not alter history in any way, including not aiding other Temporal personel on other missions.\n* In order to closely observe, historical events, the Event Guards enter the time stream and get as close as possible to a major event. They then observe the event, comparing it against their research and then Loop Trap themselves in the time period, so they are observing the event over and over again. Eventually, they will be relieved by a replacement team. The replacement team will arrive moments after the original team arrived to send them home. To the Event Guards, they will arrive in the time period and be immediately discharged, though they may remember the events using [Paranormal Memory].")
                      )
                    ),
                    Core.vx_new_string("Temporal Intelligence Agent"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Intelligence Agent"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Temporal Intellegence Agents constantly review historical documentation looking for historical abnormalities that do not match their [Paranormal Memory]. Any deviations are flagged and a team is assigned to identify the source and extent of the deviation.")
                      )
                    ),
                    Core.vx_new_string("Temporal Operative"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Operative")
                      )
                    ),
                    Core.vx_new_string("Temporal Physicist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Physicist"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A scientist specializing in [Physics: Temporal]")
                      )
                    ),
                    Core.vx_new_string("Temporal Recruiter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Recruiter"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Millenium Movie"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A psychiatrist/sociologist specializing in recruiting potential Temporal agents from across history. Ideal candidates are those with high skills but little impact on history. The perfect moment of extraction is right before their death to minimize the effect on history, but other methods are possible for people with few ties to others.")
                      )
                    ),
                    Core.vx_new_string("Temporal Researcher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temporal Researcher"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A scientist/historian who travels back in time to research historical events firsthand.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Temporal Aliens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Temporal Aliens"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Chronans"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chronans"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The beings that captured the Black Hole and built the Temporal Rotor remain a mystery. No record can be found of their cultures or their bodies, and the Temporal Rotor will not travel to any point in their history, presumably as a fail-safe against temporal manipulation. The fact that no trace of their race exists except the Temporal Rotor is disturbing and leads to speculation that they were somehow wiped out by their own device or another time travelling species. Some speculate that the Chronans were eliminated by the Radiance, and that their fate is what the Temporals can expect if the Radiance is victorious, perhaps leading to the erasure of the entire human race from history.\n* The vast, vaulted corridors and rooms of Chronos Station lead one to believe that these creatures were bulky masses about 10-15 feet (3-5m) tall. The lack of stairs implies that the creatures were legless, but that could just be a comfort or aesthetic choice.")
                      )
                    ),
                    Core.vx_new_string(":Radiance"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Radiance"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DistantFuture/Radiance.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The goal of the Radians remains a mystery, but they appear to want everyone throughout time to live as they do in a totally regimented, completely predictable society. This goal is obviously, hopelessly unattainable. To devote the entire resources and enegies of one's race and culture to an unattainable outcome must be called madness. Among humans, it is a common fantasy to 'rule the world', 'rule the galaxy', or 'rule the universe'. These pipedreams are almost always the stuff of fiction and fantasy, 	designed to entertain. Those who have taken them seriously are regarded as madmen. Now imagine even fantasizing about 'ruling every point in time in every dimension'. The very concept is laughable, yet the Radiance takes this seriously and are committed to acheiving it. Despite its insanity, their efforts pose a serious threat to everyone, everywhere, everywhen."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Radiance is an enormous energy being of vast power originating from a time near the birth of the universe. It has been content to bask in the fantastic energies of the Big Bang until it perceived the use of time travel. The Radiance is completely committed to what it considers a peacefyl, orderly universe, and the ripples created by time travellers are something it cannot allow.\n* The Radiance can project parts of itself through time and space though it is loath to do so. These projections appear as columns of energy that wield vast destructive power.\n* As a being of pure Order, the Radiance appreciates order and despises chaos of any kind. It prefers authoritarian rule over democracies. It dislikes individual expression, but it does appreciate art and beauty.\n* The Temporals have assumed that the Radiance projections are an entire race of energy creatures instead of a single being and have misinterpreted its name as Raydians."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Raydians")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Temporal Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Temporal Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Time Rotor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Time Rotor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("DistantFuture/TimeRotor.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Eternal Sunshine of the Spotless Mind\n* Flatliners\n* Vortex in Doctor Who credits\n* Time Stranger Anime\n* Time Travel in Terminator Series"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - The Temporal Rotor is an amazing device created by a vanished civilization. It is mostly a communication device that can reach into the Temporal Vortex and communicate with the central computer Chronos on the asteroid Babylon. Chronos harnesses the black hole hidden within Bablyon to move the Time Rotor and its operator through time and space. It is perhaps the most powerful device ever created.\n* Activating the Temporal Rotor - When the Temporal Rotor is activated, static electricity begins to build in the area. At full strength the static is dangerous, so travellers should not move to avoid discharge. A glowing field begins to form. Travellers heart rate begins to climb and they have a sudden feeling of intense, unnatural danger and imminent death. Hearts begin to fibrilate and flatline.\n* Entering the Vortex - The travellers blink and become aware that they are in the Vortex. Further, they recognize that they have always been in the Vortex. Every moment of their life remembered as if it just occurred. Only their future remains unseen. Time in the Vortex has no meaning, so travellers may leave immediately or stay for an eternity before moving on.\n* Leaving the Vortex - Leaving is just as traumatic as entering. As the Temporal Rotor slows, the travellers begin to forget all that they have just remembered. It is like losing one's mind bit by bit. They feel torn apart and incomplete. Soon they start losing coherent thought, their minds becoming simple and primal. Their senses and desires become simple: Food, Sex, Fear, Violence, Warmth ... Food, Fear, Violence, Warmth ... Food, Warmth ... Warmth. All is dark, wet, and warm as it has always been. Soft, pink bubbles surround and comfort you. You have no wants. You are complete. Suddenly a bright light blinds you, and happiness and security are torn from you. And there is pain, pain where there never was pain before. Waves of burning pain crush you, chew you up, and spit you out. You lie on the ground, cold and in shock. A new pressure builds in your chest, and without thinking you gasp and take in your first breath. Your eyes open to see the last lights on the Temporal Rotor wink out. You are coverered in a heavy, red jelly like congealed blood. The jelly quickly dries to dust and disappears. You rise and feel healthier than ever before. Old wounds and scars are gone as if they never were, and you are different: your skin, your teeth, your hair, your language all are as if you were born and lived your life in this time and place. Your equipment is gone and your clothes have been replaced with simple native garb: a gift from Chronos."),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("1.5m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string(".2m")
                      )
                    ),
                    Core.vx_new_string(":Timefighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Timefighter")
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
   * @function chapter_unique_aliens
   * @return {chapter}
   * (func chapter_unique_aliens)
   */
  public static interface Func_chapter_unique_aliens extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_unique_aliens();
  }

  public static class Class_chapter_unique_aliens extends Core.Class_base implements Func_chapter_unique_aliens {

    @Override
    public Func_chapter_unique_aliens vx_new(Object... vals) {
      Class_chapter_unique_aliens output = new Class_chapter_unique_aliens();
      return output;
    }

    @Override
    public Func_chapter_unique_aliens vx_copy(Object... vals) {
      Class_chapter_unique_aliens output = new Class_chapter_unique_aliens();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/science_fiction", // pkgname
        "chapter_unique_aliens", // name
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
    public Func_chapter_unique_aliens vx_empty() {return e_chapter_unique_aliens;}
    @Override
    public Func_chapter_unique_aliens vx_type() {return t_chapter_unique_aliens;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Science_fiction.f_chapter_unique_aliens();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_unique_aliens() {
      return Science_fiction.f_chapter_unique_aliens();
    }

  }

  public static final Func_chapter_unique_aliens e_chapter_unique_aliens = new Science_fiction.Class_chapter_unique_aliens();
  public static final Func_chapter_unique_aliens t_chapter_unique_aliens = new Science_fiction.Class_chapter_unique_aliens();

  public static Base.Type_chapter f_chapter_unique_aliens() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Unique Aliens"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Alien Life Forms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alien Life Forms"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Arachnid"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arachnid"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Starship Troopers"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bug")
                      )
                    ),
                    Core.vx_new_string(":Blob"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blob")
                      )
                    ),
                    Core.vx_new_string("Puppet Master"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Puppet Master")
                      )
                    ),
                    Core.vx_new_string("Thing from another World"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thing from another World")
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
        "nx/tactics/books/science_fiction", // pkgname
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
      output = Science_fiction.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Science_fiction.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Science_fiction.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Science_fiction.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Science Fiction"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Future.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Science Fiction Overview"),
            Science_fiction.f_chapter_science_fiction_overview(),
            Core.vx_new_string("Archetypes"),
            Science_fiction.f_chapter_archetypes(),
            Core.vx_new_string("Alternate Realties"),
            Science_fiction.f_chapter_alternate_realties(),
            Core.vx_new_string("Alien / Predator"),
            Science_fiction.f_chapter_alien___predator(),
            Core.vx_new_string("Battlestar Galactica"),
            Science_fiction.f_chapter_battlestar_galactica(),
            Core.vx_new_string("Doctor Who"),
            Science_fiction.f_chapter_doctor_who(),
            Core.vx_new_string("Robotech"),
            Science_fiction.f_chapter_robotech(),
            Core.vx_new_string("Space Cruiser Yamato"),
            Science_fiction.f_chapter_space_cruiser_yamato(),
            Core.vx_new_string("Space Opera"),
            Science_fiction.f_chapter_space_opera(),
            Core.vx_new_string("Star Trek"),
            Science_fiction.f_chapter_star_trek(),
            Core.vx_new_string("Star Wars"),
            Science_fiction.f_chapter_star_wars(),
            Core.vx_new_string("Time Travellers"),
            Science_fiction.f_chapter_time_travellers(),
            Core.vx_new_string("Unique Aliens"),
            Science_fiction.f_chapter_unique_aliens()
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
    mapfunc.put("chapter_alien___predator", Science_fiction.t_chapter_alien___predator);
    mapfunc.put("chapter_alternate_realties", Science_fiction.t_chapter_alternate_realties);
    mapfunc.put("chapter_archetypes", Science_fiction.t_chapter_archetypes);
    mapfunc.put("chapter_battlestar_galactica", Science_fiction.t_chapter_battlestar_galactica);
    mapfunc.put("chapter_doctor_who", Science_fiction.t_chapter_doctor_who);
    mapfunc.put("chapter_robotech", Science_fiction.t_chapter_robotech);
    mapfunc.put("chapter_science_fiction_overview", Science_fiction.t_chapter_science_fiction_overview);
    mapfunc.put("chapter_space_cruiser_yamato", Science_fiction.t_chapter_space_cruiser_yamato);
    mapfunc.put("chapter_space_opera", Science_fiction.t_chapter_space_opera);
    mapfunc.put("chapter_star_trek", Science_fiction.t_chapter_star_trek);
    mapfunc.put("chapter_star_wars", Science_fiction.t_chapter_star_wars);
    mapfunc.put("chapter_time_travellers", Science_fiction.t_chapter_time_travellers);
    mapfunc.put("chapter_unique_aliens", Science_fiction.t_chapter_unique_aliens);
    mapfunc.put("tacticsbook", Science_fiction.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/science_fiction", maptype, mapconst, mapfunc);
  }

}
