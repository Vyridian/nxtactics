'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_encounter {

  /**
   * @function rulemap_tactics
   * Returns the base encountermap
   * @param  {tactics} tactics
   * @return {rulemap}
   */
  static t_rulemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_rulemap_tactics = {
    vx_type: nx_tactics_decks_encounter.t_rulemap_tactics
  }

  // (func rulemap-tactics)
  static f_rulemap_tactics(tactics) {
    let output = nx_tactics_base.e_rulemap
    output = nx_tactics_base.f_rulemap_from_rulelist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_rulelist},
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Strange:Anomaly", ":summary", "* Freakish Weather\n* Myterious Barrier\n* Omen/Portent\n* Strange Presence\n* Strange Lights or Sounds\n* Unusual Animal Activity"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Adventurers", ":summary", "* Amateurs\n* Bounty Hunters"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Local", ":summary", "* Guide\n* Information"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Merchant", ":summary", "* Caravan\n* Lone Merchant"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Messenger", ":summary", "* Diplomatic Envoy\n* Lone Messenger"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Pilgrims", ":summary", "* Cultists\n* Peaceful\n* Zealots"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Event:Refugees", ":summary", "* Beggar\n* Deserter\n* Lost Traveller\n* Runaway"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Falling", ":summary", "* Falling Debris\n* Quicksand\n* Pit Trap\n* Rockslide\n* Sinkhole\n* Spiked Pit"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Fire", ":summary", "* Forest Fire\n* Wildfire"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Ground", ":summary", "* Test [Survival] or [Athletics] or slide to the other end of the space\n* Cliff\n* Obstacle\n* Ravine\n* Rockslide\n* Slippery Ground\n* Unstable Ground"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Trap", ":summary", "* Darts\n* Explosives\n* Fire Trap\n* Tripwire"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Water", ":summary", "* Current\n* Disease\n* Flash Flood\n* Flooding\n* Parasites\n* Polluted Pool\n* Rapids\n* Rising Water\n* Stream\n* Swamp"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hazard:Weather", ":summary", "Use the Weather Rules and adjust 1 by 2"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Clue", ":summary", "* Evidence\n* Map\n* Papers\n* Traces of Conflict\n* Tracks"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Food", ":summary", "* Abandoned Food\n* Herbs\n* Fruits and Berries\n* Tubers"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Money"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Shelter", ":summary", "Sheltered Rest Spot\n* Abandoned Building\n* Cave\n* Overhang"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Treasure"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Item:Water"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Ambush"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Bandits", ":summary", "* Cutthroats\n* Thieves"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Creature", ":summary", "* Powerful Creature\n* Predator\n* Rogue Beast"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Desparate", ":summary", "* Diseased\n* Madmen\n* Starving"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Herd"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Operatives", ":summary", "* Murderers\n* Saboteurs\n* Spies"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Pack"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Patrol", ":summary", "* Amateurs\n* Military\n* Paramilitary"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Plants", ":summary", "* Poisonous\n* Tangle Vines\n* Thorn Bushes"),
        vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Threat:Swarm")
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "rulemap-tactics": nx_tactics_decks_encounter.e_rulemap_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "rulemap-tactics": nx_tactics_decks_encounter.t_rulemap_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/encounter",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func rulemap-tactics)
    nx_tactics_decks_encounter.t_rulemap_tactics['vx_value'] = {
      name          : "rulemap-tactics",
      pkgname       : "nx/tactics/decks/encounter",
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
      fn            : nx_tactics_decks_encounter.f_rulemap_tactics
    }

  }
}
