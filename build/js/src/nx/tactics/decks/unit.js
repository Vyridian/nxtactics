'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_unit {

  /**
   * @function tactics_unitmap_from_tactics
   * Returns a tactics updated with unitmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_unitmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_unitmap_from_tactics = {
    vx_type: nx_tactics_decks_unit.t_tactics_unitmap_from_tactics
  }

  // (func tactics-unitmap<-tactics)
  static f_tactics_unitmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const unitmap = nx_tactics_decks_unit.f_unitmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":unitmap", unitmap)
      })
    )
    return output
  }

  /**
   * @function unitmap_tactics
   * Returns the base unitmap
   * @param  {tactics} tactics
   * @return {unitmap}
   */
  static t_unitmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_unitmap_tactics = {
    vx_type: nx_tactics_decks_unit.t_unitmap_tactics
  }

  // (func unitmap-tactics)
  static f_unitmap_tactics(tactics) {
    let output = nx_tactics_base.e_unitmap
    output = nx_tactics_base.f_unitmap_from_unitlist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "American Frigate",
        ":image",
        "images/ageofsail/american-frigate.png",
        ":titles",
        "USS Constitution, Old Ironsides",
        ":speedwater",
        "24kph",
        ":classification",
        "Hvy. Naval Vessel",
        ":mass",
        "2200tons",
        ":length",
        "62m",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":power",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Armored"),
            ":summary",
            "21 inches (530 mm/88mm RHA)",
            ":front",
            "88mm",
            ":back",
            "88mm",
            ":side",
            "88mm"
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":skill",
            nx_tactics_base.f_skill_from_tactics_key(tactics, "Gunnery"),
            ":summary",
            "30 x 24-pounder (11 kg) long gun\n20 x 32-pounder (15 kg) carronade\n2 x 24-pounder (11 kg) bow chasers",
            ":unitabilitymap",
            nx_tactics_base.f_unitabilitymap_from_tactics_keys(tactics, "Salvo")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Boba Fett", ":image", "images/starwars/unit-bobafett.png", ":reference", "* Vader: There will be a substantial reward for the one who finds the Millenium Falcon. You are free to use any methods necessary, but I want them alive. No disintegrations. Boba:As you wish. - Darth Vader and Boba Fett - Empire Strikes Back"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bossk", ":image", "images/starwars/unit-bossk.png", ":titles", "Bossk'wassak'Cradossk", ":reference", "* We live and die as the Scorekeeper wills--and I am favored over my enemies by the great goddess. - Bossk", ":summary", "A male Trandoshan bounty hunter and the son of Cradossk who was known for hunting Wookiees. During the Clone Wars, Bossk worked alongside fellow hunters Aurra Sing and Castas to mentor the orphaned Boba Fett. Their scheme to kill Fett's hated enemy, the Jedi Master Mace Windu, resulted in Fett and Bossk's arrest."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Butterfly: Giant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Caterpillar: Giant"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Flint (Early)",
        ":image",
        "images/cards/unit-flint.svg",
        ":race",
        "Half-elven",
        ":gender",
        "M",
        ":age",
        17,
        ":body",
        "7x1",
        ":mind",
        "5x1",
        ":will",
        "5x1",
        ":speed",
        "7x0",
        ":speedland",
        "7kph/4.5mph",
        ":mass",
        "70kg/153lb",
        ":height",
        "1.67m/5'6",
        ":beast",
        "1x0",
        ":shadow",
        "1x0",
        ":value",
        "1x0",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Close Combat",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Knife: Dagger")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Stealth",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Sneak")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Tradeskills",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "House Painting")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Communications",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Elvish")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Goblin: Scout",
        ":image",
        "images/cards/unit-goblin-scout.svg",
        ":gender",
        "Male",
        ":demeanor",
        "Depraved",
        ":nature",
        "Cowardly Envious",
        ":conscience",
        "1x1",
        ":beast",
        "1x0",
        ":race",
        "Goblin",
        ":body",
        "2x1",
        ":mind",
        "6x1",
        ":will",
        "2x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":value",
        "1x0",
        ":mass",
        "22kg/50lb",
        ":height",
        "1m/3ft",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":skill",
            nx_tactics_base.f_skill_from_tactics_key(tactics, "Close Combat"),
            ":level",
            "1",
            ":unititemmap",
            nx_tactics_base.f_unititemmap_from_unititemlist(
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unititem},
                ":item",
                nx_tactics_base.f_item_from_tactics_key(tactics, "Knife: Dagger")
              )
            )
          ),
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":skill",
            nx_tactics_base.f_skill_from_tactics_key(tactics, "Stealth"),
            ":level",
            "1",
            ":unitabilitymap",
            nx_tactics_base.f_unitabilitymap_from_unitabilitylist(
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitability},
                ":ability",
                nx_tactics_base.f_ability_from_tactics_key(tactics, "Sneak")
              )
            )
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hare", ":image", "images/cards/unit-hare.svg", ":body", "4x0", ":mind", "2x1", ":will", "3x1", ":speed", "6x1", ":speedland", "60kph/40mph", ":mass", "4kg/8lbs", ":length", "60cm", ":secrets", "* Because of their extremely low fat content, they are a poor choice as a survival food.\n* The blood of a freshly killed hare can be collected for consumption in a stew or casserole in a cooking process known as jugging.\n* Jugged hare, known as civet de lièvre in France, is a whole hare, cut into pieces, marinated, and cooked with red wine and juniper berries in a tall jug that stands in a pan of water."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbear"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellboar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbull"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hidden", ":image", "images/cards/unit-hidden.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Horse",
        ":image",
        "images/cards/unit-horse.svg",
        ":summary",
        "* Double Move Penalties",
        ":imgmirror",
        true,
        ":body",
        "4x2",
        ":mind",
        "5x-1",
        ":will",
        "2x1",
        ":speed",
        "2x2",
        ":mass",
        "450kg/1000lb",
        ":speedland",
        "20kph/12mph",
        ":demeanor",
        "Aloof",
        ":nature",
        "Skitish"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Jabba the Hutt", ":image", "images/starwars/unit-jabbathehutt.png"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Raideen",
        ":image",
        "images/daikaiju/unit-raideen.png",
        ":summary",
        "Flight: Mach 10 in God Bird form",
        ":mass",
        "350tons",
        ":height",
        "52m",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Gunnery", 5)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shub-Niggurath", ":image", "cthulhu/shubniggurath.png", ":reference", "Imagine a roiling, miasmic mass of twisting tendrils and drooling mouths, so tenuous in composition that its limbs vanish as quickly as they materialize, its very form dividing constantly into a surplus of smaller abominations that are either reabsorbed into its great form, or that escape to some hideous life elsewhere. Not the spitting image of a fertility goddess but this is as close as the mythos gets. Shub-Niggurath may well be the most widely revered amoung the other gods, infuence reaching not only to the Greeks, Cretans, Egyptions, and some druids, but to races so far-flung across the cosmos as the Mi-go of Yuggoth, and the Dhole and Nug-Soth of Yaddith. ... Usually the creation of new life, especially intelligent life, is held as a sacred act. Many humans derive joy and self-import from the notion that their kind was toild over by some kind of divine intelligence. Shub-Niggurath with her blind, indifferent, prolific procreation, undermines this idea. ... Shub-Niggurath was Lovecraft's affirmation that life itself is nothing extrodinary. - Tale Foundry", ":titles", "The Black Goat of the Woods with a Thousand Young", ":summary", "* Mother's Gift - The milk of Shub-Niggurath with powerful healing and corrupting properties."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Slave 1", ":image", "images/starwars/unit-slave1.png", ":titles", "Firespray-31", ":classification", "Med. Spacecraft"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Snake: Emerald Viper",
        ":secrets",
        "* Movement - They can swim and climb trees.\n* Venomous Bite - Vipers carry a limited amount of venom. They can control the amount that injected including none at all.\n* Venom - Viperid venoms typically contain an abundance of protein-degrading enzymes, called proteases, that produce symptoms such as pain, strong local swelling and necrosis, blood loss from cardiovascular damage complicated disruption of the blood-clotting system. Death is usually caused by collapse in blood pressure. Due to the nature of proteolytic venom, a viperid bite is often a very painful experience and should always be taken seriously, though it may not necessarily prove fatal. Even with prompt and proper treatment, a bite can still result in a permanent scar, and in the worst cases, the affected limb may even have to be amputated.\n * Vision - They do not have heat vision unlike Pit Vipers",
        ":image",
        "images/cards/unit-snake-emeraldviper.svg",
        ":body",
        "2x0",
        ":mind",
        "2x1",
        ":will",
        "4x1",
        ":speed",
        "3x0",
        ":speedland",
        "3kph/2mph",
        ":mass",
        "2kg/5lbs",
        ":length",
        "30cm/1ft",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Stealth",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Ambush", "Camouflage")
          )
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_intensity_abilities(
            tactics,
            "Toxins",
            2,
            "2x2",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Poison Bite")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Zombie: Walker",
        ":image",
        "images/cards/unit-zombie-walker.svg",
        ":body",
        "8x1",
        ":mind",
        "5x-1",
        ":speed",
        "4x0",
        ":speedland",
        "4kph/2.5mph",
        ":will",
        "2x1",
        ":mass",
        "80kg/175",
        ":summary",
        "[Zombie]",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grab")
          )
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Natural Weaponry",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite")
          )
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "tactics-unitmap<-tactics": nx_tactics_decks_unit.e_tactics_unitmap_from_tactics,
      "unitmap-tactics": nx_tactics_decks_unit.e_unitmap_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "tactics-unitmap<-tactics": nx_tactics_decks_unit.t_tactics_unitmap_from_tactics,
      "unitmap-tactics": nx_tactics_decks_unit.t_unitmap_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/unit",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func tactics-unitmap<-tactics)
    nx_tactics_decks_unit.t_tactics_unitmap_from_tactics['vx_value'] = {
      name          : "tactics-unitmap<-tactics",
      pkgname       : "nx/tactics/decks/unit",
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
      fn            : nx_tactics_decks_unit.f_tactics_unitmap_from_tactics
    }

    // (func unitmap-tactics)
    nx_tactics_decks_unit.t_unitmap_tactics['vx_value'] = {
      name          : "unitmap-tactics",
      pkgname       : "nx/tactics/decks/unit",
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
      fn            : nx_tactics_decks_unit.f_unitmap_tactics
    }

  }
}
