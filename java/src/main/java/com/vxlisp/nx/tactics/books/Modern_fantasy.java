package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Modern_fantasy {

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
        "nx/tactics/books/modern_fantasy", // pkgname
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
      output = Modern_fantasy.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Modern_fantasy.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Modern_fantasy.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Modern_fantasy.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Fantasy"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Vampire_Slayer_by_Prasa.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Fantasy Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Fantasy Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Modern Fantasy?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Modern Fantasy?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Buffy the Vampire Slayer"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Buffy the Vampire Slayer"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bad Guys"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bad Guys"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Adam"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Adam"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Buffy/Adam.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Adam: [After killing Professor Walsh, his first act of life] Mommy.")
                              )
                            ),
                            Core.vx_new_string(":Gentlemen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gentlemen"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Buffy/Gentlemen.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Can't even shout, can't even cry.  The Gentlemen are coming by.  Looking in windows, knocking on doors.  They\nneed to take seven and they might take yours.  Can't call to mom, can't say a word.  You're gonna die screaming\nbut you won't be heard. - Hush")
                              )
                            ),
                            Core.vx_new_string(":Glory"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glory"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Buffy/Glory.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Glory: Wait, I've always wanted to try this.  You know that thing with worms, where if you have one and you rip it in half,\nyou get two worms.  Do you think that'll work with you?  [Buffy headbutts her] Ow! You hit me.  What are you\ncrazy?  You can't go around hitting people.  What were you, born in a barn?  Fine, be that way! [grabs Buffy by\nthe throat] I just noticed something, you have superpowers, that is so cool.  Can you fly? [throws Buffy across\nthe room]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Glorificus, That Which Cannot Be Named, The Beast, Her Splendiferousness, Her Sparkling Luminescence, Oh\nSweaty-Naughty-Feelings-Causing One")
                              )
                            ),
                            Core.vx_new_string("Mayor Wilkins"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mayor Wilkins"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Buffy/Mayor.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Do you think he was going to betray me?  Oh, now, that's a horrible thought.  And now he's dead, I'll never\nhave the chance to scold him.")
                              )
                            ),
                            Core.vx_new_string(":Sweet"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sweet"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Buffy/Sweet.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("I can bring whole cities to ruin and still have time to get a soft shoe in ... Something's cooking. I'm at the\ngriddle. I bought Nero his very first fiddle.")
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
            Core.vx_new_string("Chronicles of Amber"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Chronicles of Amber")
              )
            ),
            Core.vx_new_string("Kengan Ashura"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Kengan Ashura"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Kengan Matches - In Japan, wealthy business owners resolve disputes by hiring unarmed fighters to duel on their behalf. The match is form of high stakes gambling with large business interests on the line. Though the conflict appears to be fought on stage, a great deal of preparation, manipulation, and deception occur before, during, and after a match.\n* Rules - A Kengan member may make a 'reasonable' bet of another and challenge them to a Kengan match. The challenge is made known to the other members who may attend and bet on the results. The challenged party may agree to the duel, object, or decline. If they duel, each party chooses a champion and agree to a venue. The results of the battle must be adhered to. Win or lose, both parties rise in status for making the attempt. If the challenged party objects, they may counter offer or claim the challenge is unreasonable. Such disputes are decided by concensus vote among the other members. Poor challenges or objections are frowned upon. If the challenged declines, they are considered to have forfeited and must adhere to the terms and lose status for not participating.\n* History - During the Edo period of Japan, wealthy merchants stuggled for the best business dealings especially for the Shogun's business needs. Conflicts between merchants became increasingly bloody and reckless until the Shogun put a stop to it by announcing that all such conflicts must be resolved in a single-combat, unarmed duel. The tradition was very successful at keeping the peace and continues to this day.")
              )
            ),
            Core.vx_new_string("Matrix, The"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Matrix, The"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Agent Smith"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Agent Smith"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I hate this place.  This zoo.  This prison.  This reality, whatever you want to call it, I can't stand it any\nlonger.  It's the smell, if there is such a thing.  I feel saturated by it.  I can taste your stink and every\ntime I do, I fear that I've somehow been infected by it. - Agent Smith\n* You move to an area and you multiply and multiply until every natural resource is consumed and the only way you\ncan survive is to spread to another area.  There is another organism on this planet that follows the same\npattern.  Do you know what it is?  A virus.  Human beings are a disease, a cancer of this planet.  You're a\nplague and we are the cure. - Agent Smith")
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
            Core.vx_new_string("Street Fighter"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Street Fighter"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Shadaloo"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shadaloo"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Balrog"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Balrog"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("StreetFighter/BalrogToken.png"),
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
                                        Core.vx_new_string("8"),
                                        Core.vx_new_string(":unitspecialtymap"),
                                        Core.f_new(
                                          Base.t_unitspecialtymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Boxing"),
                                            Core.f_new(
                                              Base.t_unitspecialty,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Boxing")
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
                            Core.vx_new_string("M. Bison"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("M. Bison"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("StreetFighter/MBisonToken.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("You come to fight a madman, and instead find a god?  Do you still refuse to accept my godhood?  Keep your own God!  In fact,\nthis time may be a good time to pray to Him!"),
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
                                        Core.vx_new_string("9")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Sagat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sagat"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("StreetFighter/SagatToken.png"),
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
                                        Core.vx_new_string("8"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Knee Strike"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Knee Strike")
                                              )
                                            )
                                          )
                                        ),
                                        Core.vx_new_string(":unitspecialtymap"),
                                        Core.f_new(
                                          Base.t_unitspecialtymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Muay Thai"),
                                            Core.f_new(
                                              Base.t_unitspecialty,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Muay Thai")
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
                            Core.vx_new_string(":Vega"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vega"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("StreetFighter/VegaToken.png"),
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
                                        Core.vx_new_string("8"),
                                        Core.vx_new_string(":unitspecialtymap"),
                                        Core.f_new(
                                          Base.t_unitspecialtymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Ninjutsu"),
                                            Core.f_new(
                                              Base.t_unitspecialty,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Ninjutsu")
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
            Core.vx_new_string("World of Darkness"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("World of Darkness"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Paradigm Corporation"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paradigm Corporation"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* They say misery loves company\nWe could start a company and make misery\nFrustrated, Incorporated\nWe I know just what you need\nI may just have the thing\nI know what you paid to see\nPut me out of my misery\nI'd do it for you\nWould you do it for me?\nWe will always be busy\nMaking misery\nWe could build a factory\nAnd make misery\nWe'll create the cure\nWe made the disease  - Misery, Soul Asylum"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Paradigm appears to be a modest, little known, private corporate consulting\nand administrative assistance firm.\n* In reality, it is a vast business conglomerate that does not consult for\ncompanies, it owns or controls them through a series of false identities and\nnumbered bank accounts. By secretly controlling multiple related companies,\nParadigm has secured powerful, clandestine monopolies.\n* Unfortunately, Paradigm has a dark secret: its founders are corrupt\nfollowers of the [Wyrm], and their goal is nothing less than the gradual\ndestruction of the world.\n* Paradigm hides its true intentions behind veils of lies, all the while\nfeeding humanity's greed. Instant gratification satisfies the need to covet.\nThat is Paradigm.\n* Few people outside the company know just how widespread the company is.\nParadigm is like a cancer with foul growths quietly growing through healthy\nflesh until the host dies.\n* It has vast resources, but the need for secrecy creates limits of how those\nresources can be used.\n\n!Working for Paradigm\n* Outwardly, Paradigm is a nice place to work. Good benefits, good pay,\nholiday gifts, suggestion boxes, etc.. Except, sometimes people transfer out\nof state, never to be heard from again. No retirees ever come back to visit.\nPeople who have been around long enough know not to make waves or risk their\njobs ... or worse. Better to lay low.\n* Friendships are discouraged. Personalizing items are not allowed in the\nworkplace 'to keep things professional'.\n* Family life is your own problem.  Work comes first.\n\n!Management\n* The CEO\n* The Board of Directors\n* Who runs Paradigm? Supposedly the CEO, but the CEO is not there to run the\nshow; the CEO is there to take the blame when something goes wrong. For this,\nthey are paid exceptionally handsomely when they are forced to 'resign'. The\nBoard of Directors is equally expendable, but for different reasons. Board\nmembers are replaced when the stockholders feel the company is not making\nenough money.\n* Fortunately, Paradigm spends half of its energy fighting itself. Corrupt,\negotistical, power-mongers don't work well together. Back-stabbing, hidden\nagendas, and subversion are daily activities at the top.\n\n!History\n* Paradigm started in 1865 when Jeremiah Lassater founded Standard Oil. He\nwas a ruthless, opportunist even before the accident. In 1869, while\ninspecting a problematic drilling site, Lassater became trapped in a tunnel\nwith a fearsome [Bane]. In exchange for his life, he allowed the [Bane] to\nact through him, and so began the company's long, dark descent."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pentex"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Ad Infinitum"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ad Infinitum"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/AdInfinitum.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Advertising and Marketing\n* Television\n* Communications")
                              )
                            ),
                            Core.vx_new_string("Chrysalis Corporation"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chrysalis Corporation"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/ChyrsalisCorporation.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Price of Beauty\n* Fashion, Beauty, Hygiene, Self Help, and Diet products\n* Rising Stars - Chrysalis sponsors a talent agency searching for desparate artists and actors that either can't\nfind their big break or have already used up their 15 minutes of fame.  Rising Stars has a good reputation since\nthey give unknowns and has-beens a chance.  Of course, they are actually interested in guiding them down a\ndegrading series of lies, drugs, whoring, pornography and other exploitations.  In these positions, they earn\nmoney and provide a useful spy network for Chrysalis.  When they are too old to be of use Chrysalis can always\nfind some use for their bodies.\n* A New You - This popular diet and exercise program secretly encourages vain and narcissistic tendencies.  As\nthe customer becomes stronger and more beautiful, he/she also starts losing friends.  But, of course, A New You\nprovides all the friends you might want...\n* Homogeniety - Chrysalis sponsors a social group dedicated to curing homosexuality.  Through them it attracts the\ndespondent and the outcast.  Those filled with self doubt are easily duped into undergoing treatments that will\nmake them more Normal.  Homogenity is run by Pastor Jim Fowler who despite claiming to be cured of\nhomosexuality, instead preys on youths under his care.  If they reject him, he simply claims that they have passed\na 'test'.")
                              )
                            ),
                            Core.vx_new_string("Cyberdyne Systems"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyberdyne Systems"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/Cyberdyne.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cyberdyne is a leading manufacturer of computers, software, microchips, and robotics.\n* Massively Multiplayer Games - Cyberdyne secretly maintains a presense on many online game sites.  Here they\ncultivate and recruit 'like-minded' players into the corporate fold.  Many hackers, dangerous malcontents, and\neven terrorists have been duped into doing Cyberdyne's dirty work for them.")
                              )
                            ),
                            Core.vx_new_string("Omni Comsume Products (OCP)"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Omni Comsume Products (OCP)"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/OmniComsumerProducts.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Only Choice - Robocop")
                              )
                            ),
                            Core.vx_new_string("Shinra Electric"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shinra Electric"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/ShinraElectric.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* A nuclear meltdown, contrary to popular belief, does not involve nuclear material escaping from the cooling\ntowers to spatter the area in nuclear waste.  The reality is much worse.\n* When a fission reactor overheats sufficiently, it will literally 'melt down' through the floor.  The core is\nso dense, that it will keep sinking until it hits bedrock, usually in the water table.\n* What happens next is nightmarish.  The water becomes tainted with radioactivity and flows into wells, streams,\nrivers, and reserviors.  It can poison tens of thousands of square miles in a frighteningly short time.\n* Worst of all, once a core melts down, it cannot be removed.  It will continue pouring out radioactive water\nuntil the pile decays which can be a VERY long time indeed.\n* The Corcord 1 and 2 plants in New Hampshire sit astride the Connecticut River which flows between Vermont and\nNew Hampshire, across Massachusetts, through Hartford and down to the Long Island Sound.  This whole area would\nbe poisoned in a meltdown not to mention the slow contamination of the body of water that touches New York City\nand the Atlantic Ocean."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Shinra is an electricity provider.  Besides power lines, that means Coal and Nuclear.")
                              )
                            ),
                            Core.vx_new_string("Standard Oil"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Standard Oil"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/StandardOil.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* So if I allow your employer to set up operations, they will build six hospitals and provide vaccines for two\nhundred thousand children living in poverty?  What's the catch?  We do have something of a corporate conscience,\nand it bothered our executives to think of all of the poverty and disease and suffering that would be within, well,\nspitting distance of the site...and if you should refuse this offer, we will make certain that every man, woman,\nand child in this fleabag of a country knows that you and you alone were responsible for turning down all those\nhospitals and medicines and jobs. - Regional Negotiations"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Standard is an international Oil and Petroleum product manufacturer including exploration, drilling,\nrefining, trucking, shipping, gas stations, convenience stores, etc.\n* Every so often, Standard sponsors something on PBS to make itself known as a 'good corporate citizen', but in\ngeneral, there is nothing to distinguish the company in the public mind from any other big corporation.  Some\nsee this as an advertising failure, but Standard considers this to be camouflage.\n* 'The cost of the fine is always less than the cost of compliance.' - Corporate policy is very simple: Make as\nmuch money as possible, as quickly as possible, with as little overhead as possible.  This hell-bent-for-leather\nprofitability grab makes the stockholders happy, though 'as little overhead as possible' translates to as few\nenvironmental and safety safeguards as possible.  It also means as little maintenance on its tanker fleet as\npossible.\n* Of course they can't ignore environmental concerns completely, but they prefer to invest in ad campaigns that\nequate protecting the environment with lost jobs.  Meanwhile, it makes high-profile, low content gestures\ntoward responsibility to maintain the smokescreen.\n* In the Third World, Standard is especially powerful.  They bribe or blackmail local governments to allow them\nto essentially establish independent fiefdoms complete with private armies.\n* Oil companys must always produce more oil, so Standard's research and exploration teams are well paid to find\nthe oil WHEREEVER it lies.  Oil doesn't respect national borders or religious sites, so neither do they.")
                              )
                            ),
                            Core.vx_new_string("Tyrell Corporation"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tyrell Corporation"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/TyrellCorporation.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* More Human Than Human - Blade Runner")
                              )
                            ),
                            Core.vx_new_string("Umbrella Pharmaceutical"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Umbrella Pharmaceutical"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/UmbrellaCorporation.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Our Business is Life Itself - Resident Evil\n* Regenerate's revolutionary T-Cell formula actually brings dead cells ... back to life. Now\nyour youthful beauty can last ... forever. Always consult your doctor before starting treatment.\nSome side-effects can occur."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pharmaceuticals\n* Conception Clinics - Umbrella sponsors fertility clinics and sperm banks.  They take full\nadvantage of the genetic material they receive and have been known to provide sperm of\nquestionable origins to further their experimentation. They have councilors on staff to help\nthe distraught mothers who for some reason feel that they have something unnatural inside\nthem.")
                              )
                            ),
                            Core.vx_new_string("United Fruit"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("United Fruit"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/UnitedFruit.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* United Fruit had a deep and long-lasting impact in the economic and political development of\nseveral Latin American countries. Critics often accused it of exploitative neocolonialism and\ndescribed it as the archetypal example of the influence of a multinational corporation on the\ninternal politics of the so-called 'banana republics.' United Fruit became part of the\npresent-day Chiquita Brands International.")
                              )
                            ),
                            Core.vx_new_string(":Weyland-Yutani"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weyland-Yutani"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/WeylandYutani.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Building Better Worlds - Alien\n* Halliburton"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Company is a manufacturing and construction firm known for innumerable no-bid public\nworks projects for municipal governments and the military."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("The Company")
                              )
                            ),
                            Core.vx_new_string("Yoyodyne Propulsion"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yoyodyne Propulsion"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/ModernFantasy/Yoyodyne.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Where the future begins tomorrow - Buckaroo Banzai\n* Numerous props in Star Trek series indicate that parts of Federation starships were\nmanufactured by Yoyodyne Propulsion Systems or YPS. The creators of Star Trek: The Next\nGeneration were noted fans of Buckaroo Banzai and featured many references to the film in the\nseries."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Defense contractor")
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
    mapfunc.put("tacticsbook", Modern_fantasy.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/modern_fantasy", maptype, mapconst, mapfunc);
  }

}
