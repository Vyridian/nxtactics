package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Characters {

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
        "nx/tactics/books/characters", // pkgname
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
      output = Characters.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Characters.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Characters.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Characters.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Characters"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Characters.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Characters Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Characters Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Characters and Stories?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Characters and Stories?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Creating Characters"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Creating Characters"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Attributes\n* Skills\n* Equipment\n* Personality\n* History\n* Friends and Family\n** Dependents\n* Enemies\n** Hunted"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Personalities"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Personalities"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Positive\n* Adventurous - Someone who is adventurous enjoys adventure and takes risks.\n* Affectionate - Someone who is affectionate shows their love for other people.\n* Ambitious - A person who is ambitious wants to be successful in their career, studies, sport.\n* Brave - A brave person wants to do difficult or challenging things and is not afraid.\n* Chatty - Someone who is chatty enjoys talking to other people a lot.\n* Cheerful - A cheerful person smiles a lot and is happy.\n* Confident - Confident people feel sure about their own ability and present themselves well to other people.\n* Creative - Someone who is creative is very good at designing or making things.\n* Determined - A determined person makes a definite decision and does not give up.\n* Easy-going - Someone who is easy-going is quite relaxed and accepts things as they are.\n* Enthusiastic - Someone who is enthusiastic shows lots of interest in something and is very positive about it.\n* Frank - Someone who is frank is honest and direct in what they say.\n* Friendly - A friendly person always talks to other people and perhaps helps them too.\n* Funny - Someone who is funny makes people laugh.\n* Generous - A generous person is kind to other people, may give presents or lend money.\n* Hard-working - Someone who is hard working always puts a lot of effort into their work.\n* Helpful - A helpful person is always happy to help other people.\n* Honest - An honest person tells the truth and never steals or cheats.\n* Imaginative - An imaginative person has good ideas or is good at creating stories or artwork.\n* Intelligent - Someone who is intelligent is good at learning. This person may think about things in a logical way.\n* Kind - A kind person cares about other people and behaves positively towards them.\n* Loyal - Someone who is loyal will always support his or her friends.\n* Meticulous - A meticulous person pays careful attention to detail, probably has a tidy house and neat handwriting!\n* Modest - Someone who is modest does not show off about his or her abilities or possessions.\n* Optimistic - An optimistic person has a positive view of life and expects good things to happen.\n* Outgoing - An outgoing person is very sociable.\n* Patient - Someone who is patient does not get annoyed or frustrated easily and has time for other people.\n* Reliable - A person who is reliable can always be trusted to do what is required.\n* Sensible - A person who is sensible makes decisions based on reason/logic, does not take risks.\n* Sensitive - A sensitive person is very aware of other people’s feelings, can be easily hurt emotionally\n* Sincere - A sincere person is honest in their relationships with others and says what they think or feel.\n* Sociable - Someone who is sociable loves chatting with other people.\n* Sympathetic - Someone who is sympathetic understands other people’s problems very well.\n* Thoughtful - Someone who is thoughtful always thinks of other people, remembers birthdays and sends a card!\n* Trustworthy - A trustworthy person is someone you can rely on to be honest.\n\nNegative\n* Arrogant - An arrogant person thinks they are very important and behaves in a overly proud way.\n* Big-headed - Someone who is big-headed talks a lot about how good they are, this person is too proud.\n* Bossy - A bossy person is always telling other people what to do.\n* Childish - Someone who is childish is silly or behaves like a child when they should behave like an adult.\n* Clumsy - A clumsy person knocks things over a lot and is not careful.\n* Cruel - Someone who is cruel is extremely unkind to other people or animals.\n* Defensive - Someone who is defensive behaves in a way that suggests they believe other people are criticising them.\n* Dishonest - A dishonest person tells lies or tricks other people.\n* Fussy - A fussy person wants everything to be done in a particular way, they are picky/choosy.\n* Grumpy - Someone who is grumpy is easily annoyed, in a bad mood.\n* Gullible - It is easy to trick someone who is gullible. This person believes something that most people would not believe, being naive\n* Impolite - An impolite person is rude.\n* Inconsiderate - Someone who is inconsiderate does not think about other people, quite selfish.\n* Indecisive - An indecisive person finds it difficult to make decisions.\n* Inflexible - Someone who is inflexible is unwilling to change their opinion or the way they do things.\n* Insecure - An insecure person does not have confidence in themselves or their relationship with other people.\n* Jealous - A jealous person feels angry or unhappy because they wish they had something that somebody else has.\n* Lazy - A lazy person does not work hard.\n* Mean - Someone who is mean is unkind.\n* Moody - A moody person is bad-tempered or has frequent mood changes.\n* Narrow-minded - A narrow-minded person is not willing to listen to the ideas or opinions of others.\n* Nasty - A nasty person is very unkind.\n* Pessimistic - Someone who is pessimistic has a negative view of the future and expects bad things to happen.\n* Pretentious - Someone who tries to look or sound more important or clever than they are.\n* Rebellious - Someone who is rebellious does not follow the rules.\n* Rude - A rude person is not polite or does not respect other people.\n* Quick-tempered - Someone who is quick-tempered becomes angry very easily.\n* Self-centered - A person who is self-centred only thinks about himself or herself.\n* Selfish - Selfish people think only about themselves and not about other people.\n* Stubborn - Someone who is stubborn does not easily change their mind.\n* Sulky - If someone is sulky they show their bad mood by not speaking.\n* Tactless - A tactless person does not show sensitivity to others in what they say, not diplomatic.\n* Unpleasant - An unpleasant person is not nice.\n* Unreliable - An unreliable person cannot be trusted or relied upon.\n* Vain - Someone who is vain is too concerned about their appearance or abilities.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Character Archetypes"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Character Archetypes"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Antihero\n* Bad Boy\n* Bumpkin\n* Coutier - Politics, Etiquette, Psychology, Fashion\n* Crafter\n* Damsel\n* Fatalist - Nihilist\n* Fool\n* Grotesque\n* Hermit\n* Knight in Shining Armor\n* Mysterious\n* Orchid - Pampered Life\n* Outlaw\n* Peacock - Showoff\n* Rake - Pleasure seeker\n* Regent - Leader\n* Rogue\n* Sage\n* Saint\n* Savage\n* Trickster - Riddler\n* Troubadour\n* Wayfarer - Wanderer\n* Wretch"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Wizard Classes"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wizard Classes"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Alchemist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alchemist")
                              )
                            ),
                            Core.vx_new_string(":Artificer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Artificer")
                              )
                            ),
                            Core.vx_new_string(":Elementalist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elementalist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Preferred Skills: Elemental Magic")
                              )
                            ),
                            Core.vx_new_string(":Necromancer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necromancer")
                              )
                            ),
                            Core.vx_new_string(":Sorceror"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sorceror")
                              )
                            ),
                            Core.vx_new_string(":Wizard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wizard")
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
            Core.vx_new_string(":Storytelling"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Storytelling"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* As Storyteller you're part artist, part writer, and mostly editor. You design\nthe overall plots and subplots, draw out the backgrounds, design the greater part\nof the cast and improvise dialog as the story goes. By describing the world\naround them, you help to define the characters. Daunting? Sure. But it's not as\nimpossible as it sounds.\n* Don't try to win. Tell a story - Storytelling isn't about winning and losing.\nIt is about drama and interaction. Trying to meet objectives is just a device to\nachieve drama. A story may be more interesting if the objective is failed.\n* Players are not your opponents - It is important to remember that the players\nand storyteller are both responsible for creating an interesting story.\n* Don't try to maintain control - Instead of a detailed plot, try to create\ndetailed situations that will play out without the characters' involvement. Then\nlet the players make their own decisions. The storyteller sets up the situation\nand the sets and props. The players do the acting. Test yourself by not talking\nevery once in a while and listen to the players. If they go silent waiting for\nyou, then something is wrong. If they are deeply interacting with one another\nand haven't noticed your silence, you are doing it right.\n* Understand the Players - Some play to gain a sense of power, others for the\nsocial aspects of being with friends, and others as a means of wish fulfillment.\nSome prefer fighting deadly foes, others prefer puzzles and riddles, others\nsimply enjoy talking in character and engaging in political infighting or witty\nrepartee. All of these desires must be juggled and given some space in the game.\nSome players are vocal and aggressive while others are shy or have trouble\nputting their ideas into words.\n* Offer Variety - Luckily juggling different player needs provides variety and\na change of pace. Switching from action to drama to tragedy to comedy provides\ndepth and realism to the story. Life never stays the same after all. Be sure\nto vary the focus of the game onto each player. Some players will regularly take\nthe focus themselves while you must steer the story toward other players by\nallowing them to notice things the busier players miss or by revolving plot\npoints around skills or special knowledge that only some players possess. If\nplayers become bored, the story will die."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Character Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Character Scenarios"),
                        Core.vx_new_string(":scenariomap"),
                        Core.f_new(
                          Base.t_scenariomap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Personal Quest"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Personal Quest"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* These are usually intense stories deeply rooted in the desires and emotions of the characters.\n* Revenge, atonement, love, family obligations.\n* Quests drive characters beyond the bounds of propriety and moderation.  Failed questors create some of the most\nclassic villains (e.g. Darth Vader).")
                              )
                            ),
                            Core.vx_new_string(":Missions"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Missions"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Missions usually begin as impersonal tasks assigned by someone else, probably to fulfill an agenda other than the\ncharacter's own.  Missions are rarely what they seem at the beginning and have a tendency to evolve into something more\npersonal.\n* Often a character's agenda becomes at odds with the mission, and he/she must make some decisions about where they\nstand.\n* Some Missions require a certain amount of detective work before or during the Mission to discover the true goals and\nmotivations behind the Mission.")
                              )
                            ),
                            Core.vx_new_string("Damage Control Mission"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Damage Control Mission"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A specific form of Mission where a situation has already spun out of control and the characters are dispatched to\n'fix' the situation.\n* Damage Control missions tend to be fast-paced with a rapidly deteriorating situation.")
                              )
                            ),
                            Core.vx_new_string("Training Mission"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Training Mission"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Training scenarios can take many forms.  They can put the characters in the position of student, teacher, or both.\n* Training can appear as another sort of scenario but has been carefully staged by the teacher.  Or Training can\nspiral out of control and become a life or death struggle.\n* Training is also a convenient plot device to gather unrelated characters together.")
                              )
                            ),
                            Core.vx_new_string("Disaster Mission"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disaster Mission"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sometimes bad things just happen.  Suddenly, the characters are torn from their comfort zone and thrust into a new\nperspective.  Disasters can be sever enough to create temporary alliances among enemies.")
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
            Core.vx_new_string(":Sets"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sets"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Settlement"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Settlement"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Settlement Level describes the general size of a settlement.  It determines the level of resources that can be\nbought and sold and the availability of exotic resources.\n\nTitles\n* Nomadic Tribe - Level 1\n* Town - Level 4\n* Large Town - Level 6\n* Small City - Level 8\n* City - Level 10\n* Metropolis - Level 12\n* Urban Sprawl - Level 14\n* Planetary Sprawl - Level 16\n* Galactic Empire - Level 20")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Props"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Props")
              )
            ),
            Core.vx_new_string(":Cast"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cast"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Stock Characters"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stock Characters"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Boy Scout - How can a corrupt police force uphold justice?\n* Devoted Sidekick - You're going to need help, and I'm coming with you.\n* Elitist - We're the ones who matter and everyone else can go to hell!\n* Femme Fatale - I'm not very good at flirting.  I don't usually talk to men unless I'm really interested.\n** All curves inside and out, there's nothing simple about the Femme Fatale.  At times bold and brassy, other times\nvulnerable and frightened, she's always in control and always utterly deadly, but most victims don't realize until it\nis too late.\n* Hard Nosed Cop - I don't care if the cuffs are too tight.  They're supposed to be.\n* Has-Been - I used to be able to do that, but I haven't tried in years.\n* Manipulator\n* Innocent Victim - My shop...my house!  How am I going to live?  That thing took everything I had.\n* Inscrutable Stranger\n* Not-So-Innocent Victim - I didn't mean I would ACTUALLY kill him.  It was a figure of speech!  And now look what he\ndid!  Who is going to pay for this?\n* Lover - Come home in one piece, ok?  I love you.\n* Plucky Bystander - What the hell was that?  Nevermind.  Hey, you're bleeding.  Wrap this around your arm and keep\npressure on it.  I'll watch the door, ok?\n* Rival\n* Seducer - Come on, you can get away for one night.  You have to see this place.  It's stunning, and the people!  So\nfriendly.  It's just something you have to see.\n* Smooth Talker - I could call the super for the key.  I'm sure he won't mind coming in at this hour.  He is a kind old\nman even if the stroke did change him.\n* Sullen Detective - Leave him here.  A loser like him'll get picked up for something eventually.\n* Thrill-Seeker - Here, try this: First throw the parachute out, count to five, then jump out after it, without a\njumpsuit!\n* Turncoat - I informed the Supervisor that progress is virtually nonexistant.  He was very impressed with my proposal\nto get things back on schedule.  He should be here momentarily to discuss it.")
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
    mapfunc.put("tacticsbook", Characters.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/characters", maptype, mapconst, mapfunc);
  }

}
