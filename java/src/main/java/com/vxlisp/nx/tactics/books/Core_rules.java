package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Core_rules {

  /**
   * @function chapter_common_rules
   * @return {chapter}
   * (func chapter_common_rules)
   */
  public static interface Func_chapter_common_rules extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_common_rules();
  }

  public static class Class_chapter_common_rules extends Core.Class_base implements Func_chapter_common_rules {

    @Override
    public Func_chapter_common_rules vx_new(Object... vals) {
      Class_chapter_common_rules output = new Class_chapter_common_rules();
      return output;
    }

    @Override
    public Func_chapter_common_rules vx_copy(Object... vals) {
      Class_chapter_common_rules output = new Class_chapter_common_rules();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_common_rules", // name
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
    public Func_chapter_common_rules vx_empty() {return e_chapter_common_rules;}
    @Override
    public Func_chapter_common_rules vx_type() {return t_chapter_common_rules;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_common_rules();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_common_rules() {
      return Core_rules.f_chapter_common_rules();
    }

  }

  public static final Func_chapter_common_rules e_chapter_common_rules = new Core_rules.Class_chapter_common_rules();
  public static final Func_chapter_common_rules t_chapter_common_rules = new Core_rules.Class_chapter_common_rules();

  public static Base.Type_chapter f_chapter_common_rules() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Common Rules"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Anatomy of a Unit"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Anatomy of a Unit"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Scale:\nRatings:\n* Attribute and Skill Rating - Each unit is rated at a certain level in a number of attributes and skills. Attributes rate the power, resistance, and damage capacity in the following areas: Body, Mind, and Spirit. Value is an overall rating of the cost of the unit to aquire or recruit. Skills rate the varied abilities in which this unit is proficient.\n* Level:Scale - Each Rating has two parts: Level and a Scale. The Level is a number from 2 to 10, and the Scale is the number of zeroes added after that number. E.g. 5000 becomes 5:3 (Rating 5 : Scale 3).\n* Level/Intensity - \n** No Rating - Challenged. Everyday tasks are difficult.\n** Rating 1:0 - Everyday. Most people get by with this rating.\n** Rating 2:0 - Everyday. Most people get by with this rating.\n** Rating 3:0 - Competent. Most healthy adults have some attributes and skills in this range.\n** Rating 4:0 - Competent. Most healthy adults have some attributes and skills in this range.\n** Rating 5:0 - Veteran. Well trained and highly experienced. Veteran Marines, Commandoes, Paratroopers, SS.\n** Rating 6:0 - Elite. Highest level of training and experience. Special Forces, SAS, Delta Force, Navy SEALs, Airborne Rangers, Green Berets.\n** Rating 7:0 - World Class. Highest training and natural ability. Olympic Athletes, Nobel-winning scientists, Top martial artists.\n** Rating 8:0 - World Class. Highest training and natural ability. Olympic Athletes, Nobel-winning scientists, Top martial artists.\n** Rating 9:0 - Legendary. Realistic Human maximum. Einstein, James Bond.\n** Rating 1:1+ - Superhuman.\n* Scale/Severity - The second part of an attribute or skill Rating is it's scale. Each scale represents a power of 10 greater than the last. The observable universe has a diameter of 9x10^26m or 9:26m, a mass of 1.5x10^53kg or 1.5:52g, and has 1x10^82 atoms. The Planck Length is 10^-35m or 1:-35m. The Tegmark theoretical distance to an identical universe to ours is 10^118m or 1:118m.\n** Scale -2 - Insect Scale. Distance/Size=1cm(.3in), Speed=1cm/s(.3in/s), Mass=100g(~.2lb), Energy=1J, Force=1N(100g lifted 1m), Current=1W\n** Scale -1 - Game Scale. Distance/Size=10cm(3.5in), Speed=10cm/s(3.5in/s, .3kph, .2mph), Mass=1kg(~2.2lb), Energy=10J, Force=10N(1kg lifted 1m), Current=10W(LED Light Bulb, Human energy use/s)\n** Scale 0 - Human Scale. Distance/Size=1m(3ft), Speed=1m/s(3ft/s, 3.5kph, 2mph), Mass=10kg(~22lb), Energy=100J, Force=100N(10kg lifted 1m), Current=100W(Incandesent Light Bulb, Human energy use/s)\n** Scale 1 - Vehicle/Giant Scale. Distance/Size=10m(33ft), Speed=10m/s(30ft/s, 35kph, 20mph), Mass=100kg(~220lb), Energy=1kJ, Force=1kN(100kg lifted 1m), Current=1kW.\n** Scale 2 - Flight Scale. Distance/Size=100m(330ft, Football field), Speed=100m/s(330ft/s, 350kph, 200mph), Mass=1ton, Energy=10kJ, Force=10kN(1ton lifted 1m), Current=10kW.\n** Scale 3 - Super Sonic Scale. Distance/Size=1km(3300ft, 0.6miles), Speed=1km/s(3300ft/s, 3500kph, 2000mph, Mach3), Mass=10ton, Energy=100kJ, Force=100kN(10ton lifted 1m), Current=100kW."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Body"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/BodyToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The nature of existence is obvious. The things I can see and touch are real."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Physical - The physical resistance of the unit. This is equal to the unit's highest Physical skill. Units with low Body are easily killed.\n* Body is determined by Mass. Fit human male: 8:1 (80kg/175lb). Fit human female: 6:1 (60kg/132lb)."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Build, Constitution, Endurance, Physique, Size, Stamina, Strength, Toughness")
                      )
                    ),
                    Core.vx_new_string(":Mind"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/MindToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* You're that smart? Let me put it this way. Have you ever heard of Plato, Aristotle, Socrates? Yes. Morons. - Princess Bride\n* The nature of existence is misleading. The atoms of our bodies are 99.99% empty space. The actual particles making up every human alive could be compressed to the size of a sugar cube. We are walking, talking electromagnetic fields."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mental - The mental strength of the unit. This is equal to the unit's highest Mental skill. Units with low Mind are easily fooled.\n* Mind is vaguely defined by IQ. IQ=Mind+50. Typical human Mind: 5:1 (100IQ). Brilliant human: 10:1 (150IQ)."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Intelligence, Mental Clarity, Mental Strength, Perception, Problem Solving, Learning, Reason, Wits")
                      )
                    ),
                    Core.vx_new_string(":Will"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Will"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/SpiritToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I think, therefore I am. - Descartes, Cogito Ergo Sum\n* The nature of existence is subjective. I have experience and thoughts in this precise moment, beyond that I can prove nothing. Does time actually pass as I understand it? Is anything else but me real? Am I living in a dream/hallucination/simulation? Am I just insane? Our experience is the only thing we can be sure of. Therefore, we may as well choose to live as we see fit. No amount of evidence can definitively prove otherwise."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Emotional - The inner strength of the unit. This is equal to the unit's highest Willpower skill. Units with low Will are easily manipulated or collapse under pressure.\n* Will has no emperical formula. Typical human Will: 5:1. Phenomenal human Will: 10:1."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chi, Confidence, Determination, Ego, Emotion, Faith, Grit, Guts, Heart, Instinct, Ki, Mana, Perseverence, Resolve, Spirit, Spiritualism, Will, Willpower")
                      )
                    ),
                    Core.vx_new_string(":Speed"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Speed"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/SpeedToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The maximum movement speed of the unit. Each turn a player may move a [Unit] by spending 1 Speed for each space moved.\n* Speed is measured in Kilometers Per Hour (kph) or Miles Per Hour (mph), and at each scale a different number of spaces.\n* At Personal Scale, Mph = Speed * 5 (5-25mph) examples: 2=Crawl, 4=Walk, 6=Encumbered Human, 8= Human, 12=Dog, 16=Horse, 24=Bird.\n\nLimitations:\n* Units may not make more than 4 Facing changes in 1 [Turn].")
                      )
                    ),
                    Core.vx_new_string(":Level"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Level"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/CoinToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The overall power of the unit as well as its cost to purchase or develop.\n* Level is calcuated as follows:\n** List each [Skill] level and [Power] level ordered by descending level.\n** For each [Weakness], go down the list reducing top level by 1.\n** Repeat the following until only 2 skills remain:\n    *** Take the bottom 2 level numbers and replace them with the higher number + 1. E.g. 4 and 2 become 5, 4 and 4 become 5.\n** When 2 skills remain the Level is the highest of the 2. E.g. 5 and 3 become Level 5."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cost, Level, Value")
                      )
                    ),
                    Core.vx_new_string("Skills, Powers, Abilities, and Specialties"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skills, Powers, Abilities, and Specialties"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Skills - Skills describe the different skillsets that the unit possesses including combat skills.\n** Examples - Melee, Mechanics, Physics, Medicine, and Military are Skills.\n** Advancement - Raising Skill Levels becomes progressively harder the higher the level.\n* Powers - Powers are similar to skills, but normal humans cannot normally have powers. Powers include Magic and Superpowers as well. Creatures, vehicles and equipment may have powers.\n** Examples - Wizardry, Fire, and Flight are Powers.\n** Advancement - Raising Power Levels does not become progressively harder unlike Skill Levels.\n* Abilities - Abilities are perks that can be activated when the related Skill or Power is used.\n** Examples - Roundhouse Kick is an Ability under the Close Combat Skill.\n** Advancement - Gaining additional Abilities and Specialties is relatively easy.\n* Specialties - Specialties are similar to abilities, but instead of giving perks, specialties make it easier to gain abilities within that specialty.\n** Examples - Swords is a Specialty under the Melee Skill.\n** Advancement - Gaining additional Abilities and Specialties is relatively easy.")
                      )
                    ),
                    Core.vx_new_string(":Weaknesses"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weaknesses"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Weaknesses are optional. They provide character flavor and reduce the [Level] of the unit/item.")
                      )
                    ),
                    Core.vx_new_string("Flavor Text"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flavor Text"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Whenever possible, interesting quotes or facts are included with the unit to help establish a mood.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Movement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Movement"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Movement - Infantry"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement - Infantry"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/MoveInfantry.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: [-1 Speed] to move 1 Space in any direction. The [Unit] may change [Facing] to any side before or after moving.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Actions"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Actions"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Attack"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Attack"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Find the [Attack Rating] and the [Defense Rating].\n* Draw two hands for each number and compare them.\n* Number cards 1-5 are Misses.  Discard these.\n* Number cards 6-10 are Hits.  Discard an equal number of these from both hands.  It doesn't matter which numbers.\n* Face cards are Critical Hits.")
                      )
                    ),
                    Core.vx_new_string("Targeting: Close Combat"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Targeting: Close Combat"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/TargetingCloseCombat.png")
                      )
                    ),
                    Core.vx_new_string("Targeting: Melee"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Targeting: Melee"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/TargetingMelee.png")
                      )
                    ),
                    Core.vx_new_string("Targeting: Reach"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Targeting: Reach"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/TargetingReach.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Reach")
                      )
                    ),
                    Core.vx_new_string("Targeting: Ranged"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Targeting: Ranged"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/TargetingRanged.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Point Blank - Any attack with a ranged weapon at 10ft (3m) or less.\n+1 [Attack] with pistols, +1 [Defense] with other ranged weapons.\n* Effective Range - Ranged weapons have a normal attack within this\nrange. About 30m for pistols. 90m for submachine guns. 300m+ for rifles.\n* Long Range - Attacks can be made beyond the normal range, but their\naccuracy drops off quickly. +1 [Defense] for each 10% more than effective\nrange.")
                      )
                    ),
                    Core.vx_new_string("Line of Sight"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Line of Sight"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/LineOfSight.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Line of Sight is usually required to use any Ranged Ability.\n* Determine Line of Sight: In order to have line of sight, use a 1 space wide straight edge to connect the\nattacker to one of the spaces of the target.\n* Line of Sight is determined by counting the number of points on the\nspace under the target that are visible.\n** 5-6 points: Clear Line of Sight.\n** 4 points: Obstructed [+1 Defense]\n** 3 points: Highly Obstructed [+2 Defense]\n** 2 points: Hidden [+3 Defense]\n** 1 point: Barely Visible [+4 Defense]")
                      )
                    ),
                    Core.vx_new_string(":Cover"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cover"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Any [Unit] may hide directly behind an object to reduce their profile.\n** If 50%+ cover: [+1 Defense]\n** If the attack succeeds, roll 1 Cover die if over 50% cover and 1 additional die if over 90% cover. If any Cover die results in a hit, the cover blocks the attack and the [Armor] of the Cover is applied first with any remaining damage rolled against the Unit.\n* For Example: Hiding behind a curtain provides +1 Defense but no other benefit while hiding behind a stone wall may allow the wall's armor to be used before the Unit is struck.")
                      )
                    ),
                    Core.vx_new_string("Extended Action"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Extended Action"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Extended Actions take more time than ordinary [Action]s.\n* Extended Actions have a Duration which tells how long each [Action] takes to perform.\n* First perform a normal [Action].  Any [Hit]s scored reduce the [Target Number].  Any [Contested Hit]s increase the [Contested Number].\n* The [Target Number] cannot exceed its original value, but instead trigger [Critical Failure]s if any.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Reactions"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Reactions"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Opportunity Action"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Opportunity Action")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Resolution"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Resolution"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Attack Roll"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Attack Roll"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/SkillToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Tactics uses large numbers of standard 6 sided dice.  White Dice are preferred for\nmost rolls.\n* Each 4, 5, or 6 rolled is a [Critical Hit].\n* Each 6 rolled lets you roll an additional die.\n* If the modified ability roll is 0, then the ability may not be used.")
                      )
                    ),
                    Core.vx_new_string("Critical Roll"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Critical Roll"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/CriticalToken.png")
                      )
                    ),
                    Core.vx_new_string("Critical Hit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Critical Hit"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each Critical Hit can be traded for a [Stun], or any token type that the particular attack used can produce\n(e.g. Flaming Arrows can produce [Fire] tokens).")
                      )
                    ),
                    Core.vx_new_string("Critical Failure"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Critical Failure")
                      )
                    ),
                    Core.vx_new_string("Defense Roll"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Defense Roll")
                      )
                    ),
                    Core.vx_new_string(":Hit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hit")
                      )
                    ),
                    Core.vx_new_string("Armor Rating"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armor Rating"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Units with an Armor rating make [Defense Roll]s normally, but if any [Hits] are scored and the Armor Rating exceeds the defense dice rolled, then roll additional defense dice equal to the difference.")
                      )
                    ),
                    Core.vx_new_string("Damage Rating"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Damage Rating"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("When a weapon has a Damage rating, it makes its [Ability Roll] normally, but if any [Hits] are scored and the Damage Rating exceeds the attack dice rolled, then roll additional attack dice equal to the difference.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Combat Effects"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Combat Effects"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aerial Maneuver"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aerial Maneuver")
                      )
                    ),
                    Core.vx_new_string(":Combination"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combination")
                      )
                    ),
                    Core.vx_new_string("Crouching Maneuver"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crouching Maneuver")
                      )
                    ),
                    Core.vx_new_string(":Knockback"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knockback")
                      )
                    ),
                    Core.vx_new_string(":Knockdown"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knockdown")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Situational Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Situational Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Altitude"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Altitude"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/AltitudeToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("It's over Anakin....I have the HIGH ground. - Obi-Wan Kenobi, Star Wars III"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: Flying units may gain an Altitude Token by spending [2 Move].\n* [Move]: Flying units may discard any number of Altitude Tokens at any time.  It gets [+1 Move] for each lost\nAltitude until the end of the [Turn].\n* [Action]: +1 [Attack] vs. [Unit] at lower Altitude\n* [Defense]: +1 [Defense] vs [Unit] at lower Altitude")
                      )
                    ),
                    Core.vx_new_string("Dug In"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dug In"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Any ground unit may use an [Action] to 'dig in', gaining [+1 Defense] until it moves from the space\n(even involuntarily).\n* Note: Dug In benefit is cumulative with [Stand Your Ground].")
                      )
                    ),
                    Core.vx_new_string(":Facing"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Facing"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Facing.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 1 - Fixed Forward.\n* 2 - Left Forward.\n* 3 - Right Forward.\n* Note: When necessary to determine direction randomly, roll a die and use the chart to choose direction.")
                      )
                    ),
                    Core.vx_new_string(":Flanking"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flanking"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Flanking.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 4 - Left Flank: [+1 Attack]\n* 5 - Right Flank: [+1 Attack]\n* 6 - Blind Spot: [+2 Attack]")
                      )
                    ),
                    Core.vx_new_string(":Hazard"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hazard")
                      )
                    ),
                    Core.vx_new_string(":Prone"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prone")
                      )
                    ),
                    Core.vx_new_string("Stand Your Ground"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stand Your Ground"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: [+1 Action] if you do not move this turn.")
                      )
                    ),
                    Core.vx_new_string(":Surrounded"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Surrounded"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Surrounded.png"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Outnumbered")
                      )
                    ),
                    Core.vx_new_string(":Terrain"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terrain")
                      )
                    ),
                    Core.vx_new_string("Terrain Hazard"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terrain Hazard")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Terms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Terms"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Action"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Action"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The [Unit] may spend half of its [Speed] to use any [Ability] on its [Card].  Note: if the [Unit] is only able\nto move 1 space this turn, it may still take an Action.")
                      )
                    ),
                    Core.vx_new_string(":Card"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Card")
                      )
                    ),
                    Core.vx_new_string(":Collision"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Collision"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* When 2 units collide, they each Roll [Body]+[Speed] vs. [Armor] against each other.\n* Either, both, or neither may take damage.")
                      )
                    ),
                    Core.vx_new_string(":Difficulty"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Difficulty"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Easy - Quick Game with Basic Rules\n* Medium\n* Difficult\n* Epic - Maximum complexity (and detail).  Often long play or part of a [Campaign].")
                      )
                    ),
                    Core.vx_new_string(":Initiative"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Initiative"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Initiative is determined by Spirit.  Unit act in order of initiative from lowest\nto highest.  Before any Action, a unit with higher initiative may interrupt the current\nunit and take its turn.")
                      )
                    ),
                    Core.vx_new_string("Large Unit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Large Unit")
                      )
                    ),
                    Core.vx_new_string(":Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Map")
                      )
                    ),
                    Core.vx_new_string("Optional Rules"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Optional Rules")
                      )
                    ),
                    Core.vx_new_string(":Player"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Player")
                      )
                    ),
                    Core.vx_new_string(":Rule"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rule")
                      )
                    ),
                    Core.vx_new_string(":Scenario"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scenario")
                      )
                    ),
                    Core.vx_new_string(":Space"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space")
                      )
                    ),
                    Core.vx_new_string(":Team"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Team")
                      )
                    ),
                    Core.vx_new_string("Turn Clock"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turn Clock")
                      )
                    ),
                    Core.vx_new_string(":Unit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unit")
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
   * @function chapter_core_maps
   * @return {chapter}
   * (func chapter_core_maps)
   */
  public static interface Func_chapter_core_maps extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_core_maps();
  }

  public static class Class_chapter_core_maps extends Core.Class_base implements Func_chapter_core_maps {

    @Override
    public Func_chapter_core_maps vx_new(Object... vals) {
      Class_chapter_core_maps output = new Class_chapter_core_maps();
      return output;
    }

    @Override
    public Func_chapter_core_maps vx_copy(Object... vals) {
      Class_chapter_core_maps output = new Class_chapter_core_maps();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_core_maps", // name
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
    public Func_chapter_core_maps vx_empty() {return e_chapter_core_maps;}
    @Override
    public Func_chapter_core_maps vx_type() {return t_chapter_core_maps;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_core_maps();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_core_maps() {
      return Core_rules.f_chapter_core_maps();
    }

  }

  public static final Func_chapter_core_maps e_chapter_core_maps = new Core_rules.Class_chapter_core_maps();
  public static final Func_chapter_core_maps t_chapter_core_maps = new Core_rules.Class_chapter_core_maps();

  public static Base.Type_chapter f_chapter_core_maps() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Core Maps"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Core Scales"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Scales"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* 10^-35m - Plank Scale. Any smaller than this and space seems to have no meaning.\n* 10^-20m - Particle Scale. The smallest particles exist at roughly this scale.\n* 10^-5m - Cell Scale. Bacterium and other cells exist at this scale.\n* 10^10m - Planetary Scale. Planets and moons exist at this scale.\n* 10^25m - Hubble Scale. The entire observable universe is at this scale.\n* ? - Universal Scale. The actual size of the universe, whatever that means.\n* ? - Multiversal Scale. The size of the multiverse, whatever that means."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Personal Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Personal Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Wars are fought at larger scales, but individual interaction is best done at this scale.\n* 1 Turn = 2 seconds\n* 1 Space = 2 meters (6 ft)\n* 24 x 20 map = 48m x 40m\n* 1 Space/Turn = 1m/s\n* The world record for 100m dash is 10 seconds = 22mph = 36kph = 10m/s = 10 spaces\n* The highest average speed for Marathon: 12mph = 20kph = 5m/s = 5 spaces\n* An average brisk walk: 4mph = 7kph = 2m/s = 2 spaces\n* Light Infantry: A normal person with only light gear: 18mph = 29kph = 8m/s = 8 spaces\n* Medium Infantry: A normal person with medium gear: 13mph = 21kph = 6m/s = 6 spaces\n* Heavy Infantry: A normal person with heavy gear: 9mph = 14kph = 4m/s = 4 spaces\n* Race Car: Takes 3x1 spaces: 100mph = 160kph = 45m/s = 45 spaces\n* Sherman Tank: 6m takes 3x2 spaces: 25mph = 38kph = 10m/s = 10 spaces\n* SBD Dauntless: 10mx12m takes 5x6 spaces: 250mph = 400kph = 110m/s = 110 spaces\n* B-24 Liberator: 20mx33m takes 10x17 spaces:  300mph = 470kph = 130m/s = 130 spaces\n* PT-109: 24m takes 12x4 space: 76kph = 21m/s = 21 spaces\n* USS Enterprise: 240m takes 120x40 spaces: 37mph = 60kph = 17m/s = 17 spaces")
                      )
                    ),
                    Core.vx_new_string("Standard Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Standard Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 1 Turn = 4 seconds\n* 1 Space = 4m (12 ft)\n* 24 x 20 map = 96m x 80m\n1 Round = 2 seconds\n1 Space = 4m\nLight Infantry: 10 man Squad with only light gear: 18mph = 29kph = 8m/s = 4 spaces\nMedium Infantry: A normal person with medium gear: 13mph = 21kph = 6m/s = 3 spaces\nHeavy Infantry: A normal person with heavy gear: 9mph = 14kph = 4m/s = 2 spaces\nRace Car: Takes 2x1 spaces: 100mph = 160kph = 45m/s = 22 spaces\nSherman Tank: 6m takes 2x1 spaces: 25mph = 38kph = 10m/s = 5 spaces\nSBD Dauntless: 10mx12m takes 5x6 spaces: 250mph = 400kph = 110m/s = 55 spaces\nB-24 Liberator: 20mx33m takes 10x17 spaces:  300mph = 470kph = 130m/s = 65 spaces\nPT-109: 24m takes 12x4 space: 76kph = 21m/s = 10 spaces\nUSS Enterprise: 240m takes 120x40 spaces: 37mph = 60kph = 17m/s = 8 spaces")
                      )
                    ),
                    Core.vx_new_string("Large Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Large Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 1 Turn = 15 seconds\n* 1 Space = 15m (50 ft)\n* 24 x 20 map = 360m x 300m")
                      )
                    ),
                    Core.vx_new_string("Modern Naval Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Naval Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Naval Combat - World War II was the turning point of Naval Warfare when air power made traditional naval\ncombat obsolete.  Even submarines and torpedoes were insignificant compared to the effect of air power.  Map\nscale is therefore based primarily on aircraft speed.\n* 1 Turn = 5 seconds\n* 1 Space = 80m\n* Infantry: 100 man Company with only light gear: 18mph = 29kph = 8m/s = 40m/turn = 1/2 space (1 space assuming\ntrucks)\n* Race Car: 10 cars in 1 space: 100mph = 160kph = 45m/s = 225m/turn = 3 spaces\n* Sherman Tank: 5 tanks in 1 space: 25mph = 38kph = 10m/s = 50m/turn = 1 space\n* SBD Dauntless: 5 plane Flight in 1 space: 250mph = 400kph = 110m/s = 550 m/turn = 7 spaces\n* B-24 Liberator: 1 plane take 1 space:  300mph = 470kph = 130m/s = 650 m/turn = 8 spaces\n* PT-109: 24m takes 1 space: 76kph = 21m/s = 105m/turn = 1.5 spaces\n* USS Enterprise: 240m takes 3x1 spaces: 37mph = 60kph = 17m/s = 85 m/turn = 1 space")
                      )
                    ),
                    Core.vx_new_string("Tactical Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tactical Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 1 Turn = 1 hour\n* 1 Space = 50km\n* 24 x 20 map = ?\n* Infantry: 100 man Company with only light gear: 18mph = 29kph = 3/5 space (1 space assuming trucks)\n* Race Car: 10 cars in 1 space: 100mph = 160kph = 3 spaces\n* Sherman Tank: 5 tanks in 1 space: 25mph = 38kph = 4/5 space\n* SBD Dauntless: 5 plane Flight in 1 space: 250mph = 400kph = 8 spaces\n* B-24 Liberator: 1 plane take 1 space:  300mph = 470kph = 9 spaces\n* PT-109: 24m takes 1 space: 76kph = 1.5 spaces\n* USS Enterprise: 240m takes 3x1 spaces: 37mph = 60kph = 1 space")
                      )
                    ),
                    Core.vx_new_string("Strategic Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strategic Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Infantry to tank ratio: 1000 to 1.\n* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?")
                      )
                    ),
                    Core.vx_new_string("Global Scale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Global Scale"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The World Wars were indeed the first wars to be waged worldwide.  The logical scale for modern global events\nis the world itself.\n* 1 Turn = 3 days\n* 1 Space = 1600km = 1000miles.\n* 24 x 20 map = ?\nThe Earth's circumference is 40,000km.\n* Infantry: 2,000 man Division with trucks: 18mph = 29kph = 3/5 space (1 space assuming trucks)\n* M3 Halftrack: 200 trucks have a range of 280km which it can reach in 4 hours.  At 4 trips/day, it can carry\ninfantry 2 spaces/turn.\n* Sherman Tank: 100 tanks has a range of 120mi = 190km which it can reach in 6 hours.  At 2.5 trips/day, it can\nmove 1 space/turn.\n* SBD Dauntless: 100 planes with a range of 773mi = 1243km which it can reach in 4 hours.  At 3 flights/day, it\ncan move 7 spaces/turn if it can land and refuel in each space.\n* B-24 Liberator: 20 bombers with a range of 3700mi = 6000km which it can reach in 8 hours.  At 2 flights/day,\nit can move 22 spaces/turn if it can land and refuel every 4 spaces.\n* PT-109: 20 boats have only a 12 hour endurance so is entirely dependent on support ships for long range\ntravel.\n* USS Enterprise: 1 capital ship, 2 light cruiser, and 3 destroyer escorts can cruise at\n17mph = 28kph = 672km/day.  It can move 672km * 3 days = 2016km/turn = 1 space/turn.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Maps"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Maps"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("City Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("City Map")
                      )
                    ),
                    Core.vx_new_string("Land Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Land Map")
                      )
                    ),
                    Core.vx_new_string("Town Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Town Map")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Core Terrain"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Terrain"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Building"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Building"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Building.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: Impassable by Vehicles\n* [Defense]: [+1 Defense], Gains [Armor] based on building material and thickness")
                      )
                    ),
                    Core.vx_new_string(":Cliff"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cliff"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Cliff.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: Impassable along the cliff edge\n* [Attack]: +1 [Elevation]\n* [Defense]: +1 [Elevation]")
                      )
                    ),
                    Core.vx_new_string(":Forest"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Forest"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Forest.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: [-1 Speed]\n* [Defense]: [+2 Defense], [+2 Armor], Blocks [Line of Sight]")
                      )
                    ),
                    Core.vx_new_string(":Hill"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hill"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Hills.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Move]: [-1 Speed]\n* [Attack]: [+1 Elevation]\n* [Defense]: [+1 Elevation], Blocks [Line of Sight] to units behind the hill, but not units on the hill.")
                      )
                    ),
                    Core.vx_new_string(":Road"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Road"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Road.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Speed] for each 2 spaces moved (rounded up)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cobblestones, Dirt Road, Gravel, Highway, Racetrack, Sidewalk, Street")
                      )
                    ),
                    Core.vx_new_string(":Water"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Water"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Maps/Water.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Impassable\n* Depth"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lake, Oasis, Ocean, Pond, Pool, River, Stream, Underwater")
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
   * @function chapter_core_overview
   * @return {chapter}
   * (func chapter_core_overview)
   */
  public static interface Func_chapter_core_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_core_overview();
  }

  public static class Class_chapter_core_overview extends Core.Class_base implements Func_chapter_core_overview {

    @Override
    public Func_chapter_core_overview vx_new(Object... vals) {
      Class_chapter_core_overview output = new Class_chapter_core_overview();
      return output;
    }

    @Override
    public Func_chapter_core_overview vx_copy(Object... vals) {
      Class_chapter_core_overview output = new Class_chapter_core_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_core_overview", // name
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
    public Func_chapter_core_overview vx_empty() {return e_chapter_core_overview;}
    @Override
    public Func_chapter_core_overview vx_type() {return t_chapter_core_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_core_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_core_overview() {
      return Core_rules.f_chapter_core_overview();
    }

  }

  public static final Func_chapter_core_overview e_chapter_core_overview = new Core_rules.Class_chapter_core_overview();
  public static final Func_chapter_core_overview t_chapter_core_overview = new Core_rules.Class_chapter_core_overview();

  public static Base.Type_chapter f_chapter_core_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Core Overview"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Round - Each Unit takes their turn. When all Units have taken their turn or passed, the Round ends.\n* Turn - Each Unit takes a Turn during a Round.\n** Turn Order - Units take turns in order of the highest [Body] to lowest. The largest units are the most predictable and must activate first.\n** Facing - At any time during your turn, you may change your facing by 45 degrees to any adjacent direction of the 8 compass directions. You may change your facing a maximum of 2 times (a total of 90 degrees) during your turn regardless of how many Move actions you take.\n** Actions - The current may take up to 2 Actions during its Turn.\n*** Move\n**** Simple Move - \n**** Accelerate -\n**** Brake - \n**** Drift - \n** Interrupt - During the Unit's Move, any smaller Unit may interrupt the current Unit and take its Turn immediately. When it has finished its Turn, the interrupted Unit continues. Multiple chained interrupts are possible this way.\n\n** Abilities - Each [Unit] may use up to 2 [Abilities] each [Turn].\nThere are 3 types of [Ability]: [Move], [Attack], and [Action] abilities.  They may be performed in any order but there may only be one [Move] or [Attack] [Ability] used in a turn.  So the following are the allowed combinations: Move/Attack, Attack/Move, Move/Action, Action/Move, Attack/Action, Action/Attack, Action/Action.\n\nDamage Cards:\n\nAmmo Damaged\n\nArmor Rupture\n* Armor Breach\n\nCargo Damage\n* Individual - Lost ammo, water, food\n* Team - Lost ammo, water, food\n* Vehicle - Lost fuel, ammo, water, food, reaction mass\n* Ship - Lost fuel, ammo, water, food (submarine: air)\n* Starship - Lost fuel, ammo, propellant, air, water, food\n\nCrew Damage\n\nCommand Failure\n* Command Control Failure - Commands may not be issued to teams outside command.\n* Helm Control Failure - Cannot change speed or heading until rerouted.\n* Navigation Control Failure - Cannot plot courses or use maps until rerouted.\n* Communication Control Failure - Cannot use communications until rerouted.\n* Sensor Control Failure - Cannot use sensors until rerouted.\n* Weapon Targetting Control Failure - May only fire at current target with current weapon.\n\nCommunication Failure\n\nSensor\n\nControl Failure\n* Throttle Failure - Cannot increase speed.\n* Throttle Failure - Cannot maintain speed. Must increase or decrease speed.\n* Throttle Failure - Cannot reduce speed.\n* Steering Failure - Cannot turn left.\n* Steering Failure - Cannot maintain course. Must turn.\n* Sterring Failure - Cannot turn right.\n* Steering Failure - Cannot ascend.\n* Steering Failure - Cannot maintain altitude. Must ascend or descend.\n* Sterring Failure - Cannot descend.\n* Navigation Failure - Cannot plot a course or use maps.\n* Unstable Controls - Must drift each turn if able.\n\nPower Plant Damage\n* Engine Overheat - -1 Max Power generation\n* Electrical Short - -1 Max Power generation and chance of fire.\n* Electrical Overload - 1 Random System loses power until reset.\n\nEquipment Failure\n\nFire\n* Individual - Clothes or hair catches fire\n* Team\n* Vehicle - Engine Fire\n\nLife Support Failure\n* Vehicle -\n* Ship - Air (submarine: heat, pressure)\n* Starship - Air, heat, pressure\n\nMovement Failure\n* Individual - Leg or Foot Damage\n* Team - Some members can't move without help.\n* Vehicle - Flat tire, slipped tread\n* Ship -\n* Starship -\n\nReduced Visibility\n* Individual - Temporay Blindness (Sweat, dust, blood, smoke)\n* Team - Temporay Blindness (dust, smoke)\n* Vehicle - (dirt on windshield, smoke)\n* Ship - Smoke, Sensor Failure\n* Starship - Sensor Failure\n\nStructural Damage\n* Bulkhead Breach\n* Hull Breach\n\nWeapon Damage"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Core Rules?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Core Rules?"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Tactics is a tactical combat system designed to be played as a board game, a tactical combat game, or as a\nreplacement for the combat portion of a Role Playing Game.  The design goal of Tactics is to simplify the elements of tactical combat while allowing the addition of modules that provide different levels of detail to allow each game to simulate just the aspects the players are interested in.\n* Tactics: Core Rules is designed to get players started with the Tactics system and allow any number of players to play Tactics as a pickup game.\n* Setup, gameplay, and winning conditions are all designed to keep things moving.\n* So why are you still reading this?  Start playing!")
              )
            ),
            Core.vx_new_string("Tactics Design Foundation"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tactics Design Foundation"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Simple Core Rules\n* Any Scale\n* Any Genre - Ant Colonies to Elves to the Iraq War to Galactic Empires, Realism, History, Fantasy, Sci-Fi, Movies, Anime, and Pulp Fiction in any combination.\n* Any Scenario - Any scenario with any number of players\n* Level of Detail - Selective Realism, Modular\n* Asymmetrical Sides\n* Reenactments\n* Army Building\n* Consistent mechanics - I don't like rule books or tables. I like detail, but not when I have to look it up.\n* Simple math - The general rule is each modifier can add or subtract 1 from an ability. Where possible, keep it simple.\n* Six-sided dice - Square dice have perfect symmetry, are well known, and are common.\n* Many dice - Rolling lots of dice is satisfying. The more dice rolled the more predictable the result on a bell curve. This allows low level abilities to have a realistic chance of rolling a high number while offering high level abilities increasing consistency.\n* Opposed rolls - Rolling dice against other dice allows for both sides to take part in each conflict. Even when there is no opponent there is still fickle fate to vex you.\n* Open-ended rolls - Open-ended dice allows even the most outmatched opponent a chance at victory (e.g. David and Goliath).\n* Critical Hits - Critical Hits keeps the game from becoming too predictable. Unlike open-ended rolls, however, Criticals provide an opportunity to allow flavor and choice into the game.\n* Skills - It is tough to raise skills. Surviving through many situations teach you how to survive again.\n* Terrain and Situation - Taking advantage of the situation is the great equalizer. Outflanking, High Ground, Surrounding are critical advantages in combat.\n* Equipment - Equipment makes a difference, but a suit of armor on an unskilled opponent is not much of a challenge.")
              )
            ),
            Core.vx_new_string("How does Tactics compare to other games?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("How does Tactics compare to other games?"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Vs. Board Games\n* Board games successfully capture the essence of reality while providing very simple mechanics to allow games to progress quickly and smoothly. The problem with board games is that each game targets only one view of a situation and generally cannot be expanded or modified without breaking the core premise of the game. Generally this leads to numerous different games that describe the same material (e.g. Star Wars). Each game focuses on a different aspect of the material with varying degrees of success and almost no overlap. Once the scenarios of the game are exhausted, the game loses public interest. Tactics seeks to create a system that can absorb new genres and new material and even allow units from different genres to battle one another. It also seeks to allow the elegant game play that board games offer by keeping the core rules simple and expandable.\n\n* Vs. Collectible Games\n* Collectible Games reinvented the classic board game. Instead of fixed rules, the rules were changeable. These changes can take 2 forms: a new expansion set can introduce new rules and environments, and each card may introduce modifications to existing rules. This approach is brilliant when applied correctly. Each expansion can be a standalone game or a supplement to the original game depending on what is agreed upon before play begins. The problems, however, are numerous. Because Collectible Games are extremely profitable, they tend to create unbalanced, 'power' cards that drive up sales but destabilize the game. I suspect that most of the manufacturers are aware of this problem, but because they are profit driven they are unable to avoid this trap. Another brilliant component of Collectible Games is the notion of a player 'building a deck' that is uniquely constructed using the build rules appropriate to the game. This idea allows each match to be entirely unique and variation is only limited by the imagination of the players. The downside of this is again associated with profits. Constructed decks are very expensive. Casual players lack the patience and resources to construct competitive decks, so games heavily favors the richest, most obsessed player instead of the most skilled player. Tactics seeks to avoid these problems by being free, by keeping deck construction rules simple, and by offering a number of preconstructed scenarios. This allows casual players to jump right into the action while allowing hard core players to enjoy themselves by increasing the level of detail instead of increasing the power level.\n\n* Vs. Tactical Games\n* Tactical games have a good understanding of unit tactics, but often do not functionally support individual characters and often over-complicate modifiers and oversimplify rolls and damage. Tactical games are almost universally inappropriate for individual character combat.\n\n* Vs. Role-playing Games\n* RPG games have a strong tactical combat element to them, but they simultaneously over-complicate individual\nactions while largely ignoring the tactical elements of small unit combat. Tactics attempts to bridge this gap and connect tactical combat with the RPG.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_core_scenarios
   * @return {chapter}
   * (func chapter_core_scenarios)
   */
  public static interface Func_chapter_core_scenarios extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_core_scenarios();
  }

  public static class Class_chapter_core_scenarios extends Core.Class_base implements Func_chapter_core_scenarios {

    @Override
    public Func_chapter_core_scenarios vx_new(Object... vals) {
      Class_chapter_core_scenarios output = new Class_chapter_core_scenarios();
      return output;
    }

    @Override
    public Func_chapter_core_scenarios vx_copy(Object... vals) {
      Class_chapter_core_scenarios output = new Class_chapter_core_scenarios();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_core_scenarios", // name
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
    public Func_chapter_core_scenarios vx_empty() {return e_chapter_core_scenarios;}
    @Override
    public Func_chapter_core_scenarios vx_type() {return t_chapter_core_scenarios;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_core_scenarios();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_core_scenarios() {
      return Core_rules.f_chapter_core_scenarios();
    }

  }

  public static final Func_chapter_core_scenarios e_chapter_core_scenarios = new Core_rules.Class_chapter_core_scenarios();
  public static final Func_chapter_core_scenarios t_chapter_core_scenarios = new Core_rules.Class_chapter_core_scenarios();

  public static Base.Type_chapter f_chapter_core_scenarios() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Core Scenarios"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Sample Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sample Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alamo"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alamo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One team defends a strong tactical position, from a superior invading army.")
                      )
                    ),
                    Core.vx_new_string(":Bandits"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bandits"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One team carries an unconcealed treasure across the map while the other team tries to steal it.")
                      )
                    ),
                    Core.vx_new_string(":Blockade"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blockade"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One team must successfully cross the map with half of their units. The other team must stop them.")
                      )
                    ),
                    Core.vx_new_string("Capture the Flag"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Capture the Flag"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each team protects their battle standard.  The other team tries to take it.")
                      )
                    ),
                    Core.vx_new_string(":Conquest"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Conquest"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Crush your enemies, drive them before you, and hear the lamenting of the women. That is what is best in life. - Conan the Barbarian")
                      )
                    ),
                    Core.vx_new_string("High Score"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("High Score"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each team tries to score points.  High score wins.")
                      )
                    ),
                    Core.vx_new_string("King of the Hill"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King of the Hill"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each team attempts to hold a single objective until the clock runs out.")
                      )
                    ),
                    Core.vx_new_string("Treasure Hunt"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Treasure Hunt"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Place treasures randomly.  Each team tries to get more than half of them off the map at their starting location.")
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
   * @function chapter_lets_play
   * @return {chapter}
   * (func chapter_lets_play)
   */
  public static interface Func_chapter_lets_play extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_lets_play();
  }

  public static class Class_chapter_lets_play extends Core.Class_base implements Func_chapter_lets_play {

    @Override
    public Func_chapter_lets_play vx_new(Object... vals) {
      Class_chapter_lets_play output = new Class_chapter_lets_play();
      return output;
    }

    @Override
    public Func_chapter_lets_play vx_copy(Object... vals) {
      Class_chapter_lets_play output = new Class_chapter_lets_play();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_lets_play", // name
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
    public Func_chapter_lets_play vx_empty() {return e_chapter_lets_play;}
    @Override
    public Func_chapter_lets_play vx_type() {return t_chapter_lets_play;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_lets_play();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_lets_play() {
      return Core_rules.f_chapter_lets_play();
    }

  }

  public static final Func_chapter_lets_play e_chapter_lets_play = new Core_rules.Class_chapter_lets_play();
  public static final Func_chapter_lets_play t_chapter_lets_play = new Core_rules.Class_chapter_lets_play();

  public static Base.Type_chapter f_chapter_lets_play() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Let's Play"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("All games start with Setup, consists of a series of Rounds where each unit gets to move and act, and ends when someone achieves Victory."),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Choose a Scenario"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Choose a Scenario"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Choose a [Scenario], generate a [Scenario] or pick one randomly from the [Scenarios] section of this or any other Tactics book.\n* [Scenario Difficulty] - Each [Scenario] has a [Difficulty] rating. For the first game, choose Easy.\n* [Victory Conditions] - Each Scenario defines its own objectives.\n* [Special Rules] - If the [Scenario] has [Special Rules], then these rules should be used for this [Scenario].\n* [Optional Rules] - If the [Scenario] has [Optional Rules], then you may choose to use any or all of them. Remember that more [Rules] tends to increase game time and complexity.  For the first game, ignore [Optional Rules].\n* Gather the required number of [Unit] tokens for this [Scenario].\n* Gather one of each of the [Unit] cards, [Terrain] cards, and [Rule] cards in use for this [Scenario].\n* If the [Scenario] has a number of [Turns], then set the [Turn Clock] to this number.")
              )
            ),
            Core.vx_new_string("Choose Teams"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Choose Teams"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Each [Scenario] describes a number of [Teams]. Any number of [Players] may be on a [Team].\n* Determine which [Players] are on each [Team] in any way you choose.\n* [Players] should sit with their [Team], preferably facing their opponents. For the first game, determine [Teams] randomly.\n* One [Team] on the [Scenario] is marked with a *.  This [Team] has the [Initiative] and goes first.")
              )
            ),
            Core.vx_new_string(":Setup"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Setup"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Choose the [Map] described in the [Scenario] and lay it out like this: [image:MapDeploy.png].\n* Look at the [Deploy] section of the [Scenario].\n* Starting with the [Team] with [Initiative], alternate placing [Terrain] on the Map until all [Terrain] has been placed.\n* Starting with the [Team] with [Initiative], alternate placing their [Units] on the [Map].")
              )
            ),
            Core.vx_new_string("Game Start"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Game Start"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Before starting remember the following Golden Rules:\n* Trump - Any special rules in a scenario override the standard rules.\n* Rounding - All fractions are ignored.")
              )
            ),
            Core.vx_new_string("Turn Start"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Turn Start"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Pass Initiative - If the [Team] with [Initiative] wishes to give the initiative to the next [Team], they may do so ONLY if they have fewer units left to activate than the next [Team].\n* The [Team] with [Initiative] now chooses any [Unit] in their [Team] to activate. Once a [Unit] is activated, it may not be activated again this turn until all units have been activated.\n* If that [Team] has no unit to activate, then [Initiative] is passed clockwise to the next [Team].")
              )
            ),
            Core.vx_new_string("Turn Sequence"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Turn Sequence"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Resolve Tokens - Remove 1 [White Token] from [Unit], then resolve any specific token effects.\n* Perform Actions - The [Unit] may perform any 2 of the following but may not perform more than 1 of the same type except [Move]. I.e. You may [Move], [Move] or [Move], [Attack] but not [Attack], [Attack].\n** [Attack] - Use any weapon or ability on the [Unit] that says [Attack].\n** [Ability] - Use any ability on the [Unit] that says [Action].\n** [Move] - Move up [Speed].\n** [Block] - +1 [Defense], +1 [Armor] but may not [Attack] this turn.\n** [Dodge] - +1 [Defense], -1 [Attack].\n** [Wait] - Await the action of another [Unit]. This allows [Reaction] during their turn.\n** [Recover] - Remove 1 [White Token] from the [Unit].\n** [Change Weapon] - Draw a weapon or change weapons.\n** [Go Prone] - Add [Prone] Token to [Unit]. This provides +1 [Defense] vs. Ranged and -1 [Defense] vs. Melee.\n** [Stand] - Remove [Prone] Token from [Unit].\n* Resolve Actions\n** [Skill Roll] - Roll a number of dice equal to the [Skill Level] of the [Ability] chosen.\n** [Defense Roll] - Each defender rolls a number of dice equal to its [Defense].\n** [Damage Roll] - Roll a number of dice equal to the [Damage Rating] of the weapon.\n** [Armor Roll] - Roll a number of dice equal to the [Armor Rating] of the defender. Note: When defending vs. [Blunt] weapons, the defender may use his [Body] instead of [Armor Rating].\n** [Hits] and [Criticals]\n** When the [Unit] has completed its activity this turn, then [Initiative] is passed clockwise to the next [Team].")
              )
            ),
            Core.vx_new_string("Turn End"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Turn End"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* If all [Units] have been activated and the [Turn Clock] is used, reduce it by 1.\n* Check for [Game Over] conditions.  If not, then begin a new turn.")
              )
            ),
            Core.vx_new_string("Game Over"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Game Over"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("The game ends when any of the following occur:\n* Last Round Ends\n* No Enemy Units Remain\n* Complete Victory condition achieved by any team\n\n* Winning - Each [Team] that acheived a [Complete Victory] condition wins.  If no [Team] acheived a\n[Complete Victory], then each [Team] that acheived a [Partial Victory] condition wins.  Winners gain the [Rewards] for the scenario, if any.\n* Ties - Ties are allowed, though any [Rewards] gained are divided by the number of winners.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_tokens
   * @return {chapter}
   * (func chapter_tokens)
   */
  public static interface Func_chapter_tokens extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_tokens();
  }

  public static class Class_chapter_tokens extends Core.Class_base implements Func_chapter_tokens {

    @Override
    public Func_chapter_tokens vx_new(Object... vals) {
      Class_chapter_tokens output = new Class_chapter_tokens();
      return output;
    }

    @Override
    public Func_chapter_tokens vx_copy(Object... vals) {
      Class_chapter_tokens output = new Class_chapter_tokens();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/core_rules", // pkgname
        "chapter_tokens", // name
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
    public Func_chapter_tokens vx_empty() {return e_chapter_tokens;}
    @Override
    public Func_chapter_tokens vx_type() {return t_chapter_tokens;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Core_rules.f_chapter_tokens();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_tokens() {
      return Core_rules.f_chapter_tokens();
    }

  }

  public static final Func_chapter_tokens e_chapter_tokens = new Core_rules.Class_chapter_tokens();
  public static final Func_chapter_tokens t_chapter_tokens = new Core_rules.Class_chapter_tokens();

  public static Base.Type_chapter f_chapter_tokens() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Tokens"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("White Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("White Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("White Tokens represent temporary conditions that will pass quickly.\n* [Activate]: Remove one White token."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Duration"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duration"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Duration tokens are placed on an ability card when it is activated.\n* When the ability no longer has any duration tokens, it is removed.")
                      )
                    ),
                    Core.vx_new_string(":Morale"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Morale"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/MoraleToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Spirit]\n* A unit must move 1 space away from the source of the attack/damage for each Morale Token received.\n* If it already has Morale tokens,  it must roll Morale tokens vs. [Spirit] and must move additional spaces\nfor any [Hits].\n* This movement does not cost [Speed], but if the unit is blocked from moving away it will suffer a [Collision]\nof Speed equal to the number of remaining [Hits].\n* [Anytime]: If [Morale] >= [Spirit] then the unit will take no [Actions], move at its best speed away from\nany opponents, and will leave the map if able.")
                      )
                    ),
                    Core.vx_new_string(":Stun"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stun"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/StunToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Mind]\n-1 [Defense]\n-1 [Speed]\n-1 [Skill]\n* [Move]: If [Stun] >= [Mind], then make a full Move along a random path.\n* [Action]: If [Stun] >= [Mind], then the unit is confused and may not perform an [Action].\n* [Anytime]: If [Stun] >= [Body], then replace the excess Stun with [Damage] tokens.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Black Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Black Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Permanent Effects that will not normally be removed during a battle such as Damage."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Suffering Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Suffering Damage")
                      )
                    ),
                    Core.vx_new_string("Treating Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Treating Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Blood Loss, if present, should usually be treated first. This is because Blood Loss can cause death in as little as 4 minutes from a single wound.\n* Shock, if present, should be treated next. It can kill in as little as 30 minutes.\n* Eventually fatal wounds, if any, should be treated next. These wounds become progressively worse kill in from 1 hour to 9 days.\n* Lastly, the wound itself should be treated. Untreated wounds take twice as long to heal on their own.")
                      )
                    ),
                    Core.vx_new_string("Healing Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Healing Damage")
                      )
                    ),
                    Core.vx_new_string(":Damaged"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Damaged"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/DamageToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("-1 [Body]\n-1 [Defense]\n-1 [Speed] for every 2\n-1 [Skill]\n* [Anytime]: If [Damaged] >= [Body], then the unit is incapacitated.\n* [Anytime]: If [Damaged] >= 2x [Body], then the unit is dead.\n* [Anytime]: If [Damaged] >= 3x [Body], then the unit is completely destroyed.")
                      )
                    ),
                    Core.vx_new_string("Blood Loss Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blood Loss Damage")
                      )
                    ),
                    Core.vx_new_string("Broken Bone Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Broken Bone Damage")
                      )
                    ),
                    Core.vx_new_string("Burn Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Burn Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Burn Damage is characterized by shallow wounds with great surface damage. Fire, Acid, Cold, Abrasions, and Radiation all produce Burn Damage.")
                      )
                    ),
                    Core.vx_new_string("Concussive Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Concussive Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Concussive Damage affects the entire target at once in a Shockwave. Explosions, Sonic, Vibrations, sudden decelerations like falling and crashes all produce concussive damage.")
                      )
                    ),
                    Core.vx_new_string("Impact Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Impact Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Impact Damage is characterized by a generalized blunt trauma in a relatively small area.")
                      )
                    ),
                    Core.vx_new_string("Nerve Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nerve Damage")
                      )
                    ),
                    Core.vx_new_string("Puncture Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Puncture Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Puncture Damage is characterized by a deep wound with little surface damage.")
                      )
                    ),
                    Core.vx_new_string("Shock Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shock Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Shock is a life-threatening medical condition as a result of insufficient blood flow throughout the body. Shock often accompanies severe injury or illness. Medical shock is a medical emergency and can lead to other conditions such as lack of oxygen in the body's tissues (hypoxia), heart attack (cardiac arrest) or organ damage. It requires immediate treatment as symptoms can worsen rapidly.\n* Types of Shock:\n** Septic shock is caused by bacteria. It is treated with antibiotics and fluids.\n** Anaphylactic shock is caused by hypersensitivity or allergic reaction. If is treated with diphenhydramine (Benadryl), epinephrine (an \"Epi-pen\"), and steroid medications (solumedrol).\n** Cardiogenic shock is from heart damage. It is treated by identifying and treating the underlying cause.\n** Hypovolemic shock is from blood or fluid loss. It is treated with fluids (saline) in minor cases, and blood transfusions in severe cases.\n** Neurogenic shock is from spinal cord trauma. It is the most difficult to treat as spinal cord damage is often irreversible. Immobilization, anti-inflammatories such as steroids and surgery are the main treatments.")
                      )
                    ),
                    Core.vx_new_string("Sickness Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sickness Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sickness Damage is characterized by physical and mental weakness. Poison, Disease, and Radiation can all cause Sickness.")
                      )
                    ),
                    Core.vx_new_string("Slash Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Slash Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Slash Damage is characterized by long surface wounds of varying depth. If the wounds are sufficiently deep they may remove entire extremities.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Red Tokens"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Red Tokens"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Red tokens represent continuous Effects that will eventually lead to death such as Bleeding and Fire.\n* [Activate]: Add one Stun token."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bleeding"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bleeding"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/BleedingToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each turn add 1 [Stun] token Any adjacent [Unit] may use an [Action] to extinguish 1 Fire token."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bloody, Serrated, Sharp")
                      )
                    ),
                    Core.vx_new_string(":Burning"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Burning"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Tokens/FireToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Activate]: Roll Fire tokens vs. [Defense].\n* [Hits] are [Damage] tokens.\n* [Critical Hits] are additional Fire tokens. Also, a random adjacent space gains Fire tokens equal to the [Critical Hits]\n* If no [Hits] are scored, remove a Fire Token.\n* Any adjacent [Unit] may use an [Action] to extinguish 1 Fire token."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Burning, Fiery, Flaming")
                      )
                    ),
                    Core.vx_new_string("Choking Damage"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choking Damage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This includes any obstruction of airways such as smoke, water, sand, fungus, disease, physical choking, etc. It also includes damage to filters and other aspiration/ventilation systems on machines.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Status"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Status"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Death"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Death"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Tomorrow is a hope, never a promise. - Kindred (Lamb), Runeterra")
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
        "nx/tactics/books/core_rules", // pkgname
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
      output = Core_rules.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Core_rules.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Core_rules.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Core_rules.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Core Rules"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("warrior_msleal_full.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Core Overview"),
            Core_rules.f_chapter_core_overview(),
            Core.vx_new_string("Let's Play"),
            Core_rules.f_chapter_lets_play(),
            Core.vx_new_string("Common Rules"),
            Core_rules.f_chapter_common_rules(),
            Core.vx_new_string("Tokens"),
            Core_rules.f_chapter_tokens(),
            Core.vx_new_string("Core Scenarios"),
            Core_rules.f_chapter_core_scenarios(),
            Core.vx_new_string("Core Maps"),
            Core_rules.f_chapter_core_maps()
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
    mapfunc.put("chapter_common_rules", Core_rules.t_chapter_common_rules);
    mapfunc.put("chapter_core_maps", Core_rules.t_chapter_core_maps);
    mapfunc.put("chapter_core_overview", Core_rules.t_chapter_core_overview);
    mapfunc.put("chapter_core_scenarios", Core_rules.t_chapter_core_scenarios);
    mapfunc.put("chapter_lets_play", Core_rules.t_chapter_lets_play);
    mapfunc.put("chapter_tokens", Core_rules.t_chapter_tokens);
    mapfunc.put("tacticsbook", Core_rules.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/core_rules", maptype, mapconst, mapfunc);
  }

}
