'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_specialty {

  /**
   * @function specialtymap_tactics
   * Returns the base specialtymap
   * @param  {tactics} tactics
   * @return {skillmap}
   */
  static t_specialtymap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_specialtymap_tactics = {
    vx_type: nx_tactics_decks_specialty.t_specialtymap_tactics
  }

  // (func specialtymap-tactics)
  static f_specialtymap_tactics(tactics) {
    let output = nx_tactics_base.e_skillmap
    output = nx_tactics_base.f_specialtymap_from_specialtylist(
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Archery", ":summary", "* Bowel Raker, Double Shot, Flaming Arrow", ":titles", "Archer, Archer Elite, Bowman, Crossbowman, Longbowman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Axes", ":reference", "* Run to the bedroom,\nIn the suitcase on the left\nYou'll find my favorite axe.\nDon't look so frightened\nThis is just a passing phase,\nOne of my bad days. - Pink Floyd, One of My Turns", ":titles", "Axeman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Bladedancer", ":summary", "* A combat technique focusing on elegant moves that efficiently combine attack and defense. Heavy armor may not be used with this technique."),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Bounty Hunter", ":reference", "* Certainly there is no hunting like the hunting of man and those who have hunted armed men long enough and liked it, never really care for anything else thereafter. - On the Blue Water, Ernest Hemmingway", ":summary", "* Bounty Hunting represents experience in stalking and capturing a target in an urban setting. This is traditionally done for money and can be quite profitable.\n* Bounties are placed on people for whom the law lacks the resources or inclination to pursue.\n* Bounties are placed by insurance companies, bail bondsmen, armies, the F.B.I., and individuals.\n* The reward can be paid for information, the capture of the target in a reasonably uninjured state, or even dead or alive.\n* The reward obviously needs to be commensurate with the difficulty or no one will take it. Capturing is harder than killing, so captures gain a bonus."),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Alien Hunter", ":references", "* Men in Black"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Bucklers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Cannons"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Caving", ":summary", "* Dead Reckoning\n* Detect Hollow Rock\n* Mining\n* Motion Sense\n* Sapping\n* Underground Survival", ":titles", "Miner, Prospector, Sapper, Spelunker, Underminer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Demon Hunter", ":reference", "* Ash Williams, Evil Dead\n* Claymore\n* Demon Hunter, Diablo\n* Demon Slayer: Kimetsu no Yaiba\n* Sango, Inuyasha"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Devil Hunter", ":reference", "* Chainsawman\n* Devil Hunter Youko\n* Devil May Cry"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Energy Weapons", ":reference", "Whoa, whoa, whoa! Nice shootin', Tex! - Ghostbusters"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Fensing", ":summary", "* A combat technique focusing on long quick blades like rapiers and epees.", ":titles", "Fenser"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Flamethrowers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Flexible Weaponry", ":summary", "* Backlash, Disarm, Trip", ":titles", "Hangman, Strangler"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Ghost Hunter", ":references", "* Ghostbusters"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Hammers", ":summary", "* War hammers were developed as a consequence of the ever more prevalent metal armors of the medieval battlefields during the 14th and 15th centuries. Swords were of little use against these armors. The war hammer could deal blows of tremendous force to the target, especially when mounted on a pole, and by impact alone do damage without penetrating the armor. The spike end could be used for grappling the target's armour, reins, or shield, or could be turned in the direction of the blow to pierce even heavy armor. Against mounted opponents, the weapon could also be directed at the legs of the horse, toppling the armored foe to the ground where he could be more easily attacked.\n    * See Arms and Armor for weapons"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Handguns"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Heavy Armor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Light Armor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Machineguns"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Mage Hunter", ":reference", "* Templars, Dragon Age"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Medium Armor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Monster Hunter", ":reference", "* Grey Wardens, Dragon Age\n* Witcher"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Polearms", ":summary", "Fend Off", ":titles", "Glaivemaster, Halberdier, Poleman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Rifles"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Shields"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Short Blades", ":summary", "* Includes Short Swords, Daggers, Stilettos, Machetes, Large Kitchen Knives, etc."),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Shotguns"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Spears", ":summary", "Fend Off, Impale, Set Against Charge, Shield Snare", ":titles", "Lancer, Javelineer, Myrmidon, Peltast, Pikeman, Spartan, Spearman, Velite"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Staves", ":summary", "* This specialty includes long staves and short sticks. Staves have longer reach than most weapons while fighting sticks attack with great speed.\n* [Dazing Blow], [Disarm], [Fend Off], [Fleche], [Parry], [Riposte], [Sweep]", ":titles", "Arnis, Bojutus, Escrima, Kali, Stick Fighting"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Swords", ":reference", "The Book of Five Rings - Miyamoto Mushashi\n\nThe Gaze\n* The gaze should be large and broad. This is the twofold gaze 'Perception and Sight'. Perception is strong and sight weak.\n* In strategy it is important to see distant things as if they were close and to take a distanced view of close things. It is important in strategy to know the enemy's sword and not to be distracted by insignificant movements of his sword. The gaze is the same for single combat and for large-scale combat.\n* It is necessary in strategy to be able to look to both sides without moving the eyeballs. You cannot master this ability quickly. Learn what is written here: use this gaze in everyday life and do not vary it whatever happens.\n\nThe Five Attitudes\n* The five attitudes are: Upper, Middle, Lower, Right Side, and Left Side.  These are the five.\n* Although attitude has these five dimensions, the one purpose of all of them is to cut the enemy.\n* There are none but these five attitudes.\n* Whatever attitude you are in, do not be conscious of making the attitude; think only of cutting.\n\n* Middle Attitude - Confront the enemy with the point of your sword against his face.  When he attacks, dash his sword to the right and 'ride' it.  Or, when the enemy attacks, deflect the point of his sword by hitting downwards, keep your long sword where it is, and as the enemy renews the attack cut his arms from below.\n\n* When you master my Way of the long sword, you will be able to control any attack the enemy makes.  I assure you, there are no attitudes other than the five attitudes of the long sword of NiTo.\n\n* Upper Attitude - From the Upper attitude cut the enemy just as he attacks.  If the enemy evades the cut, keep your sword where it is and, scooping from below, cut him as he renews the attack.\n\n* You will always win with the five long sword methods. You must train repeatedly.\n\n* Lower Attitude - Adopt the Lower attitude, anticipating scooping up. When the enemy attackes, hit his hands from below.  As you do so, he may try to hit your sword down. If this is the case, cut his upper arm(s) horizontally with a feeling of 'crossing'. This means that from the Lower attitudes you hit the enemy at the instant that he attacks. You will encounter this method often, both as a beginner and in later strategy.\n* Left Side Attitude - Adopt the Left Side attitude. As the enemy attacks, hit his hands from below. If as you hit his hands he attempts to dash down your sword, with the feeling of hitting his hands, parry the path of his long sword and cut across from above your shoulder. Through this method you win by parrying the line of the enemy's attack.\n* Right Side Attitude - In the fifth approach, the sword is in the Right Side attitude. In accordance with the enemy's attack, cross your sword from below at the side to the Upper attitude. Then cut straight from above.\n* Cut and Slash - To cut and slash are two different things.  Cutting, whatever form of cutting it is, is decisive, with a resolute spirit. Slashing is nothing more than touching the enemy. Even if you slash strongly, and even if the enemy dies instantly, it is slashing. When you cut, your spirit is resolved. You must appreciate this. If you first slash the enemy's hands or legs, you must then cut strongly. Slashing is in spirit the same as touching. When you realise this, they become indistinguishable. Learn this well.", ":summary", "* Melee - [Abdomen Timing of Two], [Continuous Cut], [Dash Attack], [Dazing Blow], [Fleche], [Fire and Stones Cut], [Parry], [Riposte], [Slash], [There Are Many Enemies], [Thrust], [To Apply Stickiness]", ":titles", "Bushi, Fencer, Fencing, Kendo, Kenjutsu, Kensei, Ronin, Sword Saint, Samurai, Swordsman"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Sword Saint", ":summary", "* A combat technique focusing almost exclusively on mastery of the sword.", ":titles", "Kensai, Kensei"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Thrown Weapons", ":reference", "You? You're very good. But me? I'm magic. - Bullseye, Daredevil Comics", ":summary", "* Barbed Javelin, Double Shot, Knife Throwing, Precision Throw, Shield Snare", ":titles", "Knife Thrower, Javelineer, Slinger"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Trapper"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Treasure Hunter", ":reference", "* Indiana Jones\n* Lara Croft", ":summary", "* Treasure Hunting represents experience in the dangerous and profitable world of lost tombs and ancient relics. Rare relics hold high presitge and are usually sold (in the form of a finders fee) to museaums, governments or private collectors. Raiding tombs is a fairly lawless and perilous activity to start with, and such high value items tend to attract disreputable characters of all kinds. As a result, treasure hunters often end their careers in unfortunate accidents.\n* +1 while researching or navigating inside a crypt or tomb.", ":titles", "Tomb Raider, Treasure Seeker"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Vampire Hunter", ":reference", "* Blade\n* BloodRayne\n* Buffy the Vampire Slayer\n* Castlevania\n* Fright Night\n* Lost Boys\n* Vampire Hunter D"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Werewolf Hunter"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Witch Hunter")
    )
    return output
  }

  /**
   * @function tactics_specialtymap_from_tactics
   * Returns a tactics updated with specialtymap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_specialtymap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_specialtymap_from_tactics = {
    vx_type: nx_tactics_decks_specialty.t_tactics_specialtymap_from_tactics
  }

  // (func tactics-specialtymap<-tactics)
  static f_tactics_specialtymap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const specialtymap = nx_tactics_decks_specialty.f_specialtymap_tactics(tactics)
        return vx_core.f_copy(tactics, ":specialtymap", specialtymap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "specialtymap-tactics": nx_tactics_decks_specialty.e_specialtymap_tactics,
      "tactics-specialtymap<-tactics": nx_tactics_decks_specialty.e_tactics_specialtymap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "specialtymap-tactics": nx_tactics_decks_specialty.t_specialtymap_tactics,
      "tactics-specialtymap<-tactics": nx_tactics_decks_specialty.t_tactics_specialtymap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/specialty",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func specialtymap-tactics)
    nx_tactics_decks_specialty.t_specialtymap_tactics['vx_value'] = {
      name          : "specialtymap-tactics",
      pkgname       : "nx/tactics/decks/specialty",
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
      fn            : nx_tactics_decks_specialty.f_specialtymap_tactics
    }

    // (func tactics-specialtymap<-tactics)
    nx_tactics_decks_specialty.t_tactics_specialtymap_from_tactics['vx_value'] = {
      name          : "tactics-specialtymap<-tactics",
      pkgname       : "nx/tactics/decks/specialty",
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
      fn            : nx_tactics_decks_specialty.f_tactics_specialtymap_from_tactics
    }

  }
}
