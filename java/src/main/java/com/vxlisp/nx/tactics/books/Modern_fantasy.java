package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Modern_fantasy {

  /**
   * @function chapter_buffy_the_vampire_slayer
   * @return {chapter}
   * (func chapter_buffy_the_vampire_slayer)
   */
  public static interface Func_chapter_buffy_the_vampire_slayer extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_buffy_the_vampire_slayer();
  }

  public static class Class_chapter_buffy_the_vampire_slayer extends Core.Class_base implements Func_chapter_buffy_the_vampire_slayer {

    @Override
    public Func_chapter_buffy_the_vampire_slayer vx_new(Object... vals) {
      Class_chapter_buffy_the_vampire_slayer output = new Class_chapter_buffy_the_vampire_slayer();
      return output;
    }

    @Override
    public Func_chapter_buffy_the_vampire_slayer vx_copy(Object... vals) {
      Class_chapter_buffy_the_vampire_slayer output = new Class_chapter_buffy_the_vampire_slayer();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_buffy_the_vampire_slayer", // name
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
    public Func_chapter_buffy_the_vampire_slayer vx_empty() {return e_chapter_buffy_the_vampire_slayer;}
    @Override
    public Func_chapter_buffy_the_vampire_slayer vx_type() {return t_chapter_buffy_the_vampire_slayer;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_buffy_the_vampire_slayer();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_buffy_the_vampire_slayer() {
      return Modern_fantasy.f_chapter_buffy_the_vampire_slayer();
    }

  }

  public static final Func_chapter_buffy_the_vampire_slayer e_chapter_buffy_the_vampire_slayer = new Modern_fantasy.Class_chapter_buffy_the_vampire_slayer();
  public static final Func_chapter_buffy_the_vampire_slayer t_chapter_buffy_the_vampire_slayer = new Modern_fantasy.Class_chapter_buffy_the_vampire_slayer();

  public static Base.Type_chapter f_chapter_buffy_the_vampire_slayer() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Buffy the Vampire Slayer"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Scoobies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Scoobies"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Buffy Summers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Buffy Summers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Buffy.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Slayer")
                      )
                    ),
                    Core.vx_new_string("Rupert Giles"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rupert Giles"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Giles.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Ben: She could have killed me.  Giles: No she couldn't.  Never.  And sooner or later, Glory will re-emerge and\nmake Buffy pay for that mercy, and the world with her.  Buffy even knows that, and still she couldn't take a\nhuman life.  She's a hero, you see.  She's not like us.  Ben: Us? (Giles suffocates Ben)")
                      )
                    ),
                    Core.vx_new_string("Willow Rosenberg"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Willow Rosenberg"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Willow.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Buffy: You wanna go out tonight?  Willow: Strangely, I feel like staying at home... and doing my homework...\nand flossing... and dying a virgin.")
                      )
                    ),
                    Core.vx_new_string("Xander Harris"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Xander Harris"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Xander.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Faith: She got me really wound up. A fight like that and, no kill. I'm about ready to pop!  Xander: Really?\nPop?!  Faith: You up for it?  Xander: Oh, I'm up.  I'm suddenly very up.  It's just, um, I've never been up\nwith people before.  Faith: Just relax. And take your pants off.  Xander: Those two ... concepts are ...\nantithetical.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Independents"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Independents"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Angel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Angel"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Angel.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Angel: The elders conceived the perfect punishment for me.  The restored my soul.  Buffy: What, they were all\nout of boils and blinding torment?  Angel: When you become a vampire, the demon takes your body, but it doesn't\nget your soul; that's gone.  No conscience, no remorse, it's an easy way to live.  You have no idea what it's\nlike to have done the things I've done...and care."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Angelus")
                      )
                    ),
                    Core.vx_new_string("Cordelia Chase"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cordelia Chase"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Cordelia.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Cordelia: Xander, I know you take pride in being the voice of the common wuss, but the truth is, certain people\ndeserve special priviledges - they're called winners.  Xander: And what about that nutty 'all men are created\nequal' thing?  Cordelia: Propaganda spouted out by the ugly and less deserving.")
                      )
                    ),
                    Core.vx_new_string("Faith Lehane"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Faith Lehane"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Faith.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Faith: ... You're still not seeing the big picture, B.  Something made us different.  We're warriors.  We're built\nto kill.  Buffy: To kill demons!  But it does not mean that we get to pass judgment on people like we're better\nthan everybody else!  Faith: We are better!"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Slayer")
                      )
                    ),
                    Core.vx_new_string(":Spike"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spike"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Buffy/Spike.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Spike: I'll give you a choice.  Now I'm going to kill you - no choice in that.  But I can let you stay dead...\nor bring you back, to be like me.  Willow: I'll scream!  Spike: Bonus.  [A short time later]  Spike: I don't\nunderstand.  This sort of thing's never happened to me before.  Willow: Maybe you were nervous.  Spike: I felt\nall right when I started.  Let's try again.  Spike:  Ow ow ow! Dammit!!  Willow: Maybe you're trying too hard.\nDoesn't this happen to every vampire?  Spike: Not to me it doesn't!"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("William the Bloody")
                      )
                    )
                  )
                )
              )
            ),
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
    );
    return output;
  }

  /**
   * @function chapter_chronicles_of_amber
   * @return {chapter}
   * (func chapter_chronicles_of_amber)
   */
  public static interface Func_chapter_chronicles_of_amber extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_chronicles_of_amber();
  }

  public static class Class_chapter_chronicles_of_amber extends Core.Class_base implements Func_chapter_chronicles_of_amber {

    @Override
    public Func_chapter_chronicles_of_amber vx_new(Object... vals) {
      Class_chapter_chronicles_of_amber output = new Class_chapter_chronicles_of_amber();
      return output;
    }

    @Override
    public Func_chapter_chronicles_of_amber vx_copy(Object... vals) {
      Class_chapter_chronicles_of_amber output = new Class_chapter_chronicles_of_amber();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_chronicles_of_amber", // name
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
    public Func_chapter_chronicles_of_amber vx_empty() {return e_chapter_chronicles_of_amber;}
    @Override
    public Func_chapter_chronicles_of_amber vx_type() {return t_chapter_chronicles_of_amber;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_chronicles_of_amber();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_chronicles_of_amber() {
      return Modern_fantasy.f_chapter_chronicles_of_amber();
    }

  }

  public static final Func_chapter_chronicles_of_amber e_chapter_chronicles_of_amber = new Modern_fantasy.Class_chapter_chronicles_of_amber();
  public static final Func_chapter_chronicles_of_amber t_chapter_chronicles_of_amber = new Modern_fantasy.Class_chapter_chronicles_of_amber();

  public static Base.Type_chapter f_chapter_chronicles_of_amber() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Chronicles of Amber")
      )
    );
    return output;
  }

  /**
   * @function chapter_kengan_ashura
   * @return {chapter}
   * (func chapter_kengan_ashura)
   */
  public static interface Func_chapter_kengan_ashura extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_kengan_ashura();
  }

  public static class Class_chapter_kengan_ashura extends Core.Class_base implements Func_chapter_kengan_ashura {

    @Override
    public Func_chapter_kengan_ashura vx_new(Object... vals) {
      Class_chapter_kengan_ashura output = new Class_chapter_kengan_ashura();
      return output;
    }

    @Override
    public Func_chapter_kengan_ashura vx_copy(Object... vals) {
      Class_chapter_kengan_ashura output = new Class_chapter_kengan_ashura();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_kengan_ashura", // name
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
    public Func_chapter_kengan_ashura vx_empty() {return e_chapter_kengan_ashura;}
    @Override
    public Func_chapter_kengan_ashura vx_type() {return t_chapter_kengan_ashura;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_kengan_ashura();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_kengan_ashura() {
      return Modern_fantasy.f_chapter_kengan_ashura();
    }

  }

  public static final Func_chapter_kengan_ashura e_chapter_kengan_ashura = new Modern_fantasy.Class_chapter_kengan_ashura();
  public static final Func_chapter_kengan_ashura t_chapter_kengan_ashura = new Modern_fantasy.Class_chapter_kengan_ashura();

  public static Base.Type_chapter f_chapter_kengan_ashura() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Kengan Ashura"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Kengan Matches - In Japan, wealthy business owners resolve disputes by hiring unarmed fighters to duel on their behalf. The match is form of high stakes gambling with large business interests on the line. Though the conflict appears to be fought on stage, a great deal of preparation, manipulation, and deception occur before, during, and after a match.\n* Rules - A Kengan member may make a 'reasonable' bet of another and challenge them to a Kengan match. The challenge is made known to the other members who may attend and bet on the results. The challenged party may agree to the duel, object, or decline. If they duel, each party chooses a champion and agree to a venue. The results of the battle must be adhered to. Win or lose, both parties rise in status for making the attempt. If the challenged party objects, they may counter offer or claim the challenge is unreasonable. Such disputes are decided by concensus vote among the other members. Poor challenges or objections are frowned upon. If the challenged declines, they are considered to have forfeited and must adhere to the terms and lose status for not participating.\n* History - During the Edo period of Japan, wealthy merchants stuggled for the best business dealings especially for the Shogun's business needs. Conflicts between merchants became increasingly bloody and reckless until the Shogun put a stop to it by announcing that all such conflicts must be resolved in a single-combat, unarmed duel. The tradition was very successful at keeping the peace and continues to this day.")
      )
    );
    return output;
  }

  /**
   * @function chapter_matrix_the
   * @return {chapter}
   * (func chapter_matrix_the)
   */
  public static interface Func_chapter_matrix_the extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_matrix_the();
  }

  public static class Class_chapter_matrix_the extends Core.Class_base implements Func_chapter_matrix_the {

    @Override
    public Func_chapter_matrix_the vx_new(Object... vals) {
      Class_chapter_matrix_the output = new Class_chapter_matrix_the();
      return output;
    }

    @Override
    public Func_chapter_matrix_the vx_copy(Object... vals) {
      Class_chapter_matrix_the output = new Class_chapter_matrix_the();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_matrix_the", // name
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
    public Func_chapter_matrix_the vx_empty() {return e_chapter_matrix_the;}
    @Override
    public Func_chapter_matrix_the vx_type() {return t_chapter_matrix_the;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_matrix_the();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_matrix_the() {
      return Modern_fantasy.f_chapter_matrix_the();
    }

  }

  public static final Func_chapter_matrix_the e_chapter_matrix_the = new Modern_fantasy.Class_chapter_matrix_the();
  public static final Func_chapter_matrix_the t_chapter_matrix_the = new Modern_fantasy.Class_chapter_matrix_the();

  public static Base.Type_chapter f_chapter_matrix_the() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Matrix, The"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("The Matrix"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("The Matrix"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Welcome to the desert of the real. - Morpheus\n* What is 'real'? How do you define 'real'? - Morpheus\n* You are a slave, Neo.  Like everyone else you were born into bondage.  Into a prison that you cannot taste or see or touch. A prison for your mind. - Morpheus\n* Did you know that the first Matrix was designed to be a perfect human world?  Where none suffered, where everyone would be happy.  It was a disaster.  No one would accept the program.  Entire crops were lost...human beings define their reality through suffering and misery.  The perfect world was a dream that your primitive cerebrum kept trying to wake up from. - Agent Smith")
              )
            ),
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
    );
    return output;
  }

  /**
   * @function chapter_modern_fantasy_overview
   * @return {chapter}
   * (func chapter_modern_fantasy_overview)
   */
  public static interface Func_chapter_modern_fantasy_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_fantasy_overview();
  }

  public static class Class_chapter_modern_fantasy_overview extends Core.Class_base implements Func_chapter_modern_fantasy_overview {

    @Override
    public Func_chapter_modern_fantasy_overview vx_new(Object... vals) {
      Class_chapter_modern_fantasy_overview output = new Class_chapter_modern_fantasy_overview();
      return output;
    }

    @Override
    public Func_chapter_modern_fantasy_overview vx_copy(Object... vals) {
      Class_chapter_modern_fantasy_overview output = new Class_chapter_modern_fantasy_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_modern_fantasy_overview", // name
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
    public Func_chapter_modern_fantasy_overview vx_empty() {return e_chapter_modern_fantasy_overview;}
    @Override
    public Func_chapter_modern_fantasy_overview vx_type() {return t_chapter_modern_fantasy_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_modern_fantasy_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_fantasy_overview() {
      return Modern_fantasy.f_chapter_modern_fantasy_overview();
    }

  }

  public static final Func_chapter_modern_fantasy_overview e_chapter_modern_fantasy_overview = new Modern_fantasy.Class_chapter_modern_fantasy_overview();
  public static final Func_chapter_modern_fantasy_overview t_chapter_modern_fantasy_overview = new Modern_fantasy.Class_chapter_modern_fantasy_overview();

  public static Base.Type_chapter f_chapter_modern_fantasy_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
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
    );
    return output;
  }

  /**
   * @function chapter_street_fighter
   * @return {chapter}
   * (func chapter_street_fighter)
   */
  public static interface Func_chapter_street_fighter extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_street_fighter();
  }

  public static class Class_chapter_street_fighter extends Core.Class_base implements Func_chapter_street_fighter {

    @Override
    public Func_chapter_street_fighter vx_new(Object... vals) {
      Class_chapter_street_fighter output = new Class_chapter_street_fighter();
      return output;
    }

    @Override
    public Func_chapter_street_fighter vx_copy(Object... vals) {
      Class_chapter_street_fighter output = new Class_chapter_street_fighter();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_street_fighter", // name
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
    public Func_chapter_street_fighter vx_empty() {return e_chapter_street_fighter;}
    @Override
    public Func_chapter_street_fighter vx_type() {return t_chapter_street_fighter;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_street_fighter();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_street_fighter() {
      return Modern_fantasy.f_chapter_street_fighter();
    }

  }

  public static final Func_chapter_street_fighter e_chapter_street_fighter = new Modern_fantasy.Class_chapter_street_fighter();
  public static final Func_chapter_street_fighter t_chapter_street_fighter = new Modern_fantasy.Class_chapter_street_fighter();

  public static Base.Type_chapter f_chapter_street_fighter() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Street Fighter"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("World Warriors"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("World Warriors"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Blanka"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blanka"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/BlankaToken.png"),
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
                                    Core.vx_new_string(":Capoeira"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Capoeira")
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
                    Core.vx_new_string(":Cammy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cammy"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/CammyToken.png"),
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
                                    Core.vx_new_string("Commando Training"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Commando Training")
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
                    Core.vx_new_string(":Chun-Li"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chun-Li"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/Chun-LiToken.png"),
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
                                    Core.vx_new_string("Wu Shu"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Wu Shu")
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
                    Core.vx_new_string(":Dhalsim"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dhalsim"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/DhalsimToken.png"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Flexible"),
                            Core.f_new(
                              Base.t_unitskill,
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
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("E. Honda"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("E. Honda"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/EHondaToken.png"),
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
                                    Core.vx_new_string(":Sumo"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sumo")
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
                    Core.vx_new_string(":Fei-Long"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fei-Long"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/Fei-LongToken.png"),
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
                                    Core.vx_new_string("Kung Fu, Dragon Style"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Kung Fu, Dragon Style")
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
                    Core.vx_new_string(":Guile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guile"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/GuileToken.png"),
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
                                    Core.vx_new_string("Commando Training"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Commando Training")
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
                    Core.vx_new_string(":Ken"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ken"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/KenToken.png"),
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
                                    Core.vx_new_string(":Karate"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Karate")
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
                    Core.vx_new_string(":Ryu"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ryu"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/RyuToken.png"),
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
                                    Core.vx_new_string(":Karate"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Karate")
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
                    Core.vx_new_string(":Zangief"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zangief"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("StreetFighter/ZangiefToken.png"),
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
                                    Core.vx_new_string(":Wrestling"),
                                    Core.f_new(
                                      Base.t_unitspecialty,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Wrestling")
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
    );
    return output;
  }

  /**
   * @function chapter_world_of_darkness
   * @return {chapter}
   * (func chapter_world_of_darkness)
   */
  public static interface Func_chapter_world_of_darkness extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_world_of_darkness();
  }

  public static class Class_chapter_world_of_darkness extends Core.Class_base implements Func_chapter_world_of_darkness {

    @Override
    public Func_chapter_world_of_darkness vx_new(Object... vals) {
      Class_chapter_world_of_darkness output = new Class_chapter_world_of_darkness();
      return output;
    }

    @Override
    public Func_chapter_world_of_darkness vx_copy(Object... vals) {
      Class_chapter_world_of_darkness output = new Class_chapter_world_of_darkness();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/modern_fantasy", // pkgname
        "chapter_world_of_darkness", // name
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
    public Func_chapter_world_of_darkness vx_empty() {return e_chapter_world_of_darkness;}
    @Override
    public Func_chapter_world_of_darkness vx_type() {return t_chapter_world_of_darkness;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Modern_fantasy.f_chapter_world_of_darkness();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_world_of_darkness() {
      return Modern_fantasy.f_chapter_world_of_darkness();
    }

  }

  public static final Func_chapter_world_of_darkness e_chapter_world_of_darkness = new Modern_fantasy.Class_chapter_world_of_darkness();
  public static final Func_chapter_world_of_darkness t_chapter_world_of_darkness = new Modern_fantasy.Class_chapter_world_of_darkness();

  public static Base.Type_chapter f_chapter_world_of_darkness() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("World of Darkness"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Technocracy"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Technocracy"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Science is the key. Learn it. Love it. Live it.\n* One World. One Truth. One Reality.\n* ...both sides are becoming identical.  What, in fact, is being created: an\ninternational community, a perfect blueprint for World Order. When the sides\nfacing each other realize that they're looking into a mirror, they will see\nthat THIS is the pattern for the future. - #2, The Prisoner: Chimes of Big\nBen\n* We apologize for the inconvenience. - God's Final Message - Douglas Adams,\nSo Long and Thanks for All the Fish"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A world-wide conspiracy that employs a technological paradigm called\nEnlightened Science to pursue an agenda promoting safety of the world over\nfreedom. Considering the influence they have had over the world, some would\nsay they are the most powerful organization ever known.\n* Capturing the Hearts and Minds - The Technocracy understands that reality\nis subjective and that it conforms to the collective will of humanity. Their\nagenda is to guide the beliefs of mankind to secure humanity from the chaos\nthat surrounds us on all sides. To do this, they must guide our beliefs,\nremoving belief in dangerous things and replacing it with belief in things\nthat can be used to defend and better mankind. Of course, in order to do this\nthey must control what the people believe in and completely stamp out\nanything that conflicts with their model of the future. Those who do not\nmeet their criteria are labeled Reality Deviants.\n* Reality War - Because of its strong stance against reality deviancy, the\nTechnocracy is essentially at war with all supernatural beings, including\nvampires, werewolves, and other mages. In practice, this conflict is a cold\nwar, and the Technocracy has had far more success in proving to the masses\nthat supernatural beings do not exist rather than eliminating them directly.\nMany beings, such as changelings and 'bygones' (mythic beasts such as dragons,\nmanticores, and harpies) will simply cease to exist if the world stops\nbelieving in them.\n* The Price of Safety - The Technocracy champions science as a way to better\nand secure mankind while rejecting any innovation not approved by its own\nleadership. In this way, its agenda prevents effective criticism as it can\nalways claim its ideological opponents are themselves against the benefits of\nscience, many of which the Technocracy itself opposes while claiming to\nuphold.\n* Enlightened Science - In place of mysticism, the Technocracy uses\nEnlightened Science. It advances scientific methods and principles (along\nwith the technology they produces), the spread of capitalist market-forces,\nand the application of political power. Roughly one in ten Technocrats can\nuse true Enlightened Science and almost all believe their technology is so\nadvanced that it only appears magical. Enlightened Science is all about\nmoving the edge of knowledge forward, turning the unknown into the known,\ndoing what's never been done before and hammering it into forms that work.\nRepeatedly. Reliably. Universally.\n* All Technocrats regardless of their enlightenment, use some sort of\ncarefully constructed device. By their own definition, reality alteration\nwithout some sort of material basis is superstition.\n* Paradox and Enlightened Science - Like mysticism, Enlightened Science is\nsubject to Paradox. The larger, more public, and more unlikely the effect,\nthe large the potential for spectacular failure. Highly experimental science\nis best done in tightly controlled laboratory environments.\n* Be Seeing You - Watchwords stated to remind a fellow agent he will always\nserve the Technocracy.\n\nPrecepts\n* Bring stability and order to the universe. Predictability brings safety.\n* Define the nature of the universe. Knowledge must be absolute or chaos\nwill envelop all.\n* Preserve the Gauntlet. Dangerous outside forces must be banished from the\nEarth.\n* Destroy Reality Deviants. Their recklessness threatens us all.\n* Shepherd the masses. Protect them from themselves by convincing them of the\nbenefits of science and rationality. Conflict and suffering will be\neliminated in our Utopia.\n\nHistory\n* Ancient World - Science and Magic coexisted for much of human history.\nWitchdoctors, Shamans, and Druids dominated their societies. Magic was as\nmuch trickery as substance because no one could prove a real Mage from a fake.\nThose with the real gift, however, steadily used it to gain individual power.\n* Rome - With the growth of the Roman Empire, Mages found that they lacked\nthe organization necessary to hold off the Romans. Their people who had\ntrusted in their magical leaders were disheartened by the inability of their\nmagic to turn away the Romans.\n* Mythic Age - Without support from the people, the Mages were largely forced\ninto hiding and into secret cabals and orders. Normally, Mages rarely had\nshared information, but now they were forced to share their knowledge within\ntheir Orders and this knowledge created a golden age for magical discovery.\nThe Orders could not act publicly, but they were able to use their magic to\nsubtley gain great influence in society.\n* Dark Ages - After the fall of the Roman Empire and with the coming of the\nBlack Plague, the world was cast into fear and superstition. Reaon was at its\nweakest and the power of Mages was at its height. During this period,\nindividual Mages controlled the gifts of Magic while the commoners\nlanguished in misery.\n* Craftmasons - The Craftmasons Guild of enchanters took on the mission of\ncreating magical items that could be used by those without the gift. The\nguild found that in order for a lay person to use a magical item, he would\nhave to believe that the item was not magical. To do this, the people would\nhave to be convinced that the device was only a clever invention. This meant\ngradual development and regular public displays to allow the publich to\naccept each small enhancement.\n* Fall of Mistridge - After years of ideological conflict between the\nCraftmasons and the Mage Orders, the Craftmasons arranged an attack on\nMistridge, the center of power of the Hermetic Orders. Peasants and spies\ncreated the distraction while the newest invention was rolled out, the cannon.\nMistridge was soon demolished and the Craftmasons began their reign.\n* Inquisition - After the defeat of the Hermetic Orders, arrangements were\nmade to set the public out to track down and eliminate the Order Mages. This\nculminated in the Inquisition under which many Mages and innocents were\nburned at the stake.\n* Renaissance - After centuries of steady progress, the Craftmasons' plans\nbegan to bear fruit and a new Age of Reason came upon man. Early Science,\nhowever, was just as outlandish as Magic, so inventions like Da Vinci's\nactually functioned at that time. Many of the most famous Techocrats\ndeveloped during this period: Gutenberg, Copernicus. With the advent of the\nprinting press, the Craftmasons were now able to communicate their ideals to\na wider audience and to begin editing history that did not agree with their\nparadigm.\n* Victorian Era - As the power of the Craftmasons increased, they began to\nbecome fragmented into different specialties and disciplines called\nConventions. This further fragmented into distinct idealogical groups\nconcerned with nothing less than the destiny of humanity. In their minds,\nthe Conventions have the power to direct the development of mankind in any\nway they see fit. What way to choose became hotly contested. The Sons of\nEther actuallly walked out of the Conventions when it was deemed that their\nConvention would no longer be acceptable in their new world model.\n* World Wars - With the rise of Hitler, many within different regional\nConventions found that they believed in his mission and began supporting his\neffort. Simultaneously, others began supporting the Allies. This led to a\ndisaterous arms race within the Conventions that was fortunately resolved\nbefore it became completely out of control. Since then the Conventions have\ndismantled their regional control and focused on a single power structure\nwith a global mission. Some, however, are still unhappy with this\nauthoritarian approach.\n* Modern Era - The Technocracy has established bases of operation deep in\nthe Ether, away from Paradox, and have already perfected artificial\nintelligence, cloning, cybernetics, fantastic methods of transportation, and\nmind shattering innovations in artificial life. These are even now being\nslowly introduced to the world.\n\nScenarios:\n* Contain Reality Deviants\n* Recruit New Members\n* Establish a Front - The Technocracy mostly operates indirectly through other\norganizations, so it must maintain a number of front groups.\n* Investigate the Unknown\n* Internal Affairs\n* Contain Internal Threats\n* Explore the Depths\n* Everyday Living\n\nViewpoints:\n* Marauders - Call for backup then kill on sight. These insane chaos mages\nthreaten everything the Technocracy stands for and must be removed at all\ncosts.\n* Demons - Wait for backup then eliminate. Demons are powerful opponents and\nwill require a team to take down.\n* Nephandi - Report any suspected encounter, but do not engage without\nexplicit orders. The Nephandi are subversive and exposing their plots are far\nmore important than eliminating individuals.\n* Mages - Observe and report. Tradition mages act in direct opposition to the\nTechnocracy, but they are not necessarily dangerous and can certainly be\nreasoned with. We have many Mages under observation at any given moment.\nViolence is a last resort.\n* Vampires - Observe but do not engage. Minimal threat. Vampires are well\nknown to the Technocracy. Their low body heat makes them easy to track with\ninfrared. Cities are choked with the bloodsuckers, but they actively cover\ntheir own tracks, so they are low on the agenda. What the Technocracy does\nnot realize is the massive influence that Vampires possess through the Blood\nBond and that the Technocracy itself is being manipulated by various Vampire\nfactions to do their dirty work.\n* Werewolves - Observe but do not engage. Werewolves are extremely powerful\ncombatants and direct engagement can be suicide even for well equipped teams.\nOur agenda of causing the public to disbelieve in supernatural beings seems\nespecially effective on werewolves. Their numbers are declining, and even\ndirect sightings are dismissed as animal encounters. With patience the\nwerewolves will simply disappear on their own. The Technocracy is completely\nunaware that its greatest threat is actually the Wyrm (which they consider\nprimitive Werewolf superstition). The Technocracy's goals fall directly into\nthe hands of the Wyrm, and the Technocracy itself has already been so\ncorrupted at the highest levels that it is practically a pawn of the Wyrm.\n* Faeries - No threat. Race almost extinct. Await confimration of extinction.\n* Ghosts - Report any encounter. Usually no threat."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Iteration X"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iteration X"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Iteration X is dedicated to the adoption of the precision, speed, and\nunity that machines offer over flesh. They invest heavily in cybernetics,\nrobotics, automation, and artificial intelligence. They are typically\ncalculating and coldly rational. They are famous for being slow to action\nand tending to be bureaucratic in their attention to detail.\n* The merger of body and machine frightens other conventions. Implants\ncould track, observe, or control every move, thought, or bodily function.\nImplants seem to also cause their users to become distant, inhuman, and\nsometimes dangerous."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Clockwork Convention"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Autocthonia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Autocthonia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Description - A metallic Horizon Realm the size of a moon. It was\ndiscovered by the Void Engineers, but Iteration X has taken charge of\nits exploration. Autocthonia seems to represent the mechanical\nprecision of Iteration X's ideal world. It is ruled by logic instead\nof emotions without fear or pain. Others fear that this 'ideal' has\nno room for anything remotely human.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Biomechanic"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biomechanic"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* BioMechanics focus on using cybernetic implants to achieve a\nman-machine interface.")
                              )
                            ),
                            Core.vx_new_string("Central Computer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Central Computer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Iteration X has installed a massive central computer system on\nAutocthonia. It is the central hub tied to all Iteration systems.\nThe Iteration believes so strongly in the infallible nature of the\nCentral Computer that all of the convention's decisions are made in\nconsulation with the Central Computer.\n* Some fear that Iteration X relies too heavily on the Central\nComputer which has become their master instead of their servant.\nMany see their trust in the Central Computer to have become worship.\nPessimists wonder if the Central Computer is something more than\njust a computer system."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Great Computer")
                              )
                            ),
                            Core.vx_new_string("Iteration Cyborg"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iteration Cyborg")
                              )
                            ),
                            Core.vx_new_string(":Macrotechnician"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Macrotechnician"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Macrotechnicians focus on the construction of optimal equipment for\nother Iterators.")
                              )
                            ),
                            Core.vx_new_string("Iteration Statistician"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iteration Statistician"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Statisticians focus on the use of predictive models and simulations\nto anticipate future events. They believein gathering massive amounts\nof data and number crush to discover patterns that have not been\npreviously noticed.")
                              )
                            ),
                            Core.vx_new_string("Time-Motion Manager"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time-Motion Manager"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Time-Motion Managers focus on the maximization of efficiency and\nthe design of information technology.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("New World Order"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("New World Order"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Men In Black (movie)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The New World Order's highest priority is the conversion of the hearts\nand minds of the masses. They are the most humanistic of the conventions,\nrelying on human interaction, psychology, and messaging instead of\ntechnology. By shaping the beliefs of the public, they strengthen the\nconsensual reality paradigm of the Technocracy.\n* They also act as the hiring source for the entire technocracy for low\nto mid level staff. Other conventions sometimes express concern that some\nof these accountants, secretaries, and janitors are actually the eyes and\nears of the NWO.\n* Critics see the NWO as extremely sinister, and that their social agenda\nis a blatant attempt at mind control and ultimately world domination.\n!Units\n!Skills\n* +1 [[Domination]], +1 [[Espionage]], +1 [[Research]]\n!Tactics\n* Eliminate reality deviants of all kinds\n!Divisions\n* The Ivory Tower: Performs the bulk of Control's administrative tasks and directs the Union's policies.\n* Operatives: Focus on using covert operations and counter-intelligence within the Technocracy.\n* Q Division: Design and create the equipment used by the New World Order.\n*  Watchers: Focus on surveillance and media control to monitor the masses.\n!Titles\n* Adviser\n* Editor\n* Educator\n* Field Observer\n* Intelligence Analyst\n* Internal Affairs - 'Who watches the watchmen?'\n* Men In Black - Shocktroops\n* Reporter\n* Operative - Covert Ops\n* Public Relations\n* Sympathizer - Sleeper indoctrinated into believing in the NWO's goals without revealing the NWO itself."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("NWO"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Public Relations (NWO)"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Public Relations (NWO)"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Smooth talking spin-doctors whose sole responsibility is to massage\npublic opinion. They obtain positions in different organizations as\nPR men and women, and they make sure that the messsage that the\npublic receives is always the same: there is a logical explanation;\nthere will be an investigation to get to the bottom of it; there is\nnothing to worry about."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Man in Gray")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Progenitors"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Progenitors"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Progenitors believe that living things are more wonderous than\nmachines can ever be. They are dedicated to the analysis and enhancement\nof all living things and to grant humans to super human abilities.\n* Cloning, genetic engineering, advanced surgery, and phamacology are\ntheir primary tools.\n* History - The Progenitors strongly associate themselves with\nagriculture and the medical field. They traces their modern roots to\nHippocrates and the Hippocratic Oath. In the past, the Progenitors\nexperimented heavily with grafting body parts from different creatures\ntogether, but these techniques are considered outdated compared to the\nmodern genetic and pharmacology sciences.\n!Group\n!Preferred Skills\n* [Life], [Mentalism], [Medicine], [Pharmacology]\n!Divisions\n* Damage Control: Engineers genetic monsters, tailored viruses and other\nbiological warfare.\n* FACADE Engineers - Focus on cloning, biological implants, grafts, and\nother alterations. Also known as the Forced Adaptation and Clone\nAlteration Developmental Eugenicists. Their cloning techniques have given\nthe elite Progenitors a form of immortality, transferring minds from aging bodies into new clones.  Cloning has also given them a deadly espionage force.\n* Pharmacopoeists: Focus on the development and control of drugs, medicines, and narcotics.\n** They exert a subtle and growing influence on the masses as the use of prescription drugs becomes increasingly commonplace.\n** One of their goals is to slowly destroy the masses' sleeping Avatars to control them and to protect them from the awesome power that lies in each of us.\n!Devices\n* Clone Tank\n* DNA Samples\n* Pills"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Progenitor Security"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Progenitor Security"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Created by Damage Control, they are the front line security detail\nfor any Progenitor operation. They are fearless and know little\nbesides combat."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Blank, Pawn")
                              )
                            ),
                            Core.vx_new_string("Damage Control"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Damage Control"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Damage Control is the security wing of the Progenitors. They focus\non weaponizing cloning, implants, and tailored viruses.")
                              )
                            ),
                            Core.vx_new_string("Glamor Trap"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glamor Trap"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Keep young and beautiful, It's your duty to be beautiful. Keep\nyoung and beautiful If you want to be loved. - Annie Lennox, Keep\nYoung and Beautiful"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Progenitors have created a number of clones carefully bred to\nbe have perfect eyes, hair, and bodies. They are mentally simplistic\nand suffer from myriad emotional and psychological problems though\nthey can still pass as human.\n* These clones were introduced to the media and immediately became\nmodels, starlets, and other celebrities. Now women flock to the\nstores and hospitals for diet formulas, cosmetics, facelifts,\nimplants, and other surgeries all in the attempt to reach the\nimpossible goal of making themselves look like the produced perfect\nwomen. Men are slowly being indoctinated as well through hair loss\nand male potency products.")
                              )
                            ),
                            Core.vx_new_string(":Genegineer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Genegineer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Genegineers focus on harnessing the power of applied genetics.\n* Since the cloning of Dolly the sheep in 1996, cloning technology\nhas become more acceptable to the masses (if feared). The Genegineers\ncan now produce tailored clones for any occasion. They are physically\nperfect, but every clone invariably has glaring mental deficiencies.\n* The excesses of the Genegineers can be truly frightening. Botched\ncreations often die horribly or spectacularly after 'birth'.\nSuccessful creations have no rights are routinely abused, enslaved,\nexperimented on, and exterminated."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Clone Arranger, Eugenist, Mutagenic Engineer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Syndicate"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Syndicate"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The real question was this: Was all this legal? Absolutely fucking not,\nbut we were making so much money we didn't know what to do with it. -\nWolf of Wall Street\n* Godfather\n* Pay the man."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Money is Reality. The masses shared belief in currency makes human\ncivilization possible. To the Syndicate, wealth equals prosperity.\nEconomic power has always exceeded military power, and hopefully economic\nwarfare will eventually make conventional warfare obsolete.\n* The Syndicate is a largely invisible organization. They do not maintain\nbases or headquarters. Members usually have full-time jobs in business\nand finance where they can exercise their power in the course of their\nday to day activities. Syndicate members are notorious for their lack of\nmorality, working with anyone who can turn a profit. They have ties to\nevery major financial institution including: the World Bank, stock\nexchanges, hedge funds, oil corporations, tobacco corporations,\norganized crime, drug trafficers, and military dictatorships. The\nSyndicate just considers these groups as investments and will invest or\ndivest as their stock rises and falls.\n* The Syndicate provides most of the financing for the other conventions.\n* Some are concerned that the Syndicate holds the purse strings of the\nTechnocracy and holds too much influence over the direction of the other\nconventions. Others worry that the money they receive is blood money,\nsince the Syndicate holds money over morality. Futher concerns surround\nthe Syndicate's heavy lobbying, advertising, and political influence."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Syndicate Enforcer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Syndicate Enforcer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Enforcers work in law enforcement, the judicial system, and the\ncriminal underworld. They influence both the criminals that the\nmasses fear and the police and judges to whom they turn to for\nprotection. They make sure that the bills are paid and the contracts\nare kept.")
                              )
                            ),
                            Core.vx_new_string("Syndicate Financier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Syndicate Financier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Financiers work in positions of finanical influence and perform\nsilent adjustments to the flow of global commerce.")
                              )
                            ),
                            Core.vx_new_string("Syndicate Messenger"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Syndicate Messenger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Messengers work in advertising. Their mission is more than just\nselling products, they are in charge of shaping trends. They build\ndemand for entire product segments. Among many other things, this\nincludes creating conflict to spur military spending.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Void Engineers"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Void Engineers"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* But tell me, did you sail across the sun? Did you make it to\nthe Milky Way. To see the lights all faded. And that heaven is\noverrated? - Train, Drops Of Jupiter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dedicated to the study, colonization, and eventual control of realms\nbeyond Earth. Their satellites and outposts stand vigilant watch over\nterrestrial and extraterrestrial threats.\n* The Void Engineers are rugged individualists with an unusual number of\nidealists. They do not get along well with the other Conventions. The\nNWO feels that the Void Engineers encourage fantastic thoughts in the\npublic minds and therefore encourage reality deviants. The Syndicate\nregularly cuts the funding that the Void Engineers so desperately need.\nSome speculate that the Void Engineers would join the Sons of Ether if\nthey didn't rely so heavily on funding.\n* A large number of this Convention live off Earth and some have no\ndesire to return. Other Conventions are concerned that the Void Engineers\nhave grown contemptuous of earthly pursuits, and that they are becoming\nas alien as the threats the Technocracy is defending against. A number\nof Void Engineers have returned from missions strangely changed and with\nunexplained gaps in data logs. Another enormous issue is Copernicus\nResearch Center. Where did it come from? Why do the Void Engineers avoid\ndiscussing what goes on there? It is just too convenient to 'find' an\nuninhabited Dyson Sphere with an Earth-like gravity and atmosphere."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Copernicus Research Center"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Copernicus Research Center"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An fantastically immense space station in the form of a Dyson\nSphere")
                              )
                            ),
                            Core.vx_new_string("Earth Frontier Corp"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earth Frontier Corp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Earth Frontier Corp continues to investigate the wonders of the\nextreme environments on Earth including the ocean deep, frozen poles,\nrain forests and jungles, inaccessible mountain-tops, and underground\ncaverns.")
                              )
                            ),
                            Core.vx_new_string("Neutralization Corp"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Neutralization Corp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Neutralization Corps is responsible for identifying and\neliminating Reality Deviants already on Earth. This includes alien\nlandings, dimensional incursions, hauntings, etc. The NWO usually\nhandles witnesses and media fallout.")
                              )
                            ),
                            Core.vx_new_string("Pan Dimensional Corp"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pan Dimensional Corp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Pan-Dimensional Corps: Responsible for the exploration and\nstudy of the Deep Universe, the Digital Web and other alternate\ndimensions, including time itself.")
                              )
                            ),
                            Core.vx_new_string("Research Corp"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Research Corp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Research Corp is responsible for the development of dimensional\nscience, the Technocratic study of the Umbra.")
                              )
                            ),
                            Core.vx_new_string("Void Border Corp"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Void Border Corp"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Border Corps is responsible for repelling invasions from beyond\nthe reaches of Earth. They maintain heavily armed spaceships,\ndimensional craft, and marines.")
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
            Core.vx_new_string("Mages, Traditions"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mages, Traditions"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* There's a butterfly trapped in a spider's web.  That's my soul up there. - The Police, King of Pain"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Akashic Brotherhood\n\nCelestial Chorus\n\nCult of Ecstasy\n* The Ecstatics are visionaries, shamans, and adventurers of the senses.\n* Out of music, dance and passion, the Cult of Ecstasy creates the magic of entrancement and exhilaration.  Pushing\npast the boundaries and comfort zones of humanity, they seek the ultimate experience.  They're the descendants of\nancient ascetists - although now they use drugs, sex, piercing instead of meditating alone.\n* Though Cultists pursue sex, drugs, meditation, holistic living, music, and vision quests as focusing tools,\nserious Ecstatics consider these to be sacraments, not hobbies).\n* Give yourself over to absolute pleasure, Swim the warm waters of sins of the flesh.  Erotic nightmares beyond any\nmeasure, and sensual daydreams to treasure forever. - Dr. Frank N. Furter, The Rocky Horror Picture Show\n\nDreamspeakers\n\nEuthanatos\n\nOrder of Hermes\n\nVirtual Adepts\n* Technolgy is a tool to empower individuals.  The Technocracy has forgotten that goal.  They see technology as a\nforce to enslave the Masses, not liberate them.  They're fanatics.  That's why I'd do anything to destroy them. - Zarathursta, Virtual Adept"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Sons of Ether"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sons of Ether"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Void Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Void Ship"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Flying Dutchman\n* Mage: Sons of Ether\n* Space 1889\n* Spelljammers"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Void Ship is designed to travel between realms through the [Aether]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Aether Flyer, Void Cruiser")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Verbena"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Verbena")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Marauders"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Marauders"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Mages who have fallen into Quiet which has warped around them into personal [Paradox] Bubble fantasy worlds that\nwreck havoc on those around them.  Their Quiet blends the real world with their fantasy world.  From the outside\nperspective, the Marauders are dangerously insane.")
              )
            ),
            Core.vx_new_string(":Nephilm"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nephilm"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Nephandi - Their Avatars are 'inverted' (destroyed and recreated to server their dark masters).")
              )
            ),
            Core.vx_new_string("Wraiths and Spectres"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wraiths and Spectres"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* See Bestiary")
              )
            ),
            Core.vx_new_string(":Changelings"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Changelings"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Alice's Adventures in Wonderland - Lewis Carroll"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Changlings are Fae that have bonded with human hosts.\n* Changling stories tap into the roots of wonder and rediscover the world through the eyes of legend. In\nmany ways, the lost children of the Fae are metaphors for our lost youth, and the World of Darkness\nmirrors the heartless society to which we are so resigned. By surrendering to the call of imagination,\nwe can recapture some of our lost innocense. We can learn to laugh and weep again, for not all stories\nhave happy endings, we can learn to remember. It is a journey between memory and forgetfulness, between\ndreams and reality, between wonder and banality.")
              )
            ),
            Core.vx_new_string(":Spirits"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Spirits"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Bane - A corruption spirit that exists in the [Spirit Realm].\n* [Bane]s are attracted to hatred, cruelty, lust, and fear, and they are repelled by happiness, generosity,\nlove, and kindness.\nNature Spirit\nPattern Spider"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bane, Disease"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bane, Disease"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These repulsive Banes appear like blood covered bags of pus.  They are drawn to plagues, cesspools, medical\nwaste, etc.")
                      )
                    ),
                    Core.vx_new_string("Bane, Madness"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bane, Madness"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These formless spirits wear down the sanity of those exposed to them with disembodied voices, disturbing\nvisions, and horrible shrieking.")
                      )
                    ),
                    Core.vx_new_string("Bane, Poison"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bane, Poison")
                      )
                    ),
                    Core.vx_new_string("Bane, Radiation"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bane, Radiation")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Abominations"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Abominations"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Perhaps it started as an ulcer, a hole eaten away from inside.  From a life of giddy possibilities, to unpleasant\nsetbacks, still met with love, falling into an endless downward scream of missed chances, commitments, and hatred\nlocked down, simmering hatred for everyone and everything.  Like cancer, it began inside. - Freak Legion, World of\nDarkness"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A Fomor is a creature possessed by a [Bane] (a corruption spirit).\n* When a person experiences dark emotions, a [Bane] may gain entry and hide in the victim's mind waiting to exploit\nand intensify further darkness and bring the person down the road of corruption.\n* During the possession period, the [Bane] may be renounced or the [Bane] may be attacked in the [Spirit Realm].\n* After possession, a slow transformation process begins.  The [Bane] burrows into the deepest recesses of the victim's\nsoul, becoming privy to all the person's memories, hopes, dreams, and fears.  In exchange, the person is flooded with\nthe [Bane]'s poisonous, black thoughts of murder and destruction.  The process is a horrible violation, a rape most\nvile.  When this process completes, the person permanently becomes a Formor.\n* The rest of a Formor's life is miserable, brutal, and short.  Most take their suffering out on others including their\nown kind."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Fomori, Monstrosities"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Corrupted Animal"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corrupted Animal"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Corruption]")
                      )
                    ),
                    Core.vx_new_string("Hollow Man"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hollow Man"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* They're good for us.  They kill the bad things inside us...What you're supposed to do is eat it.  You eat as much\nas you can and you keep eating it. - The Stuff"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A person infested by parasites, insects, or small animals.  The hapless victim has become completely hollowed\nout by its unwanted tenants, but is somehow still alive.  The Hollow Man is desolate, immobile, and empty without\nthe possessing colony, but they are poor company at best.")
                      )
                    ),
                    Core.vx_new_string(":Normality"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Normality"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Hate Crimes"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Normalities are ghastly creatures that were once human but have been transformed into blank, sexless horrors.\nAll Normalities appear exactly identical: thin, sexless, hairless, and faceless except for a slash of a mouth.\nWith heavy clothing they may briefly pass for human.\n* Personality - Normalities have a hatred of all things different (which includes everything except themselves).\nThey are homicidal with a particulary strong reaction to those who choose to flaunt their differences (e.g.\npiercings, tattoos, goths, punkers, women wearing pants)\n* History - The Normalities are created as part of a horrific treatment that pretends to be a cure for\nhomosexuality.  Indeed, the treatment does cure homosexuality, as well as any sexuality and finally humanity."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Normals"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hunting"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunting")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Seventh Generation"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seventh Generation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Seventh Generation is a Wyrm cult dedicated to the absolute domination of men over women and children.  It\nencourages child abuse, spousal abuse, misogyny, pedophilia, and even murder and cannibalism.  Their membership is\ncomposed of an interlocking network of politicians, businessmen, corrupted clergy, military officers, millionaires,\nand even serial killers.  Each member is a twisted individual drawn together by the commonalities of their vile\nappetites.\n* Seventh Generation sponsors child foster care facilities.  These facilities are like boot camps and are very\nsuccessful at teaching children to follow instructions unquestioningly.  This discipline comes at the price of\nthe child's sense of self-esteem.  The final steps are to place the child in abusive and alcholic homes.\nThere abuse and inferiority come naturally.  When the children mature, they are perfect fodder for Umbrella.")
                      )
                    ),
                    Core.vx_new_string(":Throwback"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Throwback"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Bouncers, Frat Boys, Jocks, Weight Lifters"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Appearance - Throwbacks are hulking, musclebound, prettyboys who are constantly looking at themselves.\n* History - Throwbacks begin as insecure guys who want to increase their bodies or their manhood.  The enhancements\nthey receive brings out all of the worst male tendencies and exaggerate them to a homicidal degree.  Vanity, violence,\nand sexual aggression all warp them into virtual cavemen who care for nothing but fighting, sex, and pumping iron.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Fantasy Terms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Fantasy Terms"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Consensual Reality"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Consensual Reality"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* When the majority of people believe in something, that something comes into being.  When the nature of a place\ndiffers from the new beliefs about it, a separation occurs.  The Shattering, the Gauntlet, and the Veil shows what\nhappens during this separation.  This is the Technocracy's legacy and its goal: to replace lands of wonder by\nconvincing us they do not exist.")
                      )
                    ),
                    Core.vx_new_string(":Paradox"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paradox"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* If we ask whether the position of the electron remains the same, we must say 'no'; if we ask whether the\nelectron's position changes with time, we must say 'no'; if we ask whether the electron is at rest, we must say\n'no'; if we ask whether it is in motion, we must say 'no'.  The Buddha has given such answers when interrogated\nas to the conditions of a man's self after death. - Robert Oppenheimer\n* A hundred years ago paradox meant error to the scientific mind.  But exploring such phenomena as the nature\nof light, electromagnetism, quantum mechanics and relativity theory, science has matured to the point where it\nis increasingly recognized that at a certain level reality is paradoxical. - M. Scott Peck, M.D., The Road Less\nTraveled"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The natural order of things must be consistent.  Magick creates inconsistency displacing the natural order.\nFortunately, the fabric of reality will bend before it will break.  The tension generated by this bending is\nParadox energy.  Eventually, however, the fabric must snap back into place.  This can physically damage the\nmage, cause Paradox Flaws, force the Mage into [Quiet], or actually fling the mage into a [Paradox Realm].")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Godlike Entities"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Godlike Entities"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Weaver\n* Measures the thread of life\n!References\n* Lachesis / The Allotter\nWyld\n* Spins the thread of life\n!References\n* Clotho / The Spinner\nWyrm\n* The cutter of the thread of life\n!References\n* Atropos / The Unturning\n* Sitting in a bunker here behind my wall\nWaiting for the worms to come.\nIn perfect isolation here behind my wall\nWaiting for the worms to come.\nWaiting to cut out the deadwood.\nWaiting to clean up the city.\nWaiting to follow the worms.\nWaiting to put on a black shirt.\nWaiting to weed out the weaklings.\nWaiting to smash in their windows\nAnd kick in their doors.\nWaiting for the final solution\nTo strengthen the strain.\nWaiting to follow the worms.\nWaiting to turn on the showers\nAnd fire the ovens.\nWaiting for the queers and the coons\nand the reds and the Jews.\nWaiting to follow the worms.\nWould you like to see Britannia\nRule again, my friend?\nAll you have to do is follow the worms.\nWould you like to send our colored cousins\nHome again, my friend?\nAll you need to do is follow the worms. - Pink Floyd, The Wall")
              )
            ),
            Core.vx_new_string("Modern Fantasy Places"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Fantasy Places"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Places\nEarth\nArcadia\nThe land of the Fae.\n!References\n* Notwithstanding the beauty of this country of Faerie, in which we are, there is much that is wrong in it.  If there are great spleandours, there are corresponding horrors; heights and depths; beautiful women and awful fiends; noble men and weaklings. - George MacDonald, Phantastes\n\nDreamworlds\nDreamworlds are entire realms fashioned from the dreams of living beings.  Each person has their personal dreamworld each the size of a planet.  There are also dreamworlds clearly made from the collective dreams of many beings.  Whether our own world is a dream created by others is a matter of philosophy and point of view.\n* Land of Nod\n* Twilight Zone\n!References\n* FROM breakfast on through all the day\nAt home among my friends I stay,\nBut every night I go abroad\nAfar into the land of Nod.\n\n- The Land of Nod - Robert Louis Stevenson\n\nHollow World\n* The Hollow World is a realm that coexists with the interior of the planet as does the [[Underworld]].\n* Major portals to the Hollow World exist and both North and South Poles.\n* Certain Volcanoes and underwater passageways hold portals.\n* Deepest sub-basements and catacombs are also possible portals.\n!References\n* Journey to the Center of the Earth\n* Land of the Lost\n* Down a Rabbit Hole - Lewis Carroll\n\n** [Alternate Timelines]\n** [Dreamworld]\n** [Elysium]\nSolar System\n* Sun\n* Mercury\n* Venus\n** [Venusian Jungle]\n* [Moon]\n** [Darkside Moon Base]\n* Mars\n* Asteroid Belt\n* Jupiter\n* Saturn\n* Uranus\n* Neptune\n* Pluto\n** [Yuggoth]\n\nSpirit Realm\n* This is the world of the spirit.\n!Attributes\n* Only nature spirits inhabit this realm, though elves and other Fae folk often travel to the Spirit Realm.\n* Animals, plants, Elves, and other Fae go to the Spirit Realm after death.\n* The Spirit Realm mirrors the spiritual health of the material world.\n* All Spirit and Nature skills are at +2 in this realm.\n!Units\n* [Bane]\n* [Elves]\n* [Fae]\n* [Lycanthropes]\n\nUnderworld\n* The Underworld is the world of the dead and home of the Wraiths and Spectres.  It appears that the Underworld is within the hollow Earth, but the Underworld is actually a separate Realm.  It is a realm of eternal night containing a series of bleak islands in a sea of soul stuff slowly circling a whirlpool leading to a Black Hole, the Anti Sun, [[Oblivion]].  As a [[Wraith]] loses its connections with the living it is drawn closer to the [[Tempest]] and [[Oblivion]].\n* Stygia is the Western capital of the Underworld.\n!Abilities\n+3 Necromancy\n!Titles\n* Hell\n* Hades\n* Shadow Realm\n* Yomi\nShroud\n* Separating the Skinlands from the Shadowlands is a barrier of fear and disbelief.  The more mundane the reality at a particular spot the thicker the Shroud.\nShadowlands\nThe highest layer of the Underworld.  Here Non Corporeal [[Undead]] that maintain connections to the living world may dimly see the living world through the [[Shroud]].  Nihils or Sinkholes form randomly in the ground and open to the [[Underworld]] below.\n\n\nEthereal Realm\nThe Ethereal Realm is the realm of the mind and perception.  It appears to be an inconceivably vast, misty, void without heat or air or substance.  The mist is actually a material of sorts called the Ether.  Our world and all worlds are tiny spheres floating distantly in ethereal space.  All things are formed from the Ether, and the Ether can be bent to the will of a skilled mage.  All [[Conjuration]]s, [[Phantasms]], and [[Illusions]] are formed from the Ether.\n* One can travel at speeds limited only by the imagination.\n* Mists\n* One can create enormous constructs and even worlds from the Ether.\n* Living things and intelligent machines appear in this world in idealized forms.\n* Mind may be used instead of Body while in this plane.\n* Spirits do not appear on the Astral Plane because they exist fully in the Spirit World.\n* Undead do not appear on the Astral Plane because they exist fully in the Underworld.\n* All Mind and Arcane skills except Necromancy are at +2 in this realm.\n* [[Hyperspace]] is a limited visualization of the Ethereal Realm.\n* The Ethereal Realm is highly subjective.  What a person encounters has much to do with what they believe.\n** Astral Videre - An astral videre casts everything in terms of symbols, themes, and metaphors.  An astral videre feels at once intensely real and fundamentally surreal.\n** Mortific Videre - A mortific videre casts everything as a decayed shadow of reality.  The environments within this videre are familiar, but have been subjected to forces of decay, filth, and death.\n** Spiritual Videre - This videre casts everything as an interaction of primal forces such as life and death, order and chaos, and yin and yang.\n** Technological Videre - The most recently developed videre depicts everything either as deep space or as a series of parallel subdimensions. Interestingly, this videre carries with it a serious price - as the Astral reaches get further distant from Earth, beings with a technological videre find them increasingly toxic. Many Technocrats find themselves requiring respirators or even space suits where shamanistic mages have no difficulty breathing.\n!References\n* Aetheric Space\n* Akasha\n* Astral Realm\n* Hyperspace\n\nHorizon Realms\nMagically Created Realms\nAutochtonia\n* A metallic polyhedral space station approximately 10 miles in diameter with 4,294,967,200 sides (doubling each year, vainly seeking to be a sphere).\n* The logical replacement for heaven for [[Iteration X]].\nCopernicus Research Center\nThe COP - Dyson Sphere\nGernsback Continuum\n* A metropolis built by the [[Sons of Ether]] to glorify the gods of Science.  It is a representation of their perfect reality, a world of tomorrow.\n* Ether-powered phaeton cars zip along raised highways like shiny beetles.\n* Scientists stroll or ride the moving sidewalks that parallel the highways, linking the magnificent buildings of the Realm.\n* At night, the planets loom unusually large and the criss-crossing spotlights illuminate the metallic zepplins, Etherflyers, and jet-packed aeronauts that fly among the Art-Deco monuments and spires.\n* Oddly unique robots, custom built to their purpose, zoom from place to place performing their duties.\n!Travel\n* The realm may most easily be reached through the Great Hall Chantry in Paris, located on Rue de Puilly.  Its large front courtyard accommodates panhandlers and street performers walking on broken glass and breathing fire to an excited gathering of tourists and pigeons.  The inner hall houses the chantry meeting halls and classrooms.  Secret doorways with fantastic carving lead to an identical building in the Continuum.\n!Daily Life\n* Many Etherites live and work their entire lives here. and to many it is the closest place to Heaven.  Some live in complete rejection of the Earthly world's ugliness.  This isolation makes them a bit out of touch.\n* Food is available in a just-add-water form that expands into a full meal with all the aroma and taste of home-cooked.\n!History\n* The realm is named for the extraordinary inventor and publisher Hugo Gernsback (1884-1967).  During his life he received more than 80 patents and was the force behind both Modern Electric Magazine (later Popular Science) and Amazing Stories (the first magazine devoted exclusively to science-fiction).  He predicted with startling accuracy radar, microfilm, artificial fabrics, and florescent lighting.  The top annual prize for science-fiction was named the Hugo in his honor.  Gernsback was old but present at the opening of the realm.\n!Reference\n* The dream of H.G. Wells, in which the tall elegant engineers rule, with perfect benevolence, a humanity which has no business except to be happy.  To H.G. Wells, this was a dream of heaven - a modern version of the idle harp-sounding heaven. - Science and Human Values - Jacob Bronowski\nPangaea\nScar\nIndustrial Dystopia - Metropolis\n\nOtherworlds\nParadox Realm\n* Some continue long after their origins, though most collapse in upon themselves.\n* While we make efforts to rescue those imprisoned within, use caution to use magic wisely.  The ravaged victims of [[Paradox]] are all the object lesson you need.\n!Rugnir's Realm\n* The oldest recorded [[Paradox]] Realm.\n* Rugnir a Viking Chieftain made a magical error so great that for 1000 years he has been imprisoned within.\n* The realm used to be large but over the centuries has shrunken to fit Rugnir like a second skin.\n* Inside this amniotic sack, Rugnir is conceived, grows from infancy to old age, dies, and is conceived again within a few days.\n* He gives no indication that he is in pain or that he cares what is happening to him.\n* His cycles of rebirth seem to have confused him and he seems to have forgotten his original life.\n* Perhaps he can be stimulated to realize his predicament and try to escape."),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Wells of Silence"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wells of Silence"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* And in the naked light, I saw, 10,000 people or more.\nPeople talking without speaking, people hearing without listening\nPeople writing songs, that voices never share, and no one dared\nDisturb the sound of silence.\nFools, said I, you do not know, silence like a cancer grows\nHear my words so I might teach you, take my arms so I might reach you\nBut my words like silent raindrops fell\nand echoed in the wells of silence\nAnd the people bowed and prayed, to the neon god they made - Disturbed, Sound of Silence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A world where humanity has lost its empathy with others. People are observers and\nconsumers, but do not share emotional bonds.")
                      )
                    )
                  )
                )
              )
            ),
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
            Modern_fantasy.f_chapter_modern_fantasy_overview(),
            Core.vx_new_string("Buffy the Vampire Slayer"),
            Modern_fantasy.f_chapter_buffy_the_vampire_slayer(),
            Core.vx_new_string("Chronicles of Amber"),
            Modern_fantasy.f_chapter_chronicles_of_amber(),
            Core.vx_new_string("Kengan Ashura"),
            Modern_fantasy.f_chapter_kengan_ashura(),
            Core.vx_new_string("Matrix, The"),
            Modern_fantasy.f_chapter_matrix_the(),
            Core.vx_new_string("Street Fighter"),
            Modern_fantasy.f_chapter_street_fighter(),
            Core.vx_new_string("World of Darkness"),
            Modern_fantasy.f_chapter_world_of_darkness()
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
    mapfunc.put("chapter_buffy_the_vampire_slayer", Modern_fantasy.t_chapter_buffy_the_vampire_slayer);
    mapfunc.put("chapter_chronicles_of_amber", Modern_fantasy.t_chapter_chronicles_of_amber);
    mapfunc.put("chapter_kengan_ashura", Modern_fantasy.t_chapter_kengan_ashura);
    mapfunc.put("chapter_matrix_the", Modern_fantasy.t_chapter_matrix_the);
    mapfunc.put("chapter_modern_fantasy_overview", Modern_fantasy.t_chapter_modern_fantasy_overview);
    mapfunc.put("chapter_street_fighter", Modern_fantasy.t_chapter_street_fighter);
    mapfunc.put("chapter_world_of_darkness", Modern_fantasy.t_chapter_world_of_darkness);
    mapfunc.put("tacticsbook", Modern_fantasy.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/modern_fantasy", maptype, mapconst, mapfunc);
  }

}
