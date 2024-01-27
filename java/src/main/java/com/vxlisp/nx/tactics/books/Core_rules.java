package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Core_rules {

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
            Core.f_new(
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
            ),
            Core.vx_new_string("Let's Play"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Common Rules"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Common Rules"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Tokens"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Tokens"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Core Scenarios"),
            Core.f_new(
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
            ),
            Core.vx_new_string("Core Maps"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Core Maps"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
    mapfunc.put("tacticsbook", Core_rules.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/core_rules", maptype, mapconst, mapfunc);
  }

}
