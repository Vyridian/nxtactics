'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_modern_fantasy {

  /**
   * @function chapter_buffy_the_vampire_slayer
   * @return {chapter}
   */
  static t_chapter_buffy_the_vampire_slayer = {
    vx_type: vx_core.t_type
  }
  static e_chapter_buffy_the_vampire_slayer = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_buffy_the_vampire_slayer
  }

  // (func chapter_buffy_the_vampire_slayer)
  static f_chapter_buffy_the_vampire_slayer() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Buffy the Vampire Slayer",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Scoobies",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Scoobies",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Buffy Summers",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Buffy Summers",
              ":image",
              "Buffy/Buffy.png",
              ":titles",
              "The Slayer"
            ),
            "Rupert Giles",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rupert Giles",
              ":image",
              "Buffy/Giles.png",
              ":reference",
              "Ben: She could have killed me.  Giles: No she couldn't.  Never.  And sooner or later, Glory will re-emerge and\nmake Buffy pay for that mercy, and the world with her.  Buffy even knows that, and still she couldn't take a\nhuman life.  She's a hero, you see.  She's not like us.  Ben: Us? (Giles suffocates Ben)"
            ),
            "Willow Rosenberg",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Willow Rosenberg",
              ":image",
              "Buffy/Willow.png",
              ":reference",
              "Buffy: You wanna go out tonight?  Willow: Strangely, I feel like staying at home... and doing my homework...\nand flossing... and dying a virgin."
            ),
            "Xander Harris",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Xander Harris",
              ":image",
              "Buffy/Xander.png",
              ":reference",
              "Faith: She got me really wound up. A fight like that and, no kill. I'm about ready to pop!  Xander: Really?\nPop?!  Faith: You up for it?  Xander: Oh, I'm up.  I'm suddenly very up.  It's just, um, I've never been up\nwith people before.  Faith: Just relax. And take your pants off.  Xander: Those two ... concepts are ...\nantithetical."
            )
          )
        ),
        ":Independents",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Independents",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Angel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Angel",
              ":image",
              "Buffy/Angel.png",
              ":reference",
              "Angel: The elders conceived the perfect punishment for me.  The restored my soul.  Buffy: What, they were all\nout of boils and blinding torment?  Angel: When you become a vampire, the demon takes your body, but it doesn't\nget your soul; that's gone.  No conscience, no remorse, it's an easy way to live.  You have no idea what it's\nlike to have done the things I've done...and care.",
              ":titles",
              "Angelus"
            ),
            "Cordelia Chase",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cordelia Chase",
              ":image",
              "Buffy/Cordelia.png",
              ":reference",
              "Cordelia: Xander, I know you take pride in being the voice of the common wuss, but the truth is, certain people\ndeserve special priviledges - they're called winners.  Xander: And what about that nutty 'all men are created\nequal' thing?  Cordelia: Propaganda spouted out by the ugly and less deserving."
            ),
            "Faith Lehane",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Faith Lehane",
              ":image",
              "Buffy/Faith.png",
              ":reference",
              "Faith: ... You're still not seeing the big picture, B.  Something made us different.  We're warriors.  We're built\nto kill.  Buffy: To kill demons!  But it does not mean that we get to pass judgment on people like we're better\nthan everybody else!  Faith: We are better!",
              ":titles",
              "The Slayer"
            ),
            ":Spike",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spike",
              ":image",
              "Buffy/Spike.png",
              ":reference",
              "Spike: I'll give you a choice.  Now I'm going to kill you - no choice in that.  But I can let you stay dead...\nor bring you back, to be like me.  Willow: I'll scream!  Spike: Bonus.  [A short time later]  Spike: I don't\nunderstand.  This sort of thing's never happened to me before.  Willow: Maybe you were nervous.  Spike: I felt\nall right when I started.  Let's try again.  Spike:  Ow ow ow! Dammit!!  Willow: Maybe you're trying too hard.\nDoesn't this happen to every vampire?  Spike: Not to me it doesn't!",
              ":titles",
              "William the Bloody"
            )
          )
        ),
        "Bad Guys",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Bad Guys",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Adam",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Adam",
              ":image",
              "Buffy/Adam.png",
              ":reference",
              "Adam: [After killing Professor Walsh, his first act of life] Mommy."
            ),
            ":Gentlemen",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gentlemen",
              ":image",
              "Buffy/Gentlemen.png",
              ":reference",
              "Can't even shout, can't even cry.  The Gentlemen are coming by.  Looking in windows, knocking on doors.  They\nneed to take seven and they might take yours.  Can't call to mom, can't say a word.  You're gonna die screaming\nbut you won't be heard. - Hush"
            ),
            ":Glory",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Glory",
              ":image",
              "Buffy/Glory.png",
              ":reference",
              "Glory: Wait, I've always wanted to try this.  You know that thing with worms, where if you have one and you rip it in half,\nyou get two worms.  Do you think that'll work with you?  [Buffy headbutts her] Ow! You hit me.  What are you\ncrazy?  You can't go around hitting people.  What were you, born in a barn?  Fine, be that way! [grabs Buffy by\nthe throat] I just noticed something, you have superpowers, that is so cool.  Can you fly? [throws Buffy across\nthe room]",
              ":titles",
              "Glorificus, That Which Cannot Be Named, The Beast, Her Splendiferousness, Her Sparkling Luminescence, Oh\nSweaty-Naughty-Feelings-Causing One"
            ),
            "Mayor Wilkins",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mayor Wilkins",
              ":image",
              "Buffy/Mayor.png",
              ":reference",
              "Do you think he was going to betray me?  Oh, now, that's a horrible thought.  And now he's dead, I'll never\nhave the chance to scold him."
            ),
            ":Sweet",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sweet",
              ":image",
              "Buffy/Sweet.png",
              ":reference",
              "I can bring whole cities to ruin and still have time to get a soft shoe in ... Something's cooking. I'm at the\ngriddle. I bought Nero his very first fiddle."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_chronicles_of_amber
   * @return {chapter}
   */
  static t_chapter_chronicles_of_amber = {
    vx_type: vx_core.t_type
  }
  static e_chapter_chronicles_of_amber = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_chronicles_of_amber
  }

  // (func chapter_chronicles_of_amber)
  static f_chapter_chronicles_of_amber() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Chronicles of Amber"
    )
    return output
  }

  /**
   * @function chapter_kengan_ashura
   * @return {chapter}
   */
  static t_chapter_kengan_ashura = {
    vx_type: vx_core.t_type
  }
  static e_chapter_kengan_ashura = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_kengan_ashura
  }

  // (func chapter_kengan_ashura)
  static f_chapter_kengan_ashura() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Kengan Ashura",
      ":summary",
      "* Kengan Matches - In Japan, wealthy business owners resolve disputes by hiring unarmed fighters to duel on their behalf. The match is form of high stakes gambling with large business interests on the line. Though the conflict appears to be fought on stage, a great deal of preparation, manipulation, and deception occur before, during, and after a match.\n* Rules - A Kengan member may make a 'reasonable' bet of another and challenge them to a Kengan match. The challenge is made known to the other members who may attend and bet on the results. The challenged party may agree to the duel, object, or decline. If they duel, each party chooses a champion and agree to a venue. The results of the battle must be adhered to. Win or lose, both parties rise in status for making the attempt. If the challenged party objects, they may counter offer or claim the challenge is unreasonable. Such disputes are decided by concensus vote among the other members. Poor challenges or objections are frowned upon. If the challenged declines, they are considered to have forfeited and must adhere to the terms and lose status for not participating.\n* History - During the Edo period of Japan, wealthy merchants stuggled for the best business dealings especially for the Shogun's business needs. Conflicts between merchants became increasingly bloody and reckless until the Shogun put a stop to it by announcing that all such conflicts must be resolved in a single-combat, unarmed duel. The tradition was very successful at keeping the peace and continues to this day."
    )
    return output
  }

  /**
   * @function chapter_matrix_the
   * @return {chapter}
   */
  static t_chapter_matrix_the = {
    vx_type: vx_core.t_type
  }
  static e_chapter_matrix_the = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_matrix_the
  }

  // (func chapter_matrix_the)
  static f_chapter_matrix_the() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Matrix, The",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "The Matrix",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "The Matrix",
          ":reference",
          "* Welcome to the desert of the real. - Morpheus\n* What is 'real'? How do you define 'real'? - Morpheus\n* You are a slave, Neo.  Like everyone else you were born into bondage.  Into a prison that you cannot taste or see or touch. A prison for your mind. - Morpheus\n* Did you know that the first Matrix was designed to be a perfect human world?  Where none suffered, where everyone would be happy.  It was a disaster.  No one would accept the program.  Entire crops were lost...human beings define their reality through suffering and misery.  The perfect world was a dream that your primitive cerebrum kept trying to wake up from. - Agent Smith"
        ),
        ":Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Agent Smith",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Agent Smith",
              ":reference",
              "* I hate this place.  This zoo.  This prison.  This reality, whatever you want to call it, I can't stand it any\nlonger.  It's the smell, if there is such a thing.  I feel saturated by it.  I can taste your stink and every\ntime I do, I fear that I've somehow been infected by it. - Agent Smith\n* You move to an area and you multiply and multiply until every natural resource is consumed and the only way you\ncan survive is to spread to another area.  There is another organism on this planet that follows the same\npattern.  Do you know what it is?  A virus.  Human beings are a disease, a cancer of this planet.  You're a\nplague and we are the cure. - Agent Smith"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_fantasy_overview
   * @return {chapter}
   */
  static t_chapter_modern_fantasy_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_fantasy_overview = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_modern_fantasy_overview
  }

  // (func chapter_modern_fantasy_overview)
  static f_chapter_modern_fantasy_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Fantasy Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Modern Fantasy?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Modern Fantasy?"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_street_fighter
   * @return {chapter}
   */
  static t_chapter_street_fighter = {
    vx_type: vx_core.t_type
  }
  static e_chapter_street_fighter = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_street_fighter
  }

  // (func chapter_street_fighter)
  static f_chapter_street_fighter() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Street Fighter",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "World Warriors",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "World Warriors",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Blanka",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Blanka",
              ":image",
              "StreetFighter/BlankaToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Capoeira",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Capoeira"
                    )
                  )
                )
              )
            ),
            ":Cammy",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cammy",
              ":image",
              "StreetFighter/CammyToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Commando Training",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Commando Training"
                    )
                  )
                )
              )
            ),
            ":Chun-Li",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Chun-Li",
              ":image",
              "StreetFighter/Chun-LiToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Wu Shu",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Wu Shu"
                    )
                  )
                )
              )
            ),
            ":Dhalsim",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dhalsim",
              ":image",
              "StreetFighter/DhalsimToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Flexible",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Arm Stretch",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Arm Stretch"
                    ),
                    "Leg Stretch",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Leg Stretch"
                    )
                  )
                )
              )
            ),
            "E. Honda",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "E. Honda",
              ":image",
              "StreetFighter/EHondaToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Sumo",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Sumo"
                    )
                  )
                )
              )
            ),
            ":Fei-Long",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Fei-Long",
              ":image",
              "StreetFighter/Fei-LongToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Kung Fu, Dragon Style",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Kung Fu, Dragon Style"
                    )
                  )
                )
              )
            ),
            ":Guile",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Guile",
              ":image",
              "StreetFighter/GuileToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Commando Training",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Commando Training"
                    )
                  )
                )
              )
            ),
            ":Ken",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ken",
              ":image",
              "StreetFighter/KenToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Karate",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Karate"
                    )
                  )
                )
              )
            ),
            ":Ryu",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ryu",
              ":image",
              "StreetFighter/RyuToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Karate",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Karate"
                    )
                  )
                )
              )
            ),
            ":Zangief",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Zangief",
              ":image",
              "StreetFighter/ZangiefToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Wrestling",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Wrestling"
                    )
                  )
                )
              )
            )
          )
        ),
        ":Shadaloo",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Shadaloo",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Balrog",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Balrog",
              ":image",
              "StreetFighter/BalrogToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Boxing",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Boxing"
                    )
                  )
                )
              )
            ),
            "M. Bison",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "M. Bison",
              ":image",
              "StreetFighter/MBisonToken.png",
              ":reference",
              "You come to fight a madman, and instead find a god?  Do you still refuse to accept my godhood?  Keep your own God!  In fact,\nthis time may be a good time to pray to Him!",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "9"
                )
              )
            ),
            ":Sagat",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sagat",
              ":image",
              "StreetFighter/SagatToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    "Knee Strike",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Knee Strike"
                    )
                  ),
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    "Muay Thai",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Muay Thai"
                    )
                  )
                )
              )
            ),
            ":Vega",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Vega",
              ":image",
              "StreetFighter/VegaToken.png",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Close Combat",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Close Combat",
                  ":level",
                  "8",
                  ":unitspecialtymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitspecialtymap,
                    ":Ninjutsu",
                    vx_core.f_new(
                      nx_tactics_base.t_unitspecialty,
                      ":name",
                      "Ninjutsu"
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_world_of_darkness
   * @return {chapter}
   */
  static t_chapter_world_of_darkness = {
    vx_type: vx_core.t_type
  }
  static e_chapter_world_of_darkness = {
    vx_type: nx_tactics_books_modern_fantasy.t_chapter_world_of_darkness
  }

  // (func chapter_world_of_darkness)
  static f_chapter_world_of_darkness() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "World of Darkness",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Technocracy",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Technocracy",
          ":reference",
          "* Science is the key. Learn it. Love it. Live it.\n* One World. One Truth. One Reality.\n* ...both sides are becoming identical. What, in fact, is being created: an international community, a perfect blueprint for World Order. When the sides facing each other realize that they're looking into a mirror, they will see that THIS is the pattern for the future. - #2, The Prisoner: Chimes of Big Ben\n* We apologize for the inconvenience. - God's Final Message - Douglas Adams, So Long and Thanks for All the Fish",
          ":summary",
          "* A world-wide conspiracy that employs a technological paradigm called Enlightened Science to pursue an agenda promoting safety of the world over freedom. Considering the influence they have had over the world, some would say they are the most powerful organization ever known.\n* Capturing the Hearts and Minds - The Technocracy understands that reality is subjective and that it conforms to the collective will of humanity. Their agenda is to guide the beliefs of mankind to secure humanity from the chaos that surrounds us on all sides. To do this, they must guide our beliefs, removing belief in dangerous things and replacing it with belief in things that can be used to defend and better mankind. Of course, in order to do this they must control what the people believe in and completely stamp out anything that conflicts with their model of the future. Those who do not meet their criteria are labeled Reality Deviants.\n* Reality War - Because of its strong stance against reality deviancy, the Technocracy is essentially at war with all supernatural beings, including vampires, werewolves, and other mages. In practice, this conflict is a cold war, and the Technocracy has had far more success in proving to the masses that supernatural beings do not exist rather than eliminating them directly. Many beings, such as changelings and 'bygones' (mythic beasts such as dragons, manticores, and harpies) will simply cease to exist if the world stops believing in them.\n* The Price of Safety - The Technocracy champions science as a way to better and secure mankind while rejecting any innovation not approved by its own leadership. In this way, its agenda prevents effective criticism as it can always claim its ideological opponents are themselves against the benefits of science, many of which the Technocracy itself opposes while claiming to uphold.\n* Enlightened Science - In place of mysticism, the Technocracy uses Enlightened Science. It advances scientific methods and principles (along with the technology they produces), the spread of capitalist market-forces, and the application of political power. Roughly one in ten Technocrats can use true Enlightened Science and almost all believe their technology is so advanced that it only appears magical. Enlightened Science is all about moving the edge of knowledge forward, turning the unknown into the known, doing what's never been done before and hammering it into forms that work. Repeatedly. Reliably. Universally.\n* All Technocrats regardless of their enlightenment, use some sort of carefully constructed device. By their own definition, reality alteration without some sort of material basis is superstition.\n* Paradox and Enlightened Science - Like mysticism, Enlightened Science is subject to Paradox. The larger, more public, and more unlikely the effect, the large the potential for spectacular failure. Highly experimental science is best done in tightly controlled laboratory environments.\n* Be Seeing You - Watchwords stated to remind a fellow agent he will always serve the Technocracy.\n\nPrecepts\n* Bring stability and order to the universe. Predictability brings safety.\n* Define the nature of the universe. Knowledge must be absolute or chaos will envelop all.\n* Preserve the Gauntlet. Dangerous outside forces must be banished from the Earth.\n* Destroy Reality Deviants. Their recklessness threatens us all.\n* Shepherd the masses. Protect them from themselves by convincing them of the benefits of science and rationality. Conflict and suffering will be eliminated in our Utopia.\n\nHistory\n* Ancient World - Science and Magic coexisted for much of human history. Witchdoctors, Shamans, and Druids dominated their societies. Magic was as much trickery as substance because no one could prove a real Mage from a fake. Those with the real gift, however, steadily used it to gain individual power.\n* Rome - With the growth of the Roman Empire, Mages found that they lacked the organization necessary to hold off the Romans. Their people who had trusted in their magical leaders were disheartened by the inability of their magic to turn away the Romans.\n* Mythic Age - Without support from the people, the Mages were largely forced into hiding and into secret cabals and orders. Normally, Mages rarely had shared information, but now they were forced to share their knowledge within their Orders and this knowledge created a golden age for magical discovery. The Orders could not act publicly, but they were able to use their magic to subtley gain great influence in society.\n* Dark Ages - After the fall of the Roman Empire and with the coming of the Black Plague, the world was cast into fear and superstition. Reaon was at its weakest and the power of Mages was at its height. During this period, individual Mages controlled the gifts of Magic while the commoners languished in misery.\n* Craftmasons - The Craftmasons Guild of enchanters took on the mission of creating magical items that could be used by those without the gift. The guild found that in order for a lay person to use a magical item, he would have to believe that the item was not magical. To do this, the people would have to be convinced that the device was only a clever invention. This meant gradual development and regular public displays to allow the publich to accept each small enhancement.\n* Fall of Mistridge - After years of ideological conflict between the Craftmasons and the Mage Orders, the Craftmasons arranged an attack on Mistridge, the center of power of the Hermetic Orders. Peasants and spies created the distraction while the newest invention was rolled out, the cannon. Mistridge was soon demolished and the Craftmasons began their reign.\n* Inquisition - After the defeat of the Hermetic Orders, arrangements were made to set the public out to track down and eliminate the Order Mages. This culminated in the Inquisition under which many Mages and innocents were burned at the stake.\n* Renaissance - After centuries of steady progress, the Craftmasons' plans began to bear fruit and a new Age of Reason came upon man. Early Science, however, was just as outlandish as Magic, so inventions like Da Vinci's actually functioned at that time. Many of the most famous Techocrats developed during this period: Gutenberg, Copernicus. With the advent of the printing press, the Craftmasons were now able to communicate their ideals to a wider audience and to begin editing history that did not agree with their paradigm.\n* Victorian Era - As the power of the Craftmasons increased, they began to become fragmented into different specialties and disciplines called Conventions. This further fragmented into distinct idealogical groups concerned with nothing less than the destiny of humanity. In their minds, the Conventions have the power to direct the development of mankind in any way they see fit. What way to choose became hotly contested. The Sons of Ether actuallly walked out of the Conventions when it was deemed that their Convention would no longer be acceptable in their new world model.\n* World Wars - With the rise of Hitler, many within different regional Conventions found that they believed in his mission and began supporting his effort. Simultaneously, others began supporting the Allies. This led to a disaterous arms race within the Conventions that was fortunately resolved before it became completely out of control. Since then the Conventions have dismantled their regional control and focused on a single power structure with a global mission. Some, however, are still unhappy with this authoritarian approach.\n* Modern Era - The Technocracy has established bases of operation deep in the Ether, away from Paradox, and have already perfected artificial intelligence, cloning, cybernetics, fantastic methods of transportation, and mind shattering innovations in artificial life. These are even now being slowly introduced to the world.\n\nScenarios:\n* Contain Reality Deviants\n* Recruit New Members\n* Establish a Front - The Technocracy mostly operates indirectly through other organizations, so it must maintain a number of front groups.\n* Investigate the Unknown\n* Internal Affairs\n* Contain Internal Threats\n* Explore the Depths\n* Everyday Living\n\nViewpoints:\n* Marauders - Call for backup then kill on sight. These insane chaos mages threaten everything the Technocracy stands for and must be removed at all costs.\n* Demons - Wait for backup then eliminate. Demons are powerful opponents and will require a team to take down.\n* Nephandi - Report any suspected encounter, but do not engage without explicit orders. The Nephandi are subversive and exposing their plots are far more important than eliminating individuals.\n* Mages - Observe and report. Tradition mages act in direct opposition to the Technocracy, but they are not necessarily dangerous and can certainly be reasoned with. We have many Mages under observation at any given moment. Violence is a last resort.\n* Vampires - Observe but do not engage. Minimal threat. Vampires are well known to the Technocracy. Their low body heat makes them easy to track with infrared. Cities are choked with the bloodsuckers, but they actively cover their own tracks, so they are low on the agenda. What the Technocracy does not realize is the massive influence that Vampires possess through the Blood Bond and that the Technocracy itself is being manipulated by various Vampire factions to do their dirty work.\n* Werewolves - Observe but do not engage. Werewolves are extremely powerful combatants and direct engagement can be suicide even for well equipped teams. Our agenda of causing the public to disbelieve in supernatural beings seems especially effective on werewolves. Their numbers are declining, and even direct sightings are dismissed as animal encounters. With patience the werewolves will simply disappear on their own. The Technocracy is completely unaware that its greatest threat is actually the Wyrm (which they consider primitive Werewolf superstition). The Technocracy's goals fall directly into the hands of the Wyrm, and the Technocracy itself has already been so corrupted at the highest levels that it is practically a pawn of the Wyrm.\n* Faeries - No threat. Race almost extinct. Await confimration of extinction.\n* Ghosts - Report any encounter. Usually no threat.",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Iteration X",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Iteration X",
              ":summary",
              "* Iteration X is dedicated to the adoption of the precision, speed, and unity that machines offer over flesh. They invest heavily in cybernetics, robotics, automation, and artificial intelligence. They are typically calculating and coldly rational. They are famous for being slow to action and tending to be bureaucratic in their attention to detail.\n* The merger of body and machine frightens other conventions. Implants could track, observe, or control every move, thought, or bodily function. Implants seem to also cause their users to become distant, inhuman, and sometimes dangerous.",
              ":titles",
              "Clockwork Convention",
              ":placemap",
              vx_core.f_new(
                nx_tactics_base.t_placemap,
                ":Autocthonia",
                vx_core.f_new(
                  nx_tactics_base.t_place,
                  ":name",
                  "Autocthonia",
                  ":summary",
                  "* Description - A metallic Horizon Realm the size of a moon. It was discovered by the Void Engineers, but Iteration X has taken charge of its exploration. Autocthonia seems to represent the mechanical precision of Iteration X's ideal world. It is ruled by logic instead of emotions without fear or pain. Others fear that this 'ideal' has no room for anything remotely human."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Biomechanic",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Biomechanic",
                  ":summary",
                  "* BioMechanics focus on using cybernetic implants to achieve a man-machine interface."
                ),
                "Central Computer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Central Computer",
                  ":summary",
                  "* Iteration X has installed a massive central computer system on Autocthonia. It is the central hub tied to all Iteration systems. The Iteration believes so strongly in the infallible nature of the Central Computer that all of the convention's decisions are made in consulation with the Central Computer.\n* Some fear that Iteration X relies too heavily on the Central Computer which has become their master instead of their servant. Many see their trust in the Central Computer to have become worship. Pessimists wonder if the Central Computer is something more than just a computer system.",
                  ":titles",
                  "Great Computer"
                ),
                "Iteration Cyborg",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Iteration Cyborg"
                ),
                ":Macrotechnician",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Macrotechnician",
                  ":summary",
                  "* Macrotechnicians focus on the construction of optimal equipment for other Iterators."
                ),
                "Iteration Statistician",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Iteration Statistician",
                  ":summary",
                  "* Statisticians focus on the use of predictive models and simulations to anticipate future events. They believein gathering massive amounts of data and number crush to discover patterns that have not been previously noticed."
                ),
                "Time-Motion Manager",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Time-Motion Manager",
                  ":summary",
                  "* Time-Motion Managers focus on the maximization of efficiency and the design of information technology."
                )
              )
            ),
            "New World Order",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "New World Order",
              ":reference",
              "Men In Black (movie)",
              ":summary",
              "* The New World Order's highest priority is the conversion of the hearts\nand minds of the masses. They are the most humanistic of the conventions,\nrelying on human interaction, psychology, and messaging instead of\ntechnology. By shaping the beliefs of the public, they strengthen the\nconsensual reality paradigm of the Technocracy.\n* They also act as the hiring source for the entire technocracy for low\nto mid level staff. Other conventions sometimes express concern that some\nof these accountants, secretaries, and janitors are actually the eyes and\nears of the NWO.\n* Critics see the NWO as extremely sinister, and that their social agenda\nis a blatant attempt at mind control and ultimately world domination.\n!Units\n!Skills\n* +1 [[Domination]], +1 [[Espionage]], +1 [[Research]]\n!Tactics\n* Eliminate reality deviants of all kinds\n!Divisions\n* The Ivory Tower: Performs the bulk of Control's administrative tasks and directs the Union's policies.\n* Operatives: Focus on using covert operations and counter-intelligence within the Technocracy.\n* Q Division: Design and create the equipment used by the New World Order.\n*  Watchers: Focus on surveillance and media control to monitor the masses.\n!Titles\n* Adviser\n* Editor\n* Educator\n* Field Observer\n* Intelligence Analyst\n* Internal Affairs - 'Who watches the watchmen?'\n* Men In Black - Shocktroops\n* Reporter\n* Operative - Covert Ops\n* Public Relations\n* Sympathizer - Sleeper indoctrinated into believing in the NWO's goals without revealing the NWO itself.",
              ":titles",
              "NWO",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Public Relations (NWO)",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Public Relations (NWO)",
                  ":summary",
                  "* Smooth talking spin-doctors whose sole responsibility is to massage public opinion. They obtain positions in different organizations as PR men and women, and they make sure that the messsage that the public receives is always the same: there is a logical explanation; there will be an investigation to get to the bottom of it; there is nothing to worry about.",
                  ":titles",
                  "Man in Gray"
                )
              )
            ),
            ":Progenitors",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Progenitors",
              ":summary",
              "* The Progenitors believe that living things are more wonderous than\nmachines can ever be. They are dedicated to the analysis and enhancement\nof all living things and to grant humans to super human abilities.\n* Cloning, genetic engineering, advanced surgery, and phamacology are\ntheir primary tools.\n* History - The Progenitors strongly associate themselves with\nagriculture and the medical field. They traces their modern roots to\nHippocrates and the Hippocratic Oath. In the past, the Progenitors\nexperimented heavily with grafting body parts from different creatures\ntogether, but these techniques are considered outdated compared to the\nmodern genetic and pharmacology sciences.\n!Group\n!Preferred Skills\n* [Life], [Mentalism], [Medicine], [Pharmacology]\n!Divisions\n* Damage Control: Engineers genetic monsters, tailored viruses and other\nbiological warfare.\n* FACADE Engineers - Focus on cloning, biological implants, grafts, and\nother alterations. Also known as the Forced Adaptation and Clone\nAlteration Developmental Eugenicists. Their cloning techniques have given\nthe elite Progenitors a form of immortality, transferring minds from aging bodies into new clones.  Cloning has also given them a deadly espionage force.\n* Pharmacopoeists: Focus on the development and control of drugs, medicines, and narcotics.\n** They exert a subtle and growing influence on the masses as the use of prescription drugs becomes increasingly commonplace.\n** One of their goals is to slowly destroy the masses' sleeping Avatars to control them and to protect them from the awesome power that lies in each of us.\n!Devices\n* Clone Tank\n* DNA Samples\n* Pills",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Progenitor Security",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Progenitor Security",
                  ":summary",
                  "* Created by Damage Control, they are the front line security detail for any Progenitor operation. They are fearless and know little besides combat.",
                  ":titles",
                  "Blank, Pawn"
                ),
                "Damage Control",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Damage Control",
                  ":summary",
                  "* Damage Control is the security wing of the Progenitors. They focus on weaponizing cloning, implants, and tailored viruses."
                ),
                "Glamor Trap",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Glamor Trap",
                  ":reference",
                  "* Keep young and beautiful, It's your duty to be beautiful. Keep young and beautiful If you want to be loved. - Annie Lennox, Keep Young and Beautiful",
                  ":summary",
                  "* The Progenitors have created a number of clones carefully bred to be have perfect eyes, hair, and bodies. They are mentally simplistic and suffer from myriad emotional and psychological problems though they can still pass as human.\n* These clones were introduced to the media and immediately became models, starlets, and other celebrities. Now women flock to the stores and hospitals for diet formulas, cosmetics, facelifts, implants, and other surgeries all in the attempt to reach the impossible goal of making themselves look like the produced perfect women. Men are slowly being indoctinated as well through hair loss and male potency products."
                ),
                ":Genegineer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Genegineer",
                  ":summary",
                  "* Genegineers focus on harnessing the power of applied genetics.\n* Since the cloning of Dolly the sheep in 1996, cloning technology\nhas become more acceptable to the masses (if feared). The Genegineers\ncan now produce tailored clones for any occasion. They are physically\nperfect, but every clone invariably has glaring mental deficiencies.\n* The excesses of the Genegineers can be truly frightening. Botched\ncreations often die horribly or spectacularly after 'birth'.\nSuccessful creations have no rights are routinely abused, enslaved,\nexperimented on, and exterminated.",
                  ":titles",
                  "Clone Arranger, Eugenist, Mutagenic Engineer"
                )
              )
            ),
            ":Syndicate",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Syndicate",
              ":reference",
              "* The real question was this: Was all this legal? Absolutely fucking not,\nbut we were making so much money we didn't know what to do with it. -\nWolf of Wall Street\n* Godfather\n* Pay the man.",
              ":summary",
              "* Money is Reality. The masses shared belief in currency makes human\ncivilization possible. To the Syndicate, wealth equals prosperity.\nEconomic power has always exceeded military power, and hopefully economic\nwarfare will eventually make conventional warfare obsolete.\n* The Syndicate is a largely invisible organization. They do not maintain\nbases or headquarters. Members usually have full-time jobs in business\nand finance where they can exercise their power in the course of their\nday to day activities. Syndicate members are notorious for their lack of\nmorality, working with anyone who can turn a profit. They have ties to\nevery major financial institution including: the World Bank, stock\nexchanges, hedge funds, oil corporations, tobacco corporations,\norganized crime, drug trafficers, and military dictatorships. The\nSyndicate just considers these groups as investments and will invest or\ndivest as their stock rises and falls.\n* The Syndicate provides most of the financing for the other conventions.\n* Some are concerned that the Syndicate holds the purse strings of the\nTechnocracy and holds too much influence over the direction of the other\nconventions. Others worry that the money they receive is blood money,\nsince the Syndicate holds money over morality. Futher concerns surround\nthe Syndicate's heavy lobbying, advertising, and political influence.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Syndicate Enforcer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Syndicate Enforcer",
                  ":summary",
                  "* Enforcers work in law enforcement, the judicial system, and the\ncriminal underworld. They influence both the criminals that the\nmasses fear and the police and judges to whom they turn to for\nprotection. They make sure that the bills are paid and the contracts\nare kept."
                ),
                "Syndicate Financier",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Syndicate Financier",
                  ":summary",
                  "* The Financiers work in positions of finanical influence and perform silent adjustments to the flow of global commerce."
                ),
                "Syndicate Messenger",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Syndicate Messenger",
                  ":summary",
                  "* The Messengers work in advertising. Their mission is more than just\nselling products, they are in charge of shaping trends. They build\ndemand for entire product segments. Among many other things, this\nincludes creating conflict to spur military spending."
                )
              )
            ),
            "Void Engineers",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Void Engineers",
              ":reference",
              "* But tell me, did you sail across the sun? Did you make it to the Milky Way. To see the lights all faded. And that heaven is overrated? - Train, Drops Of Jupiter",
              ":summary",
              "* Dedicated to the study, colonization, and eventual control of realms beyond Earth. Their satellites and outposts stand vigilant watch over terrestrial and extraterrestrial threats.\n* The Void Engineers are rugged individualists with an unusual number of\nidealists. They do not get along well with the other Conventions. The\nNWO feels that the Void Engineers encourage fantastic thoughts in the\npublic minds and therefore encourage reality deviants. The Syndicate\nregularly cuts the funding that the Void Engineers so desperately need.\nSome speculate that the Void Engineers would join the Sons of Ether if\nthey didn't rely so heavily on funding.\n* A large number of this Convention live off Earth and some have no\ndesire to return. Other Conventions are concerned that the Void Engineers\nhave grown contemptuous of earthly pursuits, and that they are becoming\nas alien as the threats the Technocracy is defending against. A number\nof Void Engineers have returned from missions strangely changed and with\nunexplained gaps in data logs. Another enormous issue is Copernicus\nResearch Center. Where did it come from? Why do the Void Engineers avoid\ndiscussing what goes on there? It is just too convenient to 'find' an\nuninhabited Dyson Sphere with an Earth-like gravity and atmosphere.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Copernicus Research Center",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Copernicus Research Center",
                  ":summary",
                  "* An fantastically immense space station in the form of a Dyson\nSphere"
                ),
                "Earth Frontier Corp",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Earth Frontier Corp",
                  ":summary",
                  "* The Earth Frontier Corp continues to investigate the wonders of the extreme environments on Earth including the ocean deep, frozen poles, rain forests and jungles, inaccessible mountain-tops, and underground caverns."
                ),
                "Neutralization Corp",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Neutralization Corp",
                  ":summary",
                  "* The Neutralization Corps is responsible for identifying and eliminating Reality Deviants already on Earth. This includes alien landings, dimensional incursions, hauntings, etc. The NWO usually handles witnesses and media fallout."
                ),
                "Pan Dimensional Corp",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Pan Dimensional Corp",
                  ":summary",
                  "* The Pan-Dimensional Corps: Responsible for the exploration and study of the Deep Universe, the Digital Web and other alternate dimensions, including time itself."
                ),
                "Research Corp",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Research Corp",
                  ":summary",
                  "* The Research Corp is responsible for the development of dimensional science, the Technocratic study of the Umbra."
                ),
                "Void Border Corp",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Void Border Corp",
                  ":summary",
                  "* The Border Corps is responsible for repelling invasions from beyond the reaches of Earth. They maintain heavily armed spaceships, dimensional craft, and marines."
                )
              )
            )
          )
        ),
        "Mages, Traditions",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mages, Traditions",
          ":reference",
          "* There's a butterfly trapped in a spider's web.  That's my soul up there. - The Police, King of Pain",
          ":summary",
          "Akashic Brotherhood\n\nCelestial Chorus\n\nCult of Ecstasy\n* The Ecstatics are visionaries, shamans, and adventurers of the senses.\n* Out of music, dance and passion, the Cult of Ecstasy creates the magic of entrancement and exhilaration.  Pushing\npast the boundaries and comfort zones of humanity, they seek the ultimate experience.  They're the descendants of\nancient ascetists - although now they use drugs, sex, piercing instead of meditating alone.\n* Though Cultists pursue sex, drugs, meditation, holistic living, music, and vision quests as focusing tools,\nserious Ecstatics consider these to be sacraments, not hobbies).\n* Give yourself over to absolute pleasure, Swim the warm waters of sins of the flesh.  Erotic nightmares beyond any\nmeasure, and sensual daydreams to treasure forever. - Dr. Frank N. Furter, The Rocky Horror Picture Show\n\nDreamspeakers\n\nEuthanatos\n\nOrder of Hermes\n\nVirtual Adepts\n* Technolgy is a tool to empower individuals.  The Technocracy has forgotten that goal.  They see technology as a\nforce to enslave the Masses, not liberate them.  They're fanatics.  That's why I'd do anything to destroy them. - Zarathursta, Virtual Adept",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Sons of Ether",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Sons of Ether",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Void Ship",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Void Ship",
                  ":reference",
                  "* Flying Dutchman\n* Mage: Sons of Ether\n* Space 1889\n* Spelljammers",
                  ":summary",
                  "* A Void Ship is designed to travel between realms through the [Aether].",
                  ":titles",
                  "Aether Flyer, Void Cruiser"
                )
              )
            ),
            ":Verbena",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Verbena"
            )
          )
        ),
        ":Marauders",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Marauders",
          ":summary",
          "* Mages who have fallen into Quiet which has warped around them into personal [Paradox] Bubble fantasy worlds that\nwreck havoc on those around them.  Their Quiet blends the real world with their fantasy world.  From the outside\nperspective, the Marauders are dangerously insane."
        ),
        ":Nephilm",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nephilm",
          ":summary",
          "* Nephandi - Their Avatars are 'inverted' (destroyed and recreated to server their dark masters)."
        ),
        "Wraiths and Spectres",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Wraiths and Spectres",
          ":summary",
          "* See Bestiary"
        ),
        ":Changelings",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Changelings",
          ":reference",
          "* Alice's Adventures in Wonderland - Lewis Carroll",
          ":summary",
          "* Changlings are Fae that have bonded with human hosts.\n* Changling stories tap into the roots of wonder and rediscover the world through the eyes of legend. In\nmany ways, the lost children of the Fae are metaphors for our lost youth, and the World of Darkness\nmirrors the heartless society to which we are so resigned. By surrendering to the call of imagination,\nwe can recapture some of our lost innocense. We can learn to laugh and weep again, for not all stories\nhave happy endings, we can learn to remember. It is a journey between memory and forgetfulness, between\ndreams and reality, between wonder and banality."
        ),
        ":Spirits",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Spirits",
          ":summary",
          "* Bane - A corruption spirit that exists in the [Spirit Realm].\n* [Bane]s are attracted to hatred, cruelty, lust, and fear, and they are repelled by happiness, generosity,\nlove, and kindness.\nNature Spirit\nPattern Spider",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Bane, Disease",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bane, Disease",
              ":summary",
              "* These repulsive Banes appear like blood covered bags of pus.  They are drawn to plagues, cesspools, medical\nwaste, etc."
            ),
            "Bane, Madness",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bane, Madness",
              ":summary",
              "* These formless spirits wear down the sanity of those exposed to them with disembodied voices, disturbing\nvisions, and horrible shrieking."
            ),
            "Bane, Poison",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bane, Poison"
            ),
            "Bane, Radiation",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Bane, Radiation"
            )
          )
        ),
        ":Abominations",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Abominations",
          ":reference",
          "Perhaps it started as an ulcer, a hole eaten away from inside.  From a life of giddy possibilities, to unpleasant\nsetbacks, still met with love, falling into an endless downward scream of missed chances, commitments, and hatred\nlocked down, simmering hatred for everyone and everything.  Like cancer, it began inside. - Freak Legion, World of\nDarkness",
          ":summary",
          "* A Fomor is a creature possessed by a [Bane] (a corruption spirit).\n* When a person experiences dark emotions, a [Bane] may gain entry and hide in the victim's mind waiting to exploit\nand intensify further darkness and bring the person down the road of corruption.\n* During the possession period, the [Bane] may be renounced or the [Bane] may be attacked in the [Spirit Realm].\n* After possession, a slow transformation process begins.  The [Bane] burrows into the deepest recesses of the victim's\nsoul, becoming privy to all the person's memories, hopes, dreams, and fears.  In exchange, the person is flooded with\nthe [Bane]'s poisonous, black thoughts of murder and destruction.  The process is a horrible violation, a rape most\nvile.  When this process completes, the person permanently becomes a Formor.\n* The rest of a Formor's life is miserable, brutal, and short.  Most take their suffering out on others including their\nown kind.",
          ":titles",
          "Fomori, Monstrosities",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Corrupted Animal",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Corrupted Animal",
              ":summary",
              "* [Corruption]"
            ),
            "Hollow Man",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hollow Man",
              ":reference",
              "* They're good for us.  They kill the bad things inside us...What you're supposed to do is eat it.  You eat as much\nas you can and you keep eating it. - The Stuff",
              ":summary",
              "* A person infested by parasites, insects, or small animals.  The hapless victim has become completely hollowed\nout by its unwanted tenants, but is somehow still alive.  The Hollow Man is desolate, immobile, and empty without\nthe possessing colony, but they are poor company at best."
            ),
            ":Normality",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Normality",
              ":reference",
              "Hate Crimes",
              ":summary",
              "* Normalities are ghastly creatures that were once human but have been transformed into blank, sexless horrors.\nAll Normalities appear exactly identical: thin, sexless, hairless, and faceless except for a slash of a mouth.\nWith heavy clothing they may briefly pass for human.\n* Personality - Normalities have a hatred of all things different (which includes everything except themselves).\nThey are homicidal with a particulary strong reaction to those who choose to flaunt their differences (e.g.\npiercings, tattoos, goths, punkers, women wearing pants)\n* History - The Normalities are created as part of a horrific treatment that pretends to be a cure for\nhomosexuality.  Indeed, the treatment does cure homosexuality, as well as any sexuality and finally humanity.",
              ":titles",
              "Normals",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Hunting",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Hunting"
                )
              )
            ),
            "Seventh Generation",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Seventh Generation",
              ":summary",
              "* Seventh Generation is a Wyrm cult dedicated to the absolute domination of men over women and children.  It\nencourages child abuse, spousal abuse, misogyny, pedophilia, and even murder and cannibalism.  Their membership is\ncomposed of an interlocking network of politicians, businessmen, corrupted clergy, military officers, millionaires,\nand even serial killers.  Each member is a twisted individual drawn together by the commonalities of their vile\nappetites.\n* Seventh Generation sponsors child foster care facilities.  These facilities are like boot camps and are very\nsuccessful at teaching children to follow instructions unquestioningly.  This discipline comes at the price of\nthe child's sense of self-esteem.  The final steps are to place the child in abusive and alcholic homes.\nThere abuse and inferiority come naturally.  When the children mature, they are perfect fodder for Umbrella."
            ),
            ":Throwback",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Throwback",
              ":reference",
              "Bouncers, Frat Boys, Jocks, Weight Lifters",
              ":summary",
              "* Appearance - Throwbacks are hulking, musclebound, prettyboys who are constantly looking at themselves.\n* History - Throwbacks begin as insecure guys who want to increase their bodies or their manhood.  The enhancements\nthey receive brings out all of the worst male tendencies and exaggerate them to a homicidal degree.  Vanity, violence,\nand sexual aggression all warp them into virtual cavemen who care for nothing but fighting, sex, and pumping iron."
            )
          )
        ),
        "Modern Fantasy Terms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Fantasy Terms",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Consensual Reality",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Consensual Reality",
              ":summary",
              "* When the majority of people believe in something, that something comes into being.  When the nature of a place\ndiffers from the new beliefs about it, a separation occurs.  The Shattering, the Gauntlet, and the Veil shows what\nhappens during this separation.  This is the Technocracy's legacy and its goal: to replace lands of wonder by\nconvincing us they do not exist."
            ),
            ":Paradox",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Paradox",
              ":reference",
              "* If we ask whether the position of the electron remains the same, we must say 'no'; if we ask whether the\nelectron's position changes with time, we must say 'no'; if we ask whether the electron is at rest, we must say\n'no'; if we ask whether it is in motion, we must say 'no'.  The Buddha has given such answers when interrogated\nas to the conditions of a man's self after death. - Robert Oppenheimer\n* A hundred years ago paradox meant error to the scientific mind.  But exploring such phenomena as the nature\nof light, electromagnetism, quantum mechanics and relativity theory, science has matured to the point where it\nis increasingly recognized that at a certain level reality is paradoxical. - M. Scott Peck, M.D., The Road Less\nTraveled",
              ":summary",
              "* The natural order of things must be consistent.  Magick creates inconsistency displacing the natural order.\nFortunately, the fabric of reality will bend before it will break.  The tension generated by this bending is\nParadox energy.  Eventually, however, the fabric must snap back into place.  This can physically damage the\nmage, cause Paradox Flaws, force the Mage into [Quiet], or actually fling the mage into a [Paradox Realm]."
            )
          )
        ),
        "Godlike Entities",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Godlike Entities",
          ":summary",
          "Weaver\n* Measures the thread of life\n!References\n* Lachesis / The Allotter\nWyld\n* Spins the thread of life\n!References\n* Clotho / The Spinner\nWyrm\n* The cutter of the thread of life\n!References\n* Atropos / The Unturning\n* Sitting in a bunker here behind my wall\nWaiting for the worms to come.\nIn perfect isolation here behind my wall\nWaiting for the worms to come.\nWaiting to cut out the deadwood.\nWaiting to clean up the city.\nWaiting to follow the worms.\nWaiting to put on a black shirt.\nWaiting to weed out the weaklings.\nWaiting to smash in their windows\nAnd kick in their doors.\nWaiting for the final solution\nTo strengthen the strain.\nWaiting to follow the worms.\nWaiting to turn on the showers\nAnd fire the ovens.\nWaiting for the queers and the coons\nand the reds and the Jews.\nWaiting to follow the worms.\nWould you like to see Britannia\nRule again, my friend?\nAll you have to do is follow the worms.\nWould you like to send our colored cousins\nHome again, my friend?\nAll you need to do is follow the worms. - Pink Floyd, The Wall"
        ),
        "Modern Fantasy Places",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Fantasy Places",
          ":summary",
          "Places\nEarth\nArcadia\nThe land of the Fae.\n!References\n* Notwithstanding the beauty of this country of Faerie, in which we are, there is much that is wrong in it.  If there are great spleandours, there are corresponding horrors; heights and depths; beautiful women and awful fiends; noble men and weaklings. - George MacDonald, Phantastes\n\nDreamworlds\nDreamworlds are entire realms fashioned from the dreams of living beings.  Each person has their personal dreamworld each the size of a planet.  There are also dreamworlds clearly made from the collective dreams of many beings.  Whether our own world is a dream created by others is a matter of philosophy and point of view.\n* Land of Nod\n* Twilight Zone\n!References\n* FROM breakfast on through all the day\nAt home among my friends I stay,\nBut every night I go abroad\nAfar into the land of Nod.\n\n- The Land of Nod - Robert Louis Stevenson\n\nHollow World\n* The Hollow World is a realm that coexists with the interior of the planet as does the [[Underworld]].\n* Major portals to the Hollow World exist and both North and South Poles.\n* Certain Volcanoes and underwater passageways hold portals.\n* Deepest sub-basements and catacombs are also possible portals.\n!References\n* Journey to the Center of the Earth\n* Land of the Lost\n* Down a Rabbit Hole - Lewis Carroll\n\n** [Alternate Timelines]\n** [Dreamworld]\n** [Elysium]\nSolar System\n* Sun\n* Mercury\n* Venus\n** [Venusian Jungle]\n* [Moon]\n** [Darkside Moon Base]\n* Mars\n* Asteroid Belt\n* Jupiter\n* Saturn\n* Uranus\n* Neptune\n* Pluto\n** [Yuggoth]\n\nSpirit Realm\n* This is the world of the spirit.\n!Attributes\n* Only nature spirits inhabit this realm, though elves and other Fae folk often travel to the Spirit Realm.\n* Animals, plants, Elves, and other Fae go to the Spirit Realm after death.\n* The Spirit Realm mirrors the spiritual health of the material world.\n* All Spirit and Nature skills are at +2 in this realm.\n!Units\n* [Bane]\n* [Elves]\n* [Fae]\n* [Lycanthropes]\n\nUnderworld\n* The Underworld is the world of the dead and home of the Wraiths and Spectres.  It appears that the Underworld is within the hollow Earth, but the Underworld is actually a separate Realm.  It is a realm of eternal night containing a series of bleak islands in a sea of soul stuff slowly circling a whirlpool leading to a Black Hole, the Anti Sun, [[Oblivion]].  As a [[Wraith]] loses its connections with the living it is drawn closer to the [[Tempest]] and [[Oblivion]].\n* Stygia is the Western capital of the Underworld.\n!Abilities\n+3 Necromancy\n!Titles\n* Hell\n* Hades\n* Shadow Realm\n* Yomi\nShroud\n* Separating the Skinlands from the Shadowlands is a barrier of fear and disbelief.  The more mundane the reality at a particular spot the thicker the Shroud.\nShadowlands\nThe highest layer of the Underworld.  Here Non Corporeal [[Undead]] that maintain connections to the living world may dimly see the living world through the [[Shroud]].  Nihils or Sinkholes form randomly in the ground and open to the [[Underworld]] below.\n\n\nEthereal Realm\nThe Ethereal Realm is the realm of the mind and perception.  It appears to be an inconceivably vast, misty, void without heat or air or substance.  The mist is actually a material of sorts called the Ether.  Our world and all worlds are tiny spheres floating distantly in ethereal space.  All things are formed from the Ether, and the Ether can be bent to the will of a skilled mage.  All [[Conjuration]]s, [[Phantasms]], and [[Illusions]] are formed from the Ether.\n* One can travel at speeds limited only by the imagination.\n* Mists\n* One can create enormous constructs and even worlds from the Ether.\n* Living things and intelligent machines appear in this world in idealized forms.\n* Mind may be used instead of Body while in this plane.\n* Spirits do not appear on the Astral Plane because they exist fully in the Spirit World.\n* Undead do not appear on the Astral Plane because they exist fully in the Underworld.\n* All Mind and Arcane skills except Necromancy are at +2 in this realm.\n* [[Hyperspace]] is a limited visualization of the Ethereal Realm.\n* The Ethereal Realm is highly subjective.  What a person encounters has much to do with what they believe.\n** Astral Videre - An astral videre casts everything in terms of symbols, themes, and metaphors.  An astral videre feels at once intensely real and fundamentally surreal.\n** Mortific Videre - A mortific videre casts everything as a decayed shadow of reality.  The environments within this videre are familiar, but have been subjected to forces of decay, filth, and death.\n** Spiritual Videre - This videre casts everything as an interaction of primal forces such as life and death, order and chaos, and yin and yang.\n** Technological Videre - The most recently developed videre depicts everything either as deep space or as a series of parallel subdimensions. Interestingly, this videre carries with it a serious price - as the Astral reaches get further distant from Earth, beings with a technological videre find them increasingly toxic. Many Technocrats find themselves requiring respirators or even space suits where shamanistic mages have no difficulty breathing.\n!References\n* Aetheric Space\n* Akasha\n* Astral Realm\n* Hyperspace\n\nHorizon Realms\nMagically Created Realms\nAutochtonia\n* A metallic polyhedral space station approximately 10 miles in diameter with 4,294,967,200 sides (doubling each year, vainly seeking to be a sphere).\n* The logical replacement for heaven for [[Iteration X]].\nCopernicus Research Center\nThe COP - Dyson Sphere\nGernsback Continuum\n* A metropolis built by the [[Sons of Ether]] to glorify the gods of Science.  It is a representation of their perfect reality, a world of tomorrow.\n* Ether-powered phaeton cars zip along raised highways like shiny beetles.\n* Scientists stroll or ride the moving sidewalks that parallel the highways, linking the magnificent buildings of the Realm.\n* At night, the planets loom unusually large and the criss-crossing spotlights illuminate the metallic zepplins, Etherflyers, and jet-packed aeronauts that fly among the Art-Deco monuments and spires.\n* Oddly unique robots, custom built to their purpose, zoom from place to place performing their duties.\n!Travel\n* The realm may most easily be reached through the Great Hall Chantry in Paris, located on Rue de Puilly.  Its large front courtyard accommodates panhandlers and street performers walking on broken glass and breathing fire to an excited gathering of tourists and pigeons.  The inner hall houses the chantry meeting halls and classrooms.  Secret doorways with fantastic carving lead to an identical building in the Continuum.\n!Daily Life\n* Many Etherites live and work their entire lives here. and to many it is the closest place to Heaven.  Some live in complete rejection of the Earthly world's ugliness.  This isolation makes them a bit out of touch.\n* Food is available in a just-add-water form that expands into a full meal with all the aroma and taste of home-cooked.\n!History\n* The realm is named for the extraordinary inventor and publisher Hugo Gernsback (1884-1967).  During his life he received more than 80 patents and was the force behind both Modern Electric Magazine (later Popular Science) and Amazing Stories (the first magazine devoted exclusively to science-fiction).  He predicted with startling accuracy radar, microfilm, artificial fabrics, and florescent lighting.  The top annual prize for science-fiction was named the Hugo in his honor.  Gernsback was old but present at the opening of the realm.\n!Reference\n* The dream of H.G. Wells, in which the tall elegant engineers rule, with perfect benevolence, a humanity which has no business except to be happy.  To H.G. Wells, this was a dream of heaven - a modern version of the idle harp-sounding heaven. - Science and Human Values - Jacob Bronowski\nPangaea\nScar\nIndustrial Dystopia - Metropolis\n\nOtherworlds\nParadox Realm\n* Some continue long after their origins, though most collapse in upon themselves.\n* While we make efforts to rescue those imprisoned within, use caution to use magic wisely.  The ravaged victims of [[Paradox]] are all the object lesson you need.\n!Rugnir's Realm\n* The oldest recorded [[Paradox]] Realm.\n* Rugnir a Viking Chieftain made a magical error so great that for 1000 years he has been imprisoned within.\n* The realm used to be large but over the centuries has shrunken to fit Rugnir like a second skin.\n* Inside this amniotic sack, Rugnir is conceived, grows from infancy to old age, dies, and is conceived again within a few days.\n* He gives no indication that he is in pain or that he cares what is happening to him.\n* His cycles of rebirth seem to have confused him and he seems to have forgotten his original life.\n* Perhaps he can be stimulated to realize his predicament and try to escape.",
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            "Wells of Silence",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Wells of Silence",
              ":reference",
              "* And in the naked light, I saw, 10,000 people or more.\nPeople talking without speaking, people hearing without listening\nPeople writing songs, that voices never share, and no one dared\nDisturb the sound of silence.\nFools, said I, you do not know, silence like a cancer grows\nHear my words so I might teach you, take my arms so I might reach you\nBut my words like silent raindrops fell\nand echoed in the wells of silence\nAnd the people bowed and prayed, to the neon god they made - Disturbed, Sound of Silence",
              ":summary",
              "* A world where humanity has lost its empathy with others. People are observers and\nconsumers, but do not share emotional bonds."
            )
          )
        ),
        "Paradigm Corporation",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Paradigm Corporation",
          ":reference",
          "* They say misery loves company\nWe could start a company and make misery\nFrustrated, Incorporated\nWe I know just what you need\nI may just have the thing\nI know what you paid to see\nPut me out of my misery\nI'd do it for you\nWould you do it for me?\nWe will always be busy\nMaking misery\nWe could build a factory\nAnd make misery\nWe'll create the cure\nWe made the disease  - Misery, Soul Asylum",
          ":summary",
          "* Paradigm appears to be a modest, little known, private corporate consulting\nand administrative assistance firm.\n* In reality, it is a vast business conglomerate that does not consult for\ncompanies, it owns or controls them through a series of false identities and\nnumbered bank accounts. By secretly controlling multiple related companies,\nParadigm has secured powerful, clandestine monopolies.\n* Unfortunately, Paradigm has a dark secret: its founders are corrupt\nfollowers of the [Wyrm], and their goal is nothing less than the gradual\ndestruction of the world.\n* Paradigm hides its true intentions behind veils of lies, all the while\nfeeding humanity's greed. Instant gratification satisfies the need to covet.\nThat is Paradigm.\n* Few people outside the company know just how widespread the company is.\nParadigm is like a cancer with foul growths quietly growing through healthy\nflesh until the host dies.\n* It has vast resources, but the need for secrecy creates limits of how those\nresources can be used.\n\n!Working for Paradigm\n* Outwardly, Paradigm is a nice place to work. Good benefits, good pay,\nholiday gifts, suggestion boxes, etc.. Except, sometimes people transfer out\nof state, never to be heard from again. No retirees ever come back to visit.\nPeople who have been around long enough know not to make waves or risk their\njobs ... or worse. Better to lay low.\n* Friendships are discouraged. Personalizing items are not allowed in the\nworkplace 'to keep things professional'.\n* Family life is your own problem.  Work comes first.\n\n!Management\n* The CEO\n* The Board of Directors\n* Who runs Paradigm? Supposedly the CEO, but the CEO is not there to run the\nshow; the CEO is there to take the blame when something goes wrong. For this,\nthey are paid exceptionally handsomely when they are forced to 'resign'. The\nBoard of Directors is equally expendable, but for different reasons. Board\nmembers are replaced when the stockholders feel the company is not making\nenough money.\n* Fortunately, Paradigm spends half of its energy fighting itself. Corrupt,\negotistical, power-mongers don't work well together. Back-stabbing, hidden\nagendas, and subversion are daily activities at the top.\n\n!History\n* Paradigm started in 1865 when Jeremiah Lassater founded Standard Oil. He\nwas a ruthless, opportunist even before the accident. In 1869, while\ninspecting a problematic drilling site, Lassater became trapped in a tunnel\nwith a fearsome [Bane]. In exchange for his life, he allowed the [Bane] to\nact through him, and so began the company's long, dark descent.",
          ":titles",
          "Pentex",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Ad Infinitum",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Ad Infinitum",
              ":image",
              "Units/ModernFantasy/AdInfinitum.jpg",
              ":summary",
              "* Advertising and Marketing\n* Television\n* Communications"
            ),
            "Chrysalis Corporation",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Chrysalis Corporation",
              ":image",
              "Units/ModernFantasy/ChyrsalisCorporation.jpg",
              ":summary",
              "* The Price of Beauty\n* Fashion, Beauty, Hygiene, Self Help, and Diet products\n* Rising Stars - Chrysalis sponsors a talent agency searching for desparate artists and actors that either can't\nfind their big break or have already used up their 15 minutes of fame.  Rising Stars has a good reputation since\nthey give unknowns and has-beens a chance.  Of course, they are actually interested in guiding them down a\ndegrading series of lies, drugs, whoring, pornography and other exploitations.  In these positions, they earn\nmoney and provide a useful spy network for Chrysalis.  When they are too old to be of use Chrysalis can always\nfind some use for their bodies.\n* A New You - This popular diet and exercise program secretly encourages vain and narcissistic tendencies.  As\nthe customer becomes stronger and more beautiful, he/she also starts losing friends.  But, of course, A New You\nprovides all the friends you might want...\n* Homogeniety - Chrysalis sponsors a social group dedicated to curing homosexuality.  Through them it attracts the\ndespondent and the outcast.  Those filled with self doubt are easily duped into undergoing treatments that will\nmake them more Normal.  Homogenity is run by Pastor Jim Fowler who despite claiming to be cured of\nhomosexuality, instead preys on youths under his care.  If they reject him, he simply claims that they have passed\na 'test'."
            ),
            "Cyberdyne Systems",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Cyberdyne Systems",
              ":image",
              "Units/ModernFantasy/Cyberdyne.jpg",
              ":summary",
              "* Cyberdyne is a leading manufacturer of computers, software, microchips, and robotics.\n* Massively Multiplayer Games - Cyberdyne secretly maintains a presense on many online game sites.  Here they\ncultivate and recruit 'like-minded' players into the corporate fold.  Many hackers, dangerous malcontents, and\neven terrorists have been duped into doing Cyberdyne's dirty work for them."
            ),
            "Omni Comsume Products (OCP)",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Omni Comsume Products (OCP)",
              ":image",
              "Units/ModernFantasy/OmniComsumerProducts.jpg",
              ":reference",
              "The Only Choice - Robocop"
            ),
            "Shinra Electric",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Shinra Electric",
              ":image",
              "Units/ModernFantasy/ShinraElectric.jpg",
              ":reference",
              "* A nuclear meltdown, contrary to popular belief, does not involve nuclear material escaping from the cooling\ntowers to spatter the area in nuclear waste.  The reality is much worse.\n* When a fission reactor overheats sufficiently, it will literally 'melt down' through the floor.  The core is\nso dense, that it will keep sinking until it hits bedrock, usually in the water table.\n* What happens next is nightmarish.  The water becomes tainted with radioactivity and flows into wells, streams,\nrivers, and reserviors.  It can poison tens of thousands of square miles in a frighteningly short time.\n* Worst of all, once a core melts down, it cannot be removed.  It will continue pouring out radioactive water\nuntil the pile decays which can be a VERY long time indeed.\n* The Corcord 1 and 2 plants in New Hampshire sit astride the Connecticut River which flows between Vermont and\nNew Hampshire, across Massachusetts, through Hartford and down to the Long Island Sound.  This whole area would\nbe poisoned in a meltdown not to mention the slow contamination of the body of water that touches New York City\nand the Atlantic Ocean.",
              ":summary",
              "* Shinra is an electricity provider.  Besides power lines, that means Coal and Nuclear."
            ),
            "Standard Oil",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Standard Oil",
              ":image",
              "Units/ModernFantasy/StandardOil.jpg",
              ":reference",
              "* So if I allow your employer to set up operations, they will build six hospitals and provide vaccines for two\nhundred thousand children living in poverty?  What's the catch?  We do have something of a corporate conscience,\nand it bothered our executives to think of all of the poverty and disease and suffering that would be within, well,\nspitting distance of the site...and if you should refuse this offer, we will make certain that every man, woman,\nand child in this fleabag of a country knows that you and you alone were responsible for turning down all those\nhospitals and medicines and jobs. - Regional Negotiations",
              ":summary",
              "* Standard is an international Oil and Petroleum product manufacturer including exploration, drilling,\nrefining, trucking, shipping, gas stations, convenience stores, etc.\n* Every so often, Standard sponsors something on PBS to make itself known as a 'good corporate citizen', but in\ngeneral, there is nothing to distinguish the company in the public mind from any other big corporation.  Some\nsee this as an advertising failure, but Standard considers this to be camouflage.\n* 'The cost of the fine is always less than the cost of compliance.' - Corporate policy is very simple: Make as\nmuch money as possible, as quickly as possible, with as little overhead as possible.  This hell-bent-for-leather\nprofitability grab makes the stockholders happy, though 'as little overhead as possible' translates to as few\nenvironmental and safety safeguards as possible.  It also means as little maintenance on its tanker fleet as\npossible.\n* Of course they can't ignore environmental concerns completely, but they prefer to invest in ad campaigns that\nequate protecting the environment with lost jobs.  Meanwhile, it makes high-profile, low content gestures\ntoward responsibility to maintain the smokescreen.\n* In the Third World, Standard is especially powerful.  They bribe or blackmail local governments to allow them\nto essentially establish independent fiefdoms complete with private armies.\n* Oil companys must always produce more oil, so Standard's research and exploration teams are well paid to find\nthe oil WHEREEVER it lies.  Oil doesn't respect national borders or religious sites, so neither do they."
            ),
            "Tyrell Corporation",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Tyrell Corporation",
              ":image",
              "Units/ModernFantasy/TyrellCorporation.jpg",
              ":reference",
              "* More Human Than Human - Blade Runner"
            ),
            "Umbrella Pharmaceutical",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Umbrella Pharmaceutical",
              ":image",
              "Units/ModernFantasy/UmbrellaCorporation.jpg",
              ":reference",
              "* Our Business is Life Itself - Resident Evil\n* Regenerate's revolutionary T-Cell formula actually brings dead cells ... back to life. Now\nyour youthful beauty can last ... forever. Always consult your doctor before starting treatment.\nSome side-effects can occur.",
              ":summary",
              "* Pharmaceuticals\n* Conception Clinics - Umbrella sponsors fertility clinics and sperm banks.  They take full\nadvantage of the genetic material they receive and have been known to provide sperm of\nquestionable origins to further their experimentation. They have councilors on staff to help\nthe distraught mothers who for some reason feel that they have something unnatural inside\nthem."
            ),
            "United Fruit",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "United Fruit",
              ":image",
              "Units/ModernFantasy/UnitedFruit.jpg",
              ":reference",
              "* United Fruit had a deep and long-lasting impact in the economic and political development of\nseveral Latin American countries. Critics often accused it of exploitative neocolonialism and\ndescribed it as the archetypal example of the influence of a multinational corporation on the\ninternal politics of the so-called 'banana republics.' United Fruit became part of the\npresent-day Chiquita Brands International."
            ),
            ":Weyland-Yutani",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Weyland-Yutani",
              ":image",
              "Units/ModernFantasy/WeylandYutani.jpg",
              ":reference",
              "* Building Better Worlds - Alien\n* Halliburton",
              ":summary",
              "* The Company is a manufacturing and construction firm known for innumerable no-bid public\nworks projects for municipal governments and the military.",
              ":titles",
              "The Company"
            ),
            "Yoyodyne Propulsion",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Yoyodyne Propulsion",
              ":image",
              "Units/ModernFantasy/Yoyodyne.jpg",
              ":reference",
              "* Where the future begins tomorrow - Buckaroo Banzai\n* Numerous props in Star Trek series indicate that parts of Federation starships were\nmanufactured by Yoyodyne Propulsion Systems or YPS. The creators of Star Trek: The Next\nGeneration were noted fans of Buckaroo Banzai and featured many references to the film in the\nseries.",
              ":summary",
              "* Defense contractor"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_modern_fantasy.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Modern Fantasy",
      ":image",
      "Vampire_Slayer_by_Prasa.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Modern Fantasy Overview",
        nx_tactics_books_modern_fantasy.f_chapter_modern_fantasy_overview(),
        "Buffy the Vampire Slayer",
        nx_tactics_books_modern_fantasy.f_chapter_buffy_the_vampire_slayer(),
        "Chronicles of Amber",
        nx_tactics_books_modern_fantasy.f_chapter_chronicles_of_amber(),
        "Kengan Ashura",
        nx_tactics_books_modern_fantasy.f_chapter_kengan_ashura(),
        "Matrix, The",
        nx_tactics_books_modern_fantasy.f_chapter_matrix_the(),
        "Street Fighter",
        nx_tactics_books_modern_fantasy.f_chapter_street_fighter(),
        "World of Darkness",
        nx_tactics_books_modern_fantasy.f_chapter_world_of_darkness()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_buffy_the_vampire_slayer": nx_tactics_books_modern_fantasy.e_chapter_buffy_the_vampire_slayer,
      "chapter_chronicles_of_amber": nx_tactics_books_modern_fantasy.e_chapter_chronicles_of_amber,
      "chapter_kengan_ashura": nx_tactics_books_modern_fantasy.e_chapter_kengan_ashura,
      "chapter_matrix_the": nx_tactics_books_modern_fantasy.e_chapter_matrix_the,
      "chapter_modern_fantasy_overview": nx_tactics_books_modern_fantasy.e_chapter_modern_fantasy_overview,
      "chapter_street_fighter": nx_tactics_books_modern_fantasy.e_chapter_street_fighter,
      "chapter_world_of_darkness": nx_tactics_books_modern_fantasy.e_chapter_world_of_darkness,
      "tacticsbook": nx_tactics_books_modern_fantasy.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_buffy_the_vampire_slayer": nx_tactics_books_modern_fantasy.t_chapter_buffy_the_vampire_slayer,
      "chapter_chronicles_of_amber": nx_tactics_books_modern_fantasy.t_chapter_chronicles_of_amber,
      "chapter_kengan_ashura": nx_tactics_books_modern_fantasy.t_chapter_kengan_ashura,
      "chapter_matrix_the": nx_tactics_books_modern_fantasy.t_chapter_matrix_the,
      "chapter_modern_fantasy_overview": nx_tactics_books_modern_fantasy.t_chapter_modern_fantasy_overview,
      "chapter_street_fighter": nx_tactics_books_modern_fantasy.t_chapter_street_fighter,
      "chapter_world_of_darkness": nx_tactics_books_modern_fantasy.t_chapter_world_of_darkness,
      "tacticsbook": nx_tactics_books_modern_fantasy.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/modern_fantasy",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_buffy_the_vampire_slayer)
    nx_tactics_books_modern_fantasy.t_chapter_buffy_the_vampire_slayer['vx_value'] = {
      name          : "chapter_buffy_the_vampire_slayer",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_buffy_the_vampire_slayer
    }

    // (func chapter_chronicles_of_amber)
    nx_tactics_books_modern_fantasy.t_chapter_chronicles_of_amber['vx_value'] = {
      name          : "chapter_chronicles_of_amber",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_chronicles_of_amber
    }

    // (func chapter_kengan_ashura)
    nx_tactics_books_modern_fantasy.t_chapter_kengan_ashura['vx_value'] = {
      name          : "chapter_kengan_ashura",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_kengan_ashura
    }

    // (func chapter_matrix_the)
    nx_tactics_books_modern_fantasy.t_chapter_matrix_the['vx_value'] = {
      name          : "chapter_matrix_the",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_matrix_the
    }

    // (func chapter_modern_fantasy_overview)
    nx_tactics_books_modern_fantasy.t_chapter_modern_fantasy_overview['vx_value'] = {
      name          : "chapter_modern_fantasy_overview",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_modern_fantasy_overview
    }

    // (func chapter_street_fighter)
    nx_tactics_books_modern_fantasy.t_chapter_street_fighter['vx_value'] = {
      name          : "chapter_street_fighter",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_street_fighter
    }

    // (func chapter_world_of_darkness)
    nx_tactics_books_modern_fantasy.t_chapter_world_of_darkness['vx_value'] = {
      name          : "chapter_world_of_darkness",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_chapter_world_of_darkness
    }

    // (func tacticsbook)
    nx_tactics_books_modern_fantasy.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/modern_fantasy",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_modern_fantasy.f_tacticsbook
    }

  }
}
