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
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Bounty Hunter", ":reference", "* Certainly there is no hunting like the hunting of man and those who have hunted armed men long enough and liked it, never really care for anything else thereafter. - On the Blue Water, Ernest Hemmingway", ":summary", "* Bounty Hunting represents experience in stalking and capturing a target in an urban setting. This is traditionally done for money and can be quite profitable.\n* Bounties are placed on people for whom the law lacks the resources or inclination to pursue.\n* Bounties are placed by insurance companies, bail bondsmen, armies, the F.B.I., and individuals.\n* The reward can be paid for information, the capture of the target in a reasonably uninjured state, or even dead or alive.\n* The reward obviously needs to be commensurate with the difficulty or no one will take it. Capturing is harder than killing, so captures gain a bonus."),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Alien Hunter", ":references", "* Men in Black"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Caving", ":summary", "* Dead Reckoning\n* Detect Hollow Rock\n* Mining\n* Motion Sense\n* Sapping\n* Underground Survival", ":titles", "Miner, Prospector, Sapper, Spelunker, Underminer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Demon Hunter", ":reference", "* Ash Williams, Evil Dead\n* Claymore\n* Demon Hunter, Diablo\n* Demon Slayer: Kimetsu no Yaiba\n* Sango, Inuyasha"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Devil Hunter", ":reference", "* Chainsawman\n* Devil Hunter Youko\n* Devil May Cry"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Ghost Hunter", ":references", "* Ghostbusters"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Mage Hunter", ":reference", "* Templars, Dragon Age"),
      vx_core.f_new({"any-1": nx_tactics_base.t_specialty}, ":name", "Monster Hunter", ":reference", "* Grey Wardens, Dragon Age\n* Witcher"),
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
