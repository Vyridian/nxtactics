package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Combat {

  /**
   * @function chapter_advanced_weaponry
   * @return {chapter}
   * (func chapter_advanced_weaponry)
   */
  public static interface Func_chapter_advanced_weaponry extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_advanced_weaponry();
  }

  public static class Class_chapter_advanced_weaponry extends Core.Class_base implements Func_chapter_advanced_weaponry {

    @Override
    public Func_chapter_advanced_weaponry vx_new(Object... vals) {
      Class_chapter_advanced_weaponry output = new Class_chapter_advanced_weaponry();
      return output;
    }

    @Override
    public Func_chapter_advanced_weaponry vx_copy(Object... vals) {
      Class_chapter_advanced_weaponry output = new Class_chapter_advanced_weaponry();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_advanced_weaponry", // name
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
    public Func_chapter_advanced_weaponry vx_empty() {return e_chapter_advanced_weaponry;}
    @Override
    public Func_chapter_advanced_weaponry vx_type() {return t_chapter_advanced_weaponry;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_advanced_weaponry();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_advanced_weaponry() {
      return Combat.f_chapter_advanced_weaponry();
    }

  }

  public static final Func_chapter_advanced_weaponry e_chapter_advanced_weaponry = new Combat.Class_chapter_advanced_weaponry();
  public static final Func_chapter_advanced_weaponry t_chapter_advanced_weaponry = new Combat.Class_chapter_advanced_weaponry();

  public static Base.Type_chapter f_chapter_advanced_weaponry() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Advanced Weaponry"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Advanced Melee Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Advanced Melee Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Beam Saber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Beam Saber"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber.  The light and\ncolor are caused by the air molecules ionizing in the lasers.  Any contact with a solid object or another\nmagnetic field creates a breach in the bubble which triggers a plasma burst in the hilt that instantly travels\ndown the bubble and exits the breach with burning explosive effect.")
                      )
                    ),
                    Core.vx_new_string("Lightning Saber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Saber"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber.  The light and\ncolor are caused by the air molecules ionizing in the lasers.  Any contact with a solid object or another\nmagnetic field creates a breach in the bubble which triggers an electric pulse in the hilt that instantly travels\ndown the bubble and exits the breach with shocking effect.")
                      )
                    ),
                    Core.vx_new_string("Shock Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shock Lance")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Hand Guns"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Hand Guns"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("9mm Cone Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("9mm Cone Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The modern upgrade to the traditional firearm.  Cone weapons fire rocket-propelled, recoilless rounds.  These\nrounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for\nweightlessness.  Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gyrojet Pistol, Rocket Pistol")
                      )
                    ),
                    Core.vx_new_string("Liquid Sprayer Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Liquid Sprayer Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Acid Pistol")
                      )
                    ),
                    Core.vx_new_string("100W Laser Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("100W Laser Pistol")
                      )
                    ),
                    Core.vx_new_string("Lightning Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Pistol")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Rifles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Rifles"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("5.56mm Needle Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("5.56mm Needle Rifle")
                      )
                    ),
                    Core.vx_new_string("7.62mm Cone Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm Cone Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The modern upgrade to the traditional firearm.  Cone weapons fire rocket-propelled, recoilless rounds.  These\nrounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for\nweightlessness.  Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gyrojet Rifle, Rocket Rifle")
                      )
                    ),
                    Core.vx_new_string("Gauss Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gauss Rifle")
                      )
                    ),
                    Core.vx_new_string("Liquid Sprayer Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Liquid Sprayer Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Acid Rifle")
                      )
                    ),
                    Core.vx_new_string("500W Laser Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("500W Laser Rifle")
                      )
                    ),
                    Core.vx_new_string("Microwave Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Microwave Rifle")
                      )
                    ),
                    Core.vx_new_string("Lightning Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lightning Rifle")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Vehicular Cannons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Vehicular Cannons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Energy Attenuating Aerosol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Energy Attenuating Aerosol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A dense gas designed to absorb and refract energies that pass through it.  This obscures vision and greatly\nweakens lasers and other direct energy weapons that pass through it."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Anti-Laser Gas")
                      )
                    ),
                    Core.vx_new_string("20mm Light Gauss Cannon (LGC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Light Gauss Cannon (LGC)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Railgun")
                      )
                    ),
                    Core.vx_new_string("1.5kW Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("1.5kW Laser Cannon")
                      )
                    ),
                    Core.vx_new_string("15MW Light Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("15MW Light Laser Cannon")
                      )
                    ),
                    Core.vx_new_string("Light Particle Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Particle Cannon")
                      )
                    ),
                    Core.vx_new_string("Light Shock Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Shock Cannon")
                      )
                    ),
                    Core.vx_new_string("Light Sonic Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Sonic Cannon")
                      )
                    ),
                    Core.vx_new_string("30mm Medium Gauss Cannon (MGC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("30mm Medium Gauss Cannon (MGC)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Railgun")
                      )
                    ),
                    Core.vx_new_string("40mm Heavy Gauss Cannon (HGC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("40mm Heavy Gauss Cannon (HGC)")
                      )
                    ),
                    Core.vx_new_string("25MW Medium Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("25MW Medium Laser Cannon")
                      )
                    ),
                    Core.vx_new_string("Medium Gattling Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medium Gattling Laser Cannon")
                      )
                    ),
                    Core.vx_new_string("Medium Sniper Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medium Sniper Laser Cannon")
                      )
                    ),
                    Core.vx_new_string("35MW Heavy Laser Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("35MW Heavy Laser Cannon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Missiles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Missiles"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Swarmer Missiles"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swarmer Missiles"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("HighTech/SwarmerMissiles.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swarmer Missiles are clusters of low yield homing missiles that seek to overwhelm targets with their numbers.\n* Like all missiles, the first turn they move they only move half their movement.\n* Only weapons with Auto or other Swarmer Missiles can functionally destroy these missiles.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Vehicular Melee Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Vehicular Melee Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(".65MW Plasma Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".65MW Plasma Lance"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Huge Melee"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1.95MJ"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Energy")
                      )
                    ),
                    Core.vx_new_string("Giant Armor Blades"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Armor Blades")
                      )
                    ),
                    Core.vx_new_string("Giant Armor Spikes"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Armor Spikes")
                      )
                    ),
                    Core.vx_new_string("Giant Chain Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Chain Sword")
                      )
                    ),
                    Core.vx_new_string("Giant Explosive Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Explosive Lance")
                      )
                    ),
                    Core.vx_new_string("Giant Extending Arm"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Extending Arm")
                      )
                    ),
                    Core.vx_new_string("Giant Grenade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Grenade")
                      )
                    ),
                    Core.vx_new_string("Giant Haywire Grenade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Haywire Grenade")
                      )
                    ),
                    Core.vx_new_string("Giant Haywire Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Haywire Lance")
                      )
                    ),
                    Core.vx_new_string("Giant Haywire Whip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Haywire Whip")
                      )
                    ),
                    Core.vx_new_string("Giant Heavy Grenade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Heavy Grenade")
                      )
                    ),
                    Core.vx_new_string("Giant Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Lance")
                      )
                    ),
                    Core.vx_new_string("Giant Mace"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Mace")
                      )
                    ),
                    Core.vx_new_string("Giant Morning Star"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Morning Star")
                      )
                    ),
                    Core.vx_new_string("Giant Mauler"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Mauler"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Giant grinding melee weapon")
                      )
                    ),
                    Core.vx_new_string("Giant Net Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Net Gun")
                      )
                    ),
                    Core.vx_new_string("Giant Spike Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Spike Gun")
                      )
                    ),
                    Core.vx_new_string("Giant Vibroaxe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Vibroaxe")
                      )
                    ),
                    Core.vx_new_string("Giant Vibroblade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Vibroblade")
                      )
                    ),
                    Core.vx_new_string("Giant Vibroclaws"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Vibroclaws")
                      )
                    ),
                    Core.vx_new_string("Giant Vibrorapier"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Vibrorapier")
                      )
                    ),
                    Core.vx_new_string("Giant Vibrosword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Vibrosword")
                      )
                    ),
                    Core.vx_new_string("Giant Whip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Giant Whip")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Futuristic Weapons of Mass Destruction"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Futuristic Weapons of Mass Destruction"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Spinal Nava Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spinal Nava Cannon")
                      )
                    ),
                    Core.vx_new_string("Spinal Rail Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spinal Rail Gun")
                      )
                    ),
                    Core.vx_new_string("Spinal Wave Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spinal Wave Cannon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An enormously powerful energy cannon capable of enormous damage over a large\narea."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Death Star Cannon, Wave Motion Gun")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Star Mine"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Mine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Star Mines are basically Star Torpedoes that have been left floating in space near likely enemy traffic. The mines are smart and will only attack selected targets and can act as spy satellites by transmitting what their sensors are picking up. When given the order, the Star Mine rockets off toward its victim. Though inefficient in space because of the vast distances, they still can be effective by limiting an opponent's options or when used as traps at key locations."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Space Mine")
                      )
                    ),
                    Core.vx_new_string("Sentry Spy Satellite"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sentry Spy Satellite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sentry Spy Satellites are small disposable surveillence satellites that are hidden in asteroid or debris fields to monitor activity and transmit that information back home. They are sometimes armed with a Star Torpedo for a surprise attack.")
                      )
                    ),
                    Core.vx_new_string("Star Torpedo"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Torpedo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Star Torpedoes carry Nuclear weapons (tactical or greater). In space, nuclear weapons produce no shockwave, just intense radiation. Even direct hits are not guaranteed to pierce the diamond hard ceramic armor of modern warships, so penetration is critical.")
                      )
                    ),
                    Core.vx_new_string("Colony Drop"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Colony Drop"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Mobile Suit Gundam")
                      )
                    ),
                    Core.vx_new_string("Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Planet Bomb"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Star Blazers, Starship Troopers"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Asteroids or comets redirected to fall on a planet.")
                      )
                    ),
                    Core.vx_new_string("Plague Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plague Planet Bomb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An enormous, genocidal planet bomb that releases a series of infectious diseases to infect a population. Victims do not immediately show signs of infection to maximize the contagion and paranoia.")
                      )
                    ),
                    Core.vx_new_string("Rage Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rage Planet Bomb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An enormous, genocidal planet bomb that releases a series of parasites that turns infected creatures into rabid killers who spread the infection.")
                      )
                    ),
                    Core.vx_new_string("Famine Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Famine Planet Bomb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An enormous, genocidal planet bomb that releases a series of diseases that attack the food harvest of a planet attempting to break the food chain and cause mass starvation or force compliance.")
                      )
                    ),
                    Core.vx_new_string("Pestilence Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pestilence Planet Bomb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An enormous, genocidal planet bomb that releases a series of parasites that infect insects, birds, and vermin. These creatures gain accelerated reproduction and high aggression to attack food supplies and the general population.")
                      )
                    ),
                    Core.vx_new_string("Terraforming Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Terraforming Planet Bomb"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Genesis - Star Trek II")
                      )
                    ),
                    Core.vx_new_string("Hellbore Planet Bomb"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hellbore Planet Bomb"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A missile that detonates a series of shaped nuclear blasts to tunnel into a geological fault or a volcano where it attempts to cause a massive natural disaster.")
                      )
                    ),
                    Core.vx_new_string("Planet Buster"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Planet Buster"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Anti-Matter Missile - Star Blazers"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A missile designed to be part of a massive bombardment to shatter a planet's crust and return it to a molten state. Already unstable planets may break up into rubble.")
                      )
                    ),
                    Core.vx_new_string("Starkiller Missile"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Starkiller Missile"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Sunshine"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A missile designed to be part of a massive bombardment to disrupt the nuclear chain reaction in a star. This can result in massive solar flares, a cooling of the star, or cause the star to go nova depending on the age and size of the star.")
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
   * @function chapter_combat_overview
   * @return {chapter}
   * (func chapter_combat_overview)
   */
  public static interface Func_chapter_combat_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_combat_overview();
  }

  public static class Class_chapter_combat_overview extends Core.Class_base implements Func_chapter_combat_overview {

    @Override
    public Func_chapter_combat_overview vx_new(Object... vals) {
      Class_chapter_combat_overview output = new Class_chapter_combat_overview();
      return output;
    }

    @Override
    public Func_chapter_combat_overview vx_copy(Object... vals) {
      Class_chapter_combat_overview output = new Class_chapter_combat_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_combat_overview", // name
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
    public Func_chapter_combat_overview vx_empty() {return e_chapter_combat_overview;}
    @Override
    public Func_chapter_combat_overview vx_type() {return t_chapter_combat_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_combat_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_combat_overview() {
      return Combat.f_chapter_combat_overview();
    }

  }

  public static final Func_chapter_combat_overview e_chapter_combat_overview = new Combat.Class_chapter_combat_overview();
  public static final Func_chapter_combat_overview t_chapter_combat_overview = new Combat.Class_chapter_combat_overview();

  public static Base.Type_chapter f_chapter_combat_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Combat Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics:Combat"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics:Combat"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Nothing is softer than water, yet water can defeat rock. It does not fight. It flows around the opponent... The true master lies within. Only you can free him. - Forbidden Kingdom")
              )
            ),
            Core.vx_new_string("Rate of Fire"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Rate of Fire"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Fully-Automatic Weapons - These weapons fire continuously as long as the\ntrigger is held down, or until they run out of ammunition, or until the\nbarrel warps from the heat.\n* Burst Weapons - This is usually a setting on Fully-Automatic Weapons\nthat fires a number of shots, roughly 3, each time the trigger is pulled.\nThis is a compromise between Fully and Semi-Automatic Modes.\n* Semi-Automatic weapons - These weapons are generally capable of fully\nautomatic fire, but are limited to fire a single shot each time the trigger\nis pulled. As such, they are limited to the shooter's ability to pull the\ntrigger, generally once every second.")
              )
            ),
            Core.vx_new_string("Aiming and Range"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Aiming and Range"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* It takes 3 seconds to aim a weapon at a target.\n* Range - Each 50m range takes an additional 1 second to aim. Pistols incur -1 Attack per 50m. Rifles incur -1 Attack per 100m.\n* Aiming with a Scope - Using a scope triples the aim time and the effective range.")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_early_weaponry
   * @return {chapter}
   * (func chapter_early_weaponry)
   */
  public static interface Func_chapter_early_weaponry extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_early_weaponry();
  }

  public static class Class_chapter_early_weaponry extends Core.Class_base implements Func_chapter_early_weaponry {

    @Override
    public Func_chapter_early_weaponry vx_new(Object... vals) {
      Class_chapter_early_weaponry output = new Class_chapter_early_weaponry();
      return output;
    }

    @Override
    public Func_chapter_early_weaponry vx_copy(Object... vals) {
      Class_chapter_early_weaponry output = new Class_chapter_early_weaponry();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_early_weaponry", // name
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
    public Func_chapter_early_weaponry vx_empty() {return e_chapter_early_weaponry;}
    @Override
    public Func_chapter_early_weaponry vx_type() {return t_chapter_early_weaponry;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_early_weaponry();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_early_weaponry() {
      return Combat.f_chapter_early_weaponry();
    }

  }

  public static final Func_chapter_early_weaponry e_chapter_early_weaponry = new Combat.Class_chapter_early_weaponry();
  public static final Func_chapter_early_weaponry t_chapter_early_weaponry = new Combat.Class_chapter_early_weaponry();

  public static Base.Type_chapter f_chapter_early_weaponry() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Early Weaponry"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Early Armor"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Early Armor"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bezainted"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bezainted")
                      )
                    ),
                    Core.vx_new_string("Breast Plate"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Breast Plate"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Armor: 0 if hit in the Head, Arms, or Legs"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1mm")
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
                    Core.vx_new_string(":Brigandine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brigandine")
                      )
                    ),
                    Core.vx_new_string("Bronze Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bronze Armor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Bronze Cuirass, Helmet, Greaves"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1mm")
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
                    Core.vx_new_string("Chain Mail Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chain Mail Armor"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Shark expert and underwater filmmaker Valerie Taylor was among the first to develop and test shark suits in 1979 while diving with sharks.\n* Mail is widely used in industrial settings as shrapnel guards and splash guards in metal working operations.\n* Electrical applications for mail include RF leakage testing and being worn as a Faraday cage suit by tesla coil enthusiasts and high voltage electrical workers."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Chain mail is a type of armor consisting of small metal rings linked together in a pattern to form a mesh. It was generally in common military use between the 3rd century BC and the 16th century AD in Europe, and longer in Asia and North Africa."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chainmail, Mail, Byrnie, Hauberk"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1mm")
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
                    Core.vx_new_string("Chain Mail Shirt"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chain Mail Shirt"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Armor: 1mm if hit in chest"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chainmail, Mail"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string(":Cuirbouilli"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cuirbouilli")
                      )
                    ),
                    Core.vx_new_string(":Jazeraint"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jazeraint")
                      )
                    ),
                    Core.vx_new_string("Laminated Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Laminated Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1mm")
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
                    Core.vx_new_string("Leather Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leather Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string("Leather Pants"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leather Pants"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string("Leather Shirt"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leather Shirt"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string("Leather Vest"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Leather Vest"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string("Padded Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Padded Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string("Plate Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plate Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("3mm")
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
                    Core.vx_new_string(":Platemail"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Platemail"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2mm")
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
                    Core.vx_new_string("Quilted Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quilted Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    Core.vx_new_string(":Ringmail"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ringmail"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1mm")
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
                    Core.vx_new_string(":Scalemail"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scalemail"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2mm")
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
                    Core.vx_new_string("Scale Barding"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scale Barding"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2mm")
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
                    Core.vx_new_string("Splint Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Splint Armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Lamellar"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2mm")
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
                    Core.vx_new_string("Studded Leather Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Studded Leather Armor"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("0mm")
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
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Shields"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Shields"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Buckler"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Buckler"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("1")
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
                    Core.vx_new_string("Kite Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kite Shield"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string("Legionary Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Legionary Shield"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string("Round Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Round Shield"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hoplon Round Shield, Target Shield"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string(":Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shield"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aegis, Heater"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("2")
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
                    Core.vx_new_string("Tower Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tower Shield"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hoplite Shield"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield"),
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
                                    Core.vx_new_string(":invalidproperty"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_item,
                                        Core.vx_new_string(":prop"),
                                        Core.vx_new_string("armor"),
                                        Core.vx_new_string(":value"),
                                        Core.vx_new_string("3")
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
                    Core.vx_new_string("Wicker Shield"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wicker Shield"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Axes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Axes"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Battle Axe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battle Axe"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fasces, Sagaris"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Double-Headed Axe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Double-Headed Axe"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Labrys, Pelekus"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string("Hand Axe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hand Axe"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hachet"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Pick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pick")
                      )
                    ),
                    Core.vx_new_string(":Scythe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scythe")
                      )
                    ),
                    Core.vx_new_string(":Sickle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sickle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Kama")
                      )
                    ),
                    Core.vx_new_string("Throwing Axe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Throwing Axe"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Francisca")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Close Combat Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Close Combat Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bagh Nakh"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bagh Nakh"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tiger Claw")
                      )
                    ),
                    Core.vx_new_string("Brass Knuckles"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brass Knuckles")
                      )
                    ),
                    Core.vx_new_string(":Cestus"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cestus")
                      )
                    ),
                    Core.vx_new_string(":Garotte"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Garotte")
                      )
                    ),
                    Core.vx_new_string(":Gauntlet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gauntlet")
                      )
                    ),
                    Core.vx_new_string(":Nekode"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nekode"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Claw")
                      )
                    ),
                    Core.vx_new_string(":Sap"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sap"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blackjack")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Clubs"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Clubs"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Baton"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baton")
                      )
                    ),
                    Core.vx_new_string("Bo Stick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bo Stick")
                      )
                    ),
                    Core.vx_new_string(":Club"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Club")
                      )
                    ),
                    Core.vx_new_string(":Cudgel"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cudgel")
                      )
                    ),
                    Core.vx_new_string(":Jitte"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jitte")
                      )
                    ),
                    Core.vx_new_string("Jo Stick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jo Stick")
                      )
                    ),
                    Core.vx_new_string(":Nightstick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nightstick")
                      )
                    ),
                    Core.vx_new_string(":Quarterstaff"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quarterstaff"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Held at the bottom like a polearm. not in the middle. Holding in the middle was invented by the Boy Scouts in Victorian times for sport fighting.")
                      )
                    ),
                    Core.vx_new_string(":Shillelagh"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shillelagh")
                      )
                    ),
                    Core.vx_new_string(":Tonfa"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tonfa")
                      )
                    ),
                    Core.vx_new_string(":Truncheon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Truncheon")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Flexible Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Flexible Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bola"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bola")
                      )
                    ),
                    Core.vx_new_string(":Bullwhip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bullwhip")
                      )
                    ),
                    Core.vx_new_string(":Chain"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chain")
                      )
                    ),
                    Core.vx_new_string("Chain Whip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chain Whip")
                      )
                    ),
                    Core.vx_new_string(":Flail"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flail")
                      )
                    ),
                    Core.vx_new_string(":Kusari"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kusari")
                      )
                    ),
                    Core.vx_new_string(":Lasso"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lasso")
                      )
                    ),
                    Core.vx_new_string(":Manriki"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Manriki")
                      )
                    ),
                    Core.vx_new_string(":Net"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Net")
                      )
                    ),
                    Core.vx_new_string(":Noose"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Noose")
                      )
                    ),
                    Core.vx_new_string(":Nunchaku"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nunchaku"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Pole Lasso"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pole Lasso")
                      )
                    ),
                    Core.vx_new_string("Rope and Rocks"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rope and Rocks"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Surujin"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Rope Dart"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rope Dart"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Sickle and Chain"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sickle and Chain"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Kusarigama"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Spike and Chain"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spike and Chain")
                      )
                    ),
                    Core.vx_new_string("Three Section Staff"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Three Section Staff"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sansetsukon"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Weighted Chain"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Weighted Chain"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Meteor Hammer")
                      )
                    ),
                    Core.vx_new_string(":Whip"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whip")
                      )
                    ),
                    Core.vx_new_string("Whip Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whip Sword"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Urumi")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Hammers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Hammers"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Mjolnir - Thor's Hammer"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bec de Corbin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bec de Corbin")
                      )
                    ),
                    Core.vx_new_string(":Godendag"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Godendag")
                      )
                    ),
                    Core.vx_new_string("Holy Water Sprinkler"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Holy Water Sprinkler")
                      )
                    ),
                    Core.vx_new_string("Horseman's pick"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Horseman's pick")
                      )
                    ),
                    Core.vx_new_string("Lucerne Hammer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lucerne Hammer")
                      )
                    ),
                    Core.vx_new_string(":Mace"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mace"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Mallet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mallet")
                      )
                    ),
                    Core.vx_new_string(":Maul"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Maul")
                      )
                    ),
                    Core.vx_new_string(":Morningstar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Morningstar"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Scepter"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scepter"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* +1 [Initimidation]")
                      )
                    ),
                    Core.vx_new_string("Star Mace"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Star Mace"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Throwing Hammer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Throwing Hammer"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("War Hammer"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("War Hammer"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Knives"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Knives"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bundi"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bundi"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Butterfly Knife"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Butterfly Knife"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Balisong"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Cinqueda"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cinqueda"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Dagger"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dagger"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Dirk"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dirk"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Hunting Knife"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunting Knife"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Knife"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Knife"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Kris"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kris"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Main Gauche"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Main Gauche")
                      )
                    ),
                    Core.vx_new_string(":Sai"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sai"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Stake"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stake"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Stiletto"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stiletto"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string(":Switchblade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Switchblade"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Throwing Knife"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Throwing Knife"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Polearms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Polearms"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bill-Guisarme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bill-Guisarme"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Glaive"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glaive"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("A glaive is a European polearm weapon, consisting of a single-edged blade on the end of a pole. It is similar to the Japanese naginata and the Chinese Guan Dao. Typically, the blade was around 45 cm (18 inches) long, on the end of a pole 2 m (6 or 7 feet) long, and the blade was affixed in a socket-shaft configuration similar to an axe head, rather than having a tang like a sword or naginata,"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Guan Dao"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Glaive-Guisarme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Glaive-Guisarme"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Halberd"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Halberd"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Halberdier"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Naginata"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naginata"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Poleaxe"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poleaxe"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Ranseur"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ranseur"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Spetum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spetum"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Voulge-Guisarme"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Voulge-Guisarme"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Spears"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Spears"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Atlatl"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atlatl"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Dart-thrower\n* An atlatl dart is capable of killing even the largest of animals at any distance that its thrower is capable of accurately reaching since more power is applied to longer shots than shorter shots."),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("20m")
                      )
                    ),
                    Core.vx_new_string(":Bayonet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bayonet"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Javelin"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Javelin"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("198J"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("3kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Indirect Fire, Piercing"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("18m")
                      )
                    ),
                    Core.vx_new_string(":Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lance"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Couched Lance"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("300J"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("2.5m"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Reach, Piercing")
                      )
                    ),
                    Core.vx_new_string(":Pike"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pike"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pikeman"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("4m"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Reach, Piercing")
                      )
                    ),
                    Core.vx_new_string(":Pilum"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pilum"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* When once fixed in the shield it was impossible to draw them out, and when thrown with force and skill, they penetrated the cuirass without difficulty. - Roman writer Vegtius"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The pilum was designed to be armour-piercing: the pyramidal head would punch a small hole through an enemy shield allowing the thin shank to pass through and penetrate a distance sufficient to hit the target. A pilum, having penetrated a shield through a small hole and its shank having bent would now be difficult to remove. It is likely that the shaft would hit the ground and thus stop the charging enemy in his tracks. An enemy, if not killed by the pilum, would have little time before closing with the legionaries and would have to discard his now-unwieldy shield before going into combat. Additionally, bent pila would be less suitable for reuse by a resourceful opponent."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("3kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Indirect Fire, Piercing"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("18m")
                      )
                    ),
                    Core.vx_new_string(":Spear"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Reach, Piercing")
                      )
                    ),
                    Core.vx_new_string(":Trident"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trident"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Spear"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Reach, Piercing")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Swords"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Swords"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("All swords have the Bleeding modifier."),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Backsword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Backsword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string("Bastard Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bastard Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Bokken"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bokken"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword")
                      )
                    ),
                    Core.vx_new_string(":Broadsword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Broadsword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string("Butterfly Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Butterfly Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string("Cavalry Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cavalry Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Cutlass"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cutlass"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Epee"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Epee"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Falchion"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Falchion"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A short, cleaving sword for close-in combat used by many troops including archers."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Foil"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Foil"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("50J")
                      )
                    ),
                    Core.vx_new_string("Great Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Great Sword"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Two-handed Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string("Hook Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hook Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Katana"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Katana"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Katar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Katar"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Longsword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Longsword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Ninjato"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ninjato"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":No-Dachi"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("No-Dachi"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("200J")
                      )
                    ),
                    Core.vx_new_string(":Rapier"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rapier"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding, Piercing")
                      )
                    ),
                    Core.vx_new_string(":Saber"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Saber"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Scimitar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scimitar"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string("Short Sword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Short Sword"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Bleeding")
                      )
                    ),
                    Core.vx_new_string(":Tanto"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tanto"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Wakizashi"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wakizashi"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Sword"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Archery"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Archery"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Composite Bow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Composite Bow"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The main advantage of composite bows over self bows (made from a single piece of wood) is their combination of smaller size with high power. They are therefore much more suitable for use from horseback, and presumably from a chariot.\n* Constructing composite bows requires much more time and materials than self bows, and the animal glue traditionally used can lose strength in humid conditions and be quickly ruined by submersion. For most practical non-mounted archery purposes, composite construction offers no advantage; 'the initial velocity is about the same for all types of bow, the design parameters appear to be less important than is often claimed.' However, their compact size make them superior for horsemen.\n* [Attack]: [+1 Range], [+1 Piercing]"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("170J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Piercing")
                      )
                    ),
                    Core.vx_new_string("Compound Bow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Compound Bow")
                      )
                    ),
                    Core.vx_new_string(":Longbow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Longbow"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Attack]: [+1 Range], [+2 Piercing]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Daikyu"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("156J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Piercing")
                      )
                    ),
                    Core.vx_new_string("Short Bow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Short Bow"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Can fire about 6 aimed shots or 12 unaimed shots per minute."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Attack]: [+1 Piercing]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hankyu, Recurve Bow"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("80J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Piercing")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Crossbows"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Crossbows"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hand Crossbow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hand Crossbow")
                      )
                    ),
                    Core.vx_new_string("Heavy Crossbow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Crossbow"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("147J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Piercing")
                      )
                    ),
                    Core.vx_new_string("Light Crossbow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Crossbow"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Piercing")
                      )
                    ),
                    Core.vx_new_string("Repeating Crossbow"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Repeating Crossbow")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Thrown Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Thrown Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Baseball"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Baseball"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("100J")
                      )
                    ),
                    Core.vx_new_string(":Blowgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blowgun")
                      )
                    ),
                    Core.vx_new_string("Blown Needles"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blown Needles"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Similar to a blowgun, these are tiny poison needles held in the mouth and blown at nearby opponents."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Fukimi-bari")
                      )
                    ),
                    Core.vx_new_string(":Boomerang"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boomerang")
                      )
                    ),
                    Core.vx_new_string(":Caltrop"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Caltrop")
                      )
                    ),
                    Core.vx_new_string(":Chakram"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chakram"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sharp edged rings used extensively in ancient India. They are carried in large numbers and are thrown at short range from infantry, horses, or elephants.")
                      )
                    ),
                    Core.vx_new_string(":Dart"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dart")
                      )
                    ),
                    Core.vx_new_string(":Football"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Football")
                      )
                    ),
                    Core.vx_new_string("Hunga Munga"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hunga Munga")
                      )
                    ),
                    Core.vx_new_string("Improvised Weapons"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Improvised Weapons")
                      )
                    ),
                    Core.vx_new_string(":Shuriken"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shuriken")
                      )
                    ),
                    Core.vx_new_string("Skipping Stone"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Skipping Stone")
                      )
                    ),
                    Core.vx_new_string(":Sling"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sling")
                      )
                    ),
                    Core.vx_new_string("Sling Staff"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sling Staff")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Siege Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Siege Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Arbalest"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arbalest")
                      )
                    ),
                    Core.vx_new_string(":Ballista"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ballista")
                      )
                    ),
                    Core.vx_new_string("Battering Ram"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battering Ram")
                      )
                    ),
                    Core.vx_new_string("Boiling Oil"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Boiling Oil")
                      )
                    ),
                    Core.vx_new_string(":Catapult"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Catapult")
                      )
                    ),
                    Core.vx_new_string(":Escalade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Escalade"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Siege Ladders")
                      )
                    ),
                    Core.vx_new_string("Greek Fire"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Greek Fire"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Liquid Fire, Wildfire")
                      )
                    ),
                    Core.vx_new_string(":Mangonel"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mangonel")
                      )
                    ),
                    Core.vx_new_string(":Onager"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Onager")
                      )
                    ),
                    Core.vx_new_string("Siege Hook"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siege Hook")
                      )
                    ),
                    Core.vx_new_string("Siege Tower"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Siege Tower")
                      )
                    ),
                    Core.vx_new_string(":Springal"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Springal")
                      )
                    ),
                    Core.vx_new_string(":Trebuchet"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Trebuchet")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Early Firearms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Early Firearms"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Matchlock Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Matchlock Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1400s")
                      )
                    ),
                    Core.vx_new_string("Matchlock Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Matchlock Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1400s")
                      )
                    ),
                    Core.vx_new_string("Wheellock Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wheellock Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1500s")
                      )
                    ),
                    Core.vx_new_string("Wheellock Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wheellock Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1500s")
                      )
                    ),
                    Core.vx_new_string("Flintlock Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flintlock Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1600s")
                      )
                    ),
                    Core.vx_new_string("Flintlock Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flintlock Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1600s")
                      )
                    ),
                    Core.vx_new_string("Dueling Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dueling Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1770")
                      )
                    ),
                    Core.vx_new_string("Brown Bees Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brown Bees Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1700s")
                      )
                    ),
                    Core.vx_new_string("Percussion Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Percussion Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1800s")
                      )
                    ),
                    Core.vx_new_string("Percussion Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Percussion Rifle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("1800s")
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
   * @function chapter_example_of_play
   * @return {chapter}
   * (func chapter_example_of_play)
   */
  public static interface Func_chapter_example_of_play extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_example_of_play();
  }

  public static class Class_chapter_example_of_play extends Core.Class_base implements Func_chapter_example_of_play {

    @Override
    public Func_chapter_example_of_play vx_new(Object... vals) {
      Class_chapter_example_of_play output = new Class_chapter_example_of_play();
      return output;
    }

    @Override
    public Func_chapter_example_of_play vx_copy(Object... vals) {
      Class_chapter_example_of_play output = new Class_chapter_example_of_play();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_example_of_play", // name
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
    public Func_chapter_example_of_play vx_empty() {return e_chapter_example_of_play;}
    @Override
    public Func_chapter_example_of_play vx_type() {return t_chapter_example_of_play;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_example_of_play();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_example_of_play() {
      return Combat.f_chapter_example_of_play();
    }

  }

  public static final Func_chapter_example_of_play e_chapter_example_of_play = new Combat.Class_chapter_example_of_play();
  public static final Func_chapter_example_of_play t_chapter_example_of_play = new Combat.Class_chapter_example_of_play();

  public static Base.Type_chapter f_chapter_example_of_play() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Example of Play"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Street Fight"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Street Fight")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_modern_equipment
   * @return {chapter}
   * (func chapter_modern_equipment)
   */
  public static interface Func_chapter_modern_equipment extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_modern_equipment();
  }

  public static class Class_chapter_modern_equipment extends Core.Class_base implements Func_chapter_modern_equipment {

    @Override
    public Func_chapter_modern_equipment vx_new(Object... vals) {
      Class_chapter_modern_equipment output = new Class_chapter_modern_equipment();
      return output;
    }

    @Override
    public Func_chapter_modern_equipment vx_copy(Object... vals) {
      Class_chapter_modern_equipment output = new Class_chapter_modern_equipment();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_modern_equipment", // name
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
    public Func_chapter_modern_equipment vx_empty() {return e_chapter_modern_equipment;}
    @Override
    public Func_chapter_modern_equipment vx_type() {return t_chapter_modern_equipment;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_modern_equipment();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_modern_equipment() {
      return Combat.f_chapter_modern_equipment();
    }

  }

  public static final Func_chapter_modern_equipment e_chapter_modern_equipment = new Combat.Class_chapter_modern_equipment();
  public static final Func_chapter_modern_equipment t_chapter_modern_equipment = new Combat.Class_chapter_modern_equipment();

  public static Base.Type_chapter f_chapter_modern_equipment() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Modern Equipment"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Modern Armor"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Armor"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Bulletproof Vest"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bulletproof Vest"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Kevlar Vest")
                      )
                    ),
                    Core.vx_new_string("Bulletproof Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bulletproof Armor"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Flak Jacket, Kevlar Armor")
                      )
                    ),
                    Core.vx_new_string("Doorgunner Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Doorgunner Armor")
                      )
                    ),
                    Core.vx_new_string("Model Y Bulletproof Vest"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Model Y Bulletproof Vest")
                      )
                    ),
                    Core.vx_new_string("Interceptor Body Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Interceptor Body Armor")
                      )
                    ),
                    Core.vx_new_string("Dragon Skin Armor"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dragon Skin Armor")
                      )
                    ),
                    Core.vx_new_string("SARCOS Exoskeleton"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("SARCOS Exoskeleton")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Explosives"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Explosives"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":C4"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("C4")
                      )
                    ),
                    Core.vx_new_string("Improvised Explosive Device (IED)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Improvised Explosive Device (IED)")
                      )
                    ),
                    Core.vx_new_string("White Phosphorous Grenade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("White Phosphorous Grenade")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Pistols"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Pistols"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Air Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Pistol"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Can discharge Paintballs or small amounts of other chemicals.")
                      )
                    ),
                    Core.vx_new_string(".22 Holdout Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".22 Holdout Pistol")
                      )
                    ),
                    Core.vx_new_string(".22 Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".22 Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ruger MkII")
                      )
                    ),
                    Core.vx_new_string("5mm Needler Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("5mm Needler Pistol")
                      )
                    ),
                    Core.vx_new_string(".38 Revolver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".38 Revolver"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string(".38 Special, .38 Derringer, .38 Llama Comanche"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("319J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("300m/s")
                      )
                    ),
                    Core.vx_new_string(".38 Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".38 Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Walther PPK-S"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol")
                      )
                    ),
                    Core.vx_new_string("9mm Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("9mm Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Glock 17L, Browning 9mm, Baretta 92, Calico M-950, H&amp;K P9S, SIG/SAUER P226, S&amp;P ASP"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("518J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("360m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("50m")
                      )
                    ),
                    Core.vx_new_string("9mm Machine Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("9mm Machine Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("H&amp;K MP5K, Steyer TMP, Tactical Machine Pistol, Micro-Uzi"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("380m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("100m"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("850/min")
                      )
                    ),
                    Core.vx_new_string(".357 Desert Eagle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".357 Desert Eagle")
                      )
                    ),
                    Core.vx_new_string(".357 Magnum Revolver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".357 Magnum Revolver"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Colt Python"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("778J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("430m/s")
                      )
                    ),
                    Core.vx_new_string("10mm Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("10mm Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Glock 20, S&amp;W 1006"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol")
                      )
                    ),
                    Core.vx_new_string(".40 Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".40 Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("SIG/SAUER P229"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol")
                      )
                    ),
                    Core.vx_new_string(".41 Magnum Revolver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".41 Magnum Revolver"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("S &amp;W Model 57"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol")
                      )
                    ),
                    Core.vx_new_string(".45 Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("AMT Automag, Colt M1911A, LAR Grizzly"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("410J")
                      )
                    ),
                    Core.vx_new_string(".44 Magnum Revolver"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".44 Magnum Revolver"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Colt Anaconda, Ruger Super Redhawk"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1524J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("460m/s")
                      )
                    ),
                    Core.vx_new_string(".50 Automatic Pistol"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".50 Automatic Pistol"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("MRI Desert Eagle"),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Pistol"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("2000J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("460m/s")
                      )
                    ),
                    Core.vx_new_string(":Taser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Taser"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string(".3J")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Rifles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Rifles"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("12-gauge Double Barrelled Shotgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12-gauge Double Barrelled Shotgun"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Alright you primitive screwheads. Listen up. See this. This is my... BOOMSTICK! Its a 12-guage Double Barrelled Remington. S-Mart's top of the line. You can find it in the sporting goods department. That's right, this sweet baby was made in Grand Rapids, Michigan. Retails for about $109.95. It's got a walnut stock, cobalt blue steel, and a hair trigger. That's right. Shop smart. Shop S-Mart. YOU GOT THAT?! - Ash, Army of Darkness"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3724J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("1680m/s")
                      )
                    ),
                    Core.vx_new_string("12-gauge Sawed Off Shotgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12-gauge Sawed Off Shotgun"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3724J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("1680m/s")
                      )
                    ),
                    Core.vx_new_string("12-gauge Pump Shotgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12-gauge Pump Shotgun"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Entry Team Striker, Franchi SPAS-12, Jackhammer Mk 3A-2, Mossberg M500, Remington 870P, Street Sweeper 870P, USAS-12"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3724J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("1680m/s")
                      )
                    ),
                    Core.vx_new_string("12-gauge Tactical Shotgun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("12-gauge Tactical Shotgun")
                      )
                    ),
                    Core.vx_new_string(".22 Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".22 Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Calico M-105")
                      )
                    ),
                    Core.vx_new_string("5.56mm Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("5.56mm Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Colt Sporter Delta")
                      )
                    ),
                    Core.vx_new_string("5.56mm Assault Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("5.56mm Assault Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Colt M-16A1, L85A1, Steyr AUG"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("1767J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("940m/s")
                      )
                    ),
                    Core.vx_new_string(".30-06 Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".30-06 Rifle")
                      )
                    ),
                    Core.vx_new_string(".30-06 Semi-Automatic Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".30-06 Semi-Automatic Rifle")
                      )
                    ),
                    Core.vx_new_string("7.62mm Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Galil Sniper Rifle, Steyr SSG-69, SVD Dragunov, Walther WA-2000 Sniper")
                      )
                    ),
                    Core.vx_new_string("7.62mm Assault Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm Assault Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("AR-15, M-16, AK-47, FN-FAL"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3504J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("850m/s")
                      )
                    ),
                    Core.vx_new_string("7.62mm M24 Sniper Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm M24 Sniper Rifle")
                      )
                    ),
                    Core.vx_new_string(".45 Elephant Gun"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Elephant Gun"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("H&amp;H African, Nitro Express"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("6470J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("660m/s")
                      )
                    ),
                    Core.vx_new_string(".50 Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".50 Rifle"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("McMillan M-87")
                      )
                    ),
                    Core.vx_new_string("Combat Flamethrower"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combat Flamethrower")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Machine Guns"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Machine Guns"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("30mm GAU-8 Avenger"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("30mm GAU-8 Avenger"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("5m"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("281kg"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("1000m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("1500m"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("4200/min"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("1174")
                      )
                    ),
                    Core.vx_new_string(".32 Submachine Gun (SMG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".32 Submachine Gun (SMG)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Skorpion M-61")
                      )
                    ),
                    Core.vx_new_string("9mm Submachine Gun (SMG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("9mm Submachine Gun (SMG)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Uzi, H&amp;K MP5, Intratec TEC-9, Spectre M-4"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("400m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("200m"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("600/min")
                      )
                    ),
                    Core.vx_new_string(".45 Submachine Gun (SMG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Submachine Gun (SMG)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ingram MAC-10")
                      )
                    ),
                    Core.vx_new_string(".45 Machine Gun (MG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".45 Machine Gun (MG)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Thomson Machine Gun, Tommy Gun"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("280m/s"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("50m"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("800/min")
                      )
                    ),
                    Core.vx_new_string("7.62mm Machine Gun (MG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm Machine Gun (MG)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("M-60")
                      )
                    ),
                    Core.vx_new_string(".30-06 Machine Gun (MG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".30-06 Machine Gun (MG)")
                      )
                    ),
                    Core.vx_new_string("7.62mm Minigun (MG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("7.62mm Minigun (MG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An infantry support weapon that can be adapted for vehicular use on a pintle mount. While it is useful against infantrymen, it is nearly worthless against vehicles, even unarmored ones."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("M134"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("3504J"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("850m/s"),
                        Core.vx_new_string(":rof"),
                        Core.vx_new_string("4000/min")
                      )
                    ),
                    Core.vx_new_string(".50 Heavy Machine Gun (HMG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string(".50 Heavy Machine Gun (HMG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The heaviest of infantry weapons, the heavy machine gun must be mounted on a bipod, tripod, or pintle.  The HMG is effective only against infantry and light armored vehicles.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Cannons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Cannons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Liquid Sprayer Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Liquid Sprayer Cannon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Can dispense Water, Fire Retardant Foam, Cleaning Solvent or other more frightening solutions.")
                      )
                    ),
                    Core.vx_new_string("15mm Very Light Cannon (VLC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("15mm Very Light Cannon (VLC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The VLC is designed as a backup weapon for light scouting vehicles. Its shell can pierce the armor of other light vehicles but not much else. Its simple design makes it light, affordable, and easy to maintain.")
                      )
                    ),
                    Core.vx_new_string("15mm Very Light Recoilless Cannon (VLC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("15mm Very Light Recoilless Cannon (VLC)")
                      )
                    ),
                    Core.vx_new_string("15mm Very Light Autocannon (VLAC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("15mm Very Light Autocannon (VLAC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The VLAC lies somewhere between a heavy infantry machinegun and a vehicle mounted autocannon. Though its armor piercing shells are not particularly good against infantry, it is a perfect backup anti-armor weapon for a light vehicle.")
                      )
                    ),
                    Core.vx_new_string("20mm Light Cannon (LC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Light Cannon (LC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Light Cannon is a simpler version of the Light Autocannon. It lacks automatic fire, but it more affordable, more accurate, and has a longer range.")
                      )
                    ),
                    Core.vx_new_string("20mm Light Recoilless Cannon (LRC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Light Recoilless Cannon (LRC)")
                      )
                    ),
                    Core.vx_new_string("20mm Light Autocannon (LAC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Light Autocannon (LAC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Light Autocannons are popular weapons combining a high rate of fire with significant penetration.")
                      )
                    ),
                    Core.vx_new_string("Light Flame Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Flame Cannon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flame Cannons are vehicular flamethrowers that spray burning liquid in a wide arc. They are most effective against soft targets, but the heat generated from sustained fire can damage even heavily armored targets. It is also capable of indirect fire.")
                      )
                    ),
                    Core.vx_new_string("30mm Medium Cannon (MC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("30mm Medium Cannon (MC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Medium Cannon is a simpler version of the Medium Autocannon. It lacks automatic fire, but it is more affordable, more accurate, and has a longer range.")
                      )
                    ),
                    Core.vx_new_string("30mm Medium Recoilless Cannon (MRC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("30mm Medium Recoilless Cannon (MRC)"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bazooka Cannon")
                      )
                    ),
                    Core.vx_new_string("30mm Medium Autocannon (MAC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("30mm Medium Autocannon (MAC)"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The A-10 Thunderbolt's main weapon."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Medium Autocannons are nearly as popular as Light Autocannons.  They sacrifice some fire rate for higher damage and range.")
                      )
                    ),
                    Core.vx_new_string("Medium Flame Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medium Flame Cannon")
                      )
                    ),
                    Core.vx_new_string("40mm Heavy Cannon (HC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("40mm Heavy Cannon (HC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Heavy Cannon can penetrate light tank armor and the 40mm shells can carry a variety of specialized ammunition.")
                      )
                    ),
                    Core.vx_new_string("40mm Heavy Recoilless Cannon (HRC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("40mm Heavy Recoilless Cannon (HRC)")
                      )
                    ),
                    Core.vx_new_string("40mm Heavy Autocannon (HAC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("40mm Heavy Autocannon (HAC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Heavy Autocannon is often the main armament of light tanks.  Its high rate of fire tends to preclude the use of\nmost exotic ammunition.")
                      )
                    ),
                    Core.vx_new_string("Heavy Flame Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Flame Cannon")
                      )
                    ),
                    Core.vx_new_string("50mm Very Heavy Cannon (VHC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("50mm Very Heavy Cannon (VHC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Heavy Autocannon is often the main armament of light tanks. Its high rate of fire tends to preclude the use of most exotic ammunition.")
                      )
                    ),
                    Core.vx_new_string("50mm Very Heavy Recoilless Cannon (VHRC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("50mm Very Heavy Recoilless Cannon (VHRC)")
                      )
                    ),
                    Core.vx_new_string("50mm Very Heavy Autocannon (VHAC)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("50mm Very Heavy Autocannon (VHAC)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The 50mm Autocannon is an electically-driven, multi-tube gattling cannon capable of delivering an awesome amount of ammunition in a very short amount of time. This is typically the largest cannon produced with autofire because of the large amount of space that ammunition takes up.")
                      )
                    ),
                    Core.vx_new_string("75mm Very Light Field Gun (VLFG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("75mm Very Light Field Gun (VLFG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Very Light Field Gun is the smallest of the single-shot, specialized anti-armor, guns. VLFG's are often mounted on gun carriages or defensive bunkers. The VLFG is effective against most medium tanks except against front armor.")
                      )
                    ),
                    Core.vx_new_string("90mm Light Field Mortar (LFM)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("90mm Light Field Mortar (LFM)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Mortar Cannon fires low velocity, large caliber High Explosive shells. Their shells have poor penetration but are well suited for indirect fire, suppressive fire, and mass destruction of soft targets.")
                      )
                    ),
                    Core.vx_new_string("90mm Light Field Gun (LFG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("90mm Light Field Gun (LFG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Light Field Gun is a popular main weapon on light and medium tanks. The LFG is effective against most medium tanks.")
                      )
                    ),
                    Core.vx_new_string("120mm Smoothbore Cannon"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("120mm Smoothbore Cannon"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Fire Armor Piercing Fin Stabalized, Depleted Uranium rounds"),
                        Core.vx_new_string(":energy"),
                        Core.vx_new_string("11MJ")
                      )
                    ),
                    Core.vx_new_string("120mm Medium Field Gun (MFG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("120mm Medium Field Gun (MFG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Medium Field Gun is a popular main weapon on heavy tanks.  The LFG is effective against most heavy tanks.")
                      )
                    ),
                    Core.vx_new_string("120mm Medium Field Mortar (MFM)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("120mm Medium Field Mortar (MFM)")
                      )
                    ),
                    Core.vx_new_string("140mm Heavy Field Gun (HFG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("140mm Heavy Field Gun (HFG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Heavy Field Gun is a used on heavy tank destroyers and main battle tanks.  The HFG is effective against most main battle\ntanks.")
                      )
                    ),
                    Core.vx_new_string("140mm Heavy Field Mortar (HFM)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("140mm Heavy Field Mortar (HFM)")
                      )
                    ),
                    Core.vx_new_string("200mm Very Heavy Field Gun (VHFG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("200mm Very Heavy Field Gun (VHFG)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Very Heavy Field Gun is used in heavy artillery pieces and fixed installations.  The VHFG is effective against almost any\ntarget."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Naval Gun")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":AP"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("AP")
                      )
                    ),
                    Core.vx_new_string(":APFSDS"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("APFSDS")
                      )
                    ),
                    Core.vx_new_string(":HE"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("HE")
                      )
                    ),
                    Core.vx_new_string(":HEAT"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("HEAT")
                      )
                    ),
                    Core.vx_new_string(":HESH"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("HESH")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Portable Explosives"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Portable Explosives"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hand Grenade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hand Grenade"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("WWIIAmerican/Grenade_MK2.jpg"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* It had a fatality radius of 5m, a blast radius of 13.7m, and fragments can disperse to 213m.\n* At least 5 people have thrown themselves on hand grenades and lived."),
                        Core.vx_new_string(":explosive"),
                        Core.vx_new_string(".057kg"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string(".6kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("Anti-Personnel, Area"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("30m")
                      )
                    ),
                    Core.vx_new_string("20mm Light Grenade Launcher"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("20mm Light Grenade Launcher")
                      )
                    ),
                    Core.vx_new_string("50mm Mortar"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("50mm Mortar")
                      )
                    ),
                    Core.vx_new_string("66mm Light Anti-Armor Weapon (LAW)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("66mm Light Anti-Armor Weapon (LAW)"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* M72 LAW"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One shot anti-tank weapon that can penetrate 250mm."),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("1m"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("2.3kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HEAT"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("200m")
                      )
                    ),
                    Core.vx_new_string("84mm Recoilless Rifle"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("84mm Recoilless Rifle"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* AT4"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* One shot anti-tank weapon that can penetrate 400mm with HEAT or carry 440g of HE."),
                        Core.vx_new_string(":explosive"),
                        Core.vx_new_string(".440kg"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("6.7kg"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HEAT"),
                        Core.vx_new_string(":muzzlevelocity"),
                        Core.vx_new_string("284m"),
                        Core.vx_new_string(":range"),
                        Core.vx_new_string("300m")
                      )
                    ),
                    Core.vx_new_string("Rifle Propelled Grenade (RPG)"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rifle Propelled Grenade (RPG)")
                      )
                    ),
                    Core.vx_new_string("Plastic Explosive"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plastic Explosive")
                      )
                    ),
                    Core.vx_new_string("Land Mine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Land Mine")
                      )
                    ),
                    Core.vx_new_string("Smoke Dispenser"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smoke Dispenser")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Modern Missiles"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Modern Missiles"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("50mm Medium Grenade Launcher"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("50mm Medium Grenade Launcher"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("20")
                      )
                    ),
                    Core.vx_new_string("70mm Heavy Grenade Launcher"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("70mm Heavy Grenade Launcher"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("12")
                      )
                    ),
                    Core.vx_new_string("Light Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("52mm Light Rocket Pod"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("52mm Light Rocket Pod"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Medium Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medium Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("71mm Medium Rocket Pod"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("71mm Medium Rocket Pod"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Heavy Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Fuel Air Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Air Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Cluster Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cluster Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("82mm Heavy Rocket Pod"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("82mm Heavy Rocket Pod"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Very Heavy Bomb Rack"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Very Heavy Bomb Rack"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE, INC"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("8")
                      )
                    ),
                    Core.vx_new_string("Missile Pod"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missile Pod")
                      )
                    ),
                    Core.vx_new_string("Heavy RPG"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy RPG"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Disposable short-range, rocket with shaped charge for armor penetration."),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("1")
                      )
                    ),
                    Core.vx_new_string("Very Heavy RPG"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Very Heavy RPG"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Disposable short-range, rocket with shaped charge for armor penetration."),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("1")
                      )
                    ),
                    Core.vx_new_string("Light Bombardment Rocket"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Light Bombardment Rocket"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("16")
                      )
                    ),
                    Core.vx_new_string("Medium Bombardment Rocket"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Medium Bombardment Rocket"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("16")
                      )
                    ),
                    Core.vx_new_string("Heavy Bombardment Rocket"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heavy Bombardment Rocket"),
                        Core.vx_new_string(":modifiers"),
                        Core.vx_new_string("HE"),
                        Core.vx_new_string(":rounds"),
                        Core.vx_new_string("16")
                      )
                    ),
                    Core.vx_new_string("Anti-Aircraft Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Aircraft Missile")
                      )
                    ),
                    Core.vx_new_string(":RPG-7"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("RPG-7")
                      )
                    ),
                    Core.vx_new_string(":RPG-29"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("RPG-29"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Iraq 2007, an RPG-29 round penetrated the frontal ERA and hull of a Challenger 2 tank"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Tandem charged HEAT round")
                      )
                    ),
                    Core.vx_new_string("Cruise Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cruise Missile")
                      )
                    ),
                    Core.vx_new_string("SAM Surface To Air Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("SAM Surface To Air Missile"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/Missile.png")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Weapons of Mass Destruction"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Weapons of Mass Destruction"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Agent Orange"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Agent Orange")
                      )
                    ),
                    Core.vx_new_string(":Napalm"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Napalm")
                      )
                    ),
                    Core.vx_new_string("Cluster Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cluster Bomb")
                      )
                    ),
                    Core.vx_new_string("Smart Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smart Bomb")
                      )
                    ),
                    Core.vx_new_string("Block Buster"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Block Buster")
                      )
                    ),
                    Core.vx_new_string("Bunker Buster"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bunker Buster")
                      )
                    ),
                    Core.vx_new_string("Fuel Air Explosive"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Air Explosive")
                      )
                    ),
                    Core.vx_new_string("Naval Mine"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naval Mine")
                      )
                    ),
                    Core.vx_new_string("Nuclear Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nuclear Bomb")
                      )
                    ),
                    Core.vx_new_string("Fusion Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fusion Bomb")
                      )
                    ),
                    Core.vx_new_string("Dirty Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dirty Bomb")
                      )
                    ),
                    Core.vx_new_string("Nerve Gas Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nerve Gas Bomb")
                      )
                    ),
                    Core.vx_new_string(":MIRV"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("MIRV")
                      )
                    ),
                    Core.vx_new_string("Neutron Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Neutron Bomb")
                      )
                    ),
                    Core.vx_new_string("Plague Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plague Bomb")
                      )
                    ),
                    Core.vx_new_string("Tactical Nuclear Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tactical Nuclear Bomb")
                      )
                    ),
                    Core.vx_new_string("Tactical Nuclear Cruise Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tactical Nuclear Cruise Missile")
                      )
                    ),
                    Core.vx_new_string("Strategic Nuclear Bomb"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Strategic Nuclear Bomb")
                      )
                    ),
                    Core.vx_new_string("Nuclear Cruise Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nuclear Cruise Missile")
                      )
                    ),
                    Core.vx_new_string("Nuclear Ballistic Missile"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nuclear Ballistic Missile")
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
   * @function chapter_rules
   * @return {chapter}
   * (func chapter_rules)
   */
  public static interface Func_chapter_rules extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_rules();
  }

  public static class Class_chapter_rules extends Core.Class_base implements Func_chapter_rules {

    @Override
    public Func_chapter_rules vx_new(Object... vals) {
      Class_chapter_rules output = new Class_chapter_rules();
      return output;
    }

    @Override
    public Func_chapter_rules vx_copy(Object... vals) {
      Class_chapter_rules output = new Class_chapter_rules();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_rules", // name
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
    public Func_chapter_rules vx_empty() {return e_chapter_rules;}
    @Override
    public Func_chapter_rules vx_type() {return t_chapter_rules;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_rules();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_rules() {
      return Combat.f_chapter_rules();
    }

  }

  public static final Func_chapter_rules e_chapter_rules = new Combat.Class_chapter_rules();
  public static final Func_chapter_rules t_chapter_rules = new Combat.Class_chapter_rules();

  public static Base.Type_chapter f_chapter_rules() {
    Base.Type_chapter output = Base.e_chapter;
    Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Rules"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Levels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Levels"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* The resistance to penetration of armor is related to the thickness of the steel - 2mm armor required about 3 times as much energy to defeat as 1mm armor.\n* By its apex, hardened steel plate was almost impregnable on the battlefield. Knights were instead increasingly felled by polearms such as the halberd and blunt weapons such as maces or war hammers that could send concussive force through the plate armor resulting in injuries such as broken bones, organ hemorrhage and/or head trauma. Another tactic was to attempt to strike through the gaps between the armor pieces, using daggers, spears and spear points to attack the man-at-arms' eyes or joints.\n* Weight - A full suit of medieval plate is thought to have weighed little more than 60 lb (27 kg) on average, considerably lighter than the equipment often carried by the elite of today's armies. If during the 14-15th centuries armour seldom weighed more than 15kgs, than by the late 16th century it weighed 25kg. The increasing weight and thickness of late 16th century armor therefore gave substantial resistance.\n* Proof - In the early years of pistol and arquebuses, firearms were relatively low in velocity. The full suits of armour, or breast plates actually stopped bullets fired from a modest distance. The front breast plates were, in fact, commonly shot as a test. The impact point would often be encircled with engraving to point it out. This was called the 'proof'. Rather than making plate armour obsolete, the use of firearms stimulated the development of plate armour into its later stages.\n* At the end of the 1800's silk body armor was worn by those who could afford it. The assassination of Arch-Duke Ferdinand that precipitated WWI was wearing silk body armor but was shot in the neck over the armor. A similar vest worn by Alfonso XIII of Spain saved his life in 1901.\n* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds.\n* Club, Axe or Greek sword : 1kg ; used single handed ; 65 joules(48 ft lbs)\n* Club, Axe or Greek sword : 2kg ; used two-handed ; 130 joules(96 foot lbs)\n* Javelin :0.8 kg ; thrown, with run-up; 198 joules(146 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace only; 111 joules(83 ft lbs)\n* Javelin :0.8 kg ; thrown standing; 60 joules(49 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace with loop ; 160 joules(118 ft lbs)\n* Light spear or small sword/dagger :0.8 kg ; close combat ; 30 joules(24 ft lbs)\n* Sarissa :8(?)kg ; two-hand thrust,pace fwd ; 160 joules(118 ft lbs)\n* Spear-butt : various ; thrust down, coup-de-grace; 50 joules (40 ft lbs)\n* Energies of the order of 30-60 joules (24-49 ft lbs) could be given generally to typical Greek Hand weapons, and armour would need to resist this type of thrust, as well as slashing blows up to 60 joules(49 ft lbs)\n* Sling bullet :24g swung one handed ; 30-36 joules(22-27 ft lbs)\n* Light bow 20J at 50m, 15J at 100m, 9J at 200m (sufficient to penetrate flesh)\n* Heavy bow 30J at 50 metres, 26J at 100 metres, 20J at 200 metres\n* Ballistic Armor Level I protects against .22 cal Long Rifle and .38\n* Ballistic Armor Level IIA protects against 9mm Low Velocity and .40 cal\n* Ballistic Armor Level II protects against 9mm and .357 Magnum\n* Ballistic Armor Level IIIA protects against High Velocity 9mm and .44 Magnum\n* Ballistic Armor Level III protects against 7.62 Rifle\n* Ballistic Armor Level IV protects against .30 cal Armor Piercing Rifle\n* All heavy armor penetration values are in mm of steel or equivalent at 30 degrees.\n* The 5.56 AP round penetrates 12mm at 100m.\n* The 7.92 MG round penetrates 13mm at 100m.\n* The 7.62 AP round penetrates 15mm at 300m.\n* .50 cal penetrates 20mm Armor\n* 20mm penetrates 30mm Armor.  It took an average of twenty 20mm hits to shoot down a WWII bomber.\n* 30mm A-10 penetrates 69mm at 500m and 38mm at 1000m.  A 30mm Autocannon could bring down a WWII bomber in 1-3 hits.\n* 40mm Bofors penetrates: 0 yards-2.7in (68mm), 2,000 yards-1.2in (30mm), 4,000 yards-0.60in, 6000 yards-0.45in.\n* 50mm PaK 38 was one of the few early guns capable of effectively penetrating the 45 mm armor of the formidable T-34\n* The PaK 40 penetrates 100mm Armor and was effective against almost every Allied tank until the end of the war.\n* The Panther's 75 mm KwK 42 L/70 penetrates 120mm at 1000m\n* Very few Allied or Soviet weapons could penetrate the Panther's front armor.\n* Pershing's 90mm penetrates 110mm at 1000m\n* The Tiger's 8.8 cm KwK 36 L/56 penetrates 135mm at 1000m.\n* Whereas Panthers were the more serious threat to Allied tanks, Tigers had a bigger psychological effect on  opposing crews, causing a 'Tiger phobia'. Allied tankers would sometimes evade rather than confront a Tiger, even a tank that only looked like one, such as the Panzer IV with turret skirts applied. In the Normandy campaign, it could take four to five Shermans to knock out a single Tiger tank by maneuvering to its weaker flank or rear armor; the Soviet T-34s fared similarly against the German tanks, as had the German PzIII earlier against the Soviet heavy tanks. An accepted Allied tactic was to engage the Tiger as a group, one attracting the attention of the Tiger crew while the others attacked the sides or rear of the vehicle. Since the ammunition and fuel were stored in the sides, a side penetration often resulted in a kill. This was, however, a risky tactic, and often resulted in the loss of several Allied vehicles. It took a great deal of tactical skill to eliminate a Tiger.\n* IS-2's A-19 122mm penetrates 150mm at 1000m and can go through the front and rear armor and the engine block of the German Panther tank.\n* The 17 pounder mounted on the Sherman Firefly was able to penetrate 131mm at 1000 meters, more than sufficient to defeat the German Tiger I and Panther tank at standard combat ranges.\n* Pershing 90mm APCR penetrates 192mm at 1000m\n* The Tiger II/Elefant/PaK43's 8.8 cm KwK 43 penetrates 165mm at 1000m\n* The M4 Sherman was unable to penetrate the front of a Tiger II even at point blank and the M26 Pershing and IS-2 had to come within 1300 m and 200 m respectively.\n* The Tiger II's 88 mm armament could penetrate 165mm at 1000m and destroy all Allied armor at a range far outside the effective range of the enemy's armament. Also, notwithstanding its reliability problems, the Tiger II was remarkably agile for such a heavy vehicle. Contemporary German records indicate that it had a lower ground pressure and was as maneuverable as the much lighter Panzer IV.\n* A typical modern lined shaped charge can penetrate armor steel to a depth of 7 or more times the diameter of the charge's cone (cone diameters, CD), though greater depths of 10 CD and above are now feasible.\n* The shaped charge of the PanzerFaust could penetrate up to 200 mm of steel, enough to defeat any armoured fighting vehicle of the period including T-34's and IS-2.\n* RPG-16 and M72 LAW can penetrate 300mm\n* RPG-22 can penetrate 400mm\n* RPG-7 can penetrate 500mm\n* M1 Abrams cannot penetrate its own 610mm Sloped Armor\n* RPG-29 can penetrate 750mm and has penetrated the front armor of a Challenger 2.\n* BLU-109 Penetrator - Penetration of reinforced concrete: 1.8 m (6 ft)\n* BLU-116 Advanced Unitary Penetrator (AUP), BLU-118/B Thermobaric Warhead - Penetration of reinforced concrete: 3.4m\n(11 ft)\n* BLU-113 Super Penetrator - Penetration of reinforced concrete: more than 6m (20 ft)\n* The crippled Bismark endured 5 torpedoes and a relentless attack by the 14 inch guns of 2 Battleships and the 8 inch guns of 2 Heavy Cruisers even at point blank range for over half an hour. The upper decks were destroyed, but the ship was still under power and the hull was relatively sound. It was finally scuttled by the crew.\n\n* Penetration of materials vs 5.56mm: http://www.inetres.com/gp/military/infantry/rifle/556mm_ammo.html\n** The following stop a 5.56mm round fired at less than 50 meters:\n*** One thickness of well-packed sandbags.\n*** A 2 inch (51 mm) non-reinforced concrete wall.\n*** A 55 gallon drum filled with water or sand.\n*** A small ammunition can filled with sand.\n*** A cinder block filled with sand (block will probably shatter).\n*** A plate glass windowpane at a 45 degree angle (glass fragments may be thrown behind the glass).\n*** A brick veneer.\n*** A layer of books 18 to 24 inches (457 to 610 mm) thick.\n** The following do not stop a 5.56mm round fired at less than 50 meters:\n*** Interior walls made of thin wood paneling, sheetrock, or plaster\n*** Common office furniture, such as desks and chairs\n*** Wooden frame buildings and single cinder block walls offer little protection from 5.56mm rounds.\n*** A car body (round will penetrate but normally not exit).\n\n* 40mm High Explosive dual purpse round\n** Penetrate 2 inches (50 mm) of armorplate, 12 inches (300 mm) of pine logs, 16 inches (400 mm) of concrete blocks,\nor 20 inches (500 mm) of sandbags at ranges up to 1,312 feet (400 m).\n\n* Sandbags = 1/10th Steel\n* Concrete = 1/8th Steel\n* Pine Logs = 1/6th Steel\n\nhttp://www.panzerworld.net/armourpenetration"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Level\n* Damage\n* Armor (mm)\n* Energy (J)\n* Explosive Force (psi)\n* Mass (kg)\n\nThe following table is an attempt to unify Damage, Armor, Energy, Explosive Force, Strength, and Mass together. This is done with the following premises:\n1) Where possible use factual comparisons between Weapons and Armor that defeated those weapons.\n2) Once damage and armor are mapped, the energy created from each firearm can be derived by muzzle velocity and weapon calibre.\n3) Energy in Joules (J) is easily converted into explosive force measured in PSI\n4) Energy may also easily be converted into a strength rating by determining how much mass that energy would lift over a person's head (3m) in 1 second.\n5) Finally the mass rating from strength can be used as a general chart for mass (and by correlation Body).\n\nThe formula is Energy = Mass (kg) * ((3m ^ 2) / 1s * 10m / 1s / 1s.\nSimplified the formula is Energy = Mass (kg) * 100."),
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
                                Base.t_section,
                                Core.vx_new_string(":tag"),
                                Core.vx_new_string("level")
                              )
                            ),
                            Core.vx_new_string(":severity"),
                            Core.vx_new_int(2)
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":msgblocks"),
                    Core.f_new(
                      Core.t_msgblocklist,
                      Core.t_anylist.vx_new(
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        ),
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
                                        Base.t_section,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("level")
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
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Combatant Types"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Combatant Types"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Elite"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elite"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Elite units gain +2 to all combat, morale, or military rolls.")
                      )
                    ),
                    Core.vx_new_string(":Mob"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mob"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mob units take -1 to all combat, morale, or military rolls.\n* When a Mob unit takes its action, other Mob units within 2 spaces\nmust roll Will. If they fail, they immediately activate and attempt\nto move adjacent to the original Mob and perform the same action.")
                      )
                    ),
                    Core.vx_new_string(":Veteran"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Veteran"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Veteran units gain +1 to all combat, morale, or military rolls.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Melee and Close Combat"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Melee and Close Combat"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aerial"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aerial")
                      )
                    ),
                    Core.vx_new_string(":Crouching"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Crouching")
                      )
                    ),
                    Core.vx_new_string(":Duel"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Duel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Choose an Ability - Each player secretly choose an [Ability] for this turn.\n* Determine Initiative - Each player begins bidding a [Speed] he/she will use before the [Ability].\n* Take Turns - Each player takes their turn in the order of the final bidding.\n** Move - The unit must use or discard at least the bid amount of [Speed] before it can take an [Action]\n** Action - Reveal the chosen [Ability].  If the unit is in range of a target and has not used too much [Speed] to use the chosen [Ability], then it may use the ability now.\n** Move - The unit may use any remaining [Speed].")
                      )
                    ),
                    Core.vx_new_string("Finishing Move"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Finishing Move"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Finishing Moves are powerful attacks that are usually only done when the opponent cannot defend.\n* [Move]: No movement this turn.")
                      )
                    ),
                    Core.vx_new_string("Armor Facing"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armor Facing"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Armor is rarely uniform around a unit.\n* Determine the armor side you are targetting (i.e. Front, Rear, Side, Top, Under) by determining which of your opponents [Firing Arc]s your weapon lies in.\n* If facing still cannot be determined, then it is the defender's choice.\n* Infantry units may attack top or under armor if they are within 1 space of the target (assume grenades or other\nimprovised weapons).")
                      )
                    ),
                    Core.vx_new_string(":Explosive"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Explosive"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* 1 gram of TNT releases 1000 calories upon explosion or 4184J.  1 gram of sugar has abour 4x the energy.\n* 1g=4.184x10^3J, 1kg=4.184x10^6J, 1ton=4.184x10^9J, 1kt=4.184x10^12J, 1Mt=4.184x10^15J\n* Explosions Damage falls off by half (-1 Damage) for every 2m from the center.\n* Following a blast wave is a negative blast of 1/3 strength\n* Blasts are reflected and amplified by solid surfaces. A person between a blast and a building will suffer 2-3x the injury as those in open spaces.\n\nBlast Damage in Overpressure\nPo=0.34E/R^3\nwhere\nPo= overpressure in pascals (about 6895 Pascals per psi.)\nE=energy, in joules (0.1 Kg TNT = 461,200 joules)\nR^3= the cube of distance, in meters\nAnd, IIRC\n5 psi(35 Kpa): windows shattered, startled/stunned\n20 psi: (140 kPa)lung damage, eardrums likely popped\n35 psi (250 kPa): serious injury probable, death rare\n200 psi (1400 kPa): mutilation\n\n.15 psi: Glass breaks\n.25 psi: Hurricane winds, injuries from flying glass\n.4 psi: Limited minor structural damage (windows broken, cracks in plaster, broken roof tiles)\n.7 psi: Minor damage to house\n1 psi: Partial demolition of houses made uninhabitable\n2 psi: Partial collapse of walls and roofs of houses, Residential structures collapse, injuries common\n3 psi: Non-reinforced concrete or cinder wall shattered, steel frame buildings distored, 3000lb machinery unaffected, 10% eardrum\ndamage\n4 psi: Most buildings collapse except concrete, fatalities occur\n5 psi: Wooden utility poles snap, 50% eardrum damage\n6.3 psi: Lung haemorrhage damage\n7 psi: Houses completely destroyed, loaded trains overturned\n8 psi: Non-reinforced brick walls fail by shearing or flexure\n9 psi: Loaded train boxcars demolished\n10 psi: Buildings totally destroyed, 7000lb machines moved and badly damaged, 12000lb machines survive, Reinforced concrete\nbuildings severly damaged, fatal injuries common\n14.5 psi: 1% fatalities\n17.5 psi: 10% fatalities\n20.5 psi: 50% fatalities\n25.5 psi: 90% fatalities\n29.0 psi: 99% fatalities\n\n\n500lb Bomb\n1000lb Bomb\n4000lb (2t) Blockbuster Bomb 'Cookie' 3/4 weight is explosive\n8000lb (4t) Bomb\n12000lb (6t) Tallboy\n22000lb (11t) Grand Slam Earthquake Bomb\n1kt Fission Bomb\n10kt Fission Bomb\n1Mt Fusion Bomb\n10Mt Fusion Bomb\n\nBlast Radius:\n~50mm 2m\n~60mm 5m\n~70mm 10m\n~80mm 15m\n~90mm 20m\n105mm 25m\n155mm 50m\n203mm 80m\n\nECR The effective casualty radius is defined as the radius of a circle about the point of detonation in which it may be expected\nthat 50 percent of exposed troops will become casualties.\n\nThe 40mm grenade has an effective casualty radius of 5 meters.\n155mm (M107) 50m ECR\n5\"x54 (Mk64) 45m ECR\n120mm (M934) 60m ECR\n107mm (M329A2) 40m ECR\n105mm (M1) 35m ECR\n81mm (M935/M734) 40m ECR F/M252\n81mm (M374A3) 34m ECR F/M29\n60mm (M720/M888 ) 27.5 ECR")
                      )
                    ),
                    Core.vx_new_string("Anti-Missile Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Missile Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Anti-Missiles are designed to intercept other missiles and explode in front of the incoming missile thereby destroying them. They can be used for other purposes, but their relatively large area and low payload limits their use to soft targets. Anti-Missiles can be used to intercept any missiles including those pursuing other targets and other Anti-Missiles.\n* [Reaction]: Attack other Missile")
                      )
                    ),
                    Core.vx_new_string("Ballistic Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ballistic Missile")
                      )
                    ),
                    Core.vx_new_string("Cluster Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cluster Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Missile mounted with a cluster bomb warhead.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move taking at most 1 turn each move. The missile has [Action]: Make an attack against the 3 adjacent spaces toward the front of the missile, then remove the missile.")
                      )
                    ),
                    Core.vx_new_string("Cruise Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cruise Missile")
                      )
                    ),
                    Core.vx_new_string("Guided Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Guided Missile")
                      )
                    ),
                    Core.vx_new_string(":Rocket"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Rocket"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Rockets are a form of missile that is designed to carry the maximum payload. They are, therefore, relatively large and slow compared to other missile types. They are unguided.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move and may not turn. The missile has [Action]: Make an attack against the current space, then remove the missile.")
                      )
                    ),
                    Core.vx_new_string("Swarm Missile"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swarm Missile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Series of small, linked missiles that individually have low yield but can be fired in varying numbers to strike either a single target or a large area.")
                      )
                    ),
                    Core.vx_new_string(":Torpedo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Torpedo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Torpedoes are a form of missile (usually underwater) that is designed to carry the maximum destructive payload. They are, therefore, relatively large and slow compared to other missile types.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Ammunition"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Ammunition"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Acid Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Acid Ammo")
                      )
                    ),
                    Core.vx_new_string("Adhesive Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Adhesive Ammo")
                      )
                    ),
                    Core.vx_new_string("Anti-Laser Aerosol Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anti-Laser Aerosol Ammo")
                      )
                    ),
                    Core.vx_new_string("Area Effect Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Area Effect Ammo")
                      )
                    ),
                    Core.vx_new_string("Armor Piercing Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Armor Piercing Ammo")
                      )
                    ),
                    Core.vx_new_string("Birdshot Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Birdshot Ammo")
                      )
                    ),
                    Core.vx_new_string("Buckshot Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Buckshot Ammo")
                      )
                    ),
                    Core.vx_new_string("Chemical Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chemical Ammo")
                      )
                    ),
                    Core.vx_new_string("Firefighting Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firefighting Ammo")
                      )
                    ),
                    Core.vx_new_string("Flare Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flare Ammo")
                      )
                    ),
                    Core.vx_new_string("Flechette Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flechette Ammo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This is kind of a shot-gun that fires a swarm of darts instead of buckshot ('flechette' is French for 'little\narrow').  They look like nails.  In the shell, a group of flechettes are held together by a plastic frame called a\nsabot, which falls away when the load exits the muzzle.  Light flechettes are twenty to a shell, heavy are six to a\nshell.  Like shotgun shells, they are good for causing large amounts of damage to the intruder in one's apartment,\nbut failing to penetrate the wall so as to not annoy the neighbors.\n* Light flechettes are only good against soft body armor; rifle plates will stop them cold.  Additionally, light\nflechettes lack the stopping power of buckshot against unarmored targets.\n* Heavy flechettes have the mass of a 000 buckshot pellet and likely being made from very hard material (at least\nhardened steel, probably tungsten), these shells will exhibit rifle grade penetration.\n* Flechettes are fin stabilized steel projectiles similar in appearance to arrows. During the Korean War the Chinese army tactic of human wave attacks against US lines of defence prompted interest in flechette projectiles in single and multiple projectile systems for small arms and antipersonnel (APERS) use. Flechettes have a performance criteria very different from the conventional rifle bullet. Typical modern flechettes are small light weight steel projectiles, and the velocity lost to air resistance is generally 375 fps. per 100 Meters of flight. Unlike rifle bullets, flechettes are not spin stabilized, but use fins to achieve level flight. The flechette's long body looses rigidity on target impact and bends into a hook, often breaking off the fin portion creating an additional wound. Flechette munitions include projectiles for use in the M16 rifle, CAWS (close assault weapons system), and 12 gage shotgun, as well as the 105mm M101A1/M102 howitzer, 2.75 in. FFAR (folding fin aircraft rocket), and the 70mm Hydra-70 FFAR.")
                      )
                    ),
                    Core.vx_new_string("Fragmentation Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fragmentation Ammo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Approximately 30% of the energy released by the explosive detonation is used to fragment the case and impart kinetic energy to the fragments. The balance of available energy is used to create a shock front and blast effects. The fragments are propelled at high velocity, and after a short distance they overtake and pass through the shock wave. The rate at which the velocity of the shock front accompanying the blast decreases is generally much greater than the decrease in velocity of fragments, which occurs due to air friction. Therefore, the advance of the shock front lags behind that of the fragments. The radius of effective fragment damage, although target dependent, thus exceeds consid-erably the radius of effective blast damage in an air burst.")
                      )
                    ),
                    Core.vx_new_string("Heat Seeking Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Heat Seeking Ammo")
                      )
                    ),
                    Core.vx_new_string("Homing Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Homing Ammo")
                      )
                    ),
                    Core.vx_new_string("Incendiary Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Incendiary Ammo")
                      )
                    ),
                    Core.vx_new_string("Laser Guided Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Laser Guided Ammo")
                      )
                    ),
                    Core.vx_new_string("Minelayer Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Minelayer Ammo")
                      )
                    ),
                    Core.vx_new_string("Needle Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Needle Ammo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Needlers are unique weapons that fire small needle-like projectiles at high velocities.\n* Advantages: Because they are so light, needlers have much lower recoil than ordinary rounds.  They also benefit\nfrom high rates of fire and large ammo capacities.\n* Disadvantages: Their principle weakness is that damage falls off sharply against armor.\n* One needler has a solid block of plastic as ammo and a cylinder in the barrel that rotates at high velocities.  The\ntwisting motion of the cylinder repeatedly shaves off toothpick-sized needles, tightly coils them and ejects them from\nthe barrel at high velocity.  When the coiled needle strikes a target itunwinds, drilling into the target.  Because\nthe barrel does not stop spinning, the needler can fire a continuous hailstorm of needles until it is out of ammo.\n* Rules: [Shattershot], [Continuous Stream]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Needlegun")
                      )
                    ),
                    Core.vx_new_string("Non-Lethal Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Non-Lethal Ammo")
                      )
                    ),
                    Core.vx_new_string("Paint Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paint Ammo")
                      )
                    ),
                    Core.vx_new_string("Radar Guided Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Radar Guided Ammo")
                      )
                    ),
                    Core.vx_new_string("Recoiless Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Recoiless Ammo"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Recoilless weapons fire rocket-propelled, recoilless rounds.  These rounds can be large calibur while maintaining\na high fire rate and no recoil making them especially well suited for underwater or space.\n* Recoilless weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bazooka, Gyrojet, Rocket Round")
                      )
                    ),
                    Core.vx_new_string("Scramble Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scramble Ammo"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Haywire Ammo")
                      )
                    ),
                    Core.vx_new_string("Smoke Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Smoke Ammo")
                      )
                    ),
                    Core.vx_new_string("Taser Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Taser Ammo")
                      )
                    ),
                    Core.vx_new_string("Tracer Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tracer Ammo")
                      )
                    ),
                    Core.vx_new_string("Underwater Ammo"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Underwater Ammo")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Lasers"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lasers"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Examples of pulsed systems with high peak power:\n* 700 TW (700x10^12 W) - The National Ignition Facility is working on a system that, when complete, will contain a 192-beam, 1.8-megajoule laser system adjoining a 10-meter-diameter target chamber. The system is expected to be completed in April of 2009.\n* 1.3 PW (1.3x10^15 W) - world's most powerful laser as of 1998, located at the Lawrence Livermore Laboratory"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Lasers are the ultimate sniper's weapon.  They are silent, extremely hard to spot, and have pinpoint accuracy.  They\nare, however, vulnerable to impurities in the the medium they fire through.  These impurities are heated by the beam\nand can dilute the beam as well as make the beam visible.\n\n* Accuracy: +1\n\n* 5 mW - CD-ROM\n* 10 mW - DVD player\n* 100 mW - CD-RW\n* 250 mW - DVD-R\n* 1 W - green laser in current Holographic Versatile Disc prototype development\n* 1-20 W - output of the majority of commercially available solid-state lasers used for micro machining\n* 30-100 W - typical sealed CO2 surgical lasers[26]\n* 100-3000 W (peak output 1.5 kW) - typical sealed CO2 lasers used in industrial laser cutting\n\nEnergy Storage\nLet's assume non-rechargeable systems at an energy density of 2.5 kilojoules per cubic centimeter, which is quite plausible. You might consider a rechargeable battery pack as an option, with half the capacity of the non-rechargeables.\nLithium-polymer cells are rechargeable, and have an energy density of 1.08 kJ/cm3.\nAs for nonrechargable batteries, check out the various molten salt batteries. They're stored as a solid, so they can be stored 'charged' virtually forever. As soon as you bring them up to operating temperature (400 C or more), and as long as you keep them there, you have an incredibly high\noutput battery. The military has used them like this for a very long time, and most current research is focused on making them rechargeable.\nApparently the energy density varies widely, but it's clear that they can have very high energy density.\n\nWhether you use lasers or particle beams, you'll need a kilojoule of output energy to reliably incapacitate a human target. In the case of a laser weapon, that energy would be subdivided into ~1 joule pulses at ~5 microsecond intervals, to achieve penetration in the face of a laser's natural tendency to deposit energy at the target's surface. Particle beams don't have that problem; boost the electrons up to a few hundred MeV, and you can dump the whole kilojoule's worth at once.\nThe plasma clears away easily in that time frame; debris is the real issue, and the driving force between the 5 microsecond pulse rate. That allows roughly 90% of the debris to clear the beam path, assuming a 1mm beam and instantaneous 1J pulses. 1 joule every 5 microseconds is optimal against soft tissue, other materials will want different pulse trains.\nI'm assuming a weapon designed to penetrate ~30cm in soft body tissue. This gives about 15cm in bone or plastic, 5cm in brick or concrete, or 2.5cm in steel or most ceramics. Synthetics won't be very good at stopping energy weapons, even tough ones like kevlar, but you might be able to find a ceramic that could stop a laser beam with a centimeter's thickness or so. Particle beams are tougher to stop; it mostly comes down to sticking mass in the way without regard to material properties.\nLasers would likely have to have pulse energy and frequency tuned to the specific material being targeted. It might be possible to do this automatically, based on crude spectoanalysis of the material vaporized in each pulse, but if not expect penetration to be roughly halved if a laser weapon is fired at a target it has not been optimized for.\nTaking into account the inefficiency of the system, the input energy will likely be somewhere between two and five kilojoules per shot. So you could get fifty to a hundred shots from a pistol-sized non rechargeable energy source, or half that with a rechargeable battery. Automatic fire at anywhere up to 20 Hz (1200 rpm) shouldn't be a problem in the short term, though might cause cooling problems if you keep it up.\nYou also need to focus the energy on the target, with a spot size of a millimeter or less. With a laser, that gets kind of tricky. A 5-centimeter mirror, about the largest you can really imagine on a pistol, gives an effective range of perhaps sixty meters, beyond which the weapon starts losing penetration quite rapidly.\nyou still need to get down to a millimeter or so to flash-boil water in a layer ~one optical depth in thickness. Once you do that, the steam will expand and spread the damage around, but if you don't hit the threshold for turning water into steam all you do is warm up the target.\nWith penetration, range, and repeatability dealt with, it is time to turn to accuracy. Lack of recoil, automatic fire capability, and line-of-sight accuracy are all major assets here, but there is one more improvement to be made. Both lasers and particle beams can be steered at least a degree or two off-axis, in the case of the laser via the adaptive-optic mirror, for particle beams with a transverse magnetic field at the muzzle.\nIf we can throw in a chip-mounted laser or acoustic gyro set, we can have a gyrostabilized handgun. The weapon shoots not at where the gun is pointed at the instant of firing, but at a weighted average of where it has been pointing over the past quarter of a second or so. Smoothes out a lot of the jitter inherent in human marksmanship.\nAnother clever one would be to use the laser's optics to project a laser sight. Pull the trigger, and the harmless red dot suddenly explodes. BANG! Using the laser optics as a scope would be more useful for long range or high accuracy shots.\nIn combat, I would expect such a weapon to be used in automatic fire mode at ~10 Hz. With fifty to a hundred pulses to play with, you won't run out of ammunition too soon as is the case with current machine pistols. And recoilless, stabilized automatic fire should allow a moderately capable marksman to walk a burst on target in one or two reaction cycles (say, half a second) in most circumstances.\nPractical combat range, if you don't mind missing a good part of the time, would be on the order of 50 meters\nCooling:\nAnd you'll need some serious cooling. I'd go with liquid-metal microchannel heat pipes etched into all the hot surfaces, and leading to cooling fins around the 'barrel'. If you use the chemical-propellant option, regenerative cooling could also work.\nWhat would it sound like?\nThe actual mechanism of producing the laser beam could sound like anything, from complete silence, to the click of an electrical contact, to a sharp, electric snap, to a gunshot-like thunderclap.\nThe beam, when incident upon its target, will make a nice bang.\nThe pistol won't make a 'zap' sound, will it?\nIf the beam is repeated rapidly it might, however, make a buzz. It might end up sounding quite electrical at a few hundred Hertz.\nRemember that the temporary cavity caused by the explosions only lasts a few milliseconds, so the beam has to have completed its work of piercing the target at this time. The individual explosions will be too closely spaced (microseconds apart) to be individually audible. Since shocks are always supersonic to the air in their path, and subsonic to the moving air left behind them, multiple subsequent shocks from the same source tend to merge into one stronger shock. Thus, each pulse probably makes one bang. The bang comes from a series of explosions whose total energy is about the same as that of the gunpowder detonating in a firing rifle, so it will probably be about as loud.\nIf the beam is in the visible part of the spectrum, you get a noticeable path through clean air at indoor lighting intensities. I am not sure if it will be visible out of doors under full sunlight, but you could see it at night. The beam will be widest at the aperture of the gun, probably a few centimeters across to keep the optics from being damaged by the intense light. The beam will converge to a spot a millimeter or so across at the target. In unclean air, the beam will be a lot more visible. This Rayleigh scattering is linear, so the total integrated brightness across the cross section of the beam should be constant, if we neglect the gradual attenuation of the beam due to the light being scattered out of it. Higher frequency light scatters much more than lower frequency light, so a blue beam would be much more visible than a red one.\nWhen a visible beam is incident on the target, it creates a very bright flash of the same color as the beam. This may temporarily dazzle those looking at it, and the beam itself may be overlooked because of the bright flash obscuring it.\nIf the weapon lases in the UV, the intense pulse may cause multi-photon ionization of atoms in the air, causing a fluorescent glow along the path of the beam (possibly red, green, or violet, I'm not quite sure what sparsely ionized air at atmospheric pressure looks like). Since this process is non-linear, it will be dimmest near the aperture where the beam is widest, and most intense nearer the target. Weapon designers will probably try to minimize this effect, since it leads to attenuation of the beam and subsequent loss of effectiveness.\nNear IR beams are likely to only be visible if there are relatively large pieces of dust, lint, or pollen floating around, which will glow incandescent as they burn under the irradiation of your beam. I doubt beams in the 'thermal' IR range would be used, even though the air is fairly transparent to these wavelengths, because with short, intense pulses you tend to get cascade ionization with these lower frequencies, and this will completely absorb the beam.\nBeams at non-visible frequencies will also make a flash and a bang where incident on the target from the expanding plasma of their explosion, but nowhere near as bright as that of a visible beam.\nIn vacuum, of course, the beam itself is always invisible, but you can still see the flashes at the target.\nWill the beam be invisible or bright enough to be blinding?\nIt is quite likely to be both. The beam itself may be invisible or minimally visible, but if even a tiny fraction of the beam is specularly scattered into your eye, near IR and visible and some near UV will be focused to a diffraction limited spot on your retina, causing burns and permanent scarring. This can lead to degradation of vision or total blindness. Interestingly, the brain compensates for blind spots on the retina, so that you might have lost up to 60% of your vision from multiple exposures to beams and you still think you can see just fine.\nAnyone likely to be using a laser will probably wear protective goggles or contacts. With today's technology, you would probably make them out of an optical band gap material that excludes a very narrow window of light centered on the laser's frequency. This means that the people who fired the lasers would not be able to see the beams or flashes of their own weapons (assuming they used visible light lasers). They would still see the flashes from the plasma explosions, though, plus incandescence of suspended atmospheric particles and fluorescence from multi-photon absorption.\nThe method of subsequent explosions on the back of an expanding cavity driving the cavity through the target will leave a wound much like that of a gunshot, except without fun stuff like the bullet fragmenting or breaking up. A variant where nearly parallel beams a few cm apart literally rip the tissue between them could leave a wound looking more like an ugly gash - add on a few more of these beams on the same plane and you could literally cut someone in half with one millisecond pulse, using only about as much energy as goes into accelerating the bullet of a modern day battle rifle.\nWill there be a large splash of blood and gore on the wall behind the unlucky pirate?\nQuite likely, Note that since you do not have the momentum associated with a projectile, it will be more spread out than you would get from a gunshot wound, and you would get blood and gore coming out the front, too.\nI assume that since the beam is one millimeter in diameter but the hole in the pirate is four centimeters, little or no wound cauterization will occur.\nNope, the wound would be ragged and messy. It is created by mechanical, not thermal effects.\nThe laser weapon will probably end up looking something like a camcorder, with a big lens that the beam goes through, and a fairly compact design. Since mirrors and internal optics can bend the beam inside the weapon, there is no need for the long barrels you see on modern firearms. Cooling, if necessary, would probably not involve fins - I would expect something more like the radiator on modern automobiles. Remember, shedding your heat through contact with the air is much more efficient than radiation.\nkeeping in mind that using contact with the air doesn't work if there is no air, i.e., in vacuum. C. James Huff notes that there is one kind of fin for radiant cooling and another for air cooling. He mentions that the fins on a CPU hot sink is a good example of the latter. For a vacuum rated laser he recommends a compressed or liquified gas cartridge since a radiant cooler would be inconveniently huge.\nAlso, lasers are getting surprisingly efficient. When each beam pulse contains no more energy than imparted to a rifle bullet, lasers might need cooling no more than a modern rifle.\nthe laser's battery will be carrying plenty of juice. Anything carrying that much energy will be at least slightly unstable. In other words, it wouldn't take much to make a charged battery into a home-made bomb (which might come in handy if one suddenly needed a bomb.). You might have read news reports about laptop computers who's batteries suddenly burst into flame.\nAnd don't even think about sticking a fork into the open contacts.\nThis has been observed somewhat tongue-in-cheek by John Routledge as Routledge's Law: 'Any interesting battery material for a laser gun would be more usefully deployed as an explosive warhead.' He also notes the problem with ammunition cook off. If you are holding a fully-charged laser pistol, and some lucky enemy sniper manages to score a direct hit on the pistol's battery, it is going to be just to bad if the resulting explosion vaporizes you and all your friends within a large radius.\nAssuming a worst case of 5 kilojoules per shot and a rechargeable magazine containing 50 shots, the magazine is packing 250 kilojoules. This is the equivalent of 250,000 * 2.7778e-4 = 70 watt-hours or 250,000 / 4,500 = 55 grams of TNT (For comparison purposes, a standard 8 inch stick of dynamite is about 208 grams and hand grenades used by the US Army have explosive charges of 56 to 226 grams of TNT). At his specified power density of 2.5 kilojoules per cubic centimeter, this would imply a magazine volume of 100 cm3. this is approximately the same volume as forty-two .45 caliber rounds.\n\nFan Beam\nIf a man is about 45 centimeters wide (18 inches), at a range of 5 meters, and the bolts were to be spaced 3 centimeters apart, it would take 15 bolts fired at 0.3 degree increments to the left and right. Your target would fall... in two places.\nA less blood-thirsty use would be in the wilderness, chopping down trees ('Lumberjack' mode).\n\nMultiple Modes\nStun would be a laser in Pulsed Energy Projectile mode.  Heat would be a laser in unpulsed heat ray mode at relatively low energy levels. Disrupt would be a laser in pulsed blaster mode or in unpulsed heat ray mode at high energy levels. Overload makes the battery explode. Dematerialize is the only one that cannot be done, but it is rather silly in the first place.\n('Dematerialize' is a fancy way of saying 'disintegrator ray'. A weapon that can vaporize a human body without setting the walls and floor on fire or even raising the temperature of the room? Give me a break!)\nRemember that a laser in pulse mode could have its effect optimized to a given material by a specific setting for pulse frequency. So one could have a 'metal cutting' setting for use as a tool or to open a locked door, and a 'kill human' setting for war-to-the-knife combat. All with the same pulse laser, just with a different frequency.\nSuch a weapon would have a selector switch for each mode. And it might have a 'customizable' mode. This would allow an expert to manually tweak the settings: continuous or pulse, spectrum frequency, pulse timing, power level, etc.")
              )
            ),
            Core.vx_new_string("Less Than Lethal"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Less Than Lethal"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("It was recently revealed that the US military was researching a rather alarming line of less-lethal\nweapons, the Pulsed Energy Projectile (PEP) program.  (As a side note, understand that there is no such\nthing as a 'non-lethal' weapon.  This is because any weapon or gas that can reliably incapacitate or render\nunconscious a 300 pound world wrestling champion will be strong enough to instantly kill a small child or\nelderly person.)  PEP weapons fire a laser pulse that is very intense but only a fraction of a second in\nduration.  The pulse vaporizes a tiny portion of the hapless victim's clothing or skin, creating a plasma\nburst intense enough to knock the victim to the ground.  This was intended to be used for crowd control.\nA pulse strong enough to knock one down is also strong enough to make one's eyeballs explode if it hit your\nface.  However, during test performed on animals, the researchers noticed something unexpected.  The pulses\nwere creating pain and temporary paralysis in the test animals.  As it turns out, certain pulses would\ncreate a plasma burst emitting an electromagnetic signal of proper frequency to artificially stimulate the\nnerve endings in the animal's skin.  The US military is researching this effect, trying to find the\nfrequency that will cause the maximum pain sensation without actually causing any physical harm to the\ntarget.  There is also the possibility that other frequencies could cause taser-like paralysis effects.\nThe effect can be made lethal.  The original name for the project was Pulsed Impulsive Kill Laser (PIKL)\nbut was quickly changed.  Currently PEP weapons are not man-portable, they are vehicle mounted weapons.\nThey have a range of about two kilometers.  We might yet see Space-1999 style hand lasers with a \"stun\"\nsetting."),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Pain Ray"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pain Ray"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* For riot control situations, the US Army is working on the Active Denial System (ADS).  It emits microwaves\nthat only penetrate a short way into the skin, not deep enough to do permanent damage but more than deep enough\nto roast all the target's pain nerve endings.  As with all microwaves, the range of this beam of concentrated\nagony is drastically reduced by rain or heavy humidity.")
                      )
                    ),
                    Core.vx_new_string("Vomit Ray"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vomit Ray"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The US Navy is working on its Electromagnetic Personnel Interdiction Control\nproject, AKA the Vomit Ray. The US Department of Homeland Security is working\non a pistol sized version, which is a very unsettling thought.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Nuclear Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nuclear Weapons")
              )
            ),
            Core.vx_new_string("Particle Beams"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Particle Beams"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* If you get a particle beam intense enough to burn someone, it will also deliver\na lethal dose of radiation from a hit anywhere on the body.\n* Radiation will scatter from the beam 'impact' site, irradiating things around it.\nIn an atmosphere, radiation will scatter off air molecules to irradiate things\nnear the beam.  Some of it will backscatter, irradiating whatever fires the gun.\nForget about a sci-fi hero using a particle beam 'blaster' - after blasting a hoard\nof bug eyed space aliens, he'd be sick or dying from radiation poisoning.  In real\nlife, particle beam weapons were considered for their ability to use radiation to\ndisable things (mostly ICBMs) without necessarily blowing holes in them."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Particle beams fire a stream of relativistic atoms or sub-atomic particles.  These are beams of ionizing\nradiation.")
              )
            ),
            Core.vx_new_string(":Plasmacasters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Plasmacasters"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* A weapon that fires a shell that releases a burst of plasma when it strikes a target.  This shell glow with barely\ncontained energy as it flies to its target."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Blaster, Spinfusor")
              )
            ),
            Core.vx_new_string(":Railgun"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Railgun"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* On January 31, 2008, the US Navy tested a 10MJ railgun with a muzzle velocity of 2500m/s.  It is expected to reach\n5800m/s at 10 shots/minute (enough to hit a 5m target 370km/200miles away)."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* This type of weapon includes all hypervelocity rounds propelled by massive magnetic fields.\n* Their great speed gives them excellent penetration and kinetic damage.  Because of this great speed, they cannot\ncarry any useful payload because the payload would be destroyed when the shell was launched.  Therefore, railguns are\nall kinetic weapons only.\n* Coilguns (Gauss) and Railguns are technically different, but their result is the same."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Coilgun, Gauss Gun, Kinetic Kill Weapons, Linear Cannon, Linear Rifle, Mass Driver")
              )
            ),
            Core.vx_new_string("Sonic Weapon"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Sonic Weapon")
              )
            ),
            Core.vx_new_string("Disruptor Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Disruptor Weapons"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Disruptors temporarily weaken the molecular bonds in the target.  Damage is done via violent system shock, and\nthe weapon may distintegrate the target entirely if enough damage is done.\n* Disruptors have decreasing effectiveness with the density and hardness of the target.  Soft materials like flesh are\nthe most practical target.  Damage drops off sharply against metals and rocks making disintegration of such materials\nextremely difficult."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Disintegrator, Phaser")
              )
            ),
            Core.vx_new_string("Energy Melee Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Energy Melee Weapons"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The lance is essentially a giant plasma cutting torch using compressed-gas ignited from direct current from the\nexo-armor's fusion reactor.\n* The gas supply limits the usefulness of the weapon and many may need to be carried.")
              )
            ),
            Core.vx_new_string("Weapon Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Weapon Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Firing Arc"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firing Arc"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Larger weapons are often cumbersome to use or aim and may only attack in a particular arc.  The\nfollowing abbreviations are used:\n* F - Front. Can only attach in any front arc.\n* B - Back. Can only attack in any rear arc.\n* FF - Fixed Forward.  Can only attack the forward arc.\n* FB - Fixed Backward.  Can only attack the rear arc.\n* FL - Fixed Left.  Can only attack the left arc.\n* FR - Fixed Right.  Can only attack the right arc.\n* Turrent - Turret mount.  Can attack in any direction but must use [Turret] rules to fire anywhere\nbut forward.\n* Pintle - Pintle mount.  Can attack in any direction without limit, but if the pintle mount is used,\na crew member is exposed and may be targetted separately from the vehicle at -1.")
                      )
                    ),
                    Core.vx_new_string(":Reload"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Reload"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: An item with Reload may not be used until all Reload tokens are removed.\n* [Action]: An item with Reload adds the number of Reload tokens each time the item is used.\n* Gain a White [Reload] Token for each Reload value each time the weapon is fired.\n1. Panther G 13 sec\n2. PZ IV F1 9 sec\n3. PZ IV F2 10 sec\n4. Tiger 1E 15 sec\n5. IS-2 20 sec - This is longer due to the IS-2 having a 122mm cannon and the shell has to be loaded in two parts. Although the first shot to a Panther, Tiger or a PZ IV is usally fatal.\n6. KV-1S 12 sec\n7. T34-76 13 sec")
                      )
                    ),
                    Core.vx_new_string("Shoot From The Hip"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shoot From The Hip"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Any unit shooting from the hip takes -1 Attack.")
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
   * @function chapter_skills
   * @return {chapter}
   * (func chapter_skills)
   */
  public static interface Func_chapter_skills extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_skills();
  }

  public static class Class_chapter_skills extends Core.Class_base implements Func_chapter_skills {

    @Override
    public Func_chapter_skills vx_new(Object... vals) {
      Class_chapter_skills output = new Class_chapter_skills();
      return output;
    }

    @Override
    public Func_chapter_skills vx_copy(Object... vals) {
      Class_chapter_skills output = new Class_chapter_skills();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/combat", // pkgname
        "chapter_skills", // name
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
    public Func_chapter_skills vx_empty() {return e_chapter_skills;}
    @Override
    public Func_chapter_skills vx_type() {return t_chapter_skills;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Combat.f_chapter_skills();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_skills() {
      return Combat.f_chapter_skills();
    }

  }

  public static final Func_chapter_skills e_chapter_skills = new Combat.Class_chapter_skills();
  public static final Func_chapter_skills t_chapter_skills = new Combat.Class_chapter_skills();

  public static Base.Type_chapter f_chapter_skills() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Skills"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Combat Skills"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Combat Skills"),
                Core.vx_new_string(":skillmap"),
                Core.f_new(
                  Base.t_skillmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Defend"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Defend"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Armorer, Defender, Shield Bearer, Shield Warden, Warder"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Armorsmithing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armorsmithing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to repair, improve, or even create armor.")
                              )
                            ),
                            Core.vx_new_string(":Counterattack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Counterattack")
                              )
                            ),
                            Core.vx_new_string("High Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-1 Speed\n+4 Defense vs. [High Attack]\n+1 Defense vs. other attacks")
                              )
                            ),
                            Core.vx_new_string("Low Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Low Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-1 Speed\n+4 Defense vs. [Low Attack]\n+1 Defense vs. other attacks")
                              )
                            ),
                            Core.vx_new_string("Powered Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Powered Armor")
                              )
                            ),
                            Core.vx_new_string("Shield Bash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Bash")
                              )
                            ),
                            Core.vx_new_string("Shield Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Defend] [Damage]: Add Shield [Armor] to your [Armor].")
                              )
                            ),
                            Core.vx_new_string("Shield Charge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Charge")
                              )
                            ),
                            Core.vx_new_string("Shield Guard"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Guard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction] [Damage]: Before adjacent unit takes damage, discard a [Club] to add your Shield [Armor].")
                              )
                            ),
                            Core.vx_new_string("Shield Sacrifice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Sacrifice"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Club] [Defend] [Damage]: The shield becomes the target of any [Overwhelm] damage.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Medium Armor"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Medium Armor")
                              )
                            ),
                            Core.vx_new_string("Heavy Armor"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heavy Armor")
                              )
                            ),
                            Core.vx_new_string(":Shields"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shields")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Close Combat"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Close Combat"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The usefulness of kicks in self-defense and actual combat has been debated. Kicks are powerful but risk balance, expose the groin, and risk take downs.\n* Joker, there is nothing wrong with you that I can't fix.  With my hands. - Batman, The Dark Knight Returns\n* There are seven working defenses from this position.  Three of them disarm with minimal contact, three of them kill.  The other....hurts. - Batman, The Dark Knight Returns\n* Beat losers, get paid. - Sett, Runeterra"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Targeting]: Close combat may only be used to attack the space directly ahead or the space you are on.\n* The baseline for kicking abilities is that they are -1 Speed and +1 Damage\nwith a minor special ability.\nNAME				SPD		DMG		MV		DEF\nSHORT KICK			+  1		+  0		+  0		S,C,A\nFORWARD KICK			+  0		+  2		-- 1		S,C,A\n----------------------------------------------------------------------------------------------------------------------------------\n\n\nBACK ROUNDHOUSE			-- 2		+  2		-- 1		None				K2			*  Ignores all Blocks except for San He and Evade Blow.\n*CARTWHEEL KICK			-- 1		-- 1		+  0		S,C		(2 W)		K4, A3			*  DMG vs. all adjacent hexes; opponents who take DMG are Knocked Back one hex; Straight Line attack; the fighter may use full MV, dealing DMG each time he moves next to an opponent.\nCRESCENT KICK			-- 1		+  4		-- 2		S, miss C				K3		*  KDA\nDESCENDING WHEEL KICK		-- 2		+3 (x2)		+  0 		(Special)	(1 W)		K4, A3, Jump, Ft.Swp	*  First hit = Aerial, Block- S, miss C; Second hit = Crouching, KD, Block- C, miss A.\nFOOT SWEEP			-- 2		+  3		-- 2		C, miss A				K2, Crouch	*  KD; Crouching Maneuver.\nFORWARD CHEST KICK		+  0		+  2		-- 1		S,C,A				K3			*  KD.\nForward Flip Kick		+  1		+  5		Two		S,A		(1 W)		K3, A3, Handstand Kick	*  KD, KDA (unless blocking), (dodge move?)\n*FORWARD SLIDE KICK		+  0		+  2		+  0		C, miss A				K2, A2		*  KD\nFRONT SNAP KICK			+  2		+  2		None		S,C,A				K2			**\nHAMMER KICK			-- 2		+ 3, + 4	-- 2		C,miss A	(1 W)		K3,(x2)K,Ft.Swp		*  KD; Hits Downed opponents.\n*HEEL STAMP			+  2		-- 4		+  1		S,C, miss A			K1, A1			*  Opponent is Knocked Back (Fighter's Str. + Athletics) - Opponent's Str.; Fighter is KnockedBack 1.\nJUMPING SOBAT(TO)		-- 1		+  4		Two		S,C,A				K2, A1, Jump		*  Aerial. (MY: Aviods Sweeps [fist,foot,spin foot], may only be blocked C or w/ Kick Def) This is charlie's hop toward low kick.\nKNEE DROP			-- 1		+  3		-- 1		(miss S,C,A)			K2, A1			*  Attacks Downed opponents only.\nLONG SWEEP KICK			-- 2		+  3		None		C, miss A			K2, Crouch, Foot Sweep	*  KD; Crouching; this maneuver may be used to strike an opponent who is 1 Hex away.\nPUSH KICK (STOMACH KICK)	+  0		+  1		+  0		S,C,A				K2			*  Knockback.\nRISING BIRD KICK		-- 1		+  0(x3)	One		S,C		(1 W)		K4,A4,Jump,Dbl-Hit Kick	*  KDA; Aerial Maneuver.\nShin Strikes			(+ 0)		(+ 1)		(+ 0)		(Normal)			K3			*  used in conjunction with any basic Kick; the fighter must be in an adjacent Hex to use this maneuver.\nSPINNING FOOT SWEEP		-- 2		+  3(x2)	None		C, miss A	(1 W)		K2, A1, Foot Sweep	*  DMG is dealt to all adjacent hexes, target in front of fighter is struck twice; KD; Crouching.\nSPLITS KICK			-- 1		+  4		One		S, miss C			K2			*  KDA\nSTEPPING FRONT KICK		+  0		+  1(x2)	+  1		S,C		(1 W)  		K4, Double-Hit Kick	*  Fighter must MV into opponent's hex; 1st hit causes Knockback.\nStudder Step Kick		+  1		+  2		One		C(miss A)			K3, A1			*  Must be blocked low.\nTHRUSTING FORWARD KICK		+  1		+  2		+  1		S, C		(1 W)		K2, A1			*  Aerial Maneuver; KDA.\n\n\nPunch\n\nName             Speed      Damage     Move      Defense\n\nJab                  +2          -1         +0       S,C,A\n\nStrong Punch        +0          +1         +0       S,C,A\n\nFierce Punch        -1          +3         -1       S,C,A\n\n----------------------------------------------------------------\n\nBoshi-Ken(Thumb Drive)-1          +2          +0      S,C,A\nP2,A2\nxIf damage is scored opponent suffers -1 move next round.\n\nBuffalo Punch         -2           +5          One     S,A\nP2\n\nBushin Air Elbow    +2           -1           +2     S,A\nP3,A1,Elbow Strikes,Jump\nxAerial Maneuver\n\nCaber Punch         -2           +3           -1     S,C,A\nP2,Str4\nxKD\n\n\nCobra Hand Strike   +3           +1           +1     S,C,A\n(1W)   P3\n\nDash Punch          +0           +4           +2     S,C\n(1W)   P4,A1\n\nDash Uppercut       +0           +4          +2     S,miss C\n(1W)   P4,A1,Dash Punch\nxKDA\n\nDouble Hit Punch    -1           +0(x2)       +0     S,C,A\nP2\n\nEar Pop           -1           +0           -1     S,C,A\nP2\nxIgnores Sta:fighter -1 Honor\n\nElbow Barrage       +0           +0(x3)     One      S,C\n(1W)   P4,Elbow Smash,Elbow Strikes\nxMust be in opponent's hex\n\nElbow Drop      +0           +2           +0     miss S,C,A\nP2,A1\nxMust be used on Downed opponent; If opponent is interrupted he\nloses action and is still considered downed at the end of round.\n\nElbow Smash      +2           +2          One     S,C,A\nP1\n\nElbow Strikes    (+0)        (+1)         (+0)    (normal)\nP3\nxUsed in conjunction with any basic punch, must be in opponent's\nhex.\n\nFist Sweep        -1           +3           -2     C,miss A\nP3\nxCrouching Maneuver;KD\n\nFlaming Dragon Punch-1          +6(x3)       -2     S,C\n(1C,1W) P5,A1,F2,Dragon Punch\nxKD;Knockback 1(all);->Aerial Maneuver\n\nHand Of The Crane  +1          +0           +0    (Normal)\nP4\nxMay be used in conjunction with any basic Punch while standing.\n\nHand Of The Eagle Claw+1       +0           +1    (Normal)\nP4,A3,Jump\nxMay be in conjunction with any basic Punch while Aerial.\n\nHand Of The Striking Mantis+0     +0        +0    (Normal)\nP4,A2,Dex4\nxMay be used in conjunction with any basic Punch while standing:\nfighter may strike opponent one hex away.\n\n\nHook                   +0        +3       -2        S,C,A\nP1\n\nIron Palm(Tieh Sha Chang) +0       +4        -1       None\n(1C) P4,F4\nxIgnores Blocks;KDA\n\nKidney Punch           +0        +2       +0        S,C,A\nP2\nxFighter must be behind opponent or in opponent's hex to execute\nthis maneuver; following round opponent is -1 SPD.\n\nLunge Punch       +0        +1       +1        C\nP3,A1\n\nNeck Shatterer         -1        +4       -2        S,miss A\nP2,Elbow Strikes\n\nPalm Heel Punch       -2        +3       +0        S,C,A\nP2\nxWhen DMG is dealt treat total as if it were one higher for\npurposes of calculating dizzy.\n\nPower Uppercut       -1        +3       One       S,C\nP1\nxKDA\n\nRazor Fist Punch      +1        +4       +0        S,C\n(1C,1W) P5\nxKnockback1;DMG is Aggrivated\n\nRekka Ken           (+3)      (+0)     (+0)      (Normal)\n(1W per turn)P4,A2\nxUsed with any basic punch; can be used for up to 3 turns; if\nused full 3 turns next round must be spent taunting, or lose 3\nGlory; Combo to dizzy.\n\nReverse Fist Punch    +0(+2)   +2        One      S,C,A\nP1\nx+2 SPD if punch follows a set up punch.\n\nRushing Strong        +0        +1       +1        S,A\nP2\n\nShikan Ken(knuckle fist) +1       +1        +0       S,C\nP2\nxSTR.test to knock opponent back 1 hex; KDA\n\nShockwave            +0        +0       None      S,C,miss A\n(1C) P4,F2\nxShockwave extends in straight hex line; 1 hex per dot in STR;\nKD all.\n\nSpinning Chothesline   +0       +0       -2        S,miss C\n(1W) P4,A3,Clothesline\nxDMG vs. all adjacent hexes; Knockback 1 each time DMG is dealt;\nAdvance with MV after each hit, may roll DMG again if applicable;\nDodge Maneuver.\n\nSpinning Knuckle     -1        +1(x2)    +3         S,C\n(1W) P3,A1,Spinning Back Fist\nxDodge Maneuver.\n\nStrong Decending Elvow +0       +1         +1         S,A\nP2,A1,Jump\nxAerial.\n\nSword Hand Strike     -1       +4         -2         S,C,A\nP3\nxIgnores armor,Toughskin,etc.\n\nTriple Strike         -2    (+0,+0,+1)    None      S,C,A\nP2,K1\nxRoll three damage tests as indicated, take highest two rolls.\n\nTurn Punch      Rnd 1-1        +4        Two        S,C\n(W first turn)P4       Rnd 2-1        +5        Two        S,C\n           Rnd 3+0       +6        Two        S,C\n           Rnd 4+1       +7        Two        S,C\nxCard is layed face down; May be played at any time thereafter as\nlong as card is left face down; -1 SPD,DMG,MV while charging\nmaneuver; Need not be used.\n\nUppercut           +1        +2        -1         S,C,A\nP1\nx +1DMG vs. Crouching."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Brawler, Grappler, Hand-to-Hand, Infighter, Martial Artist, Wrestler"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Punch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Punch")
                              )
                            ),
                            Core.vx_new_string(":Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Low Attack]\n-1 Initiative\n-1 Move\n+1 Damage")
                              )
                            ),
                            Core.vx_new_string(":Grab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grab"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-1 Initiative\n-1 Action\n* Attempt to grab an item. Roll vs. Body to succeed.")
                              )
                            ),
                            Core.vx_new_string("Back Fist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Back Fist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Strike with the back of the fist or open hand."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Backhand, Bitch Slap")
                              )
                            ),
                            Core.vx_new_string(":Clothesline"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clothesline"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Clothesline         -1           +2           +0     S,C,miss A")
                              )
                            ),
                            Core.vx_new_string("Bull Rush"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bull Rush")
                              )
                            ),
                            Core.vx_new_string(":Charge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Charge")
                              )
                            ),
                            Core.vx_new_string("Crouching Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crouching Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Crouch low and deliver a powerful blow to the mid-section or below the belt.\n* [Attack] [5]: +1 Effect"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ducking Punch")
                              )
                            ),
                            Core.vx_new_string("Deflecting Punch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deflecting Punch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter deflects a punch at him and immediately counters with a punch of his own.\n* [Counter]: +1 Effect")
                              )
                            ),
                            Core.vx_new_string("Dragon Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragon Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When striking with the fist, more power can be exerted when the movement originates from the feet, is guided by the waist, flows through the body, and exits through the fist.\n* [Attack] [J]: +1 Knockback\n* [Aerial]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dragon Fist, Dragon Punch")
                              )
                            ),
                            Core.vx_new_string("Ear Pop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ear Pop"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Disorienting attack that causes temporary or permanent deafness.\n* -1 Initiative\n* -1 Attack\n* +2 Stun\n* -2 Move\n* Criticals: Deafness")
                              )
                            ),
                            Core.vx_new_string("Elbow Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elbow Drop")
                              )
                            ),
                            Core.vx_new_string("Elbow Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elbow Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Devastating blow common to Muay Thai.\n* +1 Initiative\n* +1 Damage\n* 1 Move"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Elbow Smash")
                              )
                            ),
                            Core.vx_new_string("Eye Rake"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye Rake"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Disorienting attack that causes temporary or permanent blindness.\n* -1 Initiative\n* -1 Attack\n* +2 Stun\n* -2 Move\n* Criticals: Blindness")
                              )
                            ),
                            Core.vx_new_string("Fists of Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fists of Fire")
                              )
                            ),
                            Core.vx_new_string(":Haymaker"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Haymaker"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A slow all out attack that causes massive damage. Especially\nuseful to finish off weakened opponents.\n-2 Initiative\n0 Move\n+2 Damage"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Two-Fisted Smash")
                              )
                            ),
                            Core.vx_new_string("Head Butt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Head Butt"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-2 Move\n+1 Damage")
                              )
                            ),
                            Core.vx_new_string(":Hyperfist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hyperfist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Critical Hits] can be exchanged for additional Attacks.\nSame as [Auto].\n-2 Initiative\n-1 Damage\n1 Move"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hundred Hand Slap, Lightning Fist, Rapid Punch")
                              )
                            ),
                            Core.vx_new_string(":Jab"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jab"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A quick, weak strike.\n+2 Initiative\n+1 Accuracy\n-2 Damage\n+1 Move")
                              )
                            ),
                            Core.vx_new_string("Knife Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knife Hand"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Damage]: [Critical Hits] may reduce opponent's [Armor] roll.")
                              )
                            ),
                            Core.vx_new_string("Knuckle Fist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knuckle Fist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Critical Hits] cause Knockback.")
                              )
                            ),
                            Core.vx_new_string("Monkey Punch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Monkey Punch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grab blocking arm and punch\n* If opponent used a block, ignore it."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Grab Punch")
                              )
                            ),
                            Core.vx_new_string("Nerve Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nerve Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Use the tips of the fingers to strike and pinch nerve clusters\nto produce pain and debilitation.\n* [Action]\n* -1 Initiative\n* +1 Stun"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Atemi Strike, Atemi Waza, Cobra Strike")
                              )
                            ),
                            Core.vx_new_string("One Two Punch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("One Two Punch")
                              )
                            ),
                            Core.vx_new_string("Palm Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Palm Strike"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Palm Heel Strike, Shotei")
                              )
                            ),
                            Core.vx_new_string("Phoenix Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phoenix Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Middle finger protrudes from fist to strike nerve clusters to\ncause numbness.\n* [Criticals] can be exchanged for Slow tokens.")
                              )
                            ),
                            Core.vx_new_string(":Ram"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ram"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]\n* +1 Knockback"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Shoulder Smash")
                              )
                            ),
                            Core.vx_new_string("Spinning Back Fist"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spinning Back Fist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter spins around adding force to the blow.\n-1 Initiative\n+1 Damage\n+1 Move")
                              )
                            ),
                            Core.vx_new_string("Strike Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strike Defense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter concentrates on the strikes of the opponent but\nbecomes vulnerable to other attacks.\n* [Reaction]\n+1 Initiative\n-1 Move\n+2 Defense vs. Strikes (-1 Defense vs. Others)")
                              )
                            ),
                            Core.vx_new_string("Sword Hand"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sword Hand"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Accuracy\n+1 Damage\n-2 Move"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Karate Chop")
                              )
                            ),
                            Core.vx_new_string("Tiger Claw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tiger Claw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Tiger Claw Strike    (+0)     (+1)       (+0)       S,C,A")
                              )
                            ),
                            Core.vx_new_string(":Uppercut"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Uppercut"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This powerful punch starts low and ends high using the fighter's\nleg and back muscles to increase damage.\n* [Criticals] can be exchanged for Knockback\n-1 Initiative\n+1 Damage\n-1 Move")
                              )
                            ),
                            Core.vx_new_string("Axe Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Axe Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fighter raises his leg high over his head and snaps it down\ntoward the opponent's head and neck.\n* [High Attack]\n-1 Initiative\n-2 Move\n+1 Damage")
                              )
                            ),
                            Core.vx_new_string("Back Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Back Kick")
                              )
                            ),
                            Core.vx_new_string("Backflip Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Backflip Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [High Attack]\n* [Limited] by [Acrobatics].\n+1 Initiative\n1 Move (directly backwards)\n+1 Damage"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flash Kick")
                              )
                            ),
                            Core.vx_new_string("Crescent Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crescent Kick")
                              )
                            ),
                            Core.vx_new_string("Double Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Double Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Combo]: [Roundhouse Kick] followed by [Spinning Thrust Kick]")
                              )
                            ),
                            Core.vx_new_string("Dragon Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragon Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-- 1		+6 (x2) 	-- 2		S,C		(1C, 1W)		K5, F4, Jump	*  Knockback; KD; -->Aerial Maneuver.")
                              )
                            ),
                            Core.vx_new_string("Dragon Tail"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragon Tail"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter drops low, extends his leg and whirls around quickly,\nkicking his opponents and knocking their feet out from under them.\n-2 Initiative\n-1 Accuracy\nDamage is [Knockback] instead.\nCriticals are [Knockdown] instead."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Iron Broom, Tiger Tail Sweep")
                              )
                            ),
                            Core.vx_new_string("Drop Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drop Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ends [Prone].\n* Kick the opponent with the soles of both feet and fall to the ground.\n	-- 1		+  2		-- 1		S miss C,A			K2, A1			**")
                              )
                            ),
                            Core.vx_new_string("Flying Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flying Kick"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("MartialArts/FlyingKick.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter launches himself feet first into the air toward his\nopponent.  He ends his move with a powerful kick, usually to the\nopponent's head or midsection.\n+1 Accurary\n+1 Damage\n+1 Move (Aerial in one direction)\n	+  0		+  6		-- 2		S,C		(1 W)		K4, A4, Jump		*  Knockback; KD; --> Aerial Maneuver."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flying Thrust Kick")
                              )
                            ),
                            Core.vx_new_string("Foot Stomp"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Foot Stomp"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The toe crusher.  That went out of style when I left kindergarten.\n- Kung Fu Hustle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Stomp on opponent's foot to slow their movement.")
                              )
                            ),
                            Core.vx_new_string("Handstand Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Handstand Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter bends over, places his hands on the ground, and then\npresses his legs up into a handstand. The legs snap up with\ntremendous kicking force. Can be used while [Prone]\n-1 Initiative\n1 Move\n+2 Damage")
                              )
                            ),
                            Core.vx_new_string("Hurricane Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hurricane Kick"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("MartialArts/HurricaneKick.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-1 Speed\n-2 Attack\n* May attack up to 2 units in any surrounding spaces."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Butterfly Kick, Whirlwind Kick")
                              )
                            ),
                            Core.vx_new_string("Kick Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kick Defense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter concentrates on the legs of the opponent but becomes\nvulnerable to other attacks.\n* [Reaction]\n+1 Initiative\n-1 Move\n+2 Defense vs. Kicks (-1 Defense vs. Others)")
                              )
                            ),
                            Core.vx_new_string("Kick Off"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kick Off"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Propel yourself and opponent apart instead of damaging. Especially\nuseful when the opponent is near dangerous terrain.\n-1 Initiative\n+1 Accuracy\n[Hits] are [Knockback] instead.\n[Critical Hits] are [Knockdown] instead."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Heel Stamp")
                              )
                            ),
                            Core.vx_new_string("Knee Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knee Drop")
                              )
                            ),
                            Core.vx_new_string("Knee Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knee Strike"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("MartialArts/TigerKnee.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Leap up to strike with the knee to the stomach, chest or face\nusing the momentum of the leap to increase damage.\n+2 Initiative\n+1 Damage\n0 Move"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flying Knee Thrust, Tiger Knee")
                              )
                            ),
                            Core.vx_new_string("Leg Sweep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Leg Sweep"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A low spinning kick designed primarily to knock an opponent of\nhis feet.\n-2 Move\n-1 Accuracy [Low Attack]\n+1 Damage\n[Critical Hits] are [Knockdown]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Foot Sweep")
                              )
                            ),
                            Core.vx_new_string("Lightning Leg"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lightning Leg"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("MartialArts/LightningLeg.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Finishing Move]\n* [Attack]: [Auto]\n	LIGHTNING LEG			-- 2		+  1(x3)	None		as 100handslap	(1 W)		K3, Double Hit Kick	*  Knockback; When this maneuver is chosen the fighter determines which of the three attacks strike high, and which strike low (2 high, 1 low; or 1 high, 2 low), this affects blocking accordingly.")
                              )
                            ),
                            Core.vx_new_string("Reverse Front Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reverse Front Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feint kick past head then snap back into the back of the head or\nneck.\n-1 Initiative\n+1 Accuracy\n-2 Move")
                              )
                            ),
                            Core.vx_new_string("Roundhouse Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Roundhouse Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fighter pivots and kicks using the momentum from the pivot to\nincrease the damage of the kick.\n-1 Initiative\n-1 Action\n+2 Damage")
                              )
                            ),
                            Core.vx_new_string("Scissor Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scissor Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Leap up and kick two opponents in different directions\nsimultaneously.\n-1 Initiative\n0 Move [Aerial]\n-1 Damage")
                              )
                            ),
                            Core.vx_new_string("Side Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Side Kick")
                              )
                            ),
                            Core.vx_new_string("Slide Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slide Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Speed\n* [Low Attack]\n* Critical Hits can be [Knockdown]\n* End Action [Prone]")
                              )
                            ),
                            Core.vx_new_string("Spinning Thrust Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spinning Thrust Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fighter spins gaining momentum and thrusts with the heel.\n-2 Initiative\n-2 Move\n+2 Damage"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Amaranth Kick, Mule Kick")
                              )
                            ),
                            Core.vx_new_string("Vault Kick"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vault Kick"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Vault over an obstacle and land a devastating kick with all of your weight.\n+0 Move - Ignore the terrain penalty of 1 space next to the target.\n+0 Accuracy - [High Attack]\n+1 Damage\nCriticals are [Knockback]")
                              )
                            ),
                            Core.vx_new_string("Atomic Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Atomic Drop")
                              )
                            ),
                            Core.vx_new_string("Air Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter intercepts a leaping or flying opponent in mid-air,\ntwists, and slams him to the ground, landing on top of him.\n* [Reaction], [Aerial]\n+1 Initiative\n+0 Damage is [Knockdown]. Damage also reduces falling Damage\nto the fighter.\nCriticals are [Knockdown]. Criticals also reduces falling Criticals\nto the fighter.")
                              )
                            ),
                            Core.vx_new_string(":Backbreaker"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Backbreaker"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter lifts his opponent in the air and smashes him to the\nground or onto his knee. This maneuver can cause serious spinal\ninjuries.\n* Uses a [Hold]\n-2 Initiative\n-1 Accuracy\n+2 Damage\nCriticals are [Cripple]")
                              )
                            ),
                            Core.vx_new_string("Backroll Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Backroll Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter grabs the opponent and then rolls backwards while\nusing his legs to help lift and throw the opponent over him. The\nopponent is send directly behind the fighter and the fighter is\nleft [Prone].\n* Uses a [Hold]\n-1 Initiative\n+1 Damage is [Knockdown]\nCriticals are [Knockdown]")
                              )
                            ),
                            Core.vx_new_string("Bear Hug"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bear Hug"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter wraps his arms around the opponent and crushes him.\n* [Continuous]\n* Requires a [Hold]\n-1 Initiative\n+1 Damage\n1 Move")
                              )
                            ),
                            Core.vx_new_string("Choke Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Choke Hold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter wraps his arms around the opponents neck and begins\nchoking him.\n* [Continuous]\n* Requires a [Hold]\n-1 Initiative\nCriticals are [Asphixiation]\n1 Move")
                              )
                            ),
                            Core.vx_new_string("Fighting Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fighting Hold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While holding the opponent, strike him repeatedly.\n* Requires [Hold]\n* [Continuous]\n+1 Initiative\n+1 Accuracy\n+1 Damage\n1 Move")
                              )
                            ),
                            Core.vx_new_string("Grappling Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grappling Defense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Skilled grapplers must learn how to resist and escape from the\nsame maneuvers that they use.\n* [Reaction]\n+1 Initiative\n-1 Move\n0 Damage - Remove a [Hold] from yourself.\nCriticals - Remove additional [Holds].")
                              )
                            ),
                            Core.vx_new_string("Ground Fighting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ground Fighting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Passive]: Ignore penalties for being [Prone].")
                              )
                            ),
                            Core.vx_new_string(":Headlock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Headlock")
                              )
                            ),
                            Core.vx_new_string("Hip Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hip Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This is a quick move to get an opponent on the ground. The\nfighter moves a leg behind the opponent's and pushes him past the\nhip and directly to the floor.\n-1 Move\nDamage - [Knockdown]\nCriticals - [Knockdown]")
                              )
                            ),
                            Core.vx_new_string(":Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Puts a [Hold] on opponent.\n+1 Initiative\n0 Damage - Add a [Hold] token.\n0 Criticals")
                              )
                            ),
                            Core.vx_new_string(":Hook"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hook"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The hook is a powerful punch with knockout power.\n* When throwing a hook, the puncher shifts his body weight to the\nlead foot, allowing him to pivot his lead foot and generate\nkinetic energy through the hip/torso/shoulder, swinging his lead\nfist horizontally toward the opponent.\n-1 Initiative\n+1 Damage\n+0 Criticals - [Stun]")
                              )
                            ),
                            Core.vx_new_string("Iron Claw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Claw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Damaging Grab")
                              )
                            ),
                            Core.vx_new_string("Joint Lock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Joint Lock"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter grabs a limb tightly and leverages the limb in ways the joint was not meant to turn. The attack is incredibly painful and can cause sprains, dislocations, and breaks.\n* [Continuous Hold]\n-2 Initiative\n-1 Accuracy\n+0 Damage - +1 Stun\n+0 Criticals - [Cripples]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Armbar, Armlock, Hammerlock, Leg Lock")
                              )
                            ),
                            Core.vx_new_string("Knee Bash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knee Bash"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While holding the opponent, knee him repeatedly in the head or stomach.\n* Requires [Hold]\n* [Continuous]\n-1 Initiative\n+1 Accuracy\n+2 Damage\n0 Move")
                              )
                            ),
                            Core.vx_new_string("Neck Break"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Neck Break"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter grabs the opponent's head and twists it with the intention to break the neck. For best effect this is used as a surprise attack.\n-2 Initiative\n-2 Accuracy\n+4 Damage\nCriticals are [Cripples]")
                              )
                            ),
                            Core.vx_new_string(":Nelson"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nelson")
                              )
                            ),
                            Core.vx_new_string(":Piledriver"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piledriver")
                              )
                            ),
                            Core.vx_new_string(":Pin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While grappling, attempt to immobilize the opponent.\n* Requires [Grapple]\n* [Continuous]\n+1 Damage - Damage is [Stun].\nCriticals are [Slow]")
                              )
                            ),
                            Core.vx_new_string(":Reversal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reversal")
                              )
                            ),
                            Core.vx_new_string("Shoulder Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shoulder Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter lifts the opponent his is holding over a shoulder and hurls him as far as his strength will allow.\n* Requires a [Hold].\n-1 Move\n+1 Damage - [Knockback] in any direction the fighter chooses.\nCriticals - [Knockback]")
                              )
                            ),
                            Core.vx_new_string("Sleeper Hold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sleeper Hold")
                              )
                            ),
                            Core.vx_new_string(":Suplex"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Suplex")
                              )
                            ),
                            Core.vx_new_string(":Tackle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tackle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dive at the opponent and use weight and momentum to take you both to the ground.\n+1 Initiative\n+1 Move\n+1 Accuracy. Succeed or fail, the fighter is [Prone].\nDamage is [Knockdown].\nCriticals are [Knockdown]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flying Tackle")
                              )
                            ),
                            Core.vx_new_string("Take Down"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Take Down"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fighter wraps his limbs around the opponent and causes both fighters to fall [Prone].\n+1 Initiative\n-1 Move\n0 Damage - Both fighters are [Prone] and puts a [Hold] on the other.\n0 Criticals")
                              )
                            ),
                            Core.vx_new_string("Thigh Press"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thigh Press")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Strikes"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strikes")
                              )
                            ),
                            Core.vx_new_string(":Kicks"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kicks")
                              )
                            ),
                            Core.vx_new_string(":Grappling"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grappling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Atomic Drop\n     * Air Throw\n     * Backbreaker\n     * Backroll Throw\n     * Bear Hug\n     * Choke Hold\n     * Fighting Hold\n     * Grappling Defense\n     * Ground Fighting\n     * Headlock\n     * Hip Throw\n     * Hold\n     * Hook Hold\n     * Iron Claw\n     * Joint Lock\n     * Knee Bash\n     * Neck Break\n     * Nelson\n     * Piledriver\n     * Pin\n     * Reversal\n     * Shoulder Throw\n     * Sleeper Hold\n     * Suplex\n     * Tackle\n     * Take Down\n     * Thigh Press")
                              )
                            ),
                            Core.vx_new_string(":Aikido"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aikido"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Water flows and takes any shape or course, yet it is always consistant with its own nature."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This essentially noncombative Japanese art concentrates on the development of the self, and physical, mental, and spiritual nonresistance.  By moving with and blending with an opponent's attacks, they may be used against him.\n* Athletics - [Breakfall]\n* Evasion - [Deflect], [Disengage], [Drunken Monkey Roll], [Evasive Roll], [Iron Horse], [Weapon Block]\n* Grapples - [Air Throw], [Backroll Throw], [Disengage], [Grab], [Grapple Defense], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw], [Takedown]\n* Kicks - [Dragon Tail], [Kick Defense], [Leg Sweep], [Slide Kick]\n* Strikes - [Nerve Strike], [Strike Defense]\n\n		GRAB:\n		Ugoku Taosu(5)\n		Atemi Torae(4)\n\n		FOCUS:\n		Push(2)\n		Chi Kung Healing(3)\n		Ghost Form(5)\n		Stunning Shout(3)\n		Zen No Mind(3)"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Aikijutsu")
                              )
                            ),
                            Core.vx_new_string(":Boxing"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boxing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Boxing is a fighting style that concentrates exclusively on punches.\n* Evasion - [Iron Skin]\n* Strikes - [Dash Attack], [Deflecting Punch], [Feint], [Haymaker], [Head Butt], [Hook], [Hyperfist], [Jab], [Ram], [Spinning Back Fist], [Uppercut]\n* Grapples - [Grab]")
                              )
                            ),
                            Core.vx_new_string(":Brawling"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brawling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Brawling is no holds bars, no rules hand to hand fighting."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bruiser, Pit Fighter, Street Fighter, Thug")
                              )
                            ),
                            Core.vx_new_string(":Capoeira"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Capoeira"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Brazilian marital art developed by slaves who were brought to South America from Africa. The style was disguised as dance to avoid punishment when caught training. The style is still typically practiced to music. The style developed acrobatic maneuvers that could be used while chained. Capoeiristas will sometimes cross the field doing cartwheels. Knife fighting is also sometimes included in the style.\n* Athletics - [Backflip], [Breakfall], [Cartwheel], [Jump], [Kippup]\n* Evasion - [Drunken Monkey Roll]\n* Grapples - [Backroll Throw]\n* Kicks - [Backflip Kick], [Dragon Tail], [Handstand Kick], [Kick Defense], [Knee Strike], [Leg Sweep], [Spinning Thrust Kick]\n* Strikes - [Head Butt], [Strike Defense]")
                              )
                            ),
                            Core.vx_new_string("Commando Training"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commando Training"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Commando Training is a generic term for the fighting styles taught to armed forces members. It is a practical, sometimes brutal style that borrows from a variety of other styles and combines them into a style that can be taught to recruits quickly.\n* Evasion - [Disarm], [Kick Defense], [Strike Defense]\n* Grapples - [Choke Hold], [Grab], [Grapple Defense], [Knee Bash], [Joint Lock], [Pin], [Shoulder Throw], [Tackle]\n* Kicks - [Knee Strike], [Leg Sweep]\n* Strikes - [Elbow Strike], [Hook], [Knife Hand], [Spinning Back Fist], [Sword Hand]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Special Forces Training")
                              )
                            ),
                            Core.vx_new_string(":Hapkido"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hapkido"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This Korean Martial Art borrows many techniques successfully from other styles; it is a combination of the Aidido, Jujutsu, and Karate styles of Japan with the Korean systems of hwang Do and Taekyon (percursor to Tae Kwan Do).  It is a style that teaches focus on passivity in opposing force, countering and attacking with circular motions, and the absolute penetration of an opponent's defenses.\n* A Hapkido practitioner receives a strong attack gently and counters a gentle attack powerfully and a subtle rythym of attacks and counters develops in the combat. This perpetual and fluid rythym, as well as constant mobility, are hallmarks of the style.\n* Athletics - [Breakfall], [Jump]\n* Evasion - [Disarm], [Evasive Roll]\n* Grapples - [Back Roll Throw], [Grappling Defense], [Joint Lock], [Choke Hold], [Pin], [Shoulder Throw], [Takedown]\n* Strikes - [Deflecting Punch], [Nerve Strike], [Phoenix Strike], [Spinning Back Fist], [Strike Defense]\n* Kicks - [Axe Kick], [Crescent Kick], [Double Kick], [Flying Kick], [Kick Defense], [Leg Sweep], [Roundhouse Kick], [Spinning Thrust Kick]")
                              )
                            ),
                            Core.vx_new_string(":Hsing-I"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hsing-I"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hsing-I stylists attempt to use the body's internal energy, ch'i, to perform astounding feats. The first set of block-strike manuevers are based on the five elements (fire, water, earth, metal, and wood). The second is a group of animal based forms (including Dragon, Tiger, Horse, Turtle, Chicken, Snake, and Bear). The typical attack is to block a	strike, grab the arm or leg, and strike back with the hand.\n* Evasion - [Deflect], [Weapon Block]\n* Brawling - [Haymaker]\n* Grapples - [Hip Throw], [Joint Lock]\n* Kicks - [Kick Defense], [Leg Sweep]\n* Strikes - [Grab Punch], [Nerve Strike], [Phoenix Strike], [Strike Defense]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Heart and Mind")
                              )
                            ),
                            Core.vx_new_string(":Hwarang-Do"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hwarang-Do"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This style concentrates on punches and a wid variety of weapon techniques. Further masters are said to possess mystical powers including telepathy, clairvoyance, and the ability to sense danger.\n* A Korean style that is said to have grown out of certain healing techniques, and modern masters are often healers as well. Legend has it that a Buddhist mong developed the style and taught it to the Hwarang who were similar the Korean equivalent of knights: fighters, diplomats, and military leaders who lived by a strict code of honor.\n* Athletics - [Breakfall], [High Jump], [Kippup], [Long Jump]\n* Evasion - [Deflect], [Disengage]\n* Grapples - [Choke Hold], [Grapple Defense], [Joint Lock], [Shoulder Throw]\n* Kicks - [Backflip Kick], [Kick Defense], [Roundhouse Kick],\n[Slide Kick]\n* Strikes - [Dash Attack], [Elbow Strike], [Nerve Strike], [Phoenix Strike], [Strike Defense]\n* Focus Powers - [Blind Fighting], [Spirit Healing], [Zen No Mind]")
                              )
                            ),
                            Core.vx_new_string("Jeet Kune Do"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jeet Kune Do"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Use whatever works."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A martial art created by the late Bruce Lee. After studying many differenct martial arts, Lee decided that their reliance on a limited group of maneuvers made them ineffective. Instead, he catalogued all of the ways that the human body could be used to attack or defend and then created a simplified and practical fighting style with no patterns or predefined conceptions.\n* Grapples - [Choke Hold], [Joint Lock], [Hip Throw]\n* Kicks - [Foot Stomp], [Kick Defense], [Lightning Leg], [Roundhouse Kick]\n* Strikes - [Elbow Strike], [Feint], [Nerve Strike], [One Two Punch], [Phoenix Strike], [Spinning Back Fist], [Strike Defense]\n* Focus Powers - [Zen No Mind]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("The Way of the Intercepting Fist")
                              )
                            ),
                            Core.vx_new_string(":Jujutsu/Judo"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jujutsu/Judo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Japanese fighting style with roots 1200 years old.\n* Jujutusu focuses on grapples instead of strikes. The typical maneuver grabs an opponent, forces him to the ground, and finishes him off.\n* Athletics - [Breakfall], [Kippup]\n* Evasion - [Disarm], [Disengage], [Iron Horse]\n* Grapples - [Air Throw], [Backroll Throw], [Choke Hold], [Ground Fighting], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw], [Takedown]\n* Kicks - [Dragon Tail], [Leg Sweep]\n* Strikes - [Disarm], [Nerve Strike]")
                              )
                            ),
                            Core.vx_new_string(":Kabaddi"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kabaddi"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Head Butt]\n		KICK:\n		Slide Kick(2)\n\n		BLOCK:\n		San He(3)\n		Energy Reflection(3)\n\n		GRAB:\n		Head Butt Hold(2)\n		Brain Cracker(1)\n		Dislocate Limb(3)\n		Disengage(1)\n		Air Suplex(1)\n\n		ATHLETICS:\n		Cannon Drill(5)\n		Flying Body Spear(2)\n\n		FOCUS:\n		Chi Kung Healing(3)\n		Extendible Limbs(4)\n		Fireball(3)\n		Improved Fireball(5)\n		Regeneration(1)\n		Yoga Flame(3)\n		Yoga Teleport(5)\n		Cobra Charm(2)\n		Ghost Form(5)\n		Flying Fireball(3)\n		Inferno Strike(5)\n		Mind Reading(3)\n		Telepathy(2)\n		Chi Push(5)\n		Levitation(3)\n		Balance(3)\n		Leech(3)")
                              )
                            ),
                            Core.vx_new_string(":Kalaripayattu"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kalaripayattu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A boxing art from southern India that dates back to 500 AD. Fighters are trained in 4 syltes: unarmed, stick fighting, other weapons, and the 108 vital points of the human body. Masters are also skiled healers.\n* Athletics - [Breakfall], [Jump]\n* Grapples - [Joint Lock], [Throw]\n* Kicks - [Flying Kick], [Roundhouse Kick]\n* Strikes - [Elbow Strike], [Nerve Strike], [Phoenix Strike],\n[Strike Defense], [Sword Hand]\n* Focus Powers - [Spirit Healing]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Battlefield Practices, Gurus")
                              )
                            ),
                            Core.vx_new_string(":Karate"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Karate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Karate focuses on direct strikes and kicks with few grabs or throws.\n* An extremely popular martial art originating in Okinawa, Japan in 400 AD. It became well developed only after the Japanese invaders forbade the Okinawans to carry weapons.\n* Athletics - [Jump], [Kippup]\n* Close Combat - [Hook]\n* Evasion - [Deflect], [Disarm], [Iron Horse], [Iron Skin]\n* Grapples - [Backroll Throw], [Hip Throw], [Shoulder Throw]\n* Kicks - [Axe Kick], [Back Kick], [Cresent Kick], [Dobule Kick], [Dragon Tail], [Flying Kick], [Foot Stomp], [Kick Defense], [Leg Sweep], [Reverse Front Kick], [Roundhouse Kick], [Scissor Kick]\n* Strikes - [Crouching Strike], [Dash Attack], [Dragon Fist], [Elbow Strike], [Knife Hand], [Nerve Strike], [Palm Strike], [Spinning Back Fist], [Strike Defense], [Sword Hand], [Tiger Claw]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Empty Hands")
                              )
                            ),
                            Core.vx_new_string(":Kickboxing"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kickboxing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Backroll Throw]\n* [Dashing Punch]\n* [Haymaker]\n* [Hyperfist]\n* [Knee Bash]\n* [Slide Kick]\n* [Spinning Back Fist]\n		PUNCH:\n		Feint(1)\n		Hook(1)\n		Double Hit Punch(1)\n		Heart Punch(4)\n		Lunge Punch(2)\n		Fist Sweep(2)\n		Dashing Punch(5)\n		Turn Punch(5)\n		Rekka Ken(5)\n		Spinning Back Fist(1)\n		Spinning Knuckle(3)\n\n		KICK:\n		Double Dread Kick(3)\n		Back Roundhouse(1)\n		Ax Kick(3)\n		Reverse Frontal Kick(1)\n		Flying Knee Thrust(1)\n		Stepping Front Kick(3)\n		Slide Kick(2)\n		Double Hit Kick(1)\n		Wounded Knee(2)\n\n		BLOCK:\n		Deflecting Punch(1)\n\n		GRAB:\n		Knee Basher(2)\n		Back Roll Throw(1)\n		Brain Cracker(1)\n\n		---- Savate ----\n		PUNCH:\n		Spinning Back Fist(1)\n		Palm Heel Punch(1)\n		Ear Pop(2)\n		Spinning Knuckle(3)\n\n		KICK:\n		Ax Kick(2)\n		Double Hit Kick(1)\n		Flash Kick(4)\n		Double Dread Kick(3)\n		Foot Sweep(1)\n		Spinning Foot Sweep(1)\n		Lightning Leg(5)\n		Slide Kick(2)\n		Stepping Front Kick(4)\n		Flying Knee Thrust(1)\n		Double Hit Knee(1)\n\n		BLOCK:\n\n		GRAB:\n		Knee Basher(2)\n		Bear Hug(1)\n		Neck Choke(2)"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Savate")
                              )
                            ),
                            Core.vx_new_string(":Kobujutsu"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kobujutsu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The martial art specializing in Okinawan weapons.\n* Melee - [Bash], [Dazing Blow], [Disarm], [Fleche], [Jab], [Parry], [Riposte], [Slash], [Sweep], [Thrust]\n* Melee Weapons - [Bo Staff], [Eiku], [Jo Staff], [Kama], [Nunchaku], [Sai], [Tonfa]")
                              )
                            ),
                            Core.vx_new_string(":Krabi-Krabong"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Krabi-Krabong")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Crane Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Crane Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The crane was known for its grace and beauty. Known to stand on one leg for long periods of time, it is no wonder that the crane stylists had excellent balance and were known for their awesome kicking ability and long range techniques.\n* Crane is very upright, attacking with carefully aimed strikes at long range and defending with redirection and retreat rather than resistance. Working from outside an opponent's effective range, Crane demands extreme technical proficiency and smooth footwork, as well as careful timing and judgment. Crane is high, circular, soft, and distant, working chiefly with progressive indirect attacks.\n* Athletics -  [Breakfall], [High Jump], [Jump]\n* Evasion - [Avoid], [Deflect], [Evasive Roll], [Sidestep]\n* Kicks - [Axe Kick], [Flying Kick], [Kick Off], [Leg Sweep], [Vault Kick]\n* Strikes - [Dash Attack], [Grab Punch], [Nerve Strike], [Spinning Back Fist]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Dragon Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Dragon Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Shen Lung (Spiritual or Invisible Dragon): While the Dragon is not a formally taught style in Shen Lung it instead represents what emerges when a practitioner can draw freely from all five animals as the situation demands. One who can use the power of Tiger, the mechanics of Mantis, the speed of Snake, the movements of Crane, and the cunning of Monkey.\n* As the dragon floats through the sky he twists and coils, flipping his tail as he turns. The dragon stylist uses turns and circular motions to throw and strike his opponents.\n* 'Ride the wind', a phrase which means follow rather than lead. Provide no opening without first letting your opponent open. Unlike Crane, which also relies heavily upon evasion as a tactic, the Dragon evades primarily by rotation of upper or lower torso with little or no stance movements, while the Crane stylist hops frequently to reposition the entire body. Both styles employ pinpoint strikes to vulnerable meridian targets, but dragon also heavily uses tiger-like punches and clawing techniques, snake-like stance shifts, and leopard-like hit and run strikes to weaken a physically superior adversary.  Dragon kung fu also regularly employs low sweeping techniques\n* Kicks - [Dragon Tail], [Flying Kick]\n* Strikes - [Dragon Fist], [Nerve Strike]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Leopard Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Leopard Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The leopard was known for its tremendous speed and cunningness. Unlike the tiger that doesn't mind frontal attacks, the leopard stylist prefers to attack only when the odds are in his favor. The only time he shows he is hurt is when he is not. He acts like he is running away in order to come back with an attack on his own ground.\n* Blocking is wasted in Leopard - the style can be summed up with 'Why block when you can hit?' It does not rely on rooted stances, and would only assume a stance while in attack in order to launch at the opponent. This hit and run technique of the leopard, something especially effective against larger opponents, is unique to the animal.\n* An interesting technique of the leopard is the ability to simultaneously block and strike. The sheer speed of the leopard is a defining characteristic of the style\n* Evasion - [Dodge], [Dodge Roll]\n* Strikes - [Deflecting Punch], [Dash Attack]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Mantis Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Mantis Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mantis operates in sequences and combinations baffling opponents with multiple simultaneous attacks and blocks, all executed at high speed. Mantis is a quick, high, linear, hard style that attacks by rapidly executed combinations.\n* [Combo]\n* Strikes - [Deflecting Punch], [Hyperfist], [Jab], [Knife Hand], [One Two Punch]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Monkey Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Monkey Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Monkey style prefers to go to the ground, integrating throws, locks, grappling and ground-fighting. Monkey is very low, both hard and soft, close-range and favors full body contact.\n* Evasion - [Drunken Monkey Roll]\n* Grapples - [Grab], [Joint Lock], [Hold], [Pin], [Takedown]\n* Strikes - [Monkey Punch]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Snake Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Snake Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The snake is known for its speed once an opponent is in striking range. The snake raises its head and waits patiently until the unsuspecting opponent gets too close. The snake stylist, too, concentrates on waiting until the time is right and with his fingertips, strikes to a vital spot in a blink of an eye. Knowing how to use one's internal energy or chi is a major part of the snake system.\n* Snake is a soft style using an opponent's energy against them rather than resisting it. Snakes absorb, control and redirect rather than block an attack. Snake stylists are known for circular and whip-like motions flowing around opponents, climbing over their defenses and striking repeatedly in rapid succession. Snake is high, circular, soft and extremely fast, favoring progressive direct attacks that overwhelm a defense.\n* Snake style is based on whipping power which travels up the spine to the fingers. The ability to sinuously move, essentially by compressing one's stomach/abdominal muscles, is very important.\n\n* Strikes - [Back Fist], [Knife Hand], [Nerve Strike]\n* Focus Powers - [Death Touch]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Tiger Style"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Tiger Style"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Known for its power and strength, the tiger stylists were known for their ripping and tearing techniques. Hands held like tiger claws, these fighters would strike and claw with tremendous speed and power.\n* Tiger emphasizes close-range strikes, throws, and a willingness to stay in the danger zone long enough to set up a single fight-ending blow. Tiger commits fully to every motion, and maximizes power at the expense of mobility. Tiger is low, hard-style, and works with single direct attacks.\n* Strikes - [Crouching Strike], [Dash Attack], [Dragon Fist], [Elbow Strike], [Eye Rake], [Haymaker], [Strike Defense], [Sword Hand], [Tiger Claw]")
                              )
                            ),
                            Core.vx_new_string("Kung Fu, Wing Chun"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kung Fu, Wing Chun"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wing Chung, literally 'singing spring', is a Southern Chinese kung fu style and a form of\nself-defense originating in Qing China, which requires quick arm movements and strong legs. Softness (via relaxation) and performance of techniques in a relaxed manner is fundamental to Wing Chun.")
                              )
                            ),
                            Core.vx_new_string("Muay Thai"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Muay Thai"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Apachai: The use of knees and elbows is very important in Muay Thai.\n* Akisame: Which, in fact, is rather rare as most contemporary martial arts have banned the use of knees and elbows in tournament fighting.\n* Kenichi: Really? How come?\n* Apachai: If you use them wrong, you can kill your opponent!\n* Akisame: That's right. However, in Muay Thai, they specifically focus on these moves.\n* Kenichi: Yeahhh, and why is that?\n* Apachai: Because if you use them right, you can kill your opponent!\n- Kenichi: World's Mightiest Disciple"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A fast, brutal martial art from Thailand.\n* The style uses close strikes with the knees, elbows, fists, and feet.\nThere are no grabs or throws. Fighters often jump up to add more force\nto their blows. Fighters are also trained to take damage as much as\navoid it.\n* Evasion - [Iron Skin]\n* Grapples - [Knee Bash]\n* Kicks - [Axe Kick], [Double Kick], [Foot Stomp], [Kick Defense],\n[Knee Drop], [Knee Strike], [Leg Sweep], [Lightning Leg],\n[Reverse Front Kick], [Roundhouse Kick]\n* Strikes - [Dash Attack], [Dragon Punch], [Elbow Drop], [Elbow Strike],\n[Feint], [One Two Punch], [Ram], [Spinning Back Fist], [Strike Defense],\n[Sword Hand], [Uppercut]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Thai Kickboxing")
                              )
                            ),
                            Core.vx_new_string(":Ninjutsu"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ninjutsu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ninjutsu is the art of the Japanese Ninja. Ninjutsu saw greatest use from 1200-1600 AD when warlords employed ninja clans to spy on and assassinate their enemies.\n* The primary weapons of the ninja are the ninja-to sword and shuriken throwing stars. They were also adept in many types of concealed weapons. They are also known for unusual gadgets to assist them in climbing, crossing water, picking locks, etc. They are assassins, so they are not interested in honorable combat and will use traps or poison instead of combat if possible.\n* Kunoichi - Female ninja operated as infiltrators, spies and assassins. They spent time in enemy houses, reported secrets and undermined rival houses by any means necessary. Kunoichi could use their gender to their advantage because women were underestimated as warriors. This made it easier for them to get closer to their targets by posing as maids, geisha, servants and priestesses. In some cases, they were taken on as concubines and mistresses, giving them unparalleled access to all their marks.\n* Athletics - [Backflip], [Breakfall], [Jump], [Wall Spring]\n* Evasion - [Deflect], [Disarm], [Dirty Fighting], [Disengate], [Distraction], [Dive for Cover], [Dodge], [Dodge Roll], [Weapon Block]\n* Grapples - [Air Throw], [Backroll Throw], [Choke Hold], [Grapple Defense], [Groundfighting], [Joint Lock], [Suplex], [Takedown], [Tackle]\n* Kicks - [Backflip Kick], [Handstand Kick], [Leg Sweep], [Roundhouse Kick], [Slide Kick]\n* Strikes - [Ear Pop], [Grab Punch], [Nerve Strike], [Phoenix Strike]\n* Melee - [Dazing Blow], [Jab], [Parry], [Riposte], [Slash], [Thrust]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Shinobi, Kunoichi")
                              )
                            ),
                            Core.vx_new_string(":Pakua"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pakua"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Chinese 'internal' fighting style derived from I Ching, the Book of\nChanges which states that the universe is in a state of constant change.\nTherefore, in Pakua, any change, the placement of the foot, the turning\nof a hand is important. Pakua is highly circular and emphasizes\nfootwork and constant motion. Pakua masters are said to use palm\nstrikes instead of fist strikes to better control the energy they\nrelease.\n* Evasion - [Deflect], [Sidestep], [Weapon Block]\n* Grapples - [Grapple Defense], [Joint Lock]\n* Kicks - [Kick Defense], [Leg Sweep]\n* Strikes - [Grab Punch], [Palm Strike], [Strike Defense]\n* Focus Powers - [Zen No Mind]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Eight Diagrams")
                              )
                            ),
                            Core.vx_new_string(":Pentjak-Silat"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pentjak-Silat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A broad set of Indonsian fighting styles. Fighters are trained to\nkeep their footing on unstable ground because the condition is so common\nin Indonesia. Silat teaches many weapons especially the kris, a wavy\nbladed dagger. The mysticism and legends surrounding this weapon\nequal or exceed the katana.\n* Athletics - [Breakfall], [Disarm], [Disengage], [Dodge Roll], [Jump],\n[Kippup]\n* Evasion - [Deflect], [Hip Throw], [Iron Horse], [Iron Skin]\n* Grapples - [Choke Hold], [Grab Punch], [Grapple Defense], [Joint Lock],\n[Pin], [Takedown]\n* Kicks - [Double Kick], [Dragon Kick], [Flying Kick], [Leg Sweep],\n[Lightning Leg], [Roundhouse Kick]\n* Strikes - [Deflecting Punch], [Hyperfist], [Jab], [Nerve Strike],\n[Phoenix Strike], [Sword Hand]\n* Melee - [Fleche], [Parry], [Riposte], [Slash], [Thrust]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Guru, Pandekar, Silat")
                              )
                            ),
                            Core.vx_new_string(":Savate"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Savate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* French Kickboxing developed in Marseilles in the 1600s from kick brawling French sailors. The style is characterized by a bouncing gait and a unique kick style. When delivering kicks, the fighter leans away from the direction of the kick and stretches one arm back like a fencer to maintain balance. This allows the torso to pivot away from any counterattack. Kicks are landed with the toes or shins instead of the ball or heel and are designed to quickly slip by blocking arms.\n* Evasion - [Disarm]\n* Grapples - [Back Roll Throw], [Bear Hug], [Choke Hold], [Knee Bash]\n* Kicks - [Axe Kick], [Double Kick], [Kick Defense], [Kick Off], [Knee Strike], [Leg Sweep], [Lightning Leg], [Roundhouse Kick], [Slide Kick], [Spinning Thrust Kick]\n* Strikes - [Dash Punch], [Deflecting Punch], [Ear Pop], [Feint], [Hook], [One Two Punch], [Palm Strike], [Spinning Back Fist], [Strike Defense]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Savateur, Savateuse")
                              )
                            ),
                            Core.vx_new_string(":Sumo"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sumo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Evasion - [Iron Horse], [Iron Skin]\n* Grapples - [Air Throw], [Bear Hug], [Grapple Defense], [Knee Bash], [Hip Throw], [Shoulder Throw]\n* Kicks - [Double Kick], [Dragon Tail], [Leg Sweep]\n* Strikes - [Ear Pop], [Head Butt], [Hyperfist], [One Two Punch], [Palm Strike], [Sword Hand]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cireum")
                              )
                            ),
                            Core.vx_new_string("Tae Kwon Do"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tae Kwon Do"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Korean martial art developed in the 1600s AD. It emphasizes kicks\nover punches.\n* Athletics - [Breakfall], [Jump], [Wall Spring]\n* Evasion - [Deflect], [Iron Horse]\n* Kicks - [Axe Kick], [Double Kick], [Flying Kick], [Hurricane Kick],\n[Kick Off], [Knee Strike], [Lightning Leg], [Reverse Front Kick],\n[Roundhouse Kick], [Scissor Kick]\n* Strikes - [Deflecting Punch], [Haymaker], [Hyperfist],\n[Spinning Back Fist], [Sword Hand]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("The Way of Kicking and Punching")
                              )
                            ),
                            Core.vx_new_string("Tai Ch'i Ch'uan"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tai Ch'i Ch'uan"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ultimate internal Chinese martial art. The style is based on the\nThirteen Postures (8 actions, 5 directions). It emphasizes blocking\na strike and grabbing or striking back.\n* Athletics - [Balance], [Breakfall]\n* Evasion - [Deflect], [Disarm], [Disengage], [Iron Horse], [Iron Skin]\n* Grapples - [Air Throw], [Back Roll Throw], [Grab Punch],\n[Grappling Defense], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw]\n* Kicks - [Dragon Tail], [Kick Defense], [Leg Sweep], [Slide Kick]\n* Strikes - [Deflecting Punch], [Grab Punch], [Nerve Strike],\n[Palm Strike], [Phoenix Strike], [Strike Defense]\n* Focus - [Empty Force], [Spirit Healing], [Zen No Mind]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Supreme Ultimate Fist, Yin-Yang Boxing")
                              )
                            ),
                            Core.vx_new_string(":Wrestling"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wrestling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wrestling is one of the earliest martial arts. Virtually every ancient\nsociety had some form of wrestling and many have survived largely\nunchanged.\n* Atheltics - [Breakfall], [Jump]\n* Evasion - [Disengage]\n* Grapples - [Air Throw], [Backbreaker], [Bear Hug], [Choke Hold],\n[Grapple Defense], [Hip Throw], [Iron Claw], [Joint Lock], [Knee Bash],\n[Nelson], [Piledriver], [Pin], [Reversal], [Sleeper Hold]\n[Shoulder Throw], [Suplex], [Tackle], [Take Down], [Thigh Press]\n* Kicks - [Knee Strike]\n* Strikes - [Ear Pop], [Haymaker], [Ram]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dumog/Greco Roman/Koshti/Naban/Sanbo/Yaghliguresh")
                              )
                            ),
                            Core.vx_new_string("Wu Shu"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wu Shu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Axe Kick]\n* [Backflip Kick]\n* [Backroll Throw]\n* [Drunken Monkey Roll]\n* [Flying Kick]\n* [Handstand Kick]\n* [Hurricane Kick]\n* [Kick Off]\n* [Kippup]\n* [Leg Sweep]\n* [Lightning Leg]\n* [Reverse Front Kick]\n* [Rolling Attack]\n* [Scissor Kick]\n* [Slide Kick]\n* [Spinning Back Fist]\n* [Spinning Thrust Kick]\n* [Wall Spring]\n		PUNCH:\n		Rekka Ken(5)\n		Spinning Knuckle(3)\n\n		KICK:\n		Back Flip Kick(2)\n		Forward Back Flip Kick(1)\n		Ax Kick(4)\n		Cartwheel Kick(2)\n		Reverse Frontal Kick(2)\n		Scissor Kick(4)\n		Flying Thrust Kick(4)\n		Forward Flip Knee(2)\n		Handstand Kick(1)\n		Hurricane Kick(1)\n		Air Hurricane Kick(1)\n		Lightning Leg(3)\n		Stepping Front Kick(4)\n		Whirlwind Kick(4)\n		Double Hit Kick(1)\n		Great Wall Of China(5)\n		Descending Wheel Kick(4)\n\n		BLOCK:\n		Maka Wara(4)\n		San He(3)\n\n		GRAB:\n		Air Throw(2)\n		Back Roll Throw(1)\n\n		ATHLETICS:\n		Cannon Drill(5)\n		Displacement(4)\n		Backflip(2)\n		Flying Heel Stomp(3)\n		Rolling Attack(3)\n		Vertical Rolling Attack(3)\n		Wall Spring(1)\n		Evasive Tumble(2)\n\n		FOCUS:\n		Balance(4)\n		Chi Kung Healing(4)\n		Fireball(4)\n		Improved Fireball(5)\n		Flying Fireball(3)")
                              )
                            ),
                            Core.vx_new_string(":Binding"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Includes Garotte, Pianowire, Monofilament, Pillowcase, Towel, Rolled up Shirt, etc."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Strangler")
                              )
                            ),
                            Core.vx_new_string(":Knives"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knives"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Do you want to know why I use a knife? Guns are too quick. You can't savor all the little...emotions. You see, in their last moments, people show you who they really are. So, in a way I know your friends better than you ever did. Would you like to know which of them were cowards? - Joker, The Dark Knight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Includes Pocket Knives, Switchblades, Straight Razors, Small Kitchen Knives, etc."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Butcher, Knife Fighter, Murderer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Combat Focus"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Combat Focus"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chi Powers"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blind Fighting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blind Fighting")
                              )
                            ),
                            Core.vx_new_string(":Combo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any combat abilities may be strung together as a Combo. Every ability after the first gets +1 to initiative. If any ability misses or fails, then the combo ends and the next ability is at -1 initiative. Each combo must be chosen when this ability is gained and must be taken again for each separate combo.")
                              )
                            ),
                            Core.vx_new_string("Death Touch"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death Touch"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Five Point Palm Exploding Heart Technique - Kill Bill"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter strikes vulnerable pressure points, disrupting the opponent's chi flow causing intense pain or death. The effect has no outward effect, but the victim will know something is wrong. Eventually, the victim recovers or dies suddenly from the stress.\n-1 Action\n-2 Initiative\n-2 Accuracy\n+0 Damage - [Stun] only\n+3 Criticals - [Poison]\n0 Move\n-1 Defense"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dim Mak")
                              )
                            ),
                            Core.vx_new_string("Empty Force"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empty Force"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter projects a strike across empty space. The fighter\nmay strike at any range, but if he does not score at least 1\nCriticals for each space of Range, the ability fails.\n-2 Initiative\n-2 Move\n-1 Damage\nCritical - [Range]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Distant Death, Kongjin")
                              )
                            ),
                            Core.vx_new_string("Feather Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feather Walk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces body weight while active.  This increases the effects of [Retreat] and leaping while decreasing falling\nspeed and damage.\n* If [Skill] greater than or equal to [Body], then unit may walk on any substance that would suspend a feather."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Feather Fall, Walk on Water")
                              )
                            ),
                            Core.vx_new_string("Feign Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feign Death")
                              )
                            ),
                            Core.vx_new_string("Hold Breath"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hold Breath")
                              )
                            ),
                            Core.vx_new_string("Spirit Healing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Healing"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Chi Kung Healing")
                              )
                            ),
                            Core.vx_new_string("Team Combo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Team Combo"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Fastball Special - Colossus and Wolverine, X-men"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Like a [Combo], the Team Combo chains attacks together. The Team Combo\nhowever is performed by different members of a team with the identical\nTeam Combo. Any team member may perform each step of the combo with each\nsubsequent attack allowed to reroll 1 die. The combo ends if any attack\nmisses, any member attacks twice in a row, or if a turn passes with no\nattack attempt. Any combat abilities may be strung together as a Team\nCombo (even abilities that only others in the team possess). Each combo\nmust be chosen when this ability is gained and must be taken again for\neach separate combo.")
                              )
                            ),
                            Core.vx_new_string("Walk on Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Walk on Fire")
                              )
                            ),
                            Core.vx_new_string("Zen No Mind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zen No Mind"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The mind must always be in the state of 'flowing,' for when it stops anywhere that means the flow is interrupted...In the case of the swordsman, it means death.  When the swordsman stands against his opponent, he is not to think of the opponent, nor of himself, nor of his enemy's sword movements. ... When he strikes, it is not the man but the sword in the hand of the man's subconscious that strikes. - Zen Master Takuan Soho"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A mind not fixed or occupied by thought or emotion and thus open to everything.\n* Mushin is achieved when a fighter feels no anger, fear or ego during combat, so the fighter is totally free to act and react towards an opponent without hesitation. At this point, a person relies not on what they think should be the next move, but what is felt intuitively.\n* A martial artist would likely have to train for many years to be capable of mushin. This allows time for combinations of movements and exchanges of techniques to be practiced repetitively many thousands of times, until they can be performed spontaneously, without conscious thought."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mushin")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Evasion"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Evasion"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Evasion is a special defense typically used by those that choose to wear light or no Armor."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Defense"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blade Locking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blade Locking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: [Parry], May only be used against swords, knives or polearms.\n* [Reaction]: -2\n* [Success]: Opponent gains a [Broken Defense Token] for each [Hit]")
                              )
                            ),
                            Core.vx_new_string(":Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Can only be used vs Melee or Close Combat toward the left front or right front. May be used with or without a weapon.\n* [Reaction]: +1 Defense.")
                              )
                            ),
                            Core.vx_new_string(":Deflect"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deflect"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Deflect, catch, or even return projectiles hurled at the fighter.\n* This ability provides a second Defense roll against a projectile attack before the regular Defense roll.\n* [Reaction]\n+2 Initiative\n+1 Accuracy\n0 Damage - Any successes become -Damage to the projectile. If the projectile has 0 Damage remaining, it is caught.\nCriticals - Any Criticals become -2 Damage to the proejctile. If the projectile has 0 Damage remaining and there are still Criticals, the projectile may be immediately thrown at +[Criticals] Accuracy.")
                              )
                            ),
                            Core.vx_new_string("Dirty Fighting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dirty Fighting"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bite, Eye Gouge, Ear Pop, Hair Pulling, Low Blow")
                              )
                            ),
                            Core.vx_new_string(":Disarm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disarm"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Red Leaves Cut means knocking down the enemy's long sword. The spirit should be getting control of his sword. When the enemy is in a long sword attitude in front of you and intent on cutting, hitting and parrying, you strongly hit the enemy's sword with the Fire and Stones Cut... If you then beat down the point of his sword with a sticky feeling, he will necessarily drop the sword. If you practise this cut it becomes easy to make the enemy drop his sword. - Miyamoto Mushashi, The Book of Five Rings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Strike to knock a weapon or item from opponent's grasp.\n* This special ability does no damage but allows the user to force a target to drop an item (usually a weapon).\n-1 Initiative\n-1 Accuracy\n0 Damage. Opponent drops the chosen item. Each critical moves the item 1 space away (your choice)."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Red Leaves Cut")
                              )
                            ),
                            Core.vx_new_string(":Disengage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Disengage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter removes a [Hold] token.\n* [Reaction]\n+1 Initiative\n0 Damage\n-1 Move")
                              )
                            ),
                            Core.vx_new_string("Dive for Cover"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dive for Cover")
                              )
                            ),
                            Core.vx_new_string(":Dodge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dodge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Initiative\n-1 Action\n+1 Defense")
                              )
                            ),
                            Core.vx_new_string("Dodge Roll"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dodge Roll")
                              )
                            ),
                            Core.vx_new_string("Drunken Monkey Roll"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drunken Monkey Roll"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Crouching]\n-1 Action\n+2 Initiative\n+2 Move\n+1 Defense")
                              )
                            ),
                            Core.vx_new_string("Iron Horse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Horse"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Blob, X-men"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to prevent being moved.\n* [Passive]\n+1 Initiative\nDefense - When rolling Defense, [Hits] or [Criticals] can be exchanged for [Knockback] or [Knockdown] resistance.\n0 Move"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("San He")
                              )
                            ),
                            Core.vx_new_string("Iron Skin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Skin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Hardening of the skin to prevent cuts and punctures."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Maka Wara, Stone Skin")
                              )
                            ),
                            Core.vx_new_string(":Sidestep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sidestep")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Light Armor"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Light Armor")
                              )
                            ),
                            Core.vx_new_string(":Bucklers"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bucklers")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Melee"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Melee"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Mizu: I must become the greatest swordsman alive. Swordfather: Is that all? - Mizu and Swordfather, Blue Eye Samurai"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Targetting]: Melee combat may only be used to attack the 3 space directly ahead of you or the space you are on.\n* See Arms and Armor for weapons"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Battlemaster, Champion, Congueror, Fencer, Fighter, Master of Arms, Warrior"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Abdomen Timing of Two"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Abdomen Timing of Two"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Abdomen Timing of Two refers to feinting an attack, then striking an enemy as they are retracting from an attack, hitting them in the abdomen with the correct timing of either two moves or two seconds. Although the technique seems relatively simple, Musashi lists this as one of the hardest techniques to time correctly.")
                              )
                            ),
                            Core.vx_new_string("Anvil Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anvil Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [+1 Damage] when target is adjacent to solid terrain.")
                              )
                            ),
                            Core.vx_new_string(":Backlash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Backlash")
                              )
                            ),
                            Core.vx_new_string(":Bash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bash"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A quick. powerful smashing maneuver usually performed 'sidearm' with an ax, club, or staff.\n* Requires: [Blunt Weapon]\n+1 Initiative\n+1 Damage\nCriticals - [Knockback]")
                              )
                            ),
                            Core.vx_new_string("Blade Barrier"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blade Barrier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Creates a 3 space wide [Wall] directly in front of the unit by rapidly swinging the blade in a flashy display. Anything crossing this wall is subject to an [Opportunity Attack]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Wall of Swords")
                              )
                            ),
                            Core.vx_new_string("Blind Fighting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blind Fighting")
                              )
                            ),
                            Core.vx_new_string("Combat Sense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combat Sense")
                              )
                            ),
                            Core.vx_new_string("Continuous Cut"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Continuous Cut"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Flowing Water Cut is used when you are struggling blade to blade with the enemy. When he breaks and quickly withdraws trying to spring with his sword, expand your body and spirit and cut him as slowly as possible with your long sword, following your body like stagnant water. - Miyamoto Mushashi, The Book of Five Rings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: [+1 Defense].  If you are not hit, you may immediately attack as a free action at [-1 Attack]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flowing Water Cut")
                              )
                            ),
                            Core.vx_new_string("Dash Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dash Attack"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: May only move in a straight line this turn.\n* [Action]: [-1 Attack], May attack any number of adjacent opponents along path each at a cumulative -1.")
                              )
                            ),
                            Core.vx_new_string("Dazing Blow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dazing Blow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-2 Damage\nDamage - [Stun]\nCriticals - [Stun]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Pommel Strike")
                              )
                            ),
                            Core.vx_new_string("Dual Wield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dual Wield"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Not used on the battlefield where a shield would be more practical.\n* Used primarily for parrying during one on one duels.\n* Two longsword duelling was done by very skilled fighters in Italian duelling.\n* Dual katana Japanese styles also exist."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Using a Dagger, Hand Axe or Hammer in the off hand.")
                              )
                            ),
                            Core.vx_new_string(":Feint"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Feint"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Feints are maneuvers designed to distract or mislead, done by giving the impression that a certain maneuver will take place, while in fact another, or even none, will."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Kizeme")
                              )
                            ),
                            Core.vx_new_string("Fend Off"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fend Off"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Weapon with [Reach]\n* [Reaction]: If you hit with [Fend Off], the opponent may not move any closer to you this turn.")
                              )
                            ),
                            Core.vx_new_string("Fire and Stones Cut"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fire and Stones Cut"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Fires and Stones Cut means that when the enemy's sword and your sword clash together you cut as strongly as possible without raising the sword even a little. This means cutting quickly with the hands, body and legs - all three cutting strongly. If you train well enough you will be able to strike strongly. - Miyamoto Mushashi, The Book of Five Rings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: [+1 Defense]\n* [Action]: [+1 Attack], if you used this ability to [React] last turn.")
                              )
                            ),
                            Core.vx_new_string(":Fleche"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fleche"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A [Lunge] forward where the attacker continues to move forward past the defender to avoid a [Riposte] or Counter Attack.\n-1 Initiative\n+1 Move - May only move straight forward.\n+1 Damage")
                              )
                            ),
                            Core.vx_new_string("Follow Through"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Follow Through"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: If you hit with this ability, you may immediately turn to the left or right and attack a target in the next adjacent space. This may be repeated any number of times at [-1 Attack] per target after the first though each additional target must be in the same direction.")
                              )
                            ),
                            Core.vx_new_string(":Hamstring"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hamstring"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack the legs to slow the opponent.\n* [Action]\n-1 Accuracy\nCriticals - [Cripple]")
                              )
                            ),
                            Core.vx_new_string(":Impale"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Impale"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Spear\n* [Action]\n-1 Accuracy\nCriticals - [Piercing]")
                              )
                            ),
                            Core.vx_new_string(":Lunge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lunge")
                              )
                            ),
                            Core.vx_new_string("Offhanded Fighting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Offhanded Fighting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Normal Attack take a -2 penalty if performed with the non primary hand.  This ability negates that penalty when using this skill in the off hand.")
                              )
                            ),
                            Core.vx_new_string(":Parry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The fighter uses his weapon to block an opponent's attack.\n* [Reaction]\n+1 Initiative\n+2 Defense")
                              )
                            ),
                            Core.vx_new_string("Piercing Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piercing Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Trades damage to increase armor penetration.")
                              )
                            ),
                            Core.vx_new_string("Rapid Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rapid Strike"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("In One Timing means, when you have closed with the enemy, to hit him as quickly and directly as possible, without moving your body or settling your spirit, while you see that he is still undecided. The timing of hitting before the enemy decides to withdraw, break or hit, to be able to hit in the timing of an instant. - Miyamoto Mushashi, The Book of Five Rings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Wear loose clothing or less. (Armor Penalty = 0).\n* [Action]: Speed +1, Attack -1"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("In One Timing, Lightning Blow")
                              )
                            ),
                            Core.vx_new_string(":Riposte"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Riposte"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("When your swords clash together, in one motion when your sword springs away from theirs, use a continuous motion to slash their head, body and legs."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Speedy attack that can only be performed after a [Parry] or a [Block].\n* [Requires]: Previous Action was [Parry] or [Block]\n+2 Initiative\n+2 Attack"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Counter Strike")
                              )
                            ),
                            Core.vx_new_string("Set Against Charge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Set Against Charge")
                              )
                            ),
                            Core.vx_new_string(":Slash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slash"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A powerful blow with a cutting weapon.\n+1 Initative\n-1 Move\n+1 Accuracy\nCriticals - [Bleed]")
                              )
                            ),
                            Core.vx_new_string("Stunning Blow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stunning Blow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Attack]: Trades lethal damage for stunning damage.")
                              )
                            ),
                            Core.vx_new_string(":Sweep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sweep"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack the legs to trip the opponent.\n+1 Initative\n-1 Move\n-1 Damage\nCriticals - [Knockdown]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Trip")
                              )
                            ),
                            Core.vx_new_string("There are Many Enemies"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("There are Many Enemies"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("When you are fighting one against many, draw both sword and companion sword and assume a wide-stretched left and right attitude. The spirit is to chase the enemies around from side to side, even though they come from all four directions. Observe their attacking order, and go to meet first those who attack first. Sweep your eyes around broadly, carefully examining the attacking order, and cut left and right alternately with your swords. Waiting is bad. Always quickly re-assume your attitudes to both sides, cut the enemies down as they advance, crushing them in the direction from which they attack. Whatever you do, you must drive the enemy together, as if tying a line of fishes, and when they are seen to be piled up, cut them down strongly without giving them room to move. - Miyamoto Mushashi, The Book of Five Rings"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: [Duel Wield]\n* [Defense]: If [Surrounded], ignore opponents in front arc when determining [Surrounded] defense penalty.")
                              )
                            ),
                            Core.vx_new_string(":Thrust"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thrust"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Initiative\n+1 Move\nCritcals - [Piercing]")
                              )
                            ),
                            Core.vx_new_string("To Apply Stickiness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("To Apply Stickiness"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("When the enemy attacks and you also attack with the long sword, you should go in with a sticky feeling and fix your long sword against the enemy's as you receive his cut. The spirit of stickiness is not hitting very strongly, but hitting so that the long swords do not separate easily. It is best to approach as calmly as possible when hitting the enemy's long sword with stickiness. The difference between 'Stickiness' and 'Entanglement' is that stickiness is firm and entanglement is weak. - Miyamoto Mushashi, The Book of Five Rings")
                              )
                            ),
                            Core.vx_new_string("Weapon Block"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weapon Block"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Deflect, catch, or even turn strike back with a weapon used against the fighter.\n* This ability provides a second Defense roll against a weapon attack before the regular Defense roll.\n* [Reaction]\n+2 Initiative\n+1 Accuracy\n0 Damage - Any successes become -Damage to the weapon. If the weapon has 0 Damage remaining, it is caught.\nCriticals - Any Criticals become -2 Damage to the weapon. If the weapon has 0 Damage remaining and there are still Criticals, the weapon may be immediately used at +[Criticals] Accuracy. Note: The weapon remains in the hands of the attacker.")
                              )
                            ),
                            Core.vx_new_string("Whirlwind Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Whirlwind Attack"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows multiple attacks to different targets by trading accuracy for extra attacks.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Bladedancer"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bladedancer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A combat technique focusing on elegant moves that efficiently combine attack and defense. Heavy armor may not be used with this technique.")
                              )
                            ),
                            Core.vx_new_string(":Fensing"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fensing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A combat technique focusing on long quick blades like rapiers and epees."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fenser")
                              )
                            ),
                            Core.vx_new_string("Sword Saint"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sword Saint"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A combat technique focusing almost exclusively on mastery of the sword."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Kensai, Kensei")
                              )
                            ),
                            Core.vx_new_string(":Axes"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Axes"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Run to the bedroom,\nIn the suitcase on the left\nYou'll find my favorite axe.\nDon't look so frightened\nThis is just a passing phase,\nOne of my bad days. - Pink Floyd, One of My Turns"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Axeman")
                              )
                            ),
                            Core.vx_new_string("Flexible Weaponry"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flexible Weaponry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Backlash, Disarm, Trip"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hangman, Strangler")
                              )
                            ),
                            Core.vx_new_string(":Hammers"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hammers"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* War hammers were developed as a consequence of the ever more prevalent metal armors of the medieval battlefields during the 14th and 15th centuries. Swords were of little use against these armors. The war hammer could deal blows of tremendous force to the target, especially when mounted on a pole, and by impact alone do damage without penetrating the armor. The spike end could be used for grappling the target's armour, reins, or shield, or could be turned in the direction of the blow to pierce even heavy armor. Against mounted opponents, the weapon could also be directed at the legs of the horse, toppling the armored foe to the ground where he could be more easily attacked.\n* See Arms and Armor for weapons")
                              )
                            ),
                            Core.vx_new_string("Short Blades"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Short Blades"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Includes Short Swords, Daggers, Stilettos, Machetes, Large Kitchen Knives, etc.")
                              )
                            ),
                            Core.vx_new_string(":Polearms"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Polearms"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Fend Off"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Glaivemaster, Halberdier, Poleman")
                              )
                            ),
                            Core.vx_new_string(":Spears"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spears"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Fend Off, Impale, Set Against Charge, Shield Snare"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Lancer, Javelineer, Myrmidon, Peltast, Pikeman, Spartan, Spearman, Velite")
                              )
                            ),
                            Core.vx_new_string(":Staves"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Staves"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This specialty includes long staves and short sticks. Staves have longer reach than most weapons while fighting sticks attack with great speed.\n* [Bash], [Dazing Blow], [Disarm], [Fend Off], [Fleche], [Parry], [Riposte], [Sweep]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Arnis, Bojutus, Escrima, Kali, Stick Fighting")
                              )
                            ),
                            Core.vx_new_string(":Swords"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swords"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Book of Five Rings - Miyamoto Mushashi\n\nThe Gaze\n* The gaze should be large and broad. This is the twofold gaze 'Perception and Sight'. Perception is strong and sight weak.\n* In strategy it is important to see distant things as if they were close and to take a distanced view of close things. It is important in strategy to know the enemy's sword and not to be distracted by insignificant movements of his sword. The gaze is the same for single combat and for large-scale combat.\n* It is necessary in strategy to be able to look to both sides without moving the eyeballs. You cannot master this ability quickly. Learn what is written here: use this gaze in everyday life and do not vary it whatever happens.\n\nThe Five Attitudes\n* The five attitudes are: Upper, Middle, Lower, Right Side, and Left Side.  These are the five.\n* Although attitude has these five dimensions, the one purpose of all of them is to cut the enemy.\n* There are none but these five attitudes.\n* Whatever attitude you are in, do not be conscious of making the attitude; think only of cutting.\n\n* Middle Attitude - Confront the enemy with the point of your sword against his face.  When he attacks, dash his sword to the right and 'ride' it.  Or, when the enemy attacks, deflect the point of his sword by hitting downwards, keep your long sword where it is, and as the enemy renews the attack cut his arms from below.\n\n* When you master my Way of the long sword, you will be able to control any attack the enemy makes.  I assure you, there are no attitudes other than the five attitudes of the long sword of NiTo.\n\n* Upper Attitude - From the Upper attitude cut the enemy just as he attacks.  If the enemy evades the cut, keep your sword where it is and, scooping from below, cut him as he renews the attack.\n\n* You will always win with the five long sword methods. You must train repeatedly.\n\n* Lower Attitude - Adopt the Lower attitude, anticipating scooping up. When the enemy attackes, hit his hands from below.  As you do so, he may try to hit your sword down. If this is the case, cut his upper arm(s) horizontally with a feeling of 'crossing'. This means that from the Lower attitudes you hit the enemy at the instant that he attacks. You will encounter this method often, both as a beginner and in later strategy.\n* Left Side Attitude - Adopt the Left Side attitude. As the enemy attacks, hit his hands from below. If as you hit his hands he attempts to dash down your sword, with the feeling of hitting his hands, parry the path of his long sword and cut across from above your shoulder. Through this method you win by parrying the line of the enemy's attack.\n* Right Side Attitude - In the fifth approach, the sword is in the Right Side attitude. In accordance with the enemy's attack, cross your sword from below at the side to the Upper attitude. Then cut straight from above.\n* Cut and Slash - To cut and slash are two different things.  Cutting, whatever form of cutting it is, is decisive, with a resolute spirit. Slashing is nothing more than touching the enemy. Even if you slash strongly, and even if the enemy dies instantly, it is slashing. When you cut, your spirit is resolved. You must appreciate this. If you first slash the enemy's hands or legs, you must then cut strongly. Slashing is in spirit the same as touching. When you realise this, they become indistinguishable. Learn this well."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Melee - [Abdomen Timing of Two], [Continuous Cut], [Dash Attack], [Dazing Blow], [Fleche], [Fire and Stones Cut], [Parry], [Riposte], [Slash], [There Are Many Enemies], [Thrust], [To Apply Stickiness]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bushi, Fencer, Fencing, Kendo, Kenjutsu, Kensei, Ronin, Sword Saint, Samurai, Swordsman")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Ranged"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ranged"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Good. Bad. I'm the guy with the gun. - Ash, Army of Darkness"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archer, Javelineer, Slinger"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Arcing Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arcing Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Bow or Javelin\n* May fire over other units that block Line of Sight.")
                              )
                            ),
                            Core.vx_new_string("Barbed Javelin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barbed Javelin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Javelin\n* Criticals vs Large units are [Rage] Tokens.")
                              )
                            ),
                            Core.vx_new_string("Bowel Raker"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bowel Raker"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* +1 [Bleeding]\n* -1 [Piercing]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Serrated Arrow")
                              )
                            ),
                            Core.vx_new_string("Deadly Arrow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deadly Arrow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Bow or Crossbow\n* Increase weapon range by 50% and choose [Hit Location]")
                              )
                            ),
                            Core.vx_new_string("Double Shot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Double Shot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* -2 [Attack]\n* -1 [Piercing]\n* May attack two targets in same [Arc]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Double Throw")
                              )
                            ),
                            Core.vx_new_string("Explosive Shot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Explosive Shot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Bow or Crossbow")
                              )
                            ),
                            Core.vx_new_string("Flaming Arrow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flaming Arrow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Bow or Crossbow")
                              )
                            ),
                            Core.vx_new_string(":Fletching"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fletching"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of making arrows. High quality or specialized arrows are quickly used up and often impractical to buy. Creating your own is often a very practical solution."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bowyer")
                              )
                            ),
                            Core.vx_new_string("Knife Throwing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knife Throwing")
                              )
                            ),
                            Core.vx_new_string("Piercing Shot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piercing Shot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Bow or Crossbow\n* [Attack]: [+1 Armor Piercing]")
                              )
                            ),
                            Core.vx_new_string(":Richochet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Richochet"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Thrown Object")
                              )
                            ),
                            Core.vx_new_string("Shield Snare"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shield Snare"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Javelin, Target with shield\n* [Attack]: Criticals are [Encumberance] Tokens.")
                              )
                            ),
                            Core.vx_new_string("Signal Shot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Signal Shot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Alert allied units by sending a prearranged signal. This can be flaming arrow at night, smoking arrow, singing arrow, etc.\n* [Requires]: Bow or Crossbow\n* [Action]: For the rest of the turn, other units adjacent to this unit may be treated as if under the [Sphere of Command] of any allied Commander.")
                              )
                            ),
                            Core.vx_new_string("Stunning Throw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stunning Throw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Thrown Object\n* Trades lethal damage for stunning damage.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Archery"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Archery"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Bowel Raker, Double Shot, Flaming Arrow"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Archer, Archer Elite, Bowman, Crossbowman, Longbowman")
                              )
                            ),
                            Core.vx_new_string("Thrown Weapons"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thrown Weapons"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("You? You're very good. But me? I'm magic. - Bullseye, Daredevil Comics"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Barbed Javelin, Double Shot, Knife Throwing, Precision Throw, Shield Snare"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Knife Thrower, Javelineer, Slinger")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Firearms"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firearms"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Crackshot, Marksman, Rifleman, Sharpshooter, Sniper"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Anti-Personnel"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anti-Personnel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [+1 Damage] or [-1 Damage] vs. 2 or more Armor"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hollow Point")
                              )
                            ),
                            Core.vx_new_string("Armor Piercing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armor Piercing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Enemy at [-2 Armor]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Depleted Uraniumn")
                              )
                            ),
                            Core.vx_new_string(":Autofire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Autofire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Weapon with [Autofire]\n-1 [Attack]\n* [Action]: Target 2 adjacent units.")
                              )
                            ),
                            Core.vx_new_string("Chemical Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chemical Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [-1 Damage], [Critical Hits] are [Acid]")
                              )
                            ),
                            Core.vx_new_string("Fast Draw"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fast Draw"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Hand weapon\n* Spend 1 Speed to draw a Hand weapon from holster to hip where he can [Shoot From The Hip].")
                              )
                            ),
                            Core.vx_new_string("Gyrojet Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gyrojet Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [+1 Damage] at Long Range, [-1 Damage] at Short Range"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Rocket Rounds")
                              )
                            ),
                            Core.vx_new_string("High Explosive Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("High Explosive Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Use [Blast] rules for targetting and damage."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Explosive Rounds")
                              )
                            ),
                            Core.vx_new_string(":Hipshoot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hipshoot")
                              )
                            ),
                            Core.vx_new_string("Non-Lethal Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Non-Lethal Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [-2 Damage] vs. 2 or more Armor.  Half of all [Damage] is [Stun] instead."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Rubber Bullets")
                              )
                            ),
                            Core.vx_new_string("Paint Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paint Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [0 Damage], [Critical Hits] are [Stun]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Paintball")
                              )
                            ),
                            Core.vx_new_string("Pin Down"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pin Down")
                              )
                            ),
                            Core.vx_new_string("Rapid Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rapid Fire")
                              )
                            ),
                            Core.vx_new_string(":Scattershot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scattershot"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Choose a target starting from the closest.\n* If a hit is scored, roll another attack on the same target.\n* If no hit scored, roll against next target.\n* -1 for each Space of Range (Cone), -1 per roll (cumulative, inclusive).\n* Criticals can be used for additional damage rolls (multiple Hits)\n* If target was [Armor], that Armor is at +2 vs this attack"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Glaser, Shot")
                              )
                            ),
                            Core.vx_new_string(":Sniper"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sniper"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The snipe (a family of shorebirds) is difficult to catch for experienced hunters, so much so that the word 'sniper' is derived from it to refer to anyone skilled enough to shoot one.\n* I aim to win and my aim... is Excellent. - Caitlyn, Runeterra"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Long Range Weapon\n* Increase weapon range by 50% and choose [Hit Location]")
                              )
                            ),
                            Core.vx_new_string("Supressive Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Supressive Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Firing weapons at enemy forces with the primary goal of forcing them to remain under cover.\n* [Requires]: Weapon with [Autofire]\n* [Action]: Target a unit that has not been activated this turn, all [Hits] and [Critical Hits] are [Stun] tokens.\n+1 Attack"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Covering Fire")
                              )
                            ),
                            Core.vx_new_string("Tracer Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tracer Rounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: [Auto], Must attack same target on subsequent round.\n* [Action]: [+1 Attack], [-1 Damage].")
                              )
                            ),
                            Core.vx_new_string("Tracking Rounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tracking Rounds")
                              )
                            ),
                            Core.vx_new_string(":Auto"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Cost\n* Criticals can be used for additional damage rolls (multiple hits).")
                              )
                            ),
                            Core.vx_new_string(":Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blast")
                              )
                            ),
                            Core.vx_new_string(":Bombardment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bombardment")
                              )
                            ),
                            Core.vx_new_string(":Capacitors"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Capacitors"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Uses capacitors that can recharge 1 shot a turn from a power source rated at the same power level as a single shot.  Cannot be used with lower energy power sources.")
                              )
                            ),
                            Core.vx_new_string(":Electroshock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Electroshock"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Taser")
                              )
                            ),
                            Core.vx_new_string("Extra Ammo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Extra Ammo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 2x number of shots, each time this modifier is taken.")
                              )
                            ),
                            Core.vx_new_string("Flash Surpressor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flash Surpressor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces the muzzle flare of the weapon making it more difficult to visually locate the shooter.")
                              )
                            ),
                            Core.vx_new_string("Gun Mount"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gun Mount"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bipod, Tripod")
                              )
                            ),
                            Core.vx_new_string(":Overcharge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overcharge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Consume 2 shots to to 1 extra damage. Then Damage is -1 until repaired.")
                              )
                            ),
                            Core.vx_new_string("Overload Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overload Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Detonate the entire weapon magazine (and the weapon) as an explosive with force equal to the total power in the magazine.")
                              )
                            ),
                            Core.vx_new_string(":Rechargable"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rechargable"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Uses batteries that can be slowly recharged from any power source.")
                              )
                            ),
                            Core.vx_new_string("Recoil Compensator"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Recoil Compensator"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces the 'kick' of the weapon and therefore reduces the penalty for\ncontinuous fire.")
                              )
                            ),
                            Core.vx_new_string(":Silencer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Silencer")
                              )
                            ),
                            Core.vx_new_string("Smoke Generator"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smoke Generator")
                              )
                            ),
                            Core.vx_new_string("Targeting Laser"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Targeting Laser")
                              )
                            ),
                            Core.vx_new_string("Telescopic Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Telescopic Sight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Reduces penalties for Medium Range to Short Range and Long Range to Medium Range")
                              )
                            ),
                            Core.vx_new_string(":Turret"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Turret"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Tokens/Arrow.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("+1 Cost\n* Turret mounted weapons may turn their turret toward any direction and fire from the side the turret is facing.\n* Turrets are normally assumed to be facing forward.  At the beginning of its [Action], a unit may change the turret facing by 1 side (Use a [Vector] Token) indicate where the Turret is pointing.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Energy Weapons"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Energy Weapons"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Whoa, whoa, whoa! Nice shootin', Tex! - Ghostbusters")
                              )
                            ),
                            Core.vx_new_string(":Handguns"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Handguns")
                              )
                            ),
                            Core.vx_new_string(":Rifles"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rifles")
                              )
                            ),
                            Core.vx_new_string(":Shotguns"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shotguns")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Gunnery"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gunnery"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Gunnery skill cannot exceed level 5 - Because advanced weapons are mostly point and shoot, weapon skill has less to do with the gunner and more to do with the weapon and its control system. Further, advanced weapons technologies come in a multitude of variations with constantly changing interfaces therefore it is very difficult to dedicate oneself to a single system to become an expert.\n* See Arms and Armor for weapons"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Artillerist, Bombardier, Field Ops, Gunner"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Air Burst"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Air Burst")
                              )
                            ),
                            Core.vx_new_string(":Barrage"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barrage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A barrage is a line or barrier of exploding shells from a large number of guns firing continuously.  Its purpose is to deny or hamper enemy passage.  It contrasts with a concentration, in which all the guns aim at the same small area.\n\nThe barrage was developed in World War I, with the infantry following the advancing barrage.  Its employment in this way recognised the importance of artillery fire in neutralising, rather than destroying, the enemy.  A creeping barrage immediately followed by an infantry assault could be far more effective than weeks of preliminary bombardment.")
                              )
                            ),
                            Core.vx_new_string("Forward Observer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forward Observer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: When unit has [Line of Sight] on a opponent, any number of units with [Indirect Fire] may attack that unit even if they do not have [Line of Sight].")
                              )
                            ),
                            Core.vx_new_string("Indirect Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Indirect Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("-2 Attack\n-2 Damage\n* Other units do not block [Line of Sight].\n* See: [Forward Observer]\n* See: [HE - High Explosives]")
                              )
                            ),
                            Core.vx_new_string("Point Defense"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Point Defense")
                              )
                            ),
                            Core.vx_new_string(":Salvo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Salvo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The simultaneous discharge of weapons, rather than scattered 'fire at will'.\n* Up to 10 weapons of the same type can be in 1 Salvo.\n* All targets in the space are attacked.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Cannons"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cannons")
                              )
                            ),
                            Core.vx_new_string(":Flamethrowers"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flamethrowers")
                              )
                            ),
                            Core.vx_new_string(":Machineguns"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Machineguns")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Physical Power"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Physical Power"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This skill is used when manifesting and controlling a [Power] that directly affect physical objects.\n* Physical Powers must have clear range and line of sight on a target."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Body"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Gunnery Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunnery Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Use [Gunnery] and a Gunnery item instead of [Physical Power] to manifest a [Physical] [Ability] on contact.")
                              )
                            ),
                            Core.vx_new_string("Firearm Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firearm Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can use [Firearms] and Firearm item instead of [Physical Power] to manifest a [Physical] [Ability] on contact.")
                              )
                            ),
                            Core.vx_new_string("Close Combat Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Close Combat Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can use [Close Combat] instead of [Physical Power] to manifest a [Physical] [Ability] on contact.")
                              )
                            ),
                            Core.vx_new_string("Melee Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Use [Melee] and a Melee item instead of [Physical Power] to manifest a [Physical] [Ability] on contact.")
                              )
                            ),
                            Core.vx_new_string("Ranged Power"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ranged Power"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Can use [Ranged] and a Ranged item of [Physical Power] to manifest a [Physical] [Ability] on contact.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Mental Power"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mental Power"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This skill is used when manifesting and controlling a [Power] that directly affect the [Mind] of targets.\n* Mental Powers must have range and be able to 'see' the target."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Mental Challenge"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mental Grip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Grip")
                              )
                            ),
                            Core.vx_new_string("Mental Gymnastics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Gymnastics")
                              )
                            ),
                            Core.vx_new_string("Mind Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mind Whip")
                              )
                            ),
                            Core.vx_new_string("Psionic Blade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psionic Blade")
                              )
                            ),
                            Core.vx_new_string("Psionic Knife"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psionic Knife")
                              )
                            ),
                            Core.vx_new_string("Intellect Fortress"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Intellect Fortress")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Psychic Power"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Psychic Power"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This skill is used when manifesting and controlling a [Power] that directly affect the [Will] of targets.\n* Psychic Powers must have range and see or 'know' the target."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Psychic Combat, Psychological Warfare, Soul Combat, Spirit Combat, Test of Will"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Will"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Ego Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ego Whip")
                              )
                            ),
                            Core.vx_new_string("Psychic Knife"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psychic Knife")
                              )
                            ),
                            Core.vx_new_string("Tower of Iron Will"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tower of Iron Will")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Command"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Command"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Generals are in the business of getting people killed. Captains like to keep theirs alive. You wanna put on a parade? Go find a general. You wanna fight your way home? Talk to me. - Obregon Kaine, Negation Comic\n* Well hello mister fancy pants. I got news for you pal. You ain't leading but two things right now: Jack and Shit and Jack left town. - Ash, Army of Darkness\n* And when Alexander saw the breadth of his domain, he wept for there were no more worlds to conquer. - Hans Gruber, Die Hard"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Captain, Castellan, Commander, Drillmaster, Drill Sergeant, Major, Overlord, Sergeant,\nWarchief, Warlord"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Call to Arms"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call to Arms"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Unite. Take up arms.\nStand shoulder to shoulder with your brothers and sisters.\nAnd break free from the cold shackles of oppression.\n\nLiberty for all is more noble than the preservation of one's soul.\nDestiny and valor will meet at the end of the sword.\nAnd the tales of heroic sacrifice will be the legend of a new age.\n\nThere will be no respite.\nThere will be no surrender.\nOnly glory and honor.\nThe price will be high for the greatest prize of all.\nStand and be counted among those that dared.\nThose who dared to fight for their freedom. - Glass Fleet"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Gather a war party from the populace")
                              )
                            ),
                            Core.vx_new_string("Chain of Command"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chain of Command"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: [Activate] up to [Command] units directly or indirectly adjacent to this unit. These units (including this one) may spend [Speed] or [Actions] in any order this [Turn].\n* [Interrupt]: May not be used as an Interrupt.")
                              )
                            ),
                            Core.vx_new_string(":Rally"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rally")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Military"),
                    Core.f_new(
                      Base.t_skill,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Military"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* He can't make that kind of decision.  He's just a grunt!  No offense.  None taken - Burke and Hicks, Aliens\n* I think we'd better split up...Yeah... we can do more damage that way. - Ghostbusters\n* If ten times the enemy's strength, surround them; If five times, attack them; If double, divide them; If equal, be able to fight them; If fewer, be able to evade them; If weaker, be able to avoid them. - Sun Tzu\n* Warfare is the art of deception. Thus although you are capable, display incapability to them. When your objective is nearby, make it appear distant; when it is far away, create the illusion of being nearby. - Sun Tzu, The Art of War"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Admiral, Brigade, Brigadier, Cadet, Centurion, Colonel, Commander, Commando, Conscript, Corporal, Field Marshal, Footman, Gamesman, General, Grunt, High Guard, Honor Guard, Infantry, Legionnaire, Lieutenant, Praetor, Praetorian Guard, Reserves, Royal Guard, Soldier, Soldier of Fortune, Strategist, Tactician, Vanguard"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Will"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Airborne Assault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Airborne Assault")
                              )
                            ),
                            Core.vx_new_string("Amphibious Assault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amphibious Assault")
                              )
                            ),
                            Core.vx_new_string(":Besiege"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Besiege")
                              )
                            ),
                            Core.vx_new_string("Bomb Disposal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bomb Disposal"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I'll tell you a dirty little secret. When you're in the middle of an explosion, it's the ultimate rush. - Haggerty, Obliterated\n* Who has one thumb and just saved Las Vegas? This guy! - Hagerty, Obliterated")
                              )
                            ),
                            Core.vx_new_string("Close Assault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Close Assault"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: If a [Vehicle] is adjacent to this unit, you may target the Top Armor.  If the unit has explosives, it may target the Under Armor.")
                              )
                            ),
                            Core.vx_new_string("Combat Driver"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Combat Driver"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Experienced in fighting in a car.")
                              )
                            ),
                            Core.vx_new_string(":Demolitions"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demolitions"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Experienced with setting up large explosives to destroy large structures.")
                              )
                            ),
                            Core.vx_new_string("Divide and Conquer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divide and Conquer")
                              )
                            ),
                            Core.vx_new_string("Diversionary Tactics"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Diversionary Tactics")
                              )
                            ),
                            Core.vx_new_string(":Explosives"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Explosives"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Experienced using various small explosives in combat.")
                              )
                            ),
                            Core.vx_new_string("Field Fortifications"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Field Fortifications")
                              )
                            ),
                            Core.vx_new_string("Formation: Back to Back"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Back to Back"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Not strictly a formation, units with their backs against each other largely protect each other's back.")
                              )
                            ),
                            Core.vx_new_string("Formation: Cover"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Cover"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Not strictly a formation, units in Cover formation stay close enough together to protect each other's sides.")
                              )
                            ),
                            Core.vx_new_string("Formation: March"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: March"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Units move in columns.\n* [+1 Speed]")
                              )
                            ),
                            Core.vx_new_string("Formation: Parade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Parade"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: A showy formation designed to look good.  Has no use in battle.\n* [+ 1 Intimidation]")
                              )
                            ),
                            Core.vx_new_string("Formation: Phalanx"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Phalanx"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* With his friends jostling and pushing on both sides and behind, and his enemies forming a solid wall in front of him, the hoplite had little opportunity for feats of technique and weapon skill, but great need for commitment and mental toughness. The hoplites had to trust their neighbors for mutual protection, so a phalanx was only as strong as its weakest elements. Its effectiveness depended on how well the hoplites could maintain this formation while in combat, and how well they could stand their ground, especially when engaged against another phalanx. The more disciplined and courageous the army, the more likely it was to win. The Greek word dynamis, the 'will' or 'ability to fight,' was used to express the drive that kept hoplites in formation."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Focuses on offense using Melee attacks with Reach.\n* [Requires]: At least half must have Weapons with Reach 2+.\n* [+1 Attack], [+1 Defense] from Front\n* [-1 Defense] from Rear")
                              )
                            ),
                            Core.vx_new_string("Formation: Shield Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Shield Wall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Uses shields to form a wall.\n* [Requires]: At least half must have Shields.\n+1 Defense from Front.")
                              )
                            ),
                            Core.vx_new_string("Formation: Skirmish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Skirmish"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Acting as light infantry with their light arms and minimal armor, they could run ahead of the main battle line, release a volley of arrows, slingshots or javelins, and retreat behind their main battle line before the clash of the opposing main forces. The aims of skirmishing were to disrupt enemy formations by causing casualties before the main battle, and to tempt the opposing infantry into attacking prematurely, throwing their organization into disarray. Skirmishers could also be effectively used to surround opposing soldiers in the absence of friendly cavalry."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Units move in loose shapes.\n* [Requires]: Only [Light Infantry].\n* [Move]: Ignore 1 [Terrain Penalty].\n* [+1 Defense] vs Ranged or Large Units\n* [+1 Defense] when in Terrain with Defense bonus\n* [-1 Defense] vs Small Melee and Close Combat Units"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Skirmisher")
                              )
                            ),
                            Core.vx_new_string("Formation: Testudo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Testudo"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Skills/Testudo.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Uses shields to form a shell around a unit.\n* [Requires]: At least half must have Shields.\n* [+2 Defense] vs Ranged\n* Shields protect all sides\n* Cannot Attack"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tortoise Formation, Turtle Up")
                              )
                            ),
                            Core.vx_new_string("Formation: Tight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Tight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Units stay tightly packed to maximize Melee defense.\n* [+1 Defense] vs Melee and Close Combat.\n* [-1 Defense] vs Ranged")
                              )
                            ),
                            Core.vx_new_string("Formation: Wedge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Formation: Wedge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Formation]: Units move in triangle and focus on breaking enemy formations.\n* [+1 Retreat] Token if unit inflicts at least 1 [Retreat].")
                              )
                            ),
                            Core.vx_new_string(":Fortifications"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fortifications")
                              )
                            ),
                            Core.vx_new_string("Halo Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Halo Drop")
                              )
                            ),
                            Core.vx_new_string("Jump Suit Combat"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jump Suit Combat")
                              )
                            ),
                            Core.vx_new_string("Military Vehicle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Military Vehicle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Every vehicle unit is assumed to have this ability. Units that are not vehicles must take this ability for each vehicle.")
                              )
                            ),
                            Core.vx_new_string("Mine Clearing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mine Clearing")
                              )
                            ),
                            Core.vx_new_string("Mine Laying"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mine Laying")
                              )
                            ),
                            Core.vx_new_string("Mobile Infantry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mobile Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Experienced with powered armor.")
                              )
                            ),
                            Core.vx_new_string("Orbital Halo Drop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Orbital Halo Drop")
                              )
                            ),
                            Core.vx_new_string("Parachute Assault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parachute Assault")
                              )
                            ),
                            Core.vx_new_string(":Sapping"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sapping"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* If it was important, then they should have built it better. - Desert Naturalist, Runeterra")
                              )
                            ),
                            Core.vx_new_string("Space Combat"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Combat")
                              )
                            ),
                            Core.vx_new_string("Urban Assault"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Urban Assault")
                              )
                            ),
                            Core.vx_new_string("Wingsuit Combat"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wingsuit Combat")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Siegecraft"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Siegecraft"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Besiege\n* Fortifications\n* Sapping"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Sapper")
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
        "nx/tactics/books/combat", // pkgname
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
      output = Combat.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Combat.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Combat.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Combat.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Combat"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Warrior.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Combat Overview"),
            Combat.f_chapter_combat_overview(),
            Core.vx_new_string("Example of Play"),
            Combat.f_chapter_example_of_play(),
            Core.vx_new_string("Rules"),
            Combat.f_chapter_rules(),
            Core.vx_new_string("Skills"),
            Combat.f_chapter_skills(),
            Core.vx_new_string("Early Weaponry"),
            Combat.f_chapter_early_weaponry(),
            Core.vx_new_string("Modern Equipment"),
            Combat.f_chapter_modern_equipment(),
            Core.vx_new_string("Advanced Weaponry"),
            Combat.f_chapter_advanced_weaponry()
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
    mapfunc.put("chapter_advanced_weaponry", Combat.t_chapter_advanced_weaponry);
    mapfunc.put("chapter_combat_overview", Combat.t_chapter_combat_overview);
    mapfunc.put("chapter_early_weaponry", Combat.t_chapter_early_weaponry);
    mapfunc.put("chapter_example_of_play", Combat.t_chapter_example_of_play);
    mapfunc.put("chapter_modern_equipment", Combat.t_chapter_modern_equipment);
    mapfunc.put("chapter_rules", Combat.t_chapter_rules);
    mapfunc.put("chapter_skills", Combat.t_chapter_skills);
    mapfunc.put("tacticsbook", Combat.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/combat", maptype, mapconst, mapfunc);
  }

}
