'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_skill {

  /**
   * @function skillmap_tactics
   * Returns the base skillmap
   * @param  {tactics} tactics
   * @return {skillmap}
   */
  static t_skillmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_skillmap_tactics = {
    vx_type: nx_tactics_decks_skill.t_skillmap_tactics
  }

  // (func skillmap-tactics)
  static f_skillmap_tactics(tactics) {
    let output = nx_tactics_base.e_skillmap
    output = nx_tactics_base.f_skillmap_from_skilllist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_skill},
        ":name",
        "Hunting",
        ":reference",
        "* Royal Huntsman - Sleeping Beauty",
        ":titles",
        "Forward Observer, Gamekeeper, Hunter, Huntress, Huntsman, Huntmaster, Lookout, Mage Hunter, Master Huntsman, Master of the Hunt, Poacher, Ranger, Royal Huntsman, Scout, Sentinel, Stalker, Tracer, Tracker, Watchman",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Bug Hunt", "Call of the Hunt", "Cull the Herd", "Deadfall", "Field Dressing", "Fishing", "Hunter's Mark", "Lure", "Scouting", "Snare", "Tag and Bag", "There is No Escape", "Track"),
        ":specialtymap",
        nx_tactics_base.f_specialtymap_from_tactics_keys(tactics, "Alien Hunter", "Bounty Hunter", "Demon Hunter", "Devil Hunter", "Ghost Hunter", "Mage Hunter", "Monster Hunter", "Trapper", "Treasure Hunter", "Vampire Hunter", "Werewolf Hunter", "Witch Hunter")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_skill},
        ":name",
        "Melee",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Space Clearing")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_skill},
        ":name",
        "Stealth",
        ":titles",
        "Stalker",
        ":stat",
        "Body",
        ":summary",
        "* This skill includes abilities that let you hide, move silently, and suprise your opponents.",
        ":abilitymap",
        nx_tactics_base.f_abilitymap_from_tactics_keys(tactics, "Ambush", "Backstab", "Blend into the Crowd", "Camouflage", "Cloak and Dagger", "Hide", "Sneak", "Sneak Attack", "Stalk", "Strike and Fade", "Tailing", "Vanish", "Without a Trace")
      )
    )
    return output
  }

  /**
   * @function tactics_skillmap_from_tactics
   * Returns a tactics updated with skillmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_skillmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_skillmap_from_tactics = {
    vx_type: nx_tactics_decks_skill.t_tactics_skillmap_from_tactics
  }

  // (func tactics-skillmap<-tactics)
  static f_tactics_skillmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const skillmap = nx_tactics_decks_skill.f_skillmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":skillmap", skillmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "skillmap-tactics": nx_tactics_decks_skill.e_skillmap_tactics,
      "tactics-skillmap<-tactics": nx_tactics_decks_skill.e_tactics_skillmap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "skillmap-tactics": nx_tactics_decks_skill.t_skillmap_tactics,
      "tactics-skillmap<-tactics": nx_tactics_decks_skill.t_tactics_skillmap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/skill",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func skillmap-tactics)
    nx_tactics_decks_skill.t_skillmap_tactics['vx_value'] = {
      name          : "skillmap-tactics",
      pkgname       : "nx/tactics/decks/skill",
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
      fn            : nx_tactics_decks_skill.f_skillmap_tactics
    }

    // (func tactics-skillmap<-tactics)
    nx_tactics_decks_skill.t_tactics_skillmap_from_tactics['vx_value'] = {
      name          : "tactics-skillmap<-tactics",
      pkgname       : "nx/tactics/decks/skill",
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
      fn            : nx_tactics_decks_skill.f_tactics_skillmap_from_tactics
    }

  }
}
