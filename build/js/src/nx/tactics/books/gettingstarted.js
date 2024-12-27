'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_gettingstarted {

  /**
   * Constant: scenario-murin-a0
   * {scenario}
   */
  static c_scenario_murin_a0 = {vx_type: nx_tactics_base.t_scenario, vx_constdef: {pkgname: 'nx/tactics/books/gettingstarted', name: 'scenario-murin-a0', type: nx_tactics_base.t_scenario}}

  /**
   * Constant: scenario-murin-a1
   * {scenario}
   */
  static c_scenario_murin_a1 = {vx_type: nx_tactics_base.t_scenario, vx_constdef: {pkgname: 'nx/tactics/books/gettingstarted', name: 'scenario-murin-a1', type: nx_tactics_base.t_scenario}}

  /**
   * Constant: scenario-murin-a2
   * {scenario}
   */
  static c_scenario_murin_a2 = {vx_type: nx_tactics_base.t_scenario, vx_constdef: {pkgname: 'nx/tactics/books/gettingstarted', name: 'scenario-murin-a2', type: nx_tactics_base.t_scenario}}



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "scenario-murin-a0": nx_tactics_books_gettingstarted.c_scenario_murin_a0,
      "scenario-murin-a1": nx_tactics_books_gettingstarted.c_scenario_murin_a1,
      "scenario-murin-a2": nx_tactics_books_gettingstarted.c_scenario_murin_a2
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/gettingstarted",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (const scenario-murin-a0)
    Object.assign(nx_tactics_books_gettingstarted.c_scenario_murin_a0, vx_core.f_new({"any-1": nx_tactics_base.t_scenario}, ":summary", "* Prologue - You've been traveling for a while. Odd jobs here and there have kept you fed, but\nno opportunity has paid off so far. Your funds are desperately low, and you have to consider\ngiving up a life on the road for something more stable, at least for a while.\n* Setting - You've ended up among the Iron Cross Mountains. This used to be territory\nenthusiastically protected by the Dwarves who lived below, but thing have been quiet for a few\nyears and human civilization is tentatively spreading into the area. There are said to be\nnumerous mines and jewels to be found in these mountains, but so far they are just stories.\nYou are currently traveling with a couple of religious aspirants and their fanatical followers.\nThey claim to follow the Sun God and must follow him during the day. For some reason the truly\nfeebleminded seem to gather together. Well, even if their beliefs are nonsense, their coin is\nreal at least.\n* Plot Hooks - A young man (Jos Halslef) with a mule and cart approach from ahead. His clothes\nare well made but worn, and he does not appear threatening. He engages the group, but soon\nfinds conversation with the aspirants to go nowhere. He suggests coming with him to Murinton."))

    // (const scenario-murin-a1)
    Object.assign(nx_tactics_books_gettingstarted.c_scenario_murin_a1, vx_core.f_new({"any-1": nx_tactics_base.t_scenario}, ":summary", "* Murin Vale - Murin Vale is a misty depression huddled between stout Murin-Lead Mountain\nand the spiky Murin-Quartz Peak. A hundred years ago, this entire area was controlled by the\nMurin Dwarf Clan who served the [Dwarven Underking] far down the [Deep Roads]. However, long ago,\nthe Dwarves withdrew without explanation. Murinton, their trading village, was adopted by\nthe human traders who no longer had their main trading partner.\n* Plot Hooks - A rough trail leads through the wooded vale to a small abandoned town, though\nsmoke can be seen rising from its center."))

    // (const scenario-murin-a2)
    Object.assign(nx_tactics_books_gettingstarted.c_scenario_murin_a2, vx_core.f_new({"any-1": nx_tactics_base.t_scenario}, ":summary", "* Murinton - Within Murin Vale, at the base of Murin-Lead Mountain is the abandoned, Dwarven\nvillage of Murinton. A small populated outpost lies at its center. The outpost is dominated by\nthe 20ft stone doors that lead into Murin-Lead Mountain. The massive doors are carved with\ndwarven artwork and sealed tight from within. The only occupied buildings are a general store,\na smithy, a small grain mill, and some outlying farm houses. A winding stream runs down the\nmountain and powers the mill.\n* Personalities - Only 9 people live in this town though there is probably room for a hundred.\n** Jen Halslef - Jen Halslef heads the outpost, negotiates deals, and runs the smithy when\nneeded. She founded the town 2 years ago, taking advantage of the free property and safe\nterritory. Maintaining the town has been difficult with so little resources, so she remains\nconcerned for the town's future. Her smithy is dedicated to the god dwarven god Moradin, and\nhas carved tablets around the walls describing smithing and calling on the blessings of\nMoradin. She was facinated and has been diligently following both to improve her smithing.\nUnknown to her, Moradin was intrigued by a human female follower and has blessed her.\nSkills: Tradeskills: 1 (Smithing), Channeling: 1 (Healing).\n** Jos Halslef - Jen's twin brother runs the general store, trades with other villages, and\nkeeps the books. The twins had brought a fair quantity of goods to start the town, but after\n2 years resources are getting thin. Chicken, Bread, Jam, and Beer are the staple foods in town.\nJos brings a homemade short spear with him when he travels and is passable at its use.\nSkills: Trade: 1 (Haggling), Melee: 1 (Spears).\n** Silas and Marge Defold - This older couple keep the grain mill down by the winding stream.\nThey mill the flour and brew beer.\n** Mera Searf and Vela Tram - These two women run a wheat farm and bake bread to the west of\nthe village.\n** Thom, Janice, and Gwen Folken - A young couple with their 12 year old daughter run a small\nfarm to the south. Thom hunts deer and rabbit which are plentiful in the nearby woods, while\nJanice and Gwen raise chickens. Gwen also gathers various berries and makes tasty jams. When\nfood is sufficient, Thom with his woodsman's axe. Skills: Hunting: 1 (Snares), Ranged: 1 (Bows)\n* Missing Persons - Yesterday morning, the old mill was found abandoned. The miller  and his\nwife were nowhere to be found, but some of their flour, wheat and beer were clearly dragged\naway, their living quarters were ransacked, and small blood stains were found. A search around\nthe surrounding area left no clues.\n* Scouts - Recently a small band of [Darkling]s opened up a small ventilation tunnel from\nthe Deep Roads. Three goblins had been scouting the area at night when they came across the\nmill. After some arguing, they broke in, captured the couple, searched the place for loot, and\ndragged away what they could.\n* Hidden Camp - They have a small camp hidden in the woods where they have tied up the couple\nand are doing their best to drink all the beer they stole and torment their prisoners. They\nintend to return to gather more loot.\n* Vent Base - Five miles away is the vent where the darklings broke through from the Deep\nRoads. An ambitious Hobgoblin leads the 3 Goblin Scouts, 2 Goblin Engineers, and a Bugbear\nHunter.\n** Goblin Engineers (Sgree, Dley) - The engineers are working to widen the vent.\nBody 3:1, Mind 2:1, Will 2:1\nSkills: Mining (1), Melee: 1 (Picks)\n** Goblin Scouts (Grot, Steg, Glel-Female) - The scouts are at the Hidden Camp.\nBody 3:1, Mind 2:1, Will 2:1\nSkills: Scouting: 1 (Survey), Close Combat: 1 (Knives)\n** Bugbear (Reegal) - The Bugbear alternates between hunting, eating, and lounging. Like the\nHobgoblin, the Bugbear is most interested in his own survival. If the battle goes against\nthem, he will just disappear into the woods.\nBody 2:2, Mind 3:1, Will 4:1\nSkills: [Melee]: 3 [Long Spear], [Hunting]: 2 [Tracking], [Stalking], [Survival]: 2\n[Find Shelter], [Live off the Land].\n** Hobgoblin (Gemste) - The Hobgoblin is very pleased with her plan to use the ventilation\nshaft and hopes to expand it sufficiently for a future raiding force that she hopes to lead.\nThough, she is a skilled fighter, she has higher ambitions than an early grave and is quick\nto parley if overwhelmed.\nBody 8:1, Mind 6:1, Will 5:1\nSkills: Melee: 3 (Swords), Armor: 2 (Scale), Leadership: 2 (Command)"))

  }
}
