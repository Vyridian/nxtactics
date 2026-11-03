'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_encounter {

  /**
   * @function encountermap_tactics
   * Returns the base encountermap
   * @param  {tactics} tactics
   * @return {encountermap}
   */
  static t_encountermap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_encountermap_tactics = {
    vx_type: nx_tactics_decks_encounter.t_encountermap_tactics
  }

  // (func encountermap-tactics)
  static f_encountermap_tactics(tactics) {
    let output = nx_tactics_base.e_encountermap
    output = nx_tactics_base.f_encountermap_from_encounterlist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_encounterlist},
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Arrest", ":summary", "* Ambush - Bandits, Snake, Social Ambush, Surrounded\n* Cloudy - Choking, Darkness, Dust, Obscurced, Smoke, Toxic\n* Guarded - Bodyguards, Guardian, Guardpost, Public Relations\n* Stormy - Cold, Electricity, Fire, Flooding, Heat, Rain, Sprinklers, Wind\n* Hazard:Explosive Gas\n* Hazard:Noxious Gas\n* WB - Serendipity - \n* WR - Tragedy - \n* C - Champion -\n* C - Explosion\n* Q - Extortion, Blackmail, Hostage, Manipulation\n* J - Lieutenant -\n* T - Thugs - \n* ? - Mob, , , Crowd (Bystanders)\n* ? - Blocked (Barrier, Chasm, Landslide, Locked Door, Wall), Maze, , Tight Space\n\n* CA - Juggernaut - A powerful, seemingly unstoppable foe appears. Eg. A dragon, a tank a semi-truck, a rolling bolder, a bull, a battleship, a star destroyer.\n* CQ - Extortion\n* C - Horde - \n* C - Stampede - \n* C - Swarm - \n* DA - Checkmate - Turning Point. The opposition is much farther along than expected.\n* D - Strategist - A foe engages in a contest of planning, prediction, negotiation, or tactical thinking. \n* DQ - Blackmail\n* D - Locked - The way ahead is barred by a lock, puzzle, spell or some other mechanism\n* D - Timebomb - The area is about to be destroyed, find a way to defuse it or a way to get what you want and escape\n* D - Mystery - \n* D - Research - \n* D - Law - Arrest - [Player]x3 Enforcers with orders to arrest the Players\n* D - Lost - \n* D - Dilemma - \n* D - Decipher - Complex text, instructions, language or Runes need to be deciphered, translated, followed, or activated.\n* D - Map - A treasure map of sorts\n* D - Malfunction - A system fails to act as expected\n* D - Improvise - The current plan breaks down\n* D - Riddle - A particular phrasing, password, or etiquette is required\n* D - Etiquette - \n* HQ - Hostage - \n* H - Rumors - Whispering Campaign\n* H - Crisis - A personal crisis\n* H - Family - \n* S - Collapse - Ground gives way\n* SQ - Intimidation\n* S - No Man's Land - Lockdown\n* S - Roadblock - \n* S - Blackout - \n* S - Fire - \n* S - Broken Ground - \n* S - Water - \n\n* D - Blackmail - \n* D - Marksmen - \n* D - Bandits - \n* D - Sabotage -\n* D - Thieves -  \n* D - Lost - \n* HA - Betrayal - \n* H - Desperate - \n* H - Etiquette - \n* H - Hostages - \n* H - Predator - \n* H - Pack - \n* H - Reveal - A secret is revealed\n* H - Watched - \n* H - Eagar Ally - An ally is a little too eagar for their own good. They act on their own, attract attention, or a just annoying.\n* H - Pest - Vermin\n* H - Watched -\n* SA - Pinned Down - The area is too dangerous to cross. Sniper, firefight, etc.\n* S - Runaway - Catch a errant person, animal, or vehicle\n* S - Pursued - Chased, Hunted, Tailed, Tracked\n* S - Cornered - Dead End\n* S - Crowd - \n* S - Falling - \n* S - Unstable - Balance Beam, Bridge, Broken Ground"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Champion"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Guards"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Lieutenant"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hunter"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Marksmen"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Predator"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Pack"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Vermin", ":summary", "* [Player]x3 Vermin packs defend their territory"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Ambush"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Betrayal"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Fire Spreads"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Flooding"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Obscured"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Storm", ":summary", "This can be physical or a change in the way you are seen"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Explosion"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Barrier", ":summary", "A large gap appears between you and your goal\n* This can be physical or metaphorical\n* Chasm, Locked Door, Wall"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Cornered"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Dead End"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Etiquette"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Law"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Lost"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Robbery"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Sabotage"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Watched"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Strange:Anomaly", ":summary", "* Freakish Weather\n* Myterious Barrier\n* Omen/Portent\n* Strange Presence\n* Strange Lights or Sounds\n* Unusual Animal Activity"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Adventurers", ":summary", "* Amateurs\n* Bounty Hunters"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Local", ":summary", "* Guide\n* Information"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Merchant", ":summary", "* Caravan\n* Lone Merchant"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Messenger", ":summary", "* Diplomatic Envoy\n* Lone Messenger"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Pilgrims", ":summary", "* Cultists\n* Peaceful\n* Zealots"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Event:Refugees", ":summary", "* Beggar\n* Deserter\n* Lost Traveller\n* Runaway"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Falling", ":summary", "* Falling Debris\n* Quicksand\n* Pit Trap\n* Rockslide\n* Sinkhole\n* Spiked Pit"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Fire", ":summary", "* Forest Fire\n* Wildfire"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Ground", ":summary", "* Test [Survival] or [Athletics] or slide to the other end of the space\n* Cliff\n* Obstacle\n* Ravine\n* Rockslide\n* Slippery Ground\n* Unstable Ground"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Trap", ":summary", "* Darts\n* Explosives\n* Fire Trap\n* Tripwire"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Water", ":summary", "* Current\n* Disease\n* Flash Flood\n* Flooding\n* Parasites\n* Polluted Pool\n* Rapids\n* Rising Water\n* Stream\n* Swamp"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Hazard:Weather", ":summary", "Use the Weather Rules and adjust 1 by 2"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Clue", ":summary", "* Evidence\n* Map\n* Papers\n* Traces of Conflict\n* Tracks"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Food", ":summary", "* Abandoned Food\n* Herbs\n* Fruits and Berries\n* Tubers"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Money"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Shelter", ":summary", "Sheltered Rest Spot\n* Abandoned Building\n* Cave\n* Overhang"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Treasure"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Item:Water"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Ambush"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Bandits", ":summary", "* Cutthroats\n* Thieves"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Creature", ":summary", "* Powerful Creature\n* Predator\n* Rogue Beast"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Desparate", ":summary", "* Diseased\n* Madmen\n* Starving"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Herd"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Operatives", ":summary", "* Murderers\n* Saboteurs\n* Spies"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Pack"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Patrol", ":summary", "* Amateurs\n* Military\n* Paramilitary"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Plants", ":summary", "* Poisonous\n* Tangle Vines\n* Thorn Bushes"),
        vx_core.f_new({"any-1": nx_tactics_base.t_encounter}, ":name", "Threat:Swarm")
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "encountermap-tactics": nx_tactics_decks_encounter.e_encountermap_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "encountermap-tactics": nx_tactics_decks_encounter.t_encountermap_tactics
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

    // (func encountermap-tactics)
    nx_tactics_decks_encounter.t_encountermap_tactics['vx_value'] = {
      name          : "encountermap-tactics",
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
      fn            : nx_tactics_decks_encounter.f_encountermap_tactics
    }

  }
}
