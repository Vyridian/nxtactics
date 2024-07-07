'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_combat {

  /**
   * @function chapter_advanced_weaponry
   * @return {chapter}
   */
  static t_chapter_advanced_weaponry = {
    vx_type: vx_core.t_type
  }
  static e_chapter_advanced_weaponry = {
    vx_type: nx_tactics_books_combat.t_chapter_advanced_weaponry
  }

  // (func chapter_advanced_weaponry)
  static f_chapter_advanced_weaponry() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Advanced Weaponry",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Advanced Melee Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Advanced Melee Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Beam Saber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Beam Saber",
              ":summary",
              "* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber. The light and color are caused by the air molecules ionizing in the lasers. Any contact with a solid object or another magnetic field creates a breach in the bubble which triggers a plasma burst in the hilt that instantly travels down the bubble and exits the breach with burning explosive effect."
            ),
            "Lightning Saber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lightning Saber",
              ":summary",
              "* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber. The light and color are caused by the air molecules ionizing in the lasers. Any contact with a solid object or another magnetic field creates a breach in the bubble which triggers an electric pulse in the hilt that instantly travels down the bubble and exits the breach with shocking effect."
            ),
            "Shock Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shock Lance"
            )
          )
        ),
        "Futuristic Hand Guns",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Hand Guns",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "9mm Cone Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "9mm Cone Pistol",
              ":summary",
              "* The modern upgrade to the traditional firearm. Cone weapons fire rocket-propelled, recoilless rounds. These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for weightlessness. Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.",
              ":titles",
              "Gyrojet Pistol, Rocket Pistol"
            ),
            "Liquid Sprayer Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Liquid Sprayer Pistol",
              ":titles",
              "Acid Pistol"
            ),
            "100W Laser Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "100W Laser Pistol"
            ),
            "Lightning Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lightning Pistol"
            )
          )
        ),
        "Futuristic Rifles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Rifles",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "5.56mm Needle Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "5.56mm Needle Rifle"
            ),
            "7.62mm Cone Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm Cone Rifle",
              ":summary",
              "* The modern upgrade to the traditional firearm. Cone weapons fire rocket-propelled, recoilless rounds. These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for weightlessness. Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.",
              ":titles",
              "Gyrojet Rifle, Rocket Rifle"
            ),
            "Gauss Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gauss Rifle"
            ),
            "Liquid Sprayer Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Liquid Sprayer Rifle",
              ":titles",
              "Acid Rifle"
            ),
            "500W Laser Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "500W Laser Rifle"
            ),
            "Microwave Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Microwave Rifle"
            ),
            "Lightning Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lightning Rifle"
            )
          )
        ),
        "Futuristic Vehicular Cannons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Vehicular Cannons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Energy Attenuating Aerosol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Energy Attenuating Aerosol",
              ":summary",
              "* A dense gas designed to absorb and refract energies that pass through it.  This obscures vision and greatly weakens lasers and other direct energy weapons that pass through it.",
              ":titles",
              "Anti-Laser Gas"
            ),
            "20mm Light Gauss Cannon (LGC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Light Gauss Cannon (LGC)",
              ":titles",
              "Railgun"
            ),
            "1.5kW Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "1.5kW Laser Cannon"
            ),
            "15MW Light Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "15MW Light Laser Cannon"
            ),
            "Light Particle Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Particle Cannon"
            ),
            "Light Shock Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Shock Cannon"
            ),
            "Light Sonic Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Sonic Cannon"
            ),
            "30mm Medium Gauss Cannon (MGC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "30mm Medium Gauss Cannon (MGC)",
              ":titles",
              "Railgun"
            ),
            "40mm Heavy Gauss Cannon (HGC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "40mm Heavy Gauss Cannon (HGC)"
            ),
            "25MW Medium Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "25MW Medium Laser Cannon"
            ),
            "Medium Gattling Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medium Gattling Laser Cannon"
            ),
            "Medium Sniper Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medium Sniper Laser Cannon"
            ),
            "35MW Heavy Laser Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "35MW Heavy Laser Cannon"
            )
          )
        ),
        "Futuristic Missiles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Missiles",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Swarmer Missiles",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Swarmer Missiles",
              ":image",
              "HighTech/SwarmerMissiles.png",
              ":summary",
              "* Swarmer Missiles are clusters of low yield homing missiles that seek to overwhelm targets with their numbers.\n* Like all missiles, the first turn they move they only move half their movement.\n* Only weapons with Auto or other Swarmer Missiles can functionally destroy these missiles."
            )
          )
        ),
        "Futuristic Vehicular Melee Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Vehicular Melee Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ".65MW Plasma Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".65MW Plasma Lance",
              ":classification",
              "Huge Melee",
              ":energy",
              "1.95MJ",
              ":modifiers",
              "Energy"
            ),
            "Giant Armor Blades",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Armor Blades"
            ),
            "Giant Armor Spikes",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Armor Spikes"
            ),
            "Giant Chain Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Chain Sword"
            ),
            "Giant Explosive Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Explosive Lance"
            ),
            "Giant Extending Arm",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Extending Arm"
            ),
            "Giant Grenade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Grenade"
            ),
            "Giant Haywire Grenade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Haywire Grenade"
            ),
            "Giant Haywire Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Haywire Lance"
            ),
            "Giant Haywire Whip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Haywire Whip"
            ),
            "Giant Heavy Grenade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Heavy Grenade"
            ),
            "Giant Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Lance"
            ),
            "Giant Mace",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Mace"
            ),
            "Giant Morning Star",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Morning Star"
            ),
            "Giant Mauler",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Mauler",
              ":summary",
              "* Giant grinding melee weapon"
            ),
            "Giant Net Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Net Gun"
            ),
            "Giant Spike Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Spike Gun"
            ),
            "Giant Vibroaxe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Vibroaxe"
            ),
            "Giant Vibroblade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Vibroblade"
            ),
            "Giant Vibroclaws",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Vibroclaws"
            ),
            "Giant Vibrorapier",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Vibrorapier"
            ),
            "Giant Vibrosword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Vibrosword"
            ),
            "Giant Whip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Giant Whip"
            )
          )
        ),
        "Futuristic Weapons of Mass Destruction",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Futuristic Weapons of Mass Destruction",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Spinal Nava Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spinal Nava Cannon"
            ),
            "Spinal Rail Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spinal Rail Gun"
            ),
            "Spinal Wave Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spinal Wave Cannon",
              ":summary",
              "* An enormously powerful energy cannon capable of enormous damage over a large area.",
              ":titles",
              "Death Star Cannon, Wave Motion Gun"
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Star Mine",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Mine",
              ":summary",
              "* Star Mines are basically Star Torpedoes that have been left floating in space near likely enemy traffic. The mines are smart and will only attack selected targets and can act as spy satellites by transmitting what their sensors are picking up. When given the order, the Star Mine rockets off toward its victim. Though inefficient in space because of the vast distances, they still can be effective by limiting an opponent's options or when used as traps at key locations.",
              ":titles",
              "Space Mine"
            ),
            "Sentry Spy Satellite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sentry Spy Satellite",
              ":summary",
              "* Sentry Spy Satellites are small disposable surveillence satellites that are hidden in asteroid or debris fields to monitor activity and transmit that information back home. They are sometimes armed with a Star Torpedo for a surprise attack."
            ),
            "Star Torpedo",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Star Torpedo",
              ":summary",
              "* Star Torpedoes carry Nuclear weapons (tactical or greater). In space, nuclear weapons produce no shockwave, just intense radiation. Even direct hits are not guaranteed to pierce the diamond hard ceramic armor of modern warships, so penetration is critical."
            ),
            "Colony Drop",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Colony Drop",
              ":reference",
              "Mobile Suit Gundam"
            ),
            "Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Planet Bomb",
              ":reference",
              "Star Blazers, Starship Troopers",
              ":summary",
              "* Asteroids or comets redirected to fall on a planet."
            ),
            "Plague Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Plague Planet Bomb",
              ":summary",
              "* An enormous, genocidal planet bomb that releases a series of infectious diseases to infect a population. Victims do not immediately show signs of infection to maximize the contagion and paranoia."
            ),
            "Rage Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Rage Planet Bomb",
              ":summary",
              "* An enormous, genocidal planet bomb that releases a series of parasites that turns infected creatures into rabid killers who spread the infection."
            ),
            "Famine Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Famine Planet Bomb",
              ":summary",
              "* An enormous, genocidal planet bomb that releases a series of diseases that attack the food harvest of a planet attempting to break the food chain and cause mass starvation or force compliance."
            ),
            "Pestilence Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pestilence Planet Bomb",
              ":summary",
              "* An enormous, genocidal planet bomb that releases a series of parasites that infect insects, birds, and vermin. These creatures gain accelerated reproduction and high aggression to attack food supplies and the general population."
            ),
            "Terraforming Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Terraforming Planet Bomb",
              ":reference",
              "Genesis - Star Trek II"
            ),
            "Hellbore Planet Bomb",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hellbore Planet Bomb",
              ":summary",
              "* A missile that detonates a series of shaped nuclear blasts to tunnel into a geological fault or a volcano where it attempts to cause a massive natural disaster."
            ),
            "Planet Buster",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Planet Buster",
              ":reference",
              "Anti-Matter Missile - Star Blazers",
              ":summary",
              "* A missile designed to be part of a massive bombardment to shatter a planet's crust and return it to a molten state. Already unstable planets may break up into rubble."
            ),
            "Starkiller Missile",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Starkiller Missile",
              ":reference",
              "Sunshine",
              ":summary",
              "* A missile designed to be part of a massive bombardment to disrupt the nuclear chain reaction in a star. This can result in massive solar flares, a cooling of the star, or cause the star to go nova depending on the age and size of the star."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_combat_overview
   * @return {chapter}
   */
  static t_chapter_combat_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_combat_overview = {
    vx_type: nx_tactics_books_combat.t_chapter_combat_overview
  }

  // (func chapter_combat_overview)
  static f_chapter_combat_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Combat Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics:Combat",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics:Combat",
          ":reference",
          "* Nothing is softer than water, yet water can defeat rock. It does not fight. It flows around the opponent... The true master lies within. Only you can free him. - Forbidden Kingdom"
        ),
        "Rate of Fire",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Rate of Fire",
          ":summary",
          "* Fully-Automatic Weapons - These weapons fire continuously as long as the trigger is held down, or until they run out of ammunition, or until the barrel warps from the heat.\n* Burst Weapons - This is usually a setting on Fully-Automatic Weapons that fires a number of shots, roughly 3, each time the trigger is pulled. This is a compromise between Fully and Semi-Automatic Modes.\n* Semi-Automatic weapons - These weapons are generally capable of fully automatic fire, but are limited to fire a single shot each time the trigger is pulled. As such, they are limited to the shooter's ability to pull the trigger, generally once every second."
        ),
        "Aiming and Range",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Aiming and Range",
          ":summary",
          "* It takes 3 seconds to aim a weapon at a target.\n* Range - Each 50m range takes an additional 1 second to aim. Pistols incur -1 Attack per 50m. Rifles incur -1 Attack per 100m.\n* Aiming with a Scope - Using a scope triples the aim time and the effective range."
        )
      )
    )
    return output
  }

  /**
   * @function chapter_early_weaponry
   * @return {chapter}
   */
  static t_chapter_early_weaponry = {
    vx_type: vx_core.t_type
  }
  static e_chapter_early_weaponry = {
    vx_type: nx_tactics_books_combat.t_chapter_early_weaponry
  }

  // (func chapter_early_weaponry)
  static f_chapter_early_weaponry() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Early Weaponry",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Early Armor",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Early Armor",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Bezainted",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bezainted"
            ),
            "Breast Plate",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Breast Plate",
              ":summary",
              "* [Hit Location]: Shoulders Chest Abdomen Vitals",
              ":armor",
              "1mm"
            ),
            ":Brigandine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brigandine"
            ),
            "Bronze Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bronze Armor",
              ":summary",
              "* Bronze Cuirass, Helmet, Greaves",
              ":armor",
              "1mm"
            ),
            "Chain Mail Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chain Mail Armor",
              ":reference",
              "* Shark expert and underwater filmmaker Valerie Taylor was among the first to develop and test shark suits in 1979 while diving with sharks.\n* Mail is widely used in industrial settings as shrapnel guards and splash guards in metal working operations.\n* Electrical applications for mail include RF leakage testing and being worn as a Faraday cage suit by tesla coil enthusiasts and high voltage electrical workers.",
              ":summary",
              "* Chain mail is a type of armor consisting of small metal rings linked together in a pattern to form a mesh. It was generally in common military use between the 3rd century BC and the 16th century AD in Europe, and longer in Asia and North Africa.",
              ":titles",
              "Chainmail, Mail, Byrnie, Hauberk",
              ":armor",
              "1mm"
            ),
            "Chain Mail Shirt",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chain Mail Shirt",
              ":summary",
              "* [Hit Location]: Shoulders Chest Abdomen Vitals",
              ":titles",
              "Chainmail, Mail",
              ":armor",
              "1mm"
            ),
            ":Cuirbouilli",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cuirbouilli"
            ),
            ":Jazeraint",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Jazeraint"
            ),
            "Laminated Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Laminated Armor",
              ":armor",
              "1mm"
            ),
            "Leather Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Leather Armor",
              ":armor",
              "0mm"
            ),
            "Leather Pants",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Leather Pants",
              ":armor",
              "0mm"
            ),
            "Leather Shirt",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Leather Shirt",
              ":armor",
              "0mm"
            ),
            "Leather Vest",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Leather Vest",
              ":armor",
              "0mm"
            ),
            "Padded Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Padded Armor",
              ":armor",
              "0mm"
            ),
            "Plate Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Plate Armor",
              ":armor",
              "3mm"
            ),
            ":Platemail",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Platemail",
              ":armor",
              "2mm"
            ),
            "Quilted Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Quilted Armor",
              ":armor",
              "0mm"
            ),
            ":Ringmail",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ringmail",
              ":armor",
              "1mm"
            ),
            ":Scalemail",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scalemail",
              ":armor",
              "2mm"
            ),
            "Scale Barding",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scale Barding",
              ":armor",
              "2mm"
            ),
            "Splint Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Splint Armor",
              ":titles",
              "Lamellar",
              ":armor",
              "2mm"
            ),
            "Studded Leather Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Studded Leather Armor",
              ":armor",
              "0mm"
            )
          )
        ),
        ":Shields",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Shields",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Buckler",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Buckler",
              ":classification",
              "Shield",
              ":armor",
              "1"
            ),
            "Kite Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Kite Shield",
              ":classification",
              "Shield",
              ":armor",
              "2"
            ),
            "Legionary Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Legionary Shield",
              ":classification",
              "Shield",
              ":armor",
              "2"
            ),
            "Round Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Round Shield",
              ":titles",
              "Hoplon Round Shield, Target Shield",
              ":classification",
              "Shield",
              ":armor",
              "2"
            ),
            ":Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shield",
              ":titles",
              "Aegis, Heater",
              ":classification",
              "Shield",
              ":armor",
              "2"
            ),
            "Tower Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tower Shield",
              ":titles",
              "Hoplite Shield",
              ":classification",
              "Shield",
              ":armor",
              "3"
            ),
            "Wicker Shield",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wicker Shield",
              ":classification",
              "Shield"
            )
          )
        ),
        ":Axes",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Axes",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Battle Axe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Battle Axe",
              ":titles",
              "Fasces, Sagaris",
              ":energy",
              "100J"
            ),
            "Double-Headed Axe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Double-Headed Axe",
              ":titles",
              "Labrys, Pelekus",
              ":energy",
              "200J"
            ),
            "Hand Axe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hand Axe",
              ":titles",
              "Hachet",
              ":energy",
              "50J"
            ),
            ":Pick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pick"
            ),
            ":Scythe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scythe"
            ),
            ":Sickle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sickle",
              ":titles",
              "Kama"
            ),
            "Throwing Axe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Throwing Axe",
              ":titles",
              "Francisca"
            )
          )
        ),
        "Close Combat Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Close Combat Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Bagh Nakh",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bagh Nakh",
              ":titles",
              "Tiger Claw"
            ),
            "Brass Knuckles",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brass Knuckles"
            ),
            ":Cestus",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cestus"
            ),
            ":Garotte",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Garotte"
            ),
            ":Gauntlet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Gauntlet"
            ),
            ":Nekode",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nekode",
              ":titles",
              "Claw"
            ),
            ":Sap",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sap",
              ":titles",
              "Blackjack"
            )
          )
        ),
        ":Clubs",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Clubs",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Baton",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Baton"
            ),
            "Bo Stick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bo Stick"
            ),
            ":Club",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Club"
            ),
            ":Cudgel",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cudgel"
            ),
            ":Jitte",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Jitte"
            ),
            "Jo Stick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Jo Stick"
            ),
            ":Nightstick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nightstick"
            ),
            ":Quarterstaff",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Quarterstaff",
              ":reference",
              "* Held at the bottom like a polearm. not in the middle. Holding in the middle was invented by the Boy Scouts in Victorian times for sport fighting."
            ),
            ":Shillelagh",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shillelagh"
            ),
            ":Tonfa",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tonfa"
            ),
            ":Truncheon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Truncheon"
            )
          )
        ),
        "Flexible Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Flexible Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Bola",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bola"
            ),
            ":Bullwhip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bullwhip"
            ),
            ":Chain",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chain"
            ),
            "Chain Whip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chain Whip"
            ),
            ":Flail",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flail"
            ),
            ":Kusari",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Kusari"
            ),
            ":Lasso",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lasso"
            ),
            ":Manriki",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Manriki"
            ),
            ":Net",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Net"
            ),
            ":Noose",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Noose"
            ),
            ":Nunchaku",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nunchaku",
              ":energy",
              "100J"
            ),
            "Pole Lasso",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pole Lasso"
            ),
            "Rope and Rocks",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rope and Rocks",
              ":titles",
              "Surujin",
              ":energy",
              "100J"
            ),
            "Rope Dart",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rope Dart",
              ":energy",
              "50J"
            ),
            "Sickle and Chain",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sickle and Chain",
              ":titles",
              "Kusarigama",
              ":energy",
              "50J"
            ),
            "Spike and Chain",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spike and Chain"
            ),
            "Three Section Staff",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Three Section Staff",
              ":titles",
              "Sansetsukon",
              ":energy",
              "100J"
            ),
            "Weighted Chain",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Weighted Chain",
              ":titles",
              "Meteor Hammer"
            ),
            ":Whip",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Whip"
            ),
            "Whip Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Whip Sword",
              ":titles",
              "Urumi"
            )
          )
        ),
        ":Hammers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Hammers",
          ":reference",
          "Mjolnir - Thor's Hammer",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Bec de Corbin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bec de Corbin"
            ),
            ":Godendag",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Godendag"
            ),
            "Holy Water Sprinkler",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Holy Water Sprinkler"
            ),
            "Horseman's pick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Horseman's pick"
            ),
            "Lucerne Hammer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lucerne Hammer"
            ),
            ":Mace",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mace",
              ":energy",
              "100J"
            ),
            ":Mallet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mallet"
            ),
            ":Maul",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Maul"
            ),
            ":Morningstar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Morningstar",
              ":energy",
              "100J"
            ),
            ":Scepter",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scepter",
              ":summary",
              "* +1 [Initimidation]"
            ),
            "Star Mace",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Star Mace",
              ":energy",
              "100J"
            ),
            "Throwing Hammer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Throwing Hammer",
              ":energy",
              "50J"
            ),
            "War Hammer",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "War Hammer",
              ":energy",
              "100J"
            )
          )
        ),
        ":Knives",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Knives",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Bundi",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bundi",
              ":energy",
              "50J"
            ),
            "Butterfly Knife",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Butterfly Knife",
              ":titles",
              "Balisong",
              ":energy",
              "50J"
            ),
            ":Cinqueda",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cinqueda",
              ":energy",
              "50J"
            ),
            ":Dagger",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dagger",
              ":energy",
              "50J"
            ),
            ":Dirk",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dirk",
              ":energy",
              "50J"
            ),
            "Hunting Knife",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hunting Knife",
              ":energy",
              "50J"
            ),
            ":Knife",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Knife",
              ":energy",
              "50J"
            ),
            ":Kris",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Kris",
              ":energy",
              "50J"
            ),
            "Main Gauche",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Main Gauche"
            ),
            ":Sai",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sai",
              ":energy",
              "50J"
            ),
            ":Stake",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Stake",
              ":energy",
              "50J"
            ),
            ":Stiletto",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Stiletto",
              ":energy",
              "50J"
            ),
            ":Switchblade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Switchblade",
              ":energy",
              "50J"
            ),
            "Throwing Knife",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Throwing Knife",
              ":energy",
              "50J"
            )
          )
        ),
        ":Polearms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Polearms",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Bill-Guisarme",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bill-Guisarme",
              ":energy",
              "200J"
            ),
            ":Glaive",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Glaive",
              ":summary",
              "A glaive is a European polearm weapon, consisting of a single-edged blade on the end of a pole. It is similar to the Japanese naginata and the Chinese Guan Dao. Typically, the blade was around 45 cm (18 inches) long, on the end of a pole 2 m (6 or 7 feet) long, and the blade was affixed in a socket-shaft configuration similar to an axe head, rather than having a tang like a sword or naginata,",
              ":titles",
              "Guan Dao",
              ":energy",
              "200J"
            ),
            ":Glaive-Guisarme",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Glaive-Guisarme",
              ":energy",
              "200J"
            ),
            ":Halberd",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Halberd",
              ":titles",
              "Halberdier",
              ":energy",
              "200J"
            ),
            ":Naginata",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Naginata",
              ":energy",
              "200J"
            ),
            ":Poleaxe",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Poleaxe",
              ":energy",
              "200J"
            ),
            ":Ranseur",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ranseur",
              ":energy",
              "200J"
            ),
            ":Spetum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spetum",
              ":energy",
              "200J"
            ),
            ":Voulge-Guisarme",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Voulge-Guisarme",
              ":energy",
              "200J"
            )
          )
        ),
        ":Spears",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Spears",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Atlatl",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Atlatl",
              ":summary",
              "* Dart-thrower\n* An atlatl dart is capable of killing even the largest of animals at any distance that its thrower is capable of accurately reaching since more power is applied to longer shots than shorter shots.",
              ":range",
              "20m"
            ),
            ":Bayonet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bayonet",
              ":classification",
              "Spear",
              ":energy",
              "100J"
            ),
            ":Javelin",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Javelin",
              ":classification",
              "Spear",
              ":energy",
              "198J",
              ":mass",
              "3kg",
              ":modifiers",
              "Indirect Fire, Piercing",
              ":range",
              "18m"
            ),
            ":Lance",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Lance",
              ":titles",
              "Couched Lance",
              ":classification",
              "Spear",
              ":energy",
              "300J",
              ":length",
              "2.5m",
              ":modifiers",
              "Reach, Piercing"
            ),
            ":Pike",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pike",
              ":titles",
              "Pikeman",
              ":classification",
              "Spear",
              ":energy",
              "200J",
              ":length",
              "4m",
              ":modifiers",
              "Reach, Piercing"
            ),
            ":Pilum",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pilum",
              ":reference",
              "* When once fixed in the shield it was impossible to draw them out, and when thrown with force and skill, they penetrated the cuirass without difficulty. - Roman writer Vegtius",
              ":summary",
              "* The pilum was designed to be armour-piercing: the pyramidal head would punch a small hole through an enemy shield allowing the thin shank to pass through and penetrate a distance sufficient to hit the target. A pilum, having penetrated a shield through a small hole and its shank having bent would now be difficult to remove. It is likely that the shaft would hit the ground and thus stop the charging enemy in his tracks. An enemy, if not killed by the pilum, would have little time before closing with the legionaries and would have to discard his now-unwieldy shield before going into combat. Additionally, bent pila would be less suitable for reuse by a resourceful opponent.",
              ":classification",
              "Spear",
              ":energy",
              "100J",
              ":mass",
              "3kg",
              ":modifiers",
              "Indirect Fire, Piercing",
              ":range",
              "18m"
            ),
            ":Spear",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Spear",
              ":classification",
              "Spear",
              ":energy",
              "100J",
              ":modifiers",
              "Reach, Piercing"
            ),
            ":Trident",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Trident",
              ":classification",
              "Spear",
              ":energy",
              "100J",
              ":modifiers",
              "Reach, Piercing"
            )
          )
        ),
        ":Swords",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Swords",
          ":summary",
          "All swords have the Bleeding modifier.",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Backsword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Backsword",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            "Bastard Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bastard Sword",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Bokken",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bokken",
              ":classification",
              "Sword"
            ),
            ":Broadsword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Broadsword",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            "Butterfly Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Butterfly Sword",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            "Cavalry Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cavalry Sword",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Cutlass",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cutlass",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Epee",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Epee",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Falchion",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Falchion",
              ":summary",
              "* A short, cleaving sword for close-in combat used by many troops including archers.",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Foil",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Foil",
              ":classification",
              "Sword",
              ":energy",
              "50J"
            ),
            "Great Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Great Sword",
              ":titles",
              "Two-handed Sword",
              ":classification",
              "Sword",
              ":energy",
              "200J",
              ":modifiers",
              "Bleeding"
            ),
            "Hook Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hook Sword",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Katana",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Katana",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Katar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Katar",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Longsword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Longsword",
              ":summary",
              "[Fight]: [Melee]\n[Damage]:10x1 [Pierce] [Slash]",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Ninjato",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ninjato",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":No-Dachi",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "No-Dachi",
              ":classification",
              "Sword",
              ":energy",
              "200J"
            ),
            ":Rapier",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rapier",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding, Piercing"
            ),
            ":Saber",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Saber",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Scimitar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Scimitar",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            "Short Sword",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Short Sword",
              ":classification",
              "Sword",
              ":energy",
              "100J",
              ":modifiers",
              "Bleeding"
            ),
            ":Tanto",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tanto",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            ),
            ":Wakizashi",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wakizashi",
              ":classification",
              "Sword",
              ":energy",
              "100J"
            )
          )
        ),
        ":Archery",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Archery",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_itemlist(
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Composite Bow",
              ":summary",
              "* [Fight]: [Ranged]\n* [Damage]: 10x1 [Pierce] [Slash]\n* [Range]: 10x1 100m/300ft\n* [Location]: [2-hand]\n* The main advantage of composite bows over self bows (made from a single piece of wood) is their combination of smaller size with high power. They are more suitable for use from horseback or chariot.\n* Constructing composite bows requires much more time and materials than self bows, and the animal glue traditionally used can lose strength in humid conditions and be quickly ruined by submersion. For most practical non-mounted archery purposes, composite construction offers no advantage; 'the initial velocity is about the same for all types of bow, the design parameters appear to be less important than is often claimed.' However, their compact size make them superior for horsemen.",
              ":energy",
              "170J"
            ),
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Compound Bow"
            ),
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Longbow",
              ":titles",
              "Daikyu",
              ":summary",
              "* [Fight]: [Ranged]\n* [Damage]: 10x1 [Pierce] [Slash]\n* [Range]: 10x1 100m/300ft\n* [Location]: [2-hand]",
              ":energy",
              "156J"
            ),
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shortbow",
              ":image",
              "images/cards/item-shortbow.svg",
              ":titles",
              "Hankyu, Recurve Bow",
              ":reference",
              "Can fire about 6 aimed shots or 12 unaimed shots per minute.",
              ":summary",
              "* [Fight]: [Ranged]\n* [Damage]: 8x1 [Pierce] [Slash]\n* [Range]: 2x1 20m/60ft\n* [Location]: [2-hand]\n* [Shots]: 0 Max:1\n* [Reload]: [Action]",
              ":energy",
              "80J",
              ":body",
              "10x-1",
              ":mass",
              "1kg/2lb"
            )
          )
        ),
        ":Crossbows",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Crossbows",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Hand Crossbow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hand Crossbow"
            ),
            "Heavy Crossbow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heavy Crossbow",
              ":energy",
              "147J",
              ":modifiers",
              "Piercing"
            ),
            "Light Crossbow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Crossbow",
              ":energy",
              "100J",
              ":modifiers",
              "Piercing"
            ),
            "Repeating Crossbow",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Repeating Crossbow"
            )
          )
        ),
        "Thrown Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Thrown Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Baseball",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Baseball",
              ":energy",
              "100J"
            ),
            ":Blowgun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blowgun"
            ),
            "Blown Needles",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Blown Needles",
              ":summary",
              "* Similar to a blowgun, these are tiny poison needles held in the mouth and blown at nearby opponents.",
              ":titles",
              "Fukimi-bari"
            ),
            ":Boomerang",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Boomerang"
            ),
            ":Caltrop",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Caltrop"
            ),
            ":Chakram",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Chakram",
              ":summary",
              "* Sharp edged rings used extensively in ancient India. They are carried in large numbers and are thrown at short range from infantry, horses, or elephants."
            ),
            ":Dart",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dart"
            ),
            ":Football",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Football"
            ),
            "Hunga Munga",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hunga Munga"
            ),
            "Improvised Weapons",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Improvised Weapons"
            ),
            ":Shuriken",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Shuriken"
            ),
            "Skipping Stone",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Skipping Stone"
            ),
            ":Sling",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sling"
            ),
            "Sling Staff",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Sling Staff"
            )
          )
        ),
        "Siege Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Siege Weapons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Arbalest",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Arbalest"
            ),
            ":Ballista",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Ballista"
            ),
            "Battering Ram",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Battering Ram"
            ),
            "Boiling Oil",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Boiling Oil"
            ),
            ":Catapult",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Catapult"
            ),
            ":Escalade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Escalade",
              ":titles",
              "Siege Ladders"
            ),
            "Greek Fire",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Greek Fire",
              ":titles",
              "Liquid Fire, Wildfire"
            ),
            ":Mangonel",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mangonel"
            ),
            ":Onager",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Onager"
            ),
            "Siege Hook",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Siege Hook"
            ),
            "Siege Tower",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Siege Tower"
            ),
            ":Springal",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Springal"
            ),
            ":Trebuchet",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Trebuchet"
            )
          )
        ),
        "Early Firearms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Early Firearms",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Matchlock Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Matchlock Pistol",
              ":summary",
              "1400s"
            ),
            "Matchlock Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Matchlock Rifle",
              ":summary",
              "1400s"
            ),
            "Wheellock Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wheellock Pistol",
              ":summary",
              "1500s"
            ),
            "Wheellock Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Wheellock Rifle",
              ":summary",
              "1500s"
            ),
            "Flintlock Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flintlock Pistol",
              ":summary",
              "1600s"
            ),
            "Flintlock Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Flintlock Rifle",
              ":summary",
              "1600s"
            ),
            "Dueling Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dueling Pistol",
              ":summary",
              "1770"
            ),
            "Brown Bees Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Brown Bees Rifle",
              ":summary",
              "1700s"
            ),
            "Percussion Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Percussion Pistol",
              ":summary",
              "1800s"
            ),
            "Percussion Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Percussion Rifle",
              ":summary",
              "1800s"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_example_of_play
   * @return {chapter}
   */
  static t_chapter_example_of_play = {
    vx_type: vx_core.t_type
  }
  static e_chapter_example_of_play = {
    vx_type: nx_tactics_books_combat.t_chapter_example_of_play
  }

  // (func chapter_example_of_play)
  static f_chapter_example_of_play() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Example of Play",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Street Fight",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Street Fight"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_modern_equipment
   * @return {chapter}
   */
  static t_chapter_modern_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_equipment = {
    vx_type: nx_tactics_books_combat.t_chapter_modern_equipment
  }

  // (func chapter_modern_equipment)
  static f_chapter_modern_equipment() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Modern Equipment",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Modern Armor",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Armor",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Bulletproof Vest",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bulletproof Vest",
              ":titles",
              "Kevlar Vest"
            ),
            "Bulletproof Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bulletproof Armor",
              ":titles",
              "Flak Jacket, Kevlar Armor"
            ),
            "Doorgunner Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Doorgunner Armor"
            ),
            "Model Y Bulletproof Vest",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Model Y Bulletproof Vest"
            ),
            "Interceptor Body Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Interceptor Body Armor"
            ),
            "Dragon Skin Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dragon Skin Armor"
            ),
            "SARCOS Exoskeleton",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "SARCOS Exoskeleton"
            )
          )
        ),
        "Modern Explosives",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Explosives",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":C4",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "C4"
            ),
            "Improvised Explosive Device (IED)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Improvised Explosive Device (IED)"
            ),
            "White Phosphorous Grenade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "White Phosphorous Grenade"
            )
          )
        ),
        "Modern Pistols",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Pistols",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Air Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Air Pistol",
              ":summary",
              "* Can discharge Paintballs or small amounts of other chemicals."
            ),
            ".22 Holdout Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".22 Holdout Pistol"
            ),
            ".22 Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".22 Automatic Pistol",
              ":titles",
              "Ruger MkII"
            ),
            "5mm Needler Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "5mm Needler Pistol"
            ),
            ".38 Revolver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".38 Revolver",
              ":titles",
              ".38 Special, .38 Derringer, .38 Llama Comanche",
              ":classification",
              "Pistol",
              ":energy",
              "319J",
              ":muzzlevelocity",
              "300m/s"
            ),
            ".38 Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".38 Automatic Pistol",
              ":titles",
              "Walther PPK-S",
              ":classification",
              "Pistol"
            ),
            "9mm Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "9mm Automatic Pistol",
              ":titles",
              "Glock 17L, Browning 9mm, Baretta 92, Calico M-950, H&amp;K P9S, SIG/SAUER P226, S&amp;P ASP",
              ":classification",
              "Pistol",
              ":energy",
              "518J",
              ":muzzlevelocity",
              "360m/s",
              ":range",
              "50m"
            ),
            "9mm Machine Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "9mm Machine Pistol",
              ":titles",
              "H&amp;K MP5K, Steyer TMP, Tactical Machine Pistol, Micro-Uzi",
              ":classification",
              "Pistol",
              ":muzzlevelocity",
              "380m/s",
              ":range",
              "100m",
              ":rof",
              "850/min"
            ),
            ".357 Desert Eagle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".357 Desert Eagle"
            ),
            ".357 Magnum Revolver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".357 Magnum Revolver",
              ":reference",
              "* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds.",
              ":titles",
              "Colt Python",
              ":classification",
              "Pistol",
              ":energy",
              "778J",
              ":muzzlevelocity",
              "430m/s"
            ),
            "10mm Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "10mm Automatic Pistol",
              ":titles",
              "Glock 20, S&amp;W 1006",
              ":classification",
              "Pistol"
            ),
            ".40 Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".40 Automatic Pistol",
              ":titles",
              "SIG/SAUER P229",
              ":classification",
              "Pistol"
            ),
            ".41 Magnum Revolver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".41 Magnum Revolver",
              ":titles",
              "S &amp;W Model 57",
              ":classification",
              "Pistol"
            ),
            ".45 Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".45 Automatic Pistol",
              ":titles",
              "AMT Automag, Colt M1911A, LAR Grizzly",
              ":classification",
              "Pistol",
              ":energy",
              "410J"
            ),
            ".44 Magnum Revolver",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".44 Magnum Revolver",
              ":titles",
              "Colt Anaconda, Ruger Super Redhawk",
              ":classification",
              "Pistol",
              ":energy",
              "1524J",
              ":muzzlevelocity",
              "460m/s"
            ),
            ".50 Automatic Pistol",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".50 Automatic Pistol",
              ":titles",
              "MRI Desert Eagle",
              ":classification",
              "Pistol",
              ":energy",
              "2000J",
              ":muzzlevelocity",
              "460m/s"
            ),
            ":Taser",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Taser",
              ":energy",
              ".3J"
            )
          )
        ),
        "Modern Rifles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Rifles",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "12-gauge Double Barrelled Shotgun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "12-gauge Double Barrelled Shotgun",
              ":reference",
              "* Alright you primitive screwheads. Listen up. See this. This is my... BOOMSTICK! Its a 12-guage Double Barrelled Remington. S-Mart's top of the line. You can find it in the sporting goods department. That's right, this sweet baby was made in Grand Rapids, Michigan. Retails for about $109.95. It's got a walnut stock, cobalt blue steel, and a hair trigger. That's right. Shop smart. Shop S-Mart. YOU GOT THAT?! - Ash, Army of Darkness",
              ":energy",
              "3724J",
              ":muzzlevelocity",
              "1680m/s"
            ),
            "12-gauge Sawed Off Shotgun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "12-gauge Sawed Off Shotgun",
              ":energy",
              "3724J",
              ":muzzlevelocity",
              "1680m/s"
            ),
            "12-gauge Pump Shotgun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "12-gauge Pump Shotgun",
              ":titles",
              "Entry Team Striker, Franchi SPAS-12, Jackhammer Mk 3A-2, Mossberg M500, Remington 870P, Street Sweeper 870P, USAS-12",
              ":energy",
              "3724J",
              ":muzzlevelocity",
              "1680m/s"
            ),
            "12-gauge Tactical Shotgun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "12-gauge Tactical Shotgun"
            ),
            ".22 Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".22 Rifle",
              ":titles",
              "Calico M-105"
            ),
            "5.56mm Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "5.56mm Rifle",
              ":titles",
              "Colt Sporter Delta"
            ),
            "5.56mm Assault Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "5.56mm Assault Rifle",
              ":titles",
              "Colt M-16A1, L85A1, Steyr AUG",
              ":energy",
              "1767J",
              ":muzzlevelocity",
              "940m/s"
            ),
            ".30-06 Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".30-06 Rifle"
            ),
            ".30-06 Semi-Automatic Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".30-06 Semi-Automatic Rifle"
            ),
            "7.62mm Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm Rifle",
              ":titles",
              "Galil Sniper Rifle, Steyr SSG-69, SVD Dragunov, Walther WA-2000 Sniper"
            ),
            "7.62mm Assault Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm Assault Rifle",
              ":titles",
              "AR-15, M-16, AK-47, FN-FAL",
              ":energy",
              "3504J",
              ":muzzlevelocity",
              "850m/s"
            ),
            "7.62mm M24 Sniper Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm M24 Sniper Rifle"
            ),
            ".45 Elephant Gun",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".45 Elephant Gun",
              ":titles",
              "H&amp;H African, Nitro Express",
              ":energy",
              "6470J",
              ":muzzlevelocity",
              "660m/s"
            ),
            ".50 Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".50 Rifle",
              ":titles",
              "McMillan M-87"
            ),
            "Combat Flamethrower",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Combat Flamethrower"
            )
          )
        ),
        "Modern Machine Guns",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Machine Guns",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "30mm GAU-8 Avenger",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "30mm GAU-8 Avenger",
              ":length",
              "5m",
              ":mass",
              "281kg",
              ":muzzlevelocity",
              "1000m/s",
              ":range",
              "1500m",
              ":rof",
              "4200/min",
              ":rounds",
              "1174"
            ),
            ".32 Submachine Gun (SMG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".32 Submachine Gun (SMG)",
              ":titles",
              "Skorpion M-61"
            ),
            "9mm Submachine Gun (SMG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "9mm Submachine Gun (SMG)",
              ":titles",
              "Uzi, H&amp;K MP5, Intratec TEC-9, Spectre M-4",
              ":muzzlevelocity",
              "400m/s",
              ":range",
              "200m",
              ":rof",
              "600/min"
            ),
            ".45 Submachine Gun (SMG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".45 Submachine Gun (SMG)",
              ":titles",
              "Ingram MAC-10"
            ),
            ".45 Machine Gun (MG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".45 Machine Gun (MG)",
              ":titles",
              "Thomson Machine Gun, Tommy Gun",
              ":muzzlevelocity",
              "280m/s",
              ":range",
              "50m",
              ":rof",
              "800/min"
            ),
            "7.62mm Machine Gun (MG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm Machine Gun (MG)",
              ":titles",
              "M-60"
            ),
            ".30-06 Machine Gun (MG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".30-06 Machine Gun (MG)"
            ),
            "7.62mm Minigun (MG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "7.62mm Minigun (MG)",
              ":summary",
              "* An infantry support weapon that can be adapted for vehicular use on a pintle mount. While it is useful against infantrymen, it is nearly worthless against vehicles, even unarmored ones.",
              ":titles",
              "M134",
              ":energy",
              "3504J",
              ":muzzlevelocity",
              "850m/s",
              ":rof",
              "4000/min"
            ),
            ".50 Heavy Machine Gun (HMG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              ".50 Heavy Machine Gun (HMG)",
              ":summary",
              "* The heaviest of infantry weapons, the heavy machine gun must be mounted on a bipod, tripod, or pintle.  The HMG is effective only against infantry and light armored vehicles."
            )
          )
        ),
        "Modern Cannons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Cannons",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Liquid Sprayer Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Liquid Sprayer Cannon",
              ":summary",
              "* Can dispense Water, Fire Retardant Foam, Cleaning Solvent or other more frightening solutions."
            ),
            "15mm Very Light Cannon (VLC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "15mm Very Light Cannon (VLC)",
              ":summary",
              "* The VLC is designed as a backup weapon for light scouting vehicles. Its shell can pierce the armor of other light vehicles but not much else. Its simple design makes it light, affordable, and easy to maintain."
            ),
            "15mm Very Light Recoilless Cannon (VLC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "15mm Very Light Recoilless Cannon (VLC)"
            ),
            "15mm Very Light Autocannon (VLAC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "15mm Very Light Autocannon (VLAC)",
              ":summary",
              "* The VLAC lies somewhere between a heavy infantry machinegun and a vehicle mounted autocannon. Though its armor piercing shells are not particularly good against infantry, it is a perfect backup anti-armor weapon for a light vehicle."
            ),
            "20mm Light Cannon (LC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Light Cannon (LC)",
              ":summary",
              "* The Light Cannon is a simpler version of the Light Autocannon. It lacks automatic fire, but it more affordable, more accurate, and has a longer range."
            ),
            "20mm Light Recoilless Cannon (LRC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Light Recoilless Cannon (LRC)"
            ),
            "20mm Light Autocannon (LAC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Light Autocannon (LAC)",
              ":summary",
              "* Light Autocannons are popular weapons combining a high rate of fire with significant penetration."
            ),
            "Light Flame Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Flame Cannon",
              ":summary",
              "* Flame Cannons are vehicular flamethrowers that spray burning liquid in a wide arc. They are most effective against soft targets, but the heat generated from sustained fire can damage even heavily armored targets. It is also capable of indirect fire."
            ),
            "30mm Medium Cannon (MC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "30mm Medium Cannon (MC)",
              ":summary",
              "* The Medium Cannon is a simpler version of the Medium Autocannon. It lacks automatic fire, but it is more affordable, more accurate, and has a longer range."
            ),
            "30mm Medium Recoilless Cannon (MRC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "30mm Medium Recoilless Cannon (MRC)",
              ":titles",
              "Bazooka Cannon"
            ),
            "30mm Medium Autocannon (MAC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "30mm Medium Autocannon (MAC)",
              ":reference",
              "* The A-10 Thunderbolt's main weapon.",
              ":summary",
              "* Medium Autocannons are nearly as popular as Light Autocannons.  They sacrifice some fire rate for higher damage and range."
            ),
            "Medium Flame Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medium Flame Cannon"
            ),
            "40mm Heavy Cannon (HC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "40mm Heavy Cannon (HC)",
              ":summary",
              "* The Heavy Cannon can penetrate light tank armor and the 40mm shells can carry a variety of specialized ammunition."
            ),
            "40mm Heavy Recoilless Cannon (HRC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "40mm Heavy Recoilless Cannon (HRC)"
            ),
            "40mm Heavy Autocannon (HAC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "40mm Heavy Autocannon (HAC)",
              ":summary",
              "* The Heavy Autocannon is often the main armament of light tanks. Its high rate of fire tends to preclude the use of most exotic ammunition."
            ),
            "Heavy Flame Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heavy Flame Cannon"
            ),
            "50mm Very Heavy Cannon (VHC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "50mm Very Heavy Cannon (VHC)",
              ":summary",
              "* The Heavy Autocannon is often the main armament of light tanks. Its high rate of fire tends to preclude the use of most exotic ammunition."
            ),
            "50mm Very Heavy Recoilless Cannon (VHRC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "50mm Very Heavy Recoilless Cannon (VHRC)"
            ),
            "50mm Very Heavy Autocannon (VHAC)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "50mm Very Heavy Autocannon (VHAC)",
              ":summary",
              "* The 50mm Autocannon is an electically-driven, multi-tube gattling cannon capable of delivering an awesome amount of ammunition in a very short amount of time. This is typically the largest cannon produced with autofire because of the large amount of space that ammunition takes up."
            ),
            "75mm Very Light Field Gun (VLFG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "75mm Very Light Field Gun (VLFG)",
              ":summary",
              "* The Very Light Field Gun is the smallest of the single-shot, specialized anti-armor, guns. VLFG's are often mounted on gun carriages or defensive bunkers. The VLFG is effective against most medium tanks except against front armor."
            ),
            "90mm Light Field Mortar (LFM)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "90mm Light Field Mortar (LFM)",
              ":summary",
              "* The Mortar Cannon fires low velocity, large caliber High Explosive shells. Their shells have poor penetration but are well suited for indirect fire, suppressive fire, and mass destruction of soft targets."
            ),
            "90mm Light Field Gun (LFG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "90mm Light Field Gun (LFG)",
              ":summary",
              "* The Light Field Gun is a popular main weapon on light and medium tanks. The LFG is effective against most medium tanks."
            ),
            "120mm Smoothbore Cannon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "120mm Smoothbore Cannon",
              ":summary",
              "Fire Armor Piercing Fin Stabalized, Depleted Uranium rounds",
              ":energy",
              "11MJ"
            ),
            "120mm Medium Field Gun (MFG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "120mm Medium Field Gun (MFG)",
              ":summary",
              "* The Medium Field Gun is a popular main weapon on heavy tanks.  The LFG is effective against most heavy tanks."
            ),
            "120mm Medium Field Mortar (MFM)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "120mm Medium Field Mortar (MFM)"
            ),
            "140mm Heavy Field Gun (HFG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "140mm Heavy Field Gun (HFG)",
              ":summary",
              "* The Heavy Field Gun is a used on heavy tank destroyers and main battle tanks. The HFG is effective against most main battle tanks."
            ),
            "140mm Heavy Field Mortar (HFM)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "140mm Heavy Field Mortar (HFM)"
            ),
            "200mm Very Heavy Field Gun (VHFG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "200mm Very Heavy Field Gun (VHFG)",
              ":summary",
              "* The Very Heavy Field Gun is used in heavy artillery pieces and fixed installations. The VHFG is effective against almost any target.",
              ":titles",
              "Naval Gun"
            )
          ),
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            ":AP",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "AP"
            ),
            ":APFSDS",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "APFSDS"
            ),
            ":HE",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "HE"
            ),
            ":HEAT",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "HEAT"
            ),
            ":HESH",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "HESH"
            )
          )
        ),
        "Modern Portable Explosives",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Portable Explosives",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Hand Grenade",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Hand Grenade",
              ":image",
              "WWIIAmerican/Grenade_MK2.jpg",
              ":reference",
              "* It had a fatality radius of 5m, a blast radius of 13.7m, and fragments can disperse to 213m.\n* At least 5 people have thrown themselves on hand grenades and lived.",
              ":explosive",
              ".057kg",
              ":mass",
              ".6kg",
              ":modifiers",
              "Anti-Personnel, Area",
              ":range",
              "30m"
            ),
            "20mm Light Grenade Launcher",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "20mm Light Grenade Launcher"
            ),
            "50mm Mortar",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "50mm Mortar"
            ),
            "66mm Light Anti-Armor Weapon (LAW)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "66mm Light Anti-Armor Weapon (LAW)",
              ":reference",
              "* M72 LAW",
              ":summary",
              "* One shot anti-tank weapon that can penetrate 250mm.",
              ":length",
              "1m",
              ":mass",
              "2.3kg",
              ":modifiers",
              "HEAT",
              ":range",
              "200m"
            ),
            "84mm Recoilless Rifle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "84mm Recoilless Rifle",
              ":reference",
              "* AT4",
              ":summary",
              "* One shot anti-tank weapon that can penetrate 400mm with HEAT or carry 440g of HE.",
              ":explosive",
              ".440kg",
              ":mass",
              "6.7kg",
              ":modifiers",
              "HEAT",
              ":muzzlevelocity",
              "284m",
              ":range",
              "300m"
            ),
            "Rifle Propelled Grenade (RPG)",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Rifle Propelled Grenade (RPG)"
            ),
            "Plastic Explosive",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Plastic Explosive"
            ),
            "Land Mine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Land Mine"
            ),
            "Smoke Dispenser",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Smoke Dispenser"
            )
          )
        ),
        "Modern Missiles",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Modern Missiles",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "50mm Medium Grenade Launcher",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "50mm Medium Grenade Launcher",
              ":rounds",
              "20"
            ),
            "70mm Heavy Grenade Launcher",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "70mm Heavy Grenade Launcher",
              ":rounds",
              "12"
            ),
            "Light Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "52mm Light Rocket Pod",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "52mm Light Rocket Pod",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Medium Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medium Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "71mm Medium Rocket Pod",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "71mm Medium Rocket Pod",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Heavy Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heavy Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Fuel Air Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fuel Air Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Cluster Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cluster Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "82mm Heavy Rocket Pod",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "82mm Heavy Rocket Pod",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Very Heavy Bomb Rack",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Very Heavy Bomb Rack",
              ":modifiers",
              "HE, INC",
              ":rounds",
              "8"
            ),
            "Missile Pod",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Missile Pod"
            ),
            "Heavy RPG",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heavy RPG",
              ":summary",
              "* Disposable short-range, rocket with shaped charge for armor penetration.",
              ":rounds",
              "1"
            ),
            "Very Heavy RPG",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Very Heavy RPG",
              ":summary",
              "* Disposable short-range, rocket with shaped charge for armor penetration.",
              ":rounds",
              "1"
            ),
            "Light Bombardment Rocket",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Light Bombardment Rocket",
              ":modifiers",
              "HE",
              ":rounds",
              "16"
            ),
            "Medium Bombardment Rocket",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Medium Bombardment Rocket",
              ":modifiers",
              "HE",
              ":rounds",
              "16"
            ),
            "Heavy Bombardment Rocket",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Heavy Bombardment Rocket",
              ":modifiers",
              "HE",
              ":rounds",
              "16"
            ),
            "Anti-Aircraft Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Anti-Aircraft Missile"
            ),
            ":RPG-7",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "RPG-7"
            ),
            ":RPG-29",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "RPG-29",
              ":reference",
              "Iraq 2007, an RPG-29 round penetrated the frontal ERA and hull of a Challenger 2 tank",
              ":summary",
              "Tandem charged HEAT round"
            ),
            "Cruise Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cruise Missile"
            ),
            "SAM Surface To Air Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "SAM Surface To Air Missile",
              ":image",
              "Modern/Missile.png"
            )
          )
        ),
        "Weapons of Mass Destruction",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Weapons of Mass Destruction",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Agent Orange",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Agent Orange"
            ),
            ":Napalm",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Napalm"
            ),
            "Cluster Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cluster Bomb"
            ),
            "Smart Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Smart Bomb"
            ),
            "Block Buster",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Block Buster"
            ),
            "Bunker Buster",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bunker Buster"
            ),
            "Fuel Air Explosive",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fuel Air Explosive"
            ),
            "Naval Mine",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Naval Mine"
            ),
            "Nuclear Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nuclear Bomb"
            ),
            "Fusion Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Fusion Bomb"
            ),
            "Dirty Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Dirty Bomb"
            ),
            "Nerve Gas Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nerve Gas Bomb"
            ),
            ":MIRV",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "MIRV"
            ),
            "Neutron Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Neutron Bomb"
            ),
            "Plague Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Plague Bomb"
            ),
            "Tactical Nuclear Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tactical Nuclear Bomb"
            ),
            "Tactical Nuclear Cruise Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Tactical Nuclear Cruise Missile"
            ),
            "Strategic Nuclear Bomb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Strategic Nuclear Bomb"
            ),
            "Nuclear Cruise Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nuclear Cruise Missile"
            ),
            "Nuclear Ballistic Missile",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Nuclear Ballistic Missile"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_rules
   * @return {chapter}
   */
  static t_chapter_rules = {
    vx_type: vx_core.t_type
  }
  static e_chapter_rules = {
    vx_type: nx_tactics_books_combat.t_chapter_rules
  }

  // (func chapter_rules)
  static f_chapter_rules() {
    let output = nx_tactics_base.e_chapter
    vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Rules",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Levels",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Levels",
          ":reference",
          "* The resistance to penetration of armor is related to the thickness of the steel - 2mm armor required about 3 times as much energy to defeat as 1mm armor.\n* By its apex, hardened steel plate was almost impregnable on the battlefield. Knights were instead increasingly felled by polearms such as the halberd and blunt weapons such as maces or war hammers that could send concussive force through the plate armor resulting in injuries such as broken bones, organ hemorrhage and/or head trauma. Another tactic was to attempt to strike through the gaps between the armor pieces, using daggers, spears and spear points to attack the man-at-arms' eyes or joints.\n* Weight - A full suit of medieval plate is thought to have weighed little more than 60 lb (27 kg) on average, considerably lighter than the equipment often carried by the elite of today's armies. If during the 14-15th centuries armour seldom weighed more than 15kgs, than by the late 16th century it weighed 25kg. The increasing weight and thickness of late 16th century armor therefore gave substantial resistance.\n* Proof - In the early years of pistol and arquebuses, firearms were relatively low in velocity. The full suits of armour, or breast plates actually stopped bullets fired from a modest distance. The front breast plates were, in fact, commonly shot as a test. The impact point would often be encircled with engraving to point it out. This was called the 'proof'. Rather than making plate armour obsolete, the use of firearms stimulated the development of plate armour into its later stages.\n* At the end of the 1800's silk body armor was worn by those who could afford it. The assassination of Arch-Duke Ferdinand that precipitated WWI was wearing silk body armor but was shot in the neck over the armor. A similar vest worn by Alfonso XIII of Spain saved his life in 1901.\n* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds.\n* Club, Axe or Greek sword : 1kg ; used single handed ; 65 joules(48 ft lbs)\n* Club, Axe or Greek sword : 2kg ; used two-handed ; 130 joules(96 foot lbs)\n* Javelin :0.8 kg ; thrown, with run-up; 198 joules(146 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace only; 111 joules(83 ft lbs)\n* Javelin :0.8 kg ; thrown standing; 60 joules(49 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace with loop ; 160 joules(118 ft lbs)\n* Light spear or small sword/dagger :0.8 kg ; close combat ; 30 joules(24 ft lbs)\n* Sarissa :8(?)kg ; two-hand thrust,pace fwd ; 160 joules(118 ft lbs)\n* Spear-butt : various ; thrust down, coup-de-grace; 50 joules (40 ft lbs)\n* Energies of the order of 30-60 joules (24-49 ft lbs) could be given generally to typical Greek Hand weapons, and armour would need to resist this type of thrust, as well as slashing blows up to 60 joules(49 ft lbs)\n* Sling bullet :24g swung one handed ; 30-36 joules(22-27 ft lbs)\n* Light bow 20J at 50m, 15J at 100m, 9J at 200m (sufficient to penetrate flesh)\n* Heavy bow 30J at 50 metres, 26J at 100 metres, 20J at 200 metres\n* Ballistic Armor Level I protects against .22 cal Long Rifle and .38\n* Ballistic Armor Level IIA protects against 9mm Low Velocity and .40 cal\n* Ballistic Armor Level II protects against 9mm and .357 Magnum\n* Ballistic Armor Level IIIA protects against High Velocity 9mm and .44 Magnum\n* Ballistic Armor Level III protects against 7.62 Rifle\n* Ballistic Armor Level IV protects against .30 cal Armor Piercing Rifle\n* All heavy armor penetration values are in mm of steel or equivalent at 30 degrees.\n* The 5.56 AP round penetrates 12mm at 100m.\n* The 7.92 MG round penetrates 13mm at 100m.\n* The 7.62 AP round penetrates 15mm at 300m.\n* .50 cal penetrates 20mm Armor\n* 20mm penetrates 30mm Armor.  It took an average of twenty 20mm hits to shoot down a WWII bomber.\n* 30mm A-10 penetrates 69mm at 500m and 38mm at 1000m.  A 30mm Autocannon could bring down a WWII bomber in 1-3 hits.\n* 40mm Bofors penetrates: 0 yards-2.7in (68mm), 2,000 yards-1.2in (30mm), 4,000 yards-0.60in, 6000 yards-0.45in.\n* 50mm PaK 38 was one of the few early guns capable of effectively penetrating the 45 mm armor of the formidable T-34\n* The PaK 40 penetrates 100mm Armor and was effective against almost every Allied tank until the end of the war.\n* The Panther's 75 mm KwK 42 L/70 penetrates 120mm at 1000m\n* Very few Allied or Soviet weapons could penetrate the Panther's front armor.\n* Pershing's 90mm penetrates 110mm at 1000m\n* The Tiger's 8.8 cm KwK 36 L/56 penetrates 135mm at 1000m.\n* Whereas Panthers were the more serious threat to Allied tanks, Tigers had a bigger psychological effect on  opposing crews, causing a 'Tiger phobia'. Allied tankers would sometimes evade rather than confront a Tiger, even a tank that only looked like one, such as the Panzer IV with turret skirts applied. In the Normandy campaign, it could take four to five Shermans to knock out a single Tiger tank by maneuvering to its weaker flank or rear armor; the Soviet T-34s fared similarly against the German tanks, as had the German PzIII earlier against the Soviet heavy tanks. An accepted Allied tactic was to engage the Tiger as a group, one attracting the attention of the Tiger crew while the others attacked the sides or rear of the vehicle. Since the ammunition and fuel were stored in the sides, a side penetration often resulted in a kill. This was, however, a risky tactic, and often resulted in the loss of several Allied vehicles. It took a great deal of tactical skill to eliminate a Tiger.\n* IS-2's A-19 122mm penetrates 150mm at 1000m and can go through the front and rear armor and the engine block of the German Panther tank.\n* The 17 pounder mounted on the Sherman Firefly was able to penetrate 131mm at 1000 meters, more than sufficient to defeat the German Tiger I and Panther tank at standard combat ranges.\n* Pershing 90mm APCR penetrates 192mm at 1000m\n* The Tiger II/Elefant/PaK43's 8.8 cm KwK 43 penetrates 165mm at 1000m\n* The M4 Sherman was unable to penetrate the front of a Tiger II even at point blank and the M26 Pershing and IS-2 had to come within 1300 m and 200 m respectively.\n* The Tiger II's 88 mm armament could penetrate 165mm at 1000m and destroy all Allied armor at a range far outside the effective range of the enemy's armament. Also, notwithstanding its reliability problems, the Tiger II was remarkably agile for such a heavy vehicle. Contemporary German records indicate that it had a lower ground pressure and was as maneuverable as the much lighter Panzer IV.\n* A typical modern lined shaped charge can penetrate armor steel to a depth of 7 or more times the diameter of the charge's cone (cone diameters, CD), though greater depths of 10 CD and above are now feasible.\n* The shaped charge of the PanzerFaust could penetrate up to 200 mm of steel, enough to defeat any armoured fighting vehicle of the period including T-34's and IS-2.\n* RPG-16 and M72 LAW can penetrate 300mm\n* RPG-22 can penetrate 400mm\n* RPG-7 can penetrate 500mm\n* M1 Abrams cannot penetrate its own 610mm Sloped Armor\n* RPG-29 can penetrate 750mm and has penetrated the front armor of a Challenger 2.\n* BLU-109 Penetrator - Penetration of reinforced concrete: 1.8 m (6 ft)\n* BLU-116 Advanced Unitary Penetrator (AUP), BLU-118/B Thermobaric Warhead - Penetration of reinforced concrete: 3.4m (11 ft)\n* BLU-113 Super Penetrator - Penetration of reinforced concrete: more than 6m (20 ft)\n* The crippled Bismark endured 5 torpedoes and a relentless attack by the 14 inch guns of 2 Battleships and the 8 inch guns of 2 Heavy Cruisers even at point blank range for over half an hour. The upper decks were destroyed, but the ship was still under power and the hull was relatively sound. It was finally scuttled by the crew.\n\n* Penetration of materials vs 5.56mm: http://www.inetres.com/gp/military/infantry/rifle/556mm_ammo.html\n** The following stop a 5.56mm round fired at less than 50 meters:\n*** One thickness of well-packed sandbags.\n*** A 2 inch (51 mm) non-reinforced concrete wall.\n*** A 55 gallon drum filled with water or sand.\n*** A small ammunition can filled with sand.\n*** A cinder block filled with sand (block will probably shatter).\n*** A plate glass windowpane at a 45 degree angle (glass fragments may be thrown behind the glass).\n*** A brick veneer.\n*** A layer of books 18 to 24 inches (457 to 610 mm) thick.\n** The following do not stop a 5.56mm round fired at less than 50 meters:\n*** Interior walls made of thin wood paneling, sheetrock, or plaster\n*** Common office furniture, such as desks and chairs\n*** Wooden frame buildings and single cinder block walls offer little protection from 5.56mm rounds.\n*** A car body (round will penetrate but normally not exit).\n\n* 40mm High Explosive dual purpse round\n** Penetrate 2 inches (50 mm) of armorplate, 12 inches (300 mm) of pine logs, 16 inches (400 mm) of concrete blocks,\nor 20 inches (500 mm) of sandbags at ranges up to 1,312 feet (400 m).\n\n* Sandbags = 1/10th Steel\n* Concrete = 1/8th Steel\n* Pine Logs = 1/6th Steel\n\nhttp://www.panzerworld.net/armourpenetration",
          ":summary",
          "* Level\n* Damage\n* Armor (mm)\n* Energy (J)\n* Explosive Force (psi)\n* Mass (kg)\n\nThe following table is an attempt to unify Damage, Armor, Energy, Explosive Force, Strength, and Mass together. This is done with the following premises:\n1. Where possible use factual comparisons between Weapons and Armor that defeated those weapons.\n2. Once damage and armor are mapped, the energy created from each firearm can be derived by muzzle velocity and weapon calibre.\n3. Energy in Joules (J) is easily converted into explosive force measured in PSI\n4. Energy may also easily be converted into a strength rating by determining how much mass that energy would lift over a person's head (3m) in 1 second.\n5. Finally the mass rating from strength can be used as a general chart for mass (and by correlation Body).\n\nThe formula is Energy = Mass (kg) * ((3m ^ 2) / 1s * 10m / 1s / 1s.\nSimplified the formula is Energy = Mass (kg) * 100."
        ),
        "Combatant Types",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Combatant Types",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            ":Elite",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Elite",
              ":summary",
              "* Elite units gain +2 to all combat, morale, or military rolls."
            ),
            ":Mob",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Mob",
              ":summary",
              "* Mob units take -1 to all combat, morale, or military rolls.\n* When a Mob unit takes its action, other Mob units within 2 spaces must roll Will. If they fail, they immediately activate and attempt to move adjacent to the original Mob and perform the same action."
            ),
            ":Veteran",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Veteran",
              ":summary",
              "* Veteran units gain +1 to all combat, morale, or military rolls."
            )
          )
        ),
        "Melee and Close Combat",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Melee and Close Combat",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            ":Aerial",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Aerial"
            ),
            ":Crouching",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Crouching"
            ),
            ":Duel",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Duel",
              ":summary",
              "* Choose an Ability - Each player secretly choose an [Ability] for this turn.\n* Determine Initiative - Each player begins bidding a [Speed] he/she will use before the [Ability].\n* Take Turns - Each player takes their turn in the order of the final bidding.\n** Move - The unit must use or discard at least the bid amount of [Speed] before it can take an [Action]\n** Action - Reveal the chosen [Ability].  If the unit is in range of a target and has not used too much [Speed] to use the chosen [Ability], then it may use the ability now.\n** Move - The unit may use any remaining [Speed]."
            ),
            "Finishing Move",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Finishing Move",
              ":summary",
              "* Finishing Moves are powerful attacks that are usually only done when the opponent cannot defend.\n* [Move]: No movement this turn."
            ),
            "Armor Facing",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Armor Facing",
              ":summary",
              "* Armor is rarely uniform around a unit.\n* Determine the armor side you are targetting (i.e. Front, Rear, Side, Top, Under) by determining which of your opponents [Firing Arc]s your weapon lies in.\n* If facing still cannot be determined, then it is the defender's choice.\n* Infantry units may attack top or under armor if they are within 1 space of the target (assume grenades or other improvised weapons)."
            ),
            ":Explosive",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Explosive",
              ":summary",
              "* 1 gram of TNT releases 1000 calories upon explosion or 4184J.  1 gram of sugar has abour 4x the energy.\n            * 1g=4.184x10^3J, 1kg=4.184x10^6J, 1ton=4.184x10^9J, 1kt=4.184x10^12J, 1Mt=4.184x10^15J\n            * Explosions Damage falls off by half (-1 Damage) for every 2m from the center.\n            * Following a blast wave is a negative blast of 1/3 strength\n            * Blasts are reflected and amplified by solid surfaces. A person between a blast and a building will suffer 2-3x the injury as those in open spaces.\n\n            Blast Damage in Overpressure\n            Po=0.34E/R^3\n            where\n            Po= overpressure in pascals (about 6895 Pascals per psi.)\n            E=energy, in joules (0.1 Kg TNT = 461,200 joules)\n            R^3= the cube of distance, in meters\n            And, IIRC\n            5 psi(35 Kpa): windows shattered, startled/stunned\n            20 psi: (140 kPa)lung damage, eardrums likely popped\n            35 psi (250 kPa): serious injury probable, death rare\n            200 psi (1400 kPa): mutilation\n\n            .15 psi: Glass breaks\n            .25 psi: Hurricane winds, injuries from flying glass\n            .4 psi: Limited minor structural damage (windows broken, cracks in plaster, broken roof tiles)\n            .7 psi: Minor damage to house\n            1 psi: Partial demolition of houses made uninhabitable\n            2 psi: Partial collapse of walls and roofs of houses, Residential structures collapse, injuries common\n            3 psi: Non-reinforced concrete or cinder wall shattered, steel frame buildings distored, 3000lb machinery unaffected, 10% eardrum damage\n            4 psi: Most buildings collapse except concrete, fatalities occur\n            5 psi: Wooden utility poles snap, 50% eardrum damage\n            6.3 psi: Lung haemorrhage damage\n            7 psi: Houses completely destroyed, loaded trains overturned\n            8 psi: Non-reinforced brick walls fail by shearing or flexure\n            9 psi: Loaded train boxcars demolished\n            10 psi: Buildings totally destroyed, 7000lb machines moved and badly damaged, 12000lb machines survive, Reinforced concrete buildings severly damaged, fatal injuries common\n            14.5 psi: 1% fatalities\n            17.5 psi: 10% fatalities\n            20.5 psi: 50% fatalities\n            25.5 psi: 90% fatalities\n            29.0 psi: 99% fatalities\n\n            500lb Bomb\n            1000lb Bomb\n            4000lb (2t) Blockbuster Bomb 'Cookie' 3/4 weight is explosive\n            8000lb (4t) Bomb\n            12000lb (6t) Tallboy\n            22000lb (11t) Grand Slam Earthquake Bomb\n            1kt Fission Bomb\n            10kt Fission Bomb\n            1Mt Fusion Bomb\n            10Mt Fusion Bomb\n\n            Blast Radius:\n            ~50mm 2m\n            ~60mm 5m\n            ~70mm 10m\n            ~80mm 15m\n            ~90mm 20m\n            105mm 25m\n            155mm 50m\n            203mm 80m\n\n            ECR The effective casualty radius is defined as the radius of a circle about the point of detonation in which it may be expected\n            that 50 percent of exposed troops will become casualties.\n\n            The 40mm grenade has an effective casualty radius of 5 meters.\n            155mm (M107) 50m ECR\n            5\"x54 (Mk64) 45m ECR\n            120mm (M934) 60m ECR\n            107mm (M329A2) 40m ECR\n            105mm (M1) 35m ECR\n            81mm (M935/M734) 40m ECR F/M252\n            81mm (M374A3) 34m ECR F/M29\n            60mm (M720/M888 ) 27.5 ECR"
            ),
            "Anti-Missile Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Anti-Missile Missile",
              ":summary",
              "* Anti-Missiles are designed to intercept other missiles and explode in front of the incoming missile thereby destroying them. They can be used for other purposes, but their relatively large area and low payload limits their use to soft targets. Anti-Missiles can be used to intercept any missiles including those pursuing other targets and other Anti-Missiles.\n* [Reaction]: Attack other Missile"
            ),
            "Ballistic Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Ballistic Missile"
            ),
            "Cluster Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Cluster Missile",
              ":summary",
              "* Missile mounted with a cluster bomb warhead.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move taking at most 1 turn each move. The missile has [Action]: Make an attack against the 3 adjacent spaces toward the front of the missile, then remove the missile."
            ),
            "Cruise Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Cruise Missile"
            ),
            "Guided Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Guided Missile"
            ),
            ":Rocket",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Rocket",
              ":summary",
              "* Rockets are a form of missile that is designed to carry the maximum payload. They are, therefore, relatively large and slow compared to other missile types. They are unguided.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move and may not turn. The missile has [Action]: Make an attack against the current space, then remove the missile."
            ),
            "Swarm Missile",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Swarm Missile",
              ":summary",
              "* Series of small, linked missiles that individually have low yield but can be fired in varying numbers to strike either a single target or a large area."
            ),
            ":Torpedo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Torpedo",
              ":summary",
              "* Torpedoes are a form of missile (usually underwater) that is designed to carry the maximum destructive payload. They are, therefore, relatively large and slow compared to other missile types."
            )
          )
        ),
        ":Ammunition",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Ammunition",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Acid Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Acid Ammo"
            ),
            "Adhesive Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Adhesive Ammo"
            ),
            "Anti-Laser Aerosol Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Anti-Laser Aerosol Ammo"
            ),
            "Area Effect Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Area Effect Ammo"
            ),
            "Armor Piercing Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Armor Piercing Ammo"
            ),
            "Birdshot Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Birdshot Ammo"
            ),
            "Buckshot Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Buckshot Ammo"
            ),
            "Chemical Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Chemical Ammo"
            ),
            "Firefighting Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Firefighting Ammo"
            ),
            "Flare Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Flare Ammo"
            ),
            "Flechette Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Flechette Ammo",
              ":summary",
              "* This is kind of a shot-gun that fires a swarm of darts instead of buckshot ('flechette' is French for 'little arrow'). They look like nails. In the shell, a group of flechettes are held together by a plastic frame called a sabot, which falls away when the load exits the muzzle. Light flechettes are twenty to a shell, heavy are six to a shell. Like shotgun shells, they are good for causing large amounts of damage to the intruder in one's apartment, but failing to penetrate the wall so as to not annoy the neighbors.\n* Light flechettes are only good against soft body armor; rifle plates will stop them cold. Additionally, light flechettes lack the stopping power of buckshot against unarmored targets.\n* Heavy flechettes have the mass of a 000 buckshot pellet and likely being made from very hard material (at least hardened steel, probably tungsten), these shells will exhibit rifle grade penetration.\n* Flechettes are fin stabilized steel projectiles similar in appearance to arrows. During the Korean War the Chinese army tactic of human wave attacks against US lines of defence prompted interest in flechette projectiles in single and multiple projectile systems for small arms and antipersonnel (APERS) use. Flechettes have a performance criteria very different from the conventional rifle bullet. Typical modern flechettes are small light weight steel projectiles, and the velocity lost to air resistance is generally 375 fps. per 100 Meters of flight. Unlike rifle bullets, flechettes are not spin stabilized, but use fins to achieve level flight. The flechette's long body looses rigidity on target impact and bends into a hook, often breaking off the fin portion creating an additional wound. Flechette munitions include projectiles for use in the M16 rifle, CAWS (close assault weapons system), and 12 gage shotgun, as well as the 105mm M101A1/M102 howitzer, 2.75 in. FFAR (folding fin aircraft rocket), and the 70mm Hydra-70 FFAR."
            ),
            "Fragmentation Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Fragmentation Ammo",
              ":summary",
              "* Approximately 30% of the energy released by the explosive detonation is used to fragment the case and impart kinetic energy to the fragments. The balance of available energy is used to create a shock front and blast effects. The fragments are propelled at high velocity, and after a short distance they overtake and pass through the shock wave. The rate at which the velocity of the shock front accompanying the blast decreases is generally much greater than the decrease in velocity of fragments, which occurs due to air friction. Therefore, the advance of the shock front lags behind that of the fragments. The radius of effective fragment damage, although target dependent, thus exceeds consid-erably the radius of effective blast damage in an air burst."
            ),
            "Heat Seeking Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Heat Seeking Ammo"
            ),
            "Homing Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Homing Ammo"
            ),
            "Incendiary Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Incendiary Ammo"
            ),
            "Laser Guided Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Laser Guided Ammo"
            ),
            "Minelayer Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Minelayer Ammo"
            ),
            "Needle Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Needle Ammo",
              ":summary",
              "* Needlers are unique weapons that fire small needle-like projectiles at high velocities.\n* Advantages: Because they are so light, needlers have much lower recoil than ordinary rounds. They also benefit from high rates of fire and large ammo capacities.\n* Disadvantages: Their principle weakness is that damage falls off sharply against armor.\n* One needler has a solid block of plastic as ammo and a cylinder in the barrel that rotates at high velocities. The twisting motion of the cylinder repeatedly shaves off toothpick-sized needles, tightly coils them and ejects them from the barrel at high velocity. When the coiled needle strikes a target itunwinds, drilling into the target. Because the barrel does not stop spinning, the needler can fire a continuous hailstorm of needles until it is out of ammo.\n* Rules: [Shattershot], [Continuous Stream]",
              ":titles",
              "Needlegun"
            ),
            "Non-Lethal Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Non-Lethal Ammo"
            ),
            "Paint Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Paint Ammo"
            ),
            "Radar Guided Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Radar Guided Ammo"
            ),
            "Recoiless Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Recoiless Ammo",
              ":summary",
              "* Recoilless weapons fire rocket-propelled, recoilless rounds.  These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for underwater or space.\n* Recoilless weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.",
              ":titles",
              "Bazooka, Gyrojet, Rocket Round"
            ),
            "Scramble Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Scramble Ammo",
              ":titles",
              "Haywire Ammo"
            ),
            "Smoke Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Smoke Ammo"
            ),
            "Taser Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Taser Ammo"
            ),
            "Tracer Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Tracer Ammo"
            ),
            "Underwater Ammo",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Underwater Ammo"
            )
          )
        ),
        ":Lasers",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Lasers",
          ":reference",
          "Examples of pulsed systems with high peak power:\n* 700 TW (700x10^12 W) - The National Ignition Facility is working on a system that, when complete, will contain a 192-beam, 1.8-megajoule laser system adjoining a 10-meter-diameter target chamber. The system is expected to be completed in April of 2009.\n* 1.3 PW (1.3x10^15 W) - world's most powerful laser as of 1998, located at the Lawrence Livermore Laboratory",
          ":summary",
          "* Lasers are the ultimate sniper's weapon. They are silent, extremely hard to spot, and have pinpoint accuracy. They are, however, vulnerable to impurities in the the medium they fire through. These impurities are heated by the beam and can dilute the beam as well as make the beam visible.\n\n       * Accuracy: +1\n\n       * 5 mW - CD-ROM\n       * 10 mW - DVD player\n       * 100 mW - CD-RW\n       * 250 mW - DVD-R\n       * 1 W - green laser in current Holographic Versatile Disc prototype development\n       * 1-20 W - output of the majority of commercially available solid-state lasers used for micro machining\n       * 30-100 W - typical sealed CO2 surgical lasers[26]\n       * 100-3000 W (peak output 1.5 kW) - typical sealed CO2 lasers used in industrial laser cutting\n\n       Energy Storage\n       Let's assume non-rechargeable systems at an energy density of 2.5 kilojoules per cubic centimeter, which is quite plausible. You might consider a rechargeable battery pack as an option, with half the capacity of the non-rechargeables.\n       Lithium-polymer cells are rechargeable, and have an energy density of 1.08 kJ/cm3.\n       As for nonrechargable batteries, check out the various molten salt batteries. They're stored as a solid, so they can be stored 'charged' virtually forever. As soon as you bring them up to operating temperature (400 C or more), and as long as you keep them there, you have an incredibly high output battery. The military has used them like this for a very long time, and most current research is focused on making them rechargeable.\n       Apparently the energy density varies widely, but it's clear that they can have very high energy density.\n\n       Whether you use lasers or particle beams, you'll need a kilojoule of output energy to reliably incapacitate a human target. In the case of a laser weapon, that energy would be subdivided into ~1 joule pulses at ~5 microsecond intervals, to achieve penetration in the face of a laser's natural tendency to deposit energy at the target's surface. Particle beams don't have that problem; boost the electrons up to a few hundred MeV, and you can dump the whole kilojoule's worth at once.\n       The plasma clears away easily in that time frame; debris is the real issue, and the driving force between the 5 microsecond pulse rate. That allows roughly 90% of the debris to clear the beam path, assuming a 1mm beam and instantaneous 1J pulses. 1 joule every 5 microseconds is optimal against soft tissue, other materials will want different pulse trains.\n       I'm assuming a weapon designed to penetrate ~30cm in soft body tissue. This gives about 15cm in bone or plastic, 5cm in brick or concrete, or 2.5cm in steel or most ceramics. Synthetics won't be very good at stopping energy weapons, even tough ones like kevlar, but you might be able to find a ceramic that could stop a laser beam with a centimeter's thickness or so. Particle beams are tougher to stop; it mostly comes down to sticking mass in the way without regard to material properties.\n       Lasers would likely have to have pulse energy and frequency tuned to the specific material being targeted. It might be possible to do this automatically, based on crude spectoanalysis of the material vaporized in each pulse, but if not expect penetration to be roughly halved if a laser weapon is fired at a target it has not been optimized for.\n       Taking into account the inefficiency of the system, the input energy will likely be somewhere between two and five kilojoules per shot. So you could get fifty to a hundred shots from a pistol-sized non rechargeable energy source, or half that with a rechargeable battery. Automatic fire at anywhere up to 20 Hz (1200 rpm) shouldn't be a problem in the short term, though might cause cooling problems if you keep it up.\n       You also need to focus the energy on the target, with a spot size of a millimeter or less. With a laser, that gets kind of tricky. A 5-centimeter mirror, about the largest you can really imagine on a pistol, gives an effective range of perhaps sixty meters, beyond which the weapon starts losing penetration quite rapidly.\n       you still need to get down to a millimeter or so to flash-boil water in a layer ~one optical depth in thickness. Once you do that, the steam will expand and spread the damage around, but if you don't hit the threshold for turning water into steam all you do is warm up the target.\n       With penetration, range, and repeatability dealt with, it is time to turn to accuracy. Lack of recoil, automatic fire capability, and line-of-sight accuracy are all major assets here, but there is one more improvement to be made. Both lasers and particle beams can be steered at least a degree or two off-axis, in the case of the laser via the adaptive-optic mirror, for particle beams with a transverse magnetic field at the muzzle.\n       If we can throw in a chip-mounted laser or acoustic gyro set, we can have a gyrostabilized handgun. The weapon shoots not at where the gun is pointed at the instant of firing, but at a weighted average of where it has been pointing over the past quarter of a second or so. Smoothes out a lot of the jitter inherent in human marksmanship.\n       Another clever one would be to use the laser's optics to project a laser sight. Pull the trigger, and the harmless red dot suddenly explodes. BANG! Using the laser optics as a scope would be more useful for long range or high accuracy shots.\n       In combat, I would expect such a weapon to be used in automatic fire mode at ~10 Hz. With fifty to a hundred pulses to play with, you won't run out of ammunition too soon as is the case with current machine pistols. And recoilless, stabilized automatic fire should allow a moderately capable marksman to walk a burst on target in one or two reaction cycles (say, half a second) in most circumstances.\n       Practical combat range, if you don't mind missing a good part of the time, would be on the order of 50 meters\n       Cooling:\n       And you'll need some serious cooling. I'd go with liquid-metal microchannel heat pipes etched into all the hot surfaces, and leading to cooling fins around the 'barrel'. If you use the chemical-propellant option, regenerative cooling could also work.\n       What would it sound like?\n       The actual mechanism of producing the laser beam could sound like anything, from complete silence, to the click of an electrical contact, to a sharp, electric snap, to a gunshot-like thunderclap.\n       The beam, when incident upon its target, will make a nice bang.\n       The pistol won't make a 'zap' sound, will it?\n       If the beam is repeated rapidly it might, however, make a buzz. It might end up sounding quite electrical at a few hundred Hertz.\n       Remember that the temporary cavity caused by the explosions only lasts a few milliseconds, so the beam has to have completed its work of piercing the target at this time. The individual explosions will be too closely spaced (microseconds apart) to be individually audible. Since shocks are always supersonic to the air in their path, and subsonic to the moving air left behind them, multiple subsequent shocks from the same source tend to merge into one stronger shock. Thus, each pulse probably makes one bang. The bang comes from a series of explosions whose total energy is about the same as that of the gunpowder detonating in a firing rifle, so it will probably be about as loud.\n       If the beam is in the visible part of the spectrum, you get a noticeable path through clean air at indoor lighting intensities. I am not sure if it will be visible out of doors under full sunlight, but you could see it at night. The beam will be widest at the aperture of the gun, probably a few centimeters across to keep the optics from being damaged by the intense light. The beam will converge to a spot a millimeter or so across at the target. In unclean air, the beam will be a lot more visible. This Rayleigh scattering is linear, so the total integrated brightness across the cross section of the beam should be constant, if we neglect the gradual attenuation of the beam due to the light being scattered out of it. Higher frequency light scatters much more than lower frequency light, so a blue beam would be much more visible than a red one.\n       When a visible beam is incident on the target, it creates a very bright flash of the same color as the beam. This may temporarily dazzle those looking at it, and the beam itself may be overlooked because of the bright flash obscuring it.\n       If the weapon lases in the UV, the intense pulse may cause multi-photon ionization of atoms in the air, causing a fluorescent glow along the path of the beam (possibly red, green, or violet, I'm not quite sure what sparsely ionized air at atmospheric pressure looks like). Since this process is non-linear, it will be dimmest near the aperture where the beam is widest, and most intense nearer the target. Weapon designers will probably try to minimize this effect, since it leads to attenuation of the beam and subsequent loss of effectiveness.\n       Near IR beams are likely to only be visible if there are relatively large pieces of dust, lint, or pollen floating around, which will glow incandescent as they burn under the irradiation of your beam. I doubt beams in the 'thermal' IR range would be used, even though the air is fairly transparent to these wavelengths, because with short, intense pulses you tend to get cascade ionization with these lower frequencies, and this will completely absorb the beam.\n       Beams at non-visible frequencies will also make a flash and a bang where incident on the target from the expanding plasma of their explosion, but nowhere near as bright as that of a visible beam.\n       In vacuum, of course, the beam itself is always invisible, but you can still see the flashes at the target.\n       Will the beam be invisible or bright enough to be blinding?\n       It is quite likely to be both. The beam itself may be invisible or minimally visible, but if even a tiny fraction of the beam is specularly scattered into your eye, near IR and visible and some near UV will be focused to a diffraction limited spot on your retina, causing burns and permanent scarring. This can lead to degradation of vision or total blindness. Interestingly, the brain compensates for blind spots on the retina, so that you might have lost up to 60% of your vision from multiple exposures to beams and you still think you can see just fine.\n       Anyone likely to be using a laser will probably wear protective goggles or contacts. With today's technology, you would probably make them out of an optical band gap material that excludes a very narrow window of light centered on the laser's frequency. This means that the people who fired the lasers would not be able to see the beams or flashes of their own weapons (assuming they used visible light lasers). They would still see the flashes from the plasma explosions, though, plus incandescence of suspended atmospheric particles and fluorescence from multi-photon absorption.\n       The method of subsequent explosions on the back of an expanding cavity driving the cavity through the target will leave a wound much like that of a gunshot, except without fun stuff like the bullet fragmenting or breaking up. A variant where nearly parallel beams a few cm apart literally rip the tissue between them could leave a wound looking more like an ugly gash - add on a few more of these beams on the same plane and you could literally cut someone in half with one millisecond pulse, using only about as much energy as goes into accelerating the bullet of a modern day battle rifle.\n       Will there be a large splash of blood and gore on the wall behind the unlucky pirate?\n       Quite likely, Note that since you do not have the momentum associated with a projectile, it will be more spread out than you would get from a gunshot wound, and you would get blood and gore coming out the front, too.\n       I assume that since the beam is one millimeter in diameter but the hole in the pirate is four centimeters, little or no wound cauterization will occur.\n       Nope, the wound would be ragged and messy. It is created by mechanical, not thermal effects.\n       The laser weapon will probably end up looking something like a camcorder, with a big lens that the beam goes through, and a fairly compact design. Since mirrors and internal optics can bend the beam inside the weapon, there is no need for the long barrels you see on modern firearms. Cooling, if necessary, would probably not involve fins - I would expect something more like the radiator on modern automobiles. Remember, shedding your heat through contact with the air is much more efficient than radiation.\n       keeping in mind that using contact with the air doesn't work if there is no air, i.e., in vacuum. C. James Huff notes that there is one kind of fin for radiant cooling and another for air cooling. He mentions that the fins on a CPU hot sink is a good example of the latter. For a vacuum rated laser he recommends a compressed or liquified gas cartridge since a radiant cooler would be inconveniently huge.\n       Also, lasers are getting surprisingly efficient. When each beam pulse contains no more energy than imparted to a rifle bullet, lasers might need cooling no more than a modern rifle.\n       the laser's battery will be carrying plenty of juice. Anything carrying that much energy will be at least slightly unstable. In other words, it wouldn't take much to make a charged battery into a home-made bomb (which might come in handy if one suddenly needed a bomb.). You might have read news reports about laptop computers who's batteries suddenly burst into flame.\n       And don't even think about sticking a fork into the open contacts.\n       This has been observed somewhat tongue-in-cheek by John Routledge as Routledge's Law: 'Any interesting battery material for a laser gun would be more usefully deployed as an explosive warhead.' He also notes the problem with ammunition cook off. If you are holding a fully-charged laser pistol, and some lucky enemy sniper manages to score a direct hit on the pistol's battery, it is going to be just to bad if the resulting explosion vaporizes you and all your friends within a large radius.\n       Assuming a worst case of 5 kilojoules per shot and a rechargeable magazine containing 50 shots, the magazine is packing 250 kilojoules. This is the equivalent of 250,000 * 2.7778e-4 = 70 watt-hours or 250,000 / 4,500 = 55 grams of TNT (For comparison purposes, a standard 8 inch stick of dynamite is about 208 grams and hand grenades used by the US Army have explosive charges of 56 to 226 grams of TNT). At his specified power density of 2.5 kilojoules per cubic centimeter, this would imply a magazine volume of 100 cm3. this is approximately the same volume as forty-two .45 caliber rounds.\n\n       Fan Beam\n       If a man is about 45 centimeters wide (18 inches), at a range of 5 meters, and the bolts were to be spaced 3 centimeters apart, it would take 15 bolts fired at 0.3 degree increments to the left and right. Your target would fall... in two places.\n       A less blood-thirsty use would be in the wilderness, chopping down trees ('Lumberjack' mode).\n\n       Multiple Modes\n       Stun would be a laser in Pulsed Energy Projectile mode.  Heat would be a laser in unpulsed heat ray mode at relatively low energy levels. Disrupt would be a laser in pulsed blaster mode or in unpulsed heat ray mode at high energy levels. Overload makes the battery explode. Dematerialize is the only one that cannot be done, but it is rather silly in the first place.\n       ('Dematerialize' is a fancy way of saying 'disintegrator ray'. A weapon that can vaporize a human body without setting the walls and floor on fire or even raising the temperature of the room? Give me a break!)\n       Remember that a laser in pulse mode could have its effect optimized to a given material by a specific setting for pulse frequency. So one could have a 'metal cutting' setting for use as a tool or to open a locked door, and a 'kill human' setting for war-to-the-knife combat. All with the same pulse laser, just with a different frequency.\n       Such a weapon would have a selector switch for each mode. And it might have a 'customizable' mode. This would allow an expert to manually tweak the settings: continuous or pulse, spectrum frequency, pulse timing, power level, etc."
        ),
        "Less Than Lethal",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Less Than Lethal",
          ":reference",
          "It was recently revealed that the US military was researching a rather alarming line of less-lethal weapons, the Pulsed Energy Projectile (PEP) program. (As a side note, understand that there is no such thing as a 'non-lethal' weapon. This is because any weapon or gas that can reliably incapacitate or render unconscious a 300 pound world wrestling champion will be strong enough to instantly kill a small child or elderly person.) PEP weapons fire a laser pulse that is very intense but only a fraction of a second in duration. The pulse vaporizes a tiny portion of the hapless victim's clothing or skin, creating a plasma burst intense enough to knock the victim to the ground. This was intended to be used for crowd control. A pulse strong enough to knock one down is also strong enough to make one's eyeballs explode if it hit your face. However, during test performed on animals, the researchers noticed something unexpected. The pulses were creating pain and temporary paralysis in the test animals. As it turns out, certain pulses would create a plasma burst emitting an electromagnetic signal of proper frequency to artificially stimulate the nerve endings in the animal's skin. The US military is researching this effect, trying to find the frequency that will cause the maximum pain sensation without actually causing any physical harm to the target. There is also the possibility that other frequencies could cause taser-like paralysis effects. The effect can be made lethal. The original name for the project was Pulsed Impulsive Kill Laser (PIKL) but was quickly changed. Currently PEP weapons are not man-portable, they are vehicle mounted weapons. They have a range of about two kilometers. We might yet see Space-1999 style hand lasers with a stun setting.",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Pain Ray",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Pain Ray",
              ":reference",
              "* For riot control situations, the US Army is working on the Active Denial System (ADS). It emits microwaves that only penetrate a short way into the skin, not deep enough to do permanent damage but more than deep enough to roast all the target's pain nerve endings. As with all microwaves, the range of this beam of concentrated agony is drastically reduced by rain or heavy humidity."
            ),
            "Vomit Ray",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Vomit Ray",
              ":reference",
              "* The US Navy is working on its Electromagnetic Personnel Interdiction Control project, AKA the Vomit Ray. The US Department of Homeland Security is working on a pistol sized version, which is a very unsettling thought."
            )
          )
        ),
        "Nuclear Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nuclear Weapons"
        ),
        "Particle Beams",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Particle Beams",
          ":reference",
          "* If you get a particle beam intense enough to burn someone, it will also deliver a lethal dose of radiation from a hit anywhere on the body.\n* Radiation will scatter from the beam 'impact' site, irradiating things around it. In an atmosphere, radiation will scatter off air molecules to irradiate things near the beam. Some of it will backscatter, irradiating whatever fires the gun. Forget about a sci-fi hero using a particle beam 'blaster' - after blasting a hoard of bug eyed space aliens, he'd be sick or dying from radiation poisoning. In real life, particle beam weapons were considered for their ability to use radiation to disable things (mostly ICBMs) without necessarily blowing holes in them.",
          ":summary",
          "* Particle beams fire a stream of relativistic atoms or sub-atomic particles.  These are beams of ionizing radiation."
        ),
        ":Plasmacasters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Plasmacasters",
          ":summary",
          "* A weapon that fires a shell that releases a burst of plasma when it strikes a target.  This shell glow with barely contained energy as it flies to its target.",
          ":titles",
          "Blaster, Spinfusor"
        ),
        ":Railgun",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Railgun",
          ":reference",
          "* On January 31, 2008, the US Navy tested a 10MJ railgun with a muzzle velocity of 2500m/s. It is expected to reach 5800m/s at 10 shots/minute (enough to hit a 5m target 370km/200miles away).",
          ":summary",
          "* This type of weapon includes all hypervelocity rounds propelled by massive magnetic fields.\n* Their great speed gives them excellent penetration and kinetic damage.  Because of this great speed, they cannot carry any useful payload because the payload would be destroyed when the shell was launched.  Therefore, railguns are all kinetic weapons only.\n* Coilguns (Gauss) and Railguns are technically different, but their result is the same.",
          ":titles",
          "Coilgun, Gauss Gun, Kinetic Kill Weapons, Linear Cannon, Linear Rifle, Mass Driver"
        ),
        "Sonic Weapon",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Sonic Weapon"
        ),
        "Disruptor Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Disruptor Weapons",
          ":summary",
          "* Disruptors temporarily weaken the molecular bonds in the target. Damage is done via violent system shock, and the weapon may distintegrate the target entirely if enough damage is done.\n* Disruptors have decreasing effectiveness with the density and hardness of the target.  Soft materials like flesh are the most practical target. Damage drops off sharply against metals and rocks making disintegration of such materials extremely difficult.",
          ":titles",
          "Disintegrator, Phaser"
        ),
        "Energy Melee Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Energy Melee Weapons",
          ":summary",
          "* The lance is essentially a giant plasma cutting torch using compressed-gas ignited from direct current from the exo-armor's fusion reactor.\n* The gas supply limits the usefulness of the weapon and many may need to be carried."
        ),
        "Weapon Rules",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Weapon Rules",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Firing Arc",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Firing Arc",
              ":summary",
              "Larger weapons are often cumbersome to use or aim and may only attack in a particular arc. The following abbreviations are used:\n* F - Front. Can only attach in any front arc.\n* B - Back. Can only attack in any rear arc.\n* FF - Fixed Forward.  Can only attack the forward arc.\n* FB - Fixed Backward.  Can only attack the rear arc.\n* FL - Fixed Left.  Can only attack the left arc.\n* FR - Fixed Right.  Can only attack the right arc.\n* Turrent - Turret mount.  Can attack in any direction but must use [Turret] rules to fire anywhere but forward.\n* Pintle - Pintle mount.  Can attack in any direction without limit, but if the pintle mount is used, a crew member is exposed and may be targetted separately from the vehicle at -1."
            ),
            ":Reload",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Reload",
              ":summary",
              "* [Action]: An item with Reload may not be used until all Reload tokens are removed.\n* [Action]: An item with Reload adds the number of Reload tokens each time the item is used.\n* Gain a White [Reload] Token for each Reload value each time the weapon is fired.\n1. Panther G 13 sec\n2. PZ IV F1 9 sec\n3. PZ IV F2 10 sec\n4. Tiger 1E 15 sec\n5. IS-2 20 sec - This is longer due to the IS-2 having a 122mm cannon and the shell has to be loaded in two parts. Although the first shot to a Panther, Tiger or a PZ IV is usally fatal.\n6. KV-1S 12 sec\n7. T34-76 13 sec"
            ),
            "Shoot From The Hip",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Shoot From The Hip",
              ":summary",
              "* Any unit shooting from the hip takes -1 Attack."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_skills
   * @return {chapter}
   */
  static t_chapter_skills = {
    vx_type: vx_core.t_type
  }
  static e_chapter_skills = {
    vx_type: nx_tactics_books_combat.t_chapter_skills
  }

  // (func chapter_skills)
  static f_chapter_skills() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Skills",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Combat Skills",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Combat Skills",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_itemlist(
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Bare Handed",
              ":image",
              "images/cards/item-barehanded.svg",
              ":summary",
              "* [Fight]: [Close Combat] or [Melee]\n* [Damage]: [Body] [Bash]"
            )
          ),
          ":skillmap",
          vx_core.f_new(
            nx_tactics_base.t_skillmap,
            "Close Combat",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Close Combat",
              ":summary",
              "* [Target]: Close combat may only be used to attack the space directly ahead or the space you are on.\n* Fighting very close to the opponent. This includes most martial arts, brawling, and knife fighting.\n* If you don't have a weapon, use the [Bare Handed] item.",
              ":reference",
              "* The usefulness of kicks in self-defense and actual combat has been debated. Kicks are powerful but risk balance, expose the groin, and risk take downs.\n* Joker, there is nothing wrong with you that I can't fix. With my hands. - Batman, The Dark Knight Returns\n* There are seven working defenses from this position. Three of them disarm with minimal contact, three of them kill. The other....hurts. - Batman, The Dark Knight Returns\n* Beat losers, get paid. - Sett, Runeterra\n* The baseline for kicking abilities is that they are -1 Speed and +1 Damage with a minor special ability.\nNAME				SPD		DMG		MV		DEF\nSHORT KICK			+  1		+  0		+  0		S,C,A\nFORWARD KICK			+  0		+  2		-- 1		S,C,A\nBACK ROUNDHOUSE			-- 2		+  2		-- 1		None				K2			*  Ignores all Blocks except for San He and Evade Blow.\n*CARTWHEEL KICK			-- 1		-- 1		+  0		S,C		(2 W)		K4, A3			*  DMG vs. all adjacent hexes; opponents who take DMG are Knocked Back one hex; Straight Line attack; the fighter may use full MV, dealing DMG each time he moves next to an opponent.\nCRESCENT KICK			-- 1		+  4		-- 2		S, miss C				K3		*  KDA\nDESCENDING WHEEL KICK		-- 2		+3 (x2)		+  0 		(Special)	(1 W)		K4, A3, Jump, Ft.Swp	*  First hit = Aerial, Block- S, miss C; Second hit = Crouching, KD, Block- C, miss A.\nFOOT SWEEP			-- 2		+  3		-- 2		C, miss A				K2, Crouch	*  KD; Crouching Maneuver.\nFORWARD CHEST KICK		+  0		+  2		-- 1		S,C,A				K3			*  KD.\nForward Flip Kick		+  1		+  5		Two		S,A		(1 W)		K3, A3, Handstand Kick	*  KD, KDA (unless blocking), (dodge move?)\n*FORWARD SLIDE KICK		+  0		+  2		+  0		C, miss A				K2, A2		*  KD\nFRONT SNAP KICK			+  2		+  2		None		S,C,A				K2			**\nHAMMER KICK			-- 2		+ 3, + 4	-- 2		C,miss A	(1 W)		K3,(x2)K,Ft.Swp		*  KD; Hits Downed opponents.\n*HEEL STAMP			+  2		-- 4		+  1		S,C, miss A			K1, A1			*  Opponent is Knocked Back (Fighter's Str. + Athletics) - Opponent's Str.; Fighter is KnockedBack 1.\nJUMPING SOBAT(TO)		-- 1		+  4		Two		S,C,A				K2, A1, Jump		*  Aerial. (MY: Aviods Sweeps [fist,foot,spin foot], may only be blocked C or w/ Kick Def) This is charlie's hop toward low kick.\nKNEE DROP			-- 1		+  3		-- 1		(miss S,C,A)			K2, A1			*  Attacks Downed opponents only.\nLONG SWEEP KICK			-- 2		+  3		None		C, miss A			K2, Crouch, Foot Sweep	*  KD; Crouching; this maneuver may be used to strike an opponent who is 1 Hex away.\nPUSH KICK (STOMACH KICK)	+  0		+  1		+  0		S,C,A				K2			*  Knockback.\nRISING BIRD KICK		-- 1		+  0(x3)	One		S,C		(1 W)		K4,A4,Jump,Dbl-Hit Kick	*  KDA; Aerial Maneuver.\nShin Strikes			(+ 0)		(+ 1)		(+ 0)		(Normal)			K3			*  used in conjunction with any basic Kick; the fighter must be in an adjacent Hex to use this maneuver.\nSPINNING FOOT SWEEP		-- 2		+  3(x2)	None		C, miss A	(1 W)		K2, A1, Foot Sweep	*  DMG is dealt to all adjacent hexes, target in front of fighter is struck twice; KD; Crouching.\nSPLITS KICK			-- 1		+  4		One		S, miss C			K2			*  KDA\nSTEPPING FRONT KICK		+  0		+  1(x2)	+  1		S,C		(1 W)  		K4, Double-Hit Kick	*  Fighter must MV into opponent's hex; 1st hit causes Knockback.\nStudder Step Kick		+  1		+  2		One		C(miss A)			K3, A1			*  Must be blocked low.\nTHRUSTING FORWARD KICK		+  1		+  2		+  1		S, C		(1 W)		K2, A1			*  Aerial Maneuver; KDA.\n\n\nPunch\n\nName             Speed      Damage     Move      Defense\n\nJab                  +2          -1         +0       S,C,A\n\nStrong Punch        +0          +1         +0       S,C,A\n\nFierce Punch        -1          +3         -1       S,C,A\n\n----------------------------------------------------------------\n\nBoshi-Ken(Thumb Drive)-1          +2          +0      S,C,A\nP2,A2\nxIf damage is scored opponent suffers -1 move next round.\n\nBuffalo Punch         -2           +5          One     S,A\nP2\n\nBushin Air Elbow    +2           -1           +2     S,A\nP3,A1,Elbow Strikes,Jump\nxAerial Maneuver\n\nCaber Punch         -2           +3           -1     S,C,A\nP2,Str4\nxKD\n\n\nCobra Hand Strike   +3           +1           +1     S,C,A\n(1W)   P3\n\nDash Punch          +0           +4           +2     S,C\n(1W)   P4,A1\n\nDash Uppercut       +0           +4          +2     S,miss C\n(1W)   P4,A1,Dash Punch\nxKDA\n\nDouble Hit Punch    -1           +0(x2)       +0     S,C,A\nP2\n\nEar Pop           -1           +0           -1     S,C,A\nP2\nxIgnores Sta:fighter -1 Honor\n\nElbow Barrage       +0           +0(x3)     One      S,C\n(1W)   P4,Elbow Smash,Elbow Strikes\nxMust be in opponent's hex\n\nElbow Drop      +0           +2           +0     miss S,C,A\nP2,A1\nxMust be used on Downed opponent; If opponent is interrupted he\nloses action and is still considered downed at the end of round.\n\nElbow Smash      +2           +2          One     S,C,A\nP1\n\nElbow Strikes    (+0)        (+1)         (+0)    (normal)\nP3\nxUsed in conjunction with any basic punch, must be in opponent's\nhex.\n\nFist Sweep        -1           +3           -2     C,miss A\nP3\nxCrouching Maneuver;KD\n\nFlaming Dragon Punch-1          +6(x3)       -2     S,C\n(1C,1W) P5,A1,F2,Dragon Punch\nxKD;Knockback 1(all);->Aerial Maneuver\n\nHand Of The Crane  +1          +0           +0    (Normal)\nP4\nxMay be used in conjunction with any basic Punch while standing.\n\nHand Of The Eagle Claw+1       +0           +1    (Normal)\nP4,A3,Jump\nxMay be in conjunction with any basic Punch while Aerial.\n\nHand Of The Striking Mantis+0     +0        +0    (Normal)\nP4,A2,Dex4\nxMay be used in conjunction with any basic Punch while standing:\nfighter may strike opponent one hex away.\n\n\nHook                   +0        +3       -2        S,C,A\nP1\n\nIron Palm(Tieh Sha Chang) +0       +4        -1       None\n(1C) P4,F4\nxIgnores Blocks;KDA\n\nKidney Punch           +0        +2       +0        S,C,A\nP2\nxFighter must be behind opponent or in opponent's hex to execute\nthis maneuver; following round opponent is -1 SPD.\n\nLunge Punch       +0        +1       +1        C\nP3,A1\n\nNeck Shatterer         -1        +4       -2        S,miss A\nP2,Elbow Strikes\n\nPalm Heel Punch       -2        +3       +0        S,C,A\nP2\nxWhen DMG is dealt treat total as if it were one higher for\npurposes of calculating dizzy.\n\nPower Uppercut       -1        +3       One       S,C\nP1\nxKDA\n\nRazor Fist Punch      +1        +4       +0        S,C\n(1C,1W) P5\nxKnockback1;DMG is Aggrivated\n\nRekka Ken           (+3)      (+0)     (+0)      (Normal)\n(1W per turn)P4,A2\nxUsed with any basic punch; can be used for up to 3 turns; if\nused full 3 turns next round must be spent taunting, or lose 3\nGlory; Combo to dizzy.\n\nReverse Fist Punch    +0(+2)   +2        One      S,C,A\nP1\nx+2 SPD if punch follows a set up punch.\n\nRushing Strong        +0        +1       +1        S,A\nP2\n\nShikan Ken(knuckle fist) +1       +1        +0       S,C\nP2\nxSTR.test to knock opponent back 1 hex; KDA\n\nShockwave            +0        +0       None      S,C,miss A\n(1C) P4,F2\nxShockwave extends in straight hex line; 1 hex per dot in STR;\nKD all.\n\nSpinning Chothesline   +0       +0       -2        S,miss C\n(1W) P4,A3,Clothesline\nxDMG vs. all adjacent hexes; Knockback 1 each time DMG is dealt;\nAdvance with MV after each hit, may roll DMG again if applicable;\nDodge Maneuver.\n\nSpinning Knuckle     -1        +1(x2)    +3         S,C\n(1W) P3,A1,Spinning Back Fist\nxDodge Maneuver.\n\nStrong Decending Elvow +0       +1         +1         S,A\nP2,A1,Jump\nxAerial.\n\nSword Hand Strike     -1       +4         -2         S,C,A\nP3\nxIgnores armor,Toughskin,etc.\n\nTriple Strike         -2    (+0,+0,+1)    None      S,C,A\nP2,K1\nxRoll three damage tests as indicated, take highest two rolls.\n\nTurn Punch      Rnd 1-1        +4        Two        S,C\n(W first turn)P4       Rnd 2-1        +5        Two        S,C\n           Rnd 3+0       +6        Two        S,C\n           Rnd 4+1       +7        Two        S,C\nxCard is layed face down; May be played at any time thereafter as\nlong as card is left face down; -1 SPD,DMG,MV while charging\nmaneuver; Need not be used.\n\nUppercut           +1        +2        -1         S,C,A\nP1\nx +1DMG vs. Crouching.",
              ":titles",
              "Brawler, Grappler, Hand-to-Hand, Infighter, Martial Artist, Wrestler",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Punch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Punch",
                  ":summary",
                  "* [Fight]: [Close Combat]\n* [Damage]: [Body] [Bash]"
                ),
                ":Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kick",
                  ":summary",
                  "* [Low Attack]\n* [Fight]: [Close Combat]-1\n* [Damage]: [Body]+1 [Bash]"
                ),
                ":Grab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grab",
                  ":summary",
                  "* [Fight]: [Close Combat]\n* [Damage]: [Body] [Hold] [Lock]\n* Attempt to grab a unit."
                ),
                ":Drag",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drag",
                  ":summary",
                  "[Requires]: You must have a [Hold] on the target.\n[Action]: You may Move at half speed while also dragging the target behind you."
                ),
                "Back Fist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Back Fist",
                  ":summary",
                  "* Strike with the back of the fist or open hand.",
                  ":titles",
                  "Backhand, Bitch Slap"
                ),
                ":Clothesline",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Clothesline",
                  ":summary",
                  "Clothesline         -1           +2           +0     S,C,miss A"
                ),
                "Bull Rush",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bull Rush"
                ),
                ":Charge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Charge"
                ),
                "Crouching Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crouching Strike",
                  ":summary",
                  "Crouch low and deliver a powerful blow to the mid-section or below the belt.\n* [Attack] [5]: +1 Effect",
                  ":titles",
                  "Ducking Punch"
                ),
                "Deflecting Punch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deflecting Punch",
                  ":summary",
                  "* The fighter deflects a punch at him and immediately counters with a punch of his own.\n* [Counter]: +1 Effect"
                ),
                "Dragon Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dragon Strike",
                  ":summary",
                  "* When striking with the fist, more power can be exerted when the movement originates from the feet, is guided by the waist, flows through the body, and exits through the fist.\n* [Attack] [J]: +1 Knockback\n* [Aerial]",
                  ":titles",
                  "Dragon Fist, Dragon Punch"
                ),
                "Ear Pop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ear Pop",
                  ":summary",
                  "* Disorienting attack that causes temporary or permanent deafness.\n* -1 Initiative\n* -1 Attack\n* +2 Stun\n* -2 Move\n* Criticals: Deafness"
                ),
                "Elbow Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Elbow Drop"
                ),
                "Elbow Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Elbow Strike",
                  ":summary",
                  "* Devastating blow common to Muay Thai.\n* +1 Initiative\n* +1 Damage\n* 1 Move",
                  ":titles",
                  "Elbow Smash"
                ),
                "Eye Rake",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Eye Rake",
                  ":summary",
                  "* Disorienting attack that causes temporary or permanent blindness.\n* -1 Initiative\n* -1 Attack\n* +2 Stun\n* -2 Move\n* Criticals: Blindness"
                ),
                "Fists of Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fists of Fire"
                ),
                ":Haymaker",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Haymaker",
                  ":summary",
                  "* A slow all out attack that causes massive damage. Especially useful to finish off weakened opponents.\n-2 Initiative\n0 Move\n+2 Damage",
                  ":titles",
                  "Two-Fisted Smash"
                ),
                "Head Butt",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Head Butt",
                  ":summary",
                  "-2 Move\n+1 Damage"
                ),
                ":Hyperfist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hyperfist",
                  ":summary",
                  "* [Critical Hits] can be exchanged for additional Attacks. Same as [Auto].\n-2 Initiative\n-1 Damage\n1 Move",
                  ":titles",
                  "Hundred Hand Slap, Lightning Fist, Rapid Punch"
                ),
                ":Jab",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jab",
                  ":summary",
                  "* A quick, weak strike.\n+2 Initiative\n+1 Accuracy\n-2 Damage\n+1 Move"
                ),
                "Knife Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knife Hand",
                  ":summary",
                  "* [Damage]: [Critical Hits] may reduce opponent's [Armor] roll."
                ),
                "Knuckle Fist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knuckle Fist",
                  ":summary",
                  "* [Critical Hits] cause Knockback."
                ),
                "Monkey Punch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Monkey Punch",
                  ":summary",
                  "* Grab blocking arm and punch\n* If opponent used a block, ignore it.",
                  ":titles",
                  "Grab Punch"
                ),
                "Nerve Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nerve Strike",
                  ":summary",
                  "* Use the tips of the fingers to strike and pinch nerve clusters to produce pain and debilitation.\n* [Action]\n* -1 Initiative\n* +1 Stun",
                  ":titles",
                  "Atemi Strike, Atemi Waza, Cobra Strike"
                ),
                "One Two Punch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "One Two Punch"
                ),
                "Palm Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Palm Strike",
                  ":titles",
                  "Palm Heel Strike, Shotei"
                ),
                "Phoenix Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Phoenix Strike",
                  ":summary",
                  "* Middle finger protrudes from fist to strike nerve clusters to cause numbness.\n* [Criticals] can be exchanged for Slow tokens."
                ),
                ":Ram",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ram",
                  ":summary",
                  "* [Action]\n* +1 Knockback",
                  ":titles",
                  "Shoulder Smash"
                ),
                "Spinning Back Fist",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spinning Back Fist",
                  ":summary",
                  "* The fighter spins around adding force to the blow.\n-1 Initiative\n+1 Damage\n+1 Move"
                ),
                "Strike Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Strike Defense",
                  ":summary",
                  "* The fighter concentrates on the strikes of the opponent but becomes vulnerable to other attacks.\n* [Reaction]\n+1 Initiative\n-1 Move\n+2 Defense vs. Strikes (-1 Defense vs. Others)"
                ),
                "Sword Hand",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sword Hand",
                  ":summary",
                  "+1 Accuracy\n+1 Damage\n-2 Move",
                  ":titles",
                  "Karate Chop"
                ),
                "Tiger Claw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tiger Claw",
                  ":summary",
                  "Tiger Claw Strike"
                ),
                ":Uppercut",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Uppercut",
                  ":summary",
                  "* This powerful punch starts low and ends high using the fighter's leg and back muscles to increase damage.\n* [Criticals] can be exchanged for Knockback\n-1 Initiative\n+1 Damage\n-1 Move"
                ),
                "Axe Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Axe Kick",
                  ":summary",
                  "* Fighter raises his leg high over his head and snaps it down toward the opponent's head and neck.\n* [High Attack]\n-1 Initiative\n-2 Move\n+1 Damage"
                ),
                "Back Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Back Kick"
                ),
                "Backflip Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backflip Kick",
                  ":summary",
                  "* [High Attack]\n* [Limited] by [Acrobatics].\n+1 Initiative\n1 Move (directly backwards)\n+1 Damage",
                  ":titles",
                  "Flash Kick"
                ),
                "Crescent Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Crescent Kick"
                ),
                "Double Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Double Kick",
                  ":summary",
                  "* [Combo]: [Roundhouse Kick] followed by [Spinning Thrust Kick]"
                ),
                "Dragon Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dragon Kick",
                  ":summary",
                  "-- 1		+6 (x2) 	-- 2		S,C		(1C, 1W)		K5, F4, Jump	*  Knockback; KD; -->Aerial Maneuver."
                ),
                "Dragon Tail",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dragon Tail",
                  ":summary",
                  "* The fighter drops low, extends his leg and whirls around quickly, kicking his opponents and knocking their feet out from under them.\n-2 Initiative\n-1 Accuracy\nDamage is [Knockback] instead.\nCriticals are [Knockdown] instead.",
                  ":titles",
                  "Iron Broom, Tiger Tail Sweep"
                ),
                "Drop Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drop Kick",
                  ":summary",
                  "* Ends [Prone].\n* Kick the opponent with the soles of both feet and fall to the ground."
                ),
                "Flying Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flying Kick",
                  ":image",
                  "MartialArts/FlyingKick.jpg",
                  ":summary",
                  "* The fighter launches himself feet first into the air toward his opponent.  He ends his move with a powerful kick, usually to the opponent's head or midsection.\n+1 Accurary\n+1 Damage\n+1 Move (Aerial in one direction)\n +  0		+  6		-- 2		S,C		(1 W)		K4, A4, Jump		*  Knockback; KD; --> Aerial Maneuver.",
                  ":titles",
                  "Flying Thrust Kick"
                ),
                "Foot Stomp",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Foot Stomp",
                  ":reference",
                  "* The toe crusher.  That went out of style when I left kindergarten. - Kung Fu Hustle",
                  ":summary",
                  "* Stomp on opponent's foot to slow their movement."
                ),
                "Handstand Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Handstand Kick",
                  ":summary",
                  "* The fighter bends over, places his hands on the ground, and then presses his legs up into a handstand. The legs snap up with tremendous kicking force. Can be used while [Prone]\n-1 Initiative\n1 Move\n+2 Damage"
                ),
                "Hurricane Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hurricane Kick",
                  ":image",
                  "MartialArts/HurricaneKick.jpg",
                  ":summary",
                  "-1 Speed\n-2 Attack\n* May attack up to 2 units in any surrounding spaces.",
                  ":titles",
                  "Butterfly Kick, Whirlwind Kick"
                ),
                "Kick Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kick Defense",
                  ":summary",
                  "* The fighter concentrates on the legs of the opponent but becomes vulnerable to other attacks.\n* [Reaction]\n+1 Initiative\n-1 Move\n+2 Defense vs. Kicks (-1 Defense vs. Others)"
                ),
                "Kick Off",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Kick Off",
                  ":summary",
                  "* Propel yourself and opponent apart instead of damaging. Especially useful when the opponent is near dangerous terrain.\n-1 Initiative\n+1 Accuracy\n[Hits] are [Knockback] instead.\n[Critical Hits] are [Knockdown] instead.",
                  ":titles",
                  "Heel Stamp"
                ),
                "Knee Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knee Drop"
                ),
                "Knee Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knee Strike",
                  ":image",
                  "MartialArts/TigerKnee.jpg",
                  ":summary",
                  "* Leap up to strike with the knee to the stomach, chest or face using the momentum of the leap to increase damage.\n+2 Initiative\n+1 Damage\n0 Move",
                  ":titles",
                  "Flying Knee Thrust, Tiger Knee"
                ),
                "Leg Sweep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Leg Sweep",
                  ":summary",
                  "* A low spinning kick designed primarily to knock an opponent of his feet.\n-2 Move\n-1 Accuracy [Low Attack]\n+1 Damage\n[Critical Hits] are [Knockdown]",
                  ":titles",
                  "Foot Sweep"
                ),
                "Lightning Leg",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lightning Leg",
                  ":image",
                  "MartialArts/LightningLeg.jpg",
                  ":summary",
                  "* [Finishing Move]\n* [Attack]: [Auto]\n LIGHTNING LEG			-- 2		+  1(x3)	None		as 100handslap	(1 W)		K3, Double Hit Kick\n*  Knockback; When this maneuver is chosen the fighter determines which of the three attacks strike high, and which strike low (2 high, 1 low; or 1 high, 2 low), this affects blocking accordingly."
                ),
                "Reverse Front Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reverse Front Kick",
                  ":summary",
                  "* Feint kick past head then snap back into the back of the head or neck.\n-1 Initiative\n+1 Accuracy\n-2 Move"
                ),
                "Roundhouse Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Roundhouse Kick",
                  ":summary",
                  "* Fighter pivots and kicks using the momentum from the pivot to increase the damage of the kick.\n-1 Initiative\n-1 Action\n+2 Damage"
                ),
                "Scissor Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scissor Kick",
                  ":summary",
                  "* Leap up and kick two opponents in different directions simultaneously.\n-1 Initiative\n0 Move [Aerial]\n-1 Damage"
                ),
                "Side Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Side Kick"
                ),
                "Slide Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Slide Kick",
                  ":summary",
                  "+1 Speed\n* [Low Attack]\n* Critical Hits can be [Knockdown]\n* End Action [Prone]"
                ),
                "Spinning Thrust Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spinning Thrust Kick",
                  ":summary",
                  "* Fighter spins gaining momentum and thrusts with the heel.\n-2 Initiative\n-2 Move\n+2 Damage",
                  ":titles",
                  "Amaranth Kick, Mule Kick"
                ),
                "Vault Kick",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Vault Kick",
                  ":summary",
                  "* Vault over an obstacle and land a devastating kick with all of your weight.\n+0 Move - Ignore the terrain penalty of 1 space next to the target.\n+0 Accuracy - [High Attack]\n+1 Damage\nCriticals are [Knockback]"
                ),
                "Atomic Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Atomic Drop"
                ),
                "Air Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Throw",
                  ":summary",
                  "* The fighter intercepts a leaping or flying opponent in mid-air, twists, and slams him to the ground, landing on top of him.\n* [Reaction], [Aerial]\n+1 Initiative\n+0 Damage is [Knockdown]. Damage also reduces falling Damage\nto the fighter.\nCriticals are [Knockdown]. Criticals also reduces falling Criticals\nto the fighter."
                ),
                ":Backbreaker",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backbreaker",
                  ":summary",
                  "* The fighter lifts his opponent in the air and smashes him to the ground or onto his knee. This maneuver can cause serious spinal injuries.\n* Uses a [Hold]\n-2 Initiative\n-1 Accuracy\n+2 Damage\nCriticals are [Cripple]"
                ),
                "Backroll Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backroll Throw",
                  ":summary",
                  "* The fighter grabs the opponent and then rolls backwards while using his legs to help lift and throw the opponent over him. The opponent is send directly behind the fighter and the fighter is left [Prone].\n* Uses a [Hold]\n-1 Initiative\n+1 Damage is [Knockdown]\nCriticals are [Knockdown]"
                ),
                "Bear Hug",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bear Hug",
                  ":summary",
                  "* The fighter wraps his arms around the opponent and crushes him.\n* [Continuous]\n* Requires a [Hold]\n-1 Initiative\n+1 Damage\n1 Move"
                ),
                "Choke Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Choke Hold",
                  ":summary",
                  "* The fighter wraps his arms around the opponents neck and begins choking him.\n* [Continuous]\n* Requires a [Hold]\n-1 Initiative\nCriticals are [Asphixiation]\n1 Move"
                ),
                "Fighting Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fighting Hold",
                  ":summary",
                  "* While holding the opponent, strike him repeatedly.\n* Requires [Hold]\n* [Continuous]\n+1 Initiative\n+1 Accuracy\n+1 Damage\n1 Move"
                ),
                "Grappling Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Grappling Defense",
                  ":summary",
                  "* Skilled grapplers must learn how to resist and escape from the same maneuvers that they use.\n* [Reaction]\n+1 Initiative\n-1 Move\n0 Damage - Remove a [Hold] from yourself.\nCriticals - Remove additional [Holds]."
                ),
                "Ground Fighting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ground Fighting",
                  ":summary",
                  "* [Passive]: Ignore penalties for being [Prone]."
                ),
                ":Headlock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Headlock"
                ),
                "Hip Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hip Throw",
                  ":summary",
                  "* This is a quick move to get an opponent on the ground. The fighter moves a leg behind the opponent's and pushes him past the hip and directly to the floor.\n-1 Move\nDamage - [Knockdown]\nCriticals - [Knockdown]"
                ),
                ":Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hold",
                  ":summary",
                  "* Puts a [Hold] on opponent.\n+1 Initiative\n0 Damage - Add a [Hold] token.\n0 Criticals"
                ),
                ":Hook",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hook",
                  ":summary",
                  "* The hook is a powerful punch with knockout power.\n* When throwing a hook, the puncher shifts his body weight to the\nlead foot, allowing him to pivot his lead foot and generate\nkinetic energy through the hip/torso/shoulder, swinging his lead\nfist horizontally toward the opponent.\n-1 Initiative\n+1 Damage\n+0 Criticals - [Stun]"
                ),
                "Iron Claw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Iron Claw",
                  ":summary",
                  "Damaging Grab"
                ),
                "Joint Lock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Joint Lock",
                  ":summary",
                  "* The fighter grabs a limb tightly and leverages the limb in ways the joint was not meant to turn. The attack is incredibly painful and can cause sprains, dislocations, and breaks.\n* [Continuous Hold]\n-2 Initiative\n-1 Accuracy\n+0 Damage - +1 Stun\n+0 Criticals - [Cripples]",
                  ":titles",
                  "Armbar, Armlock, Hammerlock, Leg Lock"
                ),
                "Knee Bash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knee Bash",
                  ":summary",
                  "* While holding the opponent, knee him repeatedly in the head or stomach.\n* Requires [Hold]\n* [Continuous]\n-1 Initiative\n+1 Accuracy\n+2 Damage\n0 Move"
                ),
                "Neck Break",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Neck Break",
                  ":summary",
                  "* The fighter grabs the opponent's head and twists it with the intention to break the neck. For best effect this is used as a surprise attack.\n-2 Initiative\n-2 Accuracy\n+4 Damage\nCriticals are [Cripples]"
                ),
                ":Nelson",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Nelson"
                ),
                ":Piledriver",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Piledriver"
                ),
                ":Pin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pin",
                  ":summary",
                  "* While grappling, attempt to immobilize the opponent.\n* Requires [Grapple]\n* [Continuous]\n+1 Damage - Damage is [Stun].\nCriticals are [Slow]"
                ),
                ":Reversal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Reversal"
                ),
                "Shoulder Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shoulder Throw",
                  ":summary",
                  "* The fighter lifts the opponent his is holding over a shoulder and hurls him as far as his strength will allow.\n* Requires a [Hold].\n-1 Move\n+1 Damage - [Knockback] in any direction the fighter chooses.\nCriticals - [Knockback]"
                ),
                "Sleeper Hold",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sleeper Hold"
                ),
                ":Suplex",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Suplex"
                ),
                ":Tackle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tackle",
                  ":summary",
                  "* Dive at the opponent and use weight and momentum to take you both to the ground.\n+1 Initiative\n+1 Move\n+1 Accuracy. Succeed or fail, the fighter is [Prone].\nDamage is [Knockdown].\nCriticals are [Knockdown]",
                  ":titles",
                  "Flying Tackle"
                ),
                "Take Down",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Take Down",
                  ":summary",
                  "* Fighter wraps his limbs around the opponent and causes both fighters to fall [Prone].\n+1 Initiative\n-1 Move\n0 Damage - Both fighters are [Prone] and puts a [Hold] on the other.\n0 Criticals"
                ),
                "Thigh Press",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thigh Press"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Strikes",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Strikes"
                ),
                ":Kicks",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kicks"
                ),
                ":Grappling",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Grappling",
                  ":summary",
                  "* Atomic Drop\n* Air Throw\n* Backbreaker\n* Backroll Throw\n* Bear Hug\n* Choke Hold\n* Fighting Hold\n* Grappling Defense\n* Ground Fighting\n* Headlock\n* Hip Throw\n* Hold\n* Hook Hold\n* Iron Claw\n* Joint Lock\n* Knee Bash\n* Neck Break\n* Nelson\n* Piledriver\n* Pin\n* Reversal\n* Shoulder Throw\n* Sleeper Hold\n* Suplex\n* Tackle\n* Take Down\n* Thigh Press"
                ),
                ":Aikido",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Aikido",
                  ":reference",
                  "* Water flows and takes any shape or course, yet it is always consistant with its own nature.",
                  ":summary",
                  "* This essentially noncombative Japanese art concentrates on the development of the self, and physical, mental, and spiritual nonresistance.  By moving with and blending with an opponent's attacks, they may be used against him.\n* Athletics - [Breakfall]\n* Evasion - [Deflect], [Disengage], [Drunken Monkey Roll], [Evasive Roll], [Iron Horse], [Weapon Block]\n* Grapples - [Air Throw], [Backroll Throw], [Disengage], [Grab], [Grapple Defense], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw], [Takedown]\n* Kicks - [Dragon Tail], [Kick Defense], [Leg Sweep], [Slide Kick]\n* Strikes - [Nerve Strike], [Strike Defense]\n\n  GRAB:\n  Ugoku Taosu(5)\n  Atemi Torae(4)\n\n  FOCUS:\n  Push(2)\n  Chi Kung Healing(3)\n  Ghost Form(5)\n  Stunning Shout(3)\n  Zen No Mind(3)",
                  ":titles",
                  "Aikijutsu"
                ),
                ":Boxing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Boxing",
                  ":summary",
                  "* Boxing is a fighting style that concentrates exclusively on punches.\n* Evasion - [Iron Skin]\n* Strikes - [Dash Attack], [Deflecting Punch], [Feint], [Haymaker], [Head Butt], [Hook], [Hyperfist], [Jab], [Ram], [Spinning Back Fist], [Uppercut]\n* Grapples - [Grab]"
                ),
                ":Brawling",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Brawling",
                  ":summary",
                  "* Brawling is no holds bars, no rules hand to hand fighting.",
                  ":titles",
                  "Bruiser, Pit Fighter, Street Fighter, Thug"
                ),
                ":Capoeira",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Capoeira",
                  ":summary",
                  "* A Brazilian marital art developed by slaves who were brought to South America from Africa. The style was disguised as dance to avoid punishment when caught training. The style is still typically practiced to music. The style developed acrobatic maneuvers that could be used while chained. Capoeiristas will sometimes cross the field doing cartwheels. Knife fighting is also sometimes included in the style.\n* Athletics - [Backflip], [Breakfall], [Cartwheel], [Jump], [Kippup]\n* Evasion - [Drunken Monkey Roll]\n* Grapples - [Backroll Throw]\n* Kicks - [Backflip Kick], [Dragon Tail], [Handstand Kick], [Kick Defense], [Knee Strike], [Leg Sweep], [Spinning Thrust Kick]\n* Strikes - [Head Butt], [Strike Defense]"
                ),
                "Commando Training",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Commando Training",
                  ":summary",
                  "* Commando Training is a generic term for the fighting styles taught to armed forces members. It is a practical, sometimes brutal style that borrows from a variety of other styles and combines them into a style that can be taught to recruits quickly.\n* Evasion - [Disarm], [Kick Defense], [Strike Defense]\n* Grapples - [Choke Hold], [Grab], [Grapple Defense], [Knee Bash], [Joint Lock], [Pin], [Shoulder Throw], [Tackle]\n* Kicks - [Knee Strike], [Leg Sweep]\n* Strikes - [Elbow Strike], [Hook], [Knife Hand], [Spinning Back Fist], [Sword Hand]",
                  ":titles",
                  "Special Forces Training"
                ),
                ":Hapkido",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hapkido",
                  ":summary",
                  "* This Korean Martial Art borrows many techniques successfully from other styles; it is a combination of the Aidido, Jujutsu, and Karate styles of Japan with the Korean systems of hwang Do and Taekyon (percursor to Tae Kwan Do).  It is a style that teaches focus on passivity in opposing force, countering and attacking with circular motions, and the absolute penetration of an opponent's defenses.\n* A Hapkido practitioner receives a strong attack gently and counters a gentle attack powerfully and a subtle rythym of attacks and counters develops in the combat. This perpetual and fluid rythym, as well as constant mobility, are hallmarks of the style.\n* Athletics - [Breakfall], [Jump]\n* Evasion - [Disarm], [Evasive Roll]\n* Grapples - [Back Roll Throw], [Grappling Defense], [Joint Lock], [Choke Hold], [Pin], [Shoulder Throw], [Takedown]\n* Strikes - [Deflecting Punch], [Nerve Strike], [Phoenix Strike], [Spinning Back Fist], [Strike Defense]\n* Kicks - [Axe Kick], [Crescent Kick], [Double Kick], [Flying Kick], [Kick Defense], [Leg Sweep], [Roundhouse Kick], [Spinning Thrust Kick]"
                ),
                ":Hsing-I",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hsing-I",
                  ":summary",
                  "* Hsing-I stylists attempt to use the body's internal energy, ch'i, to perform astounding feats. The first set of block-strike manuevers are based on the five elements (fire, water, earth, metal, and wood). The second is a group of animal based forms (including Dragon, Tiger, Horse, Turtle, Chicken, Snake, and Bear). The typical attack is to block a	strike, grab the arm or leg, and strike back with the hand.\n* Evasion - [Deflect], [Weapon Block]\n* Brawling - [Haymaker]\n* Grapples - [Hip Throw], [Joint Lock]\n* Kicks - [Kick Defense], [Leg Sweep]\n* Strikes - [Grab Punch], [Nerve Strike], [Phoenix Strike], [Strike Defense]",
                  ":titles",
                  "Heart and Mind"
                ),
                ":Hwarang-Do",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hwarang-Do",
                  ":summary",
                  "* This style concentrates on punches and a wid variety of weapon techniques. Further masters are said to possess mystical powers including telepathy, clairvoyance, and the ability to sense danger.\n* A Korean style that is said to have grown out of certain healing techniques, and modern masters are often healers as well. Legend has it that a Buddhist mong developed the style and taught it to the Hwarang who were similar the Korean equivalent of knights: fighters, diplomats, and military leaders who lived by a strict code of honor.\n* Athletics - [Breakfall], [High Jump], [Kippup], [Long Jump]\n* Evasion - [Deflect], [Disengage]\n* Grapples - [Choke Hold], [Grapple Defense], [Joint Lock], [Shoulder Throw]\n* Kicks - [Backflip Kick], [Kick Defense], [Roundhouse Kick], [Slide Kick]\n* Strikes - [Dash Attack], [Elbow Strike], [Nerve Strike], [Phoenix Strike], [Strike Defense]\n* Focus Powers - [Blind Fighting], [Spirit Healing], [Zen No Mind]"
                ),
                "Jeet Kune Do",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Jeet Kune Do",
                  ":reference",
                  "* Use whatever works.",
                  ":summary",
                  "* A martial art created by the late Bruce Lee. After studying many differenct martial arts, Lee decided that their reliance on a limited group of maneuvers made them ineffective. Instead, he catalogued all of the ways that the human body could be used to attack or defend and then created a simplified and practical fighting style with no patterns or predefined conceptions.\n* Grapples - [Choke Hold], [Joint Lock], [Hip Throw]\n* Kicks - [Foot Stomp], [Kick Defense], [Lightning Leg], [Roundhouse Kick]\n* Strikes - [Elbow Strike], [Feint], [Nerve Strike], [One Two Punch], [Phoenix Strike], [Spinning Back Fist], [Strike Defense]\n* Focus Powers - [Zen No Mind]",
                  ":titles",
                  "The Way of the Intercepting Fist"
                ),
                ":Jujutsu/Judo",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Jujutsu/Judo",
                  ":summary",
                  "* A Japanese fighting style with roots 1200 years old.\n* Jujutusu focuses on grapples instead of strikes. The typical maneuver grabs an opponent, forces him to the ground, and finishes him off.\n* Athletics - [Breakfall], [Kippup]\n* Evasion - [Disarm], [Disengage], [Iron Horse]\n* Grapples - [Air Throw], [Backroll Throw], [Choke Hold], [Ground Fighting], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw], [Takedown]\n* Kicks - [Dragon Tail], [Leg Sweep]\n* Strikes - [Disarm], [Nerve Strike]"
                ),
                ":Kabaddi",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kabaddi",
                  ":summary",
                  "* [Head Butt]\n  KICK:\n  Slide Kick(2)\n\n  BLOCK:\n  San He(3)\n  Energy Reflection(3)\n\n  GRAB:\n  Head Butt Hold(2)\n  Brain Cracker(1)\n  Dislocate Limb(3)\n  Disengage(1)\n  Air Suplex(1)\n\n  ATHLETICS:\n  Cannon Drill(5)\n  Flying Body Spear(2)\n\n  FOCUS:\n  Chi Kung Healing(3)\n  Extendible Limbs(4)\n  Fireball(3)\n  Improved Fireball(5)\n  Regeneration(1)\n  Yoga Flame(3)\n  Yoga Teleport(5)\n  Cobra Charm(2)\n  Ghost Form(5)\n  Flying Fireball(3)\n  Inferno Strike(5)\n  Mind Reading(3)\n  Telepathy(2)\n  Chi Push(5)\n  Levitation(3)\n  Balance(3)\n  Leech(3)"
                ),
                ":Kalaripayattu",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kalaripayattu",
                  ":summary",
                  "* A boxing art from southern India that dates back to 500 AD. Fighters are trained in 4 syltes: unarmed, stick fighting, other weapons, and the 108 vital points of the human body. Masters are also skiled healers.\n* Athletics - [Breakfall], [Jump]\n* Grapples - [Joint Lock], [Throw]\n* Kicks - [Flying Kick], [Roundhouse Kick]\n* Strikes - [Elbow Strike], [Nerve Strike], [Phoenix Strike], [Strike Defense], [Sword Hand]\n* Focus Powers - [Spirit Healing]",
                  ":titles",
                  "Battlefield Practices, Gurus"
                ),
                ":Karate",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Karate",
                  ":summary",
                  "* Karate focuses on direct strikes and kicks with few grabs or throws.\n* An extremely popular martial art originating in Okinawa, Japan in 400 AD. It became well developed only after the Japanese invaders forbade the Okinawans to carry weapons.\n* Athletics - [Jump], [Kippup]\n* Close Combat - [Hook]\n* Evasion - [Deflect], [Disarm], [Iron Horse], [Iron Skin]\n* Grapples - [Backroll Throw], [Hip Throw], [Shoulder Throw]\n* Kicks - [Axe Kick], [Back Kick], [Cresent Kick], [Dobule Kick], [Dragon Tail], [Flying Kick], [Foot Stomp], [Kick Defense], [Leg Sweep], [Reverse Front Kick], [Roundhouse Kick], [Scissor Kick]\n* Strikes - [Crouching Strike], [Dash Attack], [Dragon Fist], [Elbow Strike], [Knife Hand], [Nerve Strike], [Palm Strike], [Spinning Back Fist], [Strike Defense], [Sword Hand], [Tiger Claw]",
                  ":titles",
                  "Empty Hands"
                ),
                ":Kickboxing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kickboxing",
                  ":summary",
                  "* [Backroll Throw]\n* [Dashing Punch]\n* [Haymaker]\n* [Hyperfist]\n* [Knee Bash]\n* [Slide Kick]\n* [Spinning Back Fist]\n  PUNCH:\n  Feint(1)\n  Hook(1)\n  Double Hit Punch(1)\n  Heart Punch(4)\n  Lunge Punch(2)\n  Fist Sweep(2)\n  Dashing Punch(5)\n  Turn Punch(5)\n  Rekka Ken(5)\n  Spinning Back Fist(1)\n  Spinning Knuckle(3)\n\n  KICK:\n  Double Dread Kick(3)\n  Back Roundhouse(1)\n  Ax Kick(3)\n  Reverse Frontal Kick(1)\n  Flying Knee Thrust(1)\n  Stepping Front Kick(3)\n  Slide Kick(2)\n  Double Hit Kick(1)\n  Wounded Knee(2)\n\n  BLOCK:\n  Deflecting Punch(1)\n\n  GRAB:\n  Knee Basher(2)\n  Back Roll Throw(1)\n  Brain Cracker(1)\n\n  ---- Savate ----\n  PUNCH:\n  Spinning Back Fist(1)\n  Palm Heel Punch(1)\n  Ear Pop(2)\n  Spinning Knuckle(3)\n\n  KICK:\n  Ax Kick(2)\n  Double Hit Kick(1)\n  Flash Kick(4)\n  Double Dread Kick(3)\n  Foot Sweep(1)\n  Spinning Foot Sweep(1)\n  Lightning Leg(5)\n  Slide Kick(2)\n  Stepping Front Kick(4)\n  Flying Knee Thrust(1)\n  Double Hit Knee(1)\n\n  BLOCK:\n\n  GRAB:\n  Knee Basher(2)\n  Bear Hug(1)\n  Neck Choke(2)",
                  ":titles",
                  "Savate"
                ),
                ":Kobujutsu",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kobujutsu",
                  ":summary",
                  "* The martial art specializing in Okinawan weapons.\n* Melee - [Bash], [Dazing Blow], [Disarm], [Fleche], [Jab], [Parry], [Riposte], [Slash], [Sweep], [Thrust]\n* Melee Weapons - [Bo Staff], [Eiku], [Jo Staff], [Kama], [Nunchaku], [Sai], [Tonfa]"
                ),
                ":Krabi-Krabong",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Krabi-Krabong"
                ),
                "Kung Fu, Crane Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Crane Style",
                  ":summary",
                  "* The crane was known for its grace and beauty. Known to stand on one leg for long periods of time, it is no wonder that the crane stylists had excellent balance and were known for their awesome kicking ability and long range techniques.\n* Crane is very upright, attacking with carefully aimed strikes at long range and defending with redirection and retreat rather than resistance. Working from outside an opponent's effective range, Crane demands extreme technical proficiency and smooth footwork, as well as careful timing and judgment. Crane is high, circular, soft, and distant, working chiefly with progressive indirect attacks.\n* Athletics -  [Breakfall], [High Jump], [Jump]\n* Evasion - [Avoid], [Deflect], [Evasive Roll], [Sidestep]\n* Kicks - [Axe Kick], [Flying Kick], [Kick Off], [Leg Sweep], [Vault Kick]\n* Strikes - [Dash Attack], [Grab Punch], [Nerve Strike], [Spinning Back Fist]"
                ),
                "Kung Fu, Dragon Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Dragon Style",
                  ":summary",
                  "* Shen Lung (Spiritual or Invisible Dragon): While the Dragon is not a formally taught style in Shen Lung it instead represents what emerges when a practitioner can draw freely from all five animals as the situation demands. One who can use the power of Tiger, the mechanics of Mantis, the speed of Snake, the movements of Crane, and the cunning of Monkey.\n* As the dragon floats through the sky he twists and coils, flipping his tail as he turns. The dragon stylist uses turns and circular motions to throw and strike his opponents.\n* 'Ride the wind', a phrase which means follow rather than lead. Provide no opening without first letting your opponent open. Unlike Crane, which also relies heavily upon evasion as a tactic, the Dragon evades primarily by rotation of upper or lower torso with little or no stance movements, while the Crane stylist hops frequently to reposition the entire body. Both styles employ pinpoint strikes to vulnerable meridian targets, but dragon also heavily uses tiger-like punches and clawing techniques, snake-like stance shifts, and leopard-like hit and run strikes to weaken a physically superior adversary.  Dragon kung fu also regularly employs low sweeping techniques\n* Kicks - [Dragon Tail], [Flying Kick]\n* Strikes - [Dragon Fist], [Nerve Strike]"
                ),
                "Kung Fu, Leopard Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Leopard Style",
                  ":summary",
                  "* The leopard was known for its tremendous speed and cunningness. Unlike the tiger that doesn't mind frontal attacks, the leopard stylist prefers to attack only when the odds are in his favor. The only time he shows he is hurt is when he is not. He acts like he is running away in order to come back with an attack on his own ground.\n* Blocking is wasted in Leopard - the style can be summed up with 'Why block when you can hit?' It does not rely on rooted stances, and would only assume a stance while in attack in order to launch at the opponent. This hit and run technique of the leopard, something especially effective against larger opponents, is unique to the animal.\n* An interesting technique of the leopard is the ability to simultaneously block and strike. The sheer speed of the leopard is a defining characteristic of the style\n* Evasion - [Dodge], [Dodge Roll]\n* Strikes - [Deflecting Punch], [Dash Attack]"
                ),
                "Kung Fu, Mantis Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Mantis Style",
                  ":summary",
                  "* Mantis operates in sequences and combinations baffling opponents with multiple simultaneous attacks and blocks, all executed at high speed. Mantis is a quick, high, linear, hard style that attacks by rapidly executed combinations.\n* [Combination]\n* Strikes - [Deflecting Punch], [Hyperfist], [Jab], [Knife Hand], [One Two Punch]"
                ),
                "Kung Fu, Monkey Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Monkey Style",
                  ":summary",
                  "* Monkey style prefers to go to the ground, integrating throws, locks, grappling and ground-fighting. Monkey is very low, both hard and soft, close-range and favors full body contact.\n* Evasion - [Drunken Monkey Roll]\n* Grapples - [Grab], [Joint Lock], [Hold], [Pin], [Takedown]\n* Strikes - [Monkey Punch]"
                ),
                "Kung Fu, Snake Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Snake Style",
                  ":summary",
                  "* The snake is known for its speed once an opponent is in striking range. The snake raises its head and waits patiently until the unsuspecting opponent gets too close. The snake stylist, too, concentrates on waiting until the time is right and with his fingertips, strikes to a vital spot in a blink of an eye. Knowing how to use one's internal energy or chi is a major part of the snake system.\n* Snake is a soft style using an opponent's energy against them rather than resisting it. Snakes absorb, control and redirect rather than block an attack. Snake stylists are known for circular and whip-like motions flowing around opponents, climbing over their defenses and striking repeatedly in rapid succession. Snake is high, circular, soft and extremely fast, favoring progressive direct attacks that overwhelm a defense.\n* Snake style is based on whipping power which travels up the spine to the fingers. The ability to sinuously move, essentially by compressing one's stomach/abdominal muscles, is very important.\n\n* Strikes - [Back Fist], [Knife Hand], [Nerve Strike]\n* Focus Powers - [Death Touch]"
                ),
                "Kung Fu, Tiger Style",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Tiger Style",
                  ":summary",
                  "* Known for its power and strength, the tiger stylists were known for their ripping and tearing techniques. Hands held like tiger claws, these fighters would strike and claw with tremendous speed and power.\n* Tiger emphasizes close-range strikes, throws, and a willingness to stay in the danger zone long enough to set up a single fight-ending blow. Tiger commits fully to every motion, and maximizes power at the expense of mobility. Tiger is low, hard-style, and works with single direct attacks.\n* Strikes - [Crouching Strike], [Dash Attack], [Dragon Fist], [Elbow Strike], [Eye Rake], [Haymaker], [Strike Defense], [Sword Hand], [Tiger Claw]"
                ),
                "Kung Fu, Wing Chun",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Kung Fu, Wing Chun",
                  ":summary",
                  "* Wing Chung, literally 'singing spring', is a Southern Chinese kung fu style and a form of self-defense originating in Qing China, which requires quick arm movements and strong legs. Softness (via relaxation) and performance of techniques in a relaxed manner is fundamental to Wing Chun."
                ),
                "Muay Thai",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Muay Thai",
                  ":reference",
                  "* Apachai: The use of knees and elbows is very important in Muay Thai.\n* Akisame: Which, in fact, is rather rare as most contemporary martial arts have banned the use of knees and elbows in tournament fighting.\n* Kenichi: Really? How come?\n* Apachai: If you use them wrong, you can kill your opponent!\n* Akisame: That's right. However, in Muay Thai, they specifically focus on these moves.\n* Kenichi: Yeahhh, and why is that?\n* Apachai: Because if you use them right, you can kill your opponent!\n- Kenichi: World's Mightiest Disciple",
                  ":summary",
                  "* A fast, brutal martial art from Thailand.\n* The style uses close strikes with the knees, elbows, fists, and feet. There are no grabs or throws. Fighters often jump up to add more force to their blows. Fighters are also trained to take damage as much as avoid it.\n* Evasion - [Iron Skin]\n* Grapples - [Knee Bash]\n* Kicks - [Axe Kick], [Double Kick], [Foot Stomp], [Kick Defense], [Knee Drop], [Knee Strike], [Leg Sweep], [Lightning Leg], [Reverse Front Kick], [Roundhouse Kick]\n* Strikes - [Dash Attack], [Dragon Punch], [Elbow Drop], [Elbow Strike], [Feint], [One Two Punch], [Ram], [Spinning Back Fist], [Strike Defense], [Sword Hand], [Uppercut]",
                  ":titles",
                  "Thai Kickboxing"
                ),
                ":Ninjutsu",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Ninjutsu",
                  ":summary",
                  "* Ninjutsu is the art of the Japanese Ninja. Ninjutsu saw greatest use from 1200-1600 AD when warlords employed ninja clans to spy on and assassinate their enemies.\n* The primary weapons of the ninja are the ninja-to sword and shuriken throwing stars. They were also adept in many types of concealed weapons. They are also known for unusual gadgets to assist them in climbing, crossing water, picking locks, etc. They are assassins, so they are not interested in honorable combat and will use traps or poison instead of combat if possible.\n* Kunoichi - Female ninja operated as infiltrators, spies and assassins. They spent time in enemy houses, reported secrets and undermined rival houses by any means necessary. Kunoichi could use their gender to their advantage because women were underestimated as warriors. This made it easier for them to get closer to their targets by posing as maids, geisha, servants and priestesses. In some cases, they were taken on as concubines and mistresses, giving them unparalleled access to all their marks.\n* Athletics - [Backflip], [Breakfall], [Jump], [Wall Spring]\n* Evasion - [Deflect], [Disarm], [Dirty Fighting], [Disengate], [Distraction], [Dive for Cover], [Dodge], [Dodge Roll], [Weapon Block]\n* Grapples - [Air Throw], [Backroll Throw], [Choke Hold], [Grapple Defense], [Groundfighting], [Joint Lock], [Suplex], [Takedown], [Tackle]\n* Kicks - [Backflip Kick], [Handstand Kick], [Leg Sweep], [Roundhouse Kick], [Slide Kick]\n* Strikes - [Ear Pop], [Grab Punch], [Nerve Strike], [Phoenix Strike]\n* Melee - [Dazing Blow], [Jab], [Parry], [Riposte], [Thrust]",
                  ":titles",
                  "Shinobi, Kunoichi"
                ),
                ":Pakua",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Pakua",
                  ":summary",
                  "* A Chinese 'internal' fighting style derived from I Ching, the Book of Changes which states that the universe is in a state of constant change. Therefore, in Pakua, any change, the placement of the foot, the turning of a hand is important. Pakua is highly circular and emphasizes footwork and constant motion. Pakua masters are said to use palm strikes instead of fist strikes to better control the energy they release.\n* Evasion - [Deflect], [Sidestep], [Weapon Block]\n* Grapples - [Grapple Defense], [Joint Lock]\n* Kicks - [Kick Defense], [Leg Sweep]\n* Strikes - [Grab Punch], [Palm Strike], [Strike Defense]\n* Focus Powers - [Zen No Mind]",
                  ":titles",
                  "Eight Diagrams"
                ),
                ":Pentjak-Silat",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Pentjak-Silat",
                  ":summary",
                  "* A broad set of Indonsian fighting styles. Fighters are trained to keep their footing on unstable ground because the condition is so common in Indonesia. Silat teaches many weapons especially the kris, a wavy bladed dagger. The mysticism and legends surrounding this weapon equal or exceed the katana.\n* Athletics - [Breakfall], [Disarm], [Disengage], [Dodge Roll], [Jump], [Kippup]\n* Evasion - [Deflect], [Hip Throw], [Iron Horse], [Iron Skin]\n* Grapples - [Choke Hold], [Grab Punch], [Grapple Defense], [Joint Lock], [Pin], [Takedown]\n* Kicks - [Double Kick], [Dragon Kick], [Flying Kick], [Leg Sweep], [Lightning Leg], [Roundhouse Kick]\n* Strikes - [Deflecting Punch], [Hyperfist], [Jab], [Nerve Strike], [Phoenix Strike], [Sword Hand]\n* Melee - [Fleche], [Parry], [Riposte], [Slash], [Thrust]",
                  ":titles",
                  "Guru, Pandekar, Silat"
                ),
                ":Savate",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Savate",
                  ":summary",
                  "* French Kickboxing developed in Marseilles in the 1600s from kick brawling French sailors. The style is characterized by a bouncing gait and a unique kick style. When delivering kicks, the fighter leans away from the direction of the kick and stretches one arm back like a fencer to maintain balance. This allows the torso to pivot away from any counterattack. Kicks are landed with the toes or shins instead of the ball or heel and are designed to quickly slip by blocking arms.\n* Evasion - [Disarm]\n* Grapples - [Back Roll Throw], [Bear Hug], [Choke Hold], [Knee Bash]\n* Kicks - [Axe Kick], [Double Kick], [Kick Defense], [Kick Off], [Knee Strike], [Leg Sweep], [Lightning Leg], [Roundhouse Kick], [Slide Kick], [Spinning Thrust Kick]\n* Strikes - [Dash Punch], [Deflecting Punch], [Ear Pop], [Feint], [Hook], [One Two Punch], [Palm Strike], [Spinning Back Fist], [Strike Defense]",
                  ":titles",
                  "Savateur, Savateuse"
                ),
                ":Sumo",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Sumo",
                  ":summary",
                  "* Evasion - [Iron Horse], [Iron Skin]\n* Grapples - [Air Throw], [Bear Hug], [Grapple Defense], [Knee Bash], [Hip Throw], [Shoulder Throw]\n* Kicks - [Double Kick], [Dragon Tail], [Leg Sweep]\n* Strikes - [Ear Pop], [Head Butt], [Hyperfist], [One Two Punch], [Palm Strike], [Sword Hand]",
                  ":titles",
                  "Cireum"
                ),
                "Tae Kwon Do",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Tae Kwon Do",
                  ":summary",
                  "* A Korean martial art developed in the 1600s AD. It emphasizes kicks over punches.\n* Athletics - [Breakfall], [Jump], [Wall Spring]\n* Evasion - [Deflect], [Iron Horse]\n* Kicks - [Axe Kick], [Double Kick], [Flying Kick], [Hurricane Kick], [Kick Off], [Knee Strike], [Lightning Leg], [Reverse Front Kick], [Roundhouse Kick], [Scissor Kick]\n* Strikes - [Deflecting Punch], [Haymaker], [Hyperfist], [Spinning Back Fist], [Sword Hand]",
                  ":titles",
                  "The Way of Kicking and Punching"
                ),
                "Tai Ch'i Ch'uan",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Tai Ch'i Ch'uan",
                  ":summary",
                  "* The ultimate internal Chinese martial art. The style is based on the\nThirteen Postures (8 actions, 5 directions). It emphasizes blocking\na strike and grabbing or striking back.\n* Athletics - [Balance], [Breakfall]\n* Evasion - [Deflect], [Disarm], [Disengage], [Iron Horse], [Iron Skin]\n* Grapples - [Air Throw], [Back Roll Throw], [Grab Punch], [Grappling Defense], [Hip Throw], [Joint Lock], [Pin], [Shoulder Throw]\n* Kicks - [Dragon Tail], [Kick Defense], [Leg Sweep], [Slide Kick]\n* Strikes - [Deflecting Punch], [Grab Punch], [Nerve Strike], [Palm Strike], [Phoenix Strike], [Strike Defense]\n* Focus - [Empty Force], [Spirit Healing], [Zen No Mind]",
                  ":titles",
                  "Supreme Ultimate Fist, Yin-Yang Boxing"
                ),
                ":Wrestling",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Wrestling",
                  ":summary",
                  "* Wrestling is one of the earliest martial arts. Virtually every ancient society had some form of wrestling and many have survived largely unchanged.\n* Atheltics - [Breakfall], [Jump]\n* Evasion - [Disengage]\n* Grapples - [Air Throw], [Backbreaker], [Bear Hug], [Choke Hold], [Grapple Defense], [Hip Throw], [Iron Claw], [Joint Lock], [Knee Bash], [Nelson], [Piledriver], [Pin], [Reversal], [Sleeper Hold] [Shoulder Throw], [Suplex], [Tackle], [Take Down], [Thigh Press]\n* Kicks - [Knee Strike]\n* Strikes - [Ear Pop], [Haymaker], [Ram]",
                  ":titles",
                  "Dumog/Greco Roman/Koshti/Naban/Sanbo/Yaghliguresh"
                ),
                "Wu Shu",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Wu Shu",
                  ":summary",
                  "* [Axe Kick]\n* [Backflip Kick]\n* [Backroll Throw]\n* [Drunken Monkey Roll]\n* [Flying Kick]\n* [Handstand Kick]\n* [Hurricane Kick]\n* [Kick Off]\n* [Kippup]\n* [Leg Sweep]\n* [Lightning Leg]\n* [Reverse Front Kick]\n* [Rolling Attack]\n* [Scissor Kick]\n* [Slide Kick]\n* [Spinning Back Fist]\n* [Spinning Thrust Kick]\n* [Wall Spring]\n  PUNCH:\n  Rekka Ken(5)\n  Spinning Knuckle(3)\n\n  KICK:\n  Back Flip Kick(2)\n  Forward Back Flip Kick(1)\n  Ax Kick(4)\n  Cartwheel Kick(2)\n  Reverse Frontal Kick(2)\n  Scissor Kick(4)\n  Flying Thrust Kick(4)\n  Forward Flip Knee(2)\n  Handstand Kick(1)\n  Hurricane Kick(1)\n  Air Hurricane Kick(1)\n  Lightning Leg(3)\n  Stepping Front Kick(4)\n  Whirlwind Kick(4)\n  Double Hit Kick(1)\n  Great Wall Of China(5)\n  Descending Wheel Kick(4)\n\n  BLOCK:\n  Maka Wara(4)\n  San He(3)\n\n  GRAB:\n  Air Throw(2)\n  Back Roll Throw(1)\n\n  ATHLETICS:\n  Cannon Drill(5)\n  Displacement(4)\n  Backflip(2)\n  Flying Heel Stomp(3)\n  Rolling Attack(3)\n  Vertical Rolling Attack(3)\n  Wall Spring(1)\n  Evasive Tumble(2)\n\n  FOCUS:\n  Balance(4)\n  Chi Kung Healing(4)\n  Fireball(4)\n  Improved Fireball(5)\n  Flying Fireball(3)"
                ),
                ":Binding",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Binding",
                  ":summary",
                  "* Includes Garotte, Pianowire, Monofilament, Pillowcase, Towel, Rolled up Shirt, etc.",
                  ":titles",
                  "Strangler"
                ),
                ":Knives",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Knives",
                  ":reference",
                  "* Do you want to know why I use a knife? Guns are too quick. You can't savor all the little...emotions. You see, in their last moments, people show you who they really are. So, in a way I know your friends better than you ever did. Would you like to know which of them were cowards? - Joker, The Dark Knight",
                  ":summary",
                  "* Includes Pocket Knives, Switchblades, Straight Razors, Small Kitchen Knives, etc.",
                  ":titles",
                  "Butcher, Knife Fighter, Murderer"
                )
              )
            ),
            "Combat Focus",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Combat Focus",
              ":titles",
              "Chi Powers",
              ":stat",
              "Spirit",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blind Fighting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blind Fighting"
                ),
                ":Combination",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combination",
                  ":summary",
                  "* Any combat abilities may be strung together as a Combination. Every ability after the first gets +1 to initiative. If any ability misses or fails, then the combo ends and the next ability is at -1 initiative. Each combo must be chosen when this ability is gained and must be taken again for each separate combo."
                ),
                "Death Touch",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Death Touch",
                  ":reference",
                  "Five Point Palm Exploding Heart Technique - Kill Bill",
                  ":summary",
                  "* The fighter strikes vulnerable pressure points, disrupting the opponent's chi flow causing intense pain or death. The effect has no outward effect, but the victim will know something is wrong. Eventually, the victim recovers or dies suddenly from the stress.\n-1 Action\n-2 Initiative\n-2 Accuracy\n+0 Damage - [Stun] only\n+3 Criticals - [Poison]\n0 Move\n-1 Defense",
                  ":titles",
                  "Dim Mak"
                ),
                "Empty Force",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Empty Force",
                  ":summary",
                  "* The fighter projects a strike across empty space. The fighter may strike at any range, but if he does not score at least 1 Criticals for each space of Range, the ability fails.\n-2 Initiative\n-2 Move\n-1 Damage\nCritical - [Range]",
                  ":titles",
                  "Distant Death, Kongjin"
                ),
                "Feather Walk",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feather Walk",
                  ":summary",
                  "* Reduces body weight while active.  This increases the effects of [Retreat] and leaping while decreasing falling speed and damage.\n* If [Skill] greater than or equal to [Body], then unit may walk on any substance that would suspend a feather.",
                  ":titles",
                  "Feather Fall, Walk on Water"
                ),
                "Feign Death",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feign Death"
                ),
                "Hold Breath",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hold Breath"
                ),
                "Spirit Healing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Spirit Healing",
                  ":titles",
                  "Chi Kung Healing"
                ),
                "Team Combo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Team Combo",
                  ":reference",
                  "Fastball Special - Colossus and Wolverine, X-men",
                  ":summary",
                  "* Like a [Combo], the Team Combo chains attacks together. The Team Combo however is performed by different members of a team with the identical Team Combo. Any team member may perform each step of the combo with each subsequent attack allowed to reroll 1 die. The combo ends if any attack misses, any member attacks twice in a row, or if a turn passes with no attack attempt. Any combat abilities may be strung together as a Team Combo (even abilities that only others in the team possess). Each combo must be chosen when this ability is gained and must be taken again for each separate combo."
                ),
                "Walk on Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Walk on Fire"
                ),
                "Zen No Mind",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Zen No Mind",
                  ":reference",
                  "The mind must always be in the state of 'flowing,' for when it stops anywhere that means the flow is interrupted...In the case of the swordsman, it means death.  When the swordsman stands against his opponent, he is not to think of the opponent, nor of himself, nor of his enemy's sword movements. ... When he strikes, it is not the man but the sword in the hand of the man's subconscious that strikes. - Zen Master Takuan Soho",
                  ":summary",
                  "* A mind not fixed or occupied by thought or emotion and thus open to everything.\n* Mushin is achieved when a fighter feels no anger, fear or ego during combat, so the fighter is totally free to act and react towards an opponent without hesitation. At this point, a person relies not on what they think should be the next move, but what is felt intuitively.\n* A martial artist would likely have to train for many years to be capable of mushin. This allows time for combinations of movements and exchanges of techniques to be practiced repetitively many thousands of times, until they can be performed spontaneously, without conscious thought.",
                  ":titles",
                  "Mushin"
                )
              )
            ),
            ":Defense",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Defense",
              ":titles",
              "Armorer, Defender, Shield Bearer, Shield Warden, Warder",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Armorsmithing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Armorsmithing",
                  ":summary",
                  "* The ability to repair, improve, or even create armor."
                ),
                ":Counterattack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Counterattack"
                ),
                "High Block",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Block",
                  ":summary",
                  "-1 Speed\n+4 Defense vs. [High Attack]\n+1 Defense vs. other attacks"
                ),
                "Low Block",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Low Block",
                  ":summary",
                  "-1 Speed\n+4 Defense vs. [Low Attack]\n+1 Defense vs. other attacks"
                ),
                "Powered Armor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Powered Armor"
                ),
                "Shield Bash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Bash"
                ),
                "Shield Block",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Block",
                  ":summary",
                  "* [Defend] [Damage]: Add Shield [Armor] to your [Armor]."
                ),
                "Shield Charge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Charge"
                ),
                "Shield Guard",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Guard",
                  ":summary",
                  "* [Reaction] [Damage]: Before adjacent unit takes damage, discard a [Club] to add your Shield [Armor]."
                ),
                "Shield Sacrifice",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Sacrifice",
                  ":summary",
                  "* [Club] [Defend] [Damage]: The shield becomes the target of any [Overwhelm] damage."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Medium Armor",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Medium Armor"
                ),
                "Heavy Armor",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Heavy Armor"
                ),
                ":Shields",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Shields"
                )
              )
            ),
            ":Evasion",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Evasion",
              ":summary",
              "* Evasion is a special defense typically used by those that choose to wear light or no Armor.",
              ":stat",
              "Defense",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Blade Locking",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blade Locking",
                  ":summary",
                  "* [Requires]: [Parry], May only be used against swords, knives or polearms.\n* [Reaction]: -2\n* [Success]: Opponent gains a [Broken Defense Token] for each [Hit]"
                ),
                "Body Climb",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Body Climb",
                  ":summary",
                  "* [Requires]: [Melee] or [Close Combat] vs an enemy of larger scale.\n* [Damage]: If the hit location is [Q], [K], or [A], Climb the target's body and do +1 Damage."
                ),
                ":Deflect",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deflect",
                  ":summary",
                  "* Deflect, catch, or even return projectiles hurled at the fighter.\n* This ability provides a second Defense roll against a projectile attack before the regular Defense roll.\n* [Reaction]\n+2 Initiative\n+1 Accuracy\n0 Damage - Any successes become -Damage to the projectile. If the projectile has 0 Damage remaining, it is caught.\nCriticals - Any Criticals become -2 Damage to the proejctile. If the projectile has 0 Damage remaining and there are still Criticals, the projectile may be immediately thrown at +[Criticals] Accuracy."
                ),
                "Dirty Fighting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dirty Fighting",
                  ":titles",
                  "Bite, Eye Gouge, Ear Pop, Hair Pulling, Low Blow"
                ),
                ":Disarm",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disarm",
                  ":reference",
                  "The Red Leaves Cut means knocking down the enemy's long sword. The spirit should be getting control of his sword. When the enemy is in a long sword attitude in front of you and intent on cutting, hitting and parrying, you strongly hit the enemy's sword with the Fire and Stones Cut... If you then beat down the point of his sword with a sticky feeling, he will necessarily drop the sword. If you practise this cut it becomes easy to make the enemy drop his sword. - Miyamoto Mushashi, The Book of Five Rings",
                  ":summary",
                  "* Strike to knock a weapon or item from opponent's grasp.\n* This special ability does no damage but allows the user to force a target to drop an item (usually a weapon).\n-1 Initiative\n-1 Accuracy\n0 Damage. Opponent drops the chosen item. Each critical moves the item 1 space away (your choice).",
                  ":titles",
                  "Red Leaves Cut"
                ),
                ":Disengage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Disengage",
                  ":summary",
                  "* The fighter removes a [Hold] token.\n* [Reaction]\n+1 Initiative\n0 Damage\n-1 Move"
                ),
                "Dive for Cover",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dive for Cover"
                ),
                ":Dodge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dodge",
                  ":summary",
                  "+1 Initiative\n-1 Action\n+1 Defense"
                ),
                "Dodge Roll",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dodge Roll"
                ),
                "Drunken Monkey Roll",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Drunken Monkey Roll",
                  ":summary",
                  "* [Crouching]\n-1 Action\n+2 Initiative\n+2 Move\n+1 Defense"
                ),
                "Iron Horse",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Iron Horse",
                  ":reference",
                  "The Blob, X-men",
                  ":summary",
                  "* The ability to prevent being moved.\n* [Passive]\n+1 Initiative\nDefense - When rolling Defense, [Hits] or [Criticals] can be exchanged for [Knockback] or [Knockdown] resistance.\n0 Move",
                  ":titles",
                  "San He"
                ),
                "Iron Skin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Iron Skin",
                  ":summary",
                  "* Hardening of the skin to prevent cuts and punctures.",
                  ":titles",
                  "Maka Wara, Stone Skin"
                ),
                ":Sidestep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sidestep"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Light Armor",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Light Armor"
                ),
                ":Bucklers",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Bucklers"
                )
              )
            ),
            ":Melee",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Melee",
              ":reference",
              "* Mizu: I must become the greatest swordsman alive. Swordfather: Is that all? - Mizu and Swordfather, Blue Eye Samurai",
              ":summary",
              "* Fighting near the opponent. This includes most hand to hand weapons.\n* [Target]: Melee combat may only be used to attack the 3 space directly ahead of you or the space you are on.\n* Allows the use of all Melee weapons, but unfamiliar weapons follow the [Unfamiliar Item] rule.\n* See Arms and Armor for weapons",
              ":titles",
              "Battlemaster, Champion, Congueror, Fencer, Fighter, Master of Arms, Warrior",
              ":stat",
              "Body",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Abdomen Timing of Two",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Abdomen Timing of Two",
                  ":reference",
                  "Abdomen Timing of Two refers to feinting an attack, then striking an enemy as they are retracting from an attack, hitting them in the abdomen with the correct timing of either two moves or two seconds. Although the technique seems relatively simple, Musashi lists this as one of the hardest techniques to time correctly."
                ),
                "Anvil Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anvil Strike",
                  ":summary",
                  "* [+1 Damage] when target is adjacent to solid terrain."
                ),
                ":Backlash",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Backlash"
                ),
                "Blade Barrier",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blade Barrier",
                  ":summary",
                  "* Creates a 3 space wide [Wall] directly in front of the unit by rapidly swinging the blade in a flashy display. Anything crossing this wall is subject to an [Opportunity Attack].",
                  ":titles",
                  "Wall of Swords"
                ),
                "Blind Fighting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blind Fighting"
                ),
                "Combat Sense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combat Sense"
                ),
                "Continuous Cut",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Continuous Cut",
                  ":reference",
                  "The Flowing Water Cut is used when you are struggling blade to blade with the enemy. When he breaks and quickly withdraws trying to spring with his sword, expand your body and spirit and cut him as slowly as possible with your long sword, following your body like stagnant water. - Miyamoto Mushashi, The Book of Five Rings",
                  ":summary",
                  "* [Reaction]: [+1 Defense].  If you are not hit, you may immediately attack as a free action at [-1 Attack].",
                  ":titles",
                  "Flowing Water Cut"
                ),
                "Dash Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dash Attack",
                  ":summary",
                  "* [Requires]: May only move in a straight line this turn.\n* [Action]: [-1 Attack], May attack any number of adjacent opponents along path each at a cumulative -1."
                ),
                "Dazing Blow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dazing Blow",
                  ":summary",
                  "-2 Damage\nDamage - [Stun]\nCriticals - [Stun]",
                  ":titles",
                  "Pommel Strike"
                ),
                "Dual Wield",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Dual Wield",
                  ":reference",
                  "* Not used on the battlefield where a shield would be more practical.\n               * Used primarily for parrying during one on one duels.\n               * Two longsword duelling was done by very skilled fighters in Italian duelling.\n               * Dual katana Japanese styles also exist.",
                  ":summary",
                  "* Using a Dagger, Hand Axe or Hammer in the off hand."
                ),
                ":Feint",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Feint",
                  ":summary",
                  "* Feints are maneuvers designed to distract or mislead, done by giving the impression that a certain maneuver will take place, while in fact another, or even none, will.",
                  ":titles",
                  "Kizeme"
                ),
                "Fend Off",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fend Off",
                  ":summary",
                  "* [Requires]: Weapon with [Reach]\n* [Reaction]: If you hit with [Fend Off], the opponent may not move any closer to you this turn."
                ),
                "Fire and Stones Cut",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fire and Stones Cut",
                  ":reference",
                  "The Fires and Stones Cut means that when the enemy's sword and your sword clash together you cut as strongly as possible without raising the sword even a little. This means cutting quickly with the hands, body and legs - all three cutting strongly. If you train well enough you will be able to strike strongly. - Miyamoto Mushashi, The Book of Five Rings",
                  ":summary",
                  "* [Reaction]: [+1 Defense]\n* [Action]: [+1 Attack], if you used this ability to [React] last turn."
                ),
                ":Fleche",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fleche",
                  ":summary",
                  "* A [Lunge] forward where the attacker continues to move forward past the defender to avoid a [Riposte] or Counter Attack.\n-1 Initiative\n+1 Move - May only move straight forward.\n+1 Damage"
                ),
                "Follow Through",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Follow Through",
                  ":summary",
                  "* [Action]: If you hit with this ability, you may immediately turn to the left or right and attack a target in the next adjacent space. This may be repeated any number of times at [-1 Attack] per target after the first though each additional target must be in the same direction."
                ),
                ":Hamstring",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hamstring",
                  ":summary",
                  "* Attack the legs to slow the opponent.\n* [Action]\n-1 Accuracy\nCriticals - [Cripple]"
                ),
                ":Impale",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Impale",
                  ":summary",
                  "* [Requires]: Spear\n* [Action]\n-1 Accuracy\nCriticals - [Piercing]"
                ),
                ":Lunge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Lunge"
                ),
                "Offhanded Fighting",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Offhanded Fighting",
                  ":summary",
                  "* [Action]: Normal Attack take a -2 penalty if performed with the non primary hand.  This ability negates that penalty when using this skill in the off hand."
                ),
                ":Parry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Parry",
                  ":summary",
                  "* The fighter uses his weapon to block an opponent's attack.\n* [Reaction]\n+1 Initiative\n+2 Defense"
                ),
                "Piercing Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Piercing Strike",
                  ":summary",
                  "* [Action]: Trades damage to increase armor penetration."
                ),
                "Rapid Strike",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rapid Strike",
                  ":reference",
                  "In One Timing means, when you have closed with the enemy, to hit him as quickly and directly as possible, without moving your body or settling your spirit, while you see that he is still undecided. The timing of hitting before the enemy decides to withdraw, break or hit, to be able to hit in the timing of an instant. - Miyamoto Mushashi, The Book of Five Rings",
                  ":summary",
                  "* [Requires]: Wear loose clothing or less. (Armor Penalty = 0).\n* [Action]: Speed +1, Attack -1",
                  ":titles",
                  "In One Timing, Lightning Blow"
                ),
                ":Riposte",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Riposte",
                  ":reference",
                  "When your swords clash together, in one motion when your sword springs away from theirs, use a continuous motion to slash their head, body and legs.",
                  ":summary",
                  "* Speedy attack that can only be performed after a [Parry] or a [Block].\n* [Requires]: Previous Action was [Parry] or [Block]\n+2 Initiative\n+2 Attack",
                  ":titles",
                  "Counter Strike"
                ),
                "Set Against Charge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Set Against Charge"
                ),
                "Stunning Blow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stunning Blow",
                  ":summary",
                  "* [Attack]: Trades lethal damage for stunning damage."
                ),
                ":Sweep",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sweep",
                  ":summary",
                  "* Attack the legs to trip the opponent.\n+1 Initative\n-1 Move\n-1 Damage\nCriticals - [Knockdown]",
                  ":titles",
                  "Trip"
                ),
                "There are Many Enemies",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "There are Many Enemies",
                  ":reference",
                  "When you are fighting one against many, draw both sword and companion sword and assume a wide-stretched left and right attitude. The spirit is to chase the enemies around from side to side, even though they come from all four directions. Observe their attacking order, and go to meet first those who attack first. Sweep your eyes around broadly, carefully examining the attacking order, and cut left and right alternately with your swords. Waiting is bad. Always quickly re-assume your attitudes to both sides, cut the enemies down as they advance, crushing them in the direction from which they attack. Whatever you do, you must drive the enemy together, as if tying a line of fishes, and when they are seen to be piled up, cut them down strongly without giving them room to move. - Miyamoto Mushashi, The Book of Five Rings",
                  ":summary",
                  "* [Requires]: [Duel Wield]\n* [Defense]: If [Surrounded], ignore opponents in front arc when determining [Surrounded] defense penalty."
                ),
                ":Thrust",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Thrust",
                  ":summary",
                  "+1 Initiative\n+1 Move\nCritcals - [Piercing]"
                ),
                "To Apply Stickiness",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "To Apply Stickiness",
                  ":reference",
                  "When the enemy attacks and you also attack with the long sword, you should go in with a sticky feeling and fix your long sword against the enemy's as you receive his cut. The spirit of stickiness is not hitting very strongly, but hitting so that the long swords do not separate easily. It is best to approach as calmly as possible when hitting the enemy's long sword with stickiness. The difference between 'Stickiness' and 'Entanglement' is that stickiness is firm and entanglement is weak. - Miyamoto Mushashi, The Book of Five Rings"
                ),
                "Weapon Block",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Weapon Block",
                  ":summary",
                  "* Deflect, catch, or even turn strike back with a weapon used against the fighter.\n* This ability provides a second Defense roll against a weapon attack before the regular Defense roll.\n* [Reaction]\n+2 Initiative\n+1 Accuracy\n0 Damage - Any successes become -Damage to the weapon. If the weapon has 0 Damage remaining, it is caught.\nCriticals - Any Criticals become -2 Damage to the weapon. If the weapon has 0 Damage remaining and there are still Criticals, the weapon may be immediately used at +[Criticals] Accuracy. Note: The weapon remains in the hands of the attacker."
                ),
                "Whirlwind Attack",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Whirlwind Attack",
                  ":summary",
                  "* Allows multiple attacks to different targets by trading accuracy for extra attacks."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Bladedancer",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Bladedancer",
                  ":summary",
                  "* A combat technique focusing on elegant moves that efficiently combine attack and defense. Heavy armor may not be used with this technique."
                ),
                ":Fensing",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Fensing",
                  ":summary",
                  "* A combat technique focusing on long quick blades like rapiers and epees.",
                  ":titles",
                  "Fenser"
                ),
                "Sword Saint",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Sword Saint",
                  ":summary",
                  "* A combat technique focusing almost exclusively on mastery of the sword.",
                  ":titles",
                  "Kensai, Kensei"
                ),
                ":Axes",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Axes",
                  ":reference",
                  "* Run to the bedroom,\nIn the suitcase on the left\nYou'll find my favorite axe.\nDon't look so frightened\nThis is just a passing phase,\nOne of my bad days. - Pink Floyd, One of My Turns",
                  ":titles",
                  "Axeman"
                ),
                "Flexible Weaponry",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Flexible Weaponry",
                  ":summary",
                  "* Backlash, Disarm, Trip",
                  ":titles",
                  "Hangman, Strangler"
                ),
                ":Hammers",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Hammers",
                  ":summary",
                  "* War hammers were developed as a consequence of the ever more prevalent metal armors of the medieval battlefields during the 14th and 15th centuries. Swords were of little use against these armors. The war hammer could deal blows of tremendous force to the target, especially when mounted on a pole, and by impact alone do damage without penetrating the armor. The spike end could be used for grappling the target's armour, reins, or shield, or could be turned in the direction of the blow to pierce even heavy armor. Against mounted opponents, the weapon could also be directed at the legs of the horse, toppling the armored foe to the ground where he could be more easily attacked.\n               * See Arms and Armor for weapons"
                ),
                "Short Blades",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Short Blades",
                  ":summary",
                  "* Includes Short Swords, Daggers, Stilettos, Machetes, Large Kitchen Knives, etc."
                ),
                ":Polearms",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Polearms",
                  ":summary",
                  "Fend Off",
                  ":titles",
                  "Glaivemaster, Halberdier, Poleman"
                ),
                ":Spears",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Spears",
                  ":summary",
                  "Fend Off, Impale, Set Against Charge, Shield Snare",
                  ":titles",
                  "Lancer, Javelineer, Myrmidon, Peltast, Pikeman, Spartan, Spearman, Velite"
                ),
                ":Staves",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Staves",
                  ":summary",
                  "* This specialty includes long staves and short sticks. Staves have longer reach than most weapons while fighting sticks attack with great speed.\n* [Dazing Blow], [Disarm], [Fend Off], [Fleche], [Parry], [Riposte], [Sweep]",
                  ":titles",
                  "Arnis, Bojutus, Escrima, Kali, Stick Fighting"
                ),
                ":Swords",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Swords",
                  ":reference",
                  "The Book of Five Rings - Miyamoto Mushashi\n\nThe Gaze\n* The gaze should be large and broad. This is the twofold gaze 'Perception and Sight'. Perception is strong and sight weak.\n* In strategy it is important to see distant things as if they were close and to take a distanced view of close things. It is important in strategy to know the enemy's sword and not to be distracted by insignificant movements of his sword. The gaze is the same for single combat and for large-scale combat.\n* It is necessary in strategy to be able to look to both sides without moving the eyeballs. You cannot master this ability quickly. Learn what is written here: use this gaze in everyday life and do not vary it whatever happens.\n\nThe Five Attitudes\n* The five attitudes are: Upper, Middle, Lower, Right Side, and Left Side.  These are the five.\n* Although attitude has these five dimensions, the one purpose of all of them is to cut the enemy.\n* There are none but these five attitudes.\n* Whatever attitude you are in, do not be conscious of making the attitude; think only of cutting.\n\n* Middle Attitude - Confront the enemy with the point of your sword against his face.  When he attacks, dash his sword to the right and 'ride' it.  Or, when the enemy attacks, deflect the point of his sword by hitting downwards, keep your long sword where it is, and as the enemy renews the attack cut his arms from below.\n\n* When you master my Way of the long sword, you will be able to control any attack the enemy makes.  I assure you, there are no attitudes other than the five attitudes of the long sword of NiTo.\n\n* Upper Attitude - From the Upper attitude cut the enemy just as he attacks.  If the enemy evades the cut, keep your sword where it is and, scooping from below, cut him as he renews the attack.\n\n* You will always win with the five long sword methods. You must train repeatedly.\n\n* Lower Attitude - Adopt the Lower attitude, anticipating scooping up. When the enemy attackes, hit his hands from below.  As you do so, he may try to hit your sword down. If this is the case, cut his upper arm(s) horizontally with a feeling of 'crossing'. This means that from the Lower attitudes you hit the enemy at the instant that he attacks. You will encounter this method often, both as a beginner and in later strategy.\n* Left Side Attitude - Adopt the Left Side attitude. As the enemy attacks, hit his hands from below. If as you hit his hands he attempts to dash down your sword, with the feeling of hitting his hands, parry the path of his long sword and cut across from above your shoulder. Through this method you win by parrying the line of the enemy's attack.\n* Right Side Attitude - In the fifth approach, the sword is in the Right Side attitude. In accordance with the enemy's attack, cross your sword from below at the side to the Upper attitude. Then cut straight from above.\n* Cut and Slash - To cut and slash are two different things.  Cutting, whatever form of cutting it is, is decisive, with a resolute spirit. Slashing is nothing more than touching the enemy. Even if you slash strongly, and even if the enemy dies instantly, it is slashing. When you cut, your spirit is resolved. You must appreciate this. If you first slash the enemy's hands or legs, you must then cut strongly. Slashing is in spirit the same as touching. When you realise this, they become indistinguishable. Learn this well.",
                  ":summary",
                  "* Melee - [Abdomen Timing of Two], [Continuous Cut], [Dash Attack], [Dazing Blow], [Fleche], [Fire and Stones Cut], [Parry], [Riposte], [Slash], [There Are Many Enemies], [Thrust], [To Apply Stickiness]",
                  ":titles",
                  "Bushi, Fencer, Fencing, Kendo, Kenjutsu, Kensei, Ronin, Sword Saint, Samurai, Swordsman"
                )
              )
            ),
            ":Ranged",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Ranged",
              ":reference",
              "* Good. Bad. I'm the guy with the gun. - Ash, Army of Darkness",
              ":titles",
              "Archer, Javelineer, Slinger",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Arcing Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Arcing Fire",
                  ":summary",
                  "* [Requires]: Bow or Javelin\n* May fire over other units that block Line of Sight."
                ),
                "Barbed Javelin",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barbed Javelin",
                  ":summary",
                  "* [Requires]: Javelin\n* Criticals vs Large units are [Rage] Tokens."
                ),
                "Bowel Raker",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bowel Raker",
                  ":summary",
                  "* +1 [Bleeding]\n* -1 [Piercing]",
                  ":titles",
                  "Serrated Arrow"
                ),
                "Deadly Arrow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Deadly Arrow",
                  ":summary",
                  "* [Requires]: Bow or Crossbow\n* Increase weapon range by 50% and choose [Hit Location]"
                ),
                "Double Shot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Double Shot",
                  ":summary",
                  "* -2 [Attack]\n* -1 [Piercing]\n* May attack two targets in same [Arc].",
                  ":titles",
                  "Double Throw"
                ),
                "Explosive Shot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Explosive Shot",
                  ":summary",
                  "* [Requires]: Bow or Crossbow"
                ),
                "Flaming Arrow",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flaming Arrow",
                  ":summary",
                  "* [Requires]: Bow or Crossbow"
                ),
                ":Fletching",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fletching",
                  ":summary",
                  "* The art of making arrows. High quality or specialized arrows are quickly used up and often impractical to buy. Creating your own is often a very practical solution.",
                  ":titles",
                  "Bowyer"
                ),
                "Knife Throwing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Knife Throwing"
                ),
                "Piercing Shot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Piercing Shot",
                  ":summary",
                  "* [Requires]: Bow or Crossbow\n* [Attack]: [+1 Armor Piercing]"
                ),
                ":Richochet",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Richochet",
                  ":summary",
                  "* [Requires]: Thrown Object"
                ),
                "Shield Snare",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Shield Snare",
                  ":summary",
                  "* [Requires]: Javelin, Target with shield\n* [Attack]: Criticals are [Encumberance] Tokens."
                ),
                "Signal Shot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Signal Shot",
                  ":summary",
                  "* Alert allied units by sending a prearranged signal. This can be flaming arrow at night, smoking arrow, singing arrow, etc.\n* [Requires]: Bow or Crossbow\n* [Action]: For the rest of the turn, other units adjacent to this unit may be treated as if under the [Sphere of Command] of any allied Commander."
                ),
                "Stunning Throw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Stunning Throw",
                  ":summary",
                  "* [Requires]: Thrown Object\n* Trades lethal damage for stunning damage."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Archery",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Archery",
                  ":summary",
                  "* Bowel Raker, Double Shot, Flaming Arrow",
                  ":titles",
                  "Archer, Archer Elite, Bowman, Crossbowman, Longbowman"
                ),
                "Thrown Weapons",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Thrown Weapons",
                  ":reference",
                  "You? You're very good. But me? I'm magic. - Bullseye, Daredevil Comics",
                  ":summary",
                  "* Barbed Javelin, Double Shot, Knife Throwing, Precision Throw, Shield Snare",
                  ":titles",
                  "Knife Thrower, Javelineer, Slinger"
                )
              )
            ),
            ":Firearms",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Firearms",
              ":titles",
              "Crackshot, Marksman, Rifleman, Sharpshooter, Sniper",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                ":Anti-Personnel",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Anti-Personnel",
                  ":summary",
                  "* [Action]: [+1 Damage] or [-1 Damage] vs. 2 or more Armor",
                  ":titles",
                  "Hollow Point"
                ),
                "Armor Piercing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Armor Piercing",
                  ":summary",
                  "* [Action]: Enemy at [-2 Armor]",
                  ":titles",
                  "Depleted Uraniumn"
                ),
                ":Autofire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Autofire",
                  ":summary",
                  "* [Requires]: Weapon with [Autofire]\n-1 [Attack]\n* [Action]: Target 2 adjacent units."
                ),
                "Chemical Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chemical Rounds",
                  ":summary",
                  "* [Action]: [-1 Damage], [Critical Hits] are [Acid]"
                ),
                "Fast Draw",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fast Draw",
                  ":summary",
                  "* [Requires]: Hand weapon\n* Spend 1 Speed to draw a Hand weapon from holster to hip where he can [Shoot From The Hip]."
                ),
                "Gyrojet Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gyrojet Rounds",
                  ":summary",
                  "* [Action]: [+1 Damage] at Long Range, [-1 Damage] at Short Range",
                  ":titles",
                  "Rocket Rounds"
                ),
                "High Explosive Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "High Explosive Rounds",
                  ":summary",
                  "* [Action]: Use [Blast] rules for targetting and damage.",
                  ":titles",
                  "Explosive Rounds"
                ),
                ":Hipshoot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Hipshoot"
                ),
                "Non-Lethal Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Non-Lethal Rounds",
                  ":summary",
                  "* [Action]: [-2 Damage] vs. 2 or more Armor.  Half of all [Damage] is [Stun] instead.",
                  ":titles",
                  "Rubber Bullets"
                ),
                "Paint Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Paint Rounds",
                  ":summary",
                  "* [Action]: [0 Damage], [Critical Hits] are [Stun]",
                  ":titles",
                  "Paintball"
                ),
                "Pin Down",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Pin Down"
                ),
                "Rapid Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rapid Fire"
                ),
                ":Scattershot",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Scattershot",
                  ":summary",
                  "* Choose a target starting from the closest.\n* If a hit is scored, roll another attack on the same target.\n* If no hit scored, roll against next target.\n* -1 for each Space of Range (Cone), -1 per roll (cumulative, inclusive).\n* Criticals can be used for additional damage rolls (multiple Hits)\n* If target was [Armor], that Armor is at +2 vs this attack",
                  ":titles",
                  "Glaser, Shot"
                ),
                ":Sniper",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sniper",
                  ":reference",
                  "* The snipe (a family of shorebirds) is difficult to catch for experienced hunters, so much so that the word 'sniper' is derived from it to refer to anyone skilled enough to shoot one.\n* I aim to win and my aim... is Excellent. - Caitlyn, Runeterra",
                  ":summary",
                  "* [Requires]: Long Range Weapon\n* Increase weapon range by 50% and choose [Hit Location]"
                ),
                "Supressive Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Supressive Fire",
                  ":summary",
                  "* Firing weapons at enemy forces with the primary goal of forcing them to remain under cover.\n* [Requires]: Weapon with [Autofire]\n* [Action]: Target a unit that has not been activated this turn, all [Hits] and [Critical Hits] are [Stun] tokens.\n+1 Attack",
                  ":titles",
                  "Covering Fire"
                ),
                "Tracer Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tracer Rounds",
                  ":summary",
                  "* [Requires]: [Auto], Must attack same target on subsequent round.\n* [Action]: [+1 Attack], [-1 Damage]."
                ),
                "Tracking Rounds",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tracking Rounds"
                ),
                ":Auto",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Auto",
                  ":summary",
                  "+1 Cost\n* Criticals can be used for additional damage rolls (multiple hits)."
                ),
                ":Blast",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Blast"
                ),
                ":Bombardment",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bombardment"
                ),
                ":Capacitors",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Capacitors",
                  ":summary",
                  "* Uses capacitors that can recharge 1 shot a turn from a power source rated at the same power level as a single shot.  Cannot be used with lower energy power sources."
                ),
                ":Electroshock",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Electroshock",
                  ":titles",
                  "Taser"
                ),
                "Extra Ammo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Extra Ammo",
                  ":summary",
                  "* 2x number of shots, each time this modifier is taken."
                ),
                "Flash Surpressor",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Flash Surpressor",
                  ":summary",
                  "* Reduces the muzzle flare of the weapon making it more difficult to visually locate the shooter."
                ),
                "Gun Mount",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Gun Mount",
                  ":titles",
                  "Bipod, Tripod"
                ),
                ":Overcharge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overcharge",
                  ":summary",
                  "* [Action]: Consume 2 shots to to 1 extra damage. Then Damage is -1 until repaired."
                ),
                "Overload Weapon",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Overload Weapon",
                  ":summary",
                  "* Detonate the entire weapon magazine (and the weapon) as an explosive with force equal to the total power in the magazine."
                ),
                ":Rechargable",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rechargable",
                  ":summary",
                  "* Uses batteries that can be slowly recharged from any power source."
                ),
                "Recoil Compensator",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Recoil Compensator",
                  ":summary",
                  "* Reduces the 'kick' of the weapon and therefore reduces the penalty for continuous fire."
                ),
                ":Silencer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Silencer"
                ),
                "Smoke Generator",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Smoke Generator"
                ),
                "Targeting Laser",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Targeting Laser"
                ),
                "Telescopic Sight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Telescopic Sight",
                  ":summary",
                  "Reduces penalties for Medium Range to Short Range and Long Range to Medium Range"
                ),
                ":Turret",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Turret",
                  ":image",
                  "Tokens/Arrow.png",
                  ":summary",
                  "+1 Cost\n* Turret mounted weapons may turn their turret toward any direction and fire from the side the turret is facing.\n* Turrets are normally assumed to be facing forward.  At the beginning of its [Action], a unit may change the turret facing by 1 side (Use a [Vector] Token) indicate where the Turret is pointing."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                "Energy Weapons",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Energy Weapons",
                  ":reference",
                  "Whoa, whoa, whoa! Nice shootin', Tex! - Ghostbusters"
                ),
                ":Handguns",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Handguns"
                ),
                ":Rifles",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Rifles"
                ),
                ":Shotguns",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Shotguns"
                )
              )
            ),
            ":Gunnery",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Gunnery",
              ":summary",
              "* Gunnery skill cannot exceed level 5 - Because advanced weapons are mostly point and shoot, weapon skill has less to do with the gunner and more to do with the weapon and its control system. Further, advanced weapons technologies come in a multitude of variations with constantly changing interfaces therefore it is very difficult to dedicate oneself to a single system to become an expert.\n* See Arms and Armor for weapons",
              ":titles",
              "Artillerist, Bombardier, Field Ops, Gunner",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Air Burst",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Air Burst"
                ),
                ":Barrage",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Barrage",
                  ":summary",
                  "* A barrage is a line or barrier of exploding shells from a large number of guns firing continuously.  Its purpose is to deny or hamper enemy passage.  It contrasts with a concentration, in which all the guns aim at the same small area.\n\n* The barrage was developed in World War I, with the infantry following the advancing barrage.  Its employment in this way recognised the importance of artillery fire in neutralising, rather than destroying, the enemy.  A creeping barrage immediately followed by an infantry assault could be far more effective than weeks of preliminary bombardment."
                ),
                "Forward Observer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Forward Observer",
                  ":summary",
                  "* [Action]: When unit has [Line of Sight] on a opponent, any number of units with [Indirect Fire] may attack that unit even if they do not have [Line of Sight]."
                ),
                "Indirect Fire",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Indirect Fire",
                  ":summary",
                  "-2 Attack\n-2 Damage\n* Other units do not block [Line of Sight].\n* See: [Forward Observer]\n* See: [HE - High Explosives]"
                ),
                "Point Defense",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Point Defense"
                ),
                ":Salvo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Salvo",
                  ":summary",
                  "* The simultaneous discharge of weapons, rather than scattered 'fire at will'.\n* Up to 10 weapons of the same type can be in 1 Salvo.\n* All targets in the space are attacked."
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Cannons",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Cannons"
                ),
                ":Flamethrowers",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Flamethrowers"
                ),
                ":Machineguns",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Machineguns"
                )
              )
            ),
            "Mental Power",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Mental Power",
              ":summary",
              "* This skill is used when manifesting and controlling a [Power] that directly affect the [Mind] of targets.\n* Mental Powers must have range and be able to 'see' the target.",
              ":titles",
              "Mental Challenge",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Mental Grip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Grip"
                ),
                "Mental Gymnastics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mental Gymnastics"
                ),
                "Mind Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mind Whip"
                ),
                "Psionic Blade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psionic Blade"
                ),
                "Psionic Knife",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psionic Knife"
                ),
                "Intellect Fortress",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Intellect Fortress"
                )
              )
            ),
            "Psychic Power",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Psychic Power",
              ":summary",
              "* This skill is used when manifesting and controlling a [Power] that directly affect the [Will] of targets.\n* Psychic Powers must have range and see or 'know' the target.",
              ":titles",
              "Psychic Combat, Psychological Warfare, Soul Combat, Spirit Combat, Test of Will",
              ":stat",
              "Will",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Ego Whip",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Ego Whip"
                ),
                "Psychic Knife",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Psychic Knife"
                ),
                "Tower of Iron Will",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Tower of Iron Will"
                )
              )
            ),
            ":Command",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Command",
              ":reference",
              "* Generals are in the business of getting people killed. Captains like to keep theirs alive. You wanna put on a parade? Go find a general. You wanna fight your way home? Talk to me. - Obregon Kaine, Negation Comic\n* Well hello mister fancy pants. I got news for you pal. You ain't leading but two things right now: Jack and Shit and Jack left town. - Ash, Army of Darkness\n* And when Alexander saw the breadth of his domain, he wept for there were no more worlds to conquer. - Hans Gruber, Die Hard",
              ":titles",
              "Captain, Castellan, Commander, Drillmaster, Drill Sergeant, Major, Overlord, Sergeant,\nWarchief, Warlord",
              ":stat",
              "Mind",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Call to Arms",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Call to Arms",
                  ":reference",
                  "Unite. Take up arms.\nStand shoulder to shoulder with your brothers and sisters.\nAnd break free from the cold shackles of oppression.\n\nLiberty for all is more noble than the preservation of one's soul.\nDestiny and valor will meet at the end of the sword.\nAnd the tales of heroic sacrifice will be the legend of a new age.\n\nThere will be no respite.\nThere will be no surrender.\nOnly glory and honor.\nThe price will be high for the greatest prize of all.\nStand and be counted among those that dared.\nThose who dared to fight for their freedom. - Glass Fleet",
                  ":summary",
                  "Gather a war party from the populace"
                ),
                "Chain of Command",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Chain of Command",
                  ":summary",
                  "* [Action]: [Activate] up to [Command] units directly or indirectly adjacent to this unit. These units (including this one) may spend [Speed] or [Actions] in any order this [Turn].\n* [Interrupt]: May not be used as an Interrupt."
                ),
                ":Rally",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Rally"
                )
              )
            ),
            ":Military",
            vx_core.f_new(
              nx_tactics_base.t_skill,
              ":name",
              "Military",
              ":reference",
              "* He can't make that kind of decision.  He's just a grunt!  No offense.  None taken - Burke and Hicks, Aliens\n* I think we'd better split up...Yeah... we can do more damage that way. - Ghostbusters\n* If ten times the enemy's strength, surround them; If five times, attack them; If double, divide them; If equal, be able to fight them; If fewer, be able to evade them; If weaker, be able to avoid them. - Sun Tzu\n* Warfare is the art of deception. Thus although you are capable, display incapability to them. When your objective is nearby, make it appear distant; when it is far away, create the illusion of being nearby. - Sun Tzu, The Art of War",
              ":titles",
              "Admiral, Brigade, Brigadier, Cadet, Centurion, Colonel, Commander, Commando, Conscript, Corporal, Field Marshal, Footman, Gamesman, General, Grunt, High Guard, Honor Guard, Infantry, Legionnaire, Lieutenant, Praetor, Praetorian Guard, Reserves, Royal Guard, Soldier, Soldier of Fortune, Strategist, Tactician, Vanguard",
              ":stat",
              "Will",
              ":abilitymap",
              vx_core.f_new(
                nx_tactics_base.t_abilitymap,
                "Airborne Assault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Airborne Assault"
                ),
                "Amphibious Assault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Amphibious Assault"
                ),
                ":Besiege",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Besiege"
                ),
                "Bomb Disposal",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Bomb Disposal",
                  ":reference",
                  "* I'll tell you a dirty little secret. When you're in the middle of an explosion, it's the ultimate rush. - Haggerty, Obliterated\n* Who has one thumb and just saved Las Vegas? This guy! - Hagerty, Obliterated"
                ),
                "Close Assault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Close Assault",
                  ":summary",
                  "* [Action]: If a [Vehicle] is adjacent to this unit, you may target the Top Armor.  If the unit has explosives, it may target the Under Armor."
                ),
                "Combat Driver",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Combat Driver",
                  ":summary",
                  "* Experienced in fighting in a car."
                ),
                ":Demolitions",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Demolitions",
                  ":summary",
                  "* Experienced with setting up large explosives to destroy large structures."
                ),
                "Divide and Conquer",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Divide and Conquer"
                ),
                "Diversionary Tactics",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Diversionary Tactics"
                ),
                ":Explosives",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Explosives",
                  ":summary",
                  "* Experienced using various small explosives in combat."
                ),
                "Field Fortifications",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Field Fortifications"
                ),
                "Formation: Back to Back",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Back to Back",
                  ":summary",
                  "* [Formation]: Not strictly a formation, units with their backs against each other largely protect each other's back."
                ),
                "Formation: Cover",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Cover",
                  ":summary",
                  "* [Formation]: Not strictly a formation, units in Cover formation stay close enough together to protect each other's sides."
                ),
                "Formation: March",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: March",
                  ":summary",
                  "* [Formation]: Units move in columns.\n* [+1 Speed]"
                ),
                "Formation: Parade",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Parade",
                  ":summary",
                  "* [Formation]: A showy formation designed to look good.  Has no use in battle.\n* [+ 1 Intimidation]"
                ),
                "Formation: Phalanx",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Phalanx",
                  ":reference",
                  "* With his friends jostling and pushing on both sides and behind, and his enemies forming a solid wall in front of him, the hoplite had little opportunity for feats of technique and weapon skill, but great need for commitment and mental toughness. The hoplites had to trust their neighbors for mutual protection, so a phalanx was only as strong as its weakest elements. Its effectiveness depended on how well the hoplites could maintain this formation while in combat, and how well they could stand their ground, especially when engaged against another phalanx. The more disciplined and courageous the army, the more likely it was to win. The Greek word dynamis, the 'will' or 'ability to fight,' was used to express the drive that kept hoplites in formation.",
                  ":summary",
                  "* [Formation]: Focuses on offense using Melee attacks with Reach.\n* [Requires]: At least half must have Weapons with Reach 2+.\n* [+1 Attack], [+1 Defense] from Front\n* [-1 Defense] from Rear"
                ),
                "Formation: Shield Wall",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Shield Wall",
                  ":summary",
                  "* [Formation]: Uses shields to form a wall.\n* [Requires]: At least half must have Shields.\n+1 Defense from Front."
                ),
                "Formation: Skirmish",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Skirmish",
                  ":reference",
                  "Acting as light infantry with their light arms and minimal armor, they could run ahead of the main battle line, release a volley of arrows, slingshots or javelins, and retreat behind their main battle line before the clash of the opposing main forces. The aims of skirmishing were to disrupt enemy formations by causing casualties before the main battle, and to tempt the opposing infantry into attacking prematurely, throwing their organization into disarray. Skirmishers could also be effectively used to surround opposing soldiers in the absence of friendly cavalry.",
                  ":summary",
                  "* [Formation]: Units move in loose shapes.\n* [Requires]: Only [Light Infantry].\n* [Move]: Ignore 1 [Terrain Penalty].\n* [+1 Defense] vs Ranged or Large Units\n* [+1 Defense] when in Terrain with Defense bonus\n* [-1 Defense] vs Small Melee and Close Combat Units",
                  ":titles",
                  "Skirmisher"
                ),
                "Formation: Testudo",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Testudo",
                  ":image",
                  "Skills/Testudo.jpg",
                  ":summary",
                  "* [Formation]: Uses shields to form a shell around a unit.\n* [Requires]: At least half must have Shields.\n* [+2 Defense] vs Ranged\n* Shields protect all sides\n* Cannot Attack",
                  ":titles",
                  "Tortoise Formation, Turtle Up"
                ),
                "Formation: Tight",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Tight",
                  ":summary",
                  "* [Formation]: Units stay tightly packed to maximize Melee defense.\n* [+1 Defense] vs Melee and Close Combat.\n* [-1 Defense] vs Ranged"
                ),
                "Formation: Wedge",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Formation: Wedge",
                  ":summary",
                  "* [Formation]: Units move in triangle and focus on breaking enemy formations.\n* [+1 Retreat] Token if unit inflicts at least 1 [Retreat]."
                ),
                ":Fortifications",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Fortifications"
                ),
                "Halo Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Halo Drop"
                ),
                "Jump Suit Combat",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Jump Suit Combat"
                ),
                "Military Vehicle",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Military Vehicle",
                  ":summary",
                  "* Every vehicle unit is assumed to have this ability. Units that are not vehicles must take this ability for each vehicle."
                ),
                "Mine Clearing",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mine Clearing"
                ),
                "Mine Laying",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mine Laying"
                ),
                "Mobile Infantry",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Mobile Infantry",
                  ":summary",
                  "* Experienced with powered armor."
                ),
                "Orbital Halo Drop",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Orbital Halo Drop"
                ),
                "Parachute Assault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Parachute Assault"
                ),
                ":Sapping",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Sapping",
                  ":reference",
                  "* If it was important, then they should have built it better. - Desert Naturalist, Runeterra"
                ),
                "Space Combat",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Space Combat"
                ),
                "Urban Assault",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Urban Assault"
                ),
                "Wingsuit Combat",
                vx_core.f_new(
                  nx_tactics_base.t_ability,
                  ":name",
                  "Wingsuit Combat"
                )
              ),
              ":specialtymap",
              vx_core.f_new(
                nx_tactics_base.t_specialtymap,
                ":Siegecraft",
                vx_core.f_new(
                  nx_tactics_base.t_specialty,
                  ":name",
                  "Siegecraft",
                  ":summary",
                  "* Besiege\n* Fortifications\n* Sapping",
                  ":titles",
                  "Sapper"
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
    vx_type: nx_tactics_books_combat.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Combat",
      ":image",
      "Warrior.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Combat Overview",
        nx_tactics_books_combat.f_chapter_combat_overview(),
        "Example of Play",
        nx_tactics_books_combat.f_chapter_example_of_play(),
        "Rules",
        nx_tactics_books_combat.f_chapter_rules(),
        "Skills",
        nx_tactics_books_combat.f_chapter_skills(),
        "Early Weaponry",
        nx_tactics_books_combat.f_chapter_early_weaponry(),
        "Modern Equipment",
        nx_tactics_books_combat.f_chapter_modern_equipment(),
        "Advanced Weaponry",
        nx_tactics_books_combat.f_chapter_advanced_weaponry()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_advanced_weaponry": nx_tactics_books_combat.e_chapter_advanced_weaponry,
      "chapter_combat_overview": nx_tactics_books_combat.e_chapter_combat_overview,
      "chapter_early_weaponry": nx_tactics_books_combat.e_chapter_early_weaponry,
      "chapter_example_of_play": nx_tactics_books_combat.e_chapter_example_of_play,
      "chapter_modern_equipment": nx_tactics_books_combat.e_chapter_modern_equipment,
      "chapter_rules": nx_tactics_books_combat.e_chapter_rules,
      "chapter_skills": nx_tactics_books_combat.e_chapter_skills,
      "tacticsbook": nx_tactics_books_combat.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_advanced_weaponry": nx_tactics_books_combat.t_chapter_advanced_weaponry,
      "chapter_combat_overview": nx_tactics_books_combat.t_chapter_combat_overview,
      "chapter_early_weaponry": nx_tactics_books_combat.t_chapter_early_weaponry,
      "chapter_example_of_play": nx_tactics_books_combat.t_chapter_example_of_play,
      "chapter_modern_equipment": nx_tactics_books_combat.t_chapter_modern_equipment,
      "chapter_rules": nx_tactics_books_combat.t_chapter_rules,
      "chapter_skills": nx_tactics_books_combat.t_chapter_skills,
      "tacticsbook": nx_tactics_books_combat.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/combat",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_advanced_weaponry)
    nx_tactics_books_combat.t_chapter_advanced_weaponry['vx_value'] = {
      name          : "chapter_advanced_weaponry",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_advanced_weaponry
    }

    // (func chapter_combat_overview)
    nx_tactics_books_combat.t_chapter_combat_overview['vx_value'] = {
      name          : "chapter_combat_overview",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_combat_overview
    }

    // (func chapter_early_weaponry)
    nx_tactics_books_combat.t_chapter_early_weaponry['vx_value'] = {
      name          : "chapter_early_weaponry",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_early_weaponry
    }

    // (func chapter_example_of_play)
    nx_tactics_books_combat.t_chapter_example_of_play['vx_value'] = {
      name          : "chapter_example_of_play",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_example_of_play
    }

    // (func chapter_modern_equipment)
    nx_tactics_books_combat.t_chapter_modern_equipment['vx_value'] = {
      name          : "chapter_modern_equipment",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_modern_equipment
    }

    // (func chapter_rules)
    nx_tactics_books_combat.t_chapter_rules['vx_value'] = {
      name          : "chapter_rules",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_rules
    }

    // (func chapter_skills)
    nx_tactics_books_combat.t_chapter_skills['vx_value'] = {
      name          : "chapter_skills",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_chapter_skills
    }

    // (func tacticsbook)
    nx_tactics_books_combat.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/combat",
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
      fn            : nx_tactics_books_combat.f_tacticsbook
    }

  }
}
