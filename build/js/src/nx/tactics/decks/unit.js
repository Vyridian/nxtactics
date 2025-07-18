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
        "Able Team",
        ":image",
        "WWIIAmerican/Infantry_AbleScoutToken.png",
        ":summary",
        "* Able Team is composed of 2 scouts who advance 25m ahead of the squad.",
        ":classification",
        "Lt. Infantry",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Military", 3)
        )
      ),
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
        ":body",
        "2.2x6",
        ":mass",
        "2200tons",
        ":length",
        "62m",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":power",
            nx_tactics_base.f_power_from_tactics_key(tactics, "Armor"),
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
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Antios Teron",
        ":summary",
        "* Human Spy\n* Antios is a spy for Lord Aramel.\n* He is currently disguised as a mercenary for hire while travelling through the Imperium to assess their defenses. He has been authorized to assassinate any high ranking politician he should encounter to disrupt\nlocal politics. His mission has no time limit, and he is periodically scried by Lord Aramel's wizards.\n* He is a convincing actor who can play most parts well. He is particularly ruthless about his identity and will silence any who might compromise him or his mission.",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Espionage", 5)
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Arinni Taybor",
        ":summary",
        "* Human Priest/Monk",
        ":titles",
        "Taybor the Red",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            5,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Club: Staff")
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
        "80kg/175",
        ":height",
        "1.8m/6ft",
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bane: Disease", ":summary", "* These repulsive Banes appear like blood covered bags of pus. They are drawn to plagues, cesspools, medical waste, etc."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bane: Madness", ":summary", "* These formless spirits wear down the sanity of those exposed to them with disembodied voices, disturbing visions, and horrible shrieking."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bane: Poison"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bane: Radiation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Barghest", ":titles", "Black Shuck, Ghost Hound"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bat: Fruit"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bat: Vampire"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Batman",
        ":image",
        "Superheroes/Batman.png",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Intellect")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Black", ":image", "images/cards/unit-bear-black.svg", ":reference", "* Apex predator. High on cocaine. Out of its mind. - Cocaine Bear", ":body", "2x2", ":mass", "200kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Brown", ":image", "images/cards/unit-bear-brown.svg", ":body", "4x2", ":mass", "400kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Grizzly", ":image", "images/cards/unit-bear-grizzly.svg", ":reference", "* It has been estimated that a bite from a grizzly could crush a bowling ball.", ":body", "6x2", ":mass", "600kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bear: Polar", ":image", "images/cards/unit-bear-polar.svg", ":body", "5x2", ":mass", "500kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Blackguard", ":titles", "Black Dragoon", ":summary", "* An elite mercenary cadre organized by Hetman Undrig.\n* Their base is a small, walled town dedicated to their needs.\n* The Dragoons are a loose group. Decisions and leaders are chosen by majority vote. Power can change at anytime (including during combat).\n* Dragoons pay no dues nor is there direct pay. The Dragoons make money by hiring out as mercenaries.  They charge double normal rates, but are reknowned for their excellent training and equipment. Dragoons take great pride in their high status and react poorly to those who do not recognize their talent.\n* Dragoons are trained professionals in their jobs and recognize the need for discretion. They care little for whether a job is legal or not, and the Dragoons are known for possessing certain 'subtle' skills that make covert missions possible. They do not, however, enjoy excessive risk and are not above abandoning very dangerous missions."),
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
        ":reference",
        "* Wanna piece of me? Line starts here. - Sett, Runeterra",
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
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Beatdown", "Grab")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Intimidation", 1)
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Brunhil Virden",
        ":image",
        "images/cards/unit-brunhil-virden.svg",
        ":titles",
        "Sergeant of the Guard",
        ":traits",
        "Human Female",
        ":body",
        "7x1",
        ":mind",
        "6x1",
        ":will",
        "6x1",
        ":speed",
        "5x0",
        ":mass",
        "70kg/153lb",
        ":speedland",
        "5kph/3mph",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            4,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Sword: Long")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grab")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Investigation", 2),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Intimidation", 1)
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Burning Dead",
        ":summary",
        "* The burning dead are those who died by fire. They appear as they did in death (as burning skeletons, burning corpses, or burning ash).\n* They are consumed by intense pain and confusion and cannot be reasoned with.\n* They seek help from the living and attempt to embrace them in an attempt to exinquish themselves. This only serves to immolate their victim who will often rise as Burning Dead themselves. Only estinquishing their flames or destroying their remains will put them to rest.\n* They always attack with a Grab and will do Fire damage each round they hold their victim.\n* All Melee [Criticals] are [Burning] damage.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Fire"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_specialties(
            tactics,
            "Close Combat",
            6,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grappling")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Butterfly: Giant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Capybara", ":body", "5x1", ":mass", "50kg"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cat", ":image", "images/cards/unit-cat.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Caterpillar: Giant"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Charn Aramel",
        ":summary",
        "Human Dread Knight",
        ":titles",
        "Nighthook, Lord Aramel",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Conviction", 10)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Chicken", ":image", "images/cards/unit-chicken.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Chun-Li",
        ":image",
        "streetfighter/unit-chunli.png",
        ":summary",
        "* Chun-Li's name is Mandarin for 'spring beauty'.",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities_specialties(
            tactics,
            "Close Combat",
            8,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Handstand Kick", "Lightning Leg", "Spinning Bird Kick"),
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Tai Ch'i Ch'uan", "Wu Shu")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key(tactics, "Law")
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Avian"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Bull", ":titles", "Mechanical Bull", ":reference", "* It's a mechanical bull, the number one. You'll take a ride from anyone, Everyone wants a ride, and pulls away, from you - Metric, Black Sheep"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Cobra", ":titles", "Iron Cobra"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Dragon", ":titles", "Iron Dragon"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Golem", ":titles", "Ruin Grader, Ruin Guard"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Owl", ":reference", "* Bubo - Clash of the Titans", ":summary", "* Clockwork Owls have excellent vision and make fair spys and messengers. However, they are not at all fast, stealthy, or agile, so some feel that they are far from practical."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Minotaur", ":reference", "* Minoton - Sinbad and the Eye of the Tiger"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Scorpion", ":titles", "Iron Scorpion"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Spider", ":titles", "Iron Spider, Spiderbot"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Clockwork Steed", ":titles", "Iron Horse"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Colour Out of Space", ":image", "cthulhu/unit-colouroutofspace.png", ":reference", "In terms of matter I suppose the thing Ammi described would be called a gas, but this gas obeyed the laws that are not of our cosmos ... This was no breath from the skies whose motions and dimensions our astronomers measure or deem too vast to measure. It was just a colour out of space - a frightful messenger from unformed realms of infinity beyond all Nature as we know it. - The Colour Out of Space"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cthonian", ":image", "Cthulhu/Cthonian.png"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Dead of Night",
        ":summary",
        "* The Night Dead are reanimated corpses of thoses who have died in terror in darkness. They are desperate for light but their darkness powers consume light making normal light sources produce a fraction of their normal illumination. Magical light will expose them and stun them. Bathing in light is the only way to free their spirits and end their torment.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Cold")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Dead of Winter",
        ":reference",
        "* I know what it means to freeze to death, To lose a little life with every breath, To say goodbye to life on earth, And come around again, Lord have mercy on the frozen man - James Taylor, Frozen Man",
        ":summary",
        "* The Frozen Dead are reanimated corpses of thoses who have died by cold or exposure. They are desperate for warmth and seek the living to share an icy embrace. They radiate cold which will douse small fires around them. They are drawn to large heat sources and will happily throw themselves into raging fires. Death by fire is the only way to free their spirits and end their torment.",
        ":titles",
        "The Frigid, Frozen Dead, Frozen Man, Ice Man, Snowman",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Cold")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dhampyr", ":reference", "* A dhampir in Balkan folklore is the child of a vampire father and a human mother, with vampire powers but none of the weaknesses. A dhampir is believed to have the unique ability to see vampires, even when these are invisible, and is unusually adept at killing them.\n** A dhampir is always paid well for his services. The amount of money varies, but there is never bickering over the price. Standard pay for a dhampir may also include a meal or a suit of clothing. Sometimes a dhampir is paid in cattle, jewelry or women.\n** Charlatans traveling the regions around the Carpathian Mountains, Balkans and elsewhere in Eastern Europe would claim to be dhampirs. They were believed to be the only ones who could see the spirit and would put on elaborate shows for villages. Once fear, grief and superstition took hold in a village following a recent death, the dhampir would 'come to the rescue'.\n* Blood: The Last Vampire\n* Vampire Hunter D\n* Blade\n* BloodRayne", ":summary", "* Dhampyrs, can function both day and night, although they find sunlight uncomfortable.\n* Dhampyrs are mortal but can live for centuries. Once mature, they age at roughly 1/10 the rate of humans.\n* They can breed with humans, but not with Kuei-jin or other dhampyrs.\n* They are not dead, so they must breath, eat, drink, and sleep. They may bleed, and they may die.\n* By using [Will], they can perform feats not possible for humans. They can regain [Will] through rest or by eating flesh (usually they cannot by drinking blood).\n* The [Beast] is weaker in a Dhampyr than in their Vampire kin, but this makes their powers weaker as well."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dhole", ":titles", "Bhole", ":summary", "* Huge slimy, worm-like creatures several hundred meters long."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dolphin", ":reference", "Man had always assumed that he was more intelligent than dolphins because he had a achieved so much: the wheel, New York, Wars. Whilst all the dolphins had ever done was muck about in the water having a good time. But conversely, the dolphin thought they were more intelligent than man for precisely same reasonse. - Hitchhikers Guide to the Galaxy"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Donkey",
        ":image",
        "images/cards/unit-donkey.svg",
        ":imgmirror",
        true
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dog", ":image", "images/cards/unit-dog.svg"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Drowned", ":titles", "Drowner, Kappa", ":reference", "* The Ring", ":summary", "* The Drowned are the spirits of those who have died by drowning. They are completely fixated on their drowning death and are compelled to reenact the experience with others."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Duck", ":image", "images/cards/unit-duck.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elder Thing", ":image", "Cthulhu/ElderThing.png", ":reference", "* The toughness of the things was almost incredible. Even the terrific pressure of the deepest sea bottoms appeared powerless to harm them. Very few seemed to die at all except for violence, and their burial places were very limited. - At the Mountains of Madness", ":summary", "* Their metabolism is based on carbon dioxide instead of oxygen; their blood is dark green in color. The nervous system of the Elder Things is quite complex, with five-lobed brains and many ganglial centers. The prismatic cilia on top of the creatures' head suggest that they have senses other than sight, smell, touch, hearing, and taste. Elder Things reproduce through spores. They can derive nourishment from inorganic substances, but prefer to feed on organic life."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Eldruf Grundel", ":summary", "Gnome Thief Illusionist"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Eye Killer",
        ":titles",
        "Beholder, Evil Eye, Eye of the Beholder, Floating Eye, Gazer",
        ":summary",
        "Piercing Gaze - Sees through illusions, invisibility, shapeshifting, and disguises.\n\nWatcher’s Eye – Places a magical eye to spy from afar.\n\nEye of Truth – Dispels lies, glamours, or falsehoods.\n\nForesight Gaze – Grants short-term precognition.\n\nEye of Memory – Reveals a scene from the past.\n\nDead Man's Stare - Induces fear or paralysis.\n\nOmen Eye - Grants the ability to see glimpses of possible futures in chaotic flashes.\n\nEye of Recall - Remembers everything the eye has ever seen; perfect visual memory.\n\nSight Beyond Sight - Perceives places far away as though seen directly; scrying-like ability.\n\nThousandfold Vision - Can view multiple perspectives at once, even through solid objects.\n\n\nMindpierce - Overwhelms the target's thoughts with maddening visions or raw truth.\n\nStare of Submission - Compels obedience or paralysis through unblinking dominance.\n\nWithering Gaze - Saps vitality and weakens defenses with a withering glance.\nWink of the Void - Momentarily erases itself from the vision and memory of others.\n\nHallucin-eye-tion - Induces visual hallucinations; walls become monsters, allies seem enemies.\n\nVeilpiercer - Sees through lies, glamours, and falsehoods of the world.\nBlinkshield - Redirects spells or projectiles aimed at the eye back at their caster.\n\nAllseer - Grants resistance to being surprised or flanked.\n\n",
        ":powermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Animism",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Evil Eye")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Mentalism",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Mind's Eye")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Transmutation",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Petrifying Stare")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Fish: Small", ":image", "images/cards/unit-fish-small.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Flint",
        ":image",
        "images/fantasy/Flint.png",
        ":summary",
        "Half-Elven Thief",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Stealth",
            9,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Backstab")
          )
        )
      ),
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
            "Tradeskill",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "House Painting")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Communication",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Elvish")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Flying Polyp", ":summary", "* The flying polyps came to Earth from space as conquerors about 750 million years ago. They built basalt cities with high windowless towers. When they attempted to colonize the oceans, the polyps were driven back by the Elder Things. Thereafter, they restricted their habitats to the surface world.\n    * Their senses did not include sight, but what senses they had could penetrate all material obstructions. They were only partially matter, but still solid enough to affect and be stopped by normal materials; this additionally gave them resistance, if not outright invulnerability, to normal means of damage, though they could be destroyed by certain forms of electrical energy. Their minds were so strange that the Great Race of Yith could not perform psychic transfers with them.\n    * They are able to levitate and fly despite lacking any visible means of doing so, and leave telltale massive footprints when on the ground. Their amorphous bodies can turn invisible at will, though this ability appears somewhat negated by whistling noises associated with them in general. In battle, their ability to control and direct powerful winds is put to use as a weapon.\n    * When the Great Race of Yith came to Earth, they warred with the polyps and soon drove them underground with their advanced technology. The Great Race then sealed the entryways to the polyps' subterranean abode with trapdoors, which afterwards were diligently guarded. The polyps' cities were left abandoned, perhaps as a reminder of the horrors that dwelt below.\n    * Eventually, the polyps rose up and almost exterminated the Great Race, afterwards returning to their subterranean haunts. Having no conception of light, the polyps seem content to remain there, annihilating the few intruders that chance upon them. The entrances to their dwellings are mostly deep within ancient ruins where there are great wells sealed over with stone."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Galamir Mirlesem",
        ":image",
        "images/fantasy/GalamirMirlesem.png",
        ":demeanor",
        "Imperious",
        ":nature",
        "Self-Absorbed",
        ":summary",
        "* Human Mage\n* Personality - Galamir is a brilliant Wizard and strategist, but he is impatient with others and has no respect for politics or idle chit-chat.\n* History - Galamir was born to Chantry trainers, and as a child he was allowed special access to the arcane academy. As a teen, he became obsessed with magic and its effect on the world. His brilliance and magical aptitude were soon recognized and he was accepted into the academy. For the next 25 years he completed his full wizardry and elemental training and received top honors. He was a logical 	candidate to become a trainer himself, but he was bored of the cloistered life, so he began visiting other Chantries across the world. Along the way he encountered a naive, young half-elf rogue named Phirax living on a simple farm. Galamir recruited Phirax to join him to perform the more dangerous and mundane tasks while Galamir provided the leadership and strategy. Later, he recruited the Warrior Stam and the Cleric Sarak into their party to rounded out their abilities.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Wizardry", 11)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ghost Ship", ":titles", "Chaos Fleet, Skeleton Crew", ":reference", "* Pirates of the Caribbean\n* The Fog\n* Pyaray - Elric of Melnibone", ":summary", "* Ghost Ships are doomed ships crewed by the [Drowned]. When they encounter the living, they are compelled to kill them so they raise again to add to their crew."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Ghoul",
        ":summary",
        "* Description - A ghoul is a reanimated corpse that perpetuates its undead existence by feeding on the the dead. They reek of charnel pits and they have shrivelled nightmarish features. Though frail and unhealthy looking, they possess fearsome strength. The teeth and claws also carry [Corpse Rot], an infection that slowly kills the victim if the Ghoul doesn't first. Victims of Ghouls often raise as Ghouls themselves if they are not cured or their corpse is not blessed or destroyed.\n* Personality - When well fed, Ghouls can communicate and can be surprisingly friendly though their intelligence is low and their interests are narrow (i.e. searching for corpses).\n* Japanese Gaki appear as gaunt-faced monsters with enormous, frog-like mouths and grossly distended bellies.\n* Morale - High\n* Units - Mob",
        ":titles",
        "Gaki, Ghul, Hungry Dead, Necrophage",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Beastial", 3),
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Digging",
            3,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Tunneling")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Special Ability",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Cannibal", "Prey", "Savage", "Undead")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Gnoll Axeman",
        ":image",
        "images/bestiary/Gnoll_Axeman.png",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_items(
            tactics,
            "Melee",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Pike")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Gnoll Pikeman",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_items(
            tactics,
            "Melee",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Pike")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Gnoll Skirmisher",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_abilities(
            tactics,
            "Hunting",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Scouting")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Goat", ":image", "images/cards/unit-goat.svg", ":body", "5x1", ":mass", "50kg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Goblin Raider",
        ":image",
        "images/cards/unit-goblin-raider.svg",
        ":summary",
        "* [Role: Attacker]",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Spear: Short", "Knife: Dagger")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Goblin Scout",
        ":image",
        "images/cards/unit-goblin-scout.svg",
        ":reference",
        "* The only information I will let them have is that their scouts are not coming back. This will be their grave. - Goblin Slayer",
        ":demeanor",
        "Depraved",
        ":nature",
        "Cowardly Envious",
        ":conscience",
        "2x1",
        ":beast",
        "2x0",
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
        "2x0",
        ":mass",
        "22kg/50lb",
        ":height",
        "1m/3ft",
        ":summary",
        "* [Role: Skirmisher]",
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
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Goblin Spider", ":summary", "* Traditional Japanese folk-lore understood that goblin-spiders had the power to transform from ordinary spiders to assume the form of men when night fell."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Goose", ":image", "images/cards/unit-goose.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Gorgon",
        ":image",
        "images/bestiary/Medusa.png",
        ":titles",
        "Medusa",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Transmutation",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Petrifying Stare")
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_items(
            tactics,
            "Ranged",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bow: Short")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Great Race of Yith", ":image", "cthulhu/unit-greatraceofyith.png"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Greek Cavalry",
        ":reference",
        "The utility of the Greek Citizen Cavalry was small on account of their heavy armor.",
        ":classification",
        "Hvy. Cavalry",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Military", 3)
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Haunt", ":reference", "* The Sixth Sense\n* Beetlejuice", ":summary", "* Haunts are lesser undead that remain near the places and people from their living life instead of moving on. Haunts attempt to interact with the living to maintain a semblance of their former lives. Haunts are generally not malicious, but their interactions inadvertently drain the [Will] of others over time. There are also cases of Haunts who impersonate loved ones to purposely drain their [Will]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbear"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellboar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbull"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Herbalist", ":image", "images/cards/unit-herbalist.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Hetman Undrig",
        ":summary",
        "* Orc Assassin\n* A pragmatic, hardened survivalist who began his career as a lowly militia man in the Orc Army who would later form the infamous mercenary guild, the Blackguard.\n* Personality - Hetman is noteworthy for his lack of personal pride or conscience. He dislikes authority.  He strongly believes the ends justify the means and has no compunction about using any means available.\n* The Blackguard - When establishing the Blackguard, he insisted that it should never have a central authority and that all decisions were made by popular vote.",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Melee",
            5,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Sword: Long", "Knife: Dagger")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hidden", ":image", "images/cards/unit-hidden.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hollow Man", ":reference", "* They're good for us. They kill the bad things inside us...What you're supposed to do is eat it. You eat as much as you can and you keep eating it. - The Stuff", ":summary", "* A person infested by parasites, insects, or small animals.  The hapless victim has become completely hollowed out by its unwanted tenants, but is somehow still alive.  The Hollow Man is desolate, immobile, and empty without the possessing colony, but they are poor company at best."),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hound of Tindalos", ":image", "cthulhu/unit-houndoftindalos.png", ":reference", "* All the evil in the universe was concentrated in their lean, hungry bodies. Or had they bodies? I saw them only for a moment, I cannot be certain. - Frank Belknap Long, The Hounds of Tindalos", ":summary", "* The Hounds of Tindalos dwell in the distant past of the earth, when normal life had not yet advanced past one-celled animals. They are said to inhabit the angles of time, while other beings descend from curves. The Hounds are thought to be immortal and are believed to lust after something in humankind and other normal life, and will follow victims through time and space to get it.\n    * Their appearance is unknown because no characters who meet them survive long enough to give a description. It is said that they have long, hollow tongues or proboscis to drain victims' body-fluids, and that they excrete a strange blue pus or ichor.\n    * Though the Hounds are sometimes pictured as canine, it is not likely that they appear as such. Their name refers more to the creatures' habits than their appearance.\n    * Because of their relationship with the angles of time, they can materialize through any corner if it is fairly sharp—120 degress or less. When a Hound is about to appear, it materializes first as smoke pouring from the corner, and finally the head emerges followed by the body. It is said that once a human becomes known to one of these creatures, a Hound of Tindalos will pursue the victim through anything to reach its quarry. A person risks attracting their attention by travelling through time."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hunting Horror", ":image", "cthulhu/huntingHorror.png"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Husk", ":summary", "A person who has been completely drained of their lifeforce."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hydro Essence", ":summary", "* A mindless, condensed blob of Hydro energy.\n* Since slimes store magical energy they are highly sought after by mages and alchemists.", ":titles", "Hydro Slime, Hydrolon, Water Slime"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Innkeeper", ":image", "images/cards/unit-innkeeper.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Jabba the Hutt", ":image", "images/starwars/unit-jabbathehutt.png"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Jaris Ransun",
        ":image",
        "images/fantasy/Ransun.png",
        ":summary",
        "Human Hunter",
        ":titles",
        "Valen the Hunter",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Defense",
            5,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Armor: Chain Mail", "Shield: Round")
          )
        )
      ),
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
            "Tradeskill",
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lemure", ":titles", "Larvae, Lemur", ":summary", "* The wandering and vengeful spirits of those not afforded proper burial or funeral rites."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Leopard",
        ":titles",
        "Panther, King Leopard - a [Large] Leopard with distinctive patterns of spots.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Beastial",
            4,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Neck Bite", "Pounce")
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Survival",
            3,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Survival: Jungle")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Lich",
        ":image",
        "images/bestiary/Lich.png",
        ":titles",
        "Liche, Lych, Lyche, Lyke",
        ":reference",
        "* His eyes turn unshutting, unblinking... Thus have I beheld him for the space of a whole year and a month... And never have I discerned the least movement of his lips, nor any turning or tremor of his body. For these reasons, I deem that Malygris is dead, but by virtue of his supremacy in evil and in art magical, he sits defying the worm, still undecayed an incorrupt. And his monsters and familiars attend him still. - The Death of Malygris, Clark Ashton Smith",
        ":summary",
        "* A lich is a powerful animated corpse created by [Necromancy] through the use of [Lich Form]. The necromaner curses itself to a horrific undead existence in exchange for eternal 'life'. The lich retains most of the abilities of its former life and gains some additional undead powers as well.\n* Because of their solitary nature, a lich cannot gain social skills nor increase their existing skills. Further these skills have a tendency to degrade the longer the lich exists.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Beastial", "Necromancy")
      ),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lion"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lost Soul"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Mi-Go", ":image", "cthulhu/unit-migo.png", ":titles", "Fungi from Yuggoth", ":reference", "* Fact: Migoi or Mi-go (pronounced mey-goo) is a Tibetan name for the Yeti and translates as 'wild man'.", ":summary", "* Mi-go are an alien race of fungus-like creatures, approximately man-sized, pinkish in color, with crustaceous bodies bearing vast pairs of membranous wings and several sets of articulate limbs. The Mi-Go have a sort of convoluted ellipsoid where its head should be, covered with a multitude of very short antennae.\n    * They have a colony on Pluto (i.e. Yuggoth) and have mining colonies in high mountains looking for rare minerals.\n    * The Mi-go are not wholly native to our phyical universe. Thus, they cannot eat food from Earth, and photographs of them are blurry and indistinct. They can also fly unassisted through interstellar space at fantastic speeds. They dissolve shortly after death.\n    * They are unaccustomed to light which confuses them.\n    * They seem to be highly focused on their scientific pursuits and are most often encountered in search of obscure minerals in remote places. Trespassers are usually eliminated, though they have been known to have human agents work on their behalf.\n    * Mi-go have access to a number of advanced weapons. The mist projector releases a cloud of frigid gas. They have an organic 'armor' that humans can use, but it is extremely sticky and will damage the user each time it is removed. The armor will also weaken each day unless immersed in the proper nutrient bath.\n    * The Mi-Go are advanced in the sphere of surgery. With surgical alterations the Mi-Go are able to speak human languages, though their voice is buzzy and irritating. They can also surgically move the brain of other species into metal cylinders for transportation to other worlds through space.\n    * Essentially a space fungus, the crablike form we're accustom to is actually a pressure suit that allows them to walk around, speak and fly in Earth's atmosphere. They grow their 'bodies' likes coral and can form appendages to anything they require - wings, arms, shells. Each of these shells is alive and using grafting, they can switch out limbs as needed. The discarded limbs are kept alive like potted plants until they are needed again.\n    * They are alien extremophiles, perfectly suited for deep space travel. They don't require air to breathe, are capable of periods of hibernation lasting hundreds of thousands of years, feed off minerals and cosmic radiation, using something like photosynthesis to make food.\n    * They procreate by budding, a form of cloning, to make copies of the older, mature individuals and use spores to create their workforce - bred to labor and die in the mines. They can bore deep into the mantel of worlds, and as they don't require air to breath and can survive incredible heat, cold and pressure, they can just keep going deeper while most species would die in moments.\n    * They communicate and see via radiation, the flowerlike sensory organ we view as their head, emits and receives radioactive wavelengths, allowing them to see through walls and for miles clearly as they have no eyes to focus. They can see the background radiation of the universe and use it to travel with precision between stars. This also means they can see the elemental make up of asteroids and planets just by looking at them.", ":body", "6x1", ":mass", "60kg/130lb", ":height", "1.5m/5ft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Mirror Reflection", ":summary", "* A Mirror Reflection is being from the Mirrorlands that has no personal definition but longs for the definition of others. To this end, they become a mirror image of another being and try to impersonate the person though they lack any memories of the original. It would be practical to dispose of the original, but they are always only a reflection so they would die as well."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Mirror Shard", ":summary", "* A Mirror Shard is a weaker form of a [Mirror Reflection]. It copies some single aspect of the original but is otherwise an empty shell. This incompleteness drives them mad with desperation. They are always drawn to the those they copy and are usually irrationally destructive.\n* [Action] [Target]: The Mirror Shard becomes the same [Mass] as the target. Then choose one [Skill] or [Power] to copy. The Mirror Shard gains that Skill/Power and loses all other Skills and Powers. It [Body], [Mind], and [Will] are altered accordingly."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Mummy",
        ":reference",
        "The Mummy",
        ":summary",
        "* Created by Ancient Arcane ritual, Mummies are extremely powerful and exceptionally difficult to destroy.\n* Mummies regain Spirit by sucking the life from their victims through thier mouths, leaving only a descicated husk.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Longevity",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Reanimation")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Naga Chieftan", ":traits", "Naga"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Naga Enforcer", ":traits", "Naga"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Naga Hunter", ":traits", "Naga"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Naiad", ":titles", "Nereid, Nyad"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Night Terror", ":titles", "Night Hag", ":reference", "* A night terror is a sleep disorder characterized by extreme terror and a temporary inability to regain full consciousness. The subject wakes abruptly usually accompanied by gasping, moaning, or screaming.  It is often impossible to fully awaken the person, and after the episode the subject normally settles back to sleep without waking.\n* Night terrors are distinct from nightmares in several key ways. First, the subject is not fully awake when roused, and even when efforts are made to awaken the sleeper, he/she may continue to experience the night terror for ten to twenty minutes. Unlike nightmares, which occur during REM sleep, night terrors occur during slow-wave sleep, the deepest levels of non-REM sleep. Even if awakened, the subject often cannot remember the episode except for a sense of panic, while nightmares usually can be easily recalled. The subject often has no recollection of the incident.\n* Unlike nightmares, which are frequently dreams of a frightening nature, night terrors are not dreams. Usually there is no situation or event (scary or otherwise) that is dreamt, but rather the emotion of fear itself is felt. The lack of a dream itself leaves those awakened from a night terror in a state of disorientation much more severe than that caused by a normal nightmare. This can include a short period of amnesia during which the subjects may be unable to recall their names, locations, ages, or any other identifying features of themselves.\n* Children from age two to six are most prone to night terrors, and they affect about fifteen percent of all children.", ":summary", "* Evil women who died in childbirth and now returned to slay children.\n* By day it may take the form of a shriveled old woman. At night it becomes a horrific corpse-like creature. In this form it sneaks into houses and sucks the breath from the lips of children, leaving them cold and lifeless.\n* It can only enter a house into which it has been invited, so during the day it poses as a woeful traveler to gain admittance to houses where babies live.\n* Night Terrors, being exclusively female, can only reproduce by mating with a male member of another species. The hag often slays her mate. The child born looks like a normal member of her species with black or blue hair and is often given into foster care by the hag disguised as a normal woman. When the young girl reaches puberty, the mother Night Hag might visit the child several times and, after several rituals, transforms her offspring into another hag."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nightmare", ":titles", "Shadowmane", ":traits", "Devil"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Normality",
        ":titles",
        "Normals",
        ":reference",
        "Hate Crimes",
        ":summary",
        "* Normalities are ghastly creatures that were once human but have been transformed into blank, sexless horrors. All Normalities appear exactly identical: thin, sexless, hairless, and faceless except for a slash of a mouth. With heavy clothing they may briefly pass for human.\n* Personality - Normalities have a hatred of all things different (which includes everything except themselves). They are homicidal with a particulary strong reaction to those who choose to flaunt their differences (e.g. piercings, tattoos, goths, punkers, women wearing pants)\n* History - The Normalities are created as part of a horrific treatment that pretends to be a cure for homosexuality. Indeed, the treatment does cure homosexuality, as well as any sexuality and finally humanity.",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Hunting")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nyarlathotep", ":image", "images/cards/unit-nyarlathotep.png", ":titles", "The Crawling Chaos", ":reference", "Nyarlathotep is nothing like the other Other Gods. He travels by his own laws, into and out of the known cosmos, acting as a messenger to and from the Other Gods. His strange personality, or perhaps the simple fact that he has a personality, baffles them. ... To lesser intelligences, he's a trickster, malevolent and cruel, bequeathing gifts of wisdom and power to those who seek it, and whom he knows cannot handle it. Where Nyarlathotep goes, madness follows. He is the Crawling Chaos, and as the only direct offspring of Azathoth, he revels in it. To Lovecraft, Nyarlathotep must have been a perfect manisfestation of his racism and xenophobia. He is not only the outside seeping in, but a malevolent, undetectable outside seeping in. - Tale Foundry", ":summary", "* Like the other Other Gods, Nyarlathotep is a primal being of unimaginable power. Unlike the others, however, his power is knowledge and Nyarlathotep may be a creature entirely of the mind. Though he typically appears as a man, he has innumerable other forms and may be able to appear in any form he wishes. He seens to specifically target and toy with humanity by offering dangerous knowledge and observing the results. This is probably an overly simplistic view of his actions. Like the other Other Gods, he is too grand a figure to care about humanity. More likely, he acts like Yog-Sothoth and simply appears as an avatar and provides Knowledge to those who seek him without regard to what we do with it. In this way, Nyarlathotep is like Prometheus providing fire to humanity. It is possible that Nyarlathotep is constantly offering knowledge, but we are generally unable to recognize it. Perhaps Nyarlathotep is the Muse behind all discoveries."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Odin",
        ":image",
        "Superheroes/Odin.png",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Longevity",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Eternal Youth")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ogre", ":image", "images/cards/unit-ogre.svg", ":reference", "* You small. Me big. - Tarzak the Tribeless, Runeterra", ":summary", "* Gluttony, Wrath\n* Preferred Skills - Close Combat, Hunting\n* Morale - Low\n* Units - Elite Heavy Infantry (Note: Full units are very rare)\n* Description - Ogres appear as huge, overweight, hairless humanoids.\n* Personality - Ogres are perpetually hungry. However, they are limited by their extremely low intelligence and short tempers.", ":body", "3x2", ":mind", "3x1", ":will", "3x1", ":mass", "300kg", ":height", "3m"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Ox",
        ":image",
        "images/cards/unit-ox.svg",
        ":imgmirror",
        true
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pestilence Horse", ":summary", "* A Pestience Horse is a zombie horse that carries deadly diseases. It's decaying body is not as fast as its original body, but may still trot fairly quickly. It is not as agressive as other undead, instead travelling around spreading disease and fleeing when confronted."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Force"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Mount"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Monster"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantasmal Warrior"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phantom", ":summary", "* Phantoms are the remnants of those who were lost in the Astral/Dream Realm. The Astral Realm is the realm of imagination, so those trapped here are gradually driven mad. Therefore, Phantoms have varying and unpredictable insanities."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pheasant", ":image", "images/cards/unit-pheasant.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Phirax Alganon",
        ":image",
        "images/fantasy/PhiraxAlganon.png",
        ":demeanor",
        "Personable",
        ":nature",
        "Self Righteous",
        ":summary",
        "* Half-Elven Bard\n* Personality - Phirax is an entertaining, friendly, perceptive person who is very focused on 'the now'. He applies all his attention to the current situation and the people around him which gives him a keen eye for detail, deception, and subtle clues of human behavior. He strongly believes he is on the right path in life and has developed very strong emotional confidence which lets him roll with the whatever comes his way. He appreciates plans and planners, but he feels that plans must always be flexible because they rarely predict a situation accurately.\n* Beliefs - Phirax believes that improving the lives of those around him will also improves his own life. He sees this as selfishness through selflessness, therefore it is always in his own interest to help others. He could easily manipulate those around him, but he abhors the idea of exploiting others and is quick to judge abusers of any kind. He follows the lesser god Seker on his mission to destroy undead, specifically those who feed on or otherwise exploit the living (which is pretty much all of them).\n* History - Phirax was born into a large family on a farm bordering the Arden Forest. During the day, he learned diverse combat and survival skills with the Elves of the forest. At night he practiced various social skills at the human tavern. He was planning to set out on his own soon when he encountered a rather awkward and self-important Wizard named Galamir. After he confirmed the Wizard's abilities, he agreed to join him as a pair of traveling adventurers. Soon after, the pair teamed up with a Warrior and a Cleric. With the party complete, they set out for danger and treasure.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Empathy",
            12,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Demoralize")
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Stealth",
            9,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Backstab", "Sneak")
          ),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities_items(
            tactics,
            "Performance",
            9,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Inspire"),
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Lute")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pig", ":image", "images/cards/unit-pig.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pig: Wild Boar", ":image", "images/cards/unit-pig-wildboar.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pilgrim", ":image", "images/cards/unit-pilgrim.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pit Fiend", ":titles", "Balrog, Fiend, Lord of the Pit", ":traits", "Devil"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Plough",
        ":image",
        "images/cards/unit-plough.svg",
        ":imgmirror",
        true
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Poltergeist"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Pooka",
        ":summary",
        "* Overview - Pooka are trickster shapeshifters. They are scoundrels and are perhaps the most charming and congenial of the Fae. Extremely lazy, Pooka hate work and love to play. Though generally well-intentioned, they are deceitful, devious, and more than a little goofy. Mundaneness disturbs them, and they have a particular fear of Banality.\n* Empathy - Though they seem immature, they are capable of great sadness and empathy, which they try to assuage by telling jokes and playing pranks. Lack of humor mystifies them and usually drives them to 'cheer up' their quarry with more manic pranks. Naturally, Unseelie pranks tend to be sick and twisted. For all their mischief, they have a strong sense of nobility and are loyal to friends and courageous in battle.\n* Deceitful - Truth is boring to Pooka, so they will pepper it with lies to make it more interesting. 	Because of their trickster nature, they are actually unable to tell a completely true statement. Though pookas never tell the entire truth, they also never lie completely which is crass and banal. Partially truths and partial lies are what pookas enjoy.\n* Manipulating - Pooka are masters of manipulation. While their actions appear random and sometimes comical, events seem to play out toward their grand designs.\n* Unpredictable - Pooka are never one thing. They are usually calm and humorous, but they are very capable of being cunning and cruel and can change moods in an instant.\n* Limited Shapechange - A pooka naturally has an animal form but may change to human form when no one is watching. They may stay in either form indefinitely with no effort, but a part of them always hints at their true nature. Sometimes a tail or fur remains. Sometimes hair can appear like long ears. Sometimes they hide a large animal tattoo.\n* Tails - Powerful Pooka have additional tails. The most powerful have nine. They start with 1 tail at level 1 and gain a tail every odd level up to 9 tails at level 17.\n* Illusion - Pooka are practiced illusionists and love using illusions for pranks and generally harmless fun. Consistent with their nature, Pooka illusions always have some truth mixed with lies. Their illusions always have hidden flaws that the Pooka purposely addes for their own entertainment.\n* Traps -",
        ":titles",
        "Badger, Fox Spirit, Kitsune, Inari, Nine-tailed Fox, Tanuki, Youko",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(
          tactics,
          vx_core.f_new({"any-1": vx_core.t_stringlist}, "Illusion")
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(
          tactics,
          vx_core.f_new({"any-1": vx_core.t_stringlist}, "Persuasion")
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Primal Ooze", ":titles", "Blob, Slime Beast"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rat", ":body", "5x-1", ":mass", ".5kg/1lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rat: Giant", ":reference", "* What about the R.O.U.S.'s? Rodents Of Unusual Size? I don't think they exist. Raghh! - Westley, Buttercup, and ROUS - The Princess Bride", ":body", "5x1", ":speed", "6x1", ":mass", "50kg/100lb", ":landspeed", "60kph/40mph"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rat: Huge", ":body", "5x0", ":mass", "5kg/10lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Reaper", ":reference", "Charon the Ferryman", ":summary", "* Reapers are dark, hooded entities that are terrifying to behold. Their arms are skeletal though though the rest of their bodies appear to be made of solid blackess. They carry large scythes which they can use to deadly effect. Their purpose appears to be to escort the sould of the recently dead to the afterlife, and their presense almost always means someone has died or will die soon."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rukh", ":titles", "Roc", ":reference", "* Rukh Egg - Magic the Gathering\n* Sindbad observed that when a karkadann spears an elephant on its horn, the elephant’s fat runs into the rhino’s eyes and blinds it; a rukh will then swoop down and carry both combatants off to feed its chicks.", ":summary", "* Appearance - Rukhs are monstrously large birds vaguely similar in a appearance to a vulture.\n    * Feeding - Rukhs are uncontested predators capable of feeding on the largest and most dangerous land animals. They have a particular fondness for giant serpents, elephants, and karkadanns or rhinoceroses.\n    * Intelligence - Rukhs also appear to have some degree of intelligence, using boulders to smash prey."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rukh Hatchling"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Sarak Ishimar",
        ":image",
        "images/fantasy/SarakIshimar.png",
        ":summary",
        "Human Cleric",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Invocation", 10)
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Melee", 8),
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Faith", 8)
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Sarani Kalea",
        ":summary",
        "Human Priestess",
        ":titles",
        "Princess Kalea, High Priestess of Kali",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Conviction", 12),
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Invocation",
            16,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Aspecting")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Scarecrow", ":titles", "Dullahan", ":reference", "* Headless Horseman\n* Great Pumpkin\n* Jack O' Lantern\n* Pumpkin King", ":summary", "* A scarecrow is a humanoid mass of twigs, straw, and old clothes that has been animated by an undead spirit. Some are actual scarecrows that have been possessed; others form out of pumpkin patches on moonless nights. Scarecrows hate all living things, but wish to do more than kill. They desire to frighten living beings as much as possible. A scarecrow can be created when someone calls for vengeance before their death. Sometimes they are killed by brigands, other times they starves to death because of blight or drought. The scarecrow then haunts the place of death, not ranging more than a mile from it. Sometimes entire families become scarecrows, and the victims of scarecrows occasionally join the haunting as well. Simply killing the body is not enough to end its haunting, as it reappears from another pumpkin on the next moonless night. To finally destroy a scarecrow, every scrap of every body must be burned, as well as any pumpkins or pumpkin vines. The land must then be tilled and planted with a new crop. Only then are the spirits forced to give up their vengeance and give up the mortal coil.\n* Scarecrows prefer to play with their prey, sneaking up on them and attempting to terrify them.  Scarecrows fight without regard to their own safety, as they know they are likely to return on another night if destroyed."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sea Elephant"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sea Lion"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Seal"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Senturion", ":titles", "Mech Man", ":summary", "* Senturion is a highly advanced, alien construct with the thought patterns of a human super-imposed upon his programming. He originally believed that he was a young man who could transform into a robot, but he has since learned that his actual body died long ago and that his personality is just an artificial duplicate. After this discovery, his humanity has gradually diminished over time.\n* Synthetic - Senturion does not need to eat, sleep or breathe. He is composed of molecular machines that twist and wrap in layers of ceramic wire filaments. These multipurpose filaments reconfigure into different forms to heal or create custom weapons. These filaments must always remain connected to the main body or they self-destruct to maintain their secrets. If Senturion loses a limb, the resulting explosion can cause significant damage.\n* Body - He has tremendous strength and endurance and can withstand extreme temperatures, pressures, and the vacuum of space. His body is very flexible, and he can contort himself to escape confinement of fit through small gaps.\n* Mind - His computer brain greatly increases his ability to quickly process information and create complex strategies.\n* Speed - Senturion moves and reacts with lightning speed and precision. He can run at 80mph and can briefly run on walls. His graceful movements belie his great strength and significant weight.\n* Leaping - Senturion can jump 40ft in the air.\n* Eyes - Senturion's eyes can emit tight-beam lasers or a white sheet of explosive energy. He can sense electromagnetic radiation (including infrared and ultraviolet). He also possesses telescopic and microscopic vision.\n* Transformation - As Mech-Man he was able to transform from a human-like form to his mechanical form. He has since lost this ability (and a great deal of his human personality). As Senturion he has refined this power to produce specialized weapons like blades and spikes.\n* Healing - Senturion's android body rapidly repairs itself.\n* Filaments - In close combat, filaments can emerge from its body which can scramble or override electrical devices on contact.\n* History - Senturion was designed as one of a multitude of multi-purpose exploratory probes. Their natural form is a squirming mass of pale filaments. These probes were packed into artificial comets and launched in all directions from their homeworld. To protect their designers, they possess no memory of their origin or ultimate purpose. Many of these probes have landed on all planets in the solar system and millions more are littered across the galaxy. Most were buried underground by their impact and there they lie dormant. The ones on the surface seek a power source to fuel their growth and adaptation to their environment. They absorb light, heat, electricity or other radiation. When fully charged, they quietly begin exploring and analyzing their environment for possible resources and threats. If the planet is lifeless, they will catalog the available resources and begin creating more identical probes. If the planet is inhabited, they will wait and study the local wildlife until they are confident that they can completely mimic a sample of the apex species. Then they will begin to blend into the local society to learn everything they can. When their analysis no longer produces significant results, they begin to create more probes. Though they are unaware of their creator or purpose, they continue to catalog and expand. Eventually, their data network reaches back to their creators who collect this massive treasure trove of data.", ":body", "3x2", ":mass", "300kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shade", ":titles", "Aghast, Ghast, Ghastly, Shoryo", ":reference", "The Ring", ":summary", "* Description - lank and ghastly beings with no feet, floating suspended above the ground.\n* Shades are the spirits of those who died in suicide, accident, murder, or wrongful execution. They are bound to this plane by the anger they felt at their deaths.\n* Suicide and accident victims attempt to compel those most like their former selves to die in the same manner.\n* Murder and wrongful death victims attempt to revenge themselves upon the killer or his descendents."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shadow"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sheep", ":image", "images/cards/unit-sheep.svg", ":body", "8x1", ":mass", "80kg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shoggoth", ":image", "Cthulhu/Shoggoth.png", ":reference", "* This was the dream in which I saw a shoggoth for the first time, and the sight set me awake in a frenzy of screaming. - The Shadow Over Innsmouth", ":summary", "* Enormous beings who would measure some fifteen feet across if they formed their bodies into a sphere, Shoggoths are amorphous creatures composed of a malleable protoplasm, something akin to a colossal amoeba. They are capable of forming whatever organs or appendages they require for the task at hand, although their usual state is a writhing mass of eyes, mouths and wriggling tentacles.", ":body", "5x4", ":mass", "50tons", ":height", "4.5m/15ft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shub-Niggurath", ":image", "cthulhu/shubniggurath.png", ":titles", "The Black Goat of the Woods with a Thousand Young", ":reference", "Imagine a roiling, miasmic mass of twisting tendrils and drooling mouths, so tenuous in composition that its limbs vanish as quickly as they materialize, its very form dividing constantly into a surplus of smaller abominations that are either reabsorbed into its great form, or that escape to some hideous life elsewhere. Not the spitting image of a fertility goddess but this is as close as the mythos gets. Shub-Niggurath may well be the most widely revered amoung the other gods, infuence reaching not only to the Greeks, Cretans, Egyptions, and some druids, but to races so far-flung across the cosmos as the Mi-go of Yuggoth, and the Dhole and Nug-Soth of Yaddith. ... Usually the creation of new life, especially intelligent life, is held as a sacred act. Many humans derive joy and self-import from the notion that their kind was toild over by some kind of divine intelligence. Shub-Niggurath with her blind, indifferent, prolific procreation, undermines this idea. ... Shub-Niggurath was Lovecraft's affirmation that life itself is nothing extrodinary. - Tale Foundry", ":summary", "* Mother's Gift - The milk of Shub-Niggurath with powerful healing and corrupting properties."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Skeletal Dragon"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Skeletal Knight",
        ":summary",
        "* Morale - High",
        ":titles",
        "Death Knight",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Savage", "Skeletal", "Undead")
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Riding")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Skeleton",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Mindless", "Savage", "Skeletal", "Undead")
          )
        ),
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Defense",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Shield: Round")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Skeleton Warrior",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Mindless", "Savage", "Skeletal", "Undead")
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Defense",
            3,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Armor: Breast Plate", "Shield: Round")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Slave 1", ":image", "images/starwars/unit-slave1.png", ":titles", "Firespray-31", ":classification", "Med. Spacecraft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Slayer Dead", ":titles", "Murderous Dead, War Dead", ":reference", "* Jason Voorhees\n* Nightmare on Elm Street\n* Vinland Saga", ":summary", "* Slayer Dead are the spirits of those who have lived and died a life of killing. They are completely fixated on killing others in the same way they killed in life. Most were warriors who revelled in slaughter. Some were serial killers. Large numbers of them can appear when battles are fought near Ley Lines."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sluagh", ":reference", "* The spirits of the sinners, or generally evil people who were welcome in neither heaven nor hell.\n* They were seen to fly in groups like flocks of birds, coming from the west, and were known to try to enter the house of a dying person in an effort to carry the soul away with them. West-facing windows were sometimes kept closed to keep them out. Some consider the Sluagh to also carry with them the souls of innocent people who were kidnapped by these destructive spirits.", ":summary", "* The Sluagh are thin, pale, snake-like, and grotesque, though they remain strangely compelling. They favor archaic, intricate, black clothing. Their joints can dislocate allowing them to slither our of bonds and into disquieting shapes.\n* They may only speak in whispers and dislike any social situations except among their own kind. They prefer to overserve other from hidden corners, and the secrets they obtain are their stock and trade."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Snake: Anaconda",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Beastial",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Swallow Whole")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Asp", ":reference", "Asps. Very dangerous. You go first. - Raiders of the Lost Ark"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Black Mamba", ":summary", "* The black mamba receives its name from the black coloration inside of its mouth, rather than their skin color which is a gray to olive tone. The black mamba is the fastest moving snake in the world, capable of moving up to 20 km/h(12.5 mph). However it uses this speed to evade danger, rather than catch prey.\n* Black mambas are among the ten most venomous snakes in the world. A single bite may inject enough venom to kill from 20-40 grown men. When cornered, they will readily attack. In fact, many snake experts have cited the black mamba as the world's most aggressive snake, noting tendency to actively attack without provocation. When warding off a threat, the black mamba usually delivers multiple strikes, injecting its potent neuro-and cardiotoxin with each strike, often attacking the body or head, unlike most other snakes.\n* Black mambas tend to live in their lairs for long periods of time, which are often vacated insect mounds or hollow trees. Black mambas are diurnal snakes that hunt prey actively day or night.\n* The black mamba is more than 3 times as venomous as the Cape Cobra, over 5 times as venomous as the King cobra and about 40 times as venomous as the Gaboon viper. Black mamba venom contains powerful, rapid-acting neurotoxins and cardiotoxins. The initial symptom of the bite is local pain in the bite area, although not as severe as snakes with hemotoxins. The victim then experiences a tingling sensation in the extremities, drooping eyelids, tunnel vision, sweating, excessive salivation, and lack of muscle control (specifically the mouth and tongue). If the victim does not receive medical attention, symptoms rapidly progress to nausea, shortness of breath, confusion, and paralysis. Eventually, the victim experiences convulsions, respiratory failure, and coma, and dies due to suffocation resulting from paralysis of the muscles used for breathing. Without treatment the mortality rate is 100%, the highest among all venomous snakes in the world."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Boa Constrictor"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Cobra"),
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
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_rating_abilities(
            tactics,
            "Toxins",
            2,
            "2x2",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Poison Bite")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: King Cobra"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Python"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Snake: Viper"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spectral Horse"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spectre", ":reference", "* Cenobites from Hellraiser", ":summary", "* A Spectre is a malevolent Wraith that has been so traumatized that it is has become completely obscessed with its suffering and reenacting that suffering with others. The Spectre has fallen completely under the controlled of it's [Shadow]."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spectrum", ":image", "Superheroes/Vector.png", ":titles", "Alan Lietner, Shard, Vector", ":summary", "* Spectrum appears in glowing, angular, mirrored armor with a mirrored visor. The armor augments his strength to lift 800lbs. He can materialize angular blades and shields from his arms. He can also create glowing shards in different forms including a flying triangular plate, throwing knives, barriers, and cages.\n* Spectrum's armor is powered by light and the area will visibly darken when his powers are active. In a completely dark area, his powers are greatly diminished. Conversely, very bright light increases his power level. For this reason, he usually acts only in daylight.\n* Dr. Alex Lietner is an MIT physicist reseaching the creation of holograms with lasers. He discovered that through precise modulation, a hologram could temporarily be turned into an extremely rigid solid. With the help of some of his students, he was able to create a portable projection system in a wearable suit.\n* Blinding Flash - Intense light burst similar to a flash bomb.\n* Blinding Torrent - A dizzying kaleidoscope of intense light that causes vertigo and nausea."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sphinx", ":image", "images/cards/unit-sphinx.svg", ":summary", "* Highly intelligent"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Stam Domindor",
        ":image",
        "images/fantasy/Stam.png",
        ":summary",
        "Dwarven Warrior",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_items(
            tactics,
            "Ranged",
            7,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bow: Short")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Strix", ":titles", "Stirges (plural), Vampire Owls", ":summary", "A bird of ill-omen that feeds on human flesh and blood.\n* Description - A large-headed, dark, birdlike creature similar to an owl with transfixed eyes, rapacious beak, hooked claws. They fly and rest inverted with feet above their head."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Surtur",
        ":image",
        "Superheroes/Surtur.png",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key(tactics, "Fire"),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Longevity",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Eternal Youth")
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terraphant", ":summary", "* A hulking beast the size of an elephant with a head like an octopus."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tentacle Terror", ":titles", "Roper, Tentacle Beast", ":reference", "* Cthulhu Mythos\n* Hentai", ":summary", "* A formless mass that can create writhing tentacles, eyes, and mouths from its body."),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Throwback", ":reference", "Bouncers, Frat Boys, Jocks, Weight Lifters", ":summary", "* Appearance - Throwbacks are hulking, musclebound, prettyboys who are constantly looking at themselves.\n* History - Throwbacks begin as insecure guys who want to increase their bodies or their manhood. The enhancements they receive brings out all of the worst male tendencies and exaggerate them to a homicidal degree. Vanity, violence, and sexual aggression all warp them into virtual cavemen who care for nothing but fighting, sex, and pumping iron."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Thunderbird", ":titles", "Stormcrow, Stormraptor", ":summary", "* The Thunderbird is a large bird with a special affinity for electricity. When a storm is present, the Thunderbirds true power is awakened.\n* The wings of Thunderbirds generate increasing static electricity with each flap.\n* Thunder Shield - Touching the Thunderbird triggers an electric shock and a sonic area attack.\n* Thunderstrike - With a shriek, the Thunderbird calls a lightning strike unto itself which is instantly redirected in the direction it is facing as if the lightning came from its mouth.\n* Thunderclap - When the Thunderbird claps its wings together a lightning bolt strikes it and produces a deafening sonic area attack around it.\n* Thunder Storm - By spreading its wings, the Thunderbird calls a lightning strike onto itself which is then split into multiple strikes that rain lightning down below it."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Tie Advanced",
        ":image",
        "starwars/unit-tie-advanced.png",
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Bomber", ":image", "starwars/unit-tie-bomber.png", ":classification", "Lt. Spacecraft", ":summary", "* Much heavier than the Tie Fighter\n* Carries Concussion Missiles or Proton Bombs"),
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
        "starwars/unit-tie-fighter.png",
        ":titles",
        "Twin Ion Engine Fighter",
        ":classification",
        "Lt. Spacecraft",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
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
        "starwars/unit-tie-interceptor.png",
        ":classification",
        "Lt. Spacecraft",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
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
        ":image",
        "starwars/unit-tie-phantom.png",
        ":summary",
        "* Cloaking Device",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Gunnery", "Stealth")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Reaper"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tie Striker"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Turkey", ":image", "images/cards/unit-turkey.svg", ":reference", "* As God is my witness, I thought turkeys could fly. - Mr. Carlson, WKRP in Cincinnati"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Undine"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Urchin", ":image", "images/cards/unit-urchin.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Uruk Butcher", ":summary", "* Orc Butchers deal in all things meat. They serve as cooks, surgeons, executioners, undertakers, and torturers.\n* They prefer cleavers, hand axes, and knives in combat."),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Uruk Warrior",
        ":image",
        "images/bestiary/Orc_Warrior.png",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl(tactics, "Military", 3)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Primitive", ":image", "images/cards/unit-valusian-primitive.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Sorcerer", ":image", "images/cards/unit-valusian-warrior.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Valusian Warrior", ":image", "images/cards/unit-valusian-warrior.svg"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Brujah",
        ":titles",
        "Bully, Bruiser",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Strength")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Gangrel",
        ":titles",
        "Animal, Protector",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Animalism")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vampire: Kali", ":summary", "* Tzimisce Vampire Methuselah"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vampire: Kuei-Jin"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Lasombra",
        ":image",
        "images/bestiary/vampire-lasombra.png",
        ":titles",
        "Dark Priest",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Influence")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Malkavian",
        ":summary",
        "* Cursed by Madness\n* Malkalv - The philosophic, antedeluvian sire of their clan. When he was destroyed with the First City. his childer began to gain the signature Madness. Some say his spirit continues through his blood and connects his childer. Others propose the preposterous notion that Malkav was a an embraced Angel.\n* Kinship - Unlike other tribes, the Malkavians have a natural understanding and kinship toward each other. It is rare that they outright betray one another.",
        ":titles",
        "Jester, Maniac, Nutcase, Prankster, Psychotic",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Domination", "Senses", "Madness"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Stealth")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Nosferatu",
        ":titles",
        "Sewer Rat",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Invisibility"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Stealth")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vampire: Set", ":summary", "* Setite Vampire Methuselah"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Setite",
        ":summary",
        "* Vampires sired by [Vampire: Set].",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Toreador",
        ":reference",
        "* We come into this stale and plain stale world. So we spend our time, searching for that one sublime revelation. To fill the void. To lose ourselves in beauty and perfection. Beauty can be elegant, seductive, full of pleasure, Raw, Violent, Lethal. Let me help us find it. To lose ourselves. Come closer. I am a beautiful way to die. - Vampire: Bloodlines 2\n* She'll only come out at nights. The lean and hungry type... I wouldn't if I were you. I know what she can do. She's deadly man, she could really rip your world apart. Mind over matter. Ooh, the beauty is there but a beast is in the heart. Oh, here she comes. Watch out boy she'll chew you up. Oh, here she comes. She's a maneater. - Hall and Oates/No Hard Feelings, Maneater",
        ":summary",
        "* Beauty is both a blessing and a curse\n* Toreadors were key to founding the Camarilla and are among the most powerful and influencial clans.\n* The Roses in the Garden - The Toreador who are obscessed with politics, conspiring on casual walks.\n* Founder - It is said that the Clan's founder, Arikel was a mortal painter and/or sculptress and twin sister of Malkav in the First City. Famed throughout the lands for her work, after her Embrace she painted a mural on which the past, present and future of Kindred society was depicted. When Caine saw a terrible future for his race, he cursed her with the affliction that affects Toreador today – the art that she loved most dearly would now be her obsession and distraction above all things.\n* Weakness - Fascination",
        ":titles",
        "Artists, Clan of Roses, Degenerate, Gossips, Obsessives",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Quickness", "Senses", "Presence")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Tremere",
        ":image",
        "images/bestiary/vampire-tremere.png",
        ":titles",
        "Blood Sorcerer, Broken Clan, Pyramid, Usurpers, Warlock, Witch",
        ":summary",
        "* The Tremere is the second youngest clan having appeared in the Dark Ages.\n* History - The Tremere began as House Tremere, mages of the Order of Hermes named for their leader and founder, Tremere. At the end of the first millennium, the members of House Tremere realized the Hermetic arts were failing and found its immortality potions no longer working. House Tremere undertook numerous experiments, but it was Goratrix who devised a solution in his investigation of vampires. In 1022, Goratrix invited Tremere and six of the founder's closest advisers to participate in the completed ritual, which promised true immortality. Whether Goratrix knew what would happen is known only by him and, perhaps, Tremere, but at the completion of the ritual the participants fell unconscious and were reborn as vampires, their avatars destroyed and magical abilities lost. The mages had gained their immortality but lost the power they lived for. In time, the Tzimisce made war against House Tremere in retribution for the Fiends that had been made part of Goratrix's experiments. The Order of Hermes also became suspicious of diabolical practices being performed by the increasingly secretive House. In 1037 Tremere gathered the seven newly-made Cainites and forced the blood bond upon them. He then declared to them that House Tremere would be restructured with a new pyramid hierarchy, placing himself at the top as Primus of House and clan Tremere and his seven closest followers forming the Inner Council of Seven directly under him. They would slowly begin Embracing the rest of the House, with each initiate being bound to the Inner Council to ensure their loyalty. In time, all members of House Tremere would die or become vampires. While Tremere and Etrius pursued their own research throughout Europe in converting the hermetic arts into Thaumaturgy, Goratrix once again returned to his laboratories with his apprentices at hand. After years of experimentation on captured Tzimisce, Nosferatu, and Gangrel, he succeeded in creating a Gargoyle in 1121, and by 1125 the hybrids were serving as shock troops against the Fiends. Nevertheless, the Tremere found themselves third-class citizens among the undead. Whatever boldness Tremere had shown in entering the night was ignored by the staunchly traditionalist clans, and they were often forced from cities by princes who did not look kindly on their presumption. As he and Etrius rapidly acquired more vampiric lore they discovered the history of Caine and the Antediluvians, as well as the benefits of diablerie. Seeking to establish themselves as a clan proper, the Tremere sought a clan founder to diablerize and settled on Saulot, the enigmatic founder of the Salubri clan. In 1133, Tremere and the Inner Council discovered Saulot's tomb in the Anatolian desert. Tremere diablerized the Antediluvian and promptly entered torpor, leaving the Inner Council to lead the clan and destroy the remaining Salubri. As with everything else that the Tremere had done to this point, the result was a mixed blessing. The Tremere were entrenched in many Cainite courts, their services as mages making them indispensable to princes across Europe. They were now accepted as one of the Low Clans, albeit considered usurpers, distrusted warlocks, and known diablerists. In the early years of the 21st century, the Intellegence agencies of the United States managed to gain access to SchreckNet and gained firsthand knowledge of the existence of a race of undead bloodsuckers that were spread in all corners of the world. Sharing their knowledge with other intelligence agencies, the united secret services contacted the Vatican, whom they knew to have experience fighting the undead. After years of careful research, the Second Inquisition had targeted Vienna as the 'capital of vampires' and prepared a strike against their headquarters. In 2008, a united USSOCOM and Vatican ESOG force stormed the Vienna Chantry of Clan Tremere and destroyed it, blaming it to an ISIS terror attack to the public. London, Las Vegas, Paris, and Marseilles were largely cleared of vampiric activity, with numerous captured vampires being placed in black sites and experimented upon to discover their weaknesses. The Inner Council of Seven were slain and their Blood Bonds shattered. Since then the once monolithic Tremere structure has completely fallen apart.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Bloodcraft")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Tzimisce",
        ":image",
        "images/bestiary/vampire-tzimisce.png",
        ":reference",
        "The Tzimisce take pleasure in shaping themselves into a variety of inhuman forms.  Distended skulls, elongated fingers, polychromatic mottling are often displayed to demonstrate their alien superiority.",
        ":summary",
        "* The Tzimisce's extensive use of Fleshcraft upon themselves, their servants, and their foes, have made them the most bizarre and alien of the Vampire clans. Fortunately, they are solitary by nature preferring isolated locale to practice their horrid techniques on their hapless prey.\n* Examples: Backroom Surgeon, Carny Folk, Dracula, Inquisitor, Kali, Mortician, Nazi Scientist, Tatoo Artist, Toturer, Vivisectionist",
        ":titles",
        "Monster, Alien",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Fleshcraft"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Intimidation")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Vampire: Ventrue",
        ":titles",
        "Bluebloods, Manipulator, Know-it-all",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Vampirism", "Domination", "Toughness"),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Influence")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Voltron",
        ":image",
        "Daikaiju/Voltron.png",
        ":body",
        "7x5",
        ":mass",
        "700tons",
        ":height",
        "60m",
        ":unitskillmap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitskillmap},
          ":Gunnery",
          vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Gunnery", ":summary", "* Wing Boomerang - Boomerang attack from the wings of GoLion.\n* Space Cutter - Spinning Blades.\n* Eye Flash - Beams fired from the eyes of GoLion.\n* Hurricane Attack - Wind attack similar to Daimos Blizzard, but not as strong.\n* Laser Magnum - Laser-like bullets fired from the mouth of the Green Lion.\n* Fire Tornado - A burst of flame emits from the mouth of the Red Lion.\n* Cross Beam - Cross-shaped boomerang fired from the chest.\n* Gatling Missiles - Small missiles fired from the legs.\n* Electromagnetic Lance - Weapon used as a spear at times.\n* Foot Missile - Missiles fired from the mouths of the Blue and Yellow Lions.\n* Four Lion Attack - The 'Lion Head Attack' 100-Ton Punch.\n* Grand Fire - A stream of flames fired from the mouths of the Blue and Yellow Lions", ":level", "5")
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_tactics_keys(tactics, "Combine")
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Waif", ":image", "images/cards/unit-waif.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wandering Eye", ":titles", "Eye Killer", ":summary", "* Thw Wandering Eye is a bizarre, eel-like creature with a single, large, humanoid eye where a mouth and face would normally be. Eyes live in large groups underground and slowly float through the air like schools of fish. Their skin is a dark matte brown while their eye is highly reflective white, so usually the first view of Wandering Eyes is of a dozen disembodied eyes moving and blinking independently of one another in the dark.\n* Motivation - The Eyes are not intelligent nor malicious. They simply seek food, and will flee if startled or they are losing.\n* Levitation - Eyes produce a lighter than air gas that is stored in sacs down its body. These allow The creature to float and it can slowly propel itself through the air by making swimming motions.\n* Confusion - The creature's single, large eye doesn't seem to focus on anything and keeps moving about randomly. When a group of Wandering Eyes are seen, their weird, random eyes cause vertigo, confusion, fear, and sometimes madness. The Wandering Eye somehow feeds on this confusion and will attempt to trap victims and keep them in an intense state of confusion until they expire.\n* Weakness - Eyes are adjusted to life in the dark and are blinded by bright lights and large fires."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Water Elemental"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Water Elemental Lord",
        ":summary",
        "* Greater Water Elementals are enormous creatures that can appear as a lake, a whirlpool, or a tidal wave. They have complete mastery over the Water, can perform any Water Power at maximum ability and can cancel any other being attempting to use Fire.",
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl(tactics, "Water", 20)
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Water Sprite"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wendigo", ":titles", "Abominable Snowman, Yeti", ":summary", "* Wendigoes are the result of cannibalism in the forests of the north. It is a curse that causes the death of the person, and later they return as a huge cunning beast with the desire to consume human flesh. Wendigoes are thin and seven to ten feet tall, their hearts are made of ice and their claws are icicles. They have [Resist: Cold] and often appear in the middle of a snowstorm to steal their victims."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Werebat"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Werebear"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wereboar"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Werecat", ":image", "images/bestiary/Lycanthrope_Weretiger.png", ":titles", "Rakshasa, Werejaguar, Werepanther, Weretiger", ":reference", "Every time it happens... you tell yourself it's love. But it isn't. It's blood. And death. - Cat People"),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Werecrow",
        ":image",
        "images/bestiary/Lycanthrope_Tengu.png",
        ":titles",
        "Tengu, Wereraven",
        ":summary",
        "* Able to fly, the Werecrows make terrific scouts and spies.  Their overwhelming curiousity is matched only by their tendency to gossip.",
        ":unitpowermap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpowermap},
          "Beastial",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":name",
            "Beastial",
            ":unitabilitymap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitabilitymap},
              "Feather Blades",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Feather Blades"),
              "Feather Knives",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Feather Knives")
            )
          )
        ),
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_abilities(
            tactics,
            "Hunting",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Scouting")
          )
        )
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Wererat",
        ":image",
        "images/bestiary/Lycanthrope_Wererat.png",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_tactics_keys(tactics, "Stealth")
      ),
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_unit},
        ":name",
        "Werespider",
        ":titles",
        "Anasi, Arachne, Kumo",
        ":unitpowermap",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_unitpowermap},
          ":Illusion",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":name",
            "Illusion",
            ":unitabilitymap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitabilitymap},
              "Dazzling Beauty",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Dazzling Beauty"),
              "Mirror Image",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Mirror Image")
            )
          ),
          "Toxins",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitpower},
            ":name",
            "Toxins",
            ":unitabilitymap",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unitabilitymap},
              "Poison Bite",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Poison Bite"),
              "Poison Spit",
              vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Poison Spit")
            )
          )
        )
      ),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Werewolf", ":image", "images/bestiary/Lycanthrope_Werewolf.png", ":reference", "* The crescent moon is a double-edged sword. Be wary, lest it cut you.", ":titles", "French/Old English: Loup-garou, Japanese: Ookami otoko"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Whale: Blue"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Whale: Killer"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Whale: Sperm"),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wight", ":summary", "* A Wight is an animated corpse like a zombie, but its eyes burn fiercely, showing their deep hatred of the living. They continue to pursue their goals in life, but these goals are always twisted into hatred and revenge against the living.\n* Wights are usually highly intelligent or cunning and have the patience to carefully plan their murders. Wights enjoy killing as well as inflicting pain and fear on their victims who they believe deserve what they get.\n* A Wight is created when an extremely driven, evil person is on the verge of death. Before death, it makes a bargain with a demonic force, and returns to unlife as a Wight.\n* Wights retain most of their abilities while living. Powerful Wights can be as powerful as Liches. In fact, the necromantic study of Wights led to the necromantic rituals responsible for Mummies and Liches."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Will-O-Wisp"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wolf", ":titles", "Lone Wolf", ":summary", "* Hearing - The upper range of a wolfs' hearing is upwards of 80 kHz. The upper range of humans is only 20 kHz. A wolf can hear up to 6 miles away in forest and 10 miles in open areas, including some high-pitched sounds that a human can't hear. Even when it sleeps, a wolf's ears stand straight up so it can catch sounds. Unlike humans, wolves can easily tell what direction sound is coming from by turning their ears from side to side.\n* Smell - The wolf's sense of smell is about 100 times better than a human's. It can smell prey more than a mile away if the wind is right. It can sense an animal three days after it's gone. Wolves finished a test to locate hidden food in five minutes that domestic dogs took over an hour to finish.\n* Vision - Beyond a short distance their vision must be somewhat blurred. Nevertheless, wolves can see shapes and, especially, movement over long distances, and their peripheral vision is extremely accurate.  They are able to detect even the slightest movements of very small animals, such as a mosquito, at a distance of more than ten feet. There is some controversy as to whether wolves see in color or black and white. Regardless, it is unlikely that they see the various hues of the spectrum as humans see them, because the physical makeup of the eye is different. Nighttime vision for wolves is many times better than human vision in the day or night. Wolves can actually see much better and even much more clearly at night. The eyes of the wolf are like most predators, with a sight-field of nearly 180 degrees and pointed forward."),
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wraith", ":summary", "* Wraiths normally exist in the [Underworld] where their numbers are legion.\n* Those with strong connections to the world of the living can walk among the living but are [Invisible] and [Ethereal] and can indistinctly see the living world through the [Shroud]. Skilled Wraiths may even temporarily breech the [Shroud].\n!Abilities\n* Keening\n* Manifestation\n* Poltergeist\n* Possession", ":titles", "Ghost"),
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
      vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Yog-Sothoth", ":image", "Cthulhu/YogSothoth.png", ":titles", "Beyond-One, The Key and the Gate, The Vortex", ":reference", "Locked away at the border of reality, there exists an intelligence. Rather, The Intelligence: All of it. Yog-Sothoth holds the knowledge of all that is, all that was, and all that will be. ... For this reason, he is one of the most heavily worshipped entities among the Other Gods. His name is frequently invoked during the rituals and incantations of those seeking hidden knowledge. And often, he answers. Sadly for the ones who call on him, the knowledge he grants almost always leads to madness and self-destruction. Not because Yog-Sothoth is evil or malevolent. He doesn't force anyone to turn the key or step through the gate. ... He is both the danger of knowledge and the inability of man to handle it. His role in the mythos mirrors Lovecraft's own self-taught obsession with the sciences as well as his acedemic failings. - Tale Foundry"),
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
        "* [Evade]: Flip to [Fast].",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grab")
          )
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Beastial",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Zombified")
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
        "* [Evade]: Flip to [Fast].",
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
            "Beastial",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Zombified")
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
        "* [Evade]: Flip to [Fast].",
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
            "Beastial",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Zombified")
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
        "* Zombies are nearly mindless animated corpses.\n* They act irrationally and attack all living creatures with no sense of self preservation.\n* [Evade]: Flip to [Fast].",
        ":unitskillmap",
        nx_tactics_base.f_unitskillmap_from_unitskilllist(
          nx_tactics_base.f_unitskill_from_tactics_key_lvl_abilities(
            tactics,
            "Close Combat",
            2,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Grab")
          )
        ),
        ":unitpowermap",
        nx_tactics_base.f_unitpowermap_from_unitpowerlist(
          nx_tactics_base.f_unitpower_from_tactics_key_lvl_abilities(
            tactics,
            "Beastial",
            1,
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Bite")
          ),
          nx_tactics_base.f_unitpower_from_tactics_key_abilities(
            tactics,
            "Special Ability",
            vx_core.f_new({"any-1": vx_core.t_stringlist}, "Zombified")
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
