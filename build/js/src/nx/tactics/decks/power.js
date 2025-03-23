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
        "Toxins",
        ":reference",
        "* Say 'ah'. Some poisons can kill people in the thousands with that amount. Like botulinum toxin. It inhibits acetylcholine release, causing loss of muscle tone, lethary, .. dizziness .., visual impairment.., heavy eyelids, intense thirst, loss of speech, vomiting, diarrhea, stomach distention, breathing difficulty.. then.. respiratory failure. - A.K.I, Street Fighter 6",
        ":titles",
        "Poisonous, Venomous",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Blinding Spit", "Blinding Toxin", "Irritating Toxin", "Paralyzing Bite", "Paralyzing Spit", "Paralyzing Spray", "Paralyzing Sting", "Poison Bite", "Poison Blood", "Poison Spit", "Poison Spray", "Poison Sting", "Poison Touch", "Poisonous Flesh", "Poisonous Skin")
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
