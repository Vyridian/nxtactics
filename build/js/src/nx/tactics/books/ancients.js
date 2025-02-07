'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_ancients {

  /**
   * @function chapter_ancients_overview
   * @return {chapter}
   */
  static t_chapter_ancients_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_ancients_overview = {
    vx_type: nx_tactics_books_ancients.t_chapter_ancients_overview
  }

  // (func chapter_ancients_overview)
  static f_chapter_ancients_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Ancients Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Ancients?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Ancients?"),
        "Ancients Land Warfare",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Ancients Land Warfare", ":summary", "* Infantry\n* Formations\n* Axemen\n* Polearms\n* Cavalry\n* Horse Archers\n* Armored Cavalry\n* Elephants\n* Chariots\n* Archers\n* Longbows\n* Crossbows\n* Siege\n* Ballista\n* Catapult\n* Fortifications"),
        "Ancients Naval Warfare",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Ancients Naval Warfare", ":summary", "* Wind\n* Large Ships\n* Small Ships\n* War Barge\n* Ballista")
      )
    )
    return output
  }

  /**
   * @function chapter_ancients_scenarios
   * @return {chapter}
   */
  static t_chapter_ancients_scenarios = {
    vx_type: vx_core.t_type
  }
  static e_chapter_ancients_scenarios = {
    vx_type: nx_tactics_books_ancients.t_chapter_ancients_scenarios
  }

  // (func chapter_ancients_scenarios)
  static f_chapter_ancients_scenarios() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Ancients Scenarios",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Ancient Scenarios",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Ancient Scenarios",
          ":scenariomap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenariomap},
            "Flush Them Out",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_scenario},
              ":name",
              "Flush Them Out",
              ":summary",
              "* 10 Turns",
              ":teammap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_teammap},
                ":Germanics",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Germanics", ":completevictory", "Half of Roman units are lost.", ":deploy", "1) Tactical Map\n2) 6 Forest Terrain on Germanic side of map\n3) Deploy units anywhere on Germanic side of map", ":forces", "* 20 Levels of units", ":partialvictory", "Romans lose more units than Germanics."),
                ":Romans*",
                vx_core.f_new({"any-1": nx_tactics_base.t_team}, ":name", "Romans*", ":completevictory", "Half of Germanics are lost.", ":deploy", "1) Tactical Map\n2) 3 Forest Terrain on Roman side of map.\n3) Deploy units along Roman players edge of the map.", ":forces", "* 20 Levels of units", ":partialvictory", "Germanics lose more units than Romans.")
              )
            ),
            "Roman Gladiators",
            vx_core.f_new({"any-1": nx_tactics_base.t_scenario}, ":name", "Roman Gladiators")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_anglo_saxons
   * @return {chapter}
   */
  static t_chapter_anglo_saxons = {
    vx_type: vx_core.t_type
  }
  static e_chapter_anglo_saxons = {
    vx_type: nx_tactics_books_ancients.t_chapter_anglo_saxons
  }

  // (func chapter_anglo_saxons)
  static f_chapter_anglo_saxons() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Anglo/Saxons",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Anglo/Saxon Armies",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Anglo/Saxon Armies")
      )
    )
    return output
  }

  /**
   * @function chapter_carthaginians
   * @return {chapter}
   */
  static t_chapter_carthaginians = {
    vx_type: vx_core.t_type
  }
  static e_chapter_carthaginians = {
    vx_type: nx_tactics_books_ancients.t_chapter_carthaginians
  }

  // (func chapter_carthaginians)
  static f_chapter_carthaginians() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Carthaginians",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Carthaginian Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Carthaginian Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Carthaginian Elephant",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Carthaginian Elephant", ":speedland", "40kph", ":mass", "10tons")
          )
        ),
        "Carhaginian Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Carhaginian Naval Vessels",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Carthaginian Quinquereme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Carthaginian Quinquereme")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_chinese_dynasty
   * @return {chapter}
   */
  static t_chapter_chinese_dynasty = {
    vx_type: vx_core.t_type
  }
  static e_chapter_chinese_dynasty = {
    vx_type: nx_tactics_books_ancients.t_chapter_chinese_dynasty
  }

  // (func chapter_chinese_dynasty)
  static f_chapter_chinese_dynasty() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new({"any-1": nx_tactics_base.t_chapter}, ":name", "Chinese Dynasty")
    return output
  }

  /**
   * @function chapter_egyptian_dynasty
   * @return {chapter}
   */
  static t_chapter_egyptian_dynasty = {
    vx_type: vx_core.t_type
  }
  static e_chapter_egyptian_dynasty = {
    vx_type: nx_tactics_books_ancients.t_chapter_egyptian_dynasty
  }

  // (func chapter_egyptian_dynasty)
  static f_chapter_egyptian_dynasty() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Egyptian Dynasty",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Egyptian Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Egyptian Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Egyptian Archer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Egyptian Archer"),
            "Egyptian Charioteer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Egyptian Charioteer")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_germanic_tribes
   * @return {chapter}
   */
  static t_chapter_germanic_tribes = {
    vx_type: vx_core.t_type
  }
  static e_chapter_germanic_tribes = {
    vx_type: nx_tactics_books_ancients.t_chapter_germanic_tribes
  }

  // (func chapter_germanic_tribes)
  static f_chapter_germanic_tribes() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Germanic Tribes",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Germanic Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Germanic Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Free Spears",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Free Spears",
              ":image",
              "images/ancients/GermanLevySpearmen.png",
              ":summary",
              "Free Spears are farmers and hunters.  According to Germanic tradition, as soon as these men receive their\nspear and shield, they are 'free' adults.  Though lacking in the organized training of the warbands, they\nare veterans of the ritualized tribal warfare of German tribes, and fight with a force and fury superior to\ntheir neighbors militia.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Youth Skirmishers",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Youth Skirmishers",
              ":image",
              "images/ancients/GermanSkirmishers.png",
              ":summary",
              "Young skirmishers break up and harass enemy formations before the main battle lines meet, and act as a screen\nfor heavy troops, taking losses in order to increase the odds of survival of more valuable 'proven' warriors.\nThey must first prove themselves in battle in order to earn status.  Each warrior is armed with a bundle of\nthrowing spears, a slightly longer spear for melee and a stout ovular shield, but they do not wear armor,\nbeing poor and of low status, but also choosing speed over protection.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Survival",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Survival",
                  ":level",
                  "2",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Forestry",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Forestry")
                  )
                )
              )
            ),
            "Proven Spearmen",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Proven Spearmen",
              ":image",
              "images/ancients/GermanTrustedSpearmen.png",
              ":summary",
              "Proud and experienced, 'proven' warriors steeled by years of constant warfare and veterans of numerous\nconflicts.  These men are hardened for battle and unlikely to flee from conflict, and are trained through\nlong experience to work in close or open formation, and even the shieldwall.",
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
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall")
                  )
                )
              )
            ),
            "German Slayers",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German Slayers",
              ":image",
              "images/ancients/GermanSlayers.png",
              ":summary",
              "By shaping heavy boughs of oak and inserting bone spikes, these Cudgels can be used to maim both armored\nand unarmored foes alike.  Cudgels are cheap, easy to make, and replaceable on campaign, while also being\nable to smash or punch through armor.  Although this weapon may seem primitive to untrained eyes, against\narmored opponents it is more effective than any other at their disposal.  These light armored club warriors\nwere recorded to have taken down units of the feared and notoriously lethal kataphraktoi.",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "German Shooters",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "German Shooters",
              ":image",
              "images/ancients/GermanShooters.png",
              ":summary",
              "Equipped to harass and break up enemy formations so more experienced and valuable melee warriors can finish\nthem.  Shooters are often untrained or uncapable warriors, but many are also excellect hunters.  They are\nalso armed with the spear and can act as light infantry, but they will not last long in melee.  In the woods,\ntheir superior ambush skills can be put to best use.\n\nHistorically, Germanic bowmen on the battlefield were few in numbers, because weapons were status symbols,\nand common multipurpose tools, such as the axe or bow were looked down upon.",
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
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            "Sword Possessors",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Sword Possessors",
              ":image",
              "images/ancients/GermanSwordPossessors.png",
              ":summary",
              "Sword Possessors are well trained, experienced and armed with superior quality swords and javelins to\nsoften the enemy before their furious charge.\n\nHistorically, swords were not plentiful in Germanic lands because of the cost of iron, so those fierce and\nvaliant warriors carried their highly valued swords with pride.",
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
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall")
                  )
                )
              )
            ),
            "Night Walkers",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Night Walkers",
              ":image",
              "images/ancients/GermanNightWalkers.png",
              ":summary",
              "Night-Walkers are unconventional warriors who specialize in ambush.  They display their zeal and ferocity\nwith the help of pitch and dye by blackening their shields and bodies.  They choose dark nights for their\nbattles and when the moment is right, they charge wildly, wide-eyed and screaming at their foes.  Any who\nsurvive assaults by these maniacal warriors are convinced they are spirits sent from the otherworld.",
              ":classification",
              "Lt. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Intimidation",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Intimidation",
                  ":level",
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    ":Terrorize",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Terrorize")
                  )
                )
              )
            ),
            "Pike Fence",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Pike Fence",
              ":image",
              "images/ancients/GermanPikeFence.png",
              ":summary",
              "The Pike Fence are hard-nosed, disciplined warriors that fight together in a\nvery dense formation, unlike most other Germanic warbands. They are trained in\nthe Shield Wall and are universally feared by cavalry.",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall")
                  )
                )
              )
            ),
            "Hearth Companions",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hearth Companions",
              ":image",
              "images/ancients/GermanHearthCompanion.png",
              ":summary",
              "These are the Germanic tribes' best warriors. Germans respect their leader's\nbravery, not their rank, and it is a disgrace for a leader to be surpassed in\nbravery. They are wealthy, powerful men, fiercely loyal to their lord, often\nheavily scarred by years of warfare. Their weapons and armor are the best. To\nleave a battlefield alive while their lord lay dead meant a life of shame and\nscorn. To defend and protect him, to assign one's own acts of heroism to his\ncredit-that's what is truly meant by allegiance.",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
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
            "Germanic Riders",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Germanic Riders",
              ":image",
              "images/ancients/GermanRiders.png",
              ":summary",
              "Riders ride small, poor quality horses, though they are excellent light cavalry.  Like many Germanic warriors,\nhowever, they can lack battle-discipline and be over-keen to enter battle for glory.\n\nThey were mostly armed with shield and spear and were supported by fast-moving light infantry - this light\ncavalry combined with light infantry allowed great tactical speed and versatility on the battlefield.\n\nHistorically, Germanic tribes did not frequently use cavalry, however, some tribes were known for their\ncavalry and many peoples praised the good quality of Germanic cavalry.  Though their horses were not\nexceptional, Germanic horsemen could still maneuver very well and operated as a unit, rather than as an\nunorganized band.",
              ":classification",
              "Lt. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            ),
            "Germ. Companion Cavalry",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Germ. Companion Cavalry",
              ":image",
              "images/ancients/GermanCompanionCavalry.png",
              ":summary",
              "The Companion Cavalry are extremely wealthy and powerful men, but still fiercely loyal to their lord who\nprovides them the finest warhorses and wargear at his disposal.\n\nThey can be used most effectively as shock troops whose charges can break the enemy line and destory their\nflanks, but they are also useful for overrunning heavy infantry and slaughtering lighter cavalry.",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
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
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_greek_city_states
   * @return {chapter}
   */
  static t_chapter_greek_city_states = {
    vx_type: vx_core.t_type
  }
  static e_chapter_greek_city_states = {
    vx_type: nx_tactics_books_ancients.t_chapter_greek_city_states
  }

  // (func chapter_greek_city_states)
  static f_chapter_greek_city_states() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Greek City States",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Greek Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Greek Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Greek Hoplite",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Greek Hoplite",
              ":image",
              "images/ancients/GreekHopliteToken.png",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Phalanx",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Phalanx"),
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall")
                  )
                )
              )
            ),
            "Spartan Hoplite",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Spartan Hoplite",
              ":image",
              "images/ancients/GreekSpartanToken.png",
              ":reference",
              "* From the age of seven onwards, Spartan males were trained for a life of warfare.  They were taught iron\ndiscipline, and almost programmed to forget about their individuality.\n* The strenuous training and comradeship engendered between Spartans made them ideally suited to hoplite warfare\nwhich required high levels of discipline and selflessness.",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
                  ":level",
                  "2",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command")
                  )
                )
              )
            ),
            "Greek General",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Greek General",
              ":image",
              "images/ancients/GreekGeneralToken.png",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
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
            "Thracian Peltast",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Thracian Peltast",
              ":reference",
              "* When faced by hoplites peltasts operated by throwing javelins at short range.  If the hoplites charged they\nwould flee.  As they carried considerably lighter equipment than the hoplites they were usually able to evade\nsuccessfully especially in difficult terrain.\n* Peltasts were usually deployed on the flanks of the phalanx providing a link with any cavalry.",
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
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            "Greek Cavalry",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Greek Cavalry",
              ":reference",
              "The utility of the Greek Citizen Cavalry was small on account of their heavy armor.",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "3")
              )
            ),
            "Greek Cataphracts",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Greek Cataphracts",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command")
                  )
                )
              )
            ),
            "Greek Philosopher",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Greek Philosopher"),
            "Greek Senator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Greek Senator"),
            "Greek Wrestler",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Greek Wrestler")
          )
        ),
        "Greek Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Greek Naval Vessels",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Greek Galley",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Greek Galley"),
            "Greek Trireme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Greek Trireme"),
            "Greek Quinquereme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Greek Quinquereme")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_macedon
   * @return {chapter}
   */
  static t_chapter_macedon = {
    vx_type: vx_core.t_type
  }
  static e_chapter_macedon = {
    vx_type: nx_tactics_books_ancients.t_chapter_macedon
  }

  // (func chapter_macedon)
  static f_chapter_macedon() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Macedon",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Macedonian Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Macedonian Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Macedonian Prodromoi Cavalry",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Macedonian Prodromoi Cavalry",
              ":reference",
              "The utility of the Greek Citizen Cavalry was small on account of their heavy armor.",
              ":classification",
              "Lt. Cavalry",
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
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            "Macedonian Companion Cavalry",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Macedonian Companion Cavalry",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "4")
              )
            )
          )
        ),
        "Macedonian Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Macedonian Naval Vessels",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Macedonian Galley",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Macedonian Galley"),
            "Macedonian Trireme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Macedonian Trireme")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_norsemen
   * @return {chapter}
   */
  static t_chapter_norsemen = {
    vx_type: vx_core.t_type
  }
  static e_chapter_norsemen = {
    vx_type: nx_tactics_books_ancients.t_chapter_norsemen
  }

  // (func chapter_norsemen)
  static f_chapter_norsemen() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Norsemen",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Viking Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Viking Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Viking Axeman",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Viking Axeman",
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
            "Viking Swordsman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Viking Swordsman")
          )
        ),
        "Viking Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Viking Naval Vessels",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Viking War Galley",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Viking War Galley")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_persians
   * @return {chapter}
   */
  static t_chapter_persians = {
    vx_type: vx_core.t_type
  }
  static e_chapter_persians = {
    vx_type: nx_tactics_books_ancients.t_chapter_persians
  }

  // (func chapter_persians)
  static f_chapter_persians() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Persians",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Persian Armies",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Persian Armies",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Persian Lt. Cavalry",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Persian Lt. Cavalry"),
            "Persian Horse Archer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Persian Horse Archer"),
            "Persian Scythed Chariot",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Persian Scythed Chariot")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_roman_empire
   * @return {chapter}
   */
  static t_chapter_roman_empire = {
    vx_type: vx_core.t_type
  }
  static e_chapter_roman_empire = {
    vx_type: nx_tactics_books_ancients.t_chapter_roman_empire
  }

  // (func chapter_roman_empire)
  static f_chapter_roman_empire() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Roman Empire",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Legionnaries",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Legionnaries",
          ":summary",
          "Roman Legions were the official fighting force of the empire and were divided in the following way:\n\n* Each Legion consisted of 4800 men\n* Each Legion was divided into 10 cohorts of 480 legionaries\n* Each Cohort was divided into 6 centuries of 80 men each.  The 6 centuries were: Forward Hastati, Rear Hastati,\nForward Pricipes, Rear Pricipes, Forward Triarii, and Rear Triarii.\n* Each Century was divided into 10 octets of 8 men.  Soldiers of an octet shared a tent, and were rewarded or\npunished together.  If one member acted dishonorably in battle, that contubernium would suffer\ndecimation, whereby the group would be required to draw straws, the soldier unlucky enough to draw the short straw\nthen being stoned to death by the others.",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Hastati",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Hastati",
              ":image",
              "images/ancients/RomanLegionaireToken.png",
              ":summary",
              "These were the first line of the Roman heavy infantry and were made up of the relatively young\n(inexperienced), but wealthier citizens.  The Hastati were the primary engaging force of the\nlegion and always met the enemy first in melee combat. If things went badly, or they simply needed\nto rest and regroup, the Hastati would roll behind the Princeps.",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall"),
                    "Formation: Testudo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Testudo")
                  )
                )
              )
            ),
            ":Princeps",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Princeps",
              ":image",
              "images/ancients/RomanPrincepToken.png",
              ":summary",
              "The elite of the legion, in the prime of their careers for age and experience, and constituted the\nwealthier class.  It was simply the obligation of the Princeps to win the battle.  First they would\nact in relief of the Hastati, but then would carry the fight in earnest.  It was a successful tactic,\nwearing down the enemy with good, but not your best forces, than hitting with your best men right in\nthe middle of the fight.",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall"),
                    "Formation: Testudo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Testudo")
                  )
                )
              )
            ),
            ":Triarii",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Triarii",
              ":image",
              "images/ancients/RomanLegionaire2Token.png",
              ":summary",
              "Though the triarii were similarly armored as the Hastatii and Princeps, they played a much different\nrole and were more akin to the Greek hoplites than Roman heavy infantry.  The Triarii were the oldest\nand very experienced of the Roman army, and their job was to defend against disaster as a last resort,\nor to shock the enemy with a different look at the right moment.  If the heavy infantry were pushed\nback, the Triarii would charge forward with their spears, hopefully with the effect of shocking the\nenemy and allowing the Princeps and Hastati time to regroup.  They were used as a last resort, and the\nLatin expression 'ad triarios redisse', or it has come to the triarii, became a general phrase meaning\nthat something was in a desperate situation.",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Phalanx",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Phalanx"),
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall"),
                    "Formation: Testudo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Testudo")
                  )
                )
              )
            ),
            ":Centurion",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Centurion",
              ":image",
              "images/ancients/RomanCenturionToken.png",
              ":summary",
              "Each Centurion commanded the 80 men in a single century (Forward Hastati, etc).",
              ":classification",
              "Med. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
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
            "Praetorian Guard",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Praetorian Guard",
              ":summary",
              "Initially, the guard for a general, the title was later used for the Emperor's personal army.  These men were\nhandpicked from the legions and represent the best warriors in Rome.",
              ":classification",
              "Hvy. Infantry",
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
                    "Formation: Phalanx",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Phalanx"),
                    "Formation: Shield Wall",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Shield Wall"),
                    "Formation: Testudo",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Testudo")
                  )
                )
              )
            ),
            ":Velites",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Velites",
              ":image",
              "images/ancients/RomanVeliteToken.png",
              ":summary",
              "The poorest citizen class allowed to serve, these units were lightly armed skirmishers who were\ndeployed en masse on the battlefield in front of the heavier infantry lines, but moved back beyond\nthe Hastati after discharging their javelins as the enemy approached. The Velites were also an\nimportant part of defense against war elephants.  Using their greater mobility, due to lighter\narmament, Velites could avoid elephant charges and flank them.",
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
                  "2",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            "Equites Legionis",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Equites Legionis",
              ":image",
              "images/ancients/RomanHeavyCavalryToken.png",
              ":summary",
              "The Republican cavalry was designed for speed of movement, and were similarly equipped to the Hastati.  Their\nduty was to provide scouting and potential fast moving support to weakening parts of a battle line.  At times\nthe cavalry could be used to turn a flank or deliver a shock at the right moment, but their limited number\ngenerally made their capabilities limited.  As the Romans were not considered great natural horsemen, the great\neffectiveness of cavalry in the Roman army didn't come until the inclusion of various auxilia cavalry like that\nof the Gauls and Germanics.",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Riding",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Riding",
                  ":level",
                  "2",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Run Down",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Run Down")
                  )
                )
              )
            )
          )
        ),
        ":Auxilia",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Auxilia",
          ":summary",
          "Roman Auxilia are support troops and specialized units.  By the 2nd century, the auxilia contained the same number of\ninfantry as the legions and in addition provided almost all the Roman army's cavalry and more specialised troops\n(especially light cavalry and archers).  The auxilia thus represented three-fifths of Rome's regular land forces.\nLike their legionary counterparts, auxiliary recruits were mostly volunteers, not conscripts, but unlike the legion\nthe auxilia accepted non-Romans (which represented 90% of the empire).",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Cohors Peditata",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cohors Peditata",
              ":image",
              "images/ancients/RomanAuxiliaToken.png",
              ":summary",
              "Most auxiliary cohortes contained heavy infantry similar to legionaries.",
              ":classification",
              "Hvy. Infantry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "2")
              )
            ),
            "Cohortes Sagittariorum",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cohortes Sagittariorum",
              ":image",
              "images/ancients/RomanArcherAuxiliaToken.png",
              ":summary",
              "Most Sagittarii were from Syria.",
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
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            ":Funditores",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Funditores",
              ":summary",
              "Slingers wore no armor.",
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
                  "3",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            "Eques Alaris",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Eques Alaris",
              ":image",
              "images/ancients/RomanLightCavalryToken.png",
              ":summary",
              "Auxiliary Cavalryman",
              ":classification",
              "Lt. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Military",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Military", ":level", "2")
              )
            ),
            "Alae Sagittariorum",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Alae Sagittariorum",
              ":summary",
              "* Mounted Archers",
              ":classification",
              "Lt. Cavalry",
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
                    "Formation: Skirmish",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Formation: Skirmish")
                  )
                )
              )
            ),
            ":Cataphractarii",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Cataphractarii",
              ":classification",
              "Hvy. Cavalry",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Command",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Command",
                  ":level",
                  "4",
                  ":unitabilitymap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unitabilitymap},
                    "Chain of Command",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unitability}, ":name", "Chain of Command")
                  )
                )
              )
            ),
            "Roman Charioteer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Roman Charioteer", ":image", "images/ancients/RomanCharioteer.png", ":classification", "Hvy. Cavalry")
          )
        ),
        ":Civilians",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Civilians",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            "Roman Gladiator",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Roman Gladiator",
              ":image",
              "images/ancients/RomanGladiatorToken.png",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Armor",
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_unitskill},
                  ":name",
                  "Armor",
                  ":level",
                  "1",
                  ":unititemmap",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_unititemmap},
                    "Round Shield",
                    vx_core.f_new({"any-1": nx_tactics_base.t_unititem}, ":name", "Round Shield")
                  )
                )
              )
            ),
            "Roman Senator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Roman Senator"),
            "Roman Slave",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Roman Slave"),
            "Roman Slaver",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Roman Slaver")
          )
        ),
        "Roman Naval Vessels",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Roman Naval Vessels",
          ":itemmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_itemmap},
            "Roman Galley",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Roman Galley"),
            "Roman Trireme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Roman Trireme"),
            "Roman Quinquereme",
            vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Roman Quinquereme")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_unfiled_ancient
   * @return {chapter}
   */
  static t_chapter_unfiled_ancient = {
    vx_type: vx_core.t_type
  }
  static e_chapter_unfiled_ancient = {
    vx_type: nx_tactics_books_ancients.t_chapter_unfiled_ancient
  }

  // (func chapter_unfiled_ancient)
  static f_chapter_unfiled_ancient() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new({"any-1": nx_tactics_base.t_chapter}, ":name", "Unfiled Ancient", ":summary", "Examples of Play\nRomans vs. Greeks\nCombat Example:\n\nCombat Cards:\nSurprise\nUse when:\n	Opponent must be unaware\nEffects:\n	+4 Attack\n	Opponent can only defend\n\nHold Off\nUse when:\n	Longer Reach\n	In Melee Combat\n	Not in Close Combat\nEffects:\n	First Strike\n	+2 Attack\n	+4 Damage Vs Charge\n	Opponent cannot move into Close Combat if you hit.\n\nCharge:\nEffect:\nUse when:\n	Not in Melee Combat\nEffect:\n	Full Move Attack\n	+2 Damage\n	Moves into Close Combat\n\nGuard:\nEffect:\n	+2 Defense\n	All hits taken are shield hits\n\nExample:\nHuman attacks the Orc in the open.\nThe Orc has longer reach an chooses Hold Off.\nThe Human is wary of the spear and plays Guard and Close Combat.\n\nRound 1:\nOrc roll: 12 + 9 Spear + 2 Hold Off = 23\nHuman roll: 9 + 8 Sword + 2 Guard - 1 Encumberance = 18\n\nOrc scores a hit for 5 + 3 Spear = 8 Damage\n\nGuard makes the damage a shield hit.\nDetermine hit location.\n8 (Piercing) - 3 (Shield) - 3 (Armor) = 2 (Piercing) Wound.\n\nBody reduces by 2 to 10 not enough to change bonus.\n\nThe successful Hold Off means the Human's Close Combat Movement fails.")
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
    vx_type: nx_tactics_books_ancients.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Ancients",
      ":image",
      "300_phalanx.jpg",
      ":chaptermap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_chaptermap},
        "Ancients Overview",
        nx_tactics_books_ancients.f_chapter_ancients_overview(),
        "Ancients Scenarios",
        nx_tactics_books_ancients.f_chapter_ancients_scenarios(),
        "Anglo/Saxons",
        nx_tactics_books_ancients.f_chapter_anglo_saxons(),
        "Carthaginians",
        nx_tactics_books_ancients.f_chapter_carthaginians(),
        "Chinese Dynasty",
        nx_tactics_books_ancients.f_chapter_chinese_dynasty(),
        "Egyptian Dynasty",
        nx_tactics_books_ancients.f_chapter_egyptian_dynasty(),
        "Germanic Tribes",
        nx_tactics_books_ancients.f_chapter_germanic_tribes(),
        "Greek City States",
        nx_tactics_books_ancients.f_chapter_greek_city_states(),
        "Macedon",
        nx_tactics_books_ancients.f_chapter_macedon(),
        "Norsemen",
        nx_tactics_books_ancients.f_chapter_norsemen(),
        "Persians",
        nx_tactics_books_ancients.f_chapter_persians(),
        "Roman Empire",
        nx_tactics_books_ancients.f_chapter_roman_empire(),
        "Unfiled Ancient",
        nx_tactics_books_ancients.f_chapter_unfiled_ancient()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_ancients_overview": nx_tactics_books_ancients.e_chapter_ancients_overview,
      "chapter_ancients_scenarios": nx_tactics_books_ancients.e_chapter_ancients_scenarios,
      "chapter_anglo_saxons": nx_tactics_books_ancients.e_chapter_anglo_saxons,
      "chapter_carthaginians": nx_tactics_books_ancients.e_chapter_carthaginians,
      "chapter_chinese_dynasty": nx_tactics_books_ancients.e_chapter_chinese_dynasty,
      "chapter_egyptian_dynasty": nx_tactics_books_ancients.e_chapter_egyptian_dynasty,
      "chapter_germanic_tribes": nx_tactics_books_ancients.e_chapter_germanic_tribes,
      "chapter_greek_city_states": nx_tactics_books_ancients.e_chapter_greek_city_states,
      "chapter_macedon": nx_tactics_books_ancients.e_chapter_macedon,
      "chapter_norsemen": nx_tactics_books_ancients.e_chapter_norsemen,
      "chapter_persians": nx_tactics_books_ancients.e_chapter_persians,
      "chapter_roman_empire": nx_tactics_books_ancients.e_chapter_roman_empire,
      "chapter_unfiled_ancient": nx_tactics_books_ancients.e_chapter_unfiled_ancient,
      "tacticsbook": nx_tactics_books_ancients.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_ancients_overview": nx_tactics_books_ancients.t_chapter_ancients_overview,
      "chapter_ancients_scenarios": nx_tactics_books_ancients.t_chapter_ancients_scenarios,
      "chapter_anglo_saxons": nx_tactics_books_ancients.t_chapter_anglo_saxons,
      "chapter_carthaginians": nx_tactics_books_ancients.t_chapter_carthaginians,
      "chapter_chinese_dynasty": nx_tactics_books_ancients.t_chapter_chinese_dynasty,
      "chapter_egyptian_dynasty": nx_tactics_books_ancients.t_chapter_egyptian_dynasty,
      "chapter_germanic_tribes": nx_tactics_books_ancients.t_chapter_germanic_tribes,
      "chapter_greek_city_states": nx_tactics_books_ancients.t_chapter_greek_city_states,
      "chapter_macedon": nx_tactics_books_ancients.t_chapter_macedon,
      "chapter_norsemen": nx_tactics_books_ancients.t_chapter_norsemen,
      "chapter_persians": nx_tactics_books_ancients.t_chapter_persians,
      "chapter_roman_empire": nx_tactics_books_ancients.t_chapter_roman_empire,
      "chapter_unfiled_ancient": nx_tactics_books_ancients.t_chapter_unfiled_ancient,
      "tacticsbook": nx_tactics_books_ancients.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/ancients",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_ancients_overview)
    nx_tactics_books_ancients.t_chapter_ancients_overview['vx_value'] = {
      name          : "chapter_ancients_overview",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_ancients_overview
    }

    // (func chapter_ancients_scenarios)
    nx_tactics_books_ancients.t_chapter_ancients_scenarios['vx_value'] = {
      name          : "chapter_ancients_scenarios",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_ancients_scenarios
    }

    // (func chapter_anglo_saxons)
    nx_tactics_books_ancients.t_chapter_anglo_saxons['vx_value'] = {
      name          : "chapter_anglo_saxons",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_anglo_saxons
    }

    // (func chapter_carthaginians)
    nx_tactics_books_ancients.t_chapter_carthaginians['vx_value'] = {
      name          : "chapter_carthaginians",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_carthaginians
    }

    // (func chapter_chinese_dynasty)
    nx_tactics_books_ancients.t_chapter_chinese_dynasty['vx_value'] = {
      name          : "chapter_chinese_dynasty",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_chinese_dynasty
    }

    // (func chapter_egyptian_dynasty)
    nx_tactics_books_ancients.t_chapter_egyptian_dynasty['vx_value'] = {
      name          : "chapter_egyptian_dynasty",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_egyptian_dynasty
    }

    // (func chapter_germanic_tribes)
    nx_tactics_books_ancients.t_chapter_germanic_tribes['vx_value'] = {
      name          : "chapter_germanic_tribes",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_germanic_tribes
    }

    // (func chapter_greek_city_states)
    nx_tactics_books_ancients.t_chapter_greek_city_states['vx_value'] = {
      name          : "chapter_greek_city_states",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_greek_city_states
    }

    // (func chapter_macedon)
    nx_tactics_books_ancients.t_chapter_macedon['vx_value'] = {
      name          : "chapter_macedon",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_macedon
    }

    // (func chapter_norsemen)
    nx_tactics_books_ancients.t_chapter_norsemen['vx_value'] = {
      name          : "chapter_norsemen",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_norsemen
    }

    // (func chapter_persians)
    nx_tactics_books_ancients.t_chapter_persians['vx_value'] = {
      name          : "chapter_persians",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_persians
    }

    // (func chapter_roman_empire)
    nx_tactics_books_ancients.t_chapter_roman_empire['vx_value'] = {
      name          : "chapter_roman_empire",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_roman_empire
    }

    // (func chapter_unfiled_ancient)
    nx_tactics_books_ancients.t_chapter_unfiled_ancient['vx_value'] = {
      name          : "chapter_unfiled_ancient",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_chapter_unfiled_ancient
    }

    // (func tacticsbook)
    nx_tactics_books_ancients.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/ancients",
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
      fn            : nx_tactics_books_ancients.f_tacticsbook
    }

  }
}
