package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Advanced_rules {

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
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Rules Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Advanced Tokens"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Tokens"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Advanced Rules"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Rules"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string(":Genres"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Genres"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
    mapfunc.put("tacticsbook", Advanced_rules.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/advanced_rules", maptype, mapconst, mapfunc);
  }

}
