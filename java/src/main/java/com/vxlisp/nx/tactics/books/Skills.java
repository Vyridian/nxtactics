package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Skills {

  /**
   * @function chapter_skill_types
   * @return {chapter}
   * (func chapter_skill_types)
   */
  public static interface Func_chapter_skill_types extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_skill_types();
  }

  public static class Class_chapter_skill_types extends Core.Class_base implements Func_chapter_skill_types {

    @Override
    public Func_chapter_skill_types vx_new(Object... vals) {
      Class_chapter_skill_types output = new Class_chapter_skill_types();
      return output;
    }

    @Override
    public Func_chapter_skill_types vx_copy(Object... vals) {
      Class_chapter_skill_types output = new Class_chapter_skill_types();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/skills", // pkgname
        "chapter_skill_types", // name
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
    public Func_chapter_skill_types vx_empty() {return e_chapter_skill_types;}
    @Override
    public Func_chapter_skill_types vx_type() {return t_chapter_skill_types;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Skills.f_chapter_skill_types();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_skill_types() {
      return Skills.f_chapter_skill_types();
    }

  }

  public static final Func_chapter_skill_types e_chapter_skill_types = new Skills.Class_chapter_skill_types();
  public static final Func_chapter_skill_types t_chapter_skill_types = new Skills.Class_chapter_skill_types();

  public static Base.Type_chapter f_chapter_skill_types() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Skill Types"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Physical Skills"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Physical Skills"),
                Core.vx_new_string(":skillmap"),
                Core.f_new(
                  Base.t_skillmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Animal Handling"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animal Handling"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deploy: Deploy trained animals with total level equal to skill.\n* Each week, one animal may be trained one trick."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Animal Trainer, Breeder, Driver, Herder, Horse Whisperer, Houndmaster, Shepherd, Zoologist"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Falconry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Falconry")
                              )
                            ),
                            Core.vx_new_string(":Herding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Herding"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cowboy, Pig Farmer, Rancher, Shepherd")
                              )
                            ),
                            Core.vx_new_string(":Husbandry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Husbandry")
                              )
                            ),
                            Core.vx_new_string("Stare Down"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stare Down")
                              )
                            ),
                            Core.vx_new_string("Guard Training"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Guard Training")
                              )
                            ),
                            Core.vx_new_string(":Retrieve"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Retrieve")
                              )
                            ),
                            Core.vx_new_string("Seeing Eye Training"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seeing Eye Training")
                              )
                            ),
                            Core.vx_new_string("Snake Charming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snake Charming")
                              )
                            ),
                            Core.vx_new_string("Train Dog"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Train Dog")
                              )
                            ),
                            Core.vx_new_string("Train Elephant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Train Elephant")
                              )
                            ),
                            Core.vx_new_string("Train Horse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Train Horse")
                              )
                            ),
                            Core.vx_new_string("War Training"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("War Training")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Assassination"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Assassination"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Was it so easy?  Was it so simple?  You just pushed and death came?  Nothing spiritual about it...They just stopped\ntalking, stopped breathing, stopped moving, finally stopped twitching. - Kylar Stern, The Way of Shadows"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Assassin, Blackguard, Ninja, Shinobi"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Harvest Poison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Harvest Poison")
                              )
                            ),
                            Core.vx_new_string("Kiss of Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kiss of Death")
                              )
                            ),
                            Core.vx_new_string("Poisoned Arrow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisoned Arrow")
                              )
                            ),
                            Core.vx_new_string("Poisoned Blade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisoned Blade")
                              )
                            ),
                            Core.vx_new_string("Poisoned Dust"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisoned Dust")
                              )
                            ),
                            Core.vx_new_string(":Poisoning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poisoning")
                              )
                            ),
                            Core.vx_new_string("Poison Tolerance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Tolerance"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("...it was your cup that was poisoned.  They were both poisoned.  I spent the last few years building up an\nimmunity to iocane powder. - Princess Bride")
                              )
                            ),
                            Core.vx_new_string("Prepare Acid"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Acid")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Coagulant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Coagulant"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an Anti-Coagulant Poison. A target with Anti-Coagulant cannot easily stop [Bleeding].")
                              )
                            ),
                            Core.vx_new_string("Prepare Antidote"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Antidote"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Skilled in antidote creation.  Can create an antidote for any Poison user can brew.")
                              )
                            ),
                            Core.vx_new_string("Prepare Poison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Poison")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Athletics"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Athletics"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Balance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Balance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* User has extensive experience balancing under difficult circumstances.\n* [Action]: Roll vs. difficulty to maintain balance. If any [Hits] are rolled,\nbalance is maintained. Movement is at half speed while balancing, but\nadditional [Hits] or [Criticals] improve movement speed by 10% each up to\nfull speed.")
                              )
                            ),
                            Core.vx_new_string(":Backflip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Backflip"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Initiative\n+0 Speed (Can only move backward, ignores terrain movement penalties)\n* A showy move that allows the unit to move directly backward without turning.")
                              )
                            ),
                            Core.vx_new_string("Body Building"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Building"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Character is distinctly powerful looking.\n* [Passive]: Unit may reroll any failed attempt to lift, push, or pull an\nobject.")
                              )
                            ),
                            Core.vx_new_string(":Breakfall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Breakfall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Critical Hits to Hits from impacts during Knockback,\nKnockdown, or Falling\n* [Reaction]")
                              )
                            ),
                            Core.vx_new_string(":Contortion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Contortion")
                              )
                            ),
                            Core.vx_new_string("Escape Artistry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Escape Artistry")
                              )
                            ),
                            Core.vx_new_string("Freestyle Running"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Freestyle Running"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Ignore 1 [Hazard] from each space of [Forest], [Broken Ground], [Jungle], [Swamp], or [Obstacle].")
                              )
                            ),
                            Core.vx_new_string(":Gymnastics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gymnastics")
                              )
                            ),
                            Core.vx_new_string("High Jump"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Jump")
                              )
                            ),
                            Core.vx_new_string("Ice Climbing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ice Climbing")
                              )
                            ),
                            Core.vx_new_string(":Kippup"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kippup"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Move]: Change from [Prone] to [Standing].")
                              )
                            ),
                            Core.vx_new_string("Leap Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leap Attack")
                              )
                            ),
                            Core.vx_new_string("Long Jump"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Long Jump")
                              )
                            ),
                            Core.vx_new_string(":Marathon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Marathon")
                              )
                            ),
                            Core.vx_new_string("Pole Vault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pole Vault")
                              )
                            ),
                            Core.vx_new_string(":Rappelling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rappelling")
                              )
                            ),
                            Core.vx_new_string("Rock Climbing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rock Climbing")
                              )
                            ),
                            Core.vx_new_string("SCUBA Diving"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("SCUBA Diving")
                              )
                            ),
                            Core.vx_new_string(":Skateboarding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skateboarding")
                              )
                            ),
                            Core.vx_new_string(":Skating"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skating")
                              )
                            ),
                            Core.vx_new_string(":Skydiving"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skydiving")
                              )
                            ),
                            Core.vx_new_string(":Sledding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sledding")
                              )
                            ),
                            Core.vx_new_string(":Slide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slide"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Move at full speed under low obstacles like tables or overhangs.")
                              )
                            ),
                            Core.vx_new_string(":Snorkeling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snorkeling")
                              )
                            ),
                            Core.vx_new_string(":Snowboarding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snowboarding")
                              )
                            ),
                            Core.vx_new_string(":Skiing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skiing")
                              )
                            ),
                            Core.vx_new_string(":Sports"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sports")
                              )
                            ),
                            Core.vx_new_string(":Swimming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swimming")
                              )
                            ),
                            Core.vx_new_string("Swimming, Cold Water"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swimming, Cold Water")
                              )
                            ),
                            Core.vx_new_string("Swimming, Distance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swimming, Distance")
                              )
                            ),
                            Core.vx_new_string("Team Acrobatics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Team Acrobatics"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows a number of people with this ability to work together to form\nhuman pyramids, human ladders, etc.")
                              )
                            ),
                            Core.vx_new_string(":Tightrope"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tightrope")
                              )
                            ),
                            Core.vx_new_string(":Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Throw")
                              )
                            ),
                            Core.vx_new_string("Tree Climbing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tree Climbing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("[Action]: Climb a tree. Hammocks and seats can be built with enough time and equipment.")
                              )
                            ),
                            Core.vx_new_string(":Tumbling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tumbling")
                              )
                            ),
                            Core.vx_new_string(":Vault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vault"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Move over a low obstacle with no reduction in speed.\n* [Action]: Move and ignore up to Level in movement penalties this turn from\nfences, barricades, and other low obstacles.")
                              )
                            ),
                            Core.vx_new_string("Wall Climbing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall Climbing")
                              )
                            ),
                            Core.vx_new_string("Wall Spring"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall Spring")
                              )
                            ),
                            Core.vx_new_string("Zero G"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zero G")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Acrobatics"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Acrobatics"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Balance\n* Breakfall\n* Contortion\n* Escape Artistry\n* Gymnastics\n* High Jump\n* Kippup\n* Long Jump\n* Tightrope\n* Throw\n* Tumbling\n* Wall Spring\n* Zero G"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Acrobat, Contortionist, Escape Artist, Jester"),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_specialty,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("ability")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Climbing"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Climbing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ice Climbing\n* Rappelling\n* Rock Climbing\n* Tree Climbing\n* Wall Climbing")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Hunting"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunting"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Royal Huntsman - Sleeping Beauty"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Forward Observer, Gamekeeper, Hunter, Huntress, Huntsman, Huntmaster, Lookout, Mage Hunter, Master Huntsman, Master of the Hunt, Poacher, Ranger, Royal Huntsman, Scout, Sentinel, Stalker, Tracer, Tracker, Watchman"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Call of the Hunt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call of the Hunt")
                              )
                            ),
                            Core.vx_new_string("Cull the Herd"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cull the Herd")
                              )
                            ),
                            Core.vx_new_string(":Deadfall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deadfall")
                              )
                            ),
                            Core.vx_new_string("Field Dressing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Field Dressing")
                              )
                            ),
                            Core.vx_new_string(":Fishing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fishing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Catch enough fish to eat. Similar to Foraging."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fisherman")
                              )
                            ),
                            Core.vx_new_string(":Lure"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lure"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Everquest Pulling")
                              )
                            ),
                            Core.vx_new_string(":Scouting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scouting"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Reconnaissance")
                              )
                            ),
                            Core.vx_new_string(":Snare"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Snare")
                              )
                            ),
                            Core.vx_new_string("There is No Escape"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("There is No Escape"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Raiden Shogun, Genshin Impact")
                              )
                            ),
                            Core.vx_new_string(":Track"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Track")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bounty Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bounty Hunter"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Certainly there is no hunting like the hunting of man and those who have hunted armed men long enough and\nliked it, never really care for anything else thereafter. - On the Blue Water, Ernest Hemmingway"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Bounty Hunting represents experience in stalking and capturing a target in an urban setting. This is traditionally done for money and can be quite profitable.\n* Bounties are placed on people for whom the law lacks the resources or inclination to pursue.\n* Bounties are placed by insurance companies, bail bondsmen, armies, the F.B.I., and individuals.\n* The reward can be paid for information, the capture of the target in a reasonably uninjured state, or even dead or alive.\n* The reward obviously needs to be commensurate with the difficulty or no one will take it. Capturing is harder than killing, so captures gain a bonus.")
                              )
                            ),
                            Core.vx_new_string("Demon Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demon Hunter")
                              )
                            ),
                            Core.vx_new_string("Devil Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Devil Hunter")
                              )
                            ),
                            Core.vx_new_string("Mage Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mage Hunter")
                              )
                            ),
                            Core.vx_new_string(":Trapper"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trapper")
                              )
                            ),
                            Core.vx_new_string("Treasure Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treasure Hunter"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Indiana Jones\n* Lara Croft"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Treasure Hunting represents experience in the dangerous and profitable world of lost tombs and ancient relics. Rare relics hold high presitge and are usually sold (in the form of a finders fee) to museaums, governments or private collectors. Raiding tombs is a fairly lawless and perilous activity to start with, and such high value items tend to attract disreputable characters of all kinds. As a result, treasure hunters often end their careers in unfortunate accidents.\n* +1 while researching or navigating inside a crypt or tomb."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tomb Raider, Treasure Seeker")
                              )
                            ),
                            Core.vx_new_string("Vampire Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vampire Hunter")
                              )
                            ),
                            Core.vx_new_string("Werewof Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Werewof Hunter")
                              )
                            ),
                            Core.vx_new_string("Witch Hunter"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Witch Hunter")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Rage"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rage"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Berserker, Marauder, Wildman"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Beast"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Berserker"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Berserker")
                              )
                            ),
                            Core.vx_new_string(":Frenzy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frenzy")
                              )
                            ),
                            Core.vx_new_string(":Fury"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fury")
                              )
                            ),
                            Core.vx_new_string(":Hatred"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hatred"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack: +1 Speed vs. Tribal or long-standing personal enemies.")
                              )
                            ),
                            Core.vx_new_string(":Howl"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Howl")
                              )
                            ),
                            Core.vx_new_string(":Taunt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Taunt"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Kirk: We tried it once your way, Khan, are you game for a rematch? Khan, I'm laughing at the 'superior intellect.' Khan: Full impulse power! Joachim: No, sir! You have Genesis! You can have whatever... Khan: FULL POWER! DAMN YOU! - Star Trek II: The Wrath of Khan"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dishonor opponent's mother.\n* Roll vs. Mind. If successful, opponent must attack you."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Goad")
                              )
                            ),
                            Core.vx_new_string(":Vengeance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vengeance"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* More names off the list, more names on it. - Pyke, Runeterra\n* She opened a book and a box of tools. Sunny came home with a mission... Sunny came home with a list of names. She didn't believe in transcendence. 'It's time for a few small repairs.' she said. Sunny came home with a Vengence. - Shawn Colvin, Sunny Came Home")
                              )
                            ),
                            Core.vx_new_string(":Warcry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Warcry")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Survival"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Survival"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Common Survival Abilities\n* [Anytime]: Survival Skill may be rolled against any appropriate terrain based hazard taking the better of defense or\nSurvival roll.\n* [Daily]: Units missing appropriate supplies for the terrain must roll Days + # of missing supplies + Terrain Penalty\nversus Body + Survival or gain Black [Exhaustion] Tokens."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Adventurer, Courier, Drifter, Explorer, Forager, Messenger, Pathfinder, Pioneer, Seeker, Sentry, Survivalist, Trailblazer, Traveller,\nWanderer, Wayfarer"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Defense"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cold Weather Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cold Weather Survival"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hazards - Blizzard, Avalanche, Frostbite")
                              )
                            ),
                            Core.vx_new_string("Dead Reckoning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dead Reckoning"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Estimate current position and movement.")
                              )
                            ),
                            Core.vx_new_string("Desert Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Desert Survival"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Desert Bandit, Desert Dweller, Desert Fox, Desert Nomad, Dune Raider, Dune Rider")
                              )
                            ),
                            Core.vx_new_string("Detect Hollow Rock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Detect Hollow Rock"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detect trap doors, secret doors, and unstable rocks.")
                              )
                            ),
                            Core.vx_new_string(":Foraging"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Foraging"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: This ability can be used to forage for 1 man day of food and water for each [Hit]. Such food will\ntypically be disgusting to those unaccustomed to the local cuisine, but it will sustain.  Excess food only\nlasts for 1 additional day before going bad.  Excess water can be transfered to containers if any, otherwise it\ncannot be carried.  [Critical Hit]s provide a particularly tasty, convenient, or useful source of nutrition\n(e.g. water in bamboo that can be carried, food that will last another day or more).")
                              )
                            ),
                            Core.vx_new_string(":Forestry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forestry"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Tin Man"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability is used to avoid or mitigate the common hazards encountered while delving into\nthe forest.  This can also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 2 [Forest] spaces\n* [Action]: [+1 Stealth] in [Woods]\n* [Defense]: [+1 Defense] vs Ranged in [Woods]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Forest Lord, Logger, Lumberjack, Pathcutter, Ranger, Warden, Woodcutter, Woodsman")
                              )
                            ),
                            Core.vx_new_string("High Altitude Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Altitude Survival")
                              )
                            ),
                            Core.vx_new_string("Jungle Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jungle Survival"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Tarzan"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability is used to avoid or mitigate the common hazards encountered while delving into the jungle.  This\ncan also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 1 [Jungle] space\n* [Action]: [+1 Stealth] in [Jungle]\n* [Defense]: [+1 Defense] vs Ranged in [Jungle]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Jungle Dweller, Lord of the Jungle")
                              )
                            ),
                            Core.vx_new_string("Motion Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Motion Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detect air movements and faint sounds to detect moving things even when they are around corners or in the dark.")
                              )
                            ),
                            Core.vx_new_string("Swamp Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swamp Survival"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability is used to avoid or mitigate the common hazards encountered while delving into\nswampland.  This can also be used to avoid the attention of random predators.\n* [Requires]: Unit must be a [Light Unit]\n* [Move]: Ignore movement penalty for 1 [Swamp] space\n* [Action]: [+1 Stealth] in [Swamp]\n* [Defense]: [+1 Defense] vs Ranged in [Swamp]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Murk Dweller, Murk Lord, Swamp Lord, Swamp Knight, Swamp Thing")
                              )
                            ),
                            Core.vx_new_string("Underground Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Underground Survival")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Caving"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Caving"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dead Reckoning\n* Detect Hollow Rock\n* Mining\n* Motion Sense\n* Sapping\n* Underground Survival"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Miner, Prospector, Sapper, Spelunker, Underminer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Tradeskills"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tradeskills"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Tradesman"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("None"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Administration"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Administration"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Administrator, Secretary")
                              )
                            ),
                            Core.vx_new_string(":Agriculture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Agriculture"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow Crop"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Farmer, Gardener")
                              )
                            ),
                            Core.vx_new_string(":Architecture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Architecture"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: Design a structure. The size and quality of the\nstructure are limited by level.\n* [Action]: Determine weaknesses of a structure."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Architect")
                              )
                            ),
                            Core.vx_new_string(":Blacksmithing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blacksmithing"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Blacksmith")
                              )
                            ),
                            Core.vx_new_string(":Brewing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brewing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Brew Beer\n* Brew Hard Liquor\n* Brew Mead\n* Brew Wine"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Brewer, Vintner")
                              )
                            ),
                            Core.vx_new_string(":Carpentry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carpentry"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Carpenter")
                              )
                            ),
                            Core.vx_new_string(":Cleaning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleaning"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Maid")
                              )
                            ),
                            Core.vx_new_string(":Cobbling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cobbling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Make Shoes"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cobbler")
                              )
                            ),
                            Core.vx_new_string(":Cooking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cooking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Prepare Recipe"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Chef, Cook")
                              )
                            ),
                            Core.vx_new_string(":Cooping"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cooping"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Make Sealable Barrel"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cooper")
                              )
                            ),
                            Core.vx_new_string(":Glassblowing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Glassblowing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Blow Bottle\n* Blow Glass Decoration")
                              )
                            ),
                            Core.vx_new_string(":Jewelsmithing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jewelsmithing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gemcutting\n* Fashion Jewelry"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Gemcutter, Jeweler")
                              )
                            ),
                            Core.vx_new_string(":Laboring"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Laboring"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Laborer, Worker")
                              )
                            ),
                            Core.vx_new_string(":Landscaping"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Landscaping"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow Bonsai\n* Grow Flowers\n* Grow Hedges\n* Grow Hedge Maze\n* Grow Trees"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Groundskeeper, Landscaper, Lawnboy")
                              )
                            ),
                            Core.vx_new_string(":Leatherworking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leatherworking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fashion Leather Goods\n* Flay Skins"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tanner")
                              )
                            ),
                            Core.vx_new_string(":Livestock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Livestock")
                              )
                            ),
                            Core.vx_new_string(":Logging"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Logging")
                              )
                            ),
                            Core.vx_new_string(":Metalworking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Metalworking"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Coppersmith, Goldsmith, Machinist, Pewtersmith, Silversmith")
                              )
                            ),
                            Core.vx_new_string(":Plumbing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plumbing"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Plumber")
                              )
                            ),
                            Core.vx_new_string(":Porting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Porting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Bear Litter\n* Port Boat"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bearer, Porter")
                              )
                            ),
                            Core.vx_new_string(":Pottery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pottery"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Potter")
                              )
                            ),
                            Core.vx_new_string(":Servant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Servant"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Butler, Footman, Lady in Waiting")
                              )
                            ),
                            Core.vx_new_string(":Sewing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sewing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Crochet\n* Embroidery\n* Fashion Clothing\n* Needlepoint\n* Repair Cloth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dressmaker, Seamstress")
                              )
                            ),
                            Core.vx_new_string(":Stagecraft"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stagecraft"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The technical aspects of theatrical production, which include scenic design, stage machinery, lighting, sound, costume design, and makeup."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Stagehand")
                              )
                            ),
                            Core.vx_new_string(":Weaponsmith"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weaponsmith"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to repair, improve, or even create weapons.\n* [Razor's Edge] - Work a weapon to give a +1 Synergy the first time it hits."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bladesmith, Swordsmith")
                              )
                            ),
                            Core.vx_new_string(":Woodworking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Woodworking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The process of building, making or carving something using wood."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Carver, Whittler, Woodworker")
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
            Core.vx_new_string("Transportation Skills"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Transportation Skills"),
                Core.vx_new_string(":skillmap"),
                Core.f_new(
                  Base.t_skillmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Driving"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Driving"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Driver, Trucker"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bootlegger Reverse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bootlegger Reverse")
                              )
                            ),
                            Core.vx_new_string(":Drift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drift")
                              )
                            ),
                            Core.vx_new_string(":Swerve"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swerve")
                              )
                            ),
                            Core.vx_new_string("3 Point Turn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("3 Point Turn")
                              )
                            ),
                            Core.vx_new_string("Parallel Parking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parallel Parking")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Motorcycles"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Motorcycles")
                              )
                            ),
                            Core.vx_new_string(":Trucks"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trucks")
                              )
                            ),
                            Core.vx_new_string("Construction Vehicles"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construction Vehicles")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Piloting"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piloting"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Jink and Barrel Roll maneuvers simply make it harder for the plane to be hit.\n* The Half Loop, Wingover, and Falling Leaf are all attempts to loose an enemy that's tailing you.\n* The Loop, Immelman, and Retournment are all attempts to both loose a tail, abd to end up tailing that foe\nyourself.\n* When a 'dogged' plane attempts a maneuver to escape his tail the pilot needs to succeed in the maneuver.  If he\nfails his roll, then he's still being tailed, if he succeeds, then the tailing pilot gets to attempt the same\nmaneuver (as a 'free' action at full dice pool) - if the 'tail' matches or exceeds the successes rolled by the\ntarget plane's pilot, then the tail is maintained for another turn.\n* When a dogged plane attempts a 'reversal' maneuver the effects are the same, except that if the tailing plane\nscores less successes than the target plane, the roles are reversed."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aviator, Pilot, Sky Captain, Sky Knight, Sky Marshall, Wing Commander, Wingman"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Barn Storming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barn Storming"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Low altitude flying that uses ground cover to block line of sight.  Naturally, this manuever\ncan be extremely dangerous."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Nape of the Earth")
                              )
                            ),
                            Core.vx_new_string("Barrel Roll"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barrel Roll"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Do a barrel roll! - Peppy Hare, Star Fox 64"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The pilot rolls the plane over sideways and 'corkscrews' through the air.")
                              )
                            ),
                            Core.vx_new_string("Cobra maneuver"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cobra maneuver"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A dramatic and demanding maneuver in which an airplane flying at a moderate speed abruptly raises its nose momentarily to a vertical and slightly past vertical attitude, causing an extremely high angle of attack and momentarily stalling the plane, making a full-body air brake before dropping back to normal position, during which the aircraft does not change effective altitude."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dynamic deceleration")
                              )
                            ),
                            Core.vx_new_string("Carrier Landing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carrier Landing")
                              )
                            ),
                            Core.vx_new_string("Circle of Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Circle of Death"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A Russian WWII maneuver when attacking ground forces that attacks the column from the rear, then circles\naround to make repeated rear attacks until all weapons were expended.")
                              )
                            ),
                            Core.vx_new_string("Close Air Support"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Close Air Support")
                              )
                            ),
                            Core.vx_new_string("Dive Bombing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dive Bombing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("High speed attack from high altitude.  Increases movement speed and damage of physical attacks.")
                              )
                            ),
                            Core.vx_new_string("Falling Leaf"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Falling Leaf"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The pilot deliberately stalls, sending it into a spinning fall, only to restart the engine and\nlevel off.")
                              )
                            ),
                            Core.vx_new_string("Fly Out of the Sun"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fly Out of the Sun"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("If the sun is behind, allows a surprise attack.")
                              )
                            ),
                            Core.vx_new_string("Flyby Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flyby Attack")
                              )
                            ),
                            Core.vx_new_string("Flying Mount"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flying Mount"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When riding a mount that can fly, a unit must have experience riding that particular mount.\n* Examples: Dragon, Flying Carpet, Giant Eagle, Giant Wasp, Griffin, Hippogriff, Pegasus, Roc")
                              )
                            ),
                            Core.vx_new_string("Half Loop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Half Loop"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The pilot pulls up and over, as if he was going to loop the aircraft, but adds a half-roll to right the plane\nat the top of the loop to continue level flight in the opposite direction to that which he started.")
                              )
                            ),
                            Core.vx_new_string("Immelmann Turn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Immelmann Turn"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The Immelmann turn has become one of the most popular airshow maneuvers in the world.  However, the aerobatic\nmaneuver is altogether different from the WWI Immelmann turn (See Wingover) and is of little use in modern\ndogfighting."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Roll Off the Top")
                              )
                            ),
                            Core.vx_new_string(":Jink"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jink"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Yawing his plane from side to side, the pilot attempts to throw-off the aim of enemy gunners.\n* [Action]: [+1 Defense] until this unit's next turn.")
                              )
                            ),
                            Core.vx_new_string(":Levitating"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Levitating"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If a unit uses powers to fly, the unit must gain this ability of fly at a penalty.")
                              )
                            ),
                            Core.vx_new_string(":Loop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Loop"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The pilot pulls the plane up and over in a complete circle, ending up in the same position and facing that he\nstarted.")
                              )
                            ),
                            Core.vx_new_string("Pull Out of a Dive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pull Out of a Dive")
                              )
                            ),
                            Core.vx_new_string("Remote Piloting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Remote Piloting")
                              )
                            ),
                            Core.vx_new_string("Split S"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Split S"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A diving maneuver mostly used to disengage.  The pilot half-rolls his aircraft inverted and executes a\ndescending half-loop, resulting in level flight in the exact opposite direction at a lower altitude."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Reverse Immelmann")
                              )
                            ),
                            Core.vx_new_string(":Strafe"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strafe")
                              )
                            ),
                            Core.vx_new_string("Strategic Bombing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strategic Bombing")
                              )
                            ),
                            Core.vx_new_string(":Tail"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tail")
                              )
                            ),
                            Core.vx_new_string("Torpedo Bomb"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo Bomb"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Fly [Nape of the Earth] and drop a torpedo or other payload.")
                              )
                            ),
                            Core.vx_new_string("Wing Over"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wing Over"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Performed by an experienced flyer, this maneuver can surprise a pursuer by quickly reversing on them.  If you\nhave the distance lead in a chase, you can use this to convert from a defensive posture to an offensive one.\nThe trick is not to get shot up when you are reversing."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Immelmann Turn, Retournment")
                              )
                            ),
                            Core.vx_new_string("Winged Flight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Winged Flight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If the unit has wings, it must have this ability or fly at a penalty.\n* If the unit grew up with wings, this ability is assumed.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Civilian Airplanes"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Civilian Airplanes")
                              )
                            ),
                            Core.vx_new_string("Commercial Airplanes"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commercial Airplanes")
                              )
                            ),
                            Core.vx_new_string(":Helicopters"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Helicopters")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Riding"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Riding"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Level 1: Ride a horse\n* Level 2: Ride a Lt. Warhorse\n* Level 3: Ride a Med. Warhorse\n* Level 4: Ride a Hvy. Warhorse\n* Note: Riding a flying mount requires [Flying]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Caravan Driver, Cavalry, Driver, Dragoon, Horseman, Knight, Lancer, Outrider, Rider"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Catabatan Circle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catabatan Circle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]\n* High Dodge and Concentrated firepower")
                              )
                            ),
                            Core.vx_new_string(":Charge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Charge"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* We'll use the old ways...speed of horse! - Arthur, Excalibur"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Unit must have moved at least 4 spaces in a straight line.\n* [Action]: Melee Attack costs no [Speed].\n* [Attack], [Damage]: Any [Critical Hits] may be [Morale Tokens]")
                              )
                            ),
                            Core.vx_new_string("Drive Carriage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drive Carriage")
                              )
                            ),
                            Core.vx_new_string("Drive Cart"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drive Cart")
                              )
                            ),
                            Core.vx_new_string("Horse Archery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Horse Archery")
                              )
                            ),
                            Core.vx_new_string("Run Down"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Run Down"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Damage]: +1 Damage when attacking from the rear.\n* [Attack], [Damage]: Any [Critical Hits] may be [Retreats]")
                              )
                            ),
                            Core.vx_new_string("Steed Trample"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steed Trample")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Seamanship"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Seamanship"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The art of operating a ship or boat including specialised skills such as: navigation and international maritime\nlaw; weather, meteorology and forecasting; watchstanding; ship-handling and small boat handling; operation of deck\nequipment, anchors and cables; ropework and line handling; communications; sailing; engines; execution of\nevolutions such as towing; cargo handling equipment, dangerous cargoes and cargo storage; dealing with\nemergencies; survival at sea and search and rescue; fire fighting.\n\nThe degree of knowledge needed within these areas is dependent upon the nature of the work.  However, the practice\nof good seamanship should be the goal of all."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Admiral, Capitan, Commodore, First Officer, Navigator, Pirate, Sailor, Seaman, Ship's Mate"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Boarding Party"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boarding Party"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When a ship touches a dock or another ship, it is very unstable and must be secured for 1 round before anyone may move across. With this ability, the unit may step, jump, or even swing to the other side immediately. A skill roll must still be made, but a failed roll simply wastes a turn.")
                              )
                            ),
                            Core.vx_new_string("Marine Survival"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Marine Survival"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Open Water, Whitewater")
                              )
                            ),
                            Core.vx_new_string("Merchant Marine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Merchant Marine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Civilian Merchants operating private vessels are considered naval auxilliary and may be called into service to deliver troops and supplies for the military.")
                              )
                            ),
                            Core.vx_new_string(":Navigation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Navigation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* More than just finding a vessel's present location, safe navigation includes predicting future location, route planning and collision avoidance.\n* [Extended Action]: When determining actual travel time by sea, roll vs the difficulty of the journey. -1% travel time x [Hits] rolled. -2% travel time x [Critical Hits] rolled.")
                              )
                            ),
                            Core.vx_new_string(":Planing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Planing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Planing describes the state in which the hull of a waterborne craft is lifting up higher up to the point where it merely skims across the water, rather than moving through it.")
                              )
                            ),
                            Core.vx_new_string(":Ramming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ramming")
                              )
                            ),
                            Core.vx_new_string(":Righting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Righting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The act of reversing a capsized vessel is called righting.\n\nIf a capsized vessel has sufficient flotation to prevent sinking, it may recover on its own if the stability is such that it is not stable inverted.\n\nSmall dinghies frequently capsize in the normal course of use and are occasionally deliberately capsized as it can be the fastest means of draining water from the boat.\n\nIn a storm, even large vessels may be rolled by being hit broadside by a large wave. This is normally catastrophic for larger ships.")
                              )
                            ),
                            Core.vx_new_string(":Sailing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sailing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("This includes maneuvers such as heaving to, jibe, reefing, and tacking.")
                              )
                            ),
                            Core.vx_new_string("Trade Winds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trade Winds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Faster travel when piloting commercial sailing vessels.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Starship Piloting"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Starship Piloting"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Astronavigation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astronavigation")
                              )
                            ),
                            Core.vx_new_string("Astronavigation - FTL"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astronavigation - FTL")
                              )
                            ),
                            Core.vx_new_string("Astronavigation - Jump Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astronavigation - Jump Drive")
                              )
                            ),
                            Core.vx_new_string("Combat Orbital Piloting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combat Orbital Piloting")
                              )
                            ),
                            Core.vx_new_string("Combat Space Piloting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combat Space Piloting")
                              )
                            ),
                            Core.vx_new_string("Orbital Piloting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Orbital Piloting")
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
            Core.vx_new_string("Academic Skills"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Academic Skills"),
                Core.vx_new_string(":skillmap"),
                Core.f_new(
                  Base.t_skillmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Computers"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Computers"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("AI Programming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("AI Programming"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Artificial Intelligences may be given skills if the designer also\npossesses that skill. AI skill rolls are not open-ended.")
                              )
                            ),
                            Core.vx_new_string("Computer Engineering"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Computer Engineering")
                              )
                            ),
                            Core.vx_new_string("Computer Programming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Computer Programming")
                              )
                            ),
                            Core.vx_new_string("Computer Virus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Computer Virus")
                              )
                            ),
                            Core.vx_new_string("Edit Recording"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Edit Recording"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Modify a recording to mislead the viewer.")
                              )
                            ),
                            Core.vx_new_string(":Encryption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Encryption")
                              )
                            ),
                            Core.vx_new_string("False Images"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("False Images")
                              )
                            ),
                            Core.vx_new_string("Garbage In / Garbage Out"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Garbage In / Garbage Out")
                              )
                            ),
                            Core.vx_new_string("Ghost in the Machine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ghost in the Machine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By digitizing one's personality at the moment of death, a person can gain a semblance of\nimmortality.  A new program is created that is an replica of the original.  Successes\ndetermine how close a copy it is to the original.  10 successes is a perfect copy.")
                              )
                            ),
                            Core.vx_new_string(":Hacking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hacking")
                              )
                            ),
                            Core.vx_new_string(":Override"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Override"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Joachim: Our shields are dropping. Khan: Then raise them! Joachim: I can't! Khan: The override. Where's the override? - Joachim, Khan - Star Trek II: The Wrath of Khan")
                              )
                            ),
                            Core.vx_new_string("Remote Access"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Remote Access")
                              )
                            ),
                            Core.vx_new_string(":Reprogram"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reprogram")
                              )
                            ),
                            Core.vx_new_string(":Telecommute"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telecommute")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Electronics"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electronics"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Reverse the polarity of the neutron flow - Doctor Who"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Air Traffic Control"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Traffic Control")
                              )
                            ),
                            Core.vx_new_string(":Blackout"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blackout")
                              )
                            ),
                            Core.vx_new_string("Boost Power Output"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boost Power Output")
                              )
                            ),
                            Core.vx_new_string("Communication Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Communication Systems")
                              )
                            ),
                            Core.vx_new_string("Cybernetic Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cybernetic Systems")
                              )
                            ),
                            Core.vx_new_string("Detection Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Detection Systems")
                              )
                            ),
                            Core.vx_new_string("Disable Electronics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disable Electronics")
                              )
                            ),
                            Core.vx_new_string("Disrupt Guidance Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disrupt Guidance Systems")
                              )
                            ),
                            Core.vx_new_string("Electrical Overload"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electrical Overload"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Burn out a small part of a system. The system becomes unusable until\nthe fault is found and corrected.")
                              )
                            ),
                            Core.vx_new_string("Electronic Bypass"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electronic Bypass")
                              )
                            ),
                            Core.vx_new_string("Gravitic Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gravitic Systems")
                              )
                            ),
                            Core.vx_new_string("Jam Communications"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jam Communications")
                              )
                            ),
                            Core.vx_new_string("Power Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Systems")
                              )
                            ),
                            Core.vx_new_string("Robotic Systems"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Robotic Systems")
                              )
                            ),
                            Core.vx_new_string("Repair Electrical System"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Repair Electrical System")
                              )
                            ),
                            Core.vx_new_string("Shield Technologies"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Technologies")
                              )
                            ),
                            Core.vx_new_string("Short Circuit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Short Circuit")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Investigation"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Investigation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Investigation is the ability to uncover hidden or lost information. Though it allows the user to rapidly find information, it does not provide the ability to use that information. Other skills or allies would be needed beyond the basics."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archivist, Crime Scene Investigator, Detective, Inspector, Investigative Reporter, Librarian, Researcher"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Decipher"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Decipher"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detect and decode hidden messages.")
                              )
                            ),
                            Core.vx_new_string("Connect the Dots"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Connect the Dots")
                              )
                            ),
                            Core.vx_new_string("Crack the Case"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crack the Case")
                              )
                            ),
                            Core.vx_new_string("Criminal Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Criminal Research")
                              )
                            ),
                            Core.vx_new_string("Data Collection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Data Collection")
                              )
                            ),
                            Core.vx_new_string("Delve Too Deep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Delve Too Deep")
                              )
                            ),
                            Core.vx_new_string("Desperate Search"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Desperate Search")
                              )
                            ),
                            Core.vx_new_string("Dig Deep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dig Deep")
                              )
                            ),
                            Core.vx_new_string("Financial Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Financial Research")
                              )
                            ),
                            Core.vx_new_string("Find Traces"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Find Traces")
                              )
                            ),
                            Core.vx_new_string("Forbidden Knowledge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forbidden Knowledge")
                              )
                            ),
                            Core.vx_new_string("Forensic Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forensic Research")
                              )
                            ),
                            Core.vx_new_string("Historical Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Historical Research")
                              )
                            ),
                            Core.vx_new_string("Inquiring Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inquiring Mind")
                              )
                            ),
                            Core.vx_new_string("Medical Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medical Research")
                              )
                            ),
                            Core.vx_new_string("Occult Research"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Occult Research")
                              )
                            ),
                            Core.vx_new_string(":Ransack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ransack")
                              )
                            ),
                            Core.vx_new_string("Scene of the Crime"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scene of the Crime")
                              )
                            ),
                            Core.vx_new_string("Search for the Truth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Search for the Truth")
                              )
                            ),
                            Core.vx_new_string("Working a Hunch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Working a Hunch")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Knowledge"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knowledge"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Ancient History"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ancient History")
                              )
                            ),
                            Core.vx_new_string(":Antiquities"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Antiquities"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The study and valuation of unique objects throughout history.")
                              )
                            ),
                            Core.vx_new_string(":Archeology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Archeology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The study and reclamation of ancient relics and remains."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Archeologist, Paleontology, Paleontologist")
                              )
                            ),
                            Core.vx_new_string("Current Events"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Current Events")
                              )
                            ),
                            Core.vx_new_string(":Geography"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geography")
                              )
                            ),
                            Core.vx_new_string("Military History"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military History")
                              )
                            ),
                            Core.vx_new_string("Movie Trivia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Movie Trivia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each topic must be taken separately.\n* Any knowledge rolls in the given field are at +2.\n* Character has a high chance to remember any detail in the given topic.  This is similar to eidetic memory.")
                              )
                            ),
                            Core.vx_new_string("Music Trivia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Music Trivia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each topic must be taken separately.\n* Any knowledge rolls in the given field are at +2.\n* Character has a high chance to remember any detail in the given topic.  This is similar to eidetic memory.")
                              )
                            ),
                            Core.vx_new_string("Mythology and Legend"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mythology and Legend")
                              )
                            ),
                            Core.vx_new_string("National History"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("National History")
                              )
                            ),
                            Core.vx_new_string("Religious Studies"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Religious Studies")
                              )
                            ),
                            Core.vx_new_string("Sports Trivia"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sports Trivia")
                              )
                            ),
                            Core.vx_new_string("World History"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("World History")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":History"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("History")
                              )
                            ),
                            Core.vx_new_string(":Trivia"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trivia")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Mechanics"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mechanics"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Locksmith, Tinker, Tinsmith, Watchmaker"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Clockmaking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clockmaking")
                              )
                            ),
                            Core.vx_new_string(":Decontaminate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Decontaminate")
                              )
                            ),
                            Core.vx_new_string(":Demolition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demolition")
                              )
                            ),
                            Core.vx_new_string("Engineering: Aeronautical"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Aeronautical")
                              )
                            ),
                            Core.vx_new_string("Engineering: Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Armor"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Armorer")
                              )
                            ),
                            Core.vx_new_string("Engineering: Civil"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Civil"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Construction")
                              )
                            ),
                            Core.vx_new_string("Engineering: Cybernetic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Cybernetic")
                              )
                            ),
                            Core.vx_new_string("Engineering: Hydraulic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Hydraulic")
                              )
                            ),
                            Core.vx_new_string("Engineering: Optics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Optics")
                              )
                            ),
                            Core.vx_new_string("Engineering: Nuclear"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Nuclear")
                              )
                            ),
                            Core.vx_new_string("Engineering: Robotic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Robotic")
                              )
                            ),
                            Core.vx_new_string("Engineering: Rocket and Reaction Engines"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Rocket and Reaction Engines")
                              )
                            ),
                            Core.vx_new_string("Engineering: Siege"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Siege")
                              )
                            ),
                            Core.vx_new_string("Engineering: Star Drive"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Star Drive")
                              )
                            ),
                            Core.vx_new_string("Engineering: Temporal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Temporal")
                              )
                            ),
                            Core.vx_new_string("Engineering: Vehicular"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Vehicular")
                              )
                            ),
                            Core.vx_new_string("Engineering: Weaponry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Engineering: Weaponry"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Gunsmithing")
                              )
                            ),
                            Core.vx_new_string(":Fortification"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fortification")
                              )
                            ),
                            Core.vx_new_string("Kit Bash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kit Bash")
                              )
                            ),
                            Core.vx_new_string("Lock Construction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lock Construction")
                              )
                            ),
                            Core.vx_new_string("Lock Picking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lock Picking")
                              )
                            ),
                            Core.vx_new_string("Mechanical Maintenance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanical Maintenance")
                              )
                            ),
                            Core.vx_new_string("Mechanical Repair"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanical Repair")
                              )
                            ),
                            Core.vx_new_string("Mechanism Construction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanism Construction"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See [Equipment: Mechanisms]")
                              )
                            ),
                            Core.vx_new_string("Mechanism Deactivation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanism Deactivation")
                              )
                            ),
                            Core.vx_new_string("Mechanism Detection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mechanism Detection")
                              )
                            ),
                            Core.vx_new_string(":Mining"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mining")
                              )
                            ),
                            Core.vx_new_string(":Salvage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Salvage")
                              )
                            ),
                            Core.vx_new_string("Trap Detection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trap Detection")
                              )
                            ),
                            Core.vx_new_string("Trap Disarming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trap Disarming")
                              )
                            ),
                            Core.vx_new_string("Trap Laying"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Trap Laying"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See [Equipment: Traps]")
                              )
                            ),
                            Core.vx_new_string(":Welding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Welding")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Medicine"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medicine"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Caregiver, Caretaker, Dentist, Doctor, EMT, Medic, Medical Examiner, Nurse, Physician, Surgeon"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Anatomy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anatomy")
                              )
                            ),
                            Core.vx_new_string(":Dentistry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dentistry")
                              )
                            ),
                            Core.vx_new_string(":Diagnose"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Diagnose")
                              )
                            ),
                            Core.vx_new_string("Emergency Treatment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Emergency Treatment")
                              )
                            ),
                            Core.vx_new_string("First Aid"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("First Aid")
                              )
                            ),
                            Core.vx_new_string(":Immunology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Immunology")
                              )
                            ),
                            Core.vx_new_string(":Leeching"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leeching")
                              )
                            ),
                            Core.vx_new_string("Medical Practice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medical Practice")
                              )
                            ),
                            Core.vx_new_string(":Nursing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nursing")
                              )
                            ),
                            Core.vx_new_string(":Pharmacy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pharmacy"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pharmacist, Pharmacy Technician")
                              )
                            ),
                            Core.vx_new_string(":Physiology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physiology")
                              )
                            ),
                            Core.vx_new_string(":Surgery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surgery")
                              )
                            ),
                            Core.vx_new_string("Surgery: Brain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surgery: Brain")
                              )
                            ),
                            Core.vx_new_string("Surgery: Cosmetic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surgery: Cosmetic")
                              )
                            ),
                            Core.vx_new_string("Surgery: Cybernetic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surgery: Cybernetic")
                              )
                            ),
                            Core.vx_new_string("Surgery: Nerve"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surgery: Nerve")
                              )
                            ),
                            Core.vx_new_string("Treat Disease"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treat Disease")
                              )
                            ),
                            Core.vx_new_string("Treat Injury"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treat Injury")
                              )
                            ),
                            Core.vx_new_string("Treat Poison"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treat Poison")
                              )
                            ),
                            Core.vx_new_string("Treat Radiation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Treat Radiation")
                              )
                            ),
                            Core.vx_new_string("Veterinary Medicine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Veterinary Medicine")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Life Sciences"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Life Sciences"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* See [Equipment: Drugs]\n* See [Flora and Fauna: Plants]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Life Scientist"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Biochemistry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biochemistry"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Biochemist")
                              )
                            ),
                            Core.vx_new_string(":Biology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biology"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Biologist")
                              )
                            ),
                            Core.vx_new_string("Biology, Molecular"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biology, Molecular"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Molecular Biologist")
                              )
                            ),
                            Core.vx_new_string("Biology, Xeno"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Biology, Xeno")
                              )
                            ),
                            Core.vx_new_string(":Botony"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Botony"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Analyze/Identify Plant\n* Locate Plant\n* Harvest Plant\n* Cultivate Plant Strain"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Botonist, Herbalist, Horticulturalist")
                              )
                            ),
                            Core.vx_new_string(":Cloning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cloning")
                              )
                            ),
                            Core.vx_new_string(":Cryogenics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cryogenics"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Hidden in ice for a century, to walk the Earth again. Lord have mercy on the frozen man. - James Taylor, The Frozen Man")
                              )
                            ),
                            Core.vx_new_string(":Cultivate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cultivate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow any plant, fungus, or bacteria that you have studied.")
                              )
                            ),
                            Core.vx_new_string("Enhance Drug"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhance Drug"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Increase the effect that an existing drug or treatment will have.")
                              )
                            ),
                            Core.vx_new_string("Gene Bank"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gene Bank")
                              )
                            ),
                            Core.vx_new_string("Gene Splicing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gene Splicing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow new creatures that have characteristics taken from others.")
                              )
                            ),
                            Core.vx_new_string("Gene Therapy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gene Therapy")
                              )
                            ),
                            Core.vx_new_string("Gene Sequencing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gene Sequencing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By gathering a sample of a biological organism and studying it, the researcher can discover every detail of its abilities and biological mechanics.")
                              )
                            ),
                            Core.vx_new_string("Genetic Screening"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Genetic Screening")
                              )
                            ),
                            Core.vx_new_string(":Genetics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Genetics"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Geneticist")
                              )
                            ),
                            Core.vx_new_string("Genetic Engineering"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Genetic Engineering")
                              )
                            ),
                            Core.vx_new_string(":Ecology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ecology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Ecology is the interdisciplinary scientific study of the interactions between organisms and their environment.")
                              )
                            ),
                            Core.vx_new_string(":Homeopathy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Homeopathy")
                              )
                            ),
                            Core.vx_new_string("Lab Work"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lab Work"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Wet Science")
                              )
                            ),
                            Core.vx_new_string(":Pathology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pathology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Analyze/Identify Disease")
                              )
                            ),
                            Core.vx_new_string(":Pharmacology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pharmacology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create/Develop Drug"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pharmacist, Pharmacologist")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Bacterial"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Bacterial")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Fungal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Fungal")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Parasitic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Parasitic")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Toxin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Toxin")
                              )
                            ),
                            Core.vx_new_string("Prepare Anti-Viral"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Anti-Viral")
                              )
                            ),
                            Core.vx_new_string("Prepare Balm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Balm")
                              )
                            ),
                            Core.vx_new_string("Prepare Herbal Remedy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Herbal Remedy")
                              )
                            ),
                            Core.vx_new_string("Prepare Panacea"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Panacea"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cure bacteria, virus, fungal, or parasitic infestation.")
                              )
                            ),
                            Core.vx_new_string("Prepare Pigments"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Pigments")
                              )
                            ),
                            Core.vx_new_string("Prepare Poultice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Poultice")
                              )
                            ),
                            Core.vx_new_string("Prepare Spices"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Spices")
                              )
                            ),
                            Core.vx_new_string("Prepare Vaccine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Vaccine")
                              )
                            ),
                            Core.vx_new_string(":Zoology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zoology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Analyze/Identify Animal\n* Locate Animal"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Zoologist")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Physical Sciences"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Physical Sciences"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Personally, I liked the university. They gave us money and facilities, we didn't have to produce anything! You've never been out of college! You don't know what it's like out there! I've worked in the private sector. They expect results. - Ghostbusters"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Scientists believe that by studying a thing, one can learn its patterns and gain mastery over it."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sage, Scholar, Scientist"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Analyze Substance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Analyze Substance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Must have abilities corresponding to the substance being analyzed (e.g. Geology for rocks, Metallurgy for metals, etc.).\n* [Extended Action]: Run a series of tests on a substance to determine its make up.")
                              )
                            ),
                            Core.vx_new_string(":Astronomy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astronomy")
                              )
                            ),
                            Core.vx_new_string(":Astrophysics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astrophysics")
                              )
                            ),
                            Core.vx_new_string(":Cartography"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cartography"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Accurately map the surrounding area.\n* [Action]: Locate anomalies in maps, including errors, forgeries, and potentially hidden areas."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cartographer, Map Maker")
                              )
                            ),
                            Core.vx_new_string(":Chemistry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chemistry")
                              )
                            ),
                            Core.vx_new_string(":Geology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geology"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mineralolgy, Vulcanism")
                              )
                            ),
                            Core.vx_new_string(":Experimentation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Experimentation")
                              )
                            ),
                            Core.vx_new_string(":Mathematics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mathematics"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Algebra, Geometric, Probability, Trigonometry")
                              )
                            ),
                            Core.vx_new_string("Mathematics: Advanced"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mathematics: Advanced"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Differential Calculus - The definition, properties, and applications of the derivative of a function. The process of finding the derivative is called differentiation.\n* Integral Calculus - The definitions, properties, and applications of two related concepts, the indefinite integral and the definite integral. The process of finding the value of an integral is called integration.\n* Calculus is used in every branch of the physical sciences, actuarial science, computer science, statistics, engineering, economics, business, medicine, demography, and in other fields wherever a problem can be mathematically modeled and an optimal solution is desired.\n* Physics makes particular use of calculus; all concepts in classical mechanics are interrelated through calculus. The mass of an object of known density, the moment of inertia of objects, as well as the total energy of an object within a conservative field can be found by the use of calculus.\n* Electricity and Magnetism - Calculus can be used to find the total flux of electromagnetic fields. A more historical example of the use of calculus in physics is Newton's second law of motion, it expressly uses the term 'rate of change' which refers to the derivative.\n* Medicine - Calculus can be used to find the optimal branching angle of a blood vessel so as to maximize flow.\n* Economics - Calculus allows for the determination of maximal profit by providing a way to easily calculate both marginal cost and marginal revenue."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Differential Calculus, Integral Calculus, Limits and Infintesimals, Linear Algebra")
                              )
                            ),
                            Core.vx_new_string(":Metallurgy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Metallurgy")
                              )
                            ),
                            Core.vx_new_string(":Meteorology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Meteorology")
                              )
                            ),
                            Core.vx_new_string(":Planetology"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Planetology")
                              )
                            ),
                            Core.vx_new_string("Publish or Perish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Publish or Perish"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to create academic papers that increase Fame.")
                              )
                            ),
                            Core.vx_new_string(":Optics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Optics")
                              )
                            ),
                            Core.vx_new_string("Physics: Dimensional"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Dimensional")
                              )
                            ),
                            Core.vx_new_string("Physics: Electromagnetic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Electromagnetic")
                              )
                            ),
                            Core.vx_new_string("Physics: Fluid Dynamics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Fluid Dynamics")
                              )
                            ),
                            Core.vx_new_string("Physics: Forces"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Forces")
                              )
                            ),
                            Core.vx_new_string("Physics: Newtonian"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Newtonian")
                              )
                            ),
                            Core.vx_new_string("Physics: Nuclear"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Nuclear"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* You said crossing the streams was bad!  Cross the streams...  You're gonna endanger us, you're gonna endanger our client - the nice lady, who paid us in advance, before she became a dog...Not necessarily. There's definitely a *very slim* chance we'll survive. I love this plan!  I'm excited to be a part of it!  LET'S DO IT! - Ghostbusters")
                              )
                            ),
                            Core.vx_new_string("Physics: Quantum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Quantum")
                              )
                            ),
                            Core.vx_new_string("Physics: Temporal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Temporal"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The future is not set. There's no fate but what we make for ourselves. - Reece, The Terminator")
                              )
                            ),
                            Core.vx_new_string("Physics: Thermodynamics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physics: Thermodynamics")
                              )
                            ),
                            Core.vx_new_string("Quick Study"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quick Study"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("I know Kung Fu. - Neo, The Matrix"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cram to learn a low level skill very quickly. The skill doesn't last long, but often it doesn't have to.")
                              )
                            ),
                            Core.vx_new_string(":Study"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Study")
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
    );
    return output;
  }

  /**
   * @function chapter_skills_overview
   * @return {chapter}
   * (func chapter_skills_overview)
   */
  public static interface Func_chapter_skills_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_skills_overview();
  }

  public static class Class_chapter_skills_overview extends Core.Class_base implements Func_chapter_skills_overview {

    @Override
    public Func_chapter_skills_overview vx_new(Object... vals) {
      Class_chapter_skills_overview output = new Class_chapter_skills_overview();
      return output;
    }

    @Override
    public Func_chapter_skills_overview vx_copy(Object... vals) {
      Class_chapter_skills_overview output = new Class_chapter_skills_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/skills", // pkgname
        "chapter_skills_overview", // name
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
    public Func_chapter_skills_overview vx_empty() {return e_chapter_skills_overview;}
    @Override
    public Func_chapter_skills_overview vx_type() {return t_chapter_skills_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Skills.f_chapter_skills_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_skills_overview() {
      return Skills.f_chapter_skills_overview();
    }

  }

  public static final Func_chapter_skills_overview e_chapter_skills_overview = new Skills.Class_chapter_skills_overview();
  public static final Func_chapter_skills_overview t_chapter_skills_overview = new Skills.Class_chapter_skills_overview();

  public static Base.Type_chapter f_chapter_skills_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Skills Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
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
            Skills.f_chapter_skills_overview(),
            Core.vx_new_string("Skill Types"),
            Skills.f_chapter_skill_types()
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
    mapfunc.put("chapter_skill_types", Skills.t_chapter_skill_types);
    mapfunc.put("chapter_skills_overview", Skills.t_chapter_skills_overview);
    mapfunc.put("tacticsbook", Skills.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/skills", maptype, mapconst, mapfunc);
  }

}
