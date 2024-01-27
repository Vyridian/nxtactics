package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Skills {

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
        "nx/tactics/books/skills", // pkgname
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
      output = Skills.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Skills.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Skills.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Skills.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Skills"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Skill.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Skills Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Skills Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Extraordinary Skills"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Extraordinary Skills"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* What you call tao. It's a power everyone possesses innately, but mastering it allows one to achieve superhuman abilities... But you must be careful how you use it. Tao is life itself. Use too much, and you'll exhaust more than just your stamina... In the worst case, overuse likely leads to death. - Shion-dono , Hell's Paradise")
                      )
                    ),
                    Core.vx_new_string("Why Tactics: Skills?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Skills?"),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Extraordinary Skills"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extraordinary Skills"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* What you call tao. It's a power everyone possesses innately, but mastering it allows one to achieve superhuman abilities... But you must be careful how you use it. Tao is life itself. Use too much, and you'll exhaust more than just your stamina... In the worst case, overuse likely leads to death. - Shion-dono , Hell's Paradise")
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
            Core.vx_new_string("Skill Types"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Skill Types"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Social Skills"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Social Skills"),
                        Core.vx_new_string(":skillmap"),
                        Core.f_new(
                          Base.t_skillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Art"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Art"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Art requires a certain... cruelty. - Jhin, Runeterra"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Artist, Artisan"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Spirit"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Art Imitates Life"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Art Imitates Life"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Dorian Gray"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Artwork become real")
                                      )
                                    ),
                                    Core.vx_new_string(":Calligraphy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Calligraphy")
                                      )
                                    ),
                                    Core.vx_new_string(":Crafts"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crafts")
                                      )
                                    ),
                                    Core.vx_new_string(":Drawing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Drawing")
                                      )
                                    ),
                                    Core.vx_new_string(":Painting"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Painting")
                                      )
                                    ),
                                    Core.vx_new_string(":Photoshopping"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photoshopping"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Modify an image to improve or mislead.")
                                      )
                                    ),
                                    Core.vx_new_string(":Sculpture"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sculpture")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Business"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Business"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Did they get you to trade? Your heroes for ghosts? Hot ashes for trees? Hot air for a cool breeze? Cold comfort for change? Did you exchange? A walk-on part in the war. For a leading role in a cage? - Pink Floyd, Wish you were here"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Commerce"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Accounting"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Accounting"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Accountant, Actuary, Clerk")
                                      )
                                    ),
                                    Core.vx_new_string(":Advertising"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Advertising"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Marketing Representative")
                                      )
                                    ),
                                    Core.vx_new_string(":Appraise"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Appraise"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Determine the value of an item in the current market.")
                                      )
                                    ),
                                    Core.vx_new_string(":Bargain"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Bargain"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Ability that Limits any attempt to buy or sell goods at their actual worth."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Haggler, Merchant")
                                      )
                                    ),
                                    Core.vx_new_string(":Barter"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Barter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Ability that Limits any attempt to buy or sell goods at their actual worth.")
                                      )
                                    ),
                                    Core.vx_new_string("Business Management"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Business Management")
                                      )
                                    ),
                                    Core.vx_new_string(":Distribution"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Distribution")
                                      )
                                    ),
                                    Core.vx_new_string(":Economics"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Economics"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* In 5 minutes, you learn what the average University student remembers 5 years after learning school ... Economics: Supply and Demand. That's it. - Father Guido Sarducci, Five Minute University")
                                      )
                                    ),
                                    Core.vx_new_string(":Finance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Finance")
                                      )
                                    ),
                                    Core.vx_new_string(":Marketing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Marketing")
                                      )
                                    ),
                                    Core.vx_new_string(":Procure"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Procure"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("The ability to find rare, exotic or illegal items for sale or trade."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Procurer")
                                      )
                                    ),
                                    Core.vx_new_string(":Sales"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sales"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* In 5 minutes, you learn what the average University student remembers 5 years after learning school ... Business is: You buy something, you sell it for more - Father Guido Sarducci, Five Minute University"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Carpetbagger, Peddler, Salesman")
                                      )
                                    ),
                                    Core.vx_new_string(":Speculate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Speculate")
                                      )
                                    ),
                                    Core.vx_new_string("Trade Routes"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trade Routes")
                                      )
                                    ),
                                    Core.vx_new_string("Trade Union"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trade Union")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Communications"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Communications"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Appearance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Appearance"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Expert on personal grooming, cosmetics, and hairstyling.")
                                      )
                                    ),
                                    Core.vx_new_string(":Carousing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Carousing")
                                      )
                                    ),
                                    Core.vx_new_string("Detect Lie"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Detect Lie")
                                      )
                                    ),
                                    Core.vx_new_string(":Drinking"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Drinking")
                                      )
                                    ),
                                    Core.vx_new_string(":Drugs"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Drugs")
                                      )
                                    ),
                                    Core.vx_new_string(":Etiquette"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Etiquette")
                                      )
                                    ),
                                    Core.vx_new_string(":Fashion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fashion"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Knows current fashions and what clothing with make the best impact.")
                                      )
                                    ),
                                    Core.vx_new_string(":Fiction"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fiction"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Can author, critique, interpret, and detect fiction.")
                                      )
                                    ),
                                    Core.vx_new_string("Go Viral"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Go Viral"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Create an interesting message popular enough to be passed around.")
                                      )
                                    ),
                                    Core.vx_new_string(":Gossip"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gossip"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The single best way to get information, but, given it source, may not be reliable.")
                                      )
                                    ),
                                    Core.vx_new_string(":Interview"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Interview"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Interviewer, Reporter")
                                      )
                                    ),
                                    Core.vx_new_string(":Journalism"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Journalism"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Journalist, Media, Reporter")
                                      )
                                    ),
                                    Core.vx_new_string(":Literacy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Literacy"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Can read and write\n* This ability is assumed in modern characters from 1st and 2nd world nations")
                                      )
                                    ),
                                    Core.vx_new_string("Motivational Speaking"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Motivational Speaking"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* My name is Matt Foley and I am a motivational speaker... First off, I am thirty-five years old, I am divorced, and I live in a van down by the river... Well I'm here to tell you, that you're probably going to find out, as you go out there, that you're not going to amount to jack squat! You're going to end up eating a steady diet of government cheese and living in a van down by the river! - Matt Foley, SNL"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Motivational Speaker")
                                      )
                                    ),
                                    Core.vx_new_string(":Negotiation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Negotiation"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Advisor, Arbiter, Diplomat, Emissary, Envoy, Legate, Negotiator")
                                      )
                                    ),
                                    Core.vx_new_string(":Photography"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Photography"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Photographer")
                                      )
                                    ),
                                    Core.vx_new_string(":Poetry"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Poetry"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Can author any type of poetry"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Poet")
                                      )
                                    ),
                                    Core.vx_new_string(":Politics"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Politics")
                                      )
                                    ),
                                    Core.vx_new_string(":Recruiting"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Recruiting"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Casting Director, Hiring Manager, Recruiter")
                                      )
                                    ),
                                    Core.vx_new_string(":Scribe"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Scribe"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Can copy writings exactly")
                                      )
                                    ),
                                    Core.vx_new_string(":Sincerity"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sincerity"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Helps convince others when you are being truthful.\n* Helps improve long term relationships by increasing trust.\n* Limitation - May only be used when you truly believe that your are correct.")
                                      )
                                    ),
                                    Core.vx_new_string("Small Talk"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Small Talk"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("The Gift of Gab")
                                      )
                                    ),
                                    Core.vx_new_string(":Streetwise"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Streetwise"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Action]: Gain knowledge where a good or service can be found in a city including black market goods or services.")
                                      )
                                    ),
                                    Core.vx_new_string(":Translator"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Translator"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Can translate immediately")
                                      )
                                    ),
                                    Core.vx_new_string("Trash Talk"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trash Talk"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* What's the matter Agent Scary Lips? You're Scary Lips tasting my hairy shit? You tasting Doug Wilson's World Famous beef stew? How's it going down, its kinda spicy right? You guys are so fucked right now, all I can think about is your wife and a horse. - Doug Wilson, Weeds"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Put Down")
                                      )
                                    ),
                                    Core.vx_new_string(":Videography"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Videography"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Cameraman, Videographer")
                                      )
                                    ),
                                    Core.vx_new_string("Video Production"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Video Production"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Director, Producer")
                                      )
                                    ),
                                    Core.vx_new_string("Wise Words"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Wise Words"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Apply personal life experiences to help others understand themselves.")
                                      )
                                    ),
                                    Core.vx_new_string(":Cantonese"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cantonese")
                                      )
                                    ),
                                    Core.vx_new_string(":English"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("English")
                                      )
                                    ),
                                    Core.vx_new_string(":French"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("French")
                                      )
                                    ),
                                    Core.vx_new_string(":German"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("German")
                                      )
                                    ),
                                    Core.vx_new_string(":Greek"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Greek")
                                      )
                                    ),
                                    Core.vx_new_string(":Italian"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Italian")
                                      )
                                    ),
                                    Core.vx_new_string(":Latin"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Latin")
                                      )
                                    ),
                                    Core.vx_new_string(":Mandarin"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mandarin")
                                      )
                                    ),
                                    Core.vx_new_string("Olde English"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Olde English")
                                      )
                                    ),
                                    Core.vx_new_string(":Portuguese"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Portuguese")
                                      )
                                    ),
                                    Core.vx_new_string(":Russian"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Russian")
                                      )
                                    ),
                                    Core.vx_new_string("Sign Language"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sign Language")
                                      )
                                    ),
                                    Core.vx_new_string(":Spanish"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Spanish")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":specialtymap"),
                                Core.f_new(
                                  Base.t_specialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Linguistics"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Linguistics"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* So we put her on the hit list, of a common, cunning linguist: a master of many tongues. - Deep Purple, Knocking at Your Backdoor"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Philosophy - The 'common tongue' concept is boring and unrealistic.\n* Simulate the limitations of language by reducing usable vocabulary. This can be done by limiting a conversation to 2, 3, 4, or 5 letter words depending on the fluency of those involved. Having a conversation using only 2 letter words is going to require a fair amount of hand gesturing or drawing to get a point across. If a person is overhearing a conversation, bleep out the big words and let them guess at the missing words.")
                                      )
                                    ),
                                    Core.vx_new_string(":Writing"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Writing")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Crime"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crime"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bandit, Brigand, Crime Boss, Crook, Cutthroat, Highwayman, Pimp, Yakuza, Yakuza - Oyabun"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Shadow"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Armed Robbery"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armed Robbery")
                                      )
                                    ),
                                    Core.vx_new_string(":Blackmail"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blackmail")
                                      )
                                    ),
                                    Core.vx_new_string(":Bribery"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Bribery")
                                      )
                                    ),
                                    Core.vx_new_string("Crime Syndicate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crime Syndicate")
                                      )
                                    ),
                                    Core.vx_new_string("Crime Wave"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crime Wave")
                                      )
                                    ),
                                    Core.vx_new_string("Criminal Mastermind"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Criminal Mastermind")
                                      )
                                    ),
                                    Core.vx_new_string(":Extortion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Extortion")
                                      )
                                    ),
                                    Core.vx_new_string("Fence Goods"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fence Goods")
                                      )
                                    ),
                                    Core.vx_new_string(":Kidnapping"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Kidnapping")
                                      )
                                    ),
                                    Core.vx_new_string("Mafia Connections"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mafia Connections")
                                      )
                                    ),
                                    Core.vx_new_string(":Pimping"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pimping")
                                      )
                                    ),
                                    Core.vx_new_string(":Piracy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piracy"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Armed robbery of large shipments of goods without damaging the merchandise.")
                                      )
                                    ),
                                    Core.vx_new_string(":Prostitution"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Prostitution")
                                      )
                                    ),
                                    Core.vx_new_string(":Rustling"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rustling"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Stealing and selling livestock")
                                      )
                                    ),
                                    Core.vx_new_string(":Waylay"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Waylay")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Deception"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deception"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I whisper Truth, into Lies... - Leblanc, Runeterra"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Chicanery, Legerdemain"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Shadow"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Burglary"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Burglary")
                                      )
                                    ),
                                    Core.vx_new_string("Con Artist"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Con Artist")
                                      )
                                    ),
                                    Core.vx_new_string("Confidence Game"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Confidence Game"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Con Artist, Swindler")
                                      )
                                    ),
                                    Core.vx_new_string(":Decoy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Decoy"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Create a decoy to mislead.\n* [Move]: Remove this unit from play and place 1 Decoy Token and 1 Decoy Unit Token on this unit's space. Both decoys may act normally during the Action phase, but any action but movement will dispel the decoys.  Both decoys defend as the original unit. If either unit is Hit, both decoys are dispelled. The decoys last until the next turn or until dispelled.")
                                      )
                                    ),
                                    Core.vx_new_string("Detect Trap"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Detect Trap")
                                      )
                                    ),
                                    Core.vx_new_string(":Distraction"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Distraction"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Throw Dirt")
                                      )
                                    ),
                                    Core.vx_new_string(":Escape"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Escape"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* The chain in those handcuffs is high-tensile steel. It'd take you ten minutes to hack through it with this. Now, if you're lucky, you could hack through your ankle in five minutes. Go."),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The ability comes from extensive practice escaping from various bonds and confinements. At higher abilities, the user can dislocate joints to slither out of bonds."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Escape Artist")
                                      )
                                    ),
                                    Core.vx_new_string("Evade Pursuit"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Evade Pursuit"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Ability to correctly evaluate the opponent's pursuit style and outwit the pursuer.")
                                      )
                                    ),
                                    Core.vx_new_string(":Forgery"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Forgery"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The ability to forge money or documents. This ability is also used while creating money to prevent forgery.\n* [Extended Action]: Roll vs. object quality or anti-forgery level. Any [Hits] allow a forgery that can pass at a distance. The more [Hits] and [Criticals] rolled, the more indistinquishable from the original. High level forgeries are works of art unto themselves.")
                                      )
                                    ),
                                    Core.vx_new_string(":Gambling"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gambling"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Gambler, High Roller")
                                      )
                                    ),
                                    Core.vx_new_string("Honor Among Thieves"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Honor Among Thieves")
                                      )
                                    ),
                                    Core.vx_new_string(":Misdirection"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Misdirection")
                                      )
                                    ),
                                    Core.vx_new_string("Pick Pockets"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pick Pockets")
                                      )
                                    ),
                                    Core.vx_new_string("Sleight of Hand"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sleight of Hand"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Hide a small object in hand without being noticed."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Legerdemain")
                                      )
                                    ),
                                    Core.vx_new_string(":Smuggling"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Smuggling")
                                      )
                                    ),
                                    Core.vx_new_string("Stage Magic"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Stage Magic")
                                      )
                                    ),
                                    Core.vx_new_string("Thieves Guild Codes"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Thieves Guild Codes"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Thieves must conceal their illegal conversations and the guilds have developed a shifting series of hand signals, marks, and code words to communicate simple concepts without arising suspiscion.")
                                      )
                                    ),
                                    Core.vx_new_string("Use Blinding Powder"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Use Blinding Powder")
                                      )
                                    ),
                                    Core.vx_new_string("Use Flash Powder"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Use Flash Powder")
                                      )
                                    ),
                                    Core.vx_new_string("Use Irritating Powder"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Use Irritating Powder")
                                      )
                                    ),
                                    Core.vx_new_string("Use Sleeping Powder"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Use Sleeping Powder")
                                      )
                                    ),
                                    Core.vx_new_string(":Vanish"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Vanish")
                                      )
                                    ),
                                    Core.vx_new_string(":Ventriloquism"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ventriloquism")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":specialtymap"),
                                Core.f_new(
                                  Base.t_specialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Thievery"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Thievery"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("This is where Forrestall cashed in.  A friend of yours?  A competitor... he was good. He was very good. - Indiana Jones, Raiders of the Lost Ark"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Burglary, Escape, Fence Goods, Honor Among Thieves, Pick Pockets, Smuggling, Thieves Guild Codes"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Burglar, Cutpurse, Footpad, Nezumi kozo, Pick Pocket, Smuggler, Thief")
                                      )
                                    ),
                                    Core.vx_new_string(":Trickery"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trickery"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Blinding Powder, Confidence Game, Decoy, Distraction, Flash Powder, Gambling, Irritating Powder, Misdirection, Sleight of Hand, Stage Magic, Swindling, Vanish, Ventriloquism"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Blackguard, Caitiff, Charlatan, Con Artist, Delinquent, Gambler, Knave, Ne'er do well, Ninja, Rapscallion, Renegade, Riffraff, Rogue, Scoundrel, Scalawag, Stage Magician, Swashbuckler, Swindler, Trickster")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Espionage"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Espionage"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Covert Ops, Infiltrator, Informer, Spy, Traitor"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Shadow"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Counterintelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Counterintelligence")
                                      )
                                    ),
                                    Core.vx_new_string("Cyber Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cyber Intelligence"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from computer networks."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("CYBINT, DNINT, Digital Network Intelligence")
                                      )
                                    ),
                                    Core.vx_new_string(":Eavesdrop"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Eavesdrop"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Listen in to conversations without being detected.")
                                      )
                                    ),
                                    Core.vx_new_string(":Infiltrate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Infiltrate"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Defense] - Mind\n* [Deploy] - Deploy this unit in waiting area.\n* [Action] - Replace any non-unique unit with this unit.")
                                      )
                                    ),
                                    Core.vx_new_string("Geospatial Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Geospatial Intelligence"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from satellite, aerial photography, mapping.\n* Espionage, Diplomats, Military Attaches, NGOs, Patrolling, POWs Detainees, Refugees, Strategic Reconnaissance, Traveller Debriefing"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("GEOINT, IMINT, Imagery Intelligence")
                                      )
                                    ),
                                    Core.vx_new_string("Human Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Human Intelligence"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from a person on the ground.\n* Espionage, Diplomats, Military Attaches, NGOs, Patrolling, POWs Detainees, Refugees, Strategic Reconnaissance, Traveller Debriefing"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("HUMINT")
                                      )
                                    ),
                                    Core.vx_new_string("Intelligence Network"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Intelligence Network"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("If you thought there was some secret cell somewhere working Al Qaedia. Then I want you to know you're wrong. This it it. There is no working group coming to the rescue. There is nobody else hidden on some other floor. There is just us... and we are failing!... They murdered 3000 of our citizens..in cold-blood and they have slaughtered our forward deploy. And what the fuck have we done about it, huh? What have we done?!  We have 20 leadership names. We have only eliminated 4 of them. I want targets. Do your fucking jobs. Bring me people to kill. - Zero Dark Thirty")
                                      )
                                    ),
                                    Core.vx_new_string("Lip Reading"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lip Reading"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Attempt to understand what is being said without the benefit of hearing. The more [Hits] rolled, the more accurate the interpretation.")
                                      )
                                    ),
                                    Core.vx_new_string("Measurement and Signals"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Measurement and Signals"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from the signatures (distinctive characteristics) of fixed or dynamic target sources. This includes radar, acoustic, nuclear, chemical, and biological intelligence."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("MASINT")
                                      )
                                    ),
                                    Core.vx_new_string(":Misdirection"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Misdirection"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Smoke and Mirrors... Classic Misdirection - Leblanc, Runeterra")
                                      )
                                    ),
                                    Core.vx_new_string("Open Source Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Open Source Intelligence"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from open sources."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("OSINT")
                                      )
                                    ),
                                    Core.vx_new_string(":Propaganda"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Propaganda")
                                      )
                                    ),
                                    Core.vx_new_string("Quick Change"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Quick Change")
                                      )
                                    ),
                                    Core.vx_new_string(":Sabotage"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sabotage"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Saboteur")
                                      )
                                    ),
                                    Core.vx_new_string("Signals Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Signals Intelligence"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Quiller"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from interception of signals."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("SIGINT, Signals")
                                      )
                                    ),
                                    Core.vx_new_string(":Subversion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Subversion")
                                      )
                                    ),
                                    Core.vx_new_string("Technical Intelligence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Technical Intelligence"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Intelligence gathered from analysis of weapons and equipment."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("TECHINT")
                                      )
                                    ),
                                    Core.vx_new_string("Whispering Campaign"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Whispering Campaign")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Faith"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Faith"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The argument goes something like this: 'I refuse to prove that I exist,' says God, 'for proof denies faith, and\nwithout faith I am nothing.'  'But,' says Man, 'The Babel fish is a dead giveaway, isn't it?  It could not have\nevolved by chance.  It proves you exist, and so therefore, by your own arguments, you don't. QED.' - Hitchhiker's\nGuide to the Galaxy"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Abbot, Absolver, Archbishop, Bishop, Cardinal, Cleric, Ceremonial Guard, Gakusho, Missionary, Paladin, Priest, Redeemer,\nSin	Eater, Theologist, Theurge, Theurgy"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Absolution"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Absolution")
                                      )
                                    ),
                                    Core.vx_new_string(":Affirmation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Affirmation"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("An affirmation is a statement designed to have a positive effect on the conscious mind when\nrepeated at frequent intervals throughout meditation ritual spells.")
                                      )
                                    ),
                                    Core.vx_new_string(":Atonement"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Atonement")
                                      )
                                    ),
                                    Core.vx_new_string(":Blessing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blessing"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A simple incantation with a variety of subtle effects.\n* [Action]: Touch. Target gains a new Blessing Token (max 1).  At any time, the target may\nremove the token and gain +1 on any Defense roll.\n* [Duration]: up to 1 day/level.")
                                      )
                                    ),
                                    Core.vx_new_string(":Chant"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chant"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Aura: All Allies with same Religion within level spaces receive +1 on Defense rolls.")
                                      )
                                    ),
                                    Core.vx_new_string(":Confession"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Confession")
                                      )
                                    ),
                                    Core.vx_new_string(":Consecration"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Consecration"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* To consecrate is to solemnly dedicate or devote something or someone to a sacred purpose, to\ncleanse and protect.")
                                      )
                                    ),
                                    Core.vx_new_string(":Contemplation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Contemplation"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Contemplation is a focused and disiplined form of contemplation or reflecting, whereby one is\nable to alter an emotional state and to receive self-insight.")
                                      )
                                    ),
                                    Core.vx_new_string(":Conversion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Conversion")
                                      )
                                    ),
                                    Core.vx_new_string(":Dedication"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dedication"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Death]: Unit enters specified Deity's realm.  It is not substantiated that this ability\nactually works.  Those who have crossed over are changed and may not and will not return.")
                                      )
                                    ),
                                    Core.vx_new_string(":Drumming"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Drumming"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Drumming is literally pounding on a surface.  This is used to raise power and to change\nemotional states.")
                                      )
                                    ),
                                    Core.vx_new_string(":Excommunication"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Excommunication")
                                      )
                                    ),
                                    Core.vx_new_string(":Initiation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Initiation"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Used to describe the profound spiritual experience that occurs when one's unity with Deity\nand the Universe is realised; when one is welcomed as a fully-fledged member of a particular\ngroup; and the celebration of a successful ritual.")
                                      )
                                    ),
                                    Core.vx_new_string(":Marriage"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Marriage")
                                      )
                                    ),
                                    Core.vx_new_string(":Mass"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mass")
                                      )
                                    ),
                                    Core.vx_new_string(":Namegiving"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Namegiving")
                                      )
                                    ),
                                    Core.vx_new_string(":Ordainment"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ordainment")
                                      )
                                    ),
                                    Core.vx_new_string(":Redemption"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Redemption")
                                      )
                                    ),
                                    Core.vx_new_string(":Sacrament"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sacrament")
                                      )
                                    ),
                                    Core.vx_new_string(":Salvation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Salvation")
                                      )
                                    ),
                                    Core.vx_new_string(":Sanctify"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sanctify")
                                      )
                                    ),
                                    Core.vx_new_string("Sin Eating"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sin Eating"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A willing subject may describe his dark desires, the Sin Eater then\nrepeats the description replacing references to the subject with himself.\nAfter the ritual is complete, the subject will not feel the urges so\nstrongly. Instead the Sin Eater will feel those emotions. If he acts on\nthem, even symbolically, his [Shadow] gains power. If he can resolve them,\nhe gains experience.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Influence"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Influence"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Many men, of course, became extremely rich, and this was perfectly natural and nothing to be ashamed of\nbecause no one was really poor, at least no one worth speaking of. - Hitchhiker's Guide to the Galaxy"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Aristocrat, Baron, Baroness, Baronet, Celebrity, Count, Countess, Daimyo, Dame, Duchess, Duke, Emperor,\nEmpress, King, Knight, Lord, Marchioness, Marquis, Matriarch, Monarch, Patriarch, Pontif, Prince, Princess,\nQueen, Regina, Sire, Sovereign, Star"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Black Market Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Black Market Ties")
                                      )
                                    ),
                                    Core.vx_new_string(":Boon"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Boon")
                                      )
                                    ),
                                    Core.vx_new_string(":Business"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Business")
                                      )
                                    ),
                                    Core.vx_new_string("Carte Blanche"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Carte Blanche"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Blank Check")
                                      )
                                    ),
                                    Core.vx_new_string("Corporate Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Corporate Ties")
                                      )
                                    ),
                                    Core.vx_new_string("Entertainment Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Entertainment Ties")
                                      )
                                    ),
                                    Core.vx_new_string(":Fame"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fame"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Your reputation precedes you. People are drawn to the famous and will often do extraordinary things\nto be near them.\n* [Synergy]: [Seduction]\n* [Action]: Leverage your fame to gain minor free goods or services including upgraded lodging, free\nmeals, audience with nobles, etc.")
                                      )
                                    ),
                                    Core.vx_new_string("Family Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Family Ties")
                                      )
                                    ),
                                    Core.vx_new_string(":Fortune"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fortune")
                                      )
                                    ),
                                    Core.vx_new_string(":Followers"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Followers"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Acolyte, Apprentice, Retinue, Servant, Serf, Shieldbearer")
                                      )
                                    ),
                                    Core.vx_new_string("Friends in High Places"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Friends in High Places"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* I'm telling you this guy is protected from up on high by the Prince of Darkness. - Jeff Rabin, Usual Suspects")
                                      )
                                    ),
                                    Core.vx_new_string(":Infamy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Infamy"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Your dark reputation precedes you. People are intrigued by the infamous and will often do extraordinary\nthings in fear and facination of them.\n* [Synergy]: [Intimidation]\n* [Action]: Leverage your infamy to gain minor free goods or services including upgraded lodging, free\nmeals, etc.")
                                      )
                                    ),
                                    Core.vx_new_string(":Intrigue"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Intrigue")
                                      )
                                    ),
                                    Core.vx_new_string(":Investing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Investing")
                                      )
                                    ),
                                    Core.vx_new_string("Judicial Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Judicial Ties")
                                      )
                                    ),
                                    Core.vx_new_string("Law Enforcement Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Law Enforcement Ties")
                                      )
                                    ),
                                    Core.vx_new_string("License to Kill"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("License to Kill")
                                      )
                                    ),
                                    Core.vx_new_string(":Mansion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mansion")
                                      )
                                    ),
                                    Core.vx_new_string("Media Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Media Ties")
                                      )
                                    ),
                                    Core.vx_new_string("Night Club"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Night Club")
                                      )
                                    ),
                                    Core.vx_new_string("Noble Birth"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Noble Birth")
                                      )
                                    ),
                                    Core.vx_new_string("Official Title"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Official Title")
                                      )
                                    ),
                                    Core.vx_new_string("Political Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Political Ties"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Ambassador, Minister, Politician, Senator")
                                      )
                                    ),
                                    Core.vx_new_string("Religious Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Religious Ties")
                                      )
                                    ),
                                    Core.vx_new_string("Train Follower"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Train Follower")
                                      )
                                    ),
                                    Core.vx_new_string("Underworld Ties"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Underworld Ties")
                                      )
                                    ),
                                    Core.vx_new_string(":Windfall"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Windfall")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":specialtymap"),
                                Core.f_new(
                                  Base.t_specialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Nobility"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Nobility"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Noble Lineage")
                                      )
                                    ),
                                    Core.vx_new_string(":Royalty"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Royalty"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Royal Lineage")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Intimidation"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intimidation"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration. I will face my fear. I will permit it to pass over me and through me. And when it has gone past I will turn the inner eye to see its path. Where the fear has gone there will be nothing. Only I will remain. - Bene Gesserit Litany, Dune\n* They tell him they want his territory: all his business. Soze looks over the faces of his family, then he showed these men of will what will really was. He tells him he would rather see his family dead, than live another day after this. ... He waits until his wife and kids are in the ground, and then he goes after the rest of the mob. He kills their kids. He kills their wives. He kills their parents and their parents friends. He burns down the houses they live in and the stores they work in. He kills people who owe them money. And like that, he's gone. - Verbal Kint, Usual Suspects"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Demagogue, Enforcer, Fearmonger, Overseer, Pimp, Slave Lord, Slaver, Tormentor, Torturer"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Shadow"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Coercion"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Coercion"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* The boat will be ready for you on Friday. If I see you or any of your friends before then, Miss. Finneran will find herself the victim of a most gruesome violation before she dies. As will your father, Mr. Hockney, and your Uncle Randall in Arizona, Mr. Kint. I might only castrate Mr. McManus's nephew, David. Do I make myself clear? - Kobayashi, Usual Suspects")
                                      )
                                    ),
                                    Core.vx_new_string("Death March"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Death March"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Increase movement of allies within level spaces. Sustained use of this ability runs the risk of injuring or killing some allies.")
                                      )
                                    ),
                                    Core.vx_new_string(":Duress"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Duress")
                                      )
                                    ),
                                    Core.vx_new_string(":Enslave"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Enslave"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Did you know that pain causes the formation of the strongest chemical bonds in the mammalian brain?  Whip a dog, and it keeps coming back... At first it will hope that you'll stop, but after a while, it won't even know the difference. But you already know all about that don't you?... Time melted away into the pain... Finally something clicked over in his head and reality rushed back in around him, clearer and sharper than ever before... Staring he made out faces. Faces not unlike his own reflection he had seen only an eternity ago. Faces distended in howling agony... eyes welling with tears of blood, eyes that all turned toward Her, crying in admiration. - Mage: The Book of Madness")
                                      )
                                    ),
                                    Core.vx_new_string("Grip of Fear"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Grip of Fear"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* It was Keyser Soze, Agent Kujan. I mean the Devil himself. How do you shoot the devil in the back? What if you miss? - Verbal, Usual Suspects")
                                      )
                                    ),
                                    Core.vx_new_string(":Interrogate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Interrogate"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* I'm gonna ask you one more goddamn time, and if you still 'respectfully refuse,' I'm callin' the Bear Jew over here, and he's gonna take that big-ole bat of his, and he's gonna beat you to death with it. Now take your wiener schnitzel lickin' finger and point out on this map what I want to know...We got a German here who wants to die for his country! Oblige him! - Lt. Aldo Raine, Inglourious Basterds\n* You don't need that. I'll tell you everything. Yes...I know you will. - Raiders of the Lost Ark")
                                      )
                                    ),
                                    Core.vx_new_string(":Intimidate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Intimidate"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Your timing is impeccable. Pity you were all they sent... The Fatui would do well to update their intelligence concerning me. Ah, but of course, that would require one of you to return in one piece. - Ayato, Genshin Impact\n* ...to the death. No. To the pain. I don't think I'm quite familiar with that phrase. ... To the pain means the first thing you will lose will be your feet below the ankles. Then your hands at the wrists. Next your nose. ...And then my ears, I understand let's get on with it. WRONG. Your ears you keep and I'll tell you why. So that every shriek of every child at seeing your hideousness will be yours to cherish. Every babe that weeps at your approach, every woman who cries out, 'Dear God! What is that THING?,' will echo in your perfect ears. That is what to the pain means. It means I leave you in anguish, wallowing in freakish misery ... forever. ...I think you're bluffing. It's possible, Pig, I might be bluffing. It's conceivable, you miserable, vomitous mass, that I'm only lying here because I lack the strength to stand. But, then again... perhaps I have the strength after all. - Princess Bride"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A form of bluffing")
                                      )
                                    ),
                                    Core.vx_new_string("Reign of Terror"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Reign of Terror"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Use to rally troops")
                                      )
                                    ),
                                    Core.vx_new_string(":Terrorize"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Terrorize"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Attack]: Any [Critical Hits] may be [Retreats]")
                                      )
                                    ),
                                    Core.vx_new_string(":Torment"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Torment")
                                      )
                                    ),
                                    Core.vx_new_string(":Torture"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Torture"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Your cries of agony, where will they not reach?  Where on Citaeron will they not re-echo?  No man living will meet a doom more terrible than yours. - Sophocles, Oedipus Rex")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Law"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Law"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bailiff, Constable, Executioner, Judge, Lawbringer, Lawyer, Litigant, Magistrate, Peace Officer, Peacekeeper, Police Officer"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Mind"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Authority"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Authority")
                                      )
                                    ),
                                    Core.vx_new_string("Blind Justice"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blind Justice")
                                      )
                                    ),
                                    Core.vx_new_string("Call In Backup"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Call In Backup"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Bring me everyone.  What do you mean 'everyone'?  E-V-E-R-Y-O-N-E! - Stansfield and Benny - Leon the Professional")
                                      )
                                    ),
                                    Core.vx_new_string(":Condemn"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Condemn")
                                      )
                                    ),
                                    Core.vx_new_string(":Confiscate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Confiscate")
                                      )
                                    ),
                                    Core.vx_new_string("Crime and Punishment"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crime and Punishment")
                                      )
                                    ),
                                    Core.vx_new_string("Crowd Control"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crowd Control")
                                      )
                                    ),
                                    Core.vx_new_string("Detective Work"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Detective Work"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* To a cop the explanation is never that complicated. It's always simple. There's no mystery to the street, no arch criminal behind it all. If you got a dead body and you think his brother did it, you're gonna find out you're right. - Verbal, Usual Suspects")
                                      )
                                    ),
                                    Core.vx_new_string(":Dragnet"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dragnet"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Our fugitive has been on the run for ninety minutes. Average foot speed over uneven ground barring injuries is 4 miles-per-hour. That gives us a radius of six miles. What I want from each and every one of you is a hard-target search of every gas station, residence, warehouse, farmhouse, henhouse, outhouse and doghouse in that area. - The Fugitive"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Search a large area for a fugitive.")
                                      )
                                    ),
                                    Core.vx_new_string(":Exile"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Exile")
                                      )
                                    ),
                                    Core.vx_new_string(":Exonerate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Exonerate")
                                      )
                                    ),
                                    Core.vx_new_string(":Judgment"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Judgment"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* I am the law! - Judge Dredd")
                                      )
                                    ),
                                    Core.vx_new_string(":Precedent"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Precedent")
                                      )
                                    ),
                                    Core.vx_new_string(":Prosecute"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Prosecute")
                                      )
                                    ),
                                    Core.vx_new_string("Scales of Justice"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Scales of Justice")
                                      )
                                    ),
                                    Core.vx_new_string(":Shakedown"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Shakedown"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* How many times you been in a lineup? It's always you and four dummies. PD are paying homeless guys $10 a head half the time. And there's no way they'd line five felons in the same row. No way - Keaton, Usual Suspects")
                                      )
                                    ),
                                    Core.vx_new_string(":Trial"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trial")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Performance"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Performance"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Ahh, the denouement. - Jhin, Runeterra"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Entertainer, Performer, Jester, Juggler"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Spirit"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Allure"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Allure")
                                      )
                                    ),
                                    Core.vx_new_string(":Amplify"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Amplify"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("These go to eleven. - This is Spinal Tap"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A performer must be able to be heard. This ability maximizes the acoustics available and allows the performer's message to be heard.")
                                      )
                                    ),
                                    Core.vx_new_string(":Ballad"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ballad")
                                      )
                                    ),
                                    Core.vx_new_string("Ballroom Dance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ballroom Dance")
                                      )
                                    ),
                                    Core.vx_new_string("Break Dance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Break Dance")
                                      )
                                    ),
                                    Core.vx_new_string(":Calm"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Calm"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Pacify, Soothe the Savage")
                                      )
                                    ),
                                    Core.vx_new_string("Captivating Song"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Captivating Song"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* For each success, the targets Move is reduced by 1.")
                                      )
                                    ),
                                    Core.vx_new_string(":Comedy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Comedy"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Clown, Comedian, Mime, Jester")
                                      )
                                    ),
                                    Core.vx_new_string(":Crescendo"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Crescendo")
                                      )
                                    ),
                                    Core.vx_new_string(":Dirge"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dirge"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Opponents in Radius are cloaked in despair.\n* [Passive]\n* [Continuous]: [Retreats] are increased by 1 for all opponents within the radius."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Demoralize, Song of Fear")
                                      )
                                    ),
                                    Core.vx_new_string(":Discord"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Discord"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A sudden sound that disrupts the natural flow of existing sounds.\n* The secret to this skill is to pick the most inappropriate sound at the most inappropriate time.\n* The result is extremely distracting and will cancel other effects based on sound including other Communication abilities."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Cacaphony")
                                      )
                                    ),
                                    Core.vx_new_string(":Disguise"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Disguise")
                                      )
                                    ),
                                    Core.vx_new_string(":Fanfare"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fanfare"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A cheering audience increases an entertrainer's power.")
                                      )
                                    ),
                                    Core.vx_new_string("Gabriel's Horn"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gabriel's Horn"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Requires]: Horn\n* Damages Walls of any kind")
                                      )
                                    ),
                                    Core.vx_new_string(":Harmonize"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Harmonize")
                                      )
                                    ),
                                    Core.vx_new_string(":Heartstrings"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Heartstrings"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Strumming my pain with his fingers. Singing my life with his words. Killing me softly with his song. Killing me softly with his song telling my whole life with his song. - The Fugees, Killing Me Softly")
                                      )
                                    ),
                                    Core.vx_new_string("Hip Hop Dance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hip Hop Dance")
                                      )
                                    ),
                                    Core.vx_new_string(":Imitation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Imitation")
                                      )
                                    ),
                                    Core.vx_new_string(":Impersonation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Impersonation")
                                      )
                                    ),
                                    Core.vx_new_string(":Incite"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Incite")
                                      )
                                    ),
                                    Core.vx_new_string(":Inspiration"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Inspiration"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Allies in Radius are Continuously inspired to greater feats by this ability.\n* [Passive]\n* [Continuous]: [Retreats] are reduced by 1 for all allies within the radius.")
                                      )
                                    ),
                                    Core.vx_new_string(":Juggling"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Juggling"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Besides juggling objects, this ability allows the user to catch objects.\n* [Reaction]: When an object is thrown at a space within one space of the user, roll vs. the [Attack], the object is caught if any [Hits] are scored. Further, the user may immediately throw the object using [Juggling] level as attack value.")
                                      )
                                    ),
                                    Core.vx_new_string(":Lullaby"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lullaby")
                                      )
                                    ),
                                    Core.vx_new_string("Performance Art"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Performance Art"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Cirque de Soleil")
                                      )
                                    ),
                                    Core.vx_new_string("Pole Dance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pole Dance")
                                      )
                                    ),
                                    Core.vx_new_string(":Requiem"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Requiem")
                                      )
                                    ),
                                    Core.vx_new_string("Salsa Dance"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Salsa Dance")
                                      )
                                    ),
                                    Core.vx_new_string(":Satirize"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Satirize")
                                      )
                                    ),
                                    Core.vx_new_string(":Serenade"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Serenade")
                                      )
                                    ),
                                    Core.vx_new_string(":Sexpertise"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sexpertise"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* If you don't like the company, let's just do it you and me...you and me...or three...or four, on the floor. - Britney Spears, Three")
                                      )
                                    ),
                                    Core.vx_new_string(":Silence"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Silence")
                                      )
                                    ),
                                    Core.vx_new_string("Siren Song"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Siren Song"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Action]: For each success, during its turn, the target must use half of its [Move] to approach the singer.")
                                      )
                                    ),
                                    Core.vx_new_string(":Speeches"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Speeches")
                                      )
                                    ),
                                    Core.vx_new_string(":Song"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Song")
                                      )
                                    ),
                                    Core.vx_new_string(":Storytelling"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Storytelling"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Storyteller")
                                      )
                                    ),
                                    Core.vx_new_string(":Style"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Style")
                                      )
                                    ),
                                    Core.vx_new_string(":Tango"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Tango")
                                      )
                                    ),
                                    Core.vx_new_string(":Waltz"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Waltz")
                                      )
                                    ),
                                    Core.vx_new_string("War Song"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("War Song"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Battle Hymn, Glorious Anthem")
                                      )
                                    ),
                                    Core.vx_new_string("Work Song"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Work Song")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":specialtymap"),
                                Core.f_new(
                                  Base.t_specialtymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Courtesan"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Courtesan"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Madame Kaji: We've been servicing the road-weary crotches of every man here to pay obeisance to your new family. You need service only one, freshly washed. Akemi: You don't understand. Madame Kaji: That he's a beast. He's weak. He's a man. All men are weak. The ones who act beastly are weakest. They penetrate women and think that makes them powerful. Really, their pricks are fragile. Exposed. You saw it yourself. They want to be diapered, spanked, and breastfed, then strut away like they conquered an army. Nurture his weakness. Be his strength, and he'll worship you. Akemi: I, don't know if I can. Madame Kaji: Stop running to and from men, and decide what you want for your fucking self. Akemi: I want to be in control of my life. Madame Kaji: Then take control of his, Princess - Madame Kaji and Akemi, Blue Eye Samurai"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A prostitute, especially one whose clients are members of a royal court or of high social standing.")
                                      )
                                    ),
                                    Core.vx_new_string(":Dance"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dance"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("Ballroom Dance, Break Dance, Hip Hop Dance, Pole Dance, Salsa Dance, Tango, Waltz")
                                      )
                                    ),
                                    Core.vx_new_string(":Music"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Music"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Song, Musical Instrument\n* The power of music lies in its ability to tell truths that we willing listen to even if they are unpleasant.\n* See Equipment for Musical Instruments\n* Musical Instruments may be used with any performance power to increase any Range or Radius by 1 Space."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Bard, Classical, Drummer, Guitarist, Harpist, Hip-Hop, Jazz, Lyrist, Minstrel, Musician, Piper, Pop, Rap, Rhapsode, Rock, Skald, Troubadour")
                                      )
                                    ),
                                    Core.vx_new_string(":Acting"),
                                    Core.f_new(
                                      Base.t_specialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Acting"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Acting! - Master Thespian, Saturday Night Live"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Drama Queen, Master Thespian, Theater Brat, Thespian")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Persuasion"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persuasion"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fast Talker, Silver Tongue Devil, Smooth Operator"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Bluff"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Bluff")
                                      )
                                    ),
                                    Core.vx_new_string(":Credibility"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Credibility"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The ability to convince large groups of people that you are telling the truth.")
                                      )
                                    ),
                                    Core.vx_new_string(":Debate"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Debate")
                                      )
                                    ),
                                    Core.vx_new_string("Fast Talk"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Fast Talk")
                                      )
                                    ),
                                    Core.vx_new_string(":Lying"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Lying"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Fibbing")
                                      )
                                    ),
                                    Core.vx_new_string(":Manipulation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Manipulation")
                                      )
                                    ),
                                    Core.vx_new_string(":Pickup"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Pickup")
                                      )
                                    ),
                                    Core.vx_new_string(":Seduction"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seduction"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* But what of all those sweet words you spoke in private?  Oh that's just what we call pillow talk, baby, that's all. - Ash, Army of Darkness\n* But you don't understand. That men are weak? \n* Guess I must be dumb. She had a pocket full of horses, trojan and some of them used... I guess I should have closed my eyes when you drove me to the pace where your horses run free. Cause I felt a little ill when I saw all the pictures of the jockeys that were there before me. Believe it or not, I started to worry. I wondered if I had enough class. But it was Saturday night, I guess that makes it alright. And you say, Baby have you got enough gas? Oh, Yeah! - Prince, Little Red Corvette"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Femme Fatale, Vamp")
                                      )
                                    ),
                                    Core.vx_new_string("Silver Tongue"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Silver Tongue")
                                      )
                                    ),
                                    Core.vx_new_string("Swords to Plowshares"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Swords to Plowshares"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Sincerly convince a rival to choose peace over conflict.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Social Sciences"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Social Sciences"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Anthropology"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Anthropology"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The study of cultures, customs, habits, race, tribes, gangs, and other group affliations and interactions.")
                                      )
                                    ),
                                    Core.vx_new_string("Breaking Point"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Breaking Point"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Determine psychological weaknesses (phobias, addictions, obsessions, etc.)")
                                      )
                                    ),
                                    Core.vx_new_string("Determine Motivation"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Determine Motivation")
                                      )
                                    ),
                                    Core.vx_new_string(":Philosophy"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Philosophy")
                                      )
                                    ),
                                    Core.vx_new_string(":Profile"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Profile")
                                      )
                                    ),
                                    Core.vx_new_string(":Psychoanalyze"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Psychoanalyze")
                                      )
                                    ),
                                    Core.vx_new_string(":Psychology"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Psychology")
                                      )
                                    ),
                                    Core.vx_new_string(":Sociology"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sociology")
                                      )
                                    ),
                                    Core.vx_new_string(":Teaching"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Teaching"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* The true master is an eternal student. - Master Yi, Runeterra"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Educator")
                                      )
                                    ),
                                    Core.vx_new_string(":Theology"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Theology"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Knowledge about the history, customs, and objects of religions. Though the focus is on a particular religion, Theology includes some understanding of all religions.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Stealth"),
                            Core.f_new(
                              Base.t_skill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Stalker"),
                                Core.vx_new_string(":stat"),
                                Core.vx_new_string("Body"),
                                Core.vx_new_string(":abilitymap"),
                                Core.f_new(
                                  Base.t_abilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Ambush"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ambush")
                                      )
                                    ),
                                    Core.vx_new_string(":Backstab"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Backstab"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Action]: Gain [+1 Synergy] when [Flanking] target in Close Combat.\n* [Action]: Gain [+1 Synergy] per [Level] when in the target's Blind Spot in Close Combat."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Back Biter, Back Stabber, Opportunist, Traitor")
                                      )
                                    ),
                                    Core.vx_new_string("Blend into the Crowd"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Blend into the Crowd"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Attitude, Mannerism, and Appearance can often allow a stranger to go unnoticed in a crowd.\n* [Continuous]: While active, unit is hidden as long as at least 10 other units are within skill spaces.")
                                      )
                                    ),
                                    Core.vx_new_string(":Camouflage"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Camouflage"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Continuous]: While active, unit is hidden.\n* [Defense]: +1 Defense in [Terrain].\n* [Roll]: Skill - Move this turn.\n* [Versus]: and others must roll Spirit - Terrain penalty vs to detect.")
                                      )
                                    ),
                                    Core.vx_new_string("Cloak and Dagger"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Cloak and Dagger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Action]: Gains short term Stealth, move up to 2 spaces ignoring attacks of opportunity and attack with a [Knife] by [Surprise].")
                                      )
                                    ),
                                    Core.vx_new_string(":Hide"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hide"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Find a hiding place in an area where you will not normally be detected.")
                                      )
                                    ),
                                    Core.vx_new_string(":Seek"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seek"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Discover the location of someone using [Stealth]."),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Detect Stealth")
                                      )
                                    ),
                                    Core.vx_new_string(":Sneak"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sneak"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Move silently")
                                      )
                                    ),
                                    Core.vx_new_string("Sneak Attack"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sneak Attack"),
                                        Core.vx_new_string(":titles"),
                                        Core.vx_new_string("Suprise Attack")
                                      )
                                    ),
                                    Core.vx_new_string(":Stalk"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Stalk"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The ability to move carefully to avoid detection.\n* [Requires]: No other action may be performed this turn.\n* [Action]: Move at half speed. Any attempt to act toward you, first requires an Mind vs. your skill or fail.")
                                      )
                                    ),
                                    Core.vx_new_string("Strike and Fade"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strike and Fade"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Requires]: No other action may be performed this turn.\n* [Attack]: After this attack, if you have sufficient Move remaining, move 1 space.")
                                      )
                                    ),
                                    Core.vx_new_string(":Tailing"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Tailing"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Subtly pursue someone. Ideally, you must stay as far away as possible without losing track of your quarry. Completely unaware people are easy to pursue. Paranoid targets will attempt to spot tailing and may attempt to evade tails even when they do not know they are being tailed.")
                                      )
                                    ),
                                    Core.vx_new_string("Without a Trace"),
                                    Core.f_new(
                                      Base.t_ability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Without a Trace")
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
    mapfunc.put("tacticsbook", Skills.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/skills", maptype, mapconst, mapfunc);
  }

}
