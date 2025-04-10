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
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Aeromancy", ":summary", "* Aero is the magical version of Air.\n* Aero effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Aero reacts with Pyro to produce the [Wildfire] effect.\n* Aero reacts with Cryo to produce the [Chill] effect.\n* Aero reacts with Hydro to produce the [Fog] effect.\n* Aero reacts with Electro to produce the [Ionized] effect.\n* Aero reacts with Geo to produce the [Weightess] effect."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Dreaming",
        ":reference",
        "* I don't believe it.  That is why you fail.  Luke and Yoda - Empire Strikes Back",
        ":summary",
        "* This is the magical art of the [Fae].\n* Every child has a sense of wonder that comes with being new to the world. Adults must, of necessity, murder that special innocence in order to grow up.\n* When humanity turned its collective back on Dreaming, a terrible scourge of disbelief and negation smote the world. Hope, trust, and imagination were replaced with reason, pessimism, and scrutiny. By dismissing hope and faith, humanity avoids being hurt by its failure. Shutting out mystery and dreams anesthetizes fear, but deadens beauty as well and leads to apathy, callosuness, and close-mindedness. Though Banality is a mindless force, it is feared by the [Fae] more than any monster or villain. It is an enemy unlike anything the [Fae] have ever encountered, and they are largely helpless in its grasp.\n* Dreaming is never the same, so any Dreaming effect must be a uniquely crafted idea or it will automatically fail.",
        ":titles",
        "Glamour",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "As if in a Dream", "Concoct Dream Essence", "Create Chimera", "Down the Rabbit Hole", "Dreamcatching", "Dreamreading", "Dreamriding", "Dreamquest", "Dream Effectively", "Dream Riding", "Dream Sight", "Dream Speak", "Dream Weaving", "Epiphany", "Eyes of a Child", "Fond Memories", "Imaginary Friend", "Living Nightmare", "Nightmare Essence", "Pillow Fort", "Rapture", "Ravaging", "Reverie", "Seeming", "Shattered Dreams", "Wall of Wonders")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Electromancy",
        ":reference",
        "* Lightning is eternal, the world is but shadow. - Raiden Shogun, the Electro Archon, Genshin Impact",
        ":summary",
        "* Electro is the magical version of Electricity.\n* Electro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Electro reacts with Pyro to produce the [Overload] effect.\n* Electro reacts with Cryo to produce the [Superconduct] effect.\n* Electro reacts with Hydro to produce the [Electrocharged] effect.\n* Electro reacts with Geo to produce the [Grounded] effect.\n* Electro reacts with Aero to produce the [Ionized] effect.\n* Electric Elementalist personalities are influenced by their link to Electricity.\n* Energetic, Explosive, Dynamic, Animated, Spark of Life, High Strung\n* Symbol - Yellow Lightning",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Absorb Electricity", "Arc Lightning", "Ball Lightning", "Body Electric", "Call Lightning", "Control Lightning", "Electromagnetic Pulse", "Lightning Charge", "Lightning Lash", "Lightning Pillar", "Lightning Warp", "Resist: Electricity")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Geomancy", ":summary", "* Geo is the magical version of Earth.\n* Geo effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Geo reacts with Pyro to produce the [Overheat] effect.\n* Geo reacts with Cryo to produce the [Brittle] effect.\n* Geo reacts with Hydro to produce the [Quagmire] effect.\n* Geo reacts with Electro to produce the [Grounded] effect.\n* Geo reacts with Aero to produce the [Weightess] effect."),
      vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Pyromancy", ":summary", "* Pyro is the magical version of Earth.\n* Pyro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Pyro reacts with Geo to produce the [Overheat] effect.\n* Pyro reacts with Cryo to produce the [Melt] effect.\n* Pyro reacts with Hydro to produce the [Vaporize] effect.\n* Pyro reacts with Electro to produce the [Overload] effect.\n* Pyro reacts with Aero to produce the [Wildfire] ability."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Sorcery",
        ":reference",
        "* This is forbidden. This is a summoning. I cannot speak this!... There is no light here. You came to the darkness for knowledge... And all the knowledge you seek is here. Surrender. Speak the words. Call her home. By three thay come. By three thy way opens. By the blood of the willing. We call thee home. Hail, daughter of hatred. Hail, Lilith. - Diablo IV",
        ":titles",
        "Sorcerer, Sorceress, Sorceress Queen, Summoner",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Daedalus Gateway", "Dimension Door", "Dimensional Gateway", "Gateway", "Soul Pact", "Summon Demon", "Summon Devil", "Summon Familiar", "Summon Item")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Thaumaturgy",
        ":summary",
        "* The interface between Magic and Science. Mathematics, Biology, Geology and Chemistry are studied to manifest amazing creations.\n* Thaumaturgy can create permanent artificial life.\n* Thaumaturgy favors crytals and gemstones for power supplies.",
        ":titles",
        "The Art Mathematical, Wonder Working",
        ":abilitymap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_abilitymap},
          "Create Homunculus",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Create Homunculus"),
          "Prepare Lightning in a Bottle",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Lightning in a Bottle", ":summary", "* Create [Lightning in a Bottle].")
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Wizardry",
        ":summary",
        "* Conventional Wizardry believes that everything in the universe holds massive energy potential waiting to be unleashed.\n* Wizardry is the study of Magic itself. As such it is a sort of meta-Magic, focused on altering magical energies.",
        ":titles",
        "Archmagi, Magi, Wizard",
        ":abilitymap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_abilitymap},
          "Analyze Magic",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Analyze Magic", ":summary", "* Gain understanding of a magical item or effect."),
          ":Counterspell",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Counterspell", ":summary", "* [Interrupt]: Roll a defense roll against a magical ability. If the defense succeeds, the ability has no effect."),
          ":Dampen",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dampen", ":summary", "* Magic can easily be reduced since magic already has a tentative hold on reality."),
          ":Dispel",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dispel", ":summary", "* Attack a placed magical ability.  Each hit weakens its abilities."),
          ":Fork",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fork", ":summary", "* Duplicate an allied caster's magical ability. The other caster fully controls both abilities but may not aim both at the same target."),
          ":Magnify",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Magnify", ":summary", "* Magnify draws from the potential energy in all things to increase the power in an existing force.\n* Note: Magic cannot be magnified. Magic only simulates reality and has no hidden reserves to tap.\n!Examples\n* An arrow can hit with devastating force.\n* A bird's weight can be increased so it falls.\n* A fire can be enhanced into an inferno while not burning fuel faster or producing additional smoke. The fuel has near infinite reserves to draw upon."),
          "Mana Burn",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mana Burn"),
          "Mana Leak",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mana Leak"),
          "Mana Shield",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mana Shield", ":summary", "* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: Protected with level Armor from all [Physical] [Damage]."),
          "Mirror Shield",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mirror Shield", ":summary", "* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: If defender was targetted by an [Energy] attack lower than level, the Attacker also suffers the attack.\n* Wall that reflects attacks back to its source."),
          "Mirror Wall",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mirror Wall", ":summary", "* Wall that reflects [Energy] attacks lower than level back to their source. Any attack higher than level will destoy the Wall."),
          "Paradigm Shift",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paradigm Shift", ":summary", "* Change one rule of nature for a moment."),
          "Power Sink",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Power Sink"),
          "Power Surge",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Power Surge"),
          ":Redirect",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Redirect", ":summary", "* [Reaction]: Redirect an Energy or Physical Ranged attack that has a single target to another target."),
          ":Stasis",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stasis", ":summary", "* Place an equal number of White Stasis Tokens on yourself and your target."),
          "White Noise",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "White Noise", ":summary", "Sounds are garbled preventing eavesdropping"),
          "Wizard Armor",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Wizard Armor", ":summary", "* Defense against Energy that creates [Feedback]."),
          "Wizard Lock",
          vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Wizard Lock", ":summary", "* Wizard Lock alters an existing magical effect by freezing it in place. It becomes permanent until dispelled, but it no longer has an active effect. In this way a wall of fire would be a permanent wall that does not move or produce heat. This is often used to make a seal last indefinitely.")
        )
      ),
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
        "Electricity",
        ":summary",
        "* Electric Elementalist personalities are influenced by their link to Electricity.\n* Energetic, Explosive, Dynamic, Animated, Spark of Life, High Strung",
        ":titles",
        "Lightning",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Absorb Electricity", "Arc Lightning", "Ball Lightning", "Body Electric", "Call Lightning", "Control Lightning", "Electromagnetic Pulse", "Lightning Charge", "Lightning Lash", "Lightning Pillar", "Lightning Warp", "Resist: Electricity")
      ),
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
        "Healing",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Lernaean Regeneration", "Regeneration", "Regrowth")
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Movement",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Wall Crawling", "Wall Running", "Water Walking", "Water Running")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Natural Weaponry",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Bite", "Bull Rush", "Burrowing", "Claw", "Claw Rake", "Constrict", "Death Roll", "Feather Blades", "Feather Knives", "Horns", "Jaw Lock", "Jaws of Death", "Neck Bite", "Overwhelm", "Pounce", "Quill Attack", "Ripping Bite", "Savage Genitalia", "Spines", "Sting", "Swallow Whole", "Tail Sweep", "Tongue Lash", "Trample", "Tusk Gore")
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
        "Shielding",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Shield Modulation", "Shield Redirection")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_power},
        ":name",
        "Strength",
        ":reference",
        "* Technique is for lightweights. - Sett, Runeterra",
        ":stat",
        "Body",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Power Leap", "Power Lift", "Power Strike", "Power Throw", "Shockwave", "Thunderclap")
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
