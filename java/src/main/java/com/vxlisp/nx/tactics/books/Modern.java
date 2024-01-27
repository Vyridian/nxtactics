package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Modern {

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
        "nx/tactics/books/modern", // pkgname
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
      output = Modern.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Modern.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Modern.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Modern.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Modern.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Aerial Warfare"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Aerial Warfare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Jet Planes\n* Stealth Fighters\n* Unmanned Aerial Vehicles (UAV)\n* Air Cavalry\n* Flying Fortress\n* Landing Strips\n* Aircraft Carriers\n* Machine Guns\n* Strafing\n* Tank Killing\n* Stealth Bombing\n* Strategic Bombing\n* Nuclear Bombing\n* Cruise Missiles\n* Fuel Air Explosives\n* Intercontinental Ballistic Missiles (ICBM)")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Cold War"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cold War"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("British Ground Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("British Ground Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("QF 20 Pounder"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("QF 20 Pounder")
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
            Core.vx_new_string("Modern Ground Vehicles"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Ground Vehicles"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Snowcraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Snowcraft"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 75% Load, on Snow no Terrain Penalty and 150% Speed, off Snow +1 Terrain Penalty.\n* Icecraft - On Ice no Terrain Penalty and 200% Speed, off Ice cannot move."),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Iceskates"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iceskates"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Unpowered, Icecraft")
                              )
                            ),
                            Core.vx_new_string("Ice sailboat"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice sailboat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Medium, Sail, Icecraft")
                              )
                            ),
                            Core.vx_new_string(":Skis"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skis"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                              )
                            ),
                            Core.vx_new_string(":Snowboard"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowboard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                              )
                            ),
                            Core.vx_new_string(":Snowshoes"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowshoes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Unpowered, Snowcraft")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dog Sled"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dog Sled"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Unpowered, Offroad, Snowcraft")
                              )
                            ),
                            Core.vx_new_string(":Snowmobile"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowmobile"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Offroad, Snowcraft")
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
            Core.vx_new_string("The Abyss"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("The Abyss"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Abyss Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Abyss Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Construction Submarine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construction Submarine")
                              )
                            ),
                            Core.vx_new_string("Big Geek"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Big Geek")
                              )
                            ),
                            Core.vx_new_string("Little Geek"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Little Geek")
                              )
                            ),
                            Core.vx_new_string("Navy Seal"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Navy Seal")
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
            Core.vx_new_string("Modern Space"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Space"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Space Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Space Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Astronaut"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astronaut")
                              )
                            ),
                            Core.vx_new_string("International Space Station"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("International Space Station")
                              )
                            ),
                            Core.vx_new_string("Space Shuttle"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Shuttle")
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
            Core.vx_new_string("Modern Cops and Robbers"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Cops and Robbers"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Crime Gangs"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Crime Gangs"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Mafia"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mafia")
                              )
                            ),
                            Core.vx_new_string("Tong Gangs"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tong Gangs"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Tongs are local street gangs.")
                              )
                            ),
                            Core.vx_new_string(":Triads"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Triads"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The Triads are like the [Yakuza] offering protection to the locals.  This protection normally comes in the form of crushing the competition on the triad's businesses.  Unlike the [Yakuza], the triads deal in slavery and are more open in their illegal dealings.  Enforcement is very brutal.")
                              )
                            ),
                            Core.vx_new_string(":Yakuza"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yakuza"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Besides weapons and drugs, the Yakuza are the neighborhood protection in many areas and do so far more efficiently than the police. Contrary to the attitudes protrayed in Hollywood, the Yakuza make justice swift and fair for the people they deal with. It has done this way for longer than the United States has been around. The Yakuza is not about random violence and mayhem. It is about order and discipline. Of course, many of the younger members have cast aside traditions and have become violent thugs. Like the Triads, the Yakuza was originally a response to the feudal lords when those who were not samurai had no rights or safety.")
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
            Core.vx_new_string("Modern Mercenaries"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Mercenaries"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Blackrock\n* Millenium's End"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Mercenaries\nSmuggling\nSoldiers of Fortune\nVIP Bodyguards"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Black Eagle Security"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Black Eagle Security"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Black Eagle is a large security firm offering 'specialists for hire'. They maintain a strong reputation for effectiveness, discipline, and discretion. Their fees are high, but they are the gold standard when dealing with critical situations on a moment's notice.\n* Black Eagle is based in Atlanta, Georgia. It maintains branch facilities in Miami, Dubai, the Phillipines, and South Africa.\n* Black Eagle provides contract security teams to guard embassies for major countries. They also can be engaged for\ndeniable covert actions including: smash and grab, target removal, and cyber espianoge.\n* Black Eagle is very careful to maintain deniability in all of its activities. It does not have business cards or\nletter-head or logos. Its personnel are all independent contractors who are always paid by the job, in cash. There is 	always a risk that Black Eagle personnel will be captured, killed, or imprisoned. Black Eagle values loyalty above all\nelse and will go to great lengths to prove itself when its own people get in trouble.\n* The true secret to Black Eagle's success is its information network. The company maintains a large database of 'persons of interest' along with psychological profiles and potential future value. Whenever possible, Black Eagle will trade favors instead of cash. They proactively offer help to key individuals who are in trouble, so they can count on those people for help in the future. Black Eagle has influence among numerous politicians, lobbyists, lawyers, judges, military personnel, police, prison guards, prisoners, criminal informants, as well as numerous ordinary people who serve as their eyes and ears on the street.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("The Prisoner"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("The Prisoner"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Where am I? You are at the village. Who do you work for?  That would be telling. What do you want? Information. You won't get it. By hook or by crook, we will. Who are you?  I am number 2. Who is number 1? You are number 6. I am not a number. I am a free man. Ha ha ha ha. - The Prisoner\n* Be seeing you. - The Prisoner")
              )
            ),
            Core.vx_new_string("Special Ops"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Special Ops"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Special Ops\nBlack Ops\nDeniable Insurgencies\nImpossible Missions\nHostage Rescue")
              )
            ),
            Core.vx_new_string("Modern Spies"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Spies"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Spy Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spy Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("CIA Agent"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("CIA Agent")
                              )
                            ),
                            Core.vx_new_string("NSA Agent"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("NSA Agent")
                              )
                            ),
                            Core.vx_new_string(":Terrorist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terrorist")
                              )
                            ),
                            Core.vx_new_string("Aaron Jorgenson"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aaron Jorgenson"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wealthy Norwegian shipping magnate with subsidiaries in petroleum products, trucking, and pharmaceuticals.\n* He is an ultra-conservative and has served several terms in public office.\n* He was married and divorced (his wife died of natural causes soon after the divorce).\n* He has no heirs or family.\n* At 56, he is also dying of an inoperable brain tumor.\n* His greatest possessions are his fabulous collection of artwork in his luxurious mansion.\n* Personality - Mr. Jorgenson is an arrogant and selfish man. He is a self-made man and believes that the strong deserve to take what they can and that the weak deserve their lot. He idolizes men of action, especially his Viking ancestors. With only a short time left to live, he has dedicated his fortune to a spectacular plan that would make him a modern day Viking.")
                              )
                            ),
                            Core.vx_new_string("James Bond"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("James Bond"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mr. Bond, you persist in defying my efforts to provide an amusing death for you. - Hugo Drax, Moonraker\n* Do you expect me to talk. No, Mr. Bond. I expect you to die. - Auric Goldfinger and James Bond, Goldfinger"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("007")
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
            Core.vx_new_string("Modern Sports"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Sports"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Scenarios"),
                        Core.vx_new_string(":scenariomap"),
                        Core.f_new(
                          Base.t_scenariomap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Boxing Match"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boxing Match")
                              )
                            ),
                            Core.vx_new_string("Soccer Game"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soccer Game")
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
            Core.vx_new_string("Modern Warfare"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Warfare"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern African Ground Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern African Ground Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Technical"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Technical")
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
    mapfunc.put("tacticsbook", Modern.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/modern", maptype, mapconst, mapfunc);
  }

}
