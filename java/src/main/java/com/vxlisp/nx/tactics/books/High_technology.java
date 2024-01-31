package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class High_technology {

  /**
   * @function chapter_car_wars
   * @return {chapter}
   * (func chapter_car_wars)
   */
  public static interface Func_chapter_car_wars extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_car_wars();
  }

  public static class Class_chapter_car_wars extends Core.Class_base implements Func_chapter_car_wars {

    @Override
    public Func_chapter_car_wars vx_new(Object... vals) {
      Class_chapter_car_wars output = new Class_chapter_car_wars();
      return output;
    }

    @Override
    public Func_chapter_car_wars vx_copy(Object... vals) {
      Class_chapter_car_wars output = new Class_chapter_car_wars();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_car_wars", // name
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
    public Func_chapter_car_wars vx_empty() {return e_chapter_car_wars;}
    @Override
    public Func_chapter_car_wars vx_type() {return t_chapter_car_wars;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_car_wars();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_car_wars() {
      return High_technology.f_chapter_car_wars();
    }

  }

  public static final Func_chapter_car_wars e_chapter_car_wars = new High_technology.Class_chapter_car_wars();
  public static final Func_chapter_car_wars t_chapter_car_wars = new High_technology.Class_chapter_car_wars();

  public static Base.Type_chapter f_chapter_car_wars() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Car Wars")
      )
    );
    return output;
  }

  /**
   * @function chapter_cyberpunk
   * @return {chapter}
   * (func chapter_cyberpunk)
   */
  public static interface Func_chapter_cyberpunk extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_cyberpunk();
  }

  public static class Class_chapter_cyberpunk extends Core.Class_base implements Func_chapter_cyberpunk {

    @Override
    public Func_chapter_cyberpunk vx_new(Object... vals) {
      Class_chapter_cyberpunk output = new Class_chapter_cyberpunk();
      return output;
    }

    @Override
    public Func_chapter_cyberpunk vx_copy(Object... vals) {
      Class_chapter_cyberpunk output = new Class_chapter_cyberpunk();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_cyberpunk", // name
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
    public Func_chapter_cyberpunk vx_empty() {return e_chapter_cyberpunk;}
    @Override
    public Func_chapter_cyberpunk vx_type() {return t_chapter_cyberpunk;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_cyberpunk();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_cyberpunk() {
      return High_technology.f_chapter_cyberpunk();
    }

  }

  public static final Func_chapter_cyberpunk e_chapter_cyberpunk = new High_technology.Class_chapter_cyberpunk();
  public static final Func_chapter_cyberpunk t_chapter_cyberpunk = new High_technology.Class_chapter_cyberpunk();

  public static Base.Type_chapter f_chapter_cyberpunk() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Cyberpunk"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* The year is 2151.\n\nThings are pretty bad on planet Earth:\n* Global Warming - The build up of smothering greenhouse effect gases has resulted in the complete melting of the Arctic\nice cap as well as much of the Antartic ice cap.  Coastal areas have been inundated and global temperatures continue to\nrise, a new record every year.\n* Resource Depletion - As the climate changed, desperate farmers overfarmed their land, increasing erosion and therefore\nfood prices.  Fossil fuels became increasingly scarce and given the ongoing climate problems, ecologically unsuitable.\n* Overpopulation -\n* Economic Collapse -\n\nThings are slightly better in space:\n* Orbital Stations - For the last hundred years, large space colonies have been constructed at the five Lagrange points\naround Earth.  Relative to Earth, the Orbital stations are gleaming paradises of corporate efficiency.  Corporate\ninterests are certainly strong on the Orbital colonies, and the Orbitals increasingly chafe at Earth's taxation of their\ngoods and the high tariffs on imports.\n* Luna - Huge moon bases dot the lunar surface.  With its low gravity and limitless lunar rock, the Moon is the natural\nconstruction center for most Orbital facilities and spaceships.  Surface and underground mining operations go around the\nclock.  Enormous massdrivers propel the material into Earth orbit.\n* Mercury - Solar stations on Mercury provide limitless power while the molten\nsurface provides limitless ore. Though the surface is hellish and survival is\ndifficult, Mercury provides wealth beyond imagining to those able to survive.\nThe population is 90% male with most residents on a 6 year work contract. After\nthe contract they usually return to wherever they came from with enough money to\nbuy a house and start a family. Like a military veteran, Mercury companies also\noffer generous benefits for the rest of the contractor's life or generous death\nbenefits to their family if they don't survive. Despite extensive safety systems,\nthe fatatlity rate remains 1 in 20 even among these hardy folk. Politically,\nMercury is extremely independent and has little patience for the affairs of the\nother planets.\n* Venus\n* Mars\n* Asteroid Belt - Though Luna provides a steady supply of material to the colonies, whole Asteroids can be ferried from\nthe Asteroid Belt to create instant colonies.  Further, the valuable minerals in an asteroid are easier to detect and\nmine than in either Lunar or Terrestrial mines.  The Asteroid field is large, however, so a whole crop of freelance\nprospectors have travelled to the Asteroid Belt in a high-tech gold-rush.\n* Jupiter\n* Saturn\n\n* Cryomax - Maximum security prison where prisoners are stored in partial cryonic suspension to maximize space.\n** Reference - Demolition Man\n* Crystal - Liquid crystal computer matrix"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Government"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Government"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Innovator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Innovator"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Appleseed, Genetic Android, Bioroid"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Genetically engineered artificial human.\n\nTheoretically superior to humans in every way, they are purposely implanted\nwith a number of limitations:\n* They cannot reproduce.\n* They must undergo routine medical treatments or their genetic structure\nbreaks down.\n* They are peaceful in nature to buffer mankind's tendency to violence.\n* They defer to human authority unless they believe that the authority will\nharm mankind.")
                      )
                    ),
                    Core.vx_new_string("Cycle Police"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cycle Police"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Driving"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Driving"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4"),
                                Core.vx_new_string(":unitspecialtymap"),
                                Core.f_new(
                                  Base.t_unitspecialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Motorcycles"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Motorcycles")
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
                    Core.vx_new_string(":E.S.W.A.T."),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("E.S.W.A.T."),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Appleseed")
                      )
                    ),
                    Core.vx_new_string("Mobile Police"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mobile Police"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Appleseed")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Military"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Military"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Combat Android"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combat Android")
                      )
                    ),
                    Core.vx_new_string("Planetary Defense Navy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Planetary Defense Navy")
                      )
                    ),
                    Core.vx_new_string("Planetary Defense Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Planetary Defense Pilot")
                      )
                    ),
                    Core.vx_new_string("Eugenic Warrior"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eugenic Warrior"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Khan, Star Trek II"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Through bioengineering, an elite warrior caste has been created combining strategic genius, leadership skills,\nand physical perfection.  Unfortunately, they also develop incredible egos and megalomania."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Master Race, Super Soldier")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":MegaCorps"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("MegaCorps"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* After the world stock market crash and subsequent collapse of many economies and governments around the\nworld (including the US), only international corporations were left with the ability to exert power on a\nglobal scale.\n* The economic collapse acted as a purge, the strongest conglomerates consuming the weaker ones until only\nthe biggest and strongest remained. With most governments enfeebled and the competition obliterated, the\nmegacorps were left to fill a huge power vacuum. Naturally there was some disagreement as to how to divide\nthe spoils. The result was a series of wars as each corporation attempted to destroy its competition\nphysically and finacially. Smaller conflicts, covert and overt, continue to this day, with full scale war\nthreatening to resurface at any time."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Corporate Man"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corporate Man"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Collarboy, Company Man, Suit")
                      )
                    ),
                    Core.vx_new_string("Corporate Security"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corporate Security")
                      )
                    ),
                    Core.vx_new_string("System Administrator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("System Administrator"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cyber Engineer, Icemen, SysOp, SysAdmin, Weasel")
                      )
                    ),
                    Core.vx_new_string("Kildren Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kildren Pilot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Kildren are genetically modified before birth to halt the aging process.\nPhysically, they are eternally teenagers. Mentally, however, they are quiet\nand serious. A side effect of their frozen aging process is the inability to\nrecall distant memories. Kildren, therefore, lack a strong sense of time or\nthe past. They live for the now and are fearless pilots. For some, however,\nthe sense of timelessness lacks purpose and turns into hopelessness.")
                      )
                    ),
                    Core.vx_new_string(":Media"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Media"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ethnicity: Greek-American\n* Hair: Black Short Waved Hair\n* Eyes: Pale Grey\n* Clothes: Clean White Shirt under black leather thigh-length light-armored jacket (occasional loose tie), grey hardwearing slacks, black shoes or running sneakers, Aviator sunglasses when being 'too cool'.\n* Equipment: Beeper, Camera, Colt automatic pistol and shoulder holster, 1 room apartment\n* Contacts: Camera Man, Police Officer"),
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
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Pistol"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Medical Technician"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medical Technician"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Med Tech")
                      )
                    ),
                    Core.vx_new_string(":Scientist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scientist")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Offworld Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Offworld Colonies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Miner")
                      )
                    ),
                    Core.vx_new_string(":Pirate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pirate")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Sprawls"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sprawls"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Dirtboys, Dirtgirls"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bounty Hunter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bounty Hunter")
                      )
                    ),
                    Core.vx_new_string("Cyber Psycho"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyber Psycho"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Buttonhead - someone addicted to artificially stimulating the pleasure centers of the brain."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Buttonhead")
                      )
                    ),
                    Core.vx_new_string(":Enforcer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Enforcer")
                      )
                    ),
                    Core.vx_new_string(":Fixer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fixer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fixers buy and sell information, goods, and services.\n* Some of their services merely require the right connections.  Others are not quite legal."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bookie, Executive Secretary, Gobetween, Information Broker, Negotiator, Organizer, Producer, Roadie, Thirdman")
                      )
                    ),
                    Core.vx_new_string("Gang Member"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gang Member")
                      )
                    ),
                    Core.vx_new_string(":Netrunner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Netrunner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Outlaw computer jocks or hackers.  Some people do it for the glory; most do it for the money.  Information is\npower in the modern world and all the information is somewhere on the Net.  Further, the modern world is a marvel\nof automation, so a clever person may turn that automation to his own uses."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Crystaljock, Hacker")
                      )
                    ),
                    Core.vx_new_string(":Nomad"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nomad"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deltajock - A pilot of delta-winged smuggling craft\n* Panzerjock - A driver of armored smuggling hovercraft"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Deltajock, Gypsy, Linerunner, Panzerjock, Road Warrior, Smuggler")
                      )
                    ),
                    Core.vx_new_string(":Rocker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rocker"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Zonedancing - Dancing turned into a dominance game.  A dancer attempts to persuade other dancers in his zone to\nconform to his movements using charisma, talent or violence."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bard")
                      )
                    ),
                    Core.vx_new_string(":Solo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Solo"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I don't want to walk this Earth if I gotta do it solo...so...low. - Iyaz, Solo"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Assassin, Hit Man")
                      )
                    ),
                    Core.vx_new_string(":Tech"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tech"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cybertech")
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
   * @function chapter_cyberpunk_campaign
   * @return {chapter}
   * (func chapter_cyberpunk_campaign)
   */
  public static interface Func_chapter_cyberpunk_campaign extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_cyberpunk_campaign();
  }

  public static class Class_chapter_cyberpunk_campaign extends Core.Class_base implements Func_chapter_cyberpunk_campaign {

    @Override
    public Func_chapter_cyberpunk_campaign vx_new(Object... vals) {
      Class_chapter_cyberpunk_campaign output = new Class_chapter_cyberpunk_campaign();
      return output;
    }

    @Override
    public Func_chapter_cyberpunk_campaign vx_copy(Object... vals) {
      Class_chapter_cyberpunk_campaign output = new Class_chapter_cyberpunk_campaign();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_cyberpunk_campaign", // name
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
    public Func_chapter_cyberpunk_campaign vx_empty() {return e_chapter_cyberpunk_campaign;}
    @Override
    public Func_chapter_cyberpunk_campaign vx_type() {return t_chapter_cyberpunk_campaign;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_cyberpunk_campaign();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_cyberpunk_campaign() {
      return High_technology.f_chapter_cyberpunk_campaign();
    }

  }

  public static final Func_chapter_cyberpunk_campaign e_chapter_cyberpunk_campaign = new High_technology.Class_chapter_cyberpunk_campaign();
  public static final Func_chapter_cyberpunk_campaign t_chapter_cyberpunk_campaign = new High_technology.Class_chapter_cyberpunk_campaign();

  public static Base.Type_chapter f_chapter_cyberpunk_campaign() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Cyberpunk Campaign"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Cyberpunk Overview"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cyberpunk Overview"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Events Leading to War\n* Overview of the War\n* Aftermath")
              )
            ),
            Core.vx_new_string("Car Wars"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Car Wars"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Escort Duty"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Escort Duty"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An Agricorp has commissioned some independents to covertly escort an unmarked tractor-trailer 1900 miles from\ntheir site in La Jolla to a USDA facility near Nashville, TN.\n* A rival has sent its own independents to get their hands on the cargo.\n* Note: The cargo/escort is a decoy for the real shipment."),
                        Core.vx_new_string(":teammap"),
                        Core.f_new(
                          Base.t_teammap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Escort"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Escort"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("$1000/each if cargo delivered intact."),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 1 Tractor-trailer\n* 2 Sedans"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Prevent enemy from taking any of the shipment.")
                              )
                            ),
                            Core.vx_new_string(":Interceptors"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Interceptors"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("Capture the entire shipment."),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 1 Van\n* 3 Sedans"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Capture any of the shipment.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Safe House"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Safe House"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small-time fixer has evidence of the identity of a cyber serial killer, the Night City Stalker.  Two news\norganizations are bidding on the deal, but the loser contacted the Stalker out of spite.")
                      )
                    ),
                    Core.vx_new_string("Toxic Spill"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Toxic Spill"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* While guarding a 200 person Nomad camp, the well drill discovers a hidden toxic waste dump.  Alarms alert the\ndumping company that their little secret has been discovered, so they send a team to 'clean up' the problem.\n* The whole Nomad camp must evacuate 3 miles to town before they are silenced, unfortunately they do not have\nenough vehicles to do it in one trip.")
                      )
                    ),
                    Core.vx_new_string("The Heist"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("The Heist"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* In a winter storm, a shipment of Palladium is diverted to a small warehouse in a corporate park.  It will not\nbe moved until the weather turns, so it is a perfect opportunity to break in and steal the goods.\n* During the storm, the skies are dangerous, and even the roads are fairly dicey.  Snowmobile are certainly an\noption."),
                        Core.vx_new_string(":teammap"),
                        Core.f_new(
                          Base.t_teammap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Thieves"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thieves"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("Capture the whole shipment."),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 10 Thieves\n* 5 Snowmobiles\n* 3 Sedans"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Take at least half of the shipment.")
                              )
                            ),
                            Core.vx_new_string(":Guards"),
                            Core.f_new(
                              Base.t_team,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Guards"),
                                Core.vx_new_string(":completevictory"),
                                Core.vx_new_string("Protect the entire shipment."),
                                Core.vx_new_string(":forces"),
                                Core.vx_new_string("* 10 Armed and Armored Guards\n* 10 Unarmored, sleeping Guards\n* 5 Sedans\n* 2 Helicopters"),
                                Core.vx_new_string(":partialvictory"),
                                Core.vx_new_string("Protect at least half of the shipment.")
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
   * @function chapter_high_tech_aircraft
   * @return {chapter}
   * (func chapter_high_tech_aircraft)
   */
  public static interface Func_chapter_high_tech_aircraft extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_aircraft();
  }

  public static class Class_chapter_high_tech_aircraft extends Core.Class_base implements Func_chapter_high_tech_aircraft {

    @Override
    public Func_chapter_high_tech_aircraft vx_new(Object... vals) {
      Class_chapter_high_tech_aircraft output = new Class_chapter_high_tech_aircraft();
      return output;
    }

    @Override
    public Func_chapter_high_tech_aircraft vx_copy(Object... vals) {
      Class_chapter_high_tech_aircraft output = new Class_chapter_high_tech_aircraft();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_aircraft", // name
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
    public Func_chapter_high_tech_aircraft vx_empty() {return e_chapter_high_tech_aircraft;}
    @Override
    public Func_chapter_high_tech_aircraft vx_type() {return t_chapter_high_tech_aircraft;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_aircraft();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_aircraft() {
      return High_technology.f_chapter_high_tech_aircraft();
    }

  }

  public static final Func_chapter_high_tech_aircraft e_chapter_high_tech_aircraft = new High_technology.Class_chapter_high_tech_aircraft();
  public static final Func_chapter_high_tech_aircraft t_chapter_high_tech_aircraft = new High_technology.Class_chapter_high_tech_aircraft();

  public static Base.Type_chapter f_chapter_high_tech_aircraft() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Aircraft"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("High Tech Commercial Aircraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Commercial Aircraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hypersonic Airliner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hypersonic Airliner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Suborbital passenger plane that can make intercontinental flights at Mach 5+\n* Such high speed planes are all wedge shaped Hypersonic Waveriders.")
                      )
                    ),
                    Core.vx_new_string("Suborbital Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Suborbital Shuttle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Suborbital passenger plane that can reach the upper atmosphere and connect to an [Orbital Skyhook Satellite]'s\ntether.  The end of the tether holds a small wing shaped cargo container.  Passengers and cargo are quickly\nexchanged, and the container is reeled back up to the skyhook while the plane returns to its launch site.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Military Aircraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Military Aircraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Valkyrie Air Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Valkyrie Air Cavalry"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft")
                      )
                    ),
                    Core.vx_new_string("Aurora Transatmospheric Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aurora Transatmospheric Fighter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A sleek, shuttle-like jet with speeds of Mach 5. A nuclear engine, stealth armor, full environmental containment, and a virtual or direct neural link make this one-man craft the deadliest thing in the skies.\n* It carries twin 30mm autocannons, a plasma cannon, 16 air-to-air missiles, and 2 fuel air explosives for ground targets."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft")
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
   * @function chapter_high_tech_equipment
   * @return {chapter}
   * (func chapter_high_tech_equipment)
   */
  public static interface Func_chapter_high_tech_equipment extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_equipment();
  }

  public static class Class_chapter_high_tech_equipment extends Core.Class_base implements Func_chapter_high_tech_equipment {

    @Override
    public Func_chapter_high_tech_equipment vx_new(Object... vals) {
      Class_chapter_high_tech_equipment output = new Class_chapter_high_tech_equipment();
      return output;
    }

    @Override
    public Func_chapter_high_tech_equipment vx_copy(Object... vals) {
      Class_chapter_high_tech_equipment output = new Class_chapter_high_tech_equipment();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_equipment", // name
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
    public Func_chapter_high_tech_equipment vx_empty() {return e_chapter_high_tech_equipment;}
    @Override
    public Func_chapter_high_tech_equipment vx_type() {return t_chapter_high_tech_equipment;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_equipment();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_equipment() {
      return High_technology.f_chapter_high_tech_equipment();
    }

  }

  public static final Func_chapter_high_tech_equipment e_chapter_high_tech_equipment = new High_technology.Class_chapter_high_tech_equipment();
  public static final Func_chapter_high_tech_equipment t_chapter_high_tech_equipment = new High_technology.Class_chapter_high_tech_equipment();

  public static Base.Type_chapter f_chapter_high_tech_equipment() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Equipment"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Consumer Goods"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Consumer Goods"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Autobike"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Autobike"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Autonomous motorcycle used for most transit. A small fraction of the Autocar\nfleet is filled by Autobikes. Though slightly cheaper to rent than Autocars and\nbetter in tight traffic, most people use Autocars exclusively.")
                      )
                    ),
                    Core.vx_new_string(":Autocar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Autocar"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Autonomous car used for most transit. Ordinary citizens rarely own their own\nvehicles, instead they summon an automated rental car with their phone that takes\nthem directly to their destination. Autocars are parked throughout populated\nareas, so summoning one usually takes seconds. Autocars coordinate with each other\nand can travel at high speeds in tight traffic without incident.\n* History - Automated cars took over major cities within years of their invention.\nThey solved traffic, parking, accident, and environmental problems all at once\nwhile offering cheaper per mile travel than owning your own vehicle. They rapidly\nmade taxi and ridesharing solutions obsolete, and it soon became illegal for a\nhuman to drive a vehicle because autocars were so much safer. Soon all mass\ntransit systems reduced down to autocars and some autobikes.")
                      )
                    ),
                    Core.vx_new_string(":Cyberchip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyberchip"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Standard memory/application chip.  All media is stored on cyberchips and can be played by simply plugging the\nchip into any standard interface.\n* Plugging cyberchips directly into one's body is called 'Chipping In'.")
                      )
                    ),
                    Core.vx_new_string(":Cybercycle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cybercycle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* High performance motorcycle that allows direct neural interface.")
                      )
                    ),
                    Core.vx_new_string(":Cyberdeck"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyberdeck")
                      )
                    ),
                    Core.vx_new_string(":Cyberphone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyberphone")
                      )
                    ),
                    Core.vx_new_string("Direct Neural Interface"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Direct Neural Interface"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This implant includes a processor chip and interface plugs that connect directly to the brain.  The chip\ncontains an artificial intelligence avatar program that learns from and emulates the user's personality.  This\nAI can then enter cyberspace or control cybernetic equipment at the speed of a computer program while retaining\nthe decision making logic of its user.  Further, the AI regularly updates the user with its decisions, and\ngathers the user's impression, so it can make further decisions.  While 'Jacked In' the user is motionless as\nhis mind is overwhelmed with information from the AI.  DNI's are powerful tools, but are also risky technology.\nSince information floods into the mind at incredible speeds, any malfunction in the DNI or the AI can cause\nsanity threatening sensory overload or sensory deprivation that seem to last for days in mere seconds.\n* Burn Out - losing one's mind to DNI failure.")
                      )
                    ),
                    Core.vx_new_string(":Flitter"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flitter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Light, one-man helicopter"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aerogyro, Gyrocopter")
                      )
                    ),
                    Core.vx_new_string("Hover Board"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hover Board")
                      )
                    ),
                    Core.vx_new_string("Mag Lev Train"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mag Lev Train"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 200mph")
                      )
                    ),
                    Core.vx_new_string(":Metrocar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Metrocar"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ultra-subcompact reverse trike.")
                      )
                    ),
                    Core.vx_new_string("Mister Fusion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mister Fusion"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("HighTech/MrFusion.jpg")
                      )
                    ),
                    Core.vx_new_string("Quad ATV"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quad ATV")
                      )
                    ),
                    Core.vx_new_string("Private Quadcopter"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Private Quadcopter")
                      )
                    ),
                    Core.vx_new_string(":Skimmer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skimmer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The modern hovercraft creates a tightly computer-controlled air pocket beneath\nit that allows the Skimmer to move quickly over land or sea. The Skimmer\nmanipulates the pocket to change direction. Though fast and all-terrain, they are\nnot as quiet, maneuverable, or energy efficient as Autocars, so their use is\nlimited to lightly populated areas."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ground Effect Vehicle, Hovercraft")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Corporate Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Corporate Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cargo Osprey"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Osprey")
                      )
                    ),
                    Core.vx_new_string("Corporate Limosine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corporate Limosine")
                      )
                    ),
                    Core.vx_new_string("Corporate Osprey"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corporate Osprey"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 275knots\n* Range: 600miles\n* The Osprey is a tilt-wing propeller plane that is used as a\ncorporate commuter plane. Like a helicopter, it can land on\nbuildings, and it can also fly directly to nearby cities.")
                      )
                    ),
                    Core.vx_new_string("Personal Aerodyne"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Personal Aerodyne"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 250mph\n* Range: 400miles")
                      )
                    ),
                    Core.vx_new_string(":Transjet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transjet"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Transjet is the standard commercial airliner across the world. It flies up\nbeyond the atmosphere where it can travel at extreme speeds and then lands\nanywhere in the world within an hour."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hopper, Transatmospheric Jet")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Police Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Police Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aerodyne"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aerodyne"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Blade Runner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 350mph\n* Range: 400miles\n* Short and bulbous, the Aerodyne has the aerodynamics of a brick.  It relies on its huge jets to fly."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Air Car, Pegasus")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Military Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Military Equipment"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Combat Aerodyne"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combat Aerodyne"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed: 480mph\n* Range: 600miles\n* Armored combat Aerodyne")
                      )
                    ),
                    Core.vx_new_string("Barracuda Drone Submarine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Barracuda Drone Submarine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Carrier borne small, unmanned, high speed, attack submarine. It is designed as a long range drone that continually scouts the water surrounding a capital ship. Its tip is a HEAT shaped explosive, and it uses a particularly volitle fuel mix, so that it can be used as a torpedo if any serious threat enters its sphere of control.")
                      )
                    ),
                    Core.vx_new_string("Manta VTOL Fighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Manta VTOL Fighter"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Carrier Command: Gaea Mission"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Carrier borne VTOL Fighter. It has four redirectable thrusters that allow it to hover at any altitude including directly over water. It is fully sealed and can be launched and recovered underwater, but its underwater speed is poor. Its thrust is sufficient to ferry a Sea Lion ATV or other medium vehicle when necessary. It has a small, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, bombs, repair, apc, recon, science, transport, and more. Its mission module is interchangable with the Sea Lion Amphibious Tank.")
                      )
                    ),
                    Core.vx_new_string("Pelican VTOL Heavy Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pelican VTOL Heavy Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Land based VTOL transport plane. It has four redirectable thrusters that allow it to hover at any altitude including directly over water. It is fully sealed and can land and take off from water. It has a single landing deck on top to facilitate in-air refuelling and resupply of VTOL fighters. It has a large, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, bombs, repair, apc, recon, science, transport, and more. It is powerful enough to carry 1 heavy tank, 2 medium tanks, or 3 APCs. It is, however, a large target with limited armor, so it is not suitable for heavy fire situations.")
                      )
                    ),
                    Core.vx_new_string("Sea Lion Amphibious Medium Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea Lion Amphibious Medium Tank"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Carrier Command: Gaea Mission"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Carrier borne All Terrain Vehicle. It has six wheels that work equally well on water or land, but on water it augments its speed using a caterpillar drive. It is fully sealed and submerisble, but its underwater speed is poor. It has a small, replaceable mission module to custom tailor its missions for anti-air, anti-ship, anti-armor, anti-personnel, missile, repair, apc, recon, science, and more. Its mission module is interchangable with the Manta Fighter.")
                      )
                    ),
                    Core.vx_new_string("Sailfin Light Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sailfin Light Frigate"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fully Submersible Light Frigate loaded with 2 Barracuda Submarines.\n* Purpose - The Sailfin is a high speed interceptor and screening craft. It is equipped with anti-missile and small anti-ship weaponry as well as a large ECM suite.\n* Hydrofoils - Uses a Magnetohydrodynamic (MHD) to produce high speeds with little noise. It is designed in a catamaran configuration with hydrofoils and an air cushion effect to provide near flight."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Flying Fish")
                      )
                    ),
                    Core.vx_new_string("Hammerhead Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hammerhead Destroyer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fully Submersible Destroyer loaded with 2 Manta Fighters and 4 Barracuda Submarines.\n* Purpose - The Hammerhead is an all round escort ship for larger capital ships.")
                      )
                    ),
                    Core.vx_new_string("Mako Assault Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mako Assault Carrier"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Carrier Command: Gaea Mission"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fully Submersible Light Carrier loaded with 4 Manta Fighters, 4 Sea Lion ATVs, and 2 Barracuda Submarines. Uses a Magnetohydrodynamic (MHD) to produce high speeds with little noise.")
                      )
                    ),
                    Core.vx_new_string("Orca Medium Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orca Medium Cruiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fully Submersible Medium Cruiser loaded with 6 Manta Fighters, 1 Pelican Transport, 6 Sea Lion ATVs, and\n4 Barracuda Submarines.")
                      )
                    ),
                    Core.vx_new_string("Leviathan Command Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leviathan Command Carrier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Fully Submersible Heavy Carrier loaded with 12 Manta Fighters, 4 Pelican Transports, 6 Sea Lion ATVs, and\n8 Barracuda Submarines.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Body Armor"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Body Armor"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Stealth Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stealth Suit"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Nuclear launch detected... - Starcraft"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ghost Special Operative")
                      )
                    ),
                    Core.vx_new_string("Powered Body Armor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Powered Body Armor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Heavy Body Armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hard Suit")
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
   * @function chapter_high_tech_heavy_armor
   * @return {chapter}
   * (func chapter_high_tech_heavy_armor)
   */
  public static interface Func_chapter_high_tech_heavy_armor extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_heavy_armor();
  }

  public static class Class_chapter_high_tech_heavy_armor extends Core.Class_base implements Func_chapter_high_tech_heavy_armor {

    @Override
    public Func_chapter_high_tech_heavy_armor vx_new(Object... vals) {
      Class_chapter_high_tech_heavy_armor output = new Class_chapter_high_tech_heavy_armor();
      return output;
    }

    @Override
    public Func_chapter_high_tech_heavy_armor vx_copy(Object... vals) {
      Class_chapter_high_tech_heavy_armor output = new Class_chapter_high_tech_heavy_armor();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_heavy_armor", // name
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
    public Func_chapter_high_tech_heavy_armor vx_empty() {return e_chapter_high_tech_heavy_armor;}
    @Override
    public Func_chapter_high_tech_heavy_armor vx_type() {return t_chapter_high_tech_heavy_armor;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_heavy_armor();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_heavy_armor() {
      return High_technology.f_chapter_high_tech_heavy_armor();
    }

  }

  public static final Func_chapter_high_tech_heavy_armor e_chapter_high_tech_heavy_armor = new High_technology.Class_chapter_high_tech_heavy_armor();
  public static final Func_chapter_high_tech_heavy_armor t_chapter_high_tech_heavy_armor = new High_technology.Class_chapter_high_tech_heavy_armor();

  public static Base.Type_chapter f_chapter_high_tech_heavy_armor() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Heavy Armor"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("High Mobility Forces"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Mobility Forces"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Mobile - The term Mobile, short for High Mobility, was coined to describe forces that emphasized manueverability and terrain use over raw speed, weaponry, or armor.\n** Mobile Infantry - Human sized battle suits capable of increasing an infantry unit's combat ability. Early versions emphasized weapons and armor, but their high cost and attrition rate moved the focus to fast hit-and-run or blitzkreig style armor.\n** Mobile Suit - The Mobile Suit is an attempt to create a larger version of Mobile Infantry suits. They remain humanoid and can benefit from infantry tactics on a large scale. The design is a swiss army knife, capable of quickly changing and scavenging weapons and is equally suited for combat and large scale repair operations. The design does have many detractors, however, who argue that the humanoid form is not optimal for ground combat where its height makes it an easy target, air combat where it is not aerodynamic, or space combat where legs have little use.\n** Mobile Cavalry - Mobile Cavalry is any High Mobility vehicle that is optimized toward its intended enviroment: Mobile Fighters in atmosphere, Mobile Tanks on land, Mobile Subs underwater, Mobile Insects in space, etc. These system are highly specialized in contrast with the general utility of Mobile Suits. Though such designs seem more optimal, there is an argument that Mobile Suit mass production and spare part availability would ultimately win out.\n** Mobile Armor - The ultimate expression of High Mobility weapons, Mobile Armor are large, heavily armed and armored versions of Mobile Cavalry. They are terrifying monstrosities with similar reputations to the King Tiger tank in World War II. Though on paper, they seem to be the ultimate weapon, in practice their high cost and manufacturing complexity severly limited their deployment and losing even one was devastatingly costly. They can turn the tide of any battle, but were overall less effective than smaller units.\n* Linear Frame - The linear frame is a special harness that mimics the actions of the mobile suit pilot and translates them into mobile suit actions. This gives the mobile suit an uncanny agility and a strangely human grace. A trained pilot can shift the suit's center of gravity to change the armor's orientation without propellent which can substantially increase endurance and survivability.\n* Piloting - A mobile suit pilot wears a special suit and is secured to a linear frame that\nhelp manage the incredible g-forces that the mobile suit produces. Rookie pilots have been\nknocked unconscious or even killed by their own combat maneuvers, so extensive, specialized\ntraining is essential. Ace pilots seem almost superhuman in their ability to take physical\nstress without blacking out.\n* Mobile Suits vs. Capital Ships - Mobile suits have a unique ability against capital ships.\nThey can land anywhere on the surface of the ship (typically outside of firing arcs) and attack\ncomponents directly. Whenever a mobile suit on a capital ship score [Critical Hits], the player\nmay look at the damage deck and choose the critical instead of choosing one at random.\n* Flight Systems - Spacecraft and Exo-Suits use a ionic plasma drive which ionizes and\naccelerates gas particles out the exhaust vents at relativistic speeds. These energized\nparticles create a glowing stardust effect at the exhaust ports. These drives also function in\natmosphere but their interaction with air creates a massive heat buildup, so they can only be\nused in short bursts like jump jets. Unusually large vents with heat dispersers can be specially\ndesigned for atmosphere, but these are suboptimal in space.\n* Plasma Lance - The lance is a short mobile suit melee weapon. Its firing end is a hollow\nmagnetic tube lined with layers of copper leaf. When held in a specially designed hand or connector,\na direct current from the fusion reactor transforms the copper leaf into a short ionizing plasma jet\nof incompressible copper. The lance appears as an empty weapon hilt until it fires; then it flashes\nwith a brief, blinding jet that violently pierces almost any material it contacts. It is very\neffective against armor, but its uses are limited so they may only be used a few times before being\ndepleted. Mobile suits will often carry multiple lances, although larger variants exist.\n\nLand based Mobile Suits follow these principles:\n* Maintain a low profile - Weapons are so destructive that it is much more effective to not be hit. Stay low and use cover at all times. Tracked, Wheeled, Hover and 4 legged vehicles maintain the lowest profile while still being all-terrain.\n* High mobility - Slow, predictable units are sitting ducks. Also, move in 3 dimensions to maximize mobility. This makes legs and jump jets superior to tracks and wheels.\n* Projectile weapons are more effective on the ground than in space - High caliber cannons can be mounted on land vehicles.\n* Land based Mobile Suits developed from dog-like anti-personnel hunter-killer robots. As Electromagnetic Warfare began to defeat digital circuitry, it became necessary to put soldiers back into the war machines and return to larger, more reliable analog systems.\n\nSpace based Mobile Suits follow these principles:\n* Propellent must be expended to accelerate - a modern vehicle in space is more limited by its propellent than its fuel.\n* Arms and Legs are useful - When one part of a mobile suit is moved, it produces a counter-movement in the opposite direction. This effect can be used to adjust the mobile suit's direction without expending propellant. Thus, in zero gravity the mobile suit's arms and legs are not dead weight, but a vital component of its maneuvering system."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Armored Frame, Exo-Suit, MEC (Multi-Environment Cavalry), Mobile Armor, Mobile Cavalry, Mobile Invantry, Mobile Suit"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Piranha Mobile Armor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piranha Mobile Armor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The current state-of-the-art space mecha is a wedge-shaped, heavily-armored stealth craft with a turreted particle cannon.\n* Armor Module - The wedge-shaped front, bottom, and sides of the craft are a single hot-swappable module for in combat maintainance. It is primarily composed of ablative, stealth armor. The armor is sharply angled to present the smallest possible angle of penetration and detection from the front.\n* Core Module - The center of the craft is a gyroscopic sphere. The gyroscope is so powerful, it is used for attitude control instead of maneuver jets.\n* Core Drone Module - Like most mobile armors, the Piranha is deployed in large packs (schools) of drones with random human piloted command units. Without a pilot, the core module can contain spare ammo or propellent.\n* Core Pilot Module - The pilot seat is enclosed in this sphere which allows the craft to turn very quickly while rotating the pilot seat separately to minimize angular momentum and G-forces. The escape hatch can be rotated to the top or the bottom of the ship to allow easy exit or connect to ship airlocks.\n* Mission Module - The top and back of the craft contain the weapon systems, propulsion, and fuel in a single hot swappable module. This entire module can be immediately replaced to customize the craft for a mission or rapidly refuel and reload.\n* Space Interceptor Module - The standard space module includes a single heavy particle beam turret and nuclear propulsion (including fuel and reaction mass).\n* Space Bomber Module - This module is identical to the Space Interceptor Modules but replaces the turret with a fixed medium railgun and 2 heavy penetrator nuclear missiles.\n* Orbital Insertion Module - Though rarely used, this module allows the ship to reach orbit from a planet's surface using chemical rockets. The module is also capable of independent re-entry so it can be refueled and reused without the main craft.\n* Atmospheric Interceptor Module - Jet engines and anti-aircraft missiles. With this module, the ship is capable of trans-atmospheric flight. Though its wedge shape is aerodynamic, it provides no lift, so it must rely on its thrust to maneuver and to remain airborne.\n* Atmospheric Bomber Module - Jet engines and precision bombs.\n* Atmospheric Close Support Module - Jet engines and a single heavy penetrator autocannon.\n* Air Cavalry Module - Dual turbine rotor systems and fuel with 2 light rail cannons for rescue and light air support.\n* Land Module - A turret pairing a heavy rail cannon with a high capacity rail machine gun. The rear houses a missile pod housing 6 indirect fire missiles for light bombardment.\n* Marine Module - Marine caterpillar thrust system that allows high speed surface movement or moderate underwater movement with decent stealth.\n* Command Module - Advanced communications and coordiation systems.\n* Sensor Module - Specialized long-range active and passive sensor systems for patroling or spying.\n* Stealth Module - Enhanced stealth system foregoing firepower and performance for stealth. Contains a single medium rail cannon.\n* Science Module - Highly sensitive sensor package for detailed analysis.\n* Service Module - The ship has useful carrying capacity, so besides its combat role, it operates as a repair worker bee and cargo hauler. Typically, repair crews get more flight time on the ship than combat pilots.\n* Cargo Module - A large cargo container and thruster can be afixed to the rear for transport duties.\n* Long Range Module - A variant of the cargo container can be attached to the back of another module to increase the range of the ship providing extra thrust and reaction mass. The module is jettisoned once it reaches its target and is hopefully recovered later.\n* Arms - 6 thin, light-weight arms fold out from under the ship to the front, back, and sides. Each arm has 3 powerful fingers with magnetic clamps and sharp tips that allow the craft to cling to surfaces and walk along them at high speeds like an insect. The arms are strong enough to climb vertical surfaces or be inverted under gravity. The end of each arm has an attitude control jet to aid in high speed manuevers. On land, these jets are replaced with powerful turbines that lets the craft skate across level ground or water. The elbow of each arm is a sphere that can be used as landing gear or wheels on roads or other reasonably flat terrain. 6 arms were chosen, so the craft can still move on 4 arms while carrying or dragging a heavy load with 2. As with insects, 6 arms provides sufficient redundancy in case 1 or even 2 legs are lost to damage. In land combat, the arms allow the craft to maximize cover and peek its gun around corners or over obstacles."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Terrapin")
                      )
                    ),
                    Core.vx_new_string("Panther Mobile Cavalry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Panther Mobile Cavalry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The current state-of-the-art land mecha is a 4 legged style reminiscent of big cats or wolves.\n* Like most mobile armors, the Panther operates in packs of drones with random human piloted command units. The pilot climbs into the back of the unit and rides in the position of a performance motorcycle.  If desired, the pilot can open the back and sit up as if riding a horse. Piloted units sacrifice a hardpoint to fit the pilot.\n* Payloads such as large caliber cannons and shields are mounted on one of two fixed back mounts. This unit can also stand on 2 legs and slide the cannon up to become a shoulder mount. All 4 legs possess manipulative hands with claws and magnets for climbing and can carry the cannon or a shield as needed. Small wheels in the elbows are used when travelling on roads.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Land Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Land Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hover Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hover Tank")
                      )
                    ),
                    Core.vx_new_string("Light Walker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Walker")
                      )
                    ),
                    Core.vx_new_string("Heavy Walker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Walker")
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
   * @function chapter_high_tech_overview
   * @return {chapter}
   * (func chapter_high_tech_overview)
   */
  public static interface Func_chapter_high_tech_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_overview();
  }

  public static class Class_chapter_high_tech_overview extends Core.Class_base implements Func_chapter_high_tech_overview {

    @Override
    public Func_chapter_high_tech_overview vx_new(Object... vals) {
      Class_chapter_high_tech_overview output = new Class_chapter_high_tech_overview();
      return output;
    }

    @Override
    public Func_chapter_high_tech_overview vx_copy(Object... vals) {
      Class_chapter_high_tech_overview output = new Class_chapter_high_tech_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_overview", // name
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
    public Func_chapter_high_tech_overview vx_empty() {return e_chapter_high_tech_overview;}
    @Override
    public Func_chapter_high_tech_overview vx_type() {return t_chapter_high_tech_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_overview() {
      return High_technology.f_chapter_high_tech_overview();
    }

  }

  public static final Func_chapter_high_tech_overview e_chapter_high_tech_overview = new High_technology.Class_chapter_high_tech_overview();
  public static final Func_chapter_high_tech_overview t_chapter_high_tech_overview = new High_technology.Class_chapter_high_tech_overview();

  public static Base.Type_chapter f_chapter_high_tech_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: High Technology?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: High Technology?")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_high_tech_rules
   * @return {chapter}
   * (func chapter_high_tech_rules)
   */
  public static interface Func_chapter_high_tech_rules extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_rules();
  }

  public static class Class_chapter_high_tech_rules extends Core.Class_base implements Func_chapter_high_tech_rules {

    @Override
    public Func_chapter_high_tech_rules vx_new(Object... vals) {
      Class_chapter_high_tech_rules output = new Class_chapter_high_tech_rules();
      return output;
    }

    @Override
    public Func_chapter_high_tech_rules vx_copy(Object... vals) {
      Class_chapter_high_tech_rules output = new Class_chapter_high_tech_rules();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_rules", // name
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
    public Func_chapter_high_tech_rules vx_empty() {return e_chapter_high_tech_rules;}
    @Override
    public Func_chapter_high_tech_rules vx_type() {return t_chapter_high_tech_rules;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_rules();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_rules() {
      return High_technology.f_chapter_high_tech_rules();
    }

  }

  public static final Func_chapter_high_tech_rules e_chapter_high_tech_rules = new High_technology.Class_chapter_high_tech_rules();
  public static final Func_chapter_high_tech_rules t_chapter_high_tech_rules = new High_technology.Class_chapter_high_tech_rules();

  public static Base.Type_chapter f_chapter_high_tech_rules() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Rules"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Cyberspace"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cyberspace"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A huge, interconnected series of computer networks, software systems, and virtual realities that form a continuous\ndigital universe of nearly infinite scope.\n* Interface programs sort through this information and produce a virtual world tailored to the user's desire.  The\nmost common interface is that of digital cities that mirror their real world equivalents, but display computer\nsystems, data blocks, and information pathways instead of buildings, people, and highways.\n* Nodes - Nodes in Cyberspace are locations in Cyberspace.  Nodes include Telecom lines, Satellite Uplinks,\nFirewalls, Security Cameras, Remote Controls, Databases, and Virtual Realities.  Different Nodes usually require\nvalid security or payment to use.  Nodes can also hold nasty surprises including alarms and defense programs.\n* Movement - Distances are insignificant in Cyberspace.  Instead, movement is measured in tasks.  Any program can\nperform a number of tasks each turn equal to [Netrunning] skill.  Each node entered in Cyberspace is a task.\nPerforming any [Action] at a node is also a task."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("The Digital Web, The Net, The Network, World Wide Web, The Web")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_high_tech_spacecraft
   * @return {chapter}
   * (func chapter_high_tech_spacecraft)
   */
  public static interface Func_chapter_high_tech_spacecraft extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_high_tech_spacecraft();
  }

  public static class Class_chapter_high_tech_spacecraft extends Core.Class_base implements Func_chapter_high_tech_spacecraft {

    @Override
    public Func_chapter_high_tech_spacecraft vx_new(Object... vals) {
      Class_chapter_high_tech_spacecraft output = new Class_chapter_high_tech_spacecraft();
      return output;
    }

    @Override
    public Func_chapter_high_tech_spacecraft vx_copy(Object... vals) {
      Class_chapter_high_tech_spacecraft output = new Class_chapter_high_tech_spacecraft();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_high_tech_spacecraft", // name
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
    public Func_chapter_high_tech_spacecraft vx_empty() {return e_chapter_high_tech_spacecraft;}
    @Override
    public Func_chapter_high_tech_spacecraft vx_type() {return t_chapter_high_tech_spacecraft;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_high_tech_spacecraft();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_high_tech_spacecraft() {
      return High_technology.f_chapter_high_tech_spacecraft();
    }

  }

  public static final Func_chapter_high_tech_spacecraft e_chapter_high_tech_spacecraft = new High_technology.Class_chapter_high_tech_spacecraft();
  public static final Func_chapter_high_tech_spacecraft t_chapter_high_tech_spacecraft = new High_technology.Class_chapter_high_tech_spacecraft();

  public static Base.Type_chapter f_chapter_high_tech_spacecraft() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Tech Spacecraft"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Interplanetary travel is a common reality in the 23rd century.\n\n* Types - Spaceships are mostly cargo and ore mining ships, followed by gas tankers.\n\n* Prismatic Armor - Modern ships have a very thick ablative skin composed of a honeycomb of diamond nano-fibers filled with a highly refractive, radiation and impact absorbing ceramic compound. This armor has a number of beneficial qualities. It deflects energy in random directions which provides radiation resistance, stealth, and energy weapon defense. It fragments and ablates under energy weapon and kinetic impact which shatters incoming	micro-meteors and high speed weaponry and distributes the incoming energy in all directions to prevent penetration. The ablating particles also carry away excess heat in a similar way to evaporation. The resultant particles become a cloud of anti-energy aresol. Any impact strong enough to penetrate the armor will liquify the surrounding armor which quickly solidifies and helps to seal hull breaches.\n\n* Deflectors - Most long-range ships are equipped with a deflector array. The array is composed of a wide bank of closely spaced ionizing lasers and particle beams. The lasers ionize the particles and form a strong magnetic force down the length of the beam. Small objects headed toward the ship are ionized by the beams and then redirected away by the magnetic field. Point defense lasers are used for larger particles as well as incoming missiles.\n\n* Propulsion - Propulsion spaceward (outward from the Sun) is often provided by massive Stellasers that reflect and concentrate solar radiation into a 'tight' beam similar to a laser. Ships have depolyable solar sails to capture this energy for propulsion and recharging batteries. These sails can even be used to slowly tack inward. Some cargo ships use particularly large sails to slowly sail the solar wind to reduce costs. Most ships rely on powerful nuclear thrusters for sunward (toward the Sun) travel to accelerate the ship at up to 1g. When possible the ship will accelerate for half the voyage, turn around, and then decelerate for the rest of the trip.\n\n* Gravity - Except for short periods of weightlessness midway through the trip, the passengers feel gravity during the trip. Up is toward the nose and down is toward the engines. The internal organization of a ship is very similar to a skyscraper. For fuel and reaction mass reasons, the ship may need to travel at slower speeds (and lower gravity) or coast at zero gravity midway through the trip. For this reason, large ships are often equipped with rotating decks to simulate gravity for the crew.\n\n* Reentry - Spaceships are generally too heavy and not equipped to survive a landing on anything larger than a small moon. Landing on something as massive as the Earth's Moon is possible, but achieving orbit again requires a powerful Laser Lifter system like the one on Luna.\n\n* Travel Costs\n** Planet to orbital station skyhooks travel daily and cost 200-300 credits one-way.\n** Orbital to moon travel twice weekly and cost 600 credits one-way.\n** Interplanetary trips are like cruises. They travel weekly and cost 20,000-30,000 credits\none-way.\n\n* Safety - Inner ship walls are covered with pillowy-soft panels of 'Space Gel'. This viscous fluid provides a combination of heat insulation, impact padding, radiation shielding, shrapnel absorption, and depressurization protection. Space Gel exposed to freezing temperatures will immediately harden into a very durable solid. If the hull is breached, damaged panels will leak Space Gel. Any gel that touches an area near the breach will instantly freeze, gradually plugging the leak."),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("High Tech Commercial Spacecraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Commercial Spacecraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Shuttlecraft"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shuttlecraft")
                      )
                    ),
                    Core.vx_new_string("Cargo Spacefreighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Spacefreighter")
                      )
                    ),
                    Core.vx_new_string("Ore Spacefreighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ore Spacefreighter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Magsail ship")
                      )
                    ),
                    Core.vx_new_string("Gas Spacefreighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gas Spacefreighter")
                      )
                    ),
                    Core.vx_new_string("Space Rescue Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Rescue Ship"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Event Horizon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Emergency Medical and Rescue Craft")
                      )
                    ),
                    Core.vx_new_string("Star Explorer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Explorer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Scout Vessel")
                      )
                    ),
                    Core.vx_new_string(":Spaceliner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spaceliner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Luxury cruise liner for tourism or transport"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Starliner")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fighter Class"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fighter Class"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Star Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Bomber")
                      )
                    ),
                    Core.vx_new_string("Star Figher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Figher"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* General purpose space fighter that can be fitted with special purpose gear.")
                      )
                    ),
                    Core.vx_new_string("Star Interceptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Interceptor")
                      )
                    ),
                    Core.vx_new_string("Star Torpedo Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Torpedo Bomber")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Shuttle Class"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Shuttle Class"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Assault Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Assault Shuttle")
                      )
                    ),
                    Core.vx_new_string("Eagle Lunar Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eagle Lunar Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Eagle is the primary form of transportation for the inhabitants of the various moons of the Solar System. A multipurpose craft, it is divided into three basic sections; the command module, the service pod, and the superstructure. It is powered by four nuclear fusion rockets, and carries fuel reserves for 48 hours of flight.\n* Type A Transport Eagle is fitted with the standard passenger pod and is capable of holding 8 passengers (up to 12 in an emergency), in addition to the pilot and co-pilot.\n* Type B Freighter Eagle is used for transporting supplies, equipment and minerals. They can also be used as space-borne tankers for refueling.\n* Type C Reconnaissance Eagle comes equipped with various types of sensory devices for exploratory missions.\n* Type D Rescue Eagle, identifiable by the bold red stripes on the pod, has been adapted for field diagnosis and treatment of injury or disease. Manned by medical personnel, Rescue Eagles are equipped with mobile beds, patient-monitor units, and facilities for field surgery.\n* Type E Laboratory Eagle is equipped with a remote laboratory and can be used to locate and refine crude minerals, eliminating the need to transport bulky raw ores. It can carry food and water and recycle air to support the team for several weeks.\n* Specialty Modules include a the winch platform used to disperse nuclear waste canisters. There is also an additional booster unit that can be added to the super-structure which can increase the range and power."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Eagle"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("162 Mkmh"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("238 tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("23m"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("26 Bkm"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("9m")
                      )
                    ),
                    Core.vx_new_string("Lunar Rail Capsule"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lunar Rail Capsule"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small pod launched from a Lunar Rail Gun. Passenger Capsule are launched from 80 mile long Rail guns at 1G. Cargo capsules are launched from 2 mile long Rail guns at 40G. They are then captured in lunar orbit by drones and lunar satellite bases.")
                      )
                    ),
                    Core.vx_new_string("Star Gunship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Gunship"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* General purpose heavy weapons platform that can be fitted with special purpose gear.")
                      )
                    ),
                    Core.vx_new_string("Heavy Star Bomber"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Star Bomber")
                      )
                    ),
                    Core.vx_new_string("Reconnaissance Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reconnaissance Shuttle")
                      )
                    ),
                    Core.vx_new_string("Star Torpedo Boat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Torpedo Boat")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Frigate Class"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Frigate Class"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Assault Star Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Assault Star Carrier")
                      )
                    ),
                    Core.vx_new_string("Missile Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Frigate")
                      )
                    ),
                    Core.vx_new_string("Siege Frigate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siege Frigate")
                      )
                    ),
                    Core.vx_new_string("Star Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Destroyer")
                      )
                    ),
                    Core.vx_new_string("System Defense Corvette"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("System Defense Corvette"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Interplanetary Defense")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Cruisers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Cruisers"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Star Battleship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Battleship")
                      )
                    ),
                    Core.vx_new_string("Star Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Carrier")
                      )
                    ),
                    Core.vx_new_string("Star Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Cruiser")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Dreadnoughts"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Dreadnoughts"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Super Star Battleship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super Star Battleship")
                      )
                    ),
                    Core.vx_new_string("Super Star Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super Star Carrier")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Satellites"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Satellites"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Communication Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communication Satellite")
                      )
                    ),
                    Core.vx_new_string("Damocles Orbital Laser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Damocles Orbital Laser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("HighTech/DamoclesSatellite.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Orbital Laser Platform designed for strategic strikes against land targets. May also be used agaist\nlarge orbital targets or for asteroid defense.")
                      )
                    ),
                    Core.vx_new_string("EMP Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("EMP Satellite"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* What's it going to be, Plissken? Them or us? I shut down the third world, you win they lose. I shut\ndown America, they win, you lose. The more things change, the more they stay the same. - Snake Plissken,\nEscape from LA"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Goldeneye")
                      )
                    ),
                    Core.vx_new_string("Hunter Killer Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunter Killer Satellite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A combat ready satellite often masquerading as a peaceful version. Hunter Satellites act like UAV's\nquietly patrolling until their weaponry is needed, then they are disposable."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Battle Satellite")
                      )
                    ),
                    Core.vx_new_string("Orbital Skyhook Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orbital Skyhook Satellite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Large rotating satellite in low orbit. Its purpose is to drop its kilometers long tether to dock with a [Suborbital Shuttle] and use its momentum to fling the shuttle into higher orbit. A few of these Skyhooks at different orbits can pull a shuttle all the way into high orbit. Pulling up shuttles gradually degrades the satellite's orbit, but fortunately, the same system can be used in reverse to slow orbital craft without using fuel which returns lost momentum to the Skyhook.")
                      )
                    ),
                    Core.vx_new_string("Solar Reflector Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Solar Reflector Satellite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These are massive, lightweight solar mirrors that can be focused for variouse purposes. They can focus light for solar farms, generate light for long nights like on the moon, generate thrust by light pressure and by heating ablative drives.")
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
   * @function chapter_jovian_chronicles
   * @return {chapter}
   * (func chapter_jovian_chronicles)
   */
  public static interface Func_chapter_jovian_chronicles extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_jovian_chronicles();
  }

  public static class Class_chapter_jovian_chronicles extends Core.Class_base implements Func_chapter_jovian_chronicles {

    @Override
    public Func_chapter_jovian_chronicles vx_new(Object... vals) {
      Class_chapter_jovian_chronicles output = new Class_chapter_jovian_chronicles();
      return output;
    }

    @Override
    public Func_chapter_jovian_chronicles vx_copy(Object... vals) {
      Class_chapter_jovian_chronicles output = new Class_chapter_jovian_chronicles();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_jovian_chronicles", // name
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
    public Func_chapter_jovian_chronicles vx_empty() {return e_chapter_jovian_chronicles;}
    @Override
    public Func_chapter_jovian_chronicles vx_type() {return t_chapter_jovian_chronicles;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_jovian_chronicles();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_jovian_chronicles() {
      return High_technology.f_chapter_jovian_chronicles();
    }

  }

  public static final Func_chapter_jovian_chronicles e_chapter_jovian_chronicles = new High_technology.Class_chapter_jovian_chronicles();
  public static final Func_chapter_jovian_chronicles t_chapter_jovian_chronicles = new High_technology.Class_chapter_jovian_chronicles();

  public static Base.Type_chapter f_chapter_jovian_chronicles() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Jovian Chronicles"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Orbital Revolution"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Orbital Revolution"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Events Leading to War\n* Air Tax\n\nOverview of the War\n* Rock War\n\nAftermath\n* Terran Union"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Rock War"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rock War")
                      )
                    ),
                    Core.vx_new_string("Battle in the Depths"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battle in the Depths"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An undersea fission cannon is discovered before it becomes operational.\n* A squadron is sent ahead of the fleet to destroy the cannon before it\nis brought to bear on the fleet.\n* The base defenders need to stall for 10 minutes until the cannon can be\nfired destroying most of the fleet. 5 minutes later a second shot will\nensure victory.\n* The battle takes place completely underwater.")
                      )
                    ),
                    Core.vx_new_string("Destroy the Downlink"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Destroy the Downlink"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The rebels choose to destroy a microwave receiver converting power from\na vast orbital solar satellite array. If they can destroy it, the entire\narea will be without power and defenseless for days allowing the rebels\nfree reign to take territory.\n* The defenders realize the vulnerability of the station and it is\nheavily defended.")
                      )
                    ),
                    Core.vx_new_string("Rat Warren"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rat Warren"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The mechs stationed to defend the city are cut off from reinforcements.\n* The rebels see an opportunity, but they have only powersuits and their\nwits to take the colossal defenders down. They can use the sewers and\nsubways as cover to launch hit and run attacks.")
                      )
                    ),
                    Core.vx_new_string("Traitorous Acts"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Traitorous Acts"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An surprise attack is launched on a munitions depot, but there is a\nproblem. The defenders are not surprised: there is a mole in your group.\n* Attackers have a superior force, but one of them is a traitor. They\nwill have to watch their backs.\n* Defender secretly chooses one attacking unit as the traitor and can\nchoose to activate it at any time.")
                      )
                    ),
                    Core.vx_new_string("Joy Ride"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Joy Ride"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A young, hotshot rebel manages to sneak into an enemy test facility and\nsteal a prototype mecha. The whole base is on his tail, and he will need\nto use urban cover and speed to try to get away.")
                      )
                    ),
                    Core.vx_new_string("Train Spotting"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Train Spotting"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ambush a mag-lev train and stop it before it escapes.\n* Attackers must disable the train and destroy the defenders.\n* Defenders must escape or drive off the attackers.")
                      )
                    ),
                    Core.vx_new_string("Breaking Damocles"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Breaking Damocles"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Damocles is an orbital facility equipped with a powerful laser. Its\nexistence has put major pressure on Earth governments to comply with UEA\ndemands.\n* Attackers must placed explosives along the edge of the facility and\ndestroy the attitude control thrusters to send the facility into a death\nspiral that would make it burn up in orbit. Hopefully, it will crash in\nan uninhabited area.\n* Defenders must destroy the attackers or the explosives to prevent this\nnightmare scenario.")
                      )
                    ),
                    Core.vx_new_string("Moon Rocket"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moon Rocket"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A huge rocket is about to be launched from its silo in a crater on the\nMoon.\n* The attackers must destroy the launch silo or failing that the missile\nitself before it leaves the combat area. Critical hits on the missile\nmay cause it to explode, destroying the launch base.")
                      )
                    ),
                    Core.vx_new_string("Mirage Storm"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mirage Storm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Two recon mechs gather intelligence around Jupiter but are pursued. The\nrecon units try to even the odds by flying into the atmosphere directly\ninto a super storm. The storm plays havoc with normal sensors, but the\nrecon units can sort out the jumble of sensor data.\n* The 5 attackers must destroy the 2 escaping mechs.\n* The defenders must drive off or destroy the superior attackers.\n* Special Rules: For each defender place 2 additional ghost mechs on the\nbattlefield. These represent false image data produced by the cloud.\nAfter each attack, the defenders may secretly switch which unit is\nthe real mech among the three identical images. The ghost mechs are\nobviously immune to all damage.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Jovian Odyssey"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jovian Odyssey"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dreams OF Phantoms"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreams OF Phantoms"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Call of Jupiter - Jovian scientists discovered an odd life form floating in Juptier's\natmosphere, the Jovian Floater. A floating research station was proposed, but the\nextreme funding could not be secured. Spies for the Venusian Bank determined that the\nFloaters may be responsible for the phenomenon called the 'Call of Jupiter', where\nexplorers to Jupiter have often explained that they were drawn to Jupiter because of\ndreams they had of Jupiter singing to them. This would imply that the Floaters can\ncommunicate telepathically over interplanetary space: an incredible finding.\n\n* Slumbering Eidolon - The Venusians established a top secret floating base in Jupiter's\natmosphere under the noses of the Jovians. The intense atmosphere combined with the\npowerful radiation and magnetic fields effectively hide them from any watching eyes\nabove. Eidolon is secretly supported by a group in the largely lawless Joshua Station\nto procure or ship supplies and provide emergency rescue if necessary.\n\n* Mission - Discover the Slumbering Eidolon and capture or destroy it. They could\ndiscover it by finding a supply or courier ship headed there during a patrol, or stumble\nacross a supporting organization on a Jovian colony. The assault force would\nmost probably consist of two Thunderbolts, one Javelin, and a small number of\nPathfinders and Retaliators. If they choose to capture the Eidolon, a hurried scramble\nas a self-destruct timer counts down and bulkheads slam shut is just as exciting as an\naction-packed firefight in the command center. Agents and reporters are harder to\nintegrate with the destruction of the station, but are more\neasily involved in the discovery process.")
                      )
                    ),
                    Core.vx_new_string("Dreams OF Secrets"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreams OF Secrets"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Summary - After the discovery and decomissioning of the secret Venusian research\nstation, the Jovian government found some advanced mech prototypes that the Venusians\nhad been testing in the Jovian atmosphere. This led to the Agora paying more attention\nto a request of assylum from one Dr. Peyarje, and sent the PCs to help retrieve him.\n\n* Dr. Peyarje - UEA has conscripted the brilliant Dr. Peyarje into their service,\nforcing him to develop next generation exo-weapons at a hidden base. In the interests of\nkeeping an appearance of openness, they have allowed Peyarje to attend the 2210\n Intersettlement Scientific Convention (ISC), though he is accompanied by a detachment\nof the UEA military. He has managed to get a plea for help and request for asylum to the\nJovian embassy. His crowning achievement is a telepathic mech control system based on\ndiscoveries found from the Floaters over Jupiter.\n\n* Georgia On My Mind - The players have been dispatched to extract Peyarje from the ISC\nconference in Venus orbit. They are hidden among the large Jovian delegation to the ISC\naboard the Georgia On My Mind space liner. However, in order to smuggle them aboard,\nthey can carry now weapons or equipment and will need an alternate means of escape.\n\n* Stanton Station - A space station in Venus Orbit where the Internation Scientific\nConvention (ISC) is being held. Here, Peyarje will be allowed to present a carefully\ncensored summary of his work on cyberlinkage technologies. The players should take part\nin the early stages of the ISC while they investigate the conference and find a way to\nget Peyarje away from his UEA handlers and off-station.\n\n* Jovians - The Jovians wish to reap the PR benefits to be found in rescuing a brilliant,\npacifist scientist from UEA’s militaristic clutches and also hope that Peyarje can shed\nsome light on some samples of his CAT/Rapid-Scan system found on a secret research\nstation.\n\n* UEA - Unfortunately for these operatives, the UEA is taking the security of their\nprisoner very seriously. The third division of the UEA 4th fleet are moored just off\nStanton, at the invitation of the Venusian Plantary Council, and permission has been\ngranted for several officers and marines to accompany Peyarje as a security detail.\nThough the ISC filed a formal protest over the admittance of UEA military officers\nacting in an official capacity, the issue has since been dismissed and other nations\nhave been allowed to included similarly-limited security details for their detachments.\n\n* Beautiful Dreamer - The PC's meet their contact, Ysa Cantroini and through her, Aglaee\nDessources. Both seem to be independents commissioned by the Jovians. Ysa is surpisingly\ncompetent at many abilities and Aglaee has a ship for escape along with the  characters'\ngear and mechs.\n\n\n* CHARACTER INVOLVEMENT\nJAF pilots could be members of an official JAF escort, added (as mentioned\nabove) to balance out the UEA military forces escorting Dr. Peyarje. The pilots would still be\ninstructed to ask questions and discretely investigate, but would be intended to act as a decoy\nand backup for the real extraction team. By asking questions and poking their noses into places\nthey don’t belong, they would be expected to draw attention away from the real JIS operatives.\nWho could, in turn, be exposed and captured at the last minute, forcing the players to pull off\nthe heist on their own with insufficient planning.\n\nThe players could be the backup JIS team instead of the primary, tasked with investigating and\ndoing footwork for the primary team. This puts them on the front lines, while the primary team\nworks to solidify their own cover. The primary team’s cover could then be blown, forcing the\nplayers to execute the operation, and keeping them on the front lines. This has many hooks for\ncomplications and intruigue. What if the compromised team wasn’t discovered, but betrayed\nby a double agent in their own ranks? This goes well with the scenario (see below) that has\nthe players trapped in hiding on Stanton. What if the Venusians (specifically, Malachai) were\naware of the operation all along and either want the operatives to expose themselves or for the\noperation to succeed/fail for reasons of their own?\n\nReporters have the easiest time finding cover identities - they don’t need them. The ISC is a big\ndeal, and reporters from all over the solar system can be expected to attend. And reporters are\nexpected to be nosy, so no-one’s going to take excessive notice of a few asking questions where\nthey shouldn’t. However, due to their typical lack of combat skills, reporters will probably be harder\nto handle for the actual freeing of Peyarje. They would probably have to resort to subterfuge and\ntrickery if called upon to get Peyarje away from his guards themselves. One possibility is to have\nJIS agents already in place on Stanton handle the snatch, then pass Peyarje off to the reporters\nfor transport, as in the JAF pilots write-up above.\n\nThe 3rd Division of the CEGA 4th fleet is composed of:\n • 2 Tengu carriers with extra vehicle bays.\n • 4 Bricru corvettes.\n • 1 Hachiman destroyer.\n\nOne Tengu carries a Wyvern and three Wraiths, while the other carries four Syreens. The\nsquadron is accompanied by several fuel ships, to give extra range to the short-legged CEGA\nwarships. Garand’s Wyvern is the Command variant. While the Hachiman is technically the\nflagship of the squadron, Garand usually commands from aboard his Tengu where he has easy\naccess to his exo-armor. This can be used to involve Kleb in the scenario without Garand’s\nknowledge - Kleb could be travelling aboard the Hachiman, watching and ready to take command\nshould the situation demand it.\n\n* Escape - The 3rd Divison lacks is deployed far from reinforcements, so it will act\ncautiously. They know that they don’t need to kill the players - they need to capture\nthe Dreamer. The PCs should realize this, and be careful not to let themselves be drawn\naway... For what seems like a retreat could really be an attempt to lure them away so\nthat another force can slip in and disable the Dreamer’s engines.")
                      )
                    ),
                    Core.vx_new_string("Dreams oF Freedom"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreams oF Freedom"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Beautiful Dreamer - Rescued from his UEA handlers at the Intersettlement Scientific\nConvention, Dr. Peyarje and his rescuers have fled Venus aboard the Beautiful Dreamer,\nprivateer ship commanded by Aglaee DesSources. Unfortunately, they have not lost the UEA\nforces seeking to recapture Peyarje. The 3rd Division of the UEA 4th fleet, commanded\nby ace pilot Ranho Garand, is in hot pursuit.\n\n* Intercept Course - DesSources’ skillful helmsmanship makes the most of their limited\nreaction mass, but Garand’s 3rd Division is slowly closing in, blocking the orbits they\ncould use to travel out-system. Garand's fleet makes a high energy burn and manages to\nintercept them and another heated battle ensues. After the battle, the UEA force, having\nused their remaining reaction mass to intercept must wait for a fuel tender to continue\nthe pursuit.\n\n* The Long Trip to Earth - Low on fuel, with the UEA pursuit fleet closing in fast, the\ncrew of the Beautiful Dreamer find themselves with only one option: change course and\nhead for the Earth system, the heart of the UEA and the only source of supplies and fuel\nin range. Perhaps they can loose their pursuers in the high-traffic Orbitals and find\nanother way to Jupiter. Because reaction mass is low and they need to run silent, the\ntrip takes many days at zero-g. Many days in radio silence are spent discussing ways to\nget out of this mess.")
                      )
                    ),
                    Core.vx_new_string("Moonlight Sonata"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moonlight Sonata"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ismael Li - Fortunately, the Jovians have been working hard to save the mission and\nhave made a deal with a burgeoning rebel group on the Moon which can to provide them\nwith the fuel and parts they need... For a price!\n\n* The Eagle has Landed - Now they just need to avoid the blockade and land on the Moon.\nThough the Moon has very low gravity, the Beautiful Dreamer is not designed to land on\na Moon. Even if they survive the landing, they may not be able to take off again.\nHowever, there is no choice in the matter. After a harrowing landing, the rebels help\nbury the Dreamer in lunar dust and begin repairs and refueling.\n\n* Copernicus Base - The characters are invited to the underground, domed city known as\nCoperinus Base. Here the charismatic Ismael Li introduces them to the harsh life of\nthe Lunar miners. There is nothing to do but wait and meet the pleasant locals while the\nship is repaired and the UEA prepares its next move.\n\n* The Plot Thickens - Gradually, Ismael brings the characters to see supporters and see\nhis gear. Ismael intends to lead a rebellion to take over Copernicus Base and he needs\nthe characters' help. His group lacks seasoned fighters and they lack tactics,\norganization, and strategy. This revelation sparks a heated debate over the wisdom of\nthis endevour. No one can argue that their situation is difficult, but even if they\nsucceed the Lunar Authority and the UEA will not just sit back and allow a rebellion.\nIsmael argues that once they seize control, the Lunar Authority will have to negotiate.\nOthers fear a strong, military response. Any armed conflict in a space station is\nloaded with risk. If one of the characters befriends or falls in love with one of the\nrebels, it would add a more personal edge to the rebellion.\n\n* Eleventh Hour - With or without the characters' help, Ismael begins to grease the\nwheels of revolution through raids, assassinations, sabotage, and public relations\ncampaigns. Their target is Captain Ansevik the head of Copernicus security. If they\ncan capture her, they believe they can secure the base.\n\n* Moon Strike - After providing the characters with the repairs and fuel they need, he\nlaunches his armed uprising in the depths of Copernicus hoping to drag them into the\nfight. Moving barricades outwards at carefully-regulated intervals, his troops and\nexo-suits advance through the dome, driving out the UEA bureaucrats and policemen as\nthey go. The few initial firefights go well for the rebels.\n\n* The Tide Turns - About six hours into the fighting, things begin to turn. Ansevik\nmanages to get her exo-suit forces into Copernicus, and their numbers mean bad things\nfor the rebels.\n\n* Evacuation - Catherine Glit starts an evacuation of refugees. The rebels lift as many\nto hastily-contracted merchant and passenger ships in lunar orbit as they can. Things\nbecome even more chaotic as the Selenties abandon their posts and the rebels fall back\nbefore the UEA forces. Organizing such a retreat is no easy task. Dessources takes as\nmany refugees as possible aboard the Dreamer. Ysa wants to help the rebels fight. The\ncharacters should be involved in the fighting or evacuation effort somehow. After all,\nit was their presence that provided the catalyst that started the rebellion.\n\n* Escape - Her holds crammed with refugees and UAE ships starting to move in, Aglaee\norders the characters back to the ship. Greatful for their help, Li lets them go. He\nsends Catherine Glit with them at the last minute, against her wishes. As the characters\nhead for the spaceport, the rebels begin another counter-attack, slowly forcing the UAE\nground troops back and taking the spaceport and ground-to-orbit weapons. The citizens\nwho couldn’t be evacuated riot, pelting helpless UEA infantry and marines with rocks and\nbricks. Things are obviously not going well for the UEA troops.\n\n* Copernicus Dome Disaster - Ansevik realizes that the rebels could use the city's\nground-to-orbit weapons to attack his warships. He must now choose whether to withdraw\nor fire on the defensive batteries. In a panic, Ansevik orders his ships to attack the\nlaser and missile batteries. The resulting explosions are far larger than expected and\nshatter the dome. A hasty retreat ensues as the Dome opens to vacuum, killing rebel,\ncivilian, and UEA marine alike.\n\n* Chaos -  Ismael Li operates the Laser Lifter to boost the refugee ships away, including\nthe Dreamer. Li's last words, relayed to his friends and helpers aboard the Dreamer, are\nMy life for freedom! The Dreamer attempts to escape with the other refugee ships, but\nthe UEA ships are positioned to easily stop them. The UEA demands their surrender, but\nthe UEA ships are then ordered to focus on rescue instead of pursuing the refugee ships.\n\n* Aftermath - In the end, thousands are killed in Copernicus Dome. The UEA, of course,\nrefuses to take the blame for the Dome disaster. Their first desperate response is to\nput the blame on the Jovian terrorists who abducted Peyarje. Reporters use Ansevik’s\nactions as fodder for their own counter-attack against UEA’s propaganda.\n\n* Notes - Develop the rebellion and the rebels, especially Ismael Li. Emphasize the\nmoon’s restrained and industrious culture and the rampant poverty and utilitarian\nnature of the underground cities. If appropriate, show the corruption of the UEA\nofficials that oversee the colonies. Play up the initial hope and final despair of the\nrebels, the desperation of the refugees to find a better life, and the chaos of\nclose-quarters fighting in the Lunar warrens.")
                      )
                    ),
                    Core.vx_new_string("Dreams of War"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreams of War"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mission to Mars - The UEA is in pursuit again and logically expects the Dreamer to\nhead to Jupiter. However, with its high speed escape and her holds crammed with refugees,\nthere’s no way for the Beautiful Dreamer to make Jupiter without running out of supplies\nor fuel. Fortunately for her crew and desperate passengers, the ship can easily make\nMars. There, Aglaee DesSources hopes that the Martian Republic will be able to provide\nhomes to the refugees.\n\n* Decoy - The UEA pursuit will soon catch up and they cannot be allowed to follow the\nDreamer to Mars, so a desperate plan is devised. The booster rockets from the Moon are\nremoved and fitted with decoy gear to make the rockets appear as the Dreamer. The pilots\nwill escort the rockets on the current course while the Dreamer makes a course\ncorrection and silently coasts towards Mars. The escort will engage enemy mechs drawing\nout the enemies resources while maintaining the charade as long as possible. Once the\ndecoy is discovered the pilots must return to the rockets and activate the massive\nrockets to boost away at high speed to rendevous with the Dreamer. This plan is loaded\nwith risk and the pilots will probably be caught or killed. Their farewell is long and\nemotional. After the Moon, the pursuit fleet commander has been ordered to kill everyone\naboard the Dreamer both in revenge and to eliminate witnesses. When the UEA pursuit\nfleet catches up to the decoy, a heated fight begins with no quarter given. Because the\nUEA is out for blood, they focus on the pilots instead of the 'Dreamer'. The pilots are\ndriven back and the ruse is discovered. The pilots must make a desperate dash to the\nbooster and escape before they are blown out of the sky. Fortunately, they escape though\nwith heavy losses and damage and rendevous with the Dreamer on schedule. The UEA fleet\nhas overcommitted to Jupiter and are unable to pursue to Mars. Anxious days pass as the\nDreamer travels at full speed to Mars. When they arrive they will have to hope that the\nMartian government doesn't arrest them on the spot. Meanwhile, Garand has deduced that\nthe refugees will divert the Dreamer to Mars (because that's what he would do), but his\ndisgust with his superiors' handling of the battle on the Moon causes him to go to Mars\non his own.\n\n* Mars Arrival - The Dreamer enters Mars orbit and is immediately escorted by a fighter\nwing and two destroyers. The escort demands that the Dreamer stand down all weapons and\nprepare to be boarded. They have little choice in the matter. There is nowhere else to\ngo. The boarding party secures the engine room and bridge and dock the Dreamer at the\nmassive Orbital Elevator space station called Heaven. All passengers are taken to\nimmigration while their ship is searched. Here they meet Yanna Summers, the chief\nadminstrator of the Elevator. Little information is forthcoming and all senior staff are\nto be taken by shuttle to Mars Federation police headquarters. As they descend, they get\nan amazing view of the incredible Orbital Elevator in action.\n\n* Stairway to Heaven - Constructed with the aid of Venus Bank, the Martian Orbital\nElevator, Stairway to Heaven is a marvel of engineering. It stretches upwards from its\nbase at Hell Station just north of the Federation capital of Kurtzenheim to the Heaven\nStation counterweight. The elevator is dominates the landscape and has become a symbol\nof Mars Federation authority. It shines like a moon day or night, and it catches the\nfirst light of day every sunrise before the rest of Mars. Its ore containers crawl up\nand down the tether 24 hours a day. The current chief adminstrator, Yanna Summers, is\nextremely organized and professional and keeps very tight ship.\n\n* Martian Politics - Since its creation, the Orbital Elevator has become the center of\nMartian politics. Mars has two major political factions: the Mars Federation and the\nFree Republic of Mars. The Mars Federation is an authoritarian regime. It controls most\nof Mars and is loosely allied with the UEA. The Free Republic of Mars is smaller and is\nlargely at odds with everything the Federation does. The Orbital Elevator has become the\ncenter of Martian debate because the Federation controls the Elevator and the huge\nprofits it produces will allow the Federation to dominate the Free Republic in just a\nfew years. Open conflict on Mars has become common and numerous terrorist organizations\nperform increasingly savage raids on the Mars Federation. The Federation in turn blames\nthe Republic of backing the terrorists which is not entirely without merit.\n\n* Life on Mars - At police headquarters, they must negotiate for asylum for the\nrefugees and avoid arrest and extridition to the UEA. They meet with Paul Treben of the\nSolar Police who is surprised to learn of the unofficial version of the events on the\nMoon. He will report everything he learns to his superiors who will in turn secretly\ninform the UEA. Representatives from both political factions arrive intending to use the\ncharacters to their own ends. The Mars Federation wants to extridite the characters as\nterrorists, but the Free Republic grants the refugees asylum and puts a hold on the\nextridition of the crew of the Dreamer.\n\n* Waiting Around - Support for the UEA is weak here, so the characters are released for\nthe time being, though they are escorted by an armed detail at all times. Garand and his\nelite unit are also poking around and soon confronts the high profile characters, but he\nhas no authority on Mars and can do nothing while the characters remain. In the meantime,\nthe refugees are brought to the Free Republic and a media circus begins as their stories\nhit the airwaves. The public is shocked and sympathetic to the Selenites, but this soon\nturns to rage as it becomes clear that the same thing could happen to them. The normal\nprotests for fair use of the Orbital Elevator break out into massive riots and terrorist\nactivity spikes across Mars.\n\n* Dangerous Liason - Though the govenments seems to treat the characters like criminals,\nthe public treats them like celebrities or even heroes. While out and about, a pretty\nyoung woman approaches one of the males and gushes about how wonderful he is and leaves\nhim her contact code on a slip of paper. After further inspection, the contact code is\nnot a personal address but a secure web site. Following the link, they speak with the\ngirl, Lydia Ketchum, but her manner is very different. She is a political radical who\nhas been implicated in terrorist activity including attacks on police and bombings. She\nis proud of her actions and believes that giving her life for a free Mars would be a\nfair trade. She proposes a daring escape plan. Her people will help smuggle the\ncharacters up the elevator in a depressurize ore car. There they must fight their way\nthrough the station, take over the administration headquarters, and release their ship\nand mechs from impound. Her people can then use the station defenses to cover their\nescape. With the station under her control, she can negotiate fair use of the elevator\ngoing forward from a position of strength.\n\n* Departure - Lydia's plan does not sound entirely rational, and she is not the sort of\nperson who can be trusted. However, without allies the characters are never going to\nescape Mars, so they have no choice but to take a chance regardless of the consequences.\nCatherine and Ibrahim are unsure of their long-term safety on Mars and decide to join\nthe group to continue all the way to Jupiter despite the risks.\n\n* Hell Ride - After days of planning, Lydia's people distract the guards and the\ncharacters make a run for it. After they make their escape, they are swiftly taken to\nan ore processing plant and smuggled aboard an ore train car. In the train are guns,\npressure suits, Lydia, and four of her people. The train goes to Hell station where the\ncars are searched. Tense moments pass as they wait for the inspector to get to their\ncar. When he opens the car, he looks right at them, winks at Lydia, waves his scanner,\nand lets the car pass. The characters must take care not to be crushed when the train\ncontents are dumped into an elevator crawler. Soon, the crawler begins its long, slow\ntrip up the elevator.\n\n* Heaven Sent - When the elevator arrives at Heaven, its contents are dumped into an\nopen bin. More of Lydia's sympathizers help them bypass security forces. Now the\ncharacters need to get to Heaven's Command Center with as little bloodshed as possible.\nComplicating the situation, Garand appears on a screen. He and his men have commendeered\nan elevator crawler and are on their way up with their mechs. Though Heaven is a huge\nstructure, it is not a military installation, so with the help of sympathizers, getting\nto the Command Center is surprisingly easy. Yanna is enraged, but her actions are always\npragmatic, so she surrenders the Command Center when the odds are stacked against her.\n\n* Elevator Falls - Once Command is secured, the way to the Dreamer is open. Lydia says\nshe will cover their escape and then begin negotiations with the govenment for release\nof the station. She is, of course, lying. After the Dreamer departs, she does help the\nDreamer escape by threatening the UEA ships who cannot fire on the station, but once the\nDreamer is clear, she turns Heaven's weapons on the tether. As the support is destroyed,\nHeaven begins spinning out of orbit while the elevator cable begins to fall, slowly at\nfirst, then faster and faster. Garand uses his mech to punch free of the doomed elevator,\nbut he is a very low orbit. The damage from the cable's impact is incredible, as the\nwhite-hot dimond-fiber cable slams into the red dust at several times the speed of sound.\nThe elevator is more than one and a half the length of the planet's equator and slowly\nwraps itself around Mars destroying everything around it for miles. The impact raises a\nmassive cloud of dust and leaves a huge canyon visible from space. The destruction is\nunequalled in the history of mankind. The death toll is in the millions. The UEA must\nrescue Garand and Heaven station, so the Dreamer crew can begin the sad trip to Jupiter.")
                      )
                    ),
                    Core.vx_new_string("Dreams of Death"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreams of Death"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Epilogue - The Heaven crew is rescued from a harrowing tumble into space, but the\nstation spins off into space. Lydia proudly takes full credit for the assault in the\nname of a free Mars. There is little doubt that Lydia will be tried and executed which\nseemed to be her plan from the start. Her testimony makes it seem that she duped the\nDreamer crew into fighting her battle for her. There are many, however, who draw a\nconnection between the Dreamer crew and the disasters on the Moon and Mars. They are\nnot officially terrorists, but you wouldn't know it from some of the news stations. The\nelevator disaster almost exclusively harmed the Mars Federation which shifted the\nbalance of power back toward the Free Republic, which was Lydia's intention. Garand was\nsaved by a daring low-orbit rescue. The UEA uses his story and the elevator fall to try\nto deflect attention from their crimes on the Moon, but the UN determines that the\nCopernicus Disaster was an act of state oppression and that the UEA should be subjected\nto sactions.\n\n* Jupiter - With fresh supplies and full fuel tanks, the Dreamer is easily able to make\nJupiter. There, Dr. Peyarje transfers to the JAW Skunk Works team on Joshua Station.\nHis new thought control system is refitted into the new Prometheus prototype mech.\n\n* A Mad Plan - The UEA leadership assesses their situation are are not happy at all.\nThey invested massive resources developing Dr. Peyarje's mech control system to gain the\nupper hand, but now that technology will shift military power toward the Jovians instead.\nTheir actions have caused the Selenites to openly hate and fear them. The Martian\neconomy is in ruins with their ally the Mars Federation hit hardest. The Venusian Bank\nis still behind them, but they won't be if UEA influence collapses. The military proposes\na heartless plan: destroy the Jovian colonies now before the new technology can be used\nand the entire Solar System will fall under UEA control. The Venusians can be bought off.\nThe disasters on the Moon and Mars leave them in no position to fight back. The other\ncolonies are too small and will have to fall in line. All of this chaos has created an\nopportunity to establish a new order, but the time to act is now.\n\n* The Hammer Falls - The 4th Fleet, still assigned to recover Peyarje and waiting just\noutside of Jovian space, is ordered into action. The Elysee Station sensor net has been\ndisabled by a UEA agent, allowing the fleet to close with the colony undetected. A\npowerful jamming device has been deployed by the fleet to prevent the station from\ncalling for help. The ships and mechs are ordered to attack Joshua Station to disable\ntheir defenses and force them to negotiate the extradition of the 'terrorists'.\nUnknown to them, their attack is a diversion for an elite squad of marines in exo-suits\nwho will use retro-rocket packs to deorbit Elysee Station. Their real plan is to send\nthe capital colony and all its inhabitants plunging into the Jovian atmosphere within\ntwenty-four hours. With its leaders and their central hub gone, the Jovians will fall\nunder UEA control.\n\n* Dragonstriker - On Joshua station, the characters are introduced to the new elite\nVindicator mechs as well as the prototype Prometheus. Each have been fitted with the new\nCAT control system, but have yet to be tested. Suddenly advanced warning alarms sound,\nthe station is under attack! Ranho Garand's team of elite mechs are charging toward the\nstation, his massive Dragonstriker armor slicing through the Jovian defenses. His\nintense will and discipline give him near-perfect control over the still imperfect\ncontrol system fitted to the prototype Dragonstriker. The characters launch to meet him,\nand the Dreamer hastily launches to lend support to the defending destroyers. All long\nrange communications are disrupted by jammers, so a courier ship is sent to warn the\nother colonies. The battle is intense, but before it can be resolved, the courier\nreturns. The pilot, Carl DeMers, broadcasts a warning when the interference clears:\nthere is another larger force that has attacked Elysee station! They have fixed rocket\npacks to the hull and are decelerating the entire colony out of orbit! Everyone at\nElysee will die when the station breaks up in Jupiter's atmosphere.\n\n* Taking Sides - Kleb’s total lack of honor have pushed Garand’s loyalties to the\nbreaking point. If he finds out about the true plan for Elysee, he will turn on Kleb’s\nfleet. This will cause other fleet elements loyal to Garand to turn or withdraw from\ncombat. The mechs board their ships are are quickly, re-outfitted on the short trip to\nElysee.\n\n* The God and the Dragon - They arrive at Elysee to find the battle in full swing, with\nthe Jovian forces slowly being driven back by the UEA Fleet, and the retro-rockets are\njust beginning to fire. The JSS Godsfire, its weapon block mauled by enemy fire, is\ntrying to evacuate as many civillians as it can, using its remaining firepower to keep\nthe UEA exos and fighters at a distance. Two teams are deployed: one to fight the UEA\nspecial forces and disable the rockets, and the another to battle the UEA fleet. The\narrival of the Prometheus and Dragonstriker, and a detachment of other exo-armors,\nquickly turns the tide of battle. The battle seems unlikely to be resolved soon, thanks\nto the power of Kleb’s Posideon flagship. Garand confronts his former boss, and flies\nstraight toward the Posideon. The Dragonstriker is heavily damaged by the fire, but\nmanages to clamp unto the Posideon's bridge and opens fire at point blank range. The\nDragonstriker and Posideon go up in a massive explosion, damaging nearby ships. The tide\nof battle suddenly turns. Many UEA soldiers were unhappy with Admiral Kleb's actions and\nare easy to convince with impassioned plees. The rockets are disabled and Elysee station\nuses its engines to regain its correct orbit.\n\n* Epilogue: Garand - Of Garand, no remains are found. While he could have escaped in the\nescape pod, it seems unlikely that he survived. That the CSS Karana, an Uller-class\nmissile cruiser believed destroyed during the battle, is missing is noticed during\ncleanup months later, but no connection is ever made between the two events. Garand did\nsurvive, but was horribly wounded, and was recovered later by the crew of the Karana,\nwho had trained under him.\n\n* Epilogue: UEA - Kleb was killed in the destruction of the Scylla’s bridge. The UEA\ngovernment publically him off as a 'lone gunman' who acted without official sanction and\nengages in a ruthless purge of the Navy’s command structure to 'remove any who might\nseek to follow Admiral Kleb’s example'. In fact, they use this to eliminate to expunge\nor marginalize those taught by Garand or 'corrupted' by his philosophy from the upper\nranks. Their shadowy ties to Venus remain as strong as ever, and, much to their relief,\nthe diplomatic repercussions of the Odyssey affair fade away over the next year.\n\n* Epilogue: Venus - Malachai falls into disgrace with VenusBank for his failure to\nproduce results or protect the existance of Project Methuselah, and becomes a\ndissatisfied freelancer. For the next decade he wanders the solar system, hatching mad\nschemes to put him in the good graces of his former employer once more and destroy the\nConfederation. He is eventually captured by SolaPol and disappears. VenusBank begins\nscaling back its operations slightly, uncertain of just how much the Confederation knows.\nNo public or private charges are ever made by the Confederation over the poaching of the\nFloaters or the aims of Project Methuselah, leaving the Bank executives in a very\nunpleasant information vacuum.\n\n* Epilogue: Mars - The consequences of the Martian Elevator take a long time to\nshow themselves. Initially, neither Martian government accuses the other of the\ncollapse. Evidence is sketchy, and the presence of Jovian and UEA agents on-site makes\nthings even more uneasy.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Europa Incident"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Europa Incident"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Flashlight Project - Blocked from what they believed to be their rightful control\nover the colonies at every turn by the Jovian Confederation, UEA launched several\ntop-secret advanced weapons projects.  One of the less successful efforts was the\nFlashlight Project, an attempt to develop heavy autonomous drone combat spacecraft.  The\ntwo Lucifer prototypes, the ultimate end result of the project, were ideal for commerce\nraiding.  They could operate for years without more than cursory communication with their\nhome base; their stealth systems could hide them from the most determined sensors; and\ntheir heavy array of particle beam weapons could savage a warship in a single volley.\n* The project turned out to be too complicated and expensive to mass-produce, but the\nprototype was dispatched to Jovian space for 'field trials', with orders to destroy any\ntarget with a Jovian registry it came across. The plan was to disrupt the Jovian economy\nenough to make them more pliable to UEA demands.\n* After the Battle of Elysee, the UEA council determined that the Lucifer would be a\npolitical hand grenade if it was captured. They ordered the Lucifer to self destruct, but\nit had already disappeared in the radiation and magnetic fields around Jupiter, the very\nfields they had relied upon to hide the drone as it went about its work.  Finally, the\ncrew managed to get a signal through, but some interference caused the drone to change\ncourse and crash on Europa instead of self-destructing."),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("A Damaged Freighter"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("A Damaged Freighter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The UEA Black Eagle Squadron is smuggled aboard the freighter Narsus to recover the\ndatacore of the Lucifer and destroy any evidence. The Black Eagles had planned to slip\nonto Europa undetected after the Narsus dropped into orbit around the moon. Supposedly,\nshe was to be taking on water for a journey up to Ganymede. The plan was that she\nwould deploy the Eagles’ exo-armors, head off to deliver the rest of her cargo, then\nreturn and pick them up a week later. Faulty parts led to an explosion in Narsus'\nengines during her insertion burn. The captain managed to drop the freighter into a\nstable orbit around Europa before the engines completely died, but then, as is\nstandard practice for merchant crews, immediately set off a distress beacon.\n* With all the unexplained attacks in Jovian space lately, an exo-armor patrol is\ndispatched from their carrier to investigate. The crew seems to sincerely have\nsevere engine trouble. Some of the Jovians will have to board the Narsus leaving\ntheir exos tethered to the hull. The remainder stay on patrol.\n* Inside, the freighter is in zero-g and is particularly cramped. The crew's story\nseems to hold up, but the four passengers are uneasy about the situation. The engines\nare in bad shape and are irradiated. The cargo hold has large, sealed, liquid cargo\nbins labeled with warnings as liquid methane. If the Jovians start attempt to open the\ncargo, the captain will lose his nerve and reveal that the passengers are UEA pilots.\nA firefight erupts and the Black Eagles get into the cargo containers and remotely\nopen the cargo bay to vacuum. The UEA troops escape by detonating the Narsus as a\ndistraction (killing the crew, of course) and releasing an ECM scrambler pod. They\nhave clearly descended to Europa somewhere.")
                      )
                    ),
                    Core.vx_new_string("Escape to the Ice Planet"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Escape to the Ice Planet"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* With Europa's low surface gravity, the Black Eagle team's exo-armors descend to the\nsurface safely using their own thrusters. Europa’s surface is covered by a thick layer\nof ice. Unlike ice on Earth, this isn’t slippery - it’s nowhere near the freezing\npoint. The surface is perilous with unstable ground and spontaneous geysers.\n* The UEA team radios for a pickup using a small signal booster in orbit. They then\nbegin a tedious search for the Lucifer.\n* The JAF patrol rejoins its carrier and begins a search of Europa.\n* The UEA team eventually discovers the crashed Lucifer but finds footprints and\nvehicle tracks nearby. The data core has already been removed and taken to the small\nresearch station Europa 1. The UEA team breaks the ice beneath the Lucifer to let it\nfall into the ocean below never to be discovered. Then they must follow the tracks to\nrecover the data core before its secrets are revealed and/or silence the witnesses.\n* When the JAF arrives, they must deduce what has happened and race to intercept the\nUEA team.")
                      )
                    ),
                    Core.vx_new_string("Hide and Seek"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hide and Seek"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Europa 1 is not well guarded, but it is a large facility with lots of staff. The\nUEA must infiltrate the base and quickly locate the data core before the rendezvous in\n12 hours. The station is unarmed, and if a firefight erupts, everyone will flee to the\nunderground shelters. If they run out of time, the UEA may be forced to destroy the\nbase, but this would not guarantee the destruction of the data core.\n* The JAF can immediately land at the base and are introduced to Dr. Han Krieger and\nhis attractive daughter Paula. They have recovered the data core, but did not have\nsufficient equipment to study the downed ship.\n* If the UEA can get close enough they can hack the core remotely and trigger a data\nwipe. They may also threaten to blow up the base if they are not given the core.\nWhether they succeed or not, the UEA will have to retreat back to the rendezvous\npoint or be stranded. When they retreat, the JAF will have to guess at where they are\ngoing and why, but either way they will need to pursue them.")
                      )
                    ),
                    Core.vx_new_string("Hell Unchained"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell Unchained"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Suddenly, a large shadow passes overhead. It's a frigate, the UEA pickup has arrived.\nSix exo-armors exit its bay and begin to advance.\n* As the JAF prepare to meet them, the frigate opens fire. Suddenly, there is a deep\ntremor in the ice below. The UEA agents feel it too and stop code. Suddenly, from under\nthe ice, an impossibly brilliant beam of light lances up to engulf one of the\ndescending exo-armors. It doesn't explode but it just melts and disappears in the beam.\nSoon, the ice seems to explode and the enormous black form of the Lucifer rises from\nbelow.\n* With its data core removed and a firefight nearby, it switched to its limited,\nsecondary systems and it is unable to determine friend from foe. Its massive guns are\nclearly building another charge and moments later it fires at the frigate's engines.\nThe crippled engines briefly leak fusing hydrogen before destroying the frigate in a\nnuclear fireball. It then begins to engage the new exo-armors from the frigate.\n* The JAF and UEA will have to quickly come to terms with the fact that the Lucifer\nwill kill them all unless they work together.\n* If the Lucifer escapes, it will boosts off Europa into a tight slingshot orbit\nand then use its ECM systems to hide in Jupiters radiation belt. Without its higher\nbrain functions, the Lucifer is more of a killing machine than an assassin, so it is\nnow a question of how much damage it will do before it is taken down.\n* If the Lucifer is destroyed over Europa, it will crash into the ice and be lost in\nthe depths. Without their pickup, the UEA agents will have to negotiate the terms of\ntheir surrender. Regardless, they will be tried and interrogated for their actions.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Jovian History"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jovian History"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Mercury, Helios Station - A permanent colony of 8 million orbiting Mercury is\nestablished. Its orbit puts it constantly in Mercury's shadow protecting it from\nmost of the Sun's deadyly rays. Naturally, it has access to almost limitless\nsolar power. All equipment around Mercury is outfitted with a unique heavy armor\nthat combines hard radiation shielding with solar collection.\n\n* Venus, New Tokyo - The capital of Venus is a sprawling megaplex of 15 million at\nthe North Pole of Venus. Though terraforming has been going on for decades, the\npoles are still the only places where the temperatures are survivable. The city\nis completely enclosed and partially underground. Industry is relegated to the\nwastelands outside. The Venusian bank invested heavily in developing Venus and has\nseen phenomenal growth. The bank now effectively owns the entire planet.\n\n* Earth 2210 - The UAE launches an attack against the Jovian civilian colonies in an\nattempt to push the colonies back into line.\n* Mars, Marsquake - The obital elevator around Mars is destroyed by sabotage, and\nthe enormous, carbon-diamond fiber cable was slowly dragged from orbit as the\nplanet turned. The cable dropped with devastating force, wrapping around the\nequator two and a half times. Fortunately, the sparse population of Mars reduced\nthe scope of the devastation. There is a common joke that Mars is now the only\nplanet with an actual black line at the equator. Hot heads and smugglers have\ntake to racing down the trench created by the cable.\n\n* War Aftermath - Some UAE leaders were found guilty of crimes against humanity\nfor their attacks against the Jovian colonies. The other colonies increasingly see\nEarth as irrelevant to their future. Earth politics is divided on how to proceed.\nThe UAE has gone underground and now covertly funds a paramilitary group of\ndisgruntled combat veterans and pirates in order to further its aims in space.")
              )
            ),
            Core.vx_new_string("Jovian Characters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jovian Characters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aglaee Dessources"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aglaee Dessources"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mysterious, beautiful, and cold, Aglaee DesSources is the captain of the\nBeautiful Dreamer, a privateer vessel. Once an extremely promising CEGA Navy\ncaptain, she retired at the age of thirty to her present position.\n* 42 year old aristocratic-looking woman.")
                      )
                    ),
                    Core.vx_new_string("Adrian Allen"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Adrian Allen"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Adrian is bookish and quiet pilot unlike the adventurous, rowdy Exo-pilot crowd.\nHe is inexperienced and sometimes panics in combat when clear solutions are not\nobvious. He is currently single athough he is attracted to Foxy Fujima.\n* Age: 22")
                      )
                    ),
                    Core.vx_new_string("Madelaine Koudriopoulos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Madelaine Koudriopoulos"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Strong willed and tenacious fighter pilot.\n* She is the only daughter of Konrad Koudroipoulos, Khannan's commander. Because of\nthis, she had to fight with pilots who accused her of favoritism and her father who\nmade every effort to get her to step down.\n* She has been teamed up with Adrian Allen who has become like a big brother to her.\nShe interferes a lot with his personal life, much to his despair. She is bold but\nis uncomfortable dating, so she currently has no boyfriend.\n* Age: 21")
                      )
                    ),
                    Core.vx_new_string("Foxy Fujima"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Foxy Fujima"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Freelance reporter travelling from cylinder to cylinder in search of a story. She\nhas a high attitude of the moral importance of reporting, so she will not cover\ntrival stories which has limited her career development. Her beauty has attracted many\nmen, but she seems to only be interested in her career.\n* Age: 22")
                      )
                    ),
                    Core.vx_new_string("Dr. Agram Peyarje"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dr. Agram Peyarje"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Brilliant scientist researching human/machine interfaces.\nA staunch pacifist, Peyarje is repelled by war in general and utterly\ndisgusted by what CEGA plans to do with his inventions. He sees the Confederation as his best\nhope of escape, even if they too are warmongers.")
                      )
                    ),
                    Core.vx_new_string("Dr. Catherine Glit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dr. Catherine Glit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Catherine used to serve as Ismael Li's personal assistant and moderator. She\nis now the representative of the escaping Lunar refugees.\n* She is an excellent doctor, highly regarded by all. While she appears cold\nto everyone, she is shy and only opens up to close friends.")
                      )
                    ),
                    Core.vx_new_string("Ismael Li"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ismael Li"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Ismael Li is the leader and driving force behind the burgeoning Lunar resistance movement. Once\na miner, Li worked hard, long hours in the tunnels deep below the Lunar surface and Helium-3\nharvesters. He quit in disgust when he realized that the company he’d worked ten hard years for\nwas constantly operating at a loss and systematically abusing its employees in order to provide\nCEGA and massive Earth corporations with cheap Lunar ores. Using the excellent education\nprovided to all Selenties, Li spoke out against the CEGA \"occupation��?, making speeches and\ndistributing eloquent pleas for regime change in an attempt to awaken the populace to the truth\nof their situation.\n\nFive years ago, under investigation by CEGA and Lunar police forces, Li took his crusade\nunderground. No matter what he did, legitimate means would only get him arrested. He set\nabout building a proper revolutionary organization out of the public eye, aiming to drive CEGA off\nthe Lunar surface by force of arms. Strangely, this has won him many more converts among the\nusually peaceful Selenites than his speaches ever did. He finds this somewhat disheartening,\nbut still forges ahead.\n\nLi is now ready to launch his uprising. The arrival of the PCs has moved his timetable up a bit,\nas their actions on Venus have distracted many of CEGA’s forces and their skills can be a great\nhelp to him. He is a fundamentally honest man, and will promise fuel, parts, and provisions\nin exchange for the PCs’ help. He will give them what he promised without short-changing or\nholding back. He also truly believes in his cause, and would willing sacrifice his life to save any\nof his supporters.")
                      )
                    ),
                    Core.vx_new_string("Jovian Floater"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jovian Floater"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Jovian floater is giant, blimp-sized animal filled with gas that lives its entire\nlife floating in Jupiter's atmosphere. It has a unique biology similar to photosynthesis\nthat consumes water, methane, and radiation to produce food. This biology also produces\na short-lived compound that repairs radiation damage to its DNA which allows it to\nsurvive in the harsh radioactive environment. The medical significance of this creature\nespecially to space flight cannot be overstated. How life could begin in such high\nradioactivity remains a mystery.")
                      )
                    ),
                    Core.vx_new_string("Luka Ansevik"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Luka Ansevik"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Captain Luka Ansevik is the commander of the small CEGA lunar garrison force. Captain\nAnsevik is throughly unimaginative, a very by-the-book officer, assigned to a post not likely to tax\nher capabilities. After all, what threat could the unarmed and industrious Selenites pose to the\nmilitary might of CEGA? When revolution erupts around her, Ansevik will do her best to contain\nit, but becomes increasing desperate as the situation unravels. She knows that failure to resolve\nthe situation before her superiors are forced to take notice will be the end of her career.\nAnsevik is an officer focused on tactics and administrative work. As such, her combat skills\nare virtually nonexistent - she is much more comfortable ordering others into combat than\nfighting herself. This leads to disaster, as it leaves Ansevik out of touch with her troops as\nthey desperately fight the rebels in the streets of Copernicus. Finally, increasingly desperate to\ncontain the situation, she could be the one to order the dome blown.\n(Ind) Ysa Cantroni\nYsa will be in her element during the Lunar uprising. Action, crusading for justice, and a bevy of\nhuman interest stories to practice her reporting skills on! Having spent a year touring the Earth\nsystem at one point, Ysa has a number of useful contacts on Luna that can supplement those\nprovided by DesSources and Li. Even if she doesn’t travel down from the Dreamer with the PCs\ninitially, she will try to find some way down so she can help the Selenites of Copernicus fight for\ntheir freedom once the uprising begins.\nOf course, Ysa might not be quite as good at tunnel fighting as she thinks she is. Saving her\nfrom herself could be an exciting and frustrating subplot for a PC, especially one who has\nbecome emotionally involved with her. Having a mysterious masked figure in a red CEGA exosuit\n(Garand, of course) help save her and keep her safe from CEGA forces, but carefully avoid\naiding the rebels, might create an interesting mystery... Or not, depending on how sharp your\nplayers are.")
                      )
                    ),
                    Core.vx_new_string("Lydia Ketchum"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lydia Ketchum"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Lydia Ketchum is a Martian Republic Rook, a Ranger trained for deep-cover operations\nwithin the Federation. One of the Republic’s best rangers, she’s been assigned to watch\nthe orbital elevator. She takes her job quite seriously, and has so far managed to avoid\ndrawing the notice of the Federation.\n\n* Unfortunately, not all is as it appears with Ranger Ketchum. She is from the Isidis\nPlanitia, an isolated area that recently (2207) declared its independence from the rest\nof the Republic. The Isidisians are even more militant about the Federation than\nordinary Republic citizens, and see the Federation’s orbital elevator as a very personal\nand insufferable insult to their national pride.")
                      )
                    ),
                    Core.vx_new_string("Yanna Summers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yanna Summers"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Yanna Summers is the decidated and hardworking administrator of the Martian Orbital Elevator.\nWhile her actual domain is very small - she only has direct control over Heaven and Hell station -\nthe amount of commerce that travels up and down the beanstalk has given her a sizable amount\nof influence within the Federation’s government. This is counterbalanced by her attempts to open\nFederation society up a little. Her position and efforts, however, did draw the attention of the\nSociety of the Evolved Human, which she eagerly joined when offered membership.\nYanna’s connection to the Society was what lead Aglaee to steer the players towards her, and\ninclined her to help them find a home for the refugees. It also could be what leads to her asking\nthe PCs for help with the scientist case - another test by the Society to help them reach their\npotential. She has contacts all through the Federation bureaucracy, and could use them to help\nthe players with their investigation... But there will likely be a price of some kind, as she’s already\nstretched her resources thin to secure passage for the refugees. This could, however, lead to the\n\"Refugees Under Attack��? subplot. Or Yanna could be a background character that just serves to\nlead the PCs into the episode.")
                      )
                    ),
                    Core.vx_new_string("Ysa Cantroini"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ysa Cantroini"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Ysa\nhas spent the past several years travelling the solar system and working odd job. This has given\nher an extremely wide range of skills (though none at more than 2/1 or 2/2) and connections,\nespecially here on her native Venus.\nYsa is bright and intelligent, generally assuming a quiet but cheerful air. She’s a wandering soul,\nand doesn’t think she could ever stay happy in one place or one job for the rest of her life. She\nis seriously considering becoming a reporter, however, as this gives her a way to travel and\nencounter a wide variety of experiences while getting paid and doing good. Much to her shame,\nher father is a high-ranking executive in the Venusian bank. She has cut all ties with him, and\ndoes not regret doing so, but this secret connection could still draw suspicion to her.")
                      )
                    ),
                    Core.vx_new_string("Admiral Russel Kleb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Admiral Russel Kleb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Admiral Kleb is the throughly corrupt commander of the CEGA 4th Fleet. A hard-line war\nsupporter, Kleb believes the inhabitants of the colonies to be completely inferior to native\nTerrans. This provides him with the justification he needs to take any action in pursuit of CEGA\ndominance. He is in the pay (and service) of the Venusian bank, as they provide him with the\nmeans to further his own ambitions, but he will not hesitate to betray them for his own advantage.\nThey are, after all, just inferior colonists, cowardly employing bribery when they should be using\nrighteous force.\n\n					* Despite his biases, Kleb is a brilliant tactician, equally adept at combat\n					maneuvers and political backstabbing. He is a staunch member of the UEA ruling\n					faction, and an adherent to the warship-centric old school of military thinking. To\n					him, adherents of the exo-centric school are children playing with fancy new toys.\n					Ranho Garand, as the most prominently successful exopilot in the UEA navy and focus\n					of the Dragonstriker program, is a frequent target of Kleb’s scorn.")
                      )
                    ),
                    Core.vx_new_string("Ranho Garand"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ranho Garand"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Commander of the 3rd Division of the CEGA 4th fleet, Garand is an ace exo-armor pilot\nand media darling. Despite his military connections, Garand is a devoted member of\nChang’s political faction. While he does believe the military to be a necessary tool, he\ndoesn’t believe that it is the proper one to further UEA’s domination over their wayward\ncolonies. He was one of UEA’s first exo-armor pilots, and taught many of the current\ngeneration, passing on both his piloting skills and his philosophy.\n\nGarand is a man of honor and discipline, with a spotless service record and excellent\nreputation. He does not enjoy killing or combat, but his honor demands that he follow\norders and defend his people. Despite his iron will, he is prone to fits of irrational\nrage towards those who have forced him to commit (or involved him in) dishonorable acts.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Commercial Spacecraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Commercial Spacecraft"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Albatross Transorbital Shuttle"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Albatross Transorbital Shuttle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Albatross is the latest in a long line of shuttles used for cargo and\npassenger transfers to various atmospheres. One or two are standard equipment for\nany large military ship."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("45tons"),
                        Core.vx_new_string(":speedair"),
                        Core.vx_new_string("1200kph"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("1.5g")
                      )
                    ),
                    Core.vx_new_string("Beautiful Dreamer Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beautiful Dreamer Transport"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Beautiful Dreamer, at first sight, seems to be a standard Inari-class liner. As\nwith many Inari, the Dreamer has been modified heavily, and there are many differences\nin the ship’s lines. Two concealed railguns run along the ship’s spine, providing an\nunpleasant and unexpected punch. The cargo bays on the craft’s edges have been modified\nto carry mechs and fighters, complete with concealed catapults.\n* 2 Medium Railguns\n* 4 Mech Bays - Cannot land fighters.\n* 2 Magnetic Catapults"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("54"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10000tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("270m")
                      )
                    ),
                    Core.vx_new_string("Inari Space Liner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inari Space Liner"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unlike the bulk transport Mule, the Inari was designed to be a high speed passenger\nliner to get people quickly between the planets. Though not as modular as the Mule,\nthe Inari can be heavily customized to specific tasks. Though it is not a military\nvessel, the Inari is fast and can be modified to be cary significant armor and weapons,\nthus making it well suited as a privateer."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Georgia on my Mind"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("108"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10000tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("200m")
                      )
                    ),
                    Core.vx_new_string("Carver Mining Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carver Mining Ship"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Carver is designed for the purpose seeking out and mining asteroids.\nThe ship is very odd looking with three insect-like legs surrounding the\nmain laser drill. The standard protocol for asteroid mining is to land on\na mineral-rich feature, drill a deep tunnel, and then pressurize the\ntunnel so further operations can be done without environment suits. Ore\nis sent on a conveyor belt to the onboard smelter for separation and\npurification.\n* The Carver is intended to work perpetually. Its drive system is slow\nbut extremely robust, able to use mined hydrogen for fuel and any waste\nmaterial as reaction mass. Small tugs commute back and forth carrying ore\nto nearby space colonies and returning with supplies and spare parts. The\ntugs also carry replacement crew members.\n* The Carver has been in service for so long that their prices have come\ndown dramatically. Since this work is enormously profitable, banks are\nwilling to finance individuals if they can demonstrate a sound business\nplan."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".15g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1200tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("80m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("80m")
                      )
                    ),
                    Core.vx_new_string("Mule Freighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mule Freighter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Mule Freighter is a simple, reliable design for transporting large\namounts of cargo across the solar system. It has no interior cargo hold,\ninstead it has a series of connectors to link self contained cargo pods\nof various sizes. The connectors can also be used to hook onto asteroids\nor other ships to allow the Mule to act as a tug.\n* The Mule is the most common ship in the solar system and is used by\nevery government and commercial space organization. Because the Mule is\nso versatile, it can even be used as a slow carrier or missile gunboat.\nFor similar reasons, it is a favorite ship for smuggling or piracy as\nwell.\n* Its acceleration reduces as its load increases. It can transport up to\n40ktons before its acceleration becomes too low to be practical."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Narsus"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".4g"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("6"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4000tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("345m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("40m")
                      )
                    ),
                    Core.vx_new_string("Ox Orbital Tug"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ox Orbital Tug"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Ox is a space-only shuttle used for short tranports between space\nstations, tugbot duty, asteroid transport, and salvage operations. It has\nlarge manipulator arms to manage unusually shaped loads. It is a very\nsturdy if slow craft."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".5g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("41tons")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Jovian Federation"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jovian Federation"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Jovian capital ships are built for easy maintainance and reuse.  They are composed of 4\nsections: engine, cargo, habitat, and mission. All but the mission section can be\ninterchanged with the equivalent sections from other ships. The habitat ring can even be\nremoved for short range missions, or additional cargo modules can be added for greater\nendurance."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Jovian Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jovian Pilot")
                      )
                    ),
                    Core.vx_new_string("Jovian Mech Jock"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jovian Mech Jock")
                      )
                    ),
                    Core.vx_new_string("Jovian Tech"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jovian Tech")
                      )
                    ),
                    Core.vx_new_string("Lancer Space Interceptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lancer Space Interceptor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Despite the heavy investment in Mech Suits, Jovian interceptors remain\nan important part of Jovian armed forces. Their high acceleration allows\nthem to be sent as the first line of defense ahead of the slower Mech\nSuits. They are well suited to recon and hit-and-run missions. They carry\nvariable weapon pods for specialized recon, ECM, bomber, or long-range\nscouting missions.\n* 1 Light Laser Cannon\n* 6 Light Missiles\n* 2 Medium Missiles\n* 1 Heavy Missile"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("50tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("3.2g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("10m")
                      )
                    ),
                    Core.vx_new_string("Pathfinder Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pathfinder Mech Suit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("JovianChronicles/PathfinderToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Pathfinder is a rugged, simple to maintain Exo Suit design that forms the majority\nof the Jovian Mech forces. It is very agile but relatively fragile and mounts only\nlight weaponry because it is designed primarily as a scout craft. Its high speed,\nagility, and exceptional close combat abilities proved the value of Mech Suit design and\nit remains the most iconic Mech Suit in existence.\n* 1 Medium Particle Cannon\n* 2 Medium Missiles\n* 2 Plasma Lances"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("35tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("15.4m"),
                        Core.vx_new_string(":speedland"),
                        Core.vx_new_string("26kph"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("2.8g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("11m")
                      )
                    ),
                    Core.vx_new_string("Retaliator Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Retaliator Mech Suit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Retailator is the standard Jovian interceptor Mech. Well-armed and fast for its\nsize, it can take on larger opponents and come out on top. Its speed comes at the\nsacrifice of some armor unfortunately and its thrusters always overheat forcing pilots\nto take great care or risk burned out thrusters.\n* 1 Medium Rail Cannon\n* 4 Medium Missiles\n* 6 Light Missiles\n* 2 Plasma Lances"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("42tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("15.5m"),
                        Core.vx_new_string(":speedland"),
                        Core.vx_new_string("66kph"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("2.4g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("12m")
                      )
                    ),
                    Core.vx_new_string("Vindicator Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vindicator Mech Suit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Vindicator is the most powerful mass-produced Mech in the solar system. It carries\nmassive armor and armament, but its high cost limits its use to a few elite pilots. It\nis also painfully slow compared to the Pathfinders and Retailators it flies with.\n* 1 Medium Rail Cannon\n* 1 Medium Laser Cannon\n* 10 Heavy Missiles\n* 3 Plasma Lances\n* 2 Anti Missile Systems"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("70tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("16m"),
                        Core.vx_new_string(":speedland"),
                        Core.vx_new_string("36kph"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("1.8g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("14m")
                      )
                    ),
                    Core.vx_new_string("Prometheus Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prometheus Mech Suit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Prometheus was intended to be a prototype for a new generation of mech suits which\nwould be more efficient, better armed, and faster than their predecessors. However, as\ndevelopment progressed, several experimental systems were added that made it a one of a\nkind wonder that could never be mass produced.\n* 1 Heavy Plasma Cannon\n* 2 Light Plasma Cannons\n* 2 Plasma Lances"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("64tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18m")
                      )
                    ),
                    Core.vx_new_string("Prometheus Storm Attacker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prometheus Storm Attacker"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The [Prometheus Mech Suit] can be equipped with a heavy set of extra armor and weapons.\nThe additional mass of the armor is negated by additional thrusters. If these thrusters\nare damaged the armor can be jettisoned leaving a fully functional Promethus.\n* 1 Heavy Plasma Cannon\n* 2 Light Plasma Cannons\n* 2 Plasma Lances\n* 2 Heavy Laser Cannons\n* 1 Particle Scatter Gun\n* 80 Medium Missiles"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("82tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("21m")
                      )
                    ),
                    Core.vx_new_string("Athena Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Athena Destroyer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Athena Destroyers function much as their wet navy ancestors. Depending\non the political climate, they are either protective shepards or hunting\nwolves. The Athena's job is to get in the way of danger. If an unknown\nvessel is detected, the destroyer will move ahead into a blocking\nposition to defend the rest of the fleet.\n* The Athena is particularly fast and maneuverable for a capital ship and\nworks closely with any small craft.\n\nWeapons:\n* Point Defense System\n* 3x Particle Accelerators\n* 6x Railguns\n* 2x Area Defense Laser Cannon\n* 1x Missile Bay"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".8g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("10ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("291m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("81m")
                      )
                    ),
                    Core.vx_new_string("Forge Patrol Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Forge Patrol Carrier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Forge class carriers carry 12 pilots including squadron leaders.\n* There are 24 Forge class vessels commissioned.\n* Speed: .8g\n\nWeapons:\n* Point Defense System\n* 8 Rail Cannons\n* 2 Laser Cannons\n* 2 Missile Bays\n\nVehicles:\n* 6x Mobile Suits with room for 12\n* 6x Catapults"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("39000tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("460m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("285m")
                      )
                    ),
                    Core.vx_new_string("Explorer Scout Ship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Explorer Scout Ship"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One of the earliest planetary exploration ships, the Explorer has been\nproduced for many years and is a reliable though uninspired design. Its\nmodular design is its greatest asset and has ensured its continued use\nfor decades. The crew module can be extended on a tether for artificial\ngravity with the other end counterbalanced by a water tank."),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".4g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("345m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("40m")
                      )
                    ),
                    Core.vx_new_string("Gagarin Fleet Tender"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gagarin Fleet Tender"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Gagarin is a mobile tender designed to facilitate drydock style repairs close to the front lines.\n* Its mission hull is a gigantic workshop with huge door sections that can surround and refit a vessel in a\npressurized environment.\n* Speed: .1g\n\nWeapons:\n* Point Defense System\n* 1x Missile Bay"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("92ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("740m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("285m")
                      )
                    ),
                    Core.vx_new_string("Javelin Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Javelin Cruiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Javelin is the most common warship in the Jovian Navy despite its\nage and lack of interceptor or Mech Bays. Its design is based on\npre-Mech combat philosophy, emphasizing heavy weapons on capital ships as\nopposed to projection of force using smaller craft. Therefore, it is\nvery heavily armed for a relatively small craft including the deadly\nheavy particle beam cannon.\n* Crew accomodations are small but comfortable with cleverly placed\nmirrors throughout the ship that give the illusion of greater interior\nspace.\n* Point Defense System\n* 2 Heavy Rail Cannons\n* 1 Heavy Particle Beam Cannon Turret\n* 2 Missile Bay\n* 6 Space Dart Heavy Missiles"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".6g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("20ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("235m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("72m")
                      )
                    ),
                    Core.vx_new_string("Valiant Strike Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Valiant Strike Carrier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Valiant Strike Carrier is a ship like no other. Every other ship in\nthe fleet is designed to work in cooperation with one another. The Valiant\nis designed to operate on long range, long term patrols with no backup.\nIt is therefore heavily armed, armored, and carries extensive supplies\nand fabrication facilities.\n* It has two rotating crew decks that are very spacious for a spaceship.\n* 6 Heavy Rail Cannons on 2 Turrets\n* 1 Missile Bay\n* 1 Spinal Particle Beam Cannon\n* 6 Magnetic Catapults\n* 1 Certifuge Crew Module\n* 2 Lancer Interceptors\n* 2 Pathfinder Mech Suits\n* 2 Retaliator Mech Suits\n* 2 Vindicator Mech Suits"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".8g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("40ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("320m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("75m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":UEA"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("UEA"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("United Earth Alliance"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("UEA Commando"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Commando"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry")
                      )
                    ),
                    Core.vx_new_string("UEA Marine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Marine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Standard issue for all regular infantry and covert ops personnel.\n* High Impact Plastics with reinforced joints.\n* Enhanced Sensory gear and Comm System\n* HUD Targeting\n* Optional Backpacks with custom gear"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("UEA Mobile Infantry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Mobile Infantry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Standard issue for assault and special forces personnel.\n* Hardened Crystalline Lattice Ceramic Compounds\n* Elaborate Sensory and Comm System\n* HUD Targeting with Smart Weapon links\n\nPowerful Backpack package including:\n* Ion thrusters\n* Heat Sink\n* Mini Fusion Plant\n* Y-rack gernade launcher (optional I-rack or micro turret)\n* Weapons can be powered from plant\n* Environmental Independence\n* Flamethrowers and Thrusters in arms and legs\n* Stealth options available"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("UEA Mobile Assault Infantry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Mobile Assault Infantry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Form is vaguely humanoid\n* Armor is extremely heavy and hardened\n* Weapons are built in and smart\n* Power Assist and Hand to Hand Weaponry make few obstacles a barrier\n\nWeapon Packages\n* When standing still the armor is considered a fixed weapon platform.\n* Heavy Machine Guns\n* Light Autocannon\n* Multiple Missile Launchers\n\nBackpack Package\n* Large Fusion Plant\n* Improved Heat Sink\n* Thrusters are extremely powerful\n* Wheels in legs for fast road movement\n* Speed and Maneuverability in open terrain are the trademarks of these types.\n* They are clumsy and overly destructive in tight quarters.\n* These models are purely Assault/Scorched Earth types similar to miniature tanks."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("UEA Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Pilot")
                      )
                    ),
                    Core.vx_new_string("UEA Mecha Pilot"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Mecha Pilot")
                      )
                    ),
                    Core.vx_new_string("UEA Tech"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA Tech")
                      )
                    ),
                    Core.vx_new_string("Cerberus Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cerberus Mech Suit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Cerberus is the first cutting edge Mobile Suit design from the UEA.\n* The name Cerberus comes from the large ECM pods on each shoulder which\ncontinually scan in all directions giving the appearance of 3 heads.\n* The Cerberus is designed as a hit-and-run unit, so it very fast and\nmanueverable but has limited endurance by design. It is only available\nto commanders and elite pilots.\n* 30mm Massdriver with Depleted Uranium/Tungsten rounds. 20 shots.\n* Linked 20mm Vulcan Autocannons in the head.\n* 1 Plasma Lance\n* 1 Mech Combat Knife"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("63tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17m"),
                        Core.vx_new_string(":speedland"),
                        Core.vx_new_string("36kph"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("1.8g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("15m")
                      )
                    ),
                    Core.vx_new_string("Dragonstriker Mech Armor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragonstriker Mech Armor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("JovianChronicles/DragonstrikerToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mechs are designed to battle other mechs and perhaps cripple enemy capital ships.\nThe Dragonstriker is a unique prototype designed to attack enemy capital ships and\ninstallations directly. It is a massive mech, towering over other mechs and carrying\nformidable weapons to battle both capital ship and other mechs.\n* The Dragonstriker has a detachable booster that provides extra acceleration and range.\nThe booster also houses the 2 Medium Laser cannons for strafing enemy capital ships.\n* 4 Heavy Anti-Ship Beam Cannon\n* 2 Medium Anti-Ship Laser Cannon (2 linked under for strafing attacks, mounted to booster)\n* 6 30mm Vulcan Autocannon (4 linked forward, 2 linked rear in head)\n* 4 Heavy Anti-Ship Missile (4 forward)\n* 2 Anti-Missile Laser Turret (1 forward, 1 rear)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("CXE-01"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("110tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("24m")
                      )
                    ),
                    Core.vx_new_string("Hachiman Destroyer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hachiman Destroyer"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Hachiman is the workhorse of the UEA navy. They have been produced\nfor many years with minor upgrades.\n* 1 Point Defense System\n* 6 Railcannon Turrets\n* 2 Missile Bays\n* 2 Laser Turrets"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".6g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("60"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("5500tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("208m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("80m")
                      )
                    ),
                    Core.vx_new_string("Lucifer Cybersat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lucifer Cybersat"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Lucifer’s designed for one purpose - to ambush and kill enemy warships.  Its\nsophisticated Stealth systems allow it to hide and its strong electronic warfare suite\nprevents its prey from calling for help.  Powerful thrusters allow it to accelerate at\nincredible speeds, and a cluster of six small linked particle cannons and two large\nones allow it to inflict massive damage very quickly.\n* Armor - Despite the advanced technology, its armor is quite thin for its size, and\nin a stand-up fight, it will almost certainly lose. The only questions are how to\nforce it into a stand-up fight and how many of its attackers it can take with it.\n* Particle Cannons - The combined power of the dual particle cannons are equal to a\nspaceship's main gun. They have separate fusion engines just to recharge its capacitors,\nbut it still takes 30 seconds between firings.\n* Particle Array - The 6 smaller particle cannons are designed for rapid fire against\nfast moving targets and are used between firing of the main guns.\n* Claws - Its claws are independent wire-guided drones armed with small energy weapons\nto deal with enemy interceptors. The claws are very fast and agile, but not very tough.\nThey can replenish their fuel reserves by docking with the Lucifer.\n* Speed - The drones will almost never use their full top speed, and the Lucifer will\nmake every effort to conserve its remass.  For long-range travel, it won’t boost at\nmore than 0.4 or 0.6 Gs except in short bursts.  Much of its time will be spent\ndrifting along a medium-traffic orbit.\n* Stealth - The Lucifer carries an advanced ECM/stealth package that allows it to\nsneak up on enemies and attempt to cripple them while scrambling any distress calls.\n\nECM(6, 10km), Stealth (6);\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Particle Cannon Cluster	E	F	+0	x12	4	+4	Hw,Red;AD(2),HEAT	Unl.\n2	Mega Particle Cannon	E	F	-1	x30	7	-1	Red,Hw;AD(2),HEAT;Link	Unl."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("CXS-01B, Automated Experimental Terror Raider"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("95tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.8m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("4g"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mission Section"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mission Section"),
                                Core.vx_new_string(":unitspecialtymap"),
                                Core.f_new(
                                  Base.t_unitspecialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Stealth Vessel"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Stealth Vessel")
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
                    Core.vx_new_string("Lucifer Claw Drone"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lucifer Claw Drone"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Armor:	10/20/30\n*Miscellaneous Threat Value (MTV): -\nCrew:	Computer 1 (Dumb, Level 2) (2 actions)\n\nAccessories: Autopilot; Arm: Manipulator Arm (R5, Can Punch); Armor: HEAT Resistant(5); Communications (-2, 2km);\nHostile Environment Protection: Radiation (4), Vacuum, Extreme Cold; Sensors(+0, 2km); Vulnerable to Haywire;\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Laser Cannon	E	FF	+1	x10	5	+0	Red;AD(1),HEAT	Unl.\n1	Plasma Lance	E	F	+0	x15	M	+0	AC,Red;HEAT	Unl."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("3tons"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("5g")
                      )
                    ),
                    Core.vx_new_string("Siren Space Interceptor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siren Space Interceptor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Siren Fighter is the standard medium range interceptor spaceship\nused by the UEA. It is faster than any other short range space craft in the\nSolar System, but without high mobility verniers it is outclassed by Mobile\nSuits. It is ideally suited for patrolling and policing the space lanes.\n* The Siren can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Medium Railguns\n* 6 Medium Missiles\n* 4 Light Missiles"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("40tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("14m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("3.5g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("12m")
                      )
                    ),
                    Core.vx_new_string("Syreen Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Syreen Mech Suit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("JovianChronicles/SyreenToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Syreen Suit is a Siren space fighter retrofitted into a Mech Suit. It was hastily\nconstructed when the first conflict with the Jovians displayed the dominant mobility of\nthe Jovian Mech Suits.\n* As an efficient and cheap design, it can be fielded in large numbers. However, it does\nnot compare well to the new Mech Suits that it is meant to face, so casualties are high.\n* The Syreen can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Heavy Missiles\n* 6 Medium Missiles\n* 4 Light Missiles\n* Point defense laser system\n* 2 Crude manipulator arms for close combat.\n* The command variant includes a powerful ECM pod."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("52tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17.2m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string("3g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("17.5m")
                      )
                    ),
                    Core.vx_new_string("Poseidon Battlecruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poseidon Battlecruiser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Poseidon Class Battlecruiser is the top of the line UEA warship. It\ngets its name from the two rotating living sections that give the ship the\nappearance of a trident.\n* The Poseidon outclasses any other warship from any faction and is a\nmenancing presense. It was, however, designed before the advent of Mech\nSuits, so it carries more interceptors than Mechs.\n* Point Defense System\n* 4 Particle Accelerator Batteries\n* 4 Railcannon Batteries\n* 6 Interceptors\n* 4 Mech Suits"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("200"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("30ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("325m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string(".5g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("200m")
                      )
                    ),
                    Core.vx_new_string("Tengu Escort Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tengu Escort Carrier"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Tengu is a long range craft designed for limited engagements and\npolicing. It has extensive supplies but lacks firepower.\n* 1 Point Defense System\n* 2 Missile Bays\n* 2 Mech Suits\n* 2 Fighters\n* 2 Catapults"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("24"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("25ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("250m"),
                        Core.vx_new_string(":speedspace"),
                        Core.vx_new_string(".5g"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("38m")
                      )
                    ),
                    Core.vx_new_string("Wyvern Mech Suit"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyvern Mech Suit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("JovianChronicles/WyvernToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Wyveern is the first and most numerous of the UEA Mech Suits.\nThough a copy of the Martial Federation Defender, it is a sturdy,\nreliable and most importantly mass-produceable design. Its primary\nlimitation is the lack of energy weapons which limits its combat\nendurance before it needs to be rearmed.\n* 1 Hyperbazooka\n* 2 Massdriver Machineguns\n* 2 Self guided Missiles"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.4g"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("55tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("4m"),
                        Core.vx_new_string(":speedair"),
                        Core.vx_new_string("2.4mach"),
                        Core.vx_new_string(":speedland"),
                        Core.vx_new_string("36kph"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("14m")
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
   * @function chapter_mobile_suit_gundam_equipment
   * @return {chapter}
   * (func chapter_mobile_suit_gundam_equipment)
   */
  public static interface Func_chapter_mobile_suit_gundam_equipment extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_mobile_suit_gundam_equipment();
  }

  public static class Class_chapter_mobile_suit_gundam_equipment extends Core.Class_base implements Func_chapter_mobile_suit_gundam_equipment {

    @Override
    public Func_chapter_mobile_suit_gundam_equipment vx_new(Object... vals) {
      Class_chapter_mobile_suit_gundam_equipment output = new Class_chapter_mobile_suit_gundam_equipment();
      return output;
    }

    @Override
    public Func_chapter_mobile_suit_gundam_equipment vx_copy(Object... vals) {
      Class_chapter_mobile_suit_gundam_equipment output = new Class_chapter_mobile_suit_gundam_equipment();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_mobile_suit_gundam_equipment", // name
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
    public Func_chapter_mobile_suit_gundam_equipment vx_empty() {return e_chapter_mobile_suit_gundam_equipment;}
    @Override
    public Func_chapter_mobile_suit_gundam_equipment vx_type() {return t_chapter_mobile_suit_gundam_equipment;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_mobile_suit_gundam_equipment();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_mobile_suit_gundam_equipment() {
      return High_technology.f_chapter_mobile_suit_gundam_equipment();
    }

  }

  public static final Func_chapter_mobile_suit_gundam_equipment e_chapter_mobile_suit_gundam_equipment = new High_technology.Class_chapter_mobile_suit_gundam_equipment();
  public static final Func_chapter_mobile_suit_gundam_equipment t_chapter_mobile_suit_gundam_equipment = new High_technology.Class_chapter_mobile_suit_gundam_equipment();

  public static Base.Type_chapter f_chapter_mobile_suit_gundam_equipment() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Mobile Suit Gundam Equipment"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Gundam Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gundam Equipment"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Energy rating for MW weapons assumes a 3 second burst."),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Titanium Composite"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Titanium Composite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("This is the state of the art armor plate before the discovery of Gundarium Alpha which completely eclipses it.")
                      )
                    ),
                    Core.vx_new_string("Gundarium Alpha"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundarium Alpha"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Originally called Luna Titanium, it was renamed after the success of the RX-78 Gundam built from it.\nA super high-tensile alloy originally known as Luna Titanium.  Originally intended for use inside thermonuclear\nreactors, this alloy's superb strength, durability, heat resistance and radiation-absorbing properties make it\nan ideal material for mobile suit armor."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gundarium, Luna Titanium")
                      )
                    ),
                    Core.vx_new_string("Gundarium Gamma"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundarium Gamma")
                      )
                    ),
                    Core.vx_new_string("60mm Vulcan Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("60mm Vulcan Cannon"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Stats based on 57mm Bofors Naval Gun"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("VCU-505EX-Gry/Ver.009 (Titans) / VCU-505EX-V*B/Ver.012 (AEUG)"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Auto"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("1000m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("8.5km"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("220/min")
                      )
                    ),
                    Core.vx_new_string("100mm Machine Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("100mm Machine Gun"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NF-GMG-Type.37"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Auto"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("600m/s")
                      )
                    ),
                    Core.vx_new_string("120mm Machine Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("120mm Machine Gun"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Auto"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("600m/s"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("100")
                      )
                    ),
                    Core.vx_new_string("180mm Recoilless Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("180mm Recoilless Cannon"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NFHI-GMCa-type.09"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("300m/s")
                      )
                    ),
                    Core.vx_new_string("240mm Recoilless Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("240mm Recoilless Cannon"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("300m/s")
                      )
                    ),
                    Core.vx_new_string("280mm Bazooka"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("280mm Bazooka"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Rocket Launcher"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("120m/s"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("4")
                      )
                    ),
                    Core.vx_new_string("360mm Hyper Bazooka"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("360mm Hyper Bazooka"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Capable of destroying a GM in a single hit."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("H&amp;L-GB05R (Zeon) / H-Baz-85-Gry/Ver.045 (Titans) / H-Baz-87-A*E/Ver.004 (AEUG)"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Rocket Launcher"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("120m/s"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("10")
                      )
                    ),
                    Core.vx_new_string("380mm Hyper Bazooka"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("380mm Hyper Bazooka"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("BLASH-XHB-L-03/N-STD"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Rocket Launcher"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("120m/s"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("5")
                      )
                    ),
                    Core.vx_new_string("Clay Bazooka"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Clay Bazooka"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ClayBazooka.jpg"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Rocket Launcher"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("120m/s")
                      )
                    ),
                    Core.vx_new_string(".4MW Beam Saber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".4MW Beam Saber"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("XB-G-1048L (Titans) / A*E-Br*G-Sc-L (AEUG)"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Melee"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1.2MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string(".65MW Beam Saber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".65MW Beam Saber"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Melee"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1.95MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("1.3MW Beam Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("1.3MW Beam Gun"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3.9MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("1.3MW Funnel"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("1.3MW Funnel"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3.9MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("1.9MW Beam Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("1.9MW Beam Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by rechargeable energy cap"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("BOWA-BR-S-85-C2"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("5.7MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("2.2MW Beam Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("2.2MW Beam Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by rechargeable energy cap"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("6.6MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("2.2MW Funnel"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("2.2MW Funnel"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. MG"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("6.6MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("2.6MW Beam Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("2.6MW Beam Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by rechargeable energy cap"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("BOWA*XBR-M-86-C2 (Titans), A*E-Br*XBR-87-C (AEUG)"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("7.8MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("2.8MW Beam Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("2.8MW Beam Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by rechargeable energy cap"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("8.4MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("5.7MW Beam Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("5.7MW Beam Rifle"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ZetaBeamRifle.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by replaceable e-pac, doubles as large beam saber"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("17.1MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("8.3MW Hyper Mega Launcher"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("8.3MW Hyper Mega Launcher"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Powered by replaceable e-pac, doubles as large beam saber"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("24.9MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("19.5MW Mega Particle Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("19.5MW Mega Particle Gun"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("58.5MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
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
   * @function chapter_mobile_suit_gundam_units
   * @return {chapter}
   * (func chapter_mobile_suit_gundam_units)
   */
  public static interface Func_chapter_mobile_suit_gundam_units extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_mobile_suit_gundam_units();
  }

  public static class Class_chapter_mobile_suit_gundam_units extends Core.Class_base implements Func_chapter_mobile_suit_gundam_units {

    @Override
    public Func_chapter_mobile_suit_gundam_units vx_new(Object... vals) {
      Class_chapter_mobile_suit_gundam_units output = new Class_chapter_mobile_suit_gundam_units();
      return output;
    }

    @Override
    public Func_chapter_mobile_suit_gundam_units vx_copy(Object... vals) {
      Class_chapter_mobile_suit_gundam_units output = new Class_chapter_mobile_suit_gundam_units();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_mobile_suit_gundam_units", // name
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
    public Func_chapter_mobile_suit_gundam_units vx_empty() {return e_chapter_mobile_suit_gundam_units;}
    @Override
    public Func_chapter_mobile_suit_gundam_units vx_type() {return t_chapter_mobile_suit_gundam_units;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_mobile_suit_gundam_units();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_mobile_suit_gundam_units() {
      return High_technology.f_chapter_mobile_suit_gundam_units();
    }

  }

  public static final Func_chapter_mobile_suit_gundam_units e_chapter_mobile_suit_gundam_units = new High_technology.Class_chapter_mobile_suit_gundam_units();
  public static final Func_chapter_mobile_suit_gundam_units t_chapter_mobile_suit_gundam_units = new High_technology.Class_chapter_mobile_suit_gundam_units();

  public static Base.Type_chapter f_chapter_mobile_suit_gundam_units() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Mobile Suit Gundam Units"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Gundam Independents"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gundam Independents"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Side"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Side"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("32km")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Gundam Federation"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gundam Federation"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ball"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ball"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Ball.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RB-79"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string(".96g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("17.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("12.8m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("180mm Recoilless Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("180mm Recoilless Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("F")
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
                    Core.vx_new_string(":Gundam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gundam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Performance: maximum thruster acceleration 0.93 G; maximum ground running speed 165 km/h\nEquipment and design features: re-entry coolant system\nOptional hand armaments: BOWA-XBR-M-79-07G beam rifle, powered by rechargeable energy cap;\nRX·M-Sh-008/S-01025 shield, can be optionally stored on backpack"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-78-2"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("43.4tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
                                      )
                                    ),
                                    Core.vx_new_string("380mm Hyper Bazooka"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("380mm Hyper Bazooka")
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
                    Core.vx_new_string("Gundam Ground Type"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam Ground Type"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GundamGroundType.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The engineers at Jaburo used spare parts originally manufactured for the RX-78-2 Gundam prototype and built approximately 20 units of a specialized ground combat-model Gundam, the RX-79[G]. Twelve of these units were assigned to the Kojima Battalion stationed in Southeast Asia, particularly to the 04th and 08th MS Teams. Since the RX-79[G]'s were made primarily of spare parts leftover from \"Project V,\" no replacement parts were available. This resulted in hasty field repairs"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Speed: 0.71 G\nFixed armaments: multi-launcher, mounted in chest;\n2 x X.B.Sa-G-03 beam saber, stored in recharge\nracks in legs, hand-carried in use\nOptional fixed armaments: RGM-S-Sh-WF/S-00109 shield, mounted on either forearm\nOptional hand armaments:\nP.B.R-0079/A12 S-000011 beam rifle, powered by rechargeable energy cap;\nbazooka gun, clip-fed, 7 rounds per clip;\n6-tube missile launcher;"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-79(G)"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Tank"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("52.8tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.2m"),
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
                                    Core.vx_new_string("100mm Machine Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("100mm Machine Gun"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Clip-fed, 2 spare clips stored on hip armor")
                                      )
                                    ),
                                    Core.vx_new_string("180mm Recoilless Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("180mm Recoilless Cannon")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Chest Mount"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("FF"),
                                        Core.vx_new_string(":number"),
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
                    Core.vx_new_string(":Guncannon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guncannon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Guncannon.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Speed: 0.74 G\nOptional hand armaments: BOWA-XBR-L beam rifle, powered by rechargeable energy cap"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-77-2"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("78kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("51tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17.5m"),
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
                                    Core.vx_new_string("240mm Recoilless Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("240mm Recoilless Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("FFx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("40")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string(":Guntank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guntank"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Guntank.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Performance: maximum thruster acceleration 1.10 G; maximum ground driving speed 70 km/h\n2 x 4-tube 40mm rocket launcher, mounted on arms"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-75"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("70kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("56tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("15.6m"),
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
                                    Core.vx_new_string("180mm Recoilless Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("180mm Recoilless Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("FFx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("60")
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
                    Core.vx_new_string(":GM"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("GM"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GM.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RGM-79"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("41.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18m")
                      )
                    ),
                    Core.vx_new_string(":Magellan"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Magellan"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Magellan.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Pegasus Class Carrier"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pegasus Class Carrier"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/WhiteBase.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fixed armaments: 4 x main gun; 2 x mega particle gun; hyper mega particle cannon; 2 x missile launcher\nMobile suits: 8 (12)\n2x Catapults"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("White Base"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("54ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("76.5m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("341.7m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("124.1m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Zeon"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Zeon"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Big-Zam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Big-Zam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/BigZam.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Energy"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Energy")
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
                    Core.vx_new_string(":Dom"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dom"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Dom.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Ground Mobile Suit"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Elmeth"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elmeth"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Elmeth.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft")
                      )
                    ),
                    Core.vx_new_string(":Gelgoog"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gelgoog"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gelgoog.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Gouf"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gouf"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gouf.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Rick Dom"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rick Dom"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/RickDom.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Realizing that the outcome of the war was going to be decided in space, Zeon devoted all of its mobile suit\nmanufacturing resources to space combat units.  Refining the Dom design for space was simple, and mostly involved\nreplacing the hover jet thrusters with standard rocket thrusters.  Zeon manufacturers began cranking out hundreds\nof these new units late in the war, replacing the aging MS-06F Zaku II as the premiere front line combat unit."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Performance: maximum thruster acceleration 0.67 G; maximum ground running speed 110 km/h\nFixed armaments: scattering beam gun, mounted in torso; heat saber Type7, battery powered, stored in recharge rack on back, hand-carried in use"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MS-09R"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("78.6tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.6m"),
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
                                    Core.vx_new_string("360mm Hyper Bazooka"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("360mm Hyper Bazooka"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("10")
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
                    Core.vx_new_string("Zaku II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zaku II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ZakuII.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Speed: .59G/88kph\nSensor radius: 3200 m\n180-degree turn time: 1.7 sec\nGround speed: 88 km/h\nArmor: super-high tensile steel\nArmament: heat hawk x 1\nOptional armament: 3-missile pod x 2, cracker"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("58.1tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17.5m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("280mm Bazooka"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("280mm Bazooka"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string("120mm Machine Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("120mm Machine Gun"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("100")
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
                    Core.vx_new_string(":Z'Gok"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Z'Gok"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ZGok.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("0.86 G; maximum water speed 103 knots\nFixed armaments:\n6 x 240mm missile launcher, 5 round magazine per launcher, mounted in head;\n2 x mega particle cannon, mounted in forearms"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSM-07"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("65.1tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.4m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Zeong"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zeong"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Zeong.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("maximum thruster acceleration 0.81 G\nFixed armaments: 2 x wire-guided 5-barrel mega particle gun, barrels mounted in manipulator fingers, all barrels in each hand\nare fire-linked; 2 x mega particle gun, mounted in torso; mega particle gun, mounted in head"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSN-02"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("1"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("151.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17.3m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string("Gwazine Class Battleship"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gwazine Class Battleship"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gwazine.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Zeon Gwazine class battleships were more than a match for any Federation Forces warship."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fixed armaments: 3 x 2-barrel main gun; 10 x 2-barrel secondary gun; many x 155mm machine gun\nMobile suits: 20"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("108.1ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("103m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("440m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("320m")
                      )
                    ),
                    Core.vx_new_string(":Musai"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Musai"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Musai.png")
                      )
                    ),
                    Core.vx_new_string("Zanzibar Class Cruiser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zanzibar Class Cruiser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Zanzibar.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Zeon's closest answer to the Federation's Pegasus class carrier, the Zeon Zanzibar class mobile cruiser replaced the vulnerable H.L.V. for the purpose of ferrying mobile suits to Earth and back to space. With a capacity of 6 mobile suits and a battery of bow-mounted mega particle guns, the Zanzibar was often used as the command ship for smaller fleets when a Gwazine class battleship was either unavailable or unsuitable. Lacking the Pegasus class' integral Minovsky Craft System, the Zanzibar could only operate for short periods in Earth's atmosphere, using sustained thrust. When being launched back into space, the Zanzibar class required a special rocket booster to supply the necessary thrust to break free of Earth's gravity.\n like most Zeon warships of the One Year War, lacked launch catapults, instead deploying its complement of mobile suits through a simple hatch on the ventral hull."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fixed armaments: 1 x 2-barrel main gun; 4 x mega particle gun; 5 x 2-barrel machine gun\nMobile suits: 6"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("70.5m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("255m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("221.8m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":0083"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("0083"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Gundam GP01"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam GP01"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GundamGP01.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gundam Unit 01")
                      )
                    ),
                    Core.vx_new_string("Gundam GP02"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam GP02"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GundamGP02.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gundam Unit 02")
                      )
                    ),
                    Core.vx_new_string("Gundam GP03"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam GP03"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GundamGP03.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gundam Unit 03")
                      )
                    ),
                    Core.vx_new_string("Neue Ziel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Neue Ziel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/NeueZiel.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":AEUG"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("AEUG"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Z Gundam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Z Gundam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ZGundam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit\nSpeed: 1.81 G\nFixed armaments:\n2 x 2-tube grenade launcher, 2 rounds per tube, mounted in forearms;\nOptional fixed armaments:\ngrenade launcher cartridge, 18+1 rounds, serves as extended ammunition magazine for grenade launcher;\nshield, mounted on left forearm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSZ-006"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("28.7tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("19.8m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("5.7MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("5.7MW Beam Rifle"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("2 spare e-pacs stored in shield")
                                      )
                                    ),
                                    Core.vx_new_string("8.3MW Hyper Mega Launcher"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("8.3MW Hyper Mega Launcher")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("1200")
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
                    Core.vx_new_string("Z Gundam Waverider"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Z Gundam Waverider"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Waverider_ZGundam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSZ-006"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.81g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("28.7tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("24.3m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("18.6m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("5.7MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("5.7MW Beam Rifle")
                                      )
                                    ),
                                    Core.vx_new_string("1.3MW Beam Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("1.3MW Beam Gun")
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
                    Core.vx_new_string(":G-Defenser"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("G-Defenser"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GDefenser.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Space Fighter\n* Separatable cockpit capsule\nFixed armaments: 2 x 14-tube missile pod, mounted in binders on main body; long beam rifle, mounted on main body; 2 x mini laser gun fire-linked, power rated at 1.7 MW each, mounted in nose of cockpit capsule; 4 x vulcan gun, mounted in pairs in missile pod binders, each pair fire-linked"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("FXA-05D"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.41g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("24.7tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("39.5m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("27.1m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string("Gundam MK-II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam MK-II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GundamMkII.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Paradoxically, the Gundam Mk. II is not armored with the wonderfully durable Gundarium alloy material used by\nthe original RX-78 Gundam, making it no more or less physically durable than mass-production mobile suits."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("RX*M-Sh-VT/S-00018 (Titans) / RX*M-Sh-VT/S-001 (AEUG) shield, mounted on either forearm\nOptional hand armaments: 2 spare e-pacs stored in shield;\nAE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds per clip"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-178"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.5g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("33.4tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.5m"),
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
                                    Core.vx_new_string("2.6MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("2.6MW Beam Rifle")
                                      )
                                    ),
                                    Core.vx_new_string("360mm Hyper Bazooka"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("360mm Hyper Bazooka"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("7")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":rounds"),
                                        Core.vx_new_string("1400")
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
                    Core.vx_new_string("Hyaku Shiki"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hyaku Shiki"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/HyakuShiki.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Equipment and design features: anti-beam reflective coating on amror\nOptional hand armaments:\nAE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds per clip; mega bazooka launcher"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSN-100"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.37g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("31.5tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.5m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("2.8MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("2.8MW Beam Rifle")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string(":Nemo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nemo"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Nemo.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Optional fixed armaments: shield, mounted on either forearm\nAlthough closely based on the GM II, was far better in performance in terms of generator power,\nthruster acceleration and maneuverability. To help keep its cost down, the Nemo used many weapons\nalready employed by other existing mobile suits, such as the RMS-099 Rick Dias' beam saber and the\nGM II's beam rifle."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSA-003"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.15g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("36.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.5m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("1.9MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("1.9MW Beam Rifle")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string("Rick Dias"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rick Dias"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/RickDias.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Because many former Zeon engineers worked on the Rick Dias, it featured many similaritys to Zeon suits.  It not\nonly features a mono-eye sensor its name is also derived from the MS-09R Rick Dom (Rick comes from the word\nRemake).  The Rick Dias should originally be called Gundam Gamma because it is built out of new Gundarium Gamma.\nThis material was developed by Axis and it makes the suit lighter and thus makes it able to accommodate greater\nfuel capacity."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Equipment and design features: 2 x 'random binder' ejectable external propellant tank, mounted on backpack; birdlime launchers in hands; flare launchers in hands\n* Fixed armaments: 2-barrel 55mm vulcan phalanx anti-missile gun system, mounted in head;\n* Optional hand armaments: AE/ZIM.C-BAZ-531 clay bazooka, clip-fed, 7 rounds; beam rifle, powered by rechargeable energy cap"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RMS-099, Gundam Gamma"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.37g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("32.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.7m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("2.2MW Beam Pistol"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("2.2MW Beam Pistol"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string("Super Gundam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super Gundam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/SuperGundam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Combined Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("FXA-05D+RX-178"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("72.9tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.5m")
                      )
                    ),
                    Core.vx_new_string(":Argama"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Argama"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Argama.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Spacecraft")
                      )
                    ),
                    Core.vx_new_string("Garuda Class Transport"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Garuda Class Transport"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Garuda_Audhumla.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Propulsion system: jet engine x 10\nArmament: laser gun x 10\nMobile suits: 20\nShips of the line: Garuda, Audhumla, Sudori, Melord\nMechanical designer: Kazumi Fujita"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Audhumla, Garuda, Melord, Sudori"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Aircraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("9800tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("317m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("524m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Gundam Titans"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Gundam Titans"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Asshimar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asshimar"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Asshimar.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NRX-044"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("41.1tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("19.3m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Baund-Doc"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baund-Doc"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/BaundDoc.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NRX-055"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("82.7tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("27.3m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Byalant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Byalant"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Byalant.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("PMX-000"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("34.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.6m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Gabthley"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gabthley"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gabthley.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-110"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("32.6tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.5m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Gaplant"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gaplant"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gaplant.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("ORX-005"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("50.7tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("19.8m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string("GM II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("GM II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/GMII.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fixed armaments:\nbeam saber, power rating unknown\nOptional fixed armaments: shield, mounted on either forearm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RMS-179, RGM-79R"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.06g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("40.5tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.1m"),
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
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("1.9MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("1.9MW Beam Rifle")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx2"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string(":Hambrabi"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hambrabi"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Hambrabi.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-139"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("34.6tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("19.9m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Hizack"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hizack"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Hizack.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RMS-106"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("38.7tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Marasai"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Marasai"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Marasai.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RMS-108"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("33.1tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("17.5m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Messala"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Messala"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Messala.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("PMX-000"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("37.3tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("23m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Psycho-Gundam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Psycho-Gundam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/PsychoGundam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MRX-009"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("214.1tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("40m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Energy"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Energy")
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
                    Core.vx_new_string("Psycho-Gundam MK-II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Psycho-Gundam MK-II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/PsychoGundamMkII.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit\nPerformance: maximum thruster acceleration: 0.86 G (mobile suit mode), 1.99 G (mobile fortress mode)\nEquipment and design features: sensors, range 16230 meters; psycho control chair in cockpit; detachable head, can be operated without main body\nFixed armaments: 20 x mega beam gun, power rated at 6.3 MW each, 3 mounted in each shoulder, 4 mounted in each leg, 2 mounted in each hip armor, 1 mounted in each front waist armor; 3 x mega scattering beam gun, power rated at 10.7 MW each, mounted in torso; 2 x wire-guided psycommu beam sword, power rated at 1.7 MW each, mounted in forearms; 10 x beam gun, emitter barrels mounted as fingers in hands; 2-barrel mega beam gun, mounted in head\nRemote weapons: reflector bits, deflects and redirects beam weapons fire, stored in backpack\nThough armed with the same 3-barreled scattering mega particle gun in its chest and beam gun fingers, the Psyco Gundam Mark II also mounted 20 smaller beam guns all over its body, giving it firepower capable of attacking targets in all directions. Its forearms also mounted large-bladed beam swords, and could be detached and directed at targets via a cable connection and through the control of the Psyco Gundam Mark II's psycommu system, giving the unit an all-range attack capability quite similar to that of the Principality of Zeon's MSN-02 Zeong. The Psyco Gundam Mark II also carried a set of 'reflector bits,' which were unarmed but used to redirect its own beam weapons fire to targets that are out-of-sight, or to deflect incoming enemy beam weapons fire."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MRX-010"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("187.8tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("40m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Energy"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Energy")
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
                    Core.vx_new_string(":Qubeley"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Qubeley"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Qubeley.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fixed armaments: 2 x beam launcher/beam saber, mounted in forearms in beam launcher mode, hand-carried in beam saber mode"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("AMX-004"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.08g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("35.2tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18.4m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("1.3MW Funnel"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("1.3MW Funnel"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("10")
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
                    Core.vx_new_string(":The-O"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("The-O"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/TheO.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("4 x sub-arm, mounted inside front skirt armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("PMX-003"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("1.57g"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("57.3tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("24.8m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("2.6MW Beam Rifle"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("2.6MW Beam Rifle")
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
                    Core.vx_new_string(":Saberfish"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saberfish"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Saberfish.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("High Altitude Fighter"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Aircraft")
                      )
                    ),
                    Core.vx_new_string(":Gwazine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gwazine"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Gwazine.png")
                      )
                    ),
                    Core.vx_new_string(":Jupitris"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jupitris"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Jupitris.png")
                      )
                    ),
                    Core.vx_new_string(":Salamis"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Salamis"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/Salamis.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Federation (New)"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Federation (New)"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Nu Gundam"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nu Gundam"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/NuGundam.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RX-93"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("27.9tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("22m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
                    Core.vx_new_string(":Re-GZ"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Re-GZ"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/ReGZ.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Variable Mobile Suit"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("RGZ-91"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("24.7tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("20.5m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
            Core.vx_new_string("Neo Zion"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Neo Zion"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alpha-Azieru"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alpha-Azieru"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/AlphaAzieru.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Speed: 8.29 G\n				* 2 x external propellant tank, ejectable, mounted on main body\nFixed armaments: 2 x wire-guided psycommu mega arm, each mounts 5 x beam gun, fire-linked, power rated at 12.6 MW each"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NZ-333"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Med. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("267.4tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("58.4m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("108m"),
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
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("19.5 MW Mega Particle Gun"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("19.5 MW Mega Particle Gun"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turret")
                                      )
                                    ),
                                    Core.vx_new_string("2.2MW Funnel"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("2.2MW Funnel"),
                                        Core.vx_new_string(":number"),
                                        Core.vx_new_string("9")
                                      )
                                    ),
                                    Core.vx_new_string("60mm Vulcan Cannon"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("60mm Vulcan Cannon"),
                                        Core.vx_new_string(":facing"),
                                        Core.vx_new_string("Turretx4"),
                                        Core.vx_new_string(":number"),
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
                    Core.vx_new_string(":Sazabi"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sazabi"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Gundam/NuGundam.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MSN-04"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Spacecraft"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("30.5tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("25m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armor"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Hardened vs. Projectiles"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hardened vs. Projectiles")
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
   * @function chapter_space_colonies
   * @return {chapter}
   * (func chapter_space_colonies)
   */
  public static interface Func_chapter_space_colonies extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_space_colonies();
  }

  public static class Class_chapter_space_colonies extends Core.Class_base implements Func_chapter_space_colonies {

    @Override
    public Func_chapter_space_colonies vx_new(Object... vals) {
      Class_chapter_space_colonies output = new Class_chapter_space_colonies();
      return output;
    }

    @Override
    public Func_chapter_space_colonies vx_copy(Object... vals) {
      Class_chapter_space_colonies output = new Class_chapter_space_colonies();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_space_colonies", // name
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
    public Func_chapter_space_colonies vx_empty() {return e_chapter_space_colonies;}
    @Override
    public Func_chapter_space_colonies vx_type() {return t_chapter_space_colonies;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_space_colonies();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_space_colonies() {
      return High_technology.f_chapter_space_colonies();
    }

  }

  public static final Func_chapter_space_colonies e_chapter_space_colonies = new High_technology.Class_chapter_space_colonies();
  public static final Func_chapter_space_colonies t_chapter_space_colonies = new High_technology.Class_chapter_space_colonies();

  public static Base.Type_chapter f_chapter_space_colonies() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Space Colonies"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("L5 Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("L5 Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The L5 Colonies are enormous space colonies that have been constructed at the five Lagrange points around Earth where gravitational forces are stable. They are 25km to 40km long.\n* Construction - These stations are constructed inside cylinders of Moon rock and asteroids ferried from the Asteroid Belt. The external surface is heavily armored against meteorite impacts. Industrial complexes are mostly on outermost layer of the colonies to keep them away from habitations. Towns are built on the internal surface of the colony. The internal space is divided into zones with large reflective pressure walls that give the appearance of continuous space while limiting the risk of catastrophic failure to any particular zone. Transport tubes are underground and also serve as emergency shelters. In addition to the outer cylinder, there is also an inner cylinder that forms a pressurized, zero-g drydock through the center of the colony.\n* Personnel - Those that have travelled from Earth to the Orbital stations are many of the best and brightest that Earth has to offer. Each colony supports up to 20 million people. Living space is about 300 square km, which is not a lot of room for so many people. Three or four story buildings are the norm, but they cannot be built higher than that because of the Coriolis effect.\n* Resources - Large amounts of solar energy are continuously collected, but life is difficult in space where all materials must be imported (at high tariffs). Orbital industry is generally thriving.\n* Politics - Because the Orbitals are largely corporate run and lack a specific history, they are largely free of geopolitical politics, as well as cultural and racial conflicts. They do, however, retain fierce, corporate politics. Most of all, the Orbitals chafe under the Earth bound regulatory and military agencies that supervise and tax them. Taxes are necessarily high to support so much technology, and taxes are always a point of conflict."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Orbitals, Orbital Platforms"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("L1: Shangri-la"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("L1: Shangri-la")
                      )
                    ),
                    Core.vx_new_string("L2: Elysium"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("L2: Elysium")
                      )
                    ),
                    Core.vx_new_string("L4: Avalon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("L4: Avalon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The first of the L5 colonies, Avalon has the largest starship construction facilities. Its proximity\nto Earth and the Moon provide it optimal security and resources.")
                      )
                    ),
                    Core.vx_new_string("L3: Eden"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("L3: Eden")
                      )
                    ),
                    Core.vx_new_string("L5: Valhalla"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("L5: Valhalla")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Nomad Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nomad Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Small individual colonies are beginning to dot open space between the planets. These colonies maintain their own solar orbits and can be convenient stop over points between planets.\n* Culture - Nomad colonists are a hard working, individualistic people. Some are religious or cultural fanatics. Others are essentially criminal organizations or pirates. Nomad colonists are highly desired as crew for interplanetary commercial space flights. They are used to cramped space conditions and they are also 	talented mechanics and jury-riggers.\n* Trade - Each Nomad Colony is primarily a trading station. They do not produce anything except food for themselves. Everything else is purchased from other planets.\n* Politics - Nomad Colonies are each formed for their own reasons and maintain unique governments and social structures. They attempt to remain neutral from other nations and will trade with anyone without regard to political or criminal status. Though the Nomad colonies are each completely unique, they all recognize the other Nomads as allies and treat any threat to one as a threat to all.\n* Military - Nomad Colonies typically maintain little or no defenses as befits their neutral status. They may, however, maintain hidden defenses or pirate ships nearby.")
              )
            ),
            Core.vx_new_string("Mars Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mars Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Colonial Mars is much like the American Frontier. Colonists left the overcrowded and impoverished Earth in search of a new life knowing that there was almost no chance to return to the Old World. They and their children would live or die on Mars, and they proudly adopted the name Martian.\n* Terraforming - Mars is one of the greatest technological projects ever attempted by humanity.\n* Climate - Mars is in the later stages of Terraforming. The air is thin and cold but breathable, similar to a mountain top.\n* Cities - Since the atmosphere became breathable, the population on Mars has sharply increased. Cities that were once domed habitats have grown into large settlements. Land is practically free, so buildings are low and sprawling.\n* Production - Mining is the primary reason for founding the Martian colony and continues to be the main source of jobs. Terraforming, industrial equipment, and algae farming support the mining effort.\n* Politics - The Martian Council is a democratic body that establishes and enforces Martian law. Unfortunately, they are largely a puppet of the Earth Authority and have been increasingly squeezing the Martian colonists to increase production for their war efforts. This pressure has spurred the creation of the Free Mars Movement that seeks to free Mars form Earth control.\n* Corporations - Martial Metals is one of the biggest corporations in the Solar System. It developed the orbital elevator and its steady source of cheap metals feed a large industry of orbital facilities including drydocks."),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Orbital Elevator"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Orbital Elevator"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Orbital Elevator is a miracle of technology and the only practical way to affordably get materials off the planet. The Orbital Elevator, the Asteroid Belt, and the Lunar Railguns are the only sources of building materials for colonies and spacecraft.\n* The Elevator is also a majestic symbol of power for the Martian Council and the Earth Authorities.")
                      )
                    ),
                    Core.vx_new_string("Free Mars Radical"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Free Mars Radical")
                      )
                    ),
                    Core.vx_new_string("Martian Pirate"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Martian Pirate")
                      )
                    ),
                    Core.vx_new_string("Sand Marauder"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sand Marauder")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Moon Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Moon Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Moon's mineral and ice deposits made it the logical location of the first\npermanent off-world colony. Robotic solar-powered laser drills cut tunnel\ncomplexes into the walls of craters. Human colonists followed soon after.\nRegular exercise in 1 G training centers is mandatory for all colonists to avoid\nthe dangers of low gravity.\n* Cities dot the lunar landscape connected by underground transport tubes.\n* The two largest cities maintain spaceports complete with Laser Lifters to boost large\nships into orbit."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Lunars, Lunatics, Moon Men, Moonies, Selenites")
              )
            ),
            Core.vx_new_string("Solar Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Solar Colonies"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Stellaser"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stellaser"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Giant mirrors placed in pairs in Solar orbit. The mirrors gather light by reflecting it back and forth between them before releasing it in a concentrated beam to slowly accelerate starships. Though this beam would certainly be deadly to humans, the beam is only dangerous to exposed targets without sufficient radiation shielding."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Starlight Express")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Venusiau Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Venusiau Colonies")
              )
            ),
            Core.vx_new_string("Asteroid Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Asteroid Colonies"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Asteroid Mining Colony"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asteroid Mining Colony")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Asteroid Miner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asteroid Miner"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Belter")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Jupiter Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jupiter Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Culture - Personal space in Jovian colonies is extremely limited, so people\nshare quarters with multiple people. There are not even enough beds for each\nperson, so most people live with people who work different shifts and use the\nsame beds on off-shifts. Common areas are used for everything except sleeping.\nThe Jovians have adapted to be far more social and reliant on others for day\nto day life. This communal living has generally made them a tight knit society\nwith a strong sense of group identity.\n* Science - Jovian science is one of the most advanced in the solar system.\nResearch and development on ways to make their harsh life safer and more\ncomfortable are always high priorites. Jovian scientists crank out a steady\nstream of innovations across all disciplines.\n* Military - The military has reaped the rewards of Jovian science and is\narguably the most advanced force in the solar system, though certainly nowhere\nnear the largest. Jovian forces are composed of separate standing armies:\nAlpha, Beta, and Gamma Divisions with Alpha containing the Godsfire flagship.\nJovian military theory is based on efficient use of a small number of highly\nmobile units. They do not fear a large scale assault, since they would receive\nmuch forewarning of any attempt to mobilize a large force all the way out to\nJupiter. Jupiter's remoteness makes it fairly easy to defend against direct\nassault, but the harsh environment makes sabotage a much greater threat, so\nJovian intelligence forces constantly search for threats.\n* Agora - The Jovian governing body with primary offices on Elysee colony."),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Elysee Station"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elysee Station"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The largest Jovian Colony and the capital of the Jovian Confederation.")
                      )
                    ),
                    Core.vx_new_string("Joshua Station"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Joshua Station"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The second largest Jovian Colony and Jupiter's hub of manufacturing. The\nstation is essentially a giant factory with live in workers. All commercial\nstarships are constructed here.\n* Jovian Armor Works - The best known aerospace corporation in Jovian space\nis famous for inventing the Exo-armor and designing almost all of the\nExo-armor fleet.\n* Joshua station also houses the seedier areas of Jovian society. Black\nmarkets, drug dens, and bordellos operate freely. Jovians tend to have a\nlive and let live attitude, so little effort is made to stop activities that\ndon't threaten the colony."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Wildest Place in the Solar System")
                      )
                    ),
                    Core.vx_new_string("Khannan Station"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Khannan Station"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The third largest Jovian Colony and Jupiter's military center. The\nstation only allows military personnel on board. Large sections of the colony\nare dedicated to ship construction and others are top secret research labs.")
                      )
                    ),
                    Core.vx_new_string("Jovian Gas Refinery"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jovian Gas Refinery"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These heavily armored, refining stations float in the upper atmosphere of\nJupiter. They float by means of enormous rings filled with heated hydrogen\nand manuever using fusion thrusters. Multiple kilometer long tubes hang from\nthe bottom of the station extracting gases from the differnt layers of the\natmosphere. The broad round floatation disc and long tubes give the stations\nthe general appearance of a jelly fish.")
                      )
                    ),
                    Core.vx_new_string("Io Colony"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Io Colony"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Outland"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small, titanium mining colony is located on Io. Miners work intensely to\ngain maximum bonuses. Life is dangerous and many miners are hooked on\namphetimines to maximize productivity. Victimless crime is largely ignored\nin this generally lawless outpost. Besides miners and transport workers there\nare only cooks, bartenders, prostitutes, a single doctor, a sheriff and two\ndeputies.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Saturn Colonies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Saturn Colonies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* With the exception of Titan, the outer planets are too remote and unimportant\nto ever be colonized. Jupiter provides an unlimited supply of gas resources, so\nSaturn, Uranus, and Neptune have little to offer."),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Titan Research Station"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Titan Research Station"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small, permanent research colony has been erected on Titan to study its\nunique atmosphere and geology. The hope was to discover evidence of primitive\nlife, but no life has yet to be discovered.")
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
   * @function chapter_terminator
   * @return {chapter}
   * (func chapter_terminator)
   */
  public static interface Func_chapter_terminator extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_terminator();
  }

  public static class Class_chapter_terminator extends Core.Class_base implements Func_chapter_terminator {

    @Override
    public Func_chapter_terminator vx_new(Object... vals) {
      Class_chapter_terminator output = new Class_chapter_terminator();
      return output;
    }

    @Override
    public Func_chapter_terminator vx_copy(Object... vals) {
      Class_chapter_terminator output = new Class_chapter_terminator();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/high_technology", // pkgname
        "chapter_terminator", // name
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
    public Func_chapter_terminator vx_empty() {return e_chapter_terminator;}
    @Override
    public Func_chapter_terminator vx_type() {return t_chapter_terminator;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = High_technology.f_chapter_terminator();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_terminator() {
      return High_technology.f_chapter_terminator();
    }

  }

  public static final Func_chapter_terminator e_chapter_terminator = new High_technology.Class_chapter_terminator();
  public static final Func_chapter_terminator t_chapter_terminator = new High_technology.Class_chapter_terminator();

  public static Base.Type_chapter f_chapter_terminator() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Terminator"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Terminator Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terminator Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Terminator T-800"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator T-800"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Terminator/T800.png"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("200kg"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Strength"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strength")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Terminator T-1000"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator T-1000"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Terminator/T1000.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Flexible"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flexible")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Terminator T-X"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator T-X"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Terminator/TX.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The T-X is designed to not only terminate humans but rogue Terminators\nreprogrammed by the Resistance. It is a composite of the T-800 and T-1000,\na solid endoskeleton covered with polymimetic liquid metal alloy, allowing\nit to take the shape of any humanoid it touches. The T-X endoskeleton\ncontains many powerful weapons making it considerably more deadly than\nprevious versions."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150kg"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Natural Weaponry"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Weaponry")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Terminator Hunter Killer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator Hunter Killer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Terminator/HunterKiller.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Gunnery"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Terminator Tank"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator Tank"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Terminator/HKTank.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Gunnery"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery")
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
        "nx/tactics/books/high_technology", // pkgname
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
      output = High_technology.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return High_technology.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new High_technology.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new High_technology.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Technology"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("HighTech.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("High Tech Overview"),
            High_technology.f_chapter_high_tech_overview(),
            Core.vx_new_string("Cyberpunk Campaign"),
            High_technology.f_chapter_cyberpunk_campaign(),
            Core.vx_new_string("High Tech Rules"),
            High_technology.f_chapter_high_tech_rules(),
            Core.vx_new_string("High Tech Equipment"),
            High_technology.f_chapter_high_tech_equipment(),
            Core.vx_new_string("High Tech Spacecraft"),
            High_technology.f_chapter_high_tech_spacecraft(),
            Core.vx_new_string("High Tech Aircraft"),
            High_technology.f_chapter_high_tech_aircraft(),
            Core.vx_new_string("High Tech Heavy Armor"),
            High_technology.f_chapter_high_tech_heavy_armor(),
            Core.vx_new_string("Space Colonies"),
            High_technology.f_chapter_space_colonies(),
            Core.vx_new_string("Car Wars"),
            High_technology.f_chapter_car_wars(),
            Core.vx_new_string("Cyberpunk"),
            High_technology.f_chapter_cyberpunk(),
            Core.vx_new_string("Jovian Chronicles"),
            High_technology.f_chapter_jovian_chronicles(),
            Core.vx_new_string("Mobile Suit Gundam Equipment"),
            High_technology.f_chapter_mobile_suit_gundam_equipment(),
            Core.vx_new_string("Mobile Suit Gundam Units"),
            High_technology.f_chapter_mobile_suit_gundam_units(),
            Core.vx_new_string("Terminator"),
            High_technology.f_chapter_terminator()
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
    mapfunc.put("chapter_car_wars", High_technology.t_chapter_car_wars);
    mapfunc.put("chapter_cyberpunk", High_technology.t_chapter_cyberpunk);
    mapfunc.put("chapter_cyberpunk_campaign", High_technology.t_chapter_cyberpunk_campaign);
    mapfunc.put("chapter_high_tech_aircraft", High_technology.t_chapter_high_tech_aircraft);
    mapfunc.put("chapter_high_tech_equipment", High_technology.t_chapter_high_tech_equipment);
    mapfunc.put("chapter_high_tech_heavy_armor", High_technology.t_chapter_high_tech_heavy_armor);
    mapfunc.put("chapter_high_tech_overview", High_technology.t_chapter_high_tech_overview);
    mapfunc.put("chapter_high_tech_rules", High_technology.t_chapter_high_tech_rules);
    mapfunc.put("chapter_high_tech_spacecraft", High_technology.t_chapter_high_tech_spacecraft);
    mapfunc.put("chapter_jovian_chronicles", High_technology.t_chapter_jovian_chronicles);
    mapfunc.put("chapter_mobile_suit_gundam_equipment", High_technology.t_chapter_mobile_suit_gundam_equipment);
    mapfunc.put("chapter_mobile_suit_gundam_units", High_technology.t_chapter_mobile_suit_gundam_units);
    mapfunc.put("chapter_space_colonies", High_technology.t_chapter_space_colonies);
    mapfunc.put("chapter_terminator", High_technology.t_chapter_terminator);
    mapfunc.put("tacticsbook", High_technology.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/high_technology", maptype, mapconst, mapfunc);
  }

}
