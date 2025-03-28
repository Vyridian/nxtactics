'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_power {

  /**
   * @function powermap_tactics
   * Returns the base powermap
   * @param  {tactics} tactics
   * @return {powermap}
   */
  static t_powermap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_powermap_tactics = {
    vx_type: nx_tactics_decks_power.t_powermap_tactics
  }

  // (func powermap-tactics)
  static f_powermap_tactics(tactics) {
    let output = nx_tactics_base.e_powermap
    output = nx_tactics_base.f_powermap_from_powerlist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Armored",
        ":summary",
        "* Armor normally alters appearance and may be a permanent alteration or a suit that may be donned.\n* [+1 Value] for Armor that can appear on demand.\n* [+2 Value] for Armor that cannot be detected.\nBody Armor may be permanent or temporary.  If permanent, no time is needed to activate it, but is must either be donned and carried or it permanently alters appearance.",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Auto Med System", "Ablative Armor", "Body Flares", "Cold Resistant", "Corrosion Resistant", "Cryo Sleep System", "Electrical Resistant", "Energy Resistant", "Environmental Containment", "Environmental Independence", "Fire Resistant", "Floation Device", "Grappling Hoist", "Infrared Dampener", "Magnetic Resistant", "Missile Mount", "Pierce Resistant", "Plasma Resistant", "Pressure Resistant", "Radar Dampener", "Radar Jammer", "Radiation Resistant", "Reactive Armor", "Turret Mount", "Ultraviolet Jammer", "Underwater Operation")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Atomic Control",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Destruction", "Disintegrate")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Charm",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Commanding Presense")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Density Control"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Genius",
        ":titles",
        "Genius, Prodigy, Savant, Super Genius",
        ":stat",
        "Mind",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Analyze Weakness", "Calculator Mind", "Engineering Genius", "Financial Genius", "Multitasking", "Investigative Genius", "Linguistic Genius", "Mathematical Genius", "Photographic Memory", "Scientific Genius", "Speed Reading", "Tactical Genius")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Ground Movement",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "2-Legged", "3-Legged", "4-Legged", "6-Legged", "8-Legged", "Hover", "Jump Jets", "Off Roading", "Snowcraft", "Tracked", "Turbo Booster", "Wheeled")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Interstellar Movement",
        ":abilitymap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_abilitymap},
          ":Hyperdrive",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hyperdrive", ":image", "Units/SpaceAndTime/Hyperspace.jpg", ":summary", "* Faster than light travel can be accomplished by warping space into a Wormhole/Black hole, dropping out of normal space and travelling through the parallel universe called Hyperspace/Tachyon Space where physical laws are not bound by the relationship between mass and the speed of light, and finally returning to normal space by creating another space warp.\n* Hyperspace/Tachyon Space - Tachyon Space, like other dimensions is at right angles to our existing 3 dimension. In Hyperspace, time and distance have different meanings, all particles are tachyons, and the speed of light is an absolute minimum speed instead of a maximum. Travelling through Hyperspace is exceptionally hazardous. In fact, any deviation from the calculated route cause the corridor to collapse leaving one stranded in Hyperpace forever with no way to calculate a return.\n* Calculating a Route - Once a destination is chosen, complex calculations must be performed to calculate a direct route from the current location to the destination through the shifting reality of Hyperspace. A successful route will be a 'straight' line through Hyperspace. Proximity to a gravity well makes these calculations next to impossible. Typically, all ship computer resources are required for this calculation and the larger the ship fewer the available routes and therefore the greater the complexity. Ships may only enter and exit hyperspace at the edge of a solar system and must use conventional sub light drives within the system. A day or more at sub-light speed is therefore required to reach or leave a planet in an inner solar system. Route calculation time is roughly light years x tons / 10secs e.g. 4 light years x 100 tons / 10 = 40sec.\n* Hyperspace Corridor - Once calculated, the ship must meet the speed defined by the calculation while modulating the Hyperdrive energy signature to match the bridge to Hyperspace. If all goes well, the vast energies in Tachyon Space will form a corridor directly to the destination. Errors in any of the steps usually involve intense gravitional shearing forces that will at best cause damage to the Hyperdrive and leave the traveller stranded in deep space, or worse, Hyperspace.\n* Travel in Hyperspace - Hyperspace travel is typically a boring affair. The Hyperspace corridor carries the ship to its destination, so no manuevering is needed. The time spent in Hyperspace varies, but is usually proportional to the distance. Transit time is roughly 2 hours per light year travelled (e.g. 4 light years x 2 = 8hours)\n* Tachyon Doppler Effect - When the Hyperspace Corridor is created, both ends of the corridor will start leaking Tachyons which can be detected by sensitive instruments. The amount of Tachyons increases with the size of the ship, the distance travelled and the closer the time of arrival.\n* Tachyon Relay Network - Satellites at the edge of stellar systems use Hyperspace Corridors to beam tranmissions through Hyperspace to their opposites in other systesm. Since these communications have negligible mass, the calculations are nearly instantaneous though the same transit times apply.\n* History - Imaginary Space, I-Space - While studying fusion plant efficiency using various algorithms, a surprising discovery was made: very rarely and seemingly at random, the plant would produce a tiny tachyon burst. After decades of study, a pattern began to emerge along with a shocking discovery: only algorithms using imaginary numbers could trigger a burst and a small amount of particles were actually disappearing during the event. Where the particles were going became the primary focus of astrophysics from then on. Eventually a hypothesis gathered momentum. The particles were leaving real space and traveling along trajectories plotted through so called imaginary space. This implied that the destination of the particles could be predicted. After much trial and error another breakthrough: a second tachyon burst moments after the first and many kilometers away. The particles had returned. Faster than light travel was possible. The implications for communications were immediately obvious, but could something larger make the trip? Research was slow because increased mass meant increased complexity. The power and computational needs were high but not unachievable. Only a decade later the first successful test craft made the trip. A decade later commercial hyperdrives became available. A decade later they were affordable on even modest starships.", ":titles", "FTL Drive, Gravity Drive, Gravity Lens, Subspace Drive, T-Drive, Tachyon Drive, Warp Drive")
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Jump Drive",
        ":image",
        "Units/SpaceAndTime/Wormhole.jpg",
        ":reference",
        "* I created the Event Horizon to reach the stars, but she's gone much, much farther than that. She tore a hole in our universe, a gateway to another dimension. A dimension of pure chaos. Pure... evil. When she crossed over, she was just a ship. But when she came back... she was alive! - Dr. Weir, Event Horizon",
        ":summary",
        "* Jump Drives generate energy pulses in the ship's drive to create ripples in the fabric of space.  Each pulse must be precisely timed to the apex of each ripple to create an increasing harmonic wave (the 'Wave Motion' effect). Eventually, the energy of the occillation becomes too great, a tear in space is produced, and the starship falls in.",
        ":titles",
        "Gate Drive, Stargate, Wave Motion Engine, Wormhole",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Strategic Warp Jump", "Tactical Warp Jump")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Copy"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Disruption"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Drain"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Feedback"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Fluctuation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Reflection"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Theft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Power Vampire"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Psychic Power",
        ":summary",
        "* This skill is used when manifesting and controlling a [Power] that directly affect the [Will] of targets.\n* Psychic Powers must have range and see or 'know' the target.",
        ":titles",
        "Psychic Combat, Psychological Warfare, Soul Combat, Spirit Combat, Test of Will",
        ":stat",
        "Will",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Ego Whip", "Psychic Duel", "Psychic Knife", "Tower of Iron Will")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Toxins",
        ":reference",
        "* Say 'ah'. Some poisons can kill people in the thousands with that amount. Like botulinum toxin. It inhibits acetylcholine release, causing loss of muscle tone, lethary, .. dizziness .., visual impairment.., heavy eyelids, intense thirst, loss of speech, vomiting, diarrhea, stomach distention, breathing difficulty.. then.. respiratory failure. - A.K.I, Street Fighter 6",
        ":titles",
        "Poisonous, Venomous",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Blinding Spit", "Blinding Toxin", "Irritating Toxin", "Paralyzing Bite", "Paralyzing Spit", "Paralyzing Spray", "Paralyzing Sting", "Poison Bite", "Poison Blood", "Poison Spit", "Poison Spray", "Poison Sting", "Poison Touch", "Poisonous Flesh", "Poisonous Skin")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Transfiguration",
        ":summary",
        "* The ability to transform others.",
        ":titles",
        "Fleshcrafting, Vissisitude",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Blinding", "Body Morph", "Deafening", "Face Molding", "Face Off", "Malleate", "Sensory Deprivation", "Sensory Overload")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Transmutation",
        ":summary",
        "* The ability to transform non-living matter.",
        ":titles",
        "Reality Warper, Shaper, Transmuter",
        ":stat",
        "Mind",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Molecular Alteration", "Petrification", "Polymorph")
      )
    )
    return output
  }

  /**
   * @function tactics_powermap_from_tactics
   * Returns a tactics updated with powermap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_powermap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_powermap_from_tactics = {
    vx_type: nx_tactics_decks_power.t_tactics_powermap_from_tactics
  }

  // (func tactics-powermap<-tactics)
  static f_tactics_powermap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const powermap = nx_tactics_decks_power.f_powermap_tactics(tactics)
        return vx_core.f_copy(tactics, ":powermap", powermap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "powermap-tactics": nx_tactics_decks_power.e_powermap_tactics,
      "tactics-powermap<-tactics": nx_tactics_decks_power.e_tactics_powermap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "powermap-tactics": nx_tactics_decks_power.t_powermap_tactics,
      "tactics-powermap<-tactics": nx_tactics_decks_power.t_tactics_powermap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/power",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func powermap-tactics)
    nx_tactics_decks_power.t_powermap_tactics['vx_value'] = {
      name          : "powermap-tactics",
      pkgname       : "nx/tactics/decks/power",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_power.f_powermap_tactics
    }

    // (func tactics-powermap<-tactics)
    nx_tactics_decks_power.t_tactics_powermap_from_tactics['vx_value'] = {
      name          : "tactics-powermap<-tactics",
      pkgname       : "nx/tactics/decks/power",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_power.f_tactics_powermap_from_tactics
    }

  }
}
