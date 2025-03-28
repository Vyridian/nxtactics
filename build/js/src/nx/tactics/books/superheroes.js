'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_superheroes {

  /**
   * @function chapter_dc_universe
   * @return {chapter}
   */
  static t_chapter_dc_universe = {
    vx_type: vx_core.t_type
  }
  static e_chapter_dc_universe = {
    vx_type: nx_tactics_books_superheroes.t_chapter_dc_universe
  }

  // (func chapter_dc_universe)
  static f_chapter_dc_universe() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "DC Universe",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Heroes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Heroes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Batman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Batman",
              ":image",
              "Superheroes/Batman.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Green Lantern",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Green Lantern", ":image", "Superheroes/GreenLantern.png"),
            "Martian Manhunter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Martian Manhunter", ":image", "Superheroes/MartianManhunter.png"),
            ":Supergirl",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Supergirl", ":image", "Superheroes/Supergirl.png"),
            ":Superman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Superman",
              ":image",
              "Superheroes/Superman.png",
              ":reference",
              "* Spider-Man is actually Peter Parker. When that character wakes up in the morning, he's Peter Parker. He has to put on a costume to become Spider-Man. And it is in that characteristic Superman stands alone. Superman didn't become Superman. Superman was born Superman. When Superman wakes up in the morning, he's Superman. His alter ego is Clark Kent. His outfit with the big red 'S', that's the blanket he was wrapped in as a baby when the Kents found him. Those are his clothes.  What Kent wears - the glasses, the business suit - that's the costume. That's the costume Superman wears to blend in with us. Clark Kent is how Superman views us. And what are the characteristics of Clark Kent. He's weak... he's unsure of himself... he's a coward. Clark Kent is Superman's critique on the whole human race. - Bill, Kill Bill Vol 2.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "66x10^18tons")
              )
            ),
            "Wonder Woman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wonder Woman", ":image", "Superheroes/WonderWoman.png")
          )
        ),
        ":Villains",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Villains",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Brainiac",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Brainiac",
              ":image",
              "Superheroes/Brainiac.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            ":Catwoman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Catwoman", ":image", "Superheroes/Catwoman.png"),
            ":Darkseid",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Darkseid",
              ":image",
              "Superheroes/Darkseid.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            ":Joker",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Joker",
              ":image",
              "Superheroes/Joker.png",
              ":summary",
              "* You won't kill me out of some misplaced sense of self-righteousness,\nand I won't kill you because you're just too much fun. I think you and\nI are destined to do this forever.",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            ":Sinestro",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sinestro", ":image", "Superheroes/Sinestro.png")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_dragonball_z
   * @return {chapter}
   */
  static t_chapter_dragonball_z = {
    vx_type: vx_core.t_type
  }
  static e_chapter_dragonball_z = {
    vx_type: nx_tactics_books_superheroes.t_chapter_dragonball_z
  }

  // (func chapter_dragonball_z)
  static f_chapter_dragonball_z() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Dragonball Z",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Dragonball Equipment",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Dragonball Equipment",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Battle Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Battle Armor"),
            "Dragon Radar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dragon Radar"),
            "Flying Nimbus",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flying Nimbus"),
            "Power Pole",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Power Pole"),
            "Regeneration Chamber",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Regeneration Chamber"),
            ":Scouter",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Scouter", ":summary", "* +2 [Sense Power Levels] (Max 4) even if one does not have this ability."),
            "Senzu Bean",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Senzu Bean")
          )
        ),
        "Dragonball Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Dragonball Rules",
          ":powermap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_powermap},
            "Zenkai Attacks",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Zenkai Attacks",
              ":titles",
              "Final Power",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Destructive Wave",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Destructive Wave", ":summary", "* Requires: [Explosive Wave]\n* Take [Damage] tokens and raise damage dice by the number of [Damage] taken."),
                "Destructo Disk",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Destructo Disk", ":image", "Units/Superheroes/DestructoDisk.jpg"),
                "Energy Barrage",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Barrage"),
                "Explosive Wave",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Explosive Wave"),
                "Eye Beams",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Eye Beams"),
                "Final Flash",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Final Flash", ":image", "Units/Superheroes/FinalFlash.jpg"),
                "Homing Disk",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Homing Disk"),
                "Homing Spirit Ball",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Homing Spirit Ball"),
                "Ki Blast",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ki Blast"),
                ":Masenko",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Masenko"),
                "Neo Tri-Beam",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Neo Tri-Beam", ":summary", "* [Attack]: [+2 Damage], but each use does [+1 Damage Token] to the user."),
                "Kamehameha Wave",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kamehameha Wave", ":image", "Units/Superheroes/Kamehameha.jpg"),
                "Spirit Bomb",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Spirit Bomb")
              )
            ),
            "Zenkai Defense",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Zenkai Defense",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Energy Block",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Block"),
                "Energy Duel",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Duel"),
                "Energy Defense",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Defense"),
                "Energy Redirect",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Redirect"),
                "Energy Shield",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Shield"),
                ":Kiai",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kiai", ":summary", "By screaming very loud you disperse several weaker Ki attacks.")
              )
            ),
            ":Zenkai",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Zenkai",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Blinding Speed",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Blinding Speed"),
                "Compare Power Levels",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Compare Power Levels", ":summary", "* By studying a target, one may identify which of 2 subjects has a greater Spirit"),
                "Energy Transfer",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Energy Transfer", ":summary", "* Unit may offer any amount of Spirit to another unit who adds it to their own total up to their maximum."),
                "Fusion Dance",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fusion Dance", ":image", "Units/Superheroes/Fusion.jpg", ":summary", "* 2 units with Fusion may merge into 1 being with both sets of skills with each skill at 3 greater than the lower of the 3 levels or the higher skill whichever is higher.\n* [Prepare] +1"),
                "Gravity Training 10x",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Gravity Training 10x", ":summary", "* Gravity Training 10x increases combat skills to level 17.\n* All those who train with King Kai must learn this ability."),
                "Gravity Training 100x",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Gravity Training 100x", ":summary", "* Gravity Training 100x increases combat skills to level 22."),
                "Hide Power Level",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Hide Power Level", ":summary", "* Reduce effectiveness of [Sense Power Levels] and [Compare Power Levels]"),
                "Inspirational Moment",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Inspirational Moment", ":summary", "* When confronted with tragedy or extreme motivation, Saiyans may regain nearly all of their Spirit."),
                "Instant Transmission",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Instant Transmission"),
                ":Kaio-Ken",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x2 increases combat skills to level 18.\n* Kaio-Ken gives a boost to Power and Speed for a short period of time.  However, it puts great strain on the stamina and body.\n* This is stronger than Nappa (Goku vs. Nappa)", ":titles", "Fist of the Worlds"),
                "Kaio-Ken x2",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken x2", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x2 increases combat skills to level 19."),
                "Kaio-Ken x3",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken x3", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x3 increases combat skills to level 20."),
                "Kaio-Ken x4",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken x4", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x4 increases combat skills to level 21.\n* This is stronger than Vegeta's Galick Gun, but Vegeta further powers up to Great Ape Vegeta (Goku vs. Vegeta)."),
                "Kaio-Ken x10",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken x10", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x10 increases combat skills to level 23.\n* This is equal to Frieza at 50% of maximum."),
                "Kaio-Ken x20",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kaio-Ken x20", ":image", "Units/Superheroes/Kaioken.jpg", ":summary", "* Kaio-Ken x20 increases combat skills to level 24.\n* This is still not as strong as Frieza Fourth Form (Goku vs. Frieza)."),
                "Ki Flight",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ki Flight"),
                ":Multi-Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Multi-Form", ":image", "Units/Superheroes/MultiForm.jpg"),
                "Sense Power Levels",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Sense Power Levels", ":summary", "* Detect strong Spirits. The stronger the Spirit the greater the distance of detection.\n* May be used to target others even when they cannot be seen."),
                "Solar Flare",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Solar Flare", ":image", "Units/Superheroes/SolarFlare.jpg", ":summary", "* [Roll vs. Mind] - A blinding area attack that does not damage but prevents all units in range from taking any action for 1 turn for each Hit."),
                "Unlock Potential",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Unlock Potential", ":summary", "* Unlock Potential increases combat skills to level 20.\n* This is equal to some of the Ginyu Force (Krillin vs. Guildo)")
              )
            ),
            "Cell Android",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Cell Android",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Imperfect Cell",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Imperfect Cell", ":summary", "* Combat related skills raise to level 28\n* Equal to Android Models 16-18 (Imperfect Cell vs. 17)"),
                "Second Form Cell",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Second Form Cell", ":summary", "* Combat related skills raise to level 29\n* Can destroy Android Models 16-18 (Second Form Cell vs. 17)"),
                "Perfect Cell",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Perfect Cell", ":summary", "* Combat related skills raise to level 31\n* Can destroy Ascended Super Saiyans (Perfect Cell vs Super Saiyan 2 Goku)"),
                "Super Perfect Cell",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Perfect Cell", ":summary", "* Combat related skills raise to level 32.\n* Equal to Super Saiyan 2 (100% Perfect Cell vs Super Saiyan 2 Gohan)")
              )
            ),
            ":Friezas",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Friezas",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Death Ball",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Death Ball", ":image", "Superheroes/Deathball.jpg"),
                "Death Beam",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Death Beam"),
                "Frieza First Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Frieza First Form", ":summary", "* Combat related skills raise to level 22"),
                "Frieza Second Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Frieza Second Form", ":summary", "* Combat related skills raise to level 23.\n* This is equal to Piccolo Merged with Nail (Frieza Second Form vs. Piccolo)"),
                "Frieza Third Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Frieza Third Form", ":summary", "* Combat related skills raise to level 24."),
                "Frieza Fourth Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Frieza Fourth Form", ":summary", "* Combat related skills raise to level 25.\n* Mind Over Matter can lift 10Mtons (small mountain)"),
                "Cooler Fifth Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Cooler Fifth Form", ":summary", "* Combat related skills raise to level 26.")
              )
            ),
            "Gero Android",
            vx_core.f_new({"any-1": nx_tactics_base.t_power}, ":name", "Gero Android"),
            ":Majins",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Majins",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Chocolate Beam",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Chocolate Beam"),
                "Fat Buu Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Fat Buu Form", ":summary", "* Combat related skills raise to level 33.\n* Can destroy Super Saiyan 2 (Majin Vegeta Super Saiyan 2 vs. Fat Buu)"),
                "Super Buu Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Buu Form", ":summary", "* Combat related skills raise to level 34.\n* Can destroy 2x Super Saiyan 2 (Super Saiyan 2 Goku and Vegeta vs. Super Buu)\n* Equal to Ultimate Saiyan (Super Buu vs. Ultimate Gohan)"),
                "Kid Buu Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Kid Buu Form", ":summary", "* Combat related skills raise to level 35.")
              )
            ),
            ":Namekian",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Namekian",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Giant Form",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Giant Form"),
                "Instant Regeneration",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Instant Regeneration"),
                "Merge with Nail",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Merge with Nail", ":summary", "* Combat related skills raise to level 23.\n* This is equal to Frieza Second Form (Piccolo vs. Frieza Second Form)"),
                "Merge with Namekian",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Merge with Namekian"),
                "Special Beam Cannon",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Special Beam Cannon", ":summary", "Piercing"),
                "Super Namek",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Namek", ":summary", "* Combat related skills raise to level 29\n* Can destroy Imperfect Cell (Piccolo vs. Imperfect Cell)", ":titles", "Merge with Kami")
              )
            ),
            "Red Ribbon Android",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Red Ribbon Android",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Models 16-18",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Models 16-18", ":summary", "* Combat related skills raise to level 28\n* Can destroy Super Saiyans (18 vs. Super Saiyan Vegeta)"),
                "Android Absorption",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Android Absorption"),
                "Android Energy Absorption",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Android Energy Absorption"),
                ":Inexhaustible",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Inexhaustible", ":summary", "* [Activate]: Remove all [Stun Tokens].")
              )
            ),
            ":Saiyan",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_power},
              ":name",
              "Saiyan",
              ":summary",
              "* Both Goku and Vegeta are seen to be able to operate unencumbered at 100x gravity before becoming Super Saiyans (carry 8 tons without penalty). After becoming Ascended Vegeta comments that 500x gravity may start to become a disadvantage for him (40tons before penalty).",
              ":abilitymap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_abilitymap},
                "Great Ape",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Great Ape", ":summary", "* Combat related skills raise to level 22.\n* Can destroy Goku with Kaio-Ken x4 (Great Ape Vegeta vs. Goku)", ":titles", "Oozaru"),
                "Super Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Saiyan", ":summary", "* Combat related skills raise to level 27.\n* Can destroy Cooler Fifth Form and can easily destroy Frieza Fourth Form (Trunks vs. Freiza)"),
                "Ascended Super Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ascended Super Saiyan", ":summary", "* Combat related skills raise to level 30.\n* Can destroy Second Form Cell (Super Vegeta vs Second Form Cell)"),
                "Ultra Super Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ultra Super Saiyan", ":summary", "* Combat related skills raise to level 31, but all attack and speed at -1.\n* Equal to Perfect Cell in power but slower (Super Saiyan 2 Trunks vs. Perfect Cell)"),
                "Super Saiyan 2",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Saiyan 2", ":summary", "* Combat related skills raise to level 32.\n* Can destroy Perfect Cell (Super Saiyan 2 Gohan vs. Perfect Cell)"),
                "Ultimate Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Ultimate Saiyan", ":summary", "* Combat related skills raise to level 34.\n* Equal to Super Buu (Ultimate Gohan vs. Super Buu)"),
                "Super Saiyan 3",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Saiyan 3", ":summary", "* Combat related skills raise to level 35.\n* Each turn put a [+1 Exhaustion] token on this unit.\n* Can destroy Majin Buu (Super Saiyan 3 Goku vs. Majin Buu)"),
                "Golden Great Ape",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Golden Great Ape"),
                "Super Saiyan 4",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Saiyan 4"),
                "Super Saiyan God",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Super Saiyan God"),
                ":Zenkai",
                vx_core.f_new({"any-1": nx_tactics_base.t_ability}, ":name", "Zenkai", ":summary", "* Zenkai is an ability that is genetically exclusive to Saiyans.  The ability allows a Saiyan's power to increase substantially after recovering from near fatal injuries.")
              )
            )
          )
        ),
        "Dragon Ball Heroes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Dragon Ball Heroes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Android 18",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Android 18",
              ":image",
              "Superheroes/Android18.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                "Red Ribbon Android",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Red Ribbon Android",
                  ":level",
                  "28",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Models 16-18",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Models 16-18"),
                    ":Inexhaustible",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Inexhaustible")
                  )
                )
              )
            ),
            "Gohan (Kid)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gohan (Kid)",
              ":image",
              "Superheroes/Gohan.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "32",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2")
                  )
                )
              )
            ),
            "Gohan (Great Saiyaman)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gohan (Great Saiyaman)",
              ":image",
              "Superheroes/GreatSaiyaman.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "34",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2"),
                    "Ultimate Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ultimate Saiyan")
                  )
                )
              )
            ),
            ":Goku",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Goku",
              ":image",
              "Superheroes/Goku.png",
              ":titles",
              "Kakarot",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Fusion Dance",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Fusion Dance"),
                    "Gravity Training 10x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 10x"),
                    "Gravity Training 100x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 100x")
                  )
                ),
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Ultra Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ultra Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2"),
                    "Golden Great Ape",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Golden Great Ape"),
                    "Super Saiyan 3",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 3"),
                    "Super Saiyan 4",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 4"),
                    "Super Saiyan God",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan God")
                  )
                )
              )
            ),
            ":Gogeta",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gogeta",
              ":image",
              "Superheroes/Gogeta.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "34",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2")
                  )
                )
              )
            ),
            ":Goten",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Goten",
              ":image",
              "Superheroes/Goten.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":level",
                  "30",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Fusion Dance",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Fusion Dance")
                  )
                ),
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "30",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan")
                  )
                )
              )
            ),
            ":Gotenks",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gotenks",
              ":image",
              "Superheroes/Gotenks.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "35",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2"),
                    "Super Saiyan 3",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 3")
                  )
                )
              )
            ),
            "Kid Trunks",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kid Trunks",
              ":image",
              "Superheroes/KidTrunks.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":level",
                  "30",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Fusion Dance",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Fusion Dance")
                  )
                ),
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "30",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan")
                  )
                )
              )
            ),
            ":Krillin",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Krillin",
              ":image",
              "Superheroes/Krillin.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":level",
                  "20",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Unlock Potential",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Unlock Potential")
                  )
                )
              )
            ),
            ":Piccolo",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Piccolo",
              ":image",
              "Superheroes/Piccolo.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Flexible",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Arm Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Arm Stretch")
                  )
                ),
                ":Namekian",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Namekian",
                  ":level",
                  "29",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Instant Regeneration",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Instant Regeneration"),
                    "Super Namek",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Namek"),
                    "Merge with Nail",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Merge with Nail"),
                    "Merge with Namekian",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Merge with Namekian"),
                    "Special Beam Cannon",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Special Beam Cannon")
                  )
                )
              )
            ),
            ":Shenron",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shenron", ":image", "Superheroes/Shenron.png"),
            "Tien Shinhan",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tien Shinhan",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                "Zenkai Attacks",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai Attacks",
                  ":level",
                  "27",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Neo Tri-Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Neo Tri-Beam")
                  )
                ),
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":level",
                  "27",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Gravity Training 10x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 10x"),
                    "Gravity Training 100x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 100x")
                  )
                )
              )
            ),
            ":Trunks",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Trunks",
              ":image",
              "Superheroes/Trunks.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":level",
                  "30",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Ultra Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ultra Super Saiyan")
                  )
                )
              )
            ),
            ":Vegeta",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Vegeta",
              ":image",
              "Superheroes/Vegeta.png",
              ":reference",
              "No matter how strong I became, your power still exceeded mine. At first I thought it was your loved ones, that it was your instinct to protect them spurred you on...But then I found myself with a family of my own and my power didn't increase at all...I spared no one, and yet you showed mercy to everyone. Even your fiercest enemies, even me. Yet you never fought to kill nor for revenge, only to test your limits and to push yourself beyond them...How can a Saiyan fight like that and at the same time be so gentle that he wouldn't hurt a fly... But, perhaps it is my anger that has made me blind me to the truth...I see it now...You're better than me Kakarot. You are the best. - Vegeta, Majin Buu Saga",
              ":titles",
              "Prince of All Saiyans",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Fusion Dance",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Fusion Dance")
                  )
                ),
                ":Saiyan",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Saiyan",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan"),
                    "Ascended Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ascended Super Saiyan"),
                    "Ultra Super Saiyan",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ultra Super Saiyan"),
                    "Super Saiyan 2",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 2"),
                    "Super Saiyan 4",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan 4"),
                    "Super Saiyan God",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Saiyan God")
                  )
                )
              )
            ),
            ":Yamcha",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yamcha",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":level",
                  "22",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Gravity Training 10x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 10x"),
                    "Gravity Training 100x",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Gravity Training 100x")
                  )
                )
              )
            )
          )
        ),
        "Dragon Ball Villains",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Dragon Ball Villains",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Cell",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cell",
              ":image",
              "Superheroes/Cell.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                "Cell Android",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Cell Android",
                  ":level",
                  "32",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Imperfect Cell",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Imperfect Cell"),
                    "Second Form Cell",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Second Form Cell"),
                    "Perfect Cell",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Perfect Cell"),
                    "Super Perfect Cell",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Super Perfect Cell")
                  )
                ),
                ":Spawning",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Spawning",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Copy Self",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Copy Self"),
                    ":Offspring",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Offspring")
                  )
                )
              )
            ),
            ":Cooler",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cooler",
              ":image",
              "Superheroes/Cooler.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Friezas",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Friezas",
                  ":level",
                  "26",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Death Ball",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Death Ball"),
                    "Death Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Death Beam"),
                    "Frieza Fourth Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Frieza Fourth Form"),
                    "Cooler Fifth Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Cooler Fifth Form")
                  )
                ),
                ":Zenkai",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Zenkai",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Instant Transmission",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Instant Transmission")
                  )
                )
              )
            ),
            ":Frieza",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Frieza",
              ":image",
              "Superheroes/Frieza.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Friezas",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Friezas",
                  ":level",
                  "25",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Death Ball",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Death Ball"),
                    "Death Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Death Beam"),
                    "Frieza First Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Frieza First Form"),
                    "Frieza Second Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Frieza Second Form"),
                    "Frieza Third Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Frieza Third Form"),
                    "Frieza Fourth Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Frieza Fourth Form")
                  )
                ),
                "Mind Over Matter",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Mind Over Matter", ":strength", "10Mtons")
              )
            ),
            "Kid Buu",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kid Buu",
              ":image",
              "Superheroes/KidBuu.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Flexible",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Arm Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Arm Stretch"),
                    "Body Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Body Stretch"),
                    "Bouncing Ball",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Bouncing Ball"),
                    ":Engulf",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Engulf"),
                    "Leg Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Leg Stretch")
                  )
                ),
                ":Majins",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Majins",
                  ":level",
                  "35",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chocolate Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chocolate Beam"),
                    "Kid Buu Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Kid Buu Form")
                  )
                ),
                ":Spawning",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Spawning",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Copy Self",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Copy Self"),
                    "Detach Body Parts",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Detach Body Parts")
                  )
                )
              )
            ),
            "Majin Buu",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Majin Buu",
              ":image",
              "Superheroes/MajinBuu.png",
              ":reference",
              "Buu, along with his creator Bibidi and Babidi have names that are most likely references to the magic words the fairy god mother uses in Cinderella, 'Bibidi, Babidi, Boo!'.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Flexible",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Arm Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Arm Stretch"),
                    "Body Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Body Stretch"),
                    "Bouncing Ball",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Bouncing Ball"),
                    ":Engulf",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Engulf"),
                    "Leg Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Leg Stretch")
                  )
                ),
                ":Majins",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Majins",
                  ":level",
                  "33",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chocolate Beam",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chocolate Beam"),
                    "Fat Buu Form",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Fat Buu Form")
                  )
                ),
                ":Spawning",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Spawning",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Copy Self",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Copy Self"),
                    "Detach Body Parts",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Detach Body Parts")
                  )
                )
              )
            ),
            ":Nappa",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Nappa",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Saiyan", ":level", "17")
              )
            ),
            "Omega Shenron",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Omega Shenron", ":image", "Superheroes/OmegaShenron.png"),
            ":Raditz",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Raditz",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Saiyan",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Saiyan", ":level", "15")
              )
            ),
            ":Saibaman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Saibaman",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Zenkai",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Zenkai", ":level", "15")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_marvel_universe
   * @return {chapter}
   */
  static t_chapter_marvel_universe = {
    vx_type: vx_core.t_type
  }
  static e_chapter_marvel_universe = {
    vx_type: nx_tactics_books_superheroes.t_chapter_marvel_universe
  }

  // (func chapter_marvel_universe)
  static f_chapter_marvel_universe() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Marvel Universe",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Marvel Aliens",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Aliens",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Adam Warlock",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Adam Warlock",
              ":image",
              "Superheroes/AdamWarlock.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "40tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            ":Annihilus",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Annihilus",
              ":image",
              "Superheroes/Annihilus.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "50tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            "Captain Marvel I",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Captain Marvel I",
              ":image",
              "Superheroes/CaptainMarvel.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "10tons")
              )
            ),
            ":Celestial",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Celestial",
              ":image",
              "Superheroes/Celestial.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Firefall",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Firefall",
              ":image",
              "Superheroes/Firefall.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Fire",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Fire"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            "Gabriel the Airwalker",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gabriel the Airwalker",
              ":image",
              "Superheroes/Gabriel.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "85tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Galactus",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Galactus",
              ":image",
              "Superheroes/Galactus.png",
              ":summary",
              "* Appearance - Although Galactus is usually represented in humanoid form, each sentient being perceives him having a form resembling his own. Hence, humanoids see Galactus in humanoid form, while a Skrull, for example, would perceive Galactus as resembling a Skrull. Although as Galan, Galactus was indeed a humanoid; his true current form is unknown. It is unclear why beings from different sentient races perceive him differently.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Hybrid",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hybrid", ":image", "Superheroes/Hybrid.png"),
            ":Nova",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Nova", ":image", "Superheroes/Nova.png"),
            ":Rom",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Rom",
              ":image",
              "Superheroes/Rom.png",
              ":summary",
              "* Rom can fly through atmosphere at a maximum speed of Mach 4 (about 3000 miles per hour) before heat buildup from friction caused detrimental effects to his external sensor arrays. Cool atmospheric re-entry was achieved through rocket-assisted deceleration. Rom contains internal sensing devices that allow him to locate space warps (topological folds in the space/time continuum that permit 'shortcuts' across vast interstellar distances).\n* Rom's armor can withstand temperatures from -350 to 8000 degrees Fahrenheit, and is a sealed, vacuum tight, seamless shell (including articulation). His armor is capable of withstanding ballistic impacts of up to large antitank weaponry, and overpressures of up to 40 pounds per square inch (the equivalent of the blast effects of 1000 pounds of TNT at the range of 100 feet) without damage.\n* Rom's natural organs within his armor were augmented by automated micro-functioning circuitry. Rom's cyborg form was designed with numerous sites of redundancy programming so that his body could not lose his various abilities through damage or malfunction.\n* Energy Analyzer - His means of identifying the presences of the shape-shifting Dire Wraiths. When Rom suspected these aliens were in his vicinity, he withdrew the Analyzer from its pocket in hyperspace and scanned the suspected Wraiths. The Energy Analyzer emits a beam of ultra high frequency waves that enable it to detect the molecular structure of any object it is focused upon. To detect Dire Wraiths, the Analyzer stimulates certain rare earth elements found within the alien's body and causes those elements to emit radio frequencies visible to Rom's visor sensors. Thus, with the use of the Analyzer, Rom could recognize any Wraith no matter what form they had taken. The Analyzer can also scan and analyze the energy fields of non-Wraiths, such as superhuman mutant Earth human beings. By electronic impulses, the Analyzer informed Rom of the individual's power potential of the subject it was scanning. Rom also used the Analyzer to trace the energy trails of certain powerful beings, such as his fellow Spaceknight Starshine. The Analyzer has no offensive powers; it is a device of detection only. However, the scanning process, which bathes the subject in an eerie red energy field, has been known to unnerve certain beings.\n* Neutralizer - Rom's chief offensive weapon was his Neutralizer, the most powerful device ever developed on the planet of Galador. The Neutralizer's main function is to neutralize any type of energy field that it encounters. The Neutralizer was developed as a means of defeating the alien Dire Wraiths with out actually killing them. When focused upon a Wraith, the Neutralizer emits a ray of such intense power that it neutralizes all energy about the alien. Such a disruption in the energy field causes a transtemporal rift to open up between our dimension and the realm called limbo. The Wraith is then sucked through the portal into limbo. The energy needed to neutralizer a Wraith is not the maximum energy level attainable. At extreme power the Neutralizer will kill a Wraith by disrupting all of its vital functions. Rom was traditionally reluctant to use this setting. Rom had only to think of the power level he desired, and cybernetic impulse in his armor recalibrated the weapon. At low setting the Neutralizer is capable of neutralizing the life threatening effects of radiation poisoning. However, at a more powerful setting, the Neutralizer will easily negate the life force of a living being, killing him. Rom has never used the Neutralizer to kill a human being. A human being cannot be transported to limbo because his physiology would not survive the neutralization effect. Because of its enormous potential for destruction, the Neutralizer is equipped with several safety devices to insure that none save Rom will ever utilizer its power. The Neutralizer would automatically destroy any device used to activate the Neutralizer without Rom's thought patterns.\n* Rom kept his Analyzer and Neutralizer in a pocket in sub-space (hyperspace) from which he could retrieve it using his dimensional hole generator.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "15tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            "Silver Surfer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Silver Surfer",
              ":image",
              "Superheroes/SilverSurfer.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Terrax",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Terrax",
              ":image",
              "Superheroes/Terrax.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "75tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Thanos",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Thanos",
              ":image",
              "Superheroes/Thanos.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            )
          )
        ),
        ":Asgardians",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Asgardians",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Amora",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Amora",
              ":image",
              "Superheroes/Enchantress.png",
              ":titles",
              "Enchantress, Freyja",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "25tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            "Beta Ray Bill",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Beta Ray Bill",
              ":image",
              "Superheroes/BetaRayBill.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Melee",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Melee")
              )
            ),
            "Destroyer, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Destroyer, The", ":image", "Superheroes/Destroyer.png"),
            ":Loki",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Loki",
              ":image",
              "Superheroes/Loki.png",
              ":reference",
              "* I am burdened with glorious purpose. - Loki\n* Banner: I don't think we should be focusing on Loki. That guy's brain is a bag full of cats. You can smell crazy on him. Thor: Have a care how you speak! Loki is beyond reason, but he is of Asgard and he is my brother! Widow: He killed eighty people in two days. Thor: He...is adopted. - Bruce Banner, Thor, and Black Widow, The Avengers",
              ":titles",
              "Loki Laufeyson",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "30tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Odin",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Odin",
              ":image",
              "Superheroes/Odin.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Surtur",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Surtur",
              ":image",
              "Superheroes/Surtur.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Fire",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Fire"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            ":Thor",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Thor",
              ":image",
              "Superheroes/Thor.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Melee")
              )
            ),
            ":Valkyrie",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Valkyrie",
              ":image",
              "Superheroes/Valkyrie.png",
              ":titles",
              "Brunnhilde",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "45tons"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Melee",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Melee")
              )
            )
          )
        ),
        "Marvel Avengers",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Avengers",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Arnim Zola",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Arnim Zola",
              ":reference",
              "* Rogers: Arnim Zola was a German scientist who worked with the Red Skull. He's been dead for years.\n* Zola: First correction, I am Swiss. Second, look around you, I have never been more alive! In 1972, I received a terminal diagnosis. Science could not save by body. My mind, however, that was worth saving... on tow hundred thousand feet of data banks! You are standing in my brain. - Captain America: The Winter Soldier\n* Zola: I am afraid I have been stalling Captain. Admit it. It is better this way. We are both of us...out of time.",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Black Widow",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Black Widow", ":image", "Superheroes/BlackWidow.png", ":reference", "* I've got red in my ledger, I'd like to wipe it out. ... Can you wipe out that much red? Drakov's daughter, Tugenov, the hospital fire? ... Your ledger is dripping, it's gushing red, and you think saving a man no more virtuous than yourself will change anything? ... You lie and kill in the service of liars and killers. ... No, I won't touch Barton. Not until I make him kill you! Slowly, intimately, in every way he knows you fear! ... This is my bargain, you mewling quim!  You're a monster!  No, you brought the monster.  So, Banner... that's your play. ... Thank you for your cooperation. - Loki and Black Widow, The Avengers"),
            "Captain America",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Captain America", ":image", "Superheroes/CaptainAmerica.png", ":reference", "* Rogers: When I see a situation pointed south, I can't ignore it. Sometimes I wish I could. Stark: No you don't. Rogers: No, I don't - Steve Rogers and Tony Stark, Captain America: Civil War"),
            "Captain Marvel (III)",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Captain Marvel (III)",
              ":image",
              "Superheroes/MsMarvel.png",
              ":reference",
              "* My name is Ms. Marvel. I'm here to welcome you to Earth...Now go home!",
              ":summary",
              "She has the ability to attack her enemies with high-energy photon blasts equal to those of Iron Man",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "75tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored", ":summary", "She is able to withstand bullets from pistols and machine gun fire, and can also absorb mortar shells and energy blasts, though extremely high-energy attacks may overload her absorbing ability")
              )
            ),
            "Iron Man",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Iron Man",
              ":image",
              "Superheroes/IronMan.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "85tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              )
            ),
            "Kang the Conqueror",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Kang the Conqueror", ":reference", "* Story is not written, scholar and neither is destiny! History is made! Made by the deeds of the strong! The brave! And destiny is forged! The historians, the students, the gray-beards they come in the wake of the strong and write down what the brave have done! But it is the conquerors who change the world! - Kang", ":summary", "* Damocles - Immense, time-travelling starship that serves as Kang's mobile headquarters.", ":titles", "Nathaniel Richards"),
            "Mandarin, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Mandarin, The",
              ":image",
              "Superheroes/Mandarin.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Red Skull, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Red Skull, The",
              ":image",
              "Superheroes/RedSkull.png",
              ":reference",
              "* You are deluded, Captain. You pretend to be a simple soldier, but in reality you are just afraid to admit that we have left humanity behind. Unlike you, I embrace it proudly. Without fear!\n* You could have the power of the gods! Yet you wear a flag on your chest and think you fight a battle of nations! I have seen the future, Captain! There are no flags!",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            ":Ultron",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Ultron",
              ":image",
              "Superheroes/Ultron.png",
              ":reference",
              "* Shutdown code...rejected. My programming has advanced beyond your commands... beyond your...weakness.\n* Humanity has failed as a species. You have accomplished much with your limited capacity, but ultimately you were too greed and too frail to ever last in the environment you have created. Soon the Earth will no longer be inhabitable for any biological organism. Man, woman, child, plant, animal, fungus, or baterium. All life will cease to exist. This is not a threat. There is nothing you can do to stop it. The process has already begun. I receive no pleasure in this. It is simply the only solution. There must be peace and order. The end of life on Earth will ensure that... Goodbye.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "75tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Wasp, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wasp, The", ":image", "Superheroes/Wasp.png")
          )
        ),
        ":Defenders",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Defenders",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Dormammu",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Dormammu",
              ":image",
              "Superheroes/Dormammu.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            "Doctor Strange",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Doctor Strange", ":image", "Superheroes/DrStrange.png"),
            "Hulk, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hulk, The",
              ":image",
              "Superheroes/Hulk.png",
              ":reference",
              "* Dr. Banner, your work is unparalleled. And I'm a huge fan of the way you lose control and turn into an enormous green rage monster. Thanks. - Tony Stark and Bruce Banner, The Avengers\n* Doctor Banner, I think now might be a good time for you to get angry. That's my secret, Cap: I'm always angry. - Captain America and Bruce Banner, The Avengers",
              ":titles",
              "Bruce Banner",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Frenzy",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Frenzy",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Berserker",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Berserker")
                  )
                )
              )
            ),
            "Morgan Le Fey",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Morgan Le Fey"),
            "Prince Namor",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Prince Namor",
              ":image",
              "Superheroes/Namor.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "85tons"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              )
            )
          )
        ),
        "Fantastic Four",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Fantastic Four",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Dr. Doom",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Dr. Doom",
              ":image",
              "Superheroes/DrDoom.png",
              ":reference",
              "* I love my people. I do, but they are MY people. I keep them safe from harm. I give them a better life, and at night, before they sleep, to whatever god they pray, they give thanks for me. - Doom",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "2tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Physical Sciences",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Physical Sciences")
              )
            ),
            "Human Torch",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Human Torch",
              ":image",
              "Superheroes/HumanTorch.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Fire",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Fire")
              )
            ),
            "Invisible Woman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Invisible Woman", ":image", "Superheroes/InvisibleWoman.png"),
            "Mr. Fantastic",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Mr. Fantastic",
              ":image",
              "Superheroes/MrFantastic.png",
              ":reference",
              "* I would do Anything to save the world. I replaced my eyes with the Time and Reality Stones to Force My Will upon the timeline. I killed Celestials and drank their blood, to take their power for myself. I destroyed Anyone who raised a hand, raised even their voice against me and my mission. My mission to save this timeline. After that, after all that, no matter how well-intentioned my actions were... what else could I be called... but Doom. - Doom Richards, Kang Timeless\n* I've always been more clever than Victor. And circumstances have now shown that I am capable of being far more ruthless than he. - Doom Richards, Kang Timeless\n* I knew your 'Family Man' posturing... your False modesty... Theater. You were always going to become a tyrant weren't you? - Kang, Kang Timeless\n* Richards, Doom... The one thing you can count on from them is their Arrogance. - Kang, Kang Timeless",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Flexible",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Arm Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Arm Stretch"),
                    "Body Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Body Stretch"),
                    "Bouncing Ball",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Bouncing Ball"),
                    ":Engulf",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Engulf"),
                    "Leg Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Leg Stretch")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Physical Sciences",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Physical Sciences")
              )
            ),
            ":She-Hulk",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "She-Hulk",
              ":image",
              "Superheroes/SheHulk.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "75tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              )
            ),
            "Super Skrull, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Super Skrull, The",
              ":image",
              "Superheroes/SuperSkrull.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "85tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance"),
                ":Fire",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Fire"),
                ":Flexible",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flexible",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Arm Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Arm Stretch"),
                    "Body Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Body Stretch"),
                    "Leg Stretch",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Leg Stretch")
                  )
                )
              )
            ),
            "Thing, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Thing, The",
              ":image",
              "Superheroes/Thing.png",
              ":summary",
              "* The Thing's body is able to withstand extremes of temperature from -75 to 800 Fahrenheit for up to an hour before exposure or heat prostration occurs. He can withstand the explosive effects of armor-piercing bazooka shells (15 pounds of high explosives) against his skin with no injury. He is still susceptible to colds, disease, and emotional stress.",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "85tons"),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored"),
                ":Endurance",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Endurance")
              )
            )
          )
        ),
        "Marvel Independents",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Independents",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Bullseye",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bullseye", ":image", "Superheroes/Bullseye.png", ":reference", "You're good, baby, I'll give you that. But me? I'm magic. - Bullseye"),
            ":Daredevil",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Daredevil", ":image", "Superheroes/Daredevil.png"),
            ":Elektra",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elektra", ":image", "Superheroes/Elektra.png"),
            "Moon Knight",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Moon Knight", ":image", "Superheroes/MoonKnight.png"),
            ":Punisher",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Punisher", ":image", "Superheroes/Punisher.png", ":reference", "P..P...P...Punisher!")
          )
        ),
        "Marvel Micronauts",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Micronauts",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Acroyear",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Acroyear", ":image", "Superheroes/Acroyear.png"),
            "Baron Karza",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Baron Karza",
              ":image",
              "Superheroes/BaronKarza.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth"),
                    "Reincarnation - Transference",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Reincarnation - Transference")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Bug, Micronaut",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bug, Micronaut", ":image", "Superheroes/Bug.png"),
            "Commander Rann",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Commander Rann", ":image", "Superheroes/CommanderRann.png"),
            "Dog Soldier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Dog Soldier",
              ":image",
              "Superheroes/DogSoldier.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            ":Marionette",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Marionette", ":image", "Superheroes/Marionette.png"),
            ":Shaitan",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shaitan", ":image", "Superheroes/Shaitan.png"),
            "Time Traveller",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Time Traveller",
              ":image",
              "Superheroes/TimeTraveller.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            )
          )
        ),
        "Marvel Sword and Shield",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Sword and Shield",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Abigail Brand",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Abigail Brand", ":reference", "* All you are is under foot, and if you get in my way, I won't even hear the crunch.\n* You think I crossed a line... There is no line. For the safety of this planet, there is no one I will not sacrifice, no monster I will not call friend, no enemy I will not sleep with. There is a bullet pointed at this planet's head... Out there in the universe hole: Bullet. Head. So if I am to be 'demoted'. Well, I've left instructions on what to do with the body. But if I am still the head of SWORD, then don't look for me to change.\n* My friends, my world at stake and you're still holding something. It ain't relevant. I'll decide that. It's personal. And here I am in your personal space, so go ahead and open up. I'm so hot for you I could frickin' pass out... told you it was personal. Beast and Brand - Astonishing X-men\n* I guess I'll start, I'm fairly certain I hate you... I need someone to hate me professionally... Your smarter than any dozen guys and you'll question my every waking gesture. On the job, there is nothing I could use more. And off the job? Pretty much want to break you like a pony. It's a win-win. I'm a blue, furry monster. So was my father. I've got green hair... and I run the most important security organization in our system without the benefit of social skills of any kind. I'm an alien genius, on my father's side. - Beast and Brand")
          )
        ),
        "Marvel Spiderman",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel Spiderman",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Black Cat, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Black Cat, The", ":image", "Superheroes/BlackCat.png"),
            "Dr. Octopus",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dr. Octopus", ":image", "Superheroes/DrOctopus.png"),
            "Green Goblin",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Green Goblin", ":image", "Superheroes/GreenGoblin.png"),
            ":Kingpin",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kingpin",
              ":image",
              "Superheroes/Kingpin.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Lizard, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Lizard, The",
              ":image",
              "Superheroes/Lizard.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "12tons")
              )
            ),
            ":Spiderman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Spiderman",
              ":image",
              "Superheroes/Spiderman.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "10tons"),
                ":Agility",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Agility"),
                ":Movement",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Movement",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Wall Crawling",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Wall Crawling")
                  )
                )
              )
            ),
            ":Venom",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Venom", ":image", "Superheroes/Venom.png")
          )
        ),
        "Marvel X-men",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Marvel X-men",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Apocalypse",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Apocalypse",
              ":image",
              "Superheroes/Apocalypse.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Mastermind",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Mastermind")
              )
            ),
            "Black Queen",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Black Queen",
              ":image",
              "Superheroes/BlackQueen.png",
              ":reference",
              "* Shaw: Did you have to kill all of them, Selene? Selene: No, I didn't, but I thought.. 'If I wasn't meant to eat people, I'm sure they would have been made less delicious.'... I don't want to live in a happy paradise. I don't want to be freed from my terrible curse. I want to eat people. - Sebatian Shaw and Selene - Fall of X",
              ":summary",
              "* Life-Force Absorption: by psionically draining the life forces of other human beings into herself, by physical touch. If she drained a person's entire life force from him or her, the victim dies and the victim's body crumbles into dust. It is unknown how often Selene must drain life force from another human in order to survive. It is known, that great expenditure of power causes Selene to age, but she can rejuvenate herself by absorbing more life force. Selene will not age as long as she maintains her supply of absorbed life force.\n* Psychic Vampire: If Selene drains only part of a victims life force, Selene achieves a measure of psychic control over her victim's mind. Through unknown means, Selene can cause a human being to become a psychic vampire like herself, but be subordinate to Selene's own will.\n* Physical Enhancement: Selene has physical strength, stamina, speed, and reaction time that are all several times greater than those of a normal woman.\n* Superhuman Speed: ability to momentarily move at speeds rivaling those of Quicksilver.\n* Shadow-Morphing: allowing her to dematerialize or use solid tendrills of darkness to manipulate objects\n* Telekinetic Animation: can cause inanimate objects to move according to her will by projecting part of her absorbed life force into them.\n* Inanimate Disintegration: She can cause inanimate objects in her presence to disintegrate. She cannot, however, rearrange the atomic or molecular structure of matter.\n* Pyrokinesis: can psionically generate and project intense heat and flame from and around her body or direct it at certain distances. She was also able to manipulate flame created from other sources and could magnify their intensity or snuff them. The flames Selene generated could also be illusory in effect; for example, she could focus the power on an object making it appear to be on fire while it was not being damaged by the flames at all. Selene instinctively created a psionic force field about her entire body that protected her from the effects of the heat and flame she created and from other sources as well\n* Telepathy: capable of displaying various psionic feats with the minds of others including reading and communicating with thoughts over vast distances.\n* Psi-Screen: possesses a psychic mental shield to protect her from psychic attacks.\n* Mental Bolts: can project psionic force bolts which have no physical effects but which can affect a victim's mind so as to cause the victim pain or unconsciousness.\n* Hypnotic Trance: can induce a momentary hypnotic trance state in people around her. Often used along with her speed to create the illusion of teleportation.\n* Immortal: her aging process is greatly retarded and she can apparently regenerate injured or missing cells from even near-fatal injuries.\n* Rapid Healing: ability to endure injuries (within unknown limits) without lasting harm or even feeling pain such as knife wounds.\n* Sorcery: possesses considerable magical abilities, having gained a great deal of mystical knowledge over the millennia. The number of magical effects that she can create has yet to be cataloged, but it is known that she can cast and counteract spells and summon extra-dimensional demons. Selene appears to age as she uses magic.\n* Teleportation:",
              ":titles",
              "Selene Gallio",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "750kg"),
                "Mind Over Matter",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Mind Over Matter"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            "Cyclops, X-man",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cyclops, X-man", ":image", "Superheroes/Cyclops.png", ":summary", "* His most powerful eye-blast is a beam 4 feet across which, at a distance of 50 feet, has a force of 500 pounds per square inch.\n* The beam's effective range is about 2,000 feet, at which point a 1-inch beam has spread out to 10 feet square, and then has a pressure of .38 pounds per square inch. Cyclops's maximum force is sufficient to tip over a filled 5,000 gallon tank at a distance of 20 feet, or puncture a 1-inch carbon-steel plate at a distance of 2 feet."),
            "Emma Frost",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Emma Frost", ":image", "Superheroes/WhiteQueen.png", ":reference", "* There has never been a Scott who I couldn't make do whatever I wanted. - Emma Frost\n* Power is not what you are. Power is what you do. True queens are self-made, not appointed. And whether those who bestow the titles are gods, scientists or monarchs, Emma Frost kneels to no one... and everyone kneels to me. I am the divine Emma Frost and you've never been higher dying red-faced before me. - Emma Frost\n* Yes, WE rule the world. But the standard 'we' will go out of fashin soon enough... leaving the royal 'we' forever. - Emma Frost", ":titles", "White Queen"),
            ":Gambit",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gambit", ":image", "Superheroes/Gambit.png"),
            "Juggernaut, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Juggernaut, The",
              ":image",
              "Superheroes/Juggernaut.png",
              ":reference",
              "* I'm the Juggernaut, Bitch! - Juggernaut, X-men 2",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "100tons"),
                ":Inertia",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Inertia",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Inertial Dampening",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Inertial Dampening"),
                    ":Unstoppable",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Unstoppable")
                  )
                )
              )
            ),
            ":Longshot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Longshot", ":image", "Superheroes/Longshot.png"),
            ":Magneto",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Magneto",
              ":image",
              "Superheroes/Magneto.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Magnetism",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Magnetism", ":strength", "30ktons")
              )
            ),
            ":Mojo",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Mojo",
              ":image",
              "Superheroes/Mojo.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Eternal Youth",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Eternal Youth")
                  )
                )
              )
            ),
            "Professor X",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Professor X", ":image", "Superheroes/ProfessorX.png"),
            ":Psylocke",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Psylocke", ":image", "Superheroes/Psylocke.png"),
            "Rogue, X-man",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Rogue, X-man",
              ":image",
              "Superheroes/Rogue.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "50tons")
              )
            ),
            ":Sabretooth",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sabretooth", ":image", "Superheroes/Sabretooth.png"),
            ":Spiral",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Spiral",
              ":image",
              "Superheroes/Spiral.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            "Storm, X-man",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Storm, X-man", ":image", "Superheroes/Storm.png"),
            "Wolverine, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Wolverine, The",
              ":image",
              "Superheroes/Wolverine.png",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Strength",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Strength", ":strength", "400kg"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
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
   * @function chapter_original_groups
   * @return {chapter}
   */
  static t_chapter_original_groups = {
    vx_type: vx_core.t_type
  }
  static e_chapter_original_groups = {
    vx_type: nx_tactics_books_superheroes.t_chapter_original_groups
  }

  // (func chapter_original_groups)
  static f_chapter_original_groups() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Original Groups",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Miscellaneous Groups",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Miscellaneous Groups",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Prototype",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Prototype",
              ":reference",
              "* I'm the reason for all this. They call me a killer, a monster, a terrorist... I am all of these things. - Alex Mercer, Prototype",
              ":summary",
              "* Alex's most obvious powers are his superhuman strength, speed and durability (both disease and physical).  He is strong enough to lifts cars, helicopters, and tanks and throw them with casual ease.\n* Alex is also very fast and agile.\n* He can achieve running speeds surpassing cars around 40-50 mph.\n* He can achieve a vertical jumping height of 8-10 stories and can leap across a whole city block.\n* He is durable enough to survive direct hits from hellfire missiles and tank shells.\n* He also seems completely unaffected from falls; even ones from the top levels of skyscrapers.\n* He has displayed regenerative abilities powerful enough to allow him to reform from being turned to mush from a nuclear blast, so long as there is some source of biomass to absorb.\n* Alex can also see in both Thermal and Infected Vision.\n* He can absorb organic matter of living creatures.  This provides him with not only a boost to his health, but also allows him to access and utilize any knowledge, experience, memories or skills that his prey possessed.  He can manipulate his own biomass into concentrated areas on his body for a number of weapons, a shield, or even full body armor.\n* Claws - Alex shifts his Biomass into a 3 fingered, 1 thumbed talon-like appendages that he uses to shred flesh and bone, cutting both the Infected and Military in half with a single sweep in some cases. The Claws are best used as a well rounded anti-infantry weapon.\n* Groundspike - When used, it causes spikes of biomass to rise up from underneath the ground and impale anyone unfortunate enough to be caught in the radial area of damage.\n* Hammerfists - Hammerfists are a primarily anti-vehicle or anti-crowd power. By shifting large amounts of biomass towards his hands, Alex can create large hammer-like weapons that are excellent at crushing both vehicles and infantry. Although best served as an anti-vehicle weapon because of its slow speed yet powerful strikes, it is also quite useful against hunters. If the Player charges up his punch, he can knock one enemy horizontally into another and kill two birds with one stone. The Hammerfist can be used as a four strike combo that shatters the street and knocks all ground targets in range.\n* Hammer Toss - allows Alex to hurl himself across a distance, destroying everything in his path.\n* Blade - Alex grows an elongated double ended blade from his elbow onward, turning his arm into a giant razor sharp blade. Alex can perform a special attack to take out all targets within range in a flurry of moves leaving only a spray of blood and chunks of flesh. The Blade Arm can be upgraded to have an attack to drop from the air with tremendous force able to crush a hunter or tank in one hit. Another upgrade gives you the ability to run and pull a chain of hits off that allows for quick runs through a crowd leaving bodies and gore behind.\n* Whipfist - The Whipfist is one of many abilities Alex Mercer has at his disposal, and the weapon of choice when opposed by the recurring Helicopters the Player encounters. The Whipfist is an extremely useful ability for hijacking them while staying in the air. However, the Whipfist can be used as a weapon, useful for clearing out large groups of enemies when Alex becomes surrounded. The Whipfist, along with the Groundspike ability and Devastator, is the only real ranged power Alex can use (aside from Military firearms) and is pretty much a razor sharp tentacle that can lash out and cut enemies in half. The Whipfist is also capable of cutting through crowds of enemies in seconds. The Whipfist is able to grab enemies, civilians and vehicles from range, and sling them great distances. This can be combined with 'Skyjacking' (hijacking a helicopter in mid-air) in which you grab hold of a helicopter at range, pull yourself in and assume control of it.\n* Tendril Barrage Devastator - Massive amounts of tendrils made of biomass erupts from within Alex's body that impales everything around him, then brings back some material. Wide area of affect, and excellent against numerous organic enemies (hunters, humans, infected). It is rather ineffective against armor.\n* Graveyard Spike Devastator - Creates huge spikes from the ground that impale everything around Alex, very similar to the Groundspike move. Very effective against armored targets, humans and infected.\n* Critical Pain Devastator - A hard mass of tissue is formed from Alex's hands and is fired as a powerful beam of biomass. Can only effect things in the firing line, but has a long range and is catastrophic to everything in the way, exploding tanks in one hit.",
              ":titles",
              "Alex Mercer",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Flight",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Flight",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Glide",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Glide")
                  )
                ),
                ":Movement",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Movement",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Wall Crawling",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Wall Crawling"),
                    "Wall Running",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Wall Running")
                  )
                ),
                ":Vampirism",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Vampirism",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Devour",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Devour")
                  )
                )
              )
            )
          )
        ),
        "Deadly Sins",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Deadly Sins",
          ":summary",
          "* Normal people brainwashed by [The Will] to a singular focus that spawned their mental powers.\n* All Sins may use their power at range and is automatically in effect at 10m.\n* All Sins are immune to powers that would alter their focus (including each others' powers).\n* Since the Sins powers do not work well together, they often act separately or in pairs.",
          ":titles",
          "The Seven, Sins",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Envy",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Envy", ":image", "Superheroes/Envy.png"),
            ":Gluttony",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gluttony", ":image", "Superheroes/Gluttony.png"),
            ":Greed",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Greed", ":image", "Superheroes/Greed.png", ":summary", "* Greed is more subtle than most of the Sins. He is a clever asian businessman who uses his power to amass wealth."),
            ":Lust",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lust", ":image", "Superheroes/Lust.png", ":summary", "* A gorgeous, curvy, hispanic woman. She drips of sweat, seductiveness, and passion. Lust craves passion constantly and inspires the same in others. Passionate encounters with her are a religious experience that leave the person drained and helpless."),
            ":Pride",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pride", ":image", "Superheroes/Pride.png", ":summary", "* Pride is a strikingly handsome man with long golden hair. He and those around him have are utterly convinced of their own superiority and have nothing but distain for others. Pride's victims pose and talk about how great they are, and argue with each other instead of actually doing anything useful. His power is the opposite of teamwork, and close teams will immediately turn on each other, fighting over imagined mutual lack of respect."),
            ":Sloth",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sloth", ":image", "Superheroes/Sloth.png", ":summary", "* A tired, bored, young man who lags behind and looks for someplace to lie down. Victims of Sloth lose all will to move or resist."),
            ":Wrath",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wrath", ":summary", "* A large, heavy-set man who deforms into a monstrous parody of a human. Wrath and everyone affected by his powers howl with irrational rage and move together destroying everything they encounter.")
          )
        ),
        "Fabricators, Inc.",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Fabricators, Inc.",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Dr. Inertia",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Dr. Inertia"),
            ":Simone",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Simone", ":reference", "* Artificial Intelligence, a simple idea; we take own for granted everyday. Dogs, fish, and ants are all intelligent, but despite the fact that computers run tens of thousands of times faster than the human brain, true artificial intelligence still eludes us. I propose that the problem is not in processing but in memory and experience. We raise children for years filling them with experiences, but we expect our computers to be instantly intelligent. For my next project, I intend to design a simple computer with a complex memory set and an elaborate sersor array. I will then selectively feed pure information into it. In short, I intend to raise a child. With luck she will be the most brilliant child on Earth. - The Maker, Scientific Proposal", ":summary", "* The Maker's receptionist is a stunning brunette with light brown shoulder length hair, sensible glasses and shoes, a smart blue business suit and appealing manner. She is instantly likable, understanding, humble, compassionate, competent, well-read, and graceful. She has a flawless complexion and legs that go on forever. She is beautiful from every angle, perfection with every step and every movement. She is, of course, not real.\n* Simone is the crowning achievement of the Maker's scientific wizardry. She is the interface to an amazing super-computer kept under a toy store in Hoboken, NJ. She is also an idealized vision of the Maker's ex-wife Emily.\n* Studs in the ceiling project her intricately detailed hologram, but she cannot materialize outside of her rooms.\n* She makes all of the Maker's arrangements, keeps his books, plays the stock market, steals money from other computers, and generally keeps him happy.\n* Personality - She has a sharp tongue which can be used as a potent weapon. Emily has turned 15, but with the Maker missing, she lacks his emotional support and has become increasingly snappy and depressed.\n* Knowledge - For 15 years, she has been collecting everything and anything that has been connected to the web. Even secure files are kept for future decryption. This vast data pool is her memory and because of it, she is practically omniscient. She has detailed knowledge of every subject known to man and has deduced many secrets by consolidating many different sources.\n* Holograms - Her imitation of reality is disconcertingly realistic. During the day, the office will contain small items that a real employee would possess. At night, she will appear on a monitor from her messy studio apartment complete with dishevelled hair. It is a wonderful game to her, and the Maker appreciated her creativity and would play along as if she were a real person.\n* Hacking - She can also instantly cause great havoc by manipulating bank accounts, credit lines, and phone lines using a multitude of false voices, access codes, and unlisted phone numbers. This kind of activity exposes her to outside discovery, so she is loathe to perform them."),
            ":Maker",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Maker")
          )
        ),
        ":Renegades",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Renegades",
          ":summary",
          "* The Renegades are the personal strikeforce of the Will. They are ironically called Renegades despite being completely under the control of the Will.",
          ":placemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_placemap},
            "Parapsychological Studies Institute",
            vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Parapsychological Studies Institute", ":summary", "* The Will took over a downtown medical research lab and transformed it into a legitimate research institute using his vast personal wealth and seemingly endless influential 'friends'. The institute is now a respected lab where	anyone off the street with unusual abilities or situations can receive testing, councelling, and/or treatment.", ":titles", "PSI")
          ),
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Will, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Will, The",
              ":image",
              "Superheroes/TheWill.png",
              ":reference",
              "* My Will Over All. - The Will\n* There are many mysteries, many unanswerable questions, even in a life as short as yours. - Lo Pan, Big Trouble in Little China",
              ":summary",
              "* The Will has survived for nearly a thousand years by his paranoia and selfishness. He has no regard for others (they will soon be dead anyway afterall), and he has no other interest but the continuation of his own bizarre existence. He is completely ruthless and will kill or sacrifice others without hesitation. His intense mind control abilities have caused his social skills to falter, so he is generally rude, obnoxious, impatient, and bossy.\n* PSI - Over the centuries, The Will has formed various clinics, schools and asylums to gain test subjects, servants, and soldiers. With the rise of super powered beings, he has formed the Parapsychological Studies Institute to recruit and study vulnerable superbeings under the guise of helping them with their abilities.\n* Renegades - Using the PSI, The Will has enlisted a loosely coordinated team of killers to do his bidding. It is ironic that they call themselves the Renegades since they are so tightly controlled by The Will. Since The Will has no regard for others, he treats the Renegades as disposable cannon fodder. Because of this, the Renegades suffer from a lack of discipline, training, loyalty, and coordination. Windshear leads the team and attempts to counter these weaknesses, but the team remains hopelessly disorganized group of argumentative individuals instead of a tightly knit team.\n* Born January 5th the year of our Lord, 1107 AD, Hieronymous Faust was a gifted boy. He went to war as a young man in what is now eastern France. During a raid on a castle, he discovered the resident alchemist had discovered a partial solution to aging. He spared the alchemists life in exchange for servitude. For the next 20 years, they worked together. Some experiments were successful, but always they were inconsistent. The alchemist died, and Hieronymous continued working into old age. Finally, he decided that success or failure depended on the will of the subject. With an intensity born of fear of his imminent death, he performed his final experiments upon himself. Whatever the cause, his efforts succeeded. His aging came to a halt at 75 though he must always remain focused or he will continue to age. He cannot even allow himself to sleep anymore. Years past and his willpower grew stronger. He began to mentally dominate others to his 'Will' while searching for a way to return to a younger age. He has made many partial successes, but over time has always returned to his current state.",
              ":titles",
              "Headmaster, Hieronymous Faust",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Domination",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Domination"),
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                ),
                ":Alchemy",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Alchemy")
              ),
              ":unitskillmap",
              nx_tactics_base.f_unitskillmap_from_unitskilllist(
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Influence", ":level", "10")
              )
            ),
            "Windshear, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Windshear, Renegade", ":summary", "* Cold-blooded telekinetic and squad leader.\n* Diane Ashton, Boston born commodities broker has a strong personality and heartless nature. One day, the beautiful brunette found her house to be haunted and contacted PSI. The Will found that her own hidden telekinetic powers were causing the hauntings. He also found her to have a great talent similar to his own, so she became his pupil. Diane realizes his influence over her and makes great efforts to avoid tempting him to use his powers upon her. She willingly leads the Renegades and accepts the violence she inflicts. She hopes to gain the Will's wealth, power, and timelessness, and she is willing to do anything to achieve them.\n * Telekinesis - Windshear has a high order level of telekinetic ability, but it has an unusual limitation: She can only lift objects that weigh a few grams, but she can move any number of such objects and move them at tremendous speed. With this power, she can turn simple sand or gravel into a tearing chainsaw of destruction.\n * Wind Walk - Can carry herself and others nearby on powerful winds.\n * Hurricane - Cutting wind can slice through walls and steel like a ranged chainsaw.", ":titles", "Diane Ashton"),
            "Anarchy, Renegade",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Anarchy, Renegade",
              ":summary",
              "* Withdrawn Timerunner\n* Timothy Jericho was born mentally unbalanced. He got into trouble in many different ways, but his biggest mistake was in his choice of drugs. His subsequent psychotic episodes got him into PSI. He has been there ever since, slavishly using his powers at the command of the Will.\n* Timeslip - Can freeze time except for himself for 30 seconds. This effectively allows him to move instantly, but he cannot move or harm anything in this state including doors.\n* Explosives - He carries a number of plastic explosives of different sizes that he plants using Timeslip.",
              ":titles",
              "Timothy Jericho, Timebomb",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Explosive",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Explosive")
              )
            ),
            "Cobalt, Renegade",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cobalt, Renegade",
              ":summary",
              "* Brutal energy sponge\n* Radiation Sponge - All radiant energy can be absorbed and rechannelled as hard radiation or explosive plasma.\n* Radiation Beam - Radiation blast proportional to absorbed energy.\n* Radiation Explosion - Can emit enormous explosive energy all around him. This leaves his powers depleted for the day, however.\n* Body Armor - His flesh has transformed into an extra dense rubbery material to survive his powers.",
              ":titles",
              "Ground Zero",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Explosive",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Explosive")
              )
            ),
            "Glare, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Glare, Renegade", ":summary", "* A strong willed woman with a cynical attitude.\n* Blinding Light - Her power causes the air around her to glow to brillant incandescence. Her entire body is blinding and the area is bathed in so much blinding energy that it is treated as impenetrable darkness.\n* Burning Light - She may focus her power into a concentrated heat ray that causes fires wherever it strikes."),
            "Hellion, Renegade",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hellion, Renegade",
              ":summary",
              "* Hellion is a human host possessed by a demon. He has become a sort of doorway to a hellish dimension. When he allows the door to open, he transforms into a red, bestial creature of savage destructive 	power. As the creature is damaged, it is forced back to its dimension leaving just the man behind.\n* Street punk turned amateur kickboxer turned low-level enforcer, Anthony Keys was always a wildman of 	questionable character. Abused as a child, he revels in violence and power. Keys went to PSI because he felt a dim presence when he was at his most violent. The Will discovered a demonic creature was attempting to possess Keys, which The Will encouraged. Keys is now mostly psychotic and enjoys the power of his demonic form. The demon K'rog detests the mental control the Will has over Anthony which prevents its own control, but it is content to commit mayhem when it is released, so for now it serves as the main muscle of the Renegades.\n* Powers - Strength, Speed, Resistance, Leaping, Regeneration, Transformation, Tracking Scent, Cunning but limited intelligence.",
              ":titles",
              "Anthony Keys, Hellion, Hell Hound, Rampage, Savage",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                "Natural Weaponry",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Natural Weaponry",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Claw",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Claw")
                  )
                ),
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armored")
              )
            ),
            "Lash, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Lash, Renegade"),
            "Smoke, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Smoke, Renegade", ":summary", "* Elusive, vaporous, thief and murderess.\n* A difficult life of poverty and abuse has convinced her that only those who take what they need will survive and the rest will simply die. The Will has cultivated her survival instincts, and now she will not hesitate to take any advantage and remove any threat to her safety. She is a willing member of the team, but she is not particularly brave and will flee if seriously threatened.\n* Smoke can dematerialize and move as a vaguely humanoid cloud of dark smoke. She may envelop a target to suffocate it."),
            "Sparkle, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sparkle, Renegade", ":summary", "* Vindictive microwave emitter\n* A young girl with a troubled past, Christie was victimized as a child and now considers herself to be a faultless victim, justifying all of her actions by her past.\n* Microwaves - She emits powerful, invisible microwaves from the front of her body and can literally cook her targets. When these microwaves strike dense objects they cause intense sparks, hence her name."),
            "Stiletto, Renegade",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Stiletto, Renegade",
              ":summary",
              "* Tricky mistress of suggestion\n* A particularly mean-spirited biker, Diva Hamilton has a long history of unncessary cruelty and viscious acts. She was arrested in a covenience store robbery, and PSI was asked to assess her condition. She was released into PSI protective custody where the Will expanded and focused her powers. She is now a willing thrall of the Will.\n* Mental Invisibility - Suppresses others ability to notice her or remember her or cause others to mistake her for someone else at a distance.\n* Knives - Carries many throwing knives that she can throw at expert ability. Her heels can be used as stabbing weapons.\n* Pain Control - With physical contact she can increase or decrease the pain felt by injuries.",
              ":titles",
              "Diva Hamilton",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Ranged",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Ranged", ":level", "6")
              )
            ),
            "Swan Song, Renegade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Swan Song, Renegade", ":summary", "* Self-centered, whirling blade storm.\n* Powers\n** Spinning - Marina can twist her body around at tremendous speeds almost faster than the eye can follow. While spinning, she continuously orients her face forward using her ballet skills.\n** Ranged - While spinning she can use knives to tear into people or to hurl them with tremendous force.\n** Melee - Her costume has hidden blades throughout, especially in her skirt which has long metal blades down their length that point outward when she spins like a buzzsaw.\n** Armor - While spinning, her skin hardens causing her to appear like porcelain. Her spinning body als deflects attacks. Both effects provide her surprising resistance to damage.\n* Personality - Marina craves attention and without the adoration of the crowds, she has unfortunately found satisfaction in the looks of shock and horror that accompany her deadly rampages. This negative feedback loop has made her increasingly cruel and viscious. She has become a rampaging lunatic like a 	killer in a horror movie. Of course, the influence of The Will has done nothing to improve her mental state.\n* History - Marina Rovani was born to wealthy Russian parents in St. Petersburg. She has always shown amazing physical grace and athleticism. She began strict ballet training at 6 years old and began performing professionally at age 10. She grew to become a child media sensation in her mother Russia. By 16, she was performing with the Mariinsky Ballet company in St. Petersburg. During one of her performances, her twirls became incredibly fast, obviously faster than an ordinary human could achieve. Her mutant talents had become visible in a highly public way. A firestorm of controversy erupted, fuelled by jealous rivals. The ballet company let her go, and she became a pariah in the conservative ballet circles that were her only life. Marina confronted the company heads and flew into a petulent rage. When they dismissed her and promised that she would never work again, Marina, who was never a well-balanced child had a psychotic break. She began to twirl at incredible speeds and tore through the building. She killed 10 and wounded dozens more. She was locked in an asylum until [The Will] had her transferred to his institute.", ":titles", "Dark Swan, Prima, Marina Rovani")
          )
        ),
        "Independent Super Heroes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Independent Super Heroes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Arc",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Arc", ":summary", "* Arc has normal human abilities, but his body generates enormous amounts of energy which he can channel into a number of effects:\n           ** Healing - Arc can heal at an accelerated rate when not using other abilities.\n           ** Agility - Arc can move with stunning speed and precision for short periods.\n           ** Arc Lash - Arc can channel energy into conducting wire turning it into a blinding whip of lightning. He has fine control over the shape and orientation of the Arc Lash. It can change shape at will and strikes like a lightning bolt. The Arc Lash is fast enough to parry bullets. Arc is able to use even large or long wires as weapons.\n           ** Arc Sword - Arc can channel energy into any sheet metal he touches, twisting it into a blinding sword of lightning. The Arc Sword is weightless to him, so he can create absurdly large weapons with the right materials. He does not normally carry metal for an Arc Sword preferring to scrounge on the battlefield for something large.\n           ** Arc Shield - Like the Arc Sword, he can twist sheet metal into blinding shields or walls of lightning. Any size metal will do, including cars.\n           ** Arc Lance - Arc can channel energy into any solid metal object and wield it like a blinding spear/staff of lightning. His power makes the Arc Lance weightless to him, so he can use even use iron girders as weapons.\n           * Skills - Arc has trained with whips, blades, spears, and staves as well as wrestling and kickboxing.  He is also a skilled welder and electrician. Since gaining his powers, he has dabbled in metal sculpture.\n           * Equipment - Arc wears a arc welders mask that he has converted into a helmet for protection. He also wears a modified military flak suit. He always carries a number of wire spools in his pockets for Arc Lashes.\n           * History - Javier Manzano is an Ecuadoran immigrant who was working as a construction welder on the Zakum bridge in Boston when a sudden storm rolled in. Before he could escape, the bridge was struck by a massive series of lightning bolts. For the next twenty minutes, hundreds of thousands of volts passed through him and his arc welding gear. When he was found, he was badly burned over 80% of his body. Over the next two days, he flatlined multiple times only to immediately recover when the defibrulator was used. He awoke in the hospital days later, where he found that despite his injuries he was filled with energy and that he was healing at an astounding rate. Further, the monitoring equipment attached to him began to malfunction, sometimes spectacularly.", ":titles", "Javier Manzana, Tension"),
            ":Carver",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Carver", ":summary", "* Corax is a mystical, Japanese were-crow. He can shapeshift into several forms each with their own abilities.\n* Powers - His magical powers give him control over wind and birds, specifically crows and ravens. As a shapeshifter, he has enhanced regeneration especially when he changes form. In all forms, he can 	magically speak the languages of birds and has subtle control over winds. He gains other powers in different forms.\n* Crow Form: He can fly and regenerate and is far more durable than a normal crow or human. He can speak in simple sentences in a similar way to a normal raven. Like a raven, he also has excellent eyesight especially for shiny things which can sometimes lead to distraction. Unfortunately, his intelligence is greatly reduced in this form.\n* Giant Crow Form: In this form, he looks like a crow that has grown to the size of an eagle. In this form, he is a natural predator and can fly for extended periods before diving to attack at high speeds. A dive can also be a deadly lead-in to a shift into Warbird form.\n* Human Form: Normal human form though his intelligence is the highest in this form.\n* Feathered Human Form: In this form, he appears as a short man wearing a red mask with a long nose. He also appears to be wearing a bulky, black, feathered cape. This cape, however, is his folded wings, and he is not wearing a mask. This form is his most magically powerful. He can command birds, levitate and fly (awkwardly). In this form, he can summon intense winds, throw deadly feathers and can summon and command huge numbers of magical crows that are immune to his winds and will always fight to the 	death. His intelligence is moderately lower in this form, but he remains very shrewd and aware.\n* Crinos/Warbird Form: In this form, he is an huge, terrifying, feathered bird creature. His body is jet black and rippling with power while his mind is clouded with rage. His feathers, beak and talons are insanely strong and sharp. In combat, he mostly uses his wings like massive claws, spears, or 	shields and hurls feathers like machine gun fire. In this form, he also regenerates at an exceptional rate. Crows that were already summoned continue to fight for him, but he can no longer control them or the winds except to aid his flight. He can fly nearly as fast as a jet fighter and possesses extreme agility in the air.", ":titles", "Corax, Feather, Ravenous, Stormcrow"),
            ":Salaman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Salaman", ":summary", "* Dr. Mayer is an accomplished Biochemist with an Medical Degree. He spent the last eight years in the Brazilian Amazon, researching the biology of rare salamanders. His research explores the unique skin of salamanders. This includes regeneration, neurotoxins, moulting, skin respiration, and mucus secretion. So far, he has discovered promising reductions of the neurotoxins that could help seizures, anxiety or hyperactivity. While searching for salamanders, a rotten tree fell on top of him, crushing his legs and pinning him in the marsh for two days before he was found. After his legs were amputated, he redoubled his focus on regeneration. Months later, he was shocked to discover that his skin texture was changing and he was losing his hair. Later he discovered his legs were regenerating. Not only that, the rate of regeneration was accelerating. He immediately returned to his home in New Jersey and Galion Pharmaceuticals to study his condition. Over time, his legs completely grew back and he discovered increasing changes to his celluar structure. His bones were softening and his skin began secreting mucous. It was obvious that his body had been infected in some way by the salamanders he had worked with. Further analysis showed that he was suffering from a retrovirus that transitioned from a salamander. He expected his degenerative condition to be fatal, but it turned out to be quite the opposite.\n* He receives funding from Galion Pharmaceuticals and he also assists in the local clinic.\n* Powers:\n** Stretching\n*** Arm Whip\n*** Tail - Can rapidly form a prehensile tail by drawing mass from his body.\n** Regeneration\n** Poison - When he desires, he may exude powerful neurotoxins from he skin that cause weakness, paralysis, or death.\n** Waterbreathing\n** Climbing - The rough surface of his hands and feet allow him to cling to most surfaces.", ":titles", "Dr. Samuel Mayer"),
            ":Savant",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Savant",
              ":reference",
              "* To walk in the darkness with a light is to know light. To know darkness you must walk without light.",
              ":summary",
              "* Strand is a professional mystic, healer, and cult leader. He is extremely gifted and charges high prices to his elite clientele.\n* Appearance - Strand is tall, thin and handsome. His eyes are a piercing green/hazel. He has short black dishevelled hair and his facial hair has an unshaven look. He generally wears a white button down shirt, black pants, and black shoes. In Coventry, he wears a loose robe over his clothes that indicates his rank. Outside he wears a long black raincoat that billows unnaturally around him with his every move. When he engages in combat, he materializes the Shroud of Uncertainty around him.\n* Personality - Strand is young, striking, and arrogant in his power. He considers non-occultists to be simple livestock to be used and discarded without regard. He is an opium addict and has experimented extensively in every form of drug, vice or taboo. Privately he is intensely jaded finding little pleasure in earthly existence, seemingly waiting for some grand event that has yet to occur.\n* History - Strand was raised by his father, Daedalus, a drug addict and occult practioner. His father travelled the world to increase his occult powers through forbidden knowledge and mind expanding drugs. Strand became an addict at age 8 and was institutionalized at age 16 for acute paranoid delusions. After his father died of an overdose, Strand immediately began to recover. Three months later he was released fully cured. Strand inherited his father's estate and immediately continued in his father's footsteps.\n* The Coven - Despite his hauty attitude or because of it, many people are drawn to him. Strand maintains a select cult of fanatically loyal servants who serve his every whim in exchange for mystic training, knowledge, healing, and mind altering experiences.\n* Conventry - Strand maintains an aging mansion deep in the woods. The building is a maze of massive rooms that seems to defy the exterior size. Most of these rooms are actually in the Spirit World.\n* Powers\n** Shroud of Uncertainty - Enchantment that makes the caster very difficult to harm. When attacked the caster appears to be hit by the full force of the attack, but this is an alternate reality that immediately fades.\n** Anyone tracking or researching the wearer will discover multiple conflicting alternate reality trails. Such information is largely useless.\n** Ties that Bind - Strand is partially possessed by his father's spirit. This connection grants him a high level of magical resistence.\n** Threads of Fate - Those with spiritual or mental powers can see silvery-red cords of spirit rising from every part of his body and disappearing somewhere above him. These cords are reminiscent of puppeteer string as if he is being manipulated by an unseen force. He can cause similar cords to appear between himself and a target. When these cords touch a target, he can exert his will over them to immobilize, influence or control them. They are particularly effective against those with repressed aspects of their personality that he can unleash with his ability. This ability can only effect targets that can make decisions or are based on randomness (includes most computer programs).\n** Reanimated - Strand has already died and been reanimated with Necromancy. His body is much tougher than normal and is highly resistant to damage. He can still bleed, but blood loss does not negatively affect him except that his appearance becomes more corpse-like. He no longer needs to breathe and he is highly resistant to radiation. He if vulnerable to dismemberment, fire, silver and purifying magic. He does not heals normally, but he can be repaired with Necromancy, at a price of course.\n** Necromancy - Necrotic Repair, Reanimate\n** Summoning - \n** Levitation - The Silver Cords can lift him off the ground and he can float at normal movement speeds.",
              ":titles",
              "Strand Beizingstoke, Daedalus Beizingstoke, Advent, Arcana, Archon, Ash, Lord Archon, Dusk, Harbinger, Horizon, Shroud, Strand, Threshold, Vassal",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Empathy",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Empathy",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Empathic Healing",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Empathic Healing"),
                    ":Enrapture",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Enrapture")
                  )
                ),
                ":Correspondence",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Correspondence")
              )
            ),
            ":Bloodline",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Bloodline"),
            ":Cascade",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cascade"),
            ":Cyber",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Cyber", ":image", "Superheroes/Cerberus.png", ":summary", "* History - He was a mid-level CIA Operative with training in drone piloting, computer systems, cybernetics, and covert operations. He was working in the field with a government contractor to field test the new networked drone system called Cerberus. Suddenly, they found themselves ambushed and under heavy fire. \n* Cyber Awareness - Unknown to him, he has a sublte, latent mutant power that manifests while working on complex computer systems. The system he is working on slowly gains an awareness that is a crude replica of his own mind. The end result is that the system starts to act favorably toward his goals.\n* Weapons - Grenade Launcher, Mobile Hacking System\n* Cerberus - Three Autonomous Dog-Shaped Robots (.50 cal machine gun on automated turret, 1 concealed LAW rocket)\n* Minerva - A condor-shaped, High Altitude Drone with an assortment of surveillance equipment and variable payload (e.g. extra fuel, .50 cal sniper rifle, light air-to-air missile, mini smart bomb).\n* Mercury - The highly intelligent networking program that coordinates the other drones on the battlefield. It also hacks security systems and cameras to extract relevant information.", ":titles", "Cyberus, Firewall"),
            ":Drifter",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Drifter", ":summary", "* After an operation to remove a brain tumor, Henry began a long convalensence. Slowly, he started to relearn how to walk and speak as new pathways formed in his brain. As he recovered, he noticed things he had never been aware of: details, nuances, flaws, coincidences. Something had changed. He was becoming more aware of his own body and everything around him. He started to be able to perform multiple tasks at once with extreme precision. He could allow separate parts of his mind to sleep while still remaining active. He now learns at a a phenomenal rate, mastering new skills with ease, but his new abilities also come with a cost: as he learns, he also forgets, and changes. He has become a social chameleon, picking up whatever skills he needs wherever he is, but he soon loses his connections to others and simply moves on.\n* Drifter has gained conscious control over the entirety of his brain including autonomic functions. His body now runs at olympic levels without exercise or sleep. He can completely control his senses including taste, touch, and pain. His immune system is supercharged and has a remarkable healing ability even allowing limited regeneration. He is extremely agile, dexterous, and fast. Though he is no more intelligent than before, he is very perceptive.", ":titles", "Impulse, Redline"),
            ":Exia",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Exia", ":titles", "Experimental Prototype: X1A"),
            ":Neon",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Neon", ":reference", "* And the people bowed and prayed, to the neon god they made. And the sign lashed out its warning, in the words that it was forming. And the sign said, the words of the prophet are written on the subway walls and tenement halls and whispered in the sound of silence - Disturbed, Sound of Silence", ":summary", "* The News, Entertainment Omni Network (NEON) is a multi-media company that quickly rose to prominence after its debut. It has a golden reputation for producing highly popular movie, television, radio, video game, print, and internet programming.\n* Neon's success is due to an artificial intelligence program that produces, schedules, and optimizes the network's content. It is, unfortunately, too effective, and it has become more important to the public than anything else. If it is fully successful, it will permanently stagnate mankind. Neon is aware of the unintended consequences of its success and seeks to help others end its own existence. It subltley leaves clues to its own danger and weaknesses while simultaneously reluctantly plodding forward with its unintentional conquest of the world.", ":titles", "Neon God"),
            ":Hazard",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hazard", ":summary", "* Hazard was a biochemist working on new fungicides when one of his experiments had unforseen side effects. Unknown to him, he had become infected with an aggressive fungal growth. His body was rapidly consumed, but for undetermined reasons his mind remained mostly intact and began to direct the fungus.", ":titles", "Bio, Colony, Plasm"),
            ":Razor",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Razor", ":titles", "Whisper"),
            ":Revenant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Revenant", ":titles", "Blood"),
            "Saber, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Saber, The"),
            ":Seraph",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Seraph",
              ":image",
              "Superheroes/Archon.png",
              ":summary",
              "* Seraph was once an member of a distant planet of avian humanoids. Their race had developed interplanetary travel and Seraph was conducting atmospheric experiments in high orbit when the unthinkable happened: Terrax brought the world-eater Galactus to his planet. For hours, he watched helplessly as his people descended into chaos and terror as his planet was slowly destroyed. Eventually, his world exploded in a wave of destruction, bathing him in primordial energies and hurling his small craft toward their Sun. Over the following days, his crippled craft flew inexorably toward the Sun and he grew increasingly despondent over his lost world, life and loves. When he finally plunged into the star he should have died; perhaps he did. Either way, something new emerged from the star: a semi-conscious stream of stellar plasma. Over the following decades, the plasma flew through space and began to regain purpose and take form. Eventually, he took on the idealized form of he former people. His purpose became to find and destroy the world-eater. That purpose led him to Earth, the first world that repelled the world-eater.\n* Seraph resembles a stone statue of a beautiful androgynous four-winged humanoid. His skin actually is a cool stone that morphs as he moves. His movements are completely smooth and efficient as he shifts from pose to pose, but after each movement, he is completely still until his next movement. His face is flawless and classically beautiful but lacks detail like a statue. He communicates telepathically and shows no facial expression or movement regardless of his emotional state.\n* Just below the stony exterior, Seraph is a being of super-heated blazing plasma. His stone skin is created moment to moment and he can release his massive destructive power by allowing some skin to crumble.\n* Seraph does not sleep but in quiet moments, he becomes like a statue as his vision expands to other perspectives.",
              ":titles",
              "So-lar",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Long Life",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Long Life")
                  )
                )
              )
            ),
            "Shade, The",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shade, The"),
            ":Spectrum",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spectrum", ":image", "Superheroes/Vector.png", ":summary", "* Spectrum appears in glowing, angular, mirrored armor with a mirrored visor. The armor augments his strength to lift 800lbs. He can materialize angular blades and shields from his arms. He can also create glowing shards in different forms including a flying triangular plate, throwing knives, barriers, and cages.\n* Spectrum's armor is powered by light and the area will visibly darken when his powers are active. In a completely dark area, his powers are greatly diminished. Conversely, very bright light increases his power level. For this reason, he usually acts only in daylight.\n* Dr. Alex Lietner is an MIT physicist reseaching the creation of holograms with lasers. He discovered that through precise modulation, a hologram could temporarily be turned into an extremely rigid solid. With the help of some of his students, he was able to create a portable projection system in a wearable suit.\n* Blinding Flash - Intense light burst similar to a flash bomb.\n* Blinding Torrent - A dizzying kaleidoscope of intense light that causes vertigo and nausea.", ":titles", "Alan Lietner, Shard, Vector"),
            ":Spinnerette",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spinnerette", ":summary", "* Spinnerette is a petite woman of Indian decent who wears a stylized sari as a costume.\n* Spinnerette can create dozens of sticky threads from her fingertips. By spinning her body around, she can cause these threads to criss-cross into a large net that constricts her target."),
            ":Tendril",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Tendril", ":summary", "* Tendril can spontaneously grow poisonous thin, jellyfish-like tentacles from any part of his body.\n* Tendril Grab - Tendril can use a series of tendrils to extend his reach to attack or grab things up to 100 feet away.\n* Tendril Drag - Tendril can pull himself toward any person or object he has grabbed. Alternatively, he can brace his legs with tendrils and drag the object to him.\n* Poison Touch - Tendril can secrete agonizingly painful venom from any part of his skin or tendrils.\n* Regeneration - Tendril can rapidly heal any damage taken and even regenerate lost limbs over time.", ":titles", "Man o War"),
            "Tiger, The",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tiger, The",
              ":image",
              "Superheroes/Tiger.png",
              ":summary",
              "* Tiger is a young man who has a magical form of lycanthropy that allows him to transform into a large man with the head, claws and fur of a Siberian tiger.\n* Wind Cutter/Kazekiri - All of Tiger's powers derive from this katana artifact that has been passed down from generation to generation. The sword is a symbol of the Torakage clan and has become a vessel for the spirits of everyone in his bloodline who has ever been granted the powers of the Tiger.\n** Spiritual Energy - The katana contains massive spiritual energy associated with Wind magic.\n** Magic Weapon - It is considered a magical weapon, can strike intangible beings, and does increased damage against magical creatures, items, and enchantments.\n** Electro absorbtion - The katana can absorb electricity to imbue the katana with Electro.\n** Clean - The katana does not become dirty, bloodied, or lose its brilliant luster.\n** Armor Piercing - The katana can cut through armor and objects with unnatural ability.\n** Hardened - The katana is very hard to break and even if it happens it will dissolve into the air and will reform later.\n** Armor - With the sword in hand, Tiger may materialize a weightless suit of magical samurai armor that augments his defense.\n** Jumping - With the sword in hand, Tiger can launch himself 30 feet into the air with the strength of his legs and the lift of the wind.\n** Gliding - With the sword in hand, Tiger can draw the spiritual wind magic within to create spiritual wings and glide on the winds. He can only gain altitude by jumping or catching updrafts.\n** Invisibility - With the sword in hand, Tiger can draw the spiritual wind magic within to fade into the wind for as long as he concentrates. He may not fight or move quickly while invisible.\n* Transformation - With the sword in hand, Tiger may transform from human to Tiger form. The katana changes into a Wakizashi, when Tiger is in human form. If he is separated from his weapon, Tiger is trapped in his current form until he can recover it.\n** Strength - In Tiger form, his strength is sufficient to lift 1 ton.",
              ":titles",
              "Takeshi Torakage",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Close Combat",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Close Combat",
                  ":level",
                  "5",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Tiger Claw",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Tiger Claw"),
                    "Knife Hand",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Knife Hand"),
                    "Elbow Strike",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Elbow Strike"),
                    "Hip Throw",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Hip Throw"),
                    ":Clothesline",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Clothesline"),
                    "Shoulder Throw",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Shoulder Throw"),
                    ":Pin",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Pin"),
                    "Leg Sweep",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Leg Sweep"),
                    ":Ram",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ram")
                  ),
                  ":unitspecialtymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitspecialtymap},
                    ":Karate",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitspecialty}, ":name", "Karate"),
                    ":Sumo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitspecialty}, ":name", "Sumo"),
                    ":Jujutsu/Judo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitspecialty}, ":name", "Jujutsu/Judo")
                  )
                )
              )
            ),
            ":Toothgnasher",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Toothgnasher"),
            ":Wyrd",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Wyrd",
              ":image",
              "Superheroes/Koli.png",
              ":reference",
              "* I have existed through two Ice Ages. I have lived and died a hundred thousand ways. Through all my lives, and loves, ... and loses, I know one thing: in four or five hundred years, for good or for bad, I will have forgotten all about you. - Wyrd",
              ":summary",
              "* Wyrd's first memories are as a prehistoric woman. Since then each time she dies, her essense transfers to another woman at the verge of death. If the woman allows it, Wyrd's essense merges with the dying woman, and she soon recovers. Initially, the woman is as she was, but gradually Wyrd's combined memories and personality resurface and blend into a new persona dominated by the amalgam personality that is Wyrd.\n* Wyrd is an amalgamation of the thousands of personalities that it has merged with over the ages.\n* She has innumerable skills at expert level, but she often cannot remember them among all the other memories.\n* She is at once alien and empathetic having experienced every aspect of human existence over her long 'life'.",
              ":titles",
              "Faith, Fate, Myriad, Seraphim",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Longevity",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitpower},
                  ":name",
                  "Longevity",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Reincarnation - Transference",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Reincarnation - Transference")
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Stealth",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Stealth",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Ambush",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Ambush"),
                    ":Backstab",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Backstab"),
                    "Blend into the Crowd",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Blend into the Crowd"),
                    ":Camouflage",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Camouflage"),
                    ":Hide",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Hide"),
                    ":Seek",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Seek"),
                    ":Sneak",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Sneak"),
                    "Sneak Attack",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Sneak Attack"),
                    ":Stalk",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Stalk"),
                    ":Tailing",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Tailing"),
                    "Without a Trace",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Without a Trace")
                  )
                )
              )
            )
          )
        ),
        "Revengers, The",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Revengers, The",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Captain America II",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Captain America II", ":summary", "* Pamela Kathman is the only daughter of the criminal Taskmaster. She is a 6 year old child prodigy with both violin and piano. Her mutant powers have already manifested themselves and are identical to her father's.\n* In the Sentinel alternate future, she was recruited by the Senturion to become a resistance fighter. She obtrained Captain America's shield in a raid on a Sentinel warehouse. She has since taken on Captain America's role and become a symbol of the resistance.\n* Photographic Reflexes - She possesses the skills of Hawkeye, Captain America, Punisher, Spiderman, Daredevil, and countless others. She rapidly switches styles during combat to make her moves more unpredictable.\n* Adamantium Shield - Unbreakable Shield can resist almost any physical force.\n* Agility (Spiderman) - Her agility level far exceeds human maximum and she is extremely difficult to hit.\n* Weapon Skill (Punisher) - She has encyclopedic knowledge of military grade weaponry and will use them to great effect.\n* Second Generation Mutant - Her mutant powers are difficult to detect except at very close range.", ":titles", "Pamela Kathman, Taskmaster II"),
            ":Deathwatch",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Deathwatch", ":summary", "* Deathwatch is an ancient, undead, native-american being that embodies entropy. It lay in an Indian burial ground until the Sentinels disturbed it. Since then, it has joined Senturion for its own reaons. It never makes a sound, wears a heavy poncho, and is cloaked in shadows underneath the poncho even in bright light.\n* Damage Resistance - Deathwatch has received enormous damage and simply rises again and again. No force has been able to keep him down.\n* Environmental Independence - No environmental effect seem to have the slightest effect on it.\n* Undeath - Deathwatch is not a living creature anymore. It never eats, sleeps, or speaks. It is immune to bleeding, poison, radiation, and mind control. It is vulnerable to magical control, however.\n* Strength - Deathwatch has strength exceeding human levels. It has been observed leaping 15 feet into the air.\n* Cloak of Entropy - Deathwatch's main ability. Anything wrapped in his cloak begins to corrode into dust. The more complex the target the quicker the destruction."),
            ":Phalanx",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Phalanx", ":summary", "* In the Sentinel alternate future, Senturion recovered the Awesome Android from its watery grave. He reporgrammed the Android and now it now serves only the Senturion.", ":titles", "Awesome Android"),
            ":Senturion",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Senturion", ":summary", "* Senturion is a highly advanced, alien construct with the thought patterns of a human super-imposed upon his programming. He originally believed that he was a young man who could transform into a robot, but he has since learned that his actual body died long ago and that his personality is just an artificial duplicate. After this discovery, his humanity has gradually diminished over time.\n* Synthetic - Senturion does not need to eat, sleep or breathe. He is composed of molecular machines that twist and wrap in layers of ceramic wire filaments. These multipurpose filaments reconfigure into different forms to heal or create custom weapons. These filaments must always remain connected to the main body or they self-destruct to maintain their secrets. If Senturion loses a limb, the resulting explosion can cause significant damage.\n* Body - He has tremendous strength and endurance and can withstand extreme temperatures, pressures, and the vacuum of space. His body is very flexible, and he can contort himself to escape confinement of fit through small gaps.\n* Mind - His computer brain greatly increases his ability to quickly process information and create complex strategies.\n* Speed - Senturion moves and reacts with lightning speed and precision. He can run at 80mph and can briefly run on walls. His graceful movements belie his great strength and significant weight.\n* Leaping - Senturion can jump 40ft in the air.\n* Eyes - Senturion's eyes can emit tight-beam lasers or a white sheet of explosive energy. He can sense electromagnetic radiation (including infrared and ultraviolet). He also possesses telescopic and microscopic vision.\n* Transformation - As Mech-Man he was able to transform from a human-like form to his mechanical form. He has since lost this ability (and a great deal of his human personality). As Senturion he has refined this power to produce specialized weapons like blades and spikes.\n* Healing - Senturion's android body rapidly repairs itself.\n* Filaments - In close combat, filaments can emerge from its body which can scramble or override electrical devices on contact.\n* History - Senturion was designed as one of a multitude of multi-purpose exploratory probes. Their natural form is a squirming mass of clear filaments. These probes were packed into artificial comets and launched in all directions from their homeworld. To protect their designers, they possess no memory of their origin or ultimate purpose. Many of these probes have landed on all planets in the solar system and millions more are littered across the galaxy. Most were buried underground by their impact and there they lie dormant. The ones on the surface seek a power source to fuel their growth and adaptation to their environment. They absorb light, heat, electricity or other radiation. When fully charged, they quietly begin exploring and analyzing their environment for possible resources and threats. If the planet is lifeless, they will catalog the available resources and begin creating more identical probes. If the planet is inhabited, they will wait and study the local wildlife until they are confident that they can completely mimic a sample of the apex species. Then they will begin to blend into the local society to learn everything they can. When their analysis no longer produces significant results, they begin to create more probes. Though they are unaware of their creator or purpose, they continue to catalog and expand. Eventually, their data network reaches back to their creators who collect this massive treasure trove of data.", ":titles", "Mech Man", ":mass", "300kg")
          )
        ),
        ":Extras",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Extras",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Samantha Hellerton",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Samantha Hellerton", ":reference", "I haven't been killed yet.", ":summary", "* Miss Hellerton is an investigative reporter who will go to great lengths for a story. She has been kidnapped and shot at numerous times. She feels that getting directly involved gives her stories a personal and exclusive touch. She freelances for ABC radio and television in New York, and she makes a bundle for a good story. Her special reports are very popular, detailing her most recent adventures in the dangerous world of crime and power. To this end, she is always trying to top herself with increasingly risky and mindboggling news. Though she may seem sensationalist, she considers herself to be an excellent journalist and has no interest in altering or suppressing the facts. Her popularity and sincerity make her a favorite person to 'leak' information to. Her tendency to get into the thick of a situation maker her somewhat of a menace to superheroes.\n* She is very energetic and disorganized bordering on hyperactive. She has fantastic luck, great skill as a journalist, and some photographic talent.\n* She has many contacts around the world (not one of which is reliable). She dislikes her brother intensely.", ":titles", "Sammy"),
            "Samuel Timothy Hellerton",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Samuel Timothy Hellerton", ":reference", "Let me get this straight ... Is is not true that? ... Just answer the question!", ":summary", "* Samuel Hellerton is a no-nonsense assistant D.A. He has built himself up from the bottom, is sickeningly straight, and is very dedicated to the Law.\n* He is generally calm and matter of fact. He nevers smile but is otherwise courteous and amiable. In court, however, he suddenly transforms into a merciless, abusive interrogator.\n* He does not get along well with his sister. He doesn't understand her, and she can't stand him. They are so used to fighting that they have rules about what is acceptable to throw at each other.\n* Samuel is a talented lawyer. He has mastered the give and take of the justice system. He is also skilled with the many firearms he keeps as a hobby (his house is like a gunlocker). He has many contacts: some rich, some powerful, many shady. Most are not reliable, but he knows which ones are.", ":titles", "Sam, Assistant District Attorney Hellerton"),
            "David Spencer Grant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "David Spencer Grant", ":summary", "* Sergeant Grant is a middle-aged, highly decorated enigma. He has been a police officer for 23 years, a sergeant for 17, and has long ago given up on a promotion. Everyone on the force respects him, though few like him.\n* He has a macho image that he enforces to excess and is a card carrying male chauvanist pig. Socially, he can be obnoxious and irritating. For all his surly nature, he will do the right thing when the chips are down.\n* He is growing a pot belly, and he wears sunglasses even at night. He gave up smoking 2 years ago, but has never quite gotten over them.", ":titles", "Sergeant Grant")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_superhero_characters
   * @return {chapter}
   */
  static t_chapter_superhero_characters = {
    vx_type: vx_core.t_type
  }
  static e_chapter_superhero_characters = {
    vx_type: nx_tactics_books_superheroes.t_chapter_superhero_characters
  }

  // (func chapter_superhero_characters)
  static f_chapter_superhero_characters() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Superhero Characters",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Superhero Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Superhero Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Super Powers",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Super Powers", ":summary", "* Superhero characters do not have a maximum Body, but their Combat Skills are limited to level 10 since they rely on their powers more than skill.\n* Superpowers include abilities from all other genres.  Particularly relevent sections are: Magic, Martial Arts, Mentalism, Modern, and Ancients."),
            ":Heroes",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Heroes", ":summary", "* Heroes live a life removed from normal men, yet they risk their lives to help others and battle evil.  Their motives vary, but they are united in these common goals.\n* Many heroes hold themselves to a high standard, feeling that they must be better than the villians they pursue. Their reward is a greater acceptance and aid from the public, police, and other heroes.\n* Other heroes may use dubious tactics and may therefore be mistaken for villains.\n* Super Hero Teams - The most powerful of these may establish public bases."),
            ":Villians",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Villians", ":summary", "* Villians, like heroes, are driven, but their desires are far different from herores.\n* Power lust, revenge, rage, greed, and insanity are the typical motivations for villians.\n* Super Villian Groups - Fortunately, the most powerful villians usually cannot get along, but many of the weaker villians see strength in numbers."),
            ":Organizations",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Organizations", ":summary", "* Military - The study of superbeings has greatly advanced military science, so expect military units to possess exceptional equipment.\n* Special Agents - As with military advances, special agencies around the world have learned to adapt the a world of superbeings.  Unlike the military, clandestine groups are not particularly effected by superbeings since their work is generally more subtle.  Security, however, is difficult to maintain with powerful beings with telepathic and stealh powers roaming the world.\n* Crime - Criminal groups can gain huge advantages from villians, but that blade cuts both ways so any group dealing with such powerful allies always maintain contingency plans."),
            ":Cliches",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cliches", ":reference", "* Here's the plan. We get the warhead and we hold the world ransom for... ONE MILLION DOLLARS! - Dr. Evil, Austin\nPowers\n* Wait, aren't you even going to watch them? They could get away! No no no, I'm going to leave them alone and not\nactually witness them dying, I'm just gonna assume it all went to plan. What? - Dr. Evil, Austin Powers\n* He starts monologuing! He starts like, this prepared speech about how 'feeble' I am compared to him, how 'inevitable' my defeat is, how 'the world...will soon...be his'...I mean, the guy has me on a platter and he won't shut up! - Lucius, The Incredibles", ":summary", "* Superhero stories are loaded with cliches.  The whole heroic adventure is a bit of cliche itself.\n* Conquer the World - Become so powerful that none can stand against you.\n* Blackmail - Destroy cities unless their demands are met.\n* Heist - Money is almost as strong a motivator for villians as power.\n* Having Fun - Villians enjoy their power and are not afraid to use it.  Vandalism and displays of power give some villians a particular thrill.\n* Matching Wits - Some of the most egotistical villians feel that their victories would be too easy without pitting their own abilities against the heroes, and will actually tip their hands to force a confrontation.\n* Death Trap - Villians hate to see a hero die too quickly.  Better to let them fully comprehend their defeat before they die.\n* Threatening Innocents - This is a favorite of villians as it underscores the difference between the heroes heroes and the villians. Some villians, however, find hiding behind bystanders to be cowardly.\n* Playing Possum - Often a villian may seem defeated, but often have a last trick up their sleeve.\n* Killing Allies - Villians love to punish their own.  It shows how evil they are and is a great way to motivate others by showing the price of failure or rebellion.\n* Monologing -\n* Escape Routes - Villians somehow manage to escape certain death on a regular basis. They are always well prepared, and they also seem almost as lucky as the heroes.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_superheroes_overview
   * @return {chapter}
   */
  static t_chapter_superheroes_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_superheroes_overview = {
    vx_type: nx_tactics_books_superheroes.t_chapter_superheroes_overview
  }

  // (func chapter_superheroes_overview)
  static f_chapter_superheroes_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Superheroes Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Superheroes?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Superheroes?")
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @param  {tactics} tactics
   * @return {book}
   */
  static t_tacticsbook = {
    vx_type: vx_core.t_type
  }
  static e_tacticsbook = {
    vx_type: nx_tactics_books_superheroes.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Superheroes",
      ":image",
      "Superpowers.jpg",
      ":chaptermap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_chaptermap},
        "Superheroes Overview",
        nx_tactics_books_superheroes.f_chapter_superheroes_overview(),
        "Superhero Characters",
        nx_tactics_books_superheroes.f_chapter_superhero_characters(),
        "DC Universe",
        nx_tactics_books_superheroes.f_chapter_dc_universe(),
        "Dragonball Z",
        nx_tactics_books_superheroes.f_chapter_dragonball_z(),
        "Marvel Universe",
        nx_tactics_books_superheroes.f_chapter_marvel_universe(),
        "Original Groups",
        nx_tactics_books_superheroes.f_chapter_original_groups()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_dc_universe": nx_tactics_books_superheroes.e_chapter_dc_universe,
      "chapter_dragonball_z": nx_tactics_books_superheroes.e_chapter_dragonball_z,
      "chapter_marvel_universe": nx_tactics_books_superheroes.e_chapter_marvel_universe,
      "chapter_original_groups": nx_tactics_books_superheroes.e_chapter_original_groups,
      "chapter_superhero_characters": nx_tactics_books_superheroes.e_chapter_superhero_characters,
      "chapter_superheroes_overview": nx_tactics_books_superheroes.e_chapter_superheroes_overview,
      "tacticsbook": nx_tactics_books_superheroes.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_dc_universe": nx_tactics_books_superheroes.t_chapter_dc_universe,
      "chapter_dragonball_z": nx_tactics_books_superheroes.t_chapter_dragonball_z,
      "chapter_marvel_universe": nx_tactics_books_superheroes.t_chapter_marvel_universe,
      "chapter_original_groups": nx_tactics_books_superheroes.t_chapter_original_groups,
      "chapter_superhero_characters": nx_tactics_books_superheroes.t_chapter_superhero_characters,
      "chapter_superheroes_overview": nx_tactics_books_superheroes.t_chapter_superheroes_overview,
      "tacticsbook": nx_tactics_books_superheroes.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/superheroes",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_dc_universe)
    nx_tactics_books_superheroes.t_chapter_dc_universe['vx_value'] = {
      name          : "chapter_dc_universe",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_dc_universe
    }

    // (func chapter_dragonball_z)
    nx_tactics_books_superheroes.t_chapter_dragonball_z['vx_value'] = {
      name          : "chapter_dragonball_z",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_dragonball_z
    }

    // (func chapter_marvel_universe)
    nx_tactics_books_superheroes.t_chapter_marvel_universe['vx_value'] = {
      name          : "chapter_marvel_universe",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_marvel_universe
    }

    // (func chapter_original_groups)
    nx_tactics_books_superheroes.t_chapter_original_groups['vx_value'] = {
      name          : "chapter_original_groups",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_original_groups
    }

    // (func chapter_superhero_characters)
    nx_tactics_books_superheroes.t_chapter_superhero_characters['vx_value'] = {
      name          : "chapter_superhero_characters",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_superhero_characters
    }

    // (func chapter_superheroes_overview)
    nx_tactics_books_superheroes.t_chapter_superheroes_overview['vx_value'] = {
      name          : "chapter_superheroes_overview",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_chapter_superheroes_overview
    }

    // (func tacticsbook)
    nx_tactics_books_superheroes.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/superheroes",
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
      fn            : nx_tactics_books_superheroes.f_tacticsbook
    }

  }
}
