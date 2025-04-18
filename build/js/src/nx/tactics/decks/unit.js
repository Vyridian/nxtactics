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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Automaton"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Bandit",
        ":image",
        "images/cards/unit-bandit.svg",
        ":summary",
        "A highwayman.",
        ":traits",
        "Human Male",
        ":body",
        "8x1",
        ":mind",
        "5x1",
        ":will",
        "5x1",
        ":speed",
        "6x0",
        ":speedland",
        "6kph/4mph",
        ":mass",
        "80kg/180",
        ":height",
        "1.8m/6ft",
        ":mass",
        "80kg/220lb",
        ":height",
        "1.9m/6'3ft",
        ":demeanor",
        "Opportunistic",
        ":nature",
        "Ruthless",
        ":beast",
        "2x0",
        ":shadow",
        "5x0",
        ":value",
        "1x0",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            3,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Sword: Short")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Stealth",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Ambush")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Black", ":image", "images/cards/unit-bear-black.svg", ":reference", "* Apex predator. High on cocaine. Out of its mind. - Cocaine Bear", ":body", "2x2", ":mass", "200kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Brown", ":image", "images/cards/unit-bear-brown.svg", ":body", "4x2", ":mass", "400kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Grizzly", ":image", "images/cards/unit-bear-grizzly.svg", ":reference", "* It has been estimated that a bite from a grizzly could crush a bowling ball.", ":body", "6x2", ":mass", "600kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Polar", ":image", "images/cards/unit-bear-polar.svg", ":body", "5x2", ":mass", "500kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Boba Fett", ":image", "images/starwars/unit-bobafett.png", ":reference", "* Vader: There will be a substantial reward for the one who finds the Millenium Falcon. You are free to use any methods necessary, but I want them alive. No disintegrations. Boba:As you wish. - Darth Vader and Boba Fett - Empire Strikes Back"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bossk", ":image", "images/starwars/unit-bossk.png", ":titles", "Bossk'wassak'Cradossk", ":reference", "* We live and die as the Scorekeeper wills--and I am favored over my enemies by the great goddess. - Bossk", ":summary", "A male Trandoshan bounty hunter and the son of Cradossk who was known for hunting Wookiees. During the Clone Wars, Bossk worked alongside fellow hunters Aurra Sing and Castas to mentor the orphaned Boba Fett. Their scheme to kill Fett's hated enemy, the Jedi Master Mace Windu, resulted in Fett and Bossk's arrest."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bronze Bull"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bronze Horse"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Bruiser",
        ":image",
        "images/cards/unit-bruiser.svg",
        ":summary",
        "A burly, intimidating man.",
        ":traits",
        "Human Male",
        ":body",
        "10x1",
        ":mind",
        "3x1",
        ":will",
        "5x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":mass",
        "100kg/220lb",
        ":height",
        "1.9m/6'3ft",
        ":demeanor",
        "Glaring",
        ":nature",
        "Callous",
        ":beast",
        "5x0",
        ":shadow",
        "1x0",
        ":value",
        "1x0",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grab")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Intimidation", 1)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Butterfly: Giant"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Cart: Wooden",
        ":image",
        "images/cards/unit-cart-wooden.svg",
        ":imgmirror",
        true,
        ":body",
        "2x2",
        ":mass",
        "200kg/440lb"
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Caterpillar: Giant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Avian"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Cobra", ":titles", "Iron Cobra"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Dragon", ":titles", "Iron Dragon"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Golem", ":titles", "Ruin Grader, Ruin Guard"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Owl", ":reference", "* Bubo - Clash of the Titans", ":summary", "* Clockwork Owls have excellent vision and make fair spys and messengers. However, they are not at all fast, stealthy, or agile, so some feel that they are far from practical."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Minotaur", ":reference", "* Minoton - Sinbad and the Eye of the Tiger"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Scorpion", ":titles", "Iron Scorpion"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Spider", ":titles", "Iron Spider, Spiderbot"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Steed", ":titles", "Iron Horse"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cthonian", ":image", "Cthulhu/Cthonian.png"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dhole", ":titles", "Bhole", ":summary", "* Huge slimy, worm-like creatures several hundred meters long."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Dog: Wild",
        ":image",
        "images/cards/unit-dog-wild.svg",
        ":summary",
        "The Wild Dog is one of the fastest runners in the animal kingdom.",
        ":body",
        "2x1",
        ":mind",
        "8x-1",
        ":will",
        "4x1",
        ":speed",
        "4x1",
        ":mass",
        "22kg/50lb",
        ":height",
        "76cm/30in",
        ":speedland",
        "40kph/25mph",
        ":nature",
        "Dogged",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite", "Grab", "Drag")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon Engine", ":titles", "Steam Engine"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Apophis", ":reference", "Egyptian Mythology"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Ladon"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Midgard Serpent", ":reference", "Norse Mythology"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Pytho"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Stoorworm"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dragon: Tiamat", ":reference", "Babylonian Mythology", ":titles", "Avatar of Chaos, Avatar of the Wyrm, The Beast, Mother of All Life"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elder Thing", ":image", "Cthulhu/ElderThing.png", ":reference", "* The toughness of the things was almost incredible. Even the terrific pressure of the deepest sea bottoms appeared powerless to harm them. Very few seemed to die at all except for violence, and their burial places were very limited. - At the Mountains of Madness", ":summary", "* Their metabolism is based on carbon dioxide instead of oxygen; their blood is dark green in color. The nervous system of the Elder Things is quite complex, with five-lobed brains and many ganglial centers. The prismatic cilia on top of the creatures' head suggest that they have senses other than sight, smell, touch, hearing, and taste. Elder Things reproduce through spores. They can derive nourishment from inorganic substances, but prefer to feed on organic life."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Flint (Early)",
        ":image",
        "images/cards/unit-flint.svg",
        ":traits",
        "Half-elven Male",
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
        ":demeanor",
        "Depraved",
        ":nature",
        "Cowardly Envious",
        ":conscience",
        "1x1",
        ":beast",
        "1x0",
        ":traits",
        "Goblin Male",
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Guardsman",
        ":image",
        "images/cards/unit-guardsman.svg",
        ":summary",
        "A typical member of a city watch or to keep lookout.",
        ":traits",
        "Human Male",
        ":body",
        "8x1",
        ":mind",
        "5x1",
        ":will",
        "5x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":mass",
        "80kg/175",
        ":height",
        "1.8m/6ft",
        ":height",
        "1.9m/6'3ft",
        ":demeanor",
        "Indifferent",
        ":nature",
        "Lazy",
        ":beast",
        "1x0",
        ":shadow",
        "2x0",
        ":value",
        "1x0",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Spear")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Investigation", 1)
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Iron Maiden", ":summary", "* A semi-humanoid automaton whose lower body is a giant spiked maw that engulfs its target. It is used as an intimidation and torture device."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Jabba the Hutt", ":image", "images/starwars/unit-jabbathehutt.png"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Jes Aveer",
        ":titles",
        "Jessana Aveer",
        ":image",
        "images/cards/unit-jesaveer.svg",
        ":summary",
        "A resilient, young woman with a love of blacksmithing.",
        ":traits",
        "Human Female",
        ":age",
        24,
        ":body",
        "6x1",
        ":mind",
        "6x1",
        ":will",
        "6x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":mass",
        "63kg",
        ":height",
        "1.72m/5ft7",
        ":demeanor",
        "Willful",
        ":nature",
        "Nuturing",
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
            "Melee",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Hammer")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Tradeskills",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Blacksmithing")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Jon Aveer",
        ":titles",
        "Ajona Aveer",
        ":image",
        "images/cards/unit-jonaveer.svg",
        ":summary",
        "A clever, young man trying to make his fortune.",
        ":traits",
        "Human Male",
        ":age",
        23,
        ":body",
        "7x1",
        ":mind",
        "6x1",
        ":will",
        "5x1",
        ":speed",
        "4x0",
        ":speedland",
        "4kph/2.5mph",
        ":mass",
        "75kg",
        ":height",
        "1.78m/5ft10",
        ":demeanor",
        "Frivolous",
        ":nature",
        "Loyal",
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
            "Melee",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Spear")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Business",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bargain")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Juggernaut"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Lili Ducon",
        ":image",
        "images/cards/unit-liliducon.svg",
        ":summary",
        "A pleasant and perceptive young lady, who moved with her father Wilm. She took her mother's death hard, and is having a difficult time adapting.",
        ":traits",
        "Human Female",
        ":age",
        11,
        ":body",
        "4x1",
        ":mind",
        "4x1",
        ":will",
        "4x1",
        ":speed",
        "3x0",
        ":speedland",
        "3kph/2mph",
        ":mass",
        "40kg/88lb",
        ":height",
        "1.5m/5ft",
        ":demeanor",
        "Pleasant",
        ":nature",
        "Anxious",
        ":beast",
        "1x0",
        ":shadow",
        "1x0",
        ":value",
        "1x0",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Survival",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Foraging")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Force"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Mount"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Monster"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Warrior"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pit Fiend", ":titles", "Balrog, Fiend, Lord of the Pit", ":traits", "Devil"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Raideen",
        ":image",
        "images/daikaiju/unit-raideen.png",
        ":summary",
        "Flight: Mach 10 in God Bird form",
        ":body",
        "3.5x5",
        ":mass",
        "350tons",
        ":height",
        "52m",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Gunnery", 5)
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Flight", "Transform")
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
        "The Professor",
        ":image",
        "images/cards/unit-theprofessor.svg",
        ":body",
        "7x2",
        ":mind",
        "7x1",
        ":will",
        "3x1",
        ":speed",
        "7x0",
        ":speedland",
        "7kph/4.5mph",
        ":mass",
        "70kg/155lb",
        ":height",
        "1.7m/5'6",
        ":demeanor",
        "Foolish",
        ":nature",
        "Cowardly",
        ":summary",
        "",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Ranged",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bow: Short")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities_items(
            tactics,
            "Investigation",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Detail Oriented"),
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Accessory: Monocle")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Advanced",
        ":image",
        "StarWars/Imperial_TieAdvanced.png",
        ":titles",
        "Tie Avenger",
        ":classification",
        "Lt. Spacecraft",
        ":summary",
        "* Equipped with Hyperdrive and Deflector Shields",
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          ":Gunnery",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":name",
            "Gunnery",
            ":level",
            "4",
            ":unititemmap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititemmap},
              ":Turbolaser",
              vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "SFS L-s1 Laser Cannon", ":facing", "Fx2")
            )
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Bomber", ":image", "StarWars/Imperial_TieBomber.png", ":classification", "Lt. Spacecraft", ":summary", "* Much heavier than the Tie Fighter\n* Carries Concussion Missiles or Proton Bombs"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Defender",
        ":image",
        "StarWars/Imperial_TieDefender.png",
        ":classification",
        "Lt. Spacecraft",
        ":summary",
        "* Equipped with Hyperdrive and Deflector Shields",
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          ":Gunnery",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":name",
            "Gunnery",
            ":level",
            "4",
            ":unititemmap",
            nx_tactics_base.f_unititemmap_from_unititemlist(
              vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "SFS L-s1 Laser Cannon", ":facing", "Fx4"),
              vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Ion Cannon", ":facing", "Fx2")
            )
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Fighter",
        ":image",
        "StarWars/Imperial_TieFighter.png",
        ":titles",
        "Twin Ion Engine Fighter",
        ":classification",
        "Lt. Spacecraft",
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          ":Gunnery",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":name",
            "Gunnery",
            ":level",
            "4",
            ":unititemmap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititemmap},
              ":Turbolaser",
              vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "SFS L-s1 Laser Cannon", ":facing", "Fx2")
            )
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Interceptor",
        ":image",
        "StarWars/Imperial_TieInterceptor.png",
        ":classification",
        "Lt. Spacecraft",
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          ":Gunnery",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitskill},
            ":name",
            "Gunnery",
            ":level",
            "4",
            ":unititemmap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unititemmap},
              ":Turbolaser",
              vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "SFS L-s1 Laser Cannon", ":facing", "Fx4")
            )
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Phantom",
        ":summary",
        "* Cloaking Device",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Gunnery"),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Stealth")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Primitive", ":image", "images/cards/unit-valusian-primitive.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Sorcerer", ":image", "images/cards/unit-valusian-warrior.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Warrior", ":image", "images/cards/unit-valusian-warrior.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Wilm Ducon",
        ":image",
        "images/cards/unit-wilmducon.svg",
        ":summary",
        "A proud, prickly huntsman who lost his wife in a violent raid and moved away with his daughter, Lily, to restart his life.",
        ":traits",
        "Human Male",
        ":age",
        30,
        ":body",
        "8x1",
        ":mind",
        "5x1",
        ":will",
        "5x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":mass",
        "80kg/180",
        ":height",
        "1.8m/6ft",
        ":demeanor",
        "Gruff",
        ":nature",
        "Tortured",
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
            "Melee",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Axe: Wood")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Hunting",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Snare")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Xeib Honower",
        ":image",
        "images/cards/unit-xeibhanower.svg",
        ":traits",
        "Human Male",
        ":age",
        23,
        ":body",
        "8x1",
        ":mind",
        "5x1",
        ":will",
        "6x1",
        ":speed",
        "4x0",
        ":speedland",
        "4kph/2.5mph",
        ":mass",
        "80kg",
        ":height",
        "1.78m/5'10",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Animal Handling",
            3,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Harvest Poison", "Snake Charming")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Zombie: Crawler",
        ":image",
        "images/cards/unit-zombie-crawler.svg",
        ":body",
        "8x1",
        ":mind",
        "5x-1",
        ":will",
        "2x1",
        ":speed",
        "3x0",
        ":speedland",
        "3kph/2mph",
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
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Zombie: Dog",
        ":image",
        "images/cards/unit-zombie-dog.svg",
        ":body",
        "2x1",
        ":mind",
        "8x-1",
        ":will",
        "4x1",
        ":speed",
        "7x0",
        ":speedland",
        "7kph/4.5mph",
        ":mass",
        "22kg/50lb",
        ":height",
        "76cm/30in",
        ":nature",
        "Dogged",
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
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Zombie: Runner",
        ":image",
        "images/cards/unit-zombie-runner.svg",
        ":body",
        "7x1",
        ":mind",
        "5x-1",
        ":will",
        "2x1",
        ":speed",
        "5x0",
        ":speedland",
        "5kph/3mph",
        ":mass",
        "70kg/155lb",
        ":height",
        "1.8m/6ft",
        ":demeanor",
        "Aloof",
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
