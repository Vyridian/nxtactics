'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_powers {

  /**
   * @function chapter_alteration_powers
   * @return {chapter}
   */
  static t_chapter_alteration_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_alteration_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_alteration_powers
  }

  // (func chapter_alteration_powers)
  static f_chapter_alteration_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Alteration Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Material Control",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Material Control",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Atomic Control",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Atomic Control",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Disintegrate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disintegrate",
                  ":summary",
                  "* Causes wounds that are difficult to heal\n* A victim that takes Disintegrate Tokens equal to Body are completely destroyed."
                ),
                ":Destruction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Destruction",
                  ":summary",
                  "* Effects only unliving objects\n* A target that takes Destruction Tokens equal to Body are completely destroyed."
                )
              )
            ),
            "Density Control",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Density Control"
            ),
            ":Transfiguration",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Transfiguration",
              ":summary",
              "* The ability to transform others.",
              ":titles",
              "Fleshcrafting, Vissisitude",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Blinding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding"
                ),
                "Body Morph",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Morph"
                ),
                ":Deafening",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deafening"
                ),
                ":Malleate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Malleate",
                  ":summary",
                  "* Make target soft and malleable."
                ),
                ":Petrification",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Petrification",
                  ":summary",
                  "* [Focus]: vs. Spirit and place [Petrification] counters on the target body location.\n* Any body location with a [Petrification] is encased in stone. It requires an [Action] to remove a [Petrification]. Any area that suffers 3 [Petrification] turns completely to stone. If any other area is so petrified, then complete petrification immediately spreads across the entire body and then the body and all its gear immediately converts to a stone statue.\n* Additioan Effects: A petrified arm cannot move. A petrified leg reduces Move by half. A petrified head is unable to see or hear. Other petrifed areas have no additional effect. Petrified Arms or legs can break off like a clean amputation without blood loss. \n* This ability can also be used to restore a petrified target back to its original form if the skill is at least equal to the original. Lost limbs may also be restored by reattaching the limb before restoration.\n* This ability can also be used on any sort of earth to harden the earth to equivalent stone."
                ),
                ":Polymorph",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Polymorph",
                  ":summary",
                  "* [Action]: Roll vs. Spirit and place Black [Shapeshift] Tokens on target.\n* A unit with 0 Spirit due to polymorph changes into any creature desired of equal Body.  When the last Shapeshift Token is removed, a polymorphed unit returns to normal."
                ),
                "Sensory Deprivation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sensory Deprivation"
                ),
                "Sensory Overload",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sensory Overload"
                )
              )
            ),
            ":Transmutation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Transmutation",
              ":summary",
              "* The ability to transform non-living matter.",
              ":titles",
              "Reality Warper, Shaper, Transmuter",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Molecular Alteration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Molecular Alteration"
                )
              )
            )
          )
        ),
        "Power Manipulation",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Power Manipulation",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Power Copy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Copy"
            ),
            "Power Disruption",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Disruption"
            ),
            "Power Drain",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Drain"
            ),
            "Power Feedback",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Feedback"
            ),
            "Power Fluctuation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Fluctuation"
            ),
            "Power Reflection",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Reflection"
            ),
            "Power Theft",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Theft"
            ),
            "Power Vampire",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Power Vampire"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_body_powers
   * @return {chapter}
   */
  static t_chapter_body_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_body_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_body_powers
  }

  // (func chapter_body_powers)
  static f_chapter_body_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Body Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Alteration Powers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Alteration Powers",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Adaptation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Adaptation",
              ":summary",
              "Ability to survive in hostile environments. Higher power levels ignore the effects of increasingly hostile environments.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Adapt to Cold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Cold"
                ),
                "Adapt to Desert",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Desert"
                ),
                "Adapt to Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Electricity"
                ),
                "Adapt to Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Fire"
                ),
                "Adapt to Fresh Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Fresh Water"
                ),
                "Adapt to Heat",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Heat"
                ),
                "Adapt to High Altitude",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to High Altitude"
                ),
                "Adapt to High Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to High Gravity"
                ),
                "Adapt to High Pressure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to High Pressure"
                ),
                "Adapt to Low Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Low Gravity"
                ),
                "Adapt to Low Pressure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Low Pressure"
                ),
                "Adapt to Micro Impact",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Micro Impact",
                  ":summary",
                  "* Can endure the impact of very small, high velocity particles like micro meterorites and small caliber bullets."
                ),
                "Adapt to Radiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Radiation"
                ),
                "Adapt to Salt Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Salt Water"
                ),
                "Adapt to Vacuum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Vacuum"
                ),
                "Adapt to Zero Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Zero Gravity"
                ),
                "Adapt to Zero Pressure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adapt to Zero Pressure"
                )
              )
            ),
            ":Acidic",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Acidic",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Acid Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Bite"
                ),
                "Acid Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Blood",
                  ":reference",
                  "Gestates in a human host and has concentrated acid for blood - Aliens"
                ),
                "Acid Spray",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Spray"
                ),
                "Acid Spit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Spit"
                ),
                "Acid Sting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Sting"
                )
              )
            ),
            "Altered Skin",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Altered Skin",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Slippery Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slippery Skin"
                ),
                "Tar Baby",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tar Baby"
                )
              )
            ),
            ":Animalism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Animalism",
              ":reference",
              "Beast Boy, Teen Titans",
              ":titles",
              "Shapeshifter",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Adhesive Grip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adhesive Grip"
                ),
                "Aspect of Wolf",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Aspect of Wolf",
                  ":reference",
                  "Everquest"
                ),
                "Bat Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bat Sight"
                ),
                "Bear Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bear Form"
                ),
                "Bear Strength",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bear Strength"
                ),
                "Cat Feet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cat Feet",
                  ":summary",
                  "* Reduce damage from falls"
                ),
                "Chameleon Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chameleon Skin"
                ),
                "Extra Limbs",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extra Limbs"
                ),
                "Fish Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fish Eye"
                ),
                "Fish Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fish Form"
                ),
                ":Gills",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gills"
                ),
                "Hawk Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hawk Eye",
                  ":titles",
                  "Eagle Eye"
                ),
                "Hawk Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hawk Form"
                ),
                "Rat Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rat Form"
                ),
                "Snake Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snake Bite"
                ),
                "Snake Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snake Form"
                ),
                "Spider Climb",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spider Climb"
                ),
                ":Spines",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spines"
                ),
                ":Tendrils",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tendrils"
                ),
                ":Wings",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wings"
                ),
                "Wolf Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wolf Form"
                ),
                "Wolf Scent",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wolf Scent"
                )
              )
            ),
            "Demonic Power",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Demonic Power",
              ":summary",
              "* Yoki - 妖気, or 'demon essence' (the first character means demon, and second character is the same as the Chinese word commonly known as chi).",
              ":titles",
              "Demon, Yoki, Yoma"
            ),
            ":Diseases",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Diseases",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Fungal Growth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fungal Growth"
                ),
                "Intestinal Parasite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intestinal Parasite"
                ),
                ":Rabid",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rabid"
                )
              )
            ),
            ":Explosive",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Explosive",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Bombardier Spray",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bombardier Spray"
                )
              )
            ),
            ":Flexible",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Flexible",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animated Hair",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animated Hair"
                ),
                "Arm Stretch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Arm Stretch",
                  ":summary",
                  "* [Action]: May perform known [Punch] ability at range."
                ),
                "Body Stretch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Stretch",
                  ":reference",
                  "* You need to be more ... flexible. - Elastigirl, The Incredibles"
                ),
                "Bouncing Ball",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bouncing Ball"
                ),
                ":Engulf",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engulf"
                ),
                "Hair Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hair Whip"
                ),
                "Leg Stretch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leg Stretch",
                  ":summary",
                  "* [Action]: May perform known [Kick] ability at range."
                ),
                ":Tentacles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tentacles"
                ),
                "Tentacle Hammer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tentacle Hammer"
                ),
                "Tentacle Spear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tentacle Spear"
                ),
                "Tentacle Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tentacle Whip"
                )
              )
            ),
            ":Intangibility",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Intangibility",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Dematerialize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dematerialize"
                ),
                "Dematerialize Other",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dematerialize Other"
                )
              )
            ),
            ":Invisibility",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Invisibility",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Invisible",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Invisible"
                ),
                ":Transparency",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transparency"
                ),
                ":Vanish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vanish"
                )
              )
            ),
            ":Longevity",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Longevity",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Eternal Youth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eternal Youth",
                  ":titles",
                  "Ageless"
                ),
                "Long Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Long Life"
                ),
                ":Reincarnation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reincarnation",
                  ":reference",
                  "* Doctor Who"
                ),
                "Reincarnation - Transference",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reincarnation - Transference"
                ),
                "True Immortality",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "True Immortality"
                )
              )
            ),
            ":Lycanthropy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Lycanthropy",
              ":summary",
              "* Lycanthropy is an inherited trait that normally lies dormant. It seems to be triggered by near death experiences with other Lycanthropes.\n!Traits\n* Permanent - Lycanthropy is an inherited trait and cannot be 'cured'.\n* Rage - Lycanthropes are easily angered and are subject to berserk rages.\n** [Anytime]: When taunted or after taking 2 or more damage, the unit must roll Lycanthropy vs. Spirit, gaining [Berserk] Tokens for each Hit. If the unit has any [Berserk] Tokens it immediately takes a non human Lycanthropy form on its next [Action].\n** [Daily]: On the first nights of the waxing and waning Moons or on any night under a Full Moon, the unit must check for going berserk as if taunted.\n* [Tooth and Claw]\n** Requires: Must be in a non human form.\n** Passive\n** +1 Melee or Close Combat for each [Rage] Token.",
              ":stat",
              "Beast",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animal Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animal Form",
                  ":summary",
                  "* Action: Change to specific animal unit.\n** +1 Move, -2 Mind, +1 Spirit.\n** Clothes and Armor are destroyed or dropped.  All Equipment is dropped.\n** Gain [Natural Weaponry] and [Regeneration] Abilities.\n** Duration: Until sunrise."
                ),
                "Primal Animal Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Animal Form",
                  ":reference",
                  "American Werewolf in London"
                ),
                "Beastman Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Beastman Form",
                  ":reference",
                  "Wolfman or Mr. Hyde.",
                  ":summary",
                  "* Action: Change to bestial humanoid unit.\n** +1 Body, -1 Mind.\n** Shirt and Armor is destroyed or dropped.\n** Gain [Regeneration] Ability.\n** Duration: Until sunrise."
                ),
                "Crinos Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crinos Form",
                  ":reference",
                  "The Howling",
                  ":summary",
                  "* Requires: [Animal Form], [Beastman Form]\n* Action: Change to specific Crinos unit.\n** +2 Body, -2 Mind, +1 Spirit.\n** Clothes and Armor are destroyed or dropped.\n** All Equipment not in hands is dropped.\n** Gain [Natural Weaponry], [Armor], and [Regeneration] Abilities.\n** Each [[Bleeding]] or [[Damage]] Token taken grants a [[Rage]] Token.\n** Each [[Bleeding]] Token inflicted grants a [[Rage]] Token.\n** Each adjacent Ally or Foe slain grants a [[Rage]] Token.\n** Remove a [[Rage]] Token instead of gaining a [[Hold]], [[Control]], [[Morale]], [[Despair]] or [[Fear]] Token.\n** If [[Rage]] Tokens exceed Spirit, then roll [[Rage]] vs [[Spirit]] or gain a [[Berserk]] Token.\n** Duration: Until sunrise."
                ),
                "Human Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Human Form",
                  ":summary",
                  "* Action: Change back to human unit from other Lycanthropy form.\n* Duration: Indefinite"
                ),
                "Mark Territory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mark Territory",
                  ":summary",
                  "* By scenting an area, animals and supernatural beings will recognize the scent as a warning to stay away. Aggressive beings may be drawn to it."
                ),
                "Mirror Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror Walk",
                  ":summary",
                  "* Action: As a creature of spirit, Lycanthropes may enter the [Spirit Realm] merely by looking at their reflection in any surface."
                ),
                "Spirit Claw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Claw",
                  ":summary",
                  "* Allows unit to attack targets across the [Veil]."
                )
              )
            ),
            ":Phasing",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Phasing",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Phase Jump",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phase Jump",
                  ":summary",
                  "* The ability to move without travelling through the intervening space.\n* [Action]: Instantly move to any empty space up to 1/3 speed away without passing through any intervening spaces."
                ),
                "Phase Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phase Walk",
                  ":summary",
                  "* The ability to move through solid matter.\n* [Action]: Move at half speed ignoring terrain penalties or other objects. While Phase Walking, the user takes no physical damage (unless it is magical). If the move ends in a solid object, the user is still considered to be Phase Walking unitl it no longer ends it turn on a solid object. No attacks can be made this turn."
                )
              )
            ),
            "Reality Warping",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Reality Warping",
              ":reference",
              "* Franklin Richards",
              ":summary",
              "* Perhaps equal to Time Travel as the most powerful of all abilities. By altering reality, seemingly nothing is beyond possibility.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Closed Universe",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Closed Universe",
                  ":reference",
                  "* M.C. Escher, Relativity\n* Land of the Lost",
                  ":summary",
                  "* Exits from a location loop back upon themselves to leave a person back where they started."
                )
              )
            ),
            "Shape Change",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Shape Change",
              ":titles",
              "Shapeshifter",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Physical Imitation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physical Imitation",
                  ":reference",
                  "* So, how do we know who's human? If I was an imitation, a perfect imitation, how would you know it was really me? - Childs, The Thing"
                )
              )
            ),
            "Size Control",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Size Control",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Growth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Growth"
                ),
                ":Shrinking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shrinking"
                )
              )
            ),
            ":Spawning",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Spawning",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Copy Other",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Copy Other",
                  ":summary",
                  "Split target into 2 copies, each with -1 on all abilities."
                ),
                "Copy Self",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Copy Self",
                  ":summary",
                  "Split yourself into 2 copies, each with -1 on all abilities."
                ),
                "Detach Body Parts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detach Body Parts"
                ),
                ":Offspring",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Offspring",
                  ":reference",
                  "* A Cell gets out, and it will IMITATE EVERYTHING on the face of the EARTH! AND NOTHING CAN STOP IT! - Blair, The Thing"
                )
              )
            ),
            ":Toxins",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Toxins",
              ":reference",
              "* Say 'ah'. Some poisons can kill people in the thousands with that amount. Like botulinum toxin. It inhibits acetylcholine release, causing loss of muscle tone, lethary, .. dizziness .., visual impairment.., heavy eyelids, intense thirst, loss of speech, vomiting, diarrhea, stomach distention, breathing difficulty.. then.. respiratory failure. - A.K.I, Street Fighter 6",
              ":titles",
              "Poisonous, Venomous",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blinding Spit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding Spit"
                ),
                "Blinding Toxin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding Toxin"
                ),
                "Irritating Toxin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Irritating Toxin"
                ),
                "Paralyzing Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paralyzing Bite"
                ),
                "Paralyzing Spit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paralyzing Spit"
                ),
                "Paralyzing Spray",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paralyzing Spray"
                ),
                "Paralyzing Sting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paralyzing Sting"
                ),
                "Poison Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Bite"
                ),
                "Poison Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Blood"
                ),
                "Poison Spit",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Spit"
                ),
                "Poison Spray",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Spray"
                ),
                "Poison Sting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Sting"
                ),
                "Poison Touch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Touch"
                ),
                "Poisonous Flesh",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisonous Flesh",
                  ":summary",
                  "* Poisonous if bitten"
                ),
                "Poisonous Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisonous Skin",
                  ":summary",
                  "* Poisonous to the touch"
                )
              )
            ),
            ":Transformation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Transformation",
              ":reference",
              "* Let me change into something a little more... Comfortable. - Elise, Runeterra",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Change Clothing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Change Clothing"
                ),
                ":Combination",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combination",
                  ":reference",
                  "* Form feet and legs; form arms and body; and I'll form the head! - Keith, Voltron",
                  ":summary",
                  "* [Action]: Unit may combine with another unit with this ability to form a new unit with their combined value of Transformation skills or less."
                ),
                "Gaseous Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gaseous Form"
                ),
                "Liquid Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Liquid Form"
                ),
                "Matter Chameleon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Matter Chameleon",
                  ":reference",
                  "Kevin from Ben 10",
                  ":summary",
                  "* Transform body into any material touched"
                ),
                "Metal Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Metal Form",
                  ":reference",
                  "* Colossus - X-men\n* I'm bulletproof, nothing to lose...fire away, fire away...richochet, you take your aim... fire away, fire away...you shoot me down, but I won't fall...I am titanium - David Guetta, Titanium",
                  ":summary",
                  "* Transform body into any material touched"
                ),
                "Plant Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plant Form",
                  ":reference",
                  "* Swamp Thing, Man-Thing"
                ),
                "Quick Change",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quick Change"
                ),
                ":Transform",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transform",
                  ":reference",
                  "More Than Meets the Eye - Transformers",
                  ":summary",
                  "* [Action]: Change into a new unit with skill points equal to Transform."
                )
              )
            ),
            ":Vampirism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Vampirism",
              ":summary",
              "* Any unit with Vampirism is by definition a [Vampire].\n* [Deploy]: Start with [Vampire Blood] Tokens equal to Vampirisim.\n* Generations - When a Vampire is created, it automatically gains the Vampire Generation ability one less than the one who created them. A Vampire can only gain a lower Generation by [Diablerie].\n* Vitae - The blood\n* Hunger - Vampires are always hungry, unless they have recently killed.",
              ":stat",
              "Beast",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Vampire: 15th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 15th Generation",
                  ":titles",
                  "Stray"
                ),
                "Vampire: 14th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 14th Generation",
                  ":summary",
                  "* The last generation is known as thin-blooded vampires and start with only basic Vampiric powers. During the Dark Ages the Thirteenth Generation was believed to be the last, but in the Final Nights this is comprised of the 14th and 15th Generations.",
                  ":titles",
                  "Thin Blood"
                ),
                "Vampire: 13th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 13th Generation"
                ),
                "Vampire: 12th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 12th Generation",
                  ":summary",
                  "* Although they lack the powers of the lower generations, the vampires of the 12th and 13th generations stand above men, capable of besting the strongest mortal knight in battle and wielding influence over barons, merchants and courts."
                ),
                "Vampire: 11th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 11th Generation"
                ),
                "Vampire: 10th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 10th Generation",
                  ":summary",
                  "* While they are comparatively young, most vampires created within the last few centuries belong to the tenth and eleventh generation."
                ),
                "Vampire: 9th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 9th Generation"
                ),
                "Vampire: 8th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 8th Generation",
                  ":summary",
                  "* Achieving a delicate balance between age and generation, these vampires are the most visible ones of the 14th century. They are nowhere near as old as most Cainites of lower generation, which places them in a delicate position. Most Cainites of eighth and ninth generation overcome this disadvantage by siring large covens of childer."
                ),
                "Vampire: 7th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 7th Generation"
                ),
                "Vampire: 6th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 6th Generation",
                  ":summary",
                  "* Many of the vampires of the sixth and seventh generation are the self-styled lords of Cainite society. Although they are not as powerful as the Methuselahs, these Cainites are still formidable opponents, who gladly sacrifice mystical and spiritual power for temporal influence. These Cainites rule over vast kingdoms, donning the crown of monarchs and commanding armies of younger Cainites and mortal thralls."
                ),
                "Vampire: 5th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 5th Generation",
                  ":titles",
                  "Methuselah"
                ),
                "Vampire: 4th Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 4th Generation",
                  ":summary",
                  "* Methsuselahs are the most powerful modern Vampires that have been encountered. They are terrifyingly alien and powerful. It is hard to imagine the power of the lower Generations, given the strenght of the 4th Generation.",
                  ":titles",
                  "Methuselah"
                ),
                "Vampire: 3rd Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 3rd Generation",
                  ":summary",
                  "* Thirteen ancient Vampires were thought to have survived past the great flood and to have started the existing clans. Presumably the Antediluvians are of such age and potency of blood that they possess nearly god-like power, and in fact some of them may be deities. Most believe these god-like beings to be either in torpor, manipulating the Jyhad, or dead. While some clans regard their progenitor favorably, as a whole the Antediluvians are often portrayed as boogeymen that will one day rise and devour their descendants in at time called Gehenna.",
                  ":titles",
                  "Antedeluvlain"
                ),
                "Vampire: 2nd Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 2nd Generation",
                  ":summary",
                  "* It is said that there were three second generation Vampires: Enoch, the Wise (Caine's advisor), Irad, the Strong (Caine's general) and Zillah, the Beautiful (Caine's wife). They lived in the first city and presumably created the Antedeluvians, but nothing is known of them after their childer rose up against them in the final nights of the First City. Perhaps the Second Generation perished in the Deluge, or at the hands of their childer."
                ),
                "Vampire: 1st Generation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vampire: 1st Generation",
                  ":summary",
                  "* Only Cain, the original Vampire, is 1st generation. After all this time, his abilities would be beyond imagination."
                ),
                "Blood Bond",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Bond"
                ),
                "Blood Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Sight",
                  ":summary",
                  "* See blood through the skin.\n* With close observation, subtle blood characteristics can be detected including blood diseases, poisoning, or Diablerie"
                ),
                "Consume Flesh",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Consume Flesh",
                  ":summary",
                  "* Consume the flesh of a grabbed unit. Gain a [Vampire Blood] token and target gains a [Damage] and a [Spirit Damage].\n* You may not gain more [Vampire Blood] than target has [Spirit], though you gain one more [Vampire Blood] if the target is slain by drinking its blood.\n* You may not have more [Vampire Blood] than [Vampirism].\n* You may not drink from the dead."
                ),
                "Drink Blood",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drink Blood",
                  ":summary",
                  "* Drink blood from a grabbed unit. Gain a [Vampire Blood] token and target gains a [Damage] and a [Spirit Damage].\n* You may not gain more [Vampire Blood] than target has [Spirit], though you gain one more [Vampire Blood] if the target is slain by drinking its blood.\n* You may not have more [Vampire Blood] than [Vampirism].\n* You may not drink from the dead.",
                  ":titles",
                  "The Kiss"
                ),
                ":Embrace",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Embrace",
                  ":reference",
                  "* It was magical. The surrender. The exquisite suicide of giving in ... words cannot encompass that experience ... I asked him ... 'What gives you the right?' ... My question had struck no chord of mercy ... Rather, I believe he wanted me to become as he was and see for myself what gave him the right - what gives all of our kind the right.",
                  ":summary",
                  "* Sire - When a Vampire creates a another the creator is called its Sire."
                ),
                ":Torpor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Torpor",
                  ":summary",
                  "* If slain, but the body is not burned or the head severed, the vampire will not die but instead enter a deep sleep while his body slowly recovers.\n* It is said that very old Vampires may be sleeping for centuries in Torpor."
                )
              ),
              vx_core.f_new(
                vx_core.t_msgblock,
                ":msgs",
                vx_core.f_new(
                  vx_core.t_msglist,
                  vx_core.f_new(
                    vx_core.t_msg,
                    ":code",
                    ":invalidtagfound",
                    ":detail",
                    vx_core.f_new(
                      vx_core.t_anymap,
                      ":type",
                      nx_tactics_base.t_power,
                      ":tag",
                      "weakness"
                    ),
                    ":severity",
                    2
                  )
                ),
                ":msgblocks",
                vx_core.f_new(
                  vx_core.t_msgblocklist,
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidtagfound",
                        ":detail",
                        vx_core.f_new(
                          vx_core.t_anymap,
                          ":type",
                          nx_tactics_base.t_power,
                          ":tag",
                          "weakness"
                        ),
                        ":severity",
                        2
                      )
                    )
                  )
                )
              )
            )
          )
        ),
        ":Cybernetics",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Cybernetics",
          ":reference",
          "* Metal is perfection. - Viktor, Runeterra",
          ":summary",
          "* Faux Flesh (Faux Skin) - The great breakthrough in cybernetics was not in machinery but in synthetic flesh. Faux Flesh is a foam that hardens into soft, realistic flesh that will not be rejected by user's immune system. Faux Flesh can be injected between machine parts and is used at all interface points between living tissue and cyberware. It seals wounds like chalking and is a staple of medical kits.",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Cybernetic Arm",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Arm",
              ":summary",
              "* All abilities assume both arms are cybernetic. If only one is used all abilities are at -1.",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Cybernetic Blade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Blade"
                ),
                "Cybernetic Claws",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Claws",
                  ":reference",
                  "* I'm the best at what I do - Wolverine"
                ),
                "Cybernetic Electrifier",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Electrifier",
                  ":summary",
                  "* Discharge a massive electric charge through the palms of the hands."
                ),
                "Cybernetic Fingernails",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Fingernails"
                ),
                "Cybernetic Hammer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Hammer"
                ),
                "Cybernetic Knife",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Knife",
                  ":titles",
                  "Punch Blade"
                ),
                "Cybernetic Knuckles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Knuckles"
                ),
                "Cybernetic Saw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Saw"
                ),
                "Cybernetic Shredder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Shredder"
                ),
                "Cybernetic Spike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Spike"
                ),
                "Cybernetic Strength",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Strength"
                ),
                "Cybernetic Weapon Arm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Weapon Arm",
                  ":summary",
                  "* Nonconsealable.\n* One or both arms may be replaced with heavy weapons from rifles, grenade launchers, micromissile launchers, up to miniguns."
                ),
                "Cybernetic Weapon Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Weapon Hand",
                  ":summary",
                  "* A regular pistol or SMG of any sort may be modified to fit into a cybernetic arm. This ability may be purchased for each arm."
                ),
                "Cybernetic Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Whip"
                ),
                "Extension Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extension Hand"
                ),
                "Extra Cybernetic Arm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extra Cybernetic Arm"
                ),
                "False Fingerprints",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False Fingerprints"
                ),
                "False Palmprint",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False Palmprint"
                ),
                "Grapple Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grapple Hand"
                ),
                "Monofilament Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Monofilament Whip"
                ),
                "Smartgun Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smartgun Link"
                ),
                "Sonic Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sonic Filter",
                  ":summary",
                  "* Reduces sonic damage"
                ),
                "Tactile Enhancer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tactile Enhancer"
                ),
                "Tool Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tool Hand"
                )
              )
            ),
            "Cybernetic Hearing",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Hearing",
              ":summary",
              "* All abilities assume both ears are cybernetic.  If only one is used all abilities are at -1.",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Antideafening",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Antideafening"
                ),
                "Bug Detector",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bug Detector"
                ),
                "Enhanced Hearing Range",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Hearing Range",
                  ":summary",
                  "* Can hear supersonic and subsonic sounds."
                ),
                "Noise Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Noise Filter"
                ),
                "Parabolic Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Parabolic Hearing"
                ),
                "Radar Sensor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radar Sensor"
                ),
                "Sonar Sensor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sonar Sensor"
                ),
                "Stethoscope Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stethoscope Hearing"
                ),
                "Voice Stress Analyzer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voice Stress Analyzer",
                  ":summary",
                  "* Detects stress in the target's voice.  Often this means lying."
                )
              )
            ),
            "Cybernetic Implants",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Implants",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Animated Tatoo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Animated Tatoo"
                ),
                "Artificial Gills",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Artificial Gills"
                ),
                "Biomesh Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biomesh Skin"
                ),
                "Breast Enhancement",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Breast Enhancement",
                  ":summary",
                  "* Size and shape may be changed at will"
                ),
                "Body Plating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Plating"
                ),
                "Contraceptive Implant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Contraceptive Implant"
                ),
                ":Cybersnake",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybersnake",
                  ":summary",
                  "* A visious close combat weapon that is implanted in mouth, stomach, or genitals! When in Close Combat range, the Cybersnake may lash out with surprise and land a potentially fatal blow."
                ),
                ":Cyberteeth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cyberteeth",
                  ":reference",
                  "* Jaws - Moonraker",
                  ":titles",
                  "Cyberfangs"
                ),
                "Cybernetic Rebreather",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Rebreather",
                  ":summary",
                  "* May survive without fresh air for 10 minutes per level."
                ),
                "Cybernetic Tail",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Tail",
                  ":summary",
                  "* Adds a tail"
                ),
                "Disease Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disease Filter"
                ),
                "Drug Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drug Filter"
                ),
                "False DNA",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False DNA"
                ),
                "Gas Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gas Filter",
                  ":summary",
                  "* Filters harmful gases from the particles from the air, so they never reach the lungs."
                ),
                "Hair Colorizing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hair Colorizing"
                ),
                "Hair Styleshifting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hair Styleshifting"
                ),
                "Jamming Transmitter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jamming Transmitter"
                ),
                "Medical Injection System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Medical Injection System"
                ),
                "Motion Sensor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Motion Sensor"
                ),
                "Nasal Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nasal Filter",
                  ":summary",
                  "* Removes particles from the air including sand, dust, pollen, and other large particles."
                ),
                "Olfactory Enhancer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Olfactory Enhancer"
                ),
                "Poison Sniffer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poison Sniffer"
                ),
                "Poisonous Cyberteeth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poisonous Cyberteeth"
                ),
                "Reflex Enhancer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reflex Enhancer"
                ),
                "Reinforced Bones",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reinforced Bones"
                ),
                "Sexual Implant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sexual Implant"
                ),
                "Skin Colorizing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skin Colorizing"
                ),
                "Stimulant Injectors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stimulant Injectors"
                ),
                "Subdermal Holster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subdermal Holster"
                ),
                "Subdermal Pouch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subdermal Pouch"
                ),
                "Subdermal Transponder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subdermal Transponder"
                ),
                "Toxin Filter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Toxin Filter"
                ),
                "Voice Amplifier",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voice Amplifier"
                ),
                "Voice Descrambler",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voice Descrambler",
                  ":summary",
                  "* May understand encrypted audio information if you know the key."
                ),
                "Voice Scrambler",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voice Scrambler",
                  ":summary",
                  "* May speak in encrypted phrases that only a descrambler with the key can understand."
                ),
                "Voice Synthesizer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voice Synthesizer"
                )
              )
            ),
            "Cybernetic Interface",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Interface",
              ":summary",
              "* Cybernetic Interface include mostly software-based sensors and systems.",
              ":titles",
              "Neuralware",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Co-processor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Co-processor"
                ),
                "Cybernetic Countermeasures",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Countermeasures",
                  ":summary",
                  "* Hardens cybernetic computer components against attempts to hack or scramble it systems."
                ),
                "Cybernetic Datapad",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Datapad"
                ),
                "Cybernetic Recorders",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Recorders",
                  ":summary",
                  "* Can record or playback audio and video"
                ),
                "Direct Comm Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Direct Comm Link",
                  ":summary",
                  "* Listen to your music collection or radio stations, watch television, surf the web, or make phone calls.\n* Because these are neural links, they do not actually require cybernetic eyes or ears."
                ),
                "Direct Neural Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Direct Neural Link",
                  ":reference",
                  "* Do you think that's air your breathing?"
                ),
                "Medical Scanner",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Medical Scanner"
                ),
                "Memory Chip Interface",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Memory Chip Interface"
                ),
                "Pain Suppressor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pain Suppressor"
                ),
                "Security Scanner",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Security Scanner"
                ),
                "Skill Chip Interface",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skill Chip Interface",
                  ":reference",
                  "* I know Kung Fu\n* Do you know how to fly that thing? Not yet. - The Matrix"
                ),
                "Translation Software",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Translation Software"
                ),
                "Vehicle Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vehicle Link"
                )
              )
            ),
            "Cybernetic Legs",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Legs",
              ":summary",
              "* All abilities assume both legs are cybernetic.  If only one is used all abilities are at -1.",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Cybernetic Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Kick"
                ),
                "Cybernetic Leap",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Leap"
                ),
                "Cybernetic Rocket Launcher",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Rocket Launcher"
                ),
                "Cybernetic Running",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Running"
                ),
                "Cybernetic Tractor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Tractor",
                  ":summary",
                  "* Nonconsealable.\n* Replace both legs with wheels or treads."
                ),
                "Extra Cybernetic Leg",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extra Cybernetic Leg"
                ),
                "Prehensile Foot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prehensile Foot"
                ),
                "Spike Foot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spike Foot"
                ),
                "Talon Foot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Talon Foot"
                ),
                "Webbed Foot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Webbed Foot",
                  ":summary",
                  "* Enhanced swimming"
                )
              )
            ),
            "Cybernetic Vision",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cybernetic Vision",
              ":stat",
              "Shadow",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Colorizing Eyes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Colorizing Eyes"
                ),
                "Cybernetic Antidazzle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Antidazzle"
                ),
                "Cybernetic Camera",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Camera"
                ),
                "Cybernetic Eye Laser",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Eye Laser"
                ),
                "Cybernetic Heat Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Heat Vision"
                ),
                "Cybernetic Image Enhancement",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Image Enhancement"
                ),
                "Cybernetic Laser Pointer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Laser Pointer"
                ),
                "Cybernetic Microscopic Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Microscopic Vision"
                ),
                "Cybernetic Night Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Night Vision"
                ),
                "Cybernetic Rangefinder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Rangefinder"
                ),
                "Cybernetic Targeting System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Targeting System"
                ),
                "Cybernetic Telescopic Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cybernetic Telescopic Vision"
                ),
                "False Retina",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False Retina"
                )
              )
            ),
            ":Netrunning",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Netrunning",
              ":reference",
              "* Do not try and bend the spoon. That's impossible. Instead, only try to realize the truth. What truth? There is no spoon. There is no spoon? Then you will see that it is not the spoon that bends. It is only yourself. - The Matrix\n* You must let it all go... Fear... Doubt... Disbelief. Free Your Mind. - Morpheus, The Matrix",
              ":summary",
              "* By directly connecting the brain to a computer program, the user can greatly increase his reaction time and resourcefulness while travelling in cyberspace.\n* Netrunners - Outlaw computer jocks or hackers.\n* SysOps - Corporate or government computer system defenders.\n* ICE - Intrusion Countermeasures Electronics. Guardian software designed to thwart hackers and intrusion programs.\n* Black ICE - ICE programs designed to trap and harm the hackers or software it is defending against. This can range from induced system failures, data loss, or dangerous electric feedback. Numerous safeguards exist against such dangerous software, but Black ICE attempts to lure the user into believing that by lowering these safeguards that he will have the opportunity to steal information. Often to make this lure credible, actual information must be put at risk.\n* ICE Breker - Software designed to counter ICE.\n* Avatar - The digital representation of those in the NET.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Code Breaker Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Code Breaker Program",
                  ":summary",
                  "* Attempts to fool a [Gateway Program] that you are a legitimate user."
                ),
                "Crash Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crash Program"
                ),
                "Denial Of Service Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Denial Of Service Program",
                  ":summary",
                  "* Attempts to overwhelm the target program with millions of requests, thereby preventing legitimate users from accessing it until it can catch up with all of the requests.",
                  ":titles",
                  "DOS"
                ),
                "Feedback Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feedback Program"
                ),
                "Flatline Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flatline Program"
                ),
                "Freeze Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Freeze Program",
                  ":summary",
                  "* Attempts to alter the target program's internal clock, thereby slowing it or causing it to become non-responsive for a short about of time."
                ),
                "Jackhammer Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jackhammer Program",
                  ":summary",
                  "* Attempts to damage a [Firewall Program]. Such blatant attempts immediately raise alarms and are often a tool of last resort."
                ),
                "Phishing Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phishing Program",
                  ":titles",
                  "Password Research Program"
                ),
                "Speedtrap Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speedtrap Program"
                ),
                "Stealth Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stealth Program"
                ),
                "Succubus Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Succubus Program"
                ),
                "Task Killer Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Task Killer Program"
                ),
                "Tracer Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tracer Program",
                  ":titles",
                  "Bloodhound"
                ),
                "Trojan Horse Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trojan Horse Program"
                ),
                "Worm Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Worm Program"
                ),
                "Camera Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Camera Control Program"
                ),
                "Communications Uplink Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Communications Uplink Program"
                ),
                "Elevator Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Elevator Control Program"
                ),
                "Engine Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engine Control Program"
                ),
                "Factory Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Factory Control Program"
                ),
                "Lock Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lock Control Program"
                ),
                "Navigation Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Navigation Control Program"
                ),
                "Printer Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Printer Control Program"
                ),
                "Telecom Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telecom Control Program"
                ),
                "Vehicle Control Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vehicle Control Program"
                ),
                ":Firewall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Firewall"
                ),
                "Gateway Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gateway Program",
                  ":titles",
                  "Login Screen, Padlock"
                ),
                "Guardian Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Guardian Program",
                  ":titles",
                  "Doberman"
                ),
                "Intrusion Detection System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intrusion Detection System",
                  ":titles",
                  "Alarm, Watchdog"
                ),
                "Worm Consumer Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Worm Consumer Program",
                  ":titles",
                  "Aardvark, Robin"
                ),
                "Daemon Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Daemon Program"
                ),
                "Database Search Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Database Search Program"
                ),
                "Decryption Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Decryption Program"
                ),
                "Encryption Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Encryption Program"
                ),
                "Filelocker Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Filelocker Program"
                ),
                "Unerase Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unerase Program"
                ),
                "Adware Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Adware Program"
                ),
                "Eraser Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eraser Program"
                ),
                "Malware Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Malware Program"
                ),
                "Memory Cosumer Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Memory Cosumer Program"
                ),
                "Metamorphic Virus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Metamorphic Virus"
                ),
                "Polymorphic Virus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Polymorphic Virus"
                ),
                "Spyware Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spyware Program"
                ),
                "Zombie Program",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Zombie Program"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Attack Programs",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Attack Programs"
                ),
                "Control Programs",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Control Programs"
                ),
                "Protection Programs",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Protection Programs",
                  ":titles",
                  "ICE"
                ),
                ":Utilities",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Utilities"
                ),
                ":Viruses",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Viruses"
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
   * @function chapter_energy_and_forces
   * @return {chapter}
   */
  static t_chapter_energy_and_forces = {
    vx_type: vx_core.t_type
  }
  static e_chapter_energy_and_forces = {
    vx_type: nx_tactics_books_powers.t_chapter_energy_and_forces
  }

  // (func chapter_energy_and_forces)
  static f_chapter_energy_and_forces() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Energy and Forces",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Elements",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Elements",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Air",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Air",
              ":reference",
              "* But still the clever north wind was not satisfied. It spoke to Vianne of towns yet to be visited, friends in need yet to be discovered, battles yet to be fought... - Chocolat\n* You're really going to trust me ... My mind is like the wind on the waves. It could change in an instant. - Kazuha, Genshin Impact",
              ":summary",
              "* Air is the element of freedom. Air elementalists remain distant from worldly concerns. They are always in continous motion, moving from place to place and never putting down roots.\n* Symbol - White Swirling Wind\n* Personality - Airy, Flighty, Emphemeral, Ethereal, Gossamer",
              ":titles",
              "Aeromancer. Storm Lord, Storm Shaman, Weather Witch, Wind Rider, Wind Walker",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Acid Cloud",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Cloud"
                ),
                "Acid Rain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acid Rain",
                  ":summary",
                  "* Calls acid rain from an existing cloud."
                ),
                "Air Breathing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Breathing",
                  ":summary",
                  "* Can breath in any kind of air without ill effect including poison gases."
                ),
                "Alter Temperature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Alter Temperature"
                ),
                "Alter Weather",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Alter Weather"
                ),
                "Call Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Storm",
                  ":summary",
                  "* Calls a storm cloud."
                ),
                "Carried on the Wind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Carried on the Wind",
                  ":summary",
                  "* By focusing, the user can detect small things carried on the wind. Smoke, pollen, poison, unusual smells, ash, dust, faint sounds, etc. may be detected with uncanny ability. Higher levels detect more distanct and faint things."
                ),
                "Control Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Storm"
                ),
                "Clean Air",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clean Air"
                ),
                "Choking Cloud",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Choking Cloud"
                ),
                "Control Winds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Winds",
                  ":summary",
                  "* Effect: Raise or lower Wind strength."
                ),
                ":Downdraft",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Downdraft"
                ),
                "Eye of the Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye of the Storm",
                  ":summary",
                  "* [Action]: Create an eye in the storm that reduces [Wind Intensity] in 1 space radius for each Hit.\n* [Continue]: Reroll wind reduction and radius increases by 2 up to Level radius.\n* [Discontinue]: Wind returns to normal at same rate it was reduced."
                ),
                "Fan the Flames",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fan the Flames"
                ),
                "Fog Bank",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fog Bank"
                ),
                ":Hailstorm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hailstorm"
                ),
                ":Hurricane",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hurricane",
                  ":summary",
                  "* Buildup",
                  ":titles",
                  "Divine Wind"
                ),
                "Lightning Charge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lightning Charge",
                  ":summary",
                  "* Imbue an item with electric charge that is discharged on contact."
                ),
                ":Smother",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smother"
                ),
                ":Spindrift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spindrift",
                  ":summary",
                  "* Wind generates a thick mist above any body of water."
                ),
                ":Suffocate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Suffocate"
                ),
                "Summon Cloud",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Cloud",
                  ":summary",
                  "* Summons a large living cloud in moisture rich air. This can obscure vision."
                ),
                "Summon Djinn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Djinn"
                ),
                "Summon Gust",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Gust",
                  ":summary",
                  "* Summons a small living wind on items that may be blown in the breeze. Air elementals love nothing more than pushing things around."
                ),
                "Summon Slyph",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Slyph"
                ),
                ":Swirl",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swirl"
                ),
                "Temperature Control",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Temperature Control",
                  ":summary",
                  "* Effect: Raise or lower Temperature, Humidity."
                ),
                ":Tempest",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tempest"
                ),
                "Tempest in a Teapot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tempest in a Teapot",
                  ":summary",
                  "* Hits have no effect.  Criticals change Weather Intensity."
                ),
                ":Thunderstorm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thunderstorm"
                ),
                "Voices Carry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Voices Carry",
                  ":summary",
                  "Listen to conversation within line of sight."
                ),
                "Weather Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Weather Sight",
                  ":summary",
                  "* Analyze and predict weather"
                ),
                "Wind Lash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Lash",
                  ":titles",
                  "Wind Whip"
                ),
                ":Whirlwind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Whirlwind",
                  ":titles",
                  "Cyclone, Tornado"
                ),
                "Whispering Winds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Whispering Winds",
                  ":summary",
                  "Speak to others (one way) over long distances."
                ),
                "Wind Blade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Blade",
                  ":summary",
                  "* Create an ephemeral Sword created from thin air. It acts as a normal sword except that it does [Knockback] instead of [Bleeding]."
                ),
                "Wind Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Blast",
                  ":reference",
                  "* Where the two winds meet, there I will see the Wind Scar - Inuyasha"
                ),
                "Wind Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Form",
                  ":summary",
                  "* [Requires]: Stand in a breeze.\n* [Action]: Gain attributes of Wind as well as [Wind Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] Wind Close Combat attacks at Level."
                ),
                "Wind Slash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Slash"
                ),
                "Wind Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Walk"
                ),
                "Wind Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wind Wall",
                  ":summary",
                  "* Wall that deflects missles and strikes aerial units."
                ),
                ":Updraft",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Updraft",
                  ":summary",
                  "* [Action]: Apply [Wind] in a radius around user, lift enemies off the ground with Level weight, and hurl them down, if they strike a surface they take Level damage ."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Aeromancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Aeromancy",
                  ":summary",
                  "* Aero is the magical version of Air.\n* Aero effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Aero reacts with Pyro to produce the [Wildfire] effect.\n* Aero reacts with Cryo to produce the [Chill] effect.\n* Aero reacts with Hydro to produce the [Fog] effect.\n* Aero reacts with Electro to produce the [Ionized] effect.\n* Aero reacts with Geo to produce the [Weightess] effect."
                )
              )
            ),
            ":Cold",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Cold",
              ":reference",
              "Cold Miser, Frozen",
              ":summary",
              "* Cold abilities slow the movement of particles in the target. This slowing causes heat to leave the target. Therefore, cold powers also trigger a rush of hot air to rise from the target swirling wind all around.\n* Symbol - Bluish White Snowflake\n* Personality: Cold Elementalist personalities are influenced by their link to Cold.\n** Examples: Cold, Icy, Chilly, Severe, Harsh, Brutal, Reserved",
              ":titles",
              "Frost Lord, Ice Breaker, Ice Queen, Snow Queen, Ice Princess",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Avalanche",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Avalanche"
                ),
                ":Blizzard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blizzard"
                ),
                "Call Cold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Cold",
                  ":titles",
                  "Coldsnap"
                ),
                ":Chill",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chill",
                  ":summary",
                  "* Damage are Slow"
                ),
                ":Comet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Comet",
                  ":summary",
                  "* A massive ball of cold falls from the sky."
                ),
                "Control Cold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Cold",
                  ":summary",
                  "* [Reaction]: Redirect a cold effect to another target."
                ),
                "Frost Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Frost Whip",
                  ":titles",
                  "Frost Lash"
                ),
                "Frost Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Frost Weapon",
                  ":summary",
                  "* Add cold damage to normal attack.",
                  ":titles",
                  "Freezing Strike"
                ),
                "Glacial Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Glacial Wall"
                ),
                "Ice Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Armor",
                  ":titles",
                  "Frozen Man, Ice Form, Ice Man Cometh"
                ),
                "Ice Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Blast",
                  ":titles",
                  "Frost Bite"
                ),
                "Ice Bridge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Bridge"
                ),
                "Ice Castle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Castle",
                  ":reference",
                  "* The cold never bothered me anyway. - Elsa, Frozen",
                  ":titles",
                  "Snow Fort"
                ),
                "Ice Flow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Flow",
                  ":summary",
                  "* A floating block of ice suitable for a raft rises to the water's surface.\n* [Requires]: May only be cast near water."
                ),
                "Ice Riding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Riding",
                  ":summary",
                  "* Provides [Skating] ability without the requirement of Skates.",
                  ":titles",
                  "Ice Walk"
                ),
                "Ice Sculpture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Sculpture"
                ),
                "Ice Slide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Slide"
                ),
                "Ice Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ice Storm",
                  ":titles",
                  "Hail Storm"
                ),
                "Icy Prison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Icy Prison"
                ),
                ":Snowblind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snowblind"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Cryomancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Cryomancy",
                  ":summary",
                  "* Cryo is the magical version of Cold.\n* Cryo effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Cryo reacts with Pyro to produce the [Melt] effect.\n* Cryo reacts with Geo to produce the [Brittle] effect.\n* Cryo reacts with Hydro to produce the [Freeze] effect.\n* Cryo reacts with Electro to produce the [Superconduct] effect.\n* Cryo reacts with Aero to produce the [Chill] effect."
                )
              )
            )
          )
        ),
        ":Forces",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Forces",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Earth",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Earth",
              ":summary",
              "* Earth is the element of substance. Earth Elementalists must be persistent, stoic, strong and enduring. They must be subbornly immobile in mind and spirit.\n* Symbol - Brown Mountain",
              ":titles",
              "Earth Lord, Earth Master, Geomancer",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Buried Alive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Buried Alive",
                  ":reference",
                  "* I've done far worse than kill you. I've hurt you. And I wish to go on hurting you. I shall leave you as you left me, as you left her; marooned for all eternity in the center of a dead planet... buried alive! Buried alive...! - Khan, Star Trek II: The Wrath of Khan",
                  ":summary",
                  "* Collapse earth to close an opening."
                ),
                "Call Rockslide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Rockslide"
                ),
                "Control Earth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Earth",
                  ":summary",
                  "* [Reaction]: Redirect an earth effect to another target."
                ),
                ":Earthbind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earthbind",
                  ":summary",
                  "* Gravity increases for target flying unit. [-1 Altitude] for each success. No effect on units that are not flying.",
                  ":titles",
                  "Grip of Earth"
                ),
                "Earth Move",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earth Move",
                  ":summary",
                  "* Pushes a mound of earth like a bulldozer."
                ),
                "Earth Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earth Sight",
                  ":summary",
                  "* By touching the ground with bare skin, detect any object directly touching the ground in sight range regardless of intervening obstacle. This ability is particularly useful underground, for seeing through walls, and for indirect fire.",
                  ":titles",
                  "Earthsense"
                ),
                "Earth Till",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earth Till",
                  ":summary",
                  "* Softens earth. Also can prepare earth for planting crops in a large area."
                ),
                "Earth Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earth Walk",
                  ":summary",
                  "* Ignore movement penalties while travelling over natural earth or stone."
                ),
                "Earth Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earth Wall"
                ),
                ":Earthquake",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Earthquake"
                ),
                ":Landslide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Landslide",
                  ":summary",
                  "* Causes a weak section of earth or rock to collapse."
                ),
                "Mountain out of a Molehill",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mountain out of a Molehill",
                  ":summary",
                  "* Grow a small pile of earth bigger and bigger."
                ),
                "Pass Through Earth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pass Through Earth",
                  ":summary",
                  "* Allows the user to move through earth as if it were water."
                ),
                ":Quagmire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quagmire",
                  ":summary",
                  "* Any unit in the area is must spend double movement when moving.",
                  ":titles",
                  "Mudslide, Quicksand"
                ),
                ":Sandstorm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sandstorm"
                ),
                ":Shatter",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shatter",
                  ":summary",
                  "* [Attack] - Does no damage to the target, but instead damages its [Armor].",
                  ":titles",
                  "Armor Break"
                ),
                ":Sinkhole",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sinkhole",
                  ":summary",
                  "* A prone character on bare earth begins to sink.",
                  ":titles",
                  "Dirt Nap"
                ),
                ":Solidify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Solidify",
                  ":summary",
                  "* Any liquified solid become solid again."
                ),
                "Stone Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stone Form",
                  ":summary",
                  "* [Requires]: Cover body in dust, dirt, or mud.\n* [Action]: Gain attributes of [Earth] as well as [Earth Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] [Earth] [Close Combat] attacks at Level."
                ),
                "Treacherous Ground",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Treacherous Ground",
                  ":summary",
                  "* Creates a patch of broken earth or rock that will trip anything moving across it at more than a slow walk."
                ),
                ":Tremor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tremor",
                  ":summary",
                  "* Summons a small living earthquake in broken earth or rock. Earth elementals love nothing more than knocking things over."
                ),
                "Volcanic Eruption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Volcanic Eruption"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Geomancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Geomancy",
                  ":summary",
                  "* Geo is the magical version of Earth.\n* Geo effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Geo reacts with Pyro to produce the [Overheat] effect.\n* Geo reacts with Cryo to produce the [Brittle] effect.\n* Geo reacts with Hydro to produce the [Quagmire] effect.\n* Geo reacts with Electro to produce the [Grounded] effect.\n* Geo reacts with Aero to produce the [Weightess] effect."
                )
              )
            ),
            ":Electricity",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Electricity",
              ":reference",
              "* Lightning is eternal, the world is but shadow. - Raiden Shogun, the Electro Archon, Genshin Impact",
              ":summary",
              "* Electric Elementalist personalities are influenced by their link to Electricity.\n* Energetic, Explosive, Dynamic, Animated, Spark of Life, High Strung\n* Symbol - Yellow Lightning",
              ":titles",
              "Electro, Lightning",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Arc Lightning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Arc Lightning",
                  ":summary",
                  "* Lightning leaps from the target to others in range."
                ),
                "Body Electric",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Electric",
                  ":titles",
                  "Electricity Form"
                ),
                "Absorb Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Absorb Electricity"
                ),
                "Ball Lightning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ball Lightning"
                ),
                "Call Lightning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Lightning",
                  ":summary",
                  "* Calls a lightning strike from an existing storm cloud."
                ),
                "Control Lightning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Lightning",
                  ":summary",
                  "* [Reaction]: Redirect a lightning effect to another target."
                ),
                "Electromagnetic Pulse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electromagnetic Pulse"
                ),
                "Lightning Lash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lightning Lash",
                  ":titles",
                  "Arc Lash, Lightning Whip"
                ),
                "Lightning Warp",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lightning Warp",
                  ":summary",
                  "* Near instantaneous travel in a flash of lightning.\n* Level determines distance travelled."
                ),
                "Resist Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Electricity"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Electromancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Electromancy",
                  ":summary",
                  "* Electro is the magical version of Electricity.\n* Electro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Electro reacts with Pyro to produce the [Overload] effect.\n* Electro reacts with Cryo to produce the [Superconduct] effect.\n* Electro reacts with Hydro to produce the [Electrocharged] effect.\n* Electro reacts with Geo to produce the [Grounded] effect.\n* Electro reacts with Aero to produce the [Ionized] effect."
                )
              )
            ),
            ":Fire",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Fire",
              ":reference",
              "* Fire. It's a living thing, Brian. It breathes, it eats, and it hates. The only way to beat it is to think like it. To know that this flame will spread this way across the door and up across the ceiling, not because of the physics of flammable liquids, but because it wants to. Some guys on this job, the fire owns them, makes 'em fight it on it's level, but the only way to truly kill it is to love it a little. - Donald Rimgate, Backdraft\n* Dry is good and wind is better. Count the years you always knew it. Strike a match go on and do it...Oh light the sky and hold on tight, the world is burning down. - Shawn Colvin, Sunny Came Home",
              ":summary",
              "* Fire is the element of power. Fire Elementalists must have desire, passion, and the energy and drive to achieve it.\n* Symbol - Red Flame\n* Passionate, Fiery, Explosive, Incendiary, Violent",
              ":titles",
              "Arsonist, Fire Lord, Firebomber, Firestarter, Firewalker, Pyrokinetic, Pyromancer, Pyromaniac, Volcanist",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Burning Eyes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Burning Eyes",
                  ":summary",
                  "* Flaming eyes may see heat.",
                  ":titles",
                  "Fire Eyes"
                ),
                "Control Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Fire",
                  ":reference",
                  "* Pyro - X-Force",
                  ":summary",
                  "* [Action]: Change the shape of fire.\n* [Reaction]: Redirect a fire effect to another target."
                ),
                "Cinder Cloud",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cinder Cloud"
                ),
                "Cleansing Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleansing Fire"
                ),
                ":Combustion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combustion",
                  ":summary",
                  "* Summons a small living flame on combustible material. Fire elementals love nothing more than creating fires."
                ),
                "Eternal Flame",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eternal Flame",
                  ":summary",
                  "* Creates a flame that burns without fuel for as long as desired (only one at a time)."
                ),
                "Fan the Flames",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fan the Flames"
                ),
                "Fire Break",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Break",
                  ":summary",
                  "* Create an area where fire is smothered (does not effect existing heat)."
                ),
                "Fire Breathing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Breathing"
                ),
                "Fire Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Form",
                  ":summary",
                  "* Body becomes living flame.\n* [Action]: Gain attributes of [Fire] as well as [Fire Breathing] and [Fire Walk] for the turn.\n* [Continue]: May make [Strike] and [Grab] [Fire] [Close Combat] attacks at Level."
                ),
                "Fire Lore",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Lore"
                ),
                "Fire Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Storm",
                  ":titles",
                  "Rain of Fire"
                ),
                "Fire Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Walk",
                  ":reference",
                  "* I touch the fire and freezes me. I look into it and its black. Why can't I feel? My skin should crack and peel. I want the fire back. Now through the smoke, she calls to me, to make my way across the flame. To save the day or maybe melt away. I guess it's all the same. So I will walk through the fire, cause whereelse can I turn. I will walk through the fire and let it... The torch I bear is scorthing me, and Buffy's laughing I've no doubt. I hope she fries. I'm free if that bitch dies. I'd better help her out. Cause she is drawn to the fire. Some people never learn, and she will walk through the fire and let it... These endless days are finally ending in a blaze. And we are caught in the fire. The point of no return. So we will walk through the fire and let it burn. - Buffy the Vampire Slayer, Once More with Feeling",
                  ":summary",
                  "* Walk through flames. Gain [Armor] vs. Fire and ignore [Burning] effects."
                ),
                "Fire Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Ward"
                ),
                ":Fireworks",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fireworks"
                ),
                "Flame Cage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flame Cage"
                ),
                "Flame Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flame Whip",
                  ":titles",
                  "Fire Lash"
                ),
                "Flame Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flame Skin",
                  ":summary",
                  "* Immolate body in Fire\n* [Action]: Gain attributes of [Fire].\n* [Continue]: May make [Strike] and [Grab] [Fire] [Close Combat] attacks at Level.",
                  ":titles",
                  "Burning Man, Fire Armor, Immolate"
                ),
                "Flaming Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flaming Weapon",
                  ":summary",
                  "* Add the [Fire] trait to a weapon or to unarmed attacks.",
                  ":titles",
                  "Fire Fist, Flame Tongue, Flamebrand, Flaming Arrow, Flaming Sword"
                ),
                ":Inferno",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inferno",
                  ":titles",
                  "Pyroclasm"
                ),
                "Living Flame",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Flame"
                ),
                "Pyroclastic Flow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pyroclastic Flow",
                  ":reference",
                  "* A fast-moving current of volcanic hot gas and rock, which reaches speeds up to 700 km/h (450 mph). The gas can reach temperatures of about 1,000 °C (1,830 °F). Pyroclastic flows normally hug the ground and travel downhill, or spread laterally under gravity.",
                  ":titles",
                  "Pyrolclastic Cloud, Pyronado"
                ),
                "Ring of Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ring of Fire"
                ),
                ":Smother",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smother"
                ),
                "Summon Efreet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Efreet"
                ),
                "Summon Salamander",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Salamander"
                ),
                "Wall of Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Fire",
                  ":summary",
                  "* Forms a continuous [Wall] of [Fire].\n* [Requires]: A flammable fuel must exist for the whole length of the wall."
                ),
                ":Wildfire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wildfire",
                  ":summary",
                  "* Air in the area becomes bone dry and overheated. +1 [Fire] or [Air] abilities."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Pyromancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Pyromancy",
                  ":summary",
                  "* Pyro is the magical version of Earth.\n* Pyro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Pyro reacts with Geo to produce the [Overheat] effect.\n* Pyro reacts with Cryo to produce the [Melt] effect.\n* Pyro reacts with Hydro to produce the [Vaporize] effect.\n* Pyro reacts with Electro to produce the [Overload] effect.\n* Pyro reacts with Aero to produce the [Wildfire] ability."
                )
              )
            ),
            ":Water",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Water",
              ":reference",
              "* Davy Jones Locker\n* The power of water is its ability to change shape. - Genshin Impact",
              ":summary",
              "* Adaptable, Adjustable, Easy-going, Empathic, Flexible, Fluid, Patient, Serene, Versatile, Wrathful\n* Water is the element of change. Water elementalists must be adaptable, fluid, and flexible in their attitude (though not arbitrary). They are generally patient and empathetic, but they are also known for the intensity of their wrath. Their flexiblitity is often reflected in their sexuality.\n* Symbol - Blue Teardop\n* Water is the source of life and after Air it is the thing that we need most urgently to survive. Pure, unspoiled water can bestow many amazing benefits and has been the rise and fall of many empires. Of course, water can also be the source of a quick death.\n* Though Water washes away impurities, it does so by taking them unto itself and Water always remembers.",
              ":titles",
              "Aquamancer, Hydromancer, Wave Rider",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Air Bubble",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Bubble"
                ),
                "Call Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Water",
                  ":titles",
                  "Flashflood"
                ),
                "Control Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Water",
                  ":summary",
                  "* [Reaction]: Redirect a water effect to another target."
                ),
                ":Extinguish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extinguish"
                ),
                "Fountain of Youth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fountain of Youth"
                ),
                ":Liquify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Liquify",
                  ":summary",
                  "* Any solid becomes a liquid."
                ),
                "Part Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Part Water"
                ),
                "Purify Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Purify Water"
                ),
                "Ride the Wave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ride the Wave",
                  ":summary",
                  "* Slide on water"
                ),
                "Scrying Pool",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scrying Pool",
                  ":summary",
                  "* Look at your reflection in any pool of water, drop something in, and when the ripples recede you may see the current reflection from any other body of water that you have seen your reflection in."
                ),
                "Summon Current",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Current",
                  ":summary",
                  "* Summons a small living water flow in moving water. Water elementals love nothing more than pushing things around."
                ),
                "Summon Undine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Undine"
                ),
                ":Tides",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tides",
                  ":summary",
                  "* Raise or lower water level."
                ),
                ":Tsunami",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tsunami"
                ),
                ":Undertow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Undertow",
                  ":summary",
                  "* Creates a strong downward current that can suck things downward."
                ),
                "Wall of Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall of Water",
                  ":summary",
                  "* [Effect]: [Wall] of Water\n* [Requires]: May only be cast in water.\n* [Anytime]: Turbulence strikes any surface or underwater unit that crosses it."
                ),
                "Water Breathing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Breathing"
                ),
                "Water Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Form",
                  ":summary",
                  "* [Requires]: Douse body in at least a bucket of water.\n* [Continuous]: May make [Strike] and [Grab] Water Close Combat attacks at Level. Gain attributes of Water as well as [Water Breathing] and [Walk on Water]. [Pierce Resistance], [Slash Resisteance], [Fire Resistance], [Impact Vulnerable], [Heat Vulnerable], [Electric Vulnerable].",
                  ":titles",
                  "Liquifiy"
                ),
                "Water Spout",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Spout"
                ),
                "Water Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Walk",
                  ":summary",
                  "* Move on or under water as if it were solid ground of any desired slope."
                ),
                "Waters of Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waters of Life"
                ),
                "Watery Grave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Watery Grave"
                ),
                ":Wave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wave",
                  ":summary",
                  "Intensifies existing waves or creates new waves."
                ),
                "Wave Ride",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wave Ride"
                ),
                ":Whirlpool",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Whirlpool"
                ),
                "Wishing Well",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wishing Well"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Hydromancy",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hydromancy",
                  ":summary",
                  "* Hydro is the magical version of Water.\n* Hydro effects can be sustained without a source, but they can also be canceled by counter-magic.\n* Hydro reacts with Pyro to produce the [Vaporize] effect.\n* Hydro reacts with Cryo to produce the [Freeze] effect.\n* Hydro reacts with Geo to produce the [Quagmire] effect.\n* Hydro reacts with Electro to produce the [Electrocharged] effect.\n* Hydro reacts with Aero to produce the [Fog] effect."
                )
              )
            )
          )
        ),
        "Energy and Forces",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Energy and Forces",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Energy Manipulation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Energy Manipulation",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Control Energy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Energy",
                  ":summary",
                  "* [Reaction]: Redirect an energy effect to another target."
                ),
                "Energy Absorption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Energy Absorption"
                ),
                "Energy Drain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Energy Drain"
                ),
                "Energy Vampire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Energy Vampire"
                )
              )
            ),
            ":Dimensional",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Dimensional",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Faster than Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Faster than Light"
                ),
                ":Gate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gate"
                ),
                "Identify Dimension",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Identify Dimension",
                  ":summary",
                  "* Ability to gain knowledge of the current dimension or the home dimension of an object or being from another dimension."
                ),
                ":Teleport",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Teleport",
                  ":titles",
                  "Teleportation, Translocation"
                ),
                ":Warp",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Warp"
                ),
                ":Waypoint",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Waypoint"
                )
              )
            ),
            ":Explosive",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Explosive"
            ),
            ":Forces",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Forces",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Control Force",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Force",
                  ":summary",
                  "* [Reaction]: Redirect a force effect to another target."
                ),
                "Bands of Force",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bands of Force",
                  ":titles",
                  "Crimson Bands of Cyttorak"
                ),
                "Force Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Force Blast"
                ),
                "Force Break",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Force Break"
                ),
                "Force Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Force Wall"
                )
              )
            ),
            ":Gravity",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Gravity",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Call Anti-Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Anti-Gravity"
                ),
                "Call Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Gravity"
                ),
                "Control Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Gravity",
                  ":summary",
                  "* [Reaction]: Redirect a gravity effect to another target."
                ),
                "Gravity Field",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gravity Field"
                ),
                "Gravity Well",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gravity Well"
                )
              )
            ),
            ":Heat",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Heat",
              ":reference",
              "Heat Miser",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Heat Mirage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heat Mirage",
                  ":summary",
                  "* Create vague illusions in heated areas. The scale of the illusion is only limited by the size of the heated area."
                ),
                "Heat Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heat Vision",
                  ":summary",
                  "* May see heat.",
                  ":titles",
                  "Thermal Vision"
                ),
                ":Heatwave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heatwave"
                )
              )
            ),
            ":Inertia",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Inertia",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Impact Absorption",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Impact Absorption"
                ),
                "Inertial Dampening",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inertial Dampening"
                ),
                ":Unstoppable",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unstoppable"
                )
              )
            ),
            ":Light",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Light",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blinding Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blinding Light"
                ),
                "Call Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call Light"
                ),
                "Control Light",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Light",
                  ":summary",
                  "* [Reaction]: Redirect a light effect to another target."
                ),
                ":Flash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flash"
                ),
                ":Glow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Glow"
                ),
                ":Laser",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Laser"
                ),
                "Light Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Light Form"
                ),
                "Project Image",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Project Image"
                ),
                "Shine Down",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shine Down",
                  ":reference",
                  "* Raiden Shogun, Genshin Impact"
                ),
                "Solar Beam",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Solar Beam"
                )
              )
            ),
            ":Magnetism",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Magnetism",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Control Magnetism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Magnetism",
                  ":summary",
                  "* [Reaction]: Redirect a magnetic effect to another target."
                ),
                "Magnetic Field",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnetic Field"
                ),
                "Magnetic Pull",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnetic Pull"
                ),
                ":Magnetize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnetize"
                ),
                "Magnetic Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnetic Storm"
                )
              )
            ),
            ":Radiation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Radiation",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Fallout",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fallout"
                ),
                "Radiation Beam",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radiation Beam"
                ),
                "Radiation Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radiation Blast"
                )
              )
            ),
            ":Sound",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Sound",
              ":summary",
              "* Sonic attacks are a form of vibration/explosive attack that generaly does [Concussive Damage]. They also can cause temporary or permanent deafness.",
              ":titles",
              "Sonic",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Mimicry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mimicry",
                  ":summary",
                  "* Exactly duplicate sounds you have just heard or committed to memory.  At high levels, even modem communication can be duplicated."
                ),
                "Sonic Wave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sonic Wave"
                ),
                "Sound Carries",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sound Carries"
                )
              )
            ),
            ":Temporal",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Temporal",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Age Alteration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Age Alteration"
                ),
                "Control Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Control Time",
                  ":summary",
                  "* [Reaction]: Redirect a time effect to another target."
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
                "Temporal Tracking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Temporal Tracking",
                  ":summary",
                  "* Ability to track a time traveler to his/her destination."
                ),
                "Time Lapse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Lapse"
                ),
                "Time Loop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Loop"
                ),
                "Time Slow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Slow"
                ),
                "Time Stop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Stop",
                  ":summary",
                  "* Ability to briefly exit the normal timestream. This effectively freezes time for a few seconds. The user is can move freely, but nothing but air can be moved or harmed. Note that doors cannot be opened and air is thick to move through or breathe.",
                  ":titles",
                  "Freeze Time, Time Slip"
                )
              )
            ),
            ":Vibration",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Vibration",
              ":titles",
              "Tremors"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_enhancement_powers
   * @return {chapter}
   */
  static t_chapter_enhancement_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_enhancement_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_enhancement_powers
  }

  // (func chapter_enhancement_powers)
  static f_chapter_enhancement_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Enhancement Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Physical Enhancement",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Physical Enhancement"
        ),
        "Mental Enhancement",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mental Enhancement",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Genius",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Genius",
              ":titles",
              "Genius, Prodigy, Savant, Super Genius",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Analyze Weakness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Analyze Weakness"
                ),
                "Calculator Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Calculator Mind"
                ),
                "Engineering Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Engineering Genius"
                ),
                "Financial Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Financial Genius"
                ),
                "Investigative Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Investigative Genius"
                ),
                "Linguistic Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Linguistic Genius"
                ),
                "Mathematical Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mathematical Genius"
                ),
                ":Multitasking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Multitasking"
                ),
                "Photographic Memory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Photographic Memory"
                ),
                "Scientific Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scientific Genius"
                ),
                "Speed Reading",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speed Reading"
                ),
                "Tactical Genius",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tactical Genius"
                )
              )
            )
          )
        ),
        "Psychic Enhancement",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Psychic Enhancement",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Charm",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Charm",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Commanding Presense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Commanding Presense"
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
   * @function chapter_equipment_powers
   * @return {chapter}
   */
  static t_chapter_equipment_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_equipment_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_equipment_powers
  }

  // (func chapter_equipment_powers)
  static f_chapter_equipment_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Equipment Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Item Powers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Item Powers",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Quality Item",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Quality Item",
              ":summary",
              "* An item with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Fine Workmanship",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fine Workmanship",
                  ":summary",
                  "* This item possesses fine details that are particularly attractive to collectors."
                ),
                "Fire Resistant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire Resistant"
                ),
                "High Durability",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Durability",
                  ":summary",
                  "* This item is exceptionally well constructed and can withstand a suprising amount of punishment compared to a normal item of its type."
                )
              )
            ),
            "Quality Weapon",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Quality Weapon",
              ":summary",
              "* A weapon with this skill is of particularly high quality and possesses unusual abilities.\n* The level of quality effects the number of abilities as usual.\n* Each level of quality doubles the original price of the item.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Balanced for Throwing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Balanced for Throwing"
                )
              )
            )
          )
        ),
        "Vehicular Systems",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Vehicular Systems",
          ":summary",
          "** Atmospheric Engine\n** Sub-light Drive\n** FTL Drive\n\n* Science Lab w/Sensors\n* Air Locks\n** Magnetic Mooring Lines\n** Vacc Suits\n* Weapons Locker\n* Drop Chamber w/Drop Pods\n* Cloaking Device\n* Shields",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Hanger",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Hanger",
              ":summary",
              "* A special ability of vehicles to carry other vehicles.\n* A unit may carry 1 small unit (1 space) per space it takes up.\n* Action: Move 1 unit into or out of the hanger. The unit may not Move or take any Action the turn it moves into or out of the hanger.\n* Ship's Boat\n* Air Raft\n* Starfighter\n* Starbomber\n* Repair Drones\n* Mobile Armor",
              ":titles",
              "Vehicle Bay"
            ),
            "Mission Section",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mission Section",
              ":summary",
              "* Determine the total hull size and then divide it as desired by the following abilities.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Air Locks",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Locks"
                ),
                "Boarding Equipment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Boarding Equipment",
                  ":titles",
                  "Grapple Launchers, Magnetic Mooring Lines"
                ),
                "Cargo Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cargo Hold"
                ),
                "Catapult Launcher",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Catapult Launcher",
                  ":summary",
                  "*"
                ),
                "Catapult Hook Capture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Catapult Hook Capture"
                ),
                "Cloaking System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloaking System"
                ),
                "Cryogenic Chamber",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cryogenic Chamber",
                  ":summary",
                  "* Special ability of space craft to carry passengers in cryonic suspension."
                ),
                "Captain's Quarters",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Captain's Quarters"
                ),
                "Centrifuge Chamber",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Centrifuge Chamber"
                ),
                "Climbing Apparatus",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Climbing Apparatus"
                ),
                "Diving Wings",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Diving Wings",
                  ":summary",
                  "+1 when pulling out of a dive"
                ),
                "Easy to Modify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Easy to Modify"
                ),
                ":ECM",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "ECM",
                  ":titles",
                  "Electronic Countermeasures, Jamming"
                ),
                ":ECCM",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "ECCM",
                  ":titles",
                  "Electronic Counter-Countermeasures"
                ),
                "Ejection System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ejection System"
                ),
                "Escape Pods",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Escape Pods"
                ),
                ":Factory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Factory"
                ),
                "Fuel Scoop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fuel Scoop"
                ),
                ":Glider",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Glider",
                  ":summary",
                  "* Can glide without using power and may gain altitude when flying over hot air currents."
                ),
                "Gun Ports",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gun Ports",
                  ":summary",
                  "Allows crew to use small arms fire without sacrificing armor protection."
                ),
                "Missile Decoys",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Missile Decoys",
                  ":titles",
                  "Chaff Dispenser, Flares"
                ),
                "Launch Catapult",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Launch Catapult",
                  ":summary",
                  "* Launching vehicle may begin move at up to full speed without using fuel."
                ),
                "Living Quarters",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Living Quarters",
                  ":summary",
                  "* Long range and luxury vessels offer more than the minimum crew quarters. This includes private rooms, mess, recreation areas, etc.\n* The larger the living space, the higher quality clientele may be brought aboard and the longer the ships range before shore leave is needed.\n* Includes Mess and Lounges"
                ),
                "Luxury Facilities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Luxury Facilities"
                ),
                "Marine Ready Room",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marine Ready Room"
                ),
                "Marine Drop Pods",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Marine Drop Pods"
                ),
                "Medical Facilities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Medical Facilities",
                  ":titles",
                  "Sick Bay"
                ),
                ":Minelayer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Minelayer"
                ),
                ":Minesweeper",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Minesweeper"
                ),
                "Mining Facilities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mining Facilities"
                ),
                "Passenger Seating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Passenger Seating"
                ),
                "Prison Facilities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Prison Facilities",
                  ":titles",
                  "Brig"
                ),
                "Ram Plate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ram Plate"
                ),
                ":Refinery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Refinery"
                ),
                "Science Lab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Science Lab"
                ),
                "Atmospheric Sensors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Atmospheric Sensors"
                ),
                "Biological Sensors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biological Sensors"
                ),
                "Geological Sensors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geological Sensors"
                ),
                "Stealth Equipment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stealth Equipment"
                ),
                "Storm Chamber",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Storm Chamber",
                  ":summary",
                  "Specially shielded chamber designed to be a safe room for particularly dangerous events including radiation flares and decompression."
                ),
                "Tanker Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tanker Hold",
                  ":summary",
                  "The hold is equipped to hold large amounts of liquids or gases at appropriate environments.  This can be used for long range vessels to carry their own fuel or act as a fuel tanker."
                ),
                "Towing Capacity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Towing Capacity"
                ),
                "Training Facilities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Training Facilities"
                ),
                "Weapons Locker",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Weapons Locker"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Battleship",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Battleship",
                  ":summary",
                  "* A large (3 space) ship dedicated to being a battleship may carry a Spinal Mount weapon.\n* Spinal Mount"
                ),
                "Colony Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Colony Vessel",
                  ":summary",
                  "* Cryogenic Chamber"
                ),
                "Cargo Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Cargo Vessel",
                  ":summary",
                  "* Cargo Hold\n* Tanker Hold"
                ),
                "Factory Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Factory Vessel",
                  ":summary",
                  "* Factory\n* Refinery\n* Tanker Hold"
                ),
                "Heavy Bomber",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Heavy Bomber"
                ),
                "Heavy Carrier",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Heavy Carrier",
                  ":summary",
                  "* A large (3 space) ship dedicated to being a carrier can carry 1 extra unit (4 units) in its Hanger.\n* Hanger\n* Launch Catapult"
                ),
                "Luxury Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Luxury Vessel",
                  ":summary",
                  "* Living Quarters\n* Luxury Facilities"
                ),
                "Prison Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Prison Vessel"
                ),
                "Science Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Science Vessel",
                  ":summary",
                  "* Science Lab\n* Sensor Arrays"
                ),
                "Search and Rescue Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Search and Rescue Vessel",
                  ":summary",
                  "* Wide array of sensors\n* Multipurpse rescue vehicles\n* Heavy construction equipment\n* Emergency medical facilities\n* Space for evacuation and emergency supplies"
                ),
                "Stealth Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Stealth Vessel",
                  ":summary",
                  "* Cloaking Device\n* ECM\n* Stealth Equipment"
                ),
                "Transport Vessel",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Transport Vessel",
                  ":summary",
                  "* Living Quarters"
                )
              )
            ),
            "Electronic Systems",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Electronic Systems",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Analyze Target",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Analyze Target"
                ),
                "Detailed Scan",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Detailed Scan"
                ),
                "Electronic Countermeasures",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electronic Countermeasures"
                ),
                "Electronic Warfare",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electronic Warfare"
                ),
                "Haywire Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Haywire Resistance",
                  ":summary",
                  "* Resists the Haywire attack"
                ),
                "Laser Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Laser Link"
                ),
                "Locate Target",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Locate Target"
                ),
                "Navigation System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Navigation System"
                ),
                "Quantum Entanglement Comm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quantum Entanglement Comm",
                  ":summary",
                  "* A technique used to transfer quantum information from one quantum system to another over vast distances."
                ),
                "Radio Comm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radio Comm"
                ),
                "Radio Comm AM",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radio Comm AM"
                ),
                "Radio Comm CB",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radio Comm CB"
                ),
                "Radio Comm FM",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radio Comm FM"
                ),
                "Scan for Life",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scan for Life"
                ),
                "Scan for Weapons",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scan for Weapons"
                )
              )
            ),
            ":Engineering",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Engineering",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Damage Control Team",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Damage Control Team",
                  ":summary",
                  "A crack team conducts emergency repairs.\n* [Action]: Roll vs. [Damage].  Each [Hit] removes a [White Token].  Each [Critical Hit] removes a [Black Token]. These repairs last until the end of the battle."
                ),
                "Gas Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gas Engine"
                ),
                "Diesel Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Diesel Engine"
                ),
                "Flex Fuel Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flex Fuel Engine"
                ),
                "Electric Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electric Engine"
                ),
                "Fission Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fission Engine"
                ),
                "Fusion Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fusion Engine",
                  ":summary",
                  "* 'rockets point down' principle\n* Everything has a price. And the price of powerful rockets with nuclear propulsion is of course the dread horror of deadly atomic radiation. But the danger can be brought under control with appropriate\ncounter-measures, and by treating the power plant with the respect it deserves. And the same measures will come in handy if your ship may be facing hostile nuclear warheads."
                ),
                "Geared for Endurance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geared for Endurance",
                  ":summary",
                  "* Vehicle is designed for Endurance and can travel unusually long distances without resupply and is exceptionally rugged."
                ),
                "Geared for Power",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geared for Power",
                  ":summary",
                  "* Vehicle is designed for Power and can tow, lift, or push 50% more load than usual."
                ),
                "Geared for Speed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geared for Speed",
                  ":summary",
                  "* Vehicle is designed for Speed and can accelerate faster and can temporarily exceed normal speed rating."
                ),
                "Red Line",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Red Line",
                  ":summary",
                  "* Engineering can push any of the ships' systems for extra performance, but run the risk of significant damage.\n* [Action]: Roll vs. the target system. Any [Hits] increase that system by 1 for [Hits] turns. Each [Critical Hit] increases that system by a further 1. Negative [Hits] reduce that system by the [Hits] for [Hits] turns. For each system [Critical Hit], the system takes a [System Damage Token]."
                )
              )
            ),
            ":Factory",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Factory",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Gas Refinery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gas Refinery"
                ),
                "Oil Refinery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Oil Refinery"
                ),
                "Oil Rig",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Oil Rig"
                ),
                "Manufacturing Factory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manufacturing Factory"
                ),
                "Mining Rig",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mining Rig"
                ),
                "Pharmaceutical Manufacturing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pharmaceutical Manufacturing"
                ),
                "Aircraft Factory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Aircraft Factory"
                ),
                "Mobile Shipyard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mobile Shipyard"
                ),
                "Naval Shipyard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Naval Shipyard"
                ),
                "Spacecraft Shipyard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spacecraft Shipyard"
                ),
                "Starship Shipyard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Starship Shipyard"
                ),
                "Tank Factory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tank Factory"
                ),
                "Vehicle Factory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vehicle Factory"
                )
              )
            ),
            ":Laboratory",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Laboratory",
              ":summary",
              "Special labs for analyzing information. Science labs are very flexible and can be used for any number of quick analytics. Obviously, they are severly limited compared to proper research facilities.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Chemical Lab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chemical Lab"
                ),
                "Biological Lab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Biological Lab"
                ),
                "Geological Lab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Geological Lab"
                ),
                "Physics Lab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Physics Lab"
                ),
                "Sick Bay",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sick Bay"
                )
              )
            ),
            "Life Support",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Life Support",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Acceleration Dampening",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Acceleration Dampening"
                ),
                "Air Filtration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Filtration"
                ),
                "Artificial Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Artificial Gravity"
                ),
                "Ejection Systems",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ejection Systems"
                ),
                "Food Production",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Food Production"
                ),
                "Low Pressure Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Low Pressure Resistance"
                ),
                "High Pressure Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Pressure Resistance"
                ),
                "Radiation Shielding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radiation Shielding"
                ),
                "Heat Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heat Resistance"
                ),
                "Cold Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cold Resistance"
                ),
                "Storm Cellar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Storm Cellar",
                  ":summary",
                  "* The crew will occupy the cellar when the sun kicks up a solar storm of radiation. As these can last for days, one had better include a few crew-days worth of food, water, and tranquilizers. If you are relying upon algae for your oxygen, it deserves space in the storm cellar as well. This probably also applies to stored food too. Particle radiation can destroy a lot of the vitamins in food. Alas, computers and other digital electronics are also vulnerable to radiation. If there is a critical failure outside, thenit is time to start drawing straws to decide who gets to heroically commit suicide by saving the ship."
                ),
                "Water Filtration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Filtration"
                ),
                ":Watertight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Watertight"
                )
              )
            ),
            "Vehicle Abilities",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Vehicle Abilities",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Airlift Ready",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Airlift Ready",
                  ":summary",
                  "* Ability to be quickly picked up and dropped by [Airlift] vehicles without them landing."
                ),
                "Alarm System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Alarm System",
                  ":summary",
                  "* When armed, this defensive system will raise a warning whenever a person gets too close."
                ),
                "Anti-Personnel Charges",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anti-Personnel Charges",
                  ":summary",
                  "* When armed, this defensive system will automatically detonate whenever a person gets too close."
                ),
                "Artificial Intelligence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Artificial Intelligence"
                ),
                "Automated Combat System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Automated Combat System"
                ),
                ":Autopilot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Autopilot"
                ),
                "Camouflage Net",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Camouflage Net"
                ),
                "Catapult Hook",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Catapult Hook",
                  ":summary",
                  "* Can take off and land from carriers and gain the initial speed benefit of carrier catapults."
                ),
                ":Cloaking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloaking"
                ),
                "Crane Arm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crane Arm"
                ),
                "Ejection System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ejection System"
                ),
                "High Mobility",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Mobility",
                  ":summary",
                  "* Vehicles with this ability sacrifice overall speed for rapid turning. Movement systems are divided across the entire vehicle to maximize mobility, but this greatly reduces maximum speed.\n* -2 Speed, Unit may use Infantry movement rules."
                ),
                "Humanoid Form",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Humanoid Form"
                ),
                "Long Range Package",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Long Range Package"
                ),
                "Luxury Package",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Luxury Package"
                ),
                "Off-Road Package",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Off-Road Package"
                ),
                "Remote Controlled",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Remote Controlled"
                ),
                "Sport Package",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sport Package"
                ),
                "Stealth Technology",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stealth Technology",
                  ":summary",
                  "* Reduces detection by radar, heat and other similar vehicle detection systems."
                ),
                "Transformation System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transformation System",
                  ":summary",
                  "* Transformation allows a unit to switch into a different form. Each form must be designnated at creation time, and each form may have any or all of the units abilities. This is particularly useful for abilities that have penalties (e.g. High Mobility)."
                ),
                "Vector Movement",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vector Movement",
                  ":summary",
                  "* Movement in frictionless environments follow Newton's first law, a object in motion tends to stay in motion.\n* Units will continue at their current speed.\n* [Speed] can used to increase or decrease current speed.\n* [Speed] can also be used to sideslip left or right by 1 space.\n* Facing can be changed by one side each space moved, but this does not change speed or direction."
                ),
                "Active Camoflage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Active Camoflage"
                ),
                "Camo Netting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Camo Netting"
                ),
                "Cold Protection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cold Protection"
                ),
                "Desert Protection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Desert Protection"
                ),
                "Escape Pods",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Escape Pods"
                ),
                "Grapple Launcher",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grapple Launcher"
                ),
                "Manipulator Arm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manipulator Arm"
                ),
                "Landing Gear",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Landing Gear"
                ),
                "Ram Plate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ram Plate"
                ),
                ":Streamlining",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Streamlining"
                ),
                "Stealth System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stealth System"
                ),
                "Tool Arm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tool Arm"
                )
              )
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Weapon Bay",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Weapon Bay",
              ":summary",
              "* Main Turrets\n* Point Defense\n** Antiaircraft\n* Grenade Launcher\n* Laser\n* Mass Driver\n* Missiles\n** Micro-missiles\n** Mini-missiles\n** Heavy missiles\n* Particle Beam\n* Plasma Lance\n* Spinfuser\n* Taser\n* Payloads\n** Acid\n** Antimatter\n** Bioweaponry\n** Chemical\n** Explosive\n** Fusion\n** Incendiary\n** Nuclear\n** Nuclear Waste\n* Missile Bay\n* Torpedo Bay\n** Nuclear\n** Fusion\n** Antimatter\n** Planet Buster"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_godlike_powers
   * @return {chapter}
   */
  static t_chapter_godlike_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_godlike_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_godlike_powers
  }

  // (func chapter_godlike_powers)
  static f_chapter_godlike_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Godlike Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Primal Powers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Primal Powers",
          ":titles",
          "Primal Order",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Primal Force",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Primal Force",
              ":summary",
              "* Primal energy is the most fundamental energy in existence. It is, at once, physical, mental, and spiritual. As the fundamental energy of the cosmos, those that wield it have a special connection to reality and can gain control over certain aspects of reality.\n* Though Primal is not innately more powerful than other forces, it makes other abilities a great deal more effective.",
              ":titles",
              "Arch Demon, Arch Fiend, Celestials, Deity, Demigod, Divine Power, Galactus, Godling, Godly, Godlike, Greater Deity, Lesser Deity, Planeswalker, Power Cosmic, Supreme Deity",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Channel Worship",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Channel Worship",
                  ":reference",
                  "A god cannot survive as a memory. - Apollo, Star Trek - Who Mourns for Adonais?",
                  ":summary",
                  "* With this ability, the user may use the worship directed toward him, to recover [Primal]."
                ),
                "Create Artifact",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Create Artifact",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Create [Skill] worth of artifacts of any sort desired. These are free to maintain on any Plane the user created. They require an additional [Primal] per day when up to [Skill] Artifacts are on any other Plane."
                ),
                "Create Servitors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Create Servitors",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Create [Skill] worth of creatures of any sort desired. These are free to maintain on any Plane the user created. They require an additional [Primal] per day when up to [Skill] Servitors are on any other Plane. Such Servitors are usually fanatically loyal, though some users do not inspire loyalty."
                ),
                ":Planescaping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Planescaping",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Create a small Plane (pocket dimension) in the [Etherial Realm] that lasts up to [Level] days. This Plane has a radius of [Skill] x 100 miles.\n* [Action]: Sustain a previously created Plane for an additional [Level] days.\n* [Action]: Make a single alteration to a previously create Plane. This alteration may be anything that the user chooses, has a radius of [Skill] miles, and is permanent."
                ),
                "Primal Accuracy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Accuracy",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: The current [Attack] ignores target [Defense]. It may also be targetted to affect only one type of material."
                ),
                "Primal Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Armor",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: For this turn, gain [Armor] equal to [Skill] vs. any type of attack including [Primal Strike]."
                ),
                "Primal Avatar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Avatar"
                ),
                "Primal Awe",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Awe"
                ),
                "Primal Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Defense",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: For this turn, gain [Defense] equal to [Skill] vs. any type of attack including [Primal Accuracy]."
                ),
                "Primal Embodiment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Embodiment",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: For the next [Skill] turns, the user may use any ability through any willing target."
                ),
                "Primal Immortality",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Immortality",
                  ":summary",
                  "* [Passive]: User does not age, does not require food, water or air.  User is immune to disease, gases, non-acidic poisons."
                ),
                "Primal Immunity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Immunity",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: Enable survival in any environment for the next [Skill] days."
                ),
                "Primal Reach",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Reach",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: Another ability has unlimited [Range] with no penalty for distance.  This can even apply to [Melee] and [Close Combat]."
                ),
                "Primal Regeneration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Regeneration",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Immediately remove [Skill] damage tokens of any kind."
                ),
                "Primal Reincarnation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Reincarnation",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Return from the dead in a new form."
                ),
                "Primal Resurrection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Resurrection",
                  ":reference",
                  "* Hmm, my heroic last stands never seem to stick. - Jax, Runeterra",
                  ":summary",
                  "* [Requires]: Spend all [Primal]\n* [Action]: Return from the dead."
                ),
                "Primal Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Sense",
                  ":summary",
                  "* [Action]: Detect any being with [Primal] or [Primal] used within the area within the last [Skill] days."
                ),
                "Primal Strength",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Strength",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: Perform any feat of strength."
                ),
                "Primal Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Strike",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Free]: The current [Attack] ignores target [Armor]."
                ),
                "Primal Transfer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Transfer",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: Target gains a [Primal]."
                ),
                "Primal Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Primal Vision",
                  ":summary",
                  "* [Requires]: Spend a [Primal]\n* [Action]: View any area that is known or the area that a known person occupies."
                ),
                "Soul Binding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Soul Binding",
                  ":summary",
                  "* Capture a soul that has become separated from its body. This soul can be willing or unwilling.  It can then be bound to a body or other form on a Plane created by the user."
                ),
                "Sphere of Control",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sphere of Control",
                  ":summary",
                  "* Sphere of control is an idea, activity, or philosophy with which the user is strongly associated.\n* Developing a Sphere of Control is difficult, but allows the user to have far reaching powers whenever the Sphere is present. This benefits both the user and his followers."
                )
              )
            )
          )
        ),
        ":Projectiles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Projectiles",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Ropes",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Ropes",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Entanglement",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Entanglement",
                  ":summary",
                  "Reduces Movement",
                  ":titles",
                  "Tanglers"
                ),
                "Line Swinging",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Line Swinging",
                  ":titles",
                  "Web Swinging"
                )
              )
            )
          )
        ),
        ":Miscellaneous",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Miscellaneous",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Computer Control",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Computer Control",
              ":summary",
              "Gives ability to control computers like Computer Science."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_mental_powers_and_weaknesses
   * @return {chapter}
   */
  static t_chapter_mental_powers_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_mental_powers_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses
  }

  // (func chapter_mental_powers_and_weaknesses)
  static f_chapter_mental_powers_and_weaknesses() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Mental Powers and Weaknesses",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Mental Powers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mental Powers",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Domination",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Domination",
              ":reference",
              "* We don't need no education.  We don't need no thought control. - Pink Floyd, The Wall\n* He accepted everything. The past was alterable. The past had never been altered. Oceania was at war with Eastasia. Oceania had always been at war with Eastasia. Jones, Aaronson, and Rutherford were guilty of the crimes they were charged with. He had never seen the photograph that disproved their guilt. It had never existed; he had invented it. He remembered remembering contradictory things, but those were false memories, products of self deception. How easy it all was! - 1984\n* Every move you make, every vow you break, every smile you fake, every claim you stake, I'll be watching you. Every single day... - Every Breath You Take, The Police\n* Your face will turn to alabaster. When you find your servant is your master. You'll be wrapped around my finger. - Wrapped around your Finger, The Police\n* I know this steak doesn't exist. I know that when I put it in my mouth, the Matrix is telling my brain that it is juicy and delicious. After nine years, you know what I realize? Ignorance is bliss. - Cypher, The Matrix",
              ":titles",
              "Dominator, Master, Puppet Master, Puppeteer",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Brainwashing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brainwashing"
                ),
                ":Conditioning",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conditioning",
                  ":reference",
                  "Manchurian Candidate",
                  ":summary",
                  "* Low level success creates a confused zombie.\n* High level success creates fanatical loyalty."
                ),
                "Edit Memories",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Edit Memories"
                ),
                ":Indoctrination",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Indoctrination",
                  ":summary",
                  "Slowly convert a subject into a willing servant."
                ),
                "Induce Delusions",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Induce Delusions",
                  ":summary",
                  "Create paranoid delusions in the target."
                ),
                "Past Life Regression",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Past Life Regression"
                ),
                "Private World",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Private World",
                  ":summary",
                  "Create a specific dream world that the subject believes is real."
                ),
                "Retrive Memories",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Retrive Memories"
                ),
                "Subconscious Trigger",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subconscious Trigger"
                ),
                ":Subjugation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subjugation"
                ),
                "Subliminal Messaging",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subliminal Messaging"
                ),
                ":Suggestion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Suggestion",
                  ":summary",
                  "Change"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Hypnotism",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hypnotism",
                  ":summary",
                  "* [Past Life Regression]\n* [Retrive Memories]\n* [Subconscious Trigger]"
                )
              )
            ),
            ":Empathy",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Empathy",
              ":summary",
              "The ability to feel the joys and pains of others",
              ":titles",
              "Empath",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Change of Heart",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Change of Heart"
                ),
                ":Compulsion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Compulsion"
                ),
                "Cure Insanity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cure Insanity"
                ),
                ":Demoralize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Demoralize"
                ),
                ":Depression",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Depression"
                ),
                ":Despair",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Despair"
                ),
                "Ego Crush",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ego Crush",
                  ":summary",
                  "* Reduce the [Spirit] of the target to make them more ... pliable."
                ),
                "Empathic Bond",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Empathic Bond",
                  ":summary",
                  "* Create a permanent empathic connection with a single target with an already established deep connection (typically lovers or longtime friends). Each senses the other's strong feelings over any distance. No effort is required to maintain the bond, but only one such bond can be maintained at a time."
                ),
                "Empathic Healing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Empathic Healing",
                  ":reference",
                  "* The Empath - Star Trek",
                  ":summary",
                  "* Feel the pain the target is experiencing. Slowly duplicate all the damage from a target onto yourself and then begin healing.\n* Continuous. Each turn, duplicate 1 damage or negative condition from the target onto yourself. Once all have been duplicated, instead remove a damage or condition from the target."
                ),
                "Empathic Link",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Empathic Link",
                  ":summary",
                  "* Create an empathic connection with a target. Each senses the other's honest feelings. This ability creates trust if the parties are being honest, or mistrust if the parties are false.",
                  ":titles",
                  "Telesthesia"
                ),
                "Empathic Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Empathic Sense",
                  ":summary",
                  "* Sense nearby sentient creatures by their emotions. A general sense of the emotions can be determined as well."
                ),
                ":Enrage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enrage"
                ),
                ":Enrapture",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enrapture",
                  ":titles",
                  "Rapture"
                ),
                ":Enthrall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enthrall"
                ),
                "Fear Eater",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fear Eater",
                  ":summary",
                  "* Remove a [Fear] from the target and gain [Spirit]."
                ),
                ":Guilt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Guilt"
                ),
                "Heal Mental Trauma",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Heal Mental Trauma"
                ),
                "Lie Detector",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lie Detector"
                ),
                ":Nostalgia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nostalgia"
                ),
                ":Obsession",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Obsession"
                ),
                "Project Pain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Project Pain",
                  ":summary",
                  "* Relive a past (or current) trauma and project those feelings on a target. If you have more than 1 damage you may move 1 to the target. If you have more than 1 negative condition, you may move 1 negative condition to the target.",
                  ":titles",
                  "Pain Shared is a Pain Doubled"
                ),
                "Share Pain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Share Pain",
                  ":reference",
                  "* Your pain runs deep. ... Share your pain with me... and gain strength from the sharing. - Sybok, Star Trek V: The Final Frontier",
                  ":summary",
                  "* Feel the pain the target is experiencing and create trust through the shared experience.",
                  ":titles",
                  "Pain Shared is Pain Halved"
                ),
                ":Sympathy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sympathy"
                ),
                ":Terrify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Terrify"
                )
              )
            ),
            ":Illusion",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Illusion",
              ":reference",
              "* Fantasy... can only survive with an underlying reality. Reality... is the stillness buried deep beneath the illusion. This is eternity. - Raiden Shogun, Genshin Impact",
              ":summary",
              "* Illusion is the art of fooling the target into believing in something that is not really there. Illusion is Limited by [Art].\n* Illusions\n** Alter the perceptions to see and hear things that do not exist.\n** Skill roll determines the difficulty to detect the illusion, but even those who detect the illusion cannot see through the illusion including the caster.\n** Illusions may be enormous, altering terrain and populating it with any number of creatures.\n** Illusions may cover real things, but cannot make them disappear.\n** Illusions may not do damage or take damage since they are not really there.\n** Note: unliving creatures cannot detect or be influenced by illusions.\n* Phantasms\n** Phantasmal objects appear real, but are only partially real and are destroyed with a single [Damage Token].\n** All [Phantasm]s are moved independently each time the unit Moves.  All [Phantasm]s perform the same actions as the unit but no effect. When [Phantasm]s are attacked they take effects normally but are uneffected by effects except [Damage] which immediately destroys them.",
              ":titles",
              "Illusionist",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Conjure Effigy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conjure Effigy",
                  ":summary",
                  "* Create a phantasmal copy of an object touched. The Effigy appears real in most ways, but does not\nfunction as the original and will shatter to dust if force is applied to it."
                ),
                "Conjure Phantasmal Force",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conjure Phantasmal Force",
                  ":summary",
                  "Conjures a phantasmal minion."
                ),
                "Conjure Phantom Monster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conjure Phantom Monster"
                ),
                "Conjure Simulacrum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Conjure Simulacrum"
                ),
                "Dazzling Beauty",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dazzling Beauty",
                  ":summary",
                  "Raises the appearance of the caster."
                ),
                "Disembodied Voice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disembodied Voice"
                ),
                ":Forgetfulness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forgetfulness",
                  ":summary",
                  "* Roll vs. Spirit. Target forgets a specific fact or time period."
                ),
                ":Foxfire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Foxfire"
                ),
                "Hidden Thing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hidden Thing",
                  ":summary",
                  "* A Phantasm may be placed on other objects making them partially or completely invisible."
                ),
                "Hypnotic Eyes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hypnotic Eyes",
                  ":summary",
                  "Criticals: [Fascination]"
                ),
                "Illusion Shattered",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Illusion Shattered",
                  ":reference",
                  "* Raiden Shogun, Genshin Impact"
                ),
                "Illusionary Meal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Illusionary Meal",
                  ":summary",
                  "* Creates a tasty meal out of other less appetizing things. The meal appears and tastes anyway the user wishes. The meal serves level squared human sized persons. The original ingredients may be unpleasant but cannot be harmful."
                ),
                "Illusionary Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Illusionary Wall",
                  ":summary",
                  "* Appears to be a real wall of any sort including magical ones, but has no real effect except to obscure or block line of sight."
                ),
                "Mental Block",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Block",
                  ":summary",
                  "* Roll vs. Spirit. Target becomes confused and forgets how to a chosen power for Hits Turns."
                ),
                ":Mirage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirage",
                  ":summary",
                  "Also known as Illusionary Terrain."
                ),
                "Mirror of the Soul",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror of the Soul",
                  ":summary",
                  "* A person's true nature can be ascertained by looking in his or her eyes."
                ),
                "Mirror Image",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror Image",
                  ":summary",
                  "* [Mind]: Replace the unit with a [Phantasm] and place 1+Criticals additional [Phantasm]s 1 space\nfrom the unit.  Secretly mark one of these [Phantasm]s as the unit. When all other Mirror Images\nare destroyed, replace the final [Phantasm] with the unit."
                ),
                "Mistaken Identity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mistaken Identity",
                  ":summary",
                  "* [Action]: Choose a willing unit of roughly equal size and switch places with that unit.\n* Range: [Mind]"
                ),
                "Phantom Pain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phantom Pain"
                ),
                "Phantom Smell",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phantom Smell"
                ),
                "Phantom Sound",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phantom Sound"
                ),
                "Phantom Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phantom Weapon"
                ),
                "Shattered Image",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shattered Image",
                  ":summary",
                  "* [Mind]: Destroy any number of [Illusion]s to cause [Stun] and [Confusion] to targets in the area.",
                  ":titles",
                  "Broken Mirror"
                ),
                ":Shimmer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shimmer"
                ),
                ":Simulacrum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Simulacrum"
                ),
                "Sleight of Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sleight of Mind",
                  ":summary",
                  "* [Slow] [Even] [Mind]: +1 [Stress]. Create a distraction."
                ),
                "Smoke and Mirrors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smoke and Mirrors"
                ),
                "Taste of Ambrosia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Taste of Ambrosia"
                ),
                "Taste of Ashes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Taste of Ashes"
                ),
                ":Vertigo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vertigo"
                )
              )
            ),
            ":Intuition",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Intuition",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Danger Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Danger Sense",
                  ":summary",
                  "* [Event]: Chance to detect a surprise attack."
                ),
                "Deja Vu",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deja Vu",
                  ":summary",
                  "* [Event]: Chance to recognize a series of events as if they had happened before. This\ngives insight into how these events might play out."
                ),
                ":Insight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Insight",
                  ":summary",
                  "* [Action]: Synergy with a [Mind] ability."
                ),
                "Instinctive Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Instinctive Defense",
                  ":summary",
                  "* [Passive]: Synergy with Defense Rolls."
                ),
                "Paranormal Memory",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paranormal Memory",
                  ":summary",
                  "* [Action]: Attempt to remember events that happened in an\nalternate timeline or universe."
                ),
                ":Psychometry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psychometry",
                  ":summary",
                  "Obtain information about an individual by making physical contact with an\nobject that belongs to them.\n* [Action]: Attempt to remember events associated with an object."
                )
              )
            ),
            ":Mastermind",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mastermind",
              ":summary",
              "* Attempts to confuse by introducing misleading, paradoxical, or spurious logic into a discussion.",
              ":titles",
              "Mind Games",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Circular Logic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Circular Logic",
                  ":reference",
                  "* If such actions were not illegal, then they would not be prohibited by the law.",
                  ":summary",
                  "* A seemingly reasonable argument that is in fact based upon dependent information.\n* Such arguments are logically valid. That is, the conclusion does in fact follow from the premise, since it is already contained in the premise. They do not, however, aid in the proof of the statement or the premise."
                ),
                ":Compartmentalize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Compartmentalize",
                  ":summary",
                  "* Separate a hidden thought process away from the normal mind."
                ),
                ":Cryptography",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cryptography"
                ),
                ":Doublethink",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Doublethink",
                  ":reference",
                  "* To tell deliberate lies while genuinely believing in them, to forget any fact that has become inconvenient, and then, when it becomes necessary again, to draw it back from oblivion for just so long as it is needed. - 1984 George Orwell",
                  ":summary",
                  "* Doublethink is the act of simultaneously holding two mutually contradictory beliefs while fervently fooling oneself into believing both."
                ),
                "Master Plan",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Master Plan"
                ),
                "Maze of the Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Maze of the Mind",
                  ":summary",
                  "* Confuses the target's senses so it cannot accurately choose its direction. This can be extremely hazardous to fast moving units.\n* [Move]: Whenever the unit moves, its direction is randomized from among its normal movement options (including diving and climbing for air units)."
                ),
                "Maze Mastery",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Maze Mastery",
                  ":summary",
                  "* The user knows thousands of mazes and can choose an optimal course through any maze with minimal trial and error."
                ),
                "Mind Blank",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind Blank",
                  ":summary",
                  "* Hide ones true thoughts.\n* Makes an excellent poker face.\n* Full defense against any attempt to detect the unit's mind.\n* Full defense against any attempt to detect lies."
                ),
                ":Misinformation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Misinformation",
                  ":summary",
                  "* Spock: Logic is a little tweeting bird chirping in a meadow. Logic is a wreath of pretty flowers which smell BAD. Are you sure your circuits are functioning correctly? Your ears are green. - I, Mudd, Star Trek"
                ),
                ":Puzzles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Puzzles"
                ),
                ":Rationalize",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rationalize",
                  ":summary",
                  "* Increases resistance to all forms of mental attack by reinterpreting and rationalizing commands to render them meaningless."
                ),
                "Simplify, Simplify, Simplify",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Simplify, Simplify, Simplify",
                  ":summary",
                  "* Progressively breakdown a problem into simpler problems which can each be resolved separately."
                ),
                "Unsolvable Problem",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unsolvable Problem",
                  ":reference",
                  "* Kirk: Everything Harry says is a lie. Remember that, Norman. *Everything* he says is a lie.\n* Mudd: Now I want you to listen to me very carefully, Norman. I'm... lying.\n* Norman: You say you are lying, but if everything you say is a lie, then you are telling the truth, but you cannot tell the truth because you always lie... illogical! Illogical - I, Mudd, Star Trek",
                  ":summary",
                  "* Fool the target into trying to resolve a problem with no easy solution."
                )
              )
            ),
            ":Madness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Madness",
              ":titles",
              "Lunatic, Madman, Manic",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Delirium",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Delirium"
                ),
                ":Delusions",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Delusions"
                ),
                ":Dementia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dementia"
                ),
                "False Memories",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "False Memories",
                  ":summary",
                  "* Alter the memories of the target."
                ),
                ":Hyteria",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyteria"
                ),
                "Induce Paranoia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Induce Paranoia"
                ),
                "Mind Twist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind Twist"
                ),
                "Through the Looking Glass",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Through the Looking Glass",
                  ":reference",
                  "* I'm sorry to tell you this, but you've suffered a schizoid embolism. We can't snap you out of your fantasy... and I've been sent in to try to talk you down. - Total Recall"
                ),
                ":Tripping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tripping"
                ),
                "Twisted Words",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Twisted Words",
                  ":summary",
                  "* This subtle power is a sort of malicious therapy, and it requires nothing more than casual conversation. Its influence is hidden by inflections and suggestions. The victim finds themselves increasing agitated as their inner demons bubble to the surface. This can lead to confusion, a panic attack, nervous breakdown or even a psychotic break."
                ),
                "Warped Image",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Warped Image",
                  ":summary",
                  "* Share your own derangements with the target. This also rouses the Shadow."
                ),
                "Wave of Madness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wave of Madness"
                )
              )
            ),
            "Mental Fortitude",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mental Fortitude",
              ":stat",
              "Mind, Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Gestalt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gestalt",
                  ":reference",
                  "The whole is greater than the sum of its parts - Gestalt Psychology",
                  ":summary",
                  "* This ability allows a unit to share knowledge with another unit that also has [Gestalt]. They may give information or loan an ability to the target.",
                  ":titles",
                  "Hive Mind"
                ),
                "Intellect Fortress",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intellect Fortress",
                  ":summary",
                  "Ward"
                ),
                ":Concentration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Concentration",
                  ":summary",
                  "* [Buff Self]: Place X Concentration Tokens on the user, and place 1 negative token under each Concentration token. Covered tokens are treated as if they do not exist while covered."
                ),
                "Mirror Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mirror Mind",
                  ":summary",
                  "Mental defense that creates Feedback."
                ),
                "Peace of Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Peace of Mind",
                  ":summary",
                  "Find the Quiet Place in your mind"
                ),
                "Tower of Iron Will",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tower of Iron Will",
                  ":summary",
                  "Ward"
                )
              )
            ),
            "Mind Over Matter",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mind Over Matter",
              ":titles",
              "Telekinesis, Psychokinesis",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Invisible Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Invisible Hand",
                  ":summary",
                  "* Lift items from a distance."
                ),
                ":Levitate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Levitate",
                  ":summary",
                  "* Lift oneself off the ground."
                ),
                "Mind Crush",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind Crush",
                  ":summary",
                  "* Hold an object in place and crush it."
                ),
                "Telekinetic Manipulation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Manipulation",
                  ":summary",
                  "* Perform delicate manipulation on items from a distance. An example would be to perform lock picking over distance."
                ),
                "Telekinetic Projectile",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Projectile",
                  ":summary",
                  "* Throw a small object at high speed."
                ),
                "Telekinetic Push",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Push",
                  ":summary",
                  "* Push items from a distance."
                ),
                "Telekinetic Shield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Shield"
                ),
                "Telekinetic Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Strike",
                  ":summary",
                  "* Attack unit from a distance."
                ),
                "Telekinetic Touch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telekinetic Touch",
                  ":summary",
                  "* Feel items from a distance."
                )
              )
            ),
            "Mental Combat",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mental Combat",
              ":titles",
              "Psionic, Scanner",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Brain Drain",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brain Drain"
                ),
                "Brain Freeze",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brain Freeze"
                ),
                "Brain Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brain Storm"
                ),
                "Ego Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ego Whip",
                  ":summary",
                  "* Attack with [Mind] vs. [Spirit]."
                ),
                ":Feeblemind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feeblemind"
                ),
                "Feedback Loop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feedback Loop"
                ),
                ":Lobotomy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lobotomy"
                ),
                "Mental Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Blast",
                  ":summary",
                  "Attacks Mind.  All tokens are stun."
                ),
                "Mental Prison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Prison",
                  ":summary",
                  "* Trap a person's personality in a prison within their own mind.",
                  ":titles",
                  "Mind Prison, Prison of the Mind"
                ),
                "Summon Id Monster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Summon Id Monster",
                  ":summary",
                  "[Call] [Id Monster]"
                ),
                "Tabula Rasa",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tabula Rasa"
                )
              )
            ),
            "Mental Connection",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mental Connection",
              ":reference",
              "Scanners",
              ":titles",
              "Esper, Mentalist, Psionic, Scanner, Telepath",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Cloud Senses",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cloud Senses",
                  ":reference",
                  "These aren't the droids you're looking for... - Obi-Wan Kenobi, Star Wars",
                  ":summary",
                  "Reduce chance that target will notice things."
                ),
                ":Confusion",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Confusion"
                ),
                ":Lingua-Franca",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lingua-Franca",
                  ":summary",
                  "Synergy with [Linguistics]"
                ),
                "Memory Lapse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Memory Lapse"
                ),
                "Memory Restoration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Memory Restoration",
                  ":summary",
                  "* Retrieve lost memories from a subject."
                ),
                "Mental Bond",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Bond"
                ),
                "Mental Cloak",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Cloak",
                  ":summary",
                  "All living units must roll Mind vs Mental Cloak to target this unit.  Another target may not be chosen."
                ),
                "Mental Probe",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Probe",
                  ":summary",
                  "Delve deeper into targets memories each turn.",
                  ":titles",
                  "Mind Probe"
                ),
                "Mental Projection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Projection"
                ),
                "Mind Reading",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind Reading",
                  ":summary",
                  "Owner of target unit must announce the next Hits movements and actions that unit will perform.  That unit must perform those actions if it is able."
                ),
                "Mind's Eye",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind's Eye",
                  ":summary",
                  "* Eye - The caster can close his eyes and see into the astral world instead of the real world."
                ),
                "Store Consciousness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Store Consciousness",
                  ":summary",
                  "* [Action]: At the moment of another unit's death, capture its spirit within one's own mind.\n* [Action]: If the dead unit's body can somehow be restored (or a perfect duplicate can be found), transfer the captured spirit back into the body."
                ),
                ":Telepathy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telepathy",
                  ":summary",
                  "Unit owner may have up to a Hits minute secret conversation with anyone (Player or not, strategy or not). Clock starts once roll is made."
                ),
                "Transfer Consciousness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Transfer Consciousness",
                  ":reference",
                  "* Change Now! - Captain Jinyu, Dragonball Z",
                  ":titles",
                  "Body Swap"
                )
              )
            ),
            "Mental Weakness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Mental Weakness",
              ":summary",
              "* Note: Mental Weaknesses may be physical in nature, but they are grouped here because they effect mental function.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Addle Minded",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Addle Minded",
                  ":summary",
                  "* Tendency to forget to do things or misplace things.  The missed things may be trival, important, or critical.",
                  ":titles",
                  "Absent Minded, Addle Minded, Airhead"
                ),
                ":Addiction",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Addiction"
                ),
                "Alien Thoughts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Alien Thoughts"
                ),
                ":Amnesia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Amnesia",
                  ":reference",
                  "* Memento",
                  ":summary",
                  "* Unit has strange lapses of memory. It may forget generally known facts, friends, family, or own identity."
                ),
                ":Anxious",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anxious"
                ),
                ":Bipolar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bipolar",
                  ":summary",
                  "* Prone to fits of erratic up moods and severe depression. May be moody, lie around and mope, risk life and limb, or even suicidal.",
                  ":titles",
                  "Manic Depressive"
                ),
                ":Bloodthirsty",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bloodthirsty",
                  ":summary",
                  "* Must attack Bleeding Enemies first. May attack Bleeding Allies if a Spirit roll fails."
                ),
                ":Brainwashed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brainwashed"
                ),
                ":Catatonia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Catatonia"
                ),
                "Compulsive Liar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Compulsive Liar"
                ),
                ":Cleptomania",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cleptomania"
                ),
                ":Cyberpsychosis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cyberpsychosis",
                  ":reference",
                  "* Something happens when you start to add metal and plastic to people. They start to change. And it isn't pretty - Cyberpunk RPG",
                  ":summary",
                  "* A psychotic aberration suffered by excessive users of cyberware. It begins as a sense of loss for the portions of the body replaced with unfeeling machinery. Later it manifests as a Overconfidence and detachment from other people (sometimes in favor of machines). Extreme cases lead to more serious derangements such as: Martyr Syndrome, Megalomania, Delusions of Grandear, Inferiority Complex, and Messiah Complex."
                ),
                ":Delusional",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Delusional",
                  ":reference",
                  "* The walls of reality will come crashing down. One minute you'll be the savior of the rebel cause.  The next thing you know you'll be Cohagen's busom buddy. You'll even have fantasies of alien civilizations, as you requested, but in the end, back on Earth, you'll be lobotomized! - Dr. Edgemar, Total Recall",
                  ":summary",
                  "* Believe things that are not real.  May hear voices or see things.",
                  ":titles",
                  "Free-form Delusion, Schizoid Embelism"
                ),
                ":Flashbacks",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flashbacks"
                ),
                ":Frightened",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Frightened",
                  ":summary",
                  "* Lacks nerve, especially in combat.  May freeze or flee.",
                  ":titles",
                  "Cowardly"
                ),
                ":Hallucinations",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hallucinations"
                ),
                ":Homicidal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Homicidal"
                ),
                "Inferiority Complex",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Inferiority Complex"
                ),
                ":Intolerant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intolerant"
                ),
                ":Manic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Manic"
                ),
                "Martyr Syndrome",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Martyr Syndrome"
                ),
                ":Masochism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Masochism",
                  ":summary",
                  "* Dislikes self. Will go out of way to injure oneself. May seek verbal, physical, psychological, or sexual abuse. May seek life threatening abuse."
                ),
                ":Megalomania",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Megalomania",
                  ":summary",
                  "* A specific form of delusion that you are more important than you are. May believe you are destined for greatness, a Messiah, or even God.",
                  ":titles",
                  "Delusions of Grandeur, Messiah Complex"
                ),
                "Mental Decay",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Decay",
                  ":titles",
                  "Alzheimers"
                ),
                "Multiple Personalities",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Multiple Personalities",
                  ":reference",
                  "Sybil",
                  ":summary",
                  "* More than one distinct personality. Personalities may change under stress or randomly.  Personalities may like, dislike, or be oblivious to each other. Some may be dangerous to self or others."
                ),
                ":Narssicist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Narssicist"
                ),
                ":Nightmares",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nightmares"
                ),
                ":Obsessed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Obsessed",
                  ":summary",
                  "* Focused on a single person or object and will talk about it all the time. May risk embarrassment, financial loss, or bodily harm to pursue it."
                ),
                "Obsessive Compulsive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Obsessive Compulsive",
                  ":summary",
                  "* Compulsively performs trivial activities.",
                  ":titles",
                  "OCD"
                ),
                ":Overcompensating",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overcompensating",
                  ":summary",
                  "* Constantly attempt to draw attention away from preceived flaw."
                ),
                ":Overconfidence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overconfidence"
                ),
                ":Paranoia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paranoia",
                  ":reference",
                  "Just because you're paranoid doesn't mean they aren't after you. - Catch 22",
                  ":summary",
                  "* Belief that enemies are everywhere. May rant endlessly about the conspiracy, compulsively work on defenses, risk everything to stop them."
                ),
                ":Phobia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phobia",
                  ":summary",
                  "* Unreasoning fear of some common thing. Fear of dogs, heights, sounds, or colors. May feel discomfort, paralyzing fear, beserk fear, or catatonia."
                ),
                "Post Traumatic Stress Disorder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Post Traumatic Stress Disorder"
                ),
                ":Pyromania",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pyromania"
                ),
                ":Robophobia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Robophobia",
                  ":reference",
                  "* Uncanny Valley - The theory that as a robot is made more humanlike in its appearance and motion, the emotional response from a human being to the robot will become increasingly positive, until a point is reached beyond which the response quickly becomes that of strong revulsion. However, as the appearance and motion continue to become less distinguishable from a human being, the emotional response becomes positive once more.\n* This area of repulsive response aroused by a robot with appearance and motion between a 'barely human' and 'fully human' entity is called the uncanny valley. The name captures the idea that a robot which is 'almost human' will seem overly strange and corpselike.\n* Not robots...walking dead.  They pretend we control them...but really... - Doctor Who, The Robots of Death\n* The name 'Grimwade's Syndrome' was an in-joke reference to production assistant Peter Grimwade who had bemoaned the fact that the stories on which he was assigned to work almost always involved robots. - Doctor Who, The Robots of Death",
                  ":summary",
                  "* Fear of Robots",
                  ":titles",
                  "Grimwade's Syndrome, Uncanny Valley"
                ),
                "Refuses to Kill",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Refuses to Kill"
                ),
                ":Sadistic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sadistic"
                ),
                "Sex Crazed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sex Crazed",
                  ":titles",
                  "Cassonova, Heartbreaker, Lady Killer, Libertine, Lothario, Romeo, Sex Addict"
                ),
                ":Shy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shy",
                  ":summary",
                  "* Hate dealing with others.  Avoid interactions with new people.  May need to retreat from others."
                ),
                ":Sociopath",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sociopath"
                ),
                ":Stubborn",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stubborn",
                  ":summary",
                  "* Will not give in or compromise.  May risk embarrassment, financial loss, or injury to prove you're right."
                ),
                ":Tempermental",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tempermental",
                  ":reference",
                  "* What do we have? Sea Bass. Riiiight? They are mutated Sea Bass. Really. Are they ill-tempered.  Absolutely. Well that's a start. - Dr. Evil and Number 2 - Austin Powers",
                  ":summary",
                  "* Constantly irritable. When temper flares will risk embarrassment, financial loss, incarceration, or life and limb.",
                  ":titles",
                  "Bad Tempered, Hot Tempered"
                ),
                "Unreasoning Hatred",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unreasoning Hatred"
                ),
                ":Vengeful",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vengeful"
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
   * @function chapter_movement_powers
   * @return {chapter}
   */
  static t_chapter_movement_powers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_movement_powers = {
    vx_type: nx_tactics_books_powers.t_chapter_movement_powers
  }

  // (func chapter_movement_powers)
  static f_chapter_movement_powers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Movement Powers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Travel",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Travel",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Flight",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Flight",
              ":image",
              "Rules/Images/MoveFlight.png",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Afterburner",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Afterburner"
                ),
                "Air Droppable",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Droppable"
                ),
                ":Airlift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Airlift",
                  ":summary",
                  "* Ability to pick up and drop cargo or [Airlift Ready] vehicles without landing."
                ),
                ":Atmospheric",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Atmospheric"
                ),
                "Diving Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Diving Attack"
                ),
                ":Glide",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Glide",
                  ":titles",
                  "Glider, Parachute"
                ),
                ":Levitate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Levitate",
                  ":summary",
                  "* Levitate is a slow form of movement with a maximum speed of just half a normal Move. Levitating is very stable, silent, can move in any direction, and requires no concentration. Levitating causes no noise or movement related penalties and can avoid most terrain penalties as well."
                ),
                "Lighter Than Air",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lighter Than Air"
                ),
                "Nape of Earth Flight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nape of Earth Flight"
                ),
                ":Orbital",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Orbital"
                ),
                "Reentry System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reentry System",
                  ":summary",
                  "* A heat shield (either inflatable or built in) for atmospheric reentry.",
                  ":titles",
                  "Ballute"
                ),
                "Rocket Engine",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rocket Engine"
                ),
                "Stratospheric Flight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stratospheric Flight"
                ),
                "Supersonic Flight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Supersonic Flight"
                ),
                "Trans-atmospheric Flight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trans-atmospheric Flight"
                ),
                ":VTOL",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "VTOL",
                  ":summary",
                  "* Hovering units may [Move] backwards.\n* Hovering units may use [Vector Movement] rule."
                )
              )
            ),
            "Ground Movement",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Ground Movement",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":2-Legged",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "2-Legged"
                ),
                ":3-Legged",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "3-Legged"
                ),
                ":4-Legged",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "4-Legged"
                ),
                ":6-Legged",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "6-Legged"
                ),
                ":8-Legged",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "8-Legged"
                ),
                ":Hover",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hover",
                  ":summary",
                  "* Hovering allows full movement speed over any flat terrain without actually touching the surface. Ground, Water, Sand, Ice, generally cause no penalty, but turning is difficult and imprecise especially at high speeds.\n* Hovering units may [Move] backwards.\n* Hovering units may use [Vector Movement] rule."
                ),
                "Jump Jets",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jump Jets"
                ),
                "Off Roading",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Off Roading"
                ),
                ":Snowcraft",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Snowcraft",
                  ":summary",
                  "* Off Snow +1 Terrain Penalty."
                ),
                ":Tracked",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tracked"
                ),
                ":Tunnelling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tunnelling"
                ),
                "Turbo Booster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Turbo Booster",
                  ":titles",
                  "Boost, Nitro, Turbo, Turbo Charger"
                ),
                ":Wheeled",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wheeled"
                )
              )
            ),
            "Water Movement",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Water Movement",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Hydrofoil",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hydrofoil"
                ),
                ":Sailed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sailed",
                  ":image",
                  "Maps/Windsock.png",
                  ":reference",
                  "Estimated 18ft Skiff speeds at 20mph winds:\n0 (180deg), 16mph (150deg), 26mph (120deg), 31mph (90deg), 32mph (60deg), 27mph (30deg), 19mph (0deg)\n\nEstimated ice yacht speeds at 30mph winds:\n0 (180deg), 95mph (150deg), 144mph (120deg), 165mph (90deg), 155mph (60deg), 115mph (30deg), 30mph (0deg)",
                  ":summary",
                  "* Wind direction has an effect on all vehicles but it is most pronounced on sailing vessels.\n* [Setup] - Point Windsock in direction of the wind.  If wind direction is not already determined, roll a die to randomize the wind direction.\n* [Move] - [-1 Speed] when starting the turn against the wind at an angle.\n* [Move] - [-2 Speed] when starting the turn directly against the wind.\n\n* Sailing speed is based on Wind speed, direction, angle of motion and vesselsize.\n* Same direction as wind (Running Downwind): Max Speed = Wind Speed\n* 30 degrees off direction (Broad Reach): Max Speed = Wind Speed * 1.3 (* 4 on ice)\n* 60 degrees off direction (Broad Reach): Max Speed = Wind Speed * 1.5 (* 5 on ice)\n* 90 degrees off direction (Beam Reach): Max Speed = Wind Speed * 1.4  (* 5.5 on ice)\n* 120 degrees off direction (Close Reach): Max Speed = Wind Speed * 1.2 (* 4.8 on ice)\n* 150 degrees off direction (Close Hauled): Max Speed = Wind Speed * .7 (* 4 on ice)\n* 180 degrees (Head To Wind or In Irons): Max Speed = 0\n\n* Over distance, sailboats average speed over distance is further limited by their length at waterline:\n* This is estimated to be about 1.34 x the square root of the waterline length.\n* For a 144 ft sailboat at the waterline, the square root is 12, and the boat will probably not exceed 12 x 1.34, or about 16 knots/18mph/30kph.\n* A 100 footer should do 13.4 knots/15mph/25kph.\n* A 30 footer should do 7.34 knots/8mph/13kph.\n* A 16 footer should do 5.36 knots/6mph/10kph."
                ),
                ":Submersible",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Submersible"
                )
              )
            ),
            "Space Movement",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Space Movement",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Chemical Rockets",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chemical Rockets"
                ),
                "Impulse Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Impulse Drive",
                  ":summary",
                  "* The Impulse Drive is a drive system based upon the concept that repeated energy releases at the same harmonic frequency will cause small ripples in the fabric of space.\n* By rhythmic repetition, the Drive can cause an action/reaction effect against the fabric of space itself, therefore no longer needing reaction mass to travel large distances.\n* Further, the ripples in space cause space itself to slightly change orientation on each wave. Anything crossing a wave will suffer minor disruption. Light, lasers, radio waves, radiation, and relativistic particles are increasingly scattered as they strike each wave effectively dispersing them.\n\n* This spatial effect has a number of implications on space travel:\n* High energy radiation becomes unfocused effectively creating radiation shielding proportionate to the distance from the source.\n* Energy weapons, relativistic particle weapons, and railguns become unfocused and scattered effectively increasing the armor of the vessel proportionate to the distance of the weapon.\n* At long distances, the energy detected by radar and other detection devices (even telescopes) become diffused. This effectively provides the vessel with increased stealth proportionate to the distance of the detector.\n* At closer distances, microcircuitry becomes prone to failure and damage. This makes computer chips, the foundation of modern computer science, next to useless. Therefore, computer systems must be turned off when the wave drive is active. Piloting, weaponry, and navigation must therefore be performed manually with limited automation.",
                  ":titles",
                  "Impulse, Ripple Drive, Wave Drive"
                ),
                "Ion Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ion Drive"
                ),
                "Nuclear Rockets",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nuclear Rockets"
                ),
                "Reaction Mass",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reaction Mass"
                ),
                "Subspace Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Subspace Drive",
                  ":reference",
                  "* Comet Empire Subspace Attack Submarine",
                  ":summary",
                  "* By creating a minor fold in space, a unit may drop almost completely out of normal space while maintaining a small window through which it may still interact with normal space."
                ),
                "Torch Drive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Torch Drive",
                  ":summary",
                  "* This drive creates a tight gravity well around the ship dropping it partially out of normal space. Because the ship is no longer in normal space, it does not actually move. What does move is the interface between normal space and the ship. Speed and direction are adjusted by controlling the depth and shape of the field.\n* There are a number of distinct advantages to this drive system. Because the ship in not moving, it is not subject to inertia or problems incurred at relativistic speeds.\n* Combat with the Torch drive is unique for several reasons. The occupants are not subject to the enormous stress of maneuvering at relativistic speeds. Conventional weapons have greatly reduced effect because only damage that crosses the interface has any effect on the ship.\n* Weaknesses - The Torch drive must also maintain a protective gravity bubble to defend against its own gravity well. Weapons designed to disrupt the Torch drive have a strong effect by making the ship more vulnerable to damage, by reducing its speed, by subjecting it to increased stress from travelling at relativistic speeds, and by exposing it to its own gravity well.",
                  ":titles",
                  "TISA, Trans-Gravitic, Interphased, Sub-Light Anamoly Drive"
                ),
                "Rocket Booster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rocket Booster",
                  ":titles",
                  "Boost, Turbo Booster"
                ),
                "Vernier Thruster",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vernier Thruster",
                  ":titles",
                  "Apogee Motor"
                )
              )
            ),
            "Interstellar Movement",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Interstellar Movement",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Hyperdrive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyperdrive",
                  ":image",
                  "Units/SpaceAndTime/Hyperspace.jpg",
                  ":summary",
                  "* Faster than light travel can be accomplished by warping space into a Wormhole/Black hole, dropping out of normal space and travelling through the parallel universe called Hyperspace/Tachyon Space where physical laws are not bound by the relationship between mass and the speed of light, and finally returning to normal space by creating another space warp.\n* Hyperspace/Tachyon Space - Tachyon Space, like other dimensions is at right angles to our existing 3 dimension. In Hyperspace, time and distance have different meanings, all particles are tachyons, and the speed of light is an absolute minimum speed instead of a maximum. Travelling through Hyperspace is exceptionally hazardous. In fact, any deviation from the calculated route cause the corridor to collapse leaving one stranded in Hyperpace forever with no way to calculate a return.\n* Calculating a Route - Once a destination is chosen, complex calculations must be performed to calculate a direct route from the current location to the destination through the shifting reality of Hyperspace. A successful route will be a 'straight' line through Hyperspace. Proximity to a gravity well makes these calculations next to impossible. Typically, all ship computer resources are required for this calculation and the larger the ship fewer the available routes and therefore the greater the complexity. Ships may only enter and exit hyperspace at the edge of a solar system and must use conventional sub light drives within the system. A day or more at sub-light speed is therefore required to reach or leave a planet in an inner solar system. Route calculation time is roughly light years x tons / 10secs e.g. 4 light years x 100 tons / 10 = 40sec.\n* Hyperspace Corridor - Once calculated, the ship must meet the speed defined by the calculation while modulating the Hyperdrive energy signature to match the bridge to Hyperspace. If all goes well, the vast energies in Tachyon Space will form a corridor directly to the destination. Errors in any of the steps usually involve intense gravitional shearing forces that will at best cause damage to the Hyperdrive and leave the traveller stranded in deep space, or worse, Hyperspace.\n* Travel in Hyperspace - Hyperspace travel is typically a boring affair. The Hyperspace corridor carries the ship to its destination, so no manuevering is needed. The time spent in Hyperspace varies, but is usually proportional to the distance. Transit time is roughly 2 hours per light year travelled (e.g. 4 light years x 2 = 8hours)\n* Tachyon Doppler Effect - When the Hyperspace Corridor is created, both ends of the corridor will start leaking Tachyons which can be detected by sensitive instruments. The amount of Tachyons increases with the size of the ship, the distance travelled and the closer the time of arrival.\n* Tachyon Relay Network - Satellites at the edge of stellar systems use Hyperspace Corridors to beam tranmissions through Hyperspace to their opposites in other systesm. Since these communications have negligible mass, the calculations are nearly instantaneous though the same transit times apply.\n* History - Imaginary Space, I-Space - While studying fusion plant efficiency using various algorithms, a surprising discovery was made: very rarely and seemingly at random, the plant would produce a tiny tachyon burst. After decades of study, a pattern began to emerge along with a shocking discovery: only algorithms using imaginary numbers could trigger a burst and a small amount of particles were actually disappearing during the event. Where the particles were going became the primary focus of astrophysics from then on. Eventually a hypothesis gathered momentum. The particles were leaving real space and traveling along trajectories plotted through so called imaginary space. This implied that the destination of the particles could be predicted. After much trial and error another breakthrough: a second tachyon burst moments after the first and many kilometers away. The particles had returned. Faster than light travel was possible. The implications for communications were immediately obvious, but could something larger make the trip? Research was slow because increased mass meant increased complexity. The power and computational needs were high but not unachievable. Only a decade later the first successful test craft made the trip. A decade later commercial hyperdrives became available. A decade later they were affordable on even modest starships.",
                  ":titles",
                  "FTL Drive, Gravity Drive, Gravity Lens, Subspace Drive, T-Drive, Tachyon Drive, Warp Drive"
                )
              )
            ),
            "Jump Drive",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Jump Drive",
              ":image",
              "Units/SpaceAndTime/Wormhole.jpg",
              ":reference",
              "* I created the Event Horizon to reach the stars, but she's gone much, much farther than that. She tore a hole in our universe, a gateway to another dimension. A dimension of pure chaos. Pure... evil. When she crossed over, she was just a ship. But when she came back... she was alive! - Dr. Weir, Event Horizon",
              ":summary",
              "* Jump Drives generate energy pulses in the ship's drive to create ripples in the fabric of space.  Each pulse must be precisely timed to the apex of each ripple to create an increasing harmonic wave (the 'Wave Motion' effect). Eventually, the energy of the occillation becomes too great, a tear in space is produced, and the starship falls in.",
              ":titles",
              "Gate Drive, Stargate, Wave Motion Engine, Wormhole",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Strategic Warp Jump",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strategic Warp Jump",
                  ":summary",
                  "* A ship with a Warp Engine may perform a strategic warp jump and instantly remove itself from combat, returning to the strategic map.\n* A unit already on the strategic map may move [Skill] spaces on the strategic map.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 3 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map."
                ),
                "Tactical Warp Jump",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tactical Warp Jump",
                  ":summary",
                  "* A ship with a Warp Engine may perform a tactical warp jump and instantly transport from any space on the map to any other.\n* [Requires]: The unit must cease maneuvering and must perform this ability for 2 consecutive turns.\n* [Action]: On the second consecutive action, the unit immediately removes all Vector tokens and moves the unit to any other space on the map."
                )
              )
            ),
            ":Teleportation",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Teleportation",
              ":titles",
              "Instant Transmission, Teleporter, Transporter",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Teleport Away",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Teleport Away",
                  ":summary",
                  "* Teleport an object/objects to a precisely known location.\n* Level determines size of object/objects and distance.\n* Tricks: Teleporting mines, bombs, fighters, drill missiles.",
                  ":titles",
                  "Smite"
                ),
                "Teleport Self",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Teleport Self"
                ),
                "Teleport Toward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Teleport Toward",
                  ":reference",
                  "Beam me up Scotty",
                  ":summary",
                  "* Teleport an object/objects that you know the exact location of to your location.\n* Level determines size of object/objects and distance."
                )
              )
            ),
            "Dimensional Travel",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Dimensional Travel",
              ":reference",
              "* I reject your reality and substitute my own. - Adam Savage, Mythbusters",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Dimension Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimension Drop",
                  ":summary",
                  "* Send a small object through a dimensional portal and immediately close it again. This is most practical for sending messages or explosives."
                ),
                "Dimensional Interference",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Interference",
                  ":summary",
                  "* Create an area that is more difficult to use dimensional or teleporting abilities."
                ),
                "Dimensional Portal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Portal",
                  ":titles",
                  "Gate"
                ),
                "Dimensional Teleport",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Teleport",
                  ":summary",
                  "* Move rapidly from one location to another by creating a wormhole between the locations."
                ),
                "Dimension Trace",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimension Trace",
                  ":summary",
                  "* Detect the origin of a Teleporter, Dimensional Portal, or an [Outsider]."
                ),
                "Dimension Track",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimension Track",
                  ":summary",
                  "* Track the destination of someone who recently travelled using Teleport or Dimensional Travel. Also can be used to track an [Outsider] as if the user had [Tracking]."
                ),
                "Dimensional Trap",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Trap",
                  ":summary",
                  "* Open a Dimensional Portal that opens when a target enters the area, draws them through, and then closes behind."
                ),
                "Dimensional Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dimensional Walk",
                  ":summary",
                  "* Move rapidly over terrain by quickly phasing in and out of the current space."
                )
              )
            ),
            "Time Travel",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Time Travel",
              ":image",
              "Units/SpaceAndTime/Vortex.jpg",
              ":summary",
              "* The Vortex is a point of null space-time. It is a tunnel through which one can escape the bounds of space-time.\n* Here time and distance have no meaning. Travelers through the Vortex have no sense of their own body, but have a strong sense that they have been in the Vortex forever. Some suggest that this may actually be true.\n* Entering the Vortex is like dying. Leaving is like being born. Some suggest that this birth and death cycle is the reason why only living things may be brought through the Vortex.",
              ":titles",
              "Chronos, Eye of Harmony, Yog-Sothoth",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Freeze Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Freeze Time"
                ),
                "Reverse Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reverse Time",
                  ":summary",
                  "* Rewind recent events within the surrounding area and possibly choose a different [Action]."
                ),
                ":Rewind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rewind"
                ),
                "Slow Time",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slow Time"
                ),
                "Time Shift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Time Shift"
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
   * @function chapter_physical_powers_and_weaknesses
   * @return {chapter}
   */
  static t_chapter_physical_powers_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_physical_powers_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses
  }

  // (func chapter_physical_powers_and_weaknesses)
  static f_chapter_physical_powers_and_weaknesses() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Physical Powers and Weaknesses",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Physical Powers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Physical Powers",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            ":Agility",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Agility",
              ":stat",
              "Body"
            ),
            ":Appearance",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Appearance",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Alter Appearance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Alter Appearance"
                ),
                "Another Face in the Crowd",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Another Face in the Crowd"
                ),
                "Chameleon Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chameleon Skin"
                ),
                ":Doppleganger",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Doppleganger",
                  ":summary",
                  "Take on the appearance of someone else."
                ),
                "Enhanced Beauty",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Beauty"
                ),
                "Eye of the Beholder",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye of the Beholder",
                  ":summary",
                  "* Appear differently to different viewers."
                ),
                "Face of Terror",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Face of Terror"
                )
              )
            ),
            ":Armored",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Armored",
              ":summary",
              "* Armor normally alters appearance and may be a permanent alteration or a suit that may be donned.\n* [+1 Value] for Armor that can appear on demand.\n* [+2 Value] for Armor that cannot be detected.\nBody Armor may be permanent or temporary.  If permanent, no time is needed to activate it, but is must either be donned and carried or it permanently alters appearance.",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Auto Med System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Auto Med System",
                  ":summary",
                  "* Detects severe damage to the wearer and automatically takes action to reduce shock and maintain suit integrity (sealing leaks or amputating if necessary)."
                ),
                "Ablative Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ablative Armor",
                  ":summary",
                  "* Armor that vaporizes when hit decreasing damage but also damaging the armor.\n* Ignore the first point of [Damage] and reduce [Armor] (on that facing) instead."
                ),
                "Hardened vs. Energy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hardened vs. Energy",
                  ":summary",
                  "* [Damage]: [+2 Armor] if attack is an [Energy Weapon]\n* Only 1 Hardened vs. ability may be taken"
                ),
                "Body Flares",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Flares",
                  ":summary",
                  "* Detects and distracts heat seaking missiles,\n* [Passive] - +1 Defense vs. Heat-Seaking Missiles (3 uses)"
                ),
                "Corrosion Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corrosion Resistance",
                  ":summary",
                  "* [Passive] - +1 Armor vs. Corrosive Agents"
                ),
                "Cyro Sleep System",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cyro Sleep System",
                  ":summary",
                  "* Can freeze the wearer into cryo-sleep and armor runs on minimal power to preserve the wearer from hostile environments or critical wounds for up to a month before power gives out."
                ),
                "Electrical Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electrical Resistance",
                  ":summary",
                  "* [Passive] - +1 Armor vs. Electricity"
                ),
                "Environmental Containment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Environmental Containment",
                  ":summary",
                  "* Suit is sealed against chemical and biological weapons except corrosive ones. It is also water-proof."
                ),
                "Environmental Independence",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Environmental Independence",
                  ":summary",
                  "* Suit is sealed against most hostile environments including space. Does not include corrosive environments.\n* Requires - [Enviromental Containment]"
                ),
                "Floation Device",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Floation Device",
                  ":summary",
                  "* An emergency floatation device."
                ),
                "Grappling Hoist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grappling Hoist",
                  ":summary",
                  "* A grappling dart that is fired into stone or hooked onto any uneven surface. The attached winch can then pull the wearer to the target or vis versa depending on relative weight. This can be used for \n     climbing or towing. The darts can be recovered and reused, but they are often not recoverable. 2 replacement darts are included."
                ),
                "Hardened vs. Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hardened vs. Fire",
                  ":summary",
                  "* [Damage]: [+2 Armor] if attack produces [Fire] tokens\n* Only 1 Hardened vs. ability may be taken"
                ),
                "Hardened vs. Projectiles",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hardened vs. Projectiles",
                  ":summary",
                  "* [Damage]: [+2 Armor] if attack is a [Projectile]\n* Only 1 Hardened vs. ability may be taken"
                ),
                "Infrared Dampener",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Infrared Dampener",
                  ":summary",
                  "* By activating this system, the armor reduces all heat signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Infrared Sensors"
                ),
                "Magnetic Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Magnetic Resistance",
                  ":summary",
                  "* Reduces the chance that a magnetic attachment can hold on the armor (assuming it is metallic).\n* [Passive] - +1 Armor vs. Magnetism"
                ),
                "Missile Mount",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Missile Mount",
                  ":summary",
                  "* A special mount to add a missile pack on the back of the armor."
                ),
                "Plasma Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Plasma Resistance",
                  ":summary",
                  "* Detects and disrupts the magnetic bottle surrounding plasma rounds causing them to detonate too early.\n* [Passive] - +1 Armor vs. Plasma"
                ),
                "Pressure Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pressure Resistance",
                  ":summary",
                  "* [Passive] - +1 Armor vs. Pressure and Impact"
                ),
                "Radar Dampener",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radar Dampener",
                  ":summary",
                  "* By activating this system, the armor reduces all radar signatures. Use of any system (even passive ones) will negate the stealth.\n* [Continuous Action] - Stealth vs. Radar"
                ),
                "Radar Jammer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radar Jammer",
                  ":summary",
                  "* By activating this system, the armor emits powerful radar white noise.\n* [Continuous Action] - [-Range] Radar sensors detection to any target within range."
                ),
                "Radiation Resistance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radiation Resistance",
                  ":summary",
                  "* [Passive] - +1 Armor vs. Radiation"
                ),
                "Reactive Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reactive Armor",
                  ":summary",
                  "* Exterior layer of armor explodes on impact reducing damage of the first hit but reduces armor rating for all subsequent hits.\n* [Passive] - +2 Armor vs. the first hit. -1 Armor for each subsequent hit."
                ),
                "Turret Mount",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Turret Mount",
                  ":summary",
                  "* A special mount to add a turreted weapon on the back of the armor."
                ),
                "Ultraviolet Jammer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ultraviolet Jammer",
                  ":summary",
                  "* By activating this system, the armor emits a powerful blinding strobe in the ultraviolet band.\n* [Continuous Action] - [-Range] Ultraviolet sensors detection to any target within range."
                ),
                "Underwater Operation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Underwater Operation",
                  ":summary",
                  "* Sealed against water and can operate underwater. Small thrusters allow slow movement underwater. Oxygen scrubbers allow extended underwater operation."
                )
              )
            ),
            ":Fortitude",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Fortitude",
              ":titles",
              "Resistence, Toughness",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Resilience",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resilience"
                ),
                "Resist Acid",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Acid"
                ),
                "Resist Cold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Cold"
                ),
                "Resist Disease",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Disease"
                ),
                "Resist Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Electricity"
                ),
                "Resist Exposure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Exposure"
                ),
                "Resist Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Fire"
                ),
                "Resist Gravity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Gravity"
                ),
                "Resist Hunger",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Hunger"
                ),
                "Resist Poison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Poison"
                ),
                "Resist Pressure",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Pressure"
                ),
                "Resist Radiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Radiation"
                ),
                "Resist Space",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Space"
                ),
                "Resist Thirst",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Thirst"
                ),
                "Resist Vacuum",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Vacuum"
                ),
                "Resist Water",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Resist Water"
                ),
                "Suspended Animation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Suspended Animation"
                )
              )
            ),
            ":Healing",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Healing",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Lernaean Regeneration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lernaean Regeneration",
                  ":summary",
                  "* [Activate]: If unit is Damaged, Remove a Damage Token and add a White Close Combat Token."
                ),
                ":Recover",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Recover",
                  ":summary",
                  "* May roll extra dice when resisting [Disease] or [Poison]."
                ),
                ":Regeneration",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Regeneration",
                  ":summary",
                  "* [Passive]\n* [Bleeding] and [Damage] Tokens are considered Yellow Tokens."
                ),
                ":Regrowth",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Regrowth"
                )
              )
            ),
            ":Movement",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Movement",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Wall Crawling",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall Crawling"
                ),
                "Wall Running",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wall Running",
                  ":summary",
                  "* Requires: [Wall Crawling]"
                ),
                "Water Walking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Walking"
                ),
                "Water Running",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Water Running",
                  ":summary",
                  "* Requires: [Water Walking]"
                )
              )
            ),
            "Natural Weaponry",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Natural Weaponry",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bite",
                  ":summary",
                  "* The fighter savagely bites his opponent.\n* Criticals - [Piercing]"
                ),
                "Bull Rush",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bull Rush",
                  ":titles",
                  "Charge"
                ),
                ":Burrowing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Burrowing"
                ),
                ":Claw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Claw",
                  ":summary",
                  "* The fighter attacks with both claws.\n* Criticals - [Bleeding]"
                ),
                "Claw Rake",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Claw Rake",
                  ":summary",
                  "* A quick raking claw attack with one set of claws.\n* +2 Initiative\n* -1 Accuracy\n* +1 Move\n* Criticals - [Bleeding]"
                ),
                ":Constrict",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Constrict",
                  ":titles",
                  "Bear Hug"
                ),
                "Death Roll",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death Roll"
                ),
                "Feather Blades",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feather Blades",
                  ":summary",
                  "* Feathers become as hard as steel and may be used as swords."
                ),
                "Feather Knives",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feather Knives",
                  ":summary",
                  "* Feathers become as hard as steel and may be thrown like knives."
                ),
                ":Horns",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Horns",
                  ":summary",
                  "* Usually they are worn as antlers, but may sprout form anywhere on the body."
                ),
                "Jaw Lock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jaw Lock",
                  ":summary",
                  "* The fighter locks his powerful jaws onto the opponent to immobilize.\n* Damage - [Slow]\n* Criticals - [Piercing]"
                ),
                "Jaws of Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jaws of Death",
                  ":summary",
                  "* Fericiously attack with huge bites."
                ),
                "Neck Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Neck Bite",
                  ":summary",
                  "* After grabbing an opponent, the fighter bites the neck/shoulders of the opponents doing damage each turn.\n* Requires: [Hold], [Continuous Hold]\n* +1 Initiative\n* +1 Accuracy\n* Critcals - [Bleeding]"
                ),
                ":Overwhelm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overwhelm"
                ),
                ":Pounce",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pounce",
                  ":summary",
                  "* The fighter drops into a crouch and then explodes into a mighty leap at his prey attempting to knock down the opponent.\n* [Aerial]\n* +1 Accuracy\n* +1 Move\n* Criticals - [Knockdown]"
                ),
                "Quill Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Quill Attack"
                ),
                "Ripping Bite",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ripping Bite",
                  ":summary",
                  "* The fighter strikes a limb with the intention to disable his opponent.\n* -1 Initiative\n* -1 Damage\n* +1 Critical - [Bleeding] or [Weakness]",
                  ":titles",
                  "Jaws of Death"
                ),
                "Savage Genitalia",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Savage Genitalia",
                  ":summary",
                  "* Male variations include excessive length, hardness, spines, and thorns.\n* Female variations include teeth, ripping suction, crushers, and grinders.\n* [Hidden Weapon]\n* -2 Initiative\n* -1 Accuracy\n* +1 Critical"
                ),
                ":Spines",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spines"
                ),
                ":Sting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sting"
                ),
                "Swallow Whole",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Swallow Whole"
                ),
                "Tail Sweep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tail Sweep"
                ),
                "Tongue Lash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tongue Lash"
                ),
                ":Tusk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tusk"
                ),
                ":Trample",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Trample"
                )
              )
            ),
            ":Quickness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Quickness",
              ":titles",
              "Celerity, Hyperspeed, Quickening, Speed",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "After Image",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "After Image",
                  ":reference",
                  "* Dragon Ball\n* Phantom Miria - Claymore",
                  ":summary",
                  "* Evade: Instantly make a Move without triggering Opportunity Attacks."
                ),
                "Fast Actions",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fast Actions",
                  ":summary",
                  "* Time to complete time consuming actions is dramatically reduced."
                ),
                "Hyper Punch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyper Punch",
                  ":summary",
                  "* Action: Perform a basic [Attack] on a single target. If the attack succeeds, roll additional damage dice up to level."
                ),
                "Hyper Running",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyper Running"
                ),
                "Hyper Swimming",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyper Swimming"
                ),
                "Hyper Storm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyper Storm",
                  ":summary",
                  "Action: Use a Move and perform a basic [Attack] up to 1 target per level on each target along your path. If the attack succeeds, roll additional damage dice up to level."
                )
              )
            ),
            ":Senses",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Senses",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "360 Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "360 Vision"
                ),
                "Blood Scent",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blood Scent"
                ),
                "Cosmic Awareness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cosmic Awareness",
                  ":reference",
                  "Captain Marvel, Gundam New Types"
                ),
                "Death Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death Sense"
                ),
                "Electromagnetic Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electromagnetic Vision",
                  ":summary",
                  "See into radio and radiation band of electromagnetic spectrum"
                ),
                "Enhanced Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Hearing"
                ),
                "Enhanced Smell",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Smell"
                ),
                "Enhanced Taste",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Taste"
                ),
                "Enhanced Touch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Enhanced Touch"
                ),
                "Microscopic Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Microscopic Vision"
                ),
                "Motion Detection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Motion Detection"
                ),
                "Night Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Night Vision",
                  ":titles",
                  "Light Intensifying"
                ),
                "Radar Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radar Sense"
                ),
                "Radio Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Radio Sense",
                  ":summary",
                  "* May hear radio, television, shortwave, and even cellular telephone communications when concentrating."
                ),
                ":Sonar",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sonar",
                  ":titles",
                  "Echo Location"
                ),
                "Telescopic Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telescopic Hearing"
                ),
                "Telescopic Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telescopic Vision"
                ),
                "Thermal Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thermal Vision"
                ),
                "Tracking Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tracking Sense"
                ),
                "Ultrasonic/Subsonic Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ultrasonic/Subsonic Hearing",
                  ":summary",
                  "* Hear ultra high or low pitched sounds. Subsonic sounds can travel extreme distances and are some of the communication systems used by whales and elephants."
                ),
                "Ultraviolet Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ultraviolet Vision"
                ),
                "X-Ray Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "X-Ray Vision",
                  ":reference",
                  "* Superman: Bruce Wayne? Batman: You peeked. - Superman and Batman, Superman: The Animated Series",
                  ":summary",
                  "* See through solid objects. The higher the density the blurrier the vision."
                )
              )
            ),
            ":Shielding",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Shielding",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Shield Modulation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Modulation"
                )
              )
            ),
            ":Strength",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Strength",
              ":reference",
              "* Technique is for lightweights. - Sett, Runeterra",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Power Leap",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Leap"
                ),
                "Power Lift",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Lift",
                  ":summary",
                  "* Lift additional kg equal to Power Rating."
                ),
                "Power Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Strike",
                  ":summary",
                  "* Add Power Rating to weapon damage using Melee, or Close Combat."
                ),
                "Power Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Power Throw",
                  ":summary",
                  "* Add Power Rating to weapon damage when throwing any object or weapon."
                ),
                ":Shockwave",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shockwave"
                ),
                ":Thunderclap",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thunderclap"
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
   * @function chapter_powers_overview
   * @return {chapter}
   */
  static t_chapter_powers_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_powers_overview = {
    vx_type: nx_tactics_books_powers.t_chapter_powers_overview
  }

  // (func chapter_powers_overview)
  static f_chapter_powers_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Powers Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Powers?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Powers?"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_special_modifiers
   * @return {chapter}
   */
  static t_chapter_special_modifiers = {
    vx_type: vx_core.t_type
  }
  static e_chapter_special_modifiers = {
    vx_type: nx_tactics_books_powers.t_chapter_special_modifiers
  }

  // (func chapter_special_modifiers)
  static f_chapter_special_modifiers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Special Modifiers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Buffs",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Buffs",
          ":modifiermap",
          vx_core.f_new(
            nx_tactics_base.t_modifiermap,
            ":Arc",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Arc",
              ":summary",
              "* Triangle shaped effect starting at 3 spaces wide and widening by 1 additional space for each space of range.\n* [-2 Skill] for each Space of Range"
            ),
            "Armor-Piercing (AP)",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Armor-Piercing (AP)",
              ":summary",
              "* Specifically designed to target armored units."
            ),
            ":Anti-Armor",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Anti-Armor",
              ":summary",
              "* Specifically designed to tear apart armor to leave target open to further attacks."
            ),
            ":Anti-Missile",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Anti-Missile",
              ":summary",
              "* Specifically designed to intercept high speed targets moving in a straight line."
            ),
            ":Anti-Personnel",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Anti-Personnel",
              ":summary",
              "* Specifically designed to attack man-sized targets."
            ),
            ":Anti-Shield",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Anti-Shield",
              ":summary",
              "* Specifically designed to reduced [Shielding]."
            ),
            ":Aura",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Aura",
              ":summary",
              "* Radial effect encompassing the current space and continuing for Level Range."
            ),
            ":Beam",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Beam",
              ":summary",
              "* Rectangular shaped effect 1 space wide.\n* [-1 Skill] for each 2 Spaces of Range"
            ),
            "Chain Reaction",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Chain Reaction"
            ),
            ":Cloud",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Cloud"
            ),
            ":Cluster",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Cluster"
            ),
            ":Column",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Column",
              ":summary",
              "* Rectangular shaped effect starting at 1 space wide and widening to 3 spaces.\n* [Action]: [-2 Skill] for each Space of Range"
            ),
            ":Cone",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Cone",
              ":summary",
              "* Triangle shaped effect starting at 1 space wide and widening by 1 additional space for every 2 spaces of range.\n* [Action]: [-2 Skill] for each Space of Range"
            ),
            ":Fork",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Fork"
            ),
            ":Haywire",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Haywire",
              ":summary",
              "* Attack that damages electrical systems."
            ),
            "Hidden Effect",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Hidden Effect",
              ":summary",
              "Effect cannot be detected through normal means."
            ),
            "High-Explosive (HE)",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "High-Explosive (HE)",
              ":summary",
              "* [Targetting]: Target a space.  All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked at -1 Damage for each space distant.\n\nAdvanced:\n* Instead of standard [High Explosive (HE)] rules the following may be used to more accurately simulate the damage exponential decrease in energy of explosives.\n* [Targetting]: Target a space. All units in that space and surrounding spaces are attacked.\n* [Damage]: All target's are [+2 Armor] against this attack.\n* [Damage]: Units surrounding the space are attacked by dividing the energy (in Joules, or tons of TNT) using the following reduction pattern for each space distant: 1/1, 1/3, 1/10, 1/30, 1/100, 1/300, 1/1000, etc. Then look up the new damage based on the new energy level."
            ),
            ":Homing",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Homing",
              ":titles",
              "Guided, Seeking"
            ),
            ":Indirect",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Indirect",
              ":summary",
              "* May use [Indirect Fire] ability to attack without [Line of Sight]."
            ),
            "Pushing the Limits",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Pushing the Limits",
              ":summary",
              "Powers may be increased temporarily, but this runs a risk of damaging or permanently altering the subject or his powers in some way. This may even increase the power but may create [Aberrations]."
            ),
            ":Ring",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Ring",
              ":titles",
              "Circle"
            ),
            ":Sphere",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Sphere",
              ":summary",
              "* Radial effect encompassing the current space.\n* [Action]: [-3 Skill] for each Space of Range"
            ),
            ":Spray",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Spray"
            ),
            ":Swarm",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Swarm"
            ),
            ":Touch",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Touch",
              ":summary",
              "* [Requires]: Target must be within 1 space and be able to be touched."
            ),
            ":Wall",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Wall",
              ":summary",
              "* Walls start on the edge of a space and spread outward one space in each direction on each of this unit's turns until the unit ceases concentration or the maximum size is reached. Maximum Size is one square space per level."
            ),
            ":Wave",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Wave"
            )
          )
        ),
        "Power Weaknesses",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Power Weaknesses",
          ":modifiermap",
          vx_core.f_new(
            nx_tactics_base.t_modifiermap,
            ":Activation",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Activation",
              ":summary",
              "* Activating the ability requires more than just desire"
            ),
            "Always On",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Always On",
              ":summary",
              "* Ability may not be turned off"
            ),
            ":Annoying",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Annoying",
              ":summary",
              "* Tiny things that make using the ability frustrating."
            ),
            "Communications Broadcast Only",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Communications Broadcast Only"
            ),
            "Communications None",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Communications None"
            ),
            "Communications Receive Only",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Communications Receive Only"
            ),
            "Conditional Use",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Conditional Use",
              ":summary",
              "* Ability may only be used under specific circumstances"
            ),
            "Energy Discharge",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Energy Discharge",
              ":summary",
              "Cannot completely contain own energies and must allow them to leak out regularly. At low levels this just draws attention, but at higher levels becomes dangerous."
            ),
            "Focus Item",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Focus Item"
            ),
            "Glider Only",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Glider Only"
            ),
            ":Inefficient",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Inefficient",
              ":summary",
              "* Uses excessive energy."
            ),
            ":Internalize",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Internalize"
            ),
            "Large Sensor Profile",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Large Sensor Profile"
            ),
            "Limited Uses",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Limited Uses"
            ),
            ":Overheats",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Overheats"
            ),
            ":Overloads",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Overloads"
            ),
            "Poor Climb Angle",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Poor Climb Angle"
            ),
            "Poor Ceiling",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Poor Ceiling"
            ),
            "Poor Towing Capacity",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Poor Towing Capacity"
            ),
            "Power Fluxuation",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Power Fluxuation",
              ":summary",
              "Cannot completely control power level. At random, power use may be higher or lower than expected. High level powers may not be able to be turned off or may not turn on when needed."
            ),
            "Power Hungry",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Power Hungry",
              ":summary",
              "* Requires extra turns of inactivity to use."
            ),
            "Power Manifestation",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Power Manifestation",
              ":summary",
              "When powers are used, a visual or audible manifestation appears. The higher the power level the more obvious the manifestation."
            ),
            "Requires Airstrip",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Requires Airstrip"
            ),
            "Sensor Dependent",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Sensor Dependent",
              ":summary",
              "* Blind without Sensors"
            ),
            "Traceable Emmissions",
            vx_core.f_new(
              nx_tactics_base.t_modifier,
              ":name",
              "Traceable Emmissions"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_strength_and_weaknesses
   * @return {chapter}
   */
  static t_chapter_strength_and_weaknesses = {
    vx_type: vx_core.t_type
  }
  static e_chapter_strength_and_weaknesses = {
    vx_type: nx_tactics_books_powers.t_chapter_strength_and_weaknesses
  }

  // (func chapter_strength_and_weaknesses)
  static f_chapter_strength_and_weaknesses() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Strength and Weaknesses",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Special Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Special Skills",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Special Ability",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Special Ability",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Cannibal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cannibal",
                  ":summary",
                  "* [Requires]: Close Combat\n* [Attack]: Each [Critical Hit] may remove a [Damage Token] from this unit."
                ),
                ":Chaotic",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chaotic"
                ),
                ":Corrupted",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Corrupted"
                ),
                ":Ethereal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ethereal"
                ),
                "Feeding Frenzy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feeding Frenzy"
                ),
                ":Giant",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Giant"
                ),
                ":Huge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Huge"
                ),
                "Lernaean Poison",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lernaean Poison"
                ),
                ":Mindless",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mindless",
                  ":summary",
                  "* 0 [Mind]\n* Cannot use any Mind Abilities\n* Immune to Abilities that target [Mind]."
                ),
                ":Monstrous",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Monstrous"
                ),
                "Nemean Invulnerability",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nemean Invulnerability"
                ),
                "Rapid Metabolism",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rapid Metabolism"
                ),
                ":Savage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Savage",
                  ":summary",
                  "* Must Attack if able.\n* Ignores Fear, Despair, and Morale"
                ),
                ":Skeletal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Skeletal",
                  ":summary",
                  "* +1 Body\n* Ignores [Bleeding], [Poison], and [Disease]"
                ),
                ":Soulless",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Soulless",
                  ":summary",
                  "* A soulless unit is not truly alive.  It may not use or gain Spirit skills."
                ),
                ":Tainted",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tainted"
                )
              )
            )
          )
        ),
        ":Weaknesses",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Weaknesses",
          ":powermap",
          vx_core.f_new(
            nx_tactics_base.t_powermap,
            "Physical Weakness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Physical Weakness",
              ":summary",
              "A being that has a great deal of power becomes increasingly inhuman as power increases. Physical powers become harder to conceal growing increasingly monstrous and mentality leans more toward megalomania, messiah complex, or detached alien.",
              ":titles",
              "Aberrations, Inhumanity, The Price of Power, Taint",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Allergy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Allergy",
                  ":summary",
                  "Affected by substances or energies that have little or no effect on normal people."
                ),
                ":Asthma",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Asthma"
                ),
                ":Atrophy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Atrophy",
                  ":summary",
                  "* One or more limbs has limited mobility"
                ),
                ":Blind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blind"
                ),
                ":Brittle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Brittle"
                ),
                ":Child",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Child",
                  ":summary",
                  "* You are still a child and have difficulty getting others to take you seriously. This is usually taken with [Short]."
                ),
                "Cold Blooded",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cold Blooded"
                ),
                "Color Blindness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Color Blindness"
                ),
                ":Contagious",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Contagious",
                  ":summary",
                  "Spreads disease."
                ),
                ":Clumsy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clumsy"
                ),
                ":Deaf",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deaf"
                ),
                ":Deformity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deformity",
                  ":summary",
                  "* Reduces Social Skills and some Physical Skills."
                ),
                ":Disfigured",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disfigured",
                  ":summary",
                  "* Reduces Social Skills dramatically."
                ),
                "Extra Body Parts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extra Body Parts"
                ),
                "Hard of Hearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hard of Hearing"
                ),
                ":Lame",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lame",
                  ":summary",
                  "* Reduces Speed"
                ),
                ":Leprosy",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leprosy"
                ),
                "Missing Body Parts",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Missing Body Parts"
                ),
                ":Mute",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mute"
                ),
                ":Obvious",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Obvious",
                  ":summary",
                  "* Easy to detect and target",
                  ":titles",
                  "Large Profile"
                ),
                "Obvious Signature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Obvious Signature",
                  ":summary",
                  "* Easy to identify and track",
                  ":titles",
                  "Energy Signature, Heat Signature"
                ),
                ":Numb",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Numb"
                ),
                ":Old",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Old"
                ),
                ":Paralyzed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paralyzed"
                ),
                "Parasitic Infection",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Parasitic Infection"
                ),
                "Peeling Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Peeling Skin"
                ),
                "Poor Vision",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Poor Vision"
                ),
                ":Short",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Short",
                  ":summary",
                  "* This minor weakness reduces vision over objects and movement speed.\n* It can, however, provide benefits to [Stealth]."
                ),
                ":Sterile",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sterile",
                  ":summary",
                  "* May not produce offspring"
                ),
                ":Tasteless",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tasteless"
                ),
                "Temperature Control Problem",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Temperature Control Problem",
                  ":summary",
                  "* Cannot regulate temperature correctly"
                ),
                "Terminal Condition",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Terminal Condition"
                ),
                "Unusual Appearance",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Appearance"
                ),
                "Unusual Diet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Diet",
                  ":summary",
                  "* Minor: Eat wood, garbage, hair, etc.\n* Major: Eat metal, energy\n* Extreme: Eat blood, human flesh, plutonium"
                ),
                "Unusual Eyes",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Eyes",
                  ":summary",
                  "* Minor: Strange colored\n* Major: Animal-like, or glowing eyes\n* Extreme: Bug-eyes, or no eyes"
                ),
                "Unusual Limbs",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Limbs",
                  ":summary",
                  "Gnarled, segmented, snake-like, eloganted or other bizarre looking limbs"
                ),
                "Unusual Musculature",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Musculature",
                  ":summary",
                  "Bulging muscles or wasted looking"
                ),
                "Unusual Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Skin",
                  ":summary",
                  "* Minor: Strange colored\n* Major: Furry, Striped, Glowing\n* Extreme: Translucent, Reptilian, Rock-like, Exoskeleton, Oozing"
                ),
                "Unusual Vulnerability",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unusual Vulnerability",
                  ":reference",
                  "Kryptonite, Severe Allergies",
                  ":summary",
                  "* Take damage from things that are not dangerous to ordinary people."
                ),
                ":Vulnerability",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerability",
                  ":summary",
                  "* Take additional damage from certain effects"
                ),
                "Vulnerable to Bleeding",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Bleeding"
                ),
                "Vulnerable to Electricity",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Electricity"
                ),
                "Vulnerable to Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Fire"
                ),
                "Vulnerable to Heat",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Heat"
                ),
                "Vulnerable to Impact",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Impact"
                ),
                "Vulnerable to Piercing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Piercing"
                ),
                "Vulnerable to Radiation",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Radiation"
                ),
                "Vulnerable to Slashing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vulnerable to Slashing"
                ),
                ":Wasting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wasting"
                )
              )
            ),
            "Social Weakness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Social Weakness",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Awkward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Awkward"
                ),
                ":Hideous",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hideous"
                ),
                ":Hunted",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hunted"
                ),
                ":Naive",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Naive"
                ),
                ":Nemesis",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nemesis"
                ),
                ":Noble",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Noble"
                ),
                ":Notorious",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Notorious"
                ),
                "Speech Impediment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Speech Impediment"
                ),
                ":Strangeness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strangeness"
                ),
                ":Terrifying",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Terrifying"
                ),
                ":Timid",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Timid"
                ),
                ":Ugly",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ugly"
                ),
                "Unnatural Presense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Unnatural Presense",
                  ":summary",
                  "* Subtly disturbing, homely, or too perfect and inspires negative attention from others."
                ),
                ":Ward",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ward",
                  ":summary",
                  "* You are devoted to taking care of another (who happens to get into trouble a lot)."
                )
              )
            ),
            "Supernatural Weakness",
            vx_core.f_new(
              nx_tactics_base.t_power,
              ":name",
              "Supernatural Weakness",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Cursed",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Cursed"
                ),
                "Dark Fate",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dark Fate"
                ),
                ":Haunted",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Haunted"
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
    vx_type: nx_tactics_books_powers.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Powers",
      ":image",
      "Powers.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Powers Overview",
        nx_tactics_books_powers.f_chapter_powers_overview(),
        "Special Modifiers",
        nx_tactics_books_powers.f_chapter_special_modifiers(),
        "Equipment Powers",
        nx_tactics_books_powers.f_chapter_equipment_powers(),
        "Strength and Weaknesses",
        nx_tactics_books_powers.f_chapter_strength_and_weaknesses(),
        "Mental Powers and Weaknesses",
        nx_tactics_books_powers.f_chapter_mental_powers_and_weaknesses(),
        "Movement Powers",
        nx_tactics_books_powers.f_chapter_movement_powers(),
        "Physical Powers and Weaknesses",
        nx_tactics_books_powers.f_chapter_physical_powers_and_weaknesses(),
        "Body Powers",
        nx_tactics_books_powers.f_chapter_body_powers(),
        "Energy and Forces",
        nx_tactics_books_powers.f_chapter_energy_and_forces(),
        "Enhancement Powers",
        nx_tactics_books_powers.f_chapter_enhancement_powers(),
        "Alteration Powers",
        nx_tactics_books_powers.f_chapter_alteration_powers(),
        "Godlike Powers",
        nx_tactics_books_powers.f_chapter_godlike_powers()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_alteration_powers": nx_tactics_books_powers.e_chapter_alteration_powers,
      "chapter_body_powers": nx_tactics_books_powers.e_chapter_body_powers,
      "chapter_energy_and_forces": nx_tactics_books_powers.e_chapter_energy_and_forces,
      "chapter_enhancement_powers": nx_tactics_books_powers.e_chapter_enhancement_powers,
      "chapter_equipment_powers": nx_tactics_books_powers.e_chapter_equipment_powers,
      "chapter_godlike_powers": nx_tactics_books_powers.e_chapter_godlike_powers,
      "chapter_mental_powers_and_weaknesses": nx_tactics_books_powers.e_chapter_mental_powers_and_weaknesses,
      "chapter_movement_powers": nx_tactics_books_powers.e_chapter_movement_powers,
      "chapter_physical_powers_and_weaknesses": nx_tactics_books_powers.e_chapter_physical_powers_and_weaknesses,
      "chapter_powers_overview": nx_tactics_books_powers.e_chapter_powers_overview,
      "chapter_special_modifiers": nx_tactics_books_powers.e_chapter_special_modifiers,
      "chapter_strength_and_weaknesses": nx_tactics_books_powers.e_chapter_strength_and_weaknesses,
      "tacticsbook": nx_tactics_books_powers.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_alteration_powers": nx_tactics_books_powers.t_chapter_alteration_powers,
      "chapter_body_powers": nx_tactics_books_powers.t_chapter_body_powers,
      "chapter_energy_and_forces": nx_tactics_books_powers.t_chapter_energy_and_forces,
      "chapter_enhancement_powers": nx_tactics_books_powers.t_chapter_enhancement_powers,
      "chapter_equipment_powers": nx_tactics_books_powers.t_chapter_equipment_powers,
      "chapter_godlike_powers": nx_tactics_books_powers.t_chapter_godlike_powers,
      "chapter_mental_powers_and_weaknesses": nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses,
      "chapter_movement_powers": nx_tactics_books_powers.t_chapter_movement_powers,
      "chapter_physical_powers_and_weaknesses": nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses,
      "chapter_powers_overview": nx_tactics_books_powers.t_chapter_powers_overview,
      "chapter_special_modifiers": nx_tactics_books_powers.t_chapter_special_modifiers,
      "chapter_strength_and_weaknesses": nx_tactics_books_powers.t_chapter_strength_and_weaknesses,
      "tacticsbook": nx_tactics_books_powers.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/powers",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_alteration_powers)
    nx_tactics_books_powers.t_chapter_alteration_powers['vx_value'] = {
      name          : "chapter_alteration_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_alteration_powers
    }

    // (func chapter_body_powers)
    nx_tactics_books_powers.t_chapter_body_powers['vx_value'] = {
      name          : "chapter_body_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_body_powers
    }

    // (func chapter_energy_and_forces)
    nx_tactics_books_powers.t_chapter_energy_and_forces['vx_value'] = {
      name          : "chapter_energy_and_forces",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_energy_and_forces
    }

    // (func chapter_enhancement_powers)
    nx_tactics_books_powers.t_chapter_enhancement_powers['vx_value'] = {
      name          : "chapter_enhancement_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_enhancement_powers
    }

    // (func chapter_equipment_powers)
    nx_tactics_books_powers.t_chapter_equipment_powers['vx_value'] = {
      name          : "chapter_equipment_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_equipment_powers
    }

    // (func chapter_godlike_powers)
    nx_tactics_books_powers.t_chapter_godlike_powers['vx_value'] = {
      name          : "chapter_godlike_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_godlike_powers
    }

    // (func chapter_mental_powers_and_weaknesses)
    nx_tactics_books_powers.t_chapter_mental_powers_and_weaknesses['vx_value'] = {
      name          : "chapter_mental_powers_and_weaknesses",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_mental_powers_and_weaknesses
    }

    // (func chapter_movement_powers)
    nx_tactics_books_powers.t_chapter_movement_powers['vx_value'] = {
      name          : "chapter_movement_powers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_movement_powers
    }

    // (func chapter_physical_powers_and_weaknesses)
    nx_tactics_books_powers.t_chapter_physical_powers_and_weaknesses['vx_value'] = {
      name          : "chapter_physical_powers_and_weaknesses",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_physical_powers_and_weaknesses
    }

    // (func chapter_powers_overview)
    nx_tactics_books_powers.t_chapter_powers_overview['vx_value'] = {
      name          : "chapter_powers_overview",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_powers_overview
    }

    // (func chapter_special_modifiers)
    nx_tactics_books_powers.t_chapter_special_modifiers['vx_value'] = {
      name          : "chapter_special_modifiers",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_special_modifiers
    }

    // (func chapter_strength_and_weaknesses)
    nx_tactics_books_powers.t_chapter_strength_and_weaknesses['vx_value'] = {
      name          : "chapter_strength_and_weaknesses",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_chapter_strength_and_weaknesses
    }

    // (func tacticsbook)
    nx_tactics_books_powers.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/powers",
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
      fn            : nx_tactics_books_powers.f_tacticsbook
    }

  }
}