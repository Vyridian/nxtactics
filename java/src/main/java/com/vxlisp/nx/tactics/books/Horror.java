package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Horror {

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
        "nx/tactics/books/horror", // pkgname
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
      output = Horror.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Horror.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Horror.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Horror.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Horror"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Cthulhu.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Horror Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Horror Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Horror?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Horror?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Call of Cthulhu"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Call of Cthulhu"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Premise that common human laws and interests and emotions have no validity or significance in the vast cosmos-at-large... To achieve the essence of real externality, whether of space or time or dimension, one must forget that such things as organic life, good and evil, love and hate, and all such local attributes of a negligible and temporary race called mankind, have any existence at all."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Most of the intelligent Mythos creatures are masters of [Necromancy] and have long ago reanimated their physical bodies into part physical/part spiritual forms that humans would call [Undead].\n* Like [Undead], they exist partially in the [Spirit Realm], are immune to most hostile environments, and appear blurry in photograph and other recordings.\n* If their body is destroyed, their Spirit leaves the body and enters the [Spirit Realm] fully. Their bodies age will rapidly catch up to it usually causing it to deteriorate rapidly. Normally their spirit never returns to the physical world, but if they are powerful enough, they may find their way back through the Veil and even death may not stop them from returning."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Seeds of Azathoth"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seeds of Azathoth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Nemesis - Since 1984, a theory attempts to explain the mass extinctions that occur\nevery 27 million years. The theory submits that a brown dwarf star orbits our sun at\n95,000 AUs and every 27 million years it approaches close enough to rain comets throughout\nthe solar system causing climate change, mass-extinctions, and similar catastrophes.\n* Seeds of Azathoth - Nemesis is, in reality, a Spawn of Azathoth that has clung to orbit\naround the Sun. Occasionally, pieces of Nemesis break free, falling into the solar\nsystem: the Seeds of Azathoth. Seeds that strike the Sun are destroyed, but if a seed\nstrikes a planet, it can melt into the planet's core where it grows immensely, eventually\nforming a new Spawn which emerges from the broken planet like a snake from an egg. Our\nsystem's original fifth world was so parasitized. Its remnants compose the asteroid belt.\n* For millenia, human and other astronomers have seen in comets, 'hairy stars',\napproaching disaster and ill-fortune. In ancient texts, comets have been blamed for\nthe revolt of the Shoggoths against the Elder Things, the doom of the dinosaurs, the\nfall of the empire of the Serpent People, the destruction of Hyperborea, the sinking of\nAtlantis, and even the two ages of chaos that struck early Egypt.\n* The most recent effect of Nemesis took place in central Siberia, June 30, 1908, when a\ntremendous explosion rocked the area for hundreds of miles. There was a pillar of fire\nand shock waves powerful enough to knock down horses 400 miles away."),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("The Case of Phillip Baxter"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("The Case of Phillip Baxter"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Figure in the Night"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Figure in the Night"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* An investigator wakes suddenly in the night to see the room bathed in pale\ngreen light and a strange musky smell. A vague, ghostly figure gestures toward\nthe investigator. Suddenly, a portion of its head disappears as if bitten off.\nThe spectre stumbles and thrashes around the room as more of the head is eaten\nuntil it is completely headless. The figure goes rigid and fades away leaving\nthe room in darkness.\n* After contemplation, the figure is recognized as Professor Phillip Baxter a\nformer teacher of the investigator.\n* Contacting Phillip's home gets the distraught housekeeper, Angela Vincenzo. She\ninforms them that Phillip passed away yesterday of a sudden illness. She invites\nthem to the funeral the next morning.\n* A successful Occult roll indicates that an apparition usually appears at the\nmoment of death instead of a day later.")
                                      )
                                    ),
                                    Core.vx_new_string("Funeral of Phillip Baxter"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Funeral of Phillip Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("The services are in the rain and attended by:\n* Julian Baxter, the priest, in a wheelchair.\n* Matthew, the priest's personal attendant, who is a large, silent man.\n* Emmott Baxter, elder son of the deceased.\n* Dr. Douglas Walters, the family physician.\n* Silas Patterson, anthropologist and member of the Tuesday Night Academy.\n* Judge Braddock, executor of the estate.\n* Angela, the housekeeper.\n* Alvin Beswick, undertaker and hearse driver.")
                                      )
                                    ),
                                    Core.vx_new_string("Legacy of Phillip Baxter"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Legacy of Phillip Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Angela receives the property\n* Half of his cash goes to the Tuesday Night Academy\n* The remaining half goes to his three children Emmott, Colin,\nand Cynthia. Cynthia's portion to be donated to the Catholic Widow's Relief Fund as\nshe requested.\n* At this, Emmott accuses Silas Patterson and his Tuesday Night\nAcademy of wasting all his father's money in life and now in death.\n* Finally, a packet of papers is given to the investigators according to the will.\nThis packet contains Phillip's dream journal and an short note about why he thought\nthe investigators might be interested.")
                                      )
                                    ),
                                    Core.vx_new_string("Dream Journal of Phillip Baxter"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dream Journal of Phillip Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The enclosed note describes that his dreams had become more vivid and\nrecurring recently and that he felt that he needed to write them down and give\nthem to someone who might find the account scientifically interesting.\n* He had traveled to Ultar and visited the library there. In the library, he\nfound the book, the [Cthaat Aquadingen] which gave important insight into his\ncurrent research. As Phillip left the library, he saw an evil-looking dwarf\nthat he had seen in a carnival he passed on the way into the city. The dwarf\nwas discretely following him. Phillip managed to shake him before he woke up.\n* Anyone experienced in the Dreamlands will recognize the entrance to the\nDreamlands and Ultar.")
                                      )
                                    ),
                                    Core.vx_new_string("Home of Phillip Baxter"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Home of Phillip Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Angela Vincenzo, the former housekeeper is now the only resident in the roomy\nthree bedroom home.\n* The study contains various paperwork including:\n** A letter from Phillip's daughter Cynthia describing that her supposed kidnapping\nby natives was not as serious as he was led to believe and that she is perfectly\nfine. She has sent a box of coconuts as a present.\n** Notes on the Tuesday Night Academy's purchase of a large telescope and their\nsearch for a 'Dark Star' called Nemesis.\n** An anthropology book authored by Silas Patterson with marked section describing\nsoutheast Indian tribes displaying remnants of ritual cannibalism. Most are symbolic\nacts upon the death of a family member or friend, but on occasion the ritual is\nactually performed using a monkey or ape substitued for a human. Of particular\ninterest is a brain eating custom where the brain is exposed and eaten directly from\nthe skull while still warm. An elderly native said that he had seen apes killing\nsmaller monkeys and eating their brains in similar manner.\n** A diary including comments about:\n*** His brother Julian sudden sickness and retirement after returning from the\nAndaman Islands.\n*** Julian's subsequent suicide attempt\n*** Cynthia's trip to the Andaman Islands and subsequent abduction by savages.\n*** Her later release\n*** Arguments with his sons over favoritism\n*** His recent series of nightmares\n*** His therapy with Julian over his nightmares and the drug Julian prepared to help\nhim sleep.\n*** The ultra-realistic new dreams after the drug put him into an especially deep\nsleep.\n*** Julian's refusal to provide more of the drug.\n*** Phillip's break-in of Julian's house and the successful theft of the drug.\n* The basement contains an unopened crate of coconuts with a small hole chewed\nthrough the side.\n* The attic contains a formerly extinct prehistoric spider that was in the crate of\ncoconuts. It had bitten Phillip in his sleep and put him into a deep coma that was\nmistaken for death. The spider venom causes unconsciousness in 10 minutes, but the\nvictim will revive on its own within two days.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Search for the Seed"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Search for the Seed"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("The Garrison Observatory"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Garrison Observatory"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Tuesday Night Academy has spent a large sum of money to erect an\nobservatory in Garrison Montana. They experiment with prisms to try to\ndetect the dark star that their research claims has had a sweeping effect\non history.\n* The Observatory is deep in the woods and is only accessible on\nhorseback.")
                                      )
                                    ),
                                    Core.vx_new_string("The Defenders of the Seed"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Defenders of the Seed"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Seed - A Seed of Azathoth has been hurtling through space for\ncenturies and has finally been drawn to Earth. As it approached, the\nspecial prisms in the telescope attracted it like sunlight off a mirror.\nThe Seed swept across the sky and crashed in the woods. Its strange\ngreen fire trail attracted the attention of many including those at\nthe observatory and a group of local hunters.\n* Sasquatch - When the hunters found and examined the asteroid, they were\nexposed to the horrific radiations of the Seed. Those that survived,\nregressed to a primitive state. They are terrified by the Seed, but are\ncompulsively drawn to it. They have buried the Seed in an alcove of the\ncave in which they live. The Seed is slowly killing them, and as they\ndie, they dissolve into a primordial soup before actually dying.\n* Sylvian Englund - Sylvia is a pleasant woman in her late sixties who\nlives off the land in the woods since the death of her husband. She has\nrecently discovered the regressed hunters and believes that they are\nSasquatch. She has been feeding them and has gained their trust. She\nenjoys her discovery and does not want outsiders to ruin her\nfriendship with the sasquatch.")
                                      )
                                    ),
                                    Core.vx_new_string("The Race for the Seed"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Race for the Seed"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Fungi From Yuggoth - A team of four Mi-go have observed the Seed's\nlanding from their underground outpost on the Moon. Their goal is to\nretrieve the Seed to use as an magical energy source. Interesting humans\ncaptured along the way are to be de-brained and the brains carried back in\ncylinders for questioning later.\n* They each carry a machine that looks like a silver whorl. It fires a\nbeam of deadly radiance that eats blackening holes in whatever it touches.\nAny damage prevented by armor is instead applied against the armor itself.\nThe weapons have 37 charges and may not be recharged. The weapons have no\nrange limitations and are excellent sniper weapons.\n* Their first target is the firetower where they slay Ranger Marshall and\nuse the tower as a base of operations.\n* The next day they spray a nervous tissue solvent in the direct vicinity\nof the firetower to prevent intrusions. The spray forms a low fog that\nshort circuits animal nervous systems driving them mad. A Grizzley Bear\nand Jules, Sylvia Englund's dog, are the first victims of the gas. Both\nroam the countryside acting randomly.\n* Later the same day, the Fungi search the observatory, leaving many\ntell-tale signs.\n* The next day, they capture Sylvia Englund near her ranch. They de-brain\nher and hide the body in the house.\n* Toward the end of the day, they move on the Seed. They make quick work\nof the hunters defending it. They carefully put the seed in a shielded\ncontainer and fly it to the firetower. They gather their belongings,\nincluding the Seed and any captured brains, drop a bomb on the firetower\nto destroy any evidence, and fly back to the Moon.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Death in St. Augustine"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death in St. Augustine"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Investigating Colin Baxter"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Investigating Colin Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Colin Baxter, Phillip's youngest child, is due a healthy piece of\nPhillip's estate, but he must be located first. His last known location\nwas St. Augstine, Florida. Judge Braddock is concerned with the series of\nbizarre occurences and hires the investigators to track Colin down and\ncheck on his safety.\n* St. Augustine is a city in northeast Florida and the oldest continuously\noccupied European-established settlement in the continental United States.\n* Colin is indeed still here, but he has fallen on hard times and turned\nto alcohol. He can be found in a local speakeasy hidden behind a\ngrocery store.\n* Harry Spitz - The grocery store/speakeasy is owned by Harry Spitz who\nruns the bar. He pays protection money to the police and is in no danger\nof police action.\n* Billy Wolff - Billy is a close friend of Colin's and will steadfastly\ndefend his buddy in all circumstances, especially when drinking.\n* Esmerelda - Esmerelda is a Cuban born, hot-headed friend of Colin's.\nShe is an illegal immigrant and will not reveal her last name under any\ncircumstances to, somehow, protect her family.")
                                      )
                                    ),
                                    Core.vx_new_string("Colin's Treasure"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Colin's Treasure"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Colin has a history of get rich quick schemes and his current one is to\nfind a fortune in sunken treasure. Unfortunately, his business partner\nran away taking their remaining cash and Colin's girlfriend with him.\nSince then, Colin has been drinking his troubles away.\n* The inheritance money helps, but Colin is still short $2,000. He will\noffer the characters 50% of the profits if they chip in the money.\n* He believes that the wreck of the treasure galleon, La Rosaria can be\nfound off Bimini. He claims to have an accurate map to the location. His\nmap is hand copied from an original kept in the library of the 200 year\nold Spanish church.\n* Father Garcia - At the church they meet Father Garcia who is a friend of\nEsmerelda. Father Garcia is friendly but guarded. With the help of\nEsmerelda he admits that he fears that someone is watching him. He also\nadmits to seeing figures moving in the dark on the church grounds, though\nhe feels he must be imagining things. After gaining his trust, Father\nGarcia shares the church library. Though Colin's research is shoddy,\nfuther research supports his findings that the map is an authentic map of\nthe location of	the La Rosaria.")
                                      )
                                    ),
                                    Core.vx_new_string("Colin's Wreck"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Colin's Wreck"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Palencia - Colin invites the party aboard the old steamer he has\nbought and retrofitted for large scale salvage. The crew is mostly Cubans\nand blacks. As they depart, someone spots a reflection from the coast.\nUsing binoculars, they see someone observing them back with binoculars\nbefore the person ducks away.\n* The Voyage - The map shows a location off Bimini, 300 miles south of St.\nAugustine. The voyage takes less than 24 hours on calm seas.\n* Diving - The diving pumps have enough pressure for no more than 2 divers\nat once. Wolff operates the pumps. Colin would prefer to dive with a\npartner and asks for volunteers. The divers reach the bottom in 2 minutes\nand tug twice on the line to indicate they are at bottom. The water is\nparticularly clear and well illuminated by sunlight. Only 20 minutes later\nthey spot the wreck and tug twice again. The divers return to the surface\nand describe that the wreck is in only 50 feet of water but is stuck on a\nreef hanging over a sharp drop off on one side.\n* Coral Outcropping - A protruding coral outcropping has pierced the hold\nof the hull. Anyone exploring this area will be the victim of a single\nsudden attack by the [Moray Eel] that makes its home here. The attack is\nnot life threatening, but if the person bleeds the divers will have to\nreturn to the surface for fear of attracting sharks.\n* The Drop Off - Anyone foolish enough to explore the deck near the\ndrop off, suddenly causes a section of the hull to break off and fall into\nthe drop off. The falling diver can attempt to jump free, failing that he\ncan scramble to grab the coral reef as he falls, otherwise he slowly falls\n30 feet before the coral cuts his air hose and he drowns. The boat pulls\nhim up, but it will be too late to save him unless he is extremely\naccomplished at holding his breath.\n* Captain's Cabin - Colin is most interested in the Captain's cabin where\nhe finds a heavy lock box which needs to be winched to the surface. In it\nthere can be found 22 forty pound silver bars worth $10000 total and a\nstrange, large necklace. The necklace is carved with strange figures of\nanimalistic humans celebrating a great comet with a tail that goes on\nforever. After a few days investigation, it is clear that the wreck does\nnot contain the riches that Colin hoped for. Colin will be left deeply in\ndebt. However, any characters who invested will double their investment.")
                                      )
                                    ),
                                    Core.vx_new_string("Colin's Ruins"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Colin's Ruins"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Ruins - Colin desperately hopes that the treasure fell from the\nwreck before it landed at the bottom and begins retracing the ship's path.\nAbout a 300 yards away, he discovers what probably sank the La Rosaia: a\nsunken ruin whose stone ceiling lies just below the water line. No\ntreasure is found, but Colin is desperate to find anything of value, so he\nmoves to explore the Ruins.\n* Temple - The ruin is a stone temple in a bowl shaped depression with curved\nsteps going down 20 feet before entering an archway. The temple itself is only\n30 feet across and has many crabs and octopi. The walls are covered by mosaic\ntile that depicts people suffering during multiple terrible disasters. Above\neach disaster are tiles depicting an orb with a shining light nearby.\n* The Pit - In the center of the temple is a dark pit of indeterminate depth.\nBefore the pit is a metal orb on a stone slab. The orb has a metal rod\nprojecting from one side at the end of which is a shiny topaz. The rod can\norbit the orb and telescope in or out, but its current position is very close\nto the orb. A mechanism inside the orb operates the rod and is apparently\nstill active. The pit reaches about 100 feet before a rock cave-in blocks the\nway. Within the pit is a single, strange dolphin.\n* The Dolphin - If multiple lights are shined down the pit, a motionless\ndolphin can be seen. Suddenly, the normally peaceful dolphin swims up and\nattempts to ram people with incredible force. It will continue attacking\nunless the invaders leave or it is killed.")
                                      )
                                    ),
                                    Core.vx_new_string("Death of the Father"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Death of the Father"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Homecoming - As the Palencia arrives at port, police can be seen on the\ndocks. When the Palencia docks, officers rush on board and arrest Colin and\nWolff for the murder of Father Garcia.\n* Murder - Father Garcia was murdered the same day that Colin and the\ninvestigators went to the library. Witnesses say that Colin and Wolff\nreturned drunk later that night and ransacked the library. That morning the\npriest was found in the church with his skull crushed. The reality is that\nthe ghoul cult has been robbing graves for years. Father Garcia has been\nnoticing activity in the night and has been hiding in the church at night to\ntry to catch someone in the act. Unfortunately, he found the graverobbers and\nconfronted them. They immediately killed him and called the Detective to\ncover up the murder. What the killers did not realize was that Esmerelda was\ncoming home from the speakeasy when she heard a commotion from the church.\nShe rushed over and observed the killers discussing what to do with the\nFather's body.\n* Detective Morris Packard - The detective is the head of the police force\nwhile the chief is on extended medical leave. He is also a member of a secret\ndeath cult that worships ghouls. His cult was graverobbing for their riturals\nwhen the Father caught them and he was dispensed with. Colin's drinking made\nhim a convenient scapegoat, so the Detective is constructing circumstantial\nevidence to arrest Colin. Later he will arrange for Colin to hang himself in\njail. If the investigators get too close to the cult, he will arrange an\nambush to eliminate them.\n* Esmerelda - Esmerelda is conspicuously missing. After witnessing the murder\nscene, she packed her things and fled to her parents house in Clearwater.\nShe fears for her safety and doesn't want to get involved, but when she\niscovers that Colin has been frames, she writes a letter with what she saw to\nthe investigators and Colin.\n* Crime Scene - Trampled in the dirt can be found a pin from the local\nalligator farm that was dropped in the scuffle.\n* St. Augustine Library - The local library carries copies of newspapers.\nSeveral stories can be found in the Jacksonville Sentinel that may be\nrelevant. Older material is harder to discover.\n** 1571 - A yellowed document in Spanish written by Father Rolando Tortulla\nof Toledo Spain. The document reports to the King, the state of the French\nheretics held prisoner in vaults below the monastery. They are wild and\ndegenerate and are guilty of cannibalism. They will be held until they die.\n** 1641 - A yellowed document in Spanish describes the construction of the\nCastillo de San Marcos that incorporates the catacombs of the old monastery.\nA violent french prisoner was transferred to a new cell.\n** 1662 - A yellowed document in Spanish describes the horrid state of the\nFrench prisoner. His toes are missing and he limps around his cell scratching\non the walls saying only gibberish. He will be held until he perishes.\n** 1682 - A yellowed document in Spanish describes the escape of the french\nprisoner. Stones were removed from the wall of the cell and the prisoner\nfled into a tiny tunnel behind the wall. After a brief attempt to locate him,\nthe tunnel was filled, sealing the fate of the horrible prisoner. Drawings\nwere scratched into the ceiling showing comets and fire raining from the sky.\n** 1792 - A religious paphlet describes an ancient evil unloosed by Satan.\nThey are inhuman but walk among us like men. Many officials of the city, both\npast and present, belong to this secret, godless faith.\n** February 1890 - A freshly buried body was stolen from a cemetary south of\nSt. Augustine. No suspects were found.\n** May 1927 - Grisly Find at Alligator Farm. Eli Simpson, an employee of the\nfarm, saw a shoe in the large crocodile pool which turned out to also contain\na severed human foot. No identification was found, and police theorize that\na vagrant snuck onto the farm and fell into the pool. No charges were filed.\n** October 1920 - A recently buried body of an indigent was stolen from the\nold St. Augustine church graveyard. No motive or suspects were found.\n* St. Augustine Herald - The local paper is a weekly that promotes local\nbusinesses and tourist trade. The editor/owner is Fred Boswell who bought the\npaper 3 years ago. Strangely, the original owners destroyed all their files\nbefore they left.\n* Jacksonville Sentinel - Sold next to the Herald is a real paper published\nin Jacksonville, a 2 hour drive up the coast.")
                                      )
                                    ),
                                    Core.vx_new_string("Korsky's Alligator Farm"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Korsky's Alligator Farm"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Eli Simpson - Eli found the severed foot and was subsequently fired by\nMaynard Korsky for alerting the police before discussing it with him first.\nIt was not the only time he found strange meat in the pens, but it was the\nonly thing he could clearly identify.\n* Maynard Korsky, Dell Korsky, and Kenny Durham run the farm. They use the\ngators to destroy the leftovers of the cult, but do not do any other cult\nbusiness at the farm.\n* The Farm - If the investigators investigate the farm during the day, the\nKorskys and Kenny Durham are no help and the cult is alerted to their\ninvestigation. If they investigate at night, the farm is not guarded, but\nthe gators have destroyed any evidence that might have been found.")
                                      )
                                    ),
                                    Core.vx_new_string("Castillo de San Marcos"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Castillo de San Marcos"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A monumental castle started in 1638 and took over a century to complete.\nThe upper levels are open to the public, but the lower levels are considered\nhazardous and are sealed off with packlocked plywood doors. It is easy enough\nto pry the plywood loose but not without leaving evidence of tampering. The\ncells of the degenerate prisoners are easy to locate. The walls and ceiling\nare covered with scratchings of spiders and comets and skulls. In the final\ncell, a stone can be removed revealing a low tunnel sloping downard. Crawling\non hands and knees for fifty yards reveals a hallway from the original\nFranciscan monastery that predated the fort. The hall leads to a small room\nwith two chairs and black robes hanging from pegs. The room is the same as\nthe one depicted in the films from Thornton's Camera Shop.")
                                      )
                                    ),
                                    Core.vx_new_string("Thornton Camera Store"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Thornton Camera Store"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The camera store has a view of the castle. William Thornton works here all\nday selling cameras, lens, and film. There is also a darkroom where he\ndevelops photos.\n* If the investigators break in they can find some smuggled Cuban ponography\nand three recent silent films in a locked box.\n* The Films - Each film is roughly the same depicting a dead body in a chair\nin a small stone room surrounded by hooded figures. A veiled female figure\nlimps over and begins a ritual. The body seems to gain some semblence of life\nand then the figures leap upon the body and begin eating it at which point\nthe film ends.\n* If confronted with the films, Thornton claims he received them by accident\nalong with the Cuban films and that they are obviously some kind of homemade\nhoax.")
                                      )
                                    ),
                                    Core.vx_new_string("Thornton House"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Thornton House"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Mother Thornton - Mother Thornton is the matriarch of the death cult and has\nnearly completely transformed into a ghoul. She never goes out in public and\nwears a veiled hat even in private.\n* William will normally be at home after 5pm. During the day, the front door is\nnot locked. If Mother Thornton hears intruders, she will stay in her room\npretending to be sleeping in a chair. If she is exposed, she throws off the veil\nand tries to escape the house. She will leap out the second story window lope\ndown the street scattering the citizenry. Any disturbance here will have the\npolice arrive in five minutes where they will arrest anyone in the Thornton\nhome for the murder of Mother Thornton. Even if she is killed the story will be\nthat they killed a deformed and crippled old woman.\n* Gray Binding - Among her possessions is a book that teaches the Gray Binding\nspell that animates a corpse into a mindless zombie.")
                                      )
                                    ),
                                    Core.vx_new_string("St. Augustine Ambush"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("St. Augustine Ambush"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Note - If the investigators are discovered, Detective Packard will\narrange a deadly ambush for them. He will kidnap Eli Simpson, Esmerelda, or\nanyone else who they think can lure the investigators. The victim leaves a\nnote to the investigators that they have new information and to meet at the\nchurch graveyard and night.\n* The Churchyard - The gator farm truck is hidden to the north of the\nchurch, and the Maynards and Packard wait in ambush with pistols and\nblackjacks behind tombstones. At the center of the graveyard, the contact\nsits on a tombstone under the moonlight. Unfortunately, the victim is already\ndead and is merely propped up. The ambushers try to take the investigators\nalive, but will open fire if they have no other choice.\n* The Ritual - If the investigators are captured, they are taken to the ritual\nchamber where one of them is eaten alive while the others watch. Before the\ngrisley feast is complete, a number of ghouls come down the tunnel and tear\nthe cultists apart. The ghouls drag away the dead and ignore the living\ninvestigators.")
                                      )
                                    ),
                                    Core.vx_new_string("Exposing the Cult"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Exposing the Cult"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Exposing the Cult - Since Detective Packard is a cultist, any involvement\nwith local police will get the investigators in trouble. If they can bring\nhard evidence to the Florida State Police, who will move in and clean up the\nmess, though they will cover up the messier parts to maintain their vital\ntourist trade.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Investigating the Andamans"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Investigating the Andamans"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Trip to the Adamans"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trip to the Adamans"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Andaman Islands are a narrow chain of islands 590 miles southeast of India.\n* Weather - The temperature is mild and ranges from 64F to 92F. Except for October\nand March, the islands are hit by daily monsoons.\n* Wildlife - There are no large predatory animals, just all manner of bats, rats,\nspiders, turtles, wild pigs, and native cats.\n* Population - The natives are primitive Negritoes, belived to have lived here since\nthe Pleistocene era. Uniquely among modern man, they have no knowledge of fire\nbuilding and must continually keep a fire burning. They are divided into 12 tribes\nwith different dialects of the same language. They have a long reputation as\nviscious killers and cannibals. For centuries, shipwrecked sailors had been\nsystematically slain (but not eaten). Over time, the islands have become safe to\noutsiders except in remote areas.\n* Port Blair - The British established a penal colony on the islands where convicts\nare forced to live and work. The colonly is a primitive jungle colony with a dock,\ngeneral store, a wireless, and faily complete medical facilities. Port Blair is also\nthe only deep water anchorage on the islands, so all ships must dock here.\n* Major Ashley Nichols - Major Nichols is the commissioner of the Andamans. He\noversees the trade of exotic lumber, coffee, cocoa, tea, and coconuts. He also\ncommands a small battalion of Indian solders. Nichols is happy to meet civilized\nwesterners and will places his services and those of the British Government at their\ndisposal.\n* Arrival - The Andamans are 10,000 miles from America. If the investigators use\nColin's ship, the trip takes 3-4 weeks. If they book other passage, they will have\nto travel to Calcutta first.\n* Office Records - Major Nichols has nothing to hide and allows full access to the\noffice records where a report of Cynthia Baxter's abduction can be found. In the\nnarrative, it is found that although the abductors initially tried to take her by\nforce, that after a short conversatiion, she agreed to go with them and was returned\nsafely the next day. Major Nichols has only met Cynthia twice, since she rarely\ncomes to Port Blair.")
                                      )
                                    ),
                                    Core.vx_new_string("Trek across the Adamans"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trek across the Adamans"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Guides - If they request, Major Nichols will provide two Indian guides to lead\nthem to Cynthia's clinic 45 miles away. However, he does warn that the two are\ncriminals, working off their crimes. Worse, there are 2 escaped criminals\nknown to be in the area. They are desperate killers and could be extremely\ndangerous.\n* Sikander - A Hindu in his mid-thirties with a wife and three children on the\nisland. He stole a horse and has served eight years so far but is mostly\ntrustworthy. He will, however, steal a weapon for protecting his family if he\ngets the chance. If successful, he will hide the weapon in the jungle for future\nretrieval.\n* Mahbub - A Moslem from Delhi who has served twenty years so far for murder. He\nspeaks little English and is neither garrulous nor energetic.\n* The Jungle - The trip to Cynthia's clinic starts on timber roads, then\nfootpaths, but before the first day is over they are struggling through thick\ngrowths and shallow swamps with no path. The trip takes three days or more, and\nthe guides prove able servants, doing all the work of setting up camp, building\na fire, and preparing meals.\n* The Villiage - A loud buzzing noise emanates from a clearing ahead with a tiny,\nabandoned villiage. The buzzing comes from a tree with a crude platform 25 feet\nup. Atop the platform is a rotted human form covered in a mass of undulating\ninsects that are devouring it. Although the Andamanese normally bury their dead,\nif a particularly revered chief dies, he is bundled in a tree and the clan abandons\ntheir villiage for three months in reverence. If the body is disturbed, the Jarawan\nhunters will track the intruders and attempt to kill them for their blasphemy.\n* The Mission - Cynthia has a small wooden building that serves as her clinic\nsurrounded by the huts of 20 Andamanese. Nearly a mile from the beach can be seen\na 6 mile island covered with dense jungle. If local tribesman believe the island is\nevil, and only Cynthia has returned alive from it. The inhabitants of the island\nrarely leave, and when they do it is only to kidnap and kill.\n* Cynthia Baxter - Cynthia is a large woman, big-boned and slightly overweight. She\nis very near-sighted, and her voice is high pitched and squeaky. Cynthia will act\nhospitable to strangers, but she is highly suspiscious of those who would appear\nat this critical moment in her life. She lost her mother at 8 year old. She nearly\ndied from a spider bite and 12 and began thinking of becoming a catholic nun.\nInstead, with the encouragement of Uncle Julian, she studied medicine in college.\nJulian helped her get through medical school, and she is deeply grateful to him. To\nimpress Julian, she became a medical missionary and travelled to the Adamans in\n1913. In 1918, she was kidnapped by the Tcho-Tchos from the small island across the\nstrait. The Tcho-Tcho priest saw the mark of the spider on her, and trained her in\nthe nature of Atlach-Nacha, their horrible spider god. Cynthia never had a strong\npersonality and was easily brainwashed and converted to the terrible worship. The\npriest has convinced her that she has a special detiny (which is horribly true),\nand now only Julian might be able to turn her from her path.\n* Cynthia's Journal - In her hut is a journal that describes her facination with the\nteachings of the Tcho-Tcho priest and her belief that a new sun shall appear in the\nsky. The journal describes the arrival of Silas Patterson and his interest in the\nTcho-Tcho rituals. She also writes of her mixed feeling about sending the 'present'\nto her father, but the priest insists that he cannot be allowed to interfere.")
                                      )
                                    ),
                                    Core.vx_new_string("Tcho Tcho Island"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Tcho Tcho Island"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Kidnapping - The arrival of strangers, convinces the priest that the moment has\ncome. He sends men in the night to meet with Cynthia, and she eagarly goes with\nthem. The local Adamanese raise an alarm and many flickering torch lights can\nbe seen from the island.\n* Tcho Tcho Tribesman - The Tcho Tcho are more asian in appearance than the average\nAdaman. They are all violent fanatics and will hunt down and capture anyone who\ninvades their island. There are 10 males, 6 females, and 3 children on the\nisland.\n* Tcho Tcho Priest - The Tcho Tcho priest leads his tribe. He is a long time\nexplorer in the Dreamlands and there he has the form of a twisted dwarf (reflecting\nhis personality). In combat, the priest stands back and casts spells (Dread\nCurse of Azathoth and Withered Limb) while his comrades fight and die.\n* Fossil Quarry - An exposed rock in the jungle is covered with fossils of\nprehistoric arthopods including millipedes, scorpions, and spiders. This rock is\nthe source of the spider from the Baxter home, brought to life by the Child of\nAtlach-Nacha spell cast by the Tcho Tcho priest. A single enormous spider\nsix-feet across can be found here, and the priest will animate this spider if\nhe gets the chance. Note: Any damaged fossil cannot be reanimated.\n* Obelisk - In a clearing near the villiage rises a black stone, twenty foot\nmonolith. Though weathered by time, precise geometric designs are clearly\nvisible. These designs are are disturbing to the eye and create a sense of\nvertigo. Out of the corner of one's eye, they seem to swirl and pulse. If one\nlistens to the stone an almost impercetible rhythmic throbbing can be heard.\nCrude stones are set up around the obelisk covered in primitive drawings of\nspiders chasing and consuming tiny humans as shooting stars fall from the\nheavens.\n* Metamorphosis - On the night Cynthia is 'kidnapped', she goes directly to\nthe Obelisk. There the tribesmen have gathered to begin the ceremony. Near the\nObelisk are bound the 2 escaped killers that Major Nichols warned of as well\nas any other captured males. Cynthia stands before the altar, removes her\nclothes and sways to the Tcho Tcho songs. Eventually, she stops, bends over,\nand the skin along her back splits wide open, revealing a shiny black surface\nthat pulses horribly. As the wrinkling empty skin of Cynthia Baxter is pushed\nforward, multple legs spill out from the discarded molt, waving feebly, as the\nhuge spider-thing pushes clear. The priest dones Cynthia's discarded skin and\nwears it like a coat.\n* The Wedding Feast - Cynthia's new form is not hard enough to move freely\nuntil dawn. In the meantime, she is ceremonially wedded to the male sacrifices\nbefore she drags herself to each one and begins eating the flesh from the\nvictims head. She finally sucks the brains out through the eyesockets. Each\nfeast takes 20 minutes, and after each is consumed, the still animate corpses\nwith exposed skulls are freed and shamble mindlessly off into the forest. The\nOnge people sense the threat of the Tcho Tcho and attack the Tcho Tcho. The\nTcho Tcho defend Cynthia and the priest as they escape. The Onge will not\npursue the Tcho Tcho into jungle at night. Instead the free any remaining\nprisoners and wait for light. The priest makes his way to the prehistoric rock\nand casts Child of Atlach-Nacha to animate the giant spider there.\n* Daughter of Atlach-Nacha - At dawn, Cynthia is fully formed and begins a\n3 hour trek across the island to the Caverns of Atlach-Nacha. She is\naccompanied by hordes of spiders that crawl around and over her. Any who\nfollow will constantly be treading on spiders and have spiders dropping upon\nthem from the trees. Their bites are painful but are not dangerous.\n* Caverns of Atlach-Nacha - Cynthia travels to a 20 foot cave opening where\nher father dwells. If she is pursued, she will wait in ambush for her pursuers.\nIf the investigators are foolish enough to continue searching, they will\ntravel through twisting caverns deeper and deeper for over an hour before the\ncave opens into a vast chasm nearly filled with thick, ropy webs. Continued\nactivity attracts [Atlach-Nacha] himself who resembles a hideous, black, hairy\nspider with a strange, remotely human-like face with little red, hair-rimmed\neyes.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Ulthar and Beyond"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ulthar and Beyond"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Exploring Ultar"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Exploring Ultar"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Phillip Baxter's dream journal leads the investigators to start exploring\n[Ulthar] in the Dreamlands.\n* Phillip's Dreamform - At some point someone will notice that Phillip Baxter\nis watching them from a distance. If anyone approaches, his head disappears\nin a cloud of mist and then he vanishes.\n* Procession of Burgomaster Kranon - Trumpets announce a parade throught the\nstreets for Burgomaster Kranon. The Burgomaster is immediately recognizable\nas Matthew, Julian Baxter's ward. In the Dreamlands, his emotional and mental\nhandicaps don't exist. If the investigators can get an audience, Krannon can\nbe convinced to help them, both here and in the real world.\n* Cthaat Aquadingen - At the [Library at Ultar], the investigators can\nsearch for the [Cthaat Aquadingen]. The book is bound in soft, human skin,\nstill pliable, and always moist from perspiration welling from its pores.\nSimply handling the book is creepy. Within the book can be found a quote:\nThe stars fall, the beast bred of stone rampages, and a time of great change\ncomes. Deep within perfumed Kled, where life turns to death, the Watcher in\nthe Glade knows the time and place of the coming. Chinese notes are written\nin the margin of the page. If they are translated, they comment that the\nPnankotic Manuscripts mentions the Watcher in the Glade.\n* Pnakotic Manuscripts - If read, the manuscripts describe that the Watcher\nin the Glade is the Great Old One Yibb-Tstil. Priests of Yibb-Tstil meet at\nthe great pool in front of the ivory palace. Priests then grovel on hands and\nknees before Yibb-Tstil and must not look upon him.\npriests of\n* Carnival - While leaving Ultar, the dreamers chance upon a carnival tent. A\nbarker announces that they have the only captive Colossal purple spider from\nthe distant north. Admission is a dime or anything of value. The interior of\nthe tent is larger than the outside would suggest, and in a barred cage at\nthe back of the tent is a purple spider the size of a car hovering over the\ndessicated body of a sheep. If anyone tries to talk to the spider, it speaks\nin a thin, dry voice. It is, however, not helpful and eventually hisses. The\nbarker comes running in and ushers them out. If they want to speak more, the\nbarker says: 'It is not up to me you see'. The spider then says: 'After all, I\nam the master here.' If the barker is questioned about the dwarf who works\nhere, he tells them the dwarf quit some time ago and headed to Kled.")
                                      )
                                    ),
                                    Core.vx_new_string("Journey to Kled"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Journey to Kled"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The perfumed Jungle of Kled can be reached by traveling North from the\nEnchanted Wood to Thran. At Thran a elephant caravan can be taken over land or\na river boat can be taken to Hlanith where passage on a ship can be found to\nKled.\n* Numerous ivory palaces dot the jungles. If the dreamers ask about the great\npool mentioned in the Pnakotic Manuscripts, the guides recognize it as the\nPalace of the Sacred Fount.\n* Palace of the Sacred Fount - The palaces is one of the less feared locations,\nthough it is still avoided. As with other ivory palaces in Kled, the palace\nis somehow physically in perfect condition though the rooms are empty and the\nfloors are thick with dirt and leaves. The smell in the area is a unique musky\nodor that immediately reminds the dreamers of the smell during the dream of\nthe death of Phillip Baxter. The front hallway is an atrium where rain water\nfalls to collect in a rectangular pool. At the far end of the pool stands a\nhuge jade statue of an evil-looking hyena. The statue leers with gaping jaws\nover the pool. The apparently bottomless pool is dark and filthly from rotting\nleaves, a peculiar oily film covers its surface. Despite its appearance the\npool is not dangerous.\n* Phillip's Ghost - A distant cackling sound can be heard. Following the\nsound, the dreamers find a stairway going down many flights with torchlight\nbelow. At the bottom of the stairs, the dreamers find a torchlit hallway with\na cell at the end. Within a cackling dwarf uses a human femur to visciously\nbeat a glowing, partially headless, staggering figure. The dwarf is hunched\nand misshapen and has a terrible, inhuman face. Its lips are drawn into a\nsnarl over three-inch fangs. Its eyes are glowing red pits. The figure is\nthe dreamform of Phillip Baxter. If he is rescued, his headless form is\nmindless and helpless. The dwarf with not help under any circumstances.\n* Path to Yib-Tstll - Behind the Palace the jungle becomes stunted and\ntwisted, tree trunks are bent at odd angles, and a general sense of\ndisease pervades the growth. Futher on, alien foliage begins to appear\nincluding quivering fungi and twisting weird ferns. Further still, a\ngreat stone arch can be seen surrounded by dead trees. Through the arch\ncan be seen another alien jungle evidently on a far-off world. The arch\nis clearly a permanent gate, and plants and insects can be seen crossing\nboth ways as if the arch were simple stone.\n* World of Yib-Tstll - Beyond the arch, the sky is dark green and\nstarless. Swollen insects swoop ominously from deadly-looking blooms.\nFlying horrors with veinous wings fly high above. Not far away, a vast,\nblack clearing is visible.\n* The Clearing - The clearing is roughly a mile across. The black surface\nis composed of fine flakes like snow, but it is warm to the touch. If the\ndreamers heed the Pnakotic Manuscripts, they should crawl on hands and\nknees across the black clearing facing the ground to avoid actually seeing\nYibb-Tstll. As the dreamers near the center, Yib-Tstll rises suddenly\nfrom the black clearing. Dreamers may attempt to avert their gaze or\nsuffer the madness induced by his presence.\n* [Yibb-Tstll] - The massive being speaks telepathically with a booming\nalien voice. Each dreamer must make a [Spirit] test or Yibb-Tstll will\nignore that person completely. If the test is completely failed,\nYibb-Tstll will touch the person and impart its feared reversal.\nYibb-Tstll is suprisingly helpful and will answer questions about the\nCthulhu Mythos and things of cosmic import including Nemesis, but he will\nonly give a single answer on a subject and will not clarify himself.\n* Reversals - Any dreamer who suffers a reversal will instantly be\ndriven insane or his human form or dream form will be permanently killed.\nIf an insane dreamer is brought to him, Yibb-Tstll will fully restore\nhis sanity. If the dwarf is present, Yibb-Tstll will reverse him, and his\ndream form will change into the Tcho-Tcho priest while his real form will\nbecome the dwarf. If the headless form and the ghoul's page are brought\nbefore him, he touches them both and Phillip Baxter's dream fomr is\nrestored, but back in the real world, Silas Patterson has become a mad\nimitation of Phillip Baxter.\n* Web of Eibon - Yibb-Tstll instructed Eibon in his construction of the\nWeb of Eibon spell with which he planned to freeze time around Nemesis\n(and Earth) to prevent Earth's destruction. Yibb-Tstll knows his efforts\nwill fail in the end, but it provided the instructions anyway.")
                                      )
                                    ),
                                    Core.vx_new_string("The Quest of Ghouls"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Quest of Ghouls"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Ghoul Dream - After the events at St. Augustine and the Dreamlands, one\nnight the investigators find themselves having hazy dreams of the\ngraveyard at St. Augustine. Suddenly, the dream sharpens and 3 figures\nstart crawling from an open grave: ghouls like the ones that may have\nbeen seen at St. Augustine. The ghouls stinking breath reeks of death and\ndecay. The ghouls do not appear to be hostile, instead they start urging\nthe investigators to come with them to see the wise man and there is\nlittle time left before dawn. A terrific stench issues from the open\ngrave. Below rotten bits of wood and fabric lie on the grave floor and a\nnarrow, twisting tunnel leads into darkness. The ghouls gibber that they\nmust hurry and start climbing down the hole. If the dreamers don't follow\nthe tunnel begins to slowly close. If the dreamers still do not follow,\nthey awake normally, but the opportunity to learn more has been lost. If\nthey do follow, the tunnel collapses behind them and they will have to\nfollow the ghouls forward.\n* Grath the Leader - Young and handsome by ghoul standards, Grath leads\nthe group and most often speaks with the dreamers. He had a riding zebra,\nbut the group got hungry and ate most of it.\n* Mairpl the Big - Mairpl is much larger than the others, speaks little,\nand wields a club in battle.\n* Ug the Hungry - The worst and most degenerate of them, Ug speak no\nhuman language and spends most of his time on four legs. He avoids the\nhumans, but can often be seen staring and drooling over them. He possess\nno threat, but he likes to fantasize.\n* The Page - At the end of the tunnel waits the Page. The Page is wrapped\nin a dirty brown cloak with his face hidden. His body is bent forward\nand staggers under the weight of an enormous tombstone chained to his\nback. The ghouls order the Page around and play viscious practical jokes\non him. Below the hood can be found Sila Patterson's face, though it\nshows no recognition. Upon the tombstone is written 'Phillip A. Baxter\n1865-1925.' The Page is, of course, the dream form of Silas Patterson,\nsuffering from the guilt of the death of his friend.\n* The Quest - The ghoul gang seeks to rescue a female ghoul Horella who\nhas disappeared. The ghouls are fairly melodramatic about how beautiful\nshe is and how they must rescue her from whatever peril she is in. To\nfind Horella, they seek the insight of the wise Man of the Mountain. This\nman supposedly is very wise and will answer any questions.\n* Social Ettiquette - After a few hours of travel, the ghouls stop for\nnourishment. They squat down and rummage through their stained sacks.\nThey produce vaguely familiar cuts of raw meat with tinges of green along\nwith sour wine. The source of the meat is all too obvious. The ghouls\nlike their food well-aged and, out of respect, offer their guests the\noldest pieces. The bags also contain the remains of Grath's zebra which\nthe ghouls are more than happy to hand over, leaving the tastier pieces\nfor themselves.")
                                      )
                                    ),
                                    Core.vx_new_string("Journey to the Stony Desert"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Journey to the Stony Desert"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Underworld - The ghoul tunnel leads to the Underworld. Once in the\nUnderworld, the tunnel leads upward for 3 days through the center of a\nhuge mountain. Many ohter tunnels branch off, but the ghouls seem to know\ntheir way. Drinking water oozes down the rock wall. Bloated fungi, pale,\nfoot-long crickets, and eyeless carnivorous rats server as food. Most of\nthe trip is in complete darkness. Occasionally, luminescent fungi provide\na tiny amount of light. The tunnels connect the Vaults of Zin where\ndangerous ghasts, serpent folk, or worse may be encountered. Eventually,\nthe group exits the Underworld at the border of the [Stony Desert].\n* [Stony Desert] - Grath says the journey eastward across the desert will\nonly take a few days. They seek the sacred mountain [Mt. Hatheg-Kla] where\na holy man can tell them where fair Horella can be found.\n* Walker of the Stony Desert - A few days journey into the desert, the\ndreamers see, off in the distance, a man leading a horse. They will meet\nin about an hour. As they draw near, it is clear that the man is enormous,\ntowering over the horse. He is 8 feet tall, 400 lbs, and dressed all in\nblack. His horse seems old and tired and lags behind being pulled by a\nrope. The horse is an elderly nag with cataract films covering both eyes.\nThe ghouls are terrified of the man and will not approach. He does not\nstop walking unless he is attacked. This being is the dream-form of Eibon.\nthe Hyperborean wizard who, like the spell he cast to capture Eibon is\nbound to travel back and forth across the Stony Desert. A legend says\nthat one day he shall find a way out of the desert. On that day, the\nhorse shall be healthy and the man shall then ride the horse. Where he\ngoes then, he does not know for the horse shall be the master. He freely\ndiscusses his trip across the desert, Mythos knowledge, Nemesis, and his\nspell the Web of Eibon that Yibb-Tstl taught him. He now knows that\nstagnation is worse than destruction by Nemesis. If asked about Nemesis,\nhe produces a large, shining jewel from the air and offers it to the\ndreamers. He says simply that all brave souls will know what to do when\nthe time comes. Any attempt to attack Eibon results in him disappearing\nand reappearing far in the distance continuing his endless travels.")
                                      )
                                    ),
                                    Core.vx_new_string("The Man on the Mountain"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Man on the Mountain"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* [Hatheg-Kla] - A day or two after meeting the Walker, the slabs become\nmore numerous. As they approach Mt. Hatheg-Kla, smoe of the slabs are\nstill turned upright in the ground and bear traces of ancient carvings.\nSoon it becomes obvious that they are travelling in a titanic graveyard.\n* Climbing Hatheg-Kla - Mairpl assures them that this is the only way to\nsee the holy man and ask where Horella is being kept. The other ghouls\nwill wait here while Mairpl and any brave dreamers attempt the climb.\nThe way up seems somewhat trecherous and will require a [Climb] roll to\nsucceed. If that roll fails, a second [Climb] roll must be made to catch\nyourself before you fall to your doom. Unfortunately, Mairpl fails both\nrolls and falls far below splattering on the rocks and potentially\ninjuring those below. After a short period of remorse, Grath and Ug\ngather some of the larger pieces and add them to their provision bags.\n* The Man on the Mountain - Near the skull tree, an old, bearded man in a\nyellow robe sits on a heap of corpses plundered from the cemetary below.\nHe deftly uses a silver hatchet to cut pieces of the corpses and flings\nthe dripping gobbets above his head as the circling Byakhees swoop down\nto catch them from the air. As the dreamers approach, the Byakhee scream\nand chatter, but the man pays them no mind. If hailed, he smiles warmly,\nand if asked questions he will honestly answer based on his vast\nknowledge of the Dreamlands and the Mythos. Knowledge comes at a price,\nso before he answers each question, he hurls his hatchet at the questioner\nwhich instantly slices off an appendage, starting with a hand. The Byakhee\nswoop down and eat the tidbit. The wound does not bleed and only hurts for\na moment. The damage is permanent in the Dreamlands, but each time a\ndreamer returns to the Dreamlands one wound is healed. If asked, he tells\nthat Horella is at the castle of Bombel, the giant, in the hills to the\neast of the [Stony Desert]. Anyone foolish enough to attach the man, is\nattacked by the Byakhee, rended to pieces, and eaten.\n* Cave of the Child God - Behind the tree, the shear face of Hatheg-Kla\nrises another 1000 feet before the cave entrance. A flight of steps, each\none foot wide, criss-crosses back and forth up the slope. Anyone nearing\nthe opening hears a deep sobbing and suckling sound as if from some\nenormous infant. The cave itself is completely black and no light will\npenetrate it. If anyone enters, a few seconds later, horrifying screams\nof agony echo from the cave accompanied by sucking, popping sounds and\na soft, cooing voice. The screams continue for almost a minute before\nthey are choked off by a gurgling, bubbling sound and a huge spray of\nblood that shoots from the cave. The character's dream-self is dead, and\nhis waking self has been driven mad by the horrific dreamform of Nemesis.")
                                      )
                                    ),
                                    Core.vx_new_string("Castle of Bombel"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Castle of Bombel"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* To the Castle - The Man on the Mountain has directed the dreamers\ntoward a castle to the east of the [Stony Desert]. The trip takes a few\ndays through the desert and another day throught wooded hills.\n* The Castle - The rude, three-story castle is in a clearing. It has a\nsingle window at the top and a door at the bottom.\n* Bombel - Near the castle, sitting on a boulder is a huge [Gug]. At the\nfirst sign of intruders, it rushes to the attack.\n* Horella - Shortly after Bombel starts fighting, a foul-looking, scaly\nghoul appears in the window. This is Horella, and she immediately begins\nhurling vile insults and rocks at the Gug. The ghouls are cheered on by\nher presence, but if someone listens they realize that she is exhorting\nBombel to kill the intruders. Dreamers may also notice previous bruises\non Bombel's head. If Bombel falls, Horella turns her insults and rocks\nat her would-be rescuers. Any remaining ghouls grab a chain from their\nbags, say 'To the rescue', capture Horella, and drag her bumping down\nthe stairs. The ghouls bid farewell and will offer the page as a reward\nfor the dreamers help.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Nemesis: Spawn of Azathoth"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nemesis: Spawn of Azathoth"),
                                Core.vx_new_string(":scenariomap"),
                                Core.f_new(
                                  Base.t_scenariomap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Trip to Darjeeling"),
                                    Core.f_new(
                                      Base.t_scenario,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Trip to Darjeeling"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Francis Wilson - Francis is one of the Tuesday Night Academy. He was at Phillip's funeral and he has been in Russia researching the Tunguska Blast and its possible relationship to Nemesis. He has made some discoveries and sends a telegram to Judge Braddock who forwards it along. The message says to leave immediately for Darjeeling, India and to meet Colonel Hugh Huntley of the British Foreign Office.\n* Darjeeling -\n* Colonel Hugh Huntley - Francis has arranged with the British Foreign Office to allow the investigators to travel to Lhasa, Tibet to aid him in his research. Colonel Huntley provides them with papers and can help arrange transport to the British Legation in Lhasa where Francis Wilson is staying.\n* Road to Lhasa - The 400 mile journey to Lhasa can only be taken on foot or via horse-drawn caravan. The route is heavily trafficked by pilgrims, traders, smugglers, and spies. The journey takes weeks and is alternately terrifying, boring, facinating, cold, and misery-making.\n* Lhasa - Lhasa is a sprawling squat city with no building taller than 2 stories except for the Potala, the home of the Dalai Lama. The Potala is a bulky, stone structure that is imposing but unattractive.\n* The British Legation - The Legation is on the outskirts of Lhasa. Here Francis Wilson has residence. He seems thinner and more stressed than at the funeral. He has been researching the Tunguska Blast and mad Rasputin's apparent presence at the blast. After piecing together his research, he illegally entered the Soviet Union and stole parts of Rasputin's journal. He then fled to Tibet through Mongolia. He has been translating sections since then. He claims that Rasputin met someone called Eibon in his dreams, and that this Eibon told him of his own death. Eibon also warned him of a dark star that would fall from the sky. This Eibon gave him a stone that he used to destoy the star. He further foretells another dark star that would fall long after Rasputin's death in Tibet. Francis guesses that the location may be near an abandoned temple roughly 300 miles north of Lhasa. He has found a guide Lha-bzang who studied in the temple as a child.\n* Lha-bzang - Francis plans to travel there soon with a native Tibetan, Lha-bzang. Lha-bzang is a domden, a Tibetan mortician. A skilled Anthropologist may recall that Tibetan funeral rites involve the corpse being hacked to bits by the axe-wielding domden and then fed to ravens or vultures. Lha-bzang's dream form is the holy man on the mountain. Lha-bzang is going on the journey to expand his spiritual understanding. Unfortunately, he has also been paid off by a Soviet spy. If questioned about the temple, he says he was sold as a slave as a child but he fled the temple when he realized that their teachings were not Buddhist.\n* Ivan Dorkyev - A Soviet spy who has been tracking Francis down since Francis stole Rasputin's journal in Leningrad. He is over 6 feet tall and is dressed in the tattered robes of a yak-herder. Beneath, he carries two pistols, a knife, and a bandolier of ammo. He hides at his camp in the mountains near the ruins waiting for Lha-bzang to bring Francis.\n* Trip to the Ruins - Lha-bzang leads the expedition 300 miles through a tangle of steep mountain passes, brackish lakes, and arid valleys. On the way, they encounter kay-herders, small mountain monasteries, and moutain farms. About 2 weeks in to the trip, while camped, a minor earth tremor shakes everyone awake. A week laker, they arrive at the Nenmka temple, sitting on the slope of a mountain.\n* The Temple - The temple is now just a windswept ruin. A Mythos knowledge test reveals that the fallen columns have inscriptions used to invoke Hastur. The Soviet spy has watched the investigators approach and waits in hiding nearby. Lha-bzang finds a section of flooring with symbols on a tile. Here he will perform a ceremony to discover more about Nemesis.\n* The Ceremony - Lha-bzang sits and lights a clay pipe containing a tarball of hashish. He passes the pipe around and then begins a droning wail. After 30 minutes, he retrieves a knife and a freshly severed human hand from his bag. He cuts his own palm, smears blood on the hand, and binds the cut. He then passes the knife to each person to do the same. If any will not, he gestures for them to leave the prayer circle. After another 5 minutes, the hand twitches and then turns toward Lha-bzang. He asks where can they find the Seed of Nemesis. The hand then crawls to a symbols on the ground indicating 'not far' and 'north-east'. Additional questions may be asked but each question causes the questioner to receive a minor Sanity Wound. Answers are always very short, and the hand only knows local events. The Soviet spy waits nearby but has accepted Lha-bzang's demand to allow the ceremony to complete before acting.\n* Confrontation - Just as the ceremony is concluded, Ivan steps into the room brandishing his pistols and warning everyone to stay where they are. He is deadly serious and will gun down anyone who makes sudden movements. Ivan plans to take Francis back to the Soviet Union to stand trial for the many laws he has broken and suspiscion of being a spy. He has no knowledge of Nemesis and has nothing but contempt for the superstitious, religious ritual. If given the chance, he will tie up the investigators and then take Francis and Lha-bzang (his ally) in the morning.\n* The Fallen Seed - In the early morning, everything changes. Along with the bright sun, a halo forms in the sky, though this halo does not surround anything visible, yet. Dorkyev is thunder-struck; he and Francis exchange words in Russian. Ever the pragmatist, Dorkyev frees everyone and begins a descent toward the valley under the halo. Within the valley, the halo light is flat and oily, and its color melts through shades of yellow and green as though through a prism. Lha-bzang vomits and flees. Suddenly, all present feel their hair stand on end as the halo darkens and takes on a dull gun-metal hue. The slight wind disappears and everything is silent. Then, high above a sizzling sound grows in intensity. Suddenly a hideous scream is heard followed by a thunderous blast that knocks everyone off their feet. Everyone suffer partial hearing loss and if a check versus [Body] is completely failed, the loss is permanent. A blinding light rips through the sky and crashes to Earth over the valley ridge that Lha-bzang crossed. A massive explosion rocks the ground and a curtain of flame passes overhead. If not for the ridge, everyone would have been incinerated along with Lha-bzang.\n* Crater - Peeking over the ridge, a 20 foot crater can be seen with a sickly, green light emanating from it. Wilson frantically says that Eibon's symbol must be placed on the Seed or it will destroy the Earth. Those who have witnessed the Seed in Montana know that any who approach the Seed will die: quickly or slowly. If no one volunteers and no one has a plan, Dorkyev swears, snears of their cowardice, and takes the jewel to the crater. Alas, just as he climbs the crater and is exposed to the light, he screams and immediately melts into a puddle before everyone's horrified sight. Worse, he drops the jewel into the crater. If someone uses a mirror, they can see the jewel near the Seed which is slowly melting the rock around it with its terrible power. Wilson adamantly refuses to go (and will melt if pushed), so someone will have to sacrifice themself or watch the Seed sink into the ground and doom the world.\n* Eye to Azathoh - The doomed person must resist the corrupting rays, retrieve the jewel, and then touch it to the Seed. Nothing happens for a few moments, then the Seed suddenly shimmers and disappers with a sharp pop. The Seed is gone but a black, marble tunnel lies in its place. The jewel lies on the ground before the tunnel. Hyperborean symbols line the tunnel. This is Eibon's work. When the jewel crosses the threshold, it suddenly reverts to the heavy glowing stone from the Dreamlands. There is a steady breeze down the tunnel and a light can be seen ahead. After 100 meters, a room 250 meter, circular opens up. The room is the exact same shape as the jewel. The breeze has become a howling gale ending in a 5 meter gateway in the center of the other end of the room. The gateway in the center of the oval room gives the impression of an eye looking out into space.\n* Gateway - The gateway can be reached by a ramp that slopes upward 50 meters. Stars can clearly be seen through the opening, and it is clear that the gate leads directly into outer space. Anyone who has been exposed to the Seed radiance, has an intense desire to go through the gate and join Nemesis. Anyone approaching the gate will need ropes or climbing skill to cling to the reliefs on the floor or be sucked into oblivion. Also, the jewel gains weight as it approaches the gate, as if it is resisting, eventually becoming over 100lbs. If someone can get close or has binoculars, that person will see that the area of space beyond the portal is filled with criss-crossing black lines forming a faint web. Someone may recognize the black substance and The Black associated with Yibb-Tsll. This is Eibon's Web taught to him by Yibb-Tsll. Within the web, an observers intuitively senses that time is slowing to a crawl. Further, the web is creeping through the portal into our world. This is how mad Eibon hoped to save mankind, by freezing us forever in time, so Nemesis can never destroy us.\n* The End - If the jewel is brought near the gate, in addition to its increased weight, the Black lines start to reach toward the jewel. Simply hurling the jewel through the portal will gather all the webs onto the jewel which breaks the spell of Eibon. If anyone returns to the Stony Desert, they will no longer find Eibon there. The world will no longer be trapped forever in frozen time, but Nemesis will still return some day to end the world, but it will not be today.")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Julian Baxter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Julian Baxter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Julian Baxter is a priest and brother of Phillip Baxter. He is confined to a\nwheelchair and is heavily dependent on his son Matthew. Before becoming a priest,\nJulian was educated as a psychotherapist. He has traveled the world on missions, but\nsince becoming crippled he has returned to his home town.\n* Julian has a copy of the Book of Eibon in his library. It has a section\nwhere Eibon fortells the end of mankind with the coming of Nemesis. Eibon\nwas obcessed with preventing man's destruction and spent the rest of his\nlife developing a ritual call the Web of Fate that would supposedly save\nmankind when the time was right. Eibon claims that as Nemesis approaches,\nthe Web of Fate will draw together seemingly unrelated events, defeat\nNemesis, and create an eternal golden age for mankind. The reading clearly\nshows Eibon's progressive descent into madness.")
                              )
                            ),
                            Core.vx_new_string("Matthew Baxter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Matthew Baxter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Matthew is the adopted, grown son of Julian Baxter. He is strong, but he is also\nmute and aeuteistic. This combination makes him appear simple, but he is actually\nquite competent. He is an avid dreamer where there is no trace of his aeutism. In\ndreams he is a city council member in Ultar. He can be a strong ally, but he must\nbe approached in the Dreamlands, as it is impossible to gain his friendship in the\nreal world.")
                              )
                            ),
                            Core.vx_new_string("Silas Patterson"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Silas Patterson"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Silas is a friend of both Phillip and Julian Baxter, a past professor at Brown\nUniversity, a former antrhopologist, and a member of the Tuesday Night Academy. He is\nquite fit considering his age.\n* Silas met Julian Baxter in the Congo in 1904 and became friends. In 1919, he met\nCynthia Baxter, Julian's niece in the Andaman Islands. In 1920, he came to Providence\nwhere he met Phillip and joined the Tuesday Night Academy. Phillip soon after helped\nhim get a teaching position at Brown.\n* Silas practices a form of cannibalism he learned in New Guinea at the instruction\nof a degenerate Tcho-Tcho priest. The ceremony involves eating the brains of a\nrecently slain primate to gain extended life. This habit made him lose his job at\nBrown when it was discovered that he was stealing monkey corpse from the lab. He has\nsince made an arrangement with a local undertaker with low moral character, Alvin\nBeswick. Silas told Beswick that he was performing brain research, but Beswick is\njust concerned with the money. Beswick allows him access to closed coffin corpses\nfor a price. He was given access to Phillip's corpse and noticed the small bite marks\non the scalp. While devouring the brain, Phillip suddenly lurched back to\nconsciousness and thrased wilding before dying. Silas was terrified and is wracked\nwith guilt over his friend's death. He is maintaining his sanity through denial, and\nif he is forced to confront what he has done, he will retreat inward and become\ncatatonic and need to be institutionalized.\n* Silas is friendly, but he not only knows his role in Phillip's death but is\nreasonably sure that Cynthia was involved. He is planning to return to the Andaman\nIslands to investigate Cynthia's activities and also because it is getting hard to\nhide his youth in Providence.\n* In Sila's desk can be found notes for his next book, about cannibalism. The notes\nindicate that Silas is unbalanaced. In his files can be found the lease to a\nfarmhouse.\n* Investigating the farmhouse, leads to the table where Phillip met his end. No\nattempt has been mde to cover up the crime.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mythos Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mythos Scenarios"),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Seeds of Azathoth"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seeds of Azathoth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Nemesis - Since 1984, a theory attempts to explain the mass extinctions that occur\nevery 27 million years. The theory submits that a brown dwarf star orbits our sun at\n95,000 AUs and every 27 million years it approaches close enough to rain comets throughout\nthe solar system causing climate change, mass-extinctions, and similar catastrophes.\n* Seeds of Azathoth - Nemesis is, in reality, a Spawn of Azathoth that has clung to orbit\naround the Sun. Occasionally, pieces of Nemesis break free, falling into the solar\nsystem: the Seeds of Azathoth. Seeds that strike the Sun are destroyed, but if a seed\nstrikes a planet, it can melt into the planet's core where it grows immensely, eventually\nforming a new Spawn which emerges from the broken planet like a snake from an egg. Our\nsystem's original fifth world was so parasitized. Its remnants compose the asteroid belt.\n* For millenia, human and other astronomers have seen in comets, 'hairy stars',\napproaching disaster and ill-fortune. In ancient texts, comets have been blamed for\nthe revolt of the Shoggoths against the Elder Things, the doom of the dinosaurs, the\nfall of the empire of the Serpent People, the destruction of Hyperborea, the sinking of\nAtlantis, and even the two ages of chaos that struck early Egypt.\n* The most recent effect of Nemesis took place in central Siberia, June 30, 1908, when a\ntremendous explosion rocked the area for hundreds of miles. There was a pillar of fire\nand shock waves powerful enough to knock down horses 400 miles away."),
                                Core.vx_new_string(":sectionmap"),
                                Core.f_new(
                                  Base.t_sectionmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("The Case of Phillip Baxter"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("The Case of Phillip Baxter"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Figure in the Night"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Figure in the Night"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* An investigator wakes suddenly in the night to see the room bathed in pale\ngreen light and a strange musky smell. A vague, ghostly figure gestures toward\nthe investigator. Suddenly, a portion of its head disappears as if bitten off.\nThe spectre stumbles and thrashes around the room as more of the head is eaten\nuntil it is completely headless. The figure goes rigid and fades away leaving\nthe room in darkness.\n* After contemplation, the figure is recognized as Professor Phillip Baxter a\nformer teacher of the investigator.\n* Contacting Phillip's home gets the distraught housekeeper, Angela Vincenzo. She\ninforms them that Phillip passed away yesterday of a sudden illness. She invites\nthem to the funeral the next morning.\n* A successful Occult roll indicates that an apparition usually appears at the\nmoment of death instead of a day later.")
                                              )
                                            ),
                                            Core.vx_new_string("Funeral of Phillip Baxter"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Funeral of Phillip Baxter"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("The services are in the rain and attended by:\n* Julian Baxter, the priest, in a wheelchair.\n* Matthew, the priest's personal attendant, who is a large, silent man.\n* Emmott Baxter, elder son of the deceased.\n* Dr. Douglas Walters, the family physician.\n* Silas Patterson, anthropologist and member of the Tuesday Night Academy.\n* Judge Braddock, executor of the estate.\n* Angela, the housekeeper.\n* Alvin Beswick, undertaker and hearse driver.")
                                              )
                                            ),
                                            Core.vx_new_string("Legacy of Phillip Baxter"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Legacy of Phillip Baxter"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Angela receives the property\n* Half of his cash goes to the Tuesday Night Academy\n* The remaining half goes to his three children Emmott, Colin,\nand Cynthia. Cynthia's portion to be donated to the Catholic Widow's Relief Fund as\nshe requested.\n* At this, Emmott accuses Silas Patterson and his Tuesday Night\nAcademy of wasting all his father's money in life and now in death.\n* Finally, a packet of papers is given to the investigators according to the will.\nThis packet contains Phillip's dream journal and an short note about why he thought\nthe investigators might be interested.")
                                              )
                                            ),
                                            Core.vx_new_string("Dream Journal of Phillip Baxter"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Dream Journal of Phillip Baxter"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The enclosed note describes that his dreams had become more vivid and\nrecurring recently and that he felt that he needed to write them down and give\nthem to someone who might find the account scientifically interesting.\n* He had traveled to Ultar and visited the library there. In the library, he\nfound the book, the [Cthaat Aquadingen] which gave important insight into his\ncurrent research. As Phillip left the library, he saw an evil-looking dwarf\nthat he had seen in a carnival he passed on the way into the city. The dwarf\nwas discretely following him. Phillip managed to shake him before he woke up.\n* Anyone experienced in the Dreamlands will recognize the entrance to the\nDreamlands and Ultar.")
                                              )
                                            ),
                                            Core.vx_new_string("Home of Phillip Baxter"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Home of Phillip Baxter"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Angela Vincenzo, the former housekeeper is now the only resident in the roomy\nthree bedroom home.\n* The study contains various paperwork including:\n** A letter from Phillip's daughter Cynthia describing that her supposed kidnapping\nby natives was not as serious as he was led to believe and that she is perfectly\nfine. She has sent a box of coconuts as a present.\n** Notes on the Tuesday Night Academy's purchase of a large telescope and their\nsearch for a 'Dark Star' called Nemesis.\n** An anthropology book authored by Silas Patterson with marked section describing\nsoutheast Indian tribes displaying remnants of ritual cannibalism. Most are symbolic\nacts upon the death of a family member or friend, but on occasion the ritual is\nactually performed using a monkey or ape substitued for a human. Of particular\ninterest is a brain eating custom where the brain is exposed and eaten directly from\nthe skull while still warm. An elderly native said that he had seen apes killing\nsmaller monkeys and eating their brains in similar manner.\n** A diary including comments about:\n*** His brother Julian sudden sickness and retirement after returning from the\nAndaman Islands.\n*** Julian's subsequent suicide attempt\n*** Cynthia's trip to the Andaman Islands and subsequent abduction by savages.\n*** Her later release\n*** Arguments with his sons over favoritism\n*** His recent series of nightmares\n*** His therapy with Julian over his nightmares and the drug Julian prepared to help\nhim sleep.\n*** The ultra-realistic new dreams after the drug put him into an especially deep\nsleep.\n*** Julian's refusal to provide more of the drug.\n*** Phillip's break-in of Julian's house and the successful theft of the drug.\n* The basement contains an unopened crate of coconuts with a small hole chewed\nthrough the side.\n* The attic contains a formerly extinct prehistoric spider that was in the crate of\ncoconuts. It had bitten Phillip in his sleep and put him into a deep coma that was\nmistaken for death. The spider venom causes unconsciousness in 10 minutes, but the\nvictim will revive on its own within two days.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Search for the Seed"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Search for the Seed"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("The Garrison Observatory"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("The Garrison Observatory"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Tuesday Night Academy has spent a large sum of money to erect an\nobservatory in Garrison Montana. They experiment with prisms to try to\ndetect the dark star that their research claims has had a sweeping effect\non history.\n* The Observatory is deep in the woods and is only accessible on\nhorseback.")
                                              )
                                            ),
                                            Core.vx_new_string("The Defenders of the Seed"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("The Defenders of the Seed"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Seed - A Seed of Azathoth has been hurtling through space for\ncenturies and has finally been drawn to Earth. As it approached, the\nspecial prisms in the telescope attracted it like sunlight off a mirror.\nThe Seed swept across the sky and crashed in the woods. Its strange\ngreen fire trail attracted the attention of many including those at\nthe observatory and a group of local hunters.\n* Sasquatch - When the hunters found and examined the asteroid, they were\nexposed to the horrific radiations of the Seed. Those that survived,\nregressed to a primitive state. They are terrified by the Seed, but are\ncompulsively drawn to it. They have buried the Seed in an alcove of the\ncave in which they live. The Seed is slowly killing them, and as they\ndie, they dissolve into a primordial soup before actually dying.\n* Sylvian Englund - Sylvia is a pleasant woman in her late sixties who\nlives off the land in the woods since the death of her husband. She has\nrecently discovered the regressed hunters and believes that they are\nSasquatch. She has been feeding them and has gained their trust. She\nenjoys her discovery and does not want outsiders to ruin her\nfriendship with the sasquatch.")
                                              )
                                            ),
                                            Core.vx_new_string("The Race for the Seed"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("The Race for the Seed"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Fungi From Yuggoth - A team of four Mi-go have observed the Seed's\nlanding from their underground outpost on the Moon. Their goal is to\nretrieve the Seed to use as an magical energy source. Interesting humans\ncaptured along the way are to be de-brained and the brains carried back in\ncylinders for questioning later.\n* They each carry a machine that looks like a silver whorl. It fires a\nbeam of deadly radiance that eats blackening holes in whatever it touches.\nAny damage prevented by armor is instead applied against the armor itself.\nThe weapons have 37 charges and may not be recharged. The weapons have no\nrange limitations and are excellent sniper weapons.\n* Their first target is the firetower where they slay Ranger Marshall and\nuse the tower as a base of operations.\n* The next day they spray a nervous tissue solvent in the direct vicinity\nof the firetower to prevent intrusions. The spray forms a low fog that\nshort circuits animal nervous systems driving them mad. A Grizzley Bear\nand Jules, Sylvia Englund's dog, are the first victims of the gas. Both\nroam the countryside acting randomly.\n* Later the same day, the Fungi search the observatory, leaving many\ntell-tale signs.\n* The next day, they capture Sylvia Englund near her ranch. They de-brain\nher and hide the body in the house.\n* Toward the end of the day, they move on the Seed. They make quick work\nof the hunters defending it. They carefully put the seed in a shielded\ncontainer and fly it to the firetower. They gather their belongings,\nincluding the Seed and any captured brains, drop a bomb on the firetower\nto destroy any evidence, and fly back to the Moon.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Death in St. Augustine"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Death in St. Augustine"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Investigating Colin Baxter"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Investigating Colin Baxter"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Colin Baxter, Phillip's youngest child, is due a healthy piece of\nPhillip's estate, but he must be located first. His last known location\nwas St. Augstine, Florida. Judge Braddock is concerned with the series of\nbizarre occurences and hires the investigators to track Colin down and\ncheck on his safety.\n* St. Augustine is a city in northeast Florida and the oldest continuously\noccupied European-established settlement in the continental United States.\n* Colin is indeed still here, but he has fallen on hard times and turned\nto alcohol. He can be found in a local speakeasy hidden behind a\ngrocery store.\n* Harry Spitz - The grocery store/speakeasy is owned by Harry Spitz who\nruns the bar. He pays protection money to the police and is in no danger\nof police action.\n* Billy Wolff - Billy is a close friend of Colin's and will steadfastly\ndefend his buddy in all circumstances, especially when drinking.\n* Esmerelda - Esmerelda is a Cuban born, hot-headed friend of Colin's.\nShe is an illegal immigrant and will not reveal her last name under any\ncircumstances to, somehow, protect her family.")
                                              )
                                            ),
                                            Core.vx_new_string("Colin's Treasure"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Colin's Treasure"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Colin has a history of get rich quick schemes and his current one is to\nfind a fortune in sunken treasure. Unfortunately, his business partner\nran away taking their remaining cash and Colin's girlfriend with him.\nSince then, Colin has been drinking his troubles away.\n* The inheritance money helps, but Colin is still short $2,000. He will\noffer the characters 50% of the profits if they chip in the money.\n* He believes that the wreck of the treasure galleon, La Rosaria can be\nfound off Bimini. He claims to have an accurate map to the location. His\nmap is hand copied from an original kept in the library of the 200 year\nold Spanish church.\n* Father Garcia - At the church they meet Father Garcia who is a friend of\nEsmerelda. Father Garcia is friendly but guarded. With the help of\nEsmerelda he admits that he fears that someone is watching him. He also\nadmits to seeing figures moving in the dark on the church grounds, though\nhe feels he must be imagining things. After gaining his trust, Father\nGarcia shares the church library. Though Colin's research is shoddy,\nfuther research supports his findings that the map is an authentic map of\nthe location of	the La Rosaria.")
                                              )
                                            ),
                                            Core.vx_new_string("Colin's Wreck"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Colin's Wreck"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Palencia - Colin invites the party aboard the old steamer he has\nbought and retrofitted for large scale salvage. The crew is mostly Cubans\nand blacks. As they depart, someone spots a reflection from the coast.\nUsing binoculars, they see someone observing them back with binoculars\nbefore the person ducks away.\n* The Voyage - The map shows a location off Bimini, 300 miles south of St.\nAugustine. The voyage takes less than 24 hours on calm seas.\n* Diving - The diving pumps have enough pressure for no more than 2 divers\nat once. Wolff operates the pumps. Colin would prefer to dive with a\npartner and asks for volunteers. The divers reach the bottom in 2 minutes\nand tug twice on the line to indicate they are at bottom. The water is\nparticularly clear and well illuminated by sunlight. Only 20 minutes later\nthey spot the wreck and tug twice again. The divers return to the surface\nand describe that the wreck is in only 50 feet of water but is stuck on a\nreef hanging over a sharp drop off on one side.\n* Coral Outcropping - A protruding coral outcropping has pierced the hold\nof the hull. Anyone exploring this area will be the victim of a single\nsudden attack by the [Moray Eel] that makes its home here. The attack is\nnot life threatening, but if the person bleeds the divers will have to\nreturn to the surface for fear of attracting sharks.\n* The Drop Off - Anyone foolish enough to explore the deck near the\ndrop off, suddenly causes a section of the hull to break off and fall into\nthe drop off. The falling diver can attempt to jump free, failing that he\ncan scramble to grab the coral reef as he falls, otherwise he slowly falls\n30 feet before the coral cuts his air hose and he drowns. The boat pulls\nhim up, but it will be too late to save him unless he is extremely\naccomplished at holding his breath.\n* Captain's Cabin - Colin is most interested in the Captain's cabin where\nhe finds a heavy lock box which needs to be winched to the surface. In it\nthere can be found 22 forty pound silver bars worth $10000 total and a\nstrange, large necklace. The necklace is carved with strange figures of\nanimalistic humans celebrating a great comet with a tail that goes on\nforever. After a few days investigation, it is clear that the wreck does\nnot contain the riches that Colin hoped for. Colin will be left deeply in\ndebt. However, any characters who invested will double their investment.")
                                              )
                                            ),
                                            Core.vx_new_string("Colin's Ruins"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Colin's Ruins"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Ruins - Colin desperately hopes that the treasure fell from the\nwreck before it landed at the bottom and begins retracing the ship's path.\nAbout a 300 yards away, he discovers what probably sank the La Rosaia: a\nsunken ruin whose stone ceiling lies just below the water line. No\ntreasure is found, but Colin is desperate to find anything of value, so he\nmoves to explore the Ruins.\n* Temple - The ruin is a stone temple in a bowl shaped depression with curved\nsteps going down 20 feet before entering an archway. The temple itself is only\n30 feet across and has many crabs and octopi. The walls are covered by mosaic\ntile that depicts people suffering during multiple terrible disasters. Above\neach disaster are tiles depicting an orb with a shining light nearby.\n* The Pit - In the center of the temple is a dark pit of indeterminate depth.\nBefore the pit is a metal orb on a stone slab. The orb has a metal rod\nprojecting from one side at the end of which is a shiny topaz. The rod can\norbit the orb and telescope in or out, but its current position is very close\nto the orb. A mechanism inside the orb operates the rod and is apparently\nstill active. The pit reaches about 100 feet before a rock cave-in blocks the\nway. Within the pit is a single, strange dolphin.\n* The Dolphin - If multiple lights are shined down the pit, a motionless\ndolphin can be seen. Suddenly, the normally peaceful dolphin swims up and\nattempts to ram people with incredible force. It will continue attacking\nunless the invaders leave or it is killed.")
                                              )
                                            ),
                                            Core.vx_new_string("Death of the Father"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Death of the Father"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Homecoming - As the Palencia arrives at port, police can be seen on the\ndocks. When the Palencia docks, officers rush on board and arrest Colin and\nWolff for the murder of Father Garcia.\n* Murder - Father Garcia was murdered the same day that Colin and the\ninvestigators went to the library. Witnesses say that Colin and Wolff\nreturned drunk later that night and ransacked the library. That morning the\npriest was found in the church with his skull crushed. The reality is that\nthe ghoul cult has been robbing graves for years. Father Garcia has been\nnoticing activity in the night and has been hiding in the church at night to\ntry to catch someone in the act. Unfortunately, he found the graverobbers and\nconfronted them. They immediately killed him and called the Detective to\ncover up the murder. What the killers did not realize was that Esmerelda was\ncoming home from the speakeasy when she heard a commotion from the church.\nShe rushed over and observed the killers discussing what to do with the\nFather's body.\n* Detective Morris Packard - The detective is the head of the police force\nwhile the chief is on extended medical leave. He is also a member of a secret\ndeath cult that worships ghouls. His cult was graverobbing for their riturals\nwhen the Father caught them and he was dispensed with. Colin's drinking made\nhim a convenient scapegoat, so the Detective is constructing circumstantial\nevidence to arrest Colin. Later he will arrange for Colin to hang himself in\njail. If the investigators get too close to the cult, he will arrange an\nambush to eliminate them.\n* Esmerelda - Esmerelda is conspicuously missing. After witnessing the murder\nscene, she packed her things and fled to her parents house in Clearwater.\nShe fears for her safety and doesn't want to get involved, but when she\niscovers that Colin has been frames, she writes a letter with what she saw to\nthe investigators and Colin.\n* Crime Scene - Trampled in the dirt can be found a pin from the local\nalligator farm that was dropped in the scuffle.\n* St. Augustine Library - The local library carries copies of newspapers.\nSeveral stories can be found in the Jacksonville Sentinel that may be\nrelevant. Older material is harder to discover.\n** 1571 - A yellowed document in Spanish written by Father Rolando Tortulla\nof Toledo Spain. The document reports to the King, the state of the French\nheretics held prisoner in vaults below the monastery. They are wild and\ndegenerate and are guilty of cannibalism. They will be held until they die.\n** 1641 - A yellowed document in Spanish describes the construction of the\nCastillo de San Marcos that incorporates the catacombs of the old monastery.\nA violent french prisoner was transferred to a new cell.\n** 1662 - A yellowed document in Spanish describes the horrid state of the\nFrench prisoner. His toes are missing and he limps around his cell scratching\non the walls saying only gibberish. He will be held until he perishes.\n** 1682 - A yellowed document in Spanish describes the escape of the french\nprisoner. Stones were removed from the wall of the cell and the prisoner\nfled into a tiny tunnel behind the wall. After a brief attempt to locate him,\nthe tunnel was filled, sealing the fate of the horrible prisoner. Drawings\nwere scratched into the ceiling showing comets and fire raining from the sky.\n** 1792 - A religious paphlet describes an ancient evil unloosed by Satan.\nThey are inhuman but walk among us like men. Many officials of the city, both\npast and present, belong to this secret, godless faith.\n** February 1890 - A freshly buried body was stolen from a cemetary south of\nSt. Augustine. No suspects were found.\n** May 1927 - Grisly Find at Alligator Farm. Eli Simpson, an employee of the\nfarm, saw a shoe in the large crocodile pool which turned out to also contain\na severed human foot. No identification was found, and police theorize that\na vagrant snuck onto the farm and fell into the pool. No charges were filed.\n** October 1920 - A recently buried body of an indigent was stolen from the\nold St. Augustine church graveyard. No motive or suspects were found.\n* St. Augustine Herald - The local paper is a weekly that promotes local\nbusinesses and tourist trade. The editor/owner is Fred Boswell who bought the\npaper 3 years ago. Strangely, the original owners destroyed all their files\nbefore they left.\n* Jacksonville Sentinel - Sold next to the Herald is a real paper published\nin Jacksonville, a 2 hour drive up the coast.")
                                              )
                                            ),
                                            Core.vx_new_string("Korsky's Alligator Farm"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Korsky's Alligator Farm"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Eli Simpson - Eli found the severed foot and was subsequently fired by\nMaynard Korsky for alerting the police before discussing it with him first.\nIt was not the only time he found strange meat in the pens, but it was the\nonly thing he could clearly identify.\n* Maynard Korsky, Dell Korsky, and Kenny Durham run the farm. They use the\ngators to destroy the leftovers of the cult, but do not do any other cult\nbusiness at the farm.\n* The Farm - If the investigators investigate the farm during the day, the\nKorskys and Kenny Durham are no help and the cult is alerted to their\ninvestigation. If they investigate at night, the farm is not guarded, but\nthe gators have destroyed any evidence that might have been found.")
                                              )
                                            ),
                                            Core.vx_new_string("Castillo de San Marcos"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Castillo de San Marcos"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* A monumental castle started in 1638 and took over a century to complete.\nThe upper levels are open to the public, but the lower levels are considered\nhazardous and are sealed off with packlocked plywood doors. It is easy enough\nto pry the plywood loose but not without leaving evidence of tampering. The\ncells of the degenerate prisoners are easy to locate. The walls and ceiling\nare covered with scratchings of spiders and comets and skulls. In the final\ncell, a stone can be removed revealing a low tunnel sloping downard. Crawling\non hands and knees for fifty yards reveals a hallway from the original\nFranciscan monastery that predated the fort. The hall leads to a small room\nwith two chairs and black robes hanging from pegs. The room is the same as\nthe one depicted in the films from Thornton's Camera Shop.")
                                              )
                                            ),
                                            Core.vx_new_string("Thornton Camera Store"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Thornton Camera Store"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The camera store has a view of the castle. William Thornton works here all\nday selling cameras, lens, and film. There is also a darkroom where he\ndevelops photos.\n* If the investigators break in they can find some smuggled Cuban ponography\nand three recent silent films in a locked box.\n* The Films - Each film is roughly the same depicting a dead body in a chair\nin a small stone room surrounded by hooded figures. A veiled female figure\nlimps over and begins a ritual. The body seems to gain some semblence of life\nand then the figures leap upon the body and begin eating it at which point\nthe film ends.\n* If confronted with the films, Thornton claims he received them by accident\nalong with the Cuban films and that they are obviously some kind of homemade\nhoax.")
                                              )
                                            ),
                                            Core.vx_new_string("Thornton House"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Thornton House"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Mother Thornton - Mother Thornton is the matriarch of the death cult and has\nnearly completely transformed into a ghoul. She never goes out in public and\nwears a veiled hat even in private.\n* William will normally be at home after 5pm. During the day, the front door is\nnot locked. If Mother Thornton hears intruders, she will stay in her room\npretending to be sleeping in a chair. If she is exposed, she throws off the veil\nand tries to escape the house. She will leap out the second story window lope\ndown the street scattering the citizenry. Any disturbance here will have the\npolice arrive in five minutes where they will arrest anyone in the Thornton\nhome for the murder of Mother Thornton. Even if she is killed the story will be\nthat they killed a deformed and crippled old woman.\n* Gray Binding - Among her possessions is a book that teaches the Gray Binding\nspell that animates a corpse into a mindless zombie.")
                                              )
                                            ),
                                            Core.vx_new_string("St. Augustine Ambush"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("St. Augustine Ambush"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Note - If the investigators are discovered, Detective Packard will\narrange a deadly ambush for them. He will kidnap Eli Simpson, Esmerelda, or\nanyone else who they think can lure the investigators. The victim leaves a\nnote to the investigators that they have new information and to meet at the\nchurch graveyard and night.\n* The Churchyard - The gator farm truck is hidden to the north of the\nchurch, and the Maynards and Packard wait in ambush with pistols and\nblackjacks behind tombstones. At the center of the graveyard, the contact\nsits on a tombstone under the moonlight. Unfortunately, the victim is already\ndead and is merely propped up. The ambushers try to take the investigators\nalive, but will open fire if they have no other choice.\n* The Ritual - If the investigators are captured, they are taken to the ritual\nchamber where one of them is eaten alive while the others watch. Before the\ngrisley feast is complete, a number of ghouls come down the tunnel and tear\nthe cultists apart. The ghouls drag away the dead and ignore the living\ninvestigators.")
                                              )
                                            ),
                                            Core.vx_new_string("Exposing the Cult"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Exposing the Cult"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Exposing the Cult - Since Detective Packard is a cultist, any involvement\nwith local police will get the investigators in trouble. If they can bring\nhard evidence to the Florida State Police, who will move in and clean up the\nmess, though they will cover up the messier parts to maintain their vital\ntourist trade.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Investigating the Andamans"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Investigating the Andamans"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Trip to the Adamans"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Trip to the Adamans"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Andaman Islands are a narrow chain of islands 590 miles southeast of India.\n* Weather - The temperature is mild and ranges from 64F to 92F. Except for October\nand March, the islands are hit by daily monsoons.\n* Wildlife - There are no large predatory animals, just all manner of bats, rats,\nspiders, turtles, wild pigs, and native cats.\n* Population - The natives are primitive Negritoes, belived to have lived here since\nthe Pleistocene era. Uniquely among modern man, they have no knowledge of fire\nbuilding and must continually keep a fire burning. They are divided into 12 tribes\nwith different dialects of the same language. They have a long reputation as\nviscious killers and cannibals. For centuries, shipwrecked sailors had been\nsystematically slain (but not eaten). Over time, the islands have become safe to\noutsiders except in remote areas.\n* Port Blair - The British established a penal colony on the islands where convicts\nare forced to live and work. The colonly is a primitive jungle colony with a dock,\ngeneral store, a wireless, and faily complete medical facilities. Port Blair is also\nthe only deep water anchorage on the islands, so all ships must dock here.\n* Major Ashley Nichols - Major Nichols is the commissioner of the Andamans. He\noversees the trade of exotic lumber, coffee, cocoa, tea, and coconuts. He also\ncommands a small battalion of Indian solders. Nichols is happy to meet civilized\nwesterners and will places his services and those of the British Government at their\ndisposal.\n* Arrival - The Andamans are 10,000 miles from America. If the investigators use\nColin's ship, the trip takes 3-4 weeks. If they book other passage, they will have\nto travel to Calcutta first.\n* Office Records - Major Nichols has nothing to hide and allows full access to the\noffice records where a report of Cynthia Baxter's abduction can be found. In the\nnarrative, it is found that although the abductors initially tried to take her by\nforce, that after a short conversatiion, she agreed to go with them and was returned\nsafely the next day. Major Nichols has only met Cynthia twice, since she rarely\ncomes to Port Blair.")
                                              )
                                            ),
                                            Core.vx_new_string("Trek across the Adamans"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Trek across the Adamans"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Guides - If they request, Major Nichols will provide two Indian guides to lead\nthem to Cynthia's clinic 45 miles away. However, he does warn that the two are\ncriminals, working off their crimes. Worse, there are 2 escaped criminals\nknown to be in the area. They are desperate killers and could be extremely\ndangerous.\n* Sikander - A Hindu in his mid-thirties with a wife and three children on the\nisland. He stole a horse and has served eight years so far but is mostly\ntrustworthy. He will, however, steal a weapon for protecting his family if he\ngets the chance. If successful, he will hide the weapon in the jungle for future\nretrieval.\n* Mahbub - A Moslem from Delhi who has served twenty years so far for murder. He\nspeaks little English and is neither garrulous nor energetic.\n* The Jungle - The trip to Cynthia's clinic starts on timber roads, then\nfootpaths, but before the first day is over they are struggling through thick\ngrowths and shallow swamps with no path. The trip takes three days or more, and\nthe guides prove able servants, doing all the work of setting up camp, building\na fire, and preparing meals.\n* The Villiage - A loud buzzing noise emanates from a clearing ahead with a tiny,\nabandoned villiage. The buzzing comes from a tree with a crude platform 25 feet\nup. Atop the platform is a rotted human form covered in a mass of undulating\ninsects that are devouring it. Although the Andamanese normally bury their dead,\nif a particularly revered chief dies, he is bundled in a tree and the clan abandons\ntheir villiage for three months in reverence. If the body is disturbed, the Jarawan\nhunters will track the intruders and attempt to kill them for their blasphemy.\n* The Mission - Cynthia has a small wooden building that serves as her clinic\nsurrounded by the huts of 20 Andamanese. Nearly a mile from the beach can be seen\na 6 mile island covered with dense jungle. If local tribesman believe the island is\nevil, and only Cynthia has returned alive from it. The inhabitants of the island\nrarely leave, and when they do it is only to kidnap and kill.\n* Cynthia Baxter - Cynthia is a large woman, big-boned and slightly overweight. She\nis very near-sighted, and her voice is high pitched and squeaky. Cynthia will act\nhospitable to strangers, but she is highly suspiscious of those who would appear\nat this critical moment in her life. She lost her mother at 8 year old. She nearly\ndied from a spider bite and 12 and began thinking of becoming a catholic nun.\nInstead, with the encouragement of Uncle Julian, she studied medicine in college.\nJulian helped her get through medical school, and she is deeply grateful to him. To\nimpress Julian, she became a medical missionary and travelled to the Adamans in\n1913. In 1918, she was kidnapped by the Tcho-Tchos from the small island across the\nstrait. The Tcho-Tcho priest saw the mark of the spider on her, and trained her in\nthe nature of Atlach-Nacha, their horrible spider god. Cynthia never had a strong\npersonality and was easily brainwashed and converted to the terrible worship. The\npriest has convinced her that she has a special detiny (which is horribly true),\nand now only Julian might be able to turn her from her path.\n* Cynthia's Journal - In her hut is a journal that describes her facination with the\nteachings of the Tcho-Tcho priest and her belief that a new sun shall appear in the\nsky. The journal describes the arrival of Silas Patterson and his interest in the\nTcho-Tcho rituals. She also writes of her mixed feeling about sending the 'present'\nto her father, but the priest insists that he cannot be allowed to interfere.")
                                              )
                                            ),
                                            Core.vx_new_string("Tcho Tcho Island"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Tcho Tcho Island"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Kidnapping - The arrival of strangers, convinces the priest that the moment has\ncome. He sends men in the night to meet with Cynthia, and she eagarly goes with\nthem. The local Adamanese raise an alarm and many flickering torch lights can\nbe seen from the island.\n* Tcho Tcho Tribesman - The Tcho Tcho are more asian in appearance than the average\nAdaman. They are all violent fanatics and will hunt down and capture anyone who\ninvades their island. There are 10 males, 6 females, and 3 children on the\nisland.\n* Tcho Tcho Priest - The Tcho Tcho priest leads his tribe. He is a long time\nexplorer in the Dreamlands and there he has the form of a twisted dwarf (reflecting\nhis personality). In combat, the priest stands back and casts spells (Dread\nCurse of Azathoth and Withered Limb) while his comrades fight and die.\n* Fossil Quarry - An exposed rock in the jungle is covered with fossils of\nprehistoric arthopods including millipedes, scorpions, and spiders. This rock is\nthe source of the spider from the Baxter home, brought to life by the Child of\nAtlach-Nacha spell cast by the Tcho Tcho priest. A single enormous spider\nsix-feet across can be found here, and the priest will animate this spider if\nhe gets the chance. Note: Any damaged fossil cannot be reanimated.\n* Obelisk - In a clearing near the villiage rises a black stone, twenty foot\nmonolith. Though weathered by time, precise geometric designs are clearly\nvisible. These designs are are disturbing to the eye and create a sense of\nvertigo. Out of the corner of one's eye, they seem to swirl and pulse. If one\nlistens to the stone an almost impercetible rhythmic throbbing can be heard.\nCrude stones are set up around the obelisk covered in primitive drawings of\nspiders chasing and consuming tiny humans as shooting stars fall from the\nheavens.\n* Metamorphosis - On the night Cynthia is 'kidnapped', she goes directly to\nthe Obelisk. There the tribesmen have gathered to begin the ceremony. Near the\nObelisk are bound the 2 escaped killers that Major Nichols warned of as well\nas any other captured males. Cynthia stands before the altar, removes her\nclothes and sways to the Tcho Tcho songs. Eventually, she stops, bends over,\nand the skin along her back splits wide open, revealing a shiny black surface\nthat pulses horribly. As the wrinkling empty skin of Cynthia Baxter is pushed\nforward, multple legs spill out from the discarded molt, waving feebly, as the\nhuge spider-thing pushes clear. The priest dones Cynthia's discarded skin and\nwears it like a coat.\n* The Wedding Feast - Cynthia's new form is not hard enough to move freely\nuntil dawn. In the meantime, she is ceremonially wedded to the male sacrifices\nbefore she drags herself to each one and begins eating the flesh from the\nvictims head. She finally sucks the brains out through the eyesockets. Each\nfeast takes 20 minutes, and after each is consumed, the still animate corpses\nwith exposed skulls are freed and shamble mindlessly off into the forest. The\nOnge people sense the threat of the Tcho Tcho and attack the Tcho Tcho. The\nTcho Tcho defend Cynthia and the priest as they escape. The Onge will not\npursue the Tcho Tcho into jungle at night. Instead the free any remaining\nprisoners and wait for light. The priest makes his way to the prehistoric rock\nand casts Child of Atlach-Nacha to animate the giant spider there.\n* Daughter of Atlach-Nacha - At dawn, Cynthia is fully formed and begins a\n3 hour trek across the island to the Caverns of Atlach-Nacha. She is\naccompanied by hordes of spiders that crawl around and over her. Any who\nfollow will constantly be treading on spiders and have spiders dropping upon\nthem from the trees. Their bites are painful but are not dangerous.\n* Caverns of Atlach-Nacha - Cynthia travels to a 20 foot cave opening where\nher father dwells. If she is pursued, she will wait in ambush for her pursuers.\nIf the investigators are foolish enough to continue searching, they will\ntravel through twisting caverns deeper and deeper for over an hour before the\ncave opens into a vast chasm nearly filled with thick, ropy webs. Continued\nactivity attracts [Atlach-Nacha] himself who resembles a hideous, black, hairy\nspider with a strange, remotely human-like face with little red, hair-rimmed\neyes.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Ulthar and Beyond"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Ulthar and Beyond"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Exploring Ultar"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Exploring Ultar"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Phillip Baxter's dream journal leads the investigators to start exploring\n[Ulthar] in the Dreamlands.\n* Phillip's Dreamform - At some point someone will notice that Phillip Baxter\nis watching them from a distance. If anyone approaches, his head disappears\nin a cloud of mist and then he vanishes.\n* Procession of Burgomaster Kranon - Trumpets announce a parade throught the\nstreets for Burgomaster Kranon. The Burgomaster is immediately recognizable\nas Matthew, Julian Baxter's ward. In the Dreamlands, his emotional and mental\nhandicaps don't exist. If the investigators can get an audience, Krannon can\nbe convinced to help them, both here and in the real world.\n* Cthaat Aquadingen - At the [Library at Ultar], the investigators can\nsearch for the [Cthaat Aquadingen]. The book is bound in soft, human skin,\nstill pliable, and always moist from perspiration welling from its pores.\nSimply handling the book is creepy. Within the book can be found a quote:\nThe stars fall, the beast bred of stone rampages, and a time of great change\ncomes. Deep within perfumed Kled, where life turns to death, the Watcher in\nthe Glade knows the time and place of the coming. Chinese notes are written\nin the margin of the page. If they are translated, they comment that the\nPnankotic Manuscripts mentions the Watcher in the Glade.\n* Pnakotic Manuscripts - If read, the manuscripts describe that the Watcher\nin the Glade is the Great Old One Yibb-Tstil. Priests of Yibb-Tstil meet at\nthe great pool in front of the ivory palace. Priests then grovel on hands and\nknees before Yibb-Tstil and must not look upon him.\npriests of\n* Carnival - While leaving Ultar, the dreamers chance upon a carnival tent. A\nbarker announces that they have the only captive Colossal purple spider from\nthe distant north. Admission is a dime or anything of value. The interior of\nthe tent is larger than the outside would suggest, and in a barred cage at\nthe back of the tent is a purple spider the size of a car hovering over the\ndessicated body of a sheep. If anyone tries to talk to the spider, it speaks\nin a thin, dry voice. It is, however, not helpful and eventually hisses. The\nbarker comes running in and ushers them out. If they want to speak more, the\nbarker says: 'It is not up to me you see'. The spider then says: 'After all, I\nam the master here.' If the barker is questioned about the dwarf who works\nhere, he tells them the dwarf quit some time ago and headed to Kled.")
                                              )
                                            ),
                                            Core.vx_new_string("Journey to Kled"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Journey to Kled"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The perfumed Jungle of Kled can be reached by traveling North from the\nEnchanted Wood to Thran. At Thran a elephant caravan can be taken over land or\na river boat can be taken to Hlanith where passage on a ship can be found to\nKled.\n* Numerous ivory palaces dot the jungles. If the dreamers ask about the great\npool mentioned in the Pnakotic Manuscripts, the guides recognize it as the\nPalace of the Sacred Fount.\n* Palace of the Sacred Fount - The palaces is one of the less feared locations,\nthough it is still avoided. As with other ivory palaces in Kled, the palace\nis somehow physically in perfect condition though the rooms are empty and the\nfloors are thick with dirt and leaves. The smell in the area is a unique musky\nodor that immediately reminds the dreamers of the smell during the dream of\nthe death of Phillip Baxter. The front hallway is an atrium where rain water\nfalls to collect in a rectangular pool. At the far end of the pool stands a\nhuge jade statue of an evil-looking hyena. The statue leers with gaping jaws\nover the pool. The apparently bottomless pool is dark and filthly from rotting\nleaves, a peculiar oily film covers its surface. Despite its appearance the\npool is not dangerous.\n* Phillip's Ghost - A distant cackling sound can be heard. Following the\nsound, the dreamers find a stairway going down many flights with torchlight\nbelow. At the bottom of the stairs, the dreamers find a torchlit hallway with\na cell at the end. Within a cackling dwarf uses a human femur to visciously\nbeat a glowing, partially headless, staggering figure. The dwarf is hunched\nand misshapen and has a terrible, inhuman face. Its lips are drawn into a\nsnarl over three-inch fangs. Its eyes are glowing red pits. The figure is\nthe dreamform of Phillip Baxter. If he is rescued, his headless form is\nmindless and helpless. The dwarf with not help under any circumstances.\n* Path to Yib-Tstll - Behind the Palace the jungle becomes stunted and\ntwisted, tree trunks are bent at odd angles, and a general sense of\ndisease pervades the growth. Futher on, alien foliage begins to appear\nincluding quivering fungi and twisting weird ferns. Further still, a\ngreat stone arch can be seen surrounded by dead trees. Through the arch\ncan be seen another alien jungle evidently on a far-off world. The arch\nis clearly a permanent gate, and plants and insects can be seen crossing\nboth ways as if the arch were simple stone.\n* World of Yib-Tstll - Beyond the arch, the sky is dark green and\nstarless. Swollen insects swoop ominously from deadly-looking blooms.\nFlying horrors with veinous wings fly high above. Not far away, a vast,\nblack clearing is visible.\n* The Clearing - The clearing is roughly a mile across. The black surface\nis composed of fine flakes like snow, but it is warm to the touch. If the\ndreamers heed the Pnakotic Manuscripts, they should crawl on hands and\nknees across the black clearing facing the ground to avoid actually seeing\nYibb-Tstll. As the dreamers near the center, Yib-Tstll rises suddenly\nfrom the black clearing. Dreamers may attempt to avert their gaze or\nsuffer the madness induced by his presence.\n* [Yibb-Tstll] - The massive being speaks telepathically with a booming\nalien voice. Each dreamer must make a [Spirit] test or Yibb-Tstll will\nignore that person completely. If the test is completely failed,\nYibb-Tstll will touch the person and impart its feared reversal.\nYibb-Tstll is suprisingly helpful and will answer questions about the\nCthulhu Mythos and things of cosmic import including Nemesis, but he will\nonly give a single answer on a subject and will not clarify himself.\n* Reversals - Any dreamer who suffers a reversal will instantly be\ndriven insane or his human form or dream form will be permanently killed.\nIf an insane dreamer is brought to him, Yibb-Tstll will fully restore\nhis sanity. If the dwarf is present, Yibb-Tstll will reverse him, and his\ndream form will change into the Tcho-Tcho priest while his real form will\nbecome the dwarf. If the headless form and the ghoul's page are brought\nbefore him, he touches them both and Phillip Baxter's dream fomr is\nrestored, but back in the real world, Silas Patterson has become a mad\nimitation of Phillip Baxter.\n* Web of Eibon - Yibb-Tstll instructed Eibon in his construction of the\nWeb of Eibon spell with which he planned to freeze time around Nemesis\n(and Earth) to prevent Earth's destruction. Yibb-Tstll knows his efforts\nwill fail in the end, but it provided the instructions anyway.")
                                              )
                                            ),
                                            Core.vx_new_string("The Quest of Ghouls"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("The Quest of Ghouls"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Ghoul Dream - After the events at St. Augustine and the Dreamlands, one\nnight the investigators find themselves having hazy dreams of the\ngraveyard at St. Augustine. Suddenly, the dream sharpens and 3 figures\nstart crawling from an open grave: ghouls like the ones that may have\nbeen seen at St. Augustine. The ghouls stinking breath reeks of death and\ndecay. The ghouls do not appear to be hostile, instead they start urging\nthe investigators to come with them to see the wise man and there is\nlittle time left before dawn. A terrific stench issues from the open\ngrave. Below rotten bits of wood and fabric lie on the grave floor and a\nnarrow, twisting tunnel leads into darkness. The ghouls gibber that they\nmust hurry and start climbing down the hole. If the dreamers don't follow\nthe tunnel begins to slowly close. If the dreamers still do not follow,\nthey awake normally, but the opportunity to learn more has been lost. If\nthey do follow, the tunnel collapses behind them and they will have to\nfollow the ghouls forward.\n* Grath the Leader - Young and handsome by ghoul standards, Grath leads\nthe group and most often speaks with the dreamers. He had a riding zebra,\nbut the group got hungry and ate most of it.\n* Mairpl the Big - Mairpl is much larger than the others, speaks little,\nand wields a club in battle.\n* Ug the Hungry - The worst and most degenerate of them, Ug speak no\nhuman language and spends most of his time on four legs. He avoids the\nhumans, but can often be seen staring and drooling over them. He possess\nno threat, but he likes to fantasize.\n* The Page - At the end of the tunnel waits the Page. The Page is wrapped\nin a dirty brown cloak with his face hidden. His body is bent forward\nand staggers under the weight of an enormous tombstone chained to his\nback. The ghouls order the Page around and play viscious practical jokes\non him. Below the hood can be found Sila Patterson's face, though it\nshows no recognition. Upon the tombstone is written 'Phillip A. Baxter\n1865-1925.' The Page is, of course, the dream form of Silas Patterson,\nsuffering from the guilt of the death of his friend.\n* The Quest - The ghoul gang seeks to rescue a female ghoul Horella who\nhas disappeared. The ghouls are fairly melodramatic about how beautiful\nshe is and how they must rescue her from whatever peril she is in. To\nfind Horella, they seek the insight of the wise Man of the Mountain. This\nman supposedly is very wise and will answer any questions.\n* Social Ettiquette - After a few hours of travel, the ghouls stop for\nnourishment. They squat down and rummage through their stained sacks.\nThey produce vaguely familiar cuts of raw meat with tinges of green along\nwith sour wine. The source of the meat is all too obvious. The ghouls\nlike their food well-aged and, out of respect, offer their guests the\noldest pieces. The bags also contain the remains of Grath's zebra which\nthe ghouls are more than happy to hand over, leaving the tastier pieces\nfor themselves.")
                                              )
                                            ),
                                            Core.vx_new_string("Journey to the Stony Desert"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Journey to the Stony Desert"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* The Underworld - The ghoul tunnel leads to the Underworld. Once in the\nUnderworld, the tunnel leads upward for 3 days through the center of a\nhuge mountain. Many ohter tunnels branch off, but the ghouls seem to know\ntheir way. Drinking water oozes down the rock wall. Bloated fungi, pale,\nfoot-long crickets, and eyeless carnivorous rats server as food. Most of\nthe trip is in complete darkness. Occasionally, luminescent fungi provide\na tiny amount of light. The tunnels connect the Vaults of Zin where\ndangerous ghasts, serpent folk, or worse may be encountered. Eventually,\nthe group exits the Underworld at the border of the [Stony Desert].\n* [Stony Desert] - Grath says the journey eastward across the desert will\nonly take a few days. They seek the sacred mountain [Mt. Hatheg-Kla] where\na holy man can tell them where fair Horella can be found.\n* Walker of the Stony Desert - A few days journey into the desert, the\ndreamers see, off in the distance, a man leading a horse. They will meet\nin about an hour. As they draw near, it is clear that the man is enormous,\ntowering over the horse. He is 8 feet tall, 400 lbs, and dressed all in\nblack. His horse seems old and tired and lags behind being pulled by a\nrope. The horse is an elderly nag with cataract films covering both eyes.\nThe ghouls are terrified of the man and will not approach. He does not\nstop walking unless he is attacked. This being is the dream-form of Eibon.\nthe Hyperborean wizard who, like the spell he cast to capture Eibon is\nbound to travel back and forth across the Stony Desert. A legend says\nthat one day he shall find a way out of the desert. On that day, the\nhorse shall be healthy and the man shall then ride the horse. Where he\ngoes then, he does not know for the horse shall be the master. He freely\ndiscusses his trip across the desert, Mythos knowledge, Nemesis, and his\nspell the Web of Eibon that Yibb-Tstl taught him. He now knows that\nstagnation is worse than destruction by Nemesis. If asked about Nemesis,\nhe produces a large, shining jewel from the air and offers it to the\ndreamers. He says simply that all brave souls will know what to do when\nthe time comes. Any attempt to attack Eibon results in him disappearing\nand reappearing far in the distance continuing his endless travels.")
                                              )
                                            ),
                                            Core.vx_new_string("The Man on the Mountain"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("The Man on the Mountain"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* [Hatheg-Kla] - A day or two after meeting the Walker, the slabs become\nmore numerous. As they approach Mt. Hatheg-Kla, smoe of the slabs are\nstill turned upright in the ground and bear traces of ancient carvings.\nSoon it becomes obvious that they are travelling in a titanic graveyard.\n* Climbing Hatheg-Kla - Mairpl assures them that this is the only way to\nsee the holy man and ask where Horella is being kept. The other ghouls\nwill wait here while Mairpl and any brave dreamers attempt the climb.\nThe way up seems somewhat trecherous and will require a [Climb] roll to\nsucceed. If that roll fails, a second [Climb] roll must be made to catch\nyourself before you fall to your doom. Unfortunately, Mairpl fails both\nrolls and falls far below splattering on the rocks and potentially\ninjuring those below. After a short period of remorse, Grath and Ug\ngather some of the larger pieces and add them to their provision bags.\n* The Man on the Mountain - Near the skull tree, an old, bearded man in a\nyellow robe sits on a heap of corpses plundered from the cemetary below.\nHe deftly uses a silver hatchet to cut pieces of the corpses and flings\nthe dripping gobbets above his head as the circling Byakhees swoop down\nto catch them from the air. As the dreamers approach, the Byakhee scream\nand chatter, but the man pays them no mind. If hailed, he smiles warmly,\nand if asked questions he will honestly answer based on his vast\nknowledge of the Dreamlands and the Mythos. Knowledge comes at a price,\nso before he answers each question, he hurls his hatchet at the questioner\nwhich instantly slices off an appendage, starting with a hand. The Byakhee\nswoop down and eat the tidbit. The wound does not bleed and only hurts for\na moment. The damage is permanent in the Dreamlands, but each time a\ndreamer returns to the Dreamlands one wound is healed. If asked, he tells\nthat Horella is at the castle of Bombel, the giant, in the hills to the\neast of the [Stony Desert]. Anyone foolish enough to attach the man, is\nattacked by the Byakhee, rended to pieces, and eaten.\n* Cave of the Child God - Behind the tree, the shear face of Hatheg-Kla\nrises another 1000 feet before the cave entrance. A flight of steps, each\none foot wide, criss-crosses back and forth up the slope. Anyone nearing\nthe opening hears a deep sobbing and suckling sound as if from some\nenormous infant. The cave itself is completely black and no light will\npenetrate it. If anyone enters, a few seconds later, horrifying screams\nof agony echo from the cave accompanied by sucking, popping sounds and\na soft, cooing voice. The screams continue for almost a minute before\nthey are choked off by a gurgling, bubbling sound and a huge spray of\nblood that shoots from the cave. The character's dream-self is dead, and\nhis waking self has been driven mad by the horrific dreamform of Nemesis.")
                                              )
                                            ),
                                            Core.vx_new_string("Castle of Bombel"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Castle of Bombel"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* To the Castle - The Man on the Mountain has directed the dreamers\ntoward a castle to the east of the [Stony Desert]. The trip takes a few\ndays through the desert and another day throught wooded hills.\n* The Castle - The rude, three-story castle is in a clearing. It has a\nsingle window at the top and a door at the bottom.\n* Bombel - Near the castle, sitting on a boulder is a huge [Gug]. At the\nfirst sign of intruders, it rushes to the attack.\n* Horella - Shortly after Bombel starts fighting, a foul-looking, scaly\nghoul appears in the window. This is Horella, and she immediately begins\nhurling vile insults and rocks at the Gug. The ghouls are cheered on by\nher presence, but if someone listens they realize that she is exhorting\nBombel to kill the intruders. Dreamers may also notice previous bruises\non Bombel's head. If Bombel falls, Horella turns her insults and rocks\nat her would-be rescuers. Any remaining ghouls grab a chain from their\nbags, say 'To the rescue', capture Horella, and drag her bumping down\nthe stairs. The ghouls bid farewell and will offer the page as a reward\nfor the dreamers help.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string("Nemesis: Spawn of Azathoth"),
                                    Core.f_new(
                                      Base.t_section,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Nemesis: Spawn of Azathoth"),
                                        Core.vx_new_string(":scenariomap"),
                                        Core.f_new(
                                          Base.t_scenariomap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Trip to Darjeeling"),
                                            Core.f_new(
                                              Base.t_scenario,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Trip to Darjeeling"),
                                                Core.vx_new_string(":summary"),
                                                Core.vx_new_string("* Francis Wilson - Francis is one of the Tuesday Night Academy. He was at Phillip's funeral and he has been in Russia researching the Tunguska Blast and its possible relationship to Nemesis. He has made some discoveries and sends a telegram to Judge Braddock who forwards it along. The message says to leave immediately for Darjeeling, India and to meet Colonel Hugh Huntley of the British Foreign Office.\n* Darjeeling -\n* Colonel Hugh Huntley - Francis has arranged with the British Foreign Office to allow the investigators to travel to Lhasa, Tibet to aid him in his research. Colonel Huntley provides them with papers and can help arrange transport to the British Legation in Lhasa where Francis Wilson is staying.\n* Road to Lhasa - The 400 mile journey to Lhasa can only be taken on foot or via horse-drawn caravan. The route is heavily trafficked by pilgrims, traders, smugglers, and spies. The journey takes weeks and is alternately terrifying, boring, facinating, cold, and misery-making.\n* Lhasa - Lhasa is a sprawling squat city with no building taller than 2 stories except for the Potala, the home of the Dalai Lama. The Potala is a bulky, stone structure that is imposing but unattractive.\n* The British Legation - The Legation is on the outskirts of Lhasa. Here Francis Wilson has residence. He seems thinner and more stressed than at the funeral. He has been researching the Tunguska Blast and mad Rasputin's apparent presence at the blast. After piecing together his research, he illegally entered the Soviet Union and stole parts of Rasputin's journal. He then fled to Tibet through Mongolia. He has been translating sections since then. He claims that Rasputin met someone called Eibon in his dreams, and that this Eibon told him of his own death. Eibon also warned him of a dark star that would fall from the sky. This Eibon gave him a stone that he used to destoy the star. He further foretells another dark star that would fall long after Rasputin's death in Tibet. Francis guesses that the location may be near an abandoned temple roughly 300 miles north of Lhasa. He has found a guide Lha-bzang who studied in the temple as a child.\n* Lha-bzang - Francis plans to travel there soon with a native Tibetan, Lha-bzang. Lha-bzang is a domden, a Tibetan mortician. A skilled Anthropologist may recall that Tibetan funeral rites involve the corpse being hacked to bits by the axe-wielding domden and then fed to ravens or vultures. Lha-bzang's dream form is the holy man on the mountain. Lha-bzang is going on the journey to expand his spiritual understanding. Unfortunately, he has also been paid off by a Soviet spy. If questioned about the temple, he says he was sold as a slave as a child but he fled the temple when he realized that their teachings were not Buddhist.\n* Ivan Dorkyev - A Soviet spy who has been tracking Francis down since Francis stole Rasputin's journal in Leningrad. He is over 6 feet tall and is dressed in the tattered robes of a yak-herder. Beneath, he carries two pistols, a knife, and a bandolier of ammo. He hides at his camp in the mountains near the ruins waiting for Lha-bzang to bring Francis.\n* Trip to the Ruins - Lha-bzang leads the expedition 300 miles through a tangle of steep mountain passes, brackish lakes, and arid valleys. On the way, they encounter kay-herders, small mountain monasteries, and moutain farms. About 2 weeks in to the trip, while camped, a minor earth tremor shakes everyone awake. A week laker, they arrive at the Nenmka temple, sitting on the slope of a mountain.\n* The Temple - The temple is now just a windswept ruin. A Mythos knowledge test reveals that the fallen columns have inscriptions used to invoke Hastur. The Soviet spy has watched the investigators approach and waits in hiding nearby. Lha-bzang finds a section of flooring with symbols on a tile. Here he will perform a ceremony to discover more about Nemesis.\n* The Ceremony - Lha-bzang sits and lights a clay pipe containing a tarball of hashish. He passes the pipe around and then begins a droning wail. After 30 minutes, he retrieves a knife and a freshly severed human hand from his bag. He cuts his own palm, smears blood on the hand, and binds the cut. He then passes the knife to each person to do the same. If any will not, he gestures for them to leave the prayer circle. After another 5 minutes, the hand twitches and then turns toward Lha-bzang. He asks where can they find the Seed of Nemesis. The hand then crawls to a symbols on the ground indicating 'not far' and 'north-east'. Additional questions may be asked but each question causes the questioner to receive a minor Sanity Wound. Answers are always very short, and the hand only knows local events. The Soviet spy waits nearby but has accepted Lha-bzang's demand to allow the ceremony to complete before acting.\n* Confrontation - Just as the ceremony is concluded, Ivan steps into the room brandishing his pistols and warning everyone to stay where they are. He is deadly serious and will gun down anyone who makes sudden movements. Ivan plans to take Francis back to the Soviet Union to stand trial for the many laws he has broken and suspiscion of being a spy. He has no knowledge of Nemesis and has nothing but contempt for the superstitious, religious ritual. If given the chance, he will tie up the investigators and then take Francis and Lha-bzang (his ally) in the morning.\n* The Fallen Seed - In the early morning, everything changes. Along with the bright sun, a halo forms in the sky, though this halo does not surround anything visible, yet. Dorkyev is thunder-struck; he and Francis exchange words in Russian. Ever the pragmatist, Dorkyev frees everyone and begins a descent toward the valley under the halo. Within the valley, the halo light is flat and oily, and its color melts through shades of yellow and green as though through a prism. Lha-bzang vomits and flees. Suddenly, all present feel their hair stand on end as the halo darkens and takes on a dull gun-metal hue. The slight wind disappears and everything is silent. Then, high above a sizzling sound grows in intensity. Suddenly a hideous scream is heard followed by a thunderous blast that knocks everyone off their feet. Everyone suffer partial hearing loss and if a check versus [Body] is completely failed, the loss is permanent. A blinding light rips through the sky and crashes to Earth over the valley ridge that Lha-bzang crossed. A massive explosion rocks the ground and a curtain of flame passes overhead. If not for the ridge, everyone would have been incinerated along with Lha-bzang.\n* Crater - Peeking over the ridge, a 20 foot crater can be seen with a sickly, green light emanating from it. Wilson frantically says that Eibon's symbol must be placed on the Seed or it will destroy the Earth. Those who have witnessed the Seed in Montana know that any who approach the Seed will die: quickly or slowly. If no one volunteers and no one has a plan, Dorkyev swears, snears of their cowardice, and takes the jewel to the crater. Alas, just as he climbs the crater and is exposed to the light, he screams and immediately melts into a puddle before everyone's horrified sight. Worse, he drops the jewel into the crater. If someone uses a mirror, they can see the jewel near the Seed which is slowly melting the rock around it with its terrible power. Wilson adamantly refuses to go (and will melt if pushed), so someone will have to sacrifice themself or watch the Seed sink into the ground and doom the world.\n* Eye to Azathoh - The doomed person must resist the corrupting rays, retrieve the jewel, and then touch it to the Seed. Nothing happens for a few moments, then the Seed suddenly shimmers and disappers with a sharp pop. The Seed is gone but a black, marble tunnel lies in its place. The jewel lies on the ground before the tunnel. Hyperborean symbols line the tunnel. This is Eibon's work. When the jewel crosses the threshold, it suddenly reverts to the heavy glowing stone from the Dreamlands. There is a steady breeze down the tunnel and a light can be seen ahead. After 100 meters, a room 250 meter, circular opens up. The room is the exact same shape as the jewel. The breeze has become a howling gale ending in a 5 meter gateway in the center of the other end of the room. The gateway in the center of the oval room gives the impression of an eye looking out into space.\n* Gateway - The gateway can be reached by a ramp that slopes upward 50 meters. Stars can clearly be seen through the opening, and it is clear that the gate leads directly into outer space. Anyone who has been exposed to the Seed radiance, has an intense desire to go through the gate and join Nemesis. Anyone approaching the gate will need ropes or climbing skill to cling to the reliefs on the floor or be sucked into oblivion. Also, the jewel gains weight as it approaches the gate, as if it is resisting, eventually becoming over 100lbs. If someone can get close or has binoculars, that person will see that the area of space beyond the portal is filled with criss-crossing black lines forming a faint web. Someone may recognize the black substance and The Black associated with Yibb-Tsll. This is Eibon's Web taught to him by Yibb-Tsll. Within the web, an observers intuitively senses that time is slowing to a crawl. Further, the web is creeping through the portal into our world. This is how mad Eibon hoped to save mankind, by freezing us forever in time, so Nemesis can never destroy us.\n* The End - If the jewel is brought near the gate, in addition to its increased weight, the Black lines start to reach toward the jewel. Simply hurling the jewel through the portal will gather all the webs onto the jewel which breaks the spell of Eibon. If anyone returns to the Stony Desert, they will no longer find Eibon there. The world will no longer be trapped forever in frozen time, but Nemesis will still return some day to end the world, but it will not be today.")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Julian Baxter"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Julian Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Julian Baxter is a priest and brother of Phillip Baxter. He is confined to a\nwheelchair and is heavily dependent on his son Matthew. Before becoming a priest,\nJulian was educated as a psychotherapist. He has traveled the world on missions, but\nsince becoming crippled he has returned to his home town.\n* Julian has a copy of the Book of Eibon in his library. It has a section\nwhere Eibon fortells the end of mankind with the coming of Nemesis. Eibon\nwas obcessed with preventing man's destruction and spent the rest of his\nlife developing a ritual call the Web of Fate that would supposedly save\nmankind when the time was right. Eibon claims that as Nemesis approaches,\nthe Web of Fate will draw together seemingly unrelated events, defeat\nNemesis, and create an eternal golden age for mankind. The reading clearly\nshows Eibon's progressive descent into madness.")
                                      )
                                    ),
                                    Core.vx_new_string("Matthew Baxter"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Matthew Baxter"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Matthew is the adopted, grown son of Julian Baxter. He is strong, but he is also\nmute and aeuteistic. This combination makes him appear simple, but he is actually\nquite competent. He is an avid dreamer where there is no trace of his aeutism. In\ndreams he is a city council member in Ultar. He can be a strong ally, but he must\nbe approached in the Dreamlands, as it is impossible to gain his friendship in the\nreal world.")
                                      )
                                    ),
                                    Core.vx_new_string("Silas Patterson"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Silas Patterson"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Silas is a friend of both Phillip and Julian Baxter, a past professor at Brown\nUniversity, a former antrhopologist, and a member of the Tuesday Night Academy. He is\nquite fit considering his age.\n* Silas met Julian Baxter in the Congo in 1904 and became friends. In 1919, he met\nCynthia Baxter, Julian's niece in the Andaman Islands. In 1920, he came to Providence\nwhere he met Phillip and joined the Tuesday Night Academy. Phillip soon after helped\nhim get a teaching position at Brown.\n* Silas practices a form of cannibalism he learned in New Guinea at the instruction\nof a degenerate Tcho-Tcho priest. The ceremony involves eating the brains of a\nrecently slain primate to gain extended life. This habit made him lose his job at\nBrown when it was discovered that he was stealing monkey corpse from the lab. He has\nsince made an arrangement with a local undertaker with low moral character, Alvin\nBeswick. Silas told Beswick that he was performing brain research, but Beswick is\njust concerned with the money. Beswick allows him access to closed coffin corpses\nfor a price. He was given access to Phillip's corpse and noticed the small bite marks\non the scalp. While devouring the brain, Phillip suddenly lurched back to\nconsciousness and thrased wilding before dying. Silas was terrified and is wracked\nwith guilt over his friend's death. He is maintaining his sanity through denial, and\nif he is forced to confront what he has done, he will retreat inward and become\ncatatonic and need to be institutionalized.\n* Silas is friendly, but he not only knows his role in Phillip's death but is\nreasonably sure that Cynthia was involved. He is planning to return to the Andaman\nIslands to investigate Cynthia's activities and also because it is getting hard to\nhide his youth in Providence.\n* In Sila's desk can be found notes for his next book, about cannibalism. The notes\nindicate that Silas is unbalanaced. In his files can be found the lease to a\nfarmhouse.\n* Investigating the farmhouse, leads to the table where Phillip met his end. No\nattempt has been mde to cover up the crime.")
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
            Core.vx_new_string("Kingdom of the Gods"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Kingdom of the Gods"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Kingdom Undead"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kingdom Undead"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Resurrection Herb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resurrection Herb"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This rare herb is believed to return the dead to life. Actually, it is the tiny worm eggs that grow on the plant that infect the host and turn them into a zombie.\n* Infection - The worms can infect a living host if worms, their eggs, or infected flesh are eaten (even cooking is not a guarantee of safety) or the worms transfer via an ghoul bite. A recently deceased host may also be infected if the eggs are injected directly into the brain.\n* Transformation - Once infected the worms rapidly multiply by division and move through the body. Once fully infected, the worms act as replacement nervous system, stimulating the cells and retarding cell death. The worms stimulate the primitive sections of the brain to cause it to seek more hosts for the worms. The When they first activate the body, its movements are jerky and extreme, but the body quickly adapts and becomes quite agile over time.\n* Pack - The worms are a colony creature and are aware of nearby worms in infected creatures. They, therefore, do not attack other infecteds and tend to collect together in groups.\n* Intelligence Level - Though they are savagely murderous and largely fearless, they do retain an animalistic survival instinct and take shelter and avoid fire and heat which would kill their worms.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Kingdom Ghoul"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kingdom Ghoul"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Strengths:\n** Agility and endurance: In some scenes, they were able to bring down a full-size horse and nearly match the speed of one for short, sustained periods of time.\n** Short incubation period: It takes about 15 seconds to 1 minute for a victim to turn into an undead zombie. Making them effectively at multiplying and overwhelming urban centres. However, this can vary. One main character was able to resist the infection for over 2 minutes.\n** Durability: It has been observed that even if their internal organs are exposed or took a direct stab from a sword to their chest, this doesn't kill them.\n** Heightened sense of smell: A fresh drop of blood from an uninfected human can attract other infected bodies many meters away.\n* Weakness:\n** Decapitation: They're capable of taking damage that would be fatal to most men. It was found that decapitation or destruction of the head is the most effective in killing them.\n** Aversion to water bodies: It has been observed they will generally avoid travelling on water bodies. They have no ability to swim, and when they are pushed into deeper waters, they will immediately sink to the bottom.\n** Heat: They have been observed to immediately seek shelter when the day begins to break in order to escape the heat of direct sunlight. As a result, during spring or summer, they are only active during the day and hibernate at night.\n** Fire: Fire can be used to keep infected at bay.\n** Reduced vision: The milky eyes limits their vision to basic movements, so they rely on smell and hearing to hunt.\n** Blood: Blood can be used to distract or bait the zombies to behave in certain ways. Although dangerous, using fresh blood on rooftops is shown to be an effective means to lure zombies if needed.")
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
            Core.vx_new_string("Night of the Living Dead"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Night of the Living Dead")
              )
            ),
            Core.vx_new_string("Serial Killers"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Serial Killers"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Unstoppable Killer"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unstoppable Killer"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Friday the 13th, Nightmare on Elm Street")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Deadly Beasts"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Deadly Beasts"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Jaws, Phase IV, Them")
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
    mapfunc.put("tacticsbook", Horror.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/horror", maptype, mapconst, mapfunc);
  }

}
