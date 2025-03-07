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
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Balanced for Throwing"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Enlisted", ":summary", "Dialect of enlisted soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Laborer", ":summary", "Dialect of laborer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Officer", ":summary", "Dialect of officer soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Sailor", ":summary", "Dialect of sailors"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Servant", ":summary", "Dialect of servants"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dialect-Slave", ":summary", "Dialect of slaves"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Dream Therapy", ":summary", "Heal Trauma by exploring the Dream World."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Existential Riddle", ":summary", "Demoralize unwitting rivals by questioning their purpose in life."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Mental Gymnastics"),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Restful Sleep", ":summary", "Ensure restful sleep for levelx2 hours."),
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Returning Throw"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Undermine", ":summary", "Damage walls.")
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
