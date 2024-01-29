package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Fantasy {

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
        "nx/tactics/books/fantasy", // pkgname
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
      output = Fantasy.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Fantasy.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Fantasy.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Fantasy.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Fantasy"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("DaveDormanEasternTerritories.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Fantasy Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantasy Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Elder Tongue"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elder Tongue"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Prefixes\n* Alf - Elf\n* Dverg - Dwarf\n* Hel - Dead\n* Jotun - Giant\n* Man - Human\n* Muspel - Fire\n* Nifl - Mist\n* Svart - Dark\n* Yo - Demonic\nSuffixes\n* Ar - Race\n* Heim - Home\n* Ki - Soul\n* Ma - Creature\n* Traum - Dream\nWords\n* Alfar - Elvish Race\n* Albtraum - Elf Dream (Nightmare)\n* Alfheim - Land of Elves\n* Dvergar - Dwarven Race\n* Helar - Restless Dead\n* Helheim - Land of the dead\n* Manar - Human Race\n* Manheim - Land of Men\n* Muspelheim - Land of Fire\n* Niflheim - Land of Ice\n* Svartalfheim - Land of Dark Elves\n* Yoki - Demon Soul\n* Yoma - Demon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Genshin Impact"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Genshin Impact"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Archons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archons"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Furina"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Furina"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Focolor")
                              )
                            ),
                            Core.vx_new_string(":Nahida"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nahida")
                              )
                            ),
                            Core.vx_new_string("Raiden Shogun"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Raiden Shogun"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Raiden Shogun is the current Electro Archon. There are actually 3 versions of the Shogun that look almost identical: The twin sisters Ei and Makoto, and the artificial duplicate called the Puppet.\n* Makoto (Baal) - Makoto and Ei shared the title of Electro Archon, pretending to be a single being. Makoto was the diplomat and Ei was the warrior. Ei carried a sword, but she was not known to be a great warrior. Her electro powers were her main ability. Makoto died during the battle of Khaenri'ah.\n* Ei (Baalzebub) - Ei considered herself to be Makoto's shadow and mostly served as her muscle. After Makoto's death, she constructed the Puppet, tranfered her spirit into her sword, and mostly allowed the puppet to rule in her stead. Ei is divinely skilled in combat.\n* Puppet - The puppet is an advanced alchemical creation with power and combat ability perfectly equal to Ei in every way. Generally, the puppet is the only version of the Shogun that anyone sees. Even when Ei is in control, she is controlling the puppet, since she no longer has her own physical form.\n* Feats of Power\n** Musou no Hitotachi - A supposedly unblockable sword attack from the Shogun that is her supreme attack.\n** She easily defeats the traveller and nearly kills them.\n** She easily executes Signora and incinerates her.\n** She slew the god Orobashi and split the islands apart. Residual Electro still makes this area dangerous over 2000 years later.\n** She creates a perpetual storm around Inazuma for years.\n** She states that she can casually stop storms across the world to let people sleep."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Baal, Baalzebub, Ei, Makoto, Puppet, Shadow")
                              )
                            ),
                            Core.vx_new_string(":Venti"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Venti"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Barbados splits the mountains in Mondstadt with a divine wind and sends entire mountains flying to become the Golden Apple Archepelego.\n* Barbados is easily considered to be the weakest of the Archons."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Barbados")
                              )
                            ),
                            Core.vx_new_string("Zhong Li"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zhong Li"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zhong Li dominated the Archon War."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Morax, Rex Lapis")
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
            Core.vx_new_string("God of War"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("God of War"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("God of War Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("God of War Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Kratos"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kratos"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Fantasy/Kratos.png")
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
            Core.vx_new_string("Lord of the Rings"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lord of the Rings"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Lord of the Rings Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lord of the Rings Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Galadriel"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Galadriel"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* If you ask it of me, I will give you the One Ring. You offer it to me\nfreely? I do not deny that my heart has greatly desired this. In the\nplace of a Dark Lord you would have a Queen! Not dark but beautiful and\nterrible as the Dawn! Treacherous as the Seas! Stronger than the\nfoundations of the Earth! All shall love me and despair! ... I passed\nthe test. I shall diminish, and go to the west, and remain Galadriel.\n- Frodo and Galadriel - Lord of the Rings")
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
            Core.vx_new_string("Nexus Fantasy Characters"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nexus Fantasy Characters"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Nexus Fantasy Actors"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nexus Fantasy Actors"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Antios Teron"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Antios Teron"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Human Spy\n* Antios is a spy for Lord Aramel.\n* He is currently disguised as a mercenary for hire while travelling through the Imperium to assess their defenses. He has been authorized to assassinate any high ranking politician he should encounter to disrupt\nlocal politics. His mission has no time limit, and he is periodically scried by Lord Aramel's wizards.\n* He is a convincing actor who can play most parts well. He is particularly ruthless about his identity and will silence any who might compromise him or his mission."),
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
                                        Core.vx_new_string("5"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Broad Sword"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Broad Sword")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Espionage"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Espionage"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("5")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Blackguard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blackguard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An elite mercenary cadre organized by Hetman Undrig.\n* Their base is a small, walled town dedicated to their needs.\n* The Dragoons are a loose group. Decisions and leaders are chosen by majority vote. Power can change at anytime (including during combat).\n* Dragoons pay no dues nor is there direct pay. The Dragoons make money by hiring out as mercenaries.  They charge double normal rates, but are reknowned for their excellent training and equipment. Dragoons take great pride in their high status and react poorly to those who do not recognize their talent.\n* Dragoons are trained professionals in their jobs and recognize the need for discretion. They care little for whether a job is legal or not, and the Dragoons are known for possessing certain 'subtle' skills that make covert missions possible. They do not, however, enjoy excessive risk and are not above abandoning very dangerous missions."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Black Dragoon")
                              )
                            ),
                            Core.vx_new_string("Charn Aramel"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Charn Aramel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Human Dread Knight"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Nighthook, Lord Aramel"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Conviction"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Conviction"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("10")
                                      )
                                    )
                                  )
                                ),
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
                                        Core.vx_new_string("16"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Great Sword"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Great Sword"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("Ravage")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Psychic Powers"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Psychic Powers"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("10")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Sarani Kalea"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sarani Kalea"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Human Priestess"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Princess Kalea, High Priestess of Kali"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Conviction"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Conviction"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("12")
                                      )
                                    ),
                                    Core.vx_new_string(":Invocation"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Invocation"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("16"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Aspecting"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Aspecting")
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
                                    Core.vx_new_string("Mental Powers"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mental Powers"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("12")
                                      )
                                    ),
                                    Core.vx_new_string("Psychic Powers"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Psychic Powers"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("12")
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
            Core.vx_new_string("Material Realm"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Material Realm"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Those places we can measure and understand.\n* The universe of Nexus Fantasy is different from the real world. The world is called Ur and the stars are all different planes of existence separated by the void of space and the Ether.\n* The Material Realm is described by coordinates for +x, +y, +z, +t (length, height, width, time)\n* Aeur - The sky (Aeurfolk)\n* Fyur - Flame (Fyurfolk)\n* Mur - The oceans (Murfolk, Murmen)\n* Ur - The land (Urfolk, Urmen)\n* The Primes"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Areth, Archea, Gaia, Koltho, Material Realm, Middle Earth, Middle Kingdom, Middle Realm, Midgard, Mortal Realm, Mother Earth"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Azteka"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azteka")
                      )
                    ),
                    Core.vx_new_string(":Maya"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Maya")
                      )
                    ),
                    Core.vx_new_string(":Mandragora"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mandragora"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mandragora is named for the unusual sentient plant-life, the Mandragore, who live here.\n* Mandragores - About three feet high and vaguely man-like, they are roughly humanoid in form with gnarled root-like limbs and leafy 'hair'. Their eyes are like dark knots and their mouths are like the twisted hollow of a tree. The Mandragore usually stand rooted and immobile during the day as they soak in sunlight. During this time, they are well camoflaged among the other plant-life. At night, they move about tending their chores and looking for trespassers who they attempt to capture with nets of vines and grasses. Their unfortunate victims are bound and buried alive as fertilizer.\n* Abilities - The Mandragore are weak fighters who rely on surprise and numbers to battle large foes."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mandragore Herbalist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mandragore Herbalist"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Naturalism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Naturalism"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Warp Wood"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Warp Wood")
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
                                    Core.vx_new_string("Physical Weakness"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Physical Weakness"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Vulnerable to Fire"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Vulnerable to Fire")
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
                    Core.vx_new_string(":Wilderlands"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wilderlands"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Americas"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Aberrant Rainforest"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aberrant Rainforest"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Aberrant Rainforest is a weird and grotesque jungle the freakish origins of which are attributed to a magical mishap of unparalleled proportions.\n* All manner of rare and exotic vegetation can be found here, though nothing that grows here is as nature intended. The plants and trees appear heedless of natural law, growing to immense proportions or becoming gnarled and twisted in form. From the underbrush, animate tentrils of tanglewood reach out to ensnare the incautious. Among the reports of talking Mang trees, giant species of slugs and scavenger slimes, and strange insect-reptile hybrids are tales of intelligent plant creatures.\n* Murky streams flow uphill, stagnant ponds move slowly across the land, and the ground itself seems to pulse as if it were alive.\n* Because many varieties of unique and valuable herbs grow throughout the forest, visitors are not unknown.")
                              )
                            ),
                            Core.vx_new_string("Lost Sea"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lost Sea"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Salt Flats"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Deep within the Wilderlands is a flat wasteland known as the Lost Sea. This area appears to be a dry seabed littered with the ancient skeletons of giant aquatic monsters. The area gets little rain and is layered in salt from the former sea, so nothing lives here. It is said that the wrecks of ancient ships can be found in isolated places potentially carrying treasures from ancient civilizations.")
                              )
                            ),
                            Core.vx_new_string("Lost World"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lost World"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Land that Time Forgot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Deep within the Wilderland jungles is a towering ridge of a massive caldera formed\nby an ancient volcano. Within the caldera is a large expanse of jungle cut off from\nthe outside world for millions of years. Numerous creatures though to be extinct still\nsurvive in this safe haven."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pangaea")
                              )
                            ),
                            Core.vx_new_string("Salt Flats"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Salt Flats")
                              )
                            ),
                            Core.vx_new_string("Sea of Glass"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sea of Glass"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The sea of glass is a vast expanse of mostly flat glass. The sea was presumably\nformed by a massive firestorm detonating over a sandy desert, but no cause had been\ndiscovered. Travelling over the glass is similar to travelling over ice though the\nglass is much harder and the weather is very hot. The glass creates a blinding glare\nwhen the Sun is at the right angle, and the surface can seem like a giant frying pan\nunder the noonday Sun.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Azteka"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Azteka")
                              )
                            ),
                            Core.vx_new_string(":Maya"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Maya")
                              )
                            ),
                            Core.vx_new_string(":Mandragora"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mandragora"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mandragora is named for the unusual sentient plant-life, the Mandragore, who live here.\n* Mandragores - About three feet high and vaguely man-like, they are roughly humanoid in form with gnarled root-like limbs and leafy 'hair'. Their eyes are like dark knots and their mouths are like the twisted hollow of a tree. The Mandragore usually stand rooted and immobile during the day as they soak in sunlight. During this time, they are well camoflaged among the other plant-life. At night, they move about tending their chores and looking for trespassers who they attempt to capture with nets of vines and grasses. Their unfortunate victims are bound and buried alive as fertilizer.\n* Abilities - The Mandragore are weak fighters who rely on surprise and numbers to battle large foes."),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Mandragore Herbalist"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mandragore Herbalist"),
                                        Core.vx_new_string(":unitpowermap"),
                                        Core.f_new(
                                          Base.t_unitpowermap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Naturalism"),
                                            Core.f_new(
                                              Base.t_unitpower,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Naturalism"),
                                                Core.vx_new_string(":unitabilitymap"),
                                                Core.f_new(
                                                  Base.t_unitabilitymap,
                                                  Core.t_anylist.vx_new(
                                                    Core.vx_new_string("Warp Wood"),
                                                    Core.f_new(
                                                      Base.t_unitability,
                                                      Core.t_anylist.vx_new(
                                                        Core.vx_new_string(":name"),
                                                        Core.vx_new_string("Warp Wood")
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
                                            Core.vx_new_string("Physical Weakness"),
                                            Core.f_new(
                                              Base.t_unitskill,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Physical Weakness"),
                                                Core.vx_new_string(":unitabilitymap"),
                                                Core.f_new(
                                                  Base.t_unitabilitymap,
                                                  Core.t_anylist.vx_new(
                                                    Core.vx_new_string("Vulnerable to Fire"),
                                                    Core.f_new(
                                                      Base.t_unitability,
                                                      Core.t_anylist.vx_new(
                                                        Core.vx_new_string(":name"),
                                                        Core.vx_new_string("Vulnerable to Fire")
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
            ),
            Core.vx_new_string("Realms Beyond"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Realms Beyond"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Reality is just your mind collapsing under what it doesn't understand, silly. - Zoe, Runeterra"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The realms beyond our mortal existence.\n* It is the origin of our souls, dreams, and imagination. It is also the home of spirits and demons.\n* All of the different realms are like closely packed soap bubbles. Where the bubbles touch, realms touch, and the presense of those realms can be felt.\n* The Realms Beyond are described by coordinates for +/-x, +/-y, +/-z, +/-t, +/-i (length, height, width, time, imaginary)\n* Realm Types:\n** Universe: +x, +y, +z, +t, 0i\n** Positive Planes: +x, +y, +z, +t, +i\n*** Hyperspace is when you travel through the Positive Planes: +i\n** Void -x, +y, -z, -t, +i\n** Antiverse: -x, -y, -z, +t, 0i\n** Limbo +x, -y, -z, +t, -i\n** Negative Planes +x, +y, +z, +t, -i\n*** Umbra/Subspace connects the Negative Planes -i\n** Temporal Realms +/-x, +/-y, +/-z, +/-t, 0i"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Multiverse, Realties, Realms"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Pandemonium"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pandemonium"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Dante's Inferno"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Pandemonium (literally the Place of All Demons), the capital of Hell, the High Capital, of Satan and his Peers, built by the fallen angels at the suggestion of Mammon. The demons built it in about an hour, but it far surpassed all human palaces or dwellings. It was also reputed to be made of solid gold."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pandaemonium, Place of All Demons"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Council-Chamber of Pandæmonium"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Council-Chamber of Pandæmonium"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Stygian Council debates here.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Phyrexia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phyrexia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* We must improve! We must evolve! - Victor, Runeterra\n* Metal is perfection. - Victor, Runeterra"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Yawgmoth"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yawgmoth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Father of Machines, Ineffable")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Outer Realms"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Outer Realms"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Event Horizon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These are the various part of the Spirit Realm where demons live. It is unclear whether these worlds are in distant parts of our dimension or in other dimensions entirely. They are certainly so distant that only dimensional travel can reach them.\n* Physics are often radically different from our own which often is sanity threatening."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Abyssal Realms, Chaos Realms, Demon Realms, Hells"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Hell of Being Cut to Pieces"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Being Cut to Pieces"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Souls who arrive here fall into a sea of razor-sharp blades that spin and cut sinners to shreds.\n* Souls - The domain is a place for those who make a living by violence.")
                              )
                            ),
                            Core.vx_new_string("Hell of Being Skinned Alive"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Being Skinned Alive"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If there is a worse place, no one has yet found it. At a glance it appear as a desert world, but it is infinitely worse. The winds have sculpted the rocks and mesas into horrifying shapes. Those who can see through the sandstorms can see demonic forms torturing souls, but their screams are covered by the winds.\n* The howling winds that forever whip across the red sands are enough to strip flesh from bone. Shards of glass and metal blown on these sonic-velocity winds can penetrate tank armor.\n* The winds frequently become funnel clouds sucking sand and souls miles up before letting them plummet onto the jagged rocks below.\n* The constant motion of wind and sand builds up electric charge, and victims are regularly subjected to bolts of lightning.\n* At first, the winds only flay only the body, but the worst is yet to come. Once flesh and muscle fall from the bones, the very essence of his being begins peeling off, layer by layer to be carried off in the winds. The only peace is when the winds subside, and the flayed bodies regenerate in these precious seconds. But once the pain begins to subside, the winds start howling again...\n* Souls trapped here are often those who hoarded and abused power. Such individuals are tormented after death by having everything ripped from them.\n* Tou Mu - The Yama King, Tou Mu, watches from her enormous upside-down palace high in orbit. Those that the Iron Empress takes note of are drawn up by the winds to the cold silent vacuum above. There she expresses her dissatisfaction personally.\n* Silent Stronghold - Her orbiting palace is where her allies stay, but as Tou Mu is paranoid, the crystal of this place renders unguarded thought into sound which echoes throughout the palace.\n* Sinister Fortress - One of the few structures on the surface of this hell, this iron fortress courses with the lightning that constantly strikes it. On the outer walls are lashed the bodies of those that Tou Mu has taken a special interst. Here they are constantly torn by winds and struck by lightning. The Iron Empress has never removed a victim from the wall since the first traitor was lashed there.")
                              )
                            ),
                            Core.vx_new_string("Hell of Boiling Oil"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Boiling Oil"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The name of this hell is a misnomer. The hell is not filled with boiling oil, but rather with rendered human fat. Gobbets of charred and burning fat float atop the ocean of thick, bubbling grease. A dark gray froth of overcooked scum floats to the surface in places.\n* The atmosphere is hazy with brown smoke and a fine mist of grease. The stench is intolerable. Individuals who manage to survive vomit uncontrollably. Those few who manage to leave this realm never entirely rid themselves of the smell.\n* This hell is the place of torment for the gluttonous. Corpulent executives and rotund bureaucrats are haunted by the excesses of their lives.\n* Ruler - This realm is ruled by Hluh, an island-sized, gelatinous, bright red jellyfish with sharp-toothed sucker mouths on each tentacle.\n* Devils - The devils of this have no names, no faces, and no sense of self. They realm resemble chitinous tapeworms or gigantic water striders that skim acoss the surface of the boiling sea.")
                              )
                            ),
                            Core.vx_new_string("Hell of Burrowing Maggots"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Burrowing Maggots"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A quick glance reveals this place to be a vast plain of white sand. There is no sun, but the overcast sky is not dark. The sand, however, is crawling. The stench of decay staggers any so unfortunate as to need to breathe.\n* Souls - This is a place of torment for sinners who have met their end by disease including radiation poisoning, cancer, and biological warfare. Boils and tumors grow enormous here and hang from the body and attract the maggots. Within days a soul can feel her skin crawl. Everywhere the worm-ridden souls cry out, tearing at their skin, and vainly trying to escape the worms that are eating them alive.\n* Ruler - Rangda, the Mistress of Pestilence rules here.\n* Demons - Maggots grow larger as they age. The largest of them are the size of a whale.\n* The Great Beast - What appears to be a large white mountain is actually an enormous carcass of an unknown beast. The maggots have been devouring it since the hell was created, and it appears it will take an eternity to complete the job. What the beast is is unknown. Some believe it is tied to creation and the the universe will cease when it is comsumed. A foolish mage once studied it from a distance, but days later he returned screaming gibberish and only said two coherent words before he took his own life: 'It moved.'")
                              )
                            ),
                            Core.vx_new_string("Hell of Seven Burning Seas"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Seven Burning Seas"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If would be hard to chose a worse fate, burning or drowning. Those souls doomed to this hell do both. They may stay above water and have their garments burst into flame or submerge and boil themselves.\n* Souls - This hell houses sinners whose crimes involve the water. Pirates, polluters, mutineers, and murderers who drowned their victims are drawn here.\n* Ruler - No one has seen the Empress of Pearls who is rumored to live at the greatest depths of the Great Trench where no other creature can survive. Some believe she is a great 'devil-fish' that can cause tsunamis.\n* Devils - Devil crabs, devil sharks, and devil squid are some of the horrors that populate the depths.")
                              )
                            ),
                            Core.vx_new_string("Hell of Upside-Down Sinners"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell of Upside-Down Sinners"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This domain defies description. This is either the cleverest of the Yomi realms or the maddest hell devised by the sickest of minds. Time and space are inverted. Sensation and thought are twisted. Minutes pass like an eternity and millenia rush by in a blink of an eye. In this hell, the strong perish and the weak survive. That which is dull cuts while sharp objects bring comfort.\n* Souls - Recent arrivals are often driven mad as they begin to see odors, smell sounds, and hear sights. Emotions too become jumbled. Souls begin to hate those who helped them and love those who have done them wrong. They fear the helpless and refuse to flee certain destruction. Skills and powers do not work correctly here. The stronger the ability the more ineffectual it is.\n* Ruler - No one knows what inconceivable creature would create such a realm.")
                              )
                            ),
                            Core.vx_new_string("Hell: Kakuri, The Night Realm"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell: Kakuri, The Night Realm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* There is no end to the darkness in the Night Realm. There is no sun, no stars. The winds are bitterly cold, bearing dagger-sharp ice crystals. Facing into the wind is blinding. Fires flicker and die in the winds, but any light attracts the tormented and Shikome alike. The terrain is rocky and frozen black crystal that leech the energy of those who rest on them. Meadows and tree exist, but they are covered with dark crytal blades that tear at passersby.\n* Kakuri is the hell of those who have lost their honor. The land is therefore the anti-thesis of honor. There are no great battles, no great challenges, no bragging enemies. There is no duty, no honor, and no way to escape. There are no flesh eating devils, no pits of burning oil, no grand ministries of torment. In a land without hope, there don't need to be.\n* Ruler: Emma-o, perhaps the greatest of the Yama-kings.\n* Shikome: Beautiful, cold, female devils that delight in speeding their victims to despair. They are subtle and can appear as tormented souls or as friends or lovers. Whatever their form, they will drain the [Spirit] from their victims leaving them to wander in hopelessness and despair.\n* Kyuden No Kakuri - The Castle of Kakuri is the stronghold of Emma-o.  It is situated at the top of an unassailable peak. The castle has elaborate obsidian walls and are a testament to his vanity and conceit.\n* Cave of Maidens - One of Emma-o's favored traps, the caves appear an oasis from the icy torment and occasionally a way out of Yomi. Edible fungi, shelter, and pretty prisoners can be found in the caves. The prisoners will dote on the visitors, but they will suddenly accuse them of theft, rape, murder, or worse. The visitors are beaten and driven from the caves. The power of the Shikome lets them trick their victims again and again with the lure of false hope. Amazingly, there is actually a chance that a cave is actually an exit from the Hell, the ultimate lure for lost souls.")
                              )
                            ),
                            Core.vx_new_string("Hell: Pit of Iron and Salt"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell: Pit of Iron and Salt"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Pit is a vast salt mine with seemingly no bottom. Iron citadels dot the inside of the pit, so the pit resembles a great gaping maw with the citadels resembling teeth. The landscape is unchanging and sterile. It is not a place of shock or disgust, but a hell of quiet oppression.\n* Souls - Those who labor here do so in the false hope that through hard work they will eventually be relieved of their suffering. They search for treasure they will never find beneath the lashes of cruel overseers.  Cuts and lashes are inflamed by the salt everywhere.\n* Ruler - Yama-king Wu Hua lives at the the bottom of the pit in a great iron city surrounded by six enormous barbed spires on which hundreds of bodies are impaled. Sputtering greenish fires can be seen from a distance that hint at grotesque rituals and obscene torments, but what exactly goes on inside is unknown.\n* Iron Citadels - The citadels are places of decadence and depravity. The souls are intermittently rotated from the mines to the citadel to act as slaves. Most mine workers view the change as desirable, but every soul chosen learns that this is not the case. In reality, the souls are treated worse here than anywhere else in the domain. Their suffering is more valuable to Wu Hua because it is so much more 'personal'.")
                              )
                            ),
                            Core.vx_new_string("Hell: Wicked City"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hell: Wicked City"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wicked City is a place of endless urban blight stretching to the horizon in all directions. The perpetually overcast air is dark and thick with acrid vapors and burning smog. The stench of urine, vomit, blood, and excrement blows out of every alley. The streets and buildings are packed with the souls who mindlessly slave away in inescapable agonies and the power-mad demons who torment them.\n* Souls - This hell is the destination of those who have fallen into the corruption, isolation, and anoymity of urban life. Politicians, artists, criminals, wage slaves, executive, and police are pulled into the sweat shops and dark streets of this doomed megalopolis. The souls are worked beyond their limits, and when they falter or fail the foremen arrive instantly to punish them for their incompetence. Their routine jobs continue day after day with no hope of improving their lot, and their pitiful wages allow them to almost support themselves. Those that fail to keep up are laughed out of their offices and become the homeless of Wicked City, available for demons and embittered salary drones to beat, torture, or set ablaze. There are no safe places in Wicked City. Every coworker could be a demon. Even the doomed may betray each other for advancement. It is a place where the worst elements of greed and capitalism meet.\n* Ruler - The Yama-king Mikaboshi rules this realm from the Mikaboshi Tower. The tower is a hideous tower of blackened steel and glass whose peak disappears into the clouds. Mikaboshi's executives administer Wicked City from this lofty tower, and Mikaboshi himself is often linked directly into the tower's strange devices allowing him to see, hear, and feel any part of Wicked City.\n* Undercity - The twisted spires are built atop the crumbling temples and castles of eras past. The cities are built upon cities upon cities, and the farther down one goes, the more monstrous the demonic inhabitants. Some creatures have not seen the sky in centuries. What these monsters have become is unknown, but no one who has entered the abandoned tunnels and subways has returned sane (if they return at all).\n* Feng Shui - The Yama-king Mikaboshi wants all those who see his city to understand his grand vision of a hellish metropolis. He undermines the known and comfortable trapping of the daily world to increase his subjects' feelings of dread and suffering, and his power over them. The feng shui of the Wicked city is beyond negative, bordering on the impossible. The entire landscape assaults the Chi of the city's victims. 'Poison Arrows' point everywhere, spiraling in directions that cause veritgo from the merest glance. Disharmony saps the will and impedes rational thought.\n* Gates - It is possible to travel to Wicked City from many of the worst urban hellholes in the mortal world. In these places of corruption and anguish, the [Veil] is weak. The door also swings both ways and denizens of this hell sometimes travel to the mortal realm in search of new souls.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Pandemonium"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pandemonium"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Dante's Inferno"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pandemonium (literally the Place of All Demons), the capital of Hell, the High Capital, of Satan and his Peers, built by the fallen angels at the suggestion of Mammon. The demons built it in about an hour, but it far surpassed all human palaces or dwellings. It was also reputed to be made of solid gold."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pandaemonium, Place of All Demons"),
                                Core.vx_new_string(":locationmap"),
                                Core.f_new(
                                  Base.t_locationmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Council-Chamber of Pandæmonium"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Council-Chamber of Pandæmonium"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Stygian Council debates here.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Phyrexia"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phyrexia"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* We must improve! We must evolve! - Victor, Runeterra\n* Metal is perfection. - Victor, Runeterra"),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Yawgmoth"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Yawgmoth"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Father of Machines, Ineffable")
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
            Core.vx_new_string("Story Ideas"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Story Ideas"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Accompany zealots on a pilgrimage to holy places.\n* Participate in a Witch Hunt in the forests.\n* Protect an individual of status from the assassin's guild.\n* Go on patrol with Knife Fighters\n* Sail to obtain concubines, either legally or illicitly. Be wary of the creatures and brutish males, to say nothing of the subtle charms of the concubines themselves.\n* Join the desert scouts in raids against the Black Mystics.\n* Commission tomb raiders to unearth ancient sarcophagi.\n* Sail the far seas in search of adventure, braving corsairs, cannibals, sea serpents, and the black hulled vessels of the Necromancers.\n* Mine green crystal from the Sea of Glass.\n* Visit Sactuary the safe haven of thieves and scoundels.\n* Prowl the jungles looking for rare herbs and black diamonds.\n* Rescue a captive of the Witchmen who keep shrunken heads as grisly trophies.\n* Visit the Ice Castles of the north and fight side by side against the Ice Giants.\n* Trade with the Sea Nomads of Oceanus, a city that floats freely on the water.\n* Take a windship to the isle of Phantas and visit the Cabal Magicus, home of the Phantasian Dream Merchants.\n* Travel to the Jade Empire and visit the capital Tian called the Golden City for good reason.\n* Hire a guide and search for the buried city of Necron where legend has it an entire city and its populace were once interred.\n* Visit the magical fair, a gala festival attended by magicians, wizards, and charaltans from across the continent. Engage in a duel for wagers with a reknowned spell caster or haggle for potions, powders, and other rare items.\n* Negotiate a deal with a Zuran moneylender to finance an expedition in return for a cut of the profits.\n* Attend the Festival of the Bizarre where individuals display oddities and compete in the contest for the title of 'Most Bizarre'.\n* Accompany a Wizard Hunter on a quest of revenge.\n* Partake in the 'Night of Fools' when all laws are suspended for a single evening.\n* Help locate a suitable applicant for the Battle of Champions or enter the competition yourself.")
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
    mapfunc.put("tacticsbook", Fantasy.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/fantasy", maptype, mapconst, mapfunc);
  }

}
