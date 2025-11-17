'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_world_wars {

  /**
   * @function chapter_world_wars_overview
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_world_wars_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_world_wars_overview = {
    vx_type: nx_tactics_books_world_wars.t_chapter_world_wars_overview
  }

  // (func chapter_world_wars_overview)
  static f_chapter_world_wars_overview(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "World Wars Overview",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: World Wars?", ":summary", "* Compared to Other Games\n* Vs. Axis &amp; Allies\n* Vs. Axis &amp; Allies Miniatures\n* Vs. Diplomacy\n* Vs. Risk\n* Vs. Memoir '44"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "WWI Land Warfare", ":summary", "* Infantry\n* Cavalry\n* Rifles\n* Machine Guns\n* Mortars\n* Poison Gas\n* Trench Warfare\n* Cannons\n* Artillery\n* High Ground\n* Fortifications\n* Tanks"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "WWI Aerial Warfare", ":summary", "* Biplanes\n       * Balloons\n       * Zepplins\n       * Machine Guns\n       * Bombs"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "WWII Land Warfare", ":summary", "* Infantry\n      * Rifles\n      * Machine Guns\n      * SMG's\n      * Mortars\n      * Cannons\n      * Artillery\n      * High Ground\n      * Fortifications\n      * Tanks\n      * Mechanized Infantry"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "WWII Naval Warfare", ":summary", "* Aircraft Carriers\n* Battleships\n* Destroyers\n* Cruisers\n* Submarines\n* Torpedo Boats\n* Radar\n* Naval Cannons"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "WWII Aerial Warfare", ":summary", "* Prop Planes\n* Jet Planes\n* Landing Strips\n* Aircraft Carriers\n* Machine Guns\n* Strafing\n* Tank Killing\n* Dive Bombing\n* Flying Fortress\n* Torpedo Bombing\n* Carpet Bombing\n* Strategic Bombing")
      )
    )
    return output
  }

  /**
   * @function chapter_wwi_british_forces
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwi_british_forces = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwi_british_forces = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwi_british_forces
  }

  // (func chapter_wwi_british_forces)
  static f_chapter_wwi_british_forces(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWI British Forces",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWI British Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWI British Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Doughboy",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Doughboy"),
            "Vickers Machine Gunner",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Vickers Machine Gunner"),
            "Sopwith Camel",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sopwith Camel")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwi_campaign
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwi_campaign = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwi_campaign = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwi_campaign
  }

  // (func chapter_wwi_campaign)
  static f_chapter_wwi_campaign(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWI Campaign",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Overview",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Overview", ":summary", "* Events Leading to War\n* Overview of the War\n* Aftermath"),
        "WWI Scenes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWI Scenes",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of Verdun, 1916",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battle of Verdun, 1916", ":reference", "The battlefield with the highest density of dead per square yard.", ":summary", "* The Battle of Verdun was a ten month long ordeal between the French and German armies and is considered one of the most brutal events of WWI. Both the French and German armies suffered incredibly with an estimated 540,000 French and 430,000 German casualties and no strategic advantages were gained for either side.\n* In the years preceding World War I, Germany became Europe's leading industrial power. France felt increasingly threatened by German industrialization. As a response to the German threat of invasion, France built a continuous line of sunken forts from the Swiss frontier to the French city of Verdun making Verdun a vital strong point.\n* The German attack began on February 21, 1916 with an intense artillery bombardment of the forts surrounding Verdun. The French army retreated to predetermined positions while the German army pounded through the French lines.\n* Although three French forts near Verdun had capitulated to German forces, Verdun itself remained undefeated.\n* By April 1916, the French Air Force had secured the sky over Verdun, which would help the French to successfully defend the area. The British attack and a Russian offensive in the east forced the German army to transfer troops away from Verdun.\n* By December 1916, the French had advanced to their February 1916 lines, their original position. No new advantage had been gained for either side."),
            "Battles of the Marne, 1914, 1918",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battles of the Marne, 1914, 1918", ":summary", "* On September 4, 1914, the rapid advances of the German army through Belgium and northern France caused panic in the French army and troops were rushed from Paris in taxis to halt the advance. Combined with the BEF (British Expeditionary Force) the Germans were eventually halted and the War settled into the familiar defensive series of entrenchment's.\n* Ironically, by the end of May, 1918, the Germans had again reached the Marne after the enormous successes of Ludendorff's offensives of that year. The intervening four years had cost hundreds of thousands of lives and the armies were still, literally, exactly where they had started."),
            "Battles of Ypres, 1914, 1915, 1917",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battles of Ypres, 1914, 1915, 1917", ":summary", "* There were in fact three battles fought around the Ypres salient during the War.\n* The first, in 1914 was an attempt by the BEF to halt the rapid advances made by the Germans.\n* The second, in 1915, was notable for the first use of poison gas by the Germans.\n* However, it is the long-planned offensive of July 31, 1917, that holds the most significance. Here, a combination of over-ambitious aims, appalling weather conditions, and misguided persistence by Haig led to horrific losses. By the time the offensive was called off total casualties for both sides had been approximately 250,000. The horrors of the battle, in which men drowned in liquid mud has become synonymous with the images of the War."),
            "Battle of the Somme, 1916",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battle of the Somme, 1916", ":summary", "* At 0730 hours on the 1st July, 1916, after a week long artillery bombardment launched the now infamous 'Big Push' attack across the river Somme. The British intended to breakthrough the German defenses in a matter of hours.\n* The mistrust that High Command had of the so-called 'New Armies' manifested itself in the orders to the troops to keep uniformed lines and to march towards the enemy across no-man's land. This, coupled with the failure of the artillery bombardment to dislodge much of the German wire, or to destroy their machine-gun posts, led to one of the biggest slaughters in military history.\n* After the first day, with a gain of only 1.5km, the British had suffered 57,470 casualties. Despite this, Haig pressed on with the attack until November 19th of the same year. For the meager achievements, total losses on the British and Imperial side numbered 419,654 with German casualties between 450,000 and 680,000. When the offensive was eventually called off the British were still 3 miles short of Bapaume and Serre, part of their first-day objectives."),
            "Battle of Cambrai, 1917",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battle of Cambrai, 1917", ":summary", "On November 20, 1917, the British launched the first full-scale offensive that was designed exclusively to accommodate the British secret weapon, the tank (so-called because when the first shipment came from England they were described as water tanks to maintain secrecy). A surprise artillery barrage started the offensive and 476 tanks, packed tightly for a mass attack moved against the German lines. Supported by infantry the gains were dramatic, breaching the almost impregnable Hindenberg line to depths of 4-5 miles in some places. However, these gains seemed to surprise British High Command equally as much as the Germans, and the following cavalry failed to take advantage. Nevertheless, Cambrai demonstrated how a well-thought out attack, combining tanks en masse with surprise, could be used to break the trench deadlock.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwi_french_forces
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwi_french_forces = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwi_french_forces = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwi_french_forces
  }

  // (func chapter_wwi_french_forces)
  static f_chapter_wwi_french_forces(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWI French Forces",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWI French Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWI French Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "French Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "French Infantry", ":image", "WorldWars/French_Infantry.png")
          )
        ),
        "WWI French Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWI French Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Renault FT 17",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Renault FT 17", ":reference", "* Among the most revolutionary and influential tank designs in history. The FT 17 was the first tank with an armament in a fully rotating turret, and its configuration with the turret on top, engine in the back and the driver in front became the conventional one, repeated in most tanks until today; at the time it was a revolutionary innovation, causing armour historian Steven Zaloga to describe the type as 'the world's first modern tank.' The tank was widely used by the French and the Americans (who, as mentioned, were lent 514) in the latter stages of World War I, after 31 May 1918. The tank was cheap and well-suited for mass production. Indeed, the very production was made a weapon in itself: a goal was set of 12,260 to be produced (4,440 of which in the USA) before the end of 1919.This prospect was one of several factors which drove the German High Command to its decision to launch the massive all-or-nothing offensives in the spring of 1918, which in turn weakened their army so that it collapsed in the summer. FT 17 tanks were also used in the Second World War, among others in Poland, Finland, France and Kingdom of Yugoslavia, although they were completely obsolete by then.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwi_german_forces
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwi_german_forces = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwi_german_forces = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwi_german_forces
  }

  // (func chapter_wwi_german_forces)
  static f_chapter_wwi_german_forces(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWI German Forces",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWI French German Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWI French German Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Folker",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Folker", ":reference", "* Of all the aces the war produced none compared to the greatest flyer of all, Manfred Richtofen 'The Red Baron'. To this day his name remains a legend that is better known to most than even the war that created him.")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_american_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_american_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_american_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_american_equipment
  }

  // (func chapter_wwii_american_equipment)
  static f_chapter_wwii_american_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII American Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII American Light Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Light Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ".45 M1911A1 Automatic",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 M1911A1 Automatic", ":image", "WWIIAmerican/Pistol_M1911.jpg", ":classification", "Pistol", ":length", ".21m", ":mass", "1.1kg", ":muzzlevelocity", "253m/s", ":range", "25m", ":rounds", "7"),
            ".45 M3 SMG Grease Gun",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".45 M3 SMG Grease Gun", ":image", "WWIIAmerican/SMG_M3GreaseGun.jpg", ":classification", "Lt. MG", ":length", ".75m", ":mass", "3.6kg", ":modifiers", "Auto", ":muzzlevelocity", "280m/s", ":range", "90m", ":rounds", "30"),
            ".30-06 M1 Garand Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 M1 Garand Rifle", ":image", "WWIIAmerican/Rifle_M1Garand.jpg", ":reference", "* The M1's semiautomatic operation gave US forces a significant advantage in firepower over German and Japanese soldiers with bolt-action rifles. The greatest implement of battle ever devised. - General George S. Patton", ":summary", ".30-06 Semi-automatic rifle", ":classification", "Rifle", ":length", "1.1m", ":mass", "4.3kg", ":muzzlevelocity", "853m/s", ":range", "457m", ":rounds", "8"),
            ".30-06 M1903A4 Springfield",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 M1903A4 Springfield", ":image", "WWIIAmerican/Rifle_M1903A4_Springfield.jpg", ":reference", "* An M1903 fitted with a scope was used by Daniel Jackson (Barry Pepper) in the movie Saving Private Ryan.", ":summary", ".30-06 Bolt-action Sniper Rifle", ":classification", "Rifle", ":length", "1.1m", ":mass", "3.9kg", ":muzzlevelocity", "853m/s", ":range", "550m", ":rounds", "5"),
            ".30-06 M1918 BAR",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".30-06 M1918 BAR", ":reference", "* While not without its design flaws (a thin-diameter, fixed barrel that quickly overheated, limited magazine capacity, complex field-strip/cleaning procedure, unreliable recoil buffer mechanism, a gas cylinder assembly made of corrosion-prone metals, and many small internal parts), the basic BAR design nevertheless proved itself when kept clean and earned a reputation as being rugged and reliable.", ":summary", ".30-06 Browning Automatic Rifle (BAR)", ":classification", "Lt. MG", ":length", "1.2m", ":mass", "7.2kg", ":modifiers", "Auto", ":muzzlevelocity", "860m/s", ":range", "326m", ":rof", "450/min", ":rounds", "20")
          )
        ),
        "WWII American Heavy Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Heavy Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "MG:.30-06 M1919",
            nx_tactics_base.f_item_from_tactics_key(tactics, "MG:.30-06 M1919"),
            "MG:.50 M2HB",
            nx_tactics_base.f_item_from_tactics_key(tactics, "MG:.50 M2HB"),
            "M2 Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "M2 Flamethrower", ":image", "WWIIAmerican/Flamethrower_M2.jpg", ":reference", "* With the arrival of tanks, especially flamethrower tanks, the need for infantrymen to expose themselves to fire became unnecessary as tanks offered greater protection while still delivering the effective damage.\n* While some were sold off, the majority of them were scrapped when they were declared obsolete.", ":summary", "* All [Hits] and [Critical Hits] are [Fire] tokens.", ":classification", "Flamethrower", ":crew", "2", ":mass", "31kg", ":modifiers", "Fire, Auto", ":range", "20m"),
            "M1A1 Bazooka",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "M1A1 Bazooka", ":image", "WWIIAmerican/Rocket_M1A1Bazooka.jpg", ":reference", "* Highly effective, though inherently inaccurate at all but very close ranges. Eisenhower later described it as (together with the atom bomb, jeep and the C-47 Skytrain transport aircraft) one of the four weapons which won WWII for the allies.", ":classification", "Missile", ":crew", "2", ":explosive", "1.59kg", ":length", "1.4m", ":mass", "5.8kg", ":modifiers", "HEAT, -1 Accuracy, +1 Prepare", ":range", "100m"),
            "4.2in M2 Mortar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "4.2in M2 Mortar", ":image", "WWIIAmerican/Mortar_M2.jpg", ":classification", "Artillery", ":explosive", "3.64kg", ":length", ".7m", ":mass", "19kg", ":modifiers", "Indirect, HE, White Phosphorus, Illuminating", ":range", "1.8km", ":rof", "18/min"),
            "20mm Oerlikon Autocannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Oerlikon Autocannon", ":classification", "Cannon", ":mass", "48kg", ":modifiers", "Auto", ":muzzlevelocity", "820m/s", ":rof", "450/min"),
            "20mm Hispano Autocannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Hispano Autocannon", ":classification", "Cannon", ":mass", "42kg", ":modifiers", "Auto", ":muzzlevelocity", "840m/s", ":rof", "750/min"),
            "28mm 1.1in Quad Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "28mm 1.1in Quad Cannon", ":classification", "Cannon", ":modifiers", "Auto"),
            "37mm M3 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "37mm M3 Cannon", ":image", "WWIIAmerican/Cannon_M3.jpg", ":classification", "Cannon", ":length", "4m", ":mass", "414kg", ":muzzlevelocity", "884m/s", ":rof", "25/min"),
            "37mm M4 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "37mm M4 Cannon", ":image", "WWIIAmerican/Cannon_M4.jpg", ":classification", "Cannon", ":length", "2.3m", ":mass", "97kg", ":modifiers", "Auto, HE, AP", ":muzzlevelocity", "610m/s", ":rof", "150/min"),
            "57mm M1 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "57mm M1 Cannon", ":reference", "* American version of the British QF 6 Pounder\n* Although 17 Pounder guns were rushed to North Africa to combat the Tiger tank, it was in fact a 6-pdr, which claimed the first Tiger 'kill'.", ":classification", "Cannon", ":modifiers", "AP", ":range", "4600m"),
            "75mm M3 L/40 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm M3 L/40 Cannon", ":summary", "* The gun was designed to have both powerful HE projectile and good anti-tank capability, however from the middle of the war it was no longer effective in the anti-tank role, due to its low muzzle velocity.", ":classification", "Cannon", ":modifiers", "HE, AP", ":muzzlevelocity", "619m/s"),
            "Cannon:76mm M1",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Cannon:76mm M1"),
            "76mm M7 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "76mm M7 Cannon", ":reference", "* Though successful in Northern Africa, the gun proved to be ineffective against the frontal armor of the newer German Tiger and Panther tanks.", ":classification", "Cannon", ":length", "7.1m", ":mass", "2.2tons", ":modifiers", "AP, HE", ":muzzlevelocity", "820m/s", ":range", "9.6km", ":rof", "12/min"),
            "90mm M1 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "90mm M1 Cannon", ":classification", "Cannon", ":modifiers", "HE, AP, AA", ":muzzlevelocity", "823m/s", ":range", "17800m", ":rof", "24/min"),
            "105mm M101 Howitzer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "105mm M101 Howitzer", ":classification", "Cannon", ":modifiers", "Indirect, HE"),
            "127mm 5in/38cal Autocannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "127mm 5in/38cal Autocannon", ":classification", "Cannon", ":length", "5.6m", ":mass", "50tons", ":modifiers", "Auto", ":muzzlevelocity", "760m/s", ":rof", "15/min"),
            "203mm 8in/55cal Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "203mm 8in/55cal Cannon", ":classification", "Cannon", ":length", "11m", ":mass", "20tons", ":muzzlevelocity", "760m/s", ":range", "29km", ":rof", "4/min")
          )
        ),
        "WWII American Explosives",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Explosives",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Mk 2 Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mk 2 Grenade", ":image", "WWIIAmerican/Grenade_MK2.jpg", ":reference", "* At least 5 people have thrown themselves on hand grenades and lived.", ":summary", "* It had a fatality radius of 5m, a blast radius of 13.7m, and fragments can disperse to 213m.", ":classification", "Bomb", ":explosive", ".057kg", ":mass", ".6kg", ":modifiers", "Anti-Personnel, Area", ":range", "30m"),
            "Demolition Pack",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Demolition Pack", ":classification", "Bomb", ":modifiers", "+1 Prepare"),
            "4.6in Rockets",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "4.6in Rockets", ":classification", "Missile"),
            "5in HVAR Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "5in HVAR Rocket", ":image", "WWIIAmerican/Rocket_HVAR.jpg", ":summary", "* High-Velocity Aircraft Rocket, aka Holy Moses. About 1 million HVAR rockets were produced before the end of the war. It had a steel-cased warhead and could penetrate 38mm of armor and 1.2m of reinforced concrete.\n* Trials against Panthers showed that they could penetrate all but front armor, but even in clusters of 8 could only hit a stationary tank 4% of the time.\n* Tank casualties to rockets were very low.", ":classification", "Missile", ":explosive", "21kg", ":mass", "40kg", ":modifiers", "HE, AP", ":range", "4.5km", ":speedair", "1530kph"),
            "Mark 14 Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mark 14 Torpedo", ":reference", "The Mark 14 had four major flaws.\n* It tended to run about 10 feet deeper than set.\n* The magnetic exploder often caused premature firing.\n* The contact exploder often failed to fire the warhead.\n* It tended to run 'circular', failing to straighten, thus returning back to strike the firing ship.", ":classification", "Torpedo", ":explosive", "292kg", ":length", "6.25m", ":mass", "1490kg", ":range", "8km", ":speedwater", "85kph"),
            "Atomic Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Atomic Bomb", ":summary", "* Little Boy - Hiroshima 13kton/63TJ\n* Fat Man - Nagasaki 20kton/84TJ", ":classification", "Bomb")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_american_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_american_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_american_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_american_units
  }

  // (func chapter_wwii_american_units)
  static f_chapter_wwii_american_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII American Units",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII American Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Able Team",
            nx_tactics_base.f_unit_from_tactics_key(tactics, "Able Team"),
            "Baker Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Baker Team",
              ":image",
              "WWIIAmerican/Infantry_BakerGarandToken.png",
              ":reference",
              "* We're all very, very different, but there is one thing that we all have in common: we were all stupid enough to enlist in the Army. We're mutants. There's something wrong with us, something very, very wrong with us. Something seriously wrong with us - we're soldiers. But we're American soldiers!  We've been kicking ass for 200 years! - John Winger, Stripes",
              ":summary",
              "* Baker Team is composed of 5 riflemen.",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "Charlie Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Charlie Team",
              ":image",
              "WWIIAmerican/Infantry_CharlieBARToken.png",
              ":summary",
              "Charlie Team is composed of 3 riflemen, a BAR gunner, and a Squad leader.",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Airborne Charlie",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Airborne Charlie",
              ":image",
              "WWIIAmerican/Infantry_AirborneToken.png",
              ":reference",
              "* Who can afford so to cover his country with troops for its defense, so that ten thousand men descending from the clouds might not, in many places, do an infinite deal of mischief before a force could be brought together to repel them? - Benjamin Franklin, 1784\n* The German won't not be able to help themselves but to imagine the cruelty their brothers endured at our hands, and our boot heels, and the edge of our knives. And the German will be sickened by us, and the German will talk about us, and the German will fear us. And when the German closes their eyes at night and they're tortured by their subconscious for the evil they have done, it will be with thoughts of us they are tortured with. Sound good? - Lt. Aldo Raine, Inglourious Basterds\n* You probably heard we ain't in the prisoner-takin' business; we in the killin' Nazi business. And cousin, Business is a-boomin'. - Lt. Aldo Raine, Inglourious Basterds",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Espionage",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Espionage",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Propaganda",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Propaganda"),
                    ":Sabotage",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Sabotage")
                  )
                )
              )
            ),
            "Browning MG Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Browning MG Team",
              ":image",
              "WWIIAmerican/Infantry_BrowningMGToken.png",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Sniper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Sniper",
              ":image",
              "WWIIAmerican/Infantry_USSniperToken.png",
              ":reference",
              "* WWII U.S. sniper training was very elementary and focused on being able to hit targets over long distances. There was almost no concern with the ability to blend into the environment. Training also varied from place to place, resulting in a wide range of qualities of snipers.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Platoon Sergeant",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Platoon Sergeant",
              ":image",
              "WWIIAmerican/Infantry_SergeantToken.png",
              ":reference",
              "* If you survive recruit training, you will be a weapon. You will be a minister of death praying for war. But until that day you are pukes. You are the lowest form of life on Earth. You are not even human, fucking beings. You are nothing but unorganized grabastic pieces of amphibian shit. Because I am hard you will not like me. But the more you hate me the more you will learn. I am hard but I am fair. There is no racial bigotry here. I do not look down on niggers, kikes, wops or greasers. Here you are all equally worthless. - Gunnery Sergeant Hartman, Full Metal Jacket\n* If your killer instincts are not clean and strong you will hesitate at the moment of truth. You will not kill. You will become dead marines and then you will be in a world of shit because marines are not allowed to die without permission. - Gunnery Sergeant Hartman, Full Metal Jacket\n* You don't say 'sir' to me, I'm a sergeant, I work for a living. - Sergeant Hulka, Stripes",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Leadership",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Leadership",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command"),
                    ":Rally",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Rally")
                  )
                )
              )
            ),
            "Bazooka Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Bazooka Team",
              ":image",
              "WWIIAmerican/Infantry_BazookaToken.png",
              ":reference",
              "* 1 out of 3 infantry squads were issued a bazooka.\n* The back blast of the weapon gave away the shooter's position.\n* Casualties among bazooka team members were extremely high, and assignment to such duty was regarded as nearly suicidal.",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Forward Observer",
              ":image",
              "WWIIAmerican/Infantry_ForwardObserverToken.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "M2 Mortar Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "M2 Mortar Team",
              ":image",
              "WWIIAmerican/Infantry_MortarToken.png",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Flamethrower",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Flamethrower",
              ":image",
              "WWIIAmerican/Infantry_FlamethrowerToken.png",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Medic",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Medic",
              ":image",
              "WWIIAmerican/Infantry_MedicToken.png",
              ":reference",
              "* Allied and German forces whereby soldiers would not knowingly fire at a medic treating a wounded comrade. This was in stark contrast to the Japanese forces, who regarded medics as primary targets, resulting in Allied medics removing or covering their insignia.",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "US Sapper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "US Sapper",
              ":image",
              "WWIIAmerican/Infantry_SapperToken.png",
              ":summary",
              "Combat Engineers from the US Army Corps of Engineers (USACE)",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                "Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "2"),
                "Demolitions",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Demolitions",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Mine Laying",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Mine Laying")
                  ),
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Demolition Pack",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Demolition Pack")
                  )
                )
              )
            )
          )
        ),
        "WWII American Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Sherman M4A1",
            nx_tactics_base.f_unit_from_tactics_key(tactics, "Sherman M4A1"),
            "Sherman Crab M4A4",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sherman Crab M4A4",
              ":image",
              "WWIIAmerican/TankMed_ShermanCrabToken.png",
              ":reference",
              "* Valuable during and after D-Day, especially as the Germans made extensive use of minefields to slow the Allied advance through France.",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":range",
              "193km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Mine Clearing",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Mine Clearing")
                  )
                )
              )
            ),
            "Sherman Calliope T34",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sherman Calliope T34",
              ":image",
              "WWIIAmerican/TankMed_T-34Calliope_M4Token.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":range",
              "193km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Sherman Easy Eight M4A3E8",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sherman Easy Eight M4A3E8",
              ":image",
              "WWIIAmerican/TankMed_M4A3E8_EasyEightToken.png",
              ":reference",
              "* The M4A3 was the first to be factory-produced with the new HVSS (horizontal volute spring suspension) suspension with wider tracks for lower ground pressure, and the smooth ride of the HVSS with its experimental E8 designation led to the nickname Easy Eight for Shermans so equipped.",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":range",
              "193km",
              ":speedland",
              "48kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Pershing M26",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Pershing M26",
              ":image",
              "WWIIAmerican/TankHvy_M26_PershingToken.png",
              ":reference",
              "* The Pershing reached the battlefield only in February 1945 and saw very little action in WWII.",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "41.7tons",
              ":length",
              "6.3m",
              ":range",
              "160km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "110mm", ":under", "25mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Lee M3",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Lee M3",
              ":image",
              "WWIIAmerican/TankMed_M3LeeToken.png",
              ":reference",
              "* By using the hull mount, the M3 design was brought to production quicker than if a proper turreted mount had been attempted. It was well understood that the M3 design was deeply flawed, but the need for tanks was urgent.",
              ":classification",
              "Med. Tank",
              ":crew",
              "7",
              ":mass",
              "24tons",
              ":length",
              "5.6m",
              ":range",
              "193km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "51mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Stuart M5",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Stuart M5",
              ":image",
              "WWIIAmerican/TankLt_M5A1_StuartToken.png",
              ":reference",
              "* The British were the first to use the Stuart in 1941 against Afrika Korps where they suffered high losses. Its gun was too weak and its turret poorly laid out. They did, however, like its high speed and reliability. The Soviets were less generous and turned down the Stuart in Lend-Lease.",
              ":classification",
              "Lt. Tank",
              ":crew",
              "5",
              ":mass",
              "14.7tons",
              ":length",
              "4.5m",
              ":range",
              "120km",
              ":speedland",
              "30kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "51mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Chaffee M24",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Chaffee M24",
              ":image",
              "WWIIAmerican/TankLt_M24ChaffeeToken.png",
              ":reference",
              "* The M24 was not up to the challenge of fighting German tanks, but the bigger gun at least gave its crews a chance to fight back when it was required. The M24's light armor made it vulnerable to virtually all of the German tanks, anti-tank guns, and hand-held anti-tank weapons. The contribution of the M24 to winning the war in Europe was insignificant, as they arrived too late and in too few numbers to replace the worn out M5s.",
              ":classification",
              "Lt. Tank",
              ":crew",
              "5",
              ":mass",
              "18.4tons",
              ":length",
              "5m",
              ":range",
              "161km",
              ":speedland",
              "56kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "25mm Sloped", ":over", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Wolverine M10",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Wolverine M10",
              ":image",
              "WWIIAmerican/TD_M10_WolverineToken.png",
              ":reference",
              "* M10s were used in the Pacific for infantry support but were unpopular due to their open-topped turrets, which made them more vulnerable than a fully-enclosed tank to Japanese close-in infantry attacks.\n* The turret was not powered and the crew was required to hand-crank the turret, taking approximately two minutes to rotate 360 degrees.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":length",
              "6m",
              ":range",
              "300km",
              ":speedland",
              "51kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "57mm", ":over", "0mm", ":under", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Hellcat M18",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hellcat M18",
              ":image",
              "WWIIAmerican/TD_M18_HellcatToken.png",
              ":reference",
              "* Recorded as the fastest tracked fighting vehicle of WWII.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "17.7tons",
              ":length",
              "5.3m",
              ":range",
              "168km",
              ":speedland",
              "88kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "25mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Jackson M36",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Jackson M36",
              ":image",
              "WWIIAmerican/TD_M36JacksonToken.png",
              ":reference",
              "* The M36 was well liked by its crews, being one of the few armored fighting vehicles available to US forces that could take out heavy German tanks from a distance.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "29tons",
              ":length",
              "7.5m",
              ":range",
              "240km",
              ":speedland",
              "42kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "108mm", ":over", "0mm", ":under", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Priest M7",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Priest M7",
              ":image",
              "WWIIAmerican/SPG_M7_PriestToken.png",
              ":reference",
              "* In U.S. service the M7 was a great success. Each U.S. armored division had three battalions of M7s, giving them unparalleled mobile artillery support.\n* A total of 3,490 M7s were built and they proved to be reliable weapons, continuing to see service in the U.S. and allied armies well past World War II.",
              ":classification",
              "Artillery",
              ":crew",
              "7",
              ":mass",
              "23tons",
              ":length",
              "6m",
              ":range",
              "193km",
              ":speedland",
              "39kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "51mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "57mm M1 Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "57mm M1 Artillery",
              ":image",
              "WWIIAmerican/Artillery_57mmM1Token.png",
              ":classification",
              "Artillery",
              ":crew",
              "6",
              ":mass",
              "1.1tons",
              ":length",
              "2.8m",
              ":speedland",
              "0kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "20mm", ":back", "0mm", ":over", "0mm", ":under", "0mm", ":side", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "90mm M2 Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "90mm M2 Artillery",
              ":image",
              "WWIIAmerican/Artillery_90mmM2Token.png",
              ":reference",
              "* They were the US's primary anti-aircraft guns from just prior to the opening of WWII into the 1950s when most AAA was replaced by missile systems.",
              ":classification",
              "Artillery",
              ":mass",
              "8.6tons",
              ":length",
              "4.7m",
              ":speedland",
              "0kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "20mm", ":back", "0mm", ":over", "0mm", ":under", "0mm", ":side", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "105mm M2A1 Howitzer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "105mm M2A1 Howitzer",
              ":image",
              "WWIIAmerican/Artillery_105mmM101HowitzerToken.png",
              ":classification",
              "Artillery",
              ":mass",
              "2.2tons",
              ":length",
              "6m",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":DUKW",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "DUKW",
              ":image",
              "WWIIAmerican/TroopCarrier_DUKWToken.png",
              ":reference",
              "* It was initially rejected by the armed services, but when a Coast Guard patrol craft ran aground on a sandbar near Provincetown, Massachusetts, an experimental DUKW happened to be in the area for a demonstration. Winds up to 110 kph, rain, and heavy surf prevented conventional craft from rescuing the seven stranded Coast Guardsmen, but the DUKW had no trouble, and the military opposition melted. The DUKW would later prove its seaworthiness by crossing the English Channel.",
              ":summary",
              "* Amphibious Transport\n* May carry 2.3 tons instead of passengers\n* Water Speed: 10kph, Water Range: 93km",
              ":titles",
              "Duck Boat, Old Magoo",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "1+12",
              ":mass",
              "6tons",
              ":height",
              "2.2m",
              ":length",
              "9.4m",
              ":range",
              "640km",
              ":speedwater",
              "80kph",
              ":width",
              "2.5m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "3mm", ":back", "3mm", ":over", "0mm", ":under", "0mm", ":side", "3mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Amphibious Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Amphibious Assault")
                  )
                )
              )
            ),
            "LVT-4 Water Buffalo",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "LVT-4 Water Buffalo",
              ":image",
              "WWIIAmerican/TroopCarrier_LVT-4Token.png",
              ":reference",
              "* Production continued throughout the war, resulting in 18,621 LVTs delivered",
              ":summary",
              "* Amphibious Transport",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "3+30",
              ":mass",
              "16.5tons",
              ":range",
              "240km (80km water)",
              ":speedland",
              "32kph",
              ":speedwater",
              "12kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Amphibious Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Amphibious Assault")
                  )
                )
              )
            ),
            "M3A1 Half-track",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "M3A1 Half-track",
              ":image",
              "WWIIAmerican/HalfTrack_M3Token.png",
              ":classification",
              "Med. Vehicle",
              ":crew",
              "3+10",
              ":mass",
              "9.3tons",
              ":length",
              "6.2m",
              ":range",
              "280km",
              ":speedland",
              "64kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "12mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "M3 Scout Car",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "M3 Scout Car",
              ":image",
              "WWIIAmerican/Car_M3ScoutCarToken.png",
              ":reference",
              "Lend Lease from US",
              ":classification",
              "Car",
              ":crew",
              "1+7",
              ":mass",
              "5.7tons",
              ":length",
              "5.6m",
              ":range",
              "403km",
              ":speedland",
              "81kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Willys MB/Ford GPW Jeep",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Willys MB/Ford GPW Jeep",
              ":image",
              "WWIIAmerican/Truck_M151_Mutt_JeepToken.png",
              ":reference",
              "* 'Jeep' originated from a term used by soldiers for any untried or untested piece of personnel or equipment.\n* From humble origins - a handful of prototypes built by three different manufacturers - the Jeep 1/4-ton utility vehicle has evolved over the years into one of the most popular and versatile vehicles ever made.\n* The hero of WWII served in every theater of war, in every conceivable role, and with every Allied army.",
              ":classification",
              "Car",
              ":crew",
              "1+3",
              ":mass",
              "1ton",
              ":height",
              "1.8m",
              ":length",
              "3.3m",
              ":speedland",
              "100kph",
              ":width",
              "1.6m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "5mm", ":over", "0mm", ":side", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "GMC CCKW 2 1/2 Ton Truck",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "GMC CCKW 2 1/2 Ton Truck",
              ":image",
              "WWIIAmerican/Truck_CCKWToken.png",
              ":reference",
              "* 562,000 produced",
              ":classification",
              "Truck",
              ":crew",
              "1+20",
              ":mass",
              "5tons",
              ":length",
              "4m",
              ":range",
              "400mi",
              ":speedland",
              "90kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "5mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Medical Truck",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Medical Truck",
              ":image",
              "WWIIAmerican/Truck_DWC-54_MedicToken.png",
              ":classification",
              "Truck",
              ":crew",
              "1+5",
              ":mass",
              "5tons",
              ":length",
              "4m",
              ":range",
              "400mi",
              ":speedland",
              "90kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "5mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        "WWII American Aircraft",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "F4F Wildcat",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "F4F Wildcat",
              ":image",
              "WWIIAmerican/Fighter_F4F_WildcatToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.6tons",
              ":length",
              "8.8m",
              ":range",
              "1240km",
              ":speedair",
              "515kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "SBD Dauntless",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SBD Dauntless",
              ":image",
              "WWIIAmerican/DiveBomber_Douglas_SBDToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "2",
              ":mass",
              "4.8tons",
              ":length",
              "10m",
              ":range",
              "1240km",
              ":speedair",
              "410kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "F-4U Corsair",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "F-4U Corsair",
              ":image",
              "WWIIAmerican/Fighter_F-4UCorsairToken.png",
              ":reference",
              "* The Corsair quickly became the most capable carrier-based fighter-bomber of World War II.\n* The F4U could out-perform a Zero in every aspect except slow speed manoeuvrability and slow speed rate of climb.\n* It dropped 70% of total bombs dropped by fighters during the war.\n* It had a 12:1 kill ratio against all Japanese planes.\n* A pilot over Okinawa was in pursuit of a Ki-45 fighter at extremely high altitude when his guns jammed due to the extreme cold. He simply flew up and chopped off the Ki-45's tail with the big propeller of the Corsair. Despite missing five inches off the end of his propeller blades, he managed to land safely.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "6.3tons",
              ":height",
              "5m",
              ":length",
              "10m",
              ":range",
              "1633km",
              ":speedair",
              "684kph",
              ":width",
              "12.5m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "P-35 Seversky",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-35 Seversky",
              ":image",
              "WWIIAmerican/Fighter_P-35SeverskyToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "2.7tons",
              ":height",
              "3m",
              ":length",
              "8.2m",
              ":range",
              "1530km",
              ":speedair",
              "496kph",
              ":width",
              "11m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "P-38 Lightning",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-38 Lightning",
              ":image",
              "WWIIAmerican/Fighter_P-38LightningToken.png",
              ":reference",
              "* In the South West Pacific theater, the P-38 was the primary long-range fighter of United States Army Air Forces until the appearance of large numbers of P-51D Mustangs toward the end of the war. The P-38 was probably the quietest fighter in history. It was extremely forgiving, and could be mishandled in many ways, but the rate of roll was too slow for it to excel as a dogfighter. The P-38 was the only American fighter aircraft in production throughout American involvement in the war.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "7.9tons",
              ":height",
              "4m",
              ":length",
              "11.5m",
              ":range",
              "1770km",
              ":speedair",
              "712kph",
              ":width",
              "16m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "P-40E Curtiss Warhawk",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-40E Curtiss Warhawk",
              ":image",
              "WWIIAmerican/Fighter_P-40_WarhawkToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.7tons",
              ":length",
              "11.4m",
              ":range",
              "1100km",
              ":speedair",
              "580kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "P-40 Flying Tigers",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-40 Flying Tigers",
              ":image",
              "WWIIAmerican/Fighter_P-40_ChineseFlyingTigersToken.png",
              ":reference",
              "* According to their own count, the Flying Tigers shot down 286 aircraft for the loss of up to 19 pilots.",
              ":summary",
              "Volunteer American fighters in China",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.7tons",
              ":length",
              "11.4m",
              ":range",
              "1100km",
              ":speedair",
              "580kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "P-47 Thunderbolt",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-47 Thunderbolt",
              ":image",
              "WWIIAmerican/Fighter_P-47ThunderboltToken.png",
              ":reference",
              "* It had armor around the engine and the cockpit, which enabled it to withstand considerable damage. This was one of the characteristics which allowed Allied pilots in Asia and the Pacific to attack Japanese fighters head on.\n* Aka the Jug, was the largest single-engined fighter of its day, and a vast improvement over the Curtiss P-40 Warhawk. The P-47 was effective in air combat but proved especially adept at ground attack. Some British assumed Jug was short for Juggernaut and began using the longer nickname.\n* The Thunderbolt ended the war with 3,752 air-to-air kills in over 746,000 sorties, at the cost of 3,499 P-47s to all causes.\n* In Europe, the Thunderbolt flew more sorties than P-51s, P-38s and P-40s combined.\n* By the end of the war, the 56th FG was the only unit still flying the P-47, by preference, instead of the P-51.\n* Despite being the sole remaining P-47 group, the 56th FG remained its top-scoring group in aerial victories throughout the war.\n* A modern-day counterpart in that role, the A-10 Thunderbolt II, takes its name from the P-47.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "8tons",
              ":range",
              "1290km",
              ":speedair",
              "697kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "P-51 Mustang",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-51 Mustang",
              ":image",
              "WWIIAmerican/Fighter_P-51Mustang_FrenesiToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "4.2tons",
              ":height",
              "4.2m",
              ":length",
              "10m",
              ":range",
              "2755km",
              ":speedair",
              "703kph",
              ":width",
              "11.3m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "PBY Catalina",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "PBY Catalina",
              ":image",
              "WWIIAmerican/Recon_Catalina_PBYToken.png",
              ":reference",
              "* It was one of the most widely used multi-role aircraft of World War II. PBYs were used in anti-submarine warfare, patrol bombing, convoy escorts, search and rescue missions (especially air-sea rescue), and cargo transport.\n* The PBY was the most successful aircraft of its kind; no other flying boat was produced in greater numbers. The last active military PBYs were not retired from service until the 1980s. Even today the aircraft continues to fly as an airtanker in aerial firefighting operations all over the world.",
              ":summary",
              "* Bombs could be substituted for depth charges or torpedoes",
              ":classification",
              "Med. Aircraft",
              ":crew",
              "8",
              ":mass",
              "16tons",
              ":height",
              "6m",
              ":length",
              "19.5m",
              ":range",
              "4030km",
              ":speedair",
              "314kph",
              ":width",
              "32m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "B-17 Flying Fortress",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "B-17 Flying Fortress",
              ":image",
              "WWIIAmerican/Bomber_B-17F_FlyingFortressToken.png",
              ":reference",
              "* A potent, high-flying, long-ranging bomber capable of unleashing great destruction yet able to defend itself. With the ability to return home despite extensive battle damage, its durability, especially in belly-landings and ditchings, quickly took on mythic proportions.",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "10",
              ":mass",
              "24.5tons",
              ":height",
              "5.8m",
              ":length",
              "22.6m",
              ":range",
              "3219km",
              ":speedair",
              "462kph",
              ":width",
              "31.6m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "B-24 Liberator",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "B-24 Liberator",
              ":image",
              "WWIIAmerican/Bomber_B-24J_LiberatorToken.png",
              ":reference",
              "* Produced in greater numbers than any other American combat aircraft of WWII and still holds the record as the most produced U.S. military aircraft.",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "8",
              ":mass",
              "25tons",
              ":height",
              "5.5m",
              ":length",
              "20.6m",
              ":range",
              "3400km",
              ":speedair",
              "470kph",
              ":width",
              "33.5m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "B-29 Superfortress",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "B-29 Superfortress",
              ":image",
              "WWIIAmerican/Bomber_B-29_SuperfortressToken.png",
              ":reference",
              "* A very advanced bomber for this time period, it included features such as a pressurized cabin, an electronic fire-control system, and remote-controlled machine-gun turrets.\n* It was the primary aircraft in the American firebombing campaign against the Empire of Japan, and carried the atomic bombs that destroyed Hiroshima and Nagasaki. Unlike many other WWII-era bombers, the B-29 remained in service long after the war ended",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "11",
              ":mass",
              "54tons",
              ":height",
              "8.5m",
              ":length",
              "30.2m",
              ":range",
              "5230km",
              ":speedair",
              "574kph",
              ":width",
              "43m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        "WWII American Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Naval Vessels",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Yorktown Class Carrier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yorktown Class Carrier",
              ":image",
              "WWIIAmerican/Carrier_Yorktown.png",
              ":titles",
              "Enterprise, Hornet, Yorktown",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "2200",
              ":mass",
              "20ktons",
              ":length",
              "230m",
              ":range",
              "23200km",
              ":speedwater",
              "60kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "100mm", ":over", "40mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "New Orleans Class Cruiser",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "New Orleans Class Cruiser",
              ":image",
              "WWIIAmerican/Ship_CruiserToken.png",
              ":reference",
              "* The New Orleans took one Long-Lance Torpedo which severed 150ft of her bow. Magnificent damage control work and skillful seamanship kept it afloat. New Orleans class cruisers would be found at every major naval skirmish of WWII despite the fact there were only four units remaining after 1942. They were some of the most used and hardest fought ships on the US Navy during the war. They would have three of the top four most decorated ships in the US Navy in World War II.",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "708",
              ":mass",
              "10ktons",
              ":length",
              "180m",
              ":range",
              "26000km",
              ":speedwater",
              "61kph",
              ":width",
              "19m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "125mm", ":back", "125mm", ":over", "55mm", ":under", "125mm", ":side", "125mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Atlanta Class Cruiser",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Atlanta Class Cruiser",
              ":reference",
              "* Designed originally as flotilla leaders but which ended up gaining recognition as effective anti-aircraft cruisers.",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "673",
              ":mass",
              "8.2ktons",
              ":length",
              "165m",
              ":speedwater",
              "62kph",
              ":width",
              "16m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "55mm", ":back", "55mm", ":over", "32mm", ":under", "55mm", ":side", "85mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Gleaves Class Destroyer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Gleaves Class Destroyer",
              ":image",
              "WWIIAmerican/Ship_DestroyerToken.png",
              ":reference",
              "* The Gleaves was the production destroyer of the US Navy when it entered WWII. They are extremely similar to the Benson class destroyers and were often referred to as the BENSON/GLEAVES class.\n* The 1954 movie The Caine Mutiny was filmed on the Gleaves Destroyer USS Doyle.",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "276",
              ":mass",
              "1.6ktons",
              ":length",
              "106m",
              ":range",
              "12000km",
              ":speedwater",
              "69kph",
              ":width",
              "11m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Iowa Class Battleship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Iowa Class Battleship", ":classification", "Hvy. Naval Vessel"),
            "LCVP Higgins Boat",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "LCVP Higgins Boat", ":image", "WWIIAmerican/LandingCraft_LCM3Token.png", ":reference", "* Andrew Higgins ... is the man who won the war for us. ... If Higgins had not designed and built those LCVPs, we never could have landed over an open beach. The whole strategy of the war would have been different. - General Dwight Eisenhower", ":summary", "* Landing Craft Vehicle Personnel\n* Constructed of plywood, can ferry 36 men or even a Jeep", ":classification", "Lt. Naval Vessel"),
            "Elco Class PT Boat",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Elco Class PT Boat",
              ":image",
              "WWIIAmerican/Ship_PTBoatToken.png",
              ":reference",
              "* A small, fast torpedo boat used to attack larger surface ships. The PT boat squadrons were nicknamed 'the mosquito fleet.'  The Japanese called them 'Devil Boats.'\n* After the war, PT-109 became famous as the ship John F. Kennedy commanded.\n* Though often said to be made of plywood, they were actually made of two layers of 1 inch thick mahogany.",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "17",
              ":mass",
              "38tons",
              ":length",
              "24m",
              ":speedwater",
              "76kph",
              ":width",
              "6m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":under", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Crater Class Transport",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Crater Class Transport",
              ":image",
              "WWIIAmerican/Ship_TransportToken.png",
              ":summary",
              "* Length: 441.5'\n* Beam: 57'\n* Draft: 30'\n* Speed: 11.5 knots\n* Armament:\n1 x 3 inch/50 DP\n2 x 40mm",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "206",
              ":mass",
              "11.5ktons",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "2")
              )
            )
          )
        ),
        "WWII American Strategic Forces",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII American Strategic Forces",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "WWII American Light Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "WWII American Light Infantry", ":summary", "* 50% SMG (-1), 25% M1 (-2), 25% Bazooka (-2)", ":classification", "Lt. Infantry"),
            "WWII American Med. Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "WWII American Med. Infantry", ":summary", "* 50% M1 (-1), 25% Bazooka (-2), 25% MG (-2)", ":classification", "Med. Infantry"),
            "WWII American Heavy Infantry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "WWII American Heavy Infantry", ":summary", "* 50% MG (-1), 50% Bazooka (-1)", ":classification", "Hvy. Infantry")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_british_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_british_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_british_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_british_equipment
  }

  // (func chapter_wwii_british_equipment)
  static f_chapter_wwii_british_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII British Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII British Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII British Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ".38 Enfield MkII Revolver",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".38 Enfield MkII Revolver", ":classification", "Pistol"),
            "9mm Sten SMG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Sten SMG", ":image", "WWIIBritish/SMG_Sten.jpg", ":classification", "Lt. MG", ":modifiers", "Auto"),
            ".303 Lee-Enfield SMLE Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".303 Lee-Enfield SMLE Rifle", ":image", "WWIIBritish/SMLE_Mk_III.jpg", ":reference", "* The current world record for aimed bolt-action fire was set in 1914 placing 38 rounds into a 12 inch wide target at 300 yards in one minute.", ":titles", "Short Magazine Lee Enfield (SMLE)", ":classification", "Rifle"),
            ".303 Lee-Enfield No 4 Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".303 Lee-Enfield No 4 Rifle", ":reference", "* Mass production version of earlier .303 Lee-Enfield rifles.", ":classification", "Rifle"),
            "Flamethrower Portable No2",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flamethrower Portable No2", ":classification", "Flamethrower", ":mass", "29kg", ":modifiers", "Fire, Auto", ":range", "25m"),
            ".303 Bren Light MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".303 Bren Light MG", ":summary", "* Clip-fed, air-cooled .303 cal (7.7mm) machine gun", ":classification", "Lt. MG", ":crew", "2", ":modifiers", "Auto", ":rof", "500/min", ":rounds", "30"),
            ".303 Vickers MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".303 Vickers MG", ":reference", "* In one action, ten Vickers guns fired continuously for twelve hours. They fired a million rounds between them, using 100 new barrels, without a single breakdown. It was this absolute foolproof reliability which endeared the Vickers to every British soldier who ever fired one.", ":summary", "* Belt-fed, water-cooled .303 cal (7.7mm) machine gun. Required 6-8 men to operate.", ":classification", "Hvy. MG", ":crew", "6", ":modifiers", "Auto"),
            "7.92mm Besa MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.92mm Besa MG", ":summary", "* Belt-fed, air-cooled 7.92mm machine gun", ":classification", "Hvy. MG", ":modifiers", "Auto", ":rof", "500/min"),
            ":PIAT",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "PIAT", ":image", "WWIIBritish/Rocket_PIAT.jpg", ":summary", "* HEAT Rocket\n* Penetrate 75mm at 30 degrees or 102mm at 90 degrees.\n* The PIAT was an unusual infantry anti-tank weapon. It was comparatively quiet and smokeless, with no backblast.\n* Unlike the American bazooka or German Panzerfaust and Panzerschreck, it could be fired from an enclosed space, and would not give away its position as soon as the weapon was fired. However, it was more cumbersome than its counterparts, violent to fire, and in many circumstances it could be difficult to reload.\n* An attachment that allowed the PIAT to fire 2 inch mortar shells was produced in limited numbers.", ":classification", "Missile", ":length", ".99m", ":mass", "15kg", ":modifiers", "HEAT", ":range", "100m"),
            "40mm QF 2 Pounder Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm QF 2 Pounder Cannon", ":classification", "Cannon", ":modifiers", "AP"),
            "57mm QF 6 Pounder Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "57mm QF 6 Pounder Cannon", ":reference", "* Although 17 Pounder guns were rushed to North Africa to combat the Tiger tank, it was in fact a 6-pdr, which claimed the first Tiger 'kill'", ":classification", "Cannon", ":modifiers", "AP", ":range", "4600m"),
            "75mm QF Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm QF Cannon", ":classification", "Cannon", ":modifiers", "AP"),
            "76mm QF 17 Pounder Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "76mm QF 17 Pounder Cannon", ":image", "WWIIBritish/Artillery_17pdr.gif", ":reference", "76.2mm Cannon penetrates 115mm at 1000m", ":classification", "Cannon", ":modifiers", "AP", ":muzzlevelocity", "883m/s"),
            "77mm HV Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "77mm HV Cannon", ":summary", "* The 77mm HV was based on the 17-pounder. It had a lower muzzle velocity than the 17-pounder, but the ammunition was much more compact and more easily stored and handled within the confines of a tank.", ":classification", "Cannon", ":modifiers", "AP"),
            "Mills Bomb Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mills Bomb Grenade", ":reference", "* The Mills was a defensive grenade: after throwing the user had to take cover immediately. A competent thrower could manage 30m with reasonable accuracy, but the grenade could throw lethal fragments further than this.\n* The 36M remained in service in some parts of the world such as India and Pakistan where it was manufactured until the early 1980s. That the Mills bomb remained in use for so many years says much about its effectiveness.", ":classification", "Bomb", ":length", ".09m", ":mass", ".76kg", ":modifiers", "Anti-Personnel", ":range", "30m"),
            "No 74 Sticky Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "No 74 Sticky Bomb", ":image", "WWIIBritish/Grenade_StickyBomb.jpg", ":reference", "* While practicing a bomber got his bomb stuck to his trouser leg. A quick thinking mate whipped the trousers off and got rid of them and the bomb. The trousers were in a bit of a mess after though I think they were a bit of a mess prior to the explosion.\n* Even when not used, the glass was easily cracked in transit. The filling, nitroglycerin, was sensitive to shock too. Consequently, although possibly effective, the sticky bomb was never popular.\n* In the movie Saving Private Ryan, Tom Hanks' character uses improvised sticky bombs against Tiger I heavy tanks,", ":classification", "Bomb", ":explosive", ".6", ":length", ".24m", ":mass", "1kg", ":modifiers", "HE", ":range", "20m"),
            "No 82 Gammon Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "No 82 Gammon Bomb", ":reference", "* Developed as a replacement for the temperamental and highly dangerous sticky bomb grenade.\n* Unlike conventional grenades, it was flexible in the amount and type of munition. For anti-personnel use, a small amount of plastic explosive, along with shrapnel-like projectiles if available, would be placed in the bag. Against armored targets, the bag could be filled completely with explosive.\n* The bag would be flung and the detonator would fire on impact.\n* Gammon bombs were primarily issued to special forces such as paratroopers who were issued plastic explosive routinely. These units found the Gammon bomb to be particularly useful due to its small size and weight when unfilled, as well as its adaptability.", ":classification", "Bomb", ":explosive", ".9", ":mass", "1.2kg", ":modifiers", "AP", ":range", "20m"),
            "60lb RP-3 Rockets",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "60lb RP-3 Rockets", ":classification", "Missile", ":explosive", "28kg", ":length", "1.4m", ":mass", "21kg", ":modifiers", "AP, HE", ":range", "1.6km", ":speedair", "1900kph"),
            "4000lb Blockbuster Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "4000lb Blockbuster Bomb", ":summary", "* The term Blockbuster (aka Cookie) was originally a name coined by the press and referred to a bomb which had enough explosive power to destroy an entire city block. The High Capacity design was a cylinder full of explosives, unaerodynamic, and without find. Accuracy was not important, however, as these bombs were designed for blowing the tiles off the roofs of buildings so that the smaller 4 lb incendiary bombs could reach the building interiors. These bombs were only used by the RAF, being too big to fit in the bomb bays of other countries aircraft. In addition to the 4000lb version there were also 8000lb and 12000lb versions constructed from multiple 4000lb sections.", ":classification", "Bomb", ":explosive", "1360kg", ":mass", "1800kg"),
            "Earthquake Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Earthquake Bomb", ":reference", "* In an attack on the U-boat pens at Farge two Grand Slams went through the 15 ft (4.5 m) reinforced concrete hardening - equalling or exceeding the best current penetration specifications.", ":summary", "* The Earthquake bombs were designed not to strike a target directly, but to impact beside it, penetrate under it, and create a 'camouflet' or large buried cavern at the same time as delivering a shock wave through the target's foundations. The target then collapses into the hole, no matter how hardened it may be. The bombs had strong casings because they needed to travel through rock rather than reinforced concrete, though they could perform equally well against hardened surfaces.", ":titles", "Grand Slam", ":classification", "Bomb", ":mass", "10tons")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_british_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_british_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_british_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_british_units
  }

  // (func chapter_wwii_british_units)
  static f_chapter_wwii_british_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII British Units",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII British Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII British Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Commonwealth Rifle Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Commonwealth Rifle Team",
              ":summary",
              "* Composed of 5 riflemen",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "Commonwealth LMG Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Commonwealth LMG Team",
              ":image",
              "WWIIBritish/Infantry_BrenLMGToken.png",
              ":summary",
              "* Composed of 3 riflemen, 1 LMG, and the squad leader",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "British Commando",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "British Commando",
              ":image",
              "WWIIBritish/Infantry_CommandoToken.png",
              ":reference",
              "* The British Commandos were first formed by the Army in June 1940 as a raider force employing unconventional and irregular tactics to assault, disrupt and reconnoiter.\n* The Commandos were formed and operated in secrecy and produced a demoralizing effect on German forces while achieving celebrity status among the British public, comparable with that attached to fighter pilots and shrouded in myth.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "5")
              )
            ),
            "Vickers Machine Gun Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Vickers Machine Gun Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Special Operations Executive",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Special Operations Executive", ":reference", "* Bakers Street Irregulars\n* Group to conduct warfare without direct military engagement"),
            "PIAT Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "PIAT Team",
              ":image",
              "WWIIBritish/Infantry_PIATGunner.png",
              ":reference",
              "* Though unreliable and unpopular it remained the primary infantry anti-tank weapon until 1950.\n* In one of the most remarkable examples of bravery under fire, Major Robert Henry Cain  earned the Victoria Cross during Operation Market Garden. Using a PIAT (in addition to several other weapons) he destroyed or disabled six tanks, four of which were Tiger tanks, as well as a number of self-propelled guns.",
              ":summary",
              "* Hvy. Anti-Tank Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "British Sniper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "British Sniper",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "SAS Parachute Regiment",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SAS Parachute Regiment",
              ":image",
              "WWIIBritish/Infantry_Airborne.png",
              ":reference",
              "* It is considered an elite unit by virtue of its stringent selection process, rigorous training program and by the requirement of its role to operate with minimal or no support behind enemy lines and against numerically superior forces.",
              ":titles",
              "Special Air Service (SAS)",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "5",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Airborne Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Airborne Assault")
                  ),
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "No 82 Gammon Bomb",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "No 82 Gammon Bomb")
                  )
                )
              )
            ),
            "British Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "British Forward Observer",
              ":image",
              "WWIIBritish/Infantry_ForwardObserverToken.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "British Mortar Team",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "British Mortar Team", ":image", "WWIIBritish/Infantry_MortarToken.png", ":classification", "Hvy. Infantry"),
            "Gideon Force",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gideon Force", ":reference", "* To raise a revolt you must send in a Corps d'Elite to do exploits and not just as peddlers of war material and cash ... A thousand resolute and well-armed men can paralyse 10,000", ":summary", "Ethopian irregulars specializing in Guerilla warfare."),
            "Combat Medical Techinician",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Combat Medical Techinician", ":classification", "Med. Infantry"),
            "Royal Engineers",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Royal Engineers", ":image", "WWIIBritish/Infantry_CanadianSapperToken.png", ":classification", "Med. Infantry")
          )
        ),
        "WWII British Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII British Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Churchill A22F MkVII",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Churchill A22F MkVII",
              ":image",
              "WWIIBritish/TankHvy_ChurchillMkVIIToken.png",
              ":reference",
              "* Five Mk III's, known collectively as 'King Force' were heavily shelled by German anti-tank guns, all but one Mk III made it back with little damage, one tank was said to have been struck up to 80 times.\n* Despite its many failures, the Churchill had a significant advantage that was apparent throughout its career. It could cross terrain obstacles that most other tanks of its era could not",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "38.5tons",
              ":length",
              "7.3m",
              ":range",
              "90km",
              ":speedland",
              "20kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "152mm", ":under", "16mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Churchill Crocodile",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Churchill Crocodile",
              ":image",
              "WWIIBritish/TankHvy_ChurchillCrocToken.png",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "38.5tons",
              ":length",
              "7.3m",
              ":range",
              "90km",
              ":speedland",
              "20kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "152mm", ":under", "16mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Comet A34",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Comet A34",
              ":image",
              "WWIIBritish/TankMed_CometToken.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "33.5tons",
              ":length",
              "6.6m",
              ":range",
              "250km",
              ":speedland",
              "50kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "102mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Cromwell A27M",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cromwell A27M",
              ":image",
              "WWIIBritish/TankMed_CromwellToken.png",
              ":reference",
              "* The fastest British tank to serve in the Second World War.",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "28tons",
              ":length",
              "6.3m",
              ":range",
              "280km",
              ":speedland",
              "51kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "76mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Matilda A12",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Matilda A12",
              ":image",
              "WWIIBritish/TankLt_MkIIMatildaToken.png",
              ":reference",
              "* Queen of the Desert\n* Average speed only about 9.5 km/h.\n* The heavy armor of the Matilda's cast turret became legendary.",
              ":classification",
              "Med. Tank",
              ":crew",
              "4",
              ":mass",
              "27tons",
              ":length",
              "6m",
              ":range",
              "257km",
              ":speedland",
              "24kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "78mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Sherman Firefly",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sherman Firefly",
              ":image",
              "WWIIBritish/TankMed_M4FireflyToken.png",
              ":reference",
              "* One major disadvantage of the Sherman Firefly during its first few months in service was its lack of an effective High Explosive shell.",
              ":classification",
              "Med. Tank",
              ":crew",
              "4",
              ":mass",
              "36tons",
              ":range",
              "193km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "M3 Grant",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "M3 Grant",
              ":image",
              "WWIIBritish/TankMed_M3GrantToken.png",
              ":reference",
              "* The British ordered the M3 when they were refused permission to have their tank designs made in American factories. They were unhappy with the tall profile and had their own turret fitted—lower in profile.",
              ":classification",
              "Med. Tank",
              ":crew",
              "6",
              ":mass",
              "24tons",
              ":length",
              "5.6m",
              ":range",
              "193km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "51mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Valentine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Valentine",
              ":image",
              "WWIIBritish/TankLt_ValentineToken.png",
              ":reference",
              "Most Produced British Tank",
              ":classification",
              "Lt. Tank",
              ":crew",
              "4",
              ":mass",
              "16.5tons",
              ":length",
              "5.4m",
              ":range",
              "145km",
              ":speedland",
              "24kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm", ":under", "8mm", ":side", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Crusader A15",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Crusader A15",
              ":image",
              "WWIIBritish/TankLt_CrusaderlToken.png",
              ":reference",
              "* Perhaps the most important British tank of the North African Campaign.\n* Although the Crusader was faster than any tanks it opposed, its potential was limited by a relatively light QF 2-pounder gun, thin armor and mechanical problems.",
              ":classification",
              "Lt. Tank",
              ":crew",
              "5",
              ":mass",
              "20tons",
              ":length",
              "6m",
              ":range",
              "322km",
              ":speedland",
              "42kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "51mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Archer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Archer",
              ":image",
              "WWIIBritish/TD_ArcherToken.png",
              ":reference",
              "* The rear mounting at first seemed like a liability, but it was soon made into an advantage. Combined with its low silhouette, the Archer made an excellent ambush weapon, allowing its crew to fire off a few shots, then drive away without wasting time turning around.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "4",
              ":mass",
              "15tons",
              ":length",
              "6.7m",
              ":range",
              "140km",
              ":speedland",
              "32kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "60mm", ":over", "0mm", ":under", "14mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "17pdr SP Achilles",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "17pdr SP Achilles",
              ":image",
              "WWIIBritish/TD_AchillesToken.png",
              ":reference",
              "* An upgunned version of the M10 Wolverine.\n* The turret was not powered and the crew was required to hand-crank the turret, taking approximately two minutes to rotate 360 degrees.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":length",
              "6m",
              ":range",
              "300km",
              ":speedland",
              "51kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "57mm", ":under", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "17pdr Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "17pdr Artillery",
              ":image",
              "WWIIBritish/Artillery_17pdrToken.png",
              ":classification",
              "Artillery",
              ":mass",
              "3tons",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Humber Mk IV",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Humber Mk IV",
              ":image",
              "WWIIBritish/Car_HumberToken.png",
              ":classification",
              "Med. Vehicle",
              ":crew",
              "3",
              ":mass",
              "7tons",
              ":length",
              "4.6m",
              ":range",
              "400km",
              ":speedland",
              "72kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "15mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Chevy LRDG",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Chevy LRDG",
              ":image",
              "WWIIBritish/Car_PatrolVehicleChevyLRDGToken.png",
              ":reference",
              "* During the Desert Campaign of 1940 to 1943 the Long Range Desert Group (LRDG) invariably operated hundreds of miles behind enemy lines; although its chief function was reconnaissance and intelligence gathering, units of the LRDG did carry out some hard-hitting strike operations,\n* The Rat Patrol - 1960s TV Series",
              ":classification",
              "Truck",
              ":mass",
              "1.5tons",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        "WWII British Aircraft",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII British Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Supermarine Spitfire",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Supermarine Spitfire",
              ":image",
              "WWIIBritish/Fighter_SpitfireToken.png",
              ":reference",
              "One of the most outstanding fighter aircraft of WWII",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3tons",
              ":length",
              "9m",
              ":range",
              "760km",
              ":speedair",
              "605kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Hawker Hurricane",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hawker Hurricane",
              ":image",
              "WWIIBritish/Fighter_HurricaneToken.png",
              ":reference",
              "* Although largely overshadowed by the Supermarine Spitfire, the aircraft became renowned during the Battle of Britain.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.4tons",
              ":length",
              "9.8m",
              ":range",
              "965",
              ":speedair",
              "547kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Hawker Tempest",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hawker Tempest",
              ":image",
              "WWIIBritish/Fighter_TempestToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "5.2tons",
              ":length",
              "10.2m",
              ":range",
              "1190km",
              ":speedair",
              "695kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "P-40 Curtiss Tomahawk",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-40 Curtiss Tomahawk",
              ":image",
              "WWIIBritish/Fighter_TomahawkToken.png",
              ":reference",
              "* 46 British pilots reached ace status in P-40s. Caldwell scored 22 of his 28.5 victories in P-40s in North Africa. He is the prime example of a pilot using the strengths of the P-40 to its utmost. Once while flying alone, he was attacked by two Bf 109s, one of them piloted by Schruer. Although Caldwell was wounded three times, and his Tomahawk was hit by more than 100 7.9 mm bullets and five 20 mm cannon shells, he survived the encounter and shot down Schruer's wingman.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.7tons",
              ":length",
              "11.4m",
              ":range",
              "1100km",
              ":speedair",
              "580kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Lancaster",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Lancaster",
              ":image",
              "WWIIBritish/Bomber_LancasterToken.png",
              ":reference",
              "* The most famous and most successful of the Second World War night bombers, delivering 608,612 tons of bombs in 156,000 sorties.",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "7",
              ":mass",
              "29tons",
              ":length",
              "21m",
              ":range",
              "4600mi",
              ":speedair",
              "450kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Fairey Swordfish",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Fairey Swordfish",
              ":image",
              "WWIIBritish/TorpedoBomberFaireySwordfishToken.png",
              ":reference",
              "Famous for crippling the Bismarck",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "3",
              ":mass",
              "3.5tons",
              ":length",
              "10.8m",
              ":range",
              "879km",
              ":speedair",
              "224kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "3mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        "WWII British Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII British Naval Vessels",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "British Destroyer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "British Destroyer", ":classification", "Med. Naval Vessel"),
            "HMS Hood Battlecruiser",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "HMS Hood Battlecruiser", ":summary", "Armament: 8 x 15in (381mm) (4x2),\n14 x 4in (102mm) (7x2)\n24 x 2-pdr pom pom (40mm) (3x8)\n20 x 0.5in (12.7mm) (5x4) guns\n5 x 20 barrel Unrotated Projectile mounts\n4 x 21in (533mm) torpedo tubes, above water", ":classification", "Hvy. Naval Vessel", ":crew", "1418", ":range", "10000km", ":speedwater", "54kph"),
            "King George V Class Battleship",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "King George V Class Battleship", ":summary", "Speed: 28.0 knots (1941 trials) Range: 5400+nm at 18knots (11.9 tons/hour fuel burn)\nArmament: 10 x 14inch (356mm) mk VII guns\n16 x 5.25inch (133mm) guns\n64 x 2pounder pom-pom (40mm) Armour: Main belt: 14.7in (374mm)\nlower belt: 5.4in (137mm)\nAircraft carried: 4 Supermarine Walrus seaplanes, 1 double-ended catapult", ":crew", "1500"),
            "HMS Ark Royal Carrier",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "HMS Ark Royal Carrier", ":summary", "Armament: 16 x 4.5 inch (114 mm) guns (8 x 2)\n48 x 2 pounder (1.5 in) Pom-poms (6 x 8)\n32 x .50 calibre (12.7 mm) machine guns (8 x 4) Armour: 4.5 inches (110 mm) belt\n3.5 in (89mm) deck over boiler rooms and magazines\nAircraft carried: 36 Fairey Swordfish, 18 Fairey Fulmars", ":crew", "1600", ":range", "14100km", ":speedwater", "57kph")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_east_african_theatre
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_east_african_theatre = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_east_african_theatre = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_east_african_theatre
  }

  // (func chapter_wwii_east_african_theatre)
  static f_chapter_wwii_east_african_theatre(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII East African Theatre",
      ":summary",
      "* The battles of this campaign were fought between the forces of the British Empire, the British Commonwealth of Nations, and the forces of the Italian Empire.\n* The Commonwealth forces included troops from the Sudan, British Somaliland, British East Africa, the Indian Empire, South Africa, Northern Rhodesia, Southern Rhodesia, Nyasaland, and British West Africa (Nigeria, Gold Coast, Sierra Leone, and the Gambia). There was even a small commando unit from the British Mandate of Palestine. In addition to the British and Commonwealth forces, there were Ethiopian irregular forces, Free French forces, and Free Belgian forces.\n* In November 1940, the British and Commonwealth forces received an incredible intelligence advantage. The government code and cypher school broke the high grade cypher of the Italian Royal Army in East Africa. Later, during the same month, the replacement cypher for the Italian Royal Air Force was broken.\n* From this point on, the commanders knew Italian plans as soon as they were issued.",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Italian Forces",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Italian Forces", ":summary", "* Troops - The Italian forces included Italian nationals, East African colonials (Eritreans, Abyssinians, and Somali Dubats), and a small number of German volunteers (the German Motorized Company).\n* The Italians had between 250,000 and 280,000 troops available. Most of them (about 70%) were local East African askaris. While the askaris of the regular Eritrean battalions of the 'Royal Corps of Colonial Troops' (Regio Corpo Truppe Coloniali) were amongst the best Italian units in East Africa, the majority of the colonial troops were recruited, trained, and equipped to do no more than maintain order in the colony. Ethiopian askaris and irregulars, recruited during the brief Italian occupation, deserted in large numbers after the outbreak of war.\n* The Royal Corps of Colonial Troops included horse mounted Eritrean cavalry known as 'Falcon Feathers' (Penne di Falcon). On one occasion a squadron of these horsemen charged British and Commonwealth troops throwing small hand grenades from the saddle.\n* The Italian forces were equipped with about 3,300 machine guns, 24 M11/39 tanks, a large number of L3/35 tankettes, 126 armored cars and 813 pieces of assorted artillery. The Italian faced problems with isolation of the East Africa, with very little chance for reinforcements or resupply, leading to problems especially with ammunition.\n* Malaria - It is estimated that nearly one-quarter of the Italians troops defending Amba Alagi in April 1941 had malaria during the siege. Unfortunately, the Italians at Amba Alagi had no medicine for malaria. Even the commander of Amba Alagi, the Duke of Aosta, was himself afflicted with malaria during the siege. He died of tuberculosis and malaria on 3 March 1942, a few months after his surrender.\n* Aircraft - The Italians had 200-300 Savoia-Marchetti SM.79 and Savoia-Marchetti SM.81 bombers and Fiat CR-42 fighters. While some of these aircraft were outdated, in relative terms these were some of the best aircraft available to either side in East Africa in 1940. In addition, the Italian aircraft were often based at better airfields than their British and Commonwealth counter-parts. When the war began, Italian pilots were relatively well trained and confident of their abilities. But, cut off from Italy as they were, problems with lack of fuel, munitions, spare parts, and replacements eventually wore the Italian air capability down.\n* Navy - Italian Naval power maintained presence in the Red Sea region with its 'Red Sea Flotilla' consisting of seven destroyers, five motor torpedo boats and eight submarines."),
        "Allied Forces",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Allied Forces", ":summary", "* Troops - The British and Commonwealth forces in East Africa amounted to about 30,000 men in the Sudan, British East Africa, and British Somaliland. The British were slightly better equipped than the Italians, and had access to resupply and reinforcements. However, they were vastly outnumbered by the Italian forces. To make matters worse, the Italians had at least another 208,000 men (fourteen divisions) available in Libya.\n* Gideon Force - A significant aspect of the Allied campaign to retake Ethiopia was an elite group of Ethiopian irregulars called Gideon Force that would tie down large number of Italian units throughout the colony.\n* Aircraft - The roughly one-hundred aircraft available to the British and Commonwealth forces at the beginning of the campaign were dispersed as follows: In the north (Sudan) were two Royal Air Force (RAF) bomber squadrons at Port Sudan (one of these squadron was equipped with obsolete aircraft) and the RAF Army Co-operation Squadron on the Sudan frontier. In the south (Kenya) were No. 12 Bomber Squadron of the South African Air Force (SAAF) (equipped with Junkers Ju 86 bombers), No. 11 Bomber Squadron of the SAAF (equipped with Fairey Battles), No. 40 Army Co-operation Squadron SAAF (equipped with Hawker Hartebees), No. 2 Fighter Squadron, SAAF (equipped with Hawker Furies), and No. 237 (Southern Rhodesian) Army Co-operation Squadron (equipped with Hawker Hardys). Unlike the Italians, the aircraft available to the British and Commonwealth forces got better with time. But much of the equipment initially available tended to be older and slower. Even so, the British and Commonwealth forces managed to make do with what they had.\n* Navy - Allied Naval presence is very high in the Indian Ocean, but the Eastern Fleet largely consisted of older capital ships that had been deemed too slow or too vulnerable to be of use in the Atlantic Ocean or the Mediterranean Sea."),
        "Battle of Tug Argan",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Tug Argan", ":summary", "* On August 3, 1940, 25,000 Italian troops invaded British Somaliland. The British resisted with 4,000 men including the Somaliland Camel Corp.\n* By August 19, the Italians took control of British Somaliland which was the first British colony to fall to enemy forces in World War II. The Italians, however, had taken nearly 10 times the number of casualties as the British.\n* Winston Churchill, criticized General Archibald Wavell concerning the loss of British Somaliland. Because of the low casualty rate, Churchill fretted that the British had abandoned the colony without enough of a fight. In response to this criticism, Wavell claimed that Somaliland was a textbook withdrawal in the face of superior numbers. He pointed out to Churchill that 'A bloody butcher's bill is not the sign of a good tactician.' According to Churchill's staff, Wavell's retort moved Churchill to greater fury than they had ever seen before.\n* In September, 1940, Indian Infantry Divisions started arriving in the Sudan.\n* Throughout November, December, and early January, the British continued to apply constant pressure on the Italians all along the border with the Sudan. Better British aircraft started to replace some of the older models. The new Hawker Hurricanes were clearly superior to the Italian Fiat CR-42. Additionally, a series of failed naval engagements had lost a number of Italian warships with few British losses.\n* By January, 31 1941, the Italian military forces in East Africa were down to 67 operational aircraft with limited fuel."),
        "Battle of Keren",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Keren", ":reference", "* Keren was as hard a soldiers' battle as was ever fought, and let it be said that nowhere in the war did the Germans fight more stubbornly than those [Italian] Savoia battalions. The unfortunate license of wartime propaganda allowed the British Press to represent the Italians almost as comic warriors; but except for the German parachute division in Italy and the Japanese in Burma no enemy with whom the British and Indian troops were matched put up a finer fight. Moreover, the Colonial troops, until they cracked at the very end, fought with valor and resolution, and their staunchness was a testimony to the excellence of the Italian administration and Military.", ":summary", "* On March, 14 1941, the British forces of 13,000 assaulted a reinforced Italian defense of 23,000. Both sides fought with determination and suffered heavy losses.\n* On March 27, Keren fell."),
        ":Massawa",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Massawa", ":summary", "* On April 8, 1941, Massawa was captured after the Italian ground resistance collapsed without adequate fuel, ammunition, or food.\n* Before Massawa fell, Bonnetti had ordered the remaining six Italian destroyers and the remaining motor torpedo boat on a 'do or die' mission. They were sunk or ran aground without doing much damage."),
        "Amba Alagi",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Amba Alagi", ":summary", "* The Italians decided to make their final defense area around the 12,000 foot high mountain, Amba Alagi. They drove galleries into the solid rock to protect their troops and to hold ample ammunition and stores. In this mountain fortress, the defenders, under command of Amedeo, Duke of Aosta, thought themselves to be impregnable.\n* The 7000 Italian troops were faced by 9000 British troops and 20000 Ethiopian irregulars. A final assault was planned for 15 May, but a fortuitous artillery shell hit an Italian fuel dump and ruptured a vessel containing oil which flowed into the remaining drinking water of the Italian defenders. The lack of drinkable water then forced the Italians to surrender.\n* On 18 May, Amedeo, Duke of Aosta surrendered his embattled forces at Amba Alagi and received full military honors. While the Duke of Aosta faced defeat in East Africa, his brother, the Duke of Spoleto was being made the King of Croatia after the successful invasion of Yugoslavia. The Duke of Aosta had endured the last months of fighting while suffering a severe attack of malaria (and died of TBC and malaria a few months later).")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_eastern_front
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_eastern_front = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_eastern_front = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_eastern_front
  }

  // (func chapter_wwii_eastern_front)
  static f_chapter_wwii_eastern_front(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Eastern Front",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Invasion of Poland",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Invasion of Poland", ":summary", "Germans invade Poland in 1939."),
        "Operattion Barbarossa",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Operattion Barbarossa", ":summary", "* The codename for Nazi Germany's invasion of the Soviet Union during WWII that commenced on June 22, 1941. Over 4.5 million troops of the Axis powers invaded the USSR along an 1,800 mile front. The operation was named after the Emperor Frederick Barbarossa of the Holy Roman Empire, a leader of the Third Crusade in the 12th century. Barbarossa was the major part of the war on the Eastern Front. The planning for operation Barbarossa took several years prior to June 1941; the clandestine preparations and the military operation itself lasted almost a year, from the Spring of 1941, through the Winter of 1941.\n* The operational goal of Operation Barbarossa was the rapid conquest of the European part of the Soviet Union, west of a line connecting the cities of Arkhangelsk and Astrakhan, often referred to as the A-A line (see the translation of Hitler's directive for details). At its conclusion in December 1941, the Red Army had repelled the strongest blow of the Wehrmacht. Hitler had not achieved the victory he had expected, but the situation of the Soviet Union remained critical. Tactically the Germans had won some resounding victories and occupied some of the most important economic areas of the country, most notably in Ukraine. Despite these successes, the Germans were pushed back from Moscow and were not able to mount an offensive simultaneously along the entire strategic Soviet-German front again.\n* Then the failure of Barbarossa resulted in Hitler's demands for additional operations inside Russia, all of which eventually failed, such as continuation of the Siege of Leningrad, Operation Nordlicht, and Battle of Stalingrad, among other battles on the occupied Russian territory.\n* The failure of Operation Barbarossa resulted in the eventual defeat of Nazi Germany and is considered a turning point for the Third Reich. Most importantly, Operation Barbarossa opened up the Eastern Front, which ultimately became the biggest theater of war in world history. Operation Barbarossa and the areas which fell under it became the site of some of the largest and most brutal battles, deadliest atrocities, terrible loss of life, and horrific conditions for Soviets and Germans alike - all of which influenced the course of both WWII and 20th Century history."),
        "Battle of Moscow",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Moscow", ":summary", "* Nazi strategic offensive Operation Typhoon, and a series of Soviet strategic and smaller operations executed during the defense of Moscow, and the subsequent Soviet counter-offensive that occurred between October 1941 and January 1942 on the Eastern Front during WWII as a response to the Hitler's strategy that considered Moscow to be the primary military and political objective for Axis forces in their invasion of the Soviet Union."),
        "Battle of Stalingrad",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Stalingrad", ":summary", "Stalingrad was the bloodiest battle in human history, with combined casualties estimated to be above 60 million. The battle was marked by brutality and disregard for military and civilian casualties by both sides. The German offensive to take Stalingrad, the battle inside the city, and the Soviet counter-offensive which eventually trapped and destroyed the 6th Army and other Axis forces around the city was the second large-scale defeat of the Second World War."),
        "Battle of Kursk",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Kursk",
          ":summary",
          "* The last German blitzkrieg offensive in the east executed by the German forces on a strategic scale during the war, with the hope of another great encirclement of Red Army forces. The operations, which included the famous battle at Prokhorovka, remains both the largest series of armored operations and the most costly single day of aerial warfare to date.\n* Kursk is further notable for the deliberately defensive operation strategy on the Red Army's part. Having good intelligence on Hitler's intentions, the Red Army established and managed to conceal elaborate layered defense works, mine fields, and stage and disguise large reserve forces poised for a tactical and strategic counter-attack typical of defensive battle plans. Though the Germans planned and initiated an offensive strike, the well-planned defense not only frustrated their ambitions, but also enabled the Soviets to follow up with counter-offensives that exhausted the German abilities in the Theater, thereby seizing the initiative for the remainder of the war.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Tiger Phobia II",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Tiger Phobia II",
              ":summary",
              "* On 7 July 1943, a single Tiger tank commanded by SS-Oberscharfuhrer Franz Staudegger engaged a group of about 50 T-34s around Psyolknee (the southern sector of the German salient in the Battle of Kursk). Staudegger used all his ammunition in destroying 22 Soviet tanks, while the rest retreated. For this, Staudegger was awarded the Knight's Cross.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Soviet*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Soviet*", ":deploy", "* All units are in a column moving down a road. They are caught by surprise and may not leave formation until the Tiger attacks.", ":forces", "* 50 [T-34/76] Tanks"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "* Surprise is yours. Do not deploy at the beginning of the game. Instead, any time you have the initiative, you may deploy the Tiger in any space and immediately fire as if prepared.", ":forces", "* 1 [Tiger Tank] - Ace")
              )
            )
          )
        ),
        "Battle of Berlin",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Berlin", ":summary", "* Two Soviet Fronts attacked Berlin from the east and south, while a third overran German forces positioned north of Berlin.\n* The battle of Berlin lasted from late April 1945 until early May and was one of the bloodiest battles in history. Before the battle was over, German dictator Adolf Hitler and many of his followers committed suicide.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_equipment
  }

  // (func chapter_wwii_equipment)
  static f_chapter_wwii_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII Explosives",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Explosives",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "30kg Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30kg Bomb", ":classification", "Bomb", ":explosive", "30kg"),
            "60kg Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "60kg Bomb", ":classification", "Bomb", ":explosive", "60kg"),
            "100kg Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "100kg Bomb", ":classification", "Bomb", ":explosive", "100kg"),
            "250lb Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "250lb Bomb", ":classification", "Bomb", ":explosive", "110kg"),
            "350lb Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "350lb Bomb", ":classification", "Bomb", ":explosive", "159kg"),
            "500lb Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "500lb Bomb", ":reference", "* P-47 pilots frequently carried two 500-pound (227 kg) bombs, using skip bombing techniques for difficult targets (skipping bombs into railroad tunnels to destroy hidden enemy locomotives or tanks was a favorite tactic); a near miss was sufficient to knock a tank on its side, blow off a track or turret, or cause serious damage to tracks, suspension, and turret mechanisms, frequently causing the vehicle to be abandoned by its crew.", ":classification", "Bomb", ":explosive", "225kg"),
            "250kg Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "250kg Bomb", ":classification", "Bomb", ":explosive", "250kg"),
            "600lb Depth Charge",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "600lb Depth Charge", ":reference", "* Although the explosions of the standard United States 600-pound (270 kg) Mark 4 or Mark 7 depth charge used in World War II were nerve-wracking to the target, an undamaged U-boat's pressure hull would not rupture unless the charge detonated closer than about five meters. Placing the weapon within this range was entirely a matter of chance and quite unlikely as the target maneuvered evasively during the attack. Most U-boats sunk by depth charges were destroyed by damage accumulated from a long barrage rather than by a single carefully-aimed attack. Many survived hundreds of depth charge detonations over a period of many hours.\n* The depth charge causes damage by both the initial shock wave and by the subsequent reverberating shock waves that have a tendency to bend a submarine back and forth cause a hull breach.\n* A 100kg of TNT depth charge would have a kill radius of 3-4m. Higher payloads only increase this by a few meters because the effect decreases with the distance cubed. The killing range is also greater with larger submarines. It is doubtful a midget submarine with a titanium hull could be destroyed by anything less than a direct hit.", ":classification", "Bomb", ":explosive", "270kg"),
            "1000lb Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "1000lb Bomb", ":classification", "Bomb", ":explosive", "454kg"),
            "1200kg Bomb",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "1200kg Bomb", ":classification", "Bomb", ":explosive", "1200kg"),
            ":Mine",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mine", ":classification", "Bomb"),
            ":Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Torpedo", ":image", "WWII/Torpedo.png", ":classification", "Torpedo")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_french_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_french_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_french_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_french_equipment
  }

  // (func chapter_wwii_french_equipment)
  static f_chapter_wwii_french_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII French Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII French Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII French Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "7.5mm MAS-36",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.5mm MAS-36", ":image", "WWIIFrench/Rifle_MAS36.jpg", ":summary", "7.5mm Bolt-action Rifle", ":classification", "Rifle"),
            "7.65mm MAS-38",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.65mm MAS-38", ":image", "WWIIFrench/SMG_MAS_38.jpg", ":reference", "* On April 28, 1945, was used by Italian partisans to shoot the former dictator Benito Mussolini.", ":summary", "7.65mm SMG", ":classification", "Lt. MG", ":modifiers", "Auto")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_french_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_french_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_french_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_french_units
  }

  // (func chapter_wwii_french_units)
  static f_chapter_wwii_french_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII French Units",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII French Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII French Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Free French Forces",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Free French Forces", ":image", "WWIIFrench/FrenchResistanceToken.png", ":reference", "* French fighters from colonies and resistance"),
            "French Resistance Intelligence",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "French Resistance Intelligence", ":image", "WWIIFrench/FrenchIntelligenceToken.png", ":reference", "* Spies gathering intelligence on the German occupiers"),
            "French Foreign Legion",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "French Foreign Legion"),
            "Manouchian Group",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Manouchian Group", ":image", "WWIIFrench/ManouchianGroupToken.png", ":reference", "* Guerrilla Resistance Fighters")
          )
        ),
        "WWII French Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII French Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Char B1",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Char B1", ":image", "WWIIFrench/TankMed_CharB1.png", ":classification", "Med. Tank"),
            "Renault R40",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Renault R40", ":classification", "Lt. Tank"),
            "French M4 Sherman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "French M4 Sherman",
              ":image",
              "WWIIFrench/TankMed_M4A3_Sherman.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":range",
              "193km",
              ":speedland",
              "38kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "65mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "French M10 Wolverine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "French M10 Wolverine",
              ":image",
              "WWIIFrench/TD_M10_Wolverine.png",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "30tons",
              ":length",
              "6m",
              ":range",
              "300km",
              ":speedland",
              "51kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "57mm", ":over", "0mm", ":under", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        "WWII French Aircraft",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII French Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Free French Spitfire",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Free French Spitfire",
              ":image",
              "WWIIFrench/SupermarineSpitfire_Mk_IXToken.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3tons",
              ":length",
              "9m",
              ":range",
              "760km",
              ":speedair",
              "605kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_german_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_german_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_german_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_german_equipment
  }

  // (func chapter_wwii_german_equipment)
  static f_chapter_wwii_german_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII German Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII German Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII German Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            ".32 Mauser Hsc",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", ".32 Mauser Hsc", ":image", "WWIIGerman/Pistol_Mauser_HSc.jpg", ":reference", "* Military personnel of all ranks not issued sidearms often purchased HSc pistols in the commercial marketplace and carried them into the field.", ":summary", ".32 cal Pistol", ":classification", "Pistol", ":length", ".15m", ":mass", ".7kg", ":muzzlevelocity", "282m/s"),
            "9mm Luger P08",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm Luger P08", ":image", "WWIIGerman/DWM_4_inch_Navy_Luger_859.jpg", ":reference", "* The usual German sidearm in both world wars.", ":summary", "9mm Pistol", ":classification", "Pistol", ":muzzlevelocity", "390m/s"),
            "9mm MP40 SMG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "9mm MP40 SMG", ":image", "WWIIGerman/SMG_MP40.jpg", ":classification", "Lt. MG", ":modifiers", "Auto", ":muzzlevelocity", "380m/s", ":range", "100m", ":rof", "500/min"),
            "7.92mm Karabiner 98k",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.92mm Karabiner 98k", ":reference", "* Standard German infantry rifle", ":summary", "7.92mm Bolt-action Rifle", ":classification", "Rifle", ":range", "500m"),
            "Flammenwerfer 35 Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Flammenwerfer 35 Flamethrower", ":classification", "Flamethrower", ":crew", "1", ":mass", "35kg", ":modifiers", "Fire, Auto", ":range", "25m"),
            "7.92mm FG42 Light MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.92mm FG42 Light MG", ":reference", "* The FG42 was developed specifically for the use by paratroopers, who wanted a suitable gun after their experiences in the invasion of Crete.", ":classification", "Lt. MG", ":modifiers", "Auto, +1 Prepare"),
            "7.92mm MG17 MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.92mm MG17 MG", ":image", "WWIIGerman/MG_MG17.jpg", ":reference", "* A mainstay fixed machine gun in German built aircraft.", ":classification", "Med. MG", ":length", "1175mm", ":mass", "10.2kg", ":modifiers", "Auto", ":muzzlevelocity", "855m/s", ":rof", "1200/min"),
            "MG:7.92mm MG34",
            nx_tactics_base.f_item_from_tactics_key(tactics, "MG:7.92mm MG34"),
            "7.92mm MG81Z MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.92mm MG81Z MG", ":image", "WWIIGerman/MG_MG81.jpg", ":reference", "* An aircraft mounted derivative of the successful MG34 infantry machine gun.", ":classification", "Med. MG", ":length", "915mm", ":mass", "12.9kg", ":modifiers", "Auto", ":muzzlevelocity", "705m/s", ":rof", "1500/min"),
            "13mm MG131 MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "13mm MG131 MG", ":image", "WWIIGerman/MG_13mm_MG131.jpg", ":reference", "* Under the doctrine of WWII German infantry tactics, the squad machine gun is the center of operation and the rest of the squad will maneuver and try to achieve its objective under the cover of the squad machine gun fire.", ":classification", "Hvy. MG", ":length", "1140m", ":mass", "16.6kg", ":muzzlevelocity", "750m/s", ":range", "1800m", ":rounds", "900/min"),
            "20mm MG151/20 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm MG151/20 Cannon", ":reference", "* On the Fw190, it was found that it took an average of twenty 20 mm hits to shoot down a typical four engined bomber.", ":classification", "Cannon", ":muzzlevelocity", "800m/s", ":rof", "750/min"),
            "30mm MK 108 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "30mm MK 108 Cannon", ":image", "WWIIGerman/Cannon_MK108.jpg", ":reference", "* The 30 mm MK 108 cannon could bring down a bomber with an average of one to three hits, but the ammunition was heavy (limiting the amount of ammo carried) and its low muzzle velocity meant it became inaccurate at 1000m.", ":classification", "Cannon", ":length", "1m", ":mass", "58kg", ":modifiers", "Auto", ":muzzlevelocity", "540m/s", ":range", "1000m", ":rof", "650/min"),
            "R4M Hurricane Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "R4M Hurricane Rocket", ":reference", "* The first practical anti-aircraft rocket. After the war the R4M served as the pattern for a number of similar systems, used by almost all interceptor aircraft during the 1940s and '50s. The R4M used a large warhead of 55mm with 520g explosive charge, nearly guaranteeing a kill with one hit. A battery typically consisted of two groups of 12 rockets and when all 24 were fired at once they would fill an area about 15 by 30 m at 1000 m, dense enough that one was almost certain to hit its target. Two warheads were available for the R4M, the common PB-3 with a 0.4 kg charge for anti-aircraft use and the larger shaped charge, similar in construction to the Panzerschreck, the Panzerblitz II (PB-2), for anti-tank use.", ":titles", "Orkan", ":classification", "Missile", ":length", "812mm", ":mass", "3.2kg", ":modifiers", "HE, AP", ":muzzlevelocity", "525m/s", ":range", "1000m", ":rounds", "1"),
            "40mm Bofors L/60 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "40mm Bofors L/60 Cannon", ":classification", "Cannon", ":modifiers", "Auto, HE", ":muzzlevelocity", "881m/s", ":rof", "120/min"),
            "50mm PaK 38 L/60 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm PaK 38 L/60 Cannon", ":reference", "* The PaK 38 was one of the few early guns capable of effectively penetrating the 45 mm armor of the formidable T-34.", ":classification", "Cannon", ":modifiers", "HE, AP"),
            "50mm KwK 39 L/60 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "50mm KwK 39 L/60 Cannon", ":classification", "Cannon", ":modifiers", "HE, AP", ":muzzlevelocity", "800m/s"),
            "75mm KwK 39 L/48 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm KwK 39 L/48 Cannon", ":classification", "Cannon", ":modifiers", "HE, AP", ":muzzlevelocity", "750m/s"),
            "Cannon:75mm KwK40",
            nx_tactics_base.f_item_from_tactics_key(tactics, "Cannon:75mm KwK40"),
            "75mm KwK 42 L/70 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm KwK 42 L/70 Cannon", ":classification", "Cannon", ":length", "5.2m", ":mass", "1ton", ":modifiers", "HE, AP", ":muzzlevelocity", "925m/s", ":range", "2km direct, 10km indirect"),
            "88mm KwK 36 L/56 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "88mm KwK 36 L/56 Cannon", ":classification", "Cannon", ":modifiers", "HE, AP", ":muzzlevelocity", "773m/s", ":range", "2km"),
            "88mm KwK 43 L/71 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "88mm KwK 43 L/71 Cannon", ":classification", "Cannon", ":modifiers", "HE, AP", ":muzzlevelocity", "1000m/s", ":range", "4km"),
            "105mm leFH 18 Howitzer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "105mm leFH 18 Howitzer", ":classification", "Artillery", ":explosive", "1.38kg", ":modifiers", "HE", ":muzzlevelocity", "470m/s", ":range", "10.6km", ":rof", "5/min"),
            "150mm StuH 43 L/12 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "150mm StuH 43 L/12 Cannon", ":summary", "Penetrates 160mm at any range", ":classification", "Cannon", ":modifiers", "HE", ":muzzlevelocity", "240m/s", ":range", "4.3km", ":rof", "1.5/min"),
            "Model 24 Grenade",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Model 24 Grenade", ":image", "WWIIGerman/Grenade_Model24.jpg", ":reference", "* It featured an explosive charge encased in a metal can and mounted on a wooden shaft for throwing. It became one of the most easily recognized of all small arms, and synonymous with the German soldier.", ":titles", "Potato Masher", ":classification", "Bomb", ":explosive", ".17kg", ":length", ".35m", ":mass", ".6kg", ":modifiers", "Anti-Personnel", ":range", "40m"),
            ":Panzerfaust",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Panzerfaust", ":image", "WWIIGerman/Rocket_Panzerfaust.jpg", ":reference", "* The weapon proved to be particularly deadly to Allied armored vehicles, especially in urban combat where the short lines of sight allowed the weapon to be used at close range.", ":summary", "* Disposable HEAT Rocket penetrates 200mm at 60m", ":titles", "Tank Fist", ":classification", "Missile", ":explosive", ".8kg", ":length", "1m", ":mass", "6.25kg", ":modifiers", "HEAT", ":range", "60m", ":rounds", "1"),
            ":Panzerschreck",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Panzerschreck", ":reference", "* When handled by well-trained crews, this weapon became the bane of Allied armored units, who frequently attempted to add improvised protection to their tanks, e.g. sandbags, spare track units, logs and so on. Most of this make-shift protection had little actual effect.", ":summary", "* Disposable HEAT Rocket penetrates 200mm at 60m", ":titles", "Tank Terror, Stove Pipe", ":classification", "Missile", ":explosive", ".66kg", ":length", ".16m", ":mass", "11kg", ":modifiers", "HEAT", ":range", "150m"),
            "120mm GrW 42 Mortar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "120mm GrW 42 Mortar", ":classification", "Artillery", ":explosive", "15.6 kg", ":modifiers", "Indirect, HE"),
            "150mm Rocket Launcher",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "150mm Rocket Launcher", ":reference", "* These offered the opportunity to deliver large quantities of poison gas or smoke simultaneously.\n* Almost five and a half million 15 cm rockets and six thousand launchers were manufactured over the course of the war.", ":classification", "Missile", ":explosive", "50kg", ":mass", "1.1tons", ":modifiers", "HE", ":muzzlevelocity", "145m/s", ":rounds", "6"),
            "V2 Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "V2 Rocket", ":image", "WWIIGerman/Rocket_V2.jpg", ":reference", "* The rocket was the world's first long-range missile and first human artifact to achieve sub-orbital spaceflight. It was the progenitor of all modern rockets, including those used by the United States and Soviet Union space programs, who gained access to the scientists and designs.\n* They not only took a toll of 9 thousand casualties. They also had a devastating psychological effect for unlike the buzzbomb it would attack without warning, and it could not be intercepted by fighter aircraft or anti-aircraft artillery.\n* Hitler was probably not impressed with the weapon but was impressed by the enthusiasm of its developers and needed a 'wonder weapon' to maintain German morale.", ":titles", "Vengence 2", ":classification", "Missile", ":explosive", "980kg", ":length", "14m", ":mass", "6.5tons", ":range", "320km", ":rounds", "1", ":speedair", "5760kph", ":width", "1.65m")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_german_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_german_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_german_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_german_units
  }

  // (func chapter_wwii_german_units)
  static f_chapter_wwii_german_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII German Units",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII German Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII German Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "German Rifle Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German Rifle Team",
              ":image",
              "WWIIGerman/Infantry_RiflemanToken.png",
              ":summary",
              "Composed of 5 riflemen",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "German MG Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German MG Team",
              ":image",
              "WWIIGerman/Infantry_MGToken.png",
              ":summary",
              "Composed of 2 riflemen, MG Gunner, MG Assistant, and squad leader",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Waffen-SS Infantry",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Waffen-SS Infantry",
              ":image",
              "WWIIGerman/Infantry_SSToken.png",
              ":titles",
              "Weapon SS (Shield Squadron)",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "5",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "German Sniper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German Sniper",
              ":image",
              "WWIIGerman/Infantry_SniperToken.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Panzergrenadiers",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panzergrenadiers",
              ":image",
              "WWIIGerman/Infantry_PanzergrenadierToken.png",
              ":reference",
              "The shaped charge could penetrate up to 200 mm of steel, enough to defeat any armoured fighting vehicle\nof the period.",
              ":summary",
              "* Heavy Anti-Tank Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Panzerschreck Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panzerschreck Team",
              ":image",
              "WWIIGerman/Infantry_PanzerschreckToken.png",
              ":reference",
              "* Though the Panzerschreck is a copy of the bazooka, the bazooka was having a difficulties with the Tiger and Panther, one direct hit was usually enough to destroy any Allied armored vehicle.",
              ":summary",
              "* Heavy Anti-Tank Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Obertruppfuhrer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Obertruppfuhrer",
              ":image",
              "WWIIGerman/Infantry_ObersturmfuhrerToken.png",
              ":reference",
              "* Obertruppfuhrer was junior to Haupttruppfuhrer and typically served as a senior non-commissioned officer rank equivalent to a Platoon Sergeant.",
              ":summary",
              "* Commander",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Leadership",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Leadership",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command"),
                    ":Rally",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Rally")
                  )
                )
              )
            ),
            ":Haupttruppfuhrer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Haupttruppfuhrer",
              ":summary",
              "* Commander",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Leadership",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Leadership",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command"),
                    ":Rally",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Rally")
                  )
                )
              )
            ),
            ":Gestapo",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gestapo", ":reference", "* 'Jew Hunter'? It's just a name that stuck. Well, you do have to admit, it is catchy. - Inglourious Basterds"),
            ":Fallschirmjager",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Fallschirmjager",
              ":image",
              "WWIIGerman/Infantry_FallschirmjagerToken.png",
              ":reference",
              "* During the Battle of Crete, the Ultra enabled the British to wait on each German drop zone, yet despite	compromised secrecy, surviving German paratroops pushed the Commonwealth forces off the island. However, the	losses were so great that Hitler forbade their future use. He felt that the main power of the paratroop was	novelty, and that the British had clearly figured out how to defend against them. Ironically, the battle that	ended Germany's paratrooper operations had the opposite effect on the Allies. Convinced of the effectiveness of	airborne assaults, the Allies hurried to train and organize their own airborne units.",
              ":summary",
              "* Paratrooper",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "German Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German Forward Observer",
              ":image",
              "WWIIGerman/Infantry_ForwardObserverToken.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Granatwerfer 42",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Granatwerfer 42",
              ":image",
              "WWIIGerman/Infantry_MortarToken.png",
              ":summary",
              "* Heavy Mortar Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "German Medical Corp",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "German Medical Corp", ":image", "WWIIGerman/Infantry_MedicToken.png", ":classification", "Med. Infantry"),
            "German Pioniere",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "German Pioniere", ":image", "WWIIGerman/Infantry_PionereToken.png", ":summary", "Combat Engineers from the German Defense Force", ":classification", "Med. Infantry")
          )
        ),
        "WWII German Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII German Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Panzer III Ausf L",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panzer III Ausf L",
              ":image",
              "WWIIGerman/TankLt_PzkpfwIII_DesertToken.png",
              ":classification",
              "Lt. Tank",
              ":crew",
              "5",
              ":mass",
              "22tons",
              ":height",
              "2.5m",
              ":length",
              "5.5m",
              ":range",
              "155km",
              ":speedland",
              "40kph",
              ":width",
              "2.9m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "70mm", ":back", "50mm", ":over", "10mm", ":under", "5mm", ":side", "30mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Flammpanzer III Ausf M",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Flammpanzer III Ausf M",
              ":image",
              "WWIIGerman/TankLt_FlammpanzerIIIToken.png",
              ":classification",
              "Lt. Tank",
              ":crew",
              "5",
              ":mass",
              "22tons",
              ":height",
              "2.5m",
              ":length",
              "5.5m",
              ":range",
              "155km",
              ":speedland",
              "40kph",
              ":width",
              "2.9m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "70mm", ":back", "50mm", ":over", "10mm", ":under", "5mm", ":side", "30mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Panzer IV Ausf H",
            nx_tactics_base.f_unit_from_tactics_key(tactics, "Panzer IV Ausf H"),
            "Panther Ausf G",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panther Ausf G",
              ":image",
              "WWIIGerman/TankMed_PantherToken.png",
              ":reference",
              "* Ernst Barkmann in a lone Panther knocked out nine Shermans halting an American advance.",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "43tons",
              ":range",
              "250km",
              ":speedland",
              "46kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "80mm Sloped", ":back", "45mm", ":over", "30mm", ":under", "30mm", ":side", "50mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Tiger Ausf E",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tiger Ausf E",
              ":image",
              "WWIIGerman/TankHvy_TigerToken.png",
              ":reference",
              "* In the Normandy campaign, it could take four to five Shermans to knock out a single Tiger tank by maneuvering to its weaker flank or rear armor.",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "57tons",
              ":length",
              "8.5m",
              ":range",
              "150km",
              ":speedland",
              "38kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "100mm", ":back", "25mm", ":over", "40mm", ":under", "40mm", ":side", "80mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Tiger II Ausf B",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tiger II Ausf B",
              ":image",
              "WWIIGerman/TankHvy_PzkpfwVIb_Porsche_KingTigerToken.png",
              ":reference",
              "* The M4 Sherman was unable to penetrate the front even at point blank and the M26 Pershing and IS-2 had to come within 1300 m and 200 m respectively.\n* The Tiger II could destroy all Allied armor at a range far outside the effective range of the enemy's armament. Also the Tiger II was remarkably agile for such a heavy vehicle. Records indicate that it had a lower ground pressure and was as maneuverable as the much lighter Panzer IV.",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "68tons",
              ":length",
              "7.6m",
              ":range",
              "170km",
              ":speedland",
              "41kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "150mm", ":back", "80mm", ":over", "40mm", ":under", "40mm", ":side", "80mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Marder II",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Marder II",
              ":image",
              "WWIIGerman/TD_MarderIIToken.png",
              ":reference",
              "* Based on obsolete Panzer II.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "3",
              ":mass",
              "11tons",
              ":length",
              "6.4m",
              ":range",
              "190km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "35mm", ":back", "0mm", ":over", "0mm", ":side", "15mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "StuG III",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "StuG III",
              ":image",
              "WWIIGerman/TD_StugIIIToken.png",
              ":reference",
              "* Cheaper than a Panzer III, it was Germany's most produced armored vehicle. Sturmgeschutz units held a very impressive record of tank kills - some 20,000 enemy tanks by spring of 1944.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "4",
              ":mass",
              "24tons",
              ":length",
              "6.9m",
              ":range",
              "155km",
              ":speedland",
              "40kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "80mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "JapdPanzer 38 Hetzer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "JapdPanzer 38 Hetzer",
              ":image",
              "WWIIGerman/TD_HetzerToken.png",
              ":reference",
              "* The Jagdpanzer 38(t) is one of the most common late-war German tank destroyers. Also, its small size made it a hard target, and was easy to conceal allowing it to lie in ambush for enemy tanks.",
              ":classification",
              "Tank Destroyer",
              ":mass",
              "15tons",
              ":length",
              "6m",
              ":range",
              "177km",
              ":speedland",
              "42kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "60mm Sloped")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":JagdPanther",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "JagdPanther",
              ":image",
              "WWIIGerman/TD_JagdPantherToken.png",
              ":reference",
              "* Many historians consider the Jagdpanther to be the best tank destroyer of World War 2.\n* Because of its visually striking design, the Jagdpanther was featured on the box cover art of the game Panzerblitz.",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "5",
              ":mass",
              "45.5tons",
              ":length",
              "10m",
              ":range",
              "160km",
              ":speedland",
              "46kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "80mm Sloped", ":back", "45mm", ":over", "30mm", ":side", "50mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Panzerjager Tiger Elefant",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panzerjager Tiger Elefant",
              ":image",
              "WWIIGerman/TD_PanzerjagerTigerElefantToken.png",
              ":reference",
              "* 10:1 Kill Ratio due to strong defense though vulnerable to infantry",
              ":classification",
              "Tank Destroyer",
              ":mass",
              "65tons",
              ":speedland",
              "30kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "200mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":Nashorn",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Nashorn",
              ":image",
              "WWIIGerman/TD_NashornToken.png",
              ":classification",
              "Tank Destroyer",
              ":mass",
              "24tons",
              ":range",
              "235km",
              ":speedland",
              "42kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "30mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Sturmpanzer IV Brummbar",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sturmpanzer IV Brummbar",
              ":image",
              "WWIIGerman/SPG_BrummbarToken.png",
              ":reference",
              "* Fire support based on Panzer IV",
              ":classification",
              "Artillery",
              ":crew",
              "5",
              ":mass",
              "28.2tons",
              ":height",
              "2.5m",
              ":length",
              "6m",
              ":range",
              "210km",
              ":speedland",
              "40kph",
              ":width",
              "2.9m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "100mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            ":SturmTiger",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SturmTiger",
              ":image",
              "WWIIGerman/SPG_SturmTigerToken.png",
              ":reference",
              "* Heavy Bombardment unit Based on Tiger",
              ":summary",
              "* 380mm Naval Mortar\n* 90mm KbK 39 Antipersonnel weapon",
              ":classification",
              "Artillery",
              ":crew",
              "5",
              ":mass",
              "65tons",
              ":height",
              "2.9m",
              ":length",
              "6.3m",
              ":range",
              "120km",
              ":speedland",
              "40kph",
              ":width",
              "3.6m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "150mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "SdKfz 124 Wespe",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SdKfz 124 Wespe",
              ":image",
              "WWIIGerman/SPG_Wespe_WaspToken.png",
              ":reference",
              "* SPG based on Panzer II. Proved so successful that Hitler ordered all Panzer II production to be reserved for the Wespe alone, dropping other projects such as the Marder II.",
              ":classification",
              "Artillery",
              ":mass",
              "11tons",
              ":height",
              "2.3m",
              ":length",
              "4.8m",
              ":range",
              "220km",
              ":speedland",
              "40kph",
              ":width",
              "2.3m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "30mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Panzerwerfer 42",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Panzerwerfer 42",
              ":image",
              "WWIIGerman/RocketLauncher_Panzerwerfer42Token.png",
              ":classification",
              "Med. Vehicle",
              ":crew",
              "2",
              ":mass",
              "13.5tons",
              ":height",
              "2m",
              ":length",
              "7m",
              ":range",
              "300km",
              ":speedland",
              "27kph",
              ":width",
              "2.5m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "15mm", ":back", "8mm", ":over", "6mm", ":under", "6mm", ":side", "12mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "PaK 38 50mm Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "PaK 38 50mm Artillery",
              ":image",
              "WWIIGerman/Artillery_PaK38Token.png",
              ":classification",
              "Artillery",
              ":mass",
              "830kg",
              ":length",
              "4.75m",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "PaK 40 75mm Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "PaK 40 75mm Artillery",
              ":image",
              "WWIIGerman/Artillery_PaK40Token.png",
              ":reference",
              "* The PaK 40 was the standard German anti-tank gun, and was supplied by Germany to its allies.",
              ":classification",
              "Artillery",
              ":mass",
              "1.4tons",
              ":length",
              "6.2m",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "PaK 43 88mm Artillery",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "PaK 43 88mm Artillery",
              ":image",
              "WWIIGerman/Artillery_PaK43_88mmToken.png",
              ":reference",
              "* The Pak 43 entered production in 1943 and was an extremely powerful weapon, capable of dealing with any tank it would face. It was however a massive weapon, well beyond the reasonable weight for an anti-tank weapon. The weight coupled with the immense size meant that it was extremely difficult to handle on the field.",
              ":classification",
              "Artillery",
              ":mass",
              "3.6tons",
              ":length",
              "9.2",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Bofors 40mm AA",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Bofors 40mm AA",
              ":image",
              "WWIIGerman/AA_Bofors40mmToken.png",
              ":classification",
              "Hvy. MG",
              ":mass",
              "2.5tons",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Halftrack Sdkfz 251",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Halftrack Sdkfz 251",
              ":image",
              "WWIIGerman/Halftrack_Sdkfz_250Token.png",
              ":classification",
              "Med. Vehicle",
              ":crew",
              "2+10",
              ":mass",
              "7.8tons",
              ":height",
              "1.8m",
              ":length",
              "5.8m",
              ":range",
              "500km",
              ":speedland",
              "52kph",
              ":width",
              "2.1m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "15mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Mercedes L300",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Mercedes L300",
              ":image",
              "WWIIGerman/Truck_Mercedes_L3000Token.png",
              ":classification",
              "Truck",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "2")
              )
            ),
            "Kubelwagen Type 82",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kubelwagen Type 82",
              ":image",
              "WWIIGerman/Car_KubelwagenType82Token.png",
              ":reference",
              "* Prototype versions were assembled with four-wheel drive, but none offered a significant increase in performance or capability, so none were produced.\n* In 1943, the U.S. military concluded that the vehicle was simpler, easier to manufacture and maintain, faster, and more comfortable for four passengers than the U.S. Jeeps.",
              ":classification",
              "Car",
              ":crew",
              "1+3",
              ":mass",
              "715kg",
              ":height",
              "1.7m",
              ":length",
              "3.7m",
              ":speedland",
              "80kph",
              ":width",
              "1.6m",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "BMW R75 Motorcycle",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "BMW R75 Motorcycle",
              ":image",
              "WWIIGerman/MotorcycleToken.png",
              ":classification",
              "Lt. Vehicle",
              ":crew",
              "1+1",
              ":mass",
              "420kg",
              ":range",
              "350km",
              ":speedland",
              "95kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        "WWII German Aircraft",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII German Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Messerschmitt Bf 109",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Messerschmitt Bf 109",
              ":image",
              "WWIIGerman/Fighter_BF-109Token.png",
              ":reference",
              "* The most successful fighter of World War II, shooting down more aircraft than any of its contemporaries.\n* Produced in greater quantities than any other fighter aircraft in history.\n* Flown by the three top-scoring fighter aces of World War II: Erich Hartmann, the top scoring fighter ace of all time with 352 official victories, Gerhard Barkhorn with 301 victories, and Günther Rall with 275 victories.\n* Hartmann refused to fly any other combat aircraft throughout the war.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.1tons",
              ":length",
              "9m",
              ":range",
              "850km",
              ":speedair",
              "640kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Focke-Wulf Fw 190",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Focke-Wulf Fw 190",
              ":image",
              "WWIIGerman/Fighter_FW_190Token.png",
              ":reference",
              "* Well liked by its pilots, and was quickly proven to be superior to the RAF's main front line fighter, the Spitfire Mk. V, on its combat debut in 1941.\n* Compared to the Bf 109, the Fw 190 was a 'workhorse', employed in and proved suitable for a wide variety of roles, including ground attack, night fighter-bomber, long-range bomber escort, and night-fighter.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "4tons",
              ":height",
              "4m",
              ":length",
              "9m",
              ":range",
              "800km",
              ":speedair",
              "656kph",
              ":width",
              "10m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Messerschmitt Bf 110",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Messerschmitt Bf 110",
              ":image",
              "WWIIGerman/FighterBomber_BF-110Token.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "2",
              ":mass",
              "7.8tons",
              ":height",
              "3.3m",
              ":length",
              "12.3m",
              ":range",
              "900km",
              ":speedair",
              "595kph",
              ":width",
              "16.3m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Messerschmitt Me 262",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Messerschmitt Me 262",
              ":image",
              "WWIIGerman/FighterJet_Me-262Token.png",
              ":reference",
              "* World's First Turbojet Fighter",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "6.5tons",
              ":height",
              "3.5m",
              ":length",
              "10.6m",
              ":range",
              "1050km",
              ":speedair",
              "900kph",
              ":width",
              "12.6m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm", ":back", "10mm", ":over", "10mm", ":side", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Heinkel He 177",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Heinkel He 177",
              ":image",
              "WWIIGerman/Bomber_HE_177Token.png",
              ":reference",
              "* Strategic Bomber\n* This troubled aircraft was the only heavy bomber built in large numbers by Germany in WWII. It was nicknamed Luftwaffe's lighter or the 'Flaming Coffin' due to the engines' tendency to catch fire,",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "6",
              ":mass",
              "27.2tons",
              ":height",
              "6.4m",
              ":length",
              "22m",
              ":range",
              "1540km",
              ":speedair",
              "565kph",
              ":width",
              "31.4m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Arado Ar 234",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Arado Ar 234",
              ":image",
              "WWIIGerman/BomberJet_AR-234_AradoToken.png",
              ":reference",
              "* The world's first operational jet powered bomber, built in the closing stages of World War II. In the field it was used almost entirely in the reconnaissance role, but in its few uses as a bomber it proved to be nearly impossible to intercept.",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "1",
              ":mass",
              "9.8tons",
              ":height",
              "4.3m",
              ":length",
              "12.6m",
              ":range",
              "1100km",
              ":speedair",
              "742kph",
              ":width",
              "14.1m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Do 24 Flying Boat",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Do 24 Flying Boat",
              ":image",
              "WWIIGerman/FlyingBoat_DO24Token.png",
              ":summary",
              "* Seaplance",
              ":classification",
              "Med. Aircraft",
              ":crew",
              "3",
              ":mass",
              "18.4tons",
              ":height",
              "6m",
              ":length",
              "22m",
              ":range",
              "2900km",
              ":speedair",
              "341kph",
              ":width",
              "27m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm", ":back", "10mm", ":over", "10mm", ":side", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        "WWII German Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII German Naval Vessels",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Bismarck Class Battleship",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Bismarck Class Battleship",
              ":image",
              "WWIIGerman/Battleship_Bismarck.png",
              ":reference",
              "* 40% by weight dedicated to armor. More than the Yamato's 33%\n* May 1941, sank the HMS Hood, flagship and pride of the Royal Navy in 11 minutes. In response, Winston Churchill issued the order to 'Sink the Bismarck', spurring a relentless pursuit by the Royal Navy.",
              ":titles",
              "Bismarck, Tirpitz",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "2092",
              ":mass",
              "50ktons",
              ":length",
              "251m",
              ":speedwater",
              "56kph",
              ":width",
              "36m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "320mm", ":back", "320mm", ":over", "120mm", ":side", "320mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Hanger",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Hanger", ":summary", "* 4xArado Ar 196 A-3, with 1 double-ended catapult")
              )
            ),
            "U-Boot Type VII",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "U-Boot Type VII", ":image", "WWIIGerman/Submarine_VIIC_UboatToken.png", ":reference", "* By the end of the war, almost 3,000 Allied ships (175 warships; the rest were merchant ships) were sunk by U-boat torpedoes.", ":classification", "Submarine"),
            "Elektroboot XXI",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elektroboot XXI", ":image", "WWIIGerman/Submarine_XXIIIToken.png", ":classification", "Submarine")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_italian_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_italian_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_italian_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_italian_units
  }

  // (func chapter_wwii_italian_units)
  static f_chapter_wwii_italian_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Italian Units",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII Italian Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Italian Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "7.65mm Beretta M1935 Pistol",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.65mm Beretta M1935 Pistol", ":image", "WWIIItalian/Pistol_Beretta_M1935.jpg", ":summary", "* The M1935 is a very robust construction with long service life if properly maintained.\n* However, the .32 ACP ammunition is somewhat under-powered for combat use. The magazine capacity of only 8 rounds and short effective range reduces the M1935 to a last resort self defense weapon.", ":classification", "Pistol", ":length", "159mm", ":mass", ".75kg", ":muzzlevelocity", "305m/s", ":rounds", "7"),
            "6.5mm Carcano M1891 Rifle",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "6.5mm Carcano M1891 Rifle", ":image", "WWIIItalian/Rifle_Carcano.jpg", ":reference", "* The Carcano was the rifle used by Lee Harvey Oswald to assassinate John F. Kennedy", ":summary", "* Bolt action rifle", ":length", "1300mm", ":mass", "3.8kg", ":muzzlevelocity", "700m/s", ":rounds", "6"),
            "7.7mm Breda-SAFAT MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.7mm Breda-SAFAT MG", ":mass", "12.5kg", ":modifiers", "Auto", ":muzzlevelocity", "730m/s", ":rof", "850/min"),
            "8mm Breda M37 MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "8mm Breda M37 MG", ":image", "WWIIItalian/MG_8mmBredaM37.jpg", ":length", "1270mm", ":mass", "17.5kg", ":modifiers", "Auto", ":muzzlevelocity", "900m/s", ":range", "1000m", ":rof", "460/min"),
            "12.7mm Breda-SAFAT MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12.7mm Breda-SAFAT MG", ":mass", "12.5kg", ":modifiers", "Auto", ":muzzlevelocity", "765m/s", ":rof", "700/min"),
            "20mm Breda M35 Autocannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Breda M35 Autocannon", ":image", "WWIIItalian/Cannon_20mmBredaM35.jpg", ":length", "3.3m", ":mass", "330kg", ":modifiers", "Auto", ":muzzlevelocity", "840m/s", ":rof", "240/min"),
            "47mm Cannone da 47/32 M35",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "47mm Cannone da 47/32 M35", ":image", "WWIIItalian/Cannon_47mm_CannoneDa4732.jpg", ":mass", "277kg", ":modifiers", "AP, HE, HEAT", ":muzzlevelocity", "630m/s", ":range", "7000m"),
            "75mm Obice da 75/18 M34",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "75mm Obice da 75/18 M34", ":image", "WWIIItalian/Cannon_ObiceDa7518M34.jpg", ":mass", "1ton", ":modifiers", "AP, HE, HEAT", ":muzzlevelocity", "425m/s", ":range", "9564m")
          )
        ),
        "WWII Italian Infantry",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Italian Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Blackshirt",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Blackshirt",
              ":image",
              "WWIIItalian/Infantry_Blackshirt.png",
              ":reference",
              "* Fascist paramilitary groups in Italy.\n* Their methods became harsher as Mussolini's power grew, and they used violence, torture, intimidation, and murder against Mussolini's opponents. One of their distinctive techniques was force-feeding castor oil.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Black Brigade",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Black Brigade",
              ":image",
              "WWIIItalian/Infantry_BlackBrigade.png",
              ":reference",
              "* Italian dictator Benito Mussolini was arrested after the Italian Grand Council of Fascism, overthrew him and began negotiations with the Allies for Italy's withdrawal from the war. Mussolini was rescued by German paratroopers. He was then installed by the Germans as the President of the Italian Social Republic (RSI). The RSI was to be an Italian regime which was to nominally administer the German-occupied northern Italy. As the Blackshirts were disbanded by the terms of the armistice, the Black Brigade was formed out of those still loyal to the fascist cause.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Italian Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Italian Forward Observer",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        "WWII Italian Vehicles",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Italian Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Carro Armato L6/40",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Carro Armato L6/40",
              ":image",
              "WWIIItalian/TankLt_CarroArmatoL6Token.png",
              ":reference",
              "* Although a good light tank for its size, it was already obsolete by the time of its introduction. The low silhouette made it useful for reconnaissance, and its armament was effective against any light vehicles it may encounter. However, due to lack of suitable medium tanks, it was often employed in a combat role, for which it was unsuited.",
              ":classification",
              "Lt. Tank",
              ":crew",
              "2",
              ":mass",
              "6.6tons",
              ":height",
              "2m",
              ":length",
              "3.8m",
              ":range",
              "200km",
              ":speedland",
              "42kph",
              ":width",
              "2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "40mm", ":under", "6mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Carro Armato M13/40",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Carro Armato M13/40",
              ":image",
              "WWIIItalian/TankLt_M13CarroArmatoToken.png",
              ":classification",
              "Lt. Tank",
              ":crew",
              "4",
              ":mass",
              "14tons",
              ":height",
              "2.4m",
              ":length",
              "5m",
              ":range",
              "200km",
              ":speedland",
              "32kph",
              ":width",
              "2.2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "42mm", ":over", "15mm", ":under", "6mm", ":side", "25mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Semovente 47/32",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Semovente 47/32",
              ":image",
              "WWIIItalian/TD_Semovente47.png",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "3",
              ":mass",
              "6.4tons",
              ":height",
              "1.6m",
              ":length",
              "3.8m",
              ":range",
              "200km",
              ":speedland",
              "42kph",
              ":width",
              "2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "30mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Semovente 75/18",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Semovente 75/18",
              ":image",
              "WWIIItalian/TD_Semovente47.png",
              ":reference",
              "* Though it was technically similar to the StuG III, it had a totally different role, serving as divisional artillery instead of a pure assault gun. Though their role was divisional artillery, they could fire as indirect support, and if necessary, also act as an assault gun and anti-tank vehicle.",
              ":classification",
              "Artillery",
              ":crew",
              "3",
              ":mass",
              "14.4tons",
              ":height",
              "1.8m",
              ":length",
              "5m",
              ":range",
              "230km",
              ":speedland",
              "32kph",
              ":width",
              "2.2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "50mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        "WWII Italian Aircraft",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Italian Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Fiat G50",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Fiat G50",
              ":image",
              "WWIIItalian/Fighter_Fiat_G50Token.png",
              ":reference",
              "* In Africa, Italian pilots flying the G.50 managed to shoot down the faster and better armed Hurricane fighter.\n* In the hands of expert pilots, the Fiat G.50 could score multiple kills in a single action",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "2.7tons",
              ":height",
              "3m",
              ":length",
              "7.8m",
              ":range",
              "670km",
              ":speedair",
              "484kph",
              ":width",
              "11m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Fiat CR.42 Falco",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Fiat CR.42 Falco",
              ":summary",
              "* The primary fighter of the Italian Air Force at the outbreak of the war. Although outdated by monoplane fighters, it still acquitted itself well in North Africa until the advent of more advanced Allied fighters. The Fiat CR.42 was the last of the Fiat biplane fighters to enter frontline service as a fighter, and represented the epitome of the type.",
              ":titles",
              "Falcon",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "2.3tons",
              ":height",
              "3.6m",
              ":length",
              "8.25m",
              ":range",
              "780km",
              ":speedair",
              "441kph",
              ":width",
              "9.7m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Savoia-Marchetti SM.81",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Savoia-Marchetti SM.81",
              ":summary",
              "* Bomber\n* Despite being too slow to remain competitive as a bomber, it was one of the most flexible, reliable and important aircraft of the Regia Aeronautica from 1935 to 1944, and adapted to second line duties in performing a wide range of tasks.",
              ":classification",
              "Hvy. Aircraft",
              ":crew",
              "6",
              ":mass",
              "10.5tons",
              ":height",
              "4.3m",
              ":length",
              "18.3m",
              ":range",
              "1500km",
              ":speedair",
              "347kph",
              ":width",
              "24m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "3mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_japanese_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_japanese_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_japanese_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_japanese_equipment
  }

  // (func chapter_wwii_japanese_equipment)
  static f_chapter_wwii_japanese_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Japanese Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII Japanese Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Japanese Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "8mm Type 94",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "8mm Type 94", ":reference", "* The gun became notorious for a design flaw that allowed it to be fired with a round in the chamber by pressing a projecting sear on the side of the receiver. The gun was a commercial failure, and is frequently described as the 'worst service pistol ever issued'", ":summary", "8mm Semiautomatic Pistol", ":classification", "Pistol"),
            "6.5mm Type 97",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "6.5mm Type 97", ":summary", "Bolt Action Sniper Rifle", ":classification", "Rifle"),
            "7.7mm Type 99",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.7mm Type 99", ":image", "WWIIJapanese/Rifle_ArisakaType99.jpg", ":reference", "* As a bolt action rifle, the Type 99 was a very solid weapon, but was completely outclassed by the semi-automatic rifles deployed by the Allies.", ":summary", "Bolt Action Rifle", ":classification", "Rifle"),
            "6.5mm Type 96 LMG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "6.5mm Type 96 LMG", ":classification", "Lt. MG", ":modifiers", "Auto, +1 Prepare"),
            "7.7mm Type 97 MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.7mm Type 97 MG", ":classification", "Lt. MG", ":modifiers", "Auto, +1 Prepare"),
            "Type 93 Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Type 93 Flamethrower", ":classification", "Flamethrower", ":crew", "2", ":mass", "26kg", ":modifiers", "Fire, Auto", ":range", "20m"),
            "13mm Type 93 AA",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "13mm Type 93 AA", ":classification", "Hvy. MG", ":length", "1.4m", ":mass", "42kg", ":muzzlevelocity", "805m/s", ":rof", "250/min"),
            "20mm Type 99 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm Type 99 Cannon", ":image", "WWIIJapanese/Cannon_20mmType99.jpg", ":classification", "Cannon", ":length", "1.3m", ":mass", "23kg", ":modifiers", "Auto", ":muzzlevelocity", "600m/s", ":rof", "520/min"),
            "25mm Type 96 Autocannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "25mm Type 96 Autocannon", ":image", "WWIIJapanese/Autocannon_25mmType96.jpg", ":reference", "* The Type 96 was the standard medium antiaircraft weapon of the Imperial Japanese Navy, and was used on virtually every warship in combat in World War II. It was also used in land bases in the Japanese Empire and in the Japanese overseas combat fronts.", ":classification", "Cannon", ":crew", "3", ":length", "1.5m", ":mass", "785kg", ":modifiers", "Auto", ":muzzlevelocity", "900m/s", ":range", "6.8km", ":rof", "110/min"),
            "37mm Type 94 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "37mm Type 94 Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "57mm Type 97 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "57mm Type 97 Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "76mm/60 Type 98 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "76mm/60 Type 98 Cannon", ":classification", "Cannon", ":length", "4.7m", ":mass", "1.3tons", ":muzzlevelocity", "910m/s", ":rof", "25"),
            "127mm/45 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "127mm/45 Cannon", ":image", "WWIIJapanese/Cannon_127mm45.jpg", ":classification", "Cannon", ":length", "5.5m", ":mass", "3.1tons", ":muzzlevelocity", "825m/s", ":rof", "5/min"),
            "155mm/60 Naval Artillery",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "155mm/60 Naval Artillery", ":classification", "Cannon", ":length", "9.6m", ":mass", "12.5tons", ":muzzlevelocity", "920m/s", ":rof", "5/min"),
            "200mm/50 Naval Artillery",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "200mm/50 Naval Artillery", ":classification", "Cannon", ":length", "10m", ":mass", "18tons", ":muzzlevelocity", "835m/s", ":range", "29km", ":rof", "4/min"),
            "460mm/45 Naval Artillery",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "460mm/45 Naval Artillery", ":reference", "* The 460mm / 18.1 in gun fired 1.36 ton shells.", ":classification", "Cannon", ":length", "21m", ":mass", "164tons", ":muzzlevelocity", "780m/s", ":range", "42km", ":rof", "2/min"),
            "Torpedo Type 91",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Torpedo Type 91", ":image", "WWIIJapanese/Torpedo_Type91.jpg", ":summary", "* Aerial Torpedo", ":classification", "Torpedo", ":explosive", "235kg", ":length", "5.2m", ":mass", ".85tons", ":range", "2km", ":speedwater", "78kph"),
            "Torpedo Type 93 Long Lance",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Torpedo Type 93 Long Lance", ":image", "WWIIJapanese/Torpedo_Type93LongLance.jpg", ":reference", "* Japanese destroyers and cruisers were able to launch their torpedoes from about 20 km at the unsuspecting Allied warships. The Allied warships were expecting enemy torpedoes to be fired at less than 10 km, their own torpedo range. The Allies believed these torpedoes had been fired from Japanese submarines. The capabilities of the Type 93 went mostly unrecognized by the Allies until one was captured intact in 1943.", ":classification", "Torpedo", ":explosive", "490kg", ":length", "9m", ":mass", "2.8tons", ":range", "22km", ":speedwater", "90kph"),
            "Torpedo Type 95",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Torpedo Type 95", ":reference", "* Based on the formidable Type 93 Long Lance, the Type 95 was the fasted torpedo in use by any navy at the time.\n* It is 3x the range of the American Mark 14 with the same speed.\n* Its warhead was the largest of any submarine torpedo and second only to the Type 93 surface torpedo.\n* Some have claimed this to be the best torpedo of WWII.", ":classification", "Torpedo", ":explosive", "405kg", ":range", "9km", ":speedwater", "92kph"),
            "Kaiten Kamikaze Torpedo",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Kaiten Kamikaze Torpedo", ":reference", "* Early designs allowed the pilot to escape after the final acceleration toward the target, although whether this could have been done successfully is doubtful. There is no record of any pilot attempting to escape or intending to do so, and this provision was dropped from later production.\n* Kaiten attacks resulted in sinking only two American vessels with the loss of 162 American lives, in comparison to 106 kaiten pilots who lost their lives.", ":classification", "Torpedo", ":explosive", "1.4tons", ":length", "15m", ":mass", "8.3tons", ":range", "78km", ":speedwater", "56kph")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_japanese_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_japanese_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_japanese_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_japanese_units
  }

  // (func chapter_wwii_japanese_units)
  static f_chapter_wwii_japanese_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Japanese Units",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Japanese Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Arisaka Riflemen",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Arisaka Riflemen",
              ":image",
              "WWIIJapanese/Infantry_RiflemenToken.png",
              ":summary",
              "Composed of 7 riflemen",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "Japanese LMG",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Japanese LMG",
              ":summary",
              "Composed of 4 riflemen, 1 LMG, and squad leader",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Arisaka Sniper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Arisaka Sniper",
              ":image",
              "WWIIJapanese/Infantry_Sniper.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Special Naval Landing Forces",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Special Naval Landing Forces",
              ":titles",
              "SNLF",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Amphibious Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Amphibious Assault")
                  )
                )
              )
            ),
            "Teishin Shudan",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Teishin Shudan",
              ":image",
              "WWIIJapanese/Infantry_ParatrooperToken.png",
              ":reference",
              "Commando Paratroopers",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Airborne Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Airborne Assault")
                  )
                )
              )
            ),
            "Japanese Commander",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Japanese Commander",
              ":image",
              "WWIIJapanese/Infantry_CommanderToken.png",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "5",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "Japanese Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Japanese Forward Observer",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Japanese Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Type 95 Ha-Go",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Type 95 Ha-Go",
              ":image",
              "WWIIJapanese/TankLt_Type95Ha-go_Token.png",
              ":reference",
              "* One key to the Japanese success in Malaya was the unexpected presence of their tanks in wet jungle terrain where the British did not believe tanks could be used.",
              ":classification",
              "Lt. Tank",
              ":crew",
              "3",
              ":mass",
              "7.4tons",
              ":length",
              "4.4m",
              ":range",
              "250km",
              ":speedland",
              "45kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Type 97 Chi-Ha",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Type 97 Chi-Ha",
              ":image",
              "WWIIJapanese/TankMed_Type97ChiHa.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "4",
              ":mass",
              "16tons",
              ":length",
              "5.5m",
              ":range",
              "210km",
              ":speedland",
              "38kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "33mm", ":side", "9mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Japanese Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "J2M Raiden Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "J2M Raiden Fighter",
              ":image",
              "WWIIJapanese/Fighter_J2M3_Raiden_Token.png",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.5tons",
              ":height",
              "3.8m",
              ":length",
              "9.7m",
              ":range",
              "560km",
              ":speedair",
              "612kph",
              ":width",
              "10.8m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "A6M Zero Naval Fighter",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "A6M Zero Naval Fighter",
              ":image",
              "WWIIJapanese/FighterNavy_A6M5_Zero_Token.png",
              ":reference",
              "* Designed for attack, the Zero gave precedence to maneuverability and firepower at the expense of protection\n* When it was introduced, the Zero was the best carrier-based fighter in the world and it was greatly feared by Allied pilots. Excellent maneuverability and very long range made it one of the finest fighters of its era. By 1943, the allies produced more powerful fighters and the A6M became obsolete.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "2.4tons",
              ":height",
              "3m",
              ":length",
              "9m",
              ":range",
              "3105km",
              ":speedair",
              "533kph",
              ":width",
              "12m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "4mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "B5N Kate Torpedo Bomber",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "B5N Kate Torpedo Bomber",
              ":image",
              "WWIIJapanese/TorpedoBomber_B5N1_Kate_Token.png",
              ":reference",
              "* High performance but little armor\n* Torpedo may be replaced with 3x 250kg Bombs or 6x 60kg Bombs",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "3",
              ":mass",
              "3.8tons",
              ":height",
              "3.7m",
              ":length",
              "10.3m",
              ":range",
              "1992km",
              ":speedair",
              "378kph",
              ":width",
              "15.5m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "D3A Val Dive Bomber",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "D3A Val Dive Bomber",
              ":image",
              "WWIIJapanese/DiveBomber_D3A1_VALToken.png",
              ":reference",
              "* Scored over 80% hits in Indian Ocean vs British\n* Able to survive as a fighter\n* Could replace 250kg Bomb with 2x 60kg Bombs",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "2",
              ":mass",
              "3.6tons",
              ":height",
              "3.9m",
              ":length",
              "10.2m",
              ":range",
              "1352km",
              ":speedair",
              "430kph",
              ":width",
              "14.4m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "8mm", ":back", "8mm", ":over", "8mm", ":side", "8mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Ohka Kamikaze Rocket",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Ohka Kamikaze Rocket",
              ":image",
              "WWIIJapanese/KamikazeRocket_Ohka_Token.png",
              ":reference",
              "* Essentially a 1,200 kg bomb with wooden wings powered by three solid-fuel rocket motors, the Type 11 achieved great speed but with limited range. This was problematic, as it required the slow, heavily-laden mother aircraft to approach within 37 km of the target, making them very vulnerable to defending fighters.\n* Seven US ships were damaged or sunk by Ohkas throughout the war.",
              ":classification",
              "Missile",
              ":crew",
              "1",
              ":mass",
              "2.14tons",
              ":height",
              "1.2m",
              ":length",
              "6.1m",
              ":range",
              "36km",
              ":speedair",
              "804kph",
              ":width",
              "5.1m",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "A6M2 Rufe Seaplane",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "A6M2 Rufe Seaplane",
              ":image",
              "WWIIJapanese/Seaplane_A6M2_Rufe_Token.png",
              ":reference",
              "* This floatplane was developed from the A6M Zero for supporting amphibian operations and defending remote bases.",
              ":crew",
              "1",
              ":mass",
              "2.5tons",
              ":height",
              "4.3m",
              ":length",
              "10.1m",
              ":range",
              "1782km",
              ":speedair",
              "516kph",
              ":width",
              "12m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "4mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Japanese Naval Vessels",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Kaga Class Converted Carrier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kaga Class Converted Carrier",
              ":image",
              "WWIIJapanese/Carrier_KagaToken.png",
              ":summary",
              "Akagi carried - 21 Zeros, 21 Vals, and 21 Kates",
              ":titles",
              "Kaga, Akagi",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "2016",
              ":mass",
              "38.8ktons",
              ":length",
              "247m",
              ":range",
              "18520km",
              ":speedwater",
              "52kph",
              ":width",
              "32m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "152mm", ":back", "152mm", ":over", "152mm", ":under", "152mm", ":side", "152mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Soryu Class Fast Carrier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soryu Class Fast Carrier",
              ":image",
              "WWIIJapanese/Carrier_Hiryu.png",
              ":titles",
              "Hiryu, Soryu",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "1103",
              ":mass",
              "19.5ktons",
              ":length",
              "222m",
              ":range",
              "14000km",
              ":speedwater",
              "64kph",
              ":width",
              "21m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "45mm", ":back", "45mm", ":over", "25mm", ":under", "45mm", ":side", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Fubuki Class Destroyer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Fubuki Class Destroyer",
              ":image",
              "WWIIJapanese/Destroyer_Akatsuki_Token.png",
              ":reference",
              "* Has been called 'the world's first modern destroyer.' It set a new standard for destroyers around the world. The Japanese destroyers were bigger, more powerfully armed, and faster than anything that any other fleet possessed.",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "219",
              ":mass",
              "2ktons",
              ":length",
              "118m",
              ":range",
              "9200km",
              ":speedwater",
              "70kph",
              ":width",
              "10m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm", ":back", "10mm", ":over", "10mm", ":under", "10mm", ":side", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Agano Class Light Cruiser",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Agano Class Light Cruiser",
              ":image",
              "WWIIJapanese/CruiserLt_Noshiro_Token.png",
              ":classification",
              "Med. Naval Vessel",
              ":crew",
              "726",
              ":mass",
              "7.6ktons",
              ":length",
              "162m",
              ":range",
              "11000km",
              ":speedwater",
              "67kph",
              ":width",
              "15.2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "60mm", ":over", "20mm", ":under", "60mm", ":side", "60mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Tone Class Hvy. Cruiser",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Tone Class Hvy. Cruiser",
              ":image",
              "WWIIJapanese/CruiserHvy_Furutaka_Token.png",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "874",
              ":mass",
              "11ktons",
              ":length",
              "189m",
              ":range",
              "1852km",
              ":speedwater",
              "67kph",
              ":width",
              "19m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "100mm", ":over", "35mm", ":under", "100mm", ":side", "100mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Yamato Class Battleship",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yamato Class Battleship",
              ":image",
              "WWIIJapanese/Battleship_YamatoToken.png",
              ":reference",
              "* Largest battleships ever built with largest naval guns ever. Yamato sank after 8 bombs and 13 torpedos caused her magazine to explode.",
              ":classification",
              "Hvy. Naval Vessel",
              ":crew",
              "2767",
              ":mass",
              "72ktons",
              ":length",
              "263m",
              ":range",
              "13000km",
              ":speedwater",
              "50kph",
              ":width",
              "39m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "650mm", ":over", "200mm", ":side", "410mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Otori Class Torpedo Boat",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Otori Class Torpedo Boat",
              ":image",
              "WWIIJapanese/TorpedoBoat_MitsubishiT14_Token.png",
              ":classification",
              "Lt. Naval Vessel",
              ":crew",
              "129",
              ":mass",
              "960tons",
              ":length",
              "88.5m",
              ":range",
              "7400km",
              ":speedwater",
              "56kph",
              ":width",
              "8.2m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "B1 Type Submarine Carrier",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "B1 Type Submarine Carrier",
              ":image",
              "WWIIJapanese/Submarine_I29Token.png",
              ":reference",
              "* 15kph Submerged\n* 100m Test Depth\n* Fast, very long ranged, and carried a single Yokosuka E14Y seaplane, located in a hangar in front of the conning tower, launched by a catapult.\n* A submarine could be equipped with 3-6 Kaiten torpedoes on the deck, but this limited dive depth.",
              ":titles",
              "I-15 Series",
              ":classification",
              "Submarine",
              ":crew",
              "94",
              ":mass",
              "3654tons",
              ":length",
              "108m",
              ":range",
              "26000km",
              ":speedwater",
              "44kph",
              ":width",
              "9.3m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Kaidai VII Submarine",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Kaidai VII Submarine",
              ":reference",
              "* 15kph Submerged\n* 80m Test Depth",
              ":classification",
              "Submarine",
              ":crew",
              "86",
              ":mass",
              "2.6ktons",
              ":length",
              "105m",
              ":range",
              "15000km",
              ":speedwater",
              "43kph",
              ":width",
              "8.25m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_mediterranean_theatre
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_mediterranean_theatre = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_mediterranean_theatre = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_mediterranean_theatre
  }

  // (func chapter_wwii_mediterranean_theatre)
  static f_chapter_wwii_mediterranean_theatre(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Mediterranean Theatre",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Italian Campaign Overview",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Italian Campaign Overview", ":summary", "* The US and British disagreed fiercely on how to prosecute the war. The US argued for an invasion of France as early as possible, while the British advocated a Mediterranean strategy since large numbers of troops trained for amphibious landings in the Mediterranean made a limited-scale invasion possible. Eventually the US and British made the decision to commit to an invasion of France in early 1944, but with a lower-priority Italian campaign reflecting Roosevelt's desire that to keep U.S. troops active in the European theater during 1943 and his attraction to the idea of eliminating Italy from the war.\n* It was hoped that an invasion would knock the Italians out of the war, or provide at least a major propaganda blow. The elimination of Italy as an enemy would also enable the Royal Navy to completely dominate the Mediterranean Sea, massively improving communications with Egypt, the Far East, the Middle East, and India. It would also mean that the Germans would have to transfer troops from the Eastern Front to defend Italy and the entire southern coast of France, thus aiding the Soviets. The Italians would also withdraw their troops from the Soviet Union to defend Italy.\n* It is estimated that between September 1943 and April 1945 some 60,000 Allied and 50,000 German soldiers died in Italy. No campaign in western Europe cost more than Italy, in terms of lives lost and wounds suffered by infantry."),
        "Invasion of Sicily",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Invasion of Sicily",
          ":summary",
          "* On July 9, 1943, the Allies invaded Sicily. It was the largest amphibious operation of the war in terms of men landed on the beaches and of frontage. It opened the Mediterranean sea lanes and toppled Mussolini from power.\n* Operation Mincemeat - A corpse disguised as a British officer was allowed to drift ashore in Spain, carrying a briefcase containing fake secret documents. These documents revealed that the Allies were planning to invade Greece, and had no plans to invade Sicily. The documents were accepted as genuine by German intelligence, and as a result much German defensive effort was diverted from Sicily to Greece.\n* On August 7, 1943, the Axis forces were outflanked and raced for transport ships under the cover of night. The Allies weren't watching the Axis troops, so they escaped from Messina and reached Italy. Considering Allied naval and air superiority, to not prevent an Axis escape from Sicily was a major strategic blunder. Instead of a major Axis defeat, it started a long and bloody campaign.\n* The Axis lost 29,000 lives and 140,000 (mostly Italians) captured. The Allies lost 8,000 lives.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Invasion of Sicily",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Invasion of Sicily",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":forces", "* 160,000 personnel (U.S., British, Canadian, Free French, Australian, South African)\n* 14,000 vehicles\n* 600 tanks\n* 1,800 guns"),
                "Axis Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Axis Forces", ":forces", "* 275,000 Italian personnel\n* 75,000 German personnel\n* 260 Tanks\n* 1,400 aircraft")
              )
            )
          )
        ),
        "Invasion of Italy",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Invasion of Italy",
          ":summary",
          "* A coup deposed Benito Mussolini as head of the Italian government, which then began approaching the Allies to make peace. It was believed a quick invasion of Italy might hasten an Italian surrender and produce quick military victories over the German troops that could be trapped fighting in a hostile country. However, Italian and German resistance proved relatively strong, and fighting in Italy continued even after the fall of Berlin. In addition, the invasion left the Allies in a position of supplying food and supplies to conquered territory, a burden which would otherwise have fallen on Germany. As well, Italy occupied by a hostile German army would have created additional problems for the Germans.\n* On September 8, 1943, before the main invasion, the surrender of Italy to the Allies was announced. Italian units ceased combat, and the Navy sailed to Allied ports to surrender. However the German forces in Italy were prepared and moved to disarm Italian units and occupy important defensive positions.\n* On September 9, 1943, the invasion began easily on the beaches near Salerno. The Germans counterattacked several times and inflicted heavy losses. The Germans came close to defeating the Salerno beachhead. Despite using six	divisions of tanks and mechanized infantry, the German attacks had not had sufficient forces to both break through Allied lines and exploit the gains in the face of Allied artillery and naval gunfire support. The Allies had been fortunate that at this time Adolf Hitler had sided with the view of his Army Group commander in Northern Italy, Field Marshall Erwin Rommel, and decided that defending Italy south of Rome was not a strategic priority.\n* By early October, all of Southern Italy was in Allied hands.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Invasion of Italy",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Invasion of Italy",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":forces", "* 190,000 Personnel (U.S., British, Canadian, Indian)"),
                "Axis Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Axis Forces", ":forces", "* 100,000 Personnel (Italian and German)")
              )
            )
          )
        ),
        "Advance to Rome",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Advance to Rome", ":summary", "* Kesselring was given command of the whole of Italy and immediately ordered the preparation of a series of defensive lines across Italy south of Rome. Two lines, the Volturno Line and the Barbara Line, were used to delay the Allied advance to buy time to prepare the most formidable defensive positions which formed the Winter Line, the collective name for the Gustav Line and two associated defensive lines on the west of the Apennine mountains, the Bernhardt Line and the Hitler Line. The Winter Line proved a major obstacle to the Allies at the end of 1943, halting their advance on the Fifth Army's front, the western side of Italy.\n* Although the Gustav Line was penetrated on the Eighth Army's Adriatic front and Ortona taken, blizzards, drifting snow and zero visibility at the end of December caused the advance to grind to a halt.\n* The Allies focus then turned to the western front where an attack through the Liri valley was considered to have the best chance of a breakthrough towards Rome. Landings at Anzio behind the line were intended to destabilise the German Gustav line defenses, but the hoped for early thrust inland to cut the German defenses off did not occur and the Anzio forces became bottled up in their beach head.\n* It took four major offensives between January and May 1944 before the line was eventually broken along a twenty mile front between Monte Cassino and the western seaboard. At the same time the forces at Anzio broke out of their beachhead but an opportunity to cut off and destroy a large part of the German Tenth Army retreating from the Gustav Line was lost when, on the brink of success, the Anzio forces changed their direction of attack to move parallel with the coast to capture Rome.\n* Rome	was declared an open city by the German army and the US forces took possession on June 4."),
        "Advance to Northern Italy",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Advance to Northern Italy", ":summary", "* After the capture of Rome and the Normandy Invasion in June many experienced American and French units, the equivalent of a total of 7 divisions, were pulled out of Italy during the summer of 1944 to participate in Operation Dragoon, the Allied invasion in the south of France.\n* Churchill had hoped that a breakthrough in the autumn of 1944 would open the way for the Allied armies to advance to Vienna and Hungary to forestall the Russians advancing into Eastern Europe. Churchill's proposal had been strongly opposed by the US Chiefs of Staff who understood its importance to British post-war interests in the region but did not feel it aligned with prevailing overall Allied war priorities.\n* Continuation of the Allied offensive in early 1945 was made impractical by the poor winter weather (making armoured manoeuver and exploitation of overwhelming air superiority impossible).\n* On April 9, 1945, the Allies' final offensive commenced with massive aerial and artillery bombardments.\n* As April came to an end, the Axis forces in Italy, retreating on all fronts and having lost most of its fighting powers, was left with little option but surrender.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_middle_east_theatre
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_middle_east_theatre = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_middle_east_theatre = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_middle_east_theatre
  }

  // (func chapter_wwii_middle_east_theatre)
  static f_chapter_wwii_middle_east_theatre(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Middle East Theatre",
      ":summary",
      "* Although Southwest Asia was destined to remain a strategic backwater for the duration of World War II, in late 1941 and early 1942 the Allies were not certain that it would remain so. Before the turning points of the Battle of Stalingrad (June 1942 to February, 1943) and the Second Battle of El Alamein (October to November 1942), the fear was that the Germans might attack the area either through Turkey, or via Cyprus into Lebanon; or through defeating of the British in Egypt. If the anticipated attack came through Turkey or Lebanon, then not only could the Axis Powers threaten British controlled Egypt and the strategically important Suez Canal, it would also allow the Germans an alternative route to attack the Soviet Union from Southwest Asia north through the USSR's southern frontiers. In the slightly longer term the British feared independent regimes in the region as well as the possibility that the German might follow in Alexander the Great's footsteps and attack British controlled India from Persia in the west as Japan simultaneously attacked India from the east through Burma.",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Anglo-Iraqi War",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Anglo-Iraqi War", ":summary", "* Iraq had been officially granted independence by the United Kingdom in 1932, under a number of conditions, including the retention of British military bases. This caused resentment within Iraq and a pro-Axis prime minister assumed control. In early 1941, he ordered British forces to withdraw. On April 30 the Iraqi Army surrounded and besieged the isolated and poorly-defended Royal Air Force base at Habbaniya. Although the base had no offensive aircraft, RAF personnel converted training aircraft to carry weapons, and attacked the Iraqi forces.\n* The British counterattacked and defeated the larger but poorly-trained Iraqi Army in a series of battles, even though the Iraqis received direct aid from the Luftwaffe. The British pressed on to Baghdad and then to Mosul. The prime minister and his supporters fled the country and an armistice was signed."),
        "Syria-Lebanon Campaign",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Syria-Lebanon Campaign",
          ":summary",
          "* On June-July 1941, the British led Allies invaded Vichy French-controlled Syria and Lebanon. The campaign remains little known, even in the countries that took part. There is evidence that Allied censors acted to suppress or reduce reportage of the fierce fighting believing that knowledge of fighting against French forces could have a negative effect on public opinion in Allied countries.\n* The Vichy French forces lost approximately 6,000 men. Of these, roughly 1,000 had been killed. This left 37,736 Vichy French prisoners of war. But, when given the choice of being repatriated to France or joining the Free French, only 5,668 men chose to join the forces of General Charles De Gaulle.\n* On November 26, 1941, the independence of Syria and Lebanon were recognized in the name of the Free French movment.\n* On February 26-27, 1945, Syria and Lebanon each declared war on Germany and Japan.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            ":Syria-Lebanon",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Syria-Lebanon",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Iranforce",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Iranforce", ":deploy", "1) Objective: City of Queneitra and City of Deraa in Damascus\n2) Objective: City of Beirut in Beirut\n3) Objective: City of Palmyra and Oil Pipeline in Central Syria\n4) Deploy forces at edge of board", ":forces", "* 18,000 - Australian\n* 9,000 - British\n* 2,000 - Indian\n* 5,000 - Free French\n* 3 - Artillery Groups\n* 70 Aircraft - Hawker Hurricanes, Tomahawks"),
                "Vichy French*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Vichy French*", ":deploy", "1) Deploy Middle East Strategic Map\n2) Objective: Supply Line and Railway near Beirut at end of Euphrates River in Northern Syria\n3) Deploy forces anywhere on map", ":forces", "* 8,000 - French Foreign Legion\n* 20,000 - Syrian/Lebanese\n* 5,000 - Horse and Motorized Cavalry\n* 2 - Artillery Groups\n* 100 Aircraft - Dewoitine 520, Potez 63")
              )
            )
          )
        ),
        "Anglo-Soviet Invasion of Iran",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Anglo-Soviet Invasion of Iran", ":summary", "* On August 25, 1941, Britain and Russia launched an invasion of the neutral nation of Iran. The British feared that the Anglo-Iranian Oil Company might fall into German hands. The refinery produced 8 million tons of oil and was a crucial part of the Allied war effort. For the Russians, Iran was a country of extreme strategic importance. The Germans were steadily advancing through the Soviet Union and there were few ways for the Allies to get desperately needed American Lend-Lease supplies to the Soviets. With increasing German submarine attacks, as well as heavy ice floes and the coastal ice cap fast rendering convoys to Arkhangelsk impossible, the Trans-Iranian Railway seemed a very attractive route to transport supplies up from the Persian Gulf. The two Allied nations applied pressure on Iran and the Shah but this led only to increased tensions and pro-German rallies in Tehran. The Shah refused to expel the many German nationals residing in Iran, and denied the use of the railway to the Allies. These conditions prompted Britain and Russia to invade.\n* Franklin Roosevelt reassured the Shah by claiming that the British and Soviets had no designs on the itegrity of Iran. However, the Soviets would later back separatist states in the north, while the U.S. and UK would later support the overthrow of the popular and democratically elected Iranian Prime Minister in 1953.\n* With this crucial supply route now open to the Soviet Union the Persian Corridor was opened and would provide a massive flow of supplies (over 5 million tons of war materiel) to the Soviets primarily, but also the British in the Middle East.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_north_african_theatre
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_north_african_theatre = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_north_african_theatre = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_north_african_theatre
  }

  // (func chapter_wwii_north_african_theatre)
  static f_chapter_wwii_north_african_theatre(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII North African Theatre",
      ":summary",
      "* On August 8, 1940, Benito Mussolini, anxious to link Libya with Italian East Africa and to capture the Suez Canal and the Arabian oilfields, ordered the invasion of Egypt. Italian forces invaded Egypt from their base in Cyrenaica, Libya. This invasion was repulsed later in the year during Operation Compass.\n* Initially the Commonwealth forces, under General Archibald Wavell, fought a successful campaign in the desert west of Egypt. While the fighting was taking place in Libya, Axis forces attacked Greece. General Wavell was ordered to halt his advance against the Italian Army in Libya and send troops to Greece. He disagreed with this decision but followed his orders.\n* The Allies were unable to stop Greece falling to the Axis forces and before they could retake the initiative in the western desert the German Afrika Korps led by Erwin Rommel had entered the theatre.\n* It would not be until early in 1943, after another year and a half of hard fighting and mixed fortunes, that the Axis forces would be finally driven out of Libya.\n* On November 8, 1942, the U.S. had entered the war beginning with amphibious landing in northwest Africa, codenamed Operation Torch, under the Supreme Allied Commander General Dwight D. Eisenhower.",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Invasion of Egypt",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Invasion of Egypt", ":summary", "On September 13, 1940, Italy invaded Egypt with 200,000 troops from Libya."),
        "Operation Compass",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Operation Compass", ":summary", "* The Allies had only 36,000 men, but nevertheless launched a counter-attack. The Italians had 150,000 troops and tanks were evenly divided between the mechanically reliable but machine gun-armed Fiat L3s tankettes and the heavier Fiat M11/39. This tank featured a hull-mounted 37 mm tank gun which was difficult to bring to bear on targets because of its lack of available traverse, was relatively poorly armored and was mechanically unreliable. In comparison, the British were able to field some faster Cruiser tanks (the Mk I, Mk II, and Mk III) which were more than match to the M11/39s. The British also had a limited number of heavy Matilda Infantry tanks that, while slow, were strongly armored and well armed. The armour of the Matilda tanks could not be pierced by any of the available Italian tank guns or anti-tank guns available at that time though Italian anti-aircraft guns could be used against them in the same manner as the German 88mm.\n* On December 18, 1940, British and Indian infantry and 48 Matilda tanks suddenly appeared outside the Italian Nibeiwa Camp. They struck twenty-three unmanned M11/39 tanks of the Maletti Group, which had been deployed to guard the unmined entrance to the camp. The Italians were caught completely off guard and many did not even reach their tanks, including General Maletti, who was killed emerging from his dugout. They were slaughtered and their vehicles destroyed by the British in less than ten minutes.\n* The Italian artillery fought on valiantly, firing on the Matildas and recording many hits, some at point-blank range - but none penetrated their 70mm of armour. The remaining Italian tanks were captured intact, and the Libyan infantry, left practically defenceless, quickly surrendered.\n* The British had captured Nibeiwa and destroyed the only front-line Italian armoured unit in less than five hours. After the disaster, the Italian General was replaced.\n* As the Commonwealth forces advanced, several large Italian units were surrounded, cut off from supply, and defeated. After some hard fighting, one position after another surrendered."),
        ":Bardia",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Bardia", ":reference", "* Never has so much been surrendered by so many to so few. - Anthony Eden\n* In this theatre of operations a single armoured division is more important than an entire [infantry] army. - Rodolfo Graziani writing to Mussolini after his defeat", ":summary", "* On January 4, 1941, an Australian division was to assault Bardia and found themselves under continuous mortar and artillery fire and found it best to keep skirmishing forward instead of stopping and enduring artillery. Italian morale was broken, worn down by six weeks of aerial and naval bombardment.\n* The Australians captured Bardia taking 45,000 prisoners, 462 guns, 12 medium tanks, 115 tankettes and 708 vehicles with a loss of 130 dead."),
        ":Tobruk",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Tobruk", ":summary", "* On January 22, 1941, the Australians briefly captured Tobruk, yielding over 25,000 prisoners along with 236 field and medium guns, 23 medium tanks and more than 200 other vehicles. The Australian losses were 49 dead. The British began bombarding the remaining Italian positions.\n* On January 26, 1941, during the night it was hoped that a surrender could be brokered, but Mussolini himself forbid the generals from surrender. Later that night Italian SM 79's carried out a surprise low-level attack which accidentally bombed 8,000 Italian prisoners killing and wounding hundreds of their own men. This bombing broke the will of the Italians and that afternoon they surrendered.\n* 25,000 Italians and 400 Australians had been killed."),
        "Battle of Beda Fomm",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Beda Fomm", ":summary", "* On February 6, 1941, the Combe Force consisting of 2,000 men and (for the sake of speed) only light and Cruiser tanks managed to hold off 20,000 Italian soldiers supported by over 100 tanks and 200 guns. The Italian tanks were the newly arrived Fiat M13/40 medium tanks which were a vast improvement to the M11's.\n* The fighting was close and often hand to hand. At one point, a regimental sergeant major captured an Italian light tank by hitting the commander over the head with a rifle-butt.\n* Soon British and Australian reinforcements arrived and the Italians surrendered."),
        "Aftermath of Beda Fomm",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Aftermath of Beda Fomm", ":summary", "* After 10 weeks the Italian Tenth Army was no more. The British and Commonwealth forces had advanced 800km, destroyed or captured 400 tanks and 1290 artillery pieces, and captured 130,000 Libyan and Italian Prisoners of war. Their prisoners included 22 generals. The Commonwealth forces suffered 494 dead and 1,225 wounded.\n* However the advance stopped short of driving the Italians out of North Africa. As the advance reached El Agheila, Churchill ordered that it be stopped, and troops dispatched to defend Greece which was being attacked by Italy."),
        ":Rommel",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Rommel", ":summary", "* The stunning defeat of the Italians did not go unnoticed and fresh Italian troops together with German troops, the Deutsches Afrikakorps under Erwin Rommel were sent in to reinforce the Italian forces in western Libya. Although Rommel had been ordered to simply hold the line, an armoured reconnaissance soon became a fully fledged offensive."),
        "Operation Torch",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Operation Torch", ":summary", "* On November 8, 1942, Allied forces landed in Vichy held French North Africa where they were met with bloody resistance in Oran and Morocco, but in Algiers a coup d'etat by the French resistance on November 8 succeeded in neutralizing the defense before the landing, and arresting the Vichy commanders. Oran and Morocco were then convinced to cease resistance with the proviso that the Vichy Admiral Darlan would be head of the Free French administration. The Vichy army joined the Allies and formed the Free French Forces.\n* On December 24, Darlan was assassinated for his collaboration with the Nazis."),
        "Western Desert Campaign",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Western Desert Campaign", ":summary", "* The Western Desert Campaign, also known as the Desert War was the initial stage of the North African Campaign. The Axis powers had planned to dominate the Mediterranean through control of Gibraltar and the Suez Canal and planned to follow a successful campaign in North Africa with a strike north to the rich oil fields of the Middle East. This would have cut off nearby oil supplies to the Allies, and would have tremendously increased the oil supplies available for the Axis war machine.\n* By 1942, the campaign was heavily influenced by the availability of supplies and transport. Large quantities of supplies were becoming available form the United States. The British and Italian navies were evenly matched in the Mediterranean, but the British retention of Malta allowed the RAF to interdict an increasing amount of Italian supplies at sea denying the German commander, Rommel, fuel and reinforcements at critical moments."),
        ":Jefria",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Jefria", ":summary", "* On November 24, two Allied columns prepared to advance from Djebel Abiod.\n* The Blade Force made a lightning attack with tanks and destroyed more than 20 Axis planes, buildings, and supply dumps.\n* The northern force was delayed by torrential rain, but the Germans had used the extra time to create an ambush position on the road at Jefna. The Germans occupied high ground on either side of the road, which after the recent heavy rains was very muddy and the ground on either side impassable for vehicles.\n* The ambush worked perfectly with the leading battalion taking 149 casualties. Units were sent into the hills to try to flush the Germans out but the stubborn resistance of the paratroopers combined with the cleverly planned interlocking defenses proved too much.\n* The position remained in German hands until the last days of fighting in Tunisia the following spring."),
        "German Initiative",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "German Initiative", ":summary", "* A string of Allied defeats in December cost them dearly; 173 tanks, 432 other vehicles, and 170 artillery pieces were lost, in addition to thousands of casualties.\n* On December 10, 1942, Axis tanks attacked Combat Command B on Bou Aoukaz becoming hopelessly bogged down in the mud. In turn, the U.S. tanks counter-attacked and were also mired and picked off, losing 18 tanks.\n* On December 22, 1942, the British Coldstream Guards drove back the German 10th Panzer Division from Longstop Hill. They were then relieved and withdrawn to Mejdez. The Germans regained the hill in a counter-attack and the Coldstreams were ordered back to Longstop. They regained the peak, but with ammunition running low and Axis forces holding adjacent high ground they were forced to withdraw.\n* By December 26, 1942, the Allies had withdrawn to the line they had left 2 weeks earlier having suffered 20,743 casualties."),
        "Battle of Kasserine Pass",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Kasserine Pass", ":summary", "* The Battle of Kasserine Pass was, in fact, a series of battles fought around Kasserine Pass, a two-mile (3 km) wide gap in the Grand Dorsal chain of the Atlas Mountains in west central Tunisia.\n* The Axis forces involved were from the German-Italian Panzer Army led by Field Marshal Erwin Rommel and the Fifth Panzer Army led by General Hans-Jurgen von Arnim.\n* The Allied forces involved came from the U.S. Army's II Corps commanded by Major-General Lloyd Fredendall which was part of the British First Army commanded by Lieutenant-General Kenneth Anderson.\n* Significant as the first large-scale meeting of American and German forces in World War II, the untested American troops, who were led in an inept manner by their commander, suffered heavy casualties and were pushed back over fifty miles (80km) from their original positions west of Faid Pass in a humiliating rout.\n* The battle has been described as when the amateurs first met the professionals. In the aftermath, the U.S. Army instituted sweeping changes from unit-level organization to the replacing of commanders.\n* When they next met, in some cases only weeks later, the U.S. was considerably stronger."),
        ":Faïd",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Faïd", ":summary", "* On January 23, 1943, the Allies took Tripoli, thereby cutting off Rommel's main supply base. Rommel had planned for this eventuality. With their lines steadied by the Atlas Mountains on the west and Gulf of Sidra on the east, even small numbers of German/Italian troops would be able to hold off the Allied forces.\n* Upsetting this plan was the fact that Allied troops had already crossed the Atlas Mountains. This put them in an excellent position to thrust east to the coast and cut off Rommel's forces and cut his line of supply to Tunis. Obviously, the Axis could not allow this to occur.\n* The Panzer Divisions moved on the Atlas Mountans. Several attempts were made by the U.S. 1st Armored Division to stop their advance, but all three combat commands found themselves faced with the classic blitzkrieg every time they were ordered into a defensive position, they would find those positions had already been overrun, and they were attacked by German soldiers with heavy losses.\n* After 3 days the Allies had to withdraw."),
        "Battle of Sidi Bou Zid",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Sidi Bou Zid", ":summary", "* Rommel eventually decided that he could improve his supply situation and further erode the American threat to his flank by attacking towards two U.S. supply bases in Algeria.\n* On February 14, 1943, the Panzer Division moved west attacking Sidi Bou Zid.\n* The battle raged for a day, but poor use of armor by the U.S. led to their defeat. By this point, the U.S. forces had lost 2,546 men, 103 tanks, 280 vehicles, 18 field guns, 3 antitank guns, and an entire antiaircraft battery."),
        "Rommel's Assault",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Rommel's Assault", ":summary", "* On February 19, 1943, Rommel launched an assault that broke the U.S. lines within minutes. Their light guns and tanks had no chance against the heavier German equipment, and they had little or no experience in armored warfare. The German Panzer IVs and Tiger tanks fended off all attacks with ease; the M3 Lee and M3 Stuart tanks they faced were inferior in firepower and their crews far less experienced.\n* Under fierce tank attack, the American units on Highway 13 also gave way during the night, with men at all points retreating before the Italian 131st Centauro Armoured Division.\n* Once again, the 1st Armored Division found itself ordered into useless positions. Morale among the U.S. troops started to fall precipitously, and by evening many troops had pulled back, leaving their equipment on the field.\n* The pass was completely open, and it appeared the supply dump at Tebessa was within reach. However, desperate resistance by isolated groups left behind in the action seriously slowed the German advance."),
        ":Thala",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Thala", ":summary", "* By February 21, 1943, the Panzer Division was just outside of the small town of Thala. If they took it the U.S. 9th Infantry Division would be cut off from their supplies, and Combat Command B of the 1st Armored Division would be trapped by the 10th Panzer division. That night, small units of British, French, and U.S. forces freed from the line to the north were sent piecemeal into the lines at Thala. \n* 48 artillery guns were emplaced that night. When the battle reopened the next day, the defenses were much stronger; the front line was held largely by British infantry with exceptionally strong backing by U.S. Artillery.\n* Overextended and undersupplied, Rommel decided to end the offensive.\n* After the battle, Rommel was largely contemptuous of both the U.S. equipment and fighting ability and considered them a non-threat. U.S. Commander Lloyd Fredendall was relieved and sent to a noncombat assignment for the remainder of the war. Fredendall's subordinates had no confidence in him as their commander and British First Army commander also thought Fredendall incompetent.\n* On March 6, Major-General George S. Patton was placed in command with the explicit task of improving performance."),
        "Operation Capri",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Operation Capri", ":summary", "* On March 6, 1943, the Allies had reached the Tunisian border and Rommel and von Arnim found themselves outflanked, outmanned and outgunned.\n* Three German armored divisions, two light divisions, and nine Italian divisions, launched an attack southward in the direction of Medenine, the northernmost British strongpoint.\n* British artillery fire was intense, beating off the Axis attack and knocking out 55 Axis tanks.\n* With the failure of Capri, Rommel decided that the only way to save his armies would be to evacuate them. He therefore left Tunisia to see Hitler to try to convince him to abandon Tunisia and return the Axis armies to Europe. Hitler refused, and Rommel was placed, in strict secrecy, on sick leave.\n* Von Arnim became commander of Army Group Africa."),
        "Battle of El Guettar",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of El Guettar",
          ":summary",
          "* On March 23, 1943, the 10th Panzer met the U.S. II Corp. At first the battle went much as it had in earlier matchups, with the German tanks rolling up lead units of the US forces. However, they soon ran into a US minefield, and immediately the US artillery and anti-tank units opened up on them. The 10th lost 30 tanks over a short period, and retreated out of the minefield.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            ":Minefield",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Minefield")
          )
        ),
        ":Tunisia",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Tunisia", ":reference", "* Sink, burn, capture, destroy. Let nothing pass - Admiral Cunningham, Naval Task Force Commander\n* The Italians fought particularly well, outdoing the Germans in line with them. - British General Harold Alexander", ":summary", "* By April 12, 1943, Allied aircraft had been moved forward to airfields in Tunisia, and large numbers of German transport aircraft were shot down. British destroyers operating from Malta prevented reinforcement or evacuation of Tunisia by sea.\n* On April 23, 1943, in grim hand-to hand fighting against Infantry and Panzer Divisions, the U.S. took eight days to penetrate 6 miles (9.7km) and capture most of the Axis defensive positions. Casualties were heavy on both sides.\n* On May 13, 1943, the Axis forces surrendered yielding over 275,000 prisoners of war including most of the Afrika Korps. This huge loss of experienced troops greatly reduced the military capacity of the Axis powers, although the largest percentage of Axis troops escaped Tunisia.\n* This defeat in Africa led to all Italian colonies being captured."),
        "Aftermath of Tunisia",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Aftermath of Tunisia", ":summary", "* According to historian Williamson A. Murray 'The decision to reinforce North Africa was one of the worst of Hitler's blunder: admittedly, it kept the Mediterranean closed for six more months, with a negative impact on the Allied shipping situation, but it placed some of Germany's best troops in an indefensible position from which, like Stalingrad, there would be no escape. Moreover Hitler committed the Luftwaffe to fight a battle of attrition under unfavorable conditions, and it suffered losses that it could not afford.'\n* The Axis's desperate gamble had only slowed the inevitable, and the US loss at Kasserine may, paradoxically, have been the best thing that could have happened to them.\n* With North Africa now in Allied hands, plans quickly turned to the invasion of Sicily, and Italy after it.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_overview
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_overview = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_overview
  }

  // (func chapter_wwii_overview)
  static f_chapter_wwii_overview(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Overview",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Events Leading to War"),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Overview of the War", ":summary", "* Ground Combat - WWI began the use of mechanized warfare, but WWII redefined it in every way. The Germans invented the Blitzkrieg to leverage the power of mechanized units to shatter their opponents traditional defenses. Tank warfare was defined in WWII, however, because units must still stop to target, they cannot generally move at top speeds. Map scale is therefore based on moderately slow ground unit movement.\n* Naval Combat - WWII was the turning point of Naval Warfare when air power made traditional naval combat obsolete. Even submarines and torpedoes were insignificant compared to the effect of air power. Map scale is therefore based primarily on aircraft speed."),
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Turning Points of the War", ":summary", "* While the unconditional surrender of German armed forces represented a resounding Allied success, in retrospect, it is clear that particular factors and choices strongly affected the pace and course of the campaign.\n* D-Day - The Allied deception as to where the D-Day landings would take place was very successful, with the majority of the German command convinced the landings would take place at Calais. The Germans underestimated Allied willingness to risk an amphibious assault over a route longer than the shortest path across the English Channel.\n* Hedgerows - While the Allies meticulously planned the D-Day landings, they failed to assess the countryside immediately beyond the beaches, which resulted in the Germans very successfully using the hedgerow country as a system of natural defensive works that took the Allies two months to clear at a staggering cost in infantry casualties. Historians have also asserted the U.S. Army should have landed on the eastern end of the Normandy beaches and formed the northern wing of Allied forces in Northwest Europe because the mobility of American forces could have been better used in the more open terrain and most direct route to Berlin that the northern approach offered. As it was, the pre-invasion basing of troops in England determined the arrangement of the landing forces.\n* Underestimation - While the Germans had reason to occasionally doubt Allied military proficiency, it is clear the Germans too often underestimated Allied competency. This habit of underestimation led to the rejection of any notion that the Allies might have broken German military ciphers, most famously the Enigma code. The ability to monitor German military communications was an Allied strategic asset of the highest order. Less dramatically, the Germans often underestimated Allied troop proficiency, a habit that resulted in occasional sharp defeats for overconfident German units.\n* Manpower - The German ability to form a cohesive defensive line after the disaster their forces endured in Normandy was due almost entirely to the ability of the German Ersatzheer (Replacement Army) to quickly deploy large numbers of new troops. These inexperienced troops were paired with seasoned cadres who swiftly transformed the replacements into combat units. Thus, while the Allies took large numbers of German prisoners during their advance from Normandy to the German border, they  underestimated the ability of the Germans to reconstitute their forces under very disadvantageous circumstances. The Allies also seriously underestimated the infantry casualties their forces would suffer in Northwestern Europe. Shortages of American manpower were strongly aggravated by a tendency to attack head-on regardless of circumstances, a habit that was particularly in evidence during the months of fighting in the Huertgen Forest. The Allied logistical crisis that dominated their operations from September through December had the further pernicious effect of limiting the number of divisions in England that could be moved onto the continent to reinforce the front, since the Allies were only able to supply a limited number of divisions east of the Seine River. After the Allies mastered the logistical crisis, the Americans diverted divisions bound for the Pacific Theater to Europe in a belated realization that more divisions were needed for operations in Europe.\n* German Strategic Errors - While the Germans achieved strategic surprise with their offensive in the Ardennes, the Panzer divisions that had been so painstakingly rebuilt could have been more profitably used to defend the Siegfried Line and the Rhineland, or perhaps, in the defense of Berlin against the Red Army. The German thrust failed to shatter their enemies' alliance and cost Germany high casualties and equipment losses it could ill-afford. This folly was repeated in Alsace in January, but with the added disadvantage this time that the Allies were expecting the attack.\n* American Strategic Errors - Upon breaking out of Normandy in August, the Americans committed two armored divisions to operations in Brittany when armored units were direly needed for the pursuit of the German army across France. While the port of Brest, France was ultimately captured by the Americans, it consumed operations for an entire month and ultimately did little for the Allied effort because the Germans so thoroughly destroyed the port before it was captured. Out of fear that two wings of their forces might collide, the Allies failed to definitively close the Falaise Gap in August, allowing trapped German forces an escape route to the east. Experienced German leadership cadres evaded Allied forces and were available to reconstitute a cohesive front line along the Siegfried Line.\n* Antwerp - Although British forces conducted a brilliant pursuit across northern France that resulted in the liberation of the critically important port of Antwerp in early September, they failed to promptly clear the Scheldt Estuary of Germans. The Germans immediately grasped the significance of the Scheldt Estuary and moved in troops to conduct a lengthy defense. The port of Antwerp could not be used until November 28, and strongly contributed to the lengthy logistical crisis that hamstrung Allied operations for four months.\n* Operation Market-Garden was a double failure in the sense that the resources used for it would have been more profitably committed to clearing the Scheldt Estuary instead of carving out an extended salient that did nothing but extend an already over-extended Allied front line.\n* Siegfreid Line - Despite grave shortages of riflemen, American operations in front of the Siegfried Line, particularly in U.S. First Army's area, were characterized by bloody frontal assaults. Stubbornness and misplaced notions that the U.S. Army could not allow itself to abandon unprofitable operations saw five infantry divisions shredded in the Huertgen Forest fighting, with the attack being abandoned only in December after the Germans attacked into the Ardennes. The concentration of divisions in the Huertgen Forest also forced a corresponding lack of concentration along the Ardennes front, with the result that only four U.S. divisions were initially available to parry a 26 division German offensive.\n* Eisenhower - When, in November, the Allies enjoyed significant success in 6th Army Group's area, General Eisenhower refused to reinforce the success and even forbade his commanders in the south to attempt to assault across the Rhine in the area of Strasbourg while the German defenses were in shambles. This lack of bold enterprise was a by-product of General Eisenhower's decision to conduct limited-objective attacks on a broad front even though the Allies lacked a sufficient number of divisions to both man a broad front and concentrate enough combat power in chosen areas to achieve breakthroughs. When American troops reached the Elbe River in mid-April, General Eisenhower unilaterally decided that Berlin was no longer a significant military objective. He knew that Berlin would be deep within the Soviet zone of post-war Germany and saw no reason to fight for land that would have to be given to the Soviets after the war. Eisenhower pointed out to Patton that it was of no military strategic value and would take up a lot of resources to occupy and asked Patton 'Who would want it?' Patton replied 'I think history will answer that question for you.' Unswayed by Patton, Simpson or even Churchill, Eisenhower ordered U.S. forces to halt along the Elbe and Mulde rivers. Thus, these spearheads were practically immobilized while the war raged on for three more weeks.\n* Bradley - Simultaneously, General Bradley considered the Germans trapped in the Ruhr Pocket to be the most significant threat and committed surprisingly large numbers of U.S. troops to collapse (as opposed to containing) the pocket instead of reinforcing his troops at the Elbe River. As a consequence of Eisenhower's decision, the British 21st Army Group was ordered to drive northeast in the direction of Hamburg instead of proceeding due east in the direction of Berlin.\n* Propaganda - The Allies proved curiously gullible about German propaganda claiming the existence of a 'National Redoubt' in the Alpine hinterlands of Bavaria and Austria. Fearing a large-scale last stand by the Nazis in this so-called redoubt, General Eisenhower directed no less than three field armies to clear southern Germany at a time when the largest groups of German forces stood to the east, not the south, of General Eisenhower's troops. Fortunately for the Allies, the German Army of April 1945 was in no position to exploit troop concentrations and movements of questionable merit.\n* Thus, while the Allies enjoyed a great victory, on occasion their prosecution of the campaign afforded their German adversaries opportunities that prolonged the fighting unnecessarily.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_pacific_theatre
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_pacific_theatre = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_pacific_theatre = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_pacific_theatre
  }

  // (func chapter_wwii_pacific_theatre)
  static f_chapter_wwii_pacific_theatre(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Pacific Theatre",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Battle of Pearl Harbor",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Pearl Harbor", ":summary", "* On Sunday morning, December 7, 1941, the Japanese navy launched a surprise attack against the Pacific Fleet docked at Pearl Harbor, Hawaii which drew America into World War II. It was intended as a preventive action to remove the U.S. Pacific Fleet to protect Japan's advance into Malaya and the Dutch East Indies — for their natural resources such as oil and rubber.\n* Two aerial attack waves, totaling 353 aircraft, launched from six Japanese aircraft carriers.\n* The attack wrecked two U.S. Navy battleships, one minelayer, and two destroyers beyond repair, and destroyed 188 aircraft; personnel losses were 2,388 killed and 1,178 wounded.\n* The Japanese high command was certain, though mistakenly so, an attack on the United Kingdom's colonies would bring the U.S. into the war, so a preventive strike appeared to be the only way Japan could avoid U.S. interference in the Pacific. While the attack accomplished its intended objective, it was completely unnecessary - unbeknownst to Yamamoto, the U.S. Navy had decided to abandon any intention of 'charging' across the Pacific towards the Philippines at the outset of war back in 1935. They instead adopted 'Plan Dog' in 1940, which emphasized keeping the Imperial Japanese Navy (IJN) out of the eastern Pacific and the shipping lanes to Australia, while the U.S. concentrated on defeating Nazi Germany.\n* The attack was one of the most important engagements of World War II. Occurring as it did before a formal declaration of war, it pushed U.S. public opinion from isolationism to an acceptance war was unavoidable, as Roosevelt called December 7, 1941 '...a date which will live in infamy.'"),
        "Battle of Wake Island",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Wake Island", ":summary", "* On December 8, 1941, the same day as the attack on Pearl Harbor, 36 Japanese medium bombers attacked Wake Island, destroying eight of the twelve F4F Wildcat fighters.\n* On December 11, the garrison, with the support of the four remaining Wildcats, repulsed the first Japanese landing attempt, which included the light cruisers Yubari, Tenryū, and Tatsuta; the destroyers Yayoi, Mutsuki, Kisaragi, Hayate, Oite, and Asanagi; two old destroyers converted to patrol boats (Patrol Boat No. 32 and Patrol Boat No. 33), and two troop transport ships containing 450 troops. The U.S. Marines fired at the invasion fleet with their six 5-inch (127 mm) coastal artillery guns. They then succeeded in sinking the Hayate with a direct hit to her magazines and striking the Yubari's superstructure eleven times. The four Wildcats also succeeded in sinking another destroyer, by dropping a bomb on her stern where the depth charges were stored. Both Japanese destroyers were lost with all hands, with Hayate becoming the first Japanese surface warship to be sunk during World War II. The Japanese force withdrew before landing.\n* This was the first Japanese defeat of the war. The first battle of Wake Island also marked the only occasion in WWII when an amphibious assault was repulsed by shore-based guns.\n* The siege on the Wake garrison continued, without resupply for the Americans. The initial resistance offered by the garrison prompted the  Japanese Navy to detach two aircraft carriers (Soryu and Hiryu).\n* The second Japanese invasion force came on December 23, composed mostly of the same ships from the first attempt with some new additions, plus 1,500 Japanese marines. The landings began at 02:35 where, after a preliminary bombardment, the ex-destroyers Patrol Boat No. 32 and Patrol Boat No. 33 were beached and burned in their attempts to land the invasion force.\n* The next day, the Wake garrison surrendered.\n* The U.S. Marines lost 47 killed and 2 MIA during the entire 15-day siege, while three U.S. Navy personnel and at least 70 civilians were killed.\n* Japanese losses were recorded at between 700 to 900 killed, with at least 1,000 more wounded, in addition to the two destroyers lost in the first invasion attempt and at least 28 land-based and carrier aircraft either shot down or destroyed. The Japanese captured all men remaining on the island."),
        "Battle of Hong Kong",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Hong Kong", ":summary", "* On December 8-25, 1941 a battle was fought ending with Hong Kong, a British colony, surrendering to Japan.\n* The battle began less than eight hours after the Attack on Pearl Harbor. The garrison had held out for 17 days before surrendering.\n* This was the first occasion on which a British Crown Colony was surrendered to an invading force."),
        "Battle of Bataan",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Bataan",
          ":summary",
          "* The capture of the Philippine Islands was crucial to Japan's effort to control the Southwest Pacific, seize the resource-rich Dutch East Indies, and protect its Southeast Asia flank.\n* The Battle of Bataan was the largest surrender in American and Filipino military history.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "War Plan Orange-3",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "War Plan Orange-3", ":summary", "* On December 26, 1941, after securing the beachheads, the Japanese launched a massive pincer attack. The defending forces planned to fall back and hold out for six months, at which time the plan assumed that relief would arrive from the U.S.\n* The surrender of Bataan would hasten the fall of Corregidor, a month later. However, without this stand, the Japanese might have quickly overrun all of the U.S. bases in the Pacific. Bataan forced them to slow down, giving the allies valuable time to prepare for conflicts such as the Battle of the Coral Sea and the Battle of Midway which followed closely thereafter.\n* Ultimately, more than 60,000 Filipino and 15,000 American prisoners of war were forced into the infamous Bataan Death March. The prisoners were forced to march through deep dust for 90 miles. 5000-10000 died en route from disease, starvation, dehydration, heat prostration, untreated wounds, and wanton execution. Those who fell behind were usually executed or left to die; the sides of the roads became littered with dead bodies and those begging for help.")
          )
        ),
        "Battle of Malaya",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Malaya", ":summary", "* The Battle of Malaya was fought from December 8, 1941 to January 31, 1942.\n* The Japanese invaded with over two hundred tanks, but the British Army in Malaya did not have a single one.\n* For the British, Indian, Australian and Malayan forces defending the colony, the campaign was a disaster. In less than two months, the battle ended in comprehensive defeat for the Commonwealth forces with nearly 50,000 Commonwealth troops had been captured or killed."),
        "Battle of Corregidor",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Corregidor",
          ":summary",
          "* The fall of Bataan in April 9, 1942, ended all organized opposition in the Phillipines. The island bastion of Corregidor, with its network of tunnels and formidable array of defensive armament, along with the fortifications across the entrance to Manila Bay, was the remaining obstacle. The Japanese had to take Corregidor; as long as the island remained in American hands, they would be denied the use of the Manila Bay, the finest natural harbor in the Far East.\n* The two 12-inch (305mm) guns of Batteries Smith and Hearn, with a horizontal range of 29,000 yards (27,000m) and all-around traverse were the longest range of all the island's artillery.\n* From December 29, 1941, to the end of April 1942, despite incessant Japanese aerial, naval and artillery bombardment, the garrison on Corregidor resisted valiantly, inflicting heavy enemy losses in men and planes.\n* The defenders were living on about thirty ounces of food per day. Drinking water was distributed only twice per day, but the constant bombing and shelling often interrupted the ration. When the bombardment killed the mules in the Cavalry, they would drag the carcasses down to the mess hall and cook them.\n* Japanese aircraft flew 614 missions dropping 1,701 bombs totaling some 365 tons of explosive.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of Corregidor",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of Corregidor",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":forces", "* 2x 305mm Naval Guns\n* 43x Coastal Guns and Mortars\n* 72x Anti-aircraft guns"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":forces", "* Bombers\n* 9x 240mm Howitzers\n* 34x 149mm Howitzers\n* 32x Artillery")
              )
            )
          )
        ),
        "Battle of Singapore",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Singapore", ":summary", "* Japan invaded Singapore and fighting lasted from February 7, 1942 to February 15, 1942.\n* It resulted in the fall of Singapore, the major British military base in South East Asia and the largest surrender of British-led military personnel in history. About 80,000 Indian, Australian and British troops became prisoners of war, joining 50,000 taken by the Japanese in the Malayan campaign. Winston Churchill called the ignominious fall of Singapore the 'worst disaster' and 'largest capitulation' in British history."),
        "Doolittle Raid",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Doolittle Raid", ":summary", "* The Doolittle Raid, 18 April 1942, was the first air raid by the United States to strike the Japanese home island of Honshū during World War II. It demonstrated that the Japanese home islands were vulnerable to Allied air attack. The Doolittle Raid was the only time that United States Army Air Forces bombers were launched from an aircraft carrier.\n* The plan was to launch B-25B bombers from a carrier, hit targets in Japan, and fly on to land in China. All 16 aircraft were lost, and 11 crewmen were either killed or captured. The crews of 13 aircraft, however, were recovered and returned to the United States, and a 14th crew interned by the Soviet Union eventually made its way home in 1943.\n* The Doolittle raid did little material damage, but American morale soared from the depths following Pearl Harbor. The raid also had a strategic impact, though it was not understood at the time, in that it caused the Japanese to recall some fighter units back to the home islands for defense. They did not understand how American aircraft could attack from such a distance and assumed that America had developed a new, extremely long-range aircraft, when in reality, American forces knew it would essentially be a one-way trip. This assumption that the home islands were vulnerable to air attack strengthened Admiral Yamamoto's resolve to carry out military action against Midway Island. These reassignments subsequently weakened Japan's air capabilities against the Allies at the Battle of Midway and later Pacific Theater campaigns."),
        "Battle of the Coral Sea",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of the Coral Sea",
          ":summary",
          "* On May 4-8, 1942, the Japanese fought the US and Australian in the first naval battle between aircraft carriers and the first naval battle where neither side's ships sighted or fired directly upon the other.\n* On May 6, 1942, land-based B-17s attacked the approaching Port Moresby invasion fleet with the usual lack of success. Almost another year would pass before the USAAF realized high-altitude bombing attacks against moving naval targets were pointless. That night the commander at Port Moresby made the difficult decision to detach his main surface force (3 cruisers and 3 destroyers) to block the probable course of an invasion. He risked a repeat of the loss of HMS Prince of Wales and Repulse by exposing surface ships to attack by land-based aircraft without air cover. Indeed, his cruisers were spotted and came under an intense air attack from torpedo bombers but escaped with little damage. Only minutes after the Japanese raid, his force was inadvertently attacked by friendly B-17s and once again had to endure near misses.\n* On May 7, 1942, U.S. aircraft, sent in the wrong direction by a miscoded contact report, had missed Sh�?kaku and Zuikaku but found the invasion fleet, escorted by the small carrier Sh�?h�?, which was soon sunk with heavy casualties. In the previous five months the Allies had lost numerous major warships and had been unable to sink a single major Japanese ship in return. Sh�?h�? was small by carrier standards, but the phrase 'scratch one flattop,' announced the first Allied naval success of the Pacific War.\n* On May 8, 1942, the main carrier forces located one another and launched full raids, which passed each other in the air. Sh�?kaku was hit three times by bombs. Her deck damaged, Sh�?kaku was unable to land her aircraft and was thus effectively put out of action. Both American carriers were hit: Yorktown by a bomb; the Lexington, by both bombs and torpedoes. Lexington had to be abandoned and sunk to prevent her capture.\n* Tactically, the Japanese had achieved a narrow victory; one small carrier lost and a large carrier severely damaged against the Americans' loss of a large carrier and significant damage to another. But from the Allied point of view, after five months of continuous defeat, a battle that came out almost even was close enough to a victory.\n* Strategically, the Allies had won since the invasion of Port Moresby, New Guinea had been averted (the first time the Japanese had been turned back). With Sh�?kaku damaged and Zuikaku short of aircraft, neither was able to take part in the crucial Battle of Midway a month later. The loss of Lexington was a severe blow as she was one of the Navy's largest carriers. The damaged Yorktown returned to Pearl Harbor and although her damage was estimated to require months in port, she was made more or less battle-worthy in a miracle of improvisation and determination in just 2 days.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of the Coral Sea",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of the Coral Sea",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":forces", "* 2x Carriers (Yorktown, Lexington)\n* 3x Australian Cruisers\n* 3x Australian Destroyers\n* Australian and US support ships"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":forces", "* The Japanese had 3 fleets:\n* Solomon invasion force\n* Port Moresby invasion force\n* 2x Carriers (Sh�?kaku and Zuikaku)\n* 1x Small carrier (Sh�?h�?)\n* 2x Heavy cruisers\n* Support ships")
              )
            )
          )
        ),
        "Battle of Midway",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Midway",
          ":summary",
          "* From June 4, 1942 to June 7, 1942, exactly six months to the day after Japan's attack on Pearl Harbor the Americans and Japanese fought around Midway island in what is widely regarded as the most important naval battle in the Pacific.\n* For months, bureaucratic infighting delayed Admiral Yamamoto's plans in the Pacific. In the end, his threat to resign succeeded in moving his agenda forward. Yamamoto's primary strategic concern was the elimination of America's remaining carrier forces. Midway was not especially important, but the Japanese felt that the Americans would strongly defend it. The Japanese believed that only the USS Enterprise and Hornet would be available since the Lexington had been sunk and the Yorktown was badly damaged. Yamamoto dispersed his fleet to deceive the U.S. so the full extent of his fleet was hidden, but the U.S. had broken the Japanese naval code which negated this strategy and left his fleets separated by several hundred miles.\n* In order to battle 4 or 5 carriers, Admiral Nimitz needed every available carrier, so the Yorktown was restored to battle-worthy state in 72 hours. Repairs continued even as Yorktown sortied.\n* A picket line of Japanese submarines was late getting into position (partly because of Yamamoto's haste), which let the American carriers proceed to their assembly point without being detected. Reconnaissance planes were supposed to scout Pearl Harbor prior to the battle to detect American carriers. This plan was also thwarted when the refueling submarines found the refuelling point occupied by American warships (because the Japanese had carried out an identical mission in March). Thus, Japan was deprived of any knowledge concerning the movements of the American carriers. Japanese radio intercepts noticed an increase in both American submarine activity and message traffic. Yamamoto, at sea in Yamato, did not dare inform Nagumo for fear of exposing his position, and presumed (incorrectly) Nagumo had received the same message from Tokyo.\n* Admiral Nimitz had one priceless asset: American and British cryptanalysts had broken the JN-25 code, confirming Midway as the target, determining the date of the attack, and providing a complete IJN order of battle. Japan's efforts to introduce a new codebook had been delayed, giving HYPO several crucial days.\n* Nimitz was aware, for example, the vast numerical superiority of the Japanese fleet had been divided into no less than four task forces, and the escort for the main Carrier Striking Force was limited to just a few fast ships. For this reason, they knew the anti-aircraft guns protecting the carriers would be limited. Nimitz calculated his three carriers, plus Midway island, to Yamamoto's four, gave the U.S. rough parity. Meanwhile, the Japanese remained almost totally in the dark even after the battle began.\n* On June 4, nine B-17s operating from Midway attacked the Japanese transport group, but no significant damage was sustained.\n* On June 4, 4:30, Vice Admiral Chuichi Nagumo launched an attack wave (108 aircraft). At the same time, he launched eight search aircraft (one 30 minutes late due to technical issues).\n* American radar picked up the enemy at a distance of several miles and interceptors soon scrambled. Unescorted bombers headed off to attack the Japanese carrier fleet, their fighter escorts remaining behind to defend Midway.\n* At 06:20, Japanese carrier aircraft bombed and heavily damaged the U.S. base on Midway. Midway-based obsolescent F4F Wildcats, defended Midway and suffered heavy losses. Most were downed in the first few minutes. The Japanese learned the island's bombers had already departed, and the strike leader signaled Nagumo another attack would be necessary to neutralize Midway's defenses before troops could be landed.\n* American anti-aircraft fire was accurate and intense, damaging many Japanese aircraft and claiming a third of the Japanese planes destroyed.\n* American bombers based on Midway made several torpedo attacks on the Japanese carrier fleet, but the Japanese shrugged off these attacks with almost no losses, destroying all but three of the American bombers.\n* At 7:15, As a result of the attacks from Midway, Nagumo ordered his reserve planes to be re-armed with bombs for use on land targets. 30 minutes later a scout plane signaled the discovery of a sizable American naval force to the east. Nagumo quickly reversed his order and demanded the scout plane ascertain the composition of the American force. Another 40 minutes elapsed before Tone's scout finally detected and radioed the presence of a single carrier in the American force, TF 16 (the other carrier was not detected).\n* Nagumo was now in a quandary. His opportunity to hit the American ships was curtailed by the fact his Midway strike force would be returning shortly. They would be low on fuel and carrying wounded crewmen, would need to land promptly or ditch, losing precious aircraft and crews; there was slim chance a strike could be mounted in time. Spotting his flight decks and launching aircraft would require at least 30-45 minutes, but if he launched immediately his bombers would be without fighter escort and they had just witnessed how easily unescorted American bombers were shot down by their own fighters.\n* In the end, Nagumo chose to wait for his first strike force to land, then launch the reserve force. In the final analysis, it made no difference; Fletcher had launched beginning at 07:00, so the aircraft which would deliver the crushing blow were already on their way. There was nothing Nagumo could do about it. This was the fatal flaw of Yamamoto's dispositions: it followed strictly traditional battleship doctrine.\n* It was at this point Spruance gave his second crucial command, to run toward the target, having judged that the need to throw something at the enemy as soon as possible was greater than the need for a coordinated attack. Accordingly, American squadrons were launched piecemeal, proceeding to the target in several different groups. This diminished the overall impact of the American attacks and greatly increased their casualties; coincidentally, it reduced the Japanese ability to counterstrike and found Nagumo with his decks at their most vulnerable.\n* At 9:20, Allied planes began attacking, led by Torpedo Squadron 8 (VT-8, from Hornet), followed by VT-6 (from Enterprise). Every TBD Devastator of VT-8 was shot down, with only one survivor. VT-6 squadron met nearly the same fate, with no hits against the enemy, thanks in part to terrible aircraft torpedoes. The Japanese combat air patrol, flying the much faster Zero, made short work of the Americans, who not only had no fighter support but were flying the slow, under-armed TBDs.\n* The appearance of a third torpedo plane attack from the southeast by VT-3 at 10:00 very quickly drew the majority of the Japanese CAP into the southeast quadrant of the fleet. By chance, at the same time VT-3 was sighted by the Japanese, two separate formations (comprising three squadrons total) of American SBD Dauntless dive-bombers were approaching the Japanese fleet from the northeast and southwest. These formations initially had difficulty in locating the Japanese carriers, and their fuel was running low. However, by the decisions of squadron commanders C. Wade McClusky, Jr. and Max Leslie to continue the search, they spotted the wake of Japanese destroyer Arashi. The destroyer was steaming at full speed back to Nagumo's carrier force, after having unsuccessfully depth-charged the U.S. submarine Nautilus.\n* The American dive-bombers arrived in a perfect position to attack the Japanese. Armed Japanese strike aircraft filled the hangar decks at the time of the fateful attack, fuel hoses were snaking across the decks as refueling operations were hastily completed, and the constant change of ordnance meant bombs and torpedoes were stacked around the hangars rather than stowed safely in the magazines. The Japanese carriers were extraordinarily vulnerable.\n* Contrary to some accounts of the battle, contemporary research, based on recent translation of relevant portions of the 100 volume Japanese account of the war, has demonstrated that the Japanese were not in fact prepared to launch a counterstrike when they were decisively attacked. Because of the constant flight deck activity associated with combat air patrol operations, the Japanese had never had an opportunity to spot their reserve for launch. The few aircraft on the Japanese flight decks at the time of the attack were either CAP fighters, or (in the case of S�?ryū) strike fighters being spotted to augment the CAP.\n* At 10:22, Enterprise's aircraft attacked Kaga, while to the south, Yorktown's aircraft attacked carrier S�?ryū, with Akagi being struck by several of Enterprise's bombers four minutes later. Simultaneously, VT-3 was targeting Hiryū, although the American torpedo aircraft again scored no hits. Within six minutes, the SBD dive bombers made their attack runs and left all three of their targets heavily ablaze. Akagi was hit by just one bomb, which was sufficient; it penetrated to the upper hangar deck and exploded among the armed and fueled aircraft there. One extremely near miss also slanted in and exploded underwater, bending the flight deck upward with the resulting geyser and causing crucial rudder damage. S�?ryū took three bomb hits in the hangar decks; Kaga took at least four. All three carriers were out of action and were eventually abandoned and scuttled.\n* By proceeding to target directly, without waiting for fighter escort, the torpedo squadrons, one after another, at low level, engaged enemy combat air patrol. This created an opportunity for the pilots of the dive bombers, who had arrived high above the action and were able to dive on target before being attacked. The torpedo planes were shot down and the torpedo squadron pilots lost their lives, but they enabled a titanic victory.\n* Hiryū, the sole surviving Japanese aircraft carrier, wasted little time in counterattacking. The first wave of Japanese dive-bombers badly damaged Yorktown with two bomb hits, yet her damage control teams patched her up so effectively (in about an hour) the second wave's torpedo bombers mistook her for an intact carrier. After two torpedo hits, Yorktown lost power and was out of the battle, forcing Admiral Fletcher to move his flag to the heavy cruiser Astoria.\n* Hiryū recovered its aircraft and prepared for a strike against what was believed to be the only remaining American carrier.\n* Enterprise launched a final strike of dive bombers (including 10 bombers from Yorktown), leaving Hiryū ablaze, despite being defended by a strong defensive CAP of over a dozen Zero fighters. Rear Admiral Yamaguchi chose to go down with his ship, costing Japan perhaps her best carrier sailor.\n* In the night, the fleets did not encounter one another which may have been fortunate for the Americans, for had the US carrier fleet come in contact with Yamamoto's heavies, including Yamato, in the dark, the US cruisers would have been overwhelmed, and the carriers helpless.\n* On June 7, Yorktown was sunk during salvage efforts, by three torpedoes from Japanese submarine I-168. There were few casualties since most of the crew had already been evacuated. One torpedo from this salvo also sank the destroyer USS Hammann, which had been providing auxiliary power to Yorktown, splitting her in two.\n* The battle was a decisive victory for the Americans, dealing Japanese naval aviation a heavy blow. The pre-war Japanese training program produced pilots of exceptional quality but at a slow rate. This small group of elite aviators were combat hardened veterans. At Midway, the Japanese lost as many of these pilots in a single day as their training program produced in a year. By mid-1943, Japanese naval aviation was decimated. Even more important was the irredeemable loss of four of Japan's fleet carriers. These ships were not replaced until early in 1945. In the same span of time, the U.S. Navy commissioned more than two dozen fleet and light fleet carriers.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of Midway",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of Midway",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":forces", "* 3x Carriers (Yorktown, Hornet, Enterprise)\n* Heavy Cruiser (Astoria)\n* Destroyer (Hammann)\n* 9x B-17 Bombers (Midway Island)\n* PBY Flying Boats (Midway Island)\n* F4F Wildcats (Midway Island)\n* Submarine (Nautilus)"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":forces", "* The Japanese had 4 fleets:\n* Carriers (Akagi, Kaga, Hiryū and S�?ryū)\n* Cruiser Tone\n* Destroyer (Arashi)\n* 1x Small carrier (Sh�?h�?)\n* 2x Heavy cruisers\n* Support ships")
              )
            )
          )
        ),
        "Battle of Quadalcanal",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Quadalcanal",
          ":summary",
          "* On August 7, 1942, US forces landed on the islands of Guadalcanal, Tulagi, and Florida in the southern Solomons	capturing Tulagi and Florida as well as an airfield (later named Henderson Field) that was under construction by the	Japanese on Guadalcanal.\n* Between August and November 1942, the Japanese made several attempts to retake Henderson Field. These attempts resulted in three major land battles, five large naval battles, and continuous, almost daily, aircraft battles.\n* In early November 1942 the last Japanese attempt to capture Henderson Field was defeated forcing the Japanese to eventually evacuate Guadalcanal.\n* The Guadalcanal campaign marked the first significant strategic victory by Allied forces over the Japanese in the Pacific and is often considered a 'turning point' in the war.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of Savo Island",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Battle of Savo Island", ":summary", "* On August 8-9, 1942, the US and Japanese fought the Battle of Savo Island (aka the First Battle of the Solmon Sea in Japan).\n* During the US landing operations, Japanese aircraft based at Rabaul attacked several times. After these clashes, Fletcher (the carrier commander) was concerned about his fuel levels and the losses to his carrier air defense. Without consulting with the other commanders, he withdrew with his carriers. Without carrier air-cover, the transports and their escort fleet would have to withdraw as well, even though less than half of the supplies and heavy equipment had been unloaded. The decision was made, however, to unload as many supplies as possible throughout the night and then depart.\n* That night, as the transports unloaded, two groups of Allied warships, 5 cruisers and 7 destroyers, screening the transports were surprised and defeated by a Japanese force of 7 cruisers and 1 destroyer. One Australian and three U.S. cruisers were sunk, and one other U.S. cruiser and two destroyers were damaged. The Japanese suffered moderate damage to one cruiser. The Japanese who was unaware Fletcher had withdrawn with the U.S. carriers, immediately retired to Rabaul without attempting to attack the now unprotected Allied transports.\n* As a result of the defeat, the remaining Allied ships withdrew from the Solomon Islands. Allied ground forces had landed on Guadalcanal only the day before. The withdrawal of the fleet left them in a precarious situation, with barely enough supplies, equipment, and food to hold their beachhead."),
            "Battle of Eastern Solomons",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of Eastern Solomons",
              ":summary",
              "* On August 24-August 25, 1942, the U.S. and Japan fought the second major engagement of the Guadalcanal Campaign. As at Coral Sea and Midway, the ships of the two adversaries were never in direct visual range of each other and fought all battles with aircraft.\n* After several damaging air attacks, both sides withdrew without securing a clear victory. However, the U.S. apparently gained a greater advantage because the Japanese suffered greater losses including a significant number of aircraft and experienced aircrews.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":deploy", "1) Deploy in as many fleets as desired.\n2) Maintain secret movement.", ":forces", "* 2 Carriers - Enterprise and Saratoga\n* 1 battleship\n* 4 cruisers\n* 11 destroyers\n* 176 aircraft - B-17 Bombers, F4F Wildcats, TBF Avengers"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":deploy", "1) Deploy in as many fleets as desired.\n2) Maintain secret movement.", ":forces", "* 2 Carriers - Sh�?kaku (Flagship), Zuikaku\n* 1 Light Carrier - Ryūj�?\n* 2 Battleships\n* 9 Heavy Cruisers - Tone, Chikuma\n* 3 Light Cruiser\n* 17 Destroyers - Amatsukaze, Kagero, Mutsuki, Tokitsukaze\n* 1 Seaplane Carrier - Chitose\n* 4 Patrol Boats\n* 3 Transports - Kinryu Maru\n* 100 Land-based 'Betty' Bombers, fighters, recon\n* 75 Carrier-based aircraft - Kates, Vals, Zeroes")
              )
            ),
            "Battle of Milne Bay",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of Milne Bay",
              ":reference",
              "* Australian troops had, at Milne Bay, inflicted on the Japanese their first undoubted defeat on land...Of all the allies, it was the Australians who first broke the invincibility of the Japanese army.",
              ":summary",
              "* On August 25, 1942, Japanese marines attacked the Australian base at Milne Bay on the eastern tip of New Guinea, and fighting continued until the Japanese retreated on 5 September 1942. The battle was the first in the Pacific campaign in which Allied troops defeated Japanese land forces and, significantly, forced them to withdraw. The assault was the southern most point of the Japanese advance on land in World War II.\n* The Japanese hoped to secure an air and naval base to provide air and naval support to the Japanese Kokoda Track campaign to take Port Moresby, New Guinea by capturing the newly constructed airfields at Milne Bay.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 4,500 Infantry - Mortar, MG\n* 4,500 Non-combat personnel\n* 12 P-40 Kittyhawks\n* 1 Hudson No. 6\n* 3 B-17 Bombers"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 1,800 Infantry\n* 350 Non-combat personnel\n* 4 Ha-Go Light Tanks\n* 2 Light Cruisers - Tenryū and Tatsuta\n* 3 Destroyers - Urakaze, Tanikaze, Hamakaze\n* 2 Transports - Nankai Maru and Kinai Maru\n* 2 Submarine Chasers")
              )
            ),
            "Battle of the Santa Cruz Islands",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of the Santa Cruz Islands",
              ":summary",
              "* On October 26, 1942, two opposing carrier forces fought off Guadalcanal. After an exchange of carrier air attacks, Allied ships were forced to retreat with the loss of one carrier sunk (Hornet) and another (Enterprise) heavily damaged. The Japanese carrier forces, however, also retreated because of high aircraft and aircrew losses and significant damage to two carriers.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 2 Carriers - Hornet, Enterprise\n* 1 Battleship - South Dakota\n* 6 Cruisers - Northhampton, Portland, San Juan\n* 14 Destroyers - Anderson, Mahan, Mustin, Porter, Shaw, Smith\n* 136 Aircraft - SBD Dauntless, TBF Avenger, F4F Wildcat, PBY Catalina"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 3 Carriers - Juny�?, Sh�?kaku (Flagship), Zuikaku\n* 1 Light Carrier - Zuih�?\n* 2 Battleships\n* 1 Heavy Cruiser - Atago, Chikuma, Suzuya\n* 1 Light Cruiser - Yura\n* 7 cruisers\n* 22 Destroyers - Akizuki, Teruzuki\n* 199 aircraft")
              )
            ),
            "First Naval Battle of Guadalcanal",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "First Naval Battle of Guadalcanal",
              ":summary",
              "* On November 12-15, 1942, the decisive battle was fought during the months long Guadalcanal Campaign. The Japanese organized a transport convoy to take 7,000 infantry troops and their equipment to Guadalcanal to attempt once again to retake Henderson Field airfield. To allow the convoy to approach the island and deliver its cargo, the Japanese navy sent several warship forces to bombard Henderson Field with the goal of destroying Allied aircraft. Learning of the Japanese reinforcement effort, U.S. forces prepared to interdict the Japanese convoy and warships with aircraft and warship attacks.\n* At 1:25 on November 13, 1942 in almost pitch darkness both fleets entered the sound between Savo Island and Guadalcanal. Several of the U.S. ships detected the Japanese ships on radar, but had trouble communicating the information because of problems with their ship's radio equipment and lack of discipline with their communications procedures. Several minutes later, both forces visually sighted each other about the same time. At 01:48, Akatsuki and Hiei turned on large searchlights and lit up Atlanta only 3,000 yards (2.7 km) away—almost point-blank range for large naval artillery. Several of the ships on both sides spontaneously opened fire. As the ships from the two sides intermingled, they battled each other in an utterly confused and chaotic melée at close distances. Afterwards, an officer on Monssen likened it to 'a barroom brawl after the lights had been shot out'\n* At least six of the U.S. ships, including Laffey, O'Bannon, Atlanta, San Francisco, Portland, and Helena, fired at Akatsuki, which drew attention to herself with her illuminated searchlight. Akatsuki was hit repeatedly and blew up and sank within a few minutes.\n* Perhaps because it was the lead cruiser in the U.S. formation, Atlanta was the target of fire from several Japanese ships. It suffered heavy damage and drifted into the line of fire of San Francisco, which accidentally fired on Atlanta, causing even greater damage, and killing Admiral Scott and much of the bridge crew.\n* Hiei, with her nine lit searchlights, huge size, and course taking her directly through the U.S. formation, became the focus of gunfire from many of the U.S. ships. Laffey passed so close to Hiei that they missed colliding by 20 feet (6m). Hiei was unable to depress her main or secondary batteries low enough to hit Laffey, but Laffey was able to rake Hiei's superstructure with 5-inch (130 mm) shells and machine gun fire, causing heavy damage to Hiei's superstructure and bridge, wounding Admiral Abe, and killing his chief of staff.\n* Unable to fire her main or secondary batteries at the three destroyers causing her so much trouble, Hiei instead concentrated on San Francisco which was passing by only 2,500 yards (2.3 km) away.[42] Along with Kirishima, Inazuma, and Ikazuchi, the four ships made repeated hits on San Francisco, disabling her steering control and killing Admiral Callaghan, Captain Cassin Young, and most of the bridge staff. The first few salvos from Hiei and Kirishima consisted of the special fragmentation bombardment shells, which reduced damage to the interior of San Francisco and may have saved her from being sunk outright. Not expecting a ship-to-ship confrontation, it took the crews of the two Japanese battleships several minutes to switch to armor-piercing ammunition.\n* Two of the U.S. destroyers met a sudden demise. Either Nagara or the destroyers Teruzuki and Yukikaze came upon the drifting Cushing and pounded her with gunfire, knocking out all of her systems. Unable to fight back, Cushing's crew abandoned ship. Cushing sank several hours later. Laffey, having escaped from her engagement with Hiei, encountered Asagumo, Murasame, Samidare, and, perhaps, Teruzuki. The Japanese destroyers pounded the Laffey with gunfire and then hit her with a torpedo which broke her keel. A few minutes later fires reached her ammunition magazines and she blew up and sank. Two torpedoes from Amatsukaze hit Barton, immediately sinking her with heavy loss of life. She was accosted by Asagumo, Murasame, and Samidare who had just finished blasting Laffey. They proceeded to smother Monssen with gunfire, damaging her severely and forcing the crew to abandon ship. The ship sank sometime later.\n* At 2:26, after nearly 40 minutes of the brutal, close-quarters fighting, the two sides broke contact.\n* The Japanese had one battleship, one light cruiser, and four destroyers that could continue fighting. The U.S. had only one light cruiser, and one destroyer that were still capable of effective resistance. Although perhaps unclear, the way was clear for the Japanese to bombard Henderson Field and finish off the U.S. naval forces in the area, clearing the way for the troops and supplies to be landed safely on Guadalcanal. However, at this crucial juncture, the Japanese chose to abandon the mission.\n* After the battle, Juneau was torpedoed and sunk by Japanese submarine I-26. Juneau's 100+ survivors (out of a total complement of 650) were left to fend on their own in the open ocean for eight days before rescue aircraft belatedly arrived. While awaiting rescue, all but 10 of Juneau's crew died from their injuries, the elements, or shark attacks.\n* Because of the confused nature of the battle, the U.S. believed that they had sunk as many as seven Japanese ships. This, plus the Japanese retreat, caused the U.S. to believe at the time that they had won a significant victory. It was only after the war that the U.S. learned that they had suffered what most see as a crushing tactical defeat.\n* Nevertheless, most historians appear to agree that Abe's decision to retreat turned this tactical defeat into a strategic victory for the U.S. Henderson Field remained operational with attack aircraft ready to deter the slow Japanese transports from approaching Guadalcanal with their precious cargoes. Plus, the Japanese had lost an opportunity to eliminate the U.S. naval forces in the area, a result which would have taken even the comparatively resource-rich U.S. some time to recover from. Reportedly furious, Admiral Yamamoto relieved Abe of command and later directed his forced retirement from the military.\n* Both sides lost numerous warships in two extremely destructive nighttime surface engagements, with the U.S. suffering more warships sunk or heavily damaged than the Japanese. The U.S., however, was successful in turning back attempts by the Japanese to bombard Henderson Field with battleships. Air attacks by Allied aircraft also sank most of the Japanese troop transports and prevented the majority of the Japanese troops and equipment from reaching Guadalcanal. The battle turned back Japan's last major attempt to dislodge Allied forces from Guadalcanal and nearby Tulagi, resulting in a strategic victory for the U.S. and its allies and deciding the ultimate outcome of the Guadalcanal campaign in favor of Allied forces.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 2 Heavy Cruisers - San Francisco (Flagship), Portland\n* 3 Light Cruisers - Helena, Juneau, Atlanta\n* 8 Destroyers - Cushing, Laffey, Sterett, O'Bannon, Aaron Ward, Barton, Monssen, Fletcher"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 2 Battleships - Hiei (Flagship) and Kirishima\n* 1 Light Cruiser - Nagara\n* 14 Destroyers - Samidare, Murasame, Asagumo, Teruzuki, Amatsukaze, Yukikaze, Ikazuchi, Inazuma, Akatsuki, Harusame, Yudachi, Shigure, Shiratsuyu, Yugure\n* 11 Transports\n* 12 Escort Destroyers")
              )
            ),
            "Second Naval Battle of Guadalcanal",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Second Naval Battle of Guadalcanal",
              ":reference",
              "* It would seem that the turning point in this war has at last been reached. - U.S. President Franklin Roosevelt, upon learning of the results of the battle.\n* On November 12, 1942, the (Japanese) Imperial Navy had the better ships and the better tactics.\n* After November 15, 1942, its leaders lost heart and it lacked the strategic depth to face the burgeoning U.S. Navy and its vastly improving weapons and tactics. The Japanese never got better while, after November 1942, the U.S. Navy never stopped getting better - Historian Eric Hammel on the Battle of Quadalcanal",
              ":summary",
              "* On the night of November 14-15, 1942, to cover the unloading of the transports at Guadalcanal, the Japanese fleet made its third attempt to neutralize Henderson Field, sending the force of warships through Indispensable Strait to bombard Guadalcanal.\n* Low on undamaged ships, the U.S., detached a scratch force; the new battleships had only operated together for a few days, and their four escorts were from four different divisions—chosen simply because, of the available destroyers, they had the most fuel.\n* At 23:22 The U.S. destroyers in the front of the column engaged Nagara, Ayanami, and 4 destroyers. The Japanese responded effectively with accurate gunfire and torpedoes, and destroyers Walke and Preston were hit and sunk within 10 minutes with heavy loss of life. The destroyer Benham had part of her bow blown off by a torpedo and had to retreat (she sank the next day), and destroyer Gwin was hit in her engine room and put out of the fight. However, the U.S. destroyers had completed their mission as screens for the battleships, absorbing the initial impact of contact with the enemy, although at great cost. Washington passed through the area still occupied by the damaged and sinking U.S. destroyers and fired on Ayanami with her secondary batteries, setting her afire. Following close behind, South Dakota suddenly suffered a series of electrical failures, reportedly during repairs when her chief engineer locked down a circuit breaker in violation of safety procedures, causing her circuits repeatedly to go into series, making her radar, radios, and most of her gun batteries inoperable.\n* At 00:00 on November 15, 1942, almost blind and unable to effectively fire her main and secondary armament, South Dakota was illuminated by searchlights and targeted by gunfire and torpedoes by most of the ships of the Japanese force, including Kirishima. Although able to score a few hits on Kirishima, South Dakota took 25 medium and one large-caliber hit, some of which did not explode, that completely knocked out her communications and remaining gunfire control operations, set portions of her upper decks on fire, and forced her to try to steer away from the engagement.\n* The Japanese ships continued to concentrate their fire on South Dakota and none detected Washington approaching to within 9,000 yards (8 km). Washington was tracking a large target (Kirishima) for some time but refrained from firing since there was a chance it could be South Dakota. Washington had not been able to track South Dakota's movements because she was in a blind spot in the Washington's radar and Lee could not raise her on the radio to confirm her position. When the Japanese illuminated and fired on South Dakota, all doubts were removed as to which ships were friend or foe. From this close range, Washington opened fire and quickly hit Kirishima with at least nine main battery shells and almost forty secondary ones, causing heavy damage and setting her aflame. Kirishima was hit below the waterline and suffered a jammed rudder, causing her to circle uncontrollably to port.\n* Washington then withdrew to draw the Japanese away from the South Dakota. Kirishima and Ayanami were scuttled in the night. At 4:00, the four Japanese transports beached themselves to quickly unload their reinforcements and cargo, but at 5:55 they were attacked by U.S. aircraft from Henderson Field and from field artillery which destroyed most of the ammunition and food supplies that had not yet been unloaded.\n* The failure to deliver most of the troops and supplies in the convoy to Guadalcanal prevented the Japanese from launching another offensive to retake Henderson Field.\n* By late December 1942, the U.S. was able to land 2 fresh divisions of infantry.\n* On December 31, 1942, the Japanese abandoned Guadalcanal.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                "Allied Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allied Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 2 battleships - Washington, South Dakota\n* 4 destroyers - Benham, Gwin, Preston, Walke"),
                "Japanese Forces",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Japanese Forces", ":deploy", "1) Deploy in as many fleets as desired.", ":forces", "* 1 battleships - Kirishima\n* 2 heavy cruisers - Atago (Flagship), Takao\n* 2 light cruisers - Nagara, Sendai\n* 9 destroyers - Asagumo, Ayanami, Samaidare, Shikinami, Teruzuki, Uranami\n* 4 transports")
              )
            )
          )
        ),
        "Battle of Guam",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Guam", ":summary", "* On July 21 the Americans landed on both sides of the Orote peninsula on the western side of Guam, planning to cut off the airfield. Japanese artillery sank 20 LVTs, but by 09:00 tanks were ashore at both beaches.\n* By nightfall the Americans had established beachheads about 2,000 meters deep. Japanese counter-attacks were made throughout the first few days of the battle, mostly at night, using infiltration tactics. Several times they penetrated the American defenses and were driven back with heavy loss of men and equipment.\n* The counterattacks around the American beachheads had exhausted the Japanese. At the start of August they were running out of food and ammunition and had only a handful of tanks left.\n* As in other battles of the Pacific War, the Japanese refused to surrender, and almost all were killed.\n* A few Japanese soldiers held out in the jungle. On December 8, 1945, three U.S. Marines were ambushed and killed. On January 24, 1972, Sergeant Shoichi Yokoi was discovered by hunters. He had lived alone in a cave for 27 years."),
        "Battle of Leyte Gulf",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Leyte Gulf", ":summary", "* From October 17 to December 31, 1944, the Battle in Philippines is generally considered to be the largest naval battle of WWII and, by some criteria, the largest naval battle in history.\n* The Americans lost 15,584 casualties, of which 3,504 were killed in action.\n* The Japanese losses were heavy, losing 49,000 troops, 26 major warships, and 46 large transports and merchantmen.\n* The struggle also reduced Japanese land-based air capability in the Philippines by more than fifty percent, forcing them to depend on suicidal kamikaze pilots.\n* Once the decisive battle of Leyte was lost, the Japanese gave up hope of retaining the strategically critical Philippines, from which Japan could be easily cut off from outside resources, and from which the direct assaults on the Japanese home islands could be launched."),
        "Battle of Iwo Jima",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Iwo Jima", ":summary", "* On February 19-March 26, 1945, US forces captured of the island of Iwo Jima from the Japanese, producing some of the fiercest fighting in the Pacific Campaign of World War II. The Japanese positions on the island were heavily fortified, with vast bunkers, hidden artillery, and 18 kilometers (11 mi) of tunnels. The battle was the first American attack on the Japanese Home Islands and the Imperial soldiers defended their positions tenaciously.\n* Of the 21,000 Japanese soldiers present at the beginning of the battle, over 20,000 were killed and only 216 taken prisoner."),
        "Battle of Okinawa",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Okinawa", ":summary", "* The 82 day battle lasted from late March through June 1945 and was the largest amphibious assault in the Pacific Theater. The battle has one of the highest casualties: the Japanese lost over 100,000 troops, and the Allies (mostly United States) suffered more than 50,000 casualties, with over 12,000 killed in action. Hundreds of thousands of civilians were killed, wounded or attempted suicide.\n* The main objective of the operation was to seize a large island only 340 miles away from mainland Japan. Okinawa was to serve as a springboard for the invasion of Japan, though the the atomic bombings of Hiroshima and Nagasaki caused Japan to surrender just weeks after the end of the fighting at Okinawa and the invasion never took place.\n* Some military historians believe that Okinawa led directly to the use of the atomic bomb on Hiroshima and Nagasaki. '...because the Japanese on Okinawa, including native Okinawans, were so fierce in their defense (even when cut off, and without supplies), and because casualties were so appalling, many American strategists looked for an alternative means to subdue mainland Japan. This means presented itself, with the advent of atomic bombs, which worked admirably in convincing the Japanese to sue for peace, without American casualties. Ironically, the American conventional fire-bombing of major Japanese cities (which had been going on for months before Okinawa) was far more effective at killing civilians than the atomic bombs and, had the Americans simply continued, or expanded this, the Japanese would likely have surrendered anyway. Nevertheless, the bombs were a powerful symbolic display of American power, and the Japanese capitulated, obviating the need for an invasion.'"),
        "Atomic bombings of Hiroshima and Nagasaki",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Atomic bombings of Hiroshima and Nagasaki", ":summary", "* On August 6, 1945, after six months of intense firebombing of 67 other Japanese cities, the nuclear weapon 'Little Boy' was dropped on the city of Hiroshima.\n* On August 9, 1945, the nuclear bomb 'Fat Man' was dropped over Nagasaki.\n* These are to date the only attacks with nuclear weapons in the history of warfare. The bombs killed as many as 140,000 people in Hiroshima and 80,000 in Nagasaki by the end of 1945, roughly half on the days of the bombings.\n* Since then, thousands more have died from injuries or illness attributed to exposure to radiation. In both cities, the overwhelming majority of the dead were civilians.\n* Six days after the detonation over Nagasaki, on August 15, Japan announced its surrender to the Allied Powers, ending the Pacific War and therefore World War II. Germany had surrendered on May 7.\n* The bombings led, in part, to post-war Japan forbidding itself from nuclear armament.")
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_soviet_equipment
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_soviet_equipment = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_soviet_equipment = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_soviet_equipment
  }

  // (func chapter_wwii_soviet_equipment)
  static f_chapter_wwii_soviet_equipment(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Soviet Equipment",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "WWII Soviet Weapons",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Soviet Weapons",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "7.62mm Tokarev",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Tokarev", ":image", "WWIIRussian/Pistol_Tokarev.jpg", ":classification", "Pistol"),
            "7.62mm SVT-40",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm SVT-40", ":image", "WWIIRussian/Rifle_SVT40.jpg", ":summary", "7.62mm Semiautomatic Rifle", ":classification", "Rifle"),
            "7.62mm Mosin-Nagant",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Mosin-Nagant", ":image", "WWIIRussian/Rifle_MosinNagantM1891.jpg", ":summary", "7.62mm Bolt-action Rifle", ":classification", "Rifle"),
            "7.62mm PPSh-41 SMG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm PPSh-41 SMG", ":image", "WWIIRussian/SMG_PPSh41.jpg", ":classification", "Lt. MG", ":modifiers", "Auto", ":range", "200m"),
            "ROKS Flamethrower",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "ROKS Flamethrower", ":classification", "Flamethrower", ":crew", "1", ":mass", "22kg", ":modifiers", "Autofire, Burning", ":range", "25m"),
            "7.62mm Degtyaryov LMG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "7.62mm Degtyaryov LMG", ":classification", "Med. MG", ":modifiers", "Auto, +1 Prepare"),
            "12.7mm DShK MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12.7mm DShK MG", ":classification", "Hvy. MG", ":length", "1.6m", ":mass", "34kg", ":modifiers", "Auto", ":rof", "600/min"),
            "12.7mm UBS MG",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "12.7mm UBS MG", ":reference", "* Used by the vast majority of Soviet military aircraft\n* It's rate of fire was nearly twice that of the comparable M2 Browning machine gun.", ":classification", "Hvy. MG", ":mass", "21.5kg", ":muzzlevelocity", "825m/s", ":rof", "1000/min"),
            "20mm ShVAK Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "20mm ShVAK Cannon", ":classification", "Cannon", ":length", "1679mm", ":mass", "40kg", ":modifiers", "Auto, HE, AP", ":muzzlevelocity", "775m/s", ":rof", "750/min"),
            "76.2mm F-34 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "76.2mm F-34 Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "76.2mm ZiS-3Sh Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "76.2mm ZiS-3Sh Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "85mm D-5T Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "85mm D-5T Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "85mm ZiS-S-53 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "85mm ZiS-S-53 Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "100mm D-10S Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "100mm D-10S Cannon", ":classification", "Cannon", ":modifiers", "AP, HE"),
            "122mm A-19 Cannon",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "122mm A-19 Cannon", ":classification", "Cannon", ":muzzlevelocity", "806m/s", ":rof", "2/min"),
            "122mm M-30 Howitzer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "122mm M-30 Howitzer", ":summary", "* M-30 howitzers were primarily employed for indirect fire against enemy personnel. It was also used against field fortifications, clearing minefields and breaching barbed wire. Fragments created by the explosion could penetrate up to 20 mm of armour.", ":classification", "Cannon", ":modifiers", "Indirect, HE"),
            "152mm M-10 Howitzer",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "152mm M-10 Howitzer", ":classification", "Cannon", ":modifiers", "HE"),
            "120mm M1938 Mortar",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "120mm M1938 Mortar", ":classification", "Artillery", ":modifiers", "HE"),
            "133mm M-13 Rocket",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "133mm M-13 Rocket", ":summary", "* Warhead is 22kg", ":classification", "Missile", ":length", "1.8m", ":mass", "42kg", ":range", "5.4km")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_soviet_units
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_soviet_units = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_soviet_units = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_soviet_units
  }

  // (func chapter_wwii_soviet_units)
  static f_chapter_wwii_soviet_units(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Soviet Units",
      ":sectionmap",
      nx_tactics_base.f_sectionmap_from_sectionlist(
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Soviet Infantry",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Soviet Rifle Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet Rifle Team",
              ":image",
              "WWIIRussian/Infantry_RiflemenToken.png",
              ":summary",
              "Composed of 5 riflemen",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Military",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Close Assault",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Close Assault")
                  )
                )
              )
            ),
            "Soviet Light MG Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet Light MG Team",
              ":image",
              "WWIIRussian/Infantry_MGToken.png",
              ":summary",
              "Composed of 4 riflemen and an LMG",
              ":classification",
              "Med. MG",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Soviet SMG Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet SMG Team",
              ":image",
              "WWIIRussian/Infantry_SMGToken.png",
              ":reference",
              "* The Soviets would often equip whole regiments and even entire divisions with the PPSh-41, giving them unmatched short-range firepower.",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Russian Commander",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Russian Commander", ":image", "WWIIRussian/Infantry_CommanderToken.png", ":classification", "Med. Infantry"),
            "Soviet NKVD",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Soviet NKVD", ":image", "WWIIRussian/Infantry_NKVDToken.png", ":reference", "* People's Commissariat for Internal Affairs was the public and secret police organization of the Soviet Union that directly executed the rule of terror, including political repression, during the Stalinist era.", ":classification", "Med. Infantry"),
            "Soviet Sniper",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet Sniper",
              ":image",
              "WWIIRussian/Infantry_SniperToken.png",
              ":reference",
              "* One of the best known battles involving snipers, and also the battle that made the Germans reinstate their specialized sniper training, was the Battle of Stalingrad. Their defensive position inside a city filled with rubble meant that Soviet snipers were able to inflict significant casualties.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Soviet Forward Observer",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet Forward Observer",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "M1938 Mortar Team",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "M1938 Mortar Team",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Russian Medic",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Russian Medic", ":classification", "Med. Infantry"),
            "Russian Sapper",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Russian Sapper", ":image", "WWIIRussian/Infantry_SapperToken.png", ":classification", "Hvy. Infantry")
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Soviet Vehicles",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":T-34/76",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "T-34/76",
              ":image",
              "WWIIRussian/TankMed_T34-76Token.png",
              ":reference",
              "* Politcal pressure came to halt production of the T-34. This pressure was from the developer of the KV-1 and IS-2 tanks which were in competition with the T-34.",
              ":classification",
              "Med. Tank",
              ":crew",
              "4",
              ":mass",
              "28.5tons",
              ":length",
              "6.7m",
              ":range",
              "400km",
              ":speedland",
              "53kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "60mm Sloped", ":back", "45mm", ":over", "20mm", ":under", "20mm", ":side", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":T-34/85",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "T-34/85",
              ":image",
              "WWIIRussian/TankMed_T34-85Token.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "32tons",
              ":length",
              "6.7m",
              ":range",
              "360km",
              ":speedland",
              "53kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "90mm Sloped", ":under", "20mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "OT-34 85mm",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "OT-34 85mm",
              ":image",
              "WWIIRussian/TankMed_T34-85Token.png",
              ":classification",
              "Med. Tank",
              ":crew",
              "5",
              ":mass",
              "32tons",
              ":length",
              "6.7m",
              ":range",
              "360km",
              ":speedland",
              "53kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "90mm Sloped", ":under", "20mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":KV-1",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "KV-1",
              ":image",
              "WWIIRussian/TankHvy_KV1Token.png",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "45tons",
              ":length",
              "6.7m",
              ":range",
              "250km",
              ":speedland",
              "28kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "130mm", ":under", "20mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":KV-2",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "KV-2",
              ":image",
              "WWIIRussian/TankHvy_KV-2Token.png",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "5",
              ":mass",
              "53tons",
              ":length",
              "6.8m",
              ":range",
              "140km",
              ":speedland",
              "25.6kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "110mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":IS-2",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "IS-2",
              ":image",
              "WWIIRussian/TankHvy_IS-2Token.png",
              ":reference",
              "* Proving-ground tests showed that the A-19 could penetrate clear through the front and rear armor of the German Panther tank. When it didn't penetrate, it would often knock the turret right off a tank. It was, however, slow to reload firing only 2/minute.",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "4",
              ":mass",
              "46tons",
              ":length",
              "9.9m",
              ":range",
              "240km",
              ":speedland",
              "37kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "160mm Sloped", ":under", "30mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":SU-76",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SU-76",
              ":image",
              "WWIIRussian/SPG_SU76MToken.png",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "4",
              ":mass",
              "10.2tons",
              ":length",
              "5m",
              ":range",
              "320km",
              ":speedland",
              "45kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "35mm", ":side", "16mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":SU-85",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SU-85",
              ":image",
              "WWIIRussian/SPG_SU-85Token.png",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "4",
              ":mass",
              "29.6tons",
              ":length",
              "6.1m",
              ":range",
              "400km",
              ":speedland",
              "55kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":SU-100",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SU-100",
              ":image",
              "WWIIRussian/SPG_SU-100Token.png",
              ":classification",
              "Tank Destroyer",
              ":crew",
              "4",
              ":mass",
              "31.6tons",
              ":length",
              "9.5m",
              ":range",
              "320km",
              ":speedland",
              "48kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "75mm", ":over", "20mm", ":side", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            ":SU-122",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "SU-122",
              ":image",
              "WWIIRussian/SPG_SU-122Token.png",
              ":reference",
              "* Even a Tiger was once heavily damaged by SU-122 assault guns firing high-explosive shells.",
              ":classification",
              "Hvy. Tank",
              ":crew",
              "4",
              ":mass",
              "31tons",
              ":length",
              "7m",
              ":range",
              "300km",
              ":speedland",
              "55kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "45mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "BM-13 Katyusha",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "BM-13 Katyusha",
              ":image",
              "WWIIRussian/RocketLauncher_KatyushaToken.png",
              ":classification",
              "Hvy. Rocket Launcher",
              ":crew",
              "2+1",
              ":mass",
              "4.2tons",
              ":speedland",
              "55kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "ZiS3 76mm",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "ZiS3 76mm",
              ":image",
              "WWIIRussian/Artillery_ZiS3_76mmToken.png",
              ":reference",
              "* The first ZiS-3 gun was designed and built in secret from from Red Army authorities, who ignored the Red Army's need for light and medium field guns. The authorities believed Nazi propaganda that German heavy tanks carried exceptionally strong armour. So the project was run purely on the initiative of Grabin, his design bureau and the Artillery Factory No. 92 head and his deputies. None of them informed state authorities about the ZiS-3 project until the authorities belatedly realized that Nazi tanks were often destroyed by even lighter guns.",
              ":classification",
              "Artillery",
              ":crew",
              "7",
              ":mass",
              "2.65tons",
              ":speedland",
              "0kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Soviet M3 Scout Car",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Soviet M3 Scout Car",
              ":image",
              "WWIIRussian/Car_M3ScoutCarToken.png",
              ":reference",
              "Lend Lease from US",
              ":classification",
              "Car",
              ":crew",
              "1+7",
              ":mass",
              "5.7tons",
              ":length",
              "5.6m",
              ":range",
              "403km",
              ":speedland",
              "81kph",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":over", "0mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "BZ-35 Fuel Truck",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "BZ-35 Fuel Truck",
              ":image",
              "WWIIRussian/Truck_BZ-35_RefuelLorryToken.png",
              ":classification",
              "Truck",
              ":crew",
              "1+2",
              ":mass",
              "4.2tons",
              ":speedland",
              "55kph",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "WWII Soviet Aircraft",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "P-39 Airacobra",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "P-39 Airacobra",
              ":image",
              "WWIIRussian/Fighter_P39Airacobra.png",
              ":reference",
              "* Lend Lease from US\n* The low-speed, low-altitude turning nature of most air combat on the Russian Front suited the P-39's strengths: sturdy construction, reliable radio gear, and adequate firepower. The second-highest scoring Allied ace, Aleksandr Pokryshkin, flew the P-39. His unofficial score stands at nearly 60 Luftwaffe aircraft. His wingman, Grigori Rechkalov, scored 57 victories with the P-39. This is the highest score ever gained by any pilot with any U.S.-made aircraft.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.8tons",
              ":height",
              "3.8m",
              ":length",
              "9.2m",
              ":range",
              "840km",
              ":speedair",
              "605kph",
              ":width",
              "10.4m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "13mm", ":back", "13mm", ":over", "13mm", ":side", "13mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Lavochkin La-5",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Lavochkin La-5",
              ":reference",
              "* Exhaust gas often entered in the cockpit due to poor insulation of the engine compartment. Consequently, pilots ignored orders and frequently flew with their canopies open.",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.3tons",
              ":height",
              "2.5m",
              ":length",
              "8.7m",
              ":range",
              "765km",
              ":speedair",
              "648kph",
              ":width",
              "9.8m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm", ":back", "10mm", ":over", "10mm", ":side", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Yakovlev Yak-9",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Yakovlev Yak-9",
              ":reference",
              "* The most numerous Soviet fighter of the war",
              ":classification",
              "Lt. Aircraft",
              ":crew",
              "1",
              ":mass",
              "3.2tons",
              ":height",
              "3m",
              ":length",
              "8.6m",
              ":range",
              "675km",
              ":speedair",
              "672kph",
              ":width",
              "9.7m",
              ":unitpowermap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitpowermap},
                ":Armor",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitpower}, ":name", "Armor", ":front", "10mm", ":back", "10mm", ":over", "10mm", ":side", "10mm")
              ),
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_wwii_western_front
   * @param  {tactics} tactics
   * @return {chapter}
   */
  static t_chapter_wwii_western_front = {
    vx_type: vx_core.t_type
  }
  static e_chapter_wwii_western_front = {
    vx_type: nx_tactics_books_world_wars.t_chapter_wwii_western_front
  }

  // (func chapter_wwii_western_front)
  static f_chapter_wwii_western_front(tactics) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "WWII Western Front",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Unfiled WWII",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Unfiled WWII",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Fire Fight!",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Fire Fight!",
              ":summary",
              "* A group of German reinforcements is preparing to secure a small hill for an artillery implacement when they spot an Allied patrol. Do not allow them to interfere!",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":German*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German*", ":deploy", "1) Deploy 3 Hill Tiles in the center of the map.\n2) Alternate deploying 5 Forest Tiles on your side of the map.\n3) Alternate deploying units on your edge of the map.", ":forces", "* 9 Levels of Infantry (max 8) (Quickstart: Waffen-SS, MG Team, 4x Riflemen)\n* 1 Obertruppfuhrer"),
                ":American",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "American", ":deploy", "1) Deploy Land Vehicle Map\n2) Alternate deploying 5 Forest Tiles on your side of the map.\n3) Alternate deploying units on your edge of the map.", ":forces", "* 9 Levels of Infantry (max 8) (Quickstart: 2x Able Team, 4x Baker Team, Charlie Team)\n* 1 Sergeant")
              )
            ),
            "Secure the Bridge",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Secure the Bridge",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":American*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "American*", ":deploy", "1) Deploy Land Vehicle Map\n2) Alternate deploying 5 Forest Tiles on your side of the map.\n3) Alternate deploying units on your edge of the map.", ":forces", "* 14 Levels of Tanks (max 5) (Quickstart: 2x M4 Sherman, 2x M10 Wolverine)\n* 9 Levels of Infantry (max 8) (Quickstart: 2x Able Team, 4x Baker Team, Charlie Team)"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "1) Deploy River equally dividing Map between teams with a Bridge (Road title) across river at map center.\n2) Alternate deploying 6 Forest Tiles on your side of the map.\n3) Alternate deploying units on your edge of the map.", ":forces", "* 14 Levels of Tanks (max 3) (Quickstart: Panzer IV, Hetzer, Stug III)\n* 9 Levels of Infantry (max 8) (Quickstart: Waffen-SS, MG Team, 4x Riflemen)")
              )
            ),
            "Hill #115",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Hill #115",
              ":summary",
              "* German Artillery holds the high ground of Hill #115. Capture the position.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":American*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "American*", ":deploy", "1) Deploy Land Vehicle Map\n2) Alternate deploying 5 Forest Tiles on your side of the map.\n3) Alternate deploying units on your edge of the map.", ":forces", "* 12 Levels of Artillery (max 3) (Quickstart: ?)\n* 9 Levels of Infantry (max 8) (Quickstart: 2x Able Team, 4x Baker Team, Charlie Team)"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "1) Deploy 4 Hill Tiles in the center of the map.\n2) Alternate deploying 5 Forest Tiles on your side of the map.\n3) Alternate deploying units on the Hill (base/units may be dug in).", ":forces", "* 12 Levels of Artillery (max 3) (Quickstart: ?)\n* 9 Levels of Infantry (max 8) (Quickstart: Waffen-SS, MG Team, 4x Riflemen)")
              )
            )
          )
        ),
        "Phoney War",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Phoney War", ":summary", "The Germans invade Poland in 1939. Britain and France declare war on Germany, but launch no land operations, instead building their forces for a long war."),
        "Battle of the Netherlands",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of the Netherlands",
          ":summary",
          "Although the Netherlands had been neutral during World War I, Dutch sympathies during that conflict were more on the German side. At the end of World War I, the Netherlands gave asylum to German Emperor Wilhelm II and refused to release him into Allied custody, instead giving him a castle, Huis Doorn, where he lived until his death in 1941. Following outbreak of the Second World War, the Netherlands hoped to remain neutral just like they had done 25 years previously. The Dutch forces were poorly equipped with WWI era tankettes and biplanes and were no match for the Germans falling in 4 days.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle for the Hague",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle for the Hague",
              ":summary",
              "* On May 10, 1940, German paratroopers dropped in and around The Hague to capture Dutch airfields and the city.	After taking the city, the plan was to force the Dutch queen Wilhelmina of the Netherlands to surrender and to thus defeat the Dutch within a single day. It was the first major air-landing operation in history, and due to the failure, had negative effects on the German Military for the rest of the war.\n* The failure of the operation reduced confidence in airborne assaults, reduced airborne troops substantially, and reduced transport aircraft which later caused more casualties in the Invasion of Crete where since the Germans did not have sufficient craft to land troopers in force, they instead had to drop them in groups, resulting in heavy casualties. Hitler intentionally had this battle downplayed to maintain the illusion that the German Army was invincible. It was one of few German defeats throughout the entire Western Front Campaign in 1940.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Dutch",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Dutch", ":forces", "* Queen Wilhelmina"),
                ":German*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German*", ":forces", "* Paratroopers\n* Transport Aircraft")
              )
            ),
            "Battle of The Afsluitdijk",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of The Afsluitdijk",
              ":summary",
              "* On May 12, 1940 the Germans began an assault on Fort Kornwerderzand. However, unknown to the Germans three 2cm anti-air guns and 4 heavy anti-aircraft machine guns had arrived overnight at  Kornwerderzand. The next day, pilots who had previously flown unchallenged were under fire. The Germans sent 62 planes to bomb the fort. The planes dropped five waves of bombs, and four planes were shot down. The bombing was followed by an hour of heavy bombardment from the howitzers, but it had little effect on the heavily protected Dutch. As soon as the bombing stopped the Germans advanced down the narrow dike. Captain Boers waited until they were within 800 meters, then ordered machine-gun fire, making it difficult for the Germans to withdraw. The Germans were under constant fire for an hour and 20 minutes. The remaining Germans withdrew - the assault had failed.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Dutch",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Dutch", ":deploy", "1) Fort Kornwerderzand\n2) Narrow Dike\n3) AA Guns and Artillery\n4) Machine gunners", ":forces", "* 3 20mm AA Guns\n* 4 Heavy AA Machine Guns"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "1) Swamp Map\n2) Artillery\n3) Infantry\n4) Planes", ":forces", "* 500 Infantry\n* 62 Planes\n* Artillery")
              )
            )
          )
        ),
        "Battle of France",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of France",
          ":summary",
          "* After the seven months of the Phoney War, the Battle of France began in earnest on 10 May 1940. The French and British soon collapsed under the onslaught of the German blitzkrieg. The British escaped at Dunkirk, while the French Army surrendered with 90,000 dead and 200,000 wounded.\n* German troops entered Paris on 14 June and accepted the surrender of France on 22 June.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Battle of Dunkirk",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Battle of Dunkirk",
              ":summary",
              "* On May 20, 1940, the German spearhead reached the coast of the English Channel, separating the British Expeditionary Force, the French First Army, and the Belgian army from the majority of French troops to the south.\n* After reaching the Channel, the Germans swung north along the coast, threatening to capture the ports and trap the British and French forces before they could evacuate to Britain.\n* The Belgians surrendered on 28 May, followed the next day by elements of the French 1st Army trapped outside the Dunkirk Pocket.\n* Starting on 27 May, the evacuation of Dunkirk began. The German Panzer Divisions were ordered to resume their advance on the same day, but improved defenses halted their initial offensive.\n* In the nine days from 27 May to 4 June, 338,226 men left France, including 139,997 French and Belgian troops, together with a small number of Dutch troops.\n\nAllied Historical Results\n* 338,226 men saved in the evacuation\n* 1,212,000 Dutch, Belgian, French and British captured\n* 30,000 British dead\n* 34,000 British captured\n* 35,000 French captured\n* 1,200 field guns captured\n* 1,250 anti-aircraft guns captured\n* 11,000 machine guns captured\n* 25,000 vehicles captured\n\nGerman Historical Results\n* 10,252 dead",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Allies",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Allies", ":forces", "* Belgian\n* British\n* Dutch\n* French\n* Polish"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":forces", "Panzer Divisions")
              )
            )
          )
        ),
        "Battle of Britain",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of Britain", ":summary", "During the summer and fall of 1940, the the German Luftwaffe attempted to gain air superiority over the Royal Air Force (RAF). Had it been successful, the planned amphibious and airborne landings in Britain would have followed. The Battle of Britain was the first major campaign to be fought entirely by air forces. It was the largest and most sustained bombing campaign attempted up until that date. The failure of Nazi Germany to destroy Britain's air defense or to break British morale is considered its first major defeat."),
        "Battle of Denmark Strait",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Battle of Denmark Strait",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Bismarck's Maiden Voyage",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Bismarck's Maiden Voyage",
              ":summary",
              "* On May 19, 1941, the German Bismarck battleship left on its maiden voyage with the heavy cruiser Prinz Eugen to break out into the North Atlantic to destroy Allied shipping.\n* On May 24, the British battleship Prince of Wales and the battlecruiser Hood engaged the Bismarck. Less than ten minutes after the British opened fire, a shell from Bismarck struck Hood near her aft ammunition magazines. The Hood exploded and sank within three minutes with the loss of all but three of her crew.\n* Prince of Wales continued to exchange fire with Bismarck but suffered serious malfunctions in her main armament and broke off the engagement.\n* Bismarck, damaged but still very much operational, declined to chase Prince of Wales and instead headed for the Atlantic.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":British*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "British*", ":forces", "* 1 Battlecruiser - HMS Hood\n* 1 Battleship - HMS Prince of Wales"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":forces", "* 1 Battleship - Bismarck\n* 1 Hvy Cruiser - Prinz Eugen")
              )
            ),
            "Sink the Bismarck!",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Sink the Bismarck!",
              ":summary",
              "* The British public were shocked that their most emblematic warship had been destroyed so suddenly. The Admiralty mobilized every available warship in the Atlantic to hunt down and destroy Bismarck.\n* On May 26, the British had a stroke of luck. Bismarck was spotted due to an oil leak. The Bismarck was about to escape under German Air cover, so all British hopes were now pinned on the  aircraft-carrier Ark Royal, the old battlecruiser Renown and the cruiser Sheffield.\n* At dusk that evening, and in atrocious weather conditions, Ark Royal launched its Fairey Swordfish. The first wave mistakenly targeted the Sheffield that was by now shadowing the quarry. Although precious time was lost by this incident, it proved beneficial to the British in that the magnetic detonators on the torpedoes used against Sheffield were seen to be defective and for the following attack on Bismarck were replaced by those designed to explode on contact.\n* In a final attack, almost in darkness at 21:05, a hit by a single torpedo jammed Bismarck's rudder and steering gear. This rendered Bismarck virtually unmanoeuvrable, increased her list to port and she was able only to steam in a large circle.\n* Throughout that night, Bismarck was the target of incessant torpedo attacks by Tribal-class destroyers. Both Ark Royal and King George V had a lucky escape during the night. The British ships were unaware they had come within firing range of U-556. However, U-556 was returning from a combat patrol and had spent its torpedoes. This was particularly galling as U-556 and Bismarck had exercised together in the Baltic, Bismarck was dubbed the submarine's 'bigger brother'.\n* The Rodney and King George V began bombardment of the crippled Bismarck. It continued to fire back, but in its crippled state it was an easy target. Within 44 minutes, Bismarck's heavy guns were all silent. Rodney now closed to point-blank range (approximately three km) to pound the superstructure, while King George V fired from further out.\n* With no sign of surrender, despite the unequal struggle, the British were loath to leave Bismarck. Their fuel and shell supplies were low, a demonstration of how difficult it was for a battleship to sink a similar unit, even in an unbalanced engagement. 3 more torpedoes were launched at close range and on the Bismarck the order was given to scuttle the ship.\n* Dorsetshire and Maori stopped to rescue survivors, but a U-boat alarm caused them to leave the scene after rescuing only 110 Bismarck sailors, abandoning the surviving crew in the water.\n* The next morning U-74, which had heard sinking noises from a distance, and the German weather ship Sachsenwald picked up 5 survivors. 1,995 of the 2,200 crew were lost.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":British*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "British*", ":deploy", "1) Ocean Map, Rain, Night", ":forces", "* British Forces First Wave\n* Carrier - Ark Royal\n* Battlecruiser - Renown\n* Cruiser - Sheffield\n* Fairey Swordfish\n\n* British Forces Second Wave\n* Rodney, King George V"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":forces", "* Battleship - Bismarck\n* Submarine - U-556")
              )
            )
          )
        ),
        "St. Nazaire Raid",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "St. Nazaire Raid", ":summary", "* The St. Nazaire Raid (also called Operation Chariot) was a successful British seaborne attack on the heavily defended docks of St. Nazaire in occupied France on the night of March 28, 1942 during World War II.\n* The plan was to create a diversionary bombing run and then use the obsolete destroyer HMS Campbeltown to ram the St. Nazaire lock gates and then to blow it up. Commandos would then destroy other dock structures and fight their way out. The loss of the St. Nazaire as a dry dock would force any large German warship in need of repairs to return to home waters.\n* The Cambeltown was given cosmetic modifications so that she would resemble a German Mowe class destroyer. The diversionary bombing did little except to alert the German forces that something odd was happening. Despite this the British ships got very close to the harbour without being fired on. Rather than use the deep channel which passed near the German guns, Cambeltown used the spring tide to pass over shallows, being lightened by removing guns, etc, though this also affected her handling characteristics.\n* The force was first noticed at 01:15 but searchlights did not go on until 01:22 when the force was little more than 1.5 nautical miles (2.8 km) from the harbor. The British legitimately flew the Kriegsmarine ensign as a false flag and used a German morse call sign and gained almost five minutes of unimpeded progress. Twice the German guns opened fire but were soon silenced by reassuring coded messages.\n* It was not until 01:28 with less than a mile to the harbor that the German guns opened fire. The Campbeltown drew most fire but despite a number of casualties struck the southern caisson at around 20 knots (37 km/h) at 01:34, jamming herself deep into the structure and crumpling almost 40 feet (12 m) of her hull. The delay fuses had been set shortly before the ship came under fire.\n* The seven Commando teams then disembarked and made for their targets.\n* The seventeen smaller vessels, although receiving less fire, were much more vulnerable. In the four minutes around the ramming by the Campbeltown eight of the launches were destroyed in the channel. A few hits were often sufficient to set the motor launches ablaze and the crew and Commandos had to abandon themselves to the water or Carley rafts. Many drowned or were caught in the burning fuel that spread across the water. Most of the eight craft destroyed suffered greater than 80% fatalities, even on the surviving craft barely a man escaped injury.\n* MTB 74 survived, fired her special torpedoes into the lock at the old entrance and made it back out to sea after taking on around half the crew of the Campbeltown. Only a few Commando teams on the launches made it ashore, none successfully at the Old Mole where they were hoping to re-embark and escape. The intact motor launches took on what survivors they could find or rescue from the water, made smoke and withdrew, leaving just over a hundred Commandos on the docks. MGB 314 survived and was the last vessel to leave, her decks covered in wounded men rescued from the water.\n* As the boats moved out into the wider part of the channel they came under fire from heavier guns, although at longer range. Two boats were destroyed in the race down river, one of the motor launches and MTB 74. Both vessels were carrying many wounded and most of the Campbeltown crew; their losses accounted for over half of the naval casualties. Four British vessels made the rendezvous with the destroyers.\n* The Commandos left behind at the docks were soon heavily pressed. Leaving a steady trail of dead and wounded the Commandos worked through the docks and charged the bridge, breaking through onto the Place de la Vieille Ville, but with barely one in four of the force uninjured. The British were forced southwards into the town and, under increasing fire sought cover.\n* The Germans surrounded the town, posted road-blocks, stopped all traffic and conducted a house-to-house search. Almost all the British were captured or killed by around 10.00. They were assembled at La Baule, numbering roughly 200 and taken to various prisoner of war camps. Five British soldiers avoided capture and made it to Gibraltar.\n* The Campbeltown's charges were timed to go off at around 0900 hrs at the latest. Meanwhile, a German search of the ship failed to discover the hidden explosives. The detonation time came and went. During this delay, senior German officers arrived to inspect the damage and were photographed on deck. They were accompanied to the dock by two Commando officers who had been taken prisoner. The captured officers knew what was about to happen but remained silent, allowing themselves to be killed rather than give the Germans an opportunity to defuse the explosives.\n* It was not until 1035 hrs that the Campbeltown finally exploded, destroying the caisson and killing about 250 German soldiers and civilians in the immediate area.\n* Of the 611 British soldiers, 169 had been killed and 200 captured, but the mission was a success and the dock was unusable until 1947."),
        "Dieppe Raid",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Dieppe Raid", ":summary", "* Because of the massive logistical obstacles a cross-channel invasion would face, Allied high command decided to conduct a practice attack against the French coast.\n* On August 19, 1942, the Allies began the Dieppe Raid, an attack on Dieppe, France. Most of the troops were Canadian, with an American and some British contingents. The raid was a disaster, and almost two-thirds of the attacking force became casualties. However, much was learned as a result of the operation, these lessons would be put to good use later in subsequent invasions.\n* For almost two years, there was no land-fighting on the Western Front with the exception of commando raids and the guerrilla actions of the resistance aided by the SOE and OSS. However, in the meantime, the Allies took the war to Germany, with a strategic bombing campaign the US Eighth Air Force bombing Germany by day and the RAF Bomber Command bombing by night."),
        "Invasion of Normandy",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Invasion of Normandy",
          ":summary",
          "* On June 6, 1944, the Allies began Operation Overlord (also known as 'D-Day') - the long-awaited liberation of France. The deception operation had the Germans convinced that the invasion would occur at the Pas-de-Calais, while the real target was Normandy.\n* Following two months of slow fighting in hedgerow country, the Allies were racing across France. They circled around and trapped 250,000 Germans in the Falaise pocket. As had so often happened on the Eastern Front Hitler refused to allow a strategic withdrawal until it was too late.\n* 100,000 Germans managed to escape through the Falaise Gap but they left behind most of their equipment and 150,000 were taken prisoner.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Barkmann's Corner",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Barkmann's Corner",
              ":summary",
              "* On the morning of July 27, 1944, Panzer Ace, Ernst Barkmann found himself in his Panther cut off from the rest of his company. The Americans were closing in with a large armoured column. Barkmann positioned his Panther under a stand of oaks near the crossroads where the American tanks would have to pass.\n* As the column came into sight, Barkmann knocked out the two lead Shermans and a fuel tanker truck.\n* Next he destroyed two Shermans which had attempted to bypass the burning tanker. The Americans called in fighter-bombers, which damaged Barkmann's Panther and wounded two of his crewmen.\n* Barkmann's next victims were two Shermans that had used the noise of the fighter-bombers as cover to sneak up on the damaged Panther's flank. As Barkmann's crew repaired the Panther, two more Shermans were knocked out.\n* Finally, before leaving, Barkmann destroyed one last Sherman.\n* Barkmann knocked out nine Shermans and several other American vehicles and halted an American armored attack. For his actions, he was awarded the Knight's Cross.\n* On another occasion, Ernst Barkmann in Panther 401 accidentally found himself as the spearhead of the 2nd SS Panzer Division's night assault on the crossroads at Manhay. Initially mistaking a lone Sherman of US 7th Armoured Division as that of his own commander, he pulled alongside the enemy tank, and only realised his mistake when he noticed it's unusual red interior lights. In a brief close quarter fight he managed to destroy the M4 with the Panther's anti-personnel mortar (Panzergranate). He then proceeded along the moonlit forest roads past a succession of surprised American units to Manhay and on towards Liege, having left several destroyed vehicles in his wake. His appearance caused havoc in the US defences, culminating in a rout.\n* Rules: Ground Map, Turret Facing, Vehicle Criticals",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":American*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "American*", ":deploy", "1) Create a [Road] east to west of the map. Do not place on [Forest].\n2) Place all tanks on the [Road] in a column starting from the east of the map.\n3) They are caught by surprise and may not leave formation until the Panther attacks.\n?) If the Germans achieve a Partial Victory, you may deploy the 2 Thunderbolts.", ":forces", "* 9 [M4 Sherman] Tanks\n* 2 [P-47 Thunderbolt] Fighter/Bombers"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "1) Place [Forest] any place on the map until [Road] is complete. Do not completely block [Road].\n?) Surprise is yours. Do not deploy at the beginning of the game. Instead, any time you have the initiative, you may deploy the Panther anywhere on the map before taking your turn. When you attack, the enemy is [Surprised].", ":forces", "* 1 [Panther Ausf G] Tank - Ace")
              )
            ),
            "Tiger Phobia",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Tiger Phobia",
              ":summary",
              "* On 8 August 1944, a single Tiger commanded by SS-Unterscharfuhrer Willi Fey from the 1st Company of sSSPzAbt 102, engaged a British tank column, destroying some 14 out of 15 Shermans, followed by one more later in the day using his last two rounds of ammunition.\n* sSSPzAbt 102 lost all of its Tigers during fighting in Normandy, but reported 227 Allied tanks destroyed in six weeks.",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":British*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "British*", ":deploy", "All units are in a column moving down a road. They are caught by surprise and may not leave formation until the Tiger attacks.", ":forces", "15 [M4 Sherman] Tanks"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German", ":deploy", "* Surprise is yours. Do not deploy at the beginning of the game. Instead, any time you have the initiative, you may deploy the Tiger in any space and immediately attack.", ":forces", "* 1 [Tiger Tank] - Ace")
              )
            )
          )
        ),
        "Liberation of France / Operation Dragoon",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Liberation of France / Operation Dragoon",
          ":summary",
          "* On August 15. 1944 in an effort to aid their operations in Normandy, the Allies launched Operation Dragoon - the invasion of Southern France. The Allies rapidly consolidated this beachhead and liberated southern France in two weeks.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Red Ball Express",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Red Ball Express")
          )
        ),
        "Operation Market Garden",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Operation Market Garden",
          ":summary",
          "* The British Field-Marshal Montgomery persuaded Allied High Command to launch a bold attack. Paratroopers would fly in from England and take bridges over the main rivers of the German-occupied Netherlands in three main cities, Eindhoven, Nijmegen, and Arnhem. British troops would punch through the German lines and link up with the paratroopers. If all went well, the Allies would capture the port facilities in Antwerp and advance into Germany without any remaining major obstacles. British XXX Corps was able to link up with six of the seven paratrooper-held bridges, but was unable to link up with the troops near the bridge over the Rhine at Arnhem. The result was the destruction of the British 1st Airborne Division. These events were summarized by Lt Gen. Frederick Browning as 'a bridge too far'.",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Operation Market Garden",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "Operation Market Garden",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":British",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "British"),
                ":German",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German")
              )
            ),
            "A Bridge Too Far",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scene},
              ":name",
              "A Bridge Too Far",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":British",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "British"),
                ":German*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "German*")
              )
            )
          )
        ),
        "Allied advance from Paris to the Rhine",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Allied advance from Paris to the Rhine", ":summary", "Starting in early September 1944, the Americans began slow and bloody fighting through the Hurtgen Forest to breach the line."),
        "Battle of the Bulge",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Battle of the Bulge", ":summary", "* The 'bulge' was the initial incursion the Germans put into the Allies' line of advance. The offensive was launched in the Ardennes. Germany's planned goal for these operations was to split the British and American Allied line in half, capturing Antwerp, Belgium, and then proceeding to encircle and destroy four Allied armies, forcing the Western Allies to negotiate a peace treaty in the Axis Powers' favor.\n* The Germans planned the offensive with utmost secrecy, minimizing radio traffic and conducting the movement of troops and equipment under cover of darkness. Although ULTRA, the Allies' reading of secret German radio messages, suggested a possible German offensive, and the United States Third Army predicted a major German offensive, the attack still achieved surprise.\n* The degree of surprise achieved was compounded by the Allies' overconfidence, their preoccupation with their own offensive plans, poor aerial reconnaissance, and the relative lack of combat contact in the area by the U.S. 1st Army. Almost complete surprise against a weak section of the Allies' line was achieved during heavy overcast weather, when the Allies' strong air forces would be grounded.\n* For the U.S. Army, the battle incorporated more troops and engaged more enemy troops than any conflict before that time. The German objectives ultimately were unrealized. In the wake of the defeat, many experienced German units were left severely depleted of men and equipment.\n* The Battle of the Bulge was the bloodiest of the battles that U.S. forces experienced in WWII with 19,000 American dead."),
        "Invasion of Germany",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Invasion of Germany", ":summary", "* Hitler would not allow Field Marshal Gerd von Rundstedt to withdraw East behind the Rhine arguing that it would only delay the inevitable fight. Hitler ordered him to fight where his forces stood. By the time the water had subsided and the U.S. Army was able to cross the Roer on February 23, other Allied forces were also close to the Rhine's west bank. Rundstedt's divisions which had remained on the west bank of the Rhine were cut to pieces in the battle of the Rhineland and 290,000 men were taken prisoner.\n* On May 7 1944, Eisenhower took the unconditional surrender of all German forces to the western Allies and the Soviet Union.")
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
    vx_type: nx_tactics_books_world_wars.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "World Wars",
      ":image",
      "WorldWars.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_world_wars.f_chapter_world_wars_overview(tactics),
        nx_tactics_books_world_wars.f_chapter_wwi_campaign(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_overview(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_western_front(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_eastern_front(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_north_african_theatre(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_east_african_theatre(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_middle_east_theatre(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_mediterranean_theatre(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_pacific_theatre(tactics),
        nx_tactics_books_world_wars.f_chapter_wwi_british_forces(tactics),
        nx_tactics_books_world_wars.f_chapter_wwi_french_forces(tactics),
        nx_tactics_books_world_wars.f_chapter_wwi_german_forces(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_american_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_american_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_british_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_british_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_french_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_french_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_german_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_german_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_italian_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_japanese_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_japanese_units(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_soviet_equipment(tactics),
        nx_tactics_books_world_wars.f_chapter_wwii_soviet_units(tactics)
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_world_wars_overview": nx_tactics_books_world_wars.e_chapter_world_wars_overview,
      "chapter_wwi_british_forces": nx_tactics_books_world_wars.e_chapter_wwi_british_forces,
      "chapter_wwi_campaign": nx_tactics_books_world_wars.e_chapter_wwi_campaign,
      "chapter_wwi_french_forces": nx_tactics_books_world_wars.e_chapter_wwi_french_forces,
      "chapter_wwi_german_forces": nx_tactics_books_world_wars.e_chapter_wwi_german_forces,
      "chapter_wwii_american_equipment": nx_tactics_books_world_wars.e_chapter_wwii_american_equipment,
      "chapter_wwii_american_units": nx_tactics_books_world_wars.e_chapter_wwii_american_units,
      "chapter_wwii_british_equipment": nx_tactics_books_world_wars.e_chapter_wwii_british_equipment,
      "chapter_wwii_british_units": nx_tactics_books_world_wars.e_chapter_wwii_british_units,
      "chapter_wwii_east_african_theatre": nx_tactics_books_world_wars.e_chapter_wwii_east_african_theatre,
      "chapter_wwii_eastern_front": nx_tactics_books_world_wars.e_chapter_wwii_eastern_front,
      "chapter_wwii_equipment": nx_tactics_books_world_wars.e_chapter_wwii_equipment,
      "chapter_wwii_french_equipment": nx_tactics_books_world_wars.e_chapter_wwii_french_equipment,
      "chapter_wwii_french_units": nx_tactics_books_world_wars.e_chapter_wwii_french_units,
      "chapter_wwii_german_equipment": nx_tactics_books_world_wars.e_chapter_wwii_german_equipment,
      "chapter_wwii_german_units": nx_tactics_books_world_wars.e_chapter_wwii_german_units,
      "chapter_wwii_italian_units": nx_tactics_books_world_wars.e_chapter_wwii_italian_units,
      "chapter_wwii_japanese_equipment": nx_tactics_books_world_wars.e_chapter_wwii_japanese_equipment,
      "chapter_wwii_japanese_units": nx_tactics_books_world_wars.e_chapter_wwii_japanese_units,
      "chapter_wwii_mediterranean_theatre": nx_tactics_books_world_wars.e_chapter_wwii_mediterranean_theatre,
      "chapter_wwii_middle_east_theatre": nx_tactics_books_world_wars.e_chapter_wwii_middle_east_theatre,
      "chapter_wwii_north_african_theatre": nx_tactics_books_world_wars.e_chapter_wwii_north_african_theatre,
      "chapter_wwii_overview": nx_tactics_books_world_wars.e_chapter_wwii_overview,
      "chapter_wwii_pacific_theatre": nx_tactics_books_world_wars.e_chapter_wwii_pacific_theatre,
      "chapter_wwii_soviet_equipment": nx_tactics_books_world_wars.e_chapter_wwii_soviet_equipment,
      "chapter_wwii_soviet_units": nx_tactics_books_world_wars.e_chapter_wwii_soviet_units,
      "chapter_wwii_western_front": nx_tactics_books_world_wars.e_chapter_wwii_western_front,
      "tacticsbook": nx_tactics_books_world_wars.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_world_wars_overview": nx_tactics_books_world_wars.t_chapter_world_wars_overview,
      "chapter_wwi_british_forces": nx_tactics_books_world_wars.t_chapter_wwi_british_forces,
      "chapter_wwi_campaign": nx_tactics_books_world_wars.t_chapter_wwi_campaign,
      "chapter_wwi_french_forces": nx_tactics_books_world_wars.t_chapter_wwi_french_forces,
      "chapter_wwi_german_forces": nx_tactics_books_world_wars.t_chapter_wwi_german_forces,
      "chapter_wwii_american_equipment": nx_tactics_books_world_wars.t_chapter_wwii_american_equipment,
      "chapter_wwii_american_units": nx_tactics_books_world_wars.t_chapter_wwii_american_units,
      "chapter_wwii_british_equipment": nx_tactics_books_world_wars.t_chapter_wwii_british_equipment,
      "chapter_wwii_british_units": nx_tactics_books_world_wars.t_chapter_wwii_british_units,
      "chapter_wwii_east_african_theatre": nx_tactics_books_world_wars.t_chapter_wwii_east_african_theatre,
      "chapter_wwii_eastern_front": nx_tactics_books_world_wars.t_chapter_wwii_eastern_front,
      "chapter_wwii_equipment": nx_tactics_books_world_wars.t_chapter_wwii_equipment,
      "chapter_wwii_french_equipment": nx_tactics_books_world_wars.t_chapter_wwii_french_equipment,
      "chapter_wwii_french_units": nx_tactics_books_world_wars.t_chapter_wwii_french_units,
      "chapter_wwii_german_equipment": nx_tactics_books_world_wars.t_chapter_wwii_german_equipment,
      "chapter_wwii_german_units": nx_tactics_books_world_wars.t_chapter_wwii_german_units,
      "chapter_wwii_italian_units": nx_tactics_books_world_wars.t_chapter_wwii_italian_units,
      "chapter_wwii_japanese_equipment": nx_tactics_books_world_wars.t_chapter_wwii_japanese_equipment,
      "chapter_wwii_japanese_units": nx_tactics_books_world_wars.t_chapter_wwii_japanese_units,
      "chapter_wwii_mediterranean_theatre": nx_tactics_books_world_wars.t_chapter_wwii_mediterranean_theatre,
      "chapter_wwii_middle_east_theatre": nx_tactics_books_world_wars.t_chapter_wwii_middle_east_theatre,
      "chapter_wwii_north_african_theatre": nx_tactics_books_world_wars.t_chapter_wwii_north_african_theatre,
      "chapter_wwii_overview": nx_tactics_books_world_wars.t_chapter_wwii_overview,
      "chapter_wwii_pacific_theatre": nx_tactics_books_world_wars.t_chapter_wwii_pacific_theatre,
      "chapter_wwii_soviet_equipment": nx_tactics_books_world_wars.t_chapter_wwii_soviet_equipment,
      "chapter_wwii_soviet_units": nx_tactics_books_world_wars.t_chapter_wwii_soviet_units,
      "chapter_wwii_western_front": nx_tactics_books_world_wars.t_chapter_wwii_western_front,
      "tacticsbook": nx_tactics_books_world_wars.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/world_wars",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_world_wars_overview)
    nx_tactics_books_world_wars.t_chapter_world_wars_overview['vx_value'] = {
      name          : "chapter_world_wars_overview",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_world_wars_overview
    }

    // (func chapter_wwi_british_forces)
    nx_tactics_books_world_wars.t_chapter_wwi_british_forces['vx_value'] = {
      name          : "chapter_wwi_british_forces",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwi_british_forces
    }

    // (func chapter_wwi_campaign)
    nx_tactics_books_world_wars.t_chapter_wwi_campaign['vx_value'] = {
      name          : "chapter_wwi_campaign",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwi_campaign
    }

    // (func chapter_wwi_french_forces)
    nx_tactics_books_world_wars.t_chapter_wwi_french_forces['vx_value'] = {
      name          : "chapter_wwi_french_forces",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwi_french_forces
    }

    // (func chapter_wwi_german_forces)
    nx_tactics_books_world_wars.t_chapter_wwi_german_forces['vx_value'] = {
      name          : "chapter_wwi_german_forces",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwi_german_forces
    }

    // (func chapter_wwii_american_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_american_equipment['vx_value'] = {
      name          : "chapter_wwii_american_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_american_equipment
    }

    // (func chapter_wwii_american_units)
    nx_tactics_books_world_wars.t_chapter_wwii_american_units['vx_value'] = {
      name          : "chapter_wwii_american_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_american_units
    }

    // (func chapter_wwii_british_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_british_equipment['vx_value'] = {
      name          : "chapter_wwii_british_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_british_equipment
    }

    // (func chapter_wwii_british_units)
    nx_tactics_books_world_wars.t_chapter_wwii_british_units['vx_value'] = {
      name          : "chapter_wwii_british_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_british_units
    }

    // (func chapter_wwii_east_african_theatre)
    nx_tactics_books_world_wars.t_chapter_wwii_east_african_theatre['vx_value'] = {
      name          : "chapter_wwii_east_african_theatre",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_east_african_theatre
    }

    // (func chapter_wwii_eastern_front)
    nx_tactics_books_world_wars.t_chapter_wwii_eastern_front['vx_value'] = {
      name          : "chapter_wwii_eastern_front",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_eastern_front
    }

    // (func chapter_wwii_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_equipment['vx_value'] = {
      name          : "chapter_wwii_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_equipment
    }

    // (func chapter_wwii_french_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_french_equipment['vx_value'] = {
      name          : "chapter_wwii_french_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_french_equipment
    }

    // (func chapter_wwii_french_units)
    nx_tactics_books_world_wars.t_chapter_wwii_french_units['vx_value'] = {
      name          : "chapter_wwii_french_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_french_units
    }

    // (func chapter_wwii_german_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_german_equipment['vx_value'] = {
      name          : "chapter_wwii_german_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_german_equipment
    }

    // (func chapter_wwii_german_units)
    nx_tactics_books_world_wars.t_chapter_wwii_german_units['vx_value'] = {
      name          : "chapter_wwii_german_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_german_units
    }

    // (func chapter_wwii_italian_units)
    nx_tactics_books_world_wars.t_chapter_wwii_italian_units['vx_value'] = {
      name          : "chapter_wwii_italian_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_italian_units
    }

    // (func chapter_wwii_japanese_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_japanese_equipment['vx_value'] = {
      name          : "chapter_wwii_japanese_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_japanese_equipment
    }

    // (func chapter_wwii_japanese_units)
    nx_tactics_books_world_wars.t_chapter_wwii_japanese_units['vx_value'] = {
      name          : "chapter_wwii_japanese_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_japanese_units
    }

    // (func chapter_wwii_mediterranean_theatre)
    nx_tactics_books_world_wars.t_chapter_wwii_mediterranean_theatre['vx_value'] = {
      name          : "chapter_wwii_mediterranean_theatre",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_mediterranean_theatre
    }

    // (func chapter_wwii_middle_east_theatre)
    nx_tactics_books_world_wars.t_chapter_wwii_middle_east_theatre['vx_value'] = {
      name          : "chapter_wwii_middle_east_theatre",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_middle_east_theatre
    }

    // (func chapter_wwii_north_african_theatre)
    nx_tactics_books_world_wars.t_chapter_wwii_north_african_theatre['vx_value'] = {
      name          : "chapter_wwii_north_african_theatre",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_north_african_theatre
    }

    // (func chapter_wwii_overview)
    nx_tactics_books_world_wars.t_chapter_wwii_overview['vx_value'] = {
      name          : "chapter_wwii_overview",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_overview
    }

    // (func chapter_wwii_pacific_theatre)
    nx_tactics_books_world_wars.t_chapter_wwii_pacific_theatre['vx_value'] = {
      name          : "chapter_wwii_pacific_theatre",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_pacific_theatre
    }

    // (func chapter_wwii_soviet_equipment)
    nx_tactics_books_world_wars.t_chapter_wwii_soviet_equipment['vx_value'] = {
      name          : "chapter_wwii_soviet_equipment",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_soviet_equipment
    }

    // (func chapter_wwii_soviet_units)
    nx_tactics_books_world_wars.t_chapter_wwii_soviet_units['vx_value'] = {
      name          : "chapter_wwii_soviet_units",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_soviet_units
    }

    // (func chapter_wwii_western_front)
    nx_tactics_books_world_wars.t_chapter_wwii_western_front['vx_value'] = {
      name          : "chapter_wwii_western_front",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_chapter_wwii_western_front
    }

    // (func tacticsbook)
    nx_tactics_books_world_wars.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/world_wars",
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
      fn            : nx_tactics_books_world_wars.f_tacticsbook
    }

  }
}
