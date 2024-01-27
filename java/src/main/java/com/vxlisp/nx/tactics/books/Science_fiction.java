package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Science_fiction {

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
    Core.f_new(
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
            Core.f_new(
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
            ),
            Core.vx_new_string(":Archetypes"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Archetypes"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Psionic\n** Preferred Skills: [Telepathy], [Mind Over Matter], [Divination]")
              )
            ),
            Core.vx_new_string("Alternate Realties"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Alternate Realties"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Alien / Predator"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Battlestar Galactica"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Battlestar Galactica"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Doctor Who"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Doctor Who"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Robotech"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Robotech"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Space Cruiser Yamato"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Space Opera"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space Opera"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Star Trek"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Trek"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Star Wars"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Star Wars"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
                                    Core.vx_new_string(":Firearms"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Firearms"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
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
                                    ),
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
                                    ),
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
                                    Core.vx_new_string(":Melee"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Melee"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("7"),
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
                                    ),
                                    Core.vx_new_string(":Firearms"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Firearms"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
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
                                    ),
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
                                    Core.vx_new_string(":Melee"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Melee"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("8"),
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
                                    ),
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
            ),
            Core.vx_new_string("Time Travellers"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Unique Aliens"),
            Core.f_new(
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
    mapfunc.put("tacticsbook", Science_fiction.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/science_fiction", maptype, mapconst, mapfunc);
  }

}
