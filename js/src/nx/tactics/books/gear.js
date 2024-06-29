'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_gear {

  /**
   * @function chapter_gear_construction
   * @return {chapter}
   */
  static t_chapter_gear_construction = {
    vx_type: vx_core.t_type
  }
  static e_chapter_gear_construction = {
    vx_type: nx_tactics_books_gear.t_chapter_gear_construction
  }

  // (func chapter_gear_construction)
  static f_chapter_gear_construction() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Gear Construction"
    )
    return output
  }

  /**
   * @function chapter_gear_items
   * @return {chapter}
   */
  static t_chapter_gear_items = {
    vx_type: vx_core.t_type
  }
  static e_chapter_gear_items = {
    vx_type: nx_tactics_books_gear.t_chapter_gear_items
  }

  // (func chapter_gear_items)
  static f_chapter_gear_items() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Gear Items",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Alchemical Devices",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Alchemical Devices",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Alembic",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Alembic"
            ),
            ":Aludel",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aludel",
              ":summary",
              "* The philosophical vase of the alchemist."
            ),
            ":Athanor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Athanor",
              ":summary",
              "* The philosophical furnace of the alchemist."
            ),
            ":Bellows",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bellows"
            ),
            ":Blowtube",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blowtube"
            ),
            ":Brazier",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brazier"
            ),
            ":Cadeucus",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cadeucus"
            ),
            ":Calcinator",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Calcinator"
            ),
            ":Censer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Censer"
            ),
            ":Crucible",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Crucible"
            ),
            ":Glassware",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Glassware"
            ),
            ":Hourglass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hourglass"
            ),
            ":Inkwell",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Inkwell"
            ),
            "Mortar and Pestle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mortar and Pestle"
            ),
            ":Piping",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Piping"
            ),
            "Quill Pen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Quill Pen"
            ),
            ":Retort",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Retort"
            ),
            "Scrying Glass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scrying Glass"
            ),
            ":Tongs",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tongs"
            ),
            ":Vial",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Vial"
            )
          )
        ),
        ":Poisons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Poisons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Narcotic Poison",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Narcotic Poison"
            ),
            "Paralytic Poison",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Paralytic Poison"
            )
          )
        ),
        "Alchemical Substance",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Alchemical Substance",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Alkahest",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Alkahest",
              ":summary",
              "* The universal solvent, having the power to dissolve every substance into its\nconstituent elemental parts.  It cannot dissolve anything that is absolutely\npure.",
              ":titles",
              "Alchahest, Universal Solvent"
            ),
            ":Aphrodisiac",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aphrodisiac"
            ),
            "Aqua Fortis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aqua Fortis",
              ":summary",
              "Nitric acid.  Easier to make, lesser version of Aqua Regia.",
              ":titles",
              "Strong Water"
            ),
            "Aqua Regia",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aqua Regia",
              ":summary",
              "* Highly corrosive acid made from Nitric and Hydrochloric acid.  It is one of the few reagents that dissolves gold\nand platinum.",
              ":titles",
              "Royal Water"
            ),
            "Aqua Vitae",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Aqua Vitae",
              ":summary",
              "* Magical liquid used to create artificial life, particularly the Homonculus.",
              ":titles",
              "Elixir of Vitality, Water of Life"
            ),
            "Amber Crystal",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amber Crystal"
            ),
            "Antidote: Amnesia",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Amnesia"
            ),
            "Antidote: Blindness",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Blindness"
            ),
            "Antidote: Burns",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Burns"
            ),
            "Antidote: Curse",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Curse"
            ),
            "Antidote: Deafness",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Deafness"
            ),
            "Antidote: Disease",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Disease"
            ),
            "Antidote: Fear",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Fear"
            ),
            "Antidote: Insanity",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Insanity"
            ),
            "Antidote: Paralysis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Paralysis"
            ),
            "Antidote: Poison",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antidote: Poison"
            ),
            "Devilroot Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Devilroot Powder"
            ),
            ":Dipilatory",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dipilatory"
            ),
            "Dream Essence",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dream Essence",
              ":summary",
              "* The elusive essence from which dreams are made.  It is gathered from a subject and\nthen distilled into a liquid.\n* The effects last for 2-8 hours and are very intense.\n* Effects vary by color:\n** Purple - Passion, Romance\n** Blue - Poignancy\n** Red - Violent Emotions\n** Silver - Imagination, Flights of Fancy\n** Gold - Prophetic Visions\n** Rainbow - Unpredictable\n** Black - Nightmares"
            ),
            "Elixir of Clarity",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elixir of Clarity",
              ":summary",
              "* [Effect]: [+1 Mind]"
            ),
            "Elixir of Healing",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elixir of Healing"
            ),
            "Elixir of Life",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elixir of Life",
              ":summary",
              "* [Effect]: Extends lifespan by 10 years. Each use of this Elixir increases the difficulty of the next use."
            ),
            "Elixir of Regrowth",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elixir of Regrowth",
              ":summary",
              "* Effect: Drop into a coma and heals damage including repairing/regrowing damaged organs or\nlimbs."
            ),
            "Elixir of Strength",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elixir of Strength",
              ":summary",
              "* [Effect]: [+1 Body]"
            ),
            "Essense of Longing",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Essense of Longing",
              ":titles",
              "Perfume of Attraction"
            ),
            "Essential Quicksilver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Essential Quicksilver",
              ":summary",
              "A magically animate liquid metal used in the crafting of enchanted weapons."
            ),
            ":Glowball",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Glowball",
              ":summary",
              "* A glass ball that will radiate light like a torch for [Level] hours without\nrequiring air."
            ),
            ":Homonculyte",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Homonculyte"
            ),
            "Ice Crystals",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ice Crystals",
              ":summary",
              "Intense cold captured into powdery crystal form."
            ),
            "Incense of Conjuration",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Incense of Conjuration",
              ":summary",
              "* [Action]: Burn for +1 [Conjuration] for the next 5 turns."
            ),
            "Incense of Divination",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Incense of Divination",
              ":summary",
              "* [Action]: Burn for +1 [Divination] for the next 5 turns."
            ),
            "Incense of Dreaming",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Incense of Dreaming",
              ":summary",
              "* [Action]: Burn for +1 [Dreaming] for the next 5 turns."
            ),
            "Incense of Shamanism",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Incense of Shamanism",
              ":summary",
              "* [Action]: Burn for +1 [Shamanism] for the next 5 turns."
            ),
            "Lightning in a Bottle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lightning in a Bottle"
            ),
            "Lyrium Potion",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lyrium Potion",
              ":summary",
              "* Natural Lyrium is a white, radioactive dust extracted from Uranium mines.\n* Lyrium Ore - Direct contact with lyrium ore produces nausea, blistering of the skin,\nand dementia.\n* Lyrium Potions - Lyrium dust can be mixed into a potion that bestows resistance to\nmagic to those who use it regularly. However, Lyrium is extremely physically and\npsychologically addictive not unlike heroin.\n* Chantry Templars are all required to take Lyrium regularly. The addictive qualities of\nLyrium ensure that the Templars remain under Chantry control.\n* History - It is thought that Lyrium is created from Ley Lines (Dragon Lines) traveling\nthrough the earth.\n* [Passive]: +1 [Defense] vs. any magical effect and -1 [Action] when using any magical\neffect.",
              ":titles",
              "Radium"
            ),
            "Makeup of Beauty",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Makeup of Beauty"
            ),
            "Mandrake Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mandrake Powder"
            ),
            "Oil of Slipperiness",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Oil of Slipperiness"
            ),
            ":Panacea",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Panacea"
            ),
            "Philosopher's Stone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philosopher's Stone",
              ":summary",
              "* A legendary alchemical substance said to be capable of turning base metals\nsuch as lead into gold (chrysopoeia) or silver. It was also sometimes believed\nto be an elixir of life, useful for rejuvenation and possibly for achieving\nimmortality. For many centuries, it was the most sought-after goal in alchemy.\nThe philosophers' stone is the central symbol of alchemy, symbolizing\nperfection at its finest, enlightenment, and heavenly bliss. Efforts to\ndiscover the philosophers' stone were known as the Magnum Opus ('Great Work').\n* The first component of the philosopher's stone is Prima Materia: 'the first\nmatter of the stone is the very same with the first matter of all things.'",
              ":titles",
              "Magnum Opus, Great Work, Stone of the Philosopher, Variable Mercury"
            ),
            "Philtre of Courage",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Courage",
              ":summary",
              "* [Effect]: [+1 Spirit]"
            ),
            "Philtre of Fear",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Fear",
              ":summary",
              "* [Effect]: [-1 Spirit]"
            ),
            "Philtre of Hate",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Hate"
            ),
            "Philtre of Loyalty",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Loyalty"
            ),
            "Philtre of Love",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Love",
              ":reference",
              "Love Potion #9",
              ":titles",
              "Love Potion, Potion of Passion"
            ),
            "Philtre of Mirth",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Mirth"
            ),
            "Philtre of Sorrow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Sorrow"
            ),
            "Philtre of Trechery",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Trechery"
            ),
            "Philtre of Violence",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Philtre of Violence",
              ":titles",
              "Berserk Potion"
            ),
            "Potion of Fire Resistance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Fire Resistance",
              ":summary",
              "* Effect: +1 [Defense] vs. [Fire]."
            ),
            "Potion of Grounding",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Grounding",
              ":summary",
              "* Effect: +1 [Defense] vs. [Electricity]."
            ),
            "Potion of Healing",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Healing"
            ),
            "Potion of Regeneration",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Regeneration"
            ),
            "Potion of Restoration",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Restoration"
            ),
            "Potion of Strength",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Strength"
            ),
            "Potion of Venom",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Venom",
              ":summary",
              "* Effect: Body becomes a deadly storehouse of caustic venoms.  The blood,\nsweat, tears, and spit are all deadly weapons.  User is immune to its own\neffects and is also resistant to all poison, acid, and disease."
            ),
            "Potion of Warmth",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Warmth",
              ":summary",
              "* Effect: +1 [Defense] vs. [Cold]."
            ),
            "Potion of Water Breathing",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Potion of Water Breathing"
            ),
            "Prima Materia",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Prima Materia",
              ":summary",
              "* The primitive formless base of all matter, the primal substance that may be\nchanged into any other matter.",
              ":titles",
              "Aether, Akasha, Ether, Proteus, Quintessence"
            ),
            "Rare Earths",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rare Earths",
              ":summary",
              "* Rare Earths are the most important of all alchemical ingredients because they are the catalysts that unleash the\ninnate powers of other ingredients.",
              ":titles",
              "Antimony, Cinnabar, Pitchblend, various salts, and metal oxides"
            ),
            "Sleeping Potion",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sleeping Potion",
              ":reference",
              "Sleeping Beauty",
              ":titles",
              "Soporific"
            ),
            ":Smokestick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Smokestick",
              ":summary",
              "* An alchemically treated wooden stick that creates thick, opaque smoke when\nignited."
            ),
            ":Soulstone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soulstone"
            ),
            "Soverign Glue",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soverign Glue",
              ":titles",
              "Universal Adhesive"
            ),
            "Storm Crystals",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Storm Crystals"
            ),
            ":Thunderstone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Thunderstone",
              ":summary",
              "* A stone that emits a deafening sound when it is first struck againsts a\nhard surface."
            ),
            ":Tindertwig",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tindertwig",
              ":reference",
              "A match",
              ":summary",
              "* A sulfurous substance that ignites when rubbed against a rough surface."
            )
          )
        ),
        ":Artifacts",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Artifacts",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Icy Manipulator",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Icy Manipulator",
              ":summary",
              "* [Action]: Roll vs. [Mind]. If successful, target loses its next [Action]."
            ),
            "Zuran Orb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Zuran Orb",
              ":reference",
              "* I will go to any length to achieve my goal. Eternal life is worth any sacrifice.\n- Zur the Enchanter, Magic the Gathering",
              ":summary",
              "* [Action]: -1 [Spirit] permanently. -2 Damage, -1 Critical, -10 Age."
            )
          )
        ),
        ":Artwork",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Artwork",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Bronze Sculpture",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bronze Sculpture"
            ),
            "Calligraphed Scroll",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Calligraphed Scroll"
            ),
            ":Carving",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Carving"
            ),
            "Cave Drawing",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cave Drawing"
            ),
            "Ceramic Vase",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ceramic Vase"
            ),
            "Clay Pot",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Clay Pot"
            ),
            ":Goblet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Goblet"
            ),
            "Fine China",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fine China"
            ),
            "Iron Sculpture",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Iron Sculpture"
            ),
            "Oriental Carpet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Oriental Carpet"
            ),
            "Landscape Painting",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Landscape Painting"
            ),
            "Marble Sculpture",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Marble Sculpture"
            ),
            "Painted Fan",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Painted Fan"
            ),
            "Painted Folding Screen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Painted Folding Screen"
            ),
            "Painted Scroll",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Painted Scroll"
            ),
            "Portrait Painting",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Portrait Painting"
            ),
            ":Scrimshaw",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scrimshaw"
            ),
            "Silver Bowl",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Silver Bowl"
            ),
            "Silver Cup",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Silver Cup"
            ),
            "Silver Plate",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Silver Plate"
            ),
            ":Silverware",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Silverware"
            ),
            "Still Life Painting",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Still Life Painting"
            ),
            "Stone Sculpture",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Stone Sculpture"
            ),
            "Wooden Sculpture",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wooden Sculpture"
            )
          )
        ),
        "Book Types",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Book Types",
          ":titles",
          "Book, Musings, Notes, Scroll, Writings",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Almanac",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Almanac"
            ),
            "Atlas of Maps",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Atlas of Maps"
            ),
            ":Biography",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Biography"
            ),
            "Book of Shadows",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Book of Shadows",
              ":summary",
              "A private journal, history or core religious text kept by practitioners."
            ),
            ":Codex",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Codex"
            ),
            ":Encyclopedia",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Encyclopedia"
            ),
            ":Fragments",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fragments"
            ),
            ":Grimoire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Grimoire",
              ":summary",
              "A set of rules for doing something and is a journal kept by practitioners containing\ninformation and contributions relevant to their specific field of study."
            ),
            ":Manual",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Manual"
            ),
            ":Memoir",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Memoir"
            ),
            ":Poems",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Poems"
            ),
            ":Spellbook",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spellbook"
            ),
            ":Tome",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tome"
            )
          )
        ),
        "Books, Unique",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Books, Unique",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Book of Enoch",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Book of Enoch"
            ),
            "Book of the Law",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Book of the Law"
            ),
            "Charge of the Goddess",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Charge of the Goddess"
            ),
            "I Ching",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "I Ching"
            ),
            "Lemegeton Clavicula Salomonis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lemegeton Clavicula Salomonis",
              ":titles",
              "The Lesser Key of Solomon"
            ),
            "Liber Legis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Liber Legis"
            ),
            "Liber Null",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Liber Null"
            ),
            "Malleus Maleficarum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Malleus Maleficarum",
              ":summary",
              "One of the most famous medieval treatises on witches.",
              ":titles",
              "The Hammer of Witches, Hexenhammer"
            ),
            "Tabula Rasa",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tabula Rasa",
              ":summary",
              "* A unique blank stone tablet of unknown origin vaguely connected to the legends of the River Lethe.\n* If a person writes a description of a memory on the tablet, then the text will slowly fade from\nthe tablet and as it does the memory will also permanently fade from the user's mind. This item can\nbe used to remove trauma as well as reset unwanted skills and abilities."
            ),
            "Wiccan Rede",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wiccan Rede"
            )
          )
        ),
        ":Clothing",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Clothing",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Bracers",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bracers"
            ),
            ":Circlet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Circlet"
            ),
            ":Cloak",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cloak"
            ),
            ":Collar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Collar"
            ),
            ":Coronal",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Coronal"
            ),
            ":Headdress",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Headdress"
            ),
            ":Leggings",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Leggings"
            ),
            ":Mantle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mantle"
            ),
            ":Mask",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mask"
            ),
            ":Rainment",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rainment"
            ),
            ":Robe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Robe"
            ),
            ":Torque",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Torque"
            )
          )
        ),
        ":Drugs",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Drugs",
          ":reference",
          "* We had two bags of grass, seventy-five pellets of mescaline, five sheets of high-powered blotter acid, a saltshaker\nhalf-full of cocaine, and a whole galaxy of multi-colored uppers, downers, screamers, laughers... Also, a quart of\ntequila, a quart of rum, a case of beer, a pint of raw ether, and two dozen amyls...The only thing that really worried\nme was the ether.  There is nothing in the world more helpless and irresponsible and depraved than a man in the depths\nof an ether binge, and I knew we'd get into that rotten stuff pretty soon. - Raoul Duke, Fear and Loathing in Las\nVegas",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Amphetamine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amphetamine",
              ":titles",
              "Crank, Speed, Uppers"
            ),
            ":Anesthetic",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Anesthetic"
            ),
            ":Anti-Fungal",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Anti-Fungal"
            ),
            ":Anti-Parasitic",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Anti-Parasitic"
            ),
            ":Antiseptic",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Antiseptic"
            ),
            ":Atropine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Atropine"
            ),
            "Birth Control",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Birth Control"
            ),
            ":Cocaine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cocaine"
            ),
            "Crack Cocaine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Crack Cocaine"
            ),
            ":Depresant",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Depresant",
              ":titles",
              "Downers"
            ),
            ":Ecstasy",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ecstasy",
              ":titles",
              "XTC"
            ),
            "Fertility Drug",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fertility Drug"
            ),
            ":Hallucinogen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hallucinogen"
            ),
            ":Hashish",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hashish"
            ),
            ":Heroin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heroin"
            ),
            ":LSD",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "LSD",
              ":titles",
              "Acid"
            ),
            ":Marijuana",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Marijuana"
            ),
            ":Mescaline",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mescaline",
              ":summary",
              "* Derived from the [Peyote] Plant"
            ),
            ":Morphine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Morphine"
            ),
            ":Sedative",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sedative"
            ),
            ":Steroid",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Steroid"
            ),
            ":Stimulant",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Stimulant"
            ),
            ":Tranquilizer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tranquilizer"
            )
          )
        ),
        "Food and Drink",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Food and Drink",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Ale",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ale"
            ),
            ":Beer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Beer"
            ),
            "Blossom Wine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blossom Wine"
            ),
            ":Grog",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Grog"
            ),
            "Fire Ale",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fire Ale"
            ),
            ":Mead",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mead",
              ":summary",
              "Fermented Honey"
            ),
            "Mushroom Ale",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mushroom Ale"
            ),
            ":Nectar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nectar"
            ),
            ":Whiskey",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Whiskey"
            ),
            ":Wine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wine"
            ),
            ":Vinesap",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Vinesap"
            ),
            ":Vodka",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Vodka"
            )
          )
        ),
        ":Jewelry",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Jewelry",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Amulet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amulet"
            ),
            ":Anklet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Anklet"
            ),
            ":Bracelet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bracelet"
            ),
            ":Brooch",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brooch",
              ":titles",
              "Decorative Pin"
            ),
            ":Cameo",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cameo"
            ),
            ":Earring",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Earring"
            ),
            ":Ingot",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ingot"
            ),
            ":Medallion",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medallion"
            ),
            ":Necklace",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Necklace"
            ),
            ":Pendant",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pendant"
            ),
            ":Ring",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ring"
            ),
            ":Tiara",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tiara"
            ),
            ":Torc",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Torc"
            ),
            ":Valknut",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Valknut",
              ":summary",
              "* Purpose - The valknut pendant is a magical symbol for warrior types. The Valknut pendant is used by those who swear allegiance to Odin in both life and death and want to fight alongside the gods during Ragnarok. When a valknut is found, Odin is also near. This is true for engravings of the valknut as well as for those who decide to wear Odin’s symbol.\n* Description - Valknut literally translates into 'the knot of the fallen warriors.' This symbol is also strongly connected to the deceased as is apparent in its linguistic meaning. The symbol itself represents the 9 worlds of existence. It is created through the fierce binding of three triangles. The Valknut also has the power over both life and death, as it weaves both into a knot.",
              ":titles",
              "Knot of the Fallen Warriors"
            )
          )
        ),
        ":Materials",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Materials",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Animal Hide",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Animal Hide"
            ),
            ":Brass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brass"
            ),
            ":Bronze",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bronze"
            ),
            ":Ceramic",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ceramic"
            ),
            ":Clay",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Clay"
            ),
            ":Gauze",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gauze"
            ),
            ":Glass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Glass"
            ),
            ":Gossamer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gossamer"
            ),
            ":Ice",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ice"
            ),
            ":Iron",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Iron"
            ),
            ":Linen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Linen"
            ),
            ":Obsidian",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Obsidian"
            ),
            ":Quartz",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Quartz"
            ),
            ":Snow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Snow"
            ),
            ":Soil",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Soil"
            ),
            ":Stone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Stone"
            ),
            ":Water",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Water"
            ),
            ":Wind",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wind"
            ),
            ":Wood",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wood"
            )
          )
        ),
        ":Mechanisms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mechanisms",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Secret Compartment",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Secret Compartment"
            ),
            "Secret Door",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Secret Door"
            )
          )
        ),
        "Precious Materials",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Precious Materials",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Amber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amber"
            ),
            ":Amethyst",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amethyst"
            ),
            "Blue Diamond",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blue Diamond"
            ),
            ":Copper",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Copper"
            ),
            ":Diamond",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Diamond"
            ),
            ":Electrum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Electrum",
              ":reference",
              "* Electrum is a naturally occurring alloy of gold and silver, with trace amounts of\ncopper and other metals.\n* The color of electrum is pale yellow or yellowish-white.\n* It is usually a good conductor of electricity.\n* Electrum is much better for coinage than gold, mostly because it is harder and more\ndurable.",
              ":titles",
              "White Gold"
            ),
            ":Emerald",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Emerald"
            ),
            ":Gold",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gold"
            ),
            ":Moonstone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Moonstone"
            ),
            ":Onyx",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Onyx"
            ),
            ":Pearl",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pearl"
            ),
            "Rose Gold",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rose Gold",
              ":reference",
              "* Rose gold is a gold and copper alloy.  The higher the copper content the redder the\ncolor.",
              ":titles",
              "Red Gold"
            ),
            ":Ruby",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ruby"
            ),
            ":Sapphire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sapphire"
            ),
            ":Silver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Silver",
              ":reference",
              "* Silver is a brilliant white metal with a luster that can take a high degree of polish.\n* It is very ductile and malleable (slightly harder than gold).\n* It has the highest electrical conductivity of all metals, even higher than copper\n* Among metals, pure silver has the highest thermal conductivity (only the non-metal\ndiamond's is higher), whitest color, and the highest optical reflectivity.\n* Jewellery and silverware are traditionally made from Sterling silver (Standard silver) an\nalloy of 92.5 % silver with 7.5% copper.  Sterling silver is harder than pure silver,\nand has a lower melting point.\n* It has certain antimicrobial activity.  Dilute solutions of silver nitrate can be used\nas disinfectants.  Silver-ions and silver compounds show a toxic effect on some\nbacteria, viruses, algae and fungi.  Its germicidal effects make silver utensils valued,\nand increase its value as jewelry.  The exact process of silver's germicidal effect is\nstill not well understood.\n* The name of the United Kingdom monetary unit 'pound' originally had the value of one\ntroy pound of sterling silver.\n* The words for 'silver' and 'money' are the same in at least 14 languages.\n* Hippocrates, the father of modern medicine, wrote that silver had beneficial healing\nand anti-disease properties, and the Phoenicians used to store water, wine, and vinegar\nin silver bottles to prevent spoiling.  In the early 1900s people would put silver\ndollars in milk bottles to prolong the milk's freshness.\n* Silver was believed to be a repellent against vampires; also, mirrors were originally\npolished silver, and as such, vampires allegedly cannot be seen in them because they\nhave no soul) and it was also believed that a werewolf, in his bestial form, could only\nbe killed by a weapon or bullet made of silver.  This has given rise to the term 'silver\nbullet', which is used to describe things that very effectively deal with one specific\nproblem."
            ),
            "Tiger's Eye",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tiger's Eye"
            )
          )
        ),
        "Fantastic Precious Materials",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Fantastic Precious Materials",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Adamant",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Adamant",
              ":summary",
              "* Requires: 10 carats of powdered blue diamonds and 1 pound of silver to create\n1 pound of Adamant."
            ),
            "Black Diamond",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Black Diamond"
            ),
            ":Mithril",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mithril",
              ":summary",
              "* A steel alloy that is as strong as steel with only half the weight.  It is extremely\ndifficult to forge even for master smiths, so it is extremely rare and valuable.",
              ":titles",
              "Elven Steel, Titanium Steel"
            ),
            ":Orichalcum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Orichalcum",
              ":reference",
              "* A legendary metal mentioned in several ancient writings, most notably the\nstory of Atlantis."
            )
          )
        ),
        "Religious Items",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Religious Items",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Holy Water",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Holy Water",
              ":summary",
              "* Holy Water consists of water with salt added that has been blessed in a ritual. Both water and salt are symbol of cleansing and disinfecting."
            )
          )
        ),
        "Musical Instruments",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Musical Instruments",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Banjo",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Banjo"
            ),
            ":Bells",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bells"
            ),
            ":Chime",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chime"
            ),
            ":Drums",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Drums"
            ),
            "Drums, Koto",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Drums, Koto"
            ),
            "Drums, Timpani",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Drums, Timpani"
            ),
            ":Gong",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gong"
            ),
            ":Guitar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Guitar"
            ),
            "Guitar, 12 String",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Guitar, 12 String"
            ),
            "Guitar, Electric",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Guitar, Electric"
            ),
            ":Flute",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flute"
            ),
            "Flute, Pan",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flute, Pan"
            ),
            ":Harmonica",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Harmonica"
            ),
            ":Harp",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Harp"
            ),
            ":Harpsicord",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Harpsicord"
            ),
            ":Horn",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Horn"
            ),
            "Horn, French",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Horn, French"
            ),
            ":Juiceharp",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Juiceharp"
            ),
            ":Lute",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lute"
            ),
            ":Mandolin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mandolin"
            ),
            ":Piano",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Piano"
            ),
            ":Pipes",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pipes"
            ),
            ":Recorder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Recorder"
            ),
            ":Sitar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sitar"
            ),
            ":Tambour",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tambour"
            ),
            ":Trombone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Trombone"
            ),
            ":Trumpet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Trumpet"
            ),
            ":Violin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Violin"
            )
          )
        ),
        ":Powders",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Powders",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Amnesia Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Amnesia Powder",
              ":titles",
              "Powder of Forgetfulness"
            ),
            "Blinding Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blinding Powder",
              ":summary",
              "Temporarily Blind a target."
            ),
            "Confusing Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Confusing Powder"
            ),
            "Dust of Disappearing Trail",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dust of Disappearing Trail",
              ":summary",
              "* Resettles an area to make it appear as if no one has been there in a long\ntime."
            ),
            "Dust of Dryness",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dust of Dryness",
              ":summary",
              "* Evaporates water on contact. Destroys up to level^2 liters of water."
            ),
            "Exploding Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Exploding Powder"
            ),
            "Flash Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flash Powder",
              ":summary",
              "* [Move]: Place a [Smoke] Terrain with 1 Duration Token on this unit's space."
            ),
            "Freezing Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Freezing Powder"
            ),
            "Hallucination Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hallucination Powder"
            ),
            "Incendiary Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Incendiary Powder",
              ":titles",
              "Dragon's Breath"
            ),
            "Iocaine Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Iocaine Powder",
              ":reference",
              "* What you do not smell is called iocane powder. It is odorless, tasteless, dissolves instantly in liquid,\nand is among the more deadlier poisons known to man. - Man in Black\n* Iocane comes from Australia, as everyone knows! And Australia is entirely peopled with criminals. - Vizzini",
              ":titles",
              "Arcenic Trioxide"
            ),
            "Irritating Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Irritating Powder",
              ":titles",
              "Itching Powder"
            ),
            "Noxious Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Noxious Powder",
              ":titles",
              "Powder of Nausea"
            ),
            "Paralysing Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Paralysing Powder"
            ),
            "Poison Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Poison Powder"
            ),
            "Powder of Desire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Powder of Desire",
              ":titles",
              "Aphrodisiac Powder"
            ),
            "Powder of False Death",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Powder of False Death",
              ":summary",
              "* A more powerful version of Sleeping Powder, that simulates death."
            ),
            "Powder of Fear",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Powder of Fear"
            ),
            "Powder of Rage",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Powder of Rage"
            ),
            "Sleeping Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sleeping Powder",
              ":titles",
              "Morphius Powder"
            ),
            "Smoke Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Smoke Powder"
            ),
            "Vertigo Powder",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Vertigo Powder"
            )
          )
        ),
        "Ritual Items",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Ritual Items",
          ":summary",
          "* holy oil, lamp, bell\n* [Dreamcatcher] - hung above the bed, is then used as a charm to protect sleeping children from nightmares. 'Only good dreams would be allowed to filter through. Bad dreams would stay in the net, disappearing with the light of day.'\n* Medicine Bag\n* Phylactery - An amulet to protect the wearer from harm, enclosing magical text, herbs, or relics.",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Athame",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Athame",
              ":reference",
              "As a masculine principle, it is often used in combination with the cup or Graal, as feminine principle, and evokes the act of procreation, as symbol of universal creativity.",
              ":summary",
              "* Symbolizes Air, the Mental, and Masculinity.  Air appears as nothing, can only be felt with subtle senses and never gripped and commanded.\n				        * A ritual dagger",
              ":titles",
              "Swords"
            ),
            ":Graal",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Graal",
              ":summary",
              "* Symbolizes Water, the Emotional, and Feminity.  The emotions are tidal like the the ocean, flowing like rivers and streams.\n* As a feminie principle, it is often used in combination with the dagger or Athame, as masculine principle, and evokes the act of procreation, as symbol of universal creativity.",
              ":titles",
              "Cup, Grail"
            ),
            "Mummified Hand",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mummified Hand"
            ),
            ":Pentacle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pentacle",
              ":image",
              "image/items/Pentacle.jpg",
              ":summary",
              "* Symbolizes Earth and the Physical\n* An amulet used in magical evocation, generally made of parchment, paper or metal, on which the symbol of a spirit or energy being evoked is drawn.  It is often worn around the neck, or placed within the triangle of evocation.  Protective symbols may also be included (sometimes on the reverse), a common one being the five-point Seal of Solomon.\n* The pentacle is always drawn in one continuous stroke, earning it the title the 'endless knot'.",
              ":titles",
              "Disks, Endless Knot, Stone"
            ),
            "Ritual Claw",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ritual Claw"
            ),
            "Shrunken Head",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shrunken Head"
            ),
            ":Thurible",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Thurible",
              ":titles",
              "Censer"
            ),
            ":Tool",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tool"
            ),
            ":Wand",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wand",
              ":summary",
              "Symbolizes Fire, Energy, and the Spirtual"
            )
          )
        ),
        ":Tools",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Tools",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Astrolabe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Astrolabe",
              ":summary",
              "* Astronomical computer for solving problems relating to time and the position of the Sun and stars in the sky.\nTo use an astrolabe, you adjust the moveable components to a specific date and time.  Once set, the entire sky,\nboth visible and invisible, is represented on the face of the instrument.  This allows a great many astronomical\nproblems to be solved in a very visual way.\n* Typical uses of the astrolabe include finding the time during the day or night, finding the time of a celestial\nevent such as sunrise or sunset and as a handy reference of celestial positions."
            ),
            ":Compass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Compass"
            ),
            "Jeweler's Loop",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Jeweler's Loop"
            ),
            ":Key",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Key"
            ),
            ":Lodestone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lodestone"
            ),
            "Magifying Glass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Magifying Glass"
            ),
            "Magifying Glasses",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Magifying Glasses"
            ),
            "Magifying Lenses",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Magifying Lenses"
            ),
            ":Monicle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Monicle"
            ),
            ":Pendulum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pendulum"
            ),
            ":Prism",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Prism"
            ),
            ":Scales",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scales"
            ),
            ":Sextant",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sextant"
            ),
            ":Telescope",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Telescope",
              ":titles",
              "Spy Glass"
            ),
            ":Weathervane",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Weathervane"
            ),
            ":Whistle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Whistle"
            )
          )
        ),
        ":Traps",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Traps",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Caltrops",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Caltrops"
            ),
            "Nightengail Floor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nightengail Floor",
              ":reference",
              "Nijo Castle - Kyoto, Japan",
              ":summary",
              "* Floors designed to make a chirping sound when walked upon assuring that none could sneak through the corridors\nundetected.  Dry boards naturally creak under pressure, but these floors were designed so that the flooring nails\nrubbed against a jacket or clamp, causing chirping noises.",
              ":titles",
              "Uguisubari"
            ),
            "Pressure Plate",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pressure Plate"
            ),
            ":Tanglewire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tanglewire"
            ),
            ":Trapdoor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Trapdoor"
            ),
            ":Tripwire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tripwire"
            )
          )
        ),
        ":Vehicles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Vehicles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Airship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Airship"
            ),
            ":Barge",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Barge"
            ),
            ":Coracle",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Coracle"
            ),
            ":Duneship",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Duneship"
            ),
            "Ice Schooner",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ice Schooner"
            ),
            ":Palanquin",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Palanquin"
            ),
            ":Skiff",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Skiff"
            ),
            "Wagon, Enclosed",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Wagon, Enclosed"
            ),
            "Wagon, Open",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Wagon, Open"
            )
          )
        ),
        "Unfiled Gear",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Unfiled Gear",
          ":summary",
          "* Acid\n* Alabaster\n* Barricade\n* Blood\n* Cage\n* Chariot\n* Conch Horn\n* Fireworks\n* Trumpet\n* War Machine\n\n!Symbols\n* Banner\n* Coat of Arms\n* Crest\n* Crown\n* Fasces\n* Helix\n* Rod\n* Scepter\n* Signet\n* Standard\n* Thyrsus\n\n!Arcane Items\n* Airship\n* Armageddon Clock\n* Flying Carpet\n\n!Containers\n* Chest\n* Cauldron\n* Coffer\n* Goblet\n* Jar\n* Puzzle Box\n* Vat\n* Vessel\n\n!Technology\n* [Blinding Bulb]\n* [Phone Tap]]\n* [Shotgun Microphone]\n* [Sleepteacher]\n* [Subliminal Broadcaster]\n* [Surveillance Cameras]\n* [Telephoto Lens]",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Beast Claw",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Beast Claw"
            ),
            ":Tooth",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tooth"
            ),
            "Vampire Blood",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Vampire Blood",
              ":summary",
              "* Black Token\n* Drinking Vampire Blood is addictive and creates a psychological dependency on the original Vampire called the [[Blood Bond]].\n* [Move] - Vampiric Healing - Remove a Vampire Blood Token and remove another Token of your choice.\n* [Move] - Vampiric Strength - Remove a Vampire Blood Token and gain +1 Melee for 3 turns.\n* [Move] - Vampiric Speed - Remove a Vampire Blood Token and gain +1 Initiative and +1 Move for 3 turns.\n* [Move] - Vampiric Fortitude - Remove a Vampire Blood Token and gain +1 Physical Armor for 3 turns."
            ),
            "Healing Salve",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Healing Salve"
            ),
            ":Lattice",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lattice"
            ),
            ":Mirror",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mirror"
            ),
            ":Matrix",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Matrix"
            ),
            ":Candle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Candle"
            ),
            ":Screen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Screen"
            ),
            ":Array",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Array"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_gear_overview
   * @return {chapter}
   */
  static t_chapter_gear_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_gear_overview = {
    vx_type: nx_tactics_books_gear.t_chapter_gear_overview
  }

  // (func chapter_gear_overview)
  static f_chapter_gear_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Gear Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Gear?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Gear?"
        )
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_gear.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Gear",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Gear Overview",
        nx_tactics_books_gear.f_chapter_gear_overview(),
        "Gear Construction",
        nx_tactics_books_gear.f_chapter_gear_construction(),
        "Gear Items",
        nx_tactics_books_gear.f_chapter_gear_items()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_gear_construction": nx_tactics_books_gear.e_chapter_gear_construction,
      "chapter_gear_items": nx_tactics_books_gear.e_chapter_gear_items,
      "chapter_gear_overview": nx_tactics_books_gear.e_chapter_gear_overview,
      "tacticsbook": nx_tactics_books_gear.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_gear_construction": nx_tactics_books_gear.t_chapter_gear_construction,
      "chapter_gear_items": nx_tactics_books_gear.t_chapter_gear_items,
      "chapter_gear_overview": nx_tactics_books_gear.t_chapter_gear_overview,
      "tacticsbook": nx_tactics_books_gear.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/gear",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_gear_construction)
    nx_tactics_books_gear.t_chapter_gear_construction['vx_value'] = {
      name          : "chapter_gear_construction",
      pkgname       : "nx/tactics/books/gear",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_gear.f_chapter_gear_construction
    }

    // (func chapter_gear_items)
    nx_tactics_books_gear.t_chapter_gear_items['vx_value'] = {
      name          : "chapter_gear_items",
      pkgname       : "nx/tactics/books/gear",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_gear.f_chapter_gear_items
    }

    // (func chapter_gear_overview)
    nx_tactics_books_gear.t_chapter_gear_overview['vx_value'] = {
      name          : "chapter_gear_overview",
      pkgname       : "nx/tactics/books/gear",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_gear.f_chapter_gear_overview
    }

    // (func tacticsbook)
    nx_tactics_books_gear.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/gear",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_gear.f_tacticsbook
    }

  }
}
