package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class High_technology {

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
        "nx/tactics/books/high_technology", // pkgname
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
      output = High_technology.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return High_technology.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new High_technology.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new High_technology.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("High Technology"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("HighTech.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("High Tech Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: High Technology?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: High Technology?")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Cyberpunk Campaign"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cyberpunk Campaign"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Car Wars"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Car Wars"),
                        Core.vx_new_string(":scenariomap"),
                        Core.f_new(
                          Base.t_scenariomap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Escort Duty"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Escort Duty"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An Agricorp has commissioned some independents to covertly escort an unmarked tractor-trailer 1900 miles from\ntheir site in La Jolla to a USDA facility near Nashville, TN.\n* A rival has sent its own independents to get their hands on the cargo.\n* Note: The cargo/escort is a decoy for the real shipment."),
                                Core.vx_new_string(":teammap"),
                                Core.f_new(
                                  Base.t_teammap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Escort"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Escort"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("$1000/each if cargo delivered intact."),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 1 Tractor-trailer\n* 2 Sedans"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Prevent enemy from taking any of the shipment.")
                                      )
                                    ),
                                    Core.vx_new_string(":Interceptors"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Interceptors"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("Capture the entire shipment."),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 1 Van\n* 3 Sedans"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Capture any of the shipment.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Safe House"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Safe House"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A small-time fixer has evidence of the identity of a cyber serial killer, the Night City Stalker.  Two news\norganizations are bidding on the deal, but the loser contacted the Stalker out of spite.")
                              )
                            ),
                            Core.vx_new_string("Toxic Spill"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Toxic Spill"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While guarding a 200 person Nomad camp, the well drill discovers a hidden toxic waste dump.  Alarms alert the\ndumping company that their little secret has been discovered, so they send a team to 'clean up' the problem.\n* The whole Nomad camp must evacuate 3 miles to town before they are silenced, unfortunately they do not have\nenough vehicles to do it in one trip.")
                              )
                            ),
                            Core.vx_new_string("The Heist"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("The Heist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* In a winter storm, a shipment of Palladium is diverted to a small warehouse in a corporate park.  It will not\nbe moved until the weather turns, so it is a perfect opportunity to break in and steal the goods.\n* During the storm, the skies are dangerous, and even the roads are fairly dicey.  Snowmobile are certainly an\noption."),
                                Core.vx_new_string(":teammap"),
                                Core.f_new(
                                  Base.t_teammap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Thieves"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Thieves"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("Capture the whole shipment."),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 10 Thieves\n* 5 Snowmobiles\n* 3 Sedans"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Take at least half of the shipment.")
                                      )
                                    ),
                                    Core.vx_new_string(":Guards"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Guards"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("Protect the entire shipment."),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 10 Armed and Armored Guards\n* 10 Unarmored, sleeping Guards\n* 5 Sedans\n* 2 Helicopters"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Protect at least half of the shipment.")
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
            Core.vx_new_string("High Tech Rules"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Rules"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Cyberspace"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cyberspace"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A huge, interconnected series of computer networks, software systems, and virtual realities that form a continuous\ndigital universe of nearly infinite scope.\n* Interface programs sort through this information and produce a virtual world tailored to the user's desire.  The\nmost common interface is that of digital cities that mirror their real world equivalents, but display computer\nsystems, data blocks, and information pathways instead of buildings, people, and highways.\n* Nodes - Nodes in Cyberspace are locations in Cyberspace.  Nodes include Telecom lines, Satellite Uplinks,\nFirewalls, Security Cameras, Remote Controls, Databases, and Virtual Realities.  Different Nodes usually require\nvalid security or payment to use.  Nodes can also hold nasty surprises including alarms and defense programs.\n* Movement - Distances are insignificant in Cyberspace.  Instead, movement is measured in tasks.  Any program can\nperform a number of tasks each turn equal to [Netrunning] skill.  Each node entered in Cyberspace is a task.\nPerforming any [Action] at a node is also a task."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Digital Web, The Net, The Network, World Wide Web, The Web")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("High Tech Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Body Armor"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Body Armor"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Stealth Suit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth Suit"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Nuclear launch detected... - Starcraft"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ghost Special Operative")
                              )
                            ),
                            Core.vx_new_string("Powered Body Armor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Powered Body Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Heavy Body Armor"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hard Suit")
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
            Core.vx_new_string("High Tech Spacecraft"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Spacecraft"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Interplanetary travel is a common reality in the 23rd century.\n\n* Types - Spaceships are mostly cargo and ore mining ships, followed by gas tankers.\n\n* Prismatic Armor - Modern ships have a very thick ablative skin composed of a honeycomb of diamond nano-fibers filled with a highly refractive, radiation and impact absorbing ceramic compound. This armor has a number of beneficial qualities. It deflects energy in random directions which provides radiation resistance, stealth, and energy weapon defense. It fragments and ablates under energy weapon and kinetic impact which shatters incoming	micro-meteors and high speed weaponry and distributes the incoming energy in all directions to prevent penetration. The ablating particles also carry away excess heat in a similar way to evaporation. The resultant particles become a cloud of anti-energy aresol. Any impact strong enough to penetrate the armor will liquify the surrounding armor which quickly solidifies and helps to seal hull breaches.\n\n* Deflectors - Most long-range ships are equipped with a deflector array. The array is composed of a wide bank of closely spaced ionizing lasers and particle beams. The lasers ionize the particles and form a strong magnetic force down the length of the beam. Small objects headed toward the ship are ionized by the beams and then redirected away by the magnetic field. Point defense lasers are used for larger particles as well as incoming missiles.\n\n* Propulsion - Propulsion spaceward (outward from the Sun) is often provided by massive Stellasers that reflect and concentrate solar radiation into a 'tight' beam similar to a laser. Ships have depolyable solar sails to capture this energy for propulsion and recharging batteries. These sails can even be used to slowly tack inward. Some cargo ships use particularly large sails to slowly sail the solar wind to reduce costs. Most ships rely on powerful nuclear thrusters for sunward (toward the Sun) travel to accelerate the ship at up to 1g. When possible the ship will accelerate for half the voyage, turn around, and then decelerate for the rest of the trip.\n\n* Gravity - Except for short periods of weightlessness midway through the trip, the passengers feel gravity during the trip. Up is toward the nose and down is toward the engines. The internal organization of a ship is very similar to a skyscraper. For fuel and reaction mass reasons, the ship may need to travel at slower speeds (and lower gravity) or coast at zero gravity midway through the trip. For this reason, large ships are often equipped with rotating decks to simulate gravity for the crew.\n\n* Reentry - Spaceships are generally too heavy and not equipped to survive a landing on anything larger than a small moon. Landing on something as massive as the Earth's Moon is possible, but achieving orbit again requires a powerful Laser Lifter system like the one on Luna.\n\n* Travel Costs\n** Planet to orbital station skyhooks travel daily and cost 200-300 credits one-way.\n** Orbital to moon travel twice weekly and cost 600 credits one-way.\n** Interplanetary trips are like cruises. They travel weekly and cost 20,000-30,000 credits\none-way.\n\n* Safety - Inner ship walls are covered with pillowy-soft panels of 'Space Gel'. This viscous fluid provides a combination of heat insulation, impact padding, radiation shielding, shrapnel absorption, and depressurization protection. Space Gel exposed to freezing temperatures will immediately harden into a very durable solid. If the hull is breached, damaged panels will leak Space Gel. Any gel that touches an area near the breach will instantly freeze, gradually plugging the leak."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("High Tech Satellites"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("High Tech Satellites"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Communication Satellite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Communication Satellite")
                              )
                            ),
                            Core.vx_new_string("Damocles Orbital Laser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Damocles Orbital Laser"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("HighTech/DamoclesSatellite.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Orbital Laser Platform designed for strategic strikes against land targets. May also be used agaist\nlarge orbital targets or for asteroid defense.")
                              )
                            ),
                            Core.vx_new_string("EMP Satellite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("EMP Satellite"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* What's it going to be, Plissken? Them or us? I shut down the third world, you win they lose. I shut\ndown America, they win, you lose. The more things change, the more they stay the same. - Snake Plissken,\nEscape from LA"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Goldeneye")
                              )
                            ),
                            Core.vx_new_string("Hunter Killer Satellite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunter Killer Satellite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A combat ready satellite often masquerading as a peaceful version. Hunter Satellites act like UAV's\nquietly patrolling until their weaponry is needed, then they are disposable."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Battle Satellite")
                              )
                            ),
                            Core.vx_new_string("Orbital Skyhook Satellite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Orbital Skyhook Satellite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Large rotating satellite in low orbit. Its purpose is to drop its kilometers long tether to dock with a [Suborbital Shuttle] and use its momentum to fling the shuttle into higher orbit. A few of these Skyhooks at different orbits can pull a shuttle all the way into high orbit. Pulling up shuttles gradually degrades the satellite's orbit, but fortunately, the same system can be used in reverse to slow orbital craft without using fuel which returns lost momentum to the Skyhook.")
                              )
                            ),
                            Core.vx_new_string("Solar Reflector Satellite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solar Reflector Satellite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* These are massive, lightweight solar mirrors that can be focused for variouse purposes. They can focus light for solar farms, generate light for long nights like on the moon, generate thrust by light pressure and by heating ablative drives.")
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
            Core.vx_new_string("High Tech Aircraft"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Aircraft"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("High Tech Military Aircraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("High Tech Military Aircraft"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Valkyrie Air Cavalry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Valkyrie Air Cavalry"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft")
                              )
                            ),
                            Core.vx_new_string("Aurora Transatmospheric Fighter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aurora Transatmospheric Fighter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A sleek, shuttle-like jet with speeds of Mach 5. A nuclear engine, stealth armor, full environmental containment, and a virtual or direct neural link make this one-man craft the deadliest thing in the skies.\n* It carries twin 30mm autocannons, a plasma cannon, 16 air-to-air missiles, and 2 fuel air explosives for ground targets."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft")
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
            Core.vx_new_string("High Tech Heavy Armor"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("High Tech Heavy Armor"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("High Tech Land Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("High Tech Land Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Hover Tank"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hover Tank")
                              )
                            ),
                            Core.vx_new_string("Light Walker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Light Walker")
                              )
                            ),
                            Core.vx_new_string("Heavy Walker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heavy Walker")
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
            Core.vx_new_string("Space Colonies"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space Colonies"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Saturn Colonies"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saturn Colonies"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* With the exception of Titan, the outer planets are too remote and unimportant\nto ever be colonized. Jupiter provides an unlimited supply of gas resources, so\nSaturn, Uranus, and Neptune have little to offer."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Titan Research Station"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Titan Research Station"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A small, permanent research colony has been erected on Titan to study its\nunique atmosphere and geology. The hope was to discover evidence of primitive\nlife, but no life has yet to be discovered.")
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
            Core.vx_new_string("Car Wars"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Car Wars")
              )
            ),
            Core.vx_new_string(":Cyberpunk"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Cyberpunk"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The year is 2151.\n\nThings are pretty bad on planet Earth:\n* Global Warming - The build up of smothering greenhouse effect gases has resulted in the complete melting of the Arctic\nice cap as well as much of the Antartic ice cap.  Coastal areas have been inundated and global temperatures continue to\nrise, a new record every year.\n* Resource Depletion - As the climate changed, desperate farmers overfarmed their land, increasing erosion and therefore\nfood prices.  Fossil fuels became increasingly scarce and given the ongoing climate problems, ecologically unsuitable.\n* Overpopulation -\n* Economic Collapse -\n\nThings are slightly better in space:\n* Orbital Stations - For the last hundred years, large space colonies have been constructed at the five Lagrange points\naround Earth.  Relative to Earth, the Orbital stations are gleaming paradises of corporate efficiency.  Corporate\ninterests are certainly strong on the Orbital colonies, and the Orbitals increasingly chafe at Earth's taxation of their\ngoods and the high tariffs on imports.\n* Luna - Huge moon bases dot the lunar surface.  With its low gravity and limitless lunar rock, the Moon is the natural\nconstruction center for most Orbital facilities and spaceships.  Surface and underground mining operations go around the\nclock.  Enormous massdrivers propel the material into Earth orbit.\n* Mercury - Solar stations on Mercury provide limitless power while the molten\nsurface provides limitless ore. Though the surface is hellish and survival is\ndifficult, Mercury provides wealth beyond imagining to those able to survive.\nThe population is 90% male with most residents on a 6 year work contract. After\nthe contract they usually return to wherever they came from with enough money to\nbuy a house and start a family. Like a military veteran, Mercury companies also\noffer generous benefits for the rest of the contractor's life or generous death\nbenefits to their family if they don't survive. Despite extensive safety systems,\nthe fatatlity rate remains 1 in 20 even among these hardy folk. Politically,\nMercury is extremely independent and has little patience for the affairs of the\nother planets.\n* Venus\n* Mars\n* Asteroid Belt - Though Luna provides a steady supply of material to the colonies, whole Asteroids can be ferried from\nthe Asteroid Belt to create instant colonies.  Further, the valuable minerals in an asteroid are easier to detect and\nmine than in either Lunar or Terrestrial mines.  The Asteroid field is large, however, so a whole crop of freelance\nprospectors have travelled to the Asteroid Belt in a high-tech gold-rush.\n* Jupiter\n* Saturn\n\n* Cryomax - Maximum security prison where prisoners are stored in partial cryonic suspension to maximize space.\n** Reference - Demolition Man\n* Crystal - Liquid crystal computer matrix"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Sprawls"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sprawls"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dirtboys, Dirtgirls"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bounty Hunter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bounty Hunter")
                              )
                            ),
                            Core.vx_new_string("Cyber Psycho"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cyber Psycho"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Buttonhead - someone addicted to artificially stimulating the pleasure centers of the brain."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Buttonhead")
                              )
                            ),
                            Core.vx_new_string(":Enforcer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enforcer")
                              )
                            ),
                            Core.vx_new_string(":Fixer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fixer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fixers buy and sell information, goods, and services.\n* Some of their services merely require the right connections.  Others are not quite legal."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bookie, Executive Secretary, Gobetween, Information Broker, Negotiator, Organizer, Producer, Roadie, Thirdman")
                              )
                            ),
                            Core.vx_new_string("Gang Member"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gang Member")
                              )
                            ),
                            Core.vx_new_string(":Netrunner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Netrunner"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Outlaw computer jocks or hackers.  Some people do it for the glory; most do it for the money.  Information is\npower in the modern world and all the information is somewhere on the Net.  Further, the modern world is a marvel\nof automation, so a clever person may turn that automation to his own uses."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Crystaljock, Hacker")
                              )
                            ),
                            Core.vx_new_string(":Nomad"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nomad"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Deltajock - A pilot of delta-winged smuggling craft\n* Panzerjock - A driver of armored smuggling hovercraft"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Deltajock, Gypsy, Linerunner, Panzerjock, Road Warrior, Smuggler")
                              )
                            ),
                            Core.vx_new_string(":Rocker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rocker"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zonedancing - Dancing turned into a dominance game.  A dancer attempts to persuade other dancers in his zone to\nconform to his movements using charisma, talent or violence."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bard")
                              )
                            ),
                            Core.vx_new_string(":Solo"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solo"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I don't want to walk this Earth if I gotta do it solo...so...low. - Iyaz, Solo"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Assassin, Hit Man")
                              )
                            ),
                            Core.vx_new_string(":Tech"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tech"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cybertech")
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
            Core.vx_new_string("Jovian Chronicles"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Jovian Chronicles"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":UEA"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("UEA"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("United Earth Alliance"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("UEA Commando"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Commando"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry")
                              )
                            ),
                            Core.vx_new_string("UEA Marine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Marine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Standard issue for all regular infantry and covert ops personnel.\n* High Impact Plastics with reinforced joints.\n* Enhanced Sensory gear and Comm System\n* HUD Targeting\n* Optional Backpacks with custom gear"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("UEA Mobile Infantry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Mobile Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Standard issue for assault and special forces personnel.\n* Hardened Crystalline Lattice Ceramic Compounds\n* Elaborate Sensory and Comm System\n* HUD Targeting with Smart Weapon links\n\nPowerful Backpack package including:\n* Ion thrusters\n* Heat Sink\n* Mini Fusion Plant\n* Y-rack gernade launcher (optional I-rack or micro turret)\n* Weapons can be powered from plant\n* Environmental Independence\n* Flamethrowers and Thrusters in arms and legs\n* Stealth options available"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Infantry"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("UEA Mobile Assault Infantry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Mobile Assault Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Form is vaguely humanoid\n* Armor is extremely heavy and hardened\n* Weapons are built in and smart\n* Power Assist and Hand to Hand Weaponry make few obstacles a barrier\n\nWeapon Packages\n* When standing still the armor is considered a fixed weapon platform.\n* Heavy Machine Guns\n* Light Autocannon\n* Multiple Missile Launchers\n\nBackpack Package\n* Large Fusion Plant\n* Improved Heat Sink\n* Thrusters are extremely powerful\n* Wheels in legs for fast road movement\n* Speed and Maneuverability in open terrain are the trademarks of these types.\n* They are clumsy and overly destructive in tight quarters.\n* These models are purely Assault/Scorched Earth types similar to miniature tanks."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Infantry"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("UEA Pilot"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Pilot")
                              )
                            ),
                            Core.vx_new_string("UEA Mecha Pilot"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Mecha Pilot")
                              )
                            ),
                            Core.vx_new_string("UEA Tech"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("UEA Tech")
                              )
                            ),
                            Core.vx_new_string("Cerberus Mech Suit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cerberus Mech Suit"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Cerberus is the first cutting edge Mobile Suit design from the UEA.\n* The name Cerberus comes from the large ECM pods on each shoulder which\ncontinually scan in all directions giving the appearance of 3 heads.\n* The Cerberus is designed as a hit-and-run unit, so it very fast and\nmanueverable but has limited endurance by design. It is only available\nto commanders and elite pilots.\n* 30mm Massdriver with Depleted Uranium/Tungsten rounds. 20 shots.\n* Linked 20mm Vulcan Autocannons in the head.\n* 1 Plasma Lance\n* 1 Mech Combat Knife"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("63tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("17m"),
                                Core.vx_new_string(":speedland"),
                                Core.vx_new_string("36kph"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string("1.8g"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("15m")
                              )
                            ),
                            Core.vx_new_string("Dragonstriker Mech Armor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragonstriker Mech Armor"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("JovianChronicles/DragonstrikerToken.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mechs are designed to battle other mechs and perhaps cripple enemy capital ships.\nThe Dragonstriker is a unique prototype designed to attack enemy capital ships and\ninstallations directly. It is a massive mech, towering over other mechs and carrying\nformidable weapons to battle both capital ship and other mechs.\n* The Dragonstriker has a detachable booster that provides extra acceleration and range.\nThe booster also houses the 2 Medium Laser cannons for strafing enemy capital ships.\n* 4 Heavy Anti-Ship Beam Cannon\n* 2 Medium Anti-Ship Laser Cannon (2 linked under for strafing attacks, mounted to booster)\n* 6 30mm Vulcan Autocannon (4 linked forward, 2 linked rear in head)\n* 4 Heavy Anti-Ship Missile (4 forward)\n* 2 Anti-Missile Laser Turret (1 forward, 1 rear)"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("CXE-01"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("110tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("24m")
                              )
                            ),
                            Core.vx_new_string("Hachiman Destroyer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hachiman Destroyer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Hachiman is the workhorse of the UEA navy. They have been produced\nfor many years with minor upgrades.\n* 1 Point Defense System\n* 6 Railcannon Turrets\n* 2 Missile Bays\n* 2 Laser Turrets"),
                                Core.vx_new_string(":speed"),
                                Core.vx_new_string(".6g"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Spacecraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("60"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("5500tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("208m"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("80m")
                              )
                            ),
                            Core.vx_new_string("Lucifer Cybersat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lucifer Cybersat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Lucifer’s designed for one purpose - to ambush and kill enemy warships.  Its\nsophisticated Stealth systems allow it to hide and its strong electronic warfare suite\nprevents its prey from calling for help.  Powerful thrusters allow it to accelerate at\nincredible speeds, and a cluster of six small linked particle cannons and two large\nones allow it to inflict massive damage very quickly.\n* Armor - Despite the advanced technology, its armor is quite thin for its size, and\nin a stand-up fight, it will almost certainly lose. The only questions are how to\nforce it into a stand-up fight and how many of its attackers it can take with it.\n* Particle Cannons - The combined power of the dual particle cannons are equal to a\nspaceship's main gun. They have separate fusion engines just to recharge its capacitors,\nbut it still takes 30 seconds between firings.\n* Particle Array - The 6 smaller particle cannons are designed for rapid fire against\nfast moving targets and are used between firing of the main guns.\n* Claws - Its claws are independent wire-guided drones armed with small energy weapons\nto deal with enemy interceptors. The claws are very fast and agile, but not very tough.\nThey can replenish their fuel reserves by docking with the Lucifer.\n* Speed - The drones will almost never use their full top speed, and the Lucifer will\nmake every effort to conserve its remass.  For long-range travel, it won’t boost at\nmore than 0.4 or 0.6 Gs except in short bursts.  Much of its time will be spent\ndrifting along a medium-traffic orbit.\n* Stealth - The Lucifer carries an advanced ECM/stealth package that allows it to\nsneak up on enemies and attempt to cripple them while scrambling any distress calls.\n\nECM(6, 10km), Stealth (6);\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Particle Cannon Cluster	E	F	+0	x12	4	+4	Hw,Red;AD(2),HEAT	Unl.\n2	Mega Particle Cannon	E	F	-1	x30	7	-1	Red,Hw;AD(2),HEAT;Link	Unl."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("CXS-01B, Automated Experimental Terror Raider"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("95tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("18.8m"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string("4g"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Mission Section"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Mission Section"),
                                        Core.vx_new_string(":unitspecialtymap"),
                                        Core.f_new(
                                          Base.t_unitspecialtymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Stealth Vessel"),
                                            Core.f_new(
                                              Base.t_unitspecialty,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Stealth Vessel")
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
                            Core.vx_new_string("Lucifer Claw Drone"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lucifer Claw Drone"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Armor:	10/20/30\n*Miscellaneous Threat Value (MTV): -\nCrew:	Computer 1 (Dumb, Level 2) (2 actions)\n\nAccessories: Autopilot; Arm: Manipulator Arm (R5, Can Punch); Armor: HEAT Resistant(5); Communications (-2, 2km);\nHostile Environment Protection: Radiation (4), Vacuum, Extreme Cold; Sensors(+0, 2km); Vulnerable to Haywire;\nQuantity	Name	Type	Arc	ACC	DM	BR	ROF	Perks + Flaws	Ammo\n1	Laser Cannon	E	FF	+1	x10	5	+0	Red;AD(1),HEAT	Unl.\n1	Plasma Lance	E	F	+0	x15	M	+0	AC,Red;HEAT	Unl."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3tons"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string("5g")
                              )
                            ),
                            Core.vx_new_string("Siren Space Interceptor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Siren Space Interceptor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Siren Fighter is the standard medium range interceptor spaceship\nused by the UEA. It is faster than any other short range space craft in the\nSolar System, but without high mobility verniers it is outclassed by Mobile\nSuits. It is ideally suited for patrolling and policing the space lanes.\n* The Siren can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Medium Railguns\n* 6 Medium Missiles\n* 4 Light Missiles"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("40tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("14m"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string("3.5g"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("12m")
                              )
                            ),
                            Core.vx_new_string("Syreen Mech Suit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Syreen Mech Suit"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("JovianChronicles/SyreenToken.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Syreen Suit is a Siren space fighter retrofitted into a Mech Suit. It was hastily\nconstructed when the first conflict with the Jovians displayed the dominant mobility of\nthe Jovian Mech Suits.\n* As an efficient and cheap design, it can be fielded in large numbers. However, it does\nnot compare well to the new Mech Suits that it is meant to face, so casualties are high.\n* The Syreen can be launched from Earth using a booster rocket making it even more\npractical for Earth defense.\n* 2 Heavy Missiles\n* 6 Medium Missiles\n* 4 Light Missiles\n* Point defense laser system\n* 2 Crude manipulator arms for close combat.\n* The command variant includes a powerful ECM pod."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("52tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("17.2m"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string("3g"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("17.5m")
                              )
                            ),
                            Core.vx_new_string("Poseidon Battlecruiser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poseidon Battlecruiser"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Poseidon Class Battlecruiser is the top of the line UEA warship. It\ngets its name from the two rotating living sections that give the ship the\nappearance of a trident.\n* The Poseidon outclasses any other warship from any faction and is a\nmenancing presense. It was, however, designed before the advent of Mech\nSuits, so it carries more interceptors than Mechs.\n* Point Defense System\n* 4 Particle Accelerator Batteries\n* 4 Railcannon Batteries\n* 6 Interceptors\n* 4 Mech Suits"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Spacecraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("200"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("30ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("325m"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string(".5g"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("200m")
                              )
                            ),
                            Core.vx_new_string("Tengu Escort Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tengu Escort Carrier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Tengu is a long range craft designed for limited engagements and\npolicing. It has extensive supplies but lacks firepower.\n* 1 Point Defense System\n* 2 Missile Bays\n* 2 Mech Suits\n* 2 Fighters\n* 2 Catapults"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Spacecraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("24"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("25ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("250m"),
                                Core.vx_new_string(":speedspace"),
                                Core.vx_new_string(".5g"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("38m")
                              )
                            ),
                            Core.vx_new_string("Wyvern Mech Suit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wyvern Mech Suit"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("JovianChronicles/WyvernToken.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Wyveern is the first and most numerous of the UEA Mech Suits.\nThough a copy of the Martial Federation Defender, it is a sturdy,\nreliable and most importantly mass-produceable design. Its primary\nlimitation is the lack of energy weapons which limits its combat\nendurance before it needs to be rearmed.\n* 1 Hyperbazooka\n* 2 Massdriver Machineguns\n* 2 Self guided Missiles"),
                                Core.vx_new_string(":speed"),
                                Core.vx_new_string("1.4g"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("55tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("17m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("4m"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("2.4mach"),
                                Core.vx_new_string(":speedland"),
                                Core.vx_new_string("36kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("14m")
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
            Core.vx_new_string("Mobile Suit Gundam Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mobile Suit Gundam Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Gundam Equipment"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gundam Equipment"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Energy rating for MW weapons assumes a 3 second burst."),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Titanium Composite"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Titanium Composite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("This is the state of the art armor plate before the discovery of Gundarium Alpha which completely eclipses it.")
                              )
                            ),
                            Core.vx_new_string("Gundarium Alpha"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gundarium Alpha"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Originally called Luna Titanium, it was renamed after the success of the RX-78 Gundam built from it.\nA super high-tensile alloy originally known as Luna Titanium.  Originally intended for use inside thermonuclear\nreactors, this alloy's superb strength, durability, heat resistance and radiation-absorbing properties make it\nan ideal material for mobile suit armor."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Gundarium, Luna Titanium")
                              )
                            ),
                            Core.vx_new_string("Gundarium Gamma"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gundarium Gamma")
                              )
                            ),
                            Core.vx_new_string("60mm Vulcan Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("60mm Vulcan Cannon"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Stats based on 57mm Bofors Naval Gun"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("VCU-505EX-Gry/Ver.009 (Titans) / VCU-505EX-V*B/Ver.012 (AEUG)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("1000m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("8.5km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("220/min")
                              )
                            ),
                            Core.vx_new_string("100mm Machine Gun"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("100mm Machine Gun"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("NF-GMG-Type.37"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("600m/s")
                              )
                            ),
                            Core.vx_new_string("120mm Machine Gun"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("120mm Machine Gun"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("600m/s"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("100")
                              )
                            ),
                            Core.vx_new_string("180mm Recoilless Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("180mm Recoilless Cannon"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("NFHI-GMCa-type.09"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("300m/s")
                              )
                            ),
                            Core.vx_new_string("240mm Recoilless Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("240mm Recoilless Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("300m/s")
                              )
                            ),
                            Core.vx_new_string("280mm Bazooka"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("280mm Bazooka"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Rocket Launcher"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("120m/s"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("4")
                              )
                            ),
                            Core.vx_new_string("360mm Hyper Bazooka"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("360mm Hyper Bazooka"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Capable of destroying a GM in a single hit."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("H&amp;L-GB05R (Zeon) / H-Baz-85-Gry/Ver.045 (Titans) / H-Baz-87-A*E/Ver.004 (AEUG)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Rocket Launcher"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("120m/s"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("10")
                              )
                            ),
                            Core.vx_new_string("380mm Hyper Bazooka"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("380mm Hyper Bazooka"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("BLASH-XHB-L-03/N-STD"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Rocket Launcher"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("120m/s"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("5")
                              )
                            ),
                            Core.vx_new_string("Clay Bazooka"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clay Bazooka"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Gundam/ClayBazooka.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Rocket Launcher"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("120m/s")
                              )
                            ),
                            Core.vx_new_string(".4MW Beam Saber"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".4MW Beam Saber"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("XB-G-1048L (Titans) / A*E-Br*G-Sc-L (AEUG)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Melee"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("1.2MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string(".65MW Beam Saber"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".65MW Beam Saber"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Melee"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("1.95MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("1.3MW Beam Gun"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("1.3MW Beam Gun"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("3.9MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("1.3MW Funnel"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("1.3MW Funnel"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("3.9MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("1.9MW Beam Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("1.9MW Beam Rifle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by rechargeable energy cap"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("BOWA-BR-S-85-C2"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("5.7MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("2.2MW Beam Pistol"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("2.2MW Beam Pistol"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by rechargeable energy cap"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("6.6MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("2.2MW Funnel"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("2.2MW Funnel"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("6.6MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("2.6MW Beam Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("2.6MW Beam Rifle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by rechargeable energy cap"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("BOWA*XBR-M-86-C2 (Titans), A*E-Br*XBR-87-C (AEUG)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("7.8MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("2.8MW Beam Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("2.8MW Beam Rifle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by rechargeable energy cap"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("8.4MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("5.7MW Beam Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("5.7MW Beam Rifle"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Gundam/ZetaBeamRifle.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by replaceable e-pac, doubles as large beam saber"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("17.1MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("8.3MW Hyper Mega Launcher"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("8.3MW Hyper Mega Launcher"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Powered by replaceable e-pac, doubles as large beam saber"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("24.9MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
                              )
                            ),
                            Core.vx_new_string("19.5MW Mega Particle Gun"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("19.5MW Mega Particle Gun"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":energy"),
                                Core.vx_new_string("58.5MJ"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Energy")
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
            Core.vx_new_string("Mobile Suit Gundam Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mobile Suit Gundam Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Neo Zion"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Neo Zion"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Alpha-Azieru"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alpha-Azieru"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Gundam/AlphaAzieru.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Speed: 8.29 G\n				* 2 x external propellant tank, ejectable, mounted on main body\nFixed armaments: 2 x wire-guided psycommu mega arm, each mounts 5 x beam gun, fire-linked, power rated at 12.6 MW each"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("NZ-333"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("267.4tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("58.4m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("108m"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Hardened vs. Projectiles"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Hardened vs. Projectiles")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("6"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("19.5 MW Mega Particle Gun"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("19.5 MW Mega Particle Gun"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("Turret")
                                              )
                                            ),
                                            Core.vx_new_string("2.2MW Funnel"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("2.2MW Funnel"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("9")
                                              )
                                            ),
                                            Core.vx_new_string("60mm Vulcan Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("60mm Vulcan Cannon"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("Turretx4"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("4")
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
                            Core.vx_new_string(":Sazabi"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sazabi"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Gundam/NuGundam.png"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("MSN-04"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Spacecraft"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("30.5tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("25m"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Hardened vs. Projectiles"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Hardened vs. Projectiles")
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
            Core.vx_new_string(":Terminator"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terminator"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Terminator Units"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terminator Units"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Terminator T-800"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminator T-800"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Terminator/T800.png"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("200kg"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Terminator T-1000"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminator T-1000"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Terminator/T1000.png"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength")
                                      )
                                    ),
                                    Core.vx_new_string("Natural Weaponry"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Natural Weaponry")
                                      )
                                    ),
                                    Core.vx_new_string(":Flexible"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Flexible")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Terminator T-X"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminator T-X"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Terminator/TX.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The T-X is designed to not only terminate humans but rogue Terminators\nreprogrammed by the Resistance. It is a composite of the T-800 and T-1000,\na solid endoskeleton covered with polymimetic liquid metal alloy, allowing\nit to take the shape of any humanoid it touches. The T-X endoskeleton\ncontains many powerful weapons making it considerably more deadly than\nprevious versions."),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("150kg"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery")
                                      )
                                    ),
                                    Core.vx_new_string(":Strength"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Strength")
                                      )
                                    ),
                                    Core.vx_new_string("Natural Weaponry"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Natural Weaponry")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Terminator Hunter Killer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminator Hunter Killer"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Terminator/HunterKiller.png"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Terminator Tank"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Terminator Tank"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Terminator/HKTank.png"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery")
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


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("tacticsbook", High_technology.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/high_technology", maptype, mapconst, mapfunc);
  }

}
