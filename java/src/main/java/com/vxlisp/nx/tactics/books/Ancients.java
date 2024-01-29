package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Ancients {

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
        "nx/tactics/books/ancients", // pkgname
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
      output = Ancients.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Ancients.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Ancients.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Ancients.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Ancients"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("300_phalanx.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Ancients Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ancients Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ancients Naval Warfare"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ancients Naval Warfare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wind\n* Large Ships\n* Small Ships\n* War Barge\n* Ballista")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Ancients Scenarios"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ancients Scenarios"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ancient Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ancient Scenarios"),
                        Core.vx_new_string(":scenariomap"),
                        Core.f_new(
                          Base.t_scenariomap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Flush Them Out"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flush Them Out"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 10 Turns"),
                                Core.vx_new_string(":teammap"),
                                Core.f_new(
                                  Base.t_teammap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Germanics"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Germanics"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("Half of Roman units are lost."),
                                        Core.vx_new_string(":deploy"),
                                        Core.vx_new_string("1) Tactical Map\n2) 6 Forest Terrain on Germanic side of map\n3) Deploy units anywhere on Germanic side of map"),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 20 Levels of units"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Romans lose more units than Germanics.")
                                      )
                                    ),
                                    Core.vx_new_string(":Romans*"),
                                    Core.f_new(
                                      Base.t_team,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Romans*"),
                                        Core.vx_new_string(":completevictory"),
                                        Core.vx_new_string("Half of Germanics are lost."),
                                        Core.vx_new_string(":deploy"),
                                        Core.vx_new_string("1) Tactical Map\n2) 3 Forest Terrain on Roman side of map.\n3) Deploy units along Roman players edge of the map."),
                                        Core.vx_new_string(":forces"),
                                        Core.vx_new_string("* 20 Levels of units"),
                                        Core.vx_new_string(":partialvictory"),
                                        Core.vx_new_string("Germanics lose more units than Romans.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Roman Gladiators"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Roman Gladiators")
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
            Core.vx_new_string(":Anglo/Saxons"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Anglo/Saxons"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Anglo/Saxon Armies"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anglo/Saxon Armies")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Carthaginians"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Carthaginians"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Carhaginian Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carhaginian Naval Vessels"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Carthaginian Quinquereme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carthaginian Quinquereme")
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
            Core.vx_new_string("Chinese Dynasty"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Chinese Dynasty")
              )
            ),
            Core.vx_new_string("Egyptian Dynasty"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Egyptian Dynasty"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Egyptian Armies"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Egyptian Armies"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Egyptian Archer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Egyptian Archer")
                              )
                            ),
                            Core.vx_new_string("Egyptian Charioteer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Egyptian Charioteer")
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
            Core.vx_new_string("Germanic Tribes"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Germanic Tribes"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Germanic Armies"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Germanic Armies"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Free Spears"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Free Spears"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanLevySpearmen.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Free Spears are farmers and hunters.  According to Germanic tradition, as soon as these men receive their\nspear and shield, they are 'free' adults.  Though lacking in the organized training of the warbands, they\nare veterans of the ritualized tribal warfare of German tribes, and fight with a force and fury superior to\ntheir neighbors militia."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
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
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("1"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Youth Skirmishers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Youth Skirmishers"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanSkirmishers.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Young skirmishers break up and harass enemy formations before the main battle lines meet, and act as a screen\nfor heavy troops, taking losses in order to increase the odds of survival of more valuable 'proven' warriors.\nThey must first prove themselves in battle in order to earn status.  Each warrior is armed with a bundle of\nthrowing spears, a slightly longer spear for melee and a stout ovular shield, but they do not wear armor,\nbeing poor and of low status, but also choosing speed over protection."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
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
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            ),
                                            Core.vx_new_string(":Javelin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Javelin"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("5")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("1"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Skirmish"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Skirmish")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Survival"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Survival"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Forestry"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Forestry")
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
                            Core.vx_new_string("Proven Spearmen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Proven Spearmen"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanTrustedSpearmen.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Proud and experienced, 'proven' warriors steeled by years of constant warfare and veterans of numerous\nconflicts.  These men are hardened for battle and unlikely to flee from conflict, and are trained through\nlong experience to work in close or open formation, and even the shieldwall."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Shield Wall"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Shield Wall")
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
                            Core.vx_new_string("German Slayers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("German Slayers"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanSlayers.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("By shaping heavy boughs of oak and inserting bone spikes, these Cudgels can be used to maim both armored\nand unarmored foes alike.  Cudgels are cheap, easy to make, and replaceable on campaign, while also being\nable to smash or punch through armor.  Although this weapon may seem primitive to untrained eyes, against\narmored opponents it is more effective than any other at their disposal.  These light armored club warriors\nwere recorded to have taken down units of the feared and notoriously lethal kataphraktoi."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Infantry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Cudgel"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Cudgel")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("German Shooters"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("German Shooters"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanShooters.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Equipped to harass and break up enemy formations so more experienced and valuable melee warriors can finish\nthem.  Shooters are often untrained or uncapable warriors, but many are also excellect hunters.  They are\nalso armed with the spear and can act as light infantry, but they will not last long in melee.  In the woods,\ntheir superior ambush skills can be put to best use.\n\nHistorically, Germanic bowmen on the battlefield were few in numbers, because weapons were status symbols,\nand common multipurpose tools, such as the axe or bow were looked down upon."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Aim"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Aim"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Flaming Arrow"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Flaming Arrow")
                                              )
                                            ),
                                            Core.vx_new_string("Arcing Fire"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Arcing Fire")
                                              )
                                            )
                                          )
                                        ),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Composite Bow"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Composite Bow")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Melee"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Melee"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Skirmish"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Skirmish")
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
                            Core.vx_new_string("Sword Possessors"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sword Possessors"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanSwordPossessors.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Sword Possessors are well trained, experienced and armed with superior quality swords and javelins to\nsoften the enemy before their furious charge.\n\nHistorically, swords were not plentiful in Germanic lands because of the cost of iron, so those fierce and\nvaliant warriors carried their highly valued swords with pride."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Broadsword"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Broadsword")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Aim"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Aim"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Javelin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Javelin"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Shield Wall"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Shield Wall")
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
                            Core.vx_new_string("Night Walkers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Night Walkers"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanNightWalkers.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Night-Walkers are unconventional warriors who specialize in ambush.  They display their zeal and ferocity\nwith the help of pitch and dye by blackening their shields and bodies.  They choose dark nights for their\nbattles and when the moment is right, they charge wildly, wide-eyed and screaming at their foes.  Any who\nsurvive assaults by these maniacal warriors are convinced they are spirits sent from the otherworld."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry"),
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
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            ),
                                            Core.vx_new_string(":Javelin"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Javelin"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Survival"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Survival"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Forestry"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Forestry")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Intimidation"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Intimidation"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Terrorize"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Terrorize")
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
                            Core.vx_new_string("Pike Fence"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pike Fence"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanPikeFence.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The Pike Fence are hard-nosed, disciplined warriors that fight together in a\nvery dense formation, unlike most other Germanic warbands. They are trained in\nthe Shield Wall and are universally feared by cavalry."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Infantry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Pike"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Pike")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Shield Wall"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Shield Wall")
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
                            Core.vx_new_string("Hearth Companions"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hearth Companions"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanHearthCompanion.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("These are the Germanic tribes' best warriors. Germans respect their leader's\nbravery, not their rank, and it is a disgrace for a leader to be surpassed in\nbravery. They are wealthy, powerful men, fiercely loyal to their lord, often\nheavily scarred by years of warfare. Their weapons and armor are the best. To\nleave a battlefield alive while their lord lay dead meant a life of shame and\nscorn. To defend and protect him, to assign one's own acts of heroism to his\ncredit-that's what is truly meant by allegiance."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Infantry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Broadsword"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Broadsword")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Chain Mail Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Chain Mail Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("5"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Formation: Shield Wall"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Formation: Shield Wall")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Command"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Command"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Chain of Command"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Chain of Command")
                                              )
                                            ),
                                            Core.vx_new_string(":Rally"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Rally")
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
                            Core.vx_new_string("Germanic Riders"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Germanic Riders"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanRiders.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Riders ride small, poor quality horses, though they are excellent light cavalry.  Like many Germanic warriors,\nhowever, they can lack battle-discipline and be over-keen to enter battle for glory.\n\nThey were mostly armed with shield and spear and were supported by fast-moving light infantry - this light\ncavalry combined with light infantry allowed great tactical speed and versatility on the battlefield.\n\nHistorically, Germanic tribes did not frequently use cavalry, however, some tribes were known for their\ncavalry and many peoples praised the good quality of Germanic cavalry.  Though their horses were not\nexceptional, Germanic horsemen could still maneuver very well and operated as a unit, rather than as an\nunorganized band."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Cavalry"),
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
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Spear"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Spear")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("2"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Leather Armor"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Leather Armor")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Riding"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Riding"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Charge"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Charge")
                                              )
                                            ),
                                            Core.vx_new_string("Run Down"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Run Down")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Germ. Companion Cavalry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Germ. Companion Cavalry"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Germanics/GermanCompanionCavalry.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The Companion Cavalry are extremely wealthy and powerful men, but still fiercely loyal to their lord who\nprovides them the finest warhorses and wargear at his disposal.\n\nThey can be used most effectively as shock troops whose charges can break the enemy line and destory their\nflanks, but they are also useful for overrunning heavy infantry and slaughtering lighter cavalry."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Cavalry"),
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
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Lance"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Lance")
                                              )
                                            ),
                                            Core.vx_new_string("Cavalry Sword"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Cavalry Sword")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Scalemail"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Scalemail")
                                              )
                                            ),
                                            Core.vx_new_string(":Shield"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Shield")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Riding"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Riding"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":Charge"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Charge")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("5")
                                      )
                                    ),
                                    Core.vx_new_string(":Command"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Command"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Chain of Command"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Chain of Command")
                                              )
                                            ),
                                            Core.vx_new_string(":Rally"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Rally")
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
            Core.vx_new_string("Greek City States"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Greek City States"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Greek Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Naval Vessels"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Greek Galley"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Greek Galley")
                              )
                            ),
                            Core.vx_new_string("Greek Trireme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Greek Trireme")
                              )
                            ),
                            Core.vx_new_string("Greek Quinquereme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Greek Quinquereme")
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
            Core.vx_new_string(":Macedon"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Macedon"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Macedonian Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Macedonian Naval Vessels"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Macedonian Galley"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Macedonian Galley")
                              )
                            ),
                            Core.vx_new_string("Macedonian Trireme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Macedonian Trireme")
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
            Core.vx_new_string(":Norsemen"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Norsemen"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Viking Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Viking Naval Vessels"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Viking War Galley"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Viking War Galley")
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
            Core.vx_new_string(":Persians"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Persians"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Persian Armies"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Persian Armies"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Persian Lt. Cavalry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persian Lt. Cavalry")
                              )
                            ),
                            Core.vx_new_string("Persian Horse Archer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persian Horse Archer")
                              )
                            ),
                            Core.vx_new_string("Persian Scythed Chariot"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persian Scythed Chariot")
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
            Core.vx_new_string("Roman Empire"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Roman Empire"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Roman Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Roman Naval Vessels"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Roman Galley"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Roman Galley")
                              )
                            ),
                            Core.vx_new_string("Roman Trireme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Roman Trireme")
                              )
                            ),
                            Core.vx_new_string("Roman Quinquereme"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Roman Quinquereme")
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
            Core.vx_new_string("Unfiled Ancient"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Unfiled Ancient"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Examples of Play\nRomans vs. Greeks\nCombat Example:\n\nCombat Cards:\nSurprise\nUse when:\n	Opponent must be unaware\nEffects:\n	+4 Attack\n	Opponent can only defend\n\nHold Off\nUse when:\n	Longer Reach\n	In Melee Combat\n	Not in Close Combat\nEffects:\n	First Strike\n	+2 Attack\n	+4 Damage Vs Charge\n	Opponent cannot move into Close Combat if you hit.\n\nCharge:\nEffect:\nUse when:\n	Not in Melee Combat\nEffect:\n	Full Move Attack\n	+2 Damage\n	Moves into Close Combat\n\nGuard:\nEffect:\n	+2 Defense\n	All hits taken are shield hits\n\nExample:\nHuman attacks the Orc in the open.\nThe Orc has longer reach an chooses Hold Off.\nThe Human is wary of the spear and plays Guard and Close Combat.\n\nRound 1:\nOrc roll: 12 + 9 Spear + 2 Hold Off = 23\nHuman roll: 9 + 8 Sword + 2 Guard - 1 Encumberance = 18\n\nOrc scores a hit for 5 + 3 Spear = 8 Damage\n\nGuard makes the damage a shield hit.\nDetermine hit location.\n8 (Piercing) - 3 (Shield) - 3 (Armor) = 2 (Piercing) Wound.\n\nBody reduces by 2 to 10 not enough to change bonus.\n\nThe successful Hold Off means the Human's Close Combat Movement fails.")
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
    mapfunc.put("tacticsbook", Ancients.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/ancients", maptype, mapconst, mapfunc);
  }

}
