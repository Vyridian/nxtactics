package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Land_sea_and_air {

  /**
   * @function chapter_land_sea_and_air_overview
   * @return {chapter}
   * (func chapter_land_sea_and_air_overview)
   */
  public static interface Func_chapter_land_sea_and_air_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_land_sea_and_air_overview();
  }

  public static class Class_chapter_land_sea_and_air_overview extends Core.Class_base implements Func_chapter_land_sea_and_air_overview {

    @Override
    public Func_chapter_land_sea_and_air_overview vx_new(Object... vals) {
      Class_chapter_land_sea_and_air_overview output = new Class_chapter_land_sea_and_air_overview();
      return output;
    }

    @Override
    public Func_chapter_land_sea_and_air_overview vx_copy(Object... vals) {
      Class_chapter_land_sea_and_air_overview output = new Class_chapter_land_sea_and_air_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/land_sea_and_air", // pkgname
        "chapter_land_sea_and_air_overview", // name
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
    public Func_chapter_land_sea_and_air_overview vx_empty() {return e_chapter_land_sea_and_air_overview;}
    @Override
    public Func_chapter_land_sea_and_air_overview vx_type() {return t_chapter_land_sea_and_air_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Land_sea_and_air.f_chapter_land_sea_and_air_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_land_sea_and_air_overview() {
      return Land_sea_and_air.f_chapter_land_sea_and_air_overview();
    }

  }

  public static final Func_chapter_land_sea_and_air_overview e_chapter_land_sea_and_air_overview = new Land_sea_and_air.Class_chapter_land_sea_and_air_overview();
  public static final Func_chapter_land_sea_and_air_overview t_chapter_land_sea_and_air_overview = new Land_sea_and_air.Class_chapter_land_sea_and_air_overview();

  public static Base.Type_chapter f_chapter_land_sea_and_air_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land, Sea and Air Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Why Tactics:Land, Sea and Air?"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Why Tactics:Land, Sea and Air?")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_land_sea_and_air_rules
   * @return {chapter}
   * (func chapter_land_sea_and_air_rules)
   */
  public static interface Func_chapter_land_sea_and_air_rules extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_land_sea_and_air_rules();
  }

  public static class Class_chapter_land_sea_and_air_rules extends Core.Class_base implements Func_chapter_land_sea_and_air_rules {

    @Override
    public Func_chapter_land_sea_and_air_rules vx_new(Object... vals) {
      Class_chapter_land_sea_and_air_rules output = new Class_chapter_land_sea_and_air_rules();
      return output;
    }

    @Override
    public Func_chapter_land_sea_and_air_rules vx_copy(Object... vals) {
      Class_chapter_land_sea_and_air_rules output = new Class_chapter_land_sea_and_air_rules();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/land_sea_and_air", // pkgname
        "chapter_land_sea_and_air_rules", // name
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
    public Func_chapter_land_sea_and_air_rules vx_empty() {return e_chapter_land_sea_and_air_rules;}
    @Override
    public Func_chapter_land_sea_and_air_rules vx_type() {return t_chapter_land_sea_and_air_rules;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Land_sea_and_air.f_chapter_land_sea_and_air_rules();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_land_sea_and_air_rules() {
      return Land_sea_and_air.f_chapter_land_sea_and_air_rules();
    }

  }

  public static final Func_chapter_land_sea_and_air_rules e_chapter_land_sea_and_air_rules = new Land_sea_and_air.Class_chapter_land_sea_and_air_rules();
  public static final Func_chapter_land_sea_and_air_rules t_chapter_land_sea_and_air_rules = new Land_sea_and_air.Class_chapter_land_sea_and_air_rules();

  public static Base.Type_chapter f_chapter_land_sea_and_air_rules() {
    Base.Type_chapter output = Base.e_chapter;
    Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land Sea and Air Rules"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Large Unit Rules"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Large Unit Rules"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Large Units"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Large Units"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Action]: Vehicles with multiple crew members that take up more than 1 space, may take 1 Action per space.\nIt must, however, perform all Actions at the same time before further Movement.")
                      )
                    ),
                    Core.vx_new_string("Huge Units"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Huge Units")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Land Sea and Air Movement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Land Sea and Air Movement"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Acceleration"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Acceleration")
                      )
                    ),
                    Core.vx_new_string("Movement - Large Unit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement - Large Unit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/Images/MoveLarge.png")
                      )
                    ),
                    Core.vx_new_string("Movement - Huge Unit"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement - Huge Unit"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Rules/Images/MoveHuge.png")
                      )
                    ),
                    Core.vx_new_string(":Collisions"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Collisions"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Ramming Speed! - D-Day, Animal House")
                      )
                    ),
                    Core.vx_new_string("Movement Range"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Movement Range")
                      )
                    ),
                    Core.vx_new_string("Turn Radius"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turn Radius"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Normally a unit can turn whenever it wants, but a unit moving at high speed or a unit that is not particularly\nagile will only be able to turn after moving a certain number of spaces.  The number of spaces a unit must move to\nturn is the turn radius.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Vehicle Construction"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Vehicle Construction"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Choose Vehicle Type"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Vehicle Type"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Cycle\n* Car\n* Truck\n* Bus/RV\n* Helicopter\n* Airplane\n* Boat\n* Submarine\nTrailers\n!Abilities\n50% Cost, 200% Load, -1 Handling\n!Units\n* Sidecar - Mini\n* Light Trailer\n* Medium Trailer\n* Heavy Trailer\n* Semi Trailer\n\nCycles\n!Bicycles\n* Tricycle\n* 3 Speed Bicycle\n* 10 Speed Bicycle\n* Racing Bicycle\n** Weight: 40lb.  Top Speed: 40mph.  Cargo 1cf.  Max load 30lb.  Cost $400.\n* Rikshaw Cycle\n!Motorcycles\n* Mini Cycle\n* Scooter\n* Sport Cycle\n* Racing Cycle\n* Cruising Cycle\n* Chopper\n** RWD, driver and passenger.  Top Speed 150.  50 mpg.  Cargo 1 cf.  Max load 50 lb.  Cost: $5,000.  Weight: 300 lb.\n!Trikes\n!Options\n* Sidecar\n* Trailer\n* Saddlebags\n\nCycles - Body 25% Weight, 25% Cost, 25% Load\n* Dirt Bike - Personal Body\n* Sport Cycle - Light Body, Sport\n* ATC - Medium Fiberglass Body\n* ATV - Heavy Fiberglass Body\n* Road Hog - Heavy Body\n\nCars\n* Midget Racer - Personal, Stripped\n* Formula One - Mini, Sport, Stripped\n* Subcompact - Mini\n* Cooper - Mini, Sport\n* Compact - Light\n* Dune Buggy - Light, Offroad, Stripped\n* Trike - Light, Fiberglass\n* Sportscar - Light, Sport\n* Mid-Sized - Medium\n* Light SUV - Medium\n* Station Wagon - Extended\n* Luxury - Extened, Luxury\n* Limosine - Heavy, Luxury\n* Police Cruiser\n** Very similar to a four-door mid-sized passenger sedan. Always RWD, with maybe 250 hp, driver, gunner, three prisoners (passengers). SR 4.75, TS 155, AC 9 (max 20), 19 mpg@65. No Armor. Cargo 20 cf. Max load 300 lb. $35,000, 3600 lb. Each police cruiser will have at least one shotgun.\n* Cars\n** Subcompact Car\n*** FWD, two-door or four-door. Two to five passengers.  Top Speed 100mph.  30mpg. Cargo 15 cf /225 lbs.  $15,000, 2350 lb.\n** Compact Car\n*** FWD with around 130 hp, two- or fourdoor.  Four to five passengers. SR 5.25, TS 120, AC 6 (max 10), 27 mpg@65. No Armor. Cargo 20 cf. Max load 300 lb. $20,000, 2800 lb.\n** Mid Sized Car\n*** FWD or RWD, with around 180 hp, two- or four-door with four to five passengers. SR 5.5, TS 130, AC 6 (max 11), 22 mpg@65. No Armor. Cargo 20 cf. Max load 300 lb. $26,000, 3300 lb.\n** Station Wagon\n** Luxury Car\n** Mini Van")
                      )
                    ),
                    Core.vx_new_string("Choose Frame"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Frame"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Personal Frame] - Passengers can only be carried as cargo.\n* [Mini Frame]\n* [Light Frame]\n* [Medium Frame]\n* [Extended Frame]\n* [Heavy Frame]\n* [Extra Heavy Frame]\n* [Super Heavy Frame]\n	* [Sport]\n	* [Racing]\n	* [Utility]\n	* [Luxury]\n	* [Heavy Duty]\n\n	!Modifiers\n	* Standard - the default for all cars is the standard body style. Up to 40% of their internal space may be devoted to weapons.\n	* Stripped - 75% Weight, 75% Cost, No Armor.  All exrtas like lights and air bags are removed.\n	* Utility - 75% Cost, -1 Handling\n	* Sport - 150% Cost, 120% Top Speed, +1 Handling, 75% Load\n	* Racing - 300% Cost, 150% Top Speed, +2 Handling, 50% Load\n	* Luxury - 150% Cost, +1 Handling\n	** Power everything, ABS, High quality Air bags, etc.\n	* Heavy Duty - 150% Cost, 150% Load\n	* Offroad - 150% Cost, -1 Terrain Penalty\n\n	* Cheap car body - made from rough steel with crude weld points but is cheaper than the standard body. For every cf. of space a cheap car body costs $10, weighs 6 lb, yet has a maximum load of 28 lb. A car body made with cheap materials adds .25 to SR (see below).\n	* Standard car body - consists of a basic unit-body construction of galvanized steel and steel alloys. For every cf. of space a standard car body costs $15, weighs 6 lb and has a maximum load of 29 lb.\n	* Expensive car body - is an advanced design using high-tech alloys and reinforced plastics. For every cf. of space an expensive car body costs $25, weighs 6 lb, and has a maximum load of 30 lb. A car body made with cheap materials subtracts .25 from SR (see below).\n	* Extra light (XLT) construction - adds 100% to the current body cost but reducing body weight by 25%. Cars with XLT bodies take 50% more damage in a collision.\n	* Low Profile - cars that are low profile have been flattened so that their width and length are somewhat greater in proportion to their height.  Many sports cars and limousines may be considered low profile. This makes them harder to hit and they handle better because of a lower center of gravity, but because they have less surface area they cannot mount as many weapons. -1 to hit, -0.5 SR. Only 25% of internal space may be used for weapons.\n	* Very Low Profile - cars that are very low profile have been flattened so that their width and length are much greater in proportion to their height.  Many exotic sports cars like the Lamborgini are very low profile. This is simply an extreme version of low profile. -2 to hit, -1 SR.  Only 10% of internal space may be used for weapons.\n	* High Profile - cars that are high profile are tall in proportion to their width and length. Many sport-utility vehicles and all vans may be considered high profile. +1 to hit, + .5 SR. Up to 75% of their internal space may be devoted to weapons.  Space taken up by ammunition does not count against the amount of space a vehicle may use for weapons, only the weapons themselves counts against this.\n	* Sport Model - Compacts or Mid-Sized only. The car is a &quot;sports&quot; car with only room for two, a driver and a single passenger. +30mph adds aerodynamic streamlining. A Sport body costs 100% more, subtracts .25 from SR, weighs 5% lighter, and adds 10% to final top speed and mileage.\n	* The Utility option has one purpose: cheaper is better. Utility bodies are 30% cheaper, add .25 to SR, and subtract 15% from their final top speed and mileage.\n	* The Sport Utility option adds aerodynamic streamlining to a heavier, cheaper frame. A Sport Utility body costs 60% more, adds 10% to final top\n	speed and mileage, but adds .25 to SR.")
                      )
                    ),
                    Core.vx_new_string("Choose Mass"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Mass")
                      )
                    ),
                    Core.vx_new_string("Choose Engine(s)"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Engine(s)"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("** [[Unpowered]]\n** [[Wood Burning Engine]]\n** [[Coal Fired Engine]] - 35% Efficiency, 30 MJ/kg\n** [[Battery Powered]] - 85% Efficiency\n** [[Gasoline Engine]] - 20% Efficiency, 45.8 MJ/kg, .41 kW/kg Power / Weight\n** [[Diesel Engine]] - 25% Efficiency, 45.3 MJ/kg (denser than Gasoline with 15% more energy by volume), .41 kW/kg Power / Weight (Turbocharged V8 Diesel)\n** [[Natural Gas Engine]]\n** [[Hydrogen Fuel Cell]]\n** [[Jet Engine]] - 43.7 MJ/kg\n** [[Rocket Engine]] - 70% Efficiency, 164 kW/kg Power / Weight (Space Shuttle)\n** [[Nuclear Plant]]\n** [[Fusion Plant]]\n	* Cheap - $8, 5 lb, 0.2 cf.\n	* Normal - $20, 4 lb, 0.18 cf.\n	* High Output (HO) - $35, 3 lb, 0.15 cf.\n	* Super High Output (SHO) - $50, 2.5 lb, 0.13 cf.\n	* Exotic (EX) - $75, 2 lb, 0.11 cf.\n	An engine has 1 hit per 2 full cubic feet. The smallest possible engine is 25 hp. A car may mount more than one engine, but may only use one at a time.\n	* Turbocharger - This device uses the engine's exhaust stream to drive an air compressor which increases the engine's power output. It is not possible to fit a Supercharger and a Turbocharger into the same vehicle. +20mph, minor option.costs 50% of the original engine cost, weight is 10% of the original engine weight. A Turbocharger adds 30% to hp. No more than four turbochargers may be added to an engine.\n	* Supercharger - A supercharger uses a belt and pulley mechanism linked to an engine's crankshaft to force extra air and fuel into the engine's combustion chambers, greatly increasing engine power. It is not possible to fit a Supercharger and a Turbocharger into the same vehicle. +20mph top speed +10 Acc.  Costs 100% of the original engine cost, weight is 15% of the original engine weight. Adds 65% to total hp and one hit to the engine. May be combined with turbochargers, but if even one turbocharger is added the Supercharger only adds 40% to total hp.\n	* Nitrous oxide may be purchased for $500, 15 lb. When fired (like a weapon), this system injects Nitrous Oxide gas into the combustion chamber. This gives a brief but enormous boost to speed.  For a single turn per use, the vehicle's acceleration is increased by 30. This acceleration can be used to boost a vehicle's speed to over its normal Top Speed, but on the following turn it must reduce speed down to the Top Speed. 3-shot +30mph acceleration, minor option, destroyable More than one may be mounted but the effects of using two or more are not cumulative.\n	* Computerised Engine Management - An electronic system which constantly monitors and tunes the engine as it is running, in order to maximise performance. +10 Acceleration, minor option, destroyable.\n	* Engine Rebuild - Also known as &quot;blueprinting&quot;. The engine has been taken apart and re-assembled to within the most exacting tolerances, and certain production items replaced with high performance alternatives. +20mph top speed, minor option.\n	* Fuel Injection - An advanced system which replaces the carburettor, giving a significant boost to performance. It is not possible to fit a Fuel Injection system and a Multicarb into the same vehicle. +20mph top speed +10mph Acc 2 minor options.\n	* Multicarb - A multi-barrelled carburettor designed to give superior performance over the standard single barrelled carb. It is not possible to fit a Multicarb and a Fuel Injection system into the same vehicle. +20mph, minor option.")
                      )
                    ),
                    Core.vx_new_string("Choose Travel Modes"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Travel Modes"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("** Land\n*** Wheeled\n*** Tracked\n*** Walker\n** Marine\n*** Sail\n*** Prop\n*** Catamaran\n*** Hydrofoil\n*** Airboat - Steering is by rudders.  No brakes or reverse.\n*** Hovercraft\n*** Submarine\n** Ice\n*** Ice Sailboat\n*** Aerosan - Ice Airsled\n** Air\n*** Propeller\n*** Jet\n*** Helicopter\n*** Rocket\n** Space\n*** Rocket\n*** Magnetic Ion\n*** Hyperdrive\n*** Space Fold\n	* Aquatic\n	* Submersible\n	* Glider\n	* Propeller\n	* Jet\n	* Suborbital\n	* Orbital\n	* ExtraOrbital\n	* Interplanetary - Can endure the rigors of interplanetary space for months if necessary.  Completely self contained\n	and recycling environment and food supply.\n	* Interstellar - Can endure the rigors of interstellar space for years if necessary.  Completely self contained and recycling environment and food supply.\n	All cars have four wheels. Each wheel has (body space/20) hits, rounded down. Wheels may be reinforced to take more damage than they would normally be able to. This costs 35% of body cost and doubles the number of hits for each wheel.  Wheels may be made fire-proof (FP) for an extra 10% of body cost.\n	* High Preformance Tires - cost 40% of body cost, and subtract .25 from SR. Racing tires cost 100% of body cost, and subtract .5 from SR.\n	* Racing Slicks - Racing style tires, with no noticeable tread pattern. Great for improving traction in dry conditions on the racetrack, lousy if it's wet, on a real road or off-road. +2HCon &quot;clean&quot; dry asphalt, -1HC on typical roads, -2HC off-road or on wet asphalt.\n	* Spare tires count against the car's max weight and space. Each spare tire costs 20% of body cost, weights 5% of body weight, and takes up 1% of body space.  A spare may be mounted on any side externally. This option costs an additional $100, but takes up no internal space. All external spares take damage BEFORE the armor they are mounted on, however if they take more than 3 hits of damage in a single round they fall off, effectively removed from game play. Spare tires may not have wheel guards.\n	!Drivetrain\n	* Rear wheel drive (RWD) is the standard drivetrain that comes with a vehicle design.\n	* Front wheel drive (FWD) is a drivetrain option that reduces final body cost and weight by 15%. FWD adds .25 to SR.\n	* All wheel drive (AWD) is a drivetrain option that increases final body cost by 100% and weight by 10%. +2HC on ice, oil, wet roads or offroad.")
                      )
                    ),
                    Core.vx_new_string("Choose Maneuverability"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Maneuverability"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Human Interface - Physical skills in a vehicle are generally limited by how closely the\nvehicle matches the human body unless a particular piece of hardware is installed to enable the\nspecific skill.\n** Land\n*** Aerodynamics\n*** Suspension\n*** Terrain Modifications\n*** Traction\n** Air\n*** VTOL\n*** Jumpjets\n*** Booster Rockets\n** Space\n*** Verniers\n	!Suspension\n	* Sporty - For 50% of the final body cost a vehicle's suspension may be upgraded to Sporty. These better arms and shocks decrease SR by .25.\n	* Sport - For 100% of the final body cost a vehicle's suspension may be upgraded to Sport. These superior coils, struts, and frame stiffening decrease SR by .5.\n	* Racing - For 175% of the body cost the suspension may be upgraded to Racing, with complete body stiffening, automatic camber adjustment, and computer controlled shocks. Racing suspension decreases SR by one.\n	* Off Road Suspension - Heavy duty suspension with a higher than usual ground clearance. Allows vehicle to pass Rough Terrain without penalty and to pass through Punishing Terrain.\n	* Computer Assisted Suspension - An electronic system which monitors and adjusts the suspension in order to give a smoother, more stable ride. +1 HC minor option, destroyable.")
                      )
                    ),
                    Core.vx_new_string("Choose Fuel and Range"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Fuel and Range"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("** External Fuel Tanks\n** Propellant / Reaction Mass (spacecraft)\n	* Gas Tank - $10 per gallon, weighs 7 lb (full) per gallon. Gas costs $2 a gallon. If a car runs out of gasoline (or a car's gasoline tank or engine is destroyed) the car may not accelerate and automatically decelerates by 5 mph per second.\n	* Armored Gas Tank - $15 per gallon, weighs 12 lb (full) per gallon.\n	* Self-sealing Gas Tank - $20 per gallon, weighs\n	 10 lb (full) per gallon.  Self-sealing gasoline tanks cannot explode when hit, but can explode when the vehicle is on fire.\n	* Self-sealing Armored Gas Tank - $40 per gallon, weighs 15 lb (full) per gallon. Self-sealing armored gasoline tanks cannot explode.")
                      )
                    ),
                    Core.vx_new_string("Choose Mission Specific"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Mission Specific"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("** Cargo Bay\n** Decoys\n** ECM/EW\n** Hanger Bay\n** Passenger Space - Passenger space is relative to the number of passengers, the operating range, and the relative luxury of the craft.\n** Sensors\n** Stealth\n** Cloak\n	!Cargo\n	Cargo space is (usually) your leftover space: space not taken up by people, guns, or equipment.\n	* Hidden Cargo Space - Up to half the cargo space in the vehicle is in hidden compartments. Handy in the event of &quot;Imperial Entanglements&quot;. Minor option, destroyable\n	* Flatbed - Cargo space designated as a &quot;flatbed&quot; is exposed to the open air, but can carry twice the normal load.\n	* Another vehicle may be put into cargo space, if the vehicle's Maximum Cargo Load is great enough.  Any car placed in cargo of another car exits via the standard cargo access (usually the back), and suffers a Turn III in doing so.")
                      )
                    ),
                    Core.vx_new_string("Choose Armor"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Armor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("** Command Armor\n** Radiation Shielding\n	!Armor\n	* Armor is applied to the six sides: Front, Left, Right, Back, Top, and Under.  Armor for vehicles is spaced in layers of sheets 1/4&quot;-1&quot; apart and consists of a standard ablative carbon-reinforced plastic. This material is light and very strong, and can be shaped into any form, however it's ablative attribute has it's limitations.\n	* Normal armor costs cubic feet divided by 10 and weighs (cubic feet divided by 30) + 5 per point.\n	* Sloped (SLO) armor angles the plates under the skin of most of the vehicle, making it more efficient. Sloped armor costs cubic feet divided by 8 and weighs (cubic feet divided by 38) + 5 per point.\n	* Chambered armor (CA) consists of tactically placed spacing between layers of high-quality sloped armor. This design costs cubic feet divided by 5 and weighs (cubic feet divided by 46) + 5 per point.\n	* Options: Fireproof armor (FP) - Costs twice as much as regular armor but prevents the car from catching on fire, unless the armor becomes breached.\n	* Laser Reflective (LR) Armor - Costs 3 times as much as normal armor but cuts all damage from lasers in half (unless the side hit is breached).\n	* The combination of LR and FP armor (LRFP) costs 5 times as much as regular.")
                      )
                    ),
                    Core.vx_new_string("Choose Weapons"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Weapons"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("!Aimed Weapons\nAll aimed weapons come standard with a heavy transversal mounting, and an autoloader, allowing a high-degree arc of fire and an uninterrupted ammunition supply. This in turn makes them very versatile and powerful yet much bigger and heavier than normal.\nAimed weapons can be mounted on the front, back, right, or left side of the car. Armed weapons may also be mounted in a turret on the top of the body.\n* Arcs of fire\n** Hand Weapons\n*** The driver of a vehicle may fire directly ahead, or up to 90 degrees to the drivers side.\n*** The front passenger of a vehicle may fire in a 180 degree arc from directly ahead to directly behind.\n*** Rear passengers of a vehicle may fire directly behind, or up to 90 degrees to the side that they are on.\n*** Passengers standing up in a sunroof may fire in a 360 degree arc around the vehicle.\n*** Occupants in a convertible may fire in a 360 degree arc, except for the driver who is limited to the 180 degree forward arc.\n** Mounted Weapons\n*** Door mounts fire into a 90 degree arc measured from the adjacent side or rear square.\n*** Pintle mounts fire into a 180 degree arc, either forward or rear.\n*** Fixed mount - directly ahead, and 1 square (50mm) either side of directly ahead (in effect a 3 square (150mm) wide fire corridor)\n*** 180 Turrets are must be specified as either Forward or Rear facing\n*** 360 degree mounts can fire in any direction.\n* Machine Guns\nThe machine gun has been the mainstay of every army since the dawn of the 20th century. Light and cheap yet with a high rate of fire, they are very effective in high speed combat. The Gatlingstyle machine guns are a more recent design, and can devastate an opponent in seconds.\n** Option: Super High Density (SHD) ammo - Cost x 10, +25% weight, +1/die damage.\n** Machine Gun .223 (MG22) - To hit 11, 1d-4 damage, 1 hit. Cost $1200, weight 40 lb, 5 cf. Ammo costs $100, 80 lb, and has 100 seconds of ammo per cf.\n** Machine Gun .30 (MG30) - To hit 11, 1d-2 damage, 2 hits. Cost $1950, weight 70 lb, 9 cf. Ammo costs $200, 50 lb, and has 50 seconds of ammo per cf.\n** Machine Gun .50 (MG50) - To hit 11, 1d+2 damage, 4 hits. Cost $4200, weight 200 lb, 14 cf. Ammo costs $500, 50 lb, and has 20 seconds of ammo per cf.\n** Chain Gun .50 (CG5) - To hit 12, 2d+1 damage, 4 hits. Cost $6000, weight 210 lb, 22 cf. Ammo costs $500, 50 lb, and has 12 seconds of ammo per cf.\n** Automatic Shotgun\n** 20 mm Autocannon (AC) - To hit 12, 5d+1 damage, 6 hits. Cost $28900, weight 850 lb, 60 cf. Ammo costs $250, 20 lb, and has 2 seconds of ammo per cf. Burst effect.\n* Cannons\n** Option: Armor Piercing (AP) ammo - Cost x 3, +15% weight, +4/die damage.\n** 20 mm Anti-Tank Gun (ATG) - To hit 11, 2d+4 damage, 4 hits. Cost $5500, weight 460 lb, 38 cf. Ammo costs $250, 20 lb, and has 10 shots per cf. Burst effect.\n** 35 mm Cannon (C35) - To hit 11, 4d+10 damage, 7 hits. Cost $15600, weight 700 lb, 56 cf. Ammo costs $400, 20 lb, and has 6 shots per cf. Burst effect.\n** 60 mm Cannon (C60) - To hit 11, 7d+15 damage, 7 hits. Cost $31100, weight 1320 lb, 75 cf. Ammo costs $750, 20 lb, and has 4 shots per cf. Burst effect.\n* Laser Weapons - Heavy and expensive yet extremely accurate and powerful, lasers offer a decisive advantage to their wielder. This advantage is balanced by the expensive laser-reflective armor available.\n** Option: Infrared Modulation - Laser cost x 1.5, same weight, no penalty for firing through smoke.\n** Light Laser (LL) - To hit 14, 1d-3 damage, 2 hits. Cost $5000, weight 125 lb, 10 cf. Has 30 shots from a rechargeable battery.\n** Laser (L) - To hit 14, 2d-1 damage, 2 hits. Cost $10000, weight 350 lb, 25 cf. Has 30 shots from a rechargeable battery.\n** Heavy Laser (HL) - To hit 14, 4d-1 damage, 3 hits. Cost $22000, weight 675 lb, 40 cf. Has 30 shots from a rechargeable battery.\n* Flame-Throwers - Used as anti-tank weapons and bunker busters for decades, these fire breathers are more efficient and longer range than their predecessors.\n** Light Flame-Thrower (LFT) - To hit 13, 1d-1 damage, 2 hits. Cost $2500, weight 85 lb, 10 cf. Ammo costs $30, 40 lb, and has 4 seconds of ammo per cf.  Limited to a 40 yard range.\n** Flame-Thrower (FT) - To hit 13, 2d damage, 3 hits. Cost $4000, weight 150 lb, 20 cf. Ammo costs $30, 40 lb, and has 2 seconds of ammo per cf. Limited to a 60 yard range.\n** Heavy Flame-Thrower (HFT) - To hit 13, 3d damage, 4 hits. Cost $7000, weight 300 lb, 35 cf. Ammo costs $30, 40 lb, and has one second of ammo per cf. Limited to a 80 yard range.\n* Grenade Launchers\nAn automatic version of the popular infantry weapon. The gunner has the choice of attacking the target side of a vehicle or of attacking the top of the target at an additional -1 to hit. Used in this manner, the grenade launcher (other than the mortar, see below) is the only weapon that may fire OVER another car or obstacle, with no line-ofsight.\n** Options: Incendiary - Cost $650 per cf of ammo.\n** 40 mm Grenade Launcher (GL) - To hit 10, 2d damage, 3 hits. Cost $2850, weight 275 lb, 20 cf. Ammo costs $500, 45 lb, and has 30 shots of ammo per cf. Maximum range 100 yards. Burst effect.\n* Mortars - An infantry mainstay, somewhat inaccurate but extremely effective. Because of the general attempt of the gunner to place a mortar near the target, the gunner has the choice of attacking the target side of a vehicle or of attacking the top of the target at an additional -4 to hit. Similar to the 22 grenade launcher, the mortar may fire OVER another car or obstacle, with no line-of-sight.\n** Options: White Phosphorus (WP) - Cost x2.\n** 80mm Mortar - To hit 9, 6d damage, 4 hits. Cost $6500, weight 750 lb, 40 cf. Ammo costs $750, 50\nlb, and has 12 shots of ammo per cf. Maximum range 300 yards. Burst effect.\n* Rockets - Powerful and cheap, rockets are some of the most effective weapons in the game. They also are rather inaccurate. After the first one, each additional rocket of the same size mounted on the same side takes up only 50% of its space and weighs 75% its weight. Rockets have a range of about 1000 yards. All rockets are burst effect weapons.\n** Options: Pop-Up (PUR) - Minus 2 damage. Cost +70%. When a PUR hits the target car, the top side receives the damage.\n** White Phosphorus (WP) - Cost +20%, -1 damage.\n** Optical Target Recognition System (OTRS) - Cost +400%, -2 damage. To hit 9 within 100 yards, but locks on at 100 yards and has a to hit of 16 from there out, with no modifiers for range.\n** 45 mm Rocket (R45) - To hit 9, 2d damage, 1 hit. Cost $470, weight 80 lb, 8 cf. Only 1 shot.\n** 60 mm Rocket (R60) - To hit 9, 4d damage, 1 hit. Cost $950, weight 160 lb, 12 cf. Only 1 shot.\n** 89 mm Rocket (R89) - To hit 9, 6d damage, 1 hit. Cost $2150, weight 240 lb, 16 cf. Only 1 shot.\n** 120 mm Rocket (R120) - To hit 9, 8d damage, 1 hit. Cost $4500, weight 320 lb, 20 cf. Only 1 shot.\n** Rocket Pod\n!Dropped Weapons\nDropped weapons can only be mounted on the back or sides of a car.  A dropped weapon mounted on the side of a car is to the left or right.  Any number of dropped weapons may overlap, however, mines mixed with ACFO automatically go off (dealing mine damage to the firing car), but regular\n oil that comes into contact with ACFO does NOT ignite.\n* Mine Dropper (MD) - 2 hits, $1000, 50 lb, 15 cf.  When a vehicle goes within the range of a mine (a 2 yard radius), each wheel takes 1d damage and the underbody takes 2d+6 damage. Each mine is $100, 20 lb, and .5 cf. Burst effect.\n** Option: Claymore Mine (CM)- Costs $200 per cf., however when a claymore is dropped the direction of the blast must be specified.  Claymores may be set to attack the bottom, left, right, front, or back of a vehicle. When a vehicle goes within range of a claymore the side specified takes 3d+2 damage.\n* Oil Jet (OJ) - 3 hits, $300, 20 lb, 5 cf. Causes a 5 yard-radius oil slick to fill the road when fired. Driving over oil is a Turn III. Ammo costs $30, 40 lb, and has 5 shots per cf.\n** Option: Air-Contact Flaming Oil (ACFO) - Costs $1000 per cf, same as regular oil, but for every second a car is on the flaming slick it must roll as per a flame weapon on each tire and the underbody. ACFO burns out in 20 seconds.\n* Paint Sprayer (PS) - 2 hits, $500, 75 lb, 10 cf. Causes a 5 yard-radius paint cloud when fired. Ammo costs $100, 30 lb, and has 8 shots per cf. Paint dissipates in 3 seconds. Normal smoke penalty to 23 shoot through and if a car touches it treat that car as if it was night for the rest of the game. If already at night double the nighttime penalty.\n* Smokescreen (SS) - 4 hits, $400, 60 lb, 10 cf. Causes a 5 yard-radius smoke cloud when fired. Ammo costs $50, 20 lb, and has 9 shots per cf. Smoke dissipates in 10 seconds, whether or not a car drives close to it.\n* Spike Dropper (SD) - 3 hits, $750, 100 lb, 5 cf. Drops a 2 yard-radius cluster of spiked caltrops when fired. When a car goes over a cluster of these spikes, each wheel takes 1d-3 damage. Ammo costs $100, 20 lb, and has 10 seconds of ammo per cf.")
                      )
                    ),
                    Core.vx_new_string("Choose Extra Equipment"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Choose Extra Equipment"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Listed here are several options that may be built into a Q-car design. More may be added to this list by the players if they wish, however all players present must agree on the addition.\n* Airfoils - Airdam in the front and/or a Spoiler in the back.  +Handling Synergy.  Destroyable.  Costs 20% of final body cost and weighs 3% of final body weight each.\n* Active Suspension - $4000, 100 lb. A sophisticated electronic system controls the suspension to subtract .25 from the SR of a car.\n* Antilock Brakes - $1000, 10 lb. An advanced engineering system which prevents wheels from locking up when braking suddenly. +10 Dec, destroyable.\n* Brake Chute - A parachute mounted at the rear of the vehicle, designed to give rapid emergency deceleration. The vehicle must be travelling at least 60mph for the chute to deploy properly. 1-shot 60mph deceleration, minor option, destroyable.\n* Collision Spikes - $200, 30 lb. These nasty buggers pop out in the event of a collision with any object over 50 lb. One each may be mounted on the front, back, left or right sides. +Damage in a collision.\n* Convertible Top - Costs 50% of final body cost, weights 5% of final body weight, takes up 5% of internal space. When the convertible top is retracted, treat the top of the car as unarmored.  May be made to resemble fabric. Cars with a convertible top may not mount a turret.\n* Electronic Traction Control - $1000, 10 lb, 1 cf. A small chip that keeps the tires from spinning, reducing the problems of extreme acceleration and helping with cornering. Subtracts .25 from SR.\n* Fake Weapon - $200, 25 lb, 1 cf. Scary when it pops out to shoot, but doesn't do anything else. May be of any type.\n* Fire Extinguisher - $450, 150 lb, 5 cf. Puts out a car fire on a roll of 1-6 on one die. May only be discharged four times before needing reloading.\n* Lights and Sirens - Police lights, sirens and a handy little searchlight. Minor option, destroyable.\n* Link - $100. Links two weapons together, so that they are aimed and fired together. Roll separate to-hit and damage rolls for each weapon. The\nweapons may not fire individually; all of them must fire until the link is removed between fights.\n* Overdrive - An extra-tall gear that adds 15% to a vehicle's final top speed when activated, however when activated, acceleration is halved. Costs 50% of final body cost.\n* Ramplate - This can take the form of spikes, blades or a reinforced plate.  Costs 200% of final body cost, weighs 2 lb for every cf of body size. May only be mounted on the front.  +Damage in a collision involving the front of a car and -Damage taken.\n* Roll Cage - A tubular steel framework designed to enclose the vehicle's passenger compartment and maintain its shape. While it's designed primarily to protect occupants in the event of the car rolling onto its roof, it also offers significant protection against side impacts. Halves damage caused by side impacts, minor option.\n* Search Light\n* Stripped - Excess weight has been removed from the vehicle in order to improve performance. The vehicle is still street legal, though just barely. +10mph top speed +10 Acc.\n* Stripped to the Bones - Everything, absolutely everything not involved in making the car go forward very fast has been removed or lightened, to the point where the vehicle is no longer street legal (lacking things like headlights, indicators etc). +20mph top speed +20 Acc.\n* Sun Roof - Allows one occupant to stand and fire hand weapons from the sun roof in a 360 degree arc. Firer doing so counts as &quot;exposed&quot; for the purposes of incoming fire. May not be fitted to Bikes.\n* Targeting Computer - $2000, 10 lb, 1 cf. Gives a particular crew member +1 to hit with any of the car's weapons. Limit one per crew member. An Artificial Intelligence (AI) targeting computer may be bought for $10,000, 50 lb, and 3 cf. This gives one crew member +2 to hit.\n* Turret - A turret is the only way to give a weapon a 360 degree arc of fire.\n** Luggage turrets resemble a car-top carrier or suitcases strapped to the roof of a car.\n** Hidden turrets retract completely within the car when they are not needed. A car may only mount one turret, and it can only be as big as the car's maximum weapon space. A turret is protected by the car's top armor. Turrets are built just like car bodies.  For every cf of internal space a Luggage turret has, it takes up .2 cf, costs $50, and weighs 3 lb. For every cf of internal space a Hidden turret has, it takes up 1.2 cf, costs $100, and weighs 4 lb. For a weapon to be considered &quot;mounted&quot; in a turret, the entire weapon must fit into the turret's space.\nAmmunition does not have to be mounted in a turret with the weapon.\n* Wheel Guards - For each wheel protected wheel guards cost $7.5 and weigh 2.5 lb per point of armor. To protect it's left and right front wheels with 10 points of armor, a car would pay $150 and use 50 lb. The wheel guards must match the car's armor; if the car's armor is CA, FP or LR, then all wheel guards must be CA, FP or LR. The maximum points of armor per guard is equal to cf/10. Protects only from aimed shots, and only on a 1-7 on one die. Resemble solid wheel covers.\n* Wheelie Bar - Costs 10% of final body cost, weighs 5% of body weight, and takes up 2 cf of space. Adds 5 mph to maximum design acceleration.\n!Motorcycles\n* A cheap bike body is made from rough steel with crude weld points but is cheaper than the standard body. For every cf. of space a cheap\nbike body costs $10, weighs 4 lb yet has a maximum load of 28 lb.\n* A standard bike body consists of a basic unit-body construction of galvanized steel and steel alloys For every cf. of space a standard bike\nbody costs $15, weighs 4 lb and has a maximum load of 29 lb.\n* An expensive bike body is an advanced design using high-tech alloys and reinforced fiberglass. For every cf. of space an expensive bike\nbody costs $25, weighs 4 lb, and has a maximum load of 30 lb.\n* Sport option may be used, as can XLT option. Drivers and passengers only take up 6 cf, 175 lb. and 4 cf, 150 lb. respectively (no gunners allowed).\nEngines are smaller, lighter, and easier to build.\nFor bikes the smallest possible engine is 10 hp\n(minimum of one hit).\nCheap - $8, 3 lb, 0.14 cf.\nNormal - $20, 2.4 lb, 0.12 cf.\nHigh Output (HO) - $32, 1.8 lb, 0.10 cf.\nSuper High Output (SHO) - $44, 1.4 lb, 0.08 cf.\nExotic (EX) - $60, 1 lb, 0.06 cf.\nMotorcycles only have two wheels with (bike cf / 10) hits each, and may not have spares. Weapons may only be mounted on the front or back. No turrets or convertible tops are allowed, but all other accessories may be mounted, including wheel and suspension upgrades. Basic SR for bikes is 5, and all bikes have RWD.\nBikes only have three armor facings: front, back, and under. The other sides are considered unarmored. Anytime a bike takes damage from the back, a roll of 1 or 2 on one die means the damage bypasses the rear armor. A bike adds +1 to all it's Table Two rolls (see below). Motorcycles are -3 to target. Passengers may fire a hand weapon in any direction.\n** Cowling - A large aerodynamic cowling at the front. This both increases the bike's top speed, and offers protection to the rider from shots to the front. +10mph top speed, rider counts as Partially Exposed to shots from the front, minor option, destroyable.")
                      )
                    ),
                    Core.vx_new_string("Finishing the Design"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Finishing the Design"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Here is where the final calculations are made concerning a vehicles performance and statistics.\nA vehicle's Design Top Speed is found by using the formula:\nDesign Top Speed\n = ((engine hp x 3150) / car weight) + 30.\nThe Fury has a design top speed of ((260 x 3150) / 4342) + 30 = 218.62 mph. Now don't get too excited, we are not done yet.\nEvery car has an Acceleration (AC). The designer trades speed for acceleration by modifying the\nvehicle's transmission and engine layout before construction. A vehicle's Maximum Design Acceleration is calculated by using the following\nformula:\nMaximum Design Acceleration = 30 - (3 x SR)\nBe sure to round Maximum Design Acceleration down before recording it.\nThe maximum design acceleration of the Fury is 30 - (3 x 3.75) = 18.75 or 18 mph/s.\nAgain, don't get too excited. We want the car to be quick, but we don't want to lose too much of that top speed. So we decide to make the acceleration 7 mph/s. This may only give a real world 0-60 of 8.57 seconds, but in the game it gives a quarter mile time of under 16 seconds at 112 mph, which is not bad.\nNo vehicle may have an AC of more than the maximum. Determine what the new vehicle's AC will be. The AC you choose will determine the final top speed (TS). A vehicle's TS may be determined by the following formula:\nFinal Top Speed = Design Top Speed x (1 - ((AC x 5) / 100))\nOnce we have decided on an acceleration of 7, we can determine the final top speed. (7 x 5) = 35, divided by\n100 = 0.35. (1 - 0.35) = 0.65... 218.62 x 0.65 = 142 mph. Plus 10% for a sport body puts that up to 156 mph. Not bad at all.\nOnce the final TS is calculated, add the percentages for accessories and body style, if so equipped. Mileage at 65 mph (or top speed, if\nlower) is in miles per gallon and is equal to: Mileage = (9000 / (hp + (weight / 20)))")
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
   * @function chapter_land_sea_and_air_terrain
   * @return {chapter}
   * (func chapter_land_sea_and_air_terrain)
   */
  public static interface Func_chapter_land_sea_and_air_terrain extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_land_sea_and_air_terrain();
  }

  public static class Class_chapter_land_sea_and_air_terrain extends Core.Class_base implements Func_chapter_land_sea_and_air_terrain {

    @Override
    public Func_chapter_land_sea_and_air_terrain vx_new(Object... vals) {
      Class_chapter_land_sea_and_air_terrain output = new Class_chapter_land_sea_and_air_terrain();
      return output;
    }

    @Override
    public Func_chapter_land_sea_and_air_terrain vx_copy(Object... vals) {
      Class_chapter_land_sea_and_air_terrain output = new Class_chapter_land_sea_and_air_terrain();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/land_sea_and_air", // pkgname
        "chapter_land_sea_and_air_terrain", // name
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
    public Func_chapter_land_sea_and_air_terrain vx_empty() {return e_chapter_land_sea_and_air_terrain;}
    @Override
    public Func_chapter_land_sea_and_air_terrain vx_type() {return t_chapter_land_sea_and_air_terrain;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Land_sea_and_air.f_chapter_land_sea_and_air_terrain();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_land_sea_and_air_terrain() {
      return Land_sea_and_air.f_chapter_land_sea_and_air_terrain();
    }

  }

  public static final Func_chapter_land_sea_and_air_terrain e_chapter_land_sea_and_air_terrain = new Land_sea_and_air.Class_chapter_land_sea_and_air_terrain();
  public static final Func_chapter_land_sea_and_air_terrain t_chapter_land_sea_and_air_terrain = new Land_sea_and_air.Class_chapter_land_sea_and_air_terrain();

  public static Base.Type_chapter f_chapter_land_sea_and_air_terrain() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land, Sea and Air Terrain"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Terrain, Buildings"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terrain, Buildings"),
                Core.vx_new_string(":terrainmap"),
                Core.f_new(
                  Base.t_terrainmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Air Field"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Field"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May [Deploy] Aircraft\n* Repairs Aircraft\n* Required to extend Aircraft Range")
                      )
                    ),
                    Core.vx_new_string(":Barracks"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Barracks"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May [Deploy] Soldiers")
                      )
                    ),
                    Core.vx_new_string(":Bunker"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bunker"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A small stone or concrete building.\n* Gains [Armor] of stone/concrete except at [Point Blank Range].\n+1 [Defense]")
                      )
                    ),
                    Core.vx_new_string(":Dock"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dock"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Required to extend Naval Supply Lines")
                      )
                    ),
                    Core.vx_new_string("Field Headquarters"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Field Headquarters")
                      )
                    ),
                    Core.vx_new_string("Field Hospital"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Field Hospital"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May [Deploy] Infantry with [Medicine] Skill\n* Heals Soldiers")
                      )
                    ),
                    Core.vx_new_string("Fuel Depot"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fuel Depot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Required to extend Vehicle Supply Lines")
                      )
                    ),
                    Core.vx_new_string("Motor Pool"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Motor Pool"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May [Deploy] land Vehicles\n* Repairs land Vehicles")
                      )
                    ),
                    Core.vx_new_string(":Passageway"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Passageway"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Corridor")
                      )
                    ),
                    Core.vx_new_string(":Room"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Room")
                      )
                    ),
                    Core.vx_new_string(":Shipyard"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shipyard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* May [Deploy] Ships\n* Repairs Ships")
                      )
                    ),
                    Core.vx_new_string("Supply Depot"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Supply Depot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Required to extend Soldier Supply Lines")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Terrain, Natural"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terrain, Natural"),
                Core.vx_new_string(":terrainmap"),
                Core.f_new(
                  Base.t_terrainmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Broken Ground"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Broken Ground")
                      )
                    ),
                    Core.vx_new_string(":Burning"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Burning")
                      )
                    ),
                    Core.vx_new_string(":Cave"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cave"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cavern")
                      )
                    ),
                    Core.vx_new_string(":Desert"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Desert"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* +2 [Terrain Penalty]\n* +1 [Fatigue]/Turn\n* +1 [Thirst]/Hour\n* [Heat Wave]\n* [Mirage]")
                      )
                    ),
                    Core.vx_new_string(":Ice"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ice")
                      )
                    ),
                    Core.vx_new_string(":Jungle"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jungle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Flora - Native peoples are well versed in finding food from their jungle environment but for\nthe inexperienced there are many poisonous or harmful plants.  Vines and creepers should never\nbe grasped and pulled by the naked hand as many have sharp thorns, or can spilt into extremely\nsharp fibres, which can cause deep lacerations.  Bamboo can split to form sharp stakes when\nmature and any minor cut can be very serious due to the high risk of infection.  Many people\nwill have seen the classic film or TV scene where the hero cuts a vine and then drinks from it,\ndespite this being common scene it is not a good source of drinking water, if such water is\nred, yellow or milky in colour it is not safe to drink.  Large sections of bamboo can also\ncontain safe drinking water, to test for it tap the section of stem with blade or hard object\nand listen for a change in tone or sloshing sound, such water is safe to drink.  On the other\nhand many jungle plants are very well adapted to such a damp environment and finding suitable\nleaves to make a waterproof shelter is often an easy task.  Many plant saps contain irritants\nor toxins, which can be absorbed through the skin, so skin contact with plant sap should be\navoided.  Fungus is a major source of infections as in the high humidity the human body can\nbecome the perfect growing environment for a variety of unpleasant fungal parasites.  Care to\nkeep the feet dry using the correct powder is very important if at all possible as fungal foot\ninfections in the jungle can quickly slow a person and turn a healthy one into a casualty.\n* Fauna - Jungles team with life but the greatest threat comes not from large animals but from\ninvertebrates and smaller poisonous reptiles.  Large predators such as Jaguar, Anaconda, and\ncrocodiles will rarely attack adult humans.  Much more dangerous are the vast array of\nstinging and biting insects which can cause sickness or be carriers for disease such as\nmalaria and yellow fever.  If scratched mosquito bites can quickly become infected in such\nconditions draining morale and strength.  Scorpions, poisonous spiders and even poisonous\nfrogs inhabit some jungles so checking your foot ware for visitors before putting your feet\ninto them in the morning is vital.  In some areas soldier ants can be a problems so sleeping\nshould be done in hammocks above the ground, this also offers some protection against snakes\nand other nocturnal visitors.  Larger predators and scavengers can be attracted by waste food\nand bodily waste so camp hygiene is important.  If your party is strong and well armed certain\nlarge jungle animals can provide large amounts of fresh meat but such creatures are not easy\nto hunt and kill, wild boar and pigs are powerful animals.  Most snakes are edible, an\nAnaconda can feed a small village but the capture and killing of one is not an easy task. Due\nto the variety of parasites and climate conditions the consumption of animals that you may\nfind already dead is to be strongly avoided.\n* Environmental Hazards - Jungles are extremely hot and humid places and such conditions can\nplace an enormous strain on the body.  Despite the humidity dehydration can be a real problem\nand although water can be plentiful, clean water may not be.  The jungle has a reputation for\nquickly destroying the fitness levels of the inexperienced, through dehydration, malnutrition,\ndisease and fatigue.  River crossings can be extremely hazardous and the simple precaution of\nwearing a condom (for the male members of the party) can prevent some very nasty parasites\nentering the body.  Psychologically the jungles constant wall of green and low light levels\nbeneath the canopy can seriously affect motivation and the sounds of the nocturnal animals\ncan also be disturbing for those unused to them.  All this said many native peoples around the\nworld have learned to adapt and even thrive in such conditions.")
                      )
                    ),
                    Core.vx_new_string(":Lava"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lava")
                      )
                    ),
                    Core.vx_new_string("Open Water"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Open Water")
                      )
                    ),
                    Core.vx_new_string(":Plains"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plains")
                      )
                    ),
                    Core.vx_new_string(":Quicksand"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Quicksand")
                      )
                    ),
                    Core.vx_new_string(":Sand"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sand")
                      )
                    ),
                    Core.vx_new_string(":Scrubland"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scrubland")
                      )
                    ),
                    Core.vx_new_string(":Steppeland"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Steppeland")
                      )
                    ),
                    Core.vx_new_string(":Snow"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snow")
                      )
                    ),
                    Core.vx_new_string(":Swamp"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swamp"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Bog Fen Murk")
                      )
                    ),
                    Core.vx_new_string(":Whitewater"),
                    Core.f_new(
                      Base.t_terrain,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Whitewater")
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
   * @function chapter_land_sea_and_air_unit_types
   * @return {chapter}
   * (func chapter_land_sea_and_air_unit_types)
   */
  public static interface Func_chapter_land_sea_and_air_unit_types extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_land_sea_and_air_unit_types();
  }

  public static class Class_chapter_land_sea_and_air_unit_types extends Core.Class_base implements Func_chapter_land_sea_and_air_unit_types {

    @Override
    public Func_chapter_land_sea_and_air_unit_types vx_new(Object... vals) {
      Class_chapter_land_sea_and_air_unit_types output = new Class_chapter_land_sea_and_air_unit_types();
      return output;
    }

    @Override
    public Func_chapter_land_sea_and_air_unit_types vx_copy(Object... vals) {
      Class_chapter_land_sea_and_air_unit_types output = new Class_chapter_land_sea_and_air_unit_types();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/land_sea_and_air", // pkgname
        "chapter_land_sea_and_air_unit_types", // name
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
    public Func_chapter_land_sea_and_air_unit_types vx_empty() {return e_chapter_land_sea_and_air_unit_types;}
    @Override
    public Func_chapter_land_sea_and_air_unit_types vx_type() {return t_chapter_land_sea_and_air_unit_types;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Land_sea_and_air.f_chapter_land_sea_and_air_unit_types();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_land_sea_and_air_unit_types() {
      return Land_sea_and_air.f_chapter_land_sea_and_air_unit_types();
    }

  }

  public static final Func_chapter_land_sea_and_air_unit_types e_chapter_land_sea_and_air_unit_types = new Land_sea_and_air.Class_chapter_land_sea_and_air_unit_types();
  public static final Func_chapter_land_sea_and_air_unit_types t_chapter_land_sea_and_air_unit_types = new Land_sea_and_air.Class_chapter_land_sea_and_air_unit_types();

  public static Base.Type_chapter f_chapter_land_sea_and_air_unit_types() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land Sea and Air Unit Types"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Land Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Land Units"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* [Land Map]\n* [Standard Scale]\n\nHierarchy\n* Fireteam - 4-5 infantry led by a Lance Corporal or Sergeant\n* Squad - 2+ Fireteams (8-16) led by a Corporal or Staff Sergeant\n* Platoon - 2+ Squads (25-60) led by a Warrant Officer or Lieutenant\n* Company - 2-8 Platoons (70-250) led by a Major\n* Battalion - 2-6 Companies (300-1000) led by a Lieutenant Colonel\n* Regiment - 2+ Battalions (2000-3000) led by a Colonel\n* Brigade - 2+ Regiments (3000-5000) led by a Brigadier\n* Division - 2-4 Brigades (10,000-20,000) led by a Major General\n* Corps - 2+ Divisions (30,000-50,000) led by a Lieutenant General\n* Army - 2+ Corps (50,000-60,000) led by a General\n* Army Group - 2+ Armies (100,000+) led by a General or a Field Marshal\n* Theater / Front - 10+ Army Groups (1,000,000+) led by a General or Field Marshal"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Modern Land Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Land Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Motorcycle"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Motorcycle")
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
            Core.vx_new_string("Naval Vessels"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Naval Vessels"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("200% Load, 75% Speed, -1 Handling"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Archaic Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Archaic Naval Vessels"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* [Ocean Map]\n* [Standard Scale]\n\nHierarchy\n* Flotilla - A small number of non-capital vessels, usually of the same or similar types led by a Flotilla Admiral or a\nCommodore.\n* Squadron - A small number of vessels including capital ships led by a Rear Admiral or a Commodore.\n* Task Group - 2 Squadrons led by a Rear Admiral\n* Task Force / Battlefleet - 2 Task Groups led by a Vice Admiral\n* Fleet - 2 Task Forces led by an Admiral\n* Navy / Admiralty - 2 Fleets led by a Fleet Admiral"),
                        Core.vx_new_string(":rulemap"),
                        Core.f_new(
                          Base.t_rulemap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Broadside"),
                            Core.f_new(
                              Base.t_rule,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Broadside"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Rules/Images/Broadside.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Archaic ships mount large guns on each side of the ship and must turn sideways to attack targets.  All attacks\nfrom such guns may only fire directly at 90 degrees from the front of the ship.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Canoe"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Canoe"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mini, Stripped, Unpowered")
                              )
                            ),
                            Core.vx_new_string(":Catamaran"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catamaran")
                              )
                            ),
                            Core.vx_new_string("Deep Sea Explorer Submarine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deep Sea Explorer Submarine")
                              )
                            ),
                            Core.vx_new_string(":Dinghy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dinghy")
                              )
                            ),
                            Core.vx_new_string("Fishing Boat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fishing Boat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Medium, Stripped, Sail")
                              )
                            ),
                            Core.vx_new_string(":Frigate"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Frigate")
                              )
                            ),
                            Core.vx_new_string(":Galley"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Galley")
                              )
                            ),
                            Core.vx_new_string(":Galleon"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Galleon")
                              )
                            ),
                            Core.vx_new_string(":Kayak"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kayak"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mini, Sport, Stripped, Unpowered")
                              )
                            ),
                            Core.vx_new_string("Merchant Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Merchant Ship")
                              )
                            ),
                            Core.vx_new_string(":Minisub"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Minisub")
                              )
                            ),
                            Core.vx_new_string(":Outrigger"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Outrigger")
                              )
                            ),
                            Core.vx_new_string(":Rowboat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rowboat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Light, Stripped, Unpowered")
                              )
                            ),
                            Core.vx_new_string("War Barge"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("War Barge")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Modern Civilian Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Civilian Vessels"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cruise Liner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cruise Liner")
                              )
                            ),
                            Core.vx_new_string("Hydrofoil Passenger Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hydrofoil Passenger Ship")
                              )
                            ),
                            Core.vx_new_string("Jet Ski"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jet Ski"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Light, Sport")
                              )
                            ),
                            Core.vx_new_string(":Runabout"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Runabout")
                              )
                            ),
                            Core.vx_new_string(":Sunfish"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sunfish"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Light, Sport, Stripped")
                              )
                            ),
                            Core.vx_new_string(":Surfboard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Surfboard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Sport, Stripped, Unpowered")
                              )
                            ),
                            Core.vx_new_string("Tanker Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tanker Ship")
                              )
                            ),
                            Core.vx_new_string("Tramp Steamer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tramp Steamer")
                              )
                            ),
                            Core.vx_new_string("Transport Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transport Ship")
                              )
                            ),
                            Core.vx_new_string("Super Tanker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Super Tanker")
                              )
                            ),
                            Core.vx_new_string("Swamp Buggy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swamp Buggy")
                              )
                            ),
                            Core.vx_new_string("Windsurf Board"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Windsurf Board"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Personal, Sport, Stripped, Sail")
                              )
                            ),
                            Core.vx_new_string(":Yacht"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yacht")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Modern Military Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Modern Military Vessels"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Aircraft Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aircraft Carrier")
                              )
                            ),
                            Core.vx_new_string("Battleship Class"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battleship Class")
                              )
                            ),
                            Core.vx_new_string(":Cruiser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cruiser")
                              )
                            ),
                            Core.vx_new_string(":Destroyer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Destroyer")
                              )
                            ),
                            Core.vx_new_string(":Dreadnought"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dreadnought")
                              )
                            ),
                            Core.vx_new_string(":Gunboat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gunboat")
                              )
                            ),
                            Core.vx_new_string("Hunter Killer Submarine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunter Killer Submarine")
                              )
                            ),
                            Core.vx_new_string("Nuclear Submarine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nuclear Submarine")
                              )
                            ),
                            Core.vx_new_string("Torpedo Boat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo Boat")
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
            Core.vx_new_string(":Aircraft"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Aircraft"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Hierarchy\n* Flight - 4-6 Aircraft led by a Captain or Flight Lieutenant\n* Squadron - 3-4 Flights (7-16 Aircraft) led by a Lieutenant Colonel or a Squadron Leader\n* Wing - 3-4 Squadrons (17-48  Aircraft) led by a Wing Commander\n* Air Wing - 2+ Wings (48-100  Aircraft) led by a Brigadier or a a Air Commodore"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Stall Speed"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stall Speed")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Unmanned Aerial Vehicles (UAV)"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unmanned Aerial Vehicles (UAV)")
                      )
                    ),
                    Core.vx_new_string("Personal Aircraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Personal Aircraft"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Parachute"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Parachute")
                              )
                            ),
                            Core.vx_new_string(":Hanglider"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hanglider")
                              )
                            ),
                            Core.vx_new_string("Jet Pack"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jet Pack")
                              )
                            ),
                            Core.vx_new_string(":Sailplane"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sailplane"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Civilian Glider")
                              )
                            ),
                            Core.vx_new_string(":Ultralight"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ultralight")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Helicopters"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Helicopters"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Gyroplane"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gyroplane")
                              )
                            ),
                            Core.vx_new_string("Mini Copter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mini Copter")
                              )
                            ),
                            Core.vx_new_string("Civilian Helicopter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Civilian Helicopter")
                              )
                            ),
                            Core.vx_new_string("Attack Helicopter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Attack Helicopter")
                              )
                            ),
                            Core.vx_new_string("Cargo Copter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cargo Copter")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Prop Planes"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Prop Planes"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Bi-Plane"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bi-Plane")
                              )
                            ),
                            Core.vx_new_string("Cargo Transport, Prop"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cargo Transport, Prop")
                              )
                            ),
                            Core.vx_new_string("Fighter, Prop"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fighter, Prop")
                              )
                            ),
                            Core.vx_new_string("Flying Fortress"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flying Fortress")
                              )
                            ),
                            Core.vx_new_string(":Osprey"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Osprey")
                              )
                            ),
                            Core.vx_new_string("Piper Cub"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Piper Cub")
                              )
                            ),
                            Core.vx_new_string("Turbojet Plane"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Turbojet Plane")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Jet Planes"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jet Planes"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Private Jet"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Private Jet")
                              )
                            ),
                            Core.vx_new_string("Commercial Airliner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commercial Airliner")
                              )
                            ),
                            Core.vx_new_string("Cargo Transport, Jet"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cargo Transport, Jet")
                              )
                            ),
                            Core.vx_new_string(":Harrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Harrier")
                              )
                            ),
                            Core.vx_new_string("Interceptor, Jet"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Interceptor, Jet")
                              )
                            ),
                            Core.vx_new_string("Tank Buster"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tank Buster")
                              )
                            ),
                            Core.vx_new_string(":Bomber"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bomber")
                              )
                            ),
                            Core.vx_new_string("Strategic Bomber"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Strategic Bomber")
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
            Core.vx_new_string("Strategic Movement"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Strategic Movement")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_maps
   * @return {chapter}
   * (func chapter_maps)
   */
  public static interface Func_chapter_maps extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_maps();
  }

  public static class Class_chapter_maps extends Core.Class_base implements Func_chapter_maps {

    @Override
    public Func_chapter_maps vx_new(Object... vals) {
      Class_chapter_maps output = new Class_chapter_maps();
      return output;
    }

    @Override
    public Func_chapter_maps vx_copy(Object... vals) {
      Class_chapter_maps output = new Class_chapter_maps();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/land_sea_and_air", // pkgname
        "chapter_maps", // name
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
    public Func_chapter_maps vx_empty() {return e_chapter_maps;}
    @Override
    public Func_chapter_maps vx_type() {return t_chapter_maps;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Land_sea_and_air.f_chapter_maps();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_maps() {
      return Land_sea_and_air.f_chapter_maps();
    }

  }

  public static final Func_chapter_maps e_chapter_maps = new Land_sea_and_air.Class_chapter_maps();
  public static final Func_chapter_maps t_chapter_maps = new Land_sea_and_air.Class_chapter_maps();

  public static Base.Type_chapter f_chapter_maps() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Maps"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Maps"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Maps"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Air Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Air Map")
                      )
                    ),
                    Core.vx_new_string("Ocean Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ocean Map")
                      )
                    ),
                    Core.vx_new_string("Swamp Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Swamp Map")
                      )
                    ),
                    Core.vx_new_string("Underwater Map"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Underwater Map")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Terrain"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Terrain"),
                Core.vx_new_string(":rulemap"),
                Core.f_new(
                  Base.t_rulemap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Cave"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cave"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("[Hazard]: Cave in.")
                      )
                    ),
                    Core.vx_new_string(":Jungle"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jungle"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("[Hazard]: Difficulty starts at 2 for a sparse, mostly safe jungle.")
                      )
                    ),
                    Core.vx_new_string(":Snow"),
                    Core.f_new(
                      Base.t_rule,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Snow"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("[Hazard]: Avalanche.")
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
        "nx/tactics/books/land_sea_and_air", // pkgname
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
      output = Land_sea_and_air.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Land_sea_and_air.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Land_sea_and_air.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Land_sea_and_air.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Land, Sea and Air"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("LandSeaAndAir.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Land, Sea and Air Overview"),
            Land_sea_and_air.f_chapter_land_sea_and_air_overview(),
            Core.vx_new_string("Land Sea and Air Unit Types"),
            Land_sea_and_air.f_chapter_land_sea_and_air_unit_types(),
            Core.vx_new_string("Land Sea and Air Rules"),
            Land_sea_and_air.f_chapter_land_sea_and_air_rules(),
            Core.vx_new_string("Land, Sea and Air Terrain"),
            Land_sea_and_air.f_chapter_land_sea_and_air_terrain(),
            Core.vx_new_string("Maps"),
            Land_sea_and_air.f_chapter_maps()
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
    mapfunc.put("chapter_land_sea_and_air_overview", Land_sea_and_air.t_chapter_land_sea_and_air_overview);
    mapfunc.put("chapter_land_sea_and_air_rules", Land_sea_and_air.t_chapter_land_sea_and_air_rules);
    mapfunc.put("chapter_land_sea_and_air_terrain", Land_sea_and_air.t_chapter_land_sea_and_air_terrain);
    mapfunc.put("chapter_land_sea_and_air_unit_types", Land_sea_and_air.t_chapter_land_sea_and_air_unit_types);
    mapfunc.put("chapter_maps", Land_sea_and_air.t_chapter_maps);
    mapfunc.put("tacticsbook", Land_sea_and_air.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/land_sea_and_air", maptype, mapconst, mapfunc);
  }

}
