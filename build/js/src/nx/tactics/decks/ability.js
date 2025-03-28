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
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "2-Legged"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "3-Legged"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "4-Legged"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "6-Legged"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "8-Legged"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Abdomen Timing of Two", ":reference", "Refers to feinting an attack, then striking an enemy as they are retracting from an attack, hitting them in the abdomen with the correct timing of either two moves or two seconds. Although the technique seems relatively simple, Musashi lists this as one of the hardest techniques to time correctly."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ablative Armor", ":summary", "* Armor that vaporizes when hit decreasing damage but also damaging the armor.\n* Ignore the first point of [Damage] and reduce [Armor] (on that facing) instead."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Administration", ":titles", "Administrator, Secretary"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Agriculture", ":summary", "* Grow Crop", ":titles", "Farmer, Gardener"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ambush", ":summary", "* [Action]: Anyone who is within 10m, tests [Investigation] vs. [Stealth] with [Advantage] to detect them.\n* [Downtime]: Carefully choose an ambush spot and conceal multiple units. They remain concealed as long as they do not move or speak."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Analyze Weakness"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Anvil Strike", ":summary", "* [+1 Damage] when target is adjacent to solid terrain."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Architecture", ":summary", "* [Extended Action]: Design a structure. The size and quality of the structure are limited by level.\n* [Action]: Determine weaknesses of a structure.", ":titles", "Architect"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Arcing Fire", ":summary", "* [Requires]: Bow or Javelin\n* May fire over other units that block Line of Sight."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Auto Med System", ":summary", "* Detects severe damage to the wearer and automatically takes action to reduce shock and maintain suit integrity (sealing leaks or amputating if necessary)."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Backlash"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Backstab", ":summary", "* [Passive]:\n** IF [Flanking] THEN [Initiative]:+1 AND [Hits]:+1\n** IF [Blindspot] THEN [Initiative]:+1/level AND [Hits]:+1/[Level]", ":titles", "Back Biter, Back Stabber, Opportunist, Traitor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Balanced for Throwing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Barbed Javelin", ":summary", "* [Requires]: Javelin\n* Criticals vs Large units are [Rage] Tokens."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blacksmithing", ":titles", "Blacksmith"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blade Barrier", ":summary", "* Creates a 3 space wide [Wall] directly in front of the unit by rapidly swinging the blade in a flashy display. Anything crossing this wall is subject to an [Opportunity Attack].", ":titles", "Wall of Swords"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blend into the Crowd", ":summary", "* Attitude, Mannerism, and Appearance can often allow a stranger to go unnoticed in a crowd.\n* [Continuous]: While active, unit is hidden as long as at least 10 other units are within skill spaces."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blind Fighting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding Spit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding Toxin"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Body Flares", ":summary", "* Detects and distracts heat seaking missiles,\n* [Passive] - +1 Defense vs. Heat-Seaking Missiles (3 uses)"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Body Morph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Bowel Raker", ":summary", "* +1 [Bleeding]\n* -1 [Piercing]", ":titles", "Serrated Arrow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Brain Drain"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Brain Freeze"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Brain Storm"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Brewing", ":summary", "* Brew Beer\n* Brew Hard Liquor\n* Brew Mead\n* Brew Wine", ":titles", "Brewer, Vintner"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Bug Hunt", ":reference", "* H:Is this going to be a stand-up fight, sir? Is it going to be another bug hunt? G:A Xenomorph may be involved... H:It's a bug hunt. - Hudson and Gorman, Aliens"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Calculator Mind"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Call of the Hunt"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Call to Arms", ":reference", "Unite. Take up arms.\nStand shoulder to shoulder with your brothers and sisters.\nAnd break free from the cold shackles of oppression.\n\nLiberty for all is more noble than the preservation of one's soul.\nDestiny and valor will meet at the end of the sword.\nAnd the tales of heroic sacrifice will be the legend of a new age.\n\nThere will be no respite.\nThere will be no surrender.\nOnly glory and honor.\nThe price will be high for the greatest prize of all.\nStand and be counted among those that dared.\nThose who dared to fight for their freedom. - Glass Fleet", ":summary", "Gather a war party from the populace"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Camouflage", ":summary", "* [Continuous]: While active, unit is hidden.\n* [Defense]: +1 Defense in [Terrain].\n* [Roll]: Skill - Move this turn.\n* [Versus]: and others must roll Spirit - Terrain penalty vs to detect."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Carpentry", ":titles", "Carpenter"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Chain of Command", ":summary", "* [Action]: [Activate] up to [Command] units directly or indirectly adjacent to this unit. These units (including this one) may spend [Speed] or [Actions] in any order this [Turn].\n* [Interrupt]: May not be used as an Interrupt."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cleaning", ":titles", "Maid"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cloak and Dagger", ":summary", "* [Action]: Gains short term Stealth, move up to 2 spaces ignoring attacks of opportunity and attack with a [Knife] by [Surprise]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cobbling", ":summary", "* Make Shoes", ":titles", "Cobbler"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cold Resistant", ":summary", "* [Passive] - Armor:+1 vs. Cold"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Combat Sense"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Commanding Presense"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Continuous Cut", ":reference", "The Flowing Water Cut is used when you are struggling blade to blade with the enemy. When he breaks and quickly withdraws trying to spring with his sword, expand your body and spirit and cut him as slowly as possible with your long sword, following your body like stagnant water. - Miyamoto Mushashi, The Book of Five Rings", ":summary", "* [Reaction]: [+1 Defense].  If you are not hit, you may immediately attack as a free action at [-1 Attack].", ":titles", "Flowing Water Cut"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cooking", ":summary", "* Prepare Recipe", ":titles", "Chef, Cook"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cooping", ":summary", "* Make Sealable Barrel", ":titles", "Cooper"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Corrosion Resistant", ":summary", "* [Passive] - Armor:+1 vs. Corrosive Agents"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cryo Sleep System", ":summary", "* Can freeze the wearer into cryo-sleep and armor runs on minimal power to preserve the wearer from hostile environments or critical wounds for up to a month before power gives out."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cull the Herd"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dash Attack", ":summary", "* [Requires]: May only move in a straight line this turn.\n* [Action]: [-1 Attack], May attack any number of adjacent opponents along path each at a cumulative -1."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dazing Blow", ":summary", "-2 Damage\nDamage - [Stun]\nCriticals - [Stun]", ":titles", "Pommel Strike"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dead Drop", ":summary", "* Leave goods to be picked up later. If successful they will not be touched."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deadfall"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deadly Shot", ":summary", "* [Requires]: Bow or Crossbow\n* Increase weapon range by 50% and choose [Hit Location]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Deafening"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Destruction", ":summary", "* Effects only unliving objects\n* A target that takes Destruction Tokens equal to Body are completely destroyed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Enlisted", ":summary", "Dialect of enlisted soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Laborer", ":summary", "Dialect of laborer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Officer", ":summary", "Dialect of officer soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Sailor", ":summary", "Dialect of sailors"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Servant", ":summary", "Dialect of servants"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Slave", ":summary", "Dialect of slaves"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Disintegrate", ":summary", "* Causes wounds that are difficult to heal\n* A victim that takes Disintegrate Tokens equal to Body are completely destroyed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Double Shot", ":summary", "* -2 [Attack]\n* -1 [Piercing]\n* May attack two targets in same [Arc].", ":titles", "Double Throw"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dream Therapy", ":summary", "Heal Trauma by exploring the Dream World."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dual Wield", ":reference", "* Not used on the battlefield where a shield would be more practical.\n    * Used primarily for parrying during one on one duels.\n    * Two longsword duelling was done by very skilled fighters in Italian duelling.\n    * Dual katana Japanese styles also exist.", ":summary", "* Using a Dagger, Hand Axe or Hammer in the off hand."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ego Whip", ":summary", "* [Skill]: [Mental Combat] vs. [Spirit].", ":titles", "Mind Whip"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Electrical Resistant", ":summary", "* [Passive] - Armor:+1 vs. Electricity"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Resistant", ":summary", "* [Damage]: [+2 Armor] if attack is an [Energy Weapon]\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Engineering Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Environmental Containment", ":summary", "* Suit is sealed against chemical and biological weapons except corrosive ones. It is also water-proof."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Environmental Independence", ":summary", "* Suit is sealed against most hostile environments including space. Does not include corrosive environments.\n* Requires - [Enviromental Containment]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Existential Riddle", ":summary", "Demoralize unwitting rivals by questioning their purpose in life."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Explosive Shot", ":summary", "* [Requires]: Bow or Crossbow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Face Molding", ":summary", "[Downtime]: Soften a face and mold it like clay. Scuplting skill determines effectiveness."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Face Off", ":summary", "[Downtime]: Surgically swap appearances with another unit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Feeblemind"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Feedback Loop"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Feint", ":summary", "* Feints are maneuvers designed to distract or mislead, done by giving the impression that a certain maneuver will take place, while in fact another, or even none, will.", ":titles", "Kizeme"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fend Off", ":summary", "* [Requires]: Weapon with [Reach]\n* [Reaction]: If you hit with [Fend Off], the opponent may not move any closer to you this turn."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Field Dressing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Financial Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fire and Stones Cut", ":reference", "The Fires and Stones Cut means that when the enemy's sword and your sword clash together you cut as strongly as possible without raising the sword even a little. This means cutting quickly with the hands, body and legs - all three cutting strongly. If you train well enough you will be able to strike strongly. - Miyamoto Mushashi, The Book of Five Rings", ":summary", "* [Reaction]: [+1 Defense]\n* [Action]: [+1 Attack], if you used this ability to [React] last turn."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fire Resistant", ":summary", "* [Damage]: [+2 Armor] if attack produces [Fire] tokens\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fishing", ":summary", "* Catch enough fish to eat. Similar to Foraging.", ":titles", "Fisherman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Flaming Shot", ":summary", "* [Requires]: Bow or Crossbow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fleche", ":summary", "* A [Lunge] forward where the attacker continues to move forward past the defender to avoid a [Riposte] or Counter Attack.\n-1 Initiative\n+1 Move - May only move straight forward.\n+1 Damage"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fletching", ":summary", "* The art of making arrows. High quality or specialized arrows are quickly used up and often impractical to buy. Creating your own is often a very practical solution.", ":titles", "Bowyer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Floation Device", ":summary", "* An emergency floatation device."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Follow Through", ":summary", "* [Action]: If you hit with this ability, you may immediately turn to the left or right and attack a target in the next adjacent space. This may be repeated any number of times at [-1 Attack] per target after the first though each additional target must be in the same direction."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Glassblowing", ":summary", "* Blow Bottle\n* Blow Glass Decoration"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Grappling Hoist", ":summary", "* A grappling dart that is fired into stone or hooked onto any uneven surface. The attached winch can then pull the wearer to the target or vis versa depending on relative weight. This can be used for climbing or towing. The darts can be recovered and reused, but they are often not recoverable. 2 replacement darts are included."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hamstring", ":summary", "* Attack the legs to slow the opponent.\n* [Action]\n-1 Accuracy\nCriticals - [Cripple]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Harvest Poison"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hide", ":summary", "* Find a hiding place in an area where you will not normally be detected.\n* IF You have [Full Cover] AND you don't move AND your opponents are at least your [Body] spaces away.\n* THEN [Action] [Continuous]: You are hidden from view AND Opponents must succeed at [Investigate]/[Seek] to detect you."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "House Painting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hover", ":summary", "* Hovering allows full movement speed over any flat terrain without actually touching the surface. Ground, Water, Sand, Ice, generally cause no penalty, but turning is difficult and imprecise especially at high speeds.\n* Hovering units may [Move] backwards.\n* Hovering units may use [Vector Movement] rule."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hunter's Mark", ":summary", "* [Continuous]: Place a mark on target. Initiative:+1 vs. marked target."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Impale", ":summary", "* [Requires]: Spear\n* [Action]\n-1 Accuracy\nCriticals - [Piercing]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Infrared Dampener", ":summary", "* By activating this system, the armor reduces all heat signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Infrared Sensors"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Investigative Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Irritating Toxin"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Jewelsmithing", ":summary", "* Gemcutting\n* Fashion Jewelry", ":titles", "Gemcutter, Jeweler"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Jump Jets"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kiss of Death"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Knife Throwing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Laboring", ":titles", "Laborer, Worker"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Landscaping", ":summary", "* Grow Bonsai\n* Grow Flowers\n* Grow Hedges\n* Grow Hedge Maze\n* Grow Trees", ":titles", "Groundskeeper, Landscaper, Lawnboy"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Leatherworking", ":summary", "* Fashion Leather Goods\n* Flay Skins", ":titles", "Tanner"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Linguistic Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lobotomize", ":reference", "You'll even have fantasies about alien civilizations, as you requested, but in the end, back on earth you'll be lobotomized! - Dr. Edgemar, Total Recall"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Logging"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lunge"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Lure", ":reference", "Everquest Pulling"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Magnetic Resistant", ":summary", "* Reduces the chance that a magnetic attachment can hold on the armor (assuming it is metallic).\n* [Passive] - Armor:+1 vs. Magnetism"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Malleate", ":summary", "* Make target soft and malleable like clay."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mathematical Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mental Blast", ":summary", "Attacks Mind.  All tokens are stun."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mental Gymnastics"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mental Prison", ":summary", "* Trap a person's personality in a prison within their own mind.", ":titles", "Mind Prison, Prison of the Mind"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Metalworking", ":titles", "Coppersmith, Goldsmith, Machinist, Pewtersmith, Silversmith"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Missile Mount", ":summary", "* A special mount to add a missile pack on the back of the armor."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Molecular Alteration"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Multitasking"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Off Roading"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Offhanded Fighting", ":summary", "* [Action]: Normal Attack take a -2 penalty if performed with the non primary hand. This ability negates that penalty when using this skill in the off hand.", ":reference", "I: I admit it. You are better than I am.\nM: Then why are you smiling?\nI: Because I know something you don't know.\nM: And what is that?\nI: I am not left-handed!\n...\nM: You're amazing!\nI: I ought to be, after twenty years.\nM: There's something I ought to tell you.\nI: Tell me.\nM: I'm not left-handed either. - Inigo Montoya abd /Man in Black, Princess Bride"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Bite"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Spit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Spray"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Paralyzing Sting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Parry", ":summary", "* The fighter uses his weapon to block an opponent's attack.\n* [Reaction]\n+1 Initiative\n+2 Defense"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pep Talk", ":reference", "* A small victory is still a victory. Good work. - Kai'sa, Runeterra"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Petrification", ":summary", "* [Focus]: vs. Spirit and place [Petrification] counters on the target body location.\n* Any body location with a [Petrification] is encased in stone. It requires an [Action] to remove a [Petrification]. Any area that suffers 3 [Petrification] turns completely to stone. If any other area is so petrified, then complete petrification immediately spreads across the entire body and then the body and all its gear immediately converts to a stone statue.\n* Additional Effects: A petrified arm cannot move. A petrified leg reduces Move by half. A petrified head is unable to see or hear. Other petrifed areas have no additional effect. Petrified Arms or legs can break off like a clean amputation without blood loss. \n* This ability can also be used to restore a petrified target back to its original form if the skill is at least equal to the original. Lost limbs may also be restored by reattaching the limb before restoration.\n* This ability can also be used on any sort of earth to harden the earth to equivalent stone."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Photographic Memory"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pierce Resistant", ":summary", "* [Damage]: [+2 Armor] if attack is a [Projectile]\n* Only 1 Hardened vs. ability may be taken"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Piercing Shot", ":summary", "* [Requires]: Bow or Crossbow\n* [Attack]: [+1 Armor Piercing]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Piercing Strike", ":summary", "* [Action]: Trades damage to increase armor penetration."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Plasma Resistant", ":summary", "* Detects and disrupts the magnetic bottle surrounding plasma rounds causing them to detonate too early.\n* [Passive] - Armor:+1 vs. Plasma"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Plumbing", ":titles", "Plumber"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Polymorph", ":summary", "* [Action]: Roll vs. Spirit and place Black [Shapeshift] Tokens on target.\n* A unit with 0 Spirit due to polymorph changes into any creature desired of equal Body.  When the last Shapeshift Token is removed, a polymorphed unit returns to normal."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Porting", ":summary", "* Bear Litter\n* Port Boat", ":titles", "Bearer, Porter"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pottery", ":titles", "Potter"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Acid"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Anti-Coagulant", ":summary", "* Create an Anti-Coagulant Poison. A target with Anti-Coagulant cannot easily stop [Bleeding]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Antidote", ":summary", "* Skilled in antidote creation.  Can create an antidote for any Poison user can brew."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Prepare Poison"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Pressure Resistant", ":summary", "* [Passive] - Armor:+1 vs. Pressure and Impact"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Psychic Duel", ":reference", "Professor X vs. Shadow King"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Psychic Knife", ":reference", "Psylocke, X-men"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radar Dampener", ":summary", "* By activating this system, the armor reduces all radar signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Radar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radar Jammer", ":summary", "* By activating this system, the armor emits powerful radar white noise.\n* [Continuous Action] - [-Range] Radar sensors detection to any target within range."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Radiation Resistant", ":summary", "* [Passive] - Armor:+1 vs. Radiation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Rally", ":summary", "[Action]: Units within Range:Skill are placed into a [Formation] they all share."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Rapid Strike", ":reference", "In One Timing means, when you have closed with the enemy, to hit him as quickly and directly as possible, without moving your body or settling your spirit, while you see that he is still undecided. The timing of hitting before the enemy decides to withdraw, break or hit, to be able to hit in the timing of an instant. - Miyamoto Mushashi, The Book of Five Rings", ":summary", "* [Requires]: Wear loose clothing or less. (Armor Penalty = 0).\n* [Action]: Speed +1, Attack -1", ":titles", "In One Timing, Lightning Blow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Reactive Armor", ":summary", "* Exterior layer of armor explodes on impact reducing damage of the first hit but reduces armor rating for all subsequent hits.\n* [Passive] - +2 Armor vs. the first hit. -1 Armor for each subsequent hit."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Restful Sleep", ":summary", "Ensure restful sleep for levelx2 hours."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Returning Throw"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Richochet", ":summary", "* [Requires]: Thrown Object"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Riposte", ":reference", "When your swords clash together, in one motion when your sword springs away from theirs, use a continuous motion to slash their head, body and legs.", ":summary", "* Speedy attack that can only be performed after a [Parry] or a [Block].\n* [Requires]: Previous Action was [Parry] or [Block]\n+2 Initiative\n+2 Attack", ":titles", "Counter Strike"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Salvo"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Scientific Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Scouting", ":titles", "Reconnaissance"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sensory Deprivation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sensory Overload"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Servant", ":titles", "Butler, Footman, Lady in Waiting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Set Against Charge"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sewing", ":summary", "* Crochet\n    * Embroidery\n    * Fashion Clothing\n    * Needlepoint\n    * Repair Cloth", ":titles", "Dressmaker, Seamstress"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Shield Snare", ":summary", "* [Requires]: Javelin, Target with shield\n* [Attack]: Criticals are [Encumberance] Tokens."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Signal Shot", ":summary", "* Alert allied units by sending a prearranged signal. This can be flaming arrow at night, smoking arrow, singing arrow, etc.\n* [Requires]: Bow or Crossbow\n* [Action]: For the rest of the turn, other units adjacent to this unit may be treated as if under the [Sphere of Command] of any allied Commander."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Snare"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sneak", ":summary", "* Move silently: [Passive]: You may move at half speed (rounded down) without cancelling [Stealth] abilities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sneak Attack", ":titles", "Suprise Attack"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Snowcraft", ":summary", "* Ignore Snow Move penalty\n* Off Snow Slow:+1."),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Speed Reading"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stagecraft", ":summary", "* The technical aspects of theatrical production, which include scenic design, stage machinery, lighting, sound, costume design, and makeup.", ":titles", "Stagehand"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stalk", ":summary", "* The ability to move carefully to avoid detection.\n* [Requires]: No other action may be performed this turn.\n* [Action]: Move at half speed. Any attempt to act toward you, first requires an Mind vs. your skill or fail."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Strategic Warp Jump", ":summary", "* A ship with a Warp Engine may perform a strategic warp jump and instantly remove itself from combat, returning to the strategic map.\n* A unit already on the strategic map may move [Skill] spaces on the strategic map.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 3 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Strike and Fade", ":summary", "* [Requires]: No other action may be performed this turn.\n* [Attack]: After this attack, if you have sufficient Move remaining, move 1 space."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stunning Blow", ":summary", "* [Attack]: Trades lethal damage for stunning damage."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Stunning Throw", ":summary", "* [Requires]: Thrown Object\n* Trades lethal damage for stunning damage."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Summon Id Monster", ":summary", "[Call] [Id Monster]", ":reference", "Monsters, John, monsters from the Id! - Ostrow, Forbidden Planet"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sweep", ":summary", "* Attack the legs to trip the opponent.\n+1 Initative\n-1 Move\n-1 Damage\nCriticals - [Knockdown]", ":titles", "Trip"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tabula Rasa"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tactical Genius"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tactical Warp Jump", ":summary", "* A ship with a Warp Engine may perform a tactical warp jump and instantly transport from any space on the map to any other.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 2 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tag and Bag"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tailing", ":summary", "* Subtly pursue someone. Ideally, you must stay as far away as possible without losing track of your quarry. Completely unaware people are easy to pursue. Paranoid targets will attempt to spot tailing and may attempt to evade tails even when they do not know they are being tailed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "There are Many Enemies", ":reference", "When you are fighting one against many, draw both sword and companion sword and assume a wide-stretched left and right attitude. The spirit is to chase the enemies around from side to side, even though they come from all four directions. Observe their attacking order, and go to meet first those who attack first. Sweep your eyes around broadly, carefully examining the attacking order, and cut left and right alternately with your swords. Waiting is bad. Always quickly re-assume your attitudes to both sides, cut the enemies down as they advance, crushing them in the direction from which they attack. Whatever you do, you must drive the enemy together, as if tying a line of fishes, and when they are seen to be piled up, cut them down strongly without giving them room to move. - Miyamoto Mushashi, The Book of Five Rings", ":summary", "* [Requires]: [Duel Wield]\n* [Defense]: If [Surrounded], ignore opponents in front arc when determining [Surrounded] defense penalty."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "There is No Escape", ":reference", "* Raiden Shogun, Genshin Impact"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Thrust", ":summary", "+1 Initiative\n+1 Move\nCritcals - [Piercing]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "To Apply Stickiness", ":reference", "When the enemy attacks and you also attack with the long sword, you should go in with a sticky feeling and fix your long sword against the enemy's as you receive his cut. The spirit of stickiness is not hitting very strongly, but hitting so that the long swords do not separate easily. It is best to approach as calmly as possible when hitting the enemy's long sword with stickiness. The difference between 'Stickiness' and 'Entanglement' is that stickiness is firm and entanglement is weak. - Miyamoto Mushashi, The Book of Five Rings"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tower of Iron Will"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Track"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Tracked"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Turbo Booster", ":titles", "Boost, Nitro, Turbo, Turbo Charger"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ultraviolet Jammer", ":summary", "* By activating this system, the armor emits a powerful blinding strobe in the ultraviolet band.\n* [Continuous Action] - [-Range] Ultraviolet sensors detection to any target within range."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Turret Mount", ":summary", "* A special mount to add a turreted weapon on the back of the armor."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Undermine", ":summary", "Damage walls."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Underwater Operation", ":summary", "* Sealed against water and can operate underwater. Small thrusters allow slow movement underwater. Oxygen scrubbers allow extended underwater operation."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Vanish", ":reference", "* Smoke Bomb! - Krieger, Archer", ":summary", "* If you can momentarily break line of sight, you can immediately [Hide]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Weapon Block", ":summary", "* Deflect, catch, or even turn strike back with a weapon used against the fighter.\n* This ability provides a second Defense roll against a weapon attack before the regular Defense roll.\n* [Reaction]\n+2 Initiative\n+1 Accuracy\n0 Damage - Any successes become -Damage to the weapon. If the weapon has 0 Damage remaining, it is caught.\nCriticals - Any Criticals become -2 Damage to the weapon. If the weapon has 0 Damage remaining and there are still Criticals, the weapon may be immediately used at +[Criticals] Accuracy. Note: The weapon remains in the hands of the attacker."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Weaponsmith", ":summary", "* The ability to repair, improve, or even create weapons.\n* [Razor's Edge] - Work a weapon to give a +1 Synergy the first time it hits.", ":titles", "Bladesmith, Swordsmith"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Wheeled"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Whirlwind Attack", ":summary", "* Allows multiple attacks to different targets by trading accuracy for extra attacks."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Without a Trace", ":summary", "* Extremely difficult tor track you."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Woodworking", ":summary", "The process of building, making or carving something using wood.", ":titles", "Carver, Whittler, Woodworker")
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
