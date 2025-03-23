'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_ability {

  /**
   * @function abilitymap_tactics
   * Returns the base abilitymap
   * @param  {tactics} tactics
   * @return {abilitymap}
   */
  static t_abilitymap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_abilitymap_tactics = {
    vx_type: nx_tactics_decks_ability.t_abilitymap_tactics
  }

  // (func abilitymap-tactics)
  static f_abilitymap_tactics(tactics) {
    let output = nx_tactics_base.e_abilitymap
    output = nx_tactics_base.f_abilitymap_from_abilitylist(
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ablative Armor", ":summary", "* Armor that vaporizes when hit decreasing damage but also damaging the armor.\n* Ignore the first point of [Damage] and reduce [Armor] (on that facing) instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ambush", ":summary", "* [Action]: Anyone who is within 10m, tests [Investigation] vs. [Stealth] with [Advantage] to detect them.\n* [Downtime]: Carefully choose an ambush spot and conceal multiple units. They remain concealed as long as they do not move or speak."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Auto Med System", ":summary", "* Detects severe damage to the wearer and automatically takes action to reduce shock and maintain suit integrity (sealing leaks or amputating if necessary)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Backstab", ":summary", "* [Passive]:\n** IF [Flanking] THEN [Initiative]:+1 AND [Hits]:+1\n** IF [Blindspot] THEN [Initiative]:+1/level AND [Hits]:+1/[Level]", ":titles", "Back Biter, Back Stabber, Opportunist, Traitor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Balanced for Throwing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blend into the Crowd", ":summary", "* Attitude, Mannerism, and Appearance can often allow a stranger to go unnoticed in a crowd.\n* [Continuous]: While active, unit is hidden as long as at least 10 other units are within skill spaces."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding Spit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding Toxin"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Body Flares", ":summary", "* Detects and distracts heat seaking missiles,\n* [Passive] - +1 Defense vs. Heat-Seaking Missiles (3 uses)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Bug Hunt", ":reference", "* H:Is this going to be a stand-up fight, sir? Is it going to be another bug hunt? G:A Xenomorph may be involved... H:It's a bug hunt. - Hudson and Gorman, Aliens"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Call of the Hunt"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Call to Arms", ":reference", "Unite. Take up arms.\nStand shoulder to shoulder with your brothers and sisters.\nAnd break free from the cold shackles of oppression.\n\nLiberty for all is more noble than the preservation of one's soul.\nDestiny and valor will meet at the end of the sword.\nAnd the tales of heroic sacrifice will be the legend of a new age.\n\nThere will be no respite.\nThere will be no surrender.\nOnly glory and honor.\nThe price will be high for the greatest prize of all.\nStand and be counted among those that dared.\nThose who dared to fight for their freedom. - Glass Fleet", ":summary", "Gather a war party from the populace"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Camouflage", ":summary", "* [Continuous]: While active, unit is hidden.\n* [Defense]: +1 Defense in [Terrain].\n* [Roll]: Skill - Move this turn.\n* [Versus]: and others must roll Spirit - Terrain penalty vs to detect."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Chain of Command", ":summary", "* [Action]: [Activate] up to [Command] units directly or indirectly adjacent to this unit. These units (including this one) may spend [Speed] or [Actions] in any order this [Turn].\n* [Interrupt]: May not be used as an Interrupt."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cloak and Dagger", ":summary", "* [Action]: Gains short term Stealth, move up to 2 spaces ignoring attacks of opportunity and attack with a [Knife] by [Surprise]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cold Resistant", ":summary", "* [Passive] - Armor:+1 vs. Cold"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Corrosion Resistant", ":summary", "* [Passive] - Armor:+1 vs. Corrosive Agents"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cryo Sleep System", ":summary", "* Can freeze the wearer into cryo-sleep and armor runs on minimal power to preserve the wearer from hostile environments or critical wounds for up to a month before power gives out."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cull the Herd"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deadfall"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Enlisted", ":summary", "Dialect of enlisted soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Laborer", ":summary", "Dialect of laborer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Officer", ":summary", "Dialect of officer soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Sailor", ":summary", "Dialect of sailors"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Servant", ":summary", "Dialect of servants"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Slave", ":summary", "Dialect of slaves"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dream Therapy", ":summary", "Heal Trauma by exploring the Dream World."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Electrical Resistant", ":summary", "* [Passive] - Armor:+1 vs. Electricity"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Resistant", ":summary", "* [Damage]: [+2 Armor] if attack is an [Energy Weapon]\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Environmental Containment", ":summary", "* Suit is sealed against chemical and biological weapons except corrosive ones. It is also water-proof."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Environmental Independence", ":summary", "* Suit is sealed against most hostile environments including space. Does not include corrosive environments.\n* Requires - [Enviromental Containment]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Existential Riddle", ":summary", "Demoralize unwitting rivals by questioning their purpose in life."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Field Dressing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fire Resistant", ":summary", "* [Damage]: [+2 Armor] if attack produces [Fire] tokens\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fishing", ":summary", "* Catch enough fish to eat. Similar to Foraging.", ":titles", "Fisherman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Floation Device", ":summary", "* An emergency floatation device."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Grappling Hoist", ":summary", "* A grappling dart that is fired into stone or hooked onto any uneven surface. The attached winch can then pull the wearer to the target or vis versa depending on relative weight. This can be used for climbing or towing. The darts can be recovered and reused, but they are often not recoverable. 2 replacement darts are included."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Harvest Poison"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hide", ":summary", "* Find a hiding place in an area where you will not normally be detected.\n* IF You have [Full Cover] AND you don't move AND your opponents are at least your [Body] spaces away.\n* THEN [Action] [Continuous]: You are hidden from view AND Opponents must succeed at [Investigate]/[Seek] to detect you."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hunter's Mark", ":summary", "* [Continuous]: Place a mark on target. Initiative:+1 vs. marked target."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Infrared Dampener", ":summary", "* By activating this system, the armor reduces all heat signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Infrared Sensors"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Irritating Toxin"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kiss of Death"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lure", ":reference", "Everquest Pulling"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Magnetic Resistant", ":summary", "* Reduces the chance that a magnetic attachment can hold on the armor (assuming it is metallic).\n* [Passive] - Armor:+1 vs. Magnetism"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mental Gymnastics"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Missile Mount", ":summary", "* A special mount to add a missile pack on the back of the armor."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Bite"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Spit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Spray"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Sting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pep Talk", ":reference", "* A small victory is still a victory. Good work. - Kai'sa, Runeterra"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pierce Resistant", ":summary", "* [Damage]: [+2 Armor] if attack is a [Projectile]\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Plasma Resistant", ":summary", "* Detects and disrupts the magnetic bottle surrounding plasma rounds causing them to detonate too early.\n* [Passive] - Armor:+1 vs. Plasma"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Bite", ":summary", "[Close Combat]: Crits are [Poisoned] instead of increasing damage."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Blood"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Spit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Spray"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Sting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Touch"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisoned Arrow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisoned Blade"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisoned Dust"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisonous Flesh", ":summary", "* Poisonous if bitten"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisonous Skin", ":summary", "* Poisonous to the touch"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poisoning"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Poison Tolerance", ":reference", "...it was your cup that was poisoned.  They were both poisoned.  I spent the last few years building up an immunity to iocane powder. - Princess Bride"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Acid"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Anti-Coagulant", ":summary", "* Create an Anti-Coagulant Poison. A target with Anti-Coagulant cannot easily stop [Bleeding]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Antidote", ":summary", "* Skilled in antidote creation.  Can create an antidote for any Poison user can brew."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Poison"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pressure Resistant", ":summary", "* [Passive] - Armor:+1 vs. Pressure and Impact"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radar Dampener", ":summary", "* By activating this system, the armor reduces all radar signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Radar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radar Jammer", ":summary", "* By activating this system, the armor emits powerful radar white noise.\n* [Continuous Action] - [-Range] Radar sensors detection to any target within range."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radiation Resistant", ":summary", "* [Passive] - Armor:+1 vs. Radiation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Rally", ":summary", "[Action]: Units within Range:Skill are placed into a [Formation] they all share."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Reactive Armor", ":summary", "* Exterior layer of armor explodes on impact reducing damage of the first hit but reduces armor rating for all subsequent hits.\n* [Passive] - +2 Armor vs. the first hit. -1 Armor for each subsequent hit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Restful Sleep", ":summary", "Ensure restful sleep for levelx2 hours."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Returning Throw"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Salvo"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Scouting", ":titles", "Reconnaissance"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Snare"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sneak", ":summary", "* Move silently: [Passive]: You may move at half speed (rounded down) without cancelling [Stealth] abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sneak Attack", ":titles", "Suprise Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulbind", ":titles", "Soulbond"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulburn"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Souldrain", ":titles", "Spiritsiphon"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulforge"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulrend", ":titles", "Soulrip", ":reference", "* We'll tear your soul apart! - Pinhead, Hellraiser"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulshatter"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulsteal", ":reference", "Primitive people may see a photograph as stealing the soul."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulstain"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulstone", ":titles", "Souljar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulstrike"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulvise"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Soulwrack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Space Clearing", ":summary", "[Requires]: 2 handed Weapon\n[Combat]: Attack in a circle around you. Anyone hit get [Push]:1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stalk", ":summary", "* The ability to move carefully to avoid detection.\n* [Requires]: No other action may be performed this turn.\n* [Action]: Move at half speed. Any attempt to act toward you, first requires an Mind vs. your skill or fail."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Strike and Fade", ":summary", "* [Requires]: No other action may be performed this turn.\n* [Attack]: After this attack, if you have sufficient Move remaining, move 1 space."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tag and Bag"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tailing", ":summary", "* Subtly pursue someone. Ideally, you must stay as far away as possible without losing track of your quarry. Completely unaware people are easy to pursue. Paranoid targets will attempt to spot tailing and may attempt to evade tails even when they do not know they are being tailed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "There is No Escape", ":reference", "* Raiden Shogun, Genshin Impact"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Track"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ultraviolet Jammer", ":summary", "* By activating this system, the armor emits a powerful blinding strobe in the ultraviolet band.\n* [Continuous Action] - [-Range] Ultraviolet sensors detection to any target within range."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Turret Mount", ":summary", "* A special mount to add a turreted weapon on the back of the armor."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Undermine", ":summary", "Damage walls."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Underwater Operation", ":summary", "* Sealed against water and can operate underwater. Small thrusters allow slow movement underwater. Oxygen scrubbers allow extended underwater operation."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vanish", ":reference", "* Smoke Bomb! - Krieger, Archer", ":summary", "* If you can momentarily break line of sight, you can immediately [Hide]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Without a Trace", ":summary", "* Extremely difficult tor track you.")
    )
    return output
  }

  /**
   * @function tactics_abilitymap_from_tactics
   * Returns a tactics updated with abilitymap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_abilitymap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_abilitymap_from_tactics = {
    vx_type: nx_tactics_decks_ability.t_tactics_abilitymap_from_tactics
  }

  // (func tactics-abilitymap<-tactics)
  static f_tactics_abilitymap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const abilitymap = nx_tactics_decks_ability.f_abilitymap_tactics(tactics)
        return vx_core.f_copy(tactics, ":abilitymap", abilitymap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "abilitymap-tactics": nx_tactics_decks_ability.e_abilitymap_tactics,
      "tactics-abilitymap<-tactics": nx_tactics_decks_ability.e_tactics_abilitymap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "abilitymap-tactics": nx_tactics_decks_ability.t_abilitymap_tactics,
      "tactics-abilitymap<-tactics": nx_tactics_decks_ability.t_tactics_abilitymap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/ability",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func abilitymap-tactics)
    nx_tactics_decks_ability.t_abilitymap_tactics['vx_value'] = {
      name          : "abilitymap-tactics",
      pkgname       : "nx/tactics/decks/ability",
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
      fn            : nx_tactics_decks_ability.f_abilitymap_tactics
    }

    // (func tactics-abilitymap<-tactics)
    nx_tactics_decks_ability.t_tactics_abilitymap_from_tactics['vx_value'] = {
      name          : "tactics-abilitymap<-tactics",
      pkgname       : "nx/tactics/decks/ability",
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
      fn            : nx_tactics_decks_ability.f_tactics_abilitymap_from_tactics
    }

  }
}
