'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_magic {

  /**
   * @function chapter_magic_items
   * @return {chapter}
   */
  static t_chapter_magic_items = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magic_items = {
    vx_type: nx_tactics_books_magic.t_chapter_magic_items
  }

  // (func chapter_magic_items)
  static f_chapter_magic_items() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Magic Items",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Garb",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Garb",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Fox Mask",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fox Mask"
            ),
            "Oni Mask",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Oni Mask"
            )
          )
        ),
        "Miscellaneous Magic",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Miscellaneous Magic",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Fan of the Winds",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fan of the Winds"
            )
          )
        ),
        "Magic Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Magic Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Ascalan Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ascalan Lance",
              ":reference",
              "* The lance (or in some versions of the story, sword) that Saint George used to slay the dragon, named after the city Ashkelon.",
              ":titles",
              "Dragon Slayer Lance"
            ),
            ":Firebrand",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Firebrand",
              ":titles",
              "Flame Tongue"
            ),
            ":Frostbrand",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Frostbrand"
            ),
            ":Moonblade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Moonblade",
              ":titles",
              "A silver sword that is as hard as steel"
            ),
            "Poseidon's Net",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Poseidon's Net"
            ),
            "Poseidon's Trident",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Poseidon's Trident"
            ),
            ":Runestaff",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Runestaff",
              ":summary",
              "* A staff with one or more Runes incribed upon it."
            ),
            ":Runesword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Runesword",
              ":summary",
              "* A sword with one or more Runes incribed upon it."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_magic_overview
   * @return {chapter}
   */
  static t_chapter_magic_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magic_overview = {
    vx_type: nx_tactics_books_magic.t_chapter_magic_overview
  }

  // (func chapter_magic_overview)
  static f_chapter_magic_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Magic Overview",
      ":summary",
      "* The Art\n\nClassifications\n* Abjuration - Protective Magic.  They create barriers, negate abilities, harm\ntrespassers, or banish those who do not\nbelong.  It includes Barriers and Wards."
    )
    return output
  }

  /**
   * @function chapter_magical_skills
   * @return {chapter}
   */
  static t_chapter_magical_skills = {
    vx_type: vx_core.t_type
  }
  static e_chapter_magical_skills = {
    vx_type: nx_tactics_books_magic.t_chapter_magical_skills
  }

  // (func chapter_magical_skills)
  static f_chapter_magical_skills() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Magical Skills",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Magic Items",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Magic Items",
          ":summary",
          "* Magic Weapons ignore armor equal to their + value.\n* Magic Armor ignores damage equal to their + value."
        ),
        "Arcane Magic",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Arcane Magic",
          ":reference",
          "* Magic/Magick is not capable of producing 'miracles' or violating the physical laws of the universe (e.g., it cannot cause a solar eclipse), although it is theoretically possible to cause in any object any change of which that object is capable by nature - Aleister Crowley\n* Every intentional (Willed) act is a Magical act. - Aleister Crowley\n* Magick is the Science of understanding oneself and one's conditions. It is the Art of applying that 	understanding in action. - Aleister Crowley",
          ":summary",
          "* Those who pursue the arcane arts believe that by aligning their own minds to the patterns of reality, they may turn those patterns to their own ends.\n* Many believe that one must Awaken before being able to wield Magic.\n* Arcanists focus on the will of the individual to bend the world to their desires. This individual supremicist viewpoint is typically reflected in their egos as well.",
          ":titles",
          "Arcanist",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Alchemy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Alchemy",
              ":summary",
              "* Alchemy is the art of creating acids, dusts, philter, and potions.\n* Benefits: Alchemical substances may be prepared ahead of time, used by others, and sold for profit. Their signature talent is the creation of the Philosopher's Stone that transmutes lead into gold. Because their talents benefit others, Alchemists are in high demand.\n* Penalties: Alchemical substances MUST be prepared ahead of time and require exotic ingredients. Their preparation normally requires the use of a laboratory and special equipment (See Equipment / Alchemical Devices).",
              ":titles",
              "Alchemist, Apothecary, Brewer, Chemist, Concocter, Drug Merchant, Libationist, Potioner, Snake Oil Salesman, Witcher",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animate Colossus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animate Colossus"
                ),
                "Animate Homunculus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animate Homunculus"
                ),
                "Animate Statue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animate Statue",
                  ":reference",
                  "* Terra Cotta Warriors\n* Kali - The Golden Voyage of Sinbad"
                ),
                "Ashes to Ashes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ashes to Ashes",
                  ":summary",
                  "* Force a substance to age as if hundreds of years had passed.  Stone wears to powder, wood turns to ashes, metal\ncorrodes, colors fade."
                ),
                "Exract Rare Earths",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Exract Rare Earths",
                  ":summary",
                  "* Rare Earths are the most important of all alchemical ingredients because they are the catalysts that unleash the\ninnate powers of other ingredients.\n* To those without Alchemical skill, they are indistinguishable from normal soil or sand.  An Alchemist, however,\nmay tell the difference and may extract [Hits] drams of Rare Earths from any soil in an hour."
                ),
                "Forge Orichalcum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forge Orichalcum",
                  ":summary",
                  "* See Equipment / Metals / Orichalcum"
                ),
                "Forge Rebis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forge Rebis",
                  ":summary",
                  "* The Rebis (from the Latin res bina, meaning dual or double matter) is the end product of the alchemical magnum opus or great work.\n* After one has gone through the stages of putrefaction and purification, separating opposing qualities, those qualities are united once more in what is sometimes described as the divine hermaphrodite, a reconciliation of spirit and matter, a being of both male and female qualities as indicated by the male and female head within a single body. The sun and moon correspond to the male and female halves, just as the Red King and White Queen are similarly associated."
                ),
                ":Imbue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Imbue"
                ),
                "Magnum Opus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnum Opus",
                  ":summary",
                  "* The process of working with the prima materia to create the philosopher's stone. It has been used to describe personal and spiritual transmutation.\n* Prima Materia - The ubiquitous starting material required for the magnum opus. It is the primitive formless base of all matter similar to chaos, the quintessence or aether.\n* Process philosophy - An approach to philosophy that identifies processes, changes, or shifting relationships as the only true elements of the ordinary, everyday real world. It treats other real elements (examples: enduring physical objects, thoughts) as abstractions from, or dependents on, processes.\n* Stages of the Magnum Opus\n** Nigredo - The blackening or melanosis means putrefaction or decomposition. After gathering the Prima Materia, the material and the Alchemist must undergo putrefactio. The material is processed until it turns completely black. This is by far the longest and most difficult stage. It is often known as the 'dark night of the soul.' We are being asked to let go of all within us and outside of us that is not in full alignment with the truth of who we are. This is a truth as it exists on a soul level, far beyond the ego and its limited ideas or illusions about who we 'should' be. It is made far more difficult by the resistance and defenses we put up against it. Many of us will resist for years, remaining unwilling to accept that our lives, as we know them, are over. Few of us are quick to grasp the fact that there is new life waiting for us if we would only let go of the limited vision of existence we usually try so desperately to cling to. It is only when we become willing to surrender that the alchemical process truly begins. Only when we are willing to die do we have the chance to one day be reborn.\n** Albedo - The whitening or leucosis is the perfect purification. The material is further processed removing all blackness until only pure white remains. Then it is said that life has conquered death, that the king has been revived. When one has purified his awareness of Self, during meditation, by eliminating thoughts, or otherwise, then at a certain point, light appears. The light that appears is also metaphoric for an absolute clear, pure awareness of Self. In that state one is in a very fixed position, that is, very stable, very much in the here and now, in total clarity of Self. In Whiteness, the material has attained a degree of Fixedness that fire cannot destroy.\n** Rubedo - The reddening, purpling, or iosis. When the White stone or the White Elixir has been made, it needs to purified further, sublimated, until the material becomes totally Fixed and is completely stable. Then we have the Red Sulfur, the red stone, the Red Elixir, the Stone of the Wise. When the divine light has emerged during meditation, one needs to make it last. this demands a continued effort of holding one's attention to this pure awareness, not only for the length of the meditation session, but also during every day life. At a certain point the pure awareness of one's divine self will be permanent.",
                  ":titles",
                  "The Great Work"
                ),
                "Prepare Alchemical Substance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Alchemical Substance",
                  ":summary",
                  "* Each substance requires a separate ability to be taken.\n* See Equipment / Alchemical Substances"
                ),
                "Prepare Medicine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Medicine",
                  ":summary",
                  "* Each medicine requires a separate ability to be taken.\n* See Equipment / Medicines"
                ),
                "Prepare Powder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Powder",
                  ":summary",
                  "* Each powder requires a separate ability to be taken.\n* See Equipment / Powders"
                ),
                "Transmute State",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transmute State",
                  ":reference",
                  "* Supposedly, the ancient Egyptians could create ice from water by placing water out under the stars.",
                  ":summary",
                  "* Force a substance to make a minor state change (e.g. Liquids become solids, soft substances turn to liquid, hard substances become soft, water evaporates, ice melts."
                )
              )
            ),
            ":Artifice",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Artifice",
              ":summary",
              "* Synergy with Mechanics",
              ":titles",
              "Artificer, Engineer, Inventor, Inventress, Machinist, Mechanic",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Construct Automaton",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Construct Automaton",
                  ":reference",
                  "* Minaton - Sinbad and the Eye of the Tiger",
                  ":summary",
                  "* Purpose - When constructing an Automaton, it must be given one or more purposes. These are similar to skills, for example: Farming, Construction, Medicine, Melee, Ranged Combat, Strength, etc. The purpose must be trained by an expert in the field and an extended roll determines the level of the Skill. Once the level is determined, specialties and abilities may be chosen equal to the level."
                ),
                "Construct Balloon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Construct Balloon"
                ),
                "Construct Device",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Construct Device"
                ),
                "Construct Flying Machine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Construct Flying Machine"
                ),
                "Construct Machina",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Construct Machina"
                ),
                ":Firepower",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Firepower",
                  ":summary",
                  "* Temporarily increase the damage done by a mechanical weapon."
                ),
                "Fulfill your Purpose",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fulfill your Purpose",
                  ":reference",
                  "* Bomb, this is Lt. Doolittle. You are NOT to detonate in the bomb bay. I repeat, you are NOT to detonate in the bomb bay! - Dark Star",
                  ":summary",
                  "* Machines want nothing more than to fulfill their designed purpose, so it is simple to convince them to perform this purpose, even when it is not supposed to."
                ),
                "Ghost in the Shell",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ghost in the Shell"
                ),
                "Imbued Nails",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Imbued Nails",
                  ":summary",
                  "* Empower nails to produce massive splitting damage when struck."
                ),
                ":Invention",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Invention"
                ),
                ":Haywire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Haywire"
                ),
                ":Malfunction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Malfunction"
                ),
                "Override Machine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Override Machine"
                ),
                "Speak with Machines",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speak with Machines"
                )
              )
            ),
            ":Astrology",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Astrology",
              ":summary",
              "* Astrology is the study of the [Stars] and the [Astral Realm]\n* Planetary days: Each day of the year is related to one of the planets, the moon and the sun. Energies differ in accordance with the position of the planets.\n* Lunar cycle: The cycle of the visible phase of the moon. This is a very powerful time for ritual ceremonies to be preformed.",
              ":titles",
              "Astrologer, Astromancer, Celestial Magic, Stargazer",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Aim of Sagittarius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Aim of Sagittarius",
                  ":summary",
                  "* [Action]: Target gains [Synergy] for the next ranged [Attack]."
                ),
                "Astral Projection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astral Projection",
                  ":image",
                  "Units/Magic/AstralProjection.jpg",
                  ":summary",
                  "* [Action]: Body fall unconscious with Spirit enters the [Spirit Realm].  The Spirit may travel as long as it wants, but if no one tends to the Body, it will die of dehydration in 3 days.\n* [Death]: At the moment of death, Spirit may permanently enter the [Spirit Realm]."
                ),
                "Astral Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astral Sight"
                ),
                "Astral Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Astral Ward"
                ),
                "Balance of Libra",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Balance of Libra",
                  ":summary",
                  "* [Action]: Place the Balance of Libra card on this unit. At any time you may discard the Balance of Libra card to cause a unit that has done damage to you to immediately suffer the same amount of damage."
                ),
                "Calm of Cancer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calm of Cancer",
                  ":summary",
                  "* [Action]: Targets ignore all [Mind] penalties for the duration of this\nability."
                ),
                "Celestial Convergence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Celestial Convergence"
                ),
                "Chariot of the Sun",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chariot of the Sun",
                  ":summary",
                  "* [Extended Action]: At dawn, if the sun is visible, summon a blazing chariot with horses of flame that can carry the user and up to level passengers high into the sky all day. At sunset, the chariot lands anywhere the user chooses where the sun is visible."
                ),
                "Charm of Virgo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Charm of Virgo",
                  ":summary",
                  "* [Action]: Gain [Synergy] on unit's next communication skill. Duration 1\nturn."
                ),
                "Cleansing of Aquarius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleansing of Aquarius",
                  ":reference",
                  "* Aquarius is not a water sign. It's an air sign. The mix up often comes about from Aquarius' overarching symbol, the water-bearer.",
                  ":summary",
                  "* [Action]: Remove X [Poison], [Disease], or [Corruption] cards from the target."
                ),
                "Courage of Leo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Courage of Leo",
                  ":summary",
                  "* [Action]: Remove X [Retreat] tokens from all target in range."
                ),
                ":Daybreak",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Daybreak",
                  ":summary",
                  "* Banishes fatigue in diurnal (daytime) creatures.\n* Causes noturnal creatures to fall asleep."
                ),
                "Déjà Vu",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Déjà Vu",
                  ":summary",
                  "* You have seen this situation before and are not surprised by it.\n* [Action]: The next time you are [Suprised], ignore all penalties for [Surprise]."
                ),
                "Depth of Pisces",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Depth of Pisces",
                  ":summary",
                  "* [Extended Action]: Gain [Synergy] on the next [Search], [Research], or\n[Investigation] [Action]."
                ),
                "Determination of Aries",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Determination of Aries",
                  ":summary",
                  "* [Action]: Target ignores all movement penalties (including terrain) for\nthe duration of this effect."
                ),
                "Duality of Gemini",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Duality of Gemini",
                  ":summary",
                  "* [Action]: Take on a different personality with different mannerisms. This can be the basis for a very convincing disguise."
                ),
                ":Eclipse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eclipse",
                  ":summary",
                  "* [Extended Action]: Predict where, when, and the intensity of the next solar or lunar eclipse. The eclipse is very impressive to others and is almost always tied to important mystical events.\n* Both the Solar Eclipse and Lunar Eclipse (Blood Moon) provide the following benefits or penalties: +2 [Astrology], +2 [Black Magic]. +1 [Sorcery], -1 [Thergy], -1 [Nature Magic]"
                ),
                "Eye of Jupiter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye of Jupiter"
                ),
                "Full Moon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Full Moon"
                ),
                "Hand of Fate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hand of Fate"
                ),
                "Hide from the Stars",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hide from the Stars",
                  ":summary",
                  "* Protects from the divinations of others."
                ),
                "Meteor Shower",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Meteor Shower",
                  ":summary",
                  "* [Extended Action]: Call meteors",
                  ":titles",
                  "Starfall"
                ),
                "Moon Bridge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Moon Bridge",
                  ":summary",
                  "* Opens a bridge to the Ethereal version of the Moon."
                ),
                "New Moon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "New Moon"
                ),
                "Ring of Saturn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ring of Saturn"
                ),
                "Secrets of Scorpio",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Secrets of Scorpio",
                  ":summary",
                  "* [Extended Action]: Learn a secret about a subject."
                ),
                "Star of Ill Omen",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Star of Ill Omen"
                ),
                ":Stargazing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stargazing"
                ),
                ":Starsight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Starsight",
                  ":summary",
                  "* See clearly at night while under the stars."
                ),
                "Steadiness of Capricorn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Steadiness of Capricorn",
                  ":summary",
                  "* [Action]: Target gains [Synergy] for the next physical, non-attack [Action]."
                ),
                ":Sunlight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sunlight",
                  ":summary",
                  "* [Action]: Cause a light the unit holds to become bright sunlight. The light produces warmth like a campfire and will cause damage to creatures harmed by sunlight."
                ),
                "Waning Moon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waning Moon"
                ),
                "Waxing Moon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waxing Moon"
                ),
                "Will of Taurus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Will of Taurus",
                  ":summary",
                  "* [Action]: Targets ignore all attack penalties for the duration of this ability."
                ),
                "Written in the Stars",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Written in the Stars",
                  ":summary",
                  "* [Action]: Foresee a random event that will happen in [Time] level."
                )
              )
            ),
            ":Chronomancy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Chronomancy",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Delay",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Delay"
                ),
                "Reverse Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reverse Time",
                  ":reference",
                  "* If I could turn back time... - Cher"
                ),
                "Slow Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slow Time"
                ),
                "Temporal Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Temporal Vision"
                ),
                "Tempus Fugit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tempus Fugit",
                  ":summary",
                  "* Speeds time in an area",
                  ":titles",
                  "Time Flies"
                ),
                "Time Heals All Wounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Heals All Wounds",
                  ":summary",
                  "* After healing the physical effects of a wound, the ability can remove the mental scars by actually removing the wounds from the past. The level of the ability determines the number of years in the past from which the wound is erased. If the entire history is erased the wound will have never occurred and no one will remember it except the caster. The person's life history is rewritten without the wound. This can result in significant changes if the wound was debilitating. The power of this ability ensures that any changes will never be worse than the current situation."
                ),
                "Time Shift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Shift"
                ),
                "Time Stop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Stop",
                  ":titles",
                  "Time Freeze"
                ),
                "Wall of Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Time"
                ),
                "Warp Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Warp Time",
                  ":reference",
                  "* Let's do the Time Warp again... - The Rocky Horror Picture Show",
                  ":titles",
                  "Time Warp"
                )
              )
            ),
            ":Conjuration",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Conjuration",
              ":summary",
              "* Conjuration is the art of creating things directly from the imagination. Conjured items are relatively fragile and erode quickly with use, but otherwise will last indefinitely. An item is perfectly visualized and then drawn into reality from the Astral Realm. Conjuration is similar to [Illusion], but its creations are real though they are rarely permanent.\n* Action: Check Skill vs. the Value of the item to create. If successful, the item can be used a number of times equal to the result before disintegrating. If the user has a specialty with an item, that specialty may be applied to the check.\n* Benefits - Conjuration is the natural ability of the Astral Realm and Dream Realm. All abilities are +1 in these Realms.\n* Limitations - Creation magic is exceedingly difficult with only relatively minor creations possible. The process of Conjuration is different from natural things, so all Conjured things have some imperfection or mark that distinquishes itself from a natural thing.\n* Concidental - Conjuring in ways that appear like the object was already there is [Coincidental Magic]. E.g. Drawing an illusionary sword from a real scabbard.",
              ":titles",
              "Conjurer, Creation, Creator, Manifestation",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Conjure Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conjure Weapon",
                  ":summary",
                  "* Conjure a weapon out of thin air.\n* [Limited]: By the user's skill in the weapon created."
                )
              )
            ),
            ":Divergence",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Divergence",
              ":summary",
              "* The opposite of Convergence, Divergence specializes on objects moving apart.",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Amplify Repulsion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Amplify Repulsion",
                  ":summary",
                  "* Massively increase the repulsive force between two objects. This can increase magnetic repulsion and also increase the movement of two objects that have just collided to increase Knockback."
                ),
                "Pressor Force",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pressor Force",
                  ":summary",
                  "* Apply low but steady pressure pushing an object away."
                )
              )
            ),
            "Paper Magic",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Paper Magic",
              ":titles",
              "Ofuda",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Binding Paper",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Binding Paper"
                ),
                "Binding Symbol",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Binding Symbol"
                ),
                "Giant Kite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Giant Kite"
                ),
                "House of Cards",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "House of Cards"
                ),
                "Paper Airplane",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Airplane"
                ),
                "Paper Crane",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Crane"
                ),
                "Paper Darts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Darts"
                ),
                "Paper Doll",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Doll"
                ),
                "Paper Dragon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Dragon"
                ),
                "Paper Flurry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Flurry"
                ),
                "Paper Mache",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Mache"
                ),
                "Paper Plane",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Plane"
                ),
                "Paper Shuriken",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Shuriken"
                ),
                "Paper Snowflake",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Snowflake"
                ),
                "Paper Tiger",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paper Tiger"
                ),
                ":Pinwheel",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pinwheel"
                )
              )
            ),
            ":Sorcery",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Sorcery",
              ":reference",
              "* This is forbidden. This is a summoning. I cannot speak this!... There is no light here. You came to the darkness for knowledge... And all the knowledge you seek is here. Surrender. Speak the words. Call her home. By three thay come. By three thy way opens. By the blood of the willing. We call thee home. Hail, daughter of hatred. Hail, Lilith. - Diablo IV",
              ":titles",
              "Sorcerer, Sorceress, Sorceress Queen, Summoner",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Banishment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Banishment",
                  ":summary",
                  "* [Action]: Return any [Outsider] to its original realm. This ability may only be attempted on a particular being once per month."
                ),
                ":Binding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Binding",
                  ":summary",
                  "* Any subject successfully summoned is attuned to the caster and is subject to a binding. The caster may bind immediately or parley first and use the binding as a threat.\n* [Requires]: The caster must describe the subject's past in detail and name his/her demands. If the description is in error or the demand cannot be completed, the Binding automatically fails.\n* [Action]: If successful, the caster will know the subject is bound and it will perform the demand to the letter, but the subject is unwilling and will seek to defeat the caster's wishes through semantics or in passive/agressive ways."
                ),
                "Binding Contract",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Binding Contract",
                  ":summary",
                  "* Like [Binding], any subject successfully summoned is attuned to the caster and is subject to a binding. The caster may parley and use the binding to enforce an agreement.\n* [Requires]: The caster must name his/her demands and offer compensation to the subject. They may then negotiate for as long as desired.\n* [Action]: If the subject refuses to bargain, the caster may still cast or threaten a [Binding]. If the subject agrees to the bargain, the subject and the caster are automatically bound to the terms of the bargain, and both must fulfill their commitments or be immediately subject to a [Summoning] and automatically successful forced [Binding] (even if neither party has these abilities)."
                ),
                "Containment Jar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Containment Jar",
                  ":reference",
                  "* Evil Containment Wave - Dragon Ball",
                  ":summary",
                  "* A summoned being may be captured in a special container that permanently imprisons the creature.\n* The being in the jar can telepathically communicate with anyone touching the jar. If the jar is broken, the being is immediately freed. The being may bargain for its freedom, and if it does so, it must fulfill its bargain.\n* Imprisonment in a jar can be used as a threat or the caster may simply imprison the being to be used later.",
                  ":titles",
                  "Soulbind"
                ),
                "Create Elder Sign",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Create Elder Sign"
                ),
                "Daedalus Gateway",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Daedalus Gateway",
                  ":summary",
                  "* A subtle gate that moves a person to a different Realm without them realizing. Both locations must be nearly identical."
                ),
                "Dimension Door",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimension Door",
                  ":summary",
                  "* Cross through a doorway or arch of some sort and appear through another similar arch some distance away."
                ),
                "Dimensional Gateway",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Gateway",
                  ":summary",
                  "* Open a portal to another dimension."
                ),
                ":Gateway",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gateway",
                  ":summary",
                  "* Open a portal to another location."
                ),
                ":Pentagram",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pentagram",
                  ":summary",
                  "* A Triangle enclosed in a circle. A double triangle will form a Pentagram.\n* The five points represent the four elements with the spirit presiding at the top. The triangles form a doorway.\n* Time allowing, it is usually meticulously inscribed and used with a [Protective Circle].\n* It serves to contain any being (and its minions) summoned by the caster.\n* It provides defense equal to the success roll versus any being (and its minions) summoned by the caster. This defense applies to ALL attempts to act across the Pentagram. If an attack exceeds the defense of the Pentagram, the defense reduces by one.",
                  ":titles",
                  "Binding Circle, Devil's Door, Thaumaturgic Triangle"
                ),
                ":Protection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Protection",
                  ":summary",
                  "* A protective barrier inscribed on the ground to protect the caster from summoned beings (usually his own).\n* A typical size for a circle is nine feet in diameter, though the size can vary depending on the purpose of the circle.\n* Some practitioners choose to mark the physical boundary of their circle, either before or prior to the actual casting. This can be done using a cord, a chalk line, a line drawn in the soil, or small objects such as stones.\n* Some practitioners mark the four cardinal points with candles, either white, or of colors representative of the elements:\n** North: green for the element of Earth\n** East: yellow for the element of Air\n** South: red for the element of Fire\n** West: blue for the element of Water\n* Cutting a door - The barrier is fragile and sensitive to things passing through it. Leaving or passing through the circle often weakens or dispels the barrier. This is referred to as 'breaking the circle'. Practitioners should not leave the circle unless absolutely necessary. In order to leave a circle and keep it intact, a door must be cut in the energy of the circle. Using the athame, a doorway is cut in the circle, at which point anything may pass through without harming the circle. This opening must be closed afterwards by reconnecting the lines of the circle.",
                  ":titles",
                  "Circle of Protection, Protective Circle"
                ),
                "Soul Pact",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Soul Pact",
                  ":summary",
                  "* Death: Enter a specified Demon Realm. This ability is automatic and is not optional."
                ),
                "Summon Demon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Demon",
                  ":titles",
                  "Demonic Summoning"
                ),
                "Summon Devil",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Devil",
                  ":titles",
                  "Diabolic Summoning"
                ),
                "Summon Familiar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Familiar",
                  ":reference",
                  "* Animal companions, such as cats, that are either trained to assist in magic, or are used as a mascot.",
                  ":summary",
                  "* Summon an animal shaped familiar spirit to serve as a companion, servant, spy, etc.\n* The Familiar is highly intelligent and must be bargained with before it agrees to serve.\n* Duration: Indefinite.\n* The Familiar will age with its master.\n* The Familiar can gain abilities that its master possesses.\n* Three mystic cords are constructed to link the Familiar to its master.\n** Golden Cord - Connects magical abilities.\n** Silver Cord - Connects the minds.\n** Bronze Cord - Connects the bodies.\n!Familiar Skills\n* Shapechange to Human Form\n* Giant Growth (Self)\n* Communicate with Master\n* Speech"
                ),
                "Summon Item",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Item",
                  ":summary",
                  "* A single item may be attuned to a summoning.  Later that item may be summoned to the owner's hand."
                )
              )
            ),
            ":Thaumaturgy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Thaumaturgy",
              ":summary",
              "* The interface between Magic and Science. Mathematics, Biology, Geology and Chemistry are studied to manifest amazing creations.\n* Thaumaturgy can create permanent artificial life.\n* Thaumaturgy favors crytals and gemstones for power supplies.",
              ":titles",
              "The Art Mathematical, Wonder Working",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Create Homonculus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Create Homonculus"
                ),
                "Prepare Lightning in a Bottle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prepare Lightning in a Bottle",
                  ":summary",
                  "* Create [Lightning in a Bottle]."
                )
              )
            ),
            ":Wizardry",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Wizardry",
              ":summary",
              "* Conventional Wizardry believes that everything in the universe holds massive energy potential waiting to be unleashed.\n* Wizardry is the study of Magic itself. As such it is a sort of meta-Magic, focused on altering magical energies.",
              ":titles",
              "Archmagi, Magi, Wizard",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Analyze Magic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Analyze Magic",
                  ":summary",
                  "* Gain understanding of a magical item or effect."
                ),
                ":Counterspell",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Counterspell",
                  ":summary",
                  "* [Interrupt]: Roll a defense roll against a magical ability. If the defense succeeds, the ability has no effect."
                ),
                ":Dampen",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dampen",
                  ":summary",
                  "* Magic can easily be reduced since magic already has a tentative hold on reality."
                ),
                ":Dispel",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dispel",
                  ":summary",
                  "* Attack a placed magical ability.  Each hit weakens its abilities."
                ),
                ":Fork",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fork",
                  ":summary",
                  "* Duplicate an allied caster's magical ability. The other caster fully\ncontrols both abilities but may not aim both at the same target."
                ),
                ":Magnify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnify",
                  ":summary",
                  "* Magnify draws from the potential energy in all things to increase the power in an existing force.\n* Note: Magic cannot be magnified. Magic only simulates reality and has no hidden reserves to tap.\n!Examples\n* An arrow can hit with devastating force.\n* A bird's weight can be increased so it falls.\n* A fire can be enhanced into an inferno while not burning fuel faster or producing additional smoke. The fuel has near infinite reserves to draw upon."
                ),
                "Mana Burn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mana Burn"
                ),
                "Mana Leak",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mana Leak"
                ),
                "Mana Shield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mana Shield",
                  ":summary",
                  "* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: Protected with level Armor from all [Physical] [Damage]."
                ),
                "Mirror Shield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror Shield",
                  ":summary",
                  "* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: If defender was targetted by an [Energy] attack lower than level, the Attacker also suffers the attack.\n* Wall that reflects attacks back to its source."
                ),
                "Mirror Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror Wall",
                  ":summary",
                  "* Wall that reflects [Energy] attacks lower than level back to their source. Any attack higher than level will destoy the Wall."
                ),
                "Paradigm Shift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paradigm Shift",
                  ":summary",
                  "* Change one rule of nature for a moment."
                ),
                "Power Sink",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Sink"
                ),
                "Power Surge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Surge"
                ),
                ":Redirect",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Redirect",
                  ":summary",
                  "* [Reaction]: Redirect an Energy or Physical Ranged attack that has a single target to another target."
                ),
                ":Stasis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stasis",
                  ":summary",
                  "* Place an equal number of White Stasis Tokens on yourself and your target."
                ),
                "White Noise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "White Noise",
                  ":summary",
                  "Sounds are garbled preventing eavesdropping"
                ),
                "Wizard Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wizard Armor",
                  ":summary",
                  "* Defense against Energy that creates [Feedback]."
                ),
                "Wizard Lock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wizard Lock",
                  ":summary",
                  "* Wizard Lock alters an existing magical effect by freezing it in place. It becomes permanent until dispelled, but it no longer has an active effect. In this way a wall of fire would be a permanent wall that does not move or produce heat. This is often used to make a seal last indefinitely."
                )
              )
            )
          )
        ),
        "Black Magic",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Black Magic",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Blood Magic",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Blood Magic",
              ":summary",
              "* Each use of Blood Magic requires a blood sacrifice. The user immediately suffers one [Blood Loss], or if a captured sacrifice is available, the user may instead use the blood of the sacrifice.\n* Blood magic is a favorite of Vampires who can recover from [Blood Loss] quickly.",
              ":titles",
              "Blood Brother, Blood Mage, Blood Witch, Vampire",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blood Bath",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Bath",
                  ":summary",
                  "* Bathe in the blood of of the young and healthy. Gain [Vampiric Blood] (even if not a [Vampire]) equal to the number of victims drained up to [Blood Magic]."
                ),
                "Blood Bind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Bind"
                ),
                "Blood Blade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Blade",
                  ":summary",
                  "* Create a sword, knife, or axe from blood. Blood Weapons always cause [Bleeding]."
                ),
                "Blood Borne",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Borne",
                  ":summary",
                  "* Target: [Bleeding]. Apply [Sickness] to a [Bleeding] target."
                ),
                "Blood Brother",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Brother"
                ),
                "Blood Feud",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Feud"
                ),
                "Blood Lust",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Lust",
                  ":summary",
                  "* Action: +1 [Attack] and +1 [Damage], take -1 [Body]",
                  ":titles",
                  "Blood Rage"
                ),
                "Blood Oath",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Oath"
                ),
                "Blood Spear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Spear",
                  ":summary",
                  "* Create a spear or javelin from blood. Blood Weapons always cause [Bleeding]."
                ),
                "Blood Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Whip",
                  ":summary",
                  "* Create a whip or rope from blood. Blood Weapons always cause [Bleeding]."
                ),
                "Boil Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Boil Blood",
                  ":summary",
                  "* Touch, Fire Attack, Criticals are only Damage."
                ),
                "Call for Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call for Blood"
                ),
                ":Hecatomb",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hecatomb",
                  ":reference",
                  "* In ancient Greece or Rome, a great public sacrifice, originally of a hundred oxen.\n* An extensive loss of life for some cause."
                ),
                ":Lifeblood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lifeblood",
                  ":summary",
                  "* Use Blood to heal yourself.\n* [Action]: Take a [Blood Loss]. Change 1 [Critical Damage] to a normal [Damage] or\nchange 1 [Damage] to a [Blood Loss]."
                ),
                "Out for Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Out for Blood"
                )
              )
            ),
            ":Chaos",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Chaos",
              ":reference",
              "* Do what thou wilt shall be the whole of the Law. - Alesiter Crowley, Book of the Law\n* The Butterfly Effect - Any 'seemingly' insignificant event in the universe has the potential to trigger a chain reaction that will change the whole system.\n* Do I really look like a plan? ... I just...do things. The mob has plans. The cops have plans. Gordon's got plans. They're schemers, schemers trying to control their little worlds. I'm not a schemer. I try to show the schemers how pathetic their attempts to control things really are. ... I just do what I do best, I took your little plan and turned it on itself. Look at what happened to this city with a few drums of gas and a couple of bullets. ... Introduce a little anarchy. Upset the established order and everything becomes chaos. I'm an agent of chaos. - Joker, The Dark Knight",
              ":summary",
              "* Belief is a tool that can be applied at will rather than unconsciously.\n* Trying unusual, and often bizarre beliefs is in itself an experience worth having\n* Flexibility of belief is a form of power\n* Be outside of all categories - world views, theories, beliefs, opinions, habits and even personalities are tools that may be chosen arbitrarily in order to understand or manipulate the world one sees and creates around oneself.\n* Be tolerant - whatever one might disagree over is merely an opinion, and hence interchangeable, anyway.\n* Chaos magic is unique among magical traditions in that it does not attribute significance to any particular symbol or deity.",
              ":titles",
              "Chaos Lord, Discordian, Logros Master, Lord of Chaos",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Anarchy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anarchy"
                ),
                ":Bedlam",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bedlam"
                ),
                ":Breakdown",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Breakdown",
                  ":summary",
                  "* Causes machinery to fail.  The more complex the device the more dramatic the failure."
                ),
                ":Deconstruct",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deconstruct",
                  ":reference",
                  "* People and planets and stars will become...dust...and the dust will become atoms...and the atoms will become...nothing. - Davros, Doctor Who",
                  ":summary",
                  "* Break apart an object into simpler pieces. Each successive use breaks down an object further. E.g. Wheel -> Tire -> Rubber -> Chemicals -> Atoms -> Particles"
                ),
                "Manipulate Luck",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manipulate Luck"
                ),
                ":Pandemonium",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pandemonium"
                ),
                "Sea of Chaos",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sea of Chaos"
                ),
                "Shroud of Uncertainty",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shroud of Uncertainty"
                ),
                "Tendrils of Chaos",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tendrils of Chaos"
                ),
                "Wild Ride",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wild Ride",
                  ":summary",
                  "* Allow the whims of fate to carry you to a destination of their choosing."
                ),
                ":Unravelling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unravelling",
                  ":summary",
                  "* Knots untie, locks unfasten, etc."
                ),
                "Winds of Change",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Winds of Change"
                )
              )
            ),
            ":Corruption",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Corruption",
              ":reference",
              "* How do we begin to covet? We begin by coveting what we see every day. - The Silence of the Lambs\n* Deadite: I'll swallow your soul! Ash: Come get some. - Ash, Army of Darkness\n* There is nothin' fair in this world... No... There is nothin' safe in this world... And there's nothin' sure in this world... And there's nothin' pure in this world... Look for something left in this world... Start again! - Billy Idol, White Wedding",
              ":titles",
              "Blight Caster, Contaminator, Corrupter, Defiler, Filth, Plague Bearer, Plague Lord, Plague Walker, Sin, Sin Lord, Scourge, Tainted",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Balefire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Balefire",
                  ":summary",
                  "* Balefire is a magical, corrupting fire that appears as a sickly pale, greenish flame that flows like a liquid. It burns like napalm and is not extinquished by water. Prolonged exposure produces damage like [Radiation].",
                  ":titles",
                  "Hellfire, Witchfire"
                ),
                ":Befoul",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Befoul"
                ),
                ":Blight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blight",
                  ":summary",
                  "* Damage plant life in an area."
                ),
                ":Contaminate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Contaminate"
                ),
                ":Corrosion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corrosion"
                ),
                ":Corrupt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corrupt"
                ),
                ":Decay",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Decay"
                ),
                ":Defile",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Defile"
                ),
                ":Despoil",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Despoil"
                ),
                ":Deteriorate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deteriorate",
                  ":summary",
                  "* Magnify any existing negative tokens."
                ),
                ":Epidemic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Epidemic",
                  ":summary",
                  "Copies all conditions from target to all targets in the area around the target."
                ),
                "Eye of Corruption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye of Corruption"
                ),
                ":Miasma",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Miasma"
                ),
                ":Pestilence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pestilence"
                ),
                ":Plague",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague"
                ),
                "Plague Carrier",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague Carrier",
                  ":summary",
                  "* This ability inflicts a contagious disease on a subject while also providing some immunity to the victim.\n* The subject then spreads the disease to others.",
                  ":titles",
                  "Plague Bearer, Typhoid Mary"
                ),
                "Plague Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague Strike",
                  ":summary",
                  "* Add [Disease] Criticals to a normal attack."
                ),
                ":Pollute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pollute",
                  ":summary",
                  "* Add Poison or Disease to any fluid or food."
                ),
                ":Putrefy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Putrefy"
                ),
                "Putrid Explosion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Putrid Explosion"
                ),
                ":Rot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rot"
                ),
                ":Ruin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ruin",
                  ":summary",
                  "* Cause a structure to age and take structural damage.",
                  ":titles",
                  "Raze"
                ),
                ":Sicken",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sicken"
                ),
                "Tainted Land",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tainted Land"
                ),
                ":Wither",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wither",
                  ":titles",
                  "Shrivelling"
                )
              )
            ),
            ":Darkness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Darkness",
              ":reference",
              "* The blackness gathers about, so thick, so clinging, so penetrating, so oppressive, that all other darkness that I have ever conceived would be like bright light beside it. - Aleister Crowley, Magick Without Tears\n* When the shadows are devoured by even darker shadows, the curtain pulls back and reveals a world without light! - Dark Signers, Yugioh 5Ds\n* To go in the dark with a light is to know the light. To know the dark, go dark. Go without sight and find that the dark, too, blooms and sings, and is traveled by dark feet and dark wings. - Wendell Berry, To Know the Dark",
              ":titles",
              "Dark Lord, Dark Magician, Dark Master, Dread Knight, Lord of Night, Shadow Caster, Shadow Knight, Shadow Lord, Shadow Mage, Shadow Master, Shadow Rider, Shadow Walker, Shadow Warrior",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Cast Shadows",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cast Shadows",
                  ":summary",
                  "* Animate shadows. Like [Illusions], they have full power but are destroyed on any hit."
                ),
                "Circle of Darkness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Circle of Darkness"
                ),
                "Cloak of Shadows",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloak of Shadows",
                  ":summary",
                  "* Increase Stealth",
                  ":titles",
                  "Shroud of Night"
                ),
                "Darkest Hour",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Darkest Hour",
                  ":titles",
                  "Witching Hour"
                ),
                "Eye of Shadow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye of Shadow",
                  ":summary",
                  "* See perfectly in any form of darkness.",
                  ":titles",
                  "Dark Sight, Night Vision"
                ),
                "Heart of Darkness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heart of Darkness"
                ),
                ":Nightfall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nightfall",
                  ":summary",
                  "* Gain +1 [Darkness] Skill for the first hour after the dusk."
                ),
                ":Oubliette",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Oubliette",
                  ":summary",
                  "* Trap a target in a prison of absolute darkness."
                ),
                "Shadow Step",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shadow Step",
                  ":summary",
                  "* Step into a shadow and appear from a nearby shadow, though failure will leave the unit trapped in shadow."
                ),
                "Shadow Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shadow Strike",
                  ":summary",
                  "* Add [Blindness] Criticals to a normal attack."
                ),
                "Tendrils of Night",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tendrils of Night"
                ),
                "Wall of Darkness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Darkness"
                )
              )
            ),
            "Demon Soul",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Demon Soul",
              ":reference",
              "* Claymore\n* Ghost Rider\n* Prototype",
              ":summary",
              "* Demon Soul is when a user has been partially or completely possessed by a demonic entity.\n* Demon Soul allows the user a number of physical advantages including regeneration and natural weaponry, however each use of an ability at full strength (higher than level - 2) risks increasing the Beast inside until it eventually dominates the user's Spirit.",
              ":titles",
              "Yoma",
              ":stat",
              "Beast"
            ),
            ":Fleshcraft",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Fleshcraft",
              ":summary",
              "* This mastery of the flesh defies traditional life and death. Body parts may be removed, reattched, molded to create abominations or fiendish beauty.\n* Stats may be rearranged depending on the success roll. Only magical healing will repair.",
              ":titles",
              "Flesh Molder, Sadist",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Body Sculpting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Sculpting",
                  ":summary",
                  "* Stats may be rearranged depending on the success roll. Only magical healing will repair."
                ),
                "Flesh Molding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flesh Molding",
                  ":summary",
                  "* Body can be scuplted like clay. This is a very powerful but impercise ability. It can be further refined with [Body Scuplting]."
                ),
                ":Grafting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grafting",
                  ":reference",
                  "Frankenstein's Monster",
                  ":summary",
                  "* Separate living organs from their host and graft them to another."
                ),
                ":Hybridize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hybridize",
                  ":summary",
                  "* Create new lifeforms by growing hybridized cells."
                ),
                ":Pain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pain",
                  ":reference",
                  "* And to think, I hesitated... - Hellraiser II\n* Oh, Kirsty.  So eager to play, so reluctant to admit it. - Pinhead, Hellraiser II\n* I guess I'm always hoping that you'll end this reign.   But it's my destiny to be the king of pain - The Police, King of Pain"
                )
              )
            ),
            ":Necromancy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Necromancy",
              ":reference",
              "* Necromancy is the communication with the spirits of the dead sometimes via a ouija board, on which messages are spelled out and interpreted.",
              ":titles",
              "Black Savant, Bone Caster, Grave Robber, Necromancer, Necrosavant",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Bone Harvest",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bone Harvest"
                ),
                "Brush with Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brush with Death"
                ),
                "Call the Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call the Death",
                  ":reference",
                  "* Bring out your dead! - Monty Python and the Holy Grail",
                  ":summary",
                  "* Attract undead creatures to your location."
                ),
                "Command the Dead",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Command the Dead",
                  ":summary",
                  "* Compel undead creatures to serve you for the duration of the ability."
                ),
                "Corpse Explosion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corpse Explosion"
                ),
                "Dance of the Dead",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dance of the Dead",
                  ":summary",
                  "* Force a dead spirit to perform a task for you."
                ),
                "Dead Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dead Eye",
                  ":reference",
                  "The Sixth Sense",
                  ":summary",
                  "* The Necromancer's eyes become white with cataracts obscuring the real world while seeing through the [Shroud] into the [Underworld]. The Necromancer can see and speak with the dead in the [Shadowlands].  The dead, however, are generally not fond of being used by Necromancers."
                ),
                "Dead Man Walking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dead Man Walking",
                  ":summary",
                  "* The Necromancer becomes corpselike and is treated as [Undead] by other [Undead]."
                ),
                ":Deathgrip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deathgrip"
                ),
                "Death's Door",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death's Door",
                  ":summary",
                  "* [Action]: Project your spirit into the [Underworld] while the body lies in a coma.\n* [Death]: Enter the Underworld"
                ),
                "Drain Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drain Life"
                ),
                "Draining Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Draining Strike",
                  ":summary",
                  "* While this ability is active, gain 1 Health when the user deals at least 1 [Health] damage with a [Close Combat] [Strike]."
                ),
                ":Embalming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Embalming",
                  ":summary",
                  "* By preparing a corpse both phyically and magically, the body can avoid most negative effects of decay.\n* Embalmed undead created through Reanimation can last indefinitely."
                ),
                "Ghost Wind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ghost Wind",
                  ":summary",
                  "* Summon terrifying spirits that cause fear in an area."
                ),
                "Hand of Glory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hand of Glory",
                  ":summary",
                  "* The Hand of Glory is the dried and pickled hand of a man who has been hanged, often specified as being the left (Latin: sinister) hand, or, if the man were hanged for murder, the hand that 'did the deed.'\n* Old European beliefs attribute great powers to a Hand of Glory combined with a candle made from fat from the corpse of the same malefactor who died on the gallows. The candle so made, lighted, and placed (as if in a candlestick) in the Hand of Glory, would have rendered motionless all persons to whom it was presented."
                ),
                ":Harrowing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Harrowing"
                ),
                "Living Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Death",
                  ":summary",
                  "* Temporarily turns the caster into a [Lich]."
                ),
                ":Manifestation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manifestation",
                  ":summary",
                  "* Allows a dead spirit to temporarily interact with the living world."
                ),
                "Moment of Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Moment of Death",
                  ":summary",
                  "* Touch a corpse and view its death."
                ),
                ":Mummification",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mummification",
                  ":summary",
                  "* A complex ritual to turn the target into a [Mummy] or [Lich].  A perfectly created undead appears like a completely normal living being (though it is no longer alive).  Flaws is the casting make the being more monstrous."
                ),
                ":Necropotence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Necropotence",
                  ":summary",
                  "* Reduce your own health to increase another magical effect."
                ),
                ":Necroscope",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Necroscope"
                ),
                "Prolong Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prolong Life"
                ),
                ":Reanimation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reanimation",
                  ":reference",
                  "Reanimator",
                  ":summary",
                  "* The corpse of a dead unit may be reanimated returning it to an [Undead] semblance of life.\n* This ability does not give any control of the [Undead] to the caster unless the caster is somehow reanimating his own body.\n* [Action] - [Success] indicate the new maximum [Body] of the corpse up to its original [Body]. The closer the corpse gets to its full original [Body], the more alive it will appear.\n* Some otherworldly beings defy death by Reanimating themselves."
                ),
                "Rigor Mortis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rigor Mortis"
                ),
                ":Seance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Seance",
                  ":summary",
                  "* Draw ghosts to you and allow them to speak through you."
                ),
                "Sever Soul",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sever Soul",
                  ":summary",
                  "* [Requires]: Target whose spirit has left its body.\n* [Action]: Cut the connection between the spirit and its body.  The spirit may become lost, and the body falls into a coma. The soulless body is now an attractive target for possession."
                ),
                ":Undeath",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Undeath",
                  ":summary",
                  "* Similar to [Resurrect], this ritual allows a being to permanently transform a [Living] being into an [Undying] one.\n* This can be used to create [Zombie] and [Skeletons] servants or create indepenent undead like [Ghouls] and [Vampires]."
                )
              )
            )
          )
        ),
        ":Thergy",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Thergy",
          ":reference",
          "* Pray, not for the gods, or the betterment of others, but for yourself - Rosaria, Genshin Impact",
          ":titles",
          "Channelling, Miracle Working, White Magic",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Asceticism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Asceticism",
              ":reference",
              "* Snow White",
              ":summary",
              "* Aura\n* All Purity skills are at -1 for each level of [Shadow]. Ironically, the [Beast] is natural and therefore is not impure.\n\nThere are said to be 'Four Affirmations' of the spirit:\n* Tradition and the family - The family is seen as the main mechanism by which traditions are reserved.  Their main celebrations relate to birth and marriage.\n* Love of nature - Nature is sacred; to be in contact with nature is to be close to the sacred spirits.  Natural objects are worshipped as containing sacred spirits. Killing living beings should be done with reverence for taking a life to continue one's own, and should be kept to a minimum.\n* Physical cleanliness - Take baths, wash hands, and rinse mouths often.\n* Festivals - Any festival dedicated to the Spirits, of which there are many each year.",
              ":titles",
              "Angel, Banisher, Brother, Buddist, Exorcist, Father, Friar, Hearth Mage, Monk, Mother Superior, Nun, Paladin, Penitent, Purifier, Purity, Shintoist, Sister",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Absolution",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Absolution",
                  ":summary",
                  "* A ritual of cleansing of sin. Absolution can be a difficult journey depending on the person and the sins. To be absolved, one must fully express, accept and atone for one's sins, only then may absolution be found.",
                  ":titles",
                  "Atonement"
                ),
                "Arrow of Purity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Arrow of Purity",
                  ":reference",
                  "* Kakome, Inuyasha\n* Mirana, DOTA",
                  ":summary",
                  "* An arrow or other projectile can be enhanced to destroy corruption.\n* +1 Attack and +1 Damage vs. [Corrupted] or [Chaotic]"
                ),
                "Blaze of Glory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blaze of Glory"
                ),
                "Calm Animal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calm Animal"
                ),
                "Chime of Purity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chime of Purity",
                  ":summary",
                  "* The user sounds a bell or chime, and its piercingly pure tones are unbearable to otherworldly beings."
                ),
                ":Cleaning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleaning",
                  ":summary",
                  "* By simply rubbing any dirty surface with a wet cloth, the material immediately becomes cleaner regardless of the contamination. All harmful contaminents are cleaned off as well."
                ),
                ":Cleanse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleanse",
                  ":summary",
                  "* Those who believe see a silvery shower wash over the target and cleaning away [Disease] or [Poison] like dirt.\n* Reduces [Poison] and [Disease] damage rolls by the skill level."
                ),
                ":Exorcism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Exorcism",
                  ":summary",
                  "* Banish a spirit that is possessing a person, item, or location."
                ),
                ":Halo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Halo",
                  ":summary",
                  "* Magnificient halo of light appears behind the user's head.  Observers are awed by the sight.\n* [Action] - +1 on Social abiliites.",
                  ":titles",
                  "Godshead"
                ),
                ":Introspection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Introspection"
                ),
                ":Pacifism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pacifism"
                ),
                ":Penance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Penance"
                ),
                ":Purify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purify",
                  ":summary",
                  "* Contamination including filth, [Disease], [Poison], or [Raditation] may be cleansed in a small area."
                ),
                ":Purge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purge"
                ),
                ":Sanctuary",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sanctuary",
                  ":summary",
                  "* From the user's perspective, it is like being on stage. While chanting, a spotlight seems to come upon the user, all other lights dim, and enemies cease to notice the user's presence."
                ),
                "Sense Corruption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sense Corruption"
                ),
                ":Serenity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Serenity"
                ),
                "Throw Salt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Throw Salt"
                ),
                "True Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "True Sight"
                ),
                "Vow of Chastity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vow of Chastity",
                  ":titles",
                  "Celibacy"
                ),
                "Vow of Obedience",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vow of Obedience",
                  ":reference",
                  "To dream the impossible dream\nTo fight the unbeatable foe\nTo bear with unbearable sorrow\nAnd to run where the brave dare not go\n\nTo right the unrightable wrong\nAnd to love pure and chaste from afar\nTo try when your arms are too weary\nTo reach the unreachable star\n\nThis is my quest\nTo follow that star\nNo matter how hopeless\nNo matter how far\n\nTo fight for the right\nWithout question or pause\nTo be willing to march, march into Hell\nFor that heavenly cause\n\nAnd I know if I'll only be true\nTo this glorious quest\nThat my heart will lie peaceful and calm\nWhen I'm laid to my rest - Don Quixote, The Impossible Dream",
                  ":summary",
                  "* The vow of obedience is a commitment to truly follow the direction of ones beliefs regardless of obstacles or consequences knowing that whatever the outcome, it was always the true, right outcome."
                ),
                "Vow of Poverty",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vow of Poverty"
                ),
                "Vow of Silence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vow of Silence"
                ),
                "Ward Undead",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ward Undead"
                )
              )
            ),
            ":Conviction",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Conviction",
              ":reference",
              "* Being religious is a form of conceit. the faith in which I was brought up assured me that I was better than other people; I was 'saved,' they were 'damned'... Our hymns were loaded with arrogance - self-congratulation... With a touch more confidence and a liberal helping of ignorance, I would have been a famous evangelist... A confidence man knows he's lying; that limits his scope. But a successful shaman believes what he says - and belief is contagious; there is no limit to his scope.  - Jubal, Stranger in a Strange Land",
              ":titles",
              "Crusader, Faithful, Fanatic, Grand Inquisitor, Inquisitor, Paladin, Zealot",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Crusade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crusade",
                  ":titles",
                  "Jihad"
                ),
                ":Defiance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Defiance"
                ),
                ":Demonize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Demonize"
                ),
                ":Devotion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Devotion"
                ),
                "Do or Die",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Do or Die"
                ),
                "Eternal Vigilance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eternal Vigilance"
                ),
                "Faith Sustains Me",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Faith Sustains Me",
                  ":summary",
                  "* May fast as long as skill roll exceeds number of weeks of fasting."
                ),
                ":Fanaticism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fanaticism"
                ),
                "Holy Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Holy Armor"
                ),
                "Holy Shield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Holy Shield"
                ),
                "Holy Strength",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Holy Strength"
                ),
                ":Persecute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Persecute"
                ),
                ":Rapture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rapture"
                ),
                ":Righteousness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Righteousness"
                ),
                ":Sacrifice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sacrifice"
                ),
                ":Smite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smite",
                  ":summary",
                  "* [Action]: Imbue weapon and body with the strength of your Conviction.\n* [Melee] or [Close Combat] vs. [Undead], [Devil] or [Demon]: use Conviction instead of weapon to determine damage."
                ),
                "Singular Will",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Singular Will",
                  ":summary",
                  "* Gain +1 to Defense when fighting in single combat with no other combatants around."
                ),
                "Soul Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Soul Blast"
                ),
                ":Tithing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tithing",
                  ":summary",
                  "* Pay 10% of your income to your superior and gain 10% of the income of your followers. This income must be completely spent on the faith."
                ),
                ":Zeal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Zeal"
                )
              )
            ),
            ":Convergence",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Convergence",
              ":summary",
              "* Divine power surrounds the petitioner and those deemed allies.\n* [Focus]: +1 [Defense]",
              ":titles",
              "Blessing, Protection",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Bless Object",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bless Object",
                  ":summary",
                  "* Apply a different blessing to object. That object can hold the blessing until triggered.\n* Duration: Level hours\n* Only level objects may be blessed at one time. If exceeded the earliest one is erased."
                ),
                "Blessing against Cold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing against Cold",
                  ":summary",
                  "* [Focus]: +1 [Defense] and +1 [Armor] vs. Cold"
                ),
                "Blessing against Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing against Electricity",
                  ":summary",
                  "* [Focus]: +1 [Defense] and +1 [Armor] vs. Electricity"
                ),
                "Blessing against Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing against Fire",
                  ":summary",
                  "* [Focus]: +1 [Defense] and +1 [Armor] vs. Fire"
                ),
                "Blessing against Projectiles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing against Projectiles",
                  ":summary",
                  "* [Focus]: +1 [Defense] and +1 [Armor] vs. projectilees."
                ),
                "Blessing against Weapons",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blessing against Weapons",
                  ":summary",
                  "* [Focus]: +1 [Defense] and +1 [Armor] vs. melee weapons. Unarmed combat is unaffected."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Enhance Blessing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Enhance Blessing",
                  ":summary",
                  "* When user activates a Blessing on an item, that Blessing has increased effect."
                )
              )
            ),
            ":Divine",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Divine",
              ":reference",
              "* It might take the suffering or worship of 10,000 souls to produce a grain of Divinity...but a single grain is beyond all the power of this world.",
              ":summary",
              "* The ability to absorb the worship of others. Level determines the amount of Divinity that can be held at once.",
              ":titles",
              "Prime, Primal",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Divine Accuracy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Accuracy",
                  ":summary",
                  "* Attack: Spend a [Divinity]. The attack cannot miss. The minimum number of hits is 1 Critical."
                ),
                "Divine Blessing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Blessing",
                  ":summary",
                  "* Action: Transfer any amount of [Divinity] to the target."
                ),
                "Divine Grace",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Grace",
                  ":summary",
                  "* Action: Spend a [Divinity]. Perform another non-attack Action. That action cannot fail. The minimum success is 1 Critical."
                ),
                "Divine Shield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Shield",
                  ":summary",
                  "* Action: Choose a shield or armor and spend a [Divinity]. For the next 3 turns, the shield or armor cannot be penetrated by force that is not also Divine."
                ),
                "Divine Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Strike",
                  ":summary",
                  "* Attack: Spend a [Divinity].  If the attack hits, The damage is always at least 1 Critical."
                )
              )
            ),
            ":Invocation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Invocation",
              ":reference",
              "* And he shall separate them one from another, as a shepherd divideth his sheep from the goats. And he shall set the sheep on his right, but the goats on his left. - Matthew 25: 32-33\n* Many cultures have regarded left-handedness as evil. Words such as sinister, which in Latin means both left and unlucky. Consequently, the left hand has often symbolized the rejection of traditional religion.\n* The word 'right' derives from the Hebrew term 'yamin' from the Old Testament, meaning 'stronger'. In Hebrew, the term for 'left' is 'smowl', meaning 'dark'.\n* It is possible that this division also derives from the practice of using the left hand for purposes of personal hygiene after defecation in some cultures, rendering the left hand 'unclean'.",
              ":summary",
              "* Calling or summoning a spirit, demon, god or other supernatural agent for assistance.\n* Right Hand Path - Elevates spirituality, the strict observance of moral codes, and the worship of deities. The goal is to attain proximity to divinity, or integration with divinity.\n* Left Hand Path - Conversely, Left Hand Path values the advancement and preservation of the self, glorification of more temporal and terrestrial goals, and personal power rather than ephemeral spiritual attainments. Rather than valuing proximity to the divine, followers of Left-Hand Path belief systems seek to become divinities in their own right.",
              ":titles",
              "Cabalist, Cleric, Diabolist, Evoker, Exorcist, Invoker, Minister, Priest, Ritualist",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Angelic Chorus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Angelic Chorus",
                  ":titles",
                  "Divine Chorus"
                ),
                ":Armageddon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Armageddon",
                  ":titles",
                  "Cataclysm"
                ),
                ":Aspecting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Aspecting",
                  ":summary",
                  "The practitioner manifests a particular aspect of a goddess or god (whether in speech, appearanve, behaviour or thought)."
                ),
                ":Avatar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Avatar",
                  ":summary",
                  "The practitioner becomes a version of the goddess or god."
                ),
                "Burnt Offering",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Burnt Offering"
                ),
                "Dark Ritual",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dark Ritual"
                ),
                "Divine Intervention",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Intervention"
                ),
                "Divine Favor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divine Favor"
                ),
                ":Drought",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drought"
                ),
                ":Geis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geis",
                  ":titles",
                  "Geas"
                ),
                ":Flood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flood"
                ),
                "Heaven's Gate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heaven's Gate",
                  ":titles",
                  "Divine Gate, Hell's Gate"
                ),
                ":Incarnation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Incarnation"
                ),
                "Plague of Beetles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague of Beetles",
                  ":summary",
                  "* Flesh eating beetles burrow from the ground and sweep over the area like a carpet."
                ),
                "Plague of Locusts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague of Locusts",
                  ":summary",
                  "* A swarm of locusts descends on the area. They devour all food, clog intakes, short out equipment, and terrify people."
                ),
                "Plague of Sores",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plague of Sores",
                  ":summary",
                  "* A horrific disease descends on the area. Victims appear horrific and without treatment will be permanently scarred. Naturally, the disease is highly contagious."
                ),
                "Rain of Frogs",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rain of Frogs",
                  ":summary",
                  "* A torrent of frogs fall from the sky, splattering on any hard surfaces.  Fragile exposed items of all sorts are destroyed."
                ),
                ":Worship",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Worship",
                  ":summary",
                  "* Must choose a 'higher being' to worship.  Each higher being provides a bonus to a single specific ability."
                ),
                ":Tribute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tribute"
                ),
                ":Sacrifice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sacrifice"
                ),
                "Wrath of God",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wrath of God"
                )
              )
            ),
            ":Life",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Life",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Aneurysm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Aneurysm"
                ),
                "Cure Disease",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cure Disease"
                ),
                "Heal Major Wound",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heal Major Wound"
                ),
                "Heal Minor Wound",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heal Minor Wound"
                ),
                "Heal Scars",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heal Scars"
                ),
                "Heart Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heart Attack"
                ),
                "Poison Backlash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Backlash",
                  ":summary",
                  "* [Action]: Touch a unit with a [Poison] ability.  The target is affected as if the ability was used against itself at full strength."
                ),
                ":Regenerate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Regenerate"
                ),
                ":Replenish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Replenish"
                ),
                ":Resurrect",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resurrect",
                  ":summary",
                  "* The ability to truly bring the dead back to life is one of the most desired and difficult of all abilities. The ritual is long and complicated with a high chance of failure.  Only one of the same race as the deceased has sufficient self understanding to succeed at all.  The caster must also get at least 10 [Successes] and/or [Criticals] or the ritual fails.  Each subsequent attempt to raise the same target requires 1 additional success."
                ),
                ":Simulacrum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Simulacrum",
                  ":summary",
                  "* Grow a physical copy of a living creature. It possesses no mind or spirit unless given one through other means.",
                  ":titles",
                  "Clone"
                ),
                ":Succor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Succor",
                  ":summary",
                  "* Relieves pain\n* Can ignore the negative effects of all tokens while this is in effect.",
                  ":titles",
                  "Comfort"
                ),
                ":Transference",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transference"
                )
              )
            ),
            ":Radiant",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Radiant",
              ":titles",
              "Bright, Light, Lightbringer",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blinding Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding Light"
                ),
                "Blinding Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding Wall",
                  ":titles",
                  "Wall of Light"
                ),
                ":Daybreak",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Daybreak",
                  ":summary",
                  "* Gain +1 [Light] Skill for the first hour after the crack of dawn."
                ),
                "Command Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Command Light",
                  ":summary",
                  "* Redirect a [Light] ability to a new target."
                ),
                ":Moonbeam",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Moonbeam"
                ),
                "Purifying Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purifying Light",
                  ":summary",
                  "* Glowing rays of light appear to emanate from any light the user possesses. Vermin, undead, demons, devils, or any user of [Corruption] will be damaged by the light as if it were [Fire]. All pure beings struck by the rays may remove a [Stun] Token.",
                  ":titles",
                  "Divine Light, Holy Light"
                ),
                "Summon Radiance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Radiance"
                ),
                ":Sunbeam",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sunbeam"
                ),
                "Swords of Revealing Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swords of Revealing Light",
                  ":summary",
                  "* Blazing rays of light shine around the user, revealing hidden or disguised things.\n* [Action]: Any hidden or disguised thing directly in front of the user, reduces its chance to stay concealed by the [Successes]."
                )
              )
            )
          )
        ),
        "Nature Magic",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nature Magic",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Animal Control",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Animal Control",
              ":summary",
              "* Restrictions - Must not harm animals.",
              ":titles",
              "Beast Lord, Beast Master",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animal Magnetism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animal Magnetism"
                ),
                "Animal Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animal Ward",
                  ":summary",
                  "[Ward] - Defends against animals."
                ),
                "Banish Vermin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Banish Vermin"
                ),
                "Beast Lore",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Beast Lore"
                ),
                "Beast Tongue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Beast Tongue",
                  ":summary",
                  "[Tongue] - Speak with Animal"
                ),
                "Bird's Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bird's Eye",
                  ":summary",
                  "* Have a bird spy for you."
                ),
                "Call of the Wild",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call of the Wild",
                  ":summary",
                  "* [Action]: Make an emotional plea for aid to any [Beast]s or [Animal]s within [Range]. Note that creatures will only help if it serves their own interests, and they will act indepentently according to their intelligence and nature."
                ),
                "Calm the Beast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calm the Beast"
                ),
                "Commune with Animals",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Commune with Animals",
                  ":summary",
                  "* [Action]: Sense if animals in [Range] notice anything significant. The higher the [Success], the more subtle information received."
                ),
                "Control Beast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Beast"
                ),
                "Purge Venom",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purge Venom",
                  ":summary",
                  "* By sucking on a bite, the user may rapidly remove a creature's venom from a wound.\n* [Action]: Remove 1 Poison Counter for each success."
                ),
                "Creeping Doom",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Creeping Doom"
                ),
                "Giant Animal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Giant Animal"
                ),
                ":Infestation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Infestation"
                ),
                "Insect Swarm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Insect Swarm",
                  ":summary",
                  "Distracts targets and transfers up to 3 conditions from you to the target."
                ),
                "Locate Animal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Locate Animal"
                ),
                "Nature of the Beast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nature of the Beast"
                ),
                "Natural Order",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Natural Order"
                ),
                "Scent of the Wild",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scent of the Wild",
                  ":summary",
                  "* [Action]: Cover the unnatural and threatening scent of creatures and gear in range. Natural creatures will treat them as if they were large herbivores."
                ),
                "Shrink Animal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shrink Animal"
                ),
                "Speak with Animals",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speak with Animals"
                ),
                "Survival of the Fittest",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Survival of the Fittest",
                  ":titles",
                  "Natural Selection"
                )
              )
            ),
            ":Naturalism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Naturalism",
              ":summary",
              "* Restrictions - Must not harm plants.",
              ":titles",
              "Botomancy, Druid, Hierophant, Nature Master",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animate Plant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animate Plant"
                ),
                "Awaken Tree",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Awaken Tree",
                  ":summary",
                  "* Awakens a tree and permanently gives it consciousness.  Some say that all trees were once awake."
                ),
                "Back to Nature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Back to Nature",
                  ":summary",
                  "* Dead wood or hide rapid decays."
                ),
                "Banish Weeds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Banish Weeds"
                ),
                ":Barkskin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barkskin"
                ),
                "Binding Vines",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Binding Vines"
                ),
                "Call the Creep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call the Creep"
                ),
                "Call the Trees",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call the Trees"
                ),
                "Commune with Nature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Commune with Nature"
                ),
                "Choking Fungus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Choking Fungus",
                  ":summary",
                  "* Fungus spontaneously grows in the area and releases spores that cause uncontrollable coughing to anyone who breathes without a fine filter in the area."
                ),
                "Drink from the Earth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drink from the Earth"
                ),
                "Fertile Crops",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fertile Crops"
                ),
                "Food from the Sun",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Food from the Sun"
                ),
                "Force of Nature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Force of Nature"
                ),
                "Heal Nature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heal Nature"
                ),
                "Knock on Wood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knock on Wood",
                  ":summary",
                  "* Touch Wood and Remove a Token and place it on the Wood."
                ),
                "Locate Plant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Locate Plant"
                ),
                "Nature Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nature Sight"
                ),
                "Nature Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nature Walk",
                  ":reference",
                  "Merlin, Excalibur",
                  ":summary",
                  "* Travel at exceptional speed through forests while appearing to walk calmly appearing and reappearing at greater distances.\n* [Continuous]: Ignore [Success] movement penalties in [Forest], [Jungle], [Swamp] and other overgrown terrain. Additionally, [Success] is applied as a penalty for anything attempting to [Track] you."
                ),
                ":Overgroth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overgroth"
                ),
                "Plant Lore",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plant Lore"
                ),
                "Plant Mastery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plant Mastery"
                ),
                "Plant Tongue",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plant Tongue",
                  ":summary",
                  "* Speak with Plant"
                ),
                "Plant Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plant Ward",
                  ":summary",
                  "* Defends against Plants"
                ),
                ":Purification",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purification"
                ),
                ":Root",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Root"
                ),
                "Tree Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tree Form"
                ),
                "Wall of Thorns",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Thorns",
                  ":summary",
                  "* [Wall]\n* May only be cast on [Forest].\n* The wall gains double Terrain Penalty."
                ),
                "Warp Wood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Warp Wood"
                )
              )
            )
          )
        ),
        ":Spiritualism",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Spiritualism",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Divination",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Divination",
              ":reference",
              "* Casting: In various methods of divination, stones, cards, sticks and other objects are cast onto the ground or a special cloth so that an insight into the life patterns can be revealed.\n* Querent: In divination and ritual, the querent is the asker of questions.\n* Scrying: This is the area of divining by gazing into a reflecting surface.",
              ":summary",
              "* Divination is the practice of discovering the unknown.  It can foresee the future, find hidden things, uncover lost lore, and reveal deception.\n* Practitioners may see the many roads to the future and may choose the path that favors themselves and hinders their foes.\n* Fortune telling is more interested in predicting future events.  Rather, divination tends to be more about discovering information.\n* It is an accepted truism within magick that divination is imperfect.",
              ":titles",
              "Augur, Diviner, Fortune Teller, Oracle, Prophet, Seer, Soothsayer, Visionary",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "All Seeing Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "All Seeing Eye",
                  ":reference",
                  "The Eye of  Providence"
                ),
                ":Augury",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Augury"
                ),
                ":Cartomancy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cartomancy",
                  ":summary",
                  "* The art of reading the future through playing cards or tarot cards."
                ),
                ":Clairaudience",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clairaudience"
                ),
                ":Clairvoyance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clairvoyance"
                ),
                ":Dowsing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dowsing",
                  ":summary",
                  "* Through the use of a divining rod the user may detect desired items hidden underground below them."
                ),
                "Fortune Telling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fortune Telling",
                  ":summary",
                  "* [Deploy]: Roll vs. target Spirit.  If you succeed, you receive +1 on all actions against him this encounter.\n* Casting - In various methods of divination, bones, stones, cards, sticks and other objects are cast onto the ground or a special cloth so that an insight into the life patterns can be revealed.\n* Bibliomancy - Reading random passages from a book, such as Liber Legis or the I Ching.\n* Tea Leaves\n* Tarot"
                ),
                ":Hallmark",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hallmark",
                  ":summary",
                  "* Analyze a magical effect to learn information about its caster."
                ),
                ":Kismet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kismet"
                ),
                "Mirror of Truth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror of Truth",
                  ":summary",
                  "* Enchant a reflective surface to show the true nature of the reflected scene. This reveals illusions, hidden things, and can even reveal the nature of those concealing terrible secrets."
                ),
                ":Portent",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Portent",
                  ":summary",
                  "* Determine if a chosen course of action will tend to be beneficial to the user or not. How it might be beneficial is not known.",
                  ":titles",
                  "Omen"
                ),
                ":Postcognition",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Postcognition"
                ),
                ":Precognition",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Precognition"
                ),
                ":Prediction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prediction"
                ),
                ":Premonition",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Premonition"
                ),
                ":Prophesy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prophesy"
                ),
                ":Providence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Providence",
                  ":summary",
                  "* [Action]: Divine a time and place nearby that will be beneficial if the user goes there. The roll result is not known by the user, and the success determines the benefit."
                ),
                ":Revelation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Revelation"
                ),
                ":Foresight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Foresight",
                  ":summary",
                  "* Foresight is a passive form of extra-sensory perception whereby a person spontaneously perceives information, in the form of vision, about future events before they happen.  It is distinguished from [Precognition] in that it is passive."
                ),
                "Twist of Fate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Twist of Fate"
                ),
                ":Visions",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Visions"
                ),
                ":Wyrding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wyrding"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Hepatomancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hepatomancy",
                  ":summary",
                  "* The art of divining the future through the examination of a creature's entrails."
                ),
                ":Numerology",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Numerology",
                  ":summary",
                  "* The art of divining the future through the examination of numbers and dates."
                ),
                ":Osteomancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Osteomancy",
                  ":summary",
                  "* The art of divining the future through decaying bones."
                ),
                "Rune Casting",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Rune Casting",
                  ":summary",
                  "* The art of divining the future through the throwing of small tiles with runes on them."
                ),
                ":Scrying",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Scrying",
                  ":summary",
                  "* This is the art of divining by gazing into a reflecting surface."
                ),
                ":Tasseomancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Tasseomancy",
                  ":summary",
                  "* Reading the patterns of tea leaves or coffee grounds left after the person drink it."
                )
              )
            ),
            ":Dreaming",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Dreaming",
              ":reference",
              "* I don't believe it.  That is why you fail.  Luke and Yoda - Empire Strikes Back",
              ":summary",
              "* This is the magical art of the [Fae].\n* Every child has a sense of wonder that comes with being new to the world. Adults must, of necessity, murder that special innocence in order to grow up.\n* When humanity turned its collective back on Dreaming, a terrible scourge of disbelief and negation smote the world. Hope, trust, and imagination were replaced with reason, pessimism, and scrutiny. By dismissing hope and faith, humanity avoids being hurt by its failure. Shutting out mystery and dreams anesthetizes fear, but deadens beauty as well and leads to apathy, callosuness, and close-mindedness. Though Banality is a mindless force, it is feared by the [Fae] more than any monster or villain. It is an enemy unlike anything the [Fae] have ever encountered, and they are largely helpless in its grasp.\n* Dreaming is never the same, so any Dreaming effect must be a uniquely crafted idea or it will automatically fail.",
              ":titles",
              "Glamour",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "As if in a Dream",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "As if in a Dream",
                  ":summary",
                  "* Confuse a target's senses to perceive a single thing incorrectly."
                ),
                "Concoct Dream Essence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Concoct Dream Essence",
                  ":summary",
                  "* Dreams caught with [Dreamcatching] can be contained in a bottle called [Dream Essence]. Opening the bottle releases the experience of the dream to all surrounding it."
                ),
                "Create Chimera",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Create Chimera",
                  ":summary",
                  "A Chimera is an imaginary creation. It exists only to the user, though those with magical abilities, young children and the mentally impaired may see them. They only can affect those who can see them."
                ),
                "Down the Rabbit Hole",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Down the Rabbit Hole",
                  ":summary",
                  "* [Requires]: A hole that leads somewhere unknown.\n* [Action]: By entering a hole, the Dreamer may travel to the [Spirit Realm].  If the Dreamer is a native of the [Spirit Realm], he may stay as long as he wants. If not, he will return to the real world after [Skill] hours as if waking from a dream."
                ),
                ":Dreamcatching",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dreamcatching"
                ),
                ":Dreamquest",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dreamquest",
                  ":summary",
                  "* [Requires]: Sleeping\n* [Action]: While asleep, Spirit enters the [Spirit Realm].  The Spirit may travel as long as it wants, but whenever the Body awakens, the Spirit immediately returns.\n* [Death]: Spirit may permanently enter the [Spirit Realm]."
                ),
                "Dream Effectively",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dream Effectively",
                  ":reference",
                  "* I was just thinking. Wouldn't it be funny if I wasn't the only one who could dream effectively? What if everybody could do it? And reality was being pulled out from under us all the time - and we didn't even know it? - George Orr, The Lathe of Heaven\n* Oh, my God... I just killed six billion people... - George Orr, The Lathe of Heaven"
                ),
                "Dream Riding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dream Riding",
                  ":summary",
                  "* Ability to enter another person's dream."
                ),
                "Dream Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dream Sight"
                ),
                "Dream Speak",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dream Speak",
                  ":summary",
                  "* Grants the ability to converse with things that cannot normally speak including plants, animals, and inanimate objects. Such beings have knowledge and personalities limited by their natures."
                ),
                "Dream Weaving",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dream Weaving",
                  ":reference",
                  "* She was shaping a world. She could envision the world, feel the spring of the earth beneath her bare feet, the warmth of the sun, the vibrant green of the grass, the hazy blue of distant mountains. 'Do you feel it?' 'Yes.' 'Then make it real.' She brought all of her will to paint all the details of the dream onto a new reality. She opened her eyes and gazed out upon the land she had already seen in her mind. It was so beautiful it took her breath away ... and failed to return it. She gasped as her lungs emptied and her vision faded to black ... 'A useful lesson. You forgot to breathe in the scents of your world that would indicate air. Remember even the smallest detail is crucial.' - Tales of Magick"
                ),
                ":Epiphany",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Epiphany",
                  ":summary",
                  "* A moment of ecstasy, delight, and intense revelation. During epiphanies, disparate things suddenly synchronize and make sense. Ephipanies often trigger major changes in personality or goals."
                ),
                "Eyes of a Child",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eyes of a Child",
                  ":summary",
                  "* All Chimera become visible to those you chose."
                ),
                "Fond Memories",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fond Memories",
                  ":reference",
                  "Eternal Sunshine of the Spotless Mind",
                  ":summary",
                  "* This ability makes every childhood dream and ambition real again. Every imaginary friend is remembered clearly and the happiest moments from youth return with the intensity of a first kiss and the excitement of Christmas. Then, suddenly, its over. In their absence, depression can crash down.  Truly fallen beings can become suicidal. The remembrance can be uplifting in the end, allowing one to relive the best moments of life."
                ),
                "Imaginary Friend",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Imaginary Friend",
                  ":reference",
                  "* As I was walking up the stair, I met a man who wasn't there. He wasn't there again today. If only he would go away. - Children's Nursery Rhyme\n* Mother, do you remember when I was little, I had a friend, he was make-believe? No. Don't you remember? Only I could see him? No, I don't remember Drop Dead Fred at all. - Drop Dead Fred\n* Let's write something on the carpet... I know how about 'Mother SUCKS'. - Drop Dead Fred",
                  ":summary",
                  "Create a character with a distinct personality of your choice that only the target can see."
                ),
                "Living Nightmare",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Nightmare",
                  ":summary",
                  "* A chimerical monster formed from nightmares or madness.",
                  ":titles",
                  "Waking Nightmare"
                ),
                "Nightmare Essence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nightmare Essence",
                  ":summary",
                  "* Nightmares caught with [Dreamcatching] can be contained in a bottle. Opening the bottle releases the experience of the dream to all surrounding it. These can be used as grenades."
                ),
                "Pillow Fort",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pillow Fort",
                  ":summary",
                  "* By exercising one's imagination, a soft barrier can provide real defense but only for the Dreamer.\n* [Action]: Any material may be chosen to provide [Skill] defense for the user."
                ),
                ":Rapture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rapture",
                  ":summary",
                  "* An extremely difficult and rare ability of self-discovery to create Glamour from oneself. Only at a moment of sudden self-realization can a Rapture be attained.\n* [Passive] - While in a Rapture, all [Critical] results generate [Glamour Token]s."
                ),
                ":Ravaging",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ravaging",
                  ":summary",
                  "* Drain creativity from a subject. The subject must be well known and a good knowledge of how the subject dreams is required. After that, the subject must simply be touched and he/she will experience a wave of depression and fear as the Glamour is drained from them.\n* [Action]: Touch the subject. Roll [Banality]. Gain +1 [Glamour Token] if any successes. If no [Glamour] is gained, both the user and subject gain +1 [Banality] instead."
                ),
                ":Reverie",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reverie",
                  ":summary",
                  "* Say or suggest things that inspire others to wonderful ideas and creations. This is a time-consuming process to discover they subtle things that inspire another to great works.\n* [Extended Action]: Inspire someone while they create.\n* [Action]: View a work of art created during Reverie. Gain +1 [Glamour Token]. A particular work of art may only grant this bonus once a year.",
                  ":titles",
                  "Muse"
                ),
                ":Seeming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Seeming",
                  ":summary",
                  "* Take on the appearance of another."
                ),
                "Shattered Dreams",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shattered Dreams"
                ),
                "Wall of Wonders",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Wonders",
                  ":summary",
                  "* A wall of dreams. Causes [Fascination] in those who view it."
                )
              )
            ),
            ":Enchantment",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Enchantment",
              ":summary",
              "* Enchantment/Witchcraft focuses on enchantments that alter the fate of the target.\n* The deities of Witchcraft are embodiments of a life-force manifest in nature. The Goddess and God are seen as complementary polarities and this balance is seen in nature. They are sometimes symbolised as the Sun and Moon, and from her lunar associations the Goddess becomes a Triple Goddess with aspects of Maiden, Mother, and Crone. Some hold the Goddess to be pre-eminent, since she contains and conceives all. The God is the spark of life and inspiration within her, simultaneously her lover and her child.",
              ":titles",
              "Abjuration, Beguiler, Enchanter, Enchantress, Entrancer, Hexer, Warlock, Witch, Witchcraft, Witchdoctor",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Barren Loins",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barren Loins",
                  ":summary",
                  "* Target cannot conceive a child while under this curse."
                ),
                ":Charm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Charm",
                  ":summary",
                  "* The opposite of [Malediction]. Charm reduces the severity of negative effects.\n* [Requires]: Target cannot have any [Charm] Tokens.\n* [Action]: Roll vs. Spirit and add a Black [Charm] Token for each [Hit].",
                  ":titles",
                  "Warding Sign"
                ),
                "Death Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death Ward",
                  ":summary",
                  "* Provides increased defense against undead beings."
                ),
                "Evil Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Evil Eye",
                  ":summary",
                  "* Reduces Spirit"
                ),
                "Fertile Loins",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fertile Loins",
                  ":summary",
                  "* Next intercourse will have doubled chance to conceive a child, if possible."
                ),
                ":Haste",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Haste",
                  ":summary",
                  "* [Effect]: +1 Move\n* [Target]: [Area]\n* [Duration]: [Hits]"
                ),
                "Inscribe Rune",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inscribe Rune",
                  ":summary",
                  "* Allows the permanent addition of magical properties to an item."
                ),
                "Inscribe Sigil",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inscribe Sigil",
                  ":summary",
                  "* Allows the temporary addition of magical properties to an item, portal, or area."
                ),
                ":Malediction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Malediction",
                  ":summary",
                  "* The opposite of [Charm]. Malediction increases the severity of negative effects.\n* [Action]: Roll vs. Spirit and add a Black [Curse] Token for each [Hit]."
                ),
                "Magic Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magic Ward",
                  ":summary",
                  "* Provides increased defense against magical creatures."
                ),
                "Mental Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Ward",
                  ":summary",
                  "* Provides increased defense against mental attacks."
                ),
                "Metal Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Metal Ward",
                  ":summary",
                  "* Provides increased defense against predominately metal weapons."
                ),
                "Nature Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nature Ward",
                  ":summary",
                  "* Provides increased defense against Animals, and weather."
                ),
                ":Palsy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Palsy",
                  ":summary",
                  "* Reduces Move"
                ),
                ":Pox",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pox",
                  ":summary",
                  "* Reduces Social Skills"
                ),
                "Rule of Three",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rule of Three",
                  ":reference",
                  "* Ever mind the Rule of Three, three times what thou givest returns to thee, this lesson well, thou must learn, thee only gets what thou dost earn.",
                  ":summary",
                  "* Whatever energy a person puts out into the world, be it positive or negative, will be returned to that person three times."
                ),
                ":Safekeep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Safekeep",
                  ":summary",
                  "* [Action]: Enchant an item to prevent loss or theft. Any effect that would remove, loose, or damage the item must roll vs. Safekeep or fail in addition to any other checks."
                ),
                ":Slow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slow",
                  ":summary",
                  "* [Effect]: -1 Move\n* [Target]: [Area]\n* [Duration]: [Hits]"
                ),
                "Spirit Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Ward",
                  ":summary",
                  "* Provides increased defense against spirit beings and attack against [Spirit]."
                ),
                "Stone Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stone Ward",
                  ":summary",
                  "* Provides increased defense against predominately stone weapons."
                ),
                ":Weaken",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Weaken",
                  ":summary",
                  "* Reduces Body"
                ),
                "Wood Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wood Ward",
                  ":summary",
                  "* Provides increased defense against predominately wooden weapons."
                )
              )
            ),
            ":Shamanism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Shamanism",
              ":titles",
              "Shaman, Spirit Caller, Witch Doctor",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Call Spirits",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Spirits"
                ),
                "Control Spirit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Spirit"
                ),
                ":Reincarnate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reincarnate",
                  ":summary",
                  "* Similar to [Resurrect], this ability allows a being to return to life in a new body if this ritual is performed soon after death. The reincarnated being will be physically different from the original, potentially different age, abilities, gender, race, or species. The being will have most of its original memories, but will often have a substantially different personality. If any [Successes] are made, the reincarnation succeeds and the character must be created again with significant differences and will appear in a location consistent with its new identity. The new character is built at a level equal to it original level or the reincarnate skill level whichever is lower. If the reincarnate skill level is lower than 10, the reincarnated being will be -10% younger than before for each level below 10."
                ),
                "Second Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Second Sight",
                  ":reference",
                  "* I've got electric light, and I've got second sight.  I've got amazing...powers...of observation.  And that is how I know...When I try to get through...On the telephone to you...There will be nobody home. - Pink Floyd, Nobody Home",
                  ":summary",
                  "* Second sight is the ability to see the spiritual essence of beings. It quickly identifies the living from the unliving and can detect disease both phyiscal and mental."
                ),
                "Spirit Guide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Guide"
                ),
                "Spiritual Affinity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spiritual Affinity",
                  ":summary",
                  "* Death: Enter the Spirit Realm"
                ),
                ":Totem",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Totem"
                ),
                "Vision Quest",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vision Quest"
                )
              )
            ),
            ":Sympathy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Sympathy",
              ":reference",
              "* Synchronicity is a phenomenon where people interpret two seemingly unrelated experiences as being meaningfully intertwined.",
              ":summary",
              "* Sympathetic magic is using a symbol to represent the thing you want to affect with your magic. Whatever you do to the symbol, you do to the target. The object and the thing it represents are 'in sympathy'; they are aligned. Sympathetic magic is a useful idea because often, your target is something non-physical, or something you can’t otherwise interact with directly. You could banish negative thoughts directly, but it’s easier to tie them to something physical by writing them down and then burning the paper. As the paper burns, so does the negativity. Correspondences are related to this. For example, different-colored candles represent different desires (like green for money, red for love, black for banishment, etc.) and as the candle burns down, your spell is cast. Wearing different stones or crystals can attract luck or success to you.   \n				* Cursed Energy - Cursed energy is born from negative emotions such as grief and anger. These negative feelings are common in human society so almost everyone possesses cursed energy. Cursed Energy can be controlled and focused to perform various magical feats.\n				* Cursed Spirit - Cursed Spirits are apparitions manifested entirely from cursed energy. Even their bodies are composed of cursed energy, making cursed spirits invisible to non-sorcerers. The emission of cursed energy from humans collects like sediment until a cursed spirit is born from the collective negative energy. Cursed Spirits born with strong feelings directed toward a certain aspect are especially strong. The stronger humanity's fear and anger is directed at cursing a certain aspect of the world, like natural disasters, the more powerful Curse Spirits spawned from those negative sentiments will be.\n				* Law of Similarity - Like produces like. An effect resembles its cause.\n				* Law of Contact/Contagion - Things which have once been in contact with each other continue to act on each other at a distance.",
              ":titles",
              "Correspondence, Curses, Sympathetic Magic, Synchonicity, Voodoo, Witch man, Witchdoctor",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Black Vise",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Black Vise",
                  ":summary",
                  "* Target must use a special [Ability] each [Turn] or take a [Stun]."
                ),
                "Breath of Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Breath of Life",
                  ":summary",
                  "* Create an [Animated] creature.",
                  ":titles",
                  "Cursed Corpse"
                ),
                "Cursed Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cursed Sight",
                  ":summary",
                  "* Curses and Cursed Spirits are normally invisibile, but this ability allows them to be seen."
                ),
                "Cursed Tool",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cursed Tool"
                ),
                "Cursed Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cursed Weapon",
                  ":summary",
                  "* Cursed Item - Items can also be infused with Curse Energy including such as cursed tools, cursed objects, and cursed corpses."
                ),
                "Dominant Possession",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dominant Possession",
                  ":summary",
                  "* After defeating a target in mental combat, the user possesses the body of the target. The user keeps his Mind and Will stats and uses the target's Body.",
                  ":titles",
                  "Skinriding"
                ),
                ":Effigy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Effigy",
                  ":reference",
                  "Poppet, Voodoo Doll",
                  ":summary",
                  "* Create a figure representing the target. The target can be a being, a vehicle, a building, etc. The figure can be a doll, a wax figurine, an Origami, a sculpture, a drawing, or any other image created by hand by the caster. In addition, the Effigy must have some item linking it to the target. This can be a possession, a hair, a body part, etc. The more significant the better.\n* Spells may then be cast upon the figure as if the figure was at 4 spaces range regardless of actual distance or line of sight. This ability can create any number of effects, but it cannot actually cause physical damage. All Body damage becomes [Stun] if the target cannot take anymore [Stun], the excess is ignored.\n* The ability level of any Spells cast are [Limited] by the skill with which the Effigy is created and the significance of the item linked to the Effigy.",
                  ":titles",
                  "Straw Man"
                ),
                ":Fetish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fetish",
                  ":summary",
                  "* A fetish is a small object that can be used to bind a spirit. The item must be unique and may be found or created.\n* [Action]: If you killed an extradimensional creatures last turn, you may capture the spirit of that creature in the Fetish.\n* [Action]: Release the spirit in the fetish to perform one task that turn. The spirit must perform the task if it is able though it does so under duress and may twist the intentions or deceive the user. Regardless of outcome, the spirit is released and will disappear."
                ),
                ":Figurine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Figurine",
                  ":summary",
                  "* A miniature of a small creature grows into a full size version."
                ),
                "Iron Maiden",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Iron Maiden",
                  ":summary",
                  "* Target takes 1 Stun Token for each point of combat damage it inflicts.",
                  ":titles",
                  "Thorns"
                ),
                ":Juju",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Juju",
                  ":summary",
                  "* The most horrific of fetishes, the shrunken head permanently holds the spirit of the slain person in an undead limbo. A shrunken head may only be created immediately after the user directly slays a person. After that a gruesome series of rituals over the next week mummifies the head and binds the spirit to the head.\n* [Action]: Once per day, for 1 hour, the user may speak to the head and the head will telepathically respond. The head is effectively a prisoner of the user, and the user may interrogate or torment the head as he sees fit. The head cannot remain silent, but it does not have to be helpful or truthful.",
                  ":titles",
                  "Shrunken Head, Tsantsa"
                ),
                "Life-like Art",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Life-like Art"
                ),
                "Life-like Tattoo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Life-like Tattoo"
                ),
                "Living Tool",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Tool",
                  ":summary",
                  "* Animates a small tool which makes the next skill easier.\n* [Requires]: A simple tool with no moving parts.\n* [Action]: On the next action the tool may be used at [+1 Skill]."
                ),
                "Living Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Weapon",
                  ":summary",
                  "* Animates a melee weapon which makes the next attack easier.\n* [Requires]: A melee weapon with no moving parts.\n* [Action]: On the next action the weapon may be used at [+1 Skill]."
                ),
                ":Miniature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Miniature",
                  ":summary",
                  "* A miniature of a simple item grows into a full size version."
                ),
                ":Puppeteer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Puppeteer",
                  ":summary",
                  "* When this unit acts the target unit must perform the same actions."
                ),
                ":Rack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rack",
                  ":summary",
                  "* Each time Target uses a special [Ability] it takes a [Stun]."
                ),
                ":Serendipity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Serendipity"
                ),
                "Spirit Bottle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Bottle",
                  ":summary",
                  "* Create a bottle, mirror, or vase that captures and holds the Spirit of a being. If the being's body dies, the spirit continues to exist in the bottle. The spirit may mentally communicate with anyone touching the bottle."
                ),
                "Spirit Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Link",
                  ":summary",
                  "* Create a bond with target. Each time it does damage to a target, remove 1 white token from yourself."
                ),
                "Subtle Possession",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subtle Possession",
                  ":summary",
                  "* The user's spirit secretly enters the body of the target. The user acts as a manipulative inner voice to the target."
                ),
                "Sympathetic Bond",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sympathetic Bond",
                  ":summary",
                  "* [Action]: Bond with a willing unit.\n* [Action]: Transmit an emotion to a bonded unit."
                ),
                "True Name",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "True Name",
                  ":summary",
                  "* If the user knows the True Name of his subject, he gains +1 [Synchonicity] against that subject."
                )
              )
            )
          )
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
    vx_type: nx_tactics_books_magic.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Magic",
      ":image",
      "Magick.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Magic Overview",
        nx_tactics_books_magic.f_chapter_magic_overview(),
        "Magical Skills",
        nx_tactics_books_magic.f_chapter_magical_skills(),
        "Magic Items",
        nx_tactics_books_magic.f_chapter_magic_items()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_magic_items": nx_tactics_books_magic.e_chapter_magic_items,
      "chapter_magic_overview": nx_tactics_books_magic.e_chapter_magic_overview,
      "chapter_magical_skills": nx_tactics_books_magic.e_chapter_magical_skills,
      "tacticsbook": nx_tactics_books_magic.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_magic_items": nx_tactics_books_magic.t_chapter_magic_items,
      "chapter_magic_overview": nx_tactics_books_magic.t_chapter_magic_overview,
      "chapter_magical_skills": nx_tactics_books_magic.t_chapter_magical_skills,
      "tacticsbook": nx_tactics_books_magic.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/magic",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_magic_items)
    nx_tactics_books_magic.t_chapter_magic_items['vx_value'] = {
      name          : "chapter_magic_items",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magic_items
    }

    // (func chapter_magic_overview)
    nx_tactics_books_magic.t_chapter_magic_overview['vx_value'] = {
      name          : "chapter_magic_overview",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magic_overview
    }

    // (func chapter_magical_skills)
    nx_tactics_books_magic.t_chapter_magical_skills['vx_value'] = {
      name          : "chapter_magical_skills",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_chapter_magical_skills
    }

    // (func tacticsbook)
    nx_tactics_books_magic.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/magic",
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
      fn            : nx_tactics_books_magic.f_tacticsbook
    }

  }
}