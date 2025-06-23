'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_combat {

  /**
   * @function chapter_advanced_weaponry
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_advanced_weaponry = {
    vx_type: vx_core.t_type
  }
  static e_chapter_advanced_weaponry = {
    vx_type: nx_tactics_books_combat.t_chapter_advanced_weaponry
  }

  // (func chapter_advanced_weaponry)
  static f_chapter_advanced_weaponry(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Advanced Weaponry",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Advanced Melee Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Advanced Melee Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Beam Saber",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Beam Saber", ":summary", "* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber. The light and color are caused by the air molecules ionizing in the lasers. Any contact with a solid object or another magnetic field creates a breach in the bubble which triggers a plasma burst in the hilt that instantly travels down the bubble and exits the breach with burning explosive effect."),
            "Lightning Saber",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lightning Saber", ":summary", "* Rotating ionizing lasers on the hilt create a hollow magnetic bubble in the form of a saber. The light and color are caused by the air molecules ionizing in the lasers. Any contact with a solid object or another magnetic field creates a breach in the bubble which triggers an electric pulse in the hilt that instantly travels down the bubble and exits the breach with shocking effect."),
            "Shock Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shock Lance")
          )
        ),
        "Futuristic Hand Guns",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Hand Guns",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "9mm Cone Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Cone Pistol", ":summary", "* The modern upgrade to the traditional firearm. Cone weapons fire rocket-propelled, recoilless rounds. These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for weightlessness. Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.", ":titles", "Gyrojet Pistol, Rocket Pistol"),
            "Liquid Sprayer Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Liquid Sprayer Pistol", ":titles", "Acid Pistol"),
            "100W Laser Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "100W Laser Pistol"),
            "Lightning Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lightning Pistol")
          )
        ),
        "Futuristic Rifles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Rifles",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "5.56mm Needle Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "5.56mm Needle Rifle"),
            "7.62mm Cone Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Cone Rifle", ":summary", "* The modern upgrade to the traditional firearm. Cone weapons fire rocket-propelled, recoilless rounds. These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for weightlessness. Cone weapons are cheap, reliable, and versitile.\n* Cone weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.", ":titles", "Gyrojet Rifle, Rocket Rifle"),
            "Gauss Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Gauss Rifle"),
            "Liquid Sprayer Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Liquid Sprayer Rifle", ":titles", "Acid Rifle"),
            "500W Laser Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "500W Laser Rifle"),
            "Microwave Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Microwave Rifle"),
            "Lightning Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lightning Rifle")
          )
        ),
        "Futuristic Vehicular Cannons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Vehicular Cannons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Energy Attenuating Aerosol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Energy Attenuating Aerosol", ":summary", "* A dense gas designed to absorb and refract energies that pass through it.  This obscures vision and greatly weakens lasers and other direct energy weapons that pass through it.", ":titles", "Anti-Laser Gas"),
            "20mm Light Gauss Cannon (LGC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Light Gauss Cannon (LGC)", ":titles", "Railgun"),
            "1.5kW Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "1.5kW Laser Cannon"),
            "15MW Light Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "15MW Light Laser Cannon"),
            "Light Particle Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Particle Cannon"),
            "Light Shock Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Shock Cannon"),
            "Light Sonic Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Sonic Cannon"),
            "30mm Medium Gauss Cannon (MGC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm Medium Gauss Cannon (MGC)", ":titles", "Railgun"),
            "40mm Heavy Gauss Cannon (HGC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm Heavy Gauss Cannon (HGC)"),
            "25MW Medium Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "25MW Medium Laser Cannon"),
            "Medium Gattling Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Medium Gattling Laser Cannon"),
            "Medium Sniper Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Medium Sniper Laser Cannon"),
            "35MW Heavy Laser Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "35MW Heavy Laser Cannon")
          )
        ),
        "Futuristic Missiles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Missiles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Swarmer Missiles",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Swarmer Missiles", ":image", "HighTech/SwarmerMissiles.png", ":summary", "* Swarmer Missiles are clusters of low yield homing missiles that seek to overwhelm targets with their numbers.\n* Like all missiles, the first turn they move they only move half their movement.\n* Only weapons with Auto or other Swarmer Missiles can functionally destroy these missiles.")
          )
        ),
        "Futuristic Vehicular Melee Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Vehicular Melee Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ".65MW Plasma Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".65MW Plasma Lance", ":classification", "Huge Melee", ":energy", "1.95MJ", ":modifiers", "Energy"),
            "Giant Armor Blades",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Armor Blades"),
            "Giant Armor Spikes",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Armor Spikes"),
            "Giant Chain Sword",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Chain Sword"),
            "Giant Explosive Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Explosive Lance"),
            "Giant Extending Arm",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Extending Arm"),
            "Giant Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Grenade"),
            "Giant Haywire Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Haywire Grenade"),
            "Giant Haywire Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Haywire Lance"),
            "Giant Haywire Whip",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Haywire Whip"),
            "Giant Heavy Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Heavy Grenade"),
            "Giant Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Lance"),
            "Giant Mace",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Mace"),
            "Giant Morning Star",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Morning Star"),
            "Giant Mauler",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Mauler", ":summary", "* Giant grinding melee weapon"),
            "Giant Net Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Net Gun"),
            "Giant Spike Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Spike Gun"),
            "Giant Vibroaxe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Vibroaxe"),
            "Giant Vibroblade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Vibroblade"),
            "Giant Vibroclaws",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Vibroclaws"),
            "Giant Vibrorapier",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Vibrorapier"),
            "Giant Vibrosword",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Vibrosword"),
            "Giant Whip",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Giant Whip")
          )
        ),
        "Futuristic Weapons of Mass Destruction",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Futuristic Weapons of Mass Destruction",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Spinal Nava Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spinal Nava Cannon"),
            "Spinal Rail Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spinal Rail Gun"),
            "Spinal Wave Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spinal Wave Cannon", ":summary", "* An enormously powerful energy cannon capable of enormous damage over a large area.", ":titles", "Death Star Cannon, Wave Motion Gun")
          ),
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Star Mine",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Star Mine", ":summary", "* Star Mines are basically Star Torpedoes that have been left floating in space near likely enemy traffic. The mines are smart and will only attack selected targets and can act as spy satellites by transmitting what their sensors are picking up. When given the order, the Star Mine rockets off toward its victim. Though inefficient in space because of the vast distances, they still can be effective by limiting an opponent's options or when used as traps at key locations.", ":titles", "Space Mine"),
            "Sentry Spy Satellite",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sentry Spy Satellite", ":summary", "* Sentry Spy Satellites are small disposable surveillence satellites that are hidden in asteroid or debris fields to monitor activity and transmit that information back home. They are sometimes armed with a Star Torpedo for a surprise attack."),
            "Star Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Star Torpedo", ":summary", "* Star Torpedoes carry Nuclear weapons (tactical or greater). In space, nuclear weapons produce no shockwave, just intense radiation. Even direct hits are not guaranteed to pierce the diamond hard ceramic armor of modern warships, so penetration is critical."),
            "Colony Drop",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Colony Drop", ":reference", "Mobile Suit Gundam"),
            "Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Planet Bomb", ":reference", "Star Blazers, Starship Troopers", ":summary", "* Asteroids or comets redirected to fall on a planet."),
            "Plague Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Plague Planet Bomb", ":summary", "* An enormous, genocidal planet bomb that releases a series of infectious diseases to infect a population. Victims do not immediately show signs of infection to maximize the contagion and paranoia."),
            "Rage Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rage Planet Bomb", ":summary", "* An enormous, genocidal planet bomb that releases a series of parasites that turns infected creatures into rabid killers who spread the infection."),
            "Famine Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Famine Planet Bomb", ":summary", "* An enormous, genocidal planet bomb that releases a series of diseases that attack the food harvest of a planet attempting to break the food chain and cause mass starvation or force compliance."),
            "Pestilence Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Pestilence Planet Bomb", ":summary", "* An enormous, genocidal planet bomb that releases a series of parasites that infect insects, birds, and vermin. These creatures gain accelerated reproduction and high aggression to attack food supplies and the general population."),
            "Terraforming Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Terraforming Planet Bomb", ":reference", "Genesis - Star Trek II"),
            "Hellbore Planet Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Hellbore Planet Bomb", ":summary", "* A missile that detonates a series of shaped nuclear blasts to tunnel into a geological fault or a volcano where it attempts to cause a massive natural disaster."),
            "Planet Buster",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Planet Buster", ":reference", "Anti-Matter Missile - Star Blazers", ":summary", "* A missile designed to be part of a massive bombardment to shatter a planet's crust and return it to a molten state. Already unstable planets may break up into rubble."),
            "Starkiller Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Starkiller Missile", ":reference", "Sunshine", ":summary", "* A missile designed to be part of a massive bombardment to disrupt the nuclear chain reaction in a star. This can result in massive solar flares, a cooling of the star, or cause the star to go nova depending on the age and size of the star.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_combat_overview
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_combat_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_combat_overview = {
    vx_type: nx_tactics_books_combat.t_chapter_combat_overview
  }

  // (func chapter_combat_overview)
  static f_chapter_combat_overview(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Combat Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics:Combat",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics:Combat", ":reference", "* Nothing is softer than water, yet water can defeat rock. It does not fight. It flows around the opponent... The true master lies within. Only you can free him. - Forbidden Kingdom"),
        "Rate of Fire",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Rate of Fire", ":summary", "* Fully-Automatic Weapons - These weapons fire continuously as long as the trigger is held down, or until they run out of ammunition, or until the barrel warps from the heat.\n* Burst Weapons - This is usually a setting on Fully-Automatic Weapons that fires a number of shots, roughly 3, each time the trigger is pulled. This is a compromise between Fully and Semi-Automatic Modes.\n* Semi-Automatic weapons - These weapons are generally capable of fully automatic fire, but are limited to fire a single shot each time the trigger is pulled. As such, they are limited to the shooter's ability to pull the trigger, generally once every second."),
        "Aiming and Range",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Aiming and Range", ":summary", "* It takes 3 seconds to aim a weapon at a target.\n* Range - Each 50m range takes an additional 1 second to aim. Pistols incur -1 Attack per 50m. Rifles incur -1 Attack per 100m.\n* Aiming with a Scope - Using a scope triples the aim time and the effective range.")
      )
    )
    return output
  }

  /**
   * @function chapter_early_weaponry
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_early_weaponry = {
    vx_type: vx_core.t_type
  }
  static e_chapter_early_weaponry = {
    vx_type: nx_tactics_books_combat.t_chapter_early_weaponry
  }

  // (func chapter_early_weaponry)
  static f_chapter_early_weaponry(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Early Weaponry",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Early Armor",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Early Armor",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Armor: Bezainted",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Bezainted"),
            "Armor: Breast Plate",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Breast Plate"),
            "Armor: Brigandine",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Brigandine"),
            "Armor: Bronze",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Bronze", ":summary", "* Bronze Cuirass, Helmet, Greaves", ":armor", "1mm"),
            "Armor: Chain Mail",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Chain Mail"),
            "Armor: Chain Shirt",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Chain Shirt"),
            "Armor: Cuirbouilli",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Cuirbouilli"),
            "Armor: Jazeraint",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Jazeraint"),
            "Armor: Laminated",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Laminated"),
            "Armor: Leather Cuirass",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Leather Cuirass"),
            "Armor: Leather Helmet",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Armor: Leather Helmet"),
            "Armor: Leather Pants",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Leather Pants", ":armor", "0mm"),
            "Armor: Leather Shirt",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Leather Shirt", ":armor", "0mm"),
            "Armor: Leather Vest",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Leather Vest", ":armor", "0mm"),
            "Armor: Padded",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Padded", ":armor", "0mm"),
            "Armor: Plate",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Plate", ":armor", "3mm"),
            "Armor: Platemail",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Platemail", ":armor", "2mm"),
            "Armor: Quilted",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Quilted", ":armor", "0mm"),
            "Armor: Ringmail",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Ringmail", ":armor", "1mm"),
            "Armor: Scalemail",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Scalemail", ":armor", "2mm"),
            "Armor: Scale Barding",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Scale Barding", ":armor", "2mm"),
            "Armor: Splint",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Splint", ":titles", "Lamellar", ":armor", "2mm"),
            "Armor: Studded Leather",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Studded Leather", ":armor", "0mm")
          )
        ),
        ":Shields",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Shields",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_tactics_keys(tactics, "Shield: Buckler", "Shield: Heater", "Shield: Kite", "Shield: Legionary", "Shield: Round", "Shield: Tower", "Shield: Wicker")
        ),
        ":Axes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Axes",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Battle Axe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Battle Axe", ":titles", "Fasces, Sagaris", ":energy", "100J"),
            "Double-Headed Axe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Double-Headed Axe", ":titles", "Labrys, Pelekus", ":energy", "200J"),
            "Hand Axe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Axe", ":titles", "Hachet", ":energy", "50J"),
            ":Pick",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Pick"),
            ":Scythe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Scythe"),
            ":Sickle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sickle", ":titles", "Kama"),
            "Throwing Axe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Throwing Axe", ":titles", "Francisca")
          )
        ),
        "Close Combat Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Close Combat Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Bagh Nakh",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bagh Nakh", ":titles", "Tiger Claw"),
            "Brass Knuckles",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Brass Knuckles"),
            ":Cestus",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cestus"),
            ":Garotte",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Garotte"),
            ":Gauntlet",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Gauntlet"),
            ":Nekode",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nekode", ":titles", "Claw"),
            ":Sap",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sap", ":titles", "Blackjack")
          )
        ),
        ":Clubs",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Clubs",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Baton",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Baton"),
            "Bo Stick",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bo Stick"),
            ":Club",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Club"),
            ":Cudgel",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cudgel"),
            ":Jitte",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Jitte"),
            "Jo Stick",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Jo Stick"),
            ":Nightstick",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nightstick"),
            ":Quarterstaff",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Quarterstaff", ":reference", "* Held at the bottom like a polearm. not in the middle. Holding in the middle was invented by the Boy Scouts in Victorian times for sport fighting."),
            ":Shillelagh",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shillelagh"),
            ":Tonfa",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tonfa"),
            ":Truncheon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Truncheon")
          )
        ),
        "Flexible Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Flexible Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Bola",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bola"),
            ":Bullwhip",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bullwhip"),
            ":Chain",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Chain"),
            "Chain Whip",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Chain Whip"),
            ":Flail",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flail"),
            ":Kusari",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Kusari"),
            ":Lasso",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lasso"),
            ":Manriki",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Manriki"),
            ":Net",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Net"),
            ":Noose",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Noose"),
            ":Nunchaku",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nunchaku", ":energy", "100J"),
            "Pole Lasso",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Pole Lasso"),
            "Rope and Rocks",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rope and Rocks", ":titles", "Surujin", ":energy", "100J"),
            "Rope Dart",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rope Dart", ":energy", "50J"),
            "Sickle and Chain",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sickle and Chain", ":titles", "Kusarigama", ":energy", "50J"),
            "Spike and Chain",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spike and Chain"),
            "Three Section Staff",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Three Section Staff", ":titles", "Sansetsukon", ":energy", "100J"),
            "Weighted Chain",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Weighted Chain", ":titles", "Meteor Hammer"),
            ":Whip",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Whip"),
            "Whip Sword",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Whip Sword", ":titles", "Urumi")
          )
        ),
        ":Hammers",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Hammers",
          ":reference",
          "Mjolnir - Thor's Hammer",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Bec de Corbin",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bec de Corbin"),
            ":Godendag",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Godendag"),
            "Holy Water Sprinkler",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Holy Water Sprinkler"),
            "Horseman's pick",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Horseman's pick"),
            "Lucerne Hammer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lucerne Hammer"),
            ":Mace",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mace", ":energy", "100J"),
            ":Mallet",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mallet"),
            ":Maul",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Maul"),
            ":Morningstar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Morningstar", ":energy", "100J"),
            ":Scepter",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Scepter", ":summary", "* +1 [Initimidation]"),
            "Star Mace",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Star Mace", ":energy", "100J"),
            "Throwing Hammer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Throwing Hammer", ":energy", "50J"),
            "War Hammer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "War Hammer", ":energy", "100J")
          )
        ),
        ":Knives",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Knives",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Bundi",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bundi", ":energy", "50J"),
            "Butterfly Knife",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Butterfly Knife", ":titles", "Balisong", ":energy", "50J"),
            ":Cinqueda",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cinqueda", ":energy", "50J"),
            "Knife: Dagger",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Knife: Dagger"),
            ":Dirk",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dirk", ":energy", "50J"),
            "Hunting Knife",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hunting Knife", ":energy", "50J"),
            ":Knife",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Knife", ":energy", "50J"),
            ":Kris",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Kris", ":energy", "50J"),
            "Main Gauche",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Main Gauche"),
            ":Sai",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sai", ":energy", "50J"),
            ":Stake",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Stake", ":energy", "50J"),
            ":Stiletto",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Stiletto", ":energy", "50J"),
            ":Switchblade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Switchblade", ":energy", "50J"),
            "Throwing Knife",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Throwing Knife", ":energy", "50J")
          )
        ),
        ":Polearms",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Polearms",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Bill-Guisarme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bill-Guisarme", ":energy", "200J"),
            ":Glaive",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Glaive", ":summary", "A glaive is a European polearm weapon, consisting of a single-edged blade on the end of a pole. It is similar to the Japanese naginata and the Chinese Guan Dao. Typically, the blade was around 45 cm (18 inches) long, on the end of a pole 2 m (6 or 7 feet) long, and the blade was affixed in a socket-shaft configuration similar to an axe head, rather than having a tang like a sword or naginata,", ":titles", "Guan Dao", ":energy", "200J"),
            ":Glaive-Guisarme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Glaive-Guisarme", ":energy", "200J"),
            ":Halberd",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Halberd", ":titles", "Halberdier", ":energy", "200J"),
            ":Naginata",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Naginata", ":energy", "200J"),
            "Pike",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Pike"),
            ":Poleaxe",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Poleaxe", ":energy", "200J"),
            ":Ranseur",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ranseur", ":energy", "200J"),
            ":Spetum",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spetum", ":energy", "200J"),
            ":Voulge-Guisarme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Voulge-Guisarme", ":energy", "200J")
          )
        ),
        ":Spears",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Spears",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Atlatl",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Atlatl", ":summary", "* Dart-thrower\n* An atlatl dart is capable of killing even the largest of animals at any distance that its thrower is capable of accurately reaching since more power is applied to longer shots than shorter shots.", ":range", "20m"),
            ":Bayonet",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bayonet", ":classification", "Spear", ":energy", "100J"),
            ":Javelin",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Javelin", ":classification", "Spear", ":energy", "198J", ":mass", "3kg", ":modifiers", "Indirect Fire, Piercing", ":range", "18m"),
            ":Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lance", ":titles", "Couched Lance", ":classification", "Spear", ":energy", "300J", ":length", "2.5m", ":modifiers", "Reach, Piercing"),
            ":Pilum",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Pilum", ":reference", "* When once fixed in the shield it was impossible to draw them out, and when thrown with force and skill, they penetrated the cuirass without difficulty. - Roman writer Vegtius", ":summary", "* The pilum was designed to be armour-piercing: the pyramidal head would punch a small hole through an enemy shield allowing the thin shank to pass through and penetrate a distance sufficient to hit the target. A pilum, having penetrated a shield through a small hole and its shank having bent would now be difficult to remove. It is likely that the shaft would hit the ground and thus stop the charging enemy in his tracks. An enemy, if not killed by the pilum, would have little time before closing with the legionaries and would have to discard his now-unwieldy shield before going into combat. Additionally, bent pila would be less suitable for reuse by a resourceful opponent.", ":classification", "Spear", ":energy", "100J", ":mass", "3kg", ":modifiers", "Indirect Fire, Piercing", ":range", "18m"),
            ":Spear",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear", ":classification", "Spear", ":energy", "100J", ":modifiers", "Reach, Piercing"),
            ":Trident",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Trident", ":classification", "Spear", ":energy", "100J", ":modifiers", "Reach, Piercing")
          )
        ),
        ":Swords",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Swords",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_tactics_keys(tactics, "Sword: Back", "Sword: Bastard", "Sword: Bokken", "Sword: Broad", "Sword: Butterfly", "Sword: Cavalry", "Sword: Cutlass", "Sword: Epee", "Sword: Falchion", "Sword: Foil", "Sword: Great", "Sword: Hook", "Sword: Katana", "Sword: Katar", "Sword: Long", "Sword: Ninjato", "Sword: No-Dachi", "Sword: Rapier", "Sword: Saber", "Sword: Scimitar", "Sword: Short", "Sword: Tanto", "Sword: Wakizashi")
        ),
        ":Archery",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Archery",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_tactics_keys(tactics, "Bow: Composite", "Bow: Compound", "Bow: Long", "Bow: Short")
        ),
        ":Crossbows",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Crossbows",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Hand Crossbow",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Crossbow"),
            "Heavy Crossbow",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Crossbow", ":energy", "147J", ":modifiers", "Piercing"),
            "Light Crossbow",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Crossbow", ":energy", "100J", ":modifiers", "Piercing"),
            "Repeating Crossbow",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Repeating Crossbow")
          )
        ),
        "Thrown Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Thrown Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Baseball",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Baseball", ":energy", "100J"),
            ":Blowgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Blowgun"),
            "Blown Needles",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Blown Needles", ":summary", "* Similar to a blowgun, these are tiny poison needles held in the mouth and blown at nearby opponents.", ":titles", "Fukimi-bari"),
            ":Boomerang",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Boomerang"),
            ":Caltrop",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Caltrop"),
            ":Chakram",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Chakram", ":summary", "* Sharp edged rings used extensively in ancient India. They are carried in large numbers and are thrown at short range from infantry, horses, or elephants."),
            ":Dart",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dart"),
            ":Football",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Football"),
            "Hunga Munga",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hunga Munga"),
            "Improvised Weapon",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Improvised Weapon"),
            ":Shuriken",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shuriken"),
            "Skipping Stone",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Skipping Stone"),
            ":Sling",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sling"),
            "Sling Staff",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sling Staff")
          )
        ),
        "Siege Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Siege Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ":Arbalest",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Arbalest"),
            ":Ballista",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ballista"),
            "Battering Ram",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Battering Ram"),
            "Boiling Oil",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Boiling Oil"),
            ":Catapult",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Catapult"),
            ":Escalade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Escalade", ":titles", "Siege Ladders"),
            "Greek Fire",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Greek Fire", ":titles", "Liquid Fire, Wildfire"),
            ":Mangonel",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mangonel"),
            ":Onager",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Onager"),
            "Siege Hook",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Siege Hook"),
            "Siege Tower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Siege Tower"),
            ":Springal",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Springal"),
            ":Trebuchet",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Trebuchet")
          )
        ),
        "Early Firearms",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Early Firearms",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Matchlock Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Matchlock Pistol", ":summary", "1400s"),
            "Matchlock Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Matchlock Rifle", ":summary", "1400s"),
            "Wheellock Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Wheellock Pistol", ":summary", "1500s"),
            "Wheellock Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Wheellock Rifle", ":summary", "1500s"),
            "Flintlock Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flintlock Pistol", ":summary", "1600s"),
            "Flintlock Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flintlock Rifle", ":summary", "1600s"),
            "Dueling Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dueling Pistol", ":summary", "1770"),
            "Brown Bees Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Brown Bees Rifle", ":summary", "1700s"),
            "Percussion Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Percussion Pistol", ":summary", "1800s"),
            "Percussion Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Percussion Rifle", ":summary", "1800s")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_example_of_play
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_example_of_play = {
    vx_type: vx_core.t_type
  }
  static e_chapter_example_of_play = {
    vx_type: nx_tactics_books_combat.t_chapter_example_of_play
  }

  // (func chapter_example_of_play)
  static f_chapter_example_of_play(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Example of Play",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Street Fight",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Street Fight")
      )
    )
    return output
  }

  /**
   * @function chapter_modern_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_modern_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_modern_equipment = {
    vx_type: nx_tactics_books_combat.t_chapter_modern_equipment
  }

  // (func chapter_modern_equipment)
  static f_chapter_modern_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Modern Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Modern Armor",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Armor",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Bulletproof Vest",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bulletproof Vest", ":titles", "Kevlar Vest"),
            "Bulletproof Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bulletproof Armor", ":titles", "Flak Jacket, Kevlar Armor"),
            "Doorgunner Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Doorgunner Armor"),
            "Model Y Bulletproof Vest",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Model Y Bulletproof Vest"),
            "Interceptor Body Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Interceptor Body Armor"),
            "Dragon Skin Armor",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dragon Skin Armor"),
            "SARCOS Exoskeleton",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "SARCOS Exoskeleton")
          )
        ),
        "Modern Explosives",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Explosives",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_tactics_keys(tactics, "Bomb: C4", "Bomb: IED", "Grenade: White Phosphorous")
        ),
        "Modern Pistols",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Pistols",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Air Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Air Pistol", ":summary", "* Can discharge Paintballs or small amounts of other chemicals."),
            ".22 Holdout Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".22 Holdout Pistol"),
            ".22 Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".22 Automatic Pistol", ":titles", "Ruger MkII"),
            "5mm Needler Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "5mm Needler Pistol"),
            ".38 Revolver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".38 Revolver", ":titles", ".38 Special, .38 Derringer, .38 Llama Comanche", ":classification", "Pistol", ":energy", "319J", ":muzzlevelocity", "300m/s"),
            ".38 Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".38 Automatic Pistol", ":titles", "Walther PPK-S", ":classification", "Pistol"),
            "9mm Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Automatic Pistol", ":titles", "Glock 17L, Browning 9mm, Baretta 92, Calico M-950, H&amp;K P9S, SIG/SAUER P226, S&amp;P ASP", ":classification", "Pistol", ":energy", "518J", ":muzzlevelocity", "360m/s", ":range", "50m"),
            "9mm Machine Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Machine Pistol", ":titles", "H&amp;K MP5K, Steyer TMP, Tactical Machine Pistol, Micro-Uzi", ":classification", "Pistol", ":muzzlevelocity", "380m/s", ":range", "100m", ":rof", "850/min"),
            ".357 Desert Eagle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".357 Desert Eagle"),
            ".357 Magnum Revolver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".357 Magnum Revolver", ":reference", "* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds.", ":titles", "Colt Python", ":classification", "Pistol", ":energy", "778J", ":muzzlevelocity", "430m/s"),
            "10mm Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "10mm Automatic Pistol", ":titles", "Glock 20, S&amp;W 1006", ":classification", "Pistol"),
            ".40 Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".40 Automatic Pistol", ":titles", "SIG/SAUER P229", ":classification", "Pistol"),
            ".41 Magnum Revolver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".41 Magnum Revolver", ":titles", "S &amp;W Model 57", ":classification", "Pistol"),
            ".45 Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 Automatic Pistol", ":titles", "AMT Automag, Colt M1911A, LAR Grizzly", ":classification", "Pistol", ":energy", "410J"),
            ".44 Magnum Revolver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".44 Magnum Revolver", ":titles", "Colt Anaconda, Ruger Super Redhawk", ":classification", "Pistol", ":energy", "1524J", ":muzzlevelocity", "460m/s"),
            ".50 Automatic Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".50 Automatic Pistol", ":titles", "MRI Desert Eagle", ":classification", "Pistol", ":energy", "2000J", ":muzzlevelocity", "460m/s"),
            ":Taser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Taser", ":energy", ".3J")
          )
        ),
        "Modern Rifles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Rifles",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "12-gauge Double Barrelled Shotgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12-gauge Double Barrelled Shotgun", ":reference", "* Alright you primitive screwheads. Listen up. See this. This is my... BOOMSTICK! Its a 12-guage Double Barrelled Remington. S-Mart's top of the line. You can find it in the sporting goods department. That's right, this sweet baby was made in Grand Rapids, Michigan. Retails for about $109.95. It's got a walnut stock, cobalt blue steel, and a hair trigger. That's right. Shop smart. Shop S-Mart. YOU GOT THAT?! - Ash, Army of Darkness", ":energy", "3724J", ":muzzlevelocity", "1680m/s"),
            "12-gauge Sawed Off Shotgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12-gauge Sawed Off Shotgun", ":energy", "3724J", ":muzzlevelocity", "1680m/s"),
            "12-gauge Pump Shotgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12-gauge Pump Shotgun", ":titles", "Entry Team Striker, Franchi SPAS-12, Jackhammer Mk 3A-2, Mossberg M500, Remington 870P, Street Sweeper 870P, USAS-12", ":energy", "3724J", ":muzzlevelocity", "1680m/s"),
            "12-gauge Tactical Shotgun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12-gauge Tactical Shotgun"),
            ".22 Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".22 Rifle", ":titles", "Calico M-105"),
            "5.56mm Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "5.56mm Rifle", ":titles", "Colt Sporter Delta"),
            "5.56mm Assault Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "5.56mm Assault Rifle", ":titles", "Colt M-16A1, L85A1, Steyr AUG", ":energy", "1767J", ":muzzlevelocity", "940m/s"),
            ".30-06 Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 Rifle"),
            ".30-06 Semi-Automatic Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 Semi-Automatic Rifle"),
            "7.62mm Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Rifle", ":titles", "Galil Sniper Rifle, Steyr SSG-69, SVD Dragunov, Walther WA-2000 Sniper"),
            "7.62mm Assault Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Assault Rifle", ":titles", "AR-15, M-16, AK-47, FN-FAL", ":energy", "3504J", ":muzzlevelocity", "850m/s"),
            "7.62mm M24 Sniper Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm M24 Sniper Rifle"),
            ".45 Elephant Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 Elephant Gun", ":titles", "H&amp;H African, Nitro Express", ":energy", "6470J", ":muzzlevelocity", "660m/s"),
            ".50 Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".50 Rifle", ":titles", "McMillan M-87"),
            "Combat Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Combat Flamethrower")
          )
        ),
        "Modern Machine Guns",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Machine Guns",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "30mm GAU-8 Avenger",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm GAU-8 Avenger", ":length", "5m", ":mass", "281kg", ":muzzlevelocity", "1000m/s", ":range", "1500m", ":rof", "4200/min", ":rounds", "1174"),
            ".32 Submachine Gun (SMG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".32 Submachine Gun (SMG)", ":titles", "Skorpion M-61"),
            "9mm Submachine Gun (SMG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Submachine Gun (SMG)", ":titles", "Uzi, H&amp;K MP5, Intratec TEC-9, Spectre M-4", ":muzzlevelocity", "400m/s", ":range", "200m", ":rof", "600/min"),
            ".45 Submachine Gun (SMG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 Submachine Gun (SMG)", ":titles", "Ingram MAC-10"),
            ".45 Machine Gun (MG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 Machine Gun (MG)", ":titles", "Thomson Machine Gun, Tommy Gun", ":muzzlevelocity", "280m/s", ":range", "50m", ":rof", "800/min"),
            "7.62mm Machine Gun (MG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Machine Gun (MG)", ":titles", "M-60"),
            ".30-06 Machine Gun (MG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 Machine Gun (MG)"),
            "7.62mm Minigun (MG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Minigun (MG)", ":summary", "* An infantry support weapon that can be adapted for vehicular use on a pintle mount. While it is useful against infantrymen, it is nearly worthless against vehicles, even unarmored ones.", ":titles", "M134", ":energy", "3504J", ":muzzlevelocity", "850m/s", ":rof", "4000/min"),
            ".50 Heavy Machine Gun (HMG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".50 Heavy Machine Gun (HMG)", ":summary", "* The heaviest of infantry weapons, the heavy machine gun must be mounted on a bipod, tripod, or pintle.  The HMG is effective only against infantry and light armored vehicles.")
          )
        ),
        "Modern Cannons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Cannons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Liquid Sprayer Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Liquid Sprayer Cannon", ":summary", "* Can dispense Water, Fire Retardant Foam, Cleaning Solvent or other more frightening solutions."),
            "15mm Very Light Cannon (VLC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "15mm Very Light Cannon (VLC)", ":summary", "* The VLC is designed as a backup weapon for light scouting vehicles. Its shell can pierce the armor of other light vehicles but not much else. Its simple design makes it light, affordable, and easy to maintain."),
            "15mm Very Light Recoilless Cannon (VLC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "15mm Very Light Recoilless Cannon (VLC)"),
            "15mm Very Light Autocannon (VLAC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "15mm Very Light Autocannon (VLAC)", ":summary", "* The VLAC lies somewhere between a heavy infantry machinegun and a vehicle mounted autocannon. Though its armor piercing shells are not particularly good against infantry, it is a perfect backup anti-armor weapon for a light vehicle."),
            "20mm Light Cannon (LC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Light Cannon (LC)", ":summary", "* The Light Cannon is a simpler version of the Light Autocannon. It lacks automatic fire, but it more affordable, more accurate, and has a longer range."),
            "20mm Light Recoilless Cannon (LRC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Light Recoilless Cannon (LRC)"),
            "20mm Light Autocannon (LAC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Light Autocannon (LAC)", ":summary", "* Light Autocannons are popular weapons combining a high rate of fire with significant penetration."),
            "Light Flame Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Flame Cannon", ":summary", "* Flame Cannons are vehicular flamethrowers that spray burning liquid in a wide arc. They are most effective against soft targets, but the heat generated from sustained fire can damage even heavily armored targets. It is also capable of indirect fire."),
            "30mm Medium Cannon (MC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm Medium Cannon (MC)", ":summary", "* The Medium Cannon is a simpler version of the Medium Autocannon. It lacks automatic fire, but it is more affordable, more accurate, and has a longer range."),
            "30mm Medium Recoilless Cannon (MRC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm Medium Recoilless Cannon (MRC)", ":titles", "Bazooka Cannon"),
            "30mm Medium Autocannon (MAC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm Medium Autocannon (MAC)", ":reference", "* The A-10 Thunderbolt's main weapon.", ":summary", "* Medium Autocannons are nearly as popular as Light Autocannons.  They sacrifice some fire rate for higher damage and range."),
            "Medium Flame Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Medium Flame Cannon"),
            "40mm Heavy Cannon (HC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm Heavy Cannon (HC)", ":summary", "* The Heavy Cannon can penetrate light tank armor and the 40mm shells can carry a variety of specialized ammunition."),
            "40mm Heavy Recoilless Cannon (HRC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm Heavy Recoilless Cannon (HRC)"),
            "40mm Heavy Autocannon (HAC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm Heavy Autocannon (HAC)", ":summary", "* The Heavy Autocannon is often the main armament of light tanks. Its high rate of fire tends to preclude the use of most exotic ammunition."),
            "Heavy Flame Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Flame Cannon"),
            "50mm Very Heavy Cannon (VHC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm Very Heavy Cannon (VHC)", ":summary", "* The Heavy Autocannon is often the main armament of light tanks. Its high rate of fire tends to preclude the use of most exotic ammunition."),
            "50mm Very Heavy Recoilless Cannon (VHRC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm Very Heavy Recoilless Cannon (VHRC)"),
            "50mm Very Heavy Autocannon (VHAC)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm Very Heavy Autocannon (VHAC)", ":summary", "* The 50mm Autocannon is an electically-driven, multi-tube gattling cannon capable of delivering an awesome amount of ammunition in a very short amount of time. This is typically the largest cannon produced with autofire because of the large amount of space that ammunition takes up."),
            "75mm Very Light Field Gun (VLFG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm Very Light Field Gun (VLFG)", ":summary", "* The Very Light Field Gun is the smallest of the single-shot, specialized anti-armor, guns. VLFG's are often mounted on gun carriages or defensive bunkers. The VLFG is effective against most medium tanks except against front armor."),
            "90mm Light Field Mortar (LFM)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "90mm Light Field Mortar (LFM)", ":summary", "* The Mortar Cannon fires low velocity, large caliber High Explosive shells. Their shells have poor penetration but are well suited for indirect fire, suppressive fire, and mass destruction of soft targets."),
            "90mm Light Field Gun (LFG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "90mm Light Field Gun (LFG)", ":summary", "* The Light Field Gun is a popular main weapon on light and medium tanks. The LFG is effective against most medium tanks."),
            "120mm Smoothbore Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "120mm Smoothbore Cannon", ":summary", "Fire Armor Piercing Fin Stabalized, Depleted Uranium rounds", ":energy", "11MJ"),
            "120mm Medium Field Gun (MFG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "120mm Medium Field Gun (MFG)", ":summary", "* The Medium Field Gun is a popular main weapon on heavy tanks.  The LFG is effective against most heavy tanks."),
            "120mm Medium Field Mortar (MFM)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "120mm Medium Field Mortar (MFM)"),
            "140mm Heavy Field Gun (HFG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "140mm Heavy Field Gun (HFG)", ":summary", "* The Heavy Field Gun is a used on heavy tank destroyers and main battle tanks. The HFG is effective against most main battle tanks."),
            "140mm Heavy Field Mortar (HFM)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "140mm Heavy Field Mortar (HFM)"),
            "200mm Very Heavy Field Gun (VHFG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "200mm Very Heavy Field Gun (VHFG)", ":summary", "* The Very Heavy Field Gun is used in heavy artillery pieces and fixed installations. The VHFG is effective against almost any target.", ":titles", "Naval Gun")
          ),
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":AP",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "AP"),
            ":APFSDS",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "APFSDS"),
            ":HE",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "HE"),
            ":HEAT",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "HEAT"),
            ":HESH",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "HESH")
          )
        ),
        "Modern Portable Explosives",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Portable Explosives",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Hand Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hand Grenade", ":image", "WWIIAmerican/Grenade_MK2.jpg", ":reference", "* It had a fatality radius of 5m, a blast radius of 13.7m, and fragments can disperse to 213m.\n* At least 5 people have thrown themselves on hand grenades and lived.", ":explosive", ".057kg", ":mass", ".6kg", ":modifiers", "Anti-Personnel, Area", ":range", "30m"),
            "20mm Light Grenade Launcher",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Light Grenade Launcher"),
            "50mm Mortar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm Mortar"),
            "66mm Light Anti-Armor Weapon (LAW)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "66mm Light Anti-Armor Weapon (LAW)", ":reference", "* M72 LAW", ":summary", "* One shot anti-tank weapon that can penetrate 250mm.", ":length", "1m", ":mass", "2.3kg", ":modifiers", "HEAT", ":range", "200m"),
            "84mm Recoilless Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "84mm Recoilless Rifle", ":reference", "* AT4", ":summary", "* One shot anti-tank weapon that can penetrate 400mm with HEAT or carry 440g of HE.", ":explosive", ".440kg", ":mass", "6.7kg", ":modifiers", "HEAT", ":muzzlevelocity", "284m", ":range", "300m"),
            "Rifle Propelled Grenade (RPG)",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle Propelled Grenade (RPG)"),
            "Plastic Explosive",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Plastic Explosive"),
            "Land Mine",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Land Mine"),
            "Smoke Dispenser",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Smoke Dispenser")
          )
        ),
        "Modern Missiles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Modern Missiles",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "50mm Medium Grenade Launcher",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm Medium Grenade Launcher", ":rounds", "20"),
            "70mm Heavy Grenade Launcher",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "70mm Heavy Grenade Launcher", ":rounds", "12"),
            "Light Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "52mm Light Rocket Pod",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "52mm Light Rocket Pod", ":modifiers", "HE, INC", ":rounds", "8"),
            "Medium Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Medium Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "71mm Medium Rocket Pod",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "71mm Medium Rocket Pod", ":modifiers", "HE, INC", ":rounds", "8"),
            "Heavy Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "Fuel Air Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fuel Air Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "Cluster Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cluster Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "82mm Heavy Rocket Pod",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "82mm Heavy Rocket Pod", ":modifiers", "HE, INC", ":rounds", "8"),
            "Very Heavy Bomb Rack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Very Heavy Bomb Rack", ":modifiers", "HE, INC", ":rounds", "8"),
            "Missile Pod",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Missile Pod"),
            "Heavy RPG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy RPG", ":summary", "* Disposable short-range, rocket with shaped charge for armor penetration.", ":rounds", "1"),
            "Very Heavy RPG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Very Heavy RPG", ":summary", "* Disposable short-range, rocket with shaped charge for armor penetration.", ":rounds", "1"),
            "Light Bombardment Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Light Bombardment Rocket", ":modifiers", "HE", ":rounds", "16"),
            "Medium Bombardment Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Medium Bombardment Rocket", ":modifiers", "HE", ":rounds", "16"),
            "Heavy Bombardment Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Heavy Bombardment Rocket", ":modifiers", "HE", ":rounds", "16"),
            "Anti-Aircraft Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Anti-Aircraft Missile"),
            ":RPG-7",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "RPG-7"),
            ":RPG-29",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "RPG-29", ":reference", "Iraq 2007, an RPG-29 round penetrated the frontal ERA and hull of a Challenger 2 tank", ":summary", "Tandem charged HEAT round"),
            "Cruise Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cruise Missile"),
            "SAM Surface To Air Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "SAM Surface To Air Missile", ":image", "Modern/Missile.png")
          )
        ),
        "Weapons of Mass Destruction",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Weapons of Mass Destruction",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Agent Orange",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Agent Orange"),
            ":Napalm",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Napalm"),
            "Cluster Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cluster Bomb"),
            "Smart Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Smart Bomb"),
            "Block Buster",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Block Buster"),
            "Bunker Buster",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bunker Buster"),
            "Fuel Air Explosive",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fuel Air Explosive"),
            "Naval Mine",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Naval Mine"),
            "Nuclear Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nuclear Bomb"),
            "Fusion Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Fusion Bomb"),
            "Dirty Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Dirty Bomb"),
            "Nerve Gas Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nerve Gas Bomb"),
            ":MIRV",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "MIRV"),
            "Neutron Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Neutron Bomb"),
            "Plague Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Plague Bomb"),
            "Tactical Nuclear Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tactical Nuclear Bomb"),
            "Tactical Nuclear Cruise Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tactical Nuclear Cruise Missile"),
            "Strategic Nuclear Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Strategic Nuclear Bomb"),
            "Nuclear Cruise Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nuclear Cruise Missile"),
            "Nuclear Ballistic Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Nuclear Ballistic Missile")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_rules
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_rules = {
    vx_type: vx_core.t_type
  }
  static e_chapter_rules = {
    vx_type: nx_tactics_books_combat.t_chapter_rules
  }

  // (func chapter_rules)
  static f_chapter_rules(tactics) {
    let output = nx_tactics_base.e_chapter
    vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Rules",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Levels",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Levels", ":reference", "* The resistance to penetration of armor is related to the thickness of the steel - 2mm armor required about 3 times as much energy to defeat as 1mm armor.\n* By its apex, hardened steel plate was almost impregnable on the battlefield. Knights were instead increasingly felled by polearms such as the halberd and blunt weapons such as maces or war hammers that could send concussive force through the plate armor resulting in injuries such as broken bones, organ hemorrhage and/or head trauma. Another tactic was to attempt to strike through the gaps between the armor pieces, using daggers, spears and spear points to attack the man-at-arms' eyes or joints.\n* Weight - A full suit of medieval plate is thought to have weighed little more than 60 lb (27 kg) on average, considerably lighter than the equipment often carried by the elite of today's armies. If during the 14-15th centuries armour seldom weighed more than 15kgs, than by the late 16th century it weighed 25kg. The increasing weight and thickness of late 16th century armor therefore gave substantial resistance.\n* Proof - In the early years of pistol and arquebuses, firearms were relatively low in velocity. The full suits of armour, or breast plates actually stopped bullets fired from a modest distance. The front breast plates were, in fact, commonly shot as a test. The impact point would often be encircled with engraving to point it out. This was called the 'proof'. Rather than making plate armour obsolete, the use of firearms stimulated the development of plate armour into its later stages.\n* At the end of the 1800's silk body armor was worn by those who could afford it. The assassination of Arch-Duke Ferdinand that precipitated WWI was wearing silk body armor but was shot in the neck over the armor. A similar vest worn by Alfonso XIII of Spain saved his life in 1901.\n* Criminal gangs in late 1920's to early 1930's began wearing thick cotton and cloth suits that could absorb .22, .25, .32 Long, .32, .380 ACP, and .45 ACP rounds. To overcome this, law enforcement began using .357 Magnum rounds.\n* Club, Axe or Greek sword : 1kg ; used single handed ; 65 joules(48 ft lbs)\n* Club, Axe or Greek sword : 2kg ; used two-handed ; 130 joules(96 foot lbs)\n* Javelin :0.8 kg ; thrown, with run-up; 198 joules(146 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace only; 111 joules(83 ft lbs)\n* Javelin :0.8 kg ; thrown standing; 60 joules(49 ft lbs)\n* Javelin :0.8 kg ; thrown, one pace with loop ; 160 joules(118 ft lbs)\n* Light spear or small sword/dagger :0.8 kg ; close combat ; 30 joules(24 ft lbs)\n* Sarissa :8(?)kg ; two-hand thrust,pace fwd ; 160 joules(118 ft lbs)\n* Spear-butt : various ; thrust down, coup-de-grace; 50 joules (40 ft lbs)\n* Energies of the order of 30-60 joules (24-49 ft lbs) could be given generally to typical Greek Hand weapons, and armour would need to resist this type of thrust, as well as slashing blows up to 60 joules(49 ft lbs)\n* Sling bullet :24g swung one handed ; 30-36 joules(22-27 ft lbs)\n* Light bow 20J at 50m, 15J at 100m, 9J at 200m (sufficient to penetrate flesh)\n* Heavy bow 30J at 50 metres, 26J at 100 metres, 20J at 200 metres\n* Ballistic Armor Level I protects against .22 cal Long Rifle and .38\n* Ballistic Armor Level IIA protects against 9mm Low Velocity and .40 cal\n* Ballistic Armor Level II protects against 9mm and .357 Magnum\n* Ballistic Armor Level IIIA protects against High Velocity 9mm and .44 Magnum\n* Ballistic Armor Level III protects against 7.62 Rifle\n* Ballistic Armor Level IV protects against .30 cal Armor Piercing Rifle\n* All heavy armor penetration values are in mm of steel or equivalent at 30 degrees.\n* The 5.56 AP round penetrates 12mm at 100m.\n* The 7.92 MG round penetrates 13mm at 100m.\n* The 7.62 AP round penetrates 15mm at 300m.\n* .50 cal penetrates 20mm Armor\n* 20mm penetrates 30mm Armor.  It took an average of twenty 20mm hits to shoot down a WWII bomber.\n* 30mm A-10 penetrates 69mm at 500m and 38mm at 1000m.  A 30mm Autocannon could bring down a WWII bomber in 1-3 hits.\n* 40mm Bofors penetrates: 0 yards-2.7in (68mm), 2,000 yards-1.2in (30mm), 4,000 yards-0.60in, 6000 yards-0.45in.\n* 50mm PaK 38 was one of the few early guns capable of effectively penetrating the 45 mm armor of the formidable T-34\n* The PaK 40 penetrates 100mm Armor and was effective against almost every Allied tank until the end of the war.\n* The Panther's 75 mm KwK 42 L/70 penetrates 120mm at 1000m\n* Very few Allied or Soviet weapons could penetrate the Panther's front armor.\n* Pershing's 90mm penetrates 110mm at 1000m\n* The Tiger's 8.8 cm KwK 36 L/56 penetrates 135mm at 1000m.\n* Whereas Panthers were the more serious threat to Allied tanks, Tigers had a bigger psychological effect on  opposing crews, causing a 'Tiger phobia'. Allied tankers would sometimes evade rather than confront a Tiger, even a tank that only looked like one, such as the Panzer IV with turret skirts applied. In the Normandy campaign, it could take four to five Shermans to knock out a single Tiger tank by maneuvering to its weaker flank or rear armor; the Soviet T-34s fared similarly against the German tanks, as had the German PzIII earlier against the Soviet heavy tanks. An accepted Allied tactic was to engage the Tiger as a group, one attracting the attention of the Tiger crew while the others attacked the sides or rear of the vehicle. Since the ammunition and fuel were stored in the sides, a side penetration often resulted in a kill. This was, however, a risky tactic, and often resulted in the loss of several Allied vehicles. It took a great deal of tactical skill to eliminate a Tiger.\n* IS-2's A-19 122mm penetrates 150mm at 1000m and can go through the front and rear armor and the engine block of the German Panther tank.\n* The 17 pounder mounted on the Sherman Firefly was able to penetrate 131mm at 1000 meters, more than sufficient to defeat the German Tiger I and Panther tank at standard combat ranges.\n* Pershing 90mm APCR penetrates 192mm at 1000m\n* The Tiger II/Elefant/PaK43's 8.8 cm KwK 43 penetrates 165mm at 1000m\n* The M4 Sherman was unable to penetrate the front of a Tiger II even at point blank and the M26 Pershing and IS-2 had to come within 1300 m and 200 m respectively.\n* The Tiger II's 88 mm armament could penetrate 165mm at 1000m and destroy all Allied armor at a range far outside the effective range of the enemy's armament. Also, notwithstanding its reliability problems, the Tiger II was remarkably agile for such a heavy vehicle. Contemporary German records indicate that it had a lower ground pressure and was as maneuverable as the much lighter Panzer IV.\n* A typical modern lined shaped charge can penetrate armor steel to a depth of 7 or more times the diameter of the charge's cone (cone diameters, CD), though greater depths of 10 CD and above are now feasible.\n* The shaped charge of the PanzerFaust could penetrate up to 200 mm of steel, enough to defeat any armoured fighting vehicle of the period including T-34's and IS-2.\n* RPG-16 and M72 LAW can penetrate 300mm\n* RPG-22 can penetrate 400mm\n* RPG-7 can penetrate 500mm\n* M1 Abrams cannot penetrate its own 610mm Sloped Armor\n* RPG-29 can penetrate 750mm and has penetrated the front armor of a Challenger 2.\n* BLU-109 Penetrator - Penetration of reinforced concrete: 1.8 m (6 ft)\n* BLU-116 Advanced Unitary Penetrator (AUP), BLU-118/B Thermobaric Warhead - Penetration of reinforced concrete: 3.4m (11 ft)\n* BLU-113 Super Penetrator - Penetration of reinforced concrete: more than 6m (20 ft)\n* The crippled Bismark endured 5 torpedoes and a relentless attack by the 14 inch guns of 2 Battleships and the 8 inch guns of 2 Heavy Cruisers even at point blank range for over half an hour. The upper decks were destroyed, but the ship was still under power and the hull was relatively sound. It was finally scuttled by the crew.\n\n* Penetration of materials vs 5.56mm: http://www.inetres.com/gp/military/infantry/rifle/556mm_ammo.html\n** The following stop a 5.56mm round fired at less than 50 meters:\n*** One thickness of well-packed sandbags.\n*** A 2 inch (51 mm) non-reinforced concrete wall.\n*** A 55 gallon drum filled with water or sand.\n*** A small ammunition can filled with sand.\n*** A cinder block filled with sand (block will probably shatter).\n*** A plate glass windowpane at a 45 degree angle (glass fragments may be thrown behind the glass).\n*** A brick veneer.\n*** A layer of books 18 to 24 inches (457 to 610 mm) thick.\n** The following do not stop a 5.56mm round fired at less than 50 meters:\n*** Interior walls made of thin wood paneling, sheetrock, or plaster\n*** Common office furniture, such as desks and chairs\n*** Wooden frame buildings and single cinder block walls offer little protection from 5.56mm rounds.\n*** A car body (round will penetrate but normally not exit).\n\n* 40mm High Explosive dual purpse round\n** Penetrate 2 inches (50 mm) of armorplate, 12 inches (300 mm) of pine logs, 16 inches (400 mm) of concrete blocks,\nor 20 inches (500 mm) of sandbags at ranges up to 1,312 feet (400 m).\n\n* Sandbags = 1/10th Steel\n* Concrete = 1/8th Steel\n* Pine Logs = 1/6th Steel\n\nhttp://www.panzerworld.net/armourpenetration", ":summary", "* Level\n* Damage\n* Armor (mm)\n* Energy (J)\n* Explosive Force (psi)\n* Mass (kg)\n\nThe following table is an attempt to unify Damage, Armor, Energy, Explosive Force, Strength, and Mass together. This is done with the following premises:\n1. Where possible use factual comparisons between Weapons and Armor that defeated those weapons.\n2. Once damage and armor are mapped, the energy created from each firearm can be derived by muzzle velocity and weapon calibre.\n3. Energy in Joules (J) is easily converted into explosive force measured in PSI\n4. Energy may also easily be converted into a strength rating by determining how much mass that energy would lift over a person's head (3m) in 1 second.\n5. Finally the mass rating from strength can be used as a general chart for mass (and by correlation Body).\n\nThe formula is Energy = Mass (kg) * ((3m ^ 2) / 1s * 10m / 1s / 1s.\nSimplified the formula is Energy = Mass (kg) * 100."),
        "Combatant Types",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Combatant Types",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Elite",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Elite", ":summary", "* Elite units gain +2 to all combat, morale, or military rolls."),
            ":Mob",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mob", ":summary", "* Mob units take -1 to all combat, morale, or military rolls.\n* When a Mob unit takes its action, other Mob units within 2 spaces must roll Will. If they fail, they immediately activate and attempt to move adjacent to the original Mob and perform the same action."),
            ":Veteran",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Veteran", ":summary", "* Veteran units gain +1 to all combat, morale, or military rolls.")
          )
        ),
        "Melee and Close Combat",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Melee and Close Combat",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Aerial",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Aerial"),
            ":Crouching",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crouching"),
            ":Duel",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Duel", ":summary", "* Choose an Ability - Each player secretly choose an [Ability] for this turn.\n* Determine Initiative - Each player begins bidding a [Speed] he/she will use before the [Ability].\n* Take Turns - Each player takes their turn in the order of the final bidding.\n** Move - The unit must use or discard at least the bid amount of [Speed] before it can take an [Action]\n** Action - Reveal the chosen [Ability].  If the unit is in range of a target and has not used too much [Speed] to use the chosen [Ability], then it may use the ability now.\n** Move - The unit may use any remaining [Speed]."),
            "Finishing Move",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Finishing Move", ":summary", "* Finishing Moves are powerful attacks that are usually only done when the opponent cannot defend.\n* [Move]: No movement this turn."),
            "Armor Facing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Armor Facing", ":summary", "* Armor is rarely uniform around a unit.\n* Determine the armor side you are targetting (i.e. Front, Rear, Side, Top, Under) by determining which of your opponents [Firing Arc]s your weapon lies in.\n* If facing still cannot be determined, then it is the defender's choice.\n* Infantry units may attack top or under armor if they are within 1 space of the target (assume grenades or other improvised weapons)."),
            ":Explosive",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Explosive", ":summary", "* 1 gram of TNT releases 1000 calories upon explosion or 4184J.  1 gram of sugar has abour 4x the energy.\n            * 1g=4.184x10^3J, 1kg=4.184x10^6J, 1ton=4.184x10^9J, 1kt=4.184x10^12J, 1Mt=4.184x10^15J\n            * Explosions Damage falls off by half (-1 Damage) for every 2m from the center.\n            * Following a blast wave is a negative blast of 1/3 strength\n            * Blasts are reflected and amplified by solid surfaces. A person between a blast and a building will suffer 2-3x the injury as those in open spaces.\n\n            Blast Damage in Overpressure\n            Po=0.34E/R^3\n            where\n            Po= overpressure in pascals (about 6895 Pascals per psi.)\n            E=energy, in joules (0.1 Kg TNT = 461,200 joules)\n            R^3= the cube of distance, in meters\n            And, IIRC\n            5 psi(35 Kpa): windows shattered, startled/stunned\n            20 psi: (140 kPa)lung damage, eardrums likely popped\n            35 psi (250 kPa): serious injury probable, death rare\n            200 psi (1400 kPa): mutilation\n\n            .15 psi: Glass breaks\n            .25 psi: Hurricane winds, injuries from flying glass\n            .4 psi: Limited minor structural damage (windows broken, cracks in plaster, broken roof tiles)\n            .7 psi: Minor damage to house\n            1 psi: Partial demolition of houses made uninhabitable\n            2 psi: Partial collapse of walls and roofs of houses, Residential structures collapse, injuries common\n            3 psi: Non-reinforced concrete or cinder wall shattered, steel frame buildings distored, 3000lb machinery unaffected, 10% eardrum damage\n            4 psi: Most buildings collapse except concrete, fatalities occur\n            5 psi: Wooden utility poles snap, 50% eardrum damage\n            6.3 psi: Lung haemorrhage damage\n            7 psi: Houses completely destroyed, loaded trains overturned\n            8 psi: Non-reinforced brick walls fail by shearing or flexure\n            9 psi: Loaded train boxcars demolished\n            10 psi: Buildings totally destroyed, 7000lb machines moved and badly damaged, 12000lb machines survive, Reinforced concrete buildings severly damaged, fatal injuries common\n            14.5 psi: 1% fatalities\n            17.5 psi: 10% fatalities\n            20.5 psi: 50% fatalities\n            25.5 psi: 90% fatalities\n            29.0 psi: 99% fatalities\n\n            500lb Bomb\n            1000lb Bomb\n            4000lb (2t) Blockbuster Bomb 'Cookie' 3/4 weight is explosive\n            8000lb (4t) Bomb\n            12000lb (6t) Tallboy\n            22000lb (11t) Grand Slam Earthquake Bomb\n            1kt Fission Bomb\n            10kt Fission Bomb\n            1Mt Fusion Bomb\n            10Mt Fusion Bomb\n\n            Blast Radius:\n            ~50mm 2m\n            ~60mm 5m\n            ~70mm 10m\n            ~80mm 15m\n            ~90mm 20m\n            105mm 25m\n            155mm 50m\n            203mm 80m\n\n            ECR The effective casualty radius is defined as the radius of a circle about the point of detonation in which it may be expected\n            that 50 percent of exposed troops will become casualties.\n\n            The 40mm grenade has an effective casualty radius of 5 meters.\n            155mm (M107) 50m ECR\n            5\"x54 (Mk64) 45m ECR\n            120mm (M934) 60m ECR\n            107mm (M329A2) 40m ECR\n            105mm (M1) 35m ECR\n            81mm (M935/M734) 40m ECR F/M252\n            81mm (M374A3) 34m ECR F/M29\n            60mm (M720/M888 ) 27.5 ECR"),
            "Anti-Missile Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Anti-Missile Missile", ":summary", "* Anti-Missiles are designed to intercept other missiles and explode in front of the incoming missile thereby destroying them. They can be used for other purposes, but their relatively large area and low payload limits their use to soft targets. Anti-Missiles can be used to intercept any missiles including those pursuing other targets and other Anti-Missiles.\n* [Reaction]: Attack other Missile"),
            "Ballistic Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Ballistic Missile"),
            "Cluster Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cluster Missile", ":summary", "* Missile mounted with a cluster bomb warhead.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move taking at most 1 turn each move. The missile has [Action]: Make an attack against the 3 adjacent spaces toward the front of the missile, then remove the missile."),
            "Cruise Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cruise Missile"),
            "Guided Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Guided Missile"),
            ":Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rocket", ":summary", "* Rockets are a form of missile that is designed to carry the maximum payload. They are, therefore, relatively large and slow compared to other missile types. They are unguided.\n* [Action]: Add a missile token in front of this unit. This missile is now a regular unit that must always full move and may not turn. The missile has [Action]: Make an attack against the current space, then remove the missile."),
            "Swarm Missile",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Swarm Missile", ":summary", "* Series of small, linked missiles that individually have low yield but can be fired in varying numbers to strike either a single target or a large area."),
            ":Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Torpedo", ":summary", "* Torpedoes are a form of missile (usually underwater) that is designed to carry the maximum destructive payload. They are, therefore, relatively large and slow compared to other missile types.")
          )
        ),
        ":Ammunition",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Ammunition",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Acid Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Acid Ammo"),
            "Adhesive Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Adhesive Ammo"),
            "Anti-Laser Aerosol Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Anti-Laser Aerosol Ammo"),
            "Area Effect Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Area Effect Ammo"),
            "Armor Piercing Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Armor Piercing Ammo"),
            "Birdshot Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Birdshot Ammo"),
            "Buckshot Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Buckshot Ammo"),
            "Chemical Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Chemical Ammo"),
            "Firefighting Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Firefighting Ammo"),
            "Flare Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flare Ammo"),
            "Flechette Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flechette Ammo", ":summary", "* This is kind of a shot-gun that fires a swarm of darts instead of buckshot ('flechette' is French for 'little arrow'). They look like nails. In the shell, a group of flechettes are held together by a plastic frame called a sabot, which falls away when the load exits the muzzle. Light flechettes are twenty to a shell, heavy are six to a shell. Like shotgun shells, they are good for causing large amounts of damage to the intruder in one's apartment, but failing to penetrate the wall so as to not annoy the neighbors.\n* Light flechettes are only good against soft body armor; rifle plates will stop them cold. Additionally, light flechettes lack the stopping power of buckshot against unarmored targets.\n* Heavy flechettes have the mass of a 000 buckshot pellet and likely being made from very hard material (at least hardened steel, probably tungsten), these shells will exhibit rifle grade penetration.\n* Flechettes are fin stabilized steel projectiles similar in appearance to arrows. During the Korean War the Chinese army tactic of human wave attacks against US lines of defence prompted interest in flechette projectiles in single and multiple projectile systems for small arms and antipersonnel (APERS) use. Flechettes have a performance criteria very different from the conventional rifle bullet. Typical modern flechettes are small light weight steel projectiles, and the velocity lost to air resistance is generally 375 fps. per 100 Meters of flight. Unlike rifle bullets, flechettes are not spin stabilized, but use fins to achieve level flight. The flechette's long body looses rigidity on target impact and bends into a hook, often breaking off the fin portion creating an additional wound. Flechette munitions include projectiles for use in the M16 rifle, CAWS (close assault weapons system), and 12 gage shotgun, as well as the 105mm M101A1/M102 howitzer, 2.75 in. FFAR (folding fin aircraft rocket), and the 70mm Hydra-70 FFAR."),
            "Fragmentation Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Fragmentation Ammo", ":summary", "* Approximately 30% of the energy released by the explosive detonation is used to fragment the case and impart kinetic energy to the fragments. The balance of available energy is used to create a shock front and blast effects. The fragments are propelled at high velocity, and after a short distance they overtake and pass through the shock wave. The rate at which the velocity of the shock front accompanying the blast decreases is generally much greater than the decrease in velocity of fragments, which occurs due to air friction. Therefore, the advance of the shock front lags behind that of the fragments. The radius of effective fragment damage, although target dependent, thus exceeds consid-erably the radius of effective blast damage in an air burst."),
            "Heat Seeking Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Heat Seeking Ammo"),
            "Homing Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Homing Ammo"),
            "Incendiary Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Incendiary Ammo"),
            "Laser Guided Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Laser Guided Ammo"),
            "Minelayer Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Minelayer Ammo"),
            "Needle Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Needle Ammo", ":summary", "* Needlers are unique weapons that fire small needle-like projectiles at high velocities.\n* Advantages: Because they are so light, needlers have much lower recoil than ordinary rounds. They also benefit from high rates of fire and large ammo capacities.\n* Disadvantages: Their principle weakness is that damage falls off sharply against armor.\n* One needler has a solid block of plastic as ammo and a cylinder in the barrel that rotates at high velocities. The twisting motion of the cylinder repeatedly shaves off toothpick-sized needles, tightly coils them and ejects them from the barrel at high velocity. When the coiled needle strikes a target itunwinds, drilling into the target. Because the barrel does not stop spinning, the needler can fire a continuous hailstorm of needles until it is out of ammo.\n* Rules: [Shattershot], [Continuous Stream]", ":titles", "Needlegun"),
            "Non-Lethal Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Non-Lethal Ammo"),
            "Paint Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Paint Ammo"),
            "Radar Guided Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Radar Guided Ammo"),
            "Recoiless Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Recoiless Ammo", ":summary", "* Recoilless weapons fire rocket-propelled, recoilless rounds.  These rounds can be large calibur while maintaining a high fire rate and no recoil making them especially well suited for underwater or space.\n* Recoilless weapons may carry varying payloads including: AP, HE, HEAT, chemical, incediary, and underwater rounds.", ":titles", "Bazooka, Gyrojet, Rocket Round"),
            "Scramble Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scramble Ammo", ":titles", "Haywire Ammo"),
            "Smoke Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Smoke Ammo"),
            "Taser Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Taser Ammo"),
            "Tracer Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Tracer Ammo"),
            "Underwater Ammo",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Underwater Ammo")
          )
        ),
        ":Lasers",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Lasers", ":reference", "Examples of pulsed systems with high peak power:\n* 700 TW (700x10^12 W) - The National Ignition Facility is working on a system that, when complete, will contain a 192-beam, 1.8-megajoule laser system adjoining a 10-meter-diameter target chamber. The system is expected to be completed in April of 2009.\n* 1.3 PW (1.3x10^15 W) - world's most powerful laser as of 1998, located at the Lawrence Livermore Laboratory", ":summary", "* Lasers are the ultimate sniper's weapon. They are silent, extremely hard to spot, and have pinpoint accuracy. They are, however, vulnerable to impurities in the the medium they fire through. These impurities are heated by the beam and can dilute the beam as well as make the beam visible.\n\n       * Accuracy: +1\n\n       * 5 mW - CD-ROM\n       * 10 mW - DVD player\n       * 100 mW - CD-RW\n       * 250 mW - DVD-R\n       * 1 W - green laser in current Holographic Versatile Disc prototype development\n       * 1-20 W - output of the majority of commercially available solid-state lasers used for micro machining\n       * 30-100 W - typical sealed CO2 surgical lasers[26]\n       * 100-3000 W (peak output 1.5 kW) - typical sealed CO2 lasers used in industrial laser cutting\n\n       Energy Storage\n       Let's assume non-rechargeable systems at an energy density of 2.5 kilojoules per cubic centimeter, which is quite plausible. You might consider a rechargeable battery pack as an option, with half the capacity of the non-rechargeables.\n       Lithium-polymer cells are rechargeable, and have an energy density of 1.08 kJ/cm3.\n       As for nonrechargable batteries, check out the various molten salt batteries. They're stored as a solid, so they can be stored 'charged' virtually forever. As soon as you bring them up to operating temperature (400 C or more), and as long as you keep them there, you have an incredibly high output battery. The military has used them like this for a very long time, and most current research is focused on making them rechargeable.\n       Apparently the energy density varies widely, but it's clear that they can have very high energy density.\n\n       Whether you use lasers or particle beams, you'll need a kilojoule of output energy to reliably incapacitate a human target. In the case of a laser weapon, that energy would be subdivided into ~1 joule pulses at ~5 microsecond intervals, to achieve penetration in the face of a laser's natural tendency to deposit energy at the target's surface. Particle beams don't have that problem; boost the electrons up to a few hundred MeV, and you can dump the whole kilojoule's worth at once.\n       The plasma clears away easily in that time frame; debris is the real issue, and the driving force between the 5 microsecond pulse rate. That allows roughly 90% of the debris to clear the beam path, assuming a 1mm beam and instantaneous 1J pulses. 1 joule every 5 microseconds is optimal against soft tissue, other materials will want different pulse trains.\n       I'm assuming a weapon designed to penetrate ~30cm in soft body tissue. This gives about 15cm in bone or plastic, 5cm in brick or concrete, or 2.5cm in steel or most ceramics. Synthetics won't be very good at stopping energy weapons, even tough ones like kevlar, but you might be able to find a ceramic that could stop a laser beam with a centimeter's thickness or so. Particle beams are tougher to stop; it mostly comes down to sticking mass in the way without regard to material properties.\n       Lasers would likely have to have pulse energy and frequency tuned to the specific material being targeted. It might be possible to do this automatically, based on crude spectoanalysis of the material vaporized in each pulse, but if not expect penetration to be roughly halved if a laser weapon is fired at a target it has not been optimized for.\n       Taking into account the inefficiency of the system, the input energy will likely be somewhere between two and five kilojoules per shot. So you could get fifty to a hundred shots from a pistol-sized non rechargeable energy source, or half that with a rechargeable battery. Automatic fire at anywhere up to 20 Hz (1200 rpm) shouldn't be a problem in the short term, though might cause cooling problems if you keep it up.\n       You also need to focus the energy on the target, with a spot size of a millimeter or less. With a laser, that gets kind of tricky. A 5-centimeter mirror, about the largest you can really imagine on a pistol, gives an effective range of perhaps sixty meters, beyond which the weapon starts losing penetration quite rapidly.\n       you still need to get down to a millimeter or so to flash-boil water in a layer ~one optical depth in thickness. Once you do that, the steam will expand and spread the damage around, but if you don't hit the threshold for turning water into steam all you do is warm up the target.\n       With penetration, range, and repeatability dealt with, it is time to turn to accuracy. Lack of recoil, automatic fire capability, and line-of-sight accuracy are all major assets here, but there is one more improvement to be made. Both lasers and particle beams can be steered at least a degree or two off-axis, in the case of the laser via the adaptive-optic mirror, for particle beams with a transverse magnetic field at the muzzle.\n       If we can throw in a chip-mounted laser or acoustic gyro set, we can have a gyrostabilized handgun. The weapon shoots not at where the gun is pointed at the instant of firing, but at a weighted average of where it has been pointing over the past quarter of a second or so. Smoothes out a lot of the jitter inherent in human marksmanship.\n       Another clever one would be to use the laser's optics to project a laser sight. Pull the trigger, and the harmless red dot suddenly explodes. BANG! Using the laser optics as a scope would be more useful for long range or high accuracy shots.\n       In combat, I would expect such a weapon to be used in automatic fire mode at ~10 Hz. With fifty to a hundred pulses to play with, you won't run out of ammunition too soon as is the case with current machine pistols. And recoilless, stabilized automatic fire should allow a moderately capable marksman to walk a burst on target in one or two reaction cycles (say, half a second) in most circumstances.\n       Practical combat range, if you don't mind missing a good part of the time, would be on the order of 50 meters\n       Cooling:\n       And you'll need some serious cooling. I'd go with liquid-metal microchannel heat pipes etched into all the hot surfaces, and leading to cooling fins around the 'barrel'. If you use the chemical-propellant option, regenerative cooling could also work.\n       What would it sound like?\n       The actual mechanism of producing the laser beam could sound like anything, from complete silence, to the click of an electrical contact, to a sharp, electric snap, to a gunshot-like thunderclap.\n       The beam, when incident upon its target, will make a nice bang.\n       The pistol won't make a 'zap' sound, will it?\n       If the beam is repeated rapidly it might, however, make a buzz. It might end up sounding quite electrical at a few hundred Hertz.\n       Remember that the temporary cavity caused by the explosions only lasts a few milliseconds, so the beam has to have completed its work of piercing the target at this time. The individual explosions will be too closely spaced (microseconds apart) to be individually audible. Since shocks are always supersonic to the air in their path, and subsonic to the moving air left behind them, multiple subsequent shocks from the same source tend to merge into one stronger shock. Thus, each pulse probably makes one bang. The bang comes from a series of explosions whose total energy is about the same as that of the gunpowder detonating in a firing rifle, so it will probably be about as loud.\n       If the beam is in the visible part of the spectrum, you get a noticeable path through clean air at indoor lighting intensities. I am not sure if it will be visible out of doors under full sunlight, but you could see it at night. The beam will be widest at the aperture of the gun, probably a few centimeters across to keep the optics from being damaged by the intense light. The beam will converge to a spot a millimeter or so across at the target. In unclean air, the beam will be a lot more visible. This Rayleigh scattering is linear, so the total integrated brightness across the cross section of the beam should be constant, if we neglect the gradual attenuation of the beam due to the light being scattered out of it. Higher frequency light scatters much more than lower frequency light, so a blue beam would be much more visible than a red one.\n       When a visible beam is incident on the target, it creates a very bright flash of the same color as the beam. This may temporarily dazzle those looking at it, and the beam itself may be overlooked because of the bright flash obscuring it.\n       If the weapon lases in the UV, the intense pulse may cause multi-photon ionization of atoms in the air, causing a fluorescent glow along the path of the beam (possibly red, green, or violet, I'm not quite sure what sparsely ionized air at atmospheric pressure looks like). Since this process is non-linear, it will be dimmest near the aperture where the beam is widest, and most intense nearer the target. Weapon designers will probably try to minimize this effect, since it leads to attenuation of the beam and subsequent loss of effectiveness.\n       Near IR beams are likely to only be visible if there are relatively large pieces of dust, lint, or pollen floating around, which will glow incandescent as they burn under the irradiation of your beam. I doubt beams in the 'thermal' IR range would be used, even though the air is fairly transparent to these wavelengths, because with short, intense pulses you tend to get cascade ionization with these lower frequencies, and this will completely absorb the beam.\n       Beams at non-visible frequencies will also make a flash and a bang where incident on the target from the expanding plasma of their explosion, but nowhere near as bright as that of a visible beam.\n       In vacuum, of course, the beam itself is always invisible, but you can still see the flashes at the target.\n       Will the beam be invisible or bright enough to be blinding?\n       It is quite likely to be both. The beam itself may be invisible or minimally visible, but if even a tiny fraction of the beam is specularly scattered into your eye, near IR and visible and some near UV will be focused to a diffraction limited spot on your retina, causing burns and permanent scarring. This can lead to degradation of vision or total blindness. Interestingly, the brain compensates for blind spots on the retina, so that you might have lost up to 60% of your vision from multiple exposures to beams and you still think you can see just fine.\n       Anyone likely to be using a laser will probably wear protective goggles or contacts. With today's technology, you would probably make them out of an optical band gap material that excludes a very narrow window of light centered on the laser's frequency. This means that the people who fired the lasers would not be able to see the beams or flashes of their own weapons (assuming they used visible light lasers). They would still see the flashes from the plasma explosions, though, plus incandescence of suspended atmospheric particles and fluorescence from multi-photon absorption.\n       The method of subsequent explosions on the back of an expanding cavity driving the cavity through the target will leave a wound much like that of a gunshot, except without fun stuff like the bullet fragmenting or breaking up. A variant where nearly parallel beams a few cm apart literally rip the tissue between them could leave a wound looking more like an ugly gash - add on a few more of these beams on the same plane and you could literally cut someone in half with one millisecond pulse, using only about as much energy as goes into accelerating the bullet of a modern day battle rifle.\n       Will there be a large splash of blood and gore on the wall behind the unlucky pirate?\n       Quite likely, Note that since you do not have the momentum associated with a projectile, it will be more spread out than you would get from a gunshot wound, and you would get blood and gore coming out the front, too.\n       I assume that since the beam is one millimeter in diameter but the hole in the pirate is four centimeters, little or no wound cauterization will occur.\n       Nope, the wound would be ragged and messy. It is created by mechanical, not thermal effects.\n       The laser weapon will probably end up looking something like a camcorder, with a big lens that the beam goes through, and a fairly compact design. Since mirrors and internal optics can bend the beam inside the weapon, there is no need for the long barrels you see on modern firearms. Cooling, if necessary, would probably not involve fins - I would expect something more like the radiator on modern automobiles. Remember, shedding your heat through contact with the air is much more efficient than radiation.\n       keeping in mind that using contact with the air doesn't work if there is no air, i.e., in vacuum. C. James Huff notes that there is one kind of fin for radiant cooling and another for air cooling. He mentions that the fins on a CPU hot sink is a good example of the latter. For a vacuum rated laser he recommends a compressed or liquified gas cartridge since a radiant cooler would be inconveniently huge.\n       Also, lasers are getting surprisingly efficient. When each beam pulse contains no more energy than imparted to a rifle bullet, lasers might need cooling no more than a modern rifle.\n       the laser's battery will be carrying plenty of juice. Anything carrying that much energy will be at least slightly unstable. In other words, it wouldn't take much to make a charged battery into a home-made bomb (which might come in handy if one suddenly needed a bomb.). You might have read news reports about laptop computers who's batteries suddenly burst into flame.\n       And don't even think about sticking a fork into the open contacts.\n       This has been observed somewhat tongue-in-cheek by John Routledge as Routledge's Law: 'Any interesting battery material for a laser gun would be more usefully deployed as an explosive warhead.' He also notes the problem with ammunition cook off. If you are holding a fully-charged laser pistol, and some lucky enemy sniper manages to score a direct hit on the pistol's battery, it is going to be just to bad if the resulting explosion vaporizes you and all your friends within a large radius.\n       Assuming a worst case of 5 kilojoules per shot and a rechargeable magazine containing 50 shots, the magazine is packing 250 kilojoules. This is the equivalent of 250,000 * 2.7778e-4 = 70 watt-hours or 250,000 / 4,500 = 55 grams of TNT (For comparison purposes, a standard 8 inch stick of dynamite is about 208 grams and hand grenades used by the US Army have explosive charges of 56 to 226 grams of TNT). At his specified power density of 2.5 kilojoules per cubic centimeter, this would imply a magazine volume of 100 cm3. this is approximately the same volume as forty-two .45 caliber rounds.\n\n       Fan Beam\n       If a man is about 45 centimeters wide (18 inches), at a range of 5 meters, and the bolts were to be spaced 3 centimeters apart, it would take 15 bolts fired at 0.3 degree increments to the left and right. Your target would fall... in two places.\n       A less blood-thirsty use would be in the wilderness, chopping down trees ('Lumberjack' mode).\n\n       Multiple Modes\n       Stun would be a laser in Pulsed Energy Projectile mode.  Heat would be a laser in unpulsed heat ray mode at relatively low energy levels. Disrupt would be a laser in pulsed blaster mode or in unpulsed heat ray mode at high energy levels. Overload makes the battery explode. Dematerialize is the only one that cannot be done, but it is rather silly in the first place.\n       ('Dematerialize' is a fancy way of saying 'disintegrator ray'. A weapon that can vaporize a human body without setting the walls and floor on fire or even raising the temperature of the room? Give me a break!)\n       Remember that a laser in pulse mode could have its effect optimized to a given material by a specific setting for pulse frequency. So one could have a 'metal cutting' setting for use as a tool or to open a locked door, and a 'kill human' setting for war-to-the-knife combat. All with the same pulse laser, just with a different frequency.\n       Such a weapon would have a selector switch for each mode. And it might have a 'customizable' mode. This would allow an expert to manually tweak the settings: continuous or pulse, spectrum frequency, pulse timing, power level, etc."),
        "Less Than Lethal",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Less Than Lethal",
          ":reference",
          "It was recently revealed that the US military was researching a rather alarming line of less-lethal weapons, the Pulsed Energy Projectile (PEP) program. (As a side note, understand that there is no such thing as a 'non-lethal' weapon. This is because any weapon or gas that can reliably incapacitate or render unconscious a 300 pound world wrestling champion will be strong enough to instantly kill a small child or elderly person.) PEP weapons fire a laser pulse that is very intense but only a fraction of a second in duration. The pulse vaporizes a tiny portion of the hapless victim's clothing or skin, creating a plasma burst intense enough to knock the victim to the ground. This was intended to be used for crowd control. A pulse strong enough to knock one down is also strong enough to make one's eyeballs explode if it hit your face. However, during test performed on animals, the researchers noticed something unexpected. The pulses were creating pain and temporary paralysis in the test animals. As it turns out, certain pulses would create a plasma burst emitting an electromagnetic signal of proper frequency to artificially stimulate the nerve endings in the animal's skin. The US military is researching this effect, trying to find the frequency that will cause the maximum pain sensation without actually causing any physical harm to the target. There is also the possibility that other frequencies could cause taser-like paralysis effects. The effect can be made lethal. The original name for the project was Pulsed Impulsive Kill Laser (PIKL) but was quickly changed. Currently PEP weapons are not man-portable, they are vehicle mounted weapons. They have a range of about two kilometers. We might yet see Space-1999 style hand lasers with a stun setting.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Pain Ray",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Pain Ray", ":reference", "* For riot control situations, the US Army is working on the Active Denial System (ADS). It emits microwaves that only penetrate a short way into the skin, not deep enough to do permanent damage but more than deep enough to roast all the target's pain nerve endings. As with all microwaves, the range of this beam of concentrated agony is drastically reduced by rain or heavy humidity."),
            "Vomit Ray",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Vomit Ray", ":reference", "* The US Navy is working on its Electromagnetic Personnel Interdiction Control project, AKA the Vomit Ray. The US Department of Homeland Security is working on a pistol sized version, which is a very unsettling thought.")
          )
        ),
        "Nuclear Weapons",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Nuclear Weapons"),
        "Particle Beams",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Particle Beams", ":reference", "* If you get a particle beam intense enough to burn someone, it will also deliver a lethal dose of radiation from a hit anywhere on the body.\n* Radiation will scatter from the beam 'impact' site, irradiating things around it. In an atmosphere, radiation will scatter off air molecules to irradiate things near the beam. Some of it will backscatter, irradiating whatever fires the gun. Forget about a sci-fi hero using a particle beam 'blaster' - after blasting a hoard of bug eyed space aliens, he'd be sick or dying from radiation poisoning. In real life, particle beam weapons were considered for their ability to use radiation to disable things (mostly ICBMs) without necessarily blowing holes in them.", ":summary", "* Particle beams fire a stream of relativistic atoms or sub-atomic particles.  These are beams of ionizing radiation."),
        ":Plasmacasters",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Plasmacasters", ":summary", "* A weapon that fires a shell that releases a burst of plasma when it strikes a target.  This shell glow with barely contained energy as it flies to its target.", ":titles", "Blaster, Spinfusor"),
        "Railgun",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Railgun", ":reference", "* On January 31, 2008, the US Navy tested a 10MJ railgun with a muzzle velocity of 2500m/s. It is expected to reach 5800m/s at 10 shots/minute (enough to hit a 5m target 370km/200miles away).", ":summary", "* This type of weapon includes all hypervelocity rounds propelled by massive magnetic fields.\n* Their great speed gives them excellent penetration and kinetic damage.  Because of this great speed, they cannot carry any useful payload because the payload would be destroyed when the shell was launched.  Therefore, railguns are all kinetic weapons only.\n* Coilguns (Gauss) and Railguns are technically different, but their result is the same.", ":titles", "Kinetic Kill Weapons, Linear Cannon, Linear Rifle, Mass Driver"),
        "Sonic Weapon",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Sonic Weapon"),
        "Disruptor Weapons",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Disruptor Weapons", ":summary", "* Disruptors temporarily weaken the molecular bonds in the target. Damage is done via violent system shock, and the weapon may distintegrate the target entirely if enough damage is done.\n* Disruptors have decreasing effectiveness with the density and hardness of the target.  Soft materials like flesh are the most practical target. Damage drops off sharply against metals and rocks making disintegration of such materials extremely difficult.", ":titles", "Disintegrator, Phaser"),
        "Energy Melee Weapons",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Energy Melee Weapons", ":summary", "* The lance is essentially a giant plasma cutting torch using compressed-gas ignited from direct current from the exo-armor's fusion reactor.\n* The gas supply limits the usefulness of the weapon and many may need to be carried."),
        "Weapon Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Weapon Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Firing Arc",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Firing Arc", ":summary", "Larger weapons are often cumbersome to use or aim and may only attack in a particular arc. The following abbreviations are used:\n* F - Front. Can only attach in any front arc.\n* B - Back. Can only attack in any rear arc.\n* FF - Fixed Forward.  Can only attack the forward arc.\n* FB - Fixed Backward.  Can only attack the rear arc.\n* FL - Fixed Left.  Can only attack the left arc.\n* FR - Fixed Right.  Can only attack the right arc.\n* Turrent - Turret mount.  Can attack in any direction but must use [Turret] rules to fire anywhere but forward.\n* Pintle - Pintle mount.  Can attack in any direction without limit, but if the pintle mount is used, a crew member is exposed and may be targetted separately from the vehicle at -1."),
            ":Reload1",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Reload1", ":summary", "* [Action]: An item with Reload may not be used until all Reload tokens are removed.\n* [Action]: An item with Reload adds the number of Reload tokens each time the item is used.\n* Gain a White [Reload] Token for each Reload value each time the weapon is fired.\n1. Panther G 13 sec\n2. PZ IV F1 9 sec\n3. PZ IV F2 10 sec\n4. Tiger 1E 15 sec\n5. IS-2 20 sec - This is longer due to the IS-2 having a 122mm cannon and the shell has to be loaded in two parts. Although the first shot to a Panther, Tiger or a PZ IV is usally fatal.\n6. KV-1S 12 sec\n7. T34-76 13 sec")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_skills
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_skills = {
    vx_type: vx_core.t_type
  }
  static e_chapter_skills = {
    vx_type: nx_tactics_books_combat.t_chapter_skills
  }

  // (func chapter_skills)
  static f_chapter_skills(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Skills",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Combat Skills",
          ":itemmap",
          nx_tactics_base.f_itemmap_from_tactics_keys(tactics, "Bare Handed"),
          ":skillmap",
          nx_tactics_base.f_skillmap_from_tactics_keys(tactics, "Close Combat", "Defense", "Evasion", "Melee", "Ranged", "Firearm", "Gunnery", "Demolitions", "Military", "Leadership")
        )
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
    vx_type: nx_tactics_books_combat.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Combat",
      ":image",
      "Warrior.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_combat.f_chapter_combat_overview(tactics),
        nx_tactics_books_combat.f_chapter_example_of_play(tactics),
        nx_tactics_books_combat.f_chapter_rules(tactics),
        nx_tactics_books_combat.f_chapter_skills(tactics),
        nx_tactics_books_combat.f_chapter_early_weaponry(tactics),
        nx_tactics_books_combat.f_chapter_modern_equipment(tactics),
        nx_tactics_books_combat.f_chapter_advanced_weaponry(tactics)
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_combat.f_tacticsbook
    }

  }
}
