package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Giant_monsters {

  /**
   * @function chapter_daikaiju
   * @return {chapter}
   * (func chapter_daikaiju)
   */
  public static interface Func_chapter_daikaiju extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_daikaiju();
  }

  public static class Class_chapter_daikaiju extends Core.Class_base implements Func_chapter_daikaiju {

    @Override
    public Func_chapter_daikaiju vx_new(Object... vals) {
      Class_chapter_daikaiju output = new Class_chapter_daikaiju();
      return output;
    }

    @Override
    public Func_chapter_daikaiju vx_copy(Object... vals) {
      Class_chapter_daikaiju output = new Class_chapter_daikaiju();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/giant_monsters", // pkgname
        "chapter_daikaiju", // name
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
    public Func_chapter_daikaiju vx_empty() {return e_chapter_daikaiju;}
    @Override
    public Func_chapter_daikaiju vx_type() {return t_chapter_daikaiju;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Giant_monsters.f_chapter_daikaiju();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_daikaiju() {
      return Giant_monsters.f_chapter_daikaiju();
    }

  }

  public static final Func_chapter_daikaiju e_chapter_daikaiju = new Giant_monsters.Class_chapter_daikaiju();
  public static final Func_chapter_daikaiju t_chapter_daikaiju = new Giant_monsters.Class_chapter_daikaiju();

  public static Base.Type_chapter f_chapter_daikaiju() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Daikaiju"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Human Forces"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Human Forces"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Bombers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bombers")
                      )
                    ),
                    Core.vx_new_string(":Helicopters"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Helicopters")
                      )
                    ),
                    Core.vx_new_string(":Fighters"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fighters"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/FighterToken.png")
                      )
                    ),
                    Core.vx_new_string(":Tanks"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tanks"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/TankToken.png")
                      )
                    ),
                    Core.vx_new_string("Mobile Missile Launchers"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mobile Missile Launchers"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/MobileMissileToken.png")
                      )
                    ),
                    Core.vx_new_string(":Missiles"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Missiles"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Modern/MissilesToken.png")
                      )
                    ),
                    Core.vx_new_string("Dimension Tide"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dimension Tide"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/DimensionTide.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Creates a dimensional hole the size of a building.  For the next few seconds, all matter nearby is sucked into\nthe hole (presumably never to return).  No one knows where the matter goes, but it is known that after the\ndimension tide passed a dimensional disturbance remained through which a creature passed onto our world.")
                      )
                    ),
                    Core.vx_new_string("Type 66 Maser Cannon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Type 66 Maser Cannon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MaserCannonToken.png"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("6m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("15m")
                      )
                    ),
                    Core.vx_new_string("Super X"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super X"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/SuperXToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flight at mach 1\n* Cadmium Missiles\n* Laser Cannons\n* equipped with a wide variety of missiles\n* heat resistant layer"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("11m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("27m")
                      )
                    ),
                    Core.vx_new_string("Super X-II"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super X-II"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/SuperX2.png")
                      )
                    ),
                    Core.vx_new_string("Super X-III"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Super X-III"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/SuperX3Token.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight at mach 1.7; can fire a Freezer Beam; equipped with Cadmium Missiles; heat resistant layer"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("220tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("7.4m"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("38.5m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("58.7m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Allied Monsters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Allied Monsters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Gamera"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gamera"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GameraToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flight at Mach 3.5 using rockets contained in limbs\n* Plasma fireballs\n* Elbow claws\n* Can open plates in his chest and fire a Mana Blast\n* Can swim at 180 knots\n* Burrowing ability\n* Able to absorb and manipulate fire\n* Can draw more power by establishing a link with a human host\n* Orign - Believed to be over 150 million years old and created by an ancient civilization as a guardian of the Earth.\n* Armor - So tough that it survived the shock of a nuclear weapon."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("120tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("80m")
                      )
                    ),
                    Core.vx_new_string("Mecha King Ghidorah"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mecha King Ghidorah"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MechaKingGhidorahToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Antigravity flight at mach 4; able to fire Gravity beams from its mouths on the left and right head; can fire a Laser Triple beam from the central head; equipped with Godzilla Capture Cables and the large Machine Hand restraint that can also discharge electricity"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("80ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("140m")
                      )
                    ),
                    Core.vx_new_string(":Mechagodzilla"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mechagodzilla"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MechaGodzillaToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight at mach 2; Mega-Buster ray from mouth; paralysis missiles; Super Heat Shield NT-20, laser beam eyes; Plasma Grenade that fires energy absorbed by the Super Heat Shield; 'G-Crusher;' shock anchors and cables; dual Garuda shoulder mounted laser cannons"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("150ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("120m")
                      )
                    ),
                    Core.vx_new_string(":Mogera"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mogera"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MogeraToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight at mach 1; can travel through space at mach 44; able to fire Plasma Laser Cannons from eyes; equipped with a rotating drill for a nose; able to fire a beam from its chest; can launch Spiral Grenade missiles from its hands; has treads under feet for faster movement on land; able to fire lasers from its two hands; can separate into the Star Falcon and Land Moguera"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("160ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("120m")
                      )
                    ),
                    Core.vx_new_string(":Mothra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mothra"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MothraToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flight at mach 3\n* can travel through space\n* hurricane winds from wings\n* antenna ray-shooting beams\n* can release powder from her wings that will reflect energy attacks back on their source\n* able to conduct energy through its touch or release it as strands of lightning from her wings"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("20ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("65m")
                      )
                    ),
                    Core.vx_new_string("Mothra, Larva"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mothra, Larva"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MothraLarvaeToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Web Attack"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("15ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("120m")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Enemy Monsters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Enemy Monsters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Battra"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battra"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/BattraToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight at mach 3; can travel through space; hurricane winds from wings; able to shoot Prism beams from eyes; can conduct energy through its touch"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("30ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("73m")
                      )
                    ),
                    Core.vx_new_string("Battra, Larva"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battra, Larva"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/BattraLarvaeToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Burrowing ability; adept swimmer; able to shoot Prism beams from horn and eyes; body can generate energy pulses to attack others with its touch"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("20ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("90m")
                      )
                    ),
                    Core.vx_new_string(":Biollante"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Biollante"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Biollante.png")
                      )
                    ),
                    Core.vx_new_string(":Destroyah"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Destroyah"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Destroyah.png")
                      )
                    ),
                    Core.vx_new_string(":Godzilla"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Godzilla"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GodzillaToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Superheated atomic breath capable of devastating whole city blocks\n* Remarkably fast regenerative healing factor\n* Incredibly strong, even for his size\n* Able to swim at 40 knots\n* Though extremely powerful, possesses a few weaknesses: has an aversion to electricity, can be weakened by massive amounts of cadmium and other radiation-retardants"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("60ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("100m"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Radiation Powers"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Radiation Powers"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Radiation Beam"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Radiation Beam")
                                      )
                                    ),
                                    Core.vx_new_string("Radiation Blast"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Radiation Blast")
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
                    Core.vx_new_string(":Gyaos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gyaos"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GyaosToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flight at mach 4.2\n* Hurricane winds from wings\n* A shrill cry serves as an ultrasonic scalpel which amounts to approximately 3 million Hz, and can also cut\nthrough solid steel bards with a thickness of 30cm.\n* Can reproduce asexually\n* Gyoas easily adapts to its surroundings, growing exponentially in size.\n* Gyaos has one absolutely perfect pair of chromosomes.\n* Origin - Gyaos was the product of genetic engineering by a super-ancient civilization.\n* Vision - As a nocturnal creature, Gyaos avoids and dislikes light."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("75tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("85m"),
                        Core.vx_new_string(":width"),
                        Core.vx_new_string("185m")
                      )
                    ),
                    Core.vx_new_string("King Ghidorah"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("King Ghidorah"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/KingGhidorahToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Speed Mach 3\n* Able to fire Gravity beams from its mouths\n* hurricane winds from wings\n* constricting necks"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("70ktons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("140m")
                      )
                    ),
                    Core.vx_new_string(":Legion"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Legion"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/LegionToken.png"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("And he asked him, What is thy name? And he answered, saying, My name is Legion: for we are many. - New Testament - Mark 5:9"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Silicone-based life form with cell structure like transistors\n* Joints operate by pressurized gas.\n* Communicates via electromagnetic waves\n* Launches seeds into orbit by generating a high oxygen area and then detonating it.\nFlight at mach 1; sharp horn, which can open to fire a beam; horn generates a tremendous amount of heat after firing; can burrow and travel, underground, at a speed of 50 kilometers an hour; able to produce up to 100 Symbiotic Legion an hour; can create a magnetic force shield to protect the front of its body using the ten smaller legs near its head; if its horn is destroyed Legion can fire off strands of energy that are able to pierce and burn objects\nEye: Legion can see electro-magnetic activity.\nVoice: The Legion Mother's microwave blast, which eminates from her huge tusks is powerful enough to vaporize a type-90 tank with one blow.\nOvaries: Legion's ovaries house a hive of countless soldiers that can be ordered to attack instantly. It is estimated that she can reproduce approximately 100 soldiers every hour.\nAppendages: Legion's many appendages are used in both battle and burrowing; while they quickly assist in breaking up even the toughest earth, these deadly arms were seen puncturing Gamera's shell.\nArmored Exoskeleton: Made of a hard silicone-like resin, Legion's exo-skeleton is not only an insulator but protects her body from attacks.\nInterference wave-blast: Generated in the shape of a parabola, it acts as a shield. Legion was seen disabling the automatic targeting system of missles with this abilaity."),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("600tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("140m")
                      )
                    ),
                    Core.vx_new_string(":Megaguirus"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Megaguirus"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MegaguirusToken.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight at mach 4; hurricane winds and sonic waves from wings; claws; stinger with the ability to drain power; claw tipped wings; able to use stinger to discharge a blast of energy comprised of its opponent's beam weapon which it absorbed; flight causes electronic disturbances"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("12ktons"),
                        Core.vx_new_string(":length"),
                        Core.vx_new_string("50m")
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
   * @function chapter_giant_robots
   * @return {chapter}
   * (func chapter_giant_robots)
   */
  public static interface Func_chapter_giant_robots extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_giant_robots();
  }

  public static class Class_chapter_giant_robots extends Core.Class_base implements Func_chapter_giant_robots {

    @Override
    public Func_chapter_giant_robots vx_new(Object... vals) {
      Class_chapter_giant_robots output = new Class_chapter_giant_robots();
      return output;
    }

    @Override
    public Func_chapter_giant_robots vx_copy(Object... vals) {
      Class_chapter_giant_robots output = new Class_chapter_giant_robots();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/giant_monsters", // pkgname
        "chapter_giant_robots", // name
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
    public Func_chapter_giant_robots vx_empty() {return e_chapter_giant_robots;}
    @Override
    public Func_chapter_giant_robots vx_type() {return t_chapter_giant_robots;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Giant_monsters.f_chapter_giant_robots();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_giant_robots() {
      return Giant_monsters.f_chapter_giant_robots();
    }

  }

  public static final Func_chapter_giant_robots e_chapter_giant_robots = new Giant_monsters.Class_chapter_giant_robots();
  public static final Func_chapter_giant_robots t_chapter_giant_robots = new Giant_monsters.Class_chapter_giant_robots();

  public static Base.Type_chapter f_chapter_giant_robots() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Giant Robots"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Allied Robots"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Allied Robots"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Getter 1"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter 1"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Getter_1.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 18knots\n* Flight: Mach 2"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("420kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("220tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("38m"),
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
                                Core.vx_new_string("* Getter Beam\n* Tomahawk Boomerang"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Getter 2"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter 2"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Getter_2.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 18knots\n* Ground Speed: Mach 3!\n* Tunnelling: 300kph"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("420kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("220tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("38m"),
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
                                Core.vx_new_string("* Getter Drill\n* Drill Missile"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Getter 3"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter 3"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Getter_3.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 28knots\n* Flight: Mach 3"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("150kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("220tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("20m"),
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
                                Core.vx_new_string("* Getter Missile"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Getter G Dragon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter G Dragon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GetterG_Dragon.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flight: Mach 3.5"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("330tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("50m"),
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
                                Core.vx_new_string("* Getter Beam\n* Double Tomahawk Boomerang"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Getter G Liger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter G Liger"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GetterG_Liger.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 18knots\n* Flight: Mach 2\n* Ground Speed: Mach 3!\n* Tunnelling: 800kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("330tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("50m"),
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
                                Core.vx_new_string("* Liger Missile"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Getter G Poseidon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Getter G Poseidon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GetterG_Poseidon.png"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("330tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("40m"),
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
                                Core.vx_new_string("* Finger Net\n* Strong Missile\n* Getter Cyclone"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Great Mazinger"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Great Mazinger"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/GreatMazinger.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 25knots\n* Flight: Mach 4 (Mach 5 w/Great Booster)\n* Ceiling: 50km\n* Jump: 30m\n* Dive Depth: 8km"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("450kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("32tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("25m"),
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
                                Core.vx_new_string("* Navel Missile\n* Atomic Punch\n* Great Boomerang\n* Scramble Cutter - Attack with Great Booster\n* Great Typhoon\n* Breast Burn\n* Thunder Break"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Grendizer"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Grendizer"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Grendizer.png")
                      )
                    ),
                    Core.vx_new_string("Mazinger Z"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mazinger Z"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/MazingerZ.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Swimming: 20knots\n* Flight: Mach 3 w/Jet Scrander"),
                        Core.vx_new_string(":speed"),
                        Core.vx_new_string("360kph"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("20tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("18m"),
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
                                Core.vx_new_string("Koushiryoku Beam\nMazinger Z can channel pure Photonic Energy through its eyes, unleashing a pair of powerful lasers, which are said to be equal to 10 tons of explosives. This was originally considered Mazinger Z's weakest attack, however, in Shin Mazinger the power of this attacked is greatly magnified to the point where it can now be considered the strongest.\nMissile Punch\nMazinger Z mounts a missile launch bay in its belly, which can store several missiles.\nRocket Punch\nMazinger Z's eponymous attack; it fires off its forearm like a missile, punching straight through an enemy before returning and docking with the elbow again.\nRust Hurricane\nThe powerful turbines in Mazinger Z's head create gale-force winds, launching them through the mouth grill. The attack includes highly corrosive particles (thought to be ionized hydrogen), almost instantaneously causing an enemy to rust over and fall apart.\nBreast Fire\nThe large red fins on Mazinger Z's chest act as heat sinks for its Photonic Energy reactor. Mazinger Z can fire off this stored thermal energy as a powerful, 30,000 degree white-hot beam that melts almost anything. In the Super Robot Wars series, Kouji and Tetsuya Tsurugi can use the Breast Fire and Breast Burn respectively in the Double Burning Fire attack, which they use in the MX version of the Final Dynamic Special (also involving Grendizer and a Getter).\nKyoukagata Rocket Punch\nMazinger Z's Rocket Punch was later reinforced with stronger armor, giving it a more powerful punch.\nIron Cutter\nAn improved Rocket Punch in which the forearm sprouts a pair of axe-like blades, allowing it to cut and slash as well as bludgeon. This is the only weapon in Mazinger Z:s arsenal which can damage Super-alloy Z.\nDrill Missile\nA barrage of small, needle-like missiles fired from ports in Mazinger's upper arms. This attack was typically performed after the Rocket Punch but before the forearm had returned.\nDaisharin Rocket Punch\nMazinger Z spins its arms rapidly, building up momentum before firing off both fists in standard Rocket Punch fashion.\nReitou Beam\nMazinger unleashes a blast of intense cold; this attack was alternately fired from the mouth grill or the spikes on the sides of Mazinger's head.\nFinger Missile\nA rarely-used attack where Mazinger fires the last joint of its fingers as miniature missiles."),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Raideen"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Raideen"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Raideen.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Flight: Mach 10 in God Bird form"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("350tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("52m"),
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
                                Core.vx_new_string("* God Missile\n* God Arrow"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Voltron"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Voltron"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Daikaiju/Voltron.png"),
                        Core.vx_new_string(":mass"),
                        Core.vx_new_string("700tons"),
                        Core.vx_new_string(":height"),
                        Core.vx_new_string("60m"),
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
                                Core.vx_new_string("* Wing Boomerang - Boomerang attack from the wings of GoLion.\n* Space Cutter - Spinning Blades.\n* Eye Flash - Beams fired from the eyes of GoLion.\n* Hurricane Attack - Wind attack similar to Daimos Blizzard, but not as strong.\n* Laser Magnum - Laser-like bullets fired from the mouth of the Green Lion.\n* Fire Tornado - A burst of flame emits from the mouth of the Red Lion.\n* Cross Beam - Cross-shaped boomerang fired from the chest.\n* Gatling Missiles - Small missiles fired from the legs.\n* Electromagnetic Lance - Weapon used as a spear at times.\n* Foot Missile - Missiles fired from the mouths of the Blue and Yellow Lions.\n* Four Lion Attack - The 'Lion Head Attack' 100-Ton Punch.\n* Grand Fire - A stream of flames fired from the mouths of the Blue and Yellow Lions"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
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
   * @function chapter_overview
   * @return {chapter}
   * (func chapter_overview)
   */
  public static interface Func_chapter_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_overview();
  }

  public static class Class_chapter_overview extends Core.Class_base implements Func_chapter_overview {

    @Override
    public Func_chapter_overview vx_new(Object... vals) {
      Class_chapter_overview output = new Class_chapter_overview();
      return output;
    }

    @Override
    public Func_chapter_overview vx_copy(Object... vals) {
      Class_chapter_overview output = new Class_chapter_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/giant_monsters", // pkgname
        "chapter_overview", // name
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
    public Func_chapter_overview vx_empty() {return e_chapter_overview;}
    @Override
    public Func_chapter_overview vx_type() {return t_chapter_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Giant_monsters.f_chapter_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_overview() {
      return Giant_monsters.f_chapter_overview();
    }

  }

  public static final Func_chapter_overview e_chapter_overview = new Giant_monsters.Class_chapter_overview();
  public static final Func_chapter_overview t_chapter_overview = new Giant_monsters.Class_chapter_overview();

  public static Base.Type_chapter f_chapter_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics:Giant Monsters?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics:Giant Monsters?")
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
        "nx/tactics/books/giant_monsters", // pkgname
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
      output = Giant_monsters.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Giant_monsters.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Giant_monsters.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Giant_monsters.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Giant Monsters"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("GiantMonsters.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Overview"),
            Giant_monsters.f_chapter_overview(),
            Core.vx_new_string("Daikaiju"),
            Giant_monsters.f_chapter_daikaiju(),
            Core.vx_new_string("Giant Robots"),
            Giant_monsters.f_chapter_giant_robots()
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
    mapfunc.put("chapter_daikaiju", Giant_monsters.t_chapter_daikaiju);
    mapfunc.put("chapter_giant_robots", Giant_monsters.t_chapter_giant_robots);
    mapfunc.put("chapter_overview", Giant_monsters.t_chapter_overview);
    mapfunc.put("tacticsbook", Giant_monsters.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/giant_monsters", maptype, mapconst, mapfunc);
  }

}
