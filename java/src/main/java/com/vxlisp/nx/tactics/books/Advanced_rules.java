package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Advanced_rules {

  /**
   * @function chapter_advanced_rules
   * @return {chapter}
   * (func chapter_advanced_rules)
   */
  public static interface Func_chapter_advanced_rules extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_advanced_rules();
  }

  public static class Class_chapter_advanced_rules extends Core.Class_base implements Func_chapter_advanced_rules {

    @Override
    public Func_chapter_advanced_rules vx_new(Object... vals) {
      Class_chapter_advanced_rules output = new Class_chapter_advanced_rules();
      return output;
    }

    @Override
    public Func_chapter_advanced_rules vx_copy(Object... vals) {
      Class_chapter_advanced_rules output = new Class_chapter_advanced_rules();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/advanced_rules", // pkgname
        "chapter_advanced_rules", // name
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
    public Func_chapter_advanced_rules vx_empty() {return e_chapter_advanced_rules;}
    @Override
    public Func_chapter_advanced_rules vx_type() {return t_chapter_advanced_rules;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Advanced_rules.f_chapter_advanced_rules();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_advanced_rules() {
      return Advanced_rules.f_chapter_advanced_rules();
    }

  }

  public static final Func_chapter_advanced_rules e_chapter_advanced_rules = new Advanced_rules.Class_chapter_advanced_rules();
  public static final Func_chapter_advanced_rules t_chapter_advanced_rules = new Advanced_rules.Class_chapter_advanced_rules();

  public static Base.Type_chapter f_chapter_advanced_rules() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Advanced Rules"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Advanced Setup Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Setup Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Campaigns"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Campaigns"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Starting a New Campaign\n* Creating Player Characters\n* Creating Plots\n* Conflict\n* Creating Scenarios\n* Continuing a Campaign")
                      )
                    ),
                    Core.vx_new_string("Randomized Scenarios"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Randomized Scenarios"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Choose a Map - Any map, indoor or outdoor, square or hex map may be used. The scale must be approximately 1 inch=1.5 meters (5 feet).\n* Choose Starting Positions - Each side rolls 2d6.  From highest to lowest, each side chooses one of the starting positions (usually corners) of the map to start.\n* Deploy Teams - In the same order from highest to lowest each player deploys their teams up to 5 hexes from the edges of the map.")
                      )
                    ),
                    Core.vx_new_string("Recruit Teams"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Recruit Teams"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Choose Recruitment Points for each Side.\n* Recruit units by spending these points using the [Double Down] rule.\n* Usually, only units from a single Faction may be purchased.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Goals"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Goals"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Experience"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Experience"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Experience allows a unit to gain permanent ability increases.\n* Something major must be on the line, such that if the character fails he will incur a significant loss (e.g. a valuable item, his life). This is why characters seek out high stakes gambles and are not satisfied unless a great deal is on the line.\n* The character must face an opponent or difficulty no more than 1 level below his own or he must declare he is using the [Honor System].\n    * Minor Achievement - Gain an [Latent Ability] 2 levels below your highest level (minimum 1).\n    * Major Achievement - Gain a [Latent Skill] 2 levels below your highest level (minimum 1).")
                      )
                    ),
                    Core.vx_new_string("Latent Skill/Ability"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Latent Skill/Ability"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Latent Skills and Abilities represent potential capabilities that have not yet expressed.\n* Like Skills, they have levels and may be combined and split.")
                      )
                    ),
                    Core.vx_new_string("Gain a Skill/Power, Ability/Specialty"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gain a Skill/Power, Ability/Specialty"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* In order to gain a new ability, a user must perform research, practice, and experimentation.\n* Each week of practice and experimentation, the user may draw a Fate card.\n    ** If the Fate is a critical it is successful and may do EITHER of the following:\n    *** Gaining a Skill/Power - The user may convert a [Latent Skill] to a Skill or Power (if\n    allowed) of equal level.\n    *** Gaining an Ability/Specialty - The user may convert or [Latent Ability] into an\n    actual Ability or Specialty on an equal level.\n* Training Area/Laboratory - +1 Die if a dedicated training area with\nappropriate resources is available.\n* Assistants - Assistants reduce the difficulty of a task as well as allowing\nthem to learn on the job. See [Followers].\n* Mentor - +1 Die if a mentor is available.\n* Experimentation - Trial and error can produce some fascinating or useless random results.\n* Invention - Permanent Devices and Enchantments can be created over time.\n** Cost - Great care and cost must be expended to obtain or create an item of\nsufficient quality to hold an enchantment.\n** Difficulty - Inventions may be created instead of acquiring a new ability.\n** Time")
                      )
                    ),
                    Core.vx_new_string("Honor System"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Honor System"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Normally a character cannot gain experience from a foe more than 1 level\nbelow his own. If a character wants to gain experience against such a lower\nlevel foe, he must declare that he wants to compete 'On His Honor' using the\nHonor System.\n* The Honor System basically allows a character to metaphorically (or\nliterally) fight an opponent with one hand tied behind his back.\n* The character must challenge the opponent to a 'fair fight'. The challenge\nmakes the fight formal to any observers and places the character's honor\nsquarely on the line.\n* The character must offer some special incentive if the opponent wins (e.g.\na special treasure, his daughter's hand in marriage, safe passage for his\nopponents, not invading the Earth, his own head on a pike, etc.)\n* For the duration of the challenge, others must not interfere.\n* For the duration of the challenge, the character must refrain from using\nany skills that are more than 1 level higher than the opponent's defense.\nFurther he must limit his own defense rolls to 1 more than the opponents\nskill.\n* If the opponent or his allies breaks these terms, the challenge is void.\n* If the character or his allies breaks these terms, it is a serious blow to\nthe honor of the character and he immediately loses one level from one of his\nhighest skills.\n* If the character wins the competition, he may gain experience normally\nagainst this opponent.")
                      )
                    ),
                    Core.vx_new_string(":Study"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Study"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Books\n* Instruction\n* Time")
                      )
                    ),
                    Core.vx_new_string(":Rewards"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rewards"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Survival\n* Experience\n** +1 [Experience] for total or partial victory in the adventure.\n** +1 [Experience] for surviving life or death.\n** +1 [Experience] for the exceptional role playing and maintaining character concept.\n** +1 [Experience] for particularly heroic or infamous public actions (i.e. fame spread).\n** +1 [Experience] point toward a specific skill for training under a master 3 or more levels over your own.\n** +1 [Experience] point toward a specific skill after 1 month of experimentation. Experimentation requires\nexpense commensurate with the level of the skill.\n* Treasure\n* Knowledge\n* Favor\n* Allies\n* Influence\n* Prestige\n* Patronage")
                      )
                    ),
                    Core.vx_new_string(":Treasure"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Treasure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A Treasure Roll is made when a random treasure is needed.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Turn Sequence Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Turn Sequence Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Take the Initiative"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Take the Initiative")
                      )
                    ),
                    Core.vx_new_string("Simultaneous Movement"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Simultaneous Movement"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* After initiative is determined, each player chooses a unit or formation to activate. Each unit is compared to determine the one with the highest movement. This number is the number of phases in this turn. Each unit may choose to move or act on any phase of the turn with their chosen unit. They may also choose to react with any other unit, but a reacting unit may only move or use an action not both.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Action Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Action Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dramatic Clinch"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dramatic Clinch"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* During Melee or Close Combat, if the [Defense Roll] exactly cancelled the [Attack Roll], the [Units]\nmay enter a Clinch where they may speak to one another briefly without anyone overhearing.")
                      )
                    ),
                    Core.vx_new_string("Dramatic Effect"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dramatic Effect"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* At the discretion of the other players, [Critical Hits] may be spent to describe a dramatic display\nof skill.  This has no game effect but add great flavor to the game.")
                      )
                    ),
                    Core.vx_new_string(":Formation"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Formation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: Use half [Speed] to add a formation token of the appropriate type.\n* [Damage]: If a unit takes 2 [Retreats], remove its formation token.\n* Note: A unit only have 1 formation at a time.")
                      )
                    ),
                    Core.vx_new_string("Limited Dice"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Limited Dice"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Note: Limited and Synergy dice cancel each other in equals numbers so no roll may have both Synergy and Limited dice.\n* 1, 2, 3, 4, 5 = No Effect\n* 6 = Hit and roll a Critical Die")
                      )
                    ),
                    Core.vx_new_string("Multiple Actions"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Multiple Actions"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("If the [Unit] has multiple [Crew] members, then each member may use a DIFFERENT [Ability] this turn.")
                      )
                    ),
                    Core.vx_new_string("Synergy Dice"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Synergy Dice"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Abilities that work together should be a benefit without breaking game balance.  Synergies allow skills and equipment to work together without unbalancing the game or requiring specific combinations of abilities to be effective.\n* Note: Limited and Synergy dice cancel each other in equals numbers so no roll may have both Synergy and Limited dice.\n* 1, 2, 3 = No Effect\n* 4, 5 = Hit\n* 6 = Hit and roll 2 Critical Dice")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Advanced Situational Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Situational Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Off Handed"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Off Handed"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("I admit it.  You are better than I am.  Then why are you smiling?  Because I know something you don't know...I am\nnot left handed...There's something I ought to tell you...I am not left handed either. - Princess Bride"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: -1 If an ability normally requires 2 hands to perform and only one hand is available.")
                      )
                    ),
                    Core.vx_new_string(":Surprised"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Surprised"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("If one or more units are Surprised, they lose their [Action] this [Turn] and lose half of their [Speed].")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Effect Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Effect Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Cold"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cold"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Critical Hits] may be used for [Slow Tokens]")
                      )
                    ),
                    Core.vx_new_string(":Electricity"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Electricity"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Critical Hits] may be used to place 2 [Stun] each (or 2 [Damage] each if the target is [Mechanical])"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Electric Shock, Lightning")
                      )
                    ),
                    Core.vx_new_string(":Flame"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flame"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Critical Hits] may be used for [Fire Tokens]")
                      )
                    ),
                    Core.vx_new_string(":Infection"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Infection")
                      )
                    ),
                    Core.vx_new_string("Internal Bleeding"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Internal Bleeding")
                      )
                    ),
                    Core.vx_new_string("Permanent Disability"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Permanent Disability"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aneurysm, Brain Damage, Crippling, Nerve Damage, Paralysis, Stroke")
                      )
                    ),
                    Core.vx_new_string(":Piercing"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Piercing"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Damage]: [Critical Hits] may be used to roll 2 more [Damage] dice each.")
                      )
                    ),
                    Core.vx_new_string(":Slashing"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slashing"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Damage]: [Critical Hits] may be used for [Bleeding Tokens].")
                      )
                    ),
                    Core.vx_new_string(":Smoke"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smoke")
                      )
                    ),
                    Core.vx_new_string(":Resistant"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Resistant"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Armor rolls are doubled on a [Unit] that is stuck by an attack to which it is resistant.  Minimum: 2 dice.")
                      )
                    ),
                    Core.vx_new_string("System Shock"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("System Shock"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* When the body sustains a significant amount of damage, the body goes into shock.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Hit Location Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Hit Location Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hit Location"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* People and machines are durable but complex and are generally easier to disable than destroy completely.\n* A player may choose any number of [Critical Hits] to spend on special effects based on [Hit Location].\n* Roll once on the following table for each [Critical Hits] spent:\n** 6 - Attacker Chooses Hit Location\n** 5 - [Hit Location - Head] or [Hit Location - Command]\n** 4 - [Hit Location - Arms] or [Hit Location - Weapons]\n** 3 - [Hit Location - Chest] or [Hit Location - Mission]\n** 2 - [Hit Location - Vitals] or [Hit Location - Special Systems]\n** 1 - [Hit Location - Legs] or [Hit Location - Movement]\n\n** 6 - Head\n** 5 - Far Arm (including shoulder)\n** 4 - Near Arm (including shoulder)\n** 3 - Vitals\n** 2 - Near Leg (including hip)\n** 1 - Far Leg (including hip)")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Head"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Head")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Command"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Command"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 6 - Command: Unit skips its next turn.\n* 5 - Crew: Half of crew in space killed\n* 4 - Passengers: Half of Passengers in space killed.\n* 3 - Life Support System: 1 Life support or climate control system is Reduced by 1/2.\n* 2 - Safety System: 1 Safety or escape system is disabled.  A second hit destroys it.\n* 1 - Electronics: 1 Sensor, computer, or communication system is disabled.  A second hit destroys it.")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Arms"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Arms")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Weapons"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Weapons"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 5-6 - Weapon: 1 Weapon damage is reduced by 1.\n* 3-4 - Arc of Fire: 1 weapon loses 1 arc of fire.\n* 1-2 - Magazine: 1 Weapon rolls Damage against own unit with 1/2 Armor Defense")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Chest"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Chest")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Mission"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Mission"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 4-6 - Armor: Armor Facing is reduced by 1.\n* 1-3 - Cargo: Half of Cargo in space destroyed.")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Vitals"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Vitals")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Special Systems"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Special Systems"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 4-6 - Special Equipment: 1 special system is disabled.  A second hit destroyes it.\n* 1-3 - Fire: Fire Token")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Legs"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Legs")
                      )
                    ),
                    Core.vx_new_string("Hit Location - Movement"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit Location - Movement"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 6 - Engine: Acc and recharging reduced by 1/4.\n* 5 - Movement: Acc and Max Speed for 1 movement system reduced by 1/4 (minimum 1).  If it loses all Movement in the currently used Movement type, it will crash or sink as applicable.\n* 4 - Manueverability: -1 Facing changes per turn\n* 1-3 - Fuel/Reaction Mass: Range reduced by 1/4")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Damage Cards"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Damage Cards"),
                Core.vx_new_string(":damagemap"),
                Core.f_new(
                  Base.t_damagemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: -1 [Body]\n* Duration: Permanent until healed.\n* Regular Damage with no side-effects.")
                      )
                    ),
                    Core.vx_new_string("Air Reserve Loss"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Reserve Loss")
                      )
                    ),
                    Core.vx_new_string("Air Circulation Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Circulation Failure")
                      )
                    ),
                    Core.vx_new_string("Air Purification Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Purification Failure")
                      )
                    ),
                    Core.vx_new_string("Attitude Control Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Attitude Control Malfunction")
                      )
                    ),
                    Core.vx_new_string("Cargo Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Damage")
                      )
                    ),
                    Core.vx_new_string("Cargo Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Fire")
                      )
                    ),
                    Core.vx_new_string("Cargo Loss"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Loss")
                      )
                    ),
                    Core.vx_new_string("Crew Casualties"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crew Casualties")
                      )
                    ),
                    Core.vx_new_string("Crew Quarters Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crew Quarters Fire")
                      )
                    ),
                    Core.vx_new_string("Fire Suppression Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Suppression Failure")
                      )
                    ),
                    Core.vx_new_string("Movement Impaired"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement Impaired"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: -25% [Move]\n* Duration: Permanent until unit spends an entire turn repairing.")
                      )
                    ),
                    Core.vx_new_string("Movement Crippled"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement Crippled"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Effect: -25% [Move]\n* Duration: Permanent until healed.")
                      )
                    ),
                    Core.vx_new_string("Movement Control Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement Control Failure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unit must move at full speed until repaired.")
                      )
                    ),
                    Core.vx_new_string("Artificial Gravity Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Artificial Gravity Malfunction")
                      )
                    ),
                    Core.vx_new_string("Bridge Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bridge Damaged")
                      )
                    ),
                    Core.vx_new_string("Bridge Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bridge Explosion")
                      )
                    ),
                    Core.vx_new_string("Bridge Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bridge Fire")
                      )
                    ),
                    Core.vx_new_string("Bulkhead Collapse"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bulkhead Collapse")
                      )
                    ),
                    Core.vx_new_string("Cargo Hold Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Hold Damaged")
                      )
                    ),
                    Core.vx_new_string("Cargo Hold Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Hold Explosion")
                      )
                    ),
                    Core.vx_new_string("Cargo Hold Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cargo Hold Fire")
                      )
                    ),
                    Core.vx_new_string("Central Computer Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Central Computer Malfunction")
                      )
                    ),
                    Core.vx_new_string("Central Computer Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Central Computer Explosion")
                      )
                    ),
                    Core.vx_new_string("Central Computer Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Central Computer Fire")
                      )
                    ),
                    Core.vx_new_string("Command and Control Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Command and Control Failure")
                      )
                    ),
                    Core.vx_new_string("Communications Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Communications Failure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unit cannot communicate with other units.\n* In Game: Player may not speak. He/she may write rules questions to game master or opponents.")
                      )
                    ),
                    Core.vx_new_string("Crew Quarters Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crew Quarters Damaged")
                      )
                    ),
                    Core.vx_new_string("Damage Control Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Damage Control Damaged")
                      )
                    ),
                    Core.vx_new_string("Engineering Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Engineering Damage")
                      )
                    ),
                    Core.vx_new_string("Fire Control System Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fire Control System Malfunction")
                      )
                    ),
                    Core.vx_new_string("Flag Bridge Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flag Bridge Damaged"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Flag Bridge is used by senior executive officers to coordinate a fleet.")
                      )
                    ),
                    Core.vx_new_string("Food Stock Damaged"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Food Stock Damaged")
                      )
                    ),
                    Core.vx_new_string("Fuel Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Explosion")
                      )
                    ),
                    Core.vx_new_string("Fuel Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Fire")
                      )
                    ),
                    Core.vx_new_string("Fuel Loss"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Loss")
                      )
                    ),
                    Core.vx_new_string("Helm Control Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Helm Control Malfunction")
                      )
                    ),
                    Core.vx_new_string("Helm Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Helm Fire")
                      )
                    ),
                    Core.vx_new_string("Hydroponics Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hydroponics Damage")
                      )
                    ),
                    Core.vx_new_string("Inertial Dampener Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Inertial Dampener Malfunction")
                      )
                    ),
                    Core.vx_new_string("Intercommunications Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Intercommunications Failure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unit cannot communicate within the vehicle except person to person. On large vehicles, this can be a localized failure.")
                      )
                    ),
                    Core.vx_new_string("Life Support Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Life Support Malfunction")
                      )
                    ),
                    Core.vx_new_string("Medical Bay Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medical Bay Damage")
                      )
                    ),
                    Core.vx_new_string("Medical Bay Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medical Bay Explosion")
                      )
                    ),
                    Core.vx_new_string("Medical Bay Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medical Bay Fire")
                      )
                    ),
                    Core.vx_new_string("Missile Launcher Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Launcher Explosion")
                      )
                    ),
                    Core.vx_new_string("Missile Launcher Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Launcher Malfunction")
                      )
                    ),
                    Core.vx_new_string("Missile Magazine Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Magazine Explosion")
                      )
                    ),
                    Core.vx_new_string("Missile Magazine Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Magazine Fire")
                      )
                    ),
                    Core.vx_new_string("Movement Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement Malfunction")
                      )
                    ),
                    Core.vx_new_string("Navigation Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Navigation Failure")
                      )
                    ),
                    Core.vx_new_string("Navigation Light Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Navigation Light Failure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The vehicles navigation/landing lights are not working across all spectrums. In combat, these lights are normally off anyway, but they make any landing or docking manuever much more perilous.")
                      )
                    ),
                    Core.vx_new_string("Passenger Quarters Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Passenger Quarters Explosion")
                      )
                    ),
                    Core.vx_new_string("Passenger Quarters Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Passenger Quarters Fire")
                      )
                    ),
                    Core.vx_new_string("Power Control Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Control Failure")
                      )
                    ),
                    Core.vx_new_string("Power Plant Coolant Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Plant Coolant Failure")
                      )
                    ),
                    Core.vx_new_string("Power Plant Damage"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Plant Damage")
                      )
                    ),
                    Core.vx_new_string("Power Plant Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Plant Explosion")
                      )
                    ),
                    Core.vx_new_string("Power Plant Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Plant Fire")
                      )
                    ),
                    Core.vx_new_string("Power Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Power Failure")
                      )
                    ),
                    Core.vx_new_string("Propellent Loss"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Propellent Loss")
                      )
                    ),
                    Core.vx_new_string("Remote Systems Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Remote Systems Malfunction"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Command over drones is lost.")
                      )
                    ),
                    Core.vx_new_string("Secondary Bridge Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Secondary Bridge Explosion")
                      )
                    ),
                    Core.vx_new_string("Secondary Bridge Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Secondary Bridge Fire")
                      )
                    ),
                    Core.vx_new_string("Secondary Bridge Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Secondary Bridge Malfunction")
                      )
                    ),
                    Core.vx_new_string("Sensor (Short Range) Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sensor (Short Range) Malfunction")
                      )
                    ),
                    Core.vx_new_string("Sensor (Long Range) Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sensor (Long Range) Malfunction")
                      )
                    ),
                    Core.vx_new_string("Shield Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shield Malfunction")
                      )
                    ),
                    Core.vx_new_string("Spine Cracks"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spine Cracks")
                      )
                    ),
                    Core.vx_new_string("Steering Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steering Malfunction"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unit can only perform 1 change in direction during a Move.")
                      )
                    ),
                    Core.vx_new_string("Structural Collapse"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Structural Collapse")
                      )
                    ),
                    Core.vx_new_string("Target Aquisition Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Target Aquisition Failure")
                      )
                    ),
                    Core.vx_new_string("Temperature Control Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Temperature Control Failure")
                      )
                    ),
                    Core.vx_new_string("Turning Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turning Malfunction"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Unit cannot turn toward one side.")
                      )
                    ),
                    Core.vx_new_string("Transponder Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Transponder Failure"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The vehicle no longer identifies as friend of foe, so it appears as a potential enemy vehicle. In a heated exchange it may take friendly fire.\n* This can be as simple as a fallen flag on old navy ships."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("IFF Damage, Not Running Colors")
                      )
                    ),
                    Core.vx_new_string("Water Reserve Loss"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water Reserve Loss")
                      )
                    ),
                    Core.vx_new_string("Weapon Magazine Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Magazine Explosion")
                      )
                    ),
                    Core.vx_new_string("Weapon Magazine Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Magazine Fire")
                      )
                    ),
                    Core.vx_new_string("Weapon Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Malfunction")
                      )
                    ),
                    Core.vx_new_string("Weapon Explosion"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Explosion")
                      )
                    ),
                    Core.vx_new_string("Weapon Fire"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Fire")
                      )
                    ),
                    Core.vx_new_string("Weapon Power Failure"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Power Failure")
                      )
                    ),
                    Core.vx_new_string("Weapon Traverse Malfunction"),
                    Core.f_new(
                      Base.t_damage,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weapon Traverse Malfunction")
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
   * @function chapter_advanced_rules_overview
   * @return {chapter}
   * (func chapter_advanced_rules_overview)
   */
  public static interface Func_chapter_advanced_rules_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_advanced_rules_overview();
  }

  public static class Class_chapter_advanced_rules_overview extends Core.Class_base implements Func_chapter_advanced_rules_overview {

    @Override
    public Func_chapter_advanced_rules_overview vx_new(Object... vals) {
      Class_chapter_advanced_rules_overview output = new Class_chapter_advanced_rules_overview();
      return output;
    }

    @Override
    public Func_chapter_advanced_rules_overview vx_copy(Object... vals) {
      Class_chapter_advanced_rules_overview output = new Class_chapter_advanced_rules_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/advanced_rules", // pkgname
        "chapter_advanced_rules_overview", // name
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
    public Func_chapter_advanced_rules_overview vx_empty() {return e_chapter_advanced_rules_overview;}
    @Override
    public Func_chapter_advanced_rules_overview vx_type() {return t_chapter_advanced_rules_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Advanced_rules.f_chapter_advanced_rules_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_advanced_rules_overview() {
      return Advanced_rules.f_chapter_advanced_rules_overview();
    }

  }

  public static final Func_chapter_advanced_rules_overview e_chapter_advanced_rules_overview = new Advanced_rules.Class_chapter_advanced_rules_overview();
  public static final Func_chapter_advanced_rules_overview t_chapter_advanced_rules_overview = new Advanced_rules.Class_chapter_advanced_rules_overview();

  public static Base.Type_chapter f_chapter_advanced_rules_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Advanced Rules Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Advanced Rules?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Advanced Rules?"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("The Tactics:Basic Rules are sufficient for running a board game, but they lack detail when simulating a specific genre. The Tactics system is designed to allow different sets of rules to be plugged into the basic rules on an ala carte basis. This Advanced Rule book provides many of the optional rules necessary to increase realism or pseudo-realism. The other genre-based rule books will add rules that are specific to each genre.")
              )
            ),
            Core.vx_new_string("Advanced Rules Strategies"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Rules Strategies"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Strike First - Units are immediately penalized for damage taken, so do unto others before they do unto you.\n* Maintain a Threat - The battlefield changes with each unit's move, so use pawns to control the map while saving powerful and valuable units until later in the Round.  If you are not careful your opponent will surround and eliminate your units that have already acted.\n* Hold the Line - Opportunity and Hold Off abilities are deadly and allow you to protect weaker units.\n* Use the Terrain - Cover and abilities linked to cover offer an outstanding defense that layers with normal defense. The difference is most pronounced with lesser units. Effective use of terrain will determine the victor in most battles.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_advanced_tokens
   * @return {chapter}
   * (func chapter_advanced_tokens)
   */
  public static interface Func_chapter_advanced_tokens extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_advanced_tokens();
  }

  public static class Class_chapter_advanced_tokens extends Core.Class_base implements Func_chapter_advanced_tokens {

    @Override
    public Func_chapter_advanced_tokens vx_new(Object... vals) {
      Class_chapter_advanced_tokens output = new Class_chapter_advanced_tokens();
      return output;
    }

    @Override
    public Func_chapter_advanced_tokens vx_copy(Object... vals) {
      Class_chapter_advanced_tokens output = new Class_chapter_advanced_tokens();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/advanced_rules", // pkgname
        "chapter_advanced_tokens", // name
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
    public Func_chapter_advanced_tokens vx_empty() {return e_chapter_advanced_tokens;}
    @Override
    public Func_chapter_advanced_tokens vx_type() {return t_chapter_advanced_tokens;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Advanced_rules.f_chapter_advanced_tokens();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_advanced_tokens() {
      return Advanced_rules.f_chapter_advanced_tokens();
    }

  }

  public static final Func_chapter_advanced_tokens e_chapter_advanced_tokens = new Advanced_rules.Class_chapter_advanced_tokens();
  public static final Func_chapter_advanced_tokens t_chapter_advanced_tokens = new Advanced_rules.Class_chapter_advanced_tokens();

  public static Base.Type_chapter f_chapter_advanced_tokens() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Advanced Tokens"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Advanced White Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced White Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("White tokens represent temporary conditions that will pass quickly.\n* [Activate]: Remove one White token."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Fascination"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fascination"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: If a unit has more Facination Tokens than Mind, then no Move.\n* [Action]: If a unit has more Facination Tokens than Mind, then no Action.")
                      )
                    ),
                    Core.vx_new_string(":Faith"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Faith"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/FaithToken.png")
                      )
                    ),
                    Core.vx_new_string(":Peace"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Peace"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/PeaceToken.png")
                      )
                    ),
                    Core.vx_new_string(":Rage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rage"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/RageToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("+1 Attack\n-1 Defense\n-1 All other Abilities that are not Attacks\n* Ignore 1 Retreat for each Rage")
                      )
                    ),
                    Core.vx_new_string(":Slow"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slow"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/SlowToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: [-1 Speed]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hold"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("White Token")
                      )
                    ),
                    Core.vx_new_string(":Strain"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strain")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Advanced Black Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Black Tokens"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aging"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aging"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Reduces all Abilites and Life Span.")
                      )
                    ),
                    Core.vx_new_string(":Blindness"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blindness")
                      )
                    ),
                    Core.vx_new_string(":Crippled"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crippled"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/CrippledToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Speed]"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Black Token")
                      )
                    ),
                    Core.vx_new_string(":Curse"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Curse"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Anytime]: When unit gains a [Red Token] or a [Black Token], roll for each Curse Token.\n* For each [Hit], replace a Curse Token with a Token of any type just gained.")
                      )
                    ),
                    Core.vx_new_string(":Depression"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Depression")
                      )
                    ),
                    Core.vx_new_string(":Insanity"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Insanity")
                      )
                    ),
                    Core.vx_new_string(":Petrified"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Petrified")
                      )
                    ),
                    Core.vx_new_string(":Radiation"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Radiation"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/RadiationToken.png")
                      )
                    ),
                    Core.vx_new_string(":Shapeshift"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shapeshift")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Advanced Red Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Red Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Red tokens represent conditions that can rapidly grow out of control.\n* [Activate]: Add one Stun token."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Acid"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Acid"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May use a [Move] to remove an Acid Token.\n* [End of Turn] - Roll Acid Tokens.  Hits do Damage.  Remove an Acid Token.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Green Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Green Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Green Tokens represent conditions that generally grow worse over time."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Disease"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Disease"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/DiseaseToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Spreading, slow damage over time"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Diseased, Infected, Rabid, Sickly")
                      )
                    ),
                    Core.vx_new_string(":Envy"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Envy")
                      )
                    ),
                    Core.vx_new_string(":Fatigue"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fatigue"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Abilities]\n* Removed with rest")
                      )
                    ),
                    Core.vx_new_string(":Greed"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greed")
                      )
                    ),
                    Core.vx_new_string(":Hunger"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunger"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Abilities] per week without food\n* Removed after eating")
                      )
                    ),
                    Core.vx_new_string(":Love"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Love")
                      )
                    ),
                    Core.vx_new_string(":Lust"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lust")
                      )
                    ),
                    Core.vx_new_string(":Poison"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poison"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/PoisonToken.png")
                      )
                    ),
                    Core.vx_new_string(":Suffocation"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Suffocation"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Abilities]\n+1 Suffocation per minute without air\n* Each Suffocation after 2 also add [Damage]\n* Remove 1 Suffocation each 10 minutes of breathing")
                      )
                    ),
                    Core.vx_new_string(":Thrist"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thrist"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Abilities]\n+1 Thirst per day without drink\n* Remove 1 Thirst each day with ample drinking")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Advanced Purple Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Purple Tokens"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Ace"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ace"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/AceToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: [+1 Skill]\n* [Defense]: [+1 Defense]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Elite"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Purple Token")
                      )
                    ),
                    Core.vx_new_string(":Apathy"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Apathy"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Purple Token")
                      )
                    ),
                    Core.vx_new_string(":Hidden"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hidden"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: A unit with Hidden tokens is not actually at the location shown by its unit marker.\n* [Defense]: Any unit that can see the unit marker may spend an [Action] to attempt to attack or locate the unit. This is done by the unit secretly choosing the actual location of the unit up to the number of Hidden tokens away from the unit marker where the unit lies (note: the target location may not be passed a barrier that the unit could not cross with normal movement). The opponent then tries to guess both direction and distance. The unit then reveals its actual position and moves its unit marker there. If both are guessed, the unit is discovered and loses all Hidden tokens. If either is guessed, the unit loses 1 Hidden token. If the unit has no Hidden tokens, resolve the attack normally. If the unit has Hidden tokens then the unit remains hidden and any attack fails unless it is an area effect and the unit is the effect."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Purple Token")
                      )
                    ),
                    Core.vx_new_string(":Prepare"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prepare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: An item with Prepare may not be used until it has Prepare tokens equal to Prepare value.\n* [Action]: If unit does not move this [Turn], add a Prepare token to it.\n* Note: If the unit moves or takes a another action, then remove all Prepare tokens.")
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
   * @function chapter_genres
   * @return {chapter}
   * (func chapter_genres)
   */
  public static interface Func_chapter_genres extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_genres();
  }

  public static class Class_chapter_genres extends Core.Class_base implements Func_chapter_genres {

    @Override
    public Func_chapter_genres vx_new(Object... vals) {
      Class_chapter_genres output = new Class_chapter_genres();
      return output;
    }

    @Override
    public Func_chapter_genres vx_copy(Object... vals) {
      Class_chapter_genres output = new Class_chapter_genres();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/advanced_rules", // pkgname
        "chapter_genres", // name
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
    public Func_chapter_genres vx_empty() {return e_chapter_genres;}
    @Override
    public Func_chapter_genres vx_type() {return t_chapter_genres;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Advanced_rules.f_chapter_genres();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_genres() {
      return Advanced_rules.f_chapter_genres();
    }

  }

  public static final Func_chapter_genres e_chapter_genres = new Advanced_rules.Class_chapter_genres();
  public static final Func_chapter_genres t_chapter_genres = new Advanced_rules.Class_chapter_genres();

  public static Base.Type_chapter f_chapter_genres() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Genres"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Carrier Command"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Carrier Command"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Carrier Command is a set of rules for use with units that hold other units in a [Hanger].\n\nCommon Actions\n* Enter or Exit Hanger - Move and Action (Unit): Place a unit from the [Hanger] on the [Flight Deck] OR from the [Flight Deck] to the [Hanger].\nOnly 1 unit may be on the [Flight Deck] at any given moment and may be targetted normally there.\n* Launch or Land - Move and Action (Unit): Move a unit onto or off of the [Flight Deck].  If the carrier has a [Launch Catapult], a launching\nunit gains +2 movement.\n* Dive Bomb - Action: -4 Altitude and drop bombs attacking the top of the target creating [Fire] and damaging weapons, crew, and [Flight Deck].\nNormally only the target and opposing aircraft can [Interrupt] before the bombs are dropped.  Can only be performed from exactly +5 Altitude\nand with no [White Tokens].\n* Torpedo Bomb - Action: Drop torpedo attacking a side of the target below the water line creating [Flooding] and damaging [Speed].  Can only be\nperformed from exactly +1 Altitude and with no [White Tokens].\n* Landing - Move and Action (Unit): Move a unit and place it on the [Flight Deck].  Only 1 unit may be on the [Flight Deck] at any given moment\nand may be targetted normally there.\n* Refuel or Reload - Move and Action (Unit): Any unit on the [Flight Deck] or in the [Hanger] may refuel OR reload weapons (changing weapons if\ndesired).")
              )
            ),
            Core.vx_new_string(":RTS/4X"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("RTS/4X"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("4X:\n* eXplore\n* eXpand\n* eXploit\n* eXterminate")
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
        "nx/tactics/books/advanced_rules", // pkgname
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
      output = Advanced_rules.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Advanced_rules.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Advanced_rules.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Advanced_rules.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Advanced Rules"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("AdvancedRules.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Advanced Rules Overview"),
            Advanced_rules.f_chapter_advanced_rules_overview(),
            Core.vx_new_string("Advanced Tokens"),
            Advanced_rules.f_chapter_advanced_tokens(),
            Core.vx_new_string("Advanced Rules"),
            Advanced_rules.f_chapter_advanced_rules(),
            Core.vx_new_string("Genres"),
            Advanced_rules.f_chapter_genres()
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
    mapfunc.put("chapter_advanced_rules", Advanced_rules.t_chapter_advanced_rules);
    mapfunc.put("chapter_advanced_rules_overview", Advanced_rules.t_chapter_advanced_rules_overview);
    mapfunc.put("chapter_advanced_tokens", Advanced_rules.t_chapter_advanced_tokens);
    mapfunc.put("chapter_genres", Advanced_rules.t_chapter_genres);
    mapfunc.put("tacticsbook", Advanced_rules.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/advanced_rules", maptype, mapconst, mapfunc);
  }

}
