package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Space_and_time {

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
        "nx/tactics/books/space_and_time", // pkgname
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
      output = Space_and_time.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Space_and_time.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Space_and_time.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Space_and_time.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Space and Time"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Space.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Space and Time Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space and Time Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Why Tactics: Space and Time?"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Why Tactics: Space and Time?"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Space is deadly to any normal lifeforms.\n* Militarily space represents the ultimate high ground.  Anyone in orbit can see everything below and can reach any\nplace on a planet in minutes.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Space Travel"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space Travel"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Space Travel Rules"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Travel Rules"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Planetary Gravity"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Planetary Gravity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Microgravity - 0G to .2G - Microgravity only exists in space and on moons. Low gravity favors the development of tall, slight frames who will have much difficulty in 1G environments. Worlds with such low gravities do not maintain an atmosphere.\n* Very Low Gravity - .2G to .5G - Very Low gravity exists on small planets and\nlarge moons. Low gravity favors the development of tall, slight frames who will\nhave difficulty in 1G environments. Worlds with such low gravities do not maintain\nan atmosphere.\n* Low Gravity - .5G to .8G - Low exists on smaller planets. Low gravity favors\nthe development of tall frames. Worlds with low gravities will have thin\natmospheres and consequently be exposed to higher levels of radiation.\n* Terran Gravity - .8G to 1.2G\n* High Gravity - 1.2G to 1.5G - High gravity exists on larger planets. High gravity\nfavors short, heavy frames.\n* Very High Gravity - 1.5G to 2.5G - Very high gravity exists on larger planets.\nVery high gravity favors short, heavy frames.\n* Intense Gravity - 1.8G to 2.5G - Intense gravity exists on gas giant planets\nlike Jupiter. Few creatures can survive such extreme gravity where the atmosphere\nis extremely dense.\n* Extreme Gravity - 2.5G+ - Extreme gravity exists on stars like the Sun (28G) with\nthe extreme end being a Neutron star (300,000,000,000G) or a black hole.")
                              )
                            ),
                            Core.vx_new_string("Planetary Atmosphere"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Planetary Atmosphere"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Micropressure - 0 to .5 atmospheres - Micropressure only exists in space and even on\nTerran-sized planets (such as Mars). Most creatures cannot survive such low\npressure.\n* Low Pressure - .5 to .8 atmospheres - Low pressure can exist on Terran-sized\nplanets and very large moons. Low pressure favors the development of expanded lung\ncapacity and relative resistance to hypoxia. Conversely such creatures struggle\nwhen breathing the 'soup' of higher pressure environments and may require\nbreathing aids.\n* Terran Gravity - .8 to 1.5 atmospheres - Terran normal\n* High Presssure - 1.5 to 4 atmospheres - High pressure exists on larger planets\nand underwater on any planet.\n* Very High Pressure - 4 to 100 atmospheres -\n* Intense Pressure - 100 to 1000 atmospheres - Equal to the bottom of the terran\nocean.\n* Extreme Pressure - 1000+ atmospheres -")
                              )
                            ),
                            Core.vx_new_string("Space Heat Disspation"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Heat Disspation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* There are three modes of heat transfer: conduction, convection, and radiation.\nThe first two require a medium that space does not provide, so most heat is\ndissipated via radiation, but when necessary, heat can also be dissipated by\nvaporizing a small amount of reaction mass.")
                              )
                            ),
                            Core.vx_new_string("Space Movement"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Movement"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Use [Vector Movement] rules with the following modifications.\n* All objects are always moving.  Only the relative difference in speed is important, not the speed itself.\n* In space, [Speed] represents acceleration/deceleration and is measured in g's (1g=10m/s/s).\n* Given sufficient fuel, there is no practical maximum to the speed attainable.  It would take 3.5 days at 1g to reach\n1% of the speed of light.")
                              )
                            ),
                            Core.vx_new_string("Space Combat"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Combat"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* He's intelligent, but not experienced.  His pattern indicates two-dimensional thinking. - Spock, Star Trek II"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any dropped items, including clouds and mines continue moving at the same speed and direction of the dropping unit.")
                              )
                            ),
                            Core.vx_new_string("Space Travel"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Space Travel"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* At least 100 times the total energy output of the entire world would be required for the voyage to Alpha Centauri in\nunder 100 years."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Space Travel is a two-piece problem; accelerate for half time (and half distance), then decelerate the other half time (and distance).\n* Travel Time: If you know the desired acceleration of your spacecraft (generally one g or 9.81 m/s2) and wish to calculate the transit time, the Brachistochrone equation is:\n** T = 2 * sqrt[ D/A ]\n** where T = transit time (seconds), D = distance (meters), A = acceleration (m/s2)\n\n* Travel Time with Coasting: Spacecraft that cannot accelerate the entire distance must coast during the middle of the trip and use the following calculation:\n** T = ((D - (A * t^2)) / (A * t)) + (2*t)\n** where T = transit time (seconds), D = distance (meters), A = acceleration (m/s2), t = duration of acceleration\nphase (seconds), just the acceleration phase only, NOT the acceleration+deceleration phase.\n* Note that the coast duration time is of course = T - (2*t)\n* Acceleration: If you know the desired transit time and wish to calculate the required acceleration, the equation\nis: A = (4 * D) / T2")
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
            Core.vx_new_string(":Space"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Space"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Space Terrain"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Space Terrain"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Magnetic Storm"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnetic Storm"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/MagneticStorm.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [+1 Hazard]\n* Blocks [Line of Sight]\n* A Magnetic Storm is treated as a [Nebula] with the following additional effects.\n* [-1 Communications] per space from the edge of the field.\n* [-1 Shielding] per space from the edge of the field.")
                              )
                            ),
                            Core.vx_new_string("Micro-meteor Field"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Micro-meteor Field")
                              )
                            ),
                            Core.vx_new_string(":Nebula"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nebula"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/Nebula.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Nebulas are placed randomly on the map.\n* At the beginning of the game roll 1 die to determine Speed and 1 die to randomize direction.\n* At the end of each turn all nebulas move their Speed in the given direction.\n* [+1 Hazard]\n* Blocks [Line of Sight]")
                              )
                            ),
                            Core.vx_new_string("Solar Flare"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solar Flare"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/SolarFlare.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("This photograph shows one of the most spectacular solar flares ever recorded; the base of the flare is more than\n591Mm across.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Arctic World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arctic World")
                              )
                            ),
                            Core.vx_new_string("Arid World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arid World")
                              )
                            ),
                            Core.vx_new_string("Asteroid Field"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Asteroid Field"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/Asteroid.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Asteroid fields are placed randomly on the map.\n* At the beginning of the game roll 1 die to determine Speed and 1 die to randomize direction.\n* At the end of each turn all asteroids move their Speed in the given direction.\n* If they collide with a unit, use the asteroid's and the unit's Speed and Body to determine damage.\n* [+2 Hazard]"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("500km"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("500m"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("500m")
                              )
                            ),
                            Core.vx_new_string("Black Hole"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Black Hole"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/BlackHole.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Accretion Disk\n* Event Horizon"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Singularity")
                              )
                            ),
                            Core.vx_new_string("Blue Giant Star"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blue Giant Star")
                              )
                            ),
                            Core.vx_new_string(":Comet"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Comet"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/Comet.png")
                              )
                            ),
                            Core.vx_new_string("Debris Field"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Debris Field"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/SpaceDebris.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [+2 Hazard]\n* Debris Fields are treated as an [Asteroid Field].\n* Any large unit that explodes is replaced with a Debris Field.")
                              )
                            ),
                            Core.vx_new_string("Desert World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Desert World")
                              )
                            ),
                            Core.vx_new_string("Dyson Sphere"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dyson Sphere")
                              )
                            ),
                            Core.vx_new_string("Gas Giant"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gas Giant")
                              )
                            ),
                            Core.vx_new_string("Greenhouse World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Greenhouse World")
                              )
                            ),
                            Core.vx_new_string("Ionized Atmosphere World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ionized Atmosphere World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Atmosphere is heavily ionized which produces powerful lightning storms and\nregularly disrupts electrical systems and communications.")
                              )
                            ),
                            Core.vx_new_string("Irradiated World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Irradiated World")
                              )
                            ),
                            Core.vx_new_string("Jungle World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jungle World")
                              )
                            ),
                            Core.vx_new_string(":Meteorite"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Meteorite"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Armaggeddon")
                              )
                            ),
                            Core.vx_new_string("Methane Ocean World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Methane Ocean World")
                              )
                            ),
                            Core.vx_new_string("Neutron Star"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Neutron Star"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/NeutronStar.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* 12 miles across and 1.4 times the mass of the sun.  One teaspoonful would weigh a billion tons."),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2x10^27tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("20km")
                              )
                            ),
                            Core.vx_new_string("Ocean World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ocean World")
                              )
                            ),
                            Core.vx_new_string("Proto World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Proto World")
                              )
                            ),
                            Core.vx_new_string(":Pulsar"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pulsar"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/SpaceAndTime/Pulsar.png")
                              )
                            ),
                            Core.vx_new_string("Red Giant Star"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Red Giant Star")
                              )
                            ),
                            Core.vx_new_string("Ring World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ring World")
                              )
                            ),
                            Core.vx_new_string("Ringed Gas Giant"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ringed Gas Giant")
                              )
                            ),
                            Core.vx_new_string("Solar Storm World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solar Storm World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This planet is routinely bombarded by intense solar radiation. The planet itself is not radioactive, but when solar storms appear all life is scoured from any exposed surface. Life underground or underwater is possible.")
                              )
                            ),
                            Core.vx_new_string("Seasonally Extreme World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seasonally Extreme World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A planet with a very oblong orbit and high axial shift will produce severe\nchanges in seasons shifting from artic to tropic environments during the year.\nSuch a punishing environment is difficult for complex life to develop. Simple\nlife forms will tend toward short life spans or hibernation during winter\nmonths with a massive spring bloom and fall die off.")
                              )
                            ),
                            Core.vx_new_string("Seasonless World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seasonless World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A planet with a nearly circular orbit and minor axial shift will produce\nbands of terrain where the seasons don't change throughout the year. Polar\nareas are uniformly cold and equatorial areas are uniformly hot. Such a\npredictable environment is ideal for life to develop.")
                              )
                            ),
                            Core.vx_new_string("Seismic World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seismic World")
                              )
                            ),
                            Core.vx_new_string("Stony World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stony World")
                              )
                            ),
                            Core.vx_new_string("Storm World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Storm World")
                              )
                            ),
                            Core.vx_new_string("Swamp World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swamp World"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The combination of mild greenhouse effect and high amounts of surface water\ncreates a world where most land masses are densely covered with vegetation.\nVery little dry land exists and the vegetation mostly has its roots underwater.\nSome particularly dense vegetation can be walked on. Quicksand, parasites,\ninsects, water predators, and other threats are common.")
                              )
                            ),
                            Core.vx_new_string("Toxic World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Toxic World")
                              )
                            ),
                            Core.vx_new_string("Tropical World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tropical World")
                              )
                            ),
                            Core.vx_new_string("Tundra World"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tundra World")
                              )
                            ),
                            Core.vx_new_string("Yellow Star"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yellow Star")
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
            Core.vx_new_string("Dimensional Travel"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Dimensional Travel"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Dimensional Rules"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dimensional Rules"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Parallel Dimensions"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parallel Dimensions")
                              )
                            ),
                            Core.vx_new_string("Dimensional Ripples"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Ripples"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Changes made to one dimension can cause similar changes to nearby parallel dimensions like\nripples in a pond. Temporal Distortion Waves always cause Dimensional Ripples.")
                              )
                            ),
                            Core.vx_new_string("Dimensional Storm"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Storm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Dimensional Storm is a theoretical disaster where the barriers between dimensions are\nbroken and events from unrelated time periods and dimensions become mixed up creating chaos\nacross multiple dimensions.")
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
            Core.vx_new_string("Time Travel"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Time Travel"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Philosophy - Though we are now able to travel through time, there remains much speculation\nover how time travel actually works. The general concensus is that the term 'Time Stream' may\nbe an accurate description. Time acts like a river of water, and we are travelers on that\nriver. But our boats are unpowered, so we drift with the current until we hit the shore. Now,\nwith the power of the Time Rotor, we may move against the current of time to any time or\nplace we choose."),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Vortex - The Vortex is a temporal zero-point where time does not exist. The Vortex appears\nas a tunnel headed away from the viewer regardless of which direction the viewer looks. Entering\nthe Vortex is feels like dying (and probably is a death). Exiting the Vortex is like being born\n(or reborn).\n* Beings and objects may travel through the the [Vortex] emerging at another point in Time. Every\npoint in time is equi-distant from the [Vortex]."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Time Travel Rules"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Time Travel Rules"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Laws of Time"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Laws of Time"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Time Travellers\n* Emphemeral - Those who have never traveled in time are called Ephemerals. All the events of\ntheir lives may be altered repeatedly by one or more time travelers, and they will not sense\nanything is amiss or remember anything about the previous time stream.\n* Temporal - Once a being travels through time, it is permanently separated from the normal\ntime stream and is called a Temporal. The events of a Temporal's life may also be changed by\nother time travelers, but a Temporal will remember some or all of the previous time stream.")
                              )
                            ),
                            Core.vx_new_string("History Can Be Changed"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("History Can Be Changed")
                              )
                            ),
                            Core.vx_new_string("Law of Death"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Law of Death"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Final Destination"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Temporal has one limitation that Emphemerals do not: the moment of death of a Temporal\ncannot be undone. Since only living beings may travel through time, when a Temporal dies, he\nor she can no longer move forward in time. Even if time is rewritten to prevent the\nTemporal's death, the time traveler will still die at the exact age of his original death\nregardless of the circumstances. The cause of death may vary, but death will always occur at\nthe exact age that the original death happened.")
                              )
                            ),
                            Core.vx_new_string("Law of Preservation"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Law of Preservation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Jumping through time necessarily causes a number of paradoxes, but Time seems to have a\nself-healing mechanism that limits the scope of changes to the Timeline, provided the changes\nare small enough. One of these effects is when a person makes a time jump, that jump cannot\ncause a series of events that ultimately prevents itself. For example: say a person jumped\nback in time because of a temporal disturbance. He then prevented the disturbance from ever\nhappening. Logically, this is a paradox. If the disturbance never happened, then he would\nnever go back to prevent the disturbance, so the disturbance would happen, so he would go\nback to prevent the disturbance, etc. Instead the last jump that prevents the disturbance\noccurs, the disturbance never occurs, and all memory of what happened during the paradox is\nlost. This time period has become complex but is stable. Of course, a further time jump\nmight erase the actions of the previous jump, since the last jump will always stand despite\nany paradoxes created.")
                              )
                            ),
                            Core.vx_new_string("Loop Trap Paradox"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Loop Trap Paradox"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Whenever two versions of same person exist at the same point in time, a Loop Trap Paradox is created. The future version of the person immediately vanishes and the past version of the person performs the same actions that the future version did eventually returning to the same moment where both versions exist at the same time and the cycle continues eternally. The person is doomed to repeat the same actions over and over again unless another time traveler intervenes.\n* To avoid Loop Traps, it is vitally important that a time traveler keeps accurate track of\nevery period of time to which he or she has traveled.")
                              )
                            ),
                            Core.vx_new_string("Matter Suppression"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Matter Suppression"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Matter cannot normally travel through time, but time technology allows certain narrow\nexceptions. Living matter can travel freely through time, seemingly based only on the will to\nlive. Non-living matter, however, decomposes rapidly when moved through time. Non-living\nobjects that travel backwards in time decompose faster the farther back in time they travel.\nNon-living objects that travel forward in time beyond their original time period decompose\nimmediately. For this reason, no one has been able to travel to a future beyond their time\nmachines 'present' because their time machines vanish stranding them in the Vortex.")
                              )
                            ),
                            Core.vx_new_string("Messages in Time"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Messages in Time"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* With the benefit of hindsight, there are many times when it would be convenient to send a\nmessage to a past version of yourself to change a course of action. Of course, this would be\na paradox: if you don't take the same action in the past, you would never send the message to\nchange the action. If you did attempt to leave a message to a past self, the rule of Matter\nSuppression would cause the message to disappear to prevent the paradox. However, by placing\na message in the Time Rotor, the message can resist Matter Suppression for up to 1 day. If\nthe message is successfully delivered, the future self will typically vanish immediately\nsince that future will have been erased in favor of a new future created by the message.\n* Self Preventing Mission - Using a Message in Time, it is possible to prevent every reason\nwhy the initial Time Travel was made. In this case, the mission never occurs, though memories\nof the trip may remain.")
                              )
                            ),
                            Core.vx_new_string("Temporal Disaster Wave"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Disaster Wave"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Sometimes massive changes to history will cause such an enormous [Temporal Distortion Wave]\nthat it travels all the way through history to the present. These are called Temporal\nDisaster Waves. A Disaster Wave will have wide-sweeping ramifications and are far too\ndangerous and random to allow.")
                              )
                            ),
                            Core.vx_new_string("Temporal Distortion"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Distortion")
                              )
                            ),
                            Core.vx_new_string("Temporal Distortion Wave"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Distortion Wave"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("History Tends to Repeat Itself"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Major temporal alterations can be made without significantly altering history. Major\nchanges will, however, create a Temporal Distortion Wave. This wave in time will slowly\nflow around the changed events, making minor alterations in names and events as it goes.\nEventually, the wave subsides when history goes back on course with only minor changes to the\nhistory books. For Example: killing Hitler as a baby will have little effect on history,\nbecause the time stream will find someone else to fill his role, and the history books will\njust have different names.\n* Severity - A Distortion Wave is rated based on the number of years it will travel before\nthe time stream returns to its normal course. History during this period is altered, but time\nfutureward of the wave is relatively normal.\n* Detection - A person that experiences a wave washing through his/her time stream will\nexperience radical changes to events. Of course, only time travelers will notice these\nchanges as unusual. Those that can analyze the time stream can see the wave traveling through\ntime. If a person is futureward of the wave, he/she will not detect any changes until the\nwave approaches.\n* Stopping the Wave - A Wave can still be stopped by jumping forward in time past the wave\nand choosing major events that took place in the normal time stream and forcing them to\nhappen again despite the changes the oncoming Wave would create. This action will act as a\ndam, preventing the Wave from doing further damage to the future. The time stream is now\nsafe, but the work is not complete because a Standing Wave has been created.\n* Standing Wave- A Distortion Wave that has been stopped futureward will be reflected back\nto the past changing history back again until it reaches its origin and reflected futureward\nagain repeatining the process, changing time back and forth infinitely in what is called a\nStanding Wave. A Standing Wave remains very dangerous and can only be ended by preventing the\noriginal source of the wave which will return the time stream to normal.")
                              )
                            ),
                            Core.vx_new_string("Temporal Memory"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Memory"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When a Temporal has his time stream rewritten by another Time Traveler, it is possible\nto retain dream-like memories of the time line that no longer exists.")
                              )
                            ),
                            Core.vx_new_string("Traveling Futureward"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Traveling Futureward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Traveling to Ones Own Future - Time machines cannot travel farther forward in time beyond\ntheir 'present'. Any attempt to do so results in the immediate disintegration of the time\nmachine and passengers are stranded in the Vortex.\n* Futureward Time Hops - The simplest way of performing multiple time hops is to travel back\nto a time period and then make a number of futureward hops from there. In this way one can\nsee the development of a subject over time such as the construction of a building. It also\nallow one to view the consequences of any changes made to history.\n* Futureward Time Hops Complications - Making forward hops essentially avoids paradoxes, but\nother problems can occur. People may recognize you which can be a problem if your appearance\nhasn't changed. They may ask questions about the intervening time and why they never kept in\ntouch. If you keep arriving in the same spot at different times, you may set yourself up for\nan ambush. Be cautious and change your physical destination as well as your temporal on each\njump.")
                              )
                            ),
                            Core.vx_new_string("Traveling Pastward"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Traveling Pastward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Traveling to Ones Own Past - Any attempt to enter a time period where you have already been creates a [Loop Trap Paradox]. Your future version immediately vanishes and the past version infinitely repeats the steps leading to the Loop Trap.\n* Pastward Time Hops - Multiple jumps back in time are often desirable because as one learns more about the current situation it is usually easier to go further back in time to alter the situation before it has fully developed. When done perfectly, the original problem can be prevented entirely.\n* Pastward Time Hops Complications - Altering the past is the way to create paradoxes. Multiple pastward hops increases the risk with each hop. As you progressively change the past, you may also cause changes to your own past. You can find yourself appearing in a time period with no memory of why.")
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
    mapfunc.put("tacticsbook", Space_and_time.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/space_and_time", maptype, mapconst, mapfunc);
  }

}
