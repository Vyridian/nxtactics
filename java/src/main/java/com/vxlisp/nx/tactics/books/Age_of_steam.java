package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Age_of_steam {

  /**
   * @function chapter_age_of_steam_equipment
   * @return {chapter}
   * (func chapter_age_of_steam_equipment)
   */
  public static interface Func_chapter_age_of_steam_equipment extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_age_of_steam_equipment();
  }

  public static class Class_chapter_age_of_steam_equipment extends Core.Class_base implements Func_chapter_age_of_steam_equipment {

    @Override
    public Func_chapter_age_of_steam_equipment vx_new(Object... vals) {
      Class_chapter_age_of_steam_equipment output = new Class_chapter_age_of_steam_equipment();
      return output;
    }

    @Override
    public Func_chapter_age_of_steam_equipment vx_copy(Object... vals) {
      Class_chapter_age_of_steam_equipment output = new Class_chapter_age_of_steam_equipment();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_age_of_steam_equipment", // name
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
    public Func_chapter_age_of_steam_equipment vx_empty() {return e_chapter_age_of_steam_equipment;}
    @Override
    public Func_chapter_age_of_steam_equipment vx_type() {return t_chapter_age_of_steam_equipment;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_age_of_steam_equipment();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_age_of_steam_equipment() {
      return Age_of_steam.f_chapter_age_of_steam_equipment();
    }

  }

  public static final Func_chapter_age_of_steam_equipment e_chapter_age_of_steam_equipment = new Age_of_steam.Class_chapter_age_of_steam_equipment();
  public static final Func_chapter_age_of_steam_equipment t_chapter_age_of_steam_equipment = new Age_of_steam.Class_chapter_age_of_steam_equipment();

  public static Base.Type_chapter f_chapter_age_of_steam_equipment() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Steam Equipment"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Steam Weaponry"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Weaponry"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(".45 Colt Peacemaker"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Colt Peacemaker"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/Colt1873.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("US Army issue from 1873-1892 and used by other notables like Wyatt Earp and Bat Masterson.  Wyatt Earp's\nfictional Colt Buntline was supposed to be a long barrel version of the Colt Peacemaker."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Single action, revolver"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("30m"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("6")
                      )
                    ),
                    Core.vx_new_string(".45 Smith&amp;Wesson Schofield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Smith&amp;Wesson Schofield"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/Schofield1869.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Just meat and potatoes.  Me and Jesse James think it's the best handgun in the world. - Kid, The Quick and the Dead."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Single action, revolver"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("30m"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("6")
                      )
                    ),
                    Core.vx_new_string(".41 Remington Derringer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".41 Remington Derringer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/Derringer.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The classic Remington design is still popular; a Remington pattern derringer in .38 Special is still smaller than\nthe most compact .25 ACP semiautomatic, and provides far superior terminal ballistic performance in its two shots\nthan the .25 ACP does with six or seven."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Rimfire, single action"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("16m"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("2")
                      )
                    ),
                    Core.vx_new_string(".44 Winchester Model 1873"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".44 Winchester Model 1873"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/Winchester1873.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Winchester is among the earliest repeating rifles, and has become synonymous with lever-action firearms.\nKnown as 'The Gun that Won the West' for its immense popularity at that time."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Lever action, repeating"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Rifle"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("125.2cm"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4.3kg"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("379m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("100m")
                      )
                    ),
                    Core.vx_new_string("12g Winchester Model 1887"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12g Winchester Model 1887"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Considered the first truly successful repeating shotgun"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Level action"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shotgun"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("1m"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("3.6kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Scattershot, Bleeding"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("30m"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("5")
                      )
                    ),
                    Core.vx_new_string(".50 Gatling Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".50 Gatling Gun"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/GatlingGun1876.jpg.jpg"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. MG"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Auto, Bleeding"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("100m")
                      )
                    ),
                    Core.vx_new_string("Napoleon Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Napoleon Cannon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/CivilWarCannon.jpg"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Smoothbore, muzzle-loading, 12-pounder"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Cannon"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Blast, Indirect Fire"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("250m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Steam Age Vehicles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Vehicles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Horseless  Carriage"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horseless  Carriage")
                      )
                    ),
                    Core.vx_new_string("Mailplane Biplane"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mailplane Biplane")
                      )
                    ),
                    Core.vx_new_string("Ocean Liner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ocean Liner"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Liner, Steam Liner")
                      )
                    ),
                    Core.vx_new_string(":Stagecoach"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stagecoach")
                      )
                    ),
                    Core.vx_new_string("Steam Ferry"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Ferry")
                      )
                    ),
                    Core.vx_new_string("Steam Train Boxcar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Train Boxcar")
                      )
                    ),
                    Core.vx_new_string("Steam Train Caboose"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Train Caboose")
                      )
                    ),
                    Core.vx_new_string("Steam Train Coach"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Train Coach")
                      )
                    ),
                    Core.vx_new_string("Steam Train Locomotive"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Train Locomotive")
                      )
                    ),
                    Core.vx_new_string("Steam Train Private Coach"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steam Train Private Coach")
                      )
                    ),
                    Core.vx_new_string(":Steamboat"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steamboat")
                      )
                    ),
                    Core.vx_new_string("Tramp Freighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tramp Freighter")
                      )
                    ),
                    Core.vx_new_string(":Zepplin"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zepplin"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dirigible")
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
   * @function chapter_age_of_steam_overview
   * @return {chapter}
   * (func chapter_age_of_steam_overview)
   */
  public static interface Func_chapter_age_of_steam_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_age_of_steam_overview();
  }

  public static class Class_chapter_age_of_steam_overview extends Core.Class_base implements Func_chapter_age_of_steam_overview {

    @Override
    public Func_chapter_age_of_steam_overview vx_new(Object... vals) {
      Class_chapter_age_of_steam_overview output = new Class_chapter_age_of_steam_overview();
      return output;
    }

    @Override
    public Func_chapter_age_of_steam_overview vx_copy(Object... vals) {
      Class_chapter_age_of_steam_overview output = new Class_chapter_age_of_steam_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_age_of_steam_overview", // name
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
    public Func_chapter_age_of_steam_overview vx_empty() {return e_chapter_age_of_steam_overview;}
    @Override
    public Func_chapter_age_of_steam_overview vx_type() {return t_chapter_age_of_steam_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_age_of_steam_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_age_of_steam_overview() {
      return Age_of_steam.f_chapter_age_of_steam_overview();
    }

  }

  public static final Func_chapter_age_of_steam_overview e_chapter_age_of_steam_overview = new Age_of_steam.Class_chapter_age_of_steam_overview();
  public static final Func_chapter_age_of_steam_overview t_chapter_age_of_steam_overview = new Age_of_steam.Class_chapter_age_of_steam_overview();

  public static Base.Type_chapter f_chapter_age_of_steam_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Steam Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics: Age of Steam?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics: Age of Steam?")
              )
            ),
            Core.vx_new_string("Age of Steam Personal Combat"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Personal Combat"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Dueling\n* Civil War\n* Cowboys\n* Indians\n* Bandits\n* Cattle Rustlers\n* Marksman")
              )
            ),
            Core.vx_new_string("Age of Steam Land Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Land Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Infantry\n* Cavalry\n* Pistols\n* Rifles\n* Cannons\n* Artillery\n* Gatling Guns\n* Trains")
              )
            ),
            Core.vx_new_string("Age of Steam Naval Warfare"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Age of Steam Naval Warfare"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Wind\n* Large Ships\n* Small Ships\n* Solid Shot\n* Burning Shot\n* Chain Shot")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_civil_war
   * @return {chapter}
   * (func chapter_civil_war)
   */
  public static interface Func_chapter_civil_war extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_civil_war();
  }

  public static class Class_chapter_civil_war extends Core.Class_base implements Func_chapter_civil_war {

    @Override
    public Func_chapter_civil_war vx_new(Object... vals) {
      Class_chapter_civil_war output = new Class_chapter_civil_war();
      return output;
    }

    @Override
    public Func_chapter_civil_war vx_copy(Object... vals) {
      Class_chapter_civil_war output = new Class_chapter_civil_war();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_civil_war", // name
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
    public Func_chapter_civil_war vx_empty() {return e_chapter_civil_war;}
    @Override
    public Func_chapter_civil_war vx_type() {return t_chapter_civil_war;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_civil_war();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_civil_war() {
      return Age_of_steam.f_chapter_civil_war();
    }

  }

  public static final Func_chapter_civil_war e_chapter_civil_war = new Age_of_steam.Class_chapter_civil_war();
  public static final Func_chapter_civil_war t_chapter_civil_war = new Age_of_steam.Class_chapter_civil_war();

  public static Base.Type_chapter f_chapter_civil_war() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Civil War"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Civil War Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Civil War Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Civil War Battle"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Civil War Battle")
                      )
                    ),
                    Core.vx_new_string(":Ironclads"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ironclads"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("The first battle between ironclads happened on 9 March 1862, as the armored Monitor was deployed to protect the\nUnion's wooden fleet from the ironclad ram Virginia and other Confederate warships.  In this engagement, the\ntwo ironclads repeatedly tried to ram one another while shells bounced off their armor.  The battle attracted\nattention worldwide, making it clear that the wooden warship was now out of date, with the ironclads destroying\nthem easily.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Confederate Army"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Confederate Army"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Confederate Cannon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Cannon")
                      )
                    ),
                    Core.vx_new_string("Confederate Conscript"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Conscript")
                      )
                    ),
                    Core.vx_new_string("Confederate Gatling Gunner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Gatling Gunner")
                      )
                    ),
                    Core.vx_new_string("Confederate Medic"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Medic")
                      )
                    ),
                    Core.vx_new_string("Confederate Officer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Officer")
                      )
                    ),
                    Core.vx_new_string("Confederate Veteran"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Confederate Veteran")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Confederate Navy"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Confederate Navy"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Merrimack"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Merrimack"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("CSS Virginia"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("17kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("320"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("4500tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("84m"),
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
                                Core.vx_new_string("100mm iron over 610mm of wood (102mm RHA)"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("200mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("200mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("200mm")
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
                                Core.vx_new_string("2 x 7 inch (178mm) rifles\n2 x 6 inch (152mm) rifles\n6 x 9 inch (229mm) Dahlgren smoothbores\n2 x 12-pounder (5kg) howitzers"),
                                Core.vx_new_string(":level"),
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
            Core.vx_new_string("Union Army"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Union Army"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Union Cannon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Cannon")
                      )
                    ),
                    Core.vx_new_string("Union Conscript"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Conscript")
                      )
                    ),
                    Core.vx_new_string("Union Gatling Gunner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Gatling Gunner")
                      )
                    ),
                    Core.vx_new_string("Union Medic"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Medic")
                      )
                    ),
                    Core.vx_new_string("Union Officer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Officer")
                      )
                    ),
                    Core.vx_new_string("Union Veteran"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Union Veteran")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Union Navy"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Union Navy"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("USS Monitor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("USS Monitor"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("15kph"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Hvy. Naval Vessel"),
                        Core.vx_new_string(":crew"),
                        Core.vx_new_string("59"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("1000tons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("52m"),
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
                                Core.vx_new_string("200mm iron turret, 25mm deck, 125mm hull belt"),
                                Core.vx_new_string(":front"),
                                Core.vx_new_string("200mm"),
                                Core.vx_new_string(":back"),
                                Core.vx_new_string("200mm"),
                                Core.vx_new_string(":over"),
                                Core.vx_new_string("25mm"),
                                Core.vx_new_string(":side"),
                                Core.vx_new_string("200mm")
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
                                Core.vx_new_string("2 x 11 in (280mm) Dahlgren smoothbores, turret"),
                                Core.vx_new_string(":level"),
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
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_examples_of_play
   * @return {chapter}
   * (func chapter_examples_of_play)
   */
  public static interface Func_chapter_examples_of_play extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_examples_of_play();
  }

  public static class Class_chapter_examples_of_play extends Core.Class_base implements Func_chapter_examples_of_play {

    @Override
    public Func_chapter_examples_of_play vx_new(Object... vals) {
      Class_chapter_examples_of_play output = new Class_chapter_examples_of_play();
      return output;
    }

    @Override
    public Func_chapter_examples_of_play vx_copy(Object... vals) {
      Class_chapter_examples_of_play output = new Class_chapter_examples_of_play();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_examples_of_play", // name
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
    public Func_chapter_examples_of_play vx_empty() {return e_chapter_examples_of_play;}
    @Override
    public Func_chapter_examples_of_play vx_type() {return t_chapter_examples_of_play;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_examples_of_play();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_examples_of_play() {
      return Age_of_steam.f_chapter_examples_of_play();
    }

  }

  public static final Func_chapter_examples_of_play e_chapter_examples_of_play = new Age_of_steam.Class_chapter_examples_of_play();
  public static final Func_chapter_examples_of_play t_chapter_examples_of_play = new Age_of_steam.Class_chapter_examples_of_play();

  public static Base.Type_chapter f_chapter_examples_of_play() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Examples of Play"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Western Gunfight"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Western Gunfight"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Round 1 - Turn 1\nInitiative\nGunslinger player starts with the initiative, but the Marshall wants to 'Take the Initiative'\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nGunslinger rolls 6 + 1 (holds initiative) = 7.\nMarshall rolls 8.  Marshall takes the initiative.\nMove\nMarshall is within range of his weapon, so chooses not to move to get the best chance to hit.\nAction\nFast Draw - Marshall is in weapon range and chooses to use Fast Draw to draw his weapon and fire.\nAttack - Fast Draw was a Free Action and Marshall chooses to fire.  He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy) - 1 (Hip Shoot) = 6 Dice\nMarshall rolls 6 dice and gets 1 (miss), 2 (miss), 2 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets another 6 (critical hit and bonus die).  He rolls the bonus die and gets a 3 (flag).\nMarshall's total roll is 1 hit, 1 critical, and a flag.\nDefense\nGunslinger now rolls dice equal to appropriate defense:  4 Body = 4 Dice\nGunslinger rolls 3 dice and gets 1 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets a 4 (critical hit).\nGunslinger's  total is 2 hits and 1 critical.\nGunslinger's 1 hit cancels one of  Marshall's hits and his 1 critical hit cancels one of Marshall's critical hits.  This leaves Marshall with only a single flag,  Gunslinger had rolled a second hit, but since it can only cancel other hits, it has no effect.\nEffects\nFlags - Gunslinger gains a Flag Token and must retreat one space for each flag.  He therefore retreats 1 space away from Marshall.\nAttack Damage - Since no damage was rolled, Marshall's turn is over.\nRound 1 - Turn 2\nInitiative\nGunslinger player regains the initiative.  Marshall has already taken a turn and cannot do so again this round.\nWhite Tokens - After initiative is determined, Gunslinger must remove a White Token if any.  He removes the Flag token.\nMove\nGunslinger was forced to back by the Flag but is still in his weapon's range, so he will not take an attack penalty.  However, if he moves closer he will take a penalty for moving, so he opts to stay still and fire.\nAction\nFast Draw - Gunslinger also uses Fast Draw to draw and fire.\nAttack - He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy)  -1 (Hip Shoot) = 5 Dice.\nGunslinger rolls 5 dice and gets 1 (miss), 3 (miss), 4 (hit), 5 (hit), and 5 (hit).  His total roll is 3 hits.  Nice.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body = 4 Dice.\nMarshall rolls 4 dice and gets 1 (miss), 1 (miss), 3 (miss), and 4 (hit).\nMarshall's total is 1 hit.\nMarshall cancels 1 of Gunslinger's hits.  This leaves Gunslinger with 2 hits.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 2), he checks the damage rating of his Schofield .45.  Its damage rating is 4.  If Gunslinger had rolled less than 4 dice, the Schofield would allow him to roll the difference in additional damage dice.  However, Gunslinger rolled 4 dice already, so he receives no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 1 Damage Token.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 6 (right), 2 (low): Right Shin/Foot.  The 1 Damage Token is therefore on Marshall's Right Shin.  This will limit his movement.\nTurn End\nRound End - Since all units have acted, the round ends.\nRound 2 - Turn 1\nInitiative\nMarshall has the initiative since Gunslinger player ended with the initiative, but Gunslinger predictably wants to 'Take the Initiative' back.  Marshall desperately needs to win initiative to recover a bit from the last hit.\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nMarshall rolls 4 + 1 (holds initiative) -1 (most Damaged) = 4.\nGunslinger rolls 8 and takes the initiative.  Gunslinger grins.\nWhite Tokens - Gunslinger has no White Tokens.\nMove\nGunslinger presses his advantage and stays and fires hoping to finish this battle.\nAction\nSince their guns are already drawn, neither unit needs to fire from the hip anymore.\nAttack - Gunslinger determines attack dice.  5 (Handguns) +1 (Accuracy)  = 6 Dice.\nGunslinger rolls 6 dice and gets 1 (miss), 1 (miss), 3 (miss), 5 (hit), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus and gets 1 (flag).  His total roll is 3 hits and a flag.  Looking good.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body -1 (Damage) -1 (Stun) = 2 Dice.  Need some good rolls about now.\nMarshall rolls 2 dice and gets 1 (miss) and 1 (miss).  Nothing.\nMarshall is hit dead-on by the Gunslinger.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 3), he checks the damage rating of his Schofield .45.  Its damage rating is 4 is not more than his 6 dice rolled so no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 2 Damage Tokens.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 2 (left), 4 (center): Left Thigh.  The 2 Damage Tokens are therefore on Marshall's Left Thigh.  This will limit his movement even more.\nDamage Total - 2 Stun Tokens and 3 Damage Tokens (1 on Right Shin, 2 on Left Thigh).  The total of -5 is greater than the Marshall's 4 Body, so he drops to the ground.\nRound 2 - Turn 2\nInitiative\nMarshall has the initiative since Gunslinger has already acted this round.\nWhite Tokens - Marshall removes a  White Token if any.  He removes 1 of the Stun tokens.\nMove\nMarshall is prone and has no Move left to even crawl (Move 4 - 1 (Stun) - 3 (Damage)).\nAction\nMarshall could attack with 5 (Handguns) + 1 (Accuracy) - 1 (Stun) - 3 (Damage) = 2 Dice, but he has no dice to defend next turn, he is Prone (+1) and Helpless (+1) for a total of 8 Gunslinger Dice against his own 0 Dice.  What's more the gunslinger doesn't have a scratch on him.\nThe duel is clearly over, and the Marshall drops his gun and begs for his life.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_steam_age_maps
   * @return {chapter}
   * (func chapter_steam_age_maps)
   */
  public static interface Func_chapter_steam_age_maps extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_steam_age_maps();
  }

  public static class Class_chapter_steam_age_maps extends Core.Class_base implements Func_chapter_steam_age_maps {

    @Override
    public Func_chapter_steam_age_maps vx_new(Object... vals) {
      Class_chapter_steam_age_maps output = new Class_chapter_steam_age_maps();
      return output;
    }

    @Override
    public Func_chapter_steam_age_maps vx_copy(Object... vals) {
      Class_chapter_steam_age_maps output = new Class_chapter_steam_age_maps();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_steam_age_maps", // name
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
    public Func_chapter_steam_age_maps vx_empty() {return e_chapter_steam_age_maps;}
    @Override
    public Func_chapter_steam_age_maps vx_type() {return t_chapter_steam_age_maps;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_steam_age_maps();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_steam_age_maps() {
      return Age_of_steam.f_chapter_steam_age_maps();
    }

  }

  public static final Func_chapter_steam_age_maps e_chapter_steam_age_maps = new Age_of_steam.Class_chapter_steam_age_maps();
  public static final Func_chapter_steam_age_maps t_chapter_steam_age_maps = new Age_of_steam.Class_chapter_steam_age_maps();

  public static Base.Type_chapter f_chapter_steam_age_maps() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Steam Age Maps"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Steam Age Terrain"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Terrain"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Mine"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mine")
                      )
                    ),
                    Core.vx_new_string(":Tumbleweed"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tumbleweed")
                      )
                    ),
                    Core.vx_new_string("Western Town"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Western Town")
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
   * @function chapter_victorian_england
   * @return {chapter}
   * (func chapter_victorian_england)
   */
  public static interface Func_chapter_victorian_england extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_victorian_england();
  }

  public static class Class_chapter_victorian_england extends Core.Class_base implements Func_chapter_victorian_england {

    @Override
    public Func_chapter_victorian_england vx_new(Object... vals) {
      Class_chapter_victorian_england output = new Class_chapter_victorian_england();
      return output;
    }

    @Override
    public Func_chapter_victorian_england vx_copy(Object... vals) {
      Class_chapter_victorian_england output = new Class_chapter_victorian_england();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_victorian_england", // name
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
    public Func_chapter_victorian_england vx_empty() {return e_chapter_victorian_england;}
    @Override
    public Func_chapter_victorian_england vx_type() {return t_chapter_victorian_england;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_victorian_england();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_victorian_england() {
      return Age_of_steam.f_chapter_victorian_england();
    }

  }

  public static final Func_chapter_victorian_england e_chapter_victorian_england = new Age_of_steam.Class_chapter_victorian_england();
  public static final Func_chapter_victorian_england t_chapter_victorian_england = new Age_of_steam.Class_chapter_victorian_england();

  public static Base.Type_chapter f_chapter_victorian_england() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Victorian England"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Victoraian Characters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Victoraian Characters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dr. John Watson"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dr. John Watson")
                      )
                    ),
                    Core.vx_new_string("Herbert George Wells"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Herbert George Wells")
                      )
                    ),
                    Core.vx_new_string("Jack the Ripper"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jack the Ripper")
                      )
                    ),
                    Core.vx_new_string("Sherlock Holmes"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sherlock Holmes"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Watson: What made like this?\n* Sherlock: Oh, dear Watson. Nothing made me ... I made me.")
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
   * @function chapter_wild_west
   * @return {chapter}
   * (func chapter_wild_west)
   */
  public static interface Func_chapter_wild_west extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_wild_west();
  }

  public static class Class_chapter_wild_west extends Core.Class_base implements Func_chapter_wild_west {

    @Override
    public Func_chapter_wild_west vx_new(Object... vals) {
      Class_chapter_wild_west output = new Class_chapter_wild_west();
      return output;
    }

    @Override
    public Func_chapter_wild_west vx_copy(Object... vals) {
      Class_chapter_wild_west output = new Class_chapter_wild_west();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/age_of_steam", // pkgname
        "chapter_wild_west", // name
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
    public Func_chapter_wild_west vx_empty() {return e_chapter_wild_west;}
    @Override
    public Func_chapter_wild_west vx_type() {return t_chapter_wild_west;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Age_of_steam.f_chapter_wild_west();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_wild_west() {
      return Age_of_steam.f_chapter_wild_west();
    }

  }

  public static final Func_chapter_wild_west e_chapter_wild_west = new Age_of_steam.Class_chapter_wild_west();
  public static final Func_chapter_wild_west t_chapter_wild_west = new Age_of_steam.Class_chapter_wild_west();

  public static Base.Type_chapter f_chapter_wild_west() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Wild West"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Western Scenarios"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Western Scenarios"),
                Core.vx_new_string(":scenariomap"),
                Core.f_new(
                  Base.t_scenariomap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Western Gunfight"),
                    Core.f_new(
                      Base.t_scenario,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Western Gunfight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Setup\nGrassland Map\nPersonal Scale\nPlayer 1 begins with a Gunslinger deployed anywhere on the map.\nPlayer 2 begins with a US Marshall deployed within 10 spaces of Gunslinger.\nBoth Players' units are standing still with pistols holstered.\nGunslinger has the initiative.\nSpecial Rules\nShoot From the Hip\nHit Location")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Steam Age Outlaws"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Outlaws"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bandito"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bandito"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/BanditoToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("You think you're better than I am?  Where we came from, if one did not want to die of poverty, one became a\npriest or a bandit! ...You became a priest because you were... too much of a coward to do what I do! - Tuco. The\nGood, the Bad, and the Ugly."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Survival"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Survival"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Gunslinger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gunslinger"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/GunslingerToken.png"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Crime"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crime"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Armed Robbery"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armed Robbery")
                                      )
                                    ),
                                    Core.vx_new_string(":Rustling"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Rustling")
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
                    Core.vx_new_string("Man with No Name"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Man with No Name"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/ManWithNoNameToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* [to Tuco] Tut, tut. Such ingratitude after all the times I saved your life. - Blondie, The Good, the Bad, and\nthe Ugly\n* There are two kinds of people in the world...Those who have a loaded gun and those who dig. You dig! - Blondie,\nThe Good, the Bad, and the Ugly"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Evasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Evasion"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Professional Killer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Professional Killer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/ProfessionalKiller.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("He paid me a thousand.  I think his idea was that I kill you.  But you know, the pity is when I'm paid, I always\nfollow my job through. - Angel Eyes, The Good, the Bad, and the Ugly"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Lt. Infantry"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Evasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Evasion"),
                                Core.vx_new_string(":level"),
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
            Core.vx_new_string("Steam Age Lawmen"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Lawmen"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Deputy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Deputy")
                      )
                    ),
                    Core.vx_new_string(":Sheriff"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sheriff")
                      )
                    ),
                    Core.vx_new_string("US Marshall"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("US Marshall"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Evasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Evasion"),
                                Core.vx_new_string(":level"),
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
            Core.vx_new_string("Steam Age Indians"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Indians"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Sioux Gunfighter"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sioux Gunfighter"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Western/IndianAxe.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Spotted Horse cannot be killed by a bullet! - Spotted Horse, The Quick and the Dead")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Steam Age Townsfolk"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Townsfolk"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Chinese Monk"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chinese Monk"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("I seek not to know the answers, but to understand the questions. - Kwai Chang Caine, Kung Fu TV Series")
                      )
                    ),
                    Core.vx_new_string("Chinese Rail worker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chinese Rail worker")
                      )
                    ),
                    Core.vx_new_string(":Cowboy"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cowboy")
                      )
                    ),
                    Core.vx_new_string(":Dentist"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dentist")
                      )
                    ),
                    Core.vx_new_string(":Farmer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Farmer")
                      )
                    ),
                    Core.vx_new_string("General Store Owner"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("General Store Owner")
                      )
                    ),
                    Core.vx_new_string(":Judge"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Judge")
                      )
                    ),
                    Core.vx_new_string(":Preacher"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Preacher")
                      )
                    ),
                    Core.vx_new_string("Saloon Barkeep"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saloon Barkeep")
                      )
                    ),
                    Core.vx_new_string(":Undertaker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Undertaker")
                      )
                    ),
                    Core.vx_new_string("Whore with a Heart of Gold"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whore with a Heart of Gold")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Steam Age Travelers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Travelers"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Carpet Bagger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carpet Bagger")
                      )
                    ),
                    Core.vx_new_string(":Gambler"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gambler"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("This is a very special pack.  See, I put an ace in every time I kill a man.  (The deck is all aces) - Ace, The Quick and the Dead")
                      )
                    ),
                    Core.vx_new_string(":Prospector"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prospector")
                      )
                    ),
                    Core.vx_new_string("Snake Oil Salesman"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snake Oil Salesman")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Steam Age Tycoons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Steam Age Tycoons"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Banker"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Banker")
                      )
                    ),
                    Core.vx_new_string("Land Baron"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Land Baron"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("All I hear from you...is how poor you are; how you can't afford my taxes.  Yet somehow, you managed to find the\nmoney to hire a gunfighter to kill me.  If ya got so much money, I'm just gonna have to take some more. - John\nHerod,  The Quick and the Dead"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Evasion"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Evasion"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("4")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Oil Baron"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oil Baron")
                      )
                    ),
                    Core.vx_new_string("Railroad Tycoon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Railroad Tycoon")
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
        "nx/tactics/books/age_of_steam", // pkgname
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
      output = Age_of_steam.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Age_of_steam.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Age_of_steam.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Age_of_steam.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Age of Steam"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("WildWest.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Age of Steam Overview"),
            Age_of_steam.f_chapter_age_of_steam_overview(),
            Core.vx_new_string("Age of Steam Equipment"),
            Age_of_steam.f_chapter_age_of_steam_equipment(),
            Core.vx_new_string("Steam Age Maps"),
            Age_of_steam.f_chapter_steam_age_maps(),
            Core.vx_new_string("Civil War"),
            Age_of_steam.f_chapter_civil_war(),
            Core.vx_new_string("Victorian England"),
            Age_of_steam.f_chapter_victorian_england(),
            Core.vx_new_string("Wild West"),
            Age_of_steam.f_chapter_wild_west(),
            Core.vx_new_string("Examples of Play"),
            Age_of_steam.f_chapter_examples_of_play()
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
    mapfunc.put("chapter_age_of_steam_equipment", Age_of_steam.t_chapter_age_of_steam_equipment);
    mapfunc.put("chapter_age_of_steam_overview", Age_of_steam.t_chapter_age_of_steam_overview);
    mapfunc.put("chapter_civil_war", Age_of_steam.t_chapter_civil_war);
    mapfunc.put("chapter_examples_of_play", Age_of_steam.t_chapter_examples_of_play);
    mapfunc.put("chapter_steam_age_maps", Age_of_steam.t_chapter_steam_age_maps);
    mapfunc.put("chapter_victorian_england", Age_of_steam.t_chapter_victorian_england);
    mapfunc.put("chapter_wild_west", Age_of_steam.t_chapter_wild_west);
    mapfunc.put("tacticsbook", Age_of_steam.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/age_of_steam", maptype, mapconst, mapfunc);
  }

}
